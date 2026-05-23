package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0574 extends AbstractC1352 implements Comparable {

    public static final C0574 f2340 = new C0574(0);

    @Override // p000.AbstractC1352, p000.InterfaceC3407
    public final String mo1214() {
        return m1981("", "");
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0574 c0574) {
        if (this == c0574) {
            return 0;
        }
        int length = this.f4836.length;
        int length2 = c0574.f4836.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ((C0573) m3062(i)).compareTo((C0573) c0574.m3062(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    public final String m1981(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int length = this.f4836.length;
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < length; i++) {
            C0573 c0573 = (C0573) m3062(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i != length - 1) {
                sb.append(c0573.f2338.f3401.mo1214());
            } else {
                int length2 = this.f4836.length;
                if (false ? false : ((C0573) m3062(length2 - 1)).f2338.equals(C0918.f3381)) {
                    sb.append("<any>");
                } else {
                    sb.append(c0573.f2338.f3401.mo1214());
                }
            }
            sb.append(" -> ");
            int i2 = c0573.f2339;
            sb.append(i2 == ((char) i2) ? AbstractC1460.m3223(i2) : AbstractC1460.m3224(i2));
        }
        return sb.toString();
    }
}
