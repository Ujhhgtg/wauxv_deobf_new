package com.alibaba.fastjson2.internal.asm;

import com.umeng.analytics.pro.bc;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class SymbolTable {
    String className;
    final ClassWriter classWriter;
    private int entryCount;
    private int typeCount;
    Symbol[] typeTable;
    private Symbol[] entries = new Symbol[bc.e];
    int constantPoolCount = 1;
    final ByteVector constantPool = new ByteVector(4096);

    public SymbolTable(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    private int addTypeInternal(Symbol symbol) {
        if (this.typeTable == null) {
            this.typeTable = new Symbol[16];
        }
        int i = this.typeCount;
        Symbol[] symbolArr = this.typeTable;
        if (i == symbolArr.length) {
            Symbol[] symbolArr2 = new Symbol[symbolArr.length * 2];
            System.arraycopy(symbolArr, 0, symbolArr2, 0, symbolArr.length);
            this.typeTable = symbolArr2;
        }
        Symbol[] symbolArr3 = this.typeTable;
        int i2 = this.typeCount;
        this.typeCount = i2 + 1;
        symbolArr3[i2] = symbol;
        return put(symbol).index;
    }

    private Symbol put(Symbol symbol) {
        int i = this.entryCount;
        Symbol[] symbolArr = this.entries;
        if (i > (symbolArr.length * 3) / 4) {
            int length = symbolArr.length;
            int i2 = (length * 2) + 1;
            Symbol[] symbolArr2 = new Symbol[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                Symbol symbol2 = this.entries[i3];
                while (symbol2 != null) {
                    int i4 = symbol2.hashCode % i2;
                    Symbol symbol3 = symbol2.next;
                    symbol2.next = symbolArr2[i4];
                    symbolArr2[i4] = symbol2;
                    symbol2 = symbol3;
                }
            }
            this.entries = symbolArr2;
        }
        this.entryCount++;
        int i5 = symbol.hashCode;
        Symbol[] symbolArr3 = this.entries;
        int length2 = i5 % symbolArr3.length;
        symbol.next = symbolArr3[length2];
        symbolArr3[length2] = symbol;
        return symbol;
    }

    public Symbol addConstantIntegerOrFloat(int i) {
        int i2 = (i + 3) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[i2 % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 3 && symbol.hashCode == i2 && symbol.data == i) {
                return symbol;
            }
        }
        this.constantPool.putByte(3).putInt(i);
        int i3 = this.constantPoolCount;
        this.constantPoolCount = i3 + 1;
        return put(new Symbol(i3, 3, null, null, null, i, i2));
    }

    public Symbol addConstantLongOrDouble(long j) {
        int i = (((int) j) + 5 + ((int) (j >>> 32))) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[i % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 5 && symbol.hashCode == i && symbol.data == j) {
                return symbol;
            }
        }
        int i2 = this.constantPoolCount;
        this.constantPool.putByte(5).putLong(j);
        this.constantPoolCount += 2;
        return put(new Symbol(i2, 5, null, null, null, j, i));
    }

    public Symbol addConstantMemberReference(int i, String str, String str2, String str3) {
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == i && symbol.hashCode == iHashCode && symbol.owner.equals(str) && symbol.name.equals(str2) && symbol.value.equals(str3)) {
                return symbol;
            }
        }
        this.constantPool.put122(i, addConstantUtf8Reference(7, str).index, addConstantNameAndType(str2, str3));
        int i2 = this.constantPoolCount;
        this.constantPoolCount = i2 + 1;
        return put(new Symbol(i2, i, str, str2, str3, 0L, iHashCode));
    }

    public int addConstantNameAndType(String str, String str2) {
        int iHashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 12 && symbol.hashCode == iHashCode && symbol.name.equals(str) && symbol.value.equals(str2)) {
                return symbol.index;
            }
        }
        this.constantPool.put122(12, addConstantUtf8(str), addConstantUtf8(str2));
        int i = this.constantPoolCount;
        this.constantPoolCount = i + 1;
        return put(new Symbol(i, 12, null, str, str2, 0L, iHashCode)).index;
    }

    public int addConstantUtf8(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 1 && symbol.hashCode == iHashCode && symbol.value.equals(str)) {
                return symbol.index;
            }
        }
        this.constantPool.putByte(1).putUTF8(str);
        int i = this.constantPoolCount;
        this.constantPoolCount = i + 1;
        return put(new Symbol(i, 1, null, null, str, 0L, iHashCode)).index;
    }

    public Symbol addConstantUtf8Reference(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == i && symbol.hashCode == iHashCode && symbol.value.equals(str)) {
                return symbol;
            }
        }
        this.constantPool.put12(i, addConstantUtf8(str));
        int i2 = this.constantPoolCount;
        this.constantPoolCount = i2 + 1;
        return put(new Symbol(i2, i, null, null, str, 0L, iHashCode));
    }

    public int addMergedType(int i, int i2) {
        long j;
        long j2;
        if (i < i2) {
            j = i;
            j2 = i2;
        } else {
            j = i2;
            j2 = i;
        }
        long j3 = j | (j2 << 32);
        int i3 = (i + Opcodes.IXOR + i2) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[i3 % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 130 && symbol.hashCode == i3 && symbol.data == j3) {
                return symbol.info;
            }
        }
        Symbol[] symbolArr2 = this.typeTable;
        int iAddType = addType(this.classWriter.getCommonSuperClass(symbolArr2[i].value, symbolArr2[i2].value));
        put(new Symbol(this.typeCount, Opcodes.IXOR, null, null, null, j3, i3)).info = iAddType;
        return iAddType;
    }

    public int addType(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 128 && symbol.hashCode == iHashCode && symbol.value.equals(str)) {
                return symbol.index;
            }
        }
        return addTypeInternal(new Symbol(this.typeCount, 128, null, null, str, 0L, iHashCode));
    }

    public int addUninitializedType(String str, int i) {
        int iHashCode = (str.hashCode() + Opcodes.LOR + i) & Integer.MAX_VALUE;
        Symbol[] symbolArr = this.entries;
        for (Symbol symbol = symbolArr[iHashCode % symbolArr.length]; symbol != null; symbol = symbol.next) {
            if (symbol.tag == 129 && symbol.hashCode == iHashCode && symbol.data == i && symbol.value.equals(str)) {
                return symbol.index;
            }
        }
        return addTypeInternal(new Symbol(this.typeCount, Opcodes.LOR, null, null, str, i, iHashCode));
    }

    public int setMajorVersionAndClassName(int i, String str) {
        this.className = str;
        return addConstantUtf8Reference(7, str).index;
    }
}
