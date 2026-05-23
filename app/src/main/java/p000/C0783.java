package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0783 extends ViewGroup.MarginLayoutParams {

    public int f2899;

    public int f2900;

    public float f2901;

    public int f2902;

    public int f2903;

    public int f2904;

    public int f2905;

    public int f2906;

    public int f2907;

    public int f2908;

    public int f2909;

    public int f2910;

    public int f2911;

    public int f2912;

    public float f2913;

    public int f2914;

    public int f2915;

    public int f2916;

    public int f2917;

    public int f2918;

    public int f2919;

    public int f2920;

    public int f2921;

    public int f2922;

    public int f2923;

    public float f2924;

    public float f2925;

    public String f2926;

    public int f2927;

    public float f2928;

    public float f2929;

    public int f2930;

    public int f2931;

    public int f2932;

    public int f2933;

    public int f2934;

    public int f2935;

    public int f2936;

    public int f2937;

    public float f2938;

    public float f2939;

    public int f2940;

    public int f2941;

    public int f2942;

    public boolean f2943;

    public boolean f2944;

    public String f2945;

    public boolean f2946;

    public boolean f2947;

    public boolean f2948;

    public boolean f2949;

    public boolean f2950;

    public int f2951;

    public int f2952;

    public int f2953;

    public int f2954;

    public int f2955;

    public int f2956;

    public float f2957;

    public int f2958;

    public int f2959;

    public float f2960;

    public C0793 f2961;

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f2953 = -1;
        this.f2954 = -1;
        this.f2951 = -1;
        this.f2952 = -1;
        this.f2955 = this.f2918;
        this.f2956 = this.f2920;
        float f = this.f2924;
        this.f2957 = f;
        int i8 = this.f2899;
        this.f2958 = i8;
        int i9 = this.f2900;
        this.f2959 = i9;
        float f2 = this.f2901;
        this.f2960 = f2;
        if (z2) {
            int i10 = this.f2914;
            if (i10 != -1) {
                this.f2953 = i10;
            } else {
                int i11 = this.f2915;
                if (i11 != -1) {
                    this.f2954 = i11;
                } else {
                    i2 = this.f2916;
                    if (i2 != -1) {
                        this.f2952 = i2;
                        z = true;
                    }
                    i3 = this.f2917;
                    if (i3 != -1) {
                        this.f2951 = i3;
                        z = true;
                    }
                    i4 = this.f2922;
                    if (i4 != -1) {
                        this.f2956 = i4;
                    }
                    i5 = this.f2923;
                    if (i5 != -1) {
                        this.f2955 = i5;
                    }
                    if (z) {
                        this.f2957 = 1.0f - f;
                    }
                    if (this.f2949 && this.f2942 == 1) {
                        if (f2 != -1.0f) {
                            this.f2960 = 1.0f - f2;
                            this.f2958 = -1;
                            this.f2959 = -1;
                        } else if (i8 != -1) {
                            this.f2959 = i8;
                            this.f2958 = -1;
                            this.f2960 = -1.0f;
                        } else if (i9 != -1) {
                            this.f2958 = i9;
                            this.f2959 = -1;
                            this.f2960 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.f2916;
            if (i2 != -1) {
                this.f2952 = i2;
                z = true;
            }
            i3 = this.f2917;
            if (i3 != -1) {
                this.f2951 = i3;
                z = true;
            }
            i4 = this.f2922;
            if (i4 != -1) {
                this.f2956 = i4;
            }
            i5 = this.f2923;
            if (i5 != -1) {
                this.f2955 = i5;
            }
            if (true) {
                this.f2957 = 1.0f - f;
            }
            if (this.f2949) {
                if (f2 != -1.0f) {
                    this.f2960 = 1.0f - f2;
                    this.f2958 = -1;
                    this.f2959 = -1;
                } else if (i8 != -1) {
                    this.f2959 = i8;
                    this.f2958 = -1;
                    this.f2960 = -1.0f;
                } else if (i9 != -1) {
                    this.f2958 = i9;
                    this.f2959 = -1;
                    this.f2960 = -1.0f;
                }
            }
        } else {
            int i12 = this.f2914;
            if (i12 != -1) {
                this.f2952 = i12;
            }
            int i13 = this.f2915;
            if (i13 != -1) {
                this.f2951 = i13;
            }
            int i14 = this.f2916;
            if (i14 != -1) {
                this.f2953 = i14;
            }
            int i15 = this.f2917;
            if (i15 != -1) {
                this.f2954 = i15;
            }
            int i16 = this.f2922;
            if (i16 != -1) {
                this.f2955 = i16;
            }
            int i17 = this.f2923;
            if (i17 != -1) {
                this.f2956 = i17;
            }
        }
        if (this.f2916 == -1 && this.f2917 == -1 && this.f2915 == -1 && this.f2914 == -1) {
            int i18 = this.f2904;
            if (i18 != -1) {
                this.f2953 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f2905;
                if (i19 != -1) {
                    this.f2954 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f2902;
            if (i20 != -1) {
                this.f2951 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f2903;
            if (i21 != -1) {
                this.f2952 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }

    public final void m2291() {
        this.f2949 = false;
        this.f2946 = true;
        this.f2947 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f2943) {
            this.f2946 = false;
            if (this.f2932 == 0) {
                this.f2932 = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f2944) {
            this.f2947 = false;
            if (this.f2933 == 0) {
                this.f2933 = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f2946 = false;
            if (i == 0 && this.f2932 == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f2943 = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f2947 = false;
            if (i2 == 0 && this.f2933 == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f2944 = true;
            }
        }
        if (this.f2901 == -1.0f && this.f2899 == -1 && this.f2900 == -1) {
            return;
        }
        this.f2949 = true;
        this.f2946 = true;
        this.f2947 = true;
        if (!(this.f2961 instanceof C1506)) {
            this.f2961 = new C1506();
        }
        ((C1506) this.f2961).m3245(this.f2942);
    }
}
