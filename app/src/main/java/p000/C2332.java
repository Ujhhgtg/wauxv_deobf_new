package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᤞᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2332 extends C1229 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String f7471;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C3408 f7472;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int[][] f7473;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public String[] f7474;

    public C2332() {
        super("", null, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m4176(C3408 c3408, int[][] iArr, String[] strArr) {
        StringBuilder sb = new StringBuilder("Unable to parse code syntax. Encountered:");
        if (c3408 != null) {
            C3408 c3409 = c3408;
            while (true) {
                c3409 = c3409.f10751;
                if (c3409 != null) {
                    sb.append(" ");
                    String str = c3409.f10750;
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
                    sb.append(c3408.f10751.f10747);
                    sb.append(", column ");
                    sb.append(c3408.f10751.f10748);
                    if (f7471 != null) {
                        sb.append(" in: ");
                        sb.append(f7471);
                    }
                }
            }
        }
        if (((Boolean) RunnableC1668.f5629.get()).booleanValue() && iArr.length != 0) {
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

    @Override // p000.C1229, java.lang.Throwable
    public final String getMessage() {
        return m4176(this.f7472, this.f7473, this.f7474);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getMessage();
    }
}
