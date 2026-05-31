package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤝᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2579 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Pattern f8199;

    public C2579(Pattern pattern) {
        this.f8199 = pattern;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f8199;
        return new C2577(pattern.pattern(), pattern.flags());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1012 m4552(C2579 c2579, String str) {
        if (str.length() >= 0) {
            return new C1012(new C0310(c2579, 6, str), C2578.f8198, 1);
        }
        StringBuilder sbM2802 = AbstractC1095.m2802(0, "Start index out of bounds: ", ", input length: ");
        sbM2802.append(str.length());
        throw new IndexOutOfBoundsException(sbM2802.toString());
    }

    public final String toString() {
        return this.f8199.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m4553(String str, InterfaceC1433 interfaceC1433) {
        int i = 0;
        C1931 c1931M3093 = AbstractC1272.m3093(this.f8199.matcher(str), 0, str);
        if (c1931M3093 == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            Matcher matcher = c1931M3093.f6357;
            sb.append((CharSequence) str, i, AbstractC3744.m5348(matcher.start(), matcher.end()).f5650);
            sb.append((CharSequence) interfaceC1433.invoke(c1931M3093));
            i = AbstractC3744.m5348(matcher.start(), matcher.end()).f5651 + 1;
            c1931M3093 = c1931M3093.m3884();
            if (i >= length) {
                break;
            }
        } while (c1931M3093 != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public C2579(String str) {
        this(Pattern.compile(str));
    }
}
