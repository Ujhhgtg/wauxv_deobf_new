package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᛸᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2845 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f9047;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f9051;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f9058;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f9048 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f9049 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f9050 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f9052 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float[] f9053 = new float[9];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float[] f9054 = new float[9];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0276[] f9055 = new C0276[16];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f9056 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f9057 = 0;

    public C2845(int i) {
        this.f9058 = i;
    }

    public final String toString() {
        return "" + this.f9048;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4795(C0276 c0276) {
        int i = 0;
        while (true) {
            int i2 = this.f9056;
            if (i >= i2) {
                C0276[] c0276Arr = this.f9055;
                if (i2 >= c0276Arr.length) {
                    this.f9055 = (C0276[]) Arrays.copyOf(c0276Arr, c0276Arr.length * 2);
                }
                C0276[] c0276Arr2 = this.f9055;
                int i3 = this.f9056;
                c0276Arr2[i3] = c0276;
                this.f9056 = i3 + 1;
                return;
            }
            if (this.f9055[i] == c0276) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4796(C0276 c0276) {
        int i = this.f9056;
        int i2 = 0;
        while (i2 < i) {
            if (this.f9055[i2] == c0276) {
                while (i2 < i - 1) {
                    C0276[] c0276Arr = this.f9055;
                    int i3 = i2 + 1;
                    c0276Arr[i2] = c0276Arr[i3];
                    i2 = i3;
                }
                this.f9056--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4797() {
        this.f9058 = 5;
        this.f9050 = 0;
        this.f9048 = -1;
        this.f9049 = -1;
        this.f9051 = 0.0f;
        this.f9052 = false;
        int i = this.f9056;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9055[i2] = null;
        }
        this.f9056 = 0;
        this.f9057 = 0;
        this.f9047 = false;
        Arrays.fill(this.f9054, 0.0f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4798(C1814 c1814, float f) {
        this.f9051 = f;
        this.f9052 = true;
        int i = this.f9056;
        this.f9049 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9055[i2].m1520(c1814, this, false);
        }
        this.f9056 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4799(C1814 c1814, C0276 c0276) {
        int i = this.f9056;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9055[i2].mo1521(c1814, c0276, false);
        }
        this.f9056 = 0;
    }
}
