package p000;

import bsh.RunnableC0026Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛲ能不能ᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1405feyxiexzfUjhhgtg extends C3353Ujhhgtgfeyxiexzf {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String f4922Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C1727Ujhhgtgfeyxiexzf f4923Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int[][] f4924Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public String[] f4925Ujhhgtgfeyxiexzf;

    public C1405feyxiexzfUjhhgtg() {
        super("", null, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static String m2887Ujhhgtgfeyxiexzf(C1727Ujhhgtgfeyxiexzf c1727Ujhhgtgfeyxiexzf, int[][] iArr, String[] strArr) {
        StringBuilder sb = new StringBuilder("Unable to parse code syntax. Encountered:");
        if (c1727Ujhhgtgfeyxiexzf != null) {
            C1727Ujhhgtgfeyxiexzf c1727Ujhhgtgfeyxiexzf2 = c1727Ujhhgtgfeyxiexzf;
            while (true) {
                c1727Ujhhgtgfeyxiexzf2 = c1727Ujhhgtgfeyxiexzf2.f5801Ujhhgtgfeyxiexzf;
                if (c1727Ujhhgtgfeyxiexzf2 != null) {
                    sb.append(" ");
                    String str = c1727Ujhhgtgfeyxiexzf2.f5800Ujhhgtgfeyxiexzf;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i = 0; i < str.length(); i++) {
                        char cCharAt = str.charAt(i);
                        if (cCharAt == '\f') {
                            sb2.append("\\f");
                        } else if (cCharAt == '\r') {
                            sb2.append("\\r");
                        } else if (cCharAt == '\"') {
                            sb2.append("\\\"");
                        } else if (cCharAt == '\'') {
                            sb2.append("\\'");
                        } else if (cCharAt != '\\') {
                            switch (cCharAt) {
                                case '\b':
                                    sb2.append("\\b");
                                    break;
                                case '\t':
                                    sb2.append("\\t");
                                    break;
                                case '\n':
                                    sb2.append("\\n");
                                    break;
                                default:
                                    char cCharAt2 = str.charAt(i);
                                    if (cCharAt2 < ' ' || cCharAt2 > '~') {
                                        String str2 = "0000" + Integer.toString(cCharAt2, 16);
                                        sb2.append("\\u" + str2.substring(str2.length() - 4, str2.length()));
                                    } else {
                                        sb2.append(cCharAt2);
                                    }
                                    break;
                            }
                        } else {
                            sb2.append("\\\\");
                        }
                    }
                    sb.append(sb2.toString());
                } else {
                    sb.append(" at line ");
                    sb.append(c1727Ujhhgtgfeyxiexzf.f5801Ujhhgtgfeyxiexzf.f5796Ujhhgtgfeyxiexzf);
                    sb.append(", column ");
                    sb.append(c1727Ujhhgtgfeyxiexzf.f5801Ujhhgtgfeyxiexzf.f5797Ujhhgtgfeyxiexzf);
                    if (f4922Ujhhgtgfeyxiexzf != null) {
                        sb.append(" in: ");
                        sb.append(f4922Ujhhgtgfeyxiexzf);
                    }
                }
            }
        }
        if (((Boolean) RunnableC0026Ujhhgtgfeyxiexzf.f514Ujhhgtgfeyxiexzf.get()).booleanValue() && iArr.length != 0) {
            sb.append(System.getProperty("line.separator", "\n"));
            sb.append("Exppected");
            if (iArr.length > 1) {
                sb.append(" one of");
            }
            sb.append(": ");
            for (int[] iArr2 : iArr) {
                int i2 = 0;
                while (true) {
                    if (i2 < iArr2.length) {
                        sb.append(strArr[iArr2[i2]].replace('\"', ' ').trim());
                        sb.append(' ');
                        i2++;
                    }
                }
            }
        }
        return sb.toString();
    }

    @Override // p000.C3353Ujhhgtgfeyxiexzf, java.lang.Throwable
    public final String getMessage() {
        return m2887Ujhhgtgfeyxiexzf(this.f4923Ujhhgtgfeyxiexzf, this.f4924Ujhhgtgfeyxiexzf, this.f4925Ujhhgtgfeyxiexzf);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getMessage();
    }
}
