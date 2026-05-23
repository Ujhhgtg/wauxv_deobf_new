package com.alibaba.fastjson2.internal.asm;

import com.umeng.analytics.pro.ek;
import com.umeng.commonsdk.statistics.UMErrorCode;
import p000.AbstractC2784;

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
            return 4194306;
        }
        byte b = 0;
        String strM4744 = "com/alibaba/fastjson2/reader/FieldReader";
        if (cCharAt != 'L') {
            if (cCharAt != 'S') {
                if (cCharAt == 'V') {
                    return 0;
                }
                if (cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        return 4194308;
                    }
                    if (cCharAt != 'Z') {
                        if (cCharAt == '[') {
                            int i2 = i + 1;
                            while (str.charAt(i2) == '[') {
                                i2++;
                            }
                            char cCharAt2 = str.charAt(i2);
                            if (cCharAt2 == 'F') {
                                iAddType = 4194306;
                            } else if (cCharAt2 == 'L') {
                                if (i != 0) {
                                    strM4744 = null;
                                } else if (!str.equals("[Lcom/alibaba/fastjson2/writer/FieldWriter;")) {
                                    if (str.equals("[Lcom/alibaba/fastjson2/reader/FieldReader;")) {
                                        strM4744 = "Lcom/alibaba/fastjson2/reader/FieldReader";
                                    } else {
                                        strM4744 = null;
                                    }
                                }
                                if (strM4744 == null) {
                                    strM4744 = AbstractC2784.m4744(1, i2 + 1, str);
                                }
                                iAddType = symbolTable.addType(strM4744) | 8388608;
                            } else if (cCharAt2 == 'S') {
                                iAddType = 4194316;
                            } else if (cCharAt2 == 'Z') {
                                iAddType = 4194313;
                            } else if (cCharAt2 == 'I') {
                                iAddType = 4194305;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iAddType = 4194314;
                                        break;
                                    case 'C':
                                        iAddType = 4194315;
                                        break;
                                    case 'D':
                                        iAddType = 4194307;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iAddType = 4194308;
                            }
                            return ((i2 - i) << 26) | iAddType;
                        }
                        switch (cCharAt) {
                            case 'B':
                            case 'C':
                                break;
                            case 'D':
                                return 4194307;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                }
            }
            return 4194305;
        }
        String strM4745 = "java/lang/String";
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
                    b = !str.equals("Ljava/util/function/Supplier;") ? (byte) -1 : (byte) 5;
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
                    strM4744 = "com/alibaba/fastjson2/writer/FieldWriter";
                    break;
                case 1:
                    break;
                case 2:
                    strM4744 = "com/alibaba/fastjson2/JSONReader";
                    break;
                case 3:
                    strM4744 = "sun/misc/Unsafe";
                    break;
                case 4:
                    strM4744 = "java/util/List";
                    break;
                case 5:
                    strM4744 = "java/util/function/Supplier";
                    break;
                case 6:
                    strM4744 = "com/alibaba/fastjson2/JSONWriter";
                    break;
                case 7:
                    strM4744 = "com/alibaba/fastjson2/reader/ObjectReader";
                    break;
                case 8:
                    strM4744 = "java/lang/String";
                    break;
                case 9:
                    strM4744 = "java/lang/Class";
                    break;
                case 10:
                    strM4744 = "java/lang/Object";
                    break;
                case 11:
                    strM4744 = "java/lang/reflect/Type";
                    break;
                default:
                    strM4744 = null;
                    break;
            }
            strM4745 = strM4744;
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
                        strM4744 = "java/lang/Object";
                        break;
                    case 2:
                        strM4744 = "java/lang/Integer";
                        break;
                    default:
                        strM4744 = null;
                        break;
                }
                strM4745 = strM4744;
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
                                strM4745 = null;
                            } else {
                                strM4745 = "java/lang/Object";
                            }
                            break;
                        case 1:
                            if (i != 60) {
                                strM4745 = null;
                            } else {
                                strM4745 = "com/alibaba/fastjson2/writer/ObjectWriter";
                            }
                            break;
                        case 2:
                            if (i != 62) {
                                strM4745 = null;
                            }
                            break;
                        case 3:
                            if (i != 53) {
                                strM4745 = null;
                            } else {
                                strM4745 = "com/alibaba/fastjson2/writer/ObjectWriter";
                            }
                            break;
                        default:
                            strM4745 = null;
                            break;
                    }
                } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;")) {
                    strM4745 = "com/alibaba/fastjson2/reader/ObjectReader";
                } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Ljava/lang/Object;")) {
                    strM4745 = "java/lang/Object";
                } else {
                    strM4745 = null;
                }
            } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;")) {
                strM4745 = "java/lang/Object";
            } else if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;")) {
                strM4745 = "com/alibaba/fastjson2/reader/ObjectReader";
            } else {
                strM4745 = null;
            }
        } else if (str.equals("()Ljava/lang/Class;")) {
            strM4745 = "java/lang/Class";
        } else if (!str.equals("()Ljava/lang/String;")) {
            strM4745 = null;
        }
        if (strM4745 == null) {
            strM4745 = AbstractC2784.m4744(1, i + 1, str);
        }
        return symbolTable.addType(strM4745) | 8388608;
    }

    private int getConcreteOutputType(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.inputLocals[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 20971520) {
            return i;
        }
        int i6 = i3 + this.inputStack[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
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
        if (i == 4194310 || ((-4194304) & i) == 12582912) {
            for (int i3 = 0; i3 < this.initializationCount; i3++) {
                int i4 = this.initializations[i3];
                int i5 = (-67108864) & i4;
                int i6 = 62914560 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 16777216) {
                    i2 = this.inputLocals[i7];
                } else {
                    if (i6 == 20971520) {
                        int[] iArr = this.inputStack;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i == i4) {
                        if (i == 4194310) {
                            iAddType = symbolTable.addType(symbolTable.className);
                        } else {
                            iAddType = symbolTable.addType(symbolTable.typeTable[i & 1048575].value);
                        }
                        return iAddType | 8388608;
                    }
                }
                i4 = i2 + i5;
                if (i == i4) {
                    if (i == 4194310) {
                        iAddType = symbolTable.addType(symbolTable.className);
                    } else {
                        iAddType = symbolTable.addType(symbolTable.typeTable[i & 1048575].value);
                    }
                    return iAddType | 8388608;
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
            return (-s2) | 20971520;
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
            if (i6 != 4194308 && i6 != 4194307) {
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
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
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
            i10 += (i12 == 4194308 || i12 == 4194307) ? 2 : 1;
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
            i += (i14 == 4194308 || i14 == 4194307) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i14);
            iVisitFrameStart++;
            i8 = i13;
        }
    }

    public void execute(int i, int i2, Symbol symbol, SymbolTable symbolTable) {
        switch (i) {
            case 0:
            case 116 /* 116 */:
            case 117 /* 117 */:
            case 118 /* 118 */:
            case 119 /* 119 */:
            case 145 /* 145 */:
            case 146 /* 146 */:
            case 147 /* 147 */:
            case 167 /* 167 */:
            case 177 /* 177 */:
                return;
            case 1:
                push(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17 /* 17 */:
            case 21 /* 21 */:
                push(4194305);
                return;
            case 9:
            case 10:
            case 22:
                push(4194308);
                push(4194304);
                return;
            case 11:
            case 12:
            case 13:
            case 23 /* 23 */:
                push(4194306);
                return;
            case 14 /* 14 */:
            case 15:
            case 24 /* 24 */:
                push(4194307);
                push(4194304);
                return;
            case 18 /* 18 */:
                int i3 = symbol.tag;
                switch (i3) {
                    case 3:
                        push(4194305);
                        return;
                    case 4:
                        push(4194306);
                        return;
                    case 5:
                        push(4194308);
                        push(4194304);
                        return;
                    case 6:
                        push(4194307);
                        push(4194304);
                        return;
                    case 7:
                        push(symbolTable.addType("java/lang/Class") | 8388608);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | 8388608);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | 8388608);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | 8388608);
                                return;
                            case 17 /* 17 */:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            case 19:
            case 20:
            case 26 /* 26 */:
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
            case 110 /* 110 */:
            case 111 /* 111 */:
            case 114 /* 114 */:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case 168 /* 168 */:
            case 169 /* 169 */:
            case 186:
            case 188 /* 188 */:
            case 196:
            case 197:
            default:
                throw new IllegalArgumentException();
            case 25 /* 25 */:
                push(getLocal(i2));
                return;
            case 46 /* 46 */:
            case 51 /* 51 */:
            case 52:
            case 53 /* 53 */:
            case 96 /* 96 */:
            case 100:
            case 104:
            case 108 /* 108 */:
            case 112:
            case 120:
            case 122:
            case 124 /* 124 */:
            case 126:
            case 128:
            case 130 /* 130 */:
            case 136 /* 136 */:
            case 142 /* 142 */:
            case 149 /* 149 */:
            case 150 /* 150 */:
                pop(2);
                push(4194305);
                return;
            case 47:
            case 143 /* 143 */:
                pop(2);
                push(4194308);
                push(4194304);
                return;
            case 50 /* 50 */:
                pop(1);
                int iPop = pop();
                if (iPop != 4194309) {
                    iPop -= 67108864;
                }
                push(iPop);
                return;
            case 54 /* 54 */:
            case 56 /* 56 */:
            case 58 /* 58 */:
                setLocal(i2, pop());
                if (i2 > 0) {
                    int i4 = i2 - 1;
                    int local = getLocal(i4);
                    if (local == 4194308 || local == 4194307) {
                        setLocal(i4, 4194304);
                        return;
                    }
                    int i5 = local & 62914560;
                    if (i5 == 16777216 || i5 == 20971520) {
                        setLocal(i4, local | 1048576);
                        return;
                    }
                    return;
                }
                return;
            case 55 /* 55 */:
            case 57 /* 57 */:
                pop(1);
                setLocal(i2, pop());
                setLocal(i2 + 1, 4194304);
                if (i2 > 0) {
                    int i6 = i2 - 1;
                    int local2 = getLocal(i6);
                    if (local2 == 4194308 || local2 == 4194307) {
                        setLocal(i6, 4194304);
                        return;
                    }
                    int i7 = local2 & 62914560;
                    if (i7 == 16777216 || i7 == 20971520) {
                        setLocal(i6, local2 | 1048576);
                        return;
                    }
                    return;
                }
                return;
            case 79 /* 79 */:
            case 83 /* 83 */:
            case 84 /* 84 */:
            case 85 /* 85 */:
                pop(3);
                return;
            case 87 /* 87 */:
            case 153 /* 153 */:
            case 154 /* 154 */:
            case 155 /* 155 */:
            case 156 /* 156 */:
            case 157 /* 157 */:
            case 158 /* 158 */:
            case 170 /* 170 */:
            case 171 /* 171 */:
            case 172 /* 172 */:
            case 174 /* 174 */:
            case 176 /* 176 */:
            case 191 /* 191 */:
            case 194 /* 194 */:
            case 195 /* 195 */:
            case 198 /* 198 */:
            case 199 /* 199 */:
                pop(1);
                return;
            case 88 /* 88 */:
            case 159 /* 159 */:
            case 160 /* 160 */:
            case 161 /* 161 */:
            case 162 /* 162 */:
            case 163 /* 163 */:
            case 164 /* 164 */:
            case 165 /* 165 */:
            case 166 /* 166 */:
            case 173 /* 173 */:
            case 175 /* 175 */:
                pop(2);
                return;
            case 89 /* 89 */:
                int iPop2 = pop();
                push(iPop2);
                push(iPop2);
                return;
            case 92 /* 92 */:
                int iPop3 = pop();
                int iPop4 = pop();
                push(iPop4);
                push(iPop3);
                push(iPop4);
                push(iPop3);
                return;
            case 95 /* 95 */:
                int iPop5 = pop();
                int iPop6 = pop();
                push(iPop5);
                push(iPop6);
                return;
            case 97 /* 97 */:
            case 101:
            case 105:
            case 109 /* 109 */:
            case 113:
            case 127:
            case 129 /* 129 */:
            case 131 /* 131 */:
                pop(4);
                push(4194308);
                push(4194304);
                return;
            case 121:
            case 123 /* 123 */:
            case 125 /* 125 */:
                pop(3);
                push(4194308);
                push(4194304);
                return;
            case 132 /* 132 */:
                setLocal(i2, 4194305);
                return;
            case 133 /* 133 */:
            case 140 /* 140 */:
                pop(1);
                push(4194308);
                push(4194304);
                return;
            case 134 /* 134 */:
                pop(1);
                push(4194306);
                return;
            case 135 /* 135 */:
                pop(1);
                push(4194307);
                push(4194304);
                return;
            case 139 /* 139 */:
            case 190 /* 190 */:
            case 193 /* 193 */:
                pop(1);
                push(4194305);
                return;
            case 148 /* 148 */:
            case 151 /* 151 */:
            case 152 /* 152 */:
                pop(4);
                push(4194305);
                return;
            case 178 /* 178 */:
                push(symbolTable, symbol.value);
                return;
            case 179 /* 179 */:
                pop(symbol.value);
                return;
            case 180 /* 180 */:
                pop(1);
                push(symbolTable, symbol.value);
                return;
            case 181 /* 181 */:
                pop(symbol.value);
                pop();
                return;
            case 182 /* 182 */:
            case 183 /* 183 */:
            case 184 /* 184 */:
            case 185 /* 185 */:
                pop(symbol.value);
                if (i != 184) {
                    int iPop7 = pop();
                    if (i == 183 && symbol.name.charAt(0) == '<') {
                        addInitializedType(iPop7);
                    }
                }
                push(symbolTable, symbol.value);
                return;
            case 187 /* 187 */:
                push(symbolTable.addUninitializedType(symbol.value, i2) | 12582912);
                return;
            case 189 /* 189 */:
                String str = symbol.value;
                pop();
                if (str.charAt(0) == '[') {
                    push(symbolTable, "[".concat(str));
                    return;
                } else {
                    push(symbolTable.addType(str) | 75497472);
                    return;
                }
            case 192 /* 192 */:
                String str2 = symbol.value;
                pop();
                if (str2.charAt(0) == '[') {
                    push(symbolTable, str2);
                    return;
                } else {
                    push(symbolTable.addType(str2) | 8388608);
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
                iArr[0] = symbolTable.addType(symbolTable.className) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i4 = i3 + 1;
            iArr2[i3] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == 4194308 || abstractTypeFromDescriptor == 4194307) {
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
                    b = 13;
                }
                break;
            case 162211716:
                if (str.equals("(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z")) {
                    b = 14;
                }
                break;
            case 204540071:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;)V")) {
                    b = 15;
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
            case 21 /* 21 */:
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
            case 14 /* 14 */:
                i = 44;
                break;
            case 15:
            case 16:
                i = 36;
                break;
            case 17 /* 17 */:
            case 23 /* 23 */:
                i = 53;
                break;
            case 18 /* 18 */:
                i = 52;
                break;
            case 24 /* 24 */:
            case 25 /* 25 */:
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
            if (abstractTypeFromDescriptor == 4194308 || abstractTypeFromDescriptor == 4194307) {
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
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int iAddMergedType = 4194304;
        if (i4 == 0 && (i3 & 62914560) != 8388608) {
            if (i3 != 4194309 || ((i & (-67108864)) == 0 && (i & 62914560) != 8388608)) {
                i = 4194304;
            }
            iAddMergedType = i;
        } else {
            if (i == 4194309) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i5 = i & (-67108864);
                if (i5 != 0 || (i & 62914560) == 8388608) {
                    if (i5 != 0 && (i & 62914560) != 8388608) {
                        i5 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    iMin = Math.min(i5, i4) | 8388608;
                    iAddType = symbolTable.addType("java/lang/Object");
                    iAddMergedType = iMin | iAddType;
                }
            } else if ((i3 & 62914560) == 8388608) {
                iAddMergedType = (i & (-67108864)) | 8388608 | symbolTable.addMergedType(i & 1048575, 1048575 & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | 8388608;
                iAddType = symbolTable.addType("java/lang/Object");
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
