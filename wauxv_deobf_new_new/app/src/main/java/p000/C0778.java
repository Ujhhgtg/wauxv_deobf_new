package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0778 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2884;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f2885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0792 f2886;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f2887;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0778 f2888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2845 f2891;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public HashSet f2883 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f2889 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f2890 = -1;

    public C0778(C0792 c0792, int i) {
        this.f2886 = c0792;
        this.f2887 = i;
    }

    public final String toString() {
        return this.f2886.f3133 + ":" + AbstractC2844.m4791(this.f2887);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2385(C0778 c0778, int i) {
        m2386(c0778, i, -1, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m2386(C0778 c0778, int i, int i2, boolean z) {
        if (c0778 == null) {
            m2394();
            return true;
        }
        if (!z && !m2393(c0778)) {
            return false;
        }
        this.f2888 = c0778;
        if (c0778.f2883 == null) {
            c0778.f2883 = new HashSet();
        }
        HashSet hashSet = this.f2888.f2883;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f2889 = i;
        } else {
            this.f2889 = 0;
        }
        this.f2890 = i2;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2387(int i, C3699 c3699, ArrayList arrayList) {
        HashSet hashSet = this.f2883;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC2727.m4700(((C0778) it.next()).f2886, i, arrayList, c3699);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m2388() {
        if (this.f2885) {
            return this.f2884;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m2389() {
        C0778 c0778;
        if (this.f2886.f3132 == 8) {
            return 0;
        }
        int i = this.f2890;
        return (i <= -1 || (c0778 = this.f2888) == null || c0778.f2886.f3132 != 8) ? this.f2889 : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0778 m2390() {
        int i = this.f2887;
        int iM4792 = AbstractC2844.m4792(i);
        C0792 c0792 = this.f2886;
        switch (iM4792) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0792.f3110;
            case 2:
                return c0792.f3111;
            case 3:
                return c0792.f3108;
            case 4:
                return c0792.f3109;
            default:
                throw new AssertionError(AbstractC2844.m4791(i));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m2391() {
        HashSet hashSet = this.f2883;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0778) it.next()).m2390().m2392()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m2392() {
        return this.f2888 != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[RETURN] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m2393(C0778 c0778) {
        if (c0778 != null) {
            C0792 c0792 = c0778.f2886;
            int i = c0778.f2887;
            int i2 = this.f2887;
            if (i != i2) {
                switch (AbstractC2844.m4792(i2)) {
                    case 0:
                    case 5:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(c0792 instanceof C1518)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(c0792 instanceof C1518)) {
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
                        throw new AssertionError(AbstractC2844.m4791(i2));
                }
            } else if (i2 != 6 || (c0792.f3104 && this.f2886.f3104)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2394() {
        HashSet hashSet;
        C0778 c0778 = this.f2888;
        if (c0778 != null && (hashSet = c0778.f2883) != null) {
            hashSet.remove(this);
            if (this.f2888.f2883.size() == 0) {
                this.f2888.f2883 = null;
            }
        }
        this.f2883 = null;
        this.f2888 = null;
        this.f2889 = 0;
        this.f2890 = -1;
        this.f2885 = false;
        this.f2884 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2395() {
        C2845 c2845 = this.f2891;
        if (c2845 == null) {
            this.f2891 = new C2845(1);
        } else {
            c2845.m4797();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2396(int i) {
        this.f2884 = i;
        this.f2885 = true;
    }
}
