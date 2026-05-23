package p000;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᛸᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2523 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Pattern f8049;

    public C2523(String str) {
        this.f8049 = Pattern.compile(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1009 m4530(C2523 c2523, String str) {
        if (str.length() >= 0) {
            return new C1009(new C0299(c2523, 5, str), C2522.f8048, 1);
        }
        StringBuilder sbM2787 = AbstractC1194.m2787(0, "Start index out of bounds: ", ", input length: ");
        sbM2787.append(str.length());
        throw new IndexOutOfBoundsException(sbM2787.toString());
    }

    public final String toString() {
        return this.f8049.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m4531(String str, InterfaceC1425 interfaceC1425) {
        int i = 0;
        C1904 c1904M4123 = AbstractC2209.m4123(this.f8049.matcher(str), 0, str);
        if (c1904M4123 == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            Matcher matcher = c1904M4123.f6278;
            sb.append((CharSequence) str, i, AbstractC2203.m4044(matcher.start(), matcher.end()).f5612);
            sb.append((CharSequence) interfaceC1425.invoke(c1904M4123));
            i = AbstractC2203.m4044(matcher.start(), matcher.end()).f5613 + 1;
            c1904M4123 = c1904M4123.m3700();
            if (i >= length) {
                break;
            }
        } while (c1904M4123 != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }
}
