package com.alibaba.fastjson2.internal.asm;

import com.umeng.analytics.pro.ek;
import com.umeng.commonsdk.statistics.UMErrorCode;
import p000.AbstractC1225feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 67108864;
    private static final int BOOLEAN = 4194313;
    private static final int BYTE = 4194314;
    private static final int CHAR = 4194315;
    static final int CHOP_FRAME = 248;
    static final int CONSTANT_KIND = 4194304;
    static final int DIM_MASK = -67108864;
    static final int DIM_SHIFT = 26;
    static final int DIM_SIZE = 6;
    private static final int DOUBLE = 4194307;
    static final int ELEMENT_OF = -67108864;
    static final int FLAGS_SHIFT = 20;
    static final int FLAGS_SIZE = 2;
    private static final int FLOAT = 4194306;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 4194305;
    static final int ITEM_ASM_BOOLEAN = 9;
    static final int ITEM_ASM_BYTE = 10;
    static final int ITEM_ASM_CHAR = 11;
    static final int ITEM_ASM_SHORT = 12;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_TOP = 0;
    static final int ITEM_UNINITIALIZED = 8;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    static final int KIND_MASK = 62914560;
    static final int KIND_SHIFT = 22;
    static final int KIND_SIZE = 4;
    static final int LOCAL_KIND = 16777216;
    private static final int LONG = 4194308;
    private static final int NULL = 4194309;
    static final int REFERENCE_KIND = 8388608;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 4194316;
    static final int STACK_KIND = 20971520;
    private static final int TOP = 4194304;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    static final int UNINITIALIZED_KIND = 12582912;
    private static final int UNINITIALIZED_THIS = 4194310;
    static final int VALUE_MASK = 1048575;
    static final int VALUE_SIZE = 20;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    final Label owner;

    public Frame(Label label) {
        this.owner = label;
    }

    private void addInitializedType(int i) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i2 = this.initializationCount;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i3 = this.initializationCount;
        this.initializationCount = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:189:0x022e  */
    /* JADX WARN: Code duplicated, block: B:198:0x023e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0240  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    private static int getAbstractTypeFromDescriptor(SymbolTable symbolTable, String str, int i) {
        int iAddType;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return FLOAT;
        }
        byte b = 0;
        String strM2699Ujhhgtgfeyxiexzf = "com/alibaba/fastjson2/reader/FieldReader";
        if (cCharAt != 'L') {
            if (cCharAt != 'S') {
                if (cCharAt == 'V') {
                    return 0;
                }
                if (cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        return LONG;
                    }
                    if (cCharAt != 'Z') {
                        if (cCharAt == '[') {
                            int i2 = i + 1;
                            while (str.charAt(i2) == '[') {
                                i2++;
                            }
                            char cCharAt2 = str.charAt(i2);
                            if (cCharAt2 == 'F') {
                                iAddType = FLOAT;
                            } else if (cCharAt2 == 'L') {
                                if (i != 0) {
                                    strM2699Ujhhgtgfeyxiexzf = null;
                                } else if (!str.equals("[Lcom/alibaba/fastjson2/writer/FieldWriter;")) {
                                    if (str.equals("[Lcom/alibaba/fastjson2/reader/FieldReader;")) {
                                        strM2699Ujhhgtgfeyxiexzf = "Lcom/alibaba/fastjson2/reader/FieldReader";
                                    } else {
                                        strM2699Ujhhgtgfeyxiexzf = null;
                                    }
                                }
                                if (strM2699Ujhhgtgfeyxiexzf == null) {
                                    strM2699Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, i2 + 1, str);
                                }
                                iAddType = symbolTable.addType(strM2699Ujhhgtgfeyxiexzf) | REFERENCE_KIND;
                            } else if (cCharAt2 == 'S') {
                                iAddType = SHORT;
                            } else if (cCharAt2 == 'Z') {
                                iAddType = BOOLEAN;
                            } else if (cCharAt2 == 'I') {
                                iAddType = INTEGER;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iAddType = BYTE;
                                        break;
                                    case 'C':
                                        iAddType = CHAR;
                                        break;
                                    case 'D':
                                        iAddType = DOUBLE;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iAddType = LONG;
                            }
                            return ((i2 - i) << DIM_SHIFT) | iAddType;
                        }
                        switch (cCharAt) {
                            case 'B':
                            case 'C':
                                break;
                            case 'D':
                                return DOUBLE;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                }
            }
            return INTEGER;
        }
        String strM2699Ujhhgtgfeyxiexzf2 = "java/lang/String";
        if (i == 0) {
            switch (str.hashCode()) {
                case -1603319396:
                    if (!str.equals("Lcom/alibaba/fastjson2/writer/FieldWriter;")) {
                        b = -1;
                    }
                    break;
                case -484446980:
                    b = !str.equals("Lcom/alibaba/fastjson2/reader/FieldReader;") ? (byte) -1 : (byte) 1;
                    break;
                case -26611358:
                    b = !str.equals("Lcom/alibaba/fastjson2/JSONReader;") ? (byte) -1 : (byte) 2;
                    break;
                case 8167489:
                    b = !str.equals("Lsun/misc/Unsafe;") ? (byte) -1 : (byte) 3;
                    break;
                case 126245681:
                    b = !str.equals("Ljava/util/List;") ? (byte) -1 : (byte) 4;
                    break;
                case 296832740:
                    b = !str.equals(ASMUtils.DESC_SUPPLIER) ? (byte) -1 : (byte) 5;
                    break;
                case 495983538:
                    b = !str.equals("Lcom/alibaba/fastjson2/JSONWriter;") ? (byte) -1 : (byte) 6;
                    break;
                case 961047515:
                    b = !str.equals("Lcom/alibaba/fastjson2/reader/ObjectReader;") ? (byte) -1 : (byte) 7;
                    break;
                case 1379658506:
                    b = !str.equals("Ljava/lang/String;") ? (byte) -1 : (byte) 8;
                    break;
                case 1518216451:
                    b = !str.equals("Ljava/lang/Class;") ? (byte) -1 : (byte) 9;
                    break;
                case 1601768860:
                    b = !str.equals("Ljava/lang/Object;") ? (byte) -1 : (byte) 10;
                    break;
                case 2052705071:
                    b = !str.equals("Ljava/lang/reflect/Type;") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    strM2699Ujhhgtgfeyxiexzf = "com/alibaba/fastjson2/writer/FieldWriter";
                    break;
                case 1:
                    break;
                case 2:
                    strM2699Ujhhgtgfeyxiexzf = "com/alibaba/fastjson2/JSONReader";
                    break;
                case 3:
                    strM2699Ujhhgtgfeyxiexzf = "sun/misc/Unsafe";
                    break;
                case 4:
                    strM2699Ujhhgtgfeyxiexzf = "java/util/List";
                    break;
                case 5:
                    strM2699Ujhhgtgfeyxiexzf = "java/util/function/Supplier";
                    break;
                case 6:
                    strM2699Ujhhgtgfeyxiexzf = "com/alibaba/fastjson2/JSONWriter";
                    break;
                case 7:
                    strM2699Ujhhgtgfeyxiexzf = "com/alibaba/fastjson2/reader/ObjectReader";
                    break;
                case 8:
                    strM2699Ujhhgtgfeyxiexzf = "java/lang/String";
                    break;
                case 9:
                    strM2699Ujhhgtgfeyxiexzf = "java/lang/Class";
                    break;
                case 10:
                    strM2699Ujhhgtgfeyxiexzf = ASMUtils.TYPE_OBJECT;
                    break;
                case 11:
                    strM2699Ujhhgtgfeyxiexzf = "java/lang/reflect/Type";
                    break;
                default:
                    strM2699Ujhhgtgfeyxiexzf = null;
                    break;
            }
            strM2699Ujhhgtgfeyxiexzf2 = strM2699Ujhhgtgfeyxiexzf;
        } else if (i != 2) {
            if (i == 3) {
                switch (str.hashCode()) {
                    case 470778755:
                        if (!str.equals("(J)Lcom/alibaba/fastjson2/reader/FieldReader;")) {
                            b = -1;
                        }
                        break;
                    case 1422865092:
                        b = !str.equals("(I)Ljava/lang/Object;") ? (byte) -1 : (byte) 1;
                        break;
                    case 1638725077:
                        b = !str.equals("(I)Ljava/lang/Integer;") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        break;
                    case 1:
                        strM2699Ujhhgtgfeyxiexzf = ASMUtils.TYPE_OBJECT;
                        break;
                    case 2:
                        strM2699Ujhhgtgfeyxiexzf = "java/lang/Integer";
                        break;
                    default:
                        strM2699Ujhhgtgfeyxiexzf = null;
                        break;
                }
                strM2699Ujhhgtgfeyxiexzf2 = strM2699Ujhhgtgfeyxiexzf;
            } else if (i != 36) {
                if (i != 54) {
                    switch (str.hashCode()) {
                        case -1010649456:
                            if (!str.equals("(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;")) {
                                b = -1;
                            }
                            break;
                        case -263498853:
                            b = !str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;") ? (byte) -1 : (byte) 1;
                            break;
                        case 149404307:
                            b = !str.equals("(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;") ? (byte) -1 : (byte) 2;
                            break;
                        case 1655445243:
                            b = !str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;") ? (byte) -1 : (byte) 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            if (i != 79) {
                                strM2699Ujhhgtgfeyxiexzf2 = null;
                            } else {
                                strM2699Ujhhgtgfeyxiexzf2 = ASMUtils.TYPE_OBJECT;
                            }
                            break;
                        case 1:
                            if (i != 60) {
                                strM2699Ujhhgtgfeyxiexzf2 = null;
                            } else {
                                strM2699Ujhhgtgfeyxiexzf2 = "com/alibaba/fastjson2/writer/ObjectWriter";
                            }
                            break;
                        case 2:
                            if (i != 62) {
                                strM2699Ujhhgtgfeyxiexzf2 = null;
                            }
                            break;
                        case 3:
                            if (i != 53) {
                                strM2699Ujhhgtgfeyxiexzf2 = null;
                            } else {
                                strM2699Ujhhgtgfeyxiexzf2 = "com/alibaba/fastjson2/writer/ObjectWriter";
                            }
                            break;
                        default:
                            strM2699Ujhhgtgfeyxiexzf2 = null;
                            break;
                    }
                } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;")) {
                    strM2699Ujhhgtgfeyxiexzf2 = "com/alibaba/fastjson2/reader/ObjectReader";
                } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Ljava/lang/Object;")) {
                    strM2699Ujhhgtgfeyxiexzf2 = ASMUtils.TYPE_OBJECT;
                } else {
                    strM2699Ujhhgtgfeyxiexzf2 = null;
                }
            } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;")) {
                strM2699Ujhhgtgfeyxiexzf2 = ASMUtils.TYPE_OBJECT;
            } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;")) {
                strM2699Ujhhgtgfeyxiexzf2 = "com/alibaba/fastjson2/reader/ObjectReader";
            } else {
                strM2699Ujhhgtgfeyxiexzf2 = null;
            }
        } else if (str.equals("()Ljava/lang/Class;")) {
            strM2699Ujhhgtgfeyxiexzf2 = "java/lang/Class";
        } else if (!str.equals("()Ljava/lang/String;")) {
            strM2699Ujhhgtgfeyxiexzf2 = null;
        }
        if (strM2699Ujhhgtgfeyxiexzf2 == null) {
            strM2699Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, i + 1, str);
        }
        return symbolTable.addType(strM2699Ujhhgtgfeyxiexzf2) | REFERENCE_KIND;
    }

    private int getConcreteOutputType(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = KIND_MASK & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.inputLocals[i & VALUE_MASK];
            if ((i & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || !(i5 == LONG || i5 == DOUBLE)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != STACK_KIND) {
            return i;
        }
        int i6 = i3 + this.inputStack[i2 - (i & VALUE_MASK)];
        if ((i & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || !(i6 == LONG || i6 == DOUBLE)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[SYNTHETIC] */
    private int getInitializedType(SymbolTable symbolTable, int i) {
        int i2;
        int iAddType;
        if (i == UNINITIALIZED_THIS || ((-4194304) & i) == UNINITIALIZED_KIND) {
            for (int i3 = 0; i3 < this.initializationCount; i3++) {
                int i4 = this.initializations[i3];
                int i5 = (-67108864) & i4;
                int i6 = KIND_MASK & i4;
                int i7 = i4 & VALUE_MASK;
                if (i6 == 16777216) {
                    i2 = this.inputLocals[i7];
                } else {
                    if (i6 == STACK_KIND) {
                        int[] iArr = this.inputStack;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i == i4) {
                        if (i == UNINITIALIZED_THIS) {
                            iAddType = symbolTable.addType(symbolTable.className);
                        } else {
                            iAddType = symbolTable.addType(symbolTable.typeTable[i & VALUE_MASK].value);
                        }
                        return iAddType | REFERENCE_KIND;
                    }
                }
                i4 = i2 + i5;
                if (i == i4) {
                    if (i == UNINITIALIZED_THIS) {
                        iAddType = symbolTable.addType(symbolTable.className);
                    } else {
                        iAddType = symbolTable.addType(symbolTable.typeTable[i & VALUE_MASK].value);
                    }
                    return iAddType | REFERENCE_KIND;
                }
            }
        }
        return i;
    }

    private int getLocal(int i) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i >= iArr.length) {
            return i | 16777216;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 16777216 | i;
        iArr[i] = i3;
        return i3;
    }

    private int pop() {
        short s = this.outputStackTop;
        if (s <= 0) {
            short s2 = (short) (this.outputStackStart - 1);
            this.outputStackStart = s2;
            return (-s2) | STACK_KIND;
        }
        int[] iArr = this.outputStack;
        short s3 = (short) (s - 1);
        this.outputStackTop = s3;
        return iArr[s3];
    }

    private void push(int i) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s = this.outputStackTop;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s2 = this.outputStackTop;
        short s3 = (short) (s2 + 1);
        this.outputStackTop = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.outputStackStart + s3);
        Label label = this.owner;
        if (s4 > label.outputStackMax) {
            label.outputStackMax = s4;
        }
    }

    private void setLocal(int i, int i2) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i] = i2;
    }

    public final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != LONG && i6 != DOUBLE) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == LONG || i9 == DOUBLE) ? 2 : 1;
            i8++;
        }
        int iVisitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i3, i8);
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i12 = iArr[i10];
            i10 += (i12 == LONG || i12 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i12);
            i3 = i11;
            iVisitFrameStart++;
        }
        while (true) {
            int i13 = i8 - 1;
            if (i8 <= 0) {
                methodWriter.visitFrameEnd();
                return;
            }
            int i14 = iArr2[i];
            i += (i14 == LONG || i14 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i14);
            iVisitFrameStart++;
            i8 = i13;
        }
    }

    public void execute(int i, int i2, Symbol symbol, SymbolTable symbolTable) {
        switch (i) {
            case 0:
            case Opcodes.INEG /* 116 */:
            case Opcodes.LNEG /* 117 */:
            case Opcodes.FNEG /* 118 */:
            case Opcodes.DNEG /* 119 */:
            case Opcodes.I2B /* 145 */:
            case Opcodes.I2C /* 146 */:
            case Opcodes.I2S /* 147 */:
            case Opcodes.GOTO /* 167 */:
            case Opcodes.RETURN /* 177 */:
                return;
            case 1:
                push(NULL);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.ILOAD /* 21 */:
                push(INTEGER);
                return;
            case 9:
            case 10:
            case 22:
                push(LONG);
                push(4194304);
                return;
            case 11:
            case 12:
            case 13:
            case Opcodes.FLOAD /* 23 */:
                push(FLOAT);
                return;
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case Opcodes.DLOAD /* 24 */:
                push(DOUBLE);
                push(4194304);
                return;
            case Opcodes.LDC /* 18 */:
                int i3 = symbol.tag;
                switch (i3) {
                    case 3:
                        push(INTEGER);
                        return;
                    case 4:
                        push(FLOAT);
                        return;
                    case 5:
                        push(LONG);
                        push(4194304);
                        return;
                    case 6:
                        push(DOUBLE);
                        push(4194304);
                        return;
                    case 7:
                        push(symbolTable.addType("java/lang/Class") | REFERENCE_KIND);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | REFERENCE_KIND);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | REFERENCE_KIND);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | REFERENCE_KIND);
                                return;
                            case Opcodes.SIPUSH /* 17 */:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            case 19:
            case 20:
            case DIM_SHIFT /* 26 */:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 90:
            case 91:
            case 93:
            case 94:
            case 98:
            case 99:
            case 102:
            case 103:
            case 106:
            case 107:
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
            case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case Opcodes.JSR /* 168 */:
            case Opcodes.RET /* 169 */:
            case 186:
            case Opcodes.NEWARRAY /* 188 */:
            case 196:
            case 197:
            default:
                throw new IllegalArgumentException();
            case Opcodes.ALOAD /* 25 */:
                push(getLocal(i2));
                return;
            case Opcodes.IALOAD /* 46 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
            case Opcodes.IADD /* 96 */:
            case 100:
            case 104:
            case Opcodes.IDIV /* 108 */:
            case 112:
            case 120:
            case 122:
            case Opcodes.IUSHR /* 124 */:
            case 126:
            case 128:
            case Opcodes.IXOR /* 130 */:
            case Opcodes.L2I /* 136 */:
            case Opcodes.D2I /* 142 */:
            case Opcodes.FCMPL /* 149 */:
            case Opcodes.FCMPG /* 150 */:
                pop(2);
                push(INTEGER);
                return;
            case 47:
            case Opcodes.D2L /* 143 */:
                pop(2);
                push(LONG);
                push(4194304);
                return;
            case Opcodes.AALOAD /* 50 */:
                pop(1);
                int iPop = pop();
                if (iPop != NULL) {
                    iPop -= 67108864;
                }
                push(iPop);
                return;
            case Opcodes.ISTORE /* 54 */:
            case Opcodes.FSTORE /* 56 */:
            case Opcodes.ASTORE /* 58 */:
                setLocal(i2, pop());
                if (i2 > 0) {
                    int i4 = i2 - 1;
                    int local = getLocal(i4);
                    if (local == LONG || local == DOUBLE) {
                        setLocal(i4, 4194304);
                        return;
                    }
                    int i5 = local & KIND_MASK;
                    if (i5 == 16777216 || i5 == STACK_KIND) {
                        setLocal(i4, local | TOP_IF_LONG_OR_DOUBLE_FLAG);
                        return;
                    }
                    return;
                }
                return;
            case Opcodes.LSTORE /* 55 */:
            case Opcodes.DSTORE /* 57 */:
                pop(1);
                setLocal(i2, pop());
                setLocal(i2 + 1, 4194304);
                if (i2 > 0) {
                    int i6 = i2 - 1;
                    int local2 = getLocal(i6);
                    if (local2 == LONG || local2 == DOUBLE) {
                        setLocal(i6, 4194304);
                        return;
                    }
                    int i7 = local2 & KIND_MASK;
                    if (i7 == 16777216 || i7 == STACK_KIND) {
                        setLocal(i6, local2 | TOP_IF_LONG_OR_DOUBLE_FLAG);
                        return;
                    }
                    return;
                }
                return;
            case Opcodes.IASTORE /* 79 */:
            case Opcodes.AASTORE /* 83 */:
            case Opcodes.BASTORE /* 84 */:
            case Opcodes.CASTORE /* 85 */:
                pop(3);
                return;
            case Opcodes.POP /* 87 */:
            case Opcodes.IFEQ /* 153 */:
            case Opcodes.IFNE /* 154 */:
            case Opcodes.IFLT /* 155 */:
            case Opcodes.IFGE /* 156 */:
            case Opcodes.IFGT /* 157 */:
            case Opcodes.IFLE /* 158 */:
            case Opcodes.TABLESWITCH /* 170 */:
            case Opcodes.LOOKUPSWITCH /* 171 */:
            case Opcodes.IRETURN /* 172 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.ATHROW /* 191 */:
            case Opcodes.MONITORENTER /* 194 */:
            case Opcodes.MONITOREXIT /* 195 */:
            case Opcodes.IFNULL /* 198 */:
            case Opcodes.IFNONNULL /* 199 */:
                pop(1);
                return;
            case Opcodes.POP2 /* 88 */:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ICMPLE /* 164 */:
            case Opcodes.IF_ACMPEQ /* 165 */:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.LRETURN /* 173 */:
            case Opcodes.DRETURN /* 175 */:
                pop(2);
                return;
            case Opcodes.DUP /* 89 */:
                int iPop2 = pop();
                push(iPop2);
                push(iPop2);
                return;
            case Opcodes.DUP2 /* 92 */:
                int iPop3 = pop();
                int iPop4 = pop();
                push(iPop4);
                push(iPop3);
                push(iPop4);
                push(iPop3);
                return;
            case Opcodes.SWAP /* 95 */:
                int iPop5 = pop();
                int iPop6 = pop();
                push(iPop5);
                push(iPop6);
                return;
            case Opcodes.LADD /* 97 */:
            case 101:
            case 105:
            case Opcodes.LDIV /* 109 */:
            case 113:
            case 127:
            case Opcodes.LOR /* 129 */:
            case Opcodes.LXOR /* 131 */:
                pop(4);
                push(LONG);
                push(4194304);
                return;
            case 121:
            case Opcodes.LSHR /* 123 */:
            case Opcodes.LUSHR /* 125 */:
                pop(3);
                push(LONG);
                push(4194304);
                return;
            case Opcodes.IINC /* 132 */:
                setLocal(i2, INTEGER);
                return;
            case Opcodes.I2L /* 133 */:
            case Opcodes.F2L /* 140 */:
                pop(1);
                push(LONG);
                push(4194304);
                return;
            case Opcodes.I2F /* 134 */:
                pop(1);
                push(FLOAT);
                return;
            case Opcodes.I2D /* 135 */:
                pop(1);
                push(DOUBLE);
                push(4194304);
                return;
            case Opcodes.F2I /* 139 */:
            case Opcodes.ARRAYLENGTH /* 190 */:
            case Opcodes.INSTANCEOF /* 193 */:
                pop(1);
                push(INTEGER);
                return;
            case Opcodes.LCMP /* 148 */:
            case Opcodes.DCMPL /* 151 */:
            case Opcodes.DCMPG /* 152 */:
                pop(4);
                push(INTEGER);
                return;
            case Opcodes.GETSTATIC /* 178 */:
                push(symbolTable, symbol.value);
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                pop(symbol.value);
                return;
            case Opcodes.GETFIELD /* 180 */:
                pop(1);
                push(symbolTable, symbol.value);
                return;
            case Opcodes.PUTFIELD /* 181 */:
                pop(symbol.value);
                pop();
                return;
            case Opcodes.INVOKEVIRTUAL /* 182 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.INVOKESTATIC /* 184 */:
            case Opcodes.INVOKEINTERFACE /* 185 */:
                pop(symbol.value);
                if (i != 184) {
                    int iPop7 = pop();
                    if (i == 183 && symbol.name.charAt(0) == '<') {
                        addInitializedType(iPop7);
                    }
                }
                push(symbolTable, symbol.value);
                return;
            case Opcodes.NEW /* 187 */:
                push(symbolTable.addUninitializedType(symbol.value, i2) | UNINITIALIZED_KIND);
                return;
            case Opcodes.ANEWARRAY /* 189 */:
                String str = symbol.value;
                pop();
                if (str.charAt(0) == '[') {
                    push(symbolTable, "[".concat(str));
                    return;
                } else {
                    push(symbolTable.addType(str) | 75497472);
                    return;
                }
            case Opcodes.CHECKCAST /* 192 */:
                String str2 = symbol.value;
                pop();
                if (str2.charAt(0) == '[') {
                    push(symbolTable, str2);
                    return;
                } else {
                    push(symbolTable.addType(str2) | REFERENCE_KIND);
                    return;
                }
        }
    }

    public final boolean merge(SymbolTable symbolTable, Frame frame) {
        int i;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean zMerge = true;
        boolean zMerge2 = frame.inputLocals == null;
        if (zMerge2) {
            frame.inputLocals = new int[length];
        }
        int i2 = 0;
        while (i2 < length) {
            int[] iArr = this.outputLocals;
            int initializedType = (iArr == null || i2 >= iArr.length || (i = iArr[i2]) == 0) ? this.inputLocals[i2] : getConcreteOutputType(i, length2);
            if (this.initializations != null) {
                initializedType = getInitializedType(symbolTable, initializedType);
            }
            zMerge2 |= merge(symbolTable, initializedType, frame.inputLocals, i2);
            i2++;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            zMerge = zMerge2;
        }
        for (int i3 = 0; i3 < length3; i3++) {
            int initializedType2 = this.inputStack[i3];
            if (this.initializations != null) {
                initializedType2 = getInitializedType(symbolTable, initializedType2);
            }
            zMerge |= merge(symbolTable, initializedType2, frame.inputStack, i3);
        }
        for (int i4 = 0; i4 < this.outputStackTop; i4++) {
            int concreteOutputType = getConcreteOutputType(this.outputStack[i4], length2);
            if (this.initializations != null) {
                concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
            }
            zMerge |= merge(symbolTable, concreteOutputType, frame.inputStack, length3 + i4);
        }
        return zMerge;
    }

    public final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.className) | REFERENCE_KIND;
            } else {
                iArr[0] = UNINITIALIZED_THIS;
            }
        } else {
            i3 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i4 = i3 + 1;
            iArr2[i3] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.inputLocals[i3] = 4194304;
            i3++;
        }
    }

    private void pop(int i) {
        short s = this.outputStackTop;
        if (s >= i) {
            this.outputStackTop = (short) (s - i);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i - s));
            this.outputStackTop = (short) 0;
        }
    }

    private void pop(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            pop((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt != 'J' && cCharAt != 'D') {
            pop(1);
        } else {
            pop(2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void push(SymbolTable symbolTable, String str) {
        str.getClass();
        int i = 20;
        byte b = -1;
        switch (str.hashCode()) {
            case -2043530993:
                if (str.equals("(Ljava/lang/Enum;)V")) {
                    b = 0;
                }
                break;
            case -1428966913:
                if (str.equals("(Ljava/lang/String;)V")) {
                    b = 1;
                }
                break;
            case -470836938:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V")) {
                    b = 2;
                }
                break;
            case -263498853:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;")) {
                    b = 3;
                }
                break;
            case -176321095:
                if (str.equals("(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V")) {
                    b = 4;
                }
                break;
            case -126180830:
                if (str.equals("()Ljava/lang/Class;")) {
                    b = 5;
                }
                break;
            case 39784:
                if (str.equals("()I")) {
                    b = 6;
                }
                break;
            case 39785:
                if (str.equals("()J")) {
                    b = 7;
                }
                break;
            case 39797:
                if (str.equals("()V")) {
                    b = 8;
                }
                break;
            case 39801:
                if (str.equals("()Z")) {
                    b = 9;
                }
                break;
            case 1263150:
                if (str.equals("(I)V")) {
                    b = 10;
                }
                break;
            case 1264111:
                if (str.equals("(J)V")) {
                    b = 11;
                }
                break;
            case 1264115:
                if (str.equals("(J)Z")) {
                    b = 12;
                }
                break;
            case 149404307:
                if (str.equals("(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;")) {
                    b = ek.k;
                }
                break;
            case 162211716:
                if (str.equals("(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z")) {
                    b = ek.l;
                }
                break;
            case 204540071:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;)V")) {
                    b = ek.m;
                }
                break;
            case 204540075:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;)Z")) {
                    b = 16;
                }
                break;
            case 438407678:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V")) {
                    b = 17;
                }
                break;
            case 1192622657:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V")) {
                    b = 18;
                }
                break;
            case 1422865092:
                if (str.equals("(I)Ljava/lang/Object;")) {
                    b = 19;
                }
                break;
            case 1565685777:
                if (str.equals("(Ljava/lang/Object;)V")) {
                    b = 20;
                }
                break;
            case 1565685781:
                if (str.equals("(Ljava/lang/Object;)Z")) {
                    b = 21;
                }
                break;
            case 1638725077:
                if (str.equals("(I)Ljava/lang/Integer;")) {
                    b = 22;
                }
                break;
            case 1655445243:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;")) {
                    b = 23;
                }
                break;
            case 2045804348:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;I)V")) {
                    b = 24;
                }
                break;
            case 2045805309:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;J)V")) {
                    b = 25;
                }
                break;
        }
        switch (b) {
            case 0:
                i = 18;
                break;
            case 1:
            case 20:
            case Opcodes.ILOAD /* 21 */:
                break;
            case 2:
                i = 97;
                break;
            case 3:
                i = 60;
                break;
            case 4:
                i = 72;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 19:
            case 22:
                i = 3;
                break;
            case 13:
                i = 62;
                break;
            case Opcodes.DCONST_0 /* 14 */:
                i = 44;
                break;
            case 15:
            case 16:
                i = 36;
                break;
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.FLOAD /* 23 */:
                i = 53;
                break;
            case Opcodes.LDC /* 18 */:
                i = 52;
                break;
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
                i = 37;
                break;
            default:
                if (str.charAt(0) != '(') {
                    i = 0;
                } else {
                    int iMax = 1;
                    while (str.charAt(iMax) != ')') {
                        while (str.charAt(iMax) == '[') {
                            iMax++;
                        }
                        int i2 = iMax + 1;
                        iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
                    }
                    i = iMax + 1;
                }
                break;
        }
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, i);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                push(4194304);
            }
        }
    }

    private static boolean merge(SymbolTable symbolTable, int i, int[] iArr, int i2) {
        int iMin;
        int iAddType;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == NULL) {
            if (i3 == NULL) {
                return false;
            }
            i = NULL;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int iAddMergedType = 4194304;
        if (i4 == 0 && (i3 & KIND_MASK) != REFERENCE_KIND) {
            if (i3 != NULL || ((i & (-67108864)) == 0 && (i & KIND_MASK) != REFERENCE_KIND)) {
                i = 4194304;
            }
            iAddMergedType = i;
        } else {
            if (i == NULL) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i5 = i & (-67108864);
                if (i5 != 0 || (i & KIND_MASK) == REFERENCE_KIND) {
                    if (i5 != 0 && (i & KIND_MASK) != REFERENCE_KIND) {
                        i5 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & KIND_MASK) != REFERENCE_KIND) {
                        i4 -= 67108864;
                    }
                    iMin = Math.min(i5, i4) | REFERENCE_KIND;
                    iAddType = symbolTable.addType(ASMUtils.TYPE_OBJECT);
                    iAddMergedType = iMin | iAddType;
                }
            } else if ((i3 & KIND_MASK) == REFERENCE_KIND) {
                iAddMergedType = (i & (-67108864)) | REFERENCE_KIND | symbolTable.addMergedType(i & VALUE_MASK, VALUE_MASK & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | REFERENCE_KIND;
                iAddType = symbolTable.addType(ASMUtils.TYPE_OBJECT);
                iAddMergedType = iMin | iAddType;
            }
        }
        if (iAddMergedType == i3) {
            return false;
        }
        iArr[i2] = iAddMergedType;
        return true;
    }
}
