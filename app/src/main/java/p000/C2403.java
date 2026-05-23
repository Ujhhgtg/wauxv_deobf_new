package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2403 extends C0266 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2785[] f7679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2785[] f7680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2402 f7682;

    @Override // p000.C0266
    public final String toString() {
        C2402 c2402 = this.f7682;
        String str = " goal -> (" + this.f1463 + ") : ";
        for (int i = 0; i < this.f7681; i++) {
            c2402.f7677 = this.f7679[i];
            str = str + c2402 + " ";
        }
        return str;
    }

    @Override // p000.C0266
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final C2785 mo1370(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f7681; i2++) {
            C2785[] c2785Arr = this.f7679;
            C2785 c2785 = c2785Arr[i2];
            if (!zArr[c2785.f8886]) {
                C2402 c2402 = this.f7682;
                c2402.f7677 = c2785;
                int i3 = 8;
                if (i != -1) {
                    C2785 c2786 = c2785Arr[i];
                    while (i3 >= 0) {
                        float f = c2786.f8892[i3];
                        float f2 = c2402.f7677.f8892[i3];
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
                        float f3 = c2402.f7677.f8892[i3];
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
        return this.f7679[i];
    }

    @Override // p000.C0266
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo1371() {
        return this.f7681 == 0;
    }

    @Override // p000.C0266
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1375(C1791 c1791, C0266 c0266, boolean z) {
        C2785 c2785 = c0266.f1462;
        if (c2785 == null) {
            return;
        }
        float[] fArr = c2785.f8892;
        C0257 c0257 = c0266.f1465;
        int iM1358 = c0257.m1358();
        for (int i = 0; i < iM1358; i++) {
            C2785 c2785M1359 = c0257.m1359(i);
            float fM1360 = c0257.m1360(i);
            C2402 c2402 = this.f7682;
            c2402.f7677 = c2785M1359;
            if (c2785M1359.f8885) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c2402.f7677.f8892;
                    float f = (fArr[i2] * fM1360) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c2402.f7677.f8892[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c2402.f7678.m4373(c2402.f7677);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM1360;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c2402.f7677.f8892[i3] = f3;
                    } else {
                        c2402.f7677.f8892[i3] = 0.0f;
                    }
                }
                m4372(c2785M1359);
            }
            this.f1463 = (c0266.f1463 * fM1360) + this.f1463;
        }
        m4373(c2785);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4372(C2785 c2785) {
        int i;
        int i2 = this.f7681 + 1;
        C2785[] c2785Arr = this.f7679;
        if (i2 > c2785Arr.length) {
            C2785[] c2785Arr2 = (C2785[]) Arrays.copyOf(c2785Arr, c2785Arr.length * 2);
            this.f7679 = c2785Arr2;
            this.f7680 = (C2785[]) Arrays.copyOf(c2785Arr2, c2785Arr2.length * 2);
        }
        C2785[] c2785Arr3 = this.f7679;
        int i3 = this.f7681;
        c2785Arr3[i3] = c2785;
        int i4 = i3 + 1;
        this.f7681 = i4;
        if (i4 > 1 && c2785Arr3[i3].f8886 > c2785.f8886) {
            int i5 = 0;
            while (true) {
                i = this.f7681;
                if (i5 >= i) {
                    break;
                }
                this.f7680[i5] = this.f7679[i5];
                i5++;
            }
            Arrays.sort(this.f7680, 0, i, new C0171(11));
            for (int i6 = 0; i6 < this.f7681; i6++) {
                this.f7679[i6] = this.f7680[i6];
            }
        }
        c2785.f8885 = true;
        c2785.m4762(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m4373(C2785 c2785) {
        int i = 0;
        while (i < this.f7681) {
            if (this.f7679[i] == c2785) {
                while (true) {
                    int i2 = this.f7681;
                    if (i >= i2 - 1) {
                        this.f7681 = i2 - 1;
                        c2785.f8885 = false;
                        return;
                    } else {
                        C2785[] c2785Arr = this.f7679;
                        int i3 = i + 1;
                        c2785Arr[i] = c2785Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }
}
