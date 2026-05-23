package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2785 {

    public boolean f8885;

    public float f8889;

    public int f8896;

    public int f8886 = -1;

    public int f8887 = -1;

    public int f8888 = 0;

    public boolean f8890 = false;

    public final float[] f8891 = new float[9];

    public final float[] f8892 = new float[9];

    public C0266[] f8893 = new C0266[16];

    public int f8894 = 0;

    public int f8895 = 0;

    public C2785(int i) {
        this.f8896 = i;
    }

    public final String toString() {
        return "" + this.f8886;
    }

    public final void m4762(C0266 c0266) {
        int i = 0;
        while (true) {
            int i2 = this.f8894;
            if (i >= i2) {
                C0266[] c0266Arr = this.f8893;
                if (i2 >= c0266Arr.length) {
                    this.f8893 = (C0266[]) Arrays.copyOf(c0266Arr, c0266Arr.length * 2);
                }
                C0266[] c0266Arr2 = this.f8893;
                int i3 = this.f8894;
                c0266Arr2[i3] = c0266;
                this.f8894 = i3 + 1;
                return;
            }
            if (this.f8893[i] == c0266) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void m4763(C0266 c0266) {
        int i = this.f8894;
        int i2 = 0;
        while (i2 < i) {
            if (this.f8893[i2] == c0266) {
                while (i2 < i - 1) {
                    C0266[] c0266Arr = this.f8893;
                    int i3 = i2 + 1;
                    c0266Arr[i2] = c0266Arr[i3];
                    i2 = i3;
                }
                this.f8894--;
                return;
            }
            i2++;
        }
    }

    public final void m4764() {
        this.f8896 = 5;
        this.f8888 = 0;
        this.f8886 = -1;
        this.f8887 = -1;
        this.f8889 = 0.0f;
        this.f8890 = false;
        int i = this.f8894;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8893[i2] = null;
        }
        this.f8894 = 0;
        this.f8895 = 0;
        this.f8885 = false;
        Arrays.fill(this.f8892, 0.0f);
    }

    public final void m4765(C1791 c1791, float f) {
        this.f8889 = f;
        this.f8890 = true;
        int i = this.f8894;
        this.f8887 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8893[i2].m1374(c1791, this, false);
        }
        this.f8894 = 0;
    }

    public final void m4766(C1791 c1791, C0266 c0266) {
        int i = this.f8894;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8893[i2].mo1375(c1791, c0266, false);
        }
        this.f8894 = 0;
    }
}
