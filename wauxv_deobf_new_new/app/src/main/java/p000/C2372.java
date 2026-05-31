package p000;

import bsh.RunnableC0008;
import bsh.Token;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲇᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2372 extends C1231 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String f7609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Token f7610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int[][] f7611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public String[] f7612;

    public C2372() {
        super("", null, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m4310(Token token, int[][] iArr, String[] strArr) {
        StringBuilder sb = new StringBuilder("Unable to parse code syntax. Encountered:");
        if (token != null) {
            Token token2 = token;
            while (true) {
                token2 = token2.next;
                if (token2 != null) {
                    sb.append(" ");
                    String str = token2.image;
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
                    sb.append(token.next.beginLine);
                    sb.append(", column ");
                    sb.append(token.next.beginColumn);
                    if (f7609 != null) {
                        sb.append(" in: ");
                        sb.append(f7609);
                    }
                }
            }
        }
        if (((Boolean) RunnableC0008.f500.get()).booleanValue() && iArr.length != 0) {
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

    @Override // p000.C1231, java.lang.Throwable
    public final String getMessage() {
        return m4310(this.f7610, this.f7611, this.f7612);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getMessage();
    }
}
