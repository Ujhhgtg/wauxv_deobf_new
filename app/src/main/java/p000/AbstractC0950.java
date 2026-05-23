package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0950 {

    public int f3467;

    public final C1089 f3468;

    public final C2788 f3469;

    public final C2526 f3470;

    public AbstractC0950(C1089 c1089, C2788 c2788, C2526 c2526) {
        if (c1089 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c2788 == null) {
            throw new NullPointerException("position == null");
        }
        if (c2526 == null) {
            throw new NullPointerException("registers == null");
        }
        this.f3467 = -1;
        this.f3468 = c1089;
        this.f3469 = c2788;
        this.f3470 = c2526;
    }

    public static C2706 m2441(C2788 c2788, C2525 c2525, C2525 c2526) {
        C1089 c1089;
        boolean z = c2525.m4540() == 1;
        boolean zM4974 = c2525.f8056.getType().m4974();
        int i = c2525.f8055;
        if ((c2526.f8055 | i) < 16) {
            if (zM4974) {
                c1089 = AbstractC1090.f3940;
            } else {
                c1089 = z ? AbstractC1090.f3934 : AbstractC1090.f3937;
            }
        } else if (i < 256) {
            if (zM4974) {
                c1089 = AbstractC1090.f3941;
            } else {
                c1089 = z ? AbstractC1090.f3935 : AbstractC1090.f3938;
            }
        } else if (zM4974) {
            c1089 = AbstractC1090.f3942;
        } else {
            c1089 = z ? AbstractC1090.f3936 : AbstractC1090.f3939;
        }
        return new C2706(c1089, c2788, C2526.m4547(c2525, c2526));
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m2443());
        sb.append(' ');
        sb.append(this.f3469);
        sb.append(": ");
        sb.append(this.f3468.m2661());
        C2526 c2526 = this.f3470;
        if (c2526.f4836.length != 0) {
            z = true;
            sb.append(c2526.m3064(" ", null, true));
        } else {
            z = false;
        }
        String strMo1343 = mo1343();
        if (strMo1343 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo1343);
        }
        return sb.toString();
    }

    public abstract String mo1343();

    public abstract int mo1344();

    public String mo2414() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public String mo2415() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public final int m2442() {
        int i = this.f3467;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    public final String m2443() {
        int i = this.f3467;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : AbstractC1460.m3224(System.identityHashCode(this));
    }

    public abstract String mo1345();

    public abstract AbstractC0950 mo2416(C1089 c1089);

    public abstract AbstractC0950 mo2444(int i);

    public abstract AbstractC0950 mo1346(C2526 c2526);

    public abstract void mo1347(C0519 c0519);
}
