package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᤝᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2456 extends C0276 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2845[] f7823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2845[] f7824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7825;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2455 f7826;

    @Override // p000.C0276
    public final String toString() {
        C2455 c2455 = this.f7826;
        String str = " goal -> (" + this.f1537 + ") : ";
        for (int i = 0; i < this.f7825; i++) {
            c2455.f7821 = this.f7823[i];
            str = str + c2455 + " ";
        }
        return str;
    }

    @Override // p000.C0276
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final C2845 mo1516(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f7825; i2++) {
            C2845[] c2845Arr = this.f7823;
            C2845 c2845 = c2845Arr[i2];
            if (!zArr[c2845.f9048]) {
                C2455 c2455 = this.f7826;
                c2455.f7821 = c2845;
                int i3 = 8;
                if (i != -1) {
                    C2845 c2846 = c2845Arr[i];
                    while (i3 >= 0) {
                        float f = c2846.f9054[i3];
                        float f2 = c2455.f7821.f9054[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = c2455.f7821.f9054[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f7823[i];
    }

    @Override // p000.C0276
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo1517() {
        return this.f7825 == 0;
    }

    @Override // p000.C0276
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1521(C1814 c1814, C0276 c0276, boolean z) {
        C2845 c2845 = c0276.f1536;
        if (c2845 == null) {
            return;
        }
        float[] fArr = c2845.f9054;
        C0267 c0267 = c0276.f1539;
        int iM1504 = c0267.m1504();
        for (int i = 0; i < iM1504; i++) {
            C2845 c2845M1505 = c0267.m1505(i);
            float fM1506 = c0267.m1506(i);
            C2455 c2455 = this.f7826;
            c2455.f7821 = c2845M1505;
            if (c2845M1505.f9047) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c2455.f7821.f9054;
                    float f = (fArr[i2] * fM1506) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c2455.f7821.f9054[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c2455.f7822.m4394(c2455.f7821);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM1506;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c2455.f7821.f9054[i3] = f3;
                    } else {
                        c2455.f7821.f9054[i3] = 0.0f;
                    }
                }
                m4393(c2845M1505);
            }
            this.f1537 = (c0276.f1537 * fM1506) + this.f1537;
        }
        m4394(c2845);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4393(C2845 c2845) {
        int i;
        int i2 = this.f7825 + 1;
        C2845[] c2845Arr = this.f7823;
        if (i2 > c2845Arr.length) {
            C2845[] c2845Arr2 = (C2845[]) Arrays.copyOf(c2845Arr, c2845Arr.length * 2);
            this.f7823 = c2845Arr2;
            this.f7824 = (C2845[]) Arrays.copyOf(c2845Arr2, c2845Arr2.length * 2);
        }
        C2845[] c2845Arr3 = this.f7823;
        int i3 = this.f7825;
        c2845Arr3[i3] = c2845;
        int i4 = i3 + 1;
        this.f7825 = i4;
        if (i4 > 1 && c2845Arr3[i3].f9048 > c2845.f9048) {
            int i5 = 0;
            while (true) {
                i = this.f7825;
                if (i5 >= i) {
                    break;
                }
                this.f7824[i5] = this.f7823[i5];
                i5++;
            }
            Arrays.sort(this.f7824, 0, i, new C0179(18));
            for (int i6 = 0; i6 < this.f7825; i6++) {
                this.f7823[i6] = this.f7824[i6];
            }
        }
        c2845.f9047 = true;
        c2845.m4795(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m4394(C2845 c2845) {
        int i = 0;
        while (i < this.f7825) {
            if (this.f7823[i] == c2845) {
                while (true) {
                    int i2 = this.f7825;
                    if (i >= i2 - 1) {
                        this.f7825 = i2 - 1;
                        c2845.f9047 = false;
                        return;
                    } else {
                        C2845[] c2845Arr = this.f7823;
                        int i3 = i + 1;
                        c2845Arr[i] = c2845Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }
}
