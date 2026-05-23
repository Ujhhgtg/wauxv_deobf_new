package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2527 extends AbstractC2106 {

    public final C2525[] f8059;

    public int f8060;

    static {
        new C2527(0);
    }

    public C2527(int i) {
        super(i != 0);
        this.f8059 = new C2525[i];
        this.f8060 = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2527)) {
            return false;
        }
        C2527 c2527 = (C2527) obj;
        C2525[] c2525Arr = c2527.f8059;
        C2525[] c2525Arr2 = this.f8059;
        int length = c2525Arr2.length;
        if (length != c2525Arr.length || size() != c2527.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C2525 c2525 = c2525Arr2[i];
            Object obj2 = c2525Arr[i];
            if (c2525 != obj2 && (c2525 == null || !c2525.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C2525[] c2525Arr = this.f8059;
        int length = c2525Arr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            C2525 c2525 = c2525Arr[i];
            iHashCode = (iHashCode * 31) + (c2525 == null ? 0 : c2525.hashCode());
        }
        return iHashCode;
    }

    public final int size() {
        int i = this.f8060;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C2525 c2525 : this.f8059) {
            if (c2525 != null) {
                i2++;
            }
        }
        this.f8060 = i2;
        return i2;
    }

    public final String toString() {
        C2525[] c2525Arr = this.f8059;
        StringBuilder sb = new StringBuilder(c2525Arr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C2525 c2525 : c2525Arr) {
            if (c2525 != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c2525);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final C2525 m4551(int i) {
        try {
            return this.f8059[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public final void m4552(C2525 c2525) {
        int i;
        C2525 c2526;
        C2525[] c2525Arr = this.f8059;
        m3925();
        if (c2525 == null) {
            throw new NullPointerException("spec == null");
        }
        this.f8060 = -1;
        try {
            int i2 = c2525.f8055;
            c2525Arr[i2] = c2525;
            if (i2 > 0 && (c2526 = c2525Arr[(i = i2 - 1)]) != null && c2526.m4540() == 2) {
                c2525Arr[i] = null;
            }
            if (c2525.m4540() == 2) {
                c2525Arr[i2 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    public final void m4553(C2525 c2525) {
        try {
            this.f8059[c2525.f8055] = null;
            this.f8060 = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }
}
