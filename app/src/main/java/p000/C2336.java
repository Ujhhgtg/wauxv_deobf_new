package p000;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲁᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2336 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final long[] f7501 = {0, 0, -1, -1};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final long[] f7502 = {-2, -1, -1, -1};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final long[] f7503 = {2301339413881290750L, -16384, 4294967295L, 432345564227567616L};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final long[] f7504 = {0, 0, 0, -36028797027352577L};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final long[] f7505 = {0, -1, -1, -1};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final long[] f7506 = {-1, -1, WebSocketProtocol.PAYLOAD_SHORT_MAX, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final long[] f7507 = {-1, -1, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final long[] f7508 = {70368744177663L, 0, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final String[] f7509 = {"", null, null, null, null, null, null, null, null, null, null, "abstract", "boolean", "break", "class", "byte", "case", "catch", "char", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "is", "as", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "switch", "synchronized", "transient", "throw", "throws", "true", "try", "void", "volatile", "when", "while", null, null, null, null, null, null, null, null, null, null, null, null, null, null, "(", ")", "{", "}", "[", "]", ";", ",", ".", "=", ">", "@gt", "<", "@lt", "!", "~", "==", "<=", "@lteq", ">=", "@gteq", "!=", "||", "@or", "&&", "@and", "++", "--", "+", "-", "*", "/", "&", "@bitwise_and", "|", "@bitwise_or", "^", "@bitwise_xor", "%", "@mod", "**", "@pow", "<<", "@left_shift", ">>", "@right_shift", ">>>", "@right_unsigned_shift", "+=", "-=", "*=", "/=", "&=", "@and_assign", "|=", "@or_assign", "^=", "@xor_assign", "%=", "@mod_assign", "**=", "@pow_assign", "<<=", "@left_shift_assign", ">>=", "@right_shift_assign", ">>>=", "@right_unsigned_shift_assign", "->", "<=>", "??=", "??", "?:", "?", ":", "::", "...", "?.", "default:"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final int[] f7510 = {2, 4, 6, 7, 65, 66, 68, 44, 45, 50, 51, 54, 55, 64, 69, 24, 25, 27, 57, 59, 62, 16, 29, 30, 32, 9, 10, 12, 18, 19, 22, 34, 35, 38, 46, 47, 22, 60, 61, 16, 71, 72, 74, 20, 21, 48, 49, 52, 53};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final long[] f7511 = {-2047, -12511, 536870911};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final long[] f7512 = {1792, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f7513;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7514;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f7515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f7516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1697 f7517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int[] f7518 = new int[75];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int[] f7519 = new int[Opcodes.FCMPG];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f7520;

    public C2336(C1697 c1697) {
        this.f7517 = c1697;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final boolean m4297(int i, int i2, int i3, long j, long j2) {
        if (i != 0) {
            return (f7502[i2] & j) != 0;
        }
        return (f7501[i3] & j2) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean m4298(int i, int i2, int i3, long j, long j2) {
        if (i == 0) {
            return (f7504[i3] & j2) != 0;
        }
        if (i == 51) {
            return (f7507[i3] & j2) != 0;
        }
        if (i == 61) {
            return (f7508[i3] & j2) != 0;
        }
        if (i == 48) {
            return (f7505[i3] & j2) != 0;
        }
        if (i != 49) {
            return (f7503[i2] & j) != 0;
        }
        return (f7506[i3] & j2) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3408 m4299() {
        char cM3436;
        int iM4324;
        String str;
        String strM3431 = null;
        C3408 c3408 = null;
        while (true) {
            int i = 0;
            try {
                C1697 c1697 = this.f7517;
                int i2 = c1697.f5774;
                if (i2 > 0) {
                    c1697.f5774 = i2 - 1;
                    int i3 = c1697.f5771 + 1;
                    c1697.f5771 = i3;
                    if (i3 == c1697.f5770) {
                        c1697.f5771 = 0;
                    }
                    int i4 = c1697.f5771;
                    c1697.f5773 = i4;
                    cM3436 = c1697.f5769[i4];
                } else {
                    c1697.f5773 = 0;
                    c1697.f5771 = -1;
                    cM3436 = c1697.m3436();
                }
                this.f7520 = cM3436;
                this.f7516 = Integer.MAX_VALUE;
                this.f7515 = 0;
                if (cM3436 == '\t') {
                    iM4324 = m4324(0, 2, 0);
                } else if (cM3436 == '\n') {
                    iM4324 = m4324(0, 5, 0);
                } else if (cM3436 == '\f') {
                    iM4324 = m4324(0, 4, 0);
                } else if (cM3436 == '\r') {
                    iM4324 = m4324(0, 3, 0);
                } else if (cM3436 == ' ') {
                    iM4324 = m4324(0, 1, 0);
                } else if (cM3436 == '!') {
                    this.f7516 = 92;
                    iM4324 = m4315(0L, JSONWriter.MASK_BROWSER_SECURE, 0L);
                } else if (cM3436 == '%') {
                    this.f7516 = Opcodes.INEG;
                    iM4324 = m4315(0L, 0L, 256L);
                } else if (cM3436 == '&') {
                    this.f7516 = UMErrorCode.E_UM_BE_JSON_FAILED;
                    iM4324 = m4315(0L, JSONWriter.MASK_UNQUOTE_FIELD_NAME, 4L);
                } else if (cM3436 == ']') {
                    iM4324 = m4326(0, 83);
                } else if (cM3436 == '^') {
                    this.f7516 = UMErrorCode.E_UM_BE_FILE_OVERSIZE;
                    iM4324 = m4315(0L, 0L, 64L);
                } else if (cM3436 == 'v') {
                    iM4324 = m4315(3458764513820540928L, 0L, 0L);
                } else if (cM3436 == 'w') {
                    iM4324 = m4315(-4611686018427387904L, 0L, 0L);
                } else if (cM3436 == '[') {
                    iM4324 = m4326(0, 82);
                } else if (cM3436 == 'i') {
                    iM4324 = m4315(1915555414016L, 0L, 0L);
                } else if (cM3436 == 'l') {
                    iM4324 = m4315(2199023255552L, 0L, 0L);
                } else if (cM3436 == 'n') {
                    iM4324 = m4315(30786325577728L, 0L, 0L);
                } else if (cM3436 != 'p') {
                    switch (cM3436) {
                        case '(':
                            iM4324 = m4326(0, 78);
                            break;
                        case ')':
                            iM4324 = m4326(0, 79);
                            break;
                        case '*':
                            this.f7516 = Opcodes.IDIV;
                            iM4324 = m4315(0L, FieldInfo.JIT, 1025L);
                            break;
                        case '+':
                            this.f7516 = 106;
                            iM4324 = m4315(0L, 4611687117939015680L, 0L);
                            break;
                        case ',':
                            iM4324 = m4326(0, 85);
                            break;
                        case '-':
                            this.f7516 = 107;
                            iM4324 = m4315(0L, -9223369837831520256L, 262144L);
                            break;
                        case Opcodes.IALOAD /* 46 */:
                            this.f7516 = 86;
                            iM4324 = m4315(0L, 0L, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                            break;
                        case '/':
                            this.f7516 = Opcodes.LDIV;
                            iM4324 = m4315(0L, 0L, 2L);
                            break;
                        default:
                            switch (cM3436) {
                                case Opcodes.LSHR /* 123 */:
                                    iM4324 = m4326(0, 80);
                                    break;
                                case Opcodes.IUSHR /* 124 */:
                                    this.f7516 = 112;
                                    iM4324 = m4315(0L, JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL, 16L);
                                    break;
                                case Opcodes.LUSHR /* 125 */:
                                    iM4324 = m4326(0, 81);
                                    break;
                                case '~':
                                    iM4324 = m4326(0, 93);
                                    break;
                                default:
                                    switch (cM3436) {
                                        case Opcodes.ASTORE /* 58 */:
                                            this.f7516 = Opcodes.DCMPG;
                                            iM4324 = m4315(0L, 0L, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                                            break;
                                        case ';':
                                            iM4324 = m4326(0, 84);
                                            break;
                                        case '<':
                                            this.f7516 = 90;
                                            iM4324 = m4315(0L, 72057596185411584L, 528384L);
                                            break;
                                        case '=':
                                            this.f7516 = 87;
                                            iM4324 = m4315(0L, JSONWriter.MASK_ESCAPE_NONE_ASCII, 0L);
                                            break;
                                        case '>':
                                            this.f7516 = 88;
                                            iM4324 = m4315(0L, 1441151889348493312L, 81920L);
                                            break;
                                        case '?':
                                            this.f7516 = Opcodes.DCMPL;
                                            iM4324 = m4315(0L, 0L, 141557760L);
                                            break;
                                        case '@':
                                            iM4324 = m4315(0L, 3074411141959516160L, 174760L);
                                            break;
                                        default:
                                            switch (cM3436) {
                                                case Opcodes.LADD /* 97 */:
                                                    iM4324 = m4315(274877908992L, 0L, 0L);
                                                    break;
                                                case 'b':
                                                    iM4324 = m4315(45056L, 0L, 0L);
                                                    break;
                                                case 'c':
                                                    iM4324 = m4315(2048000L, 0L, 0L);
                                                    break;
                                                case 'd':
                                                    iM4324 = m4315(14680064L, 0L, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN);
                                                    break;
                                                case 'e':
                                                    iM4324 = m4315(117440512L, 0L, 0L);
                                                    break;
                                                case 'f':
                                                    iM4324 = m4315(4160749568L, 0L, 0L);
                                                    break;
                                                case 'g':
                                                    iM4324 = m4315(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER, 0L, 0L);
                                                    break;
                                                default:
                                                    switch (cM3436) {
                                                        case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                                            iM4324 = m4315(FieldInfo.UNWRAPPED_MASK, 0L, 0L);
                                                            break;
                                                        case 's':
                                                            iM4324 = m4315(34902897112121344L, 0L, 0L);
                                                            break;
                                                        case Opcodes.INEG /* 116 */:
                                                            iM4324 = m4315(1116892707587883008L, 0L, 0L);
                                                            break;
                                                        default:
                                                            iM4324 = m4305(1, 0);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    iM4324 = m4315(527765581332480L, 0L, 0L);
                }
                if (this.f7516 == Integer.MAX_VALUE) {
                    C1697 c1698 = this.f7517;
                    int[] iArr = c1698.f5776;
                    int i5 = c1698.f5771;
                    int i6 = iArr[i5];
                    int i7 = c1698.f5777[i5];
                    try {
                        c1698.m3436();
                        this.f7517.m3429(1);
                    } catch (IOException unused) {
                        strM3431 = iM4324 <= 1 ? "" : this.f7517.m3431();
                        int i8 = this.f7520;
                        if (i8 == 10 || i8 == 13) {
                            i6++;
                        } else {
                            i = i7 + 1;
                        }
                        i7 = i;
                        i = 1;
                    }
                    if (i == 0) {
                        this.f7517.m3429(1);
                        strM3431 = iM4324 > 1 ? this.f7517.m3431() : "";
                    }
                    int i9 = this.f7520;
                    char c = (char) i9;
                    StringBuilder sb = new StringBuilder("Lexical error at line ");
                    sb.append(i6);
                    sb.append(", column ");
                    sb.append(i7);
                    sb.append(".  Encountered: ");
                    if (i != 0) {
                        str = "<EOF> ";
                    } else {
                        str = "\"" + C3409.m4927(String.valueOf(c)) + "\" (" + i9 + "), ";
                    }
                    sb.append(str);
                    sb.append("after : \"");
                    sb.append(C3409.m4927(strM3431));
                    sb.append("\"");
                    throw new C3409(sb.toString());
                }
                int i10 = this.f7515;
                if (i10 + 1 < iM4324) {
                    this.f7517.m3429((iM4324 - i10) - 1);
                }
                int i11 = this.f7516;
                int i12 = i11 >> 6;
                long j = 1 << (i11 & 63);
                if ((f7511[i12] & j) != 0) {
                    return m4304();
                }
                if ((f7512[i12] & j) != 0) {
                    C3408 c3408M4304 = m4304();
                    if (c3408 != null) {
                        c3408.f10751 = c3408M4304;
                    }
                    c3408 = c3408M4304;
                }
            } catch (Exception unused2) {
                this.f7516 = 0;
                this.f7515 = -1;
                return m4304();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4300(int i, int i2) {
        while (true) {
            int i3 = this.f7513;
            this.f7513 = i3 + 1;
            this.f7519[i3] = f7510[i];
            int i4 = i + 1;
            if (i == i2) {
                return;
            } else {
                i = i4;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4301(int i) {
        int[] iArr = this.f7518;
        int i2 = iArr[i];
        int i3 = this.f7514;
        if (i2 != i3) {
            int i4 = this.f7513;
            this.f7513 = i4 + 1;
            this.f7519[i4] = i;
            iArr[i] = i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4302(int i, int i2) {
        while (true) {
            m4301(f7510[i]);
            int i3 = i + 1;
            if (i == i2) {
                return;
            } else {
                i = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4303(int i, int i2) {
        m4301(i);
        m4301(i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C3408 m4304() {
        String strM3431 = f7509[this.f7516];
        if (strM3431 == null) {
            strM3431 = this.f7517.m3431();
        }
        C1697 c1697 = this.f7517;
        int[] iArr = c1697.f5776;
        int i = c1697.f5773;
        int i2 = iArr[i];
        int[] iArr2 = c1697.f5777;
        int i3 = iArr2[i];
        int i4 = c1697.f5771;
        int i5 = iArr[i4];
        int i6 = iArr2[i4];
        int i7 = this.f7516;
        C3408 c3408 = new C3408();
        c3408.f10746 = i7;
        c3408.f10750 = strM3431;
        c3408.f10747 = i2;
        c3408.f10749 = i5;
        c3408.f10748 = i3;
        return c3408;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x008e A[PHI: r1
      0x008e: PHI (r1v202 int) = (r1v116 int), (r1v137 int), (r1v147 int), (r1v191 int), (r1v192 int), (r1v91 int) binds: [B:256:0x0436, B:206:0x0360, B:184:0x02fc, B:57:0x0104, B:53:0x00f7, B:30:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:362:0x05b8 A[PHI: r1
      0x05b8: PHI (r1v82 int) = (r1v51 int), (r1v55 int), (r1v85 int) binds: [B:428:0x0718, B:420:0x06ed, B:361:0x05b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:363:0x05b9 A[PHI: r8
      0x05b9: PHI (r8v21 int) = 
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v20 int)
      (r8v30 int)
      (r8v20 int)
      (r8v31 int)
      (r8v20 int)
      (r8v20 int)
     binds: [B:352:0x059c, B:431:0x0723, B:426:0x0714, B:428:0x0718, B:423:0x06fe, B:424:0x0700, B:418:0x06e9, B:420:0x06ed, B:415:0x06d3, B:416:0x06d5, B:412:0x06bc, B:413:0x06be, B:410:0x06ab, B:408:0x06a0, B:409:0x06a2, B:405:0x068b, B:406:0x068d, B:403:0x0676, B:402:0x066b, B:400:0x0660, B:401:0x0662, B:397:0x064c, B:398:0x064e, B:392:0x0635, B:394:0x0639, B:389:0x0622, B:390:0x0624, B:382:0x0604, B:375:0x05e7, B:373:0x05d5, B:365:0x05c1, B:362:0x05b8, B:355:0x05a4, B:354:0x05a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:561:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:570:0x08f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x0903 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int m4305(int i, int i2) {
        int i3;
        char c;
        int i4;
        int i5;
        int i6;
        this.f7513 = 75;
        int[] iArr = this.f7519;
        iArr[0] = i;
        int i7 = 1;
        int i8 = Integer.MAX_VALUE;
        int i9 = i2;
        int i10 = 0;
        int i11 = 1;
        int i12 = Integer.MAX_VALUE;
        while (true) {
            int i13 = this.f7514 + i7;
            this.f7514 = i13;
            if (i13 == i8) {
                this.f7514 = -2147483647;
                int i14 = 75;
                while (true) {
                    int i15 = i14 - 1;
                    if (i14 > 0) {
                        this.f7518[i15] = Integer.MIN_VALUE;
                        i14 = i15;
                    }
                }
            }
            int i16 = this.f7520;
            int i17 = 73;
            int i18 = 33;
            if (i16 >= 64) {
                if (i16 < 128) {
                    long j = 1 << (i16 & 63);
                    do {
                        i11--;
                        switch (iArr[i11]) {
                            case 1:
                            case 42:
                                if ((j & 576460745995190270L) != 0) {
                                    if (i12 > 75) {
                                        i12 = 75;
                                    }
                                    m4301(42);
                                }
                                break;
                            case 2:
                            case 75:
                                if ((j & (-1152921504606846977L)) != 0) {
                                    m4302(0, 3);
                                }
                                break;
                            case 9:
                                m4300(25, 27);
                                break;
                            case 15:
                                if (this.f7520 == 95) {
                                    if (i12 > 64) {
                                        i12 = 64;
                                    }
                                    m4303(15, 16);
                                }
                                break;
                            case 16:
                                if ((j & 38441125539254784L) != 0) {
                                    i5 = 64;
                                    if (i12 > 64) {
                                        i12 = i5;
                                    }
                                }
                                break;
                            case 19:
                                if ((j & 137438953504L) != 0) {
                                    m4300(43, 44);
                                }
                                break;
                            case Opcodes.LLOAD /* 22 */:
                                if ((j & 36029140624736336L) != 0) {
                                    i5 = 69;
                                    if (i12 > 69) {
                                        i12 = i5;
                                    }
                                }
                                break;
                            case Opcodes.DLOAD /* 24 */:
                                if ((j & (-268435457)) != 0) {
                                    m4302(15, 17);
                                }
                                break;
                            case Opcodes.ALOAD /* 25 */:
                                if (this.f7520 == 92) {
                                    int i19 = this.f7513;
                                    this.f7513 = i19 + 1;
                                    iArr[i19] = 26;
                                }
                                break;
                            case 26:
                                m4302(15, 17);
                                break;
                            case 29:
                                if ((j & (-268435457)) != 0) {
                                    m4302(22, 24);
                                }
                                break;
                            case 30:
                                if (this.f7520 == 92) {
                                    int i20 = this.f7513;
                                    this.f7513 = i20 + 1;
                                    iArr[i20] = 31;
                                }
                                break;
                            case 31:
                                m4302(22, 24);
                                break;
                            case 34:
                                m4300(31, 33);
                                break;
                            case 47:
                                if ((j & 137438953504L) != 0) {
                                    m4300(45, 46);
                                }
                                break;
                            case Opcodes.BALOAD /* 51 */:
                                if ((j & 137438953504L) != 0) {
                                    m4300(47, 48);
                                }
                                break;
                            case Opcodes.LSTORE /* 55 */:
                                if ((j & 343597383760L) != 0 && i12 > 69) {
                                    i12 = 69;
                                }
                                break;
                            case Opcodes.DSTORE /* 57 */:
                                if ((j & 72057594054705152L) != 0) {
                                    m4301(58);
                                }
                                break;
                            case Opcodes.ASTORE /* 58 */:
                                if ((j & 543313363070L) != 0) {
                                    int i21 = i12 > 64 ? 64 : i12;
                                    m4303(58, 16);
                                    i12 = i21;
                                }
                                break;
                            case 59:
                                if ((j & 17179869188L) != 0) {
                                    i6 = i12 > 64 ? 64 : i12;
                                    m4302(37, 39);
                                    i12 = i6;
                                }
                                break;
                            case 60:
                                if (this.f7520 == 95) {
                                    i6 = i12 > 64 ? 64 : i12;
                                    m4302(37, 39);
                                    i12 = i6;
                                }
                                break;
                            case 65:
                                i5 = i12 > 8 ? 8 : i12;
                                m4300(4, 6);
                                i12 = i5;
                                break;
                            case 70:
                                m4303(70, 71);
                                break;
                            case 72:
                            case 73:
                                m4303(73, 71);
                                break;
                            default:
                                break;
                        }
                    } while (i11 != i10);
                } else {
                    int i22 = i16 >> 8;
                    int i23 = i16 >> 14;
                    long j2 = 1 << (i22 & 63);
                    int i24 = (i16 & 255) >> 6;
                    long j3 = 1 << (i16 & 63);
                    while (true) {
                        i11--;
                        int i25 = iArr[i11];
                        if (i25 != 0) {
                            i3 = 1;
                            if (i25 != 1) {
                                if (i25 != 2) {
                                    if (i25 != 9) {
                                        if (i25 == 24 || i25 == 26) {
                                            if (m4297(i22, i23, i24, j2, j3)) {
                                                m4302(15, 17);
                                            }
                                        } else if (i25 == 29 || i25 == 31) {
                                            if (m4297(i22, i23, i24, j2, j3)) {
                                                m4302(22, 24);
                                            }
                                        } else if (i25 != 34) {
                                            if (i25 != 65) {
                                                if (i25 != 70) {
                                                    if (i25 != 75) {
                                                        if (i25 == 41 || i25 == 42) {
                                                            if (m4298(i22, i23, i24, j2, j3)) {
                                                                int i26 = i12 > 75 ? 75 : i12;
                                                                m4301(42);
                                                                i12 = i26;
                                                            }
                                                        } else if ((i25 == 72 || i25 == i17) && m4297(i22, i23, i24, j2, j3)) {
                                                            m4303(i17, 71);
                                                        }
                                                    }
                                                } else if (m4297(i22, i23, i24, j2, j3)) {
                                                    m4303(70, 71);
                                                }
                                            } else if (m4297(i22, i23, i24, j2, j3)) {
                                                if (i12 > 8) {
                                                    i12 = 8;
                                                }
                                                m4300(4, 6);
                                            }
                                        } else if (m4297(i22, i23, i24, j2, j3)) {
                                            m4300(31, 33);
                                        }
                                    } else if (m4297(i22, i23, i24, j2, j3)) {
                                        m4300(25, 27);
                                    }
                                }
                                if (m4297(i22, i23, i24, j2, j3)) {
                                    m4302(0, 3);
                                }
                            } else {
                                if (i22 == 0 && (f7501[i24] & j3) != 0) {
                                    if (i12 > 6) {
                                        i12 = 6;
                                    }
                                    m4301(0);
                                }
                                int i27 = i12;
                                if (m4298(i22, i23, i24, j2, j3)) {
                                    if (i27 > 75) {
                                        i27 = 75;
                                    }
                                    m4301(42);
                                    c = 'K';
                                    i12 = i27;
                                } else {
                                    i12 = i27;
                                }
                            }
                            c = 'K';
                        } else {
                            i3 = 1;
                            c = 'K';
                            if (i22 == 0 && (f7501[i24] & j3) != 0) {
                                if (i12 > 6) {
                                    i12 = 6;
                                }
                                m4301(0);
                            }
                        }
                        if (i11 == i10) {
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i17 = 73;
                        }
                    }
                }
                if (i12 != i4) {
                    this.f7516 = i12;
                    this.f7515 = i9;
                    i12 = i4;
                }
                i9++;
                i11 = this.f7513;
                this.f7513 = i10;
                i10 = 75 - i10;
                if (i11 == i10) {
                    try {
                        this.f7520 = this.f7517.m3436();
                        i7 = i3;
                        i8 = i4;
                    } catch (IOException unused) {
                    }
                }
                return i9;
            }
            long j4 = 1 << i16;
            while (true) {
                i11--;
                int i28 = 10;
                switch (iArr[i11]) {
                    case 0:
                        if ((j4 & 8589934591L) != 0) {
                            if (i12 > 6) {
                                i12 = 6;
                            }
                            m4301(0);
                        }
                        break;
                    case 1:
                        if ((j4 & 8589934591L) != 0) {
                            if (i12 > 6) {
                                i12 = 6;
                            }
                            m4301(0);
                        } else if ((j4 & 287948901175001088L) != 0) {
                            m4302(7, 12);
                        } else {
                            int i29 = this.f7520;
                            if (i29 == 47) {
                                m4300(13, 14);
                            } else if (i29 == 36) {
                                if (i12 > 75) {
                                    i12 = 75;
                                }
                                m4301(42);
                            } else if (i29 == 34) {
                                int i30 = this.f7513;
                                this.f7513 = i30 + 1;
                                iArr[i30] = 39;
                            } else if (i29 == 39) {
                                m4302(15, 17);
                            } else if (i29 == 46) {
                                m4301(18);
                            } else if (i29 == 35) {
                                int i31 = this.f7513;
                                this.f7513 = i31 + 1;
                                iArr[i31] = 8;
                            } else if (i29 == 60) {
                                m4302(0, 3);
                            }
                        }
                        if ((j4 & 287667426198290432L) == 0) {
                            int i32 = this.f7520;
                            if (i32 == 48) {
                                if (i12 > 64) {
                                    i12 = 64;
                                }
                                m4302(18, 21);
                            } else if (i32 == 34) {
                                m4302(22, 24);
                            }
                        } else {
                            int i33 = i12 > 64 ? 64 : i12;
                            m4303(15, 16);
                            i12 = i33;
                        }
                        break;
                    case 2:
                        if ((j4 & (-7493990054822421505L)) != 0) {
                            m4302(0, 3);
                        }
                        break;
                    case 3:
                        if (this.f7520 == 32) {
                            m4302(0, 3);
                        }
                        break;
                    case 4:
                        if (this.f7520 == 38) {
                            int i34 = this.f7513;
                            this.f7513 = i34 + 1;
                            iArr[i34] = 3;
                        }
                        break;
                    case 5:
                        if (this.f7520 == 44) {
                            m4302(0, 3);
                        }
                        break;
                    case 6:
                        if (this.f7520 == 62) {
                            int i35 = this.f7513;
                            this.f7513 = i35 + 1;
                            iArr[i35] = 5;
                        }
                        break;
                    case 7:
                        if (this.f7520 == 62) {
                            if (i12 > 7) {
                                i12 = 7;
                            }
                            m4301(7);
                        }
                        break;
                    case 8:
                        if (this.f7520 == 33) {
                            m4302(25, 27);
                        }
                        break;
                    case 9:
                        if ((j4 & (-9217)) != 0) {
                            m4302(25, 27);
                        }
                        break;
                    case 10:
                        if ((j4 & 9216) != 0 && i12 > 9) {
                            i12 = 9;
                        }
                        break;
                    case 11:
                        if (this.f7520 == 10) {
                            i28 = 9;
                            if (i12 > 9) {
                                i12 = i28;
                            }
                        }
                        break;
                    case Opcodes.FCONST_1 /* 12 */:
                        if (this.f7520 == 13) {
                            int i36 = this.f7513;
                            this.f7513 = i36 + 1;
                            iArr[i36] = 11;
                        }
                        break;
                    case 13:
                        if (this.f7520 == 35) {
                            int i37 = this.f7513;
                            this.f7513 = i37 + 1;
                            iArr[i37] = 8;
                        }
                        break;
                    case Opcodes.DCONST_0 /* 14 */:
                        if ((j4 & 287667426198290432L) != 0) {
                            if (i12 > 64) {
                                i12 = 64;
                            }
                            m4303(15, 16);
                        }
                        break;
                    case 15:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i12 > 64) {
                                i12 = 64;
                            }
                            m4303(15, 16);
                        }
                        break;
                    case Opcodes.SIPUSH /* 17 */:
                        if (this.f7520 == 46) {
                            m4301(18);
                        }
                        break;
                    case Opcodes.LDC /* 18 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i12 > 69) {
                                i12 = 69;
                            }
                            m4302(28, 30);
                        }
                        break;
                    case 20:
                        if ((j4 & 43980465111040L) != 0) {
                            m4301(21);
                        }
                        break;
                    case Opcodes.ILOAD /* 21 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i12 > 69) {
                                i12 = 69;
                            }
                            m4303(21, 22);
                        }
                        break;
                    case Opcodes.FLOAD /* 23 */:
                        if (this.f7520 == 39) {
                            m4302(15, 17);
                        }
                        break;
                    case Opcodes.DLOAD /* 24 */:
                        if ((j4 & (-549755823105L)) != 0) {
                            m4302(15, 17);
                        }
                        break;
                    case 26:
                        m4302(15, 17);
                        break;
                    case 27:
                        if (this.f7520 == 39 && i12 > 72) {
                            i28 = 72;
                            i12 = i28;
                        }
                        break;
                    case 28:
                        if (this.f7520 == 34) {
                            m4302(22, 24);
                        }
                        break;
                    case 29:
                        if ((j4 & (-17179878401L)) != 0) {
                            m4302(22, 24);
                        }
                        break;
                    case 31:
                        m4302(22, 24);
                        break;
                    case 32:
                        if (this.f7520 == 34 && i12 > 73) {
                            i12 = 73;
                        }
                        break;
                    case 33:
                    case 35:
                        if (this.f7520 == 34) {
                            m4303(34, 38);
                        }
                        break;
                    case 34:
                        if ((j4 & (-17179869185L)) != 0) {
                            m4302(31, i18);
                        }
                        break;
                    case 36:
                        if (this.f7520 == 34 && i12 > 74) {
                            i28 = 74;
                            i12 = i28;
                        }
                        break;
                    case 37:
                        if (this.f7520 == 34) {
                            int i38 = this.f7513;
                            this.f7513 = i38 + 1;
                            iArr[i38] = 36;
                        }
                        break;
                    case 38:
                        if (this.f7520 == 34) {
                            int i39 = this.f7513;
                            this.f7513 = i39 + 1;
                            iArr[i39] = 37;
                        }
                        break;
                    case 39:
                        if (this.f7520 == 34) {
                            int i40 = this.f7513;
                            this.f7513 = i40 + 1;
                            iArr[i40] = i18;
                        }
                        break;
                    case 40:
                        if (this.f7520 == 34) {
                            int i41 = this.f7513;
                            this.f7513 = i41 + 1;
                            iArr[i41] = 39;
                        }
                        break;
                    case 41:
                        if (this.f7520 == 36) {
                            if (i12 > 75) {
                                i12 = 75;
                            }
                            m4301(42);
                        }
                        break;
                    case 42:
                        if ((j4 & 287948969894477824L) != 0) {
                            int i42 = i12 > 75 ? 75 : i12;
                            m4301(42);
                            i12 = i42;
                        }
                        break;
                    case 43:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4302(7, 12);
                        }
                        break;
                    case 44:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4303(44, 45);
                        }
                        break;
                    case 45:
                        if (this.f7520 == 46) {
                            if (i12 > 69) {
                                i12 = 69;
                            }
                            m4302(34, 36);
                        }
                        break;
                    case Opcodes.IALOAD /* 46 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            int i43 = i12 > 69 ? 69 : i12;
                            m4302(34, 36);
                            i12 = i43;
                        }
                        break;
                    case 48:
                        if ((j4 & 43980465111040L) != 0) {
                            m4301(49);
                        }
                        break;
                    case 49:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i12 > 69) {
                                i12 = 69;
                            }
                            m4303(49, 22);
                        }
                        break;
                    case Opcodes.AALOAD /* 50 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4303(50, 51);
                        }
                        break;
                    case 52:
                        if ((j4 & 43980465111040L) != 0) {
                            m4301(53);
                        }
                        break;
                    case Opcodes.SALOAD /* 53 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i12 > 69) {
                                i12 = 69;
                            }
                            m4303(53, 22);
                        }
                        break;
                    case Opcodes.ISTORE /* 54 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4303(54, 55);
                        }
                        break;
                    case Opcodes.FSTORE /* 56 */:
                        if (this.f7520 == 48) {
                            if (i12 > 64) {
                                i12 = 64;
                            }
                            m4302(18, 21);
                        }
                        break;
                    case Opcodes.ASTORE /* 58 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i12 > 64) {
                                i12 = 64;
                            }
                            m4303(58, 16);
                        }
                        break;
                    case 60:
                        if ((j4 & 844424930131968L) != 0) {
                            if (i12 > 64) {
                                i12 = 64;
                            }
                            m4302(37, 39);
                        }
                        break;
                    case 61:
                        if ((j4 & 844424930131968L) != 0) {
                            if (i12 > 64) {
                                i12 = 64;
                            }
                            m4301(16);
                        }
                        break;
                    case 62:
                        if ((j4 & 71776119061217280L) != 0) {
                            if (i12 > 64) {
                                i12 = 64;
                            }
                            m4303(62, 16);
                        }
                        break;
                    case 63:
                        if (this.f7520 == 47) {
                            m4300(13, 14);
                        }
                        break;
                    case 64:
                        int i44 = this.f7520;
                        if (i44 == 42) {
                            m4303(70, 71);
                        } else if (i44 == 47) {
                            if (i12 > 8) {
                                i12 = 8;
                            }
                            m4302(4, 6);
                        }
                        break;
                    case 65:
                        if ((j4 & (-9217)) != 0) {
                            if (i12 > 8) {
                                i12 = 8;
                            }
                            m4302(4, 6);
                        }
                        break;
                    case 66:
                        i28 = 8;
                        if ((j4 & 9216) != 0 && i12 > 8) {
                            i12 = i28;
                        }
                        break;
                    case 67:
                        if (this.f7520 == 10) {
                            i28 = 8;
                            if (i12 > 8) {
                                i12 = i28;
                            }
                        }
                        break;
                    case 68:
                        if (this.f7520 == 13) {
                            int i45 = this.f7513;
                            this.f7513 = i45 + 1;
                            iArr[i45] = 67;
                        }
                        break;
                    case 69:
                        if (this.f7520 == 42) {
                            m4303(70, 71);
                        }
                        break;
                    case 70:
                        if ((j4 & (-4398046511105L)) != 0) {
                            m4303(70, 71);
                        }
                        break;
                    case 71:
                        if (this.f7520 == 42) {
                            m4302(40, 42);
                        }
                        break;
                    case 72:
                        if ((j4 & (-145135534866433L)) != 0) {
                            m4303(73, 71);
                        }
                        break;
                    case 73:
                        if ((j4 & (-4398046511105L)) != 0) {
                            m4303(73, 71);
                        }
                        break;
                    case 74:
                        if (this.f7520 == 47 && i12 > 10) {
                            i12 = i28;
                        }
                        break;
                    case 75:
                        if ((j4 & (-7493990054822421505L)) != 0) {
                            m4302(0, 3);
                        } else {
                            int i46 = this.f7520;
                            if (i46 == 62) {
                                if (i12 > 7) {
                                    i12 = 7;
                                }
                                m4301(7);
                            } else if (i46 == 38) {
                                int i47 = this.f7513;
                                this.f7513 = i47 + 1;
                                iArr[i47] = 3;
                            }
                        }
                        if (this.f7520 == 62) {
                            int i48 = this.f7513;
                            this.f7513 = i48 + 1;
                            iArr[i48] = 5;
                        }
                        break;
                }
                if (i11 != i10) {
                    i18 = 33;
                }
            }
            i4 = Integer.MAX_VALUE;
            i3 = 1;
            c = 'K';
            if (i12 != i4) {
                this.f7516 = i12;
                this.f7515 = i9;
                i12 = i4;
            }
            i9++;
            i11 = this.f7513;
            this.f7513 = i10;
            i10 = 75 - i10;
            if (i11 == i10) {
                this.f7520 = this.f7517.m3436();
                i7 = i3;
                i8 = i4;
            }
            return i9;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m4306(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 8);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == 'e') {
                return m4307(j7, FieldInfo.JIT, j8, 0L, j9, 0L);
            }
            if (cM3436 == 'f') {
                return m4307(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3436 == 'i') {
                return m4307(j7, 0L, j8, FieldInfo.BACKR_REFERENCE, j9, JSONWriter.MASK_REFERENCE_DETECTION);
            }
            if (cM3436 != 'r') {
                if (cM3436 == 't') {
                    if ((FieldInfo.DISABLE_REFERENCE_DETECT & j8) != 0) {
                        this.f7516 = 121;
                        this.f7515 = 10;
                    }
                    return m4307(j7, 0L, j8, 0L, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                }
                if (cM3436 == 'n') {
                    if ((8 & j9) != 0) {
                        return m4326(10, Opcodes.LXOR);
                    }
                    if ((128 & j9) != 0) {
                        return m4326(10, Opcodes.I2D);
                    }
                    if ((512 & j9) != 0) {
                        return m4326(10, 137);
                    }
                    return (JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME & j9) != 0 ? m4326(10, Opcodes.F2I) : m4307(j7, 0L, j8, 140737488355328L, j9, 0L);
                }
                if (cM3436 == 'o') {
                    return m4307(j7, 0L, j8, FieldInfo.READ_USING_MASK, j9, 0L);
                }
            } else if ((FieldInfo.UNWRAPPED_MASK & j8) != 0) {
                return m4326(10, 113);
            }
            return m4325(j7, j8, j9, 9);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 9);
            return 10;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int m4307(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 9);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == '_') {
                return m4308(j7, j8, 0L, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3436 != 'd') {
                if (cM3436 == 'g') {
                    return m4308(j7, j8, FieldInfo.BACKR_REFERENCE, j9, JSONWriter.MASK_REFERENCE_DETECTION);
                }
                if (cM3436 != 'r') {
                    if (cM3436 == 't') {
                        if ((FieldInfo.DISABLE_AUTO_TYPE & j8) != 0) {
                            this.f7516 = Opcodes.LSHR;
                            this.f7515 = 11;
                        }
                        return m4308(j7, j8, 0L, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
                    }
                } else if ((FieldInfo.READ_USING_MASK & j8) != 0) {
                    return m4326(11, 115);
                }
            } else {
                if ((FieldInfo.JIT & j7) != 0) {
                    return m4324(11, 54, 42);
                }
                if ((140737488355328L & j8) != 0) {
                    return m4326(11, UMErrorCode.E_UM_BE_CREATE_FAILED);
                }
            }
            return m4325(j7, j8, j9, 10);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 10);
            return 11;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int m4308(long j, long j2, long j3, long j4, long j5) {
        long j6 = j3 & j2;
        long j7 = j5 & j4;
        if ((j6 | j7) == 0) {
            return m4325(j, j2, j4, 10);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == '_') {
                return m4309(j6, 0L, j7, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3436 != 'a') {
                return cM3436 != 'n' ? m4325(0L, j6, j7, 11) : m4309(j6, FieldInfo.BACKR_REFERENCE, j7, JSONWriter.MASK_REFERENCE_DETECTION);
            }
            return m4309(j6, 0L, j7, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
        } catch (IOException unused) {
            m4327(0L, j6, j7, 11);
            return 12;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m4309(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4325(0L, j, j3, 11);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == 'a') {
                return m4310(j5, 0L, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3436 != 'e') {
                return cM3436 != 's' ? m4325(0L, j5, j6, 12) : m4310(j5, 0L, j6, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            return m4310(j5, FieldInfo.BACKR_REFERENCE, j6, JSONWriter.MASK_REFERENCE_DETECTION);
        } catch (IOException unused) {
            m4327(0L, j5, j6, 12);
            return 13;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int m4310(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4325(0L, j, j3, 12);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 != 'd') {
                return cM3436 != 's' ? m4325(0L, j5, j6, 13) : m4311(j5, 0L, j6, 40960L);
            }
            return m4311(j5, FieldInfo.BACKR_REFERENCE, j6, JSONWriter.MASK_REFERENCE_DETECTION);
        } catch (IOException unused) {
            m4327(0L, j5, j6, 13);
            return 14;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int m4311(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4325(0L, j, j3, 13);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == '_') {
                return m4312(j5, FieldInfo.BACKR_REFERENCE, j6, JSONWriter.MASK_REFERENCE_DETECTION);
            }
            if (cM3436 != 'i') {
                return cM3436 != 's' ? m4325(0L, j5, j6, 14) : m4312(j5, 0L, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            return m4312(j5, 0L, j6, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
        } catch (IOException unused) {
            m4327(0L, j5, j6, 14);
            return 15;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int m4312(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4325(0L, j, j3, 14);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == 'g') {
                return m4313(j5, 0L, j6, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3436 != 'i') {
                return cM3436 != 's' ? m4325(0L, j5, j6, 15) : m4313(j5, FieldInfo.BACKR_REFERENCE, j6, JSONWriter.MASK_REFERENCE_DETECTION);
            }
            return m4313(j5, 0L, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
        } catch (IOException unused) {
            m4327(0L, j5, j6, 15);
            return 16;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int m4313(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4325(0L, j, j3, 15);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == 'g') {
                return m4314(j5, 0L, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3436 != 'h') {
                return (cM3436 == 'n' && (JSONWriter.MASK_WRITE_ENUMS_USING_NAME & j6) != 0) ? m4326(17, 141) : m4325(0L, j5, j6, 16);
            }
            return m4314(j5, FieldInfo.BACKR_REFERENCE, j6, JSONWriter.MASK_REFERENCE_DETECTION);
        } catch (IOException unused) {
            m4327(0L, j5, j6, 16);
            return 17;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int m4314(long j, long j2, long j3, long j4) {
        int i;
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4325(0L, j, j3, 16);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 != 'i') {
                return (cM3436 == 'n' && (JSONWriter.MASK_IGNORE_ERROR_GETTER & j6) != 0) ? m4326(18, Opcodes.D2L) : m4325(0L, j5, j6, 17);
            }
            long j7 = FieldInfo.BACKR_REFERENCE & j5;
            long j8 = JSONWriter.MASK_REFERENCE_DETECTION & j6;
            if ((j7 | j8) == 0) {
                return m4325(0L, j5, j6, 17);
            }
            try {
                char cM3437 = this.f7517.m3436();
                this.f7520 = cM3437;
                if (cM3437 != 'f') {
                    return m4325(0L, j7, j8, 18);
                }
                long j9 = j5 & FieldInfo.BACKR_REFERENCE;
                long j10 = j6 & JSONWriter.MASK_REFERENCE_DETECTION;
                if ((j9 | j10) == 0) {
                    return m4325(0L, j7, j8, 18);
                }
                try {
                    char cM3438 = this.f7517.m3436();
                    this.f7520 = cM3438;
                    if (cM3438 != 't') {
                        return m4325(0L, j9, j10, 19);
                    }
                    if (j9 != 0) {
                        this.f7516 = Opcodes.LUSHR;
                        this.f7515 = 20;
                    }
                    if (j10 == 0) {
                        return m4325(0L, j9, j10, 19);
                    }
                    try {
                        char cM3439 = this.f7517.m3436();
                        this.f7520 = cM3439;
                        if (cM3439 != '_') {
                            return m4325(0L, 0L, j10, 20);
                        }
                        if (j10 == 0) {
                            return m4325(0L, 0L, j10, 20);
                        }
                        try {
                            char cM34310 = this.f7517.m3436();
                            this.f7520 = cM34310;
                            if (cM34310 != 'a') {
                                return m4325(0L, 0L, j10, 21);
                            }
                            if (j10 == 0) {
                                return m4325(0L, 0L, j10, 21);
                            }
                            try {
                                char cM34311 = this.f7517.m3436();
                                this.f7520 = cM34311;
                                if (cM34311 != 's') {
                                    return m4325(0L, 0L, j10, 22);
                                }
                                if (j10 == 0) {
                                    return m4325(0L, 0L, j10, 22);
                                }
                                try {
                                    char cM34312 = this.f7517.m3436();
                                    this.f7520 = cM34312;
                                    if (cM34312 != 's') {
                                        return m4325(0L, 0L, j10, 23);
                                    }
                                    if (j10 == 0) {
                                        return m4325(0L, 0L, j10, 23);
                                    }
                                    try {
                                        char cM34313 = this.f7517.m3436();
                                        this.f7520 = cM34313;
                                        if (cM34313 != 'i') {
                                            return m4325(0L, 0L, j10, 24);
                                        }
                                        if (j10 == 0) {
                                            return m4325(0L, 0L, j10, 24);
                                        }
                                        try {
                                            char cM34314 = this.f7517.m3436();
                                            this.f7520 = cM34314;
                                            if (cM34314 != 'g') {
                                                return m4325(0L, 0L, j10, 25);
                                            }
                                            if (j10 == 0) {
                                                return m4325(0L, 0L, j10, 25);
                                            }
                                            i = 27;
                                            try {
                                                char cM34315 = this.f7517.m3436();
                                                this.f7520 = cM34315;
                                                return (cM34315 == 'n' && j10 != 0) ? m4326(27, Opcodes.I2B) : m4325(0L, 0L, j10, 26);
                                            } catch (IOException unused) {
                                                m4327(0L, 0L, j10, 26);
                                                return i;
                                            }
                                        } catch (IOException unused2) {
                                            m4327(0L, 0L, j10, 25);
                                            i = 26;
                                        }
                                    } catch (IOException unused3) {
                                        m4327(0L, 0L, j10, 24);
                                        i = 25;
                                    }
                                } catch (IOException unused4) {
                                    m4327(0L, 0L, j10, 23);
                                    i = 24;
                                }
                            } catch (IOException unused5) {
                                m4327(0L, 0L, j10, 22);
                                i = 23;
                            }
                        } catch (IOException unused6) {
                            m4327(0L, 0L, j10, 21);
                            i = 22;
                        }
                    } catch (IOException unused7) {
                        m4327(0L, 0L, j10, 20);
                        return 21;
                    }
                } catch (IOException unused8) {
                    m4327(0L, j9, j10, 19);
                    return 20;
                }
            } catch (IOException unused9) {
                m4327(0L, j7, j8, 18);
                return 19;
            }
        } catch (IOException unused10) {
            m4327(0L, j5, j6, 17);
            return 18;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int m4315(long j, long j2, long j3) {
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 != '&') {
                if (cM3436 != ':') {
                    if (cM3436 != '|') {
                        if (cM3436 == '*') {
                            if ((j2 & FieldInfo.JIT) != 0) {
                                this.f7516 = Opcodes.FNEG;
                                this.f7515 = 1;
                            }
                            return m4316(j, 0L, j2, 0L, j3, 1024L);
                        }
                        if (cM3436 != '+') {
                            if (cM3436 != '-') {
                                if (cM3436 == '.') {
                                    return (j3 & JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING) != 0 ? m4326(1, Opcodes.IFLT) : m4316(j, 0L, j2, 0L, j3, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                                }
                                if (cM3436 == 'a') {
                                    return m4316(j, 39582553014272L, j2, 549755813888L, j3, 8L);
                                }
                                if (cM3436 == 'b') {
                                    return m4316(j, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME, j2, 2955487255461888L, j3, 0L);
                                }
                                switch (cM3436) {
                                    case '<':
                                        if ((j2 & FieldInfo.READ_ONLY) != 0) {
                                            this.f7516 = 120;
                                            this.f7515 = 1;
                                        }
                                        return m4316(j, 0L, j2, 0L, j3, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
                                    case '=':
                                        if ((j2 & JSONWriter.MASK_ESCAPE_NONE_ASCII) != 0) {
                                            return m4326(1, 94);
                                        }
                                        if ((j2 & 2147483648L) != 0) {
                                            this.f7516 = 95;
                                            this.f7515 = 1;
                                        } else {
                                            if ((j2 & 8589934592L) != 0) {
                                                return m4326(1, 97);
                                            }
                                            if ((j2 & JSONWriter.MASK_BROWSER_SECURE) != 0) {
                                                return m4326(1, 99);
                                            }
                                            if ((j2 & FieldInfo.RECORD) != 0) {
                                                return m4326(1, 126);
                                            }
                                            if ((j2 & Long.MIN_VALUE) != 0) {
                                                return m4326(1, 127);
                                            }
                                            if ((j3 & 1) != 0) {
                                                return m4326(1, 128);
                                            }
                                            if ((j3 & 2) != 0) {
                                                return m4326(1, Opcodes.LOR);
                                            }
                                            if ((j3 & 4) != 0) {
                                                return m4326(1, Opcodes.IXOR);
                                            }
                                            if ((j3 & 16) != 0) {
                                                return m4326(1, Opcodes.IINC);
                                            }
                                            if ((j3 & 64) != 0) {
                                                return m4326(1, Opcodes.I2F);
                                            }
                                            if ((j3 & 256) != 0) {
                                                return m4326(1, Opcodes.L2I);
                                            }
                                        }
                                        return m4316(j, 0L, j2, 0L, j3, JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN);
                                    case '>':
                                        if ((j2 & FieldInfo.DISABLE_ARRAY_MAPPING) != 0) {
                                            this.f7516 = 122;
                                            this.f7515 = 1;
                                        } else if ((j3 & 262144) != 0) {
                                            return m4326(1, Opcodes.I2C);
                                        }
                                        return m4316(j, 0L, j2, FieldInfo.DISABLE_JSONB, j3, 81920L);
                                    case '?':
                                        if ((j3 & 2097152) != 0) {
                                            this.f7516 = Opcodes.FCMPL;
                                            this.f7515 = 1;
                                        }
                                        return m4316(j, 0L, j2, 0L, j3, JSONWriter.MASK_USE_SINGLE_QUOTES);
                                    default:
                                        switch (cM3436) {
                                            case 'e':
                                                return m4316(j, 571746048540672L, j2, 0L, j3, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN);
                                            case 'f':
                                                if ((j & 8589934592L) != 0) {
                                                    return m4324(1, 33, 42);
                                                }
                                                break;
                                            case 'g':
                                                return m4316(j, 0L, j2, 17213423616L, j3, 0L);
                                            case 'h':
                                                return m4316(j, -4394387336406499328L, j2, 0L, j3, 0L);
                                            case 'i':
                                                return m4316(j, 805306368L, j2, 0L, j3, 0L);
                                            default:
                                                switch (cM3436) {
                                                    case Opcodes.IDIV /* 108 */:
                                                        return m4316(j, 1090535424L, j2, 144115192505040896L, j3, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                                                    case Opcodes.LDIV /* 109 */:
                                                        return m4316(j, 51539607552L, j2, FieldInfo.DISABLE_SMART_MATCH, j3, 512L);
                                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                        return m4316(j, 1718020472832L, j2, 0L, j3, 0L);
                                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                        if ((j & JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY) != 0) {
                                                            this.f7516 = 22;
                                                            this.f7515 = 1;
                                                        }
                                                        return m4316(j, 3458766719296212992L, j2, 137438953472L, j3, 32L);
                                                    case 'p':
                                                        return m4316(j, 0L, j2, FieldInfo.DISABLE_UNSAFE, j3, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                                                    default:
                                                        switch (cM3436) {
                                                            case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                                                return m4316(j, 900931031706640384L, j2, 2882303761517117440L, j3, 163840L);
                                                            case 's':
                                                                if ((137438953472L & j) != 0) {
                                                                    return m4324(1, 37, 42);
                                                                }
                                                                if ((j & JSONWriter.MASK_UNQUOTE_FIELD_NAME) != 0) {
                                                                    return m4324(1, 38, 42);
                                                                }
                                                                break;
                                                            case Opcodes.INEG /* 116 */:
                                                                return m4316(j, 6755399441055744L, j2, 0L, j3, 0L);
                                                            case Opcodes.LNEG /* 117 */:
                                                                return m4316(j, 299067162755072L, j2, 0L, j3, 0L);
                                                            default:
                                                                switch (cM3436) {
                                                                    case Opcodes.DNEG /* 119 */:
                                                                        return m4316(j, FieldInfo.DISABLE_SMART_MATCH, j2, 0L, j3, 0L);
                                                                    case 'x':
                                                                        return m4316(j, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j2, 0L, j3, 128L);
                                                                    case 'y':
                                                                        return m4316(j, 18014398509514752L, j2, 0L, j3, 0L);
                                                                }
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else if ((j2 & 2199023255552L) != 0) {
                                return m4326(1, 105);
                            }
                        } else if ((j2 & JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME) != 0) {
                            return m4326(1, 104);
                        }
                    } else if ((j2 & JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL) != 0) {
                        return m4326(1, 100);
                    }
                } else {
                    if ((j3 & JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY) != 0) {
                        return m4326(1, Opcodes.FCMPG);
                    }
                    if ((j3 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) != 0) {
                        return m4326(1, Opcodes.IFEQ);
                    }
                }
            } else if ((j2 & JSONWriter.MASK_UNQUOTE_FIELD_NAME) != 0) {
                return m4326(1, 102);
            }
            return m4325(j, j2, j3, 0);
        } catch (IOException unused) {
            m4327(j, j2, j3, 0);
            return 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int m4316(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 0);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 != '.') {
                if (cM3436 == 'i') {
                    return m4317(j7, -8061372964249010176L, j8, 2885259248772579328L, j9, 163840L);
                }
                if (cM3436 == 'l') {
                    return m4317(j7, 2305860601533956096L, j8, 0L, j9, 0L);
                }
                if (cM3436 != 'w') {
                    if (cM3436 != 'y') {
                        if (cM3436 != '=') {
                            if (cM3436 == '>') {
                                if ((FieldInfo.DISABLE_JSONB & j8) != 0) {
                                    this.f7516 = Opcodes.IUSHR;
                                    this.f7515 = 2;
                                } else if ((JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN & j9) != 0) {
                                    return m4326(2, Opcodes.I2S);
                                }
                                return m4317(j7, 0L, j8, 0L, j9, JSONWriter.MASK_PRETTY_FORMAT);
                            }
                            if (cM3436 == 'e') {
                                return m4317(j7, 4611686018427396096L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                            }
                            if (cM3436 == 'f') {
                                return m4317(j7, 2097152L, j8, 0L, j9, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN);
                            }
                            switch (cM3436) {
                                case Opcodes.LADD /* 97 */:
                                    return m4317(j7, 38280596832927744L, j8, 0L, j9, 0L);
                                case 'b':
                                    return m4317(j7, FieldInfo.VALUE_MASK, j8, 0L, j9, 0L);
                                case 'c':
                                    return m4317(j7, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j8, 0L, j9, 0L);
                                default:
                                    switch (cM3436) {
                                        case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                            return m4317(j7, 18016598339616768L, j8, 549755813888L, j9, 8L);
                                        case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                            return m4317(j7, 1266638468943872L, j8, 45035996273704960L, j9, 2688L);
                                        case 'p':
                                            return m4317(j7, 51539607552L, j8, 0L, j9, 0L);
                                        default:
                                            switch (cM3436) {
                                                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                                    if ((2147483648L & j7) != 0) {
                                                        return m4324(2, 31, 42);
                                                    }
                                                    if ((137438953472L & j8) != 0) {
                                                        this.f7516 = 101;
                                                        this.f7515 = 2;
                                                    }
                                                    return m4317(j7, 220676381741154304L, j8, 0L, j9, 32L);
                                                case 's':
                                                    return m4317(j7, 68736321536L, j8, 0L, j9, 0L);
                                                case Opcodes.INEG /* 116 */:
                                                    if ((549755813888L & j7) != 0) {
                                                        this.f7516 = 39;
                                                        this.f7515 = 2;
                                                    } else if ((JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE & j8) != 0) {
                                                        this.f7516 = 89;
                                                        this.f7515 = 2;
                                                    } else if ((JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING & j8) != 0) {
                                                        this.f7516 = 91;
                                                        this.f7515 = 2;
                                                    }
                                                    return m4317(j7, 568451873800192L, j8, 21474836480L, j9, 0L);
                                                case Opcodes.LNEG /* 117 */:
                                                    return m4317(j7, 288230376193654784L, j8, 0L, j9, 0L);
                                            }
                                    }
                            }
                        }
                        if ((1024 & j9) != 0) {
                            return m4326(2, 138);
                        }
                        if ((JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & j9) != 0) {
                            return m4326(2, Opcodes.F2L);
                        }
                        if ((16384 & j9) != 0) {
                            return m4326(2, Opcodes.D2I);
                        }
                        if ((JSONWriter.MASK_USE_SINGLE_QUOTES & j9) != 0) {
                            return m4326(2, Opcodes.LCMP);
                        }
                    } else if ((FieldInfo.DISABLE_AUTO_TYPE & j7) != 0) {
                        return m4324(2, 59, 42);
                    }
                } else if ((8796093022208L & j7) != 0) {
                    return m4324(2, 43, 42);
                }
            } else if ((JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY & j9) != 0) {
                return m4326(2, Opcodes.IFNE);
            }
            return m4325(j7, j8, j9, 1);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 1);
            return 2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final int m4317(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 1);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 != '=') {
                if (cM3436 == '_') {
                    return m4318(j7, 0L, j8, 0L, j9, 32L);
                }
                if (cM3436 == 'i') {
                    return m4318(j7, 4507997673881600L, j8, 0L, j9, 0L);
                }
                switch (cM3436) {
                    case Opcodes.LADD /* 97 */:
                        return m4318(j7, 2305843011094847488L, j8, 0L, j9, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN);
                    case 'b':
                        return m4318(j7, JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY, j8, 0L, j9, 0L);
                    case 'c':
                        return m4318(j7, 18014398509613056L, j8, 0L, j9, 0L);
                    case 'd':
                        if ((FieldInfo.DISABLE_JSONB & j7) != 0) {
                            return m4324(3, 60, 42);
                        }
                        if ((549755813888L & j8) != 0) {
                            this.f7516 = 103;
                            this.f7515 = 3;
                        } else if ((FieldInfo.DISABLE_SMART_MATCH & j8) != 0) {
                            this.f7516 = Opcodes.LNEG;
                            this.f7515 = 3;
                        }
                        return m4318(j7, 0L, j8, 0L, j9, 520L);
                    case 'e':
                        if ((JSONWriter.MASK_IGNORE_ERROR_GETTER & j7) != 0) {
                            return m4324(3, 15, 42);
                        }
                        if ((JSONWriter.MASK_PRETTY_FORMAT & j7) != 0) {
                            return m4324(3, 16, 42);
                        }
                        if ((JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO & j7) != 0) {
                            return m4324(3, 24, 42);
                        }
                        return (FieldInfo.DISABLE_ARRAY_MAPPING & j7) != 0 ? m4324(3, 58, 42) : m4318(j7, 1099578736640L, j8, 21474836480L, j9, 0L);
                    case 'f':
                        return m4318(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                    case 'g':
                        return (2199023255552L & j7) != 0 ? m4324(3, 41, 42) : m4318(j7, 0L, j8, 2882303761517117440L, j9, 163840L);
                    default:
                        switch (cM3436) {
                            case 'k':
                                return m4318(j7, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j8, 0L, j9, 0L);
                            case Opcodes.IDIV /* 108 */:
                                return (17592186044416L & j7) != 0 ? m4324(3, 44, 42) : m4318(j7, -9223090544698191872L, j8, 0L, j9, 0L);
                            case Opcodes.LDIV /* 109 */:
                                if ((JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE & j7) != 0) {
                                    return m4324(3, 25, 42);
                                }
                                break;
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                return (FieldInfo.RECORD & j7) != 0 ? m4324(3, 62, 42) : m4318(j7, FieldInfo.DISABLE_UNSAFE, j8, 0L, j9, 0L);
                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                return (JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & j7) != 0 ? m4324(3, 32, 42) : m4318(j7, 216172816473522176L, j8, 0L, j9, 0L);
                            default:
                                switch (cM3436) {
                                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                        return (262144 & j7) != 0 ? m4324(3, 18, 42) : m4318(j7, FieldInfo.RAW_VALUE_MASK, j8, 0L, j9, 128L);
                                    case 's':
                                        return m4318(j7, 134758400L, j8, 0L, j9, 0L);
                                    case Opcodes.INEG /* 116 */:
                                        return m4318(j7, 11399805277308928L, j8, 2955487255461888L, j9, 0L);
                                    case Opcodes.LNEG /* 117 */:
                                        return m4318(j7, FieldInfo.UNWRAPPED_MASK, j8, 0L, j9, 0L);
                                    case Opcodes.FNEG /* 118 */:
                                        return m4318(j7, 70368744177664L, j8, 0L, j9, 0L);
                                    case Opcodes.DNEG /* 119 */:
                                        if ((FieldInfo.DISABLE_UNSAFE & j8) != 0) {
                                            this.f7516 = Opcodes.DNEG;
                                            this.f7515 = 3;
                                        }
                                        return m4318(j7, 0L, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                                }
                        }
                        break;
                }
            } else if ((j9 & JSONWriter.MASK_PRETTY_FORMAT) != 0) {
                return m4326(3, 144);
            }
            return m4325(j7, j8, j9, 2);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 2);
            return 3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int m4318(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 2);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            switch (cM3436) {
                case Opcodes.SWAP /* 95 */:
                    return m4319(j7, 0L, j8, 0L, j9, 2696L);
                case Opcodes.LADD /* 97 */:
                    return m4319(j7, 105621835743232L, j8, 0L, j9, 32L);
                case 'c':
                    return m4319(j7, 13510798882111488L, j8, 0L, j9, 0L);
                case 'e':
                    if ((JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING & j7) != 0) {
                        return m4324(4, 27, 42);
                    }
                    return (Long.MIN_VALUE & j7) != 0 ? m4324(4, 63, 42) : m4319(j7, 140754668228608L, j8, 0L, j9, 0L);
                case 'h':
                    return (JSONWriter.MASK_REFERENCE_DETECTION & j7) != 0 ? m4324(4, 17, 42) : m4319(j7, FieldInfo.JIT, j8, 2882303761517117440L, j9, 163840L);
                case 'i':
                    return m4319(j7, 2533274791444480L, j8, 0L, j9, 0L);
                case 'k':
                    if ((JSONWriter.MASK_WRITE_ENUMS_USING_NAME & j7) != 0) {
                        return m4324(4, 13, 42);
                    }
                    break;
                case Opcodes.IDIV /* 108 */:
                    if ((JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN & j7) != 0) {
                        this.f7516 = 28;
                        this.f7515 = 4;
                    }
                    return m4319(j7, 545259520L, j8, 0L, j9, 0L);
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    return m4319(j7, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j8, 0L, j9, 0L);
                case 'q':
                    if ((JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & j8) != 0) {
                        return m4326(4, 96);
                    }
                    if ((JSONWriter.MASK_WRITE_LONG_AS_STRING & j8) != 0) {
                        return m4326(4, 98);
                    }
                    break;
                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    return m4319(j7, 564083824789504L, j8, 0L, j9, 0L);
                case 's':
                    return (16384 & j7) != 0 ? m4324(4, 14, 42) : m4319(j7, FieldInfo.DISABLE_UNSAFE, j8, 0L, j9, 0L);
                case Opcodes.INEG /* 116 */:
                    if ((JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN & j7) != 0) {
                        return m4324(4, 19, 42);
                    }
                    if ((JSONWriter.MASK_ESCAPE_NONE_ASCII & j7) != 0) {
                        return m4324(4, 30, 42);
                    }
                    return (FieldInfo.RAW_VALUE_MASK & j7) != 0 ? m4324(4, 50, 42) : m4319(j7, FieldInfo.BACKR_REFERENCE, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                case Opcodes.LNEG /* 117 */:
                    return m4319(j7, 2097152L, j8, 0L, j9, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN);
                case Opcodes.FNEG /* 118 */:
                    return m4319(j7, 4398046511104L, j8, 0L, j9, 0L);
                case Opcodes.DNEG /* 119 */:
                    if ((FieldInfo.READ_ONLY & j7) != 0) {
                        this.f7516 = 56;
                        this.f7515 = 4;
                    }
                    return m4319(j7, FieldInfo.DISABLE_REFERENCE_DETECT, j8, 2955487255461888L, j9, 0L);
            }
            return m4325(j7, j8, j9, 3);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 3);
            return 4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int m4319(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 3);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            switch (cM3436) {
                case Opcodes.SWAP /* 95 */:
                    return m4320(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                case Opcodes.LADD /* 97 */:
                    return m4320(j7, 6144L, j8, 0L, j9, 2696L);
                case 'c':
                    if ((FieldInfo.VALUE_MASK & j7) != 0) {
                        return m4324(5, 48, 42);
                    }
                    return (FieldInfo.READ_USING_MASK & j7) != 0 ? m4324(5, 51, 42) : m4320(j7, 140737488355328L, j8, 0L, j9, 0L);
                case 'd':
                    return m4320(j7, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j8, 0L, j9, 0L);
                case 'e':
                    if ((JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY & j7) != 0) {
                        return m4324(5, 23, 42);
                    }
                    if ((4398046511104L & j7) != 0) {
                        return m4324(5, 42, 42);
                    }
                    break;
                case 'f':
                    return m4320(j7, JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME, j8, 0L, j9, 0L);
                case 'g':
                    return m4320(j7, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j8, 0L, j9, 0L);
                case 'h':
                    if ((FieldInfo.DISABLE_SMART_MATCH & j7) != 0) {
                        return m4324(5, 53, 42);
                    }
                    break;
                case 'i':
                    return m4320(j7, 2341871806232657920L, j8, 2955487255461888L, j9, 0L);
                case Opcodes.IDIV /* 108 */:
                    return m4320(j7, 538968064L, j8, 0L, j9, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN);
                case Opcodes.LDIV /* 109 */:
                    return m4320(j7, JSONWriter.MASK_WRITE_LONG_AS_STRING, j8, 0L, j9, 0L);
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    return (FieldInfo.UNWRAPPED_MASK & j7) != 0 ? m4324(5, 49, 42) : m4320(j7, 68720525312L, j8, 0L, j9, 0L);
                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    return m4320(j7, FieldInfo.JIT, j8, 0L, j9, 0L);
                case 's':
                    return (FieldInfo.DISABLE_REFERENCE_DETECT & j7) != 0 ? m4324(5, 57, 42) : m4320(j7, 0L, j8, 0L, j9, 32L);
                case Opcodes.INEG /* 116 */:
                    return (JSONWriter.MASK_BROWSER_SECURE & j7) != 0 ? m4324(5, 35, 42) : m4320(j7, 4573968371548160L, j8, 2882303761517117440L, j9, 163840L);
            }
            return m4325(j7, j8, j9, 4);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 4);
            return 5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int m4320(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 4);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == '_') {
                return m4321(j7, 0L, j8, 2882303761517117440L, j9, 163840L);
            }
            if (cM3436 == 'a') {
                return m4321(j7, JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME, j8, 0L, j9, 0L);
            }
            if (cM3436 == 'c') {
                return m4321(j7, 68719478784L, j8, 0L, j9, 0L);
            }
            if (cM3436 == 'l') {
                return m4321(j7, FieldInfo.BACKR_REFERENCE, j8, 0L, j9, 0L);
            }
            if (cM3436 != 'y') {
                if (cM3436 == 'e') {
                    if ((JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING & j7) != 0) {
                        return m4324(6, 45, 42);
                    }
                    return (70368744177664L & j7) != 0 ? m4324(6, 46, 42) : m4321(j7, 36028814198833152L, j8, 0L, j9, 0L);
                }
                if (cM3436 == 'f') {
                    return m4321(j7, FieldInfo.FIELD_MASK, j8, 0L, j9, 0L);
                }
                if (cM3436 != 'n') {
                    if (cM3436 == 'o') {
                        return m4321(j7, FieldInfo.JIT, j8, 0L, j9, 0L);
                    }
                    switch (cM3436) {
                        case 's':
                            return (JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY & j7) != 0 ? m4324(6, 26, 42) : m4321(j7, 0L, j8, 147070675331317760L, j9, 10920L);
                        case Opcodes.INEG /* 116 */:
                            if ((2097152 & j7) != 0) {
                                this.f7516 = 21;
                                this.f7515 = 6;
                            }
                            return m4321(j7, 140737488355328L, j8, 0L, j9, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN);
                        case Opcodes.LNEG /* 117 */:
                            return m4321(j7, JSONWriter.MASK_USE_SINGLE_QUOTES, j8, 0L, j9, 0L);
                    }
                }
                if ((JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & j7) != 0) {
                    return m4324(6, 12, 42);
                }
            } else if ((536870912 & j7) != 0) {
                return m4324(6, 29, 42);
            }
            return m4325(j7, j8, j9, 5);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 5);
            return 6;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int m4321(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 5);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 != ':') {
                if (cM3436 == 'c') {
                    return m4322(j7, JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME, j8, 0L, j9, 0L);
                }
                if (cM3436 == 'e') {
                    if ((JSONWriter.MASK_USE_SINGLE_QUOTES & j7) != 0) {
                        return m4324(7, 20, 42);
                    }
                    return (FieldInfo.BACKR_REFERENCE & j7) != 0 ? m4324(7, 61, 42) : m4322(j7, 140806207832064L, j8, 2955487255461888L, j9, 0L);
                }
                if (cM3436 == 'n') {
                    return m4322(j7, 54043212708315136L, j8, 0L, j9, 0L);
                }
                if (cM3436 != 'p') {
                    if (cM3436 == 'h') {
                        return m4322(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                    }
                    if (cM3436 == 'i') {
                        return m4322(j7, 0L, j8, 0L, j9, 32L);
                    }
                    switch (cM3436) {
                        case 's':
                            return m4322(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, 35464L);
                        case Opcodes.INEG /* 116 */:
                            if ((JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME & j7) != 0) {
                                return m4324(7, 11, 42);
                            }
                            break;
                        case Opcodes.LNEG /* 117 */:
                            return m4322(j7, 0L, j8, FieldInfo.BACKR_REFERENCE, j9, JSONWriter.MASK_REFERENCE_DETECTION);
                    }
                } else if ((FieldInfo.FIELD_MASK & j7) != 0) {
                    return m4324(7, 52, 42);
                }
            } else if ((JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN & j9) != 0) {
                return m4326(7, Opcodes.IFGE);
            }
            return m4325(j7, j8, j9, 6);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 6);
            return 7;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final int m4322(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 6);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == '_') {
                return m4323(j7, 0L, j8, 2955487255461888L, j9, 0L);
            }
            if (cM3436 == 't') {
                return (FieldInfo.DISABLE_UNSAFE & j7) != 0 ? m4324(8, 55, 42) : m4323(j7, JSONWriter.MASK_WRITE_LONG_AS_STRING, j8, 0L, j9, 0L);
            }
            if (cM3436 != 'd') {
                if (cM3436 != 'e') {
                    if (cM3436 == 'n') {
                        return m4323(j7, 0L, j8, FieldInfo.BACKR_REFERENCE, j9, JSONWriter.MASK_REFERENCE_DETECTION);
                    }
                    if (cM3436 == 'o') {
                        return m4323(j7, JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL, j8, 0L, j9, 0L);
                    }
                    switch (cM3436) {
                        case 'g':
                            return m4323(j7, 0L, j8, 0L, j9, 32L);
                        case 'h':
                            return m4323(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
                        case 'i':
                            return m4323(j7, FieldInfo.JIT, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, 10888L);
                    }
                }
                if ((JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME & j7) != 0) {
                    return m4324(8, 40, 42);
                }
            } else if ((140737488355328L & j7) != 0) {
                return m4324(8, 47, 42);
            }
            return m4325(j7, j8, j9, 7);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 7);
            return 8;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final int m4323(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4325(j, j3, j5, 7);
        }
        try {
            char cM3436 = this.f7517.m3436();
            this.f7520 = cM3436;
            if (cM3436 == 'a') {
                return m4306(j7, 0L, j8, 140737488355328L, j9, 0L);
            }
            if (cM3436 == 'i') {
                return m4306(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3436 == 's') {
                return (JSONWriter.MASK_WRITE_LONG_AS_STRING & j7) != 0 ? m4324(9, 34, 42) : m4306(j7, 0L, j8, FieldInfo.BACKR_REFERENCE, j9, JSONWriter.MASK_REFERENCE_DETECTION);
            }
            if (cM3436 == 'x') {
                return m4306(j7, 0L, j8, FieldInfo.READ_USING_MASK, j9, 0L);
            }
            if (cM3436 == 'z') {
                return m4306(j7, FieldInfo.JIT, j8, 0L, j9, 0L);
            }
            if (cM3436 == 'f') {
                return (JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL & j7) != 0 ? m4324(9, 36, 42) : m4306(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3436 == 'g') {
                return m4306(j7, 0L, j8, 0L, j9, 2696L);
            }
            if (cM3436 != 'n') {
                if (cM3436 == 'o') {
                    return m4306(j7, 0L, j8, FieldInfo.UNWRAPPED_MASK, j9, 0L);
                }
            } else if ((32 & j9) != 0) {
                return m4326(9, Opcodes.I2L);
            }
            return m4325(j7, j8, j9, 8);
        } catch (IOException unused) {
            m4327(j7, j8, j9, 8);
            return 9;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final int m4324(int i, int i2, int i3) {
        this.f7516 = i2;
        this.f7515 = i;
        try {
            this.f7520 = this.f7517.m3436();
            return m4305(i3, i + 1);
        } catch (IOException unused) {
            return i + 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int m4325(long j, long j2, long j3, int i) {
        return m4305(m4327(j, j2, j3, i), i + 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final int m4326(int i, int i2) {
        this.f7516 = i2;
        this.f7515 = i;
        return i + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final int m4327(long j, long j2, long j3, int i) {
        switch (i) {
            case 0:
                if ((72057596252520448L & j2) == 0 && (528384 & j3) == 0) {
                    if ((JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY & j2) != 0 || (JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY & j3) != 0) {
                        return 18;
                    }
                    if ((j2 & JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING) != 0 || (2 & j3) != 0) {
                        return 64;
                    }
                    if (((-2048) & j) == 0 && (j3 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) == 0) {
                        return (j & 62) != 0 ? 0 : -1;
                    }
                    this.f7516 = 75;
                    return 42;
                }
                return 75;
            case 1:
                if ((j2 & FieldInfo.READ_ONLY) == 0 && (JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & j3) == 0) {
                    if ((420919377920L & j) == 0) {
                        if ((j & (-420919379968L)) == 0 && (j3 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) == 0) {
                            return -1;
                        }
                        if (this.f7515 != 1) {
                            this.f7516 = 75;
                            this.f7515 = 1;
                        }
                    }
                }
                return 75;
            case 2:
                if (((-576471620722362368L) & j) == 0 && (j3 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) == 0) {
                    if ((j & 576471199811371008L) == 0) {
                        return -1;
                    }
                } else if (this.f7515 != 2) {
                    this.f7516 = 75;
                    this.f7515 = 2;
                    return 42;
                }
            case 3:
                if ((6052857694740905984L & j) == 0) {
                    if ((j & (-6629328215951640576L)) == 0 && (j3 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) == 0) {
                        return -1;
                    }
                    if (this.f7515 != 3) {
                        this.f7516 = 75;
                        this.f7515 = 3;
                        return 42;
                    }
                }
            case 4:
                if (((-9006073352820203520L) & j) == 0) {
                    if ((j & 2376745136868562944L) == 0 && (j3 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) == 0) {
                        return -1;
                    }
                    if (this.f7515 != 4) {
                        this.f7516 = 75;
                        this.f7515 = 4;
                        return 42;
                    }
                }
            case 5:
                if ((156223044489052160L & j) == 0) {
                    if ((j & 2364637280992237568L) == 0 && (j3 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) == 0) {
                        return -1;
                    }
                    this.f7516 = 75;
                    this.f7515 = 5;
                    return 42;
                }
            case 6:
                if ((2364531727269890048L & j) != 0) {
                    if (this.f7515 != 6) {
                        this.f7516 = 75;
                        this.f7515 = 6;
                        return 42;
                    }
                } else if ((j & 105553722347520L) == 0 && (j3 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) == 0) {
                    return -1;
                }
            case 7:
                if ((2310346608842115072L & j) == 0) {
                    if ((j & 54185118427774976L) == 0) {
                        return -1;
                    }
                    this.f7516 = 75;
                    this.f7515 = 7;
                    return 42;
                }
            case 8:
                if ((36170634018947072L & j) == 0) {
                    if ((j & 18014484408827904L) == 0) {
                        return -1;
                    }
                    this.f7516 = 75;
                    this.f7515 = 8;
                    return 42;
                }
            case 9:
                if ((85899345920L & j) == 0) {
                    if ((j & FieldInfo.JIT) == 0) {
                        return -1;
                    }
                    this.f7516 = 75;
                    this.f7515 = 9;
                    return 42;
                }
            case 10:
                if ((j & FieldInfo.JIT) == 0) {
                    return -1;
                }
                if (this.f7515 != 10) {
                    this.f7516 = 75;
                    this.f7515 = 10;
                    return 42;
                }
            case 11:
                return (j & FieldInfo.JIT) != 0 ? 42 : -1;
            default:
                return -1;
        }
    }
}
