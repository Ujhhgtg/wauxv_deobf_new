package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0779 {

    public int f2877;

    public boolean f2878;

    public final C0793 f2879;

    public final int f2880;

    public C0779 f2881;

    public C2785 f2884;

    public HashSet f2876 = null;

    public int f2882 = 0;

    public int f2883 = -1;

    public C0779(C0793 c0793, int i) {
        this.f2879 = c0793;
        this.f2880 = i;
    }

    public final String toString() {
        return this.f2879.f3126 + ":" + AbstractC2784.m4758(this.f2880);
    }

    public final void m2270(C0779 c0779, int i) {
        m2271(c0779, i, -1, false);
    }

    public final boolean m2271(C0779 c0779, int i, int i2, boolean z) {
        if (c0779 == null) {
            m2279();
            return true;
        }
        if (!z && !m2278(c0779)) {
            return false;
        }
        this.f2881 = c0779;
        if (c0779.f2876 == null) {
            c0779.f2876 = new HashSet();
        }
        HashSet hashSet = this.f2881.f2876;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f2882 = i;
        } else {
            this.f2882 = 0;
        }
        this.f2883 = i2;
        return true;
    }

    public final void m2272(int i, C3639 c3639, ArrayList arrayList) {
        HashSet hashSet = this.f2876;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1270.m2979(((C0779) it.next()).f2879, i, arrayList, c3639);
            }
        }
    }

    public final int m2273() {
        if (this.f2878) {
            return this.f2877;
        }
        return 0;
    }

    public final int m2274() {
        C0779 c0779;
        if (this.f2879.f3125 == 8) {
            return 0;
        }
        int i = this.f2883;
        return (i <= -1 || (c0779 = this.f2881) == null || c0779.f2879.f3125 != 8) ? this.f2882 : i;
    }

    public final C0779 m2275() {
        int i = this.f2880;
        int iM4759 = AbstractC2784.m4759(i);
        C0793 c0793 = this.f2879;
        switch (iM4759) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0793.f3103;
            case 2:
                return c0793.f3104;
            case 3:
                return c0793.f3101;
            case 4:
                return c0793.f3102;
            default:
                throw new AssertionError(AbstractC2784.m4758(i));
        }
    }

    public final boolean m2276() {
        HashSet hashSet = this.f2876;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0779) it.next()).m2275().m2277()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m2277() {
        return this.f2881 != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[RETURN] */
    public final boolean m2278(C0779 c0779) {
        if (c0779 != null) {
            C0793 c0793 = c0779.f2879;
            int i = c0779.f2880;
            int i2 = this.f2880;
            if (i != i2) {
                switch (AbstractC2784.m4759(i2)) {
                    case 0:
                    case 5:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(c0793 instanceof C1506)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(c0793 instanceof C1506)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC2784.m4758(i2));
                }
            } else if (i2 != 6 || (c0793.f3097 && this.f2879.f3097)) {
                return true;
            }
        }
        return false;
    }

    public final void m2279() {
        HashSet hashSet;
        C0779 c0779 = this.f2881;
        if (c0779 != null && (hashSet = c0779.f2876) != null) {
            hashSet.remove(this);
            if (this.f2881.f2876.size() == 0) {
                this.f2881.f2876 = null;
            }
        }
        this.f2876 = null;
        this.f2881 = null;
        this.f2882 = 0;
        this.f2883 = -1;
        this.f2878 = false;
        this.f2877 = 0;
    }

    public final void m2280() {
        C2785 c2785 = this.f2884;
        if (c2785 == null) {
            this.f2884 = new C2785(1);
        } else {
            c2785.m4764();
        }
    }

    public final void m2281(int i) {
        this.f2877 = i;
        this.f2878 = true;
    }
}
