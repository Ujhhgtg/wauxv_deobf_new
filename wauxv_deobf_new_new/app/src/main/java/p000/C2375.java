package p000;

import bsh.Token;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲇᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2375 implements InterfaceC2374 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final long[] f7614 = {0, 0, -1, -1};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final long[] f7615 = {-2, -1, -1, -1};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final long[] f7616 = {2301339413881290750L, -16384, 4294967295L, 432345564227567616L};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final long[] f7617 = {0, 0, 0, -36028797027352577L};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final long[] f7618 = {0, -1, -1, -1};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final long[] f7619 = {-1, -1, WebSocketProtocol.PAYLOAD_SHORT_MAX, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final long[] f7620 = {-1, -1, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final long[] f7621 = {70368744177663L, 0, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final String[] f7622 = {"", null, null, null, null, null, null, null, null, null, null, "abstract", "boolean", "break", "class", "byte", "case", "catch", "char", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "switch", "synchronized", "transient", "throw", "throws", "true", "try", "void", "volatile", "when", "while", null, null, null, null, null, null, null, null, null, null, null, null, null, null, "(", ")", "{", "}", "[", "]", ";", ",", ".", "=", ">", "@gt", "<", "@lt", "!", "~", "==", "<=", "@lteq", ">=", "@gteq", "!=", "||", "@or", "&&", "@and", "++", "--", "+", "-", "*", "/", "&", "@bitwise_and", "|", "@bitwise_or", "^", "@bitwise_xor", "%", "@mod", "**", "@pow", "<<", "@left_shift", ">>", "@right_shift", ">>>", "@right_unsigned_shift", "+=", "-=", "*=", "/=", "&=", "@and_assign", "|=", "@or_assign", "^=", "@xor_assign", "%=", "@mod_assign", "**=", "@pow_assign", "<<=", "@left_shift_assign", ">>=", "@right_shift_assign", ">>>=", "@right_unsigned_shift_assign", "->", "<=>", "??=", "??", "?:", "?", ":", "::", "...", "?.", "default:"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final int[] f7623 = {2, 4, 6, 7, 44, 45, 50, 51, 55, 56, 59, 60, 69, 74, 24, 25, 27, 62, 64, 67, 16, 29, 30, 32, 70, 71, 73, 9, 10, 12, 18, 19, 22, 34, 35, 38, 46, 47, 22, 65, 66, 16, 76, 77, 79, 20, 21, 48, 49, 53, 54, 57, 58};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final long[] f7624 = {9223372036854773761L, -3128, 134217727};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final long[] f7625 = {1792, 0, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f7626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f7627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f7629;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1715 f7630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int[] f7631 = new int[80];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int[] f7632 = new int[Opcodes.IF_ICMPNE];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f7633;

    public C2375(C1715 c1715) {
        this.f7630 = c1715;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final boolean m4311(int i, int i2, int i3, long j, long j2) {
        if (i != 0) {
            return (f7615[i2] & j) != 0;
        }
        return (f7614[i3] & j2) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean m4312(int i, int i2, int i3, long j, long j2) {
        if (i == 0) {
            return (f7617[i3] & j2) != 0;
        }
        if (i == 51) {
            return (f7620[i3] & j2) != 0;
        }
        if (i == 61) {
            return (f7621[i3] & j2) != 0;
        }
        if (i == 48) {
            return (f7618[i3] & j2) != 0;
        }
        if (i != 49) {
            return (f7616[i2] & j) != 0;
        }
        return (f7619[i3] & j2) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Token m4313() {
        char cM3604;
        int iM4338;
        String str;
        String strM3599 = null;
        Token token = null;
        while (true) {
            int i = 0;
            try {
                C1715 c1715 = this.f7630;
                int i2 = c1715.f5817;
                if (i2 > 0) {
                    c1715.f5817 = i2 - 1;
                    int i3 = c1715.f5814 + 1;
                    c1715.f5814 = i3;
                    if (i3 == c1715.f5813) {
                        c1715.f5814 = 0;
                    }
                    int i4 = c1715.f5814;
                    c1715.f5816 = i4;
                    cM3604 = c1715.f5812[i4];
                } else {
                    c1715.f5816 = 0;
                    c1715.f5814 = -1;
                    cM3604 = c1715.m3604();
                }
                this.f7633 = cM3604;
                this.f7629 = Integer.MAX_VALUE;
                this.f7628 = 0;
                if (cM3604 == '\t') {
                    iM4338 = m4338(0, 2, 0);
                } else if (cM3604 == '\n') {
                    iM4338 = m4338(0, 5, 0);
                } else if (cM3604 == '\f') {
                    iM4338 = m4338(0, 4, 0);
                } else if (cM3604 == '\r') {
                    iM4338 = m4338(0, 3, 0);
                } else if (cM3604 == ' ') {
                    iM4338 = m4338(0, 1, 0);
                } else if (cM3604 == '!') {
                    this.f7629 = 90;
                    iM4338 = m4329(0L, 8589934592L, 0L);
                } else if (cM3604 == '%') {
                    this.f7629 = UMErrorCode.E_UM_BE_FILE_OVERSIZE;
                    iM4338 = m4329(0L, 0L, 64L);
                } else if (cM3604 == '&') {
                    this.f7629 = Opcodes.IDIV;
                    iM4338 = m4329(0L, JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL, 1L);
                } else if (cM3604 == ']') {
                    iM4338 = m4340(0, 81);
                } else if (cM3604 == '^') {
                    this.f7629 = 112;
                    iM4338 = m4329(0L, 0L, 16L);
                } else if (cM3604 == 'v') {
                    iM4338 = m4329(864691128455135232L, 0L, 0L);
                } else if (cM3604 == 'w') {
                    iM4338 = m4329(3458764513820540928L, 0L, 0L);
                } else if (cM3604 == '[') {
                    iM4338 = m4340(0, 80);
                } else if (cM3604 == 'i') {
                    iM4338 = m4329(541165879296L, 0L, 0L);
                } else if (cM3604 == 'l') {
                    iM4338 = m4329(549755813888L, 0L, 0L);
                } else if (cM3604 == 'n') {
                    iM4338 = m4329(7696581394432L, 0L, 0L);
                } else if (cM3604 != 'p') {
                    switch (cM3604) {
                        case '(':
                            iM4338 = m4340(0, 76);
                            break;
                        case ')':
                            iM4338 = m4340(0, 77);
                            break;
                        case '*':
                            this.f7629 = 106;
                            iM4338 = m4329(0L, 4616189618054758400L, 256L);
                            break;
                        case '+':
                            this.f7629 = 104;
                            iM4338 = m4329(0L, 1152921779484753920L, 0L);
                            break;
                        case ',':
                            iM4338 = m4340(0, 83);
                            break;
                        case '-':
                            this.f7629 = 105;
                            iM4338 = m4329(0L, 2305843558969507840L, JSONWriter.MASK_PRETTY_FORMAT);
                            break;
                        case Opcodes.IALOAD /* 46 */:
                            this.f7629 = 84;
                            iM4338 = m4329(0L, 0L, JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO);
                            break;
                        case '/':
                            this.f7629 = 107;
                            iM4338 = m4329(0L, Long.MIN_VALUE, 0L);
                            break;
                        default:
                            switch (cM3604) {
                                case Opcodes.LSHR /* 123 */:
                                    iM4338 = m4340(0, 78);
                                    break;
                                case Opcodes.IUSHR /* 124 */:
                                    this.f7629 = UMErrorCode.E_UM_BE_JSON_FAILED;
                                    iM4338 = m4329(0L, JSONWriter.MASK_WRITE_LONG_AS_STRING, 4L);
                                    break;
                                case Opcodes.LUSHR /* 125 */:
                                    iM4338 = m4340(0, 79);
                                    break;
                                case '~':
                                    iM4338 = m4340(0, 91);
                                    break;
                                default:
                                    switch (cM3604) {
                                        case Opcodes.ASTORE /* 58 */:
                                            this.f7629 = Opcodes.FCMPG;
                                            iM4338 = m4329(0L, 0L, JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY);
                                            break;
                                        case ';':
                                            iM4338 = m4340(0, 82);
                                            break;
                                        case '<':
                                            this.f7629 = 88;
                                            iM4338 = m4329(0L, 18014399046352896L, 132096L);
                                            break;
                                        case '=':
                                            this.f7629 = 85;
                                            iM4338 = m4329(0L, JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN, 0L);
                                            break;
                                        case '>':
                                            this.f7629 = 86;
                                            iM4338 = m4329(0L, 360287972337123328L, 20480L);
                                            break;
                                        case '?':
                                            this.f7629 = Opcodes.FCMPL;
                                            iM4338 = m4329(0L, 0L, 35389440L);
                                            break;
                                        case '@':
                                            iM4338 = m4329(0L, 768602785489879040L, 43690L);
                                            break;
                                        default:
                                            switch (cM3604) {
                                                case Opcodes.LADD /* 97 */:
                                                    iM4338 = m4329(JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME, 0L, 0L);
                                                    break;
                                                case 'b':
                                                    iM4338 = m4329(45056L, 0L, 0L);
                                                    break;
                                                case 'c':
                                                    iM4338 = m4329(2048000L, 0L, 0L);
                                                    break;
                                                case 'd':
                                                    iM4338 = m4329(14680064L, 0L, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                                                    break;
                                                case 'e':
                                                    iM4338 = m4329(117440512L, 0L, 0L);
                                                    break;
                                                case 'f':
                                                    iM4338 = m4329(4160749568L, 0L, 0L);
                                                    break;
                                                case 'g':
                                                    iM4338 = m4329(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER, 0L, 0L);
                                                    break;
                                                default:
                                                    switch (cM3604) {
                                                        case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                                            iM4338 = m4329(140737488355328L, 0L, 0L);
                                                            break;
                                                        case 's':
                                                            iM4338 = m4329(8725724278030336L, 0L, 0L);
                                                            break;
                                                        case Opcodes.INEG /* 116 */:
                                                            iM4338 = m4329(279223176896970752L, 0L, 0L);
                                                            break;
                                                        default:
                                                            iM4338 = m4319(1, 0);
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
                    iM4338 = m4329(131941395333120L, 0L, 0L);
                }
                if (this.f7629 == Integer.MAX_VALUE) {
                    C1715 c1716 = this.f7630;
                    int[] iArr = c1716.f5819;
                    int i5 = c1716.f5814;
                    int i6 = iArr[i5];
                    int i7 = c1716.f5820[i5];
                    try {
                        c1716.m3604();
                        this.f7630.m3597(1);
                    } catch (IOException unused) {
                        strM3599 = iM4338 <= 1 ? "" : this.f7630.m3599();
                        int i8 = this.f7633;
                        if (i8 == 10 || i8 == 13) {
                            i6++;
                        } else {
                            i = i7 + 1;
                        }
                        i7 = i;
                        i = 1;
                    }
                    if (i == 0) {
                        this.f7630.m3597(1);
                        strM3599 = iM4338 > 1 ? this.f7630.m3599() : "";
                    }
                    int i9 = this.f7633;
                    char c = (char) i9;
                    StringBuilder sb = new StringBuilder("Lexical error at line ");
                    sb.append(i6);
                    sb.append(", column ");
                    sb.append(i7);
                    sb.append(".  Encountered: ");
                    if (i != 0) {
                        str = "<EOF> ";
                    } else {
                        str = "\"" + C3467.m4989(String.valueOf(c)) + "\" (" + i9 + "), ";
                    }
                    sb.append(str);
                    sb.append("after : \"");
                    sb.append(C3467.m4989(strM3599));
                    sb.append("\"");
                    throw new C3467(sb.toString());
                }
                int i10 = this.f7628;
                if (i10 + 1 < iM4338) {
                    this.f7630.m3597((iM4338 - i10) - 1);
                }
                int i11 = this.f7629;
                int i12 = i11 >> 6;
                long j = 1 << (i11 & 63);
                if ((f7624[i12] & j) != 0) {
                    Token tokenM4318 = m4318();
                    tokenM4318.specialToken = token;
                    return tokenM4318;
                }
                if ((f7625[i12] & j) != 0) {
                    Token tokenM4319 = m4318();
                    if (token != null) {
                        tokenM4319.specialToken = token;
                        token.next = tokenM4319;
                    }
                    token = tokenM4319;
                }
            } catch (Exception unused2) {
                this.f7629 = 0;
                this.f7628 = -1;
                Token tokenM43110 = m4318();
                tokenM43110.specialToken = token;
                return tokenM43110;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4314(int i, int i2) {
        while (true) {
            int i3 = this.f7626;
            this.f7626 = i3 + 1;
            this.f7632[i3] = f7623[i];
            int i4 = i + 1;
            if (i == i2) {
                return;
            } else {
                i = i4;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4315(int i) {
        int[] iArr = this.f7631;
        int i2 = iArr[i];
        int i3 = this.f7627;
        if (i2 != i3) {
            int i4 = this.f7626;
            this.f7626 = i4 + 1;
            this.f7632[i4] = i;
            iArr[i] = i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4316(int i, int i2) {
        while (true) {
            m4315(f7623[i]);
            int i3 = i + 1;
            if (i == i2) {
                return;
            } else {
                i = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4317(int i, int i2) {
        m4315(i);
        m4315(i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Token m4318() {
        String strM3599 = f7622[this.f7629];
        if (strM3599 == null) {
            strM3599 = this.f7630.m3599();
        }
        C1715 c1715 = this.f7630;
        int[] iArr = c1715.f5819;
        int i = c1715.f5816;
        int i2 = iArr[i];
        int[] iArr2 = c1715.f5820;
        int i3 = iArr2[i];
        int i4 = c1715.f5814;
        int i5 = iArr[i4];
        int i6 = iArr2[i4];
        Token tokenNewToken = Token.newToken(this.f7629);
        tokenNewToken.kind = this.f7629;
        tokenNewToken.image = strM3599;
        tokenNewToken.beginLine = i2;
        tokenNewToken.endLine = i5;
        tokenNewToken.beginColumn = i3;
        tokenNewToken.endColumn = i6;
        return tokenNewToken;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:371:0x05db A[PHI: r8
      0x05db: PHI (r8v18 int) = (r8v17 int), (r8v17 int), (r8v35 int), (r8v17 int), (r8v17 int) binds: [B:361:0x05ba, B:374:0x05e7, B:370:0x05d7, B:364:0x05c4, B:363:0x05be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[PHI: r4
      0x00fd: PHI (r4v182 int) = (r4v97 int), (r4v117 int), (r4v123 int), (r4v129 int), (r4v181 int), (r4v184 int) binds: [B:268:0x045f, B:219:0x0393, B:207:0x0359, B:196:0x032c, B:57:0x010a, B:53:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:559:0x0951  */
    /* JADX WARN: Code duplicated, block: B:568:0x0961 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x096e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int m4319(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 80;
        this.f7626 = 80;
        int[] iArr = this.f7632;
        iArr[0] = i;
        int i9 = 1;
        int i10 = Integer.MAX_VALUE;
        int i11 = i2;
        int i12 = 0;
        int i13 = 1;
        int i14 = Integer.MAX_VALUE;
        while (true) {
            int i15 = this.f7627 + i9;
            this.f7627 = i15;
            if (i15 == i10) {
                this.f7627 = -2147483647;
                int i16 = i8;
                while (true) {
                    int i17 = i16 - 1;
                    if (i16 > 0) {
                        this.f7631[i17] = Integer.MIN_VALUE;
                        i16 = i17;
                    }
                }
            }
            int i18 = this.f7633;
            int i19 = 78;
            int i20 = 33;
            int i21 = 76;
            if (i18 >= 64) {
                if (i18 < 128) {
                    long j = 1 << (i18 & 63);
                    do {
                        i13--;
                        switch (iArr[i13]) {
                            case 1:
                            case 42:
                                if ((j & 576460745995190270L) != 0) {
                                    if (i14 > 73) {
                                        i14 = 73;
                                    }
                                    m4315(42);
                                }
                                break;
                            case 2:
                            case 80:
                                if ((j & (-1152921504606846977L)) != 0) {
                                    m4316(0, 3);
                                }
                                break;
                            case 9:
                                m4314(27, 29);
                                break;
                            case 15:
                                if (this.f7633 == 95) {
                                    if (i14 > 62) {
                                        i14 = 62;
                                    }
                                    m4317(15, 16);
                                }
                                break;
                            case 16:
                                if ((j & 38441125539254784L) != 0 && i14 > 62) {
                                    i14 = 62;
                                }
                                break;
                            case 19:
                                if ((j & 137438953504L) != 0) {
                                    m4314(45, 46);
                                }
                                break;
                            case Opcodes.LLOAD /* 22 */:
                                if ((j & 36029140624736336L) != 0) {
                                    if (i14 > 67) {
                                        i14 = 67;
                                    }
                                }
                                break;
                            case Opcodes.DLOAD /* 24 */:
                                if ((j & (-268435457)) != 0) {
                                    m4316(14, 16);
                                }
                                break;
                            case Opcodes.ALOAD /* 25 */:
                                if (this.f7633 == 92) {
                                    int i22 = this.f7626;
                                    this.f7626 = i22 + 1;
                                    iArr[i22] = 26;
                                }
                                break;
                            case 26:
                                m4316(14, 16);
                                break;
                            case 29:
                                if ((j & (-268435457)) != 0) {
                                    m4316(21, 23);
                                }
                                break;
                            case 30:
                                if (this.f7633 == 92) {
                                    int i23 = this.f7626;
                                    this.f7626 = i23 + 1;
                                    iArr[i23] = 31;
                                }
                                break;
                            case 31:
                                m4316(21, 23);
                                break;
                            case 34:
                                m4314(33, 35);
                                break;
                            case 47:
                                if ((j & 137438953504L) != 0) {
                                    m4314(47, 48);
                                }
                                break;
                            case 52:
                                if ((j & 137438953504L) != 0) {
                                    m4314(49, 50);
                                }
                                break;
                            case Opcodes.FSTORE /* 56 */:
                                if ((j & 137438953504L) != 0) {
                                    m4314(51, 52);
                                }
                                break;
                            case 60:
                                if ((j & 343597383760L) != 0 && i14 > 67) {
                                    i14 = 67;
                                }
                                break;
                            case 62:
                                if ((j & 72057594054705152L) != 0) {
                                    m4315(63);
                                }
                                break;
                            case 63:
                                if ((j & 543313363070L) != 0) {
                                    if (i14 > 62) {
                                        i14 = 62;
                                    }
                                    m4317(63, 16);
                                }
                                break;
                            case 64:
                                if ((j & 17179869188L) != 0) {
                                    if (i14 > 62) {
                                        i14 = 62;
                                    }
                                    m4316(39, 41);
                                }
                                break;
                            case 65:
                                if (this.f7633 == 95) {
                                    if (i14 > 62) {
                                        i14 = 62;
                                    }
                                    m4316(39, 41);
                                }
                                break;
                            case 70:
                                int i24 = i14 > 8 ? 8 : i14;
                                m4314(24, 26);
                                i14 = i24;
                                break;
                            case 75:
                                m4317(75, 76);
                                break;
                            case 77:
                            case 78:
                                m4317(78, 76);
                                break;
                            default:
                                break;
                        }
                    } while (i13 != i12);
                } else {
                    int i25 = i18 >> 8;
                    int i26 = i18 >> 14;
                    long j2 = 1 << (i25 & 63);
                    int i27 = (i18 & 255) >> 6;
                    long j3 = 1 << (i18 & 63);
                    while (true) {
                        i13--;
                        int i28 = iArr[i13];
                        if (i28 != 0) {
                            i3 = 1;
                            if (i28 != 1) {
                                if (i28 == 2) {
                                    i4 = 80;
                                } else if (i28 == 9) {
                                    i4 = 80;
                                    if (m4311(i25, i26, i27, j2, j3)) {
                                        m4314(27, 29);
                                    }
                                } else if (i28 == 24 || i28 == 26) {
                                    i4 = 80;
                                    if (m4311(i25, i26, i27, j2, j3)) {
                                        m4316(14, 16);
                                    }
                                } else if (i28 == 29 || i28 == 31) {
                                    i4 = 80;
                                    if (m4311(i25, i26, i27, j2, j3)) {
                                        m4316(21, 23);
                                    }
                                } else if (i28 == 34) {
                                    i4 = 80;
                                    if (m4311(i25, i26, i27, j2, j3)) {
                                        m4314(33, 35);
                                    }
                                } else if (i28 == 70) {
                                    i4 = 80;
                                    if (m4311(i25, i26, i27, j2, j3)) {
                                        if (i14 > 8) {
                                            i14 = 8;
                                        }
                                        m4314(24, 26);
                                    }
                                } else if (i28 != 75) {
                                    i4 = 80;
                                    if (i28 != 80) {
                                        if (i28 != 41 && i28 != 42) {
                                            if (i28 != 77) {
                                                i6 = 78;
                                                if (i28 == 78) {
                                                }
                                            } else {
                                                i6 = 78;
                                            }
                                            if (m4311(i25, i26, i27, j2, j3)) {
                                                m4317(i6, i21);
                                            }
                                        } else if (m4312(i25, i26, i27, j2, j3)) {
                                            int i29 = i14 > 73 ? 73 : i14;
                                            m4315(42);
                                            i14 = i29;
                                        }
                                    }
                                } else {
                                    i4 = 80;
                                    if (m4311(i25, i26, i27, j2, j3)) {
                                        m4317(75, i21);
                                    }
                                }
                                if (m4311(i25, i26, i27, j2, j3)) {
                                    m4316(0, 3);
                                }
                            } else {
                                i4 = 80;
                                if (i25 == 0 && (f7614[i27] & j3) != 0) {
                                    if (i14 > 6) {
                                        i14 = 6;
                                    }
                                    m4315(0);
                                }
                                if (m4312(i25, i26, i27, j2, j3)) {
                                    if (i14 > 73) {
                                        i14 = 73;
                                    }
                                    m4315(42);
                                }
                            }
                        } else {
                            i3 = 1;
                            i4 = 80;
                            if (i25 == 0 && (f7614[i27] & j3) != 0) {
                                if (i14 > 6) {
                                    i14 = 6;
                                }
                                m4315(0);
                            }
                        }
                        if (i13 == i12) {
                            i5 = Integer.MAX_VALUE;
                        } else {
                            i21 = 76;
                        }
                    }
                }
                if (i14 != i5) {
                    this.f7629 = i14;
                    this.f7628 = i11;
                    i14 = i5;
                }
                i11++;
                i13 = this.f7626;
                this.f7626 = i12;
                i12 = 80 - i12;
                if (i13 == i12) {
                    try {
                        this.f7633 = this.f7630.m3604();
                        i9 = i3;
                        i10 = i5;
                        i8 = i4;
                    } catch (IOException unused) {
                    }
                }
                return i11;
            }
            long j4 = 1 << i18;
            while (true) {
                i13--;
                switch (iArr[i13]) {
                    case 0:
                        if ((j4 & 8589934591L) != 0) {
                            if (i14 > 6) {
                                i14 = 6;
                            }
                            m4315(0);
                        }
                        break;
                    case 1:
                        if ((j4 & 8589934591L) != 0) {
                            if (i14 > 6) {
                                i14 = 6;
                            }
                            m4315(0);
                        } else if ((j4 & 287948901175001088L) != 0) {
                            m4316(4, 11);
                        } else {
                            int i30 = this.f7633;
                            if (i30 == 47) {
                                m4314(12, 13);
                            } else if (i30 == 36) {
                                if (i14 > 73) {
                                    i14 = 73;
                                }
                                m4315(42);
                            } else if (i30 == 34) {
                                int i31 = this.f7626;
                                this.f7626 = i31 + 1;
                                iArr[i31] = 39;
                            } else if (i30 == 39) {
                                m4316(14, 16);
                            } else if (i30 == 46) {
                                m4315(18);
                            } else if (i30 == 35) {
                                int i32 = this.f7626;
                                this.f7626 = i32 + 1;
                                iArr[i32] = 8;
                            } else if (i30 == 60) {
                                m4316(0, 3);
                            }
                        }
                        if ((j4 & 287667426198290432L) == 0) {
                            int i33 = this.f7633;
                            if (i33 == 48) {
                                if (i14 > 62) {
                                    i14 = 62;
                                }
                                m4316(17, 20);
                            } else if (i33 == 34) {
                                m4316(21, 23);
                            }
                        } else {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4317(15, 16);
                        }
                        break;
                    case 2:
                        if ((j4 & (-7493990054822421505L)) != 0) {
                            m4316(0, 3);
                        }
                        break;
                    case 3:
                        if (this.f7633 == 32) {
                            m4316(0, 3);
                        }
                        break;
                    case 4:
                        if (this.f7633 == 38) {
                            int i34 = this.f7626;
                            this.f7626 = i34 + 1;
                            iArr[i34] = 3;
                        }
                        break;
                    case 5:
                        if (this.f7633 == 44) {
                            m4316(0, 3);
                        }
                        break;
                    case 6:
                        if (this.f7633 == 62) {
                            int i35 = this.f7626;
                            this.f7626 = i35 + 1;
                            iArr[i35] = 5;
                        }
                        break;
                    case 7:
                        if (this.f7633 == 62) {
                            if (i14 > 7) {
                                i14 = 7;
                            }
                            m4315(7);
                        }
                        break;
                    case 8:
                        if (this.f7633 == 33) {
                            m4316(27, 29);
                        }
                        break;
                    case 9:
                        if ((j4 & (-9217)) != 0) {
                            m4316(27, 29);
                        }
                        break;
                    case 10:
                        if ((j4 & 9216) != 0 && i14 > 9) {
                            i14 = 9;
                        }
                        break;
                    case 11:
                        if (this.f7633 == 10) {
                            i7 = 9;
                            if (i14 > 9) {
                                i14 = i7;
                            }
                        }
                        break;
                    case Opcodes.FCONST_1 /* 12 */:
                        if (this.f7633 == 13) {
                            int i36 = this.f7626;
                            this.f7626 = i36 + 1;
                            iArr[i36] = 11;
                        }
                        break;
                    case 13:
                        if (this.f7633 == 35) {
                            int i37 = this.f7626;
                            this.f7626 = i37 + 1;
                            iArr[i37] = 8;
                        }
                        break;
                    case Opcodes.DCONST_0 /* 14 */:
                        if ((j4 & 287667426198290432L) != 0) {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4317(15, 16);
                        }
                        break;
                    case 15:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4317(15, 16);
                        }
                        break;
                    case Opcodes.SIPUSH /* 17 */:
                        if (this.f7633 == 46) {
                            m4315(18);
                        }
                        break;
                    case Opcodes.LDC /* 18 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 67) {
                                i14 = 67;
                            }
                            m4316(30, 32);
                        }
                        break;
                    case 20:
                        if ((j4 & 43980465111040L) != 0) {
                            m4315(21);
                        }
                        break;
                    case Opcodes.ILOAD /* 21 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 67) {
                                i14 = 67;
                            }
                            m4317(21, 22);
                        }
                        break;
                    case Opcodes.FLOAD /* 23 */:
                        if (this.f7633 == 39) {
                            m4316(14, 16);
                        }
                        break;
                    case Opcodes.DLOAD /* 24 */:
                        if ((j4 & (-549755823105L)) != 0) {
                            m4316(14, 16);
                        }
                        break;
                    case 26:
                        m4316(14, 16);
                        break;
                    case 27:
                        if (this.f7633 == 39 && i14 > 70) {
                            i7 = 70;
                            i14 = i7;
                        }
                        break;
                    case 28:
                        if (this.f7633 == 34) {
                            m4316(21, 23);
                        }
                        break;
                    case 29:
                        if ((j4 & (-17179878401L)) != 0) {
                            m4316(21, 23);
                        }
                        break;
                    case 31:
                        m4316(21, 23);
                        break;
                    case 32:
                        if (this.f7633 == 34 && i14 > 71) {
                            i7 = 71;
                            i14 = i7;
                        }
                        break;
                    case 33:
                    case 35:
                        if (this.f7633 == 34) {
                            m4317(34, 38);
                        }
                        break;
                    case 34:
                        if ((j4 & (-17179869185L)) != 0) {
                            m4316(i20, 35);
                        }
                        break;
                    case 36:
                        if (this.f7633 == 34 && i14 > 72) {
                            i7 = 72;
                            i14 = i7;
                        }
                        break;
                    case 37:
                        if (this.f7633 == 34) {
                            int i38 = this.f7626;
                            this.f7626 = i38 + 1;
                            iArr[i38] = 36;
                        }
                        break;
                    case 38:
                        if (this.f7633 == 34) {
                            int i39 = this.f7626;
                            this.f7626 = i39 + 1;
                            iArr[i39] = 37;
                        }
                        break;
                    case 39:
                        if (this.f7633 == 34) {
                            int i40 = this.f7626;
                            this.f7626 = i40 + 1;
                            iArr[i40] = i20;
                        }
                        break;
                    case 40:
                        if (this.f7633 == 34) {
                            int i41 = this.f7626;
                            this.f7626 = i41 + 1;
                            iArr[i41] = 39;
                        }
                        break;
                    case 41:
                        if (this.f7633 == 36) {
                            if (i14 > 73) {
                                i14 = 73;
                            }
                            m4315(42);
                        }
                        break;
                    case 42:
                        if ((j4 & 287948969894477824L) != 0) {
                            int i42 = i14 > 73 ? 73 : i14;
                            m4315(42);
                            i14 = i42;
                        }
                        break;
                    case 43:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4316(4, 11);
                        }
                        break;
                    case 44:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4317(44, 45);
                        }
                        break;
                    case 45:
                        if (this.f7633 == 46) {
                            m4315(46);
                        }
                        break;
                    case Opcodes.IALOAD /* 46 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 67) {
                                i14 = 67;
                            }
                            m4316(36, 38);
                        }
                        break;
                    case 48:
                        if ((j4 & 43980465111040L) != 0) {
                            m4315(49);
                        }
                        break;
                    case 49:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 67) {
                                i14 = 67;
                            }
                            m4317(49, 22);
                        }
                        break;
                    case Opcodes.AALOAD /* 50 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4317(50, 51);
                        }
                        break;
                    case Opcodes.BALOAD /* 51 */:
                        if (this.f7633 == 46) {
                            int i43 = this.f7626;
                            this.f7626 = i43 + 1;
                            iArr[i43] = 52;
                        }
                        break;
                    case Opcodes.SALOAD /* 53 */:
                        if ((j4 & 43980465111040L) != 0) {
                            m4315(54);
                        }
                        break;
                    case Opcodes.ISTORE /* 54 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 67) {
                                i14 = 67;
                            }
                            m4317(54, 22);
                        }
                        break;
                    case Opcodes.LSTORE /* 55 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4317(55, 56);
                        }
                        break;
                    case Opcodes.DSTORE /* 57 */:
                        if ((j4 & 43980465111040L) != 0) {
                            m4315(58);
                        }
                        break;
                    case Opcodes.ASTORE /* 58 */:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 67) {
                                i14 = 67;
                            }
                            m4317(58, 22);
                        }
                        break;
                    case 59:
                        if ((j4 & 287948901175001088L) != 0) {
                            m4317(59, 60);
                        }
                        break;
                    case 61:
                        if (this.f7633 == 48) {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4316(17, 20);
                        }
                        break;
                    case 63:
                        if ((j4 & 287948901175001088L) != 0) {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4317(63, 16);
                        }
                        break;
                    case 65:
                        if ((j4 & 844424930131968L) != 0) {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4316(39, 41);
                        }
                        break;
                    case 66:
                        if ((j4 & 844424930131968L) != 0) {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4315(16);
                        }
                        break;
                    case 67:
                        if ((j4 & 71776119061217280L) != 0) {
                            if (i14 > 62) {
                                i14 = 62;
                            }
                            m4317(67, 16);
                        }
                        break;
                    case 68:
                        if (this.f7633 == 47) {
                            m4314(12, 13);
                        }
                        break;
                    case 69:
                        int i44 = this.f7633;
                        if (i44 == 42) {
                            m4317(75, 76);
                        } else if (i44 == 47) {
                            if (i14 > 8) {
                                i14 = 8;
                            }
                            m4316(24, 26);
                        }
                        break;
                    case 70:
                        if ((j4 & (-9217)) != 0) {
                            int i45 = i14 > 8 ? 8 : i14;
                            m4316(24, 26);
                            i14 = i45;
                        }
                        break;
                    case 71:
                        i7 = 8;
                        if ((j4 & 9216) != 0 && i14 > 8) {
                            i14 = i7;
                        }
                        break;
                    case 72:
                        if (this.f7633 == 10) {
                            i7 = 8;
                            if (i14 > 8) {
                                i14 = i7;
                            }
                        }
                        break;
                    case 73:
                        if (this.f7633 == 13) {
                            int i46 = this.f7626;
                            this.f7626 = i46 + 1;
                            iArr[i46] = 72;
                        }
                        break;
                    case 74:
                        if (this.f7633 == 42) {
                            m4317(75, 76);
                        }
                        break;
                    case 75:
                        if ((j4 & (-4398046511105L)) != 0) {
                            m4317(75, 76);
                        }
                        break;
                    case 76:
                        if (this.f7633 == 42) {
                            m4316(42, 44);
                        }
                        break;
                    case 77:
                        if ((j4 & (-145135534866433L)) != 0) {
                            m4317(i19, 76);
                        }
                        break;
                    case 78:
                        if ((j4 & (-4398046511105L)) != 0) {
                            m4317(i19, 76);
                        }
                        break;
                    case Opcodes.IASTORE /* 79 */:
                        if (this.f7633 == 47 && i14 > 10) {
                            i14 = 10;
                        }
                        break;
                    case 80:
                        if ((j4 & (-7493990054822421505L)) != 0) {
                            m4316(0, 3);
                        } else {
                            int i47 = this.f7633;
                            if (i47 == 62) {
                                if (i14 > 7) {
                                    i14 = 7;
                                }
                                m4315(7);
                            } else if (i47 == 38) {
                                int i48 = this.f7626;
                                this.f7626 = i48 + 1;
                                iArr[i48] = 3;
                            }
                        }
                        if (this.f7633 == 62) {
                            int i49 = this.f7626;
                            this.f7626 = i49 + 1;
                            iArr[i49] = 5;
                        }
                        break;
                }
                if (i13 != i12) {
                    i19 = 78;
                    i20 = 33;
                }
            }
            i5 = Integer.MAX_VALUE;
            i3 = 1;
            i4 = 80;
            if (i14 != i5) {
                this.f7629 = i14;
                this.f7628 = i11;
                i14 = i5;
            }
            i11++;
            i13 = this.f7626;
            this.f7626 = i12;
            i12 = 80 - i12;
            if (i13 == i12) {
                this.f7633 = this.f7630.m3604();
                i9 = i3;
                i10 = i5;
                i8 = i4;
            }
            return i11;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m4320(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 8);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == 'e') {
                return m4321(j7, FieldInfo.FIELD_MASK, j8, 0L, j9, 0L);
            }
            if (cM3604 == 'f') {
                return m4321(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3604 == 'i') {
                return m4321(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3604 != 'r') {
                if (cM3604 == 't') {
                    if ((FieldInfo.DISABLE_UNSAFE & j8) != 0) {
                        this.f7629 = Opcodes.DNEG;
                        this.f7628 = 10;
                    }
                    return m4321(j7, 0L, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                }
                if (cM3604 == 'n') {
                    if ((2 & j9) != 0) {
                        return m4340(10, Opcodes.LOR);
                    }
                    if ((32 & j9) != 0) {
                        return m4340(10, Opcodes.I2L);
                    }
                    if ((128 & j9) != 0) {
                        return m4340(10, Opcodes.I2D);
                    }
                    return (512 & j9) != 0 ? m4340(10, 137) : m4321(j7, 0L, j8, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j9, 0L);
                }
                if (cM3604 == 'o') {
                    return m4321(j7, 0L, j8, FieldInfo.UNWRAPPED_MASK, j9, 0L);
                }
            } else if ((140737488355328L & j8) != 0) {
                return m4340(10, UMErrorCode.E_UM_BE_CREATE_FAILED);
            }
            return m4339(j7, j8, j9, 9);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 9);
            return 10;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int m4321(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 9);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == '_') {
                return m4322(j7, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
            }
            if (cM3604 != 'd') {
                if (cM3604 == 'g') {
                    return m4322(j7, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
                }
                if (cM3604 != 'r') {
                    if (cM3604 == 't') {
                        if ((FieldInfo.DISABLE_REFERENCE_DETECT & j8) != 0) {
                            this.f7629 = 121;
                            this.f7628 = 11;
                        }
                        return m4322(j7, j8, 0L, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                    }
                } else if ((FieldInfo.UNWRAPPED_MASK & j8) != 0) {
                    return m4340(11, 113);
                }
            } else {
                if ((FieldInfo.FIELD_MASK & j7) != 0) {
                    return m4338(11, 52, 42);
                }
                if ((JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING & j8) != 0) {
                    return m4340(11, Opcodes.LDIV);
                }
            }
            return m4339(j7, j8, j9, 10);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 10);
            return 11;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int m4322(long j, long j2, long j3, long j4, long j5) {
        long j6 = j3 & j2;
        long j7 = j5 & j4;
        if ((j6 | j7) == 0) {
            return m4339(j, j2, j4, 10);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == '_') {
                return m4323(j6, 0L, j7, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3604 != 'a') {
                return cM3604 != 'n' ? m4339(0L, j6, j7, 11) : m4323(j6, FieldInfo.DISABLE_AUTO_TYPE, j7, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            return m4323(j6, 0L, j7, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
        } catch (IOException unused) {
            m4341(0L, j6, j7, 11);
            return 12;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m4323(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4339(0L, j, j3, 11);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == 'a') {
                return m4324(j5, 0L, j6, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3604 != 'e') {
                return cM3604 != 's' ? m4339(0L, j5, j6, 12) : m4324(j5, 0L, j6, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
            }
            return m4324(j5, FieldInfo.DISABLE_AUTO_TYPE, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
        } catch (IOException unused) {
            m4341(0L, j5, j6, 12);
            return 13;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int m4324(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4339(0L, j, j3, 12);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 != 'd') {
                return cM3604 != 's' ? m4339(0L, j5, j6, 13) : m4325(j5, 0L, j6, 10240L);
            }
            return m4325(j5, FieldInfo.DISABLE_AUTO_TYPE, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
        } catch (IOException unused) {
            m4341(0L, j5, j6, 13);
            return 14;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int m4325(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4339(0L, j, j3, 13);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == '_') {
                return m4326(j5, FieldInfo.DISABLE_AUTO_TYPE, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3604 != 'i') {
                return cM3604 != 's' ? m4339(0L, j5, j6, 14) : m4326(j5, 0L, j6, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            return m4326(j5, 0L, j6, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
        } catch (IOException unused) {
            m4341(0L, j5, j6, 14);
            return 15;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int m4326(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4339(0L, j, j3, 14);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == 'g') {
                return m4327(j5, 0L, j6, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
            }
            if (cM3604 != 'i') {
                return cM3604 != 's' ? m4339(0L, j5, j6, 15) : m4327(j5, FieldInfo.DISABLE_AUTO_TYPE, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            return m4327(j5, 0L, j6, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
        } catch (IOException unused) {
            m4341(0L, j5, j6, 15);
            return 16;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int m4327(long j, long j2, long j3, long j4) {
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4339(0L, j, j3, 15);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == 'g') {
                return m4328(j5, 0L, j6, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3604 != 'h') {
                return (cM3604 == 'n' && (JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME & j6) != 0) ? m4340(17, Opcodes.F2I) : m4339(0L, j5, j6, 16);
            }
            return m4328(j5, FieldInfo.DISABLE_AUTO_TYPE, j6, JSONWriter.MASK_IGNORE_ERROR_GETTER);
        } catch (IOException unused) {
            m4341(0L, j5, j6, 16);
            return 17;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int m4328(long j, long j2, long j3, long j4) {
        int i;
        long j5 = j2 & j;
        long j6 = j4 & j3;
        if ((j5 | j6) == 0) {
            return m4339(0L, j, j3, 16);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 != 'i') {
                return (cM3604 == 'n' && (JSONWriter.MASK_WRITE_ENUMS_USING_NAME & j6) != 0) ? m4340(18, 141) : m4339(0L, j5, j6, 17);
            }
            long j7 = FieldInfo.DISABLE_AUTO_TYPE & j5;
            long j8 = JSONWriter.MASK_IGNORE_ERROR_GETTER & j6;
            if ((j7 | j8) == 0) {
                return m4339(0L, j5, j6, 17);
            }
            try {
                char cM3605 = this.f7630.m3604();
                this.f7633 = cM3605;
                if (cM3605 != 'f') {
                    return m4339(0L, j7, j8, 18);
                }
                long j9 = j5 & FieldInfo.DISABLE_AUTO_TYPE;
                long j10 = j6 & JSONWriter.MASK_IGNORE_ERROR_GETTER;
                if ((j9 | j10) == 0) {
                    return m4339(0L, j7, j8, 18);
                }
                try {
                    char cM3606 = this.f7630.m3604();
                    this.f7633 = cM3606;
                    if (cM3606 != 't') {
                        return m4339(0L, j9, j10, 19);
                    }
                    if (j9 != 0) {
                        this.f7629 = Opcodes.LSHR;
                        this.f7628 = 20;
                    }
                    if (j10 == 0) {
                        return m4339(0L, j9, j10, 19);
                    }
                    try {
                        char cM3607 = this.f7630.m3604();
                        this.f7633 = cM3607;
                        if (cM3607 != '_') {
                            return m4339(0L, 0L, j10, 20);
                        }
                        if (j10 == 0) {
                            return m4339(0L, 0L, j10, 20);
                        }
                        try {
                            char cM3608 = this.f7630.m3604();
                            this.f7633 = cM3608;
                            if (cM3608 != 'a') {
                                return m4339(0L, 0L, j10, 21);
                            }
                            if (j10 == 0) {
                                return m4339(0L, 0L, j10, 21);
                            }
                            try {
                                char cM3609 = this.f7630.m3604();
                                this.f7633 = cM3609;
                                if (cM3609 != 's') {
                                    return m4339(0L, 0L, j10, 22);
                                }
                                if (j10 == 0) {
                                    return m4339(0L, 0L, j10, 22);
                                }
                                try {
                                    char cM36010 = this.f7630.m3604();
                                    this.f7633 = cM36010;
                                    if (cM36010 != 's') {
                                        return m4339(0L, 0L, j10, 23);
                                    }
                                    if (j10 == 0) {
                                        return m4339(0L, 0L, j10, 23);
                                    }
                                    try {
                                        char cM36011 = this.f7630.m3604();
                                        this.f7633 = cM36011;
                                        if (cM36011 != 'i') {
                                            return m4339(0L, 0L, j10, 24);
                                        }
                                        if (j10 == 0) {
                                            return m4339(0L, 0L, j10, 24);
                                        }
                                        try {
                                            char cM36012 = this.f7630.m3604();
                                            this.f7633 = cM36012;
                                            if (cM36012 != 'g') {
                                                return m4339(0L, 0L, j10, 25);
                                            }
                                            if (j10 == 0) {
                                                return m4339(0L, 0L, j10, 25);
                                            }
                                            i = 27;
                                            try {
                                                char cM36013 = this.f7630.m3604();
                                                this.f7633 = cM36013;
                                                return (cM36013 == 'n' && j10 != 0) ? m4340(27, Opcodes.D2L) : m4339(0L, 0L, j10, 26);
                                            } catch (IOException unused) {
                                                m4341(0L, 0L, j10, 26);
                                                return i;
                                            }
                                        } catch (IOException unused2) {
                                            m4341(0L, 0L, j10, 25);
                                            i = 26;
                                        }
                                    } catch (IOException unused3) {
                                        m4341(0L, 0L, j10, 24);
                                        i = 25;
                                    }
                                } catch (IOException unused4) {
                                    m4341(0L, 0L, j10, 23);
                                    i = 24;
                                }
                            } catch (IOException unused5) {
                                m4341(0L, 0L, j10, 22);
                                i = 23;
                            }
                        } catch (IOException unused6) {
                            m4341(0L, 0L, j10, 21);
                            i = 22;
                        }
                    } catch (IOException unused7) {
                        m4341(0L, 0L, j10, 20);
                        return 21;
                    }
                } catch (IOException unused8) {
                    m4341(0L, j9, j10, 19);
                    return 20;
                }
            } catch (IOException unused9) {
                m4341(0L, j7, j8, 18);
                return 19;
            }
        } catch (IOException unused10) {
            m4341(0L, j5, j6, 17);
            return 18;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int m4329(long j, long j2, long j3) {
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 != '&') {
                if (cM3604 != ':') {
                    if (cM3604 == 'r') {
                        return m4330(j, 225232757926666240L, j2, 720575940379279360L, j3, 40960L);
                    }
                    if (cM3604 != '|') {
                        if (cM3604 == '*') {
                            if ((j2 & FieldInfo.FIELD_MASK) != 0) {
                                this.f7629 = Opcodes.INEG;
                                this.f7628 = 1;
                            }
                            return m4330(j, 0L, j2, 0L, j3, 256L);
                        }
                        if (cM3604 != '+') {
                            if (cM3604 != '-') {
                                if (cM3604 == '.') {
                                    return (j3 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) != 0 ? m4340(1, Opcodes.IFEQ) : m4330(j, 0L, j2, 0L, j3, JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO);
                                }
                                if (cM3604 == 'a') {
                                    return m4330(j, 9895739064320L, j2, 137438953472L, j3, 2L);
                                }
                                if (cM3604 == 'b') {
                                    return m4330(j, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME, j2, 738871813865472L, j3, 0L);
                                }
                                if (cM3604 == 't') {
                                    return m4330(j, 1688849860263936L, j2, 0L, j3, 0L);
                                }
                                if (cM3604 == 'u') {
                                    return m4330(j, 74766790688768L, j2, 0L, j3, 0L);
                                }
                                switch (cM3604) {
                                    case '<':
                                        if ((j2 & FieldInfo.JIT) != 0) {
                                            this.f7629 = Opcodes.FNEG;
                                            this.f7628 = 1;
                                        }
                                        return m4330(j, 0L, j2, 0L, j3, 1024L);
                                    case '=':
                                        if ((j2 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) != 0) {
                                            return m4340(1, 92);
                                        }
                                        if ((j2 & 536870912) != 0) {
                                            this.f7629 = 93;
                                            this.f7628 = 1;
                                        } else {
                                            if ((j2 & 2147483648L) != 0) {
                                                return m4340(1, 95);
                                            }
                                            if ((j2 & 8589934592L) != 0) {
                                                return m4340(1, 97);
                                            }
                                            if ((j2 & FieldInfo.DISABLE_JSONB) != 0) {
                                                return m4340(1, Opcodes.IUSHR);
                                            }
                                            if ((j2 & FieldInfo.BACKR_REFERENCE) != 0) {
                                                return m4340(1, Opcodes.LUSHR);
                                            }
                                            if ((j2 & FieldInfo.RECORD) != 0) {
                                                return m4340(1, 126);
                                            }
                                            if ((j2 & Long.MIN_VALUE) != 0) {
                                                return m4340(1, 127);
                                            }
                                            if ((j3 & 1) != 0) {
                                                return m4340(1, 128);
                                            }
                                            if ((j3 & 4) != 0) {
                                                return m4340(1, Opcodes.IXOR);
                                            }
                                            if ((j3 & 16) != 0) {
                                                return m4340(1, Opcodes.IINC);
                                            }
                                            if ((j3 & 64) != 0) {
                                                return m4340(1, Opcodes.I2F);
                                            }
                                        }
                                        return m4330(j, 0L, j2, 0L, j3, JSONWriter.MASK_REFERENCE_DETECTION);
                                    case '>':
                                        if ((j2 & FieldInfo.READ_ONLY) != 0) {
                                            this.f7629 = 120;
                                            this.f7628 = 1;
                                        } else if ((j3 & JSONWriter.MASK_PRETTY_FORMAT) != 0) {
                                            return m4340(1, 144);
                                        }
                                        return m4330(j, 0L, j2, FieldInfo.DISABLE_ARRAY_MAPPING, j3, 20480L);
                                    case '?':
                                        if ((j3 & JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN) != 0) {
                                            this.f7629 = Opcodes.I2S;
                                            this.f7628 = 1;
                                        }
                                        return m4330(j, 0L, j2, 0L, j3, 262144L);
                                    default:
                                        switch (cM3604) {
                                            case 'e':
                                                return m4330(j, 142936513708032L, j2, 0L, j3, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                                            case 'f':
                                                if ((j & 8589934592L) != 0) {
                                                    return m4338(1, 33, 42);
                                                }
                                                break;
                                            case 'g':
                                                return m4330(j, 0L, j2, 4303355904L, j3, 0L);
                                            case 'h':
                                                return m4330(j, 3513089184325959680L, j2, 0L, j3, 0L);
                                            case 'i':
                                                return m4330(j, 805306368L, j2, 0L, j3, 0L);
                                            default:
                                                switch (cM3604) {
                                                    case Opcodes.IDIV /* 108 */:
                                                        return m4330(j, 1090535424L, j2, 36028798126260224L, j3, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                                                    case Opcodes.LDIV /* 109 */:
                                                        return m4330(j, 51539607552L, j2, FieldInfo.READ_USING_MASK, j3, 128L);
                                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                        return m4330(j, 481069891584L, j2, 0L, j3, 0L);
                                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                        if ((JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY & j) != 0) {
                                                            this.f7629 = 22;
                                                            this.f7628 = 1;
                                                        }
                                                        return m4330(j, 864691684663365632L, j2, JSONWriter.MASK_BROWSER_SECURE, j3, 8L);
                                                    case 'p':
                                                        return m4330(j, 0L, j2, FieldInfo.DISABLE_SMART_MATCH, j3, 512L);
                                                    default:
                                                        switch (cM3604) {
                                                            case Opcodes.DNEG /* 119 */:
                                                                return m4330(j, FieldInfo.READ_USING_MASK, j2, 0L, j3, 0L);
                                                            case 'x':
                                                                return m4330(j, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j2, 0L, j3, 32L);
                                                            case 'y':
                                                                return m4330(j, 4503599627403264L, j2, 0L, j3, 0L);
                                                        }
                                                }
                                        }
                                        break;
                                }
                            } else if ((j2 & 549755813888L) != 0) {
                                return m4340(1, 103);
                            }
                        } else if ((j2 & JSONWriter.MASK_UNQUOTE_FIELD_NAME) != 0) {
                            return m4340(1, 102);
                        }
                    } else if ((j2 & JSONWriter.MASK_WRITE_LONG_AS_STRING) != 0) {
                        return m4340(1, 98);
                    }
                } else {
                    if ((j3 & JSONWriter.MASK_USE_SINGLE_QUOTES) != 0) {
                        return m4340(1, Opcodes.LCMP);
                    }
                    if ((j3 & JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY) != 0) {
                        return m4340(1, Opcodes.DCMPL);
                    }
                }
            } else if ((j2 & JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL) != 0) {
                return m4340(1, 100);
            }
            return m4339(j, j2, j3, 0);
        } catch (IOException unused) {
            m4341(j, j2, j3, 0);
            return 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int m4330(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 0);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 != '.') {
                if (cM3604 == 'i') {
                    return m4331(j7, 2596342777365135360L, j8, 721314812193144832L, j9, 40960L);
                }
                if (cM3604 == 'l') {
                    return m4331(j7, 576465150484152320L, j8, 0L, j9, 0L);
                }
                if (cM3604 != 'w') {
                    if (cM3604 != 'y') {
                        if (cM3604 != '=') {
                            if (cM3604 == '>') {
                                if ((FieldInfo.DISABLE_ARRAY_MAPPING & j8) != 0) {
                                    this.f7629 = 122;
                                    this.f7628 = 2;
                                } else if ((JSONWriter.MASK_REFERENCE_DETECTION & j9) != 0) {
                                    return m4340(2, Opcodes.I2B);
                                }
                                return m4331(j7, 0L, j8, 0L, j9, 16384L);
                            }
                            if (cM3604 == 'e') {
                                return m4331(j7, 1152921504606855168L, j8, FieldInfo.DISABLE_UNSAFE, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                            }
                            if (cM3604 == 'f') {
                                return m4331(j7, 2097152L, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                            }
                            switch (cM3604) {
                                case Opcodes.LADD /* 97 */:
                                    return m4331(j7, 9570149208440832L, j8, 0L, j9, 0L);
                                case 'b':
                                    return m4331(j7, 70368744177664L, j8, 0L, j9, 0L);
                                case 'c':
                                    return m4331(j7, 8796093022208L, j8, 0L, j9, 0L);
                                default:
                                    switch (cM3604) {
                                        case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                            return m4331(j7, 4504150190063616L, j8, 137438953472L, j9, 2L);
                                        case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                            return m4331(j7, 316660422545408L, j8, 11258999068426240L, j9, 672L);
                                        case 'p':
                                            return m4331(j7, 51539607552L, j8, 0L, j9, 0L);
                                        default:
                                            switch (cM3604) {
                                                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                                    if ((2147483648L & j7) != 0) {
                                                        return m4338(2, 31, 42);
                                                    }
                                                    if ((JSONWriter.MASK_BROWSER_SECURE & j8) != 0) {
                                                        this.f7629 = 99;
                                                        this.f7628 = 2;
                                                    }
                                                    return m4331(j7, 55169095435288576L, j8, 0L, j9, 8L);
                                                case 's':
                                                    return m4331(j7, 68736321536L, j8, 0L, j9, 0L);
                                                case Opcodes.INEG /* 116 */:
                                                    if ((137438953472L & j7) != 0) {
                                                        this.f7629 = 37;
                                                        this.f7628 = 2;
                                                    } else if ((JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY & j8) != 0) {
                                                        this.f7629 = 87;
                                                        this.f7628 = 2;
                                                    } else if ((JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE & j8) != 0) {
                                                        this.f7629 = 89;
                                                        this.f7628 = 2;
                                                    }
                                                    return m4331(j7, 142116240130048L, j8, 5368709120L, j9, 0L);
                                                case Opcodes.LNEG /* 117 */:
                                                    return m4331(j7, 72057594079870976L, j8, 0L, j9, 0L);
                                            }
                                    }
                            }
                        }
                        if ((256 & j9) != 0) {
                            return m4340(2, Opcodes.L2I);
                        }
                        if ((1024 & j9) != 0) {
                            return m4340(2, 138);
                        }
                        if ((JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & j9) != 0) {
                            return m4340(2, Opcodes.F2L);
                        }
                        if ((262144 & j9) != 0) {
                            return m4340(2, Opcodes.I2C);
                        }
                    } else if ((FieldInfo.DISABLE_REFERENCE_DETECT & j7) != 0) {
                        return m4338(2, 57, 42);
                    }
                } else if ((2199023255552L & j7) != 0) {
                    return m4338(2, 41, 42);
                }
            } else if ((JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO & j9) != 0) {
                return m4340(2, Opcodes.DCMPG);
            }
            return m4339(j7, j8, j9, 1);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 1);
            return 2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final int m4331(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 1);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 != '=') {
                if (cM3604 == '_') {
                    return m4332(j7, 0L, j8, 0L, j9, 8L);
                }
                if (cM3604 == 'i') {
                    return m4332(j7, 1126999418470400L, j8, 0L, j9, 0L);
                }
                switch (cM3604) {
                    case Opcodes.LADD /* 97 */:
                        return m4332(j7, 576460754184577024L, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                    case 'b':
                        return m4332(j7, JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY, j8, 0L, j9, 0L);
                    case 'c':
                        return m4332(j7, 4503599627501568L, j8, 0L, j9, 0L);
                    case 'd':
                        if ((FieldInfo.DISABLE_ARRAY_MAPPING & j7) != 0) {
                            return m4338(3, 58, 42);
                        }
                        if ((137438953472L & j8) != 0) {
                            this.f7629 = 101;
                            this.f7628 = 3;
                        } else if ((FieldInfo.READ_USING_MASK & j8) != 0) {
                            this.f7629 = 115;
                            this.f7628 = 3;
                        }
                        return m4332(j7, 0L, j8, 0L, j9, 130L);
                    case 'e':
                        if ((JSONWriter.MASK_IGNORE_ERROR_GETTER & j7) != 0) {
                            return m4338(3, 15, 42);
                        }
                        if ((JSONWriter.MASK_PRETTY_FORMAT & j7) != 0) {
                            return m4338(3, 16, 42);
                        }
                        if ((JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO & j7) != 0) {
                            return m4338(3, 24, 42);
                        }
                        return (FieldInfo.READ_ONLY & j7) != 0 ? m4338(3, 56, 42) : m4332(j7, 274945015808L, j8, 5368709120L, j9, 0L);
                    case 'f':
                        return m4332(j7, 0L, j8, FieldInfo.DISABLE_UNSAFE, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                    case 'g':
                        return (549755813888L & j7) != 0 ? m4338(3, 39, 42) : m4332(j7, 0L, j8, 720575940379279360L, j9, 40960L);
                    default:
                        switch (cM3604) {
                            case 'k':
                                return m4332(j7, 8796093022208L, j8, 0L, j9, 0L);
                            case Opcodes.IDIV /* 108 */:
                                return (4398046511104L & j7) != 0 ? m4338(3, 42, 42) : m4332(j7, 2305913395137744896L, j8, 0L, j9, 0L);
                            case Opcodes.LDIV /* 109 */:
                                if ((JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE & j7) != 0) {
                                    return m4338(3, 25, 42);
                                }
                                break;
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                return (FieldInfo.DISABLE_JSONB & j7) != 0 ? m4338(3, 60, 42) : m4332(j7, FieldInfo.DISABLE_SMART_MATCH, j8, 0L, j9, 0L);
                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                return (JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & j7) != 0 ? m4338(3, 32, 42) : m4332(j7, 54043229888184320L, j8, 0L, j9, 0L);
                            default:
                                switch (cM3604) {
                                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                                        return (262144 & j7) != 0 ? m4338(3, 18, 42) : m4332(j7, FieldInfo.VALUE_MASK, j8, 0L, j9, 32L);
                                    case 's':
                                        return m4332(j7, 134758400L, j8, 0L, j9, 0L);
                                    case Opcodes.INEG /* 116 */:
                                        return m4332(j7, 2850002859722752L, j8, 738871813865472L, j9, 0L);
                                    case Opcodes.LNEG /* 117 */:
                                        return m4332(j7, 140737488355328L, j8, 0L, j9, 0L);
                                    case Opcodes.FNEG /* 118 */:
                                        return m4332(j7, 17592186044416L, j8, 0L, j9, 0L);
                                    case Opcodes.DNEG /* 119 */:
                                        if ((FieldInfo.DISABLE_SMART_MATCH & j8) != 0) {
                                            this.f7629 = Opcodes.LNEG;
                                            this.f7628 = 3;
                                        }
                                        return m4332(j7, 0L, j8, 0L, j9, 512L);
                                }
                        }
                        break;
                }
            } else if ((16384 & j9) != 0) {
                return m4340(3, Opcodes.D2I);
            }
            return m4339(j7, j8, j9, 2);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 2);
            return 3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int m4332(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 2);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            switch (cM3604) {
                case Opcodes.SWAP /* 95 */:
                    return m4333(j7, 0L, j8, 0L, j9, 674L);
                case Opcodes.LADD /* 97 */:
                    return m4333(j7, 26456998543360L, j8, 0L, j9, 8L);
                case 'c':
                    return m4333(j7, 3377699720527872L, j8, 0L, j9, 0L);
                case 'e':
                    if ((JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING & j7) != 0) {
                        return m4338(4, 27, 42);
                    }
                    return (FieldInfo.BACKR_REFERENCE & j7) != 0 ? m4338(4, 61, 42) : m4333(j7, 35201551962112L, j8, 0L, j9, 0L);
                case 'h':
                    return (JSONWriter.MASK_REFERENCE_DETECTION & j7) != 0 ? m4338(4, 17, 42) : m4333(j7, FieldInfo.FIELD_MASK, j8, 720575940379279360L, j9, 40960L);
                case 'i':
                    return m4333(j7, 633318698647552L, j8, 0L, j9, 0L);
                case 'k':
                    if ((JSONWriter.MASK_WRITE_ENUMS_USING_NAME & j7) != 0) {
                        return m4338(4, 13, 42);
                    }
                    break;
                case Opcodes.IDIV /* 108 */:
                    if ((JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN & j7) != 0) {
                        this.f7629 = 28;
                        this.f7628 = 4;
                    }
                    return m4333(j7, 545259520L, j8, 0L, j9, 0L);
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    return m4333(j7, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j8, 0L, j9, 0L);
                case 'q':
                    if ((JSONWriter.MASK_ESCAPE_NONE_ASCII & j8) != 0) {
                        return m4340(4, 94);
                    }
                    if ((JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & j8) != 0) {
                        return m4340(4, 96);
                    }
                    break;
                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    return m4333(j7, 141046726002688L, j8, 0L, j9, 0L);
                case 's':
                    return (16384 & j7) != 0 ? m4338(4, 14, 42) : m4333(j7, FieldInfo.DISABLE_SMART_MATCH, j8, 0L, j9, 0L);
                case Opcodes.INEG /* 116 */:
                    if ((JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN & j7) != 0) {
                        return m4338(4, 19, 42);
                    }
                    if ((JSONWriter.MASK_ESCAPE_NONE_ASCII & j7) != 0) {
                        return m4338(4, 30, 42);
                    }
                    return (FieldInfo.VALUE_MASK & j7) != 0 ? m4338(4, 48, 42) : m4333(j7, FieldInfo.DISABLE_AUTO_TYPE, j8, FieldInfo.DISABLE_UNSAFE, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                case Opcodes.LNEG /* 117 */:
                    return m4333(j7, 2097152L, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                case Opcodes.FNEG /* 118 */:
                    return m4333(j7, JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME, j8, 0L, j9, 0L);
                case Opcodes.DNEG /* 119 */:
                    if ((FieldInfo.JIT & j7) != 0) {
                        this.f7629 = 54;
                        this.f7628 = 4;
                    }
                    return m4333(j7, FieldInfo.DISABLE_UNSAFE, j8, 738871813865472L, j9, 0L);
            }
            return m4339(j7, j8, j9, 3);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 3);
            return 4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int m4333(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 3);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            switch (cM3604) {
                case Opcodes.SWAP /* 95 */:
                    return m4334(j7, 0L, j8, FieldInfo.DISABLE_UNSAFE, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                case Opcodes.LADD /* 97 */:
                    return m4334(j7, 6144L, j8, 0L, j9, 674L);
                case 'c':
                    if ((70368744177664L & j7) != 0) {
                        return m4338(5, 46, 42);
                    }
                    return (FieldInfo.UNWRAPPED_MASK & j7) != 0 ? m4338(5, 49, 42) : m4334(j7, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j8, 0L, j9, 0L);
                case 'd':
                    return m4334(j7, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j8, 0L, j9, 0L);
                case 'e':
                    if ((JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY & j7) != 0) {
                        return m4338(5, 23, 42);
                    }
                    if ((JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME & j7) != 0) {
                        return m4338(5, 40, 42);
                    }
                    break;
                case 'f':
                    return m4334(j7, JSONWriter.MASK_UNQUOTE_FIELD_NAME, j8, 0L, j9, 0L);
                case 'g':
                    return m4334(j7, 8796093022208L, j8, 0L, j9, 0L);
                case 'h':
                    if ((FieldInfo.READ_USING_MASK & j7) != 0) {
                        return m4338(5, 51, 42);
                    }
                    break;
                case 'i':
                    return m4334(j7, 585467951558164480L, j8, 738871813865472L, j9, 0L);
                case Opcodes.IDIV /* 108 */:
                    return m4334(j7, 538968064L, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                case Opcodes.LDIV /* 109 */:
                    return m4334(j7, JSONWriter.MASK_WRITE_LONG_AS_STRING, j8, 0L, j9, 0L);
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    return (140737488355328L & j7) != 0 ? m4338(5, 47, 42) : m4334(j7, 68720525312L, j8, 0L, j9, 0L);
                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    return m4334(j7, FieldInfo.FIELD_MASK, j8, 0L, j9, 0L);
                case 's':
                    return (FieldInfo.DISABLE_UNSAFE & j7) != 0 ? m4338(5, 55, 42) : m4334(j7, 0L, j8, 0L, j9, 8L);
                case Opcodes.INEG /* 116 */:
                    return (JSONWriter.MASK_BROWSER_SECURE & j7) != 0 ? m4338(5, 35, 42) : m4334(j7, 1143492092887040L, j8, 720575940379279360L, j9, 40960L);
            }
            return m4339(j7, j8, j9, 4);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 4);
            return 5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int m4334(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 4);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == '_') {
                return m4335(j7, 0L, j8, 720575940379279360L, j9, 40960L);
            }
            if (cM3604 == 'a') {
                return m4335(j7, JSONWriter.MASK_UNQUOTE_FIELD_NAME, j8, 0L, j9, 0L);
            }
            if (cM3604 == 'c') {
                return m4335(j7, 68719478784L, j8, 0L, j9, 0L);
            }
            if (cM3604 == 'l') {
                return m4335(j7, FieldInfo.DISABLE_AUTO_TYPE, j8, 0L, j9, 0L);
            }
            if (cM3604 != 'y') {
                if (cM3604 == 'e') {
                    if ((8796093022208L & j7) != 0) {
                        return m4338(6, 43, 42);
                    }
                    return (17592186044416L & j7) != 0 ? m4338(6, 44, 42) : m4335(j7, 9007216434610176L, j8, 0L, j9, 0L);
                }
                if (cM3604 == 'f') {
                    return m4335(j7, FieldInfo.RAW_VALUE_MASK, j8, 0L, j9, 0L);
                }
                if (cM3604 != 'n') {
                    if (cM3604 == 'o') {
                        return m4335(j7, FieldInfo.FIELD_MASK, j8, 0L, j9, 0L);
                    }
                    switch (cM3604) {
                        case 's':
                            return (JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY & j7) != 0 ? m4338(6, 26, 42) : m4335(j7, 0L, j8, 36767668832829440L, j9, 2730L);
                        case Opcodes.INEG /* 116 */:
                            if ((2097152 & j7) != 0) {
                                this.f7629 = 21;
                                this.f7628 = 6;
                            }
                            return m4335(j7, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j8, 0L, j9, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY);
                        case Opcodes.LNEG /* 117 */:
                            return m4335(j7, JSONWriter.MASK_USE_SINGLE_QUOTES, j8, 0L, j9, 0L);
                    }
                }
                if ((JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & j7) != 0) {
                    return m4338(6, 12, 42);
                }
            } else if ((536870912 & j7) != 0) {
                return m4338(6, 29, 42);
            }
            return m4339(j7, j8, j9, 5);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 5);
            return 6;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int m4335(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 5);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 != ':') {
                if (cM3604 == 'c') {
                    return m4336(j7, JSONWriter.MASK_UNQUOTE_FIELD_NAME, j8, 0L, j9, 0L);
                }
                if (cM3604 == 'e') {
                    if ((JSONWriter.MASK_USE_SINGLE_QUOTES & j7) != 0) {
                        return m4338(7, 20, 42);
                    }
                    return (FieldInfo.DISABLE_AUTO_TYPE & j7) != 0 ? m4338(7, 59, 42) : m4336(j7, 35253091565568L, j8, 738871813865472L, j9, 0L);
                }
                if (cM3604 == 'n') {
                    return m4336(j7, 13510816061980672L, j8, 0L, j9, 0L);
                }
                if (cM3604 != 'p') {
                    if (cM3604 == 'h') {
                        return m4336(j7, 0L, j8, FieldInfo.DISABLE_UNSAFE, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
                    }
                    if (cM3604 == 'i') {
                        return m4336(j7, 0L, j8, 0L, j9, 8L);
                    }
                    switch (cM3604) {
                        case 's':
                            return m4336(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, 8866L);
                        case Opcodes.INEG /* 116 */:
                            if ((JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME & j7) != 0) {
                                return m4338(7, 11, 42);
                            }
                            break;
                        case Opcodes.LNEG /* 117 */:
                            return m4336(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
                    }
                } else if ((FieldInfo.RAW_VALUE_MASK & j7) != 0) {
                    return m4338(7, 50, 42);
                }
            } else if ((JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY & j9) != 0) {
                return m4340(7, Opcodes.IFNE);
            }
            return m4339(j7, j8, j9, 6);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 6);
            return 7;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final int m4336(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 6);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == '_') {
                return m4337(j7, 0L, j8, 738871813865472L, j9, 0L);
            }
            if (cM3604 == 't') {
                return (FieldInfo.DISABLE_SMART_MATCH & j7) != 0 ? m4338(8, 53, 42) : m4337(j7, JSONWriter.MASK_WRITE_LONG_AS_STRING, j8, 0L, j9, 0L);
            }
            if (cM3604 != 'd') {
                if (cM3604 != 'e') {
                    if (cM3604 == 'n') {
                        return m4337(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
                    }
                    if (cM3604 == 'o') {
                        return m4337(j7, JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL, j8, 0L, j9, 0L);
                    }
                    switch (cM3604) {
                        case 'g':
                            return m4337(j7, 0L, j8, 0L, j9, 8L);
                        case 'h':
                            return m4337(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                        case 'i':
                            return m4337(j7, FieldInfo.FIELD_MASK, j8, FieldInfo.DISABLE_UNSAFE, j9, 2722L);
                    }
                }
                if ((JSONWriter.MASK_UNQUOTE_FIELD_NAME & j7) != 0) {
                    return m4338(8, 38, 42);
                }
            } else if ((JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING & j7) != 0) {
                return m4338(8, 45, 42);
            }
            return m4339(j7, j8, j9, 7);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 7);
            return 8;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final int m4337(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j2 & j;
        long j8 = j4 & j3;
        long j9 = j6 & j5;
        if ((j7 | j8 | j9) == 0) {
            return m4339(j, j3, j5, 7);
        }
        try {
            char cM3604 = this.f7630.m3604();
            this.f7633 = cM3604;
            if (cM3604 == 'a') {
                return m4320(j7, 0L, j8, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j9, 0L);
            }
            if (cM3604 == 'i') {
                return m4320(j7, 0L, j8, FieldInfo.DISABLE_REFERENCE_DETECT, j9, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            }
            if (cM3604 == 's') {
                return (JSONWriter.MASK_WRITE_LONG_AS_STRING & j7) != 0 ? m4338(9, 34, 42) : m4320(j7, 0L, j8, FieldInfo.DISABLE_AUTO_TYPE, j9, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            }
            if (cM3604 == 'x') {
                return m4320(j7, 0L, j8, FieldInfo.UNWRAPPED_MASK, j9, 0L);
            }
            if (cM3604 == 'z') {
                return m4320(j7, FieldInfo.FIELD_MASK, j8, 0L, j9, 0L);
            }
            if (cM3604 == 'f') {
                return (JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL & j7) != 0 ? m4338(9, 36, 42) : m4320(j7, 0L, j8, FieldInfo.DISABLE_UNSAFE, j9, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME);
            }
            if (cM3604 == 'g') {
                return m4320(j7, 0L, j8, 0L, j9, 674L);
            }
            if (cM3604 != 'n') {
                if (cM3604 == 'o') {
                    return m4320(j7, 0L, j8, 140737488355328L, j9, 0L);
                }
            } else if ((8 & j9) != 0) {
                return m4340(9, Opcodes.LXOR);
            }
            return m4339(j7, j8, j9, 8);
        } catch (IOException unused) {
            m4341(j7, j8, j9, 8);
            return 9;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final int m4338(int i, int i2, int i3) {
        this.f7629 = i2;
        this.f7628 = i;
        try {
            this.f7633 = this.f7630.m3604();
            return m4319(i3, i + 1);
        } catch (IOException unused) {
            return i + 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int m4339(long j, long j2, long j3, int i) {
        return m4319(m4341(j, j2, j3, i), i + 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final int m4340(int i, int i2) {
        this.f7629 = i2;
        this.f7628 = i;
        return i + 1;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0166 A[RETURN] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final int m4341(long j, long j2, long j3, int i) {
        switch (i) {
            case 0:
                if ((18014399063130112L & j2) != 0 || (132096 & j3) != 0) {
                    return 80;
                }
                if ((JSONWriter.MASK_USE_SINGLE_QUOTES & j2) != 0 || (JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO & j3) != 0) {
                    return 18;
                }
                if ((j2 & (-9223363240761753600L)) != 0) {
                    return 69;
                }
                if ((4611686018427385856L & j) == 0 && (j3 & JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY) == 0) {
                    return (j & 62) != 0 ? 0 : -1;
                }
                this.f7629 = 73;
                return 42;
            case 1:
                if ((j2 & FieldInfo.JIT) != 0 || (1024 & j3) != 0) {
                    return 80;
                }
                if ((8602517504L & j) == 0) {
                    if ((j & 4611686009824868352L) == 0 && (j3 & JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY) == 0) {
                        return -1;
                    }
                    if (this.f7628 != 1) {
                        this.f7629 = 73;
                        this.f7628 = 1;
                    }
                }
                return 42;
            case 2:
                if ((144117801563455488L & j) == 0) {
                    if ((j & 4467568208269801472L) == 0 && (j3 & JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY) == 0) {
                        return -1;
                    }
                    if (this.f7628 != 2) {
                        this.f7629 = 73;
                        this.f7628 = 2;
                        return 42;
                    }
                }
                return 42;
            case 3:
                if ((1513214426944471040L & j) == 0) {
                    if ((j & 2954354056203237376L) == 0 && (j3 & JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY) == 0) {
                        return -1;
                    }
                    if (this.f7628 != 3) {
                        this.f7629 = 73;
                        this.f7628 = 3;
                        return 42;
                    }
                }
                return 42;
            case 4:
                if ((2360167681732796416L & j) == 0) {
                    if ((j & 594186374470440960L) == 0 && (j3 & JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY) == 0) {
                        return -1;
                    }
                    if (this.f7628 != 4) {
                        this.f7629 = 73;
                        this.f7628 = 4;
                        return 42;
                    }
                }
                return 42;
            case 5:
                if ((591159385127917568L & j) == 0 && (j3 & JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY) == 0) {
                    if ((j & 39055786898358272L) != 0) {
                        return 42;
                    }
                    return -1;
                }
                this.f7629 = 73;
                this.f7628 = 5;
                return 42;
            case 6:
                if ((26388885147648L & j) == 0 && (j3 & JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY) == 0) {
                    if ((j & 591132996242769920L) == 0) {
                        return -1;
                    }
                    if (this.f7628 != 6) {
                        this.f7629 = 73;
                        this.f7628 = 6;
                        return 42;
                    }
                }
                return 42;
            case 7:
                if ((577586652211316736L & j) == 0) {
                    if ((j & 13546344031453184L) == 0) {
                        return -1;
                    }
                    this.f7629 = 73;
                    this.f7628 = 7;
                    return 42;
                }
                return 42;
            case 8:
                if ((9042658504736768L & j) == 0) {
                    if ((j & 4503685526716416L) == 0) {
                        return -1;
                    }
                    this.f7629 = 73;
                    this.f7628 = 8;
                    return 42;
                }
                return 42;
            case 9:
                if ((85899345920L & j) == 0) {
                    if ((j & FieldInfo.FIELD_MASK) == 0) {
                        return -1;
                    }
                    this.f7629 = 73;
                    this.f7628 = 9;
                    return 42;
                }
                return 42;
            case 10:
                if ((j & FieldInfo.FIELD_MASK) == 0) {
                    return -1;
                }
                if (this.f7628 != 10) {
                    this.f7629 = 73;
                    this.f7628 = 10;
                    return 42;
                }
                return 42;
            case 11:
                if ((j & FieldInfo.FIELD_MASK) != 0) {
                    return 42;
                }
                return -1;
            default:
                return -1;
        }
    }
}
