package p000;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0793 {

    public C0582 f3074;

    public C0582 f3075;

    public final C0779 f3101;

    public final C0779 f3102;

    public final C0779 f3103;

    public final C0779 f3104;

    public final C0779 f3105;

    public final C0779 f3106;

    public final C0779 f3107;

    public final C0779 f3108;

    public final C0779[] f3109;

    public final ArrayList f3110;

    public final boolean[] f3111;

    public C0793 f3112;

    public int f3113;

    public int f3114;

    public float f3115;

    public int f3116;

    public int f3117;

    public int f3118;

    public int f3119;

    public int f3120;

    public int f3121;

    public float f3122;

    public float f3123;

    public View f3124;

    public int f3125;

    public String f3126;

    public int f3127;

    public int f3128;

    public final float[] f3129;

    public final C0793[] f3130;

    public final C0793[] f3131;

    public int f3132;

    public int f3133;

    public final int[] f3134;

    public boolean f3073 = false;

    public C1564 f3076 = null;

    public C3549 f3077 = null;

    public final boolean[] f3078 = {true, true};

    public boolean f3079 = true;

    public boolean f3080 = false;

    public boolean f3081 = false;

    public int f3082 = -1;

    public int f3083 = -1;

    public int f3084 = 0;

    public int f3085 = 0;

    public final int[] f3086 = new int[2];

    public int f3087 = 0;

    public int f3088 = 0;

    public float f3089 = 1.0f;

    public int f3090 = 0;

    public int f3091 = 0;

    public float f3092 = 1.0f;

    public int f3093 = -1;

    public float f3094 = 1.0f;

    public final int[] f3095 = {2147483647, 2147483647};

    public float f3096 = 0.0f;

    public boolean f3097 = false;

    public boolean f3098 = false;

    public int f3099 = 0;

    public int f3100 = 0;

    public C0793() {
        C0779 c0779 = new C0779(this, 2);
        this.f3101 = c0779;
        C0779 c07710 = new C0779(this, 3);
        this.f3102 = c07710;
        C0779 c07711 = new C0779(this, 4);
        this.f3103 = c07711;
        C0779 c07712 = new C0779(this, 5);
        this.f3104 = c07712;
        C0779 c07713 = new C0779(this, 6);
        this.f3105 = c07713;
        C0779 c07714 = new C0779(this, 8);
        this.f3106 = c07714;
        C0779 c07715 = new C0779(this, 9);
        this.f3107 = c07715;
        C0779 c07716 = new C0779(this, 7);
        this.f3108 = c07716;
        this.f3109 = new C0779[]{c0779, c07711, c07710, c07712, c07713, c07716};
        ArrayList arrayList = new ArrayList();
        this.f3110 = arrayList;
        this.f3111 = new boolean[2];
        this.f3134 = new int[]{1, 1};
        this.f3112 = null;
        this.f3113 = 0;
        this.f3114 = 0;
        this.f3115 = 0.0f;
        this.f3116 = -1;
        this.f3117 = 0;
        this.f3118 = 0;
        this.f3119 = 0;
        this.f3122 = 0.5f;
        this.f3123 = 0.5f;
        this.f3125 = 0;
        this.f3126 = null;
        this.f3127 = 0;
        this.f3128 = 0;
        this.f3129 = new float[]{-1.0f, -1.0f};
        this.f3130 = new C0793[]{null, null};
        this.f3131 = new C0793[]{null, null};
        this.f3132 = -1;
        this.f3133 = -1;
        arrayList.add(c0779);
        arrayList.add(c07710);
        arrayList.add(c07711);
        arrayList.add(c07712);
        arrayList.add(c07714);
        arrayList.add(c07715);
        arrayList.add(c07716);
        arrayList.add(c07713);
    }

    public String toString() {
        StringBuilder sbM4753 = AbstractC2784.m4753("");
        sbM4753.append(this.f3126 != null ? AbstractC2784.m4752(new StringBuilder("id: "), this.f3126, " ") : "");
        sbM4753.append("(");
        sbM4753.append(this.f3117);
        sbM4753.append(", ");
        sbM4753.append(this.f3118);
        sbM4753.append(") - (");
        sbM4753.append(this.f3113);
        sbM4753.append(" x ");
        return AbstractC2784.m4751(sbM4753, this.f3114, ")");
    }

    public final void m2305(C0794 c0794, C1791 c1791, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC2201.m3965(c0794, c1791, this);
            hashSet.remove(this);
            mo1485(c1791, c0794.m2343(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f3101.f2876;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C0779) it.next()).f2879.m2305(c0794, c1791, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.f3103.f2876;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C0779) it2.next()).f2879.m2305(c0794, c1791, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f3102.f2876;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C0779) it3.next()).f2879.m2305(c0794, c1791, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f3104.f2876;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C0779) it4.next()).f2879.m2305(c0794, c1791, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f3105.f2876;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C0779) it5.next()).f2879.m2305(c0794, c1791, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:239:0x0395  */
    /* JADX WARN: Code duplicated, block: B:241:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x039e  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:251:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:257:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:259:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:263:0x03df  */
    /* JADX WARN: Code duplicated, block: B:282:0x0428  */
    /* JADX WARN: Code duplicated, block: B:298:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:314:0x051c  */
    /* JADX WARN: Code duplicated, block: B:317:0x052e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0530  */
    /* JADX WARN: Code duplicated, block: B:321:0x0534  */
    /* JADX WARN: Code duplicated, block: B:359:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:361:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:363:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:364:0x061e  */
    /* JADX WARN: Code duplicated, block: B:367:0x064c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r57v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᤞᲇᲁᲈ] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    public void mo1485(C1791 c1791, boolean z) {
        char c;
        boolean z2;
        boolean z3;
        boolean z4;
        C0793 c0793;
        C0793 c0794;
        C0779 c0779;
        C0779 c07710;
        boolean zM2323;
        ?? r19;
        C2785 c2785;
        int i;
        int i2;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        int i5;
        C0779 c07711;
        boolean z8;
        boolean z9;
        int i6;
        int[] iArr;
        C2785 c2786;
        C2785 c2787;
        boolean z10;
        int[] iArr2;
        boolean z11;
        C2785 c2788;
        boolean z12;
        C0779 c07712;
        int i7;
        boolean z13;
        C2785 c2789;
        C2785 c27810;
        C2785 c27811;
        int i8;
        int i9;
        char c2;
        int i10;
        int i11;
        C0779 c07713;
        ?? r27;
        C3549 c3549;
        boolean z14;
        C1564 c1564;
        int i12;
        char c3;
        ?? M2322;
        C1564 c1565;
        C3549 c35410;
        boolean z15;
        C1791 c1792 = c1791;
        C0779 c07714 = this.f3101;
        C2785 c2785M3540 = c1792.m3540(c07714);
        C0779 c07715 = this.f3103;
        C2785 c2785M3541 = c1792.m3540(c07715);
        C0779 c07716 = this.f3102;
        C2785 c2785M3542 = c1792.m3540(c07716);
        C0779 c07717 = this.f3104;
        C2785 c2785M3543 = c1792.m3540(c07717);
        C0779 c07718 = this.f3105;
        C2785 c2785M3544 = c1792.m3540(c07718);
        C0793 c0795 = this.f3112;
        if (c0795 != null) {
            int[] iArr3 = c0795.f3134;
            c = 1;
            z3 = iArr3[0] == 2;
            z2 = iArr3[1] == 2;
        } else {
            c = 1;
            z2 = false;
            z3 = false;
        }
        int i13 = this.f3125;
        boolean[] zArr = this.f3111;
        boolean z16 = z2;
        if (i13 == 8) {
            ArrayList arrayList = this.f3110;
            int size = arrayList.size();
            z4 = z3;
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    if (zArr[0] || zArr[c]) {
                        break;
                        break;
                    }
                    return;
                }
                int i15 = size;
                HashSet hashSet = ((C0779) arrayList.get(i14)).f2876;
                if (hashSet != null && hashSet.size() > 0) {
                    break;
                }
                i14++;
                size = i15;
            }
        } else {
            z4 = z3;
        }
        boolean z17 = this.f3080;
        if (z17 || this.f3081) {
            if (z17) {
                c1792.m3533(c2785M3540, this.f3117);
                c1792.m3533(c2785M3541, this.f3117 + this.f3113);
                if (z4 && (c0794 = this.f3112) != null) {
                    C0794 c0796 = (C0794) c0794;
                    c0796.m2340(c07714);
                    WeakReference weakReference = c0796.f3153;
                    if (weakReference == null || weakReference.get() == null || c07715.m2273() > ((C0779) c0796.f3153.get()).m2273()) {
                        c0796.f3153 = new WeakReference(c07715);
                    }
                }
            }
            if (this.f3081) {
                c1792.m3533(c2785M3542, this.f3118);
                c1792.m3533(c2785M3543, this.f3118 + this.f3114);
                HashSet hashSet2 = c07718.f2876;
                if (hashSet2 != null && hashSet2.size() > 0) {
                    c1792.m3533(c2785M3544, this.f3118 + this.f3119);
                }
                if (z16 && (c0793 = this.f3112) != null) {
                    C0794 c0797 = (C0794) c0793;
                    c0797.m2340(c07716);
                    WeakReference weakReference2 = c0797.f3152;
                    if (weakReference2 == null || weakReference2.get() == null || c07717.m2273() > ((C0779) c0797.f3152.get()).m2273()) {
                        c0797.f3152 = new WeakReference(c07717);
                    }
                }
            }
            if (this.f3080 && this.f3081) {
                this.f3080 = false;
                this.f3081 = false;
                return;
            }
        }
        boolean[] zArr2 = this.f3078;
        if (!z || (c1565 = this.f3076) == null || (c35410 = this.f3077) == null) {
            c0779 = c07716;
            c07710 = c07717;
        } else {
            c0779 = c07716;
            C1014 c1014 = c1565.f11393;
            c07710 = c07717;
            if (c1014.f3710 && c1565.f11394.f3710 && c35410.f11393.f3710 && c35410.f11394.f3710) {
                c1792.m3533(c2785M3540, c1014.f3707);
                c1792.m3533(c2785M3541, this.f3076.f11394.f3707);
                c1792.m3533(c2785M3542, this.f3077.f11393.f3707);
                c1792.m3533(c2785M3543, this.f3077.f11394.f3707);
                c1792.m3533(c2785M3544, this.f3077.f11148.f3707);
                if (this.f3112 == null) {
                    z15 = false;
                } else {
                    if (z4 && zArr2[0] && !m2322()) {
                        c1792.m3535(c1792.m3540(this.f3112.f3103), c2785M3541, 0, 8);
                    }
                    if (z16 && zArr2[c] && !m2323()) {
                        z15 = false;
                        c1792.m3535(c1792.m3540(this.f3112.f3104), c2785M3543, 0, 8);
                    } else {
                        z15 = false;
                    }
                }
                this.f3080 = z15;
                this.f3081 = z15;
                return;
            }
        }
        if (this.f3112 != null) {
            if (m2321(0)) {
                ((C0794) this.f3112).m2338(this, 0);
                char c4 = c;
                c3 = c4 == true ? 1 : 0;
                M2322 = c4;
            } else {
                c3 = c;
                M2322 = m2322();
            }
            if (m2321(c3)) {
                ((C0794) this.f3112).m2338(this, c3);
                zM2323 = true;
            } else {
                zM2323 = m2323();
            }
            if (M2322 == 0 && z4 && this.f3125 != 8 && c07714.f2881 == null && c07715.f2881 == null) {
                c1792.m3535(c1792.m3540(this.f3112.f3103), c2785M3541, 0, 1);
            }
            r19 = M2322;
        } else {
            zM2323 = false;
            r19 = 0;
        }
        int i16 = this.f3113;
        int i17 = this.f3120;
        if (i16 >= i17) {
            i17 = i16;
        }
        int i18 = this.f3114;
        int i19 = this.f3121;
        int i20 = i18 < i19 ? i19 : i18;
        int[] iArr4 = this.f3134;
        int i21 = iArr4[0];
        boolean z18 = zM2323;
        boolean z19 = i21 != 3;
        int i22 = iArr4[1];
        boolean z20 = i22 != 3;
        int i23 = this.f3116;
        this.f3093 = i23;
        float f = this.f3115;
        this.f3094 = f;
        int i24 = this.f3084;
        int i25 = this.f3085;
        if (f > 0.0f) {
            c2785 = c2785M3544;
            if (this.f3125 != 8) {
                i2 = (i21 == 3 && i24 == 0) ? 3 : i24;
                int i26 = (i22 == 3 && i25 == 0) ? 3 : i25;
                if (i21 != 3 || i22 != 3 || i2 != 3 || i26 != 3) {
                    if (i21 == 3 && i2 == 3) {
                        this.f3093 = 0;
                        i17 = (int) (f * i18);
                        if (i22 != 3) {
                            c07710 = c07710;
                            i = i20;
                            i2 = 4;
                            z5 = false;
                        }
                        i3 = i26;
                        int[] iArr5 = this.f3086;
                        iArr5[0] = i2;
                        iArr5[1] = i3;
                        if (z5) {
                            int i27 = this.f3093;
                            i4 = -1;
                            if (i27 != 0) {
                            }
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (iArr4[0] == 2) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                i5 = 0;
                            } else {
                                i5 = i17;
                            }
                            c07711 = this.f3108;
                            z8 = !c07711.m2277();
                            z9 = z4;
                            boolean z21 = zArr[0];
                            boolean z22 = zArr[1];
                            i6 = this.f3082;
                            iArr = this.f3095;
                            C0779 c07719 = c07710;
                            if (i6 != 2) {
                                c2786 = c2785M3540;
                                c2787 = c2785M3541;
                                z10 = z9;
                                iArr2 = iArr;
                                z11 = z16;
                                c2788 = c2785M3542;
                                z12 = z18;
                                c07712 = c07711;
                                i7 = i2;
                                z13 = z8;
                            } else {
                                c2786 = c2785M3540;
                                c2787 = c2785M3541;
                                z10 = z9;
                                iArr2 = iArr;
                                z11 = z16;
                                c2788 = c2785M3542;
                                z12 = z18;
                                c07712 = c07711;
                                i7 = i2;
                                z13 = z8;
                            }
                            if (z) {
                                c2789 = c2788;
                                c27810 = r30;
                                c27811 = c2785;
                                i8 = 0;
                                i9 = 8;
                                c2 = 1;
                                i10 = 1;
                            } else {
                                c2789 = c2788;
                                c27810 = r30;
                                c27811 = c2785;
                                i8 = 0;
                                i9 = 8;
                                c2 = 1;
                                i10 = 1;
                            }
                            if (this.f3083 == 2) {
                                i11 = i8;
                            } else {
                                i11 = i10;
                            }
                            if (i11 == 0) {
                            }
                            if (z5) {
                                if (this.f3093 == 1) {
                                    float f2 = this.f3094;
                                    C0266 c0266M3541 = c1792.m3541();
                                    c0266M3541.f1465.m1361(c27810, -1.0f);
                                    c0266M3541.f1465.m1361(c2789, 1.0f);
                                    c0266M3541.f1465.m1361(c2787, f2);
                                    c0266M3541.f1465.m1361(c2786, -f2);
                                    c1792.m3532(c0266M3541);
                                } else {
                                    float f3 = this.f3094;
                                    C0266 c0266M3542 = c1792.m3541();
                                    c0266M3542.f1465.m1361(c2787, -1.0f);
                                    c0266M3542.f1465.m1361(c2786, 1.0f);
                                    c0266M3542.f1465.m1361(c27810, f3);
                                    c0266M3542.f1465.m1361(c2789, -f3);
                                    c1792.m3532(c0266M3542);
                                }
                            }
                            if (c07712.m2277()) {
                                C0779 c07720 = c07712;
                                C0793 c0798 = c07720.f2881.f2879;
                                float radians = (float) Math.toRadians(this.f3096 + 90.0f);
                                int iM2274 = c07720.m2274();
                                C2785 c2785M3545 = c1792.m3540(mo2311(2));
                                C2785 c2785M3546 = c1792.m3540(mo2311(3));
                                C2785 c2785M3547 = c1792.m3540(mo2311(4));
                                C2785 c2785M3548 = c1792.m3540(mo2311(5));
                                C2785 c2785M3549 = c1792.m3540(c0798.mo2311(2));
                                C2785 c2785M35410 = c1792.m3540(c0798.mo2311(3));
                                C2785 c2785M35411 = c1792.m3540(c0798.mo2311(4));
                                C2785 c2785M35412 = c1792.m3540(c0798.mo2311(5));
                                C0266 c0266M3543 = c1792.m3541();
                                double d = radians;
                                double dSin = Math.sin(d);
                                double d2 = iM2274;
                                c0266M3543.f1465.m1361(c2785M35410, 0.5f);
                                c0266M3543.f1465.m1361(c2785M35412, 0.5f);
                                c0266M3543.f1465.m1361(c2785M3546, -0.5f);
                                c0266M3543.f1465.m1361(c2785M3548, -0.5f);
                                c0266M3543.f1463 = -((float) (dSin * d2));
                                c1792.m3532(c0266M3543);
                                C0266 c0266M3544 = c1792.m3541();
                                float fCos = (float) (Math.cos(d) * d2);
                                c0266M3544.f1465.m1361(c2785M3549, 0.5f);
                                c0266M3544.f1465.m1361(c2785M35411, 0.5f);
                                c0266M3544.f1465.m1361(c2785M3545, -0.5f);
                                c0266M3544.f1465.m1361(c2785M3547, -0.5f);
                                c0266M3544.f1463 = -fCos;
                                c1792.m3532(c0266M3544);
                            }
                            this.f3080 = false;
                            this.f3081 = false;
                        }
                        i4 = -1;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (iArr4[0] == 2) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            i5 = 0;
                        } else {
                            i5 = i17;
                        }
                        c07711 = this.f3108;
                        z8 = !c07711.m2277();
                        z9 = z4;
                        boolean z23 = zArr[0];
                        boolean z24 = zArr[1];
                        i6 = this.f3082;
                        iArr = this.f3095;
                        C0779 c077110 = c07710;
                        if (i6 != 2) {
                            c2786 = c2785M3540;
                            c2787 = c2785M3541;
                            z10 = z9;
                            iArr2 = iArr;
                            z11 = z16;
                            c2788 = c2785M3542;
                            z12 = z18;
                            c07712 = c07711;
                            i7 = i2;
                            z13 = z8;
                        } else {
                            c2786 = c2785M3540;
                            c2787 = c2785M3541;
                            z10 = z9;
                            iArr2 = iArr;
                            z11 = z16;
                            c2788 = c2785M3542;
                            z12 = z18;
                            c07712 = c07711;
                            i7 = i2;
                            z13 = z8;
                        }
                        if (z) {
                            c2789 = c2788;
                            c27810 = r30;
                            c27811 = c2785;
                            i8 = 0;
                            i9 = 8;
                            c2 = 1;
                            i10 = 1;
                        } else {
                            c2789 = c2788;
                            c27810 = r30;
                            c27811 = c2785;
                            i8 = 0;
                            i9 = 8;
                            c2 = 1;
                            i10 = 1;
                        }
                        if (this.f3083 == 2) {
                            i11 = i8;
                        } else {
                            i11 = i10;
                        }
                        if (i11 == 0) {
                        }
                        if (z5) {
                            if (this.f3093 == 1) {
                                float f4 = this.f3094;
                                C0266 c0266M3545 = c1792.m3541();
                                c0266M3545.f1465.m1361(c27810, -1.0f);
                                c0266M3545.f1465.m1361(c2789, 1.0f);
                                c0266M3545.f1465.m1361(c2787, f4);
                                c0266M3545.f1465.m1361(c2786, -f4);
                                c1792.m3532(c0266M3545);
                            } else {
                                float f5 = this.f3094;
                                C0266 c0266M3546 = c1792.m3541();
                                c0266M3546.f1465.m1361(c2787, -1.0f);
                                c0266M3546.f1465.m1361(c2786, 1.0f);
                                c0266M3546.f1465.m1361(c27810, f5);
                                c0266M3546.f1465.m1361(c2789, -f5);
                                c1792.m3532(c0266M3546);
                            }
                        }
                        if (c07712.m2277()) {
                            C0779 c07721 = c07712;
                            C0793 c0799 = c07721.f2881.f2879;
                            float radians2 = (float) Math.toRadians(this.f3096 + 90.0f);
                            int iM2275 = c07721.m2274();
                            C2785 c2785M35413 = c1792.m3540(mo2311(2));
                            C2785 c2785M35414 = c1792.m3540(mo2311(3));
                            C2785 c2785M35415 = c1792.m3540(mo2311(4));
                            C2785 c2785M35416 = c1792.m3540(mo2311(5));
                            C2785 c2785M35417 = c1792.m3540(c0799.mo2311(2));
                            C2785 c2785M35418 = c1792.m3540(c0799.mo2311(3));
                            C2785 c2785M35419 = c1792.m3540(c0799.mo2311(4));
                            C2785 c2785M354110 = c1792.m3540(c0799.mo2311(5));
                            C0266 c0266M3547 = c1792.m3541();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iM2275;
                            c0266M3547.f1465.m1361(c2785M35418, 0.5f);
                            c0266M3547.f1465.m1361(c2785M354110, 0.5f);
                            c0266M3547.f1465.m1361(c2785M35414, -0.5f);
                            c0266M3547.f1465.m1361(c2785M35416, -0.5f);
                            c0266M3547.f1463 = -((float) (dSin2 * d4));
                            c1792.m3532(c0266M3547);
                            C0266 c0266M3548 = c1792.m3541();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            c0266M3548.f1465.m1361(c2785M35417, 0.5f);
                            c0266M3548.f1465.m1361(c2785M35419, 0.5f);
                            c0266M3548.f1465.m1361(c2785M35413, -0.5f);
                            c0266M3548.f1465.m1361(c2785M35415, -0.5f);
                            c0266M3548.f1463 = -fCos2;
                            c1792.m3532(c0266M3548);
                        }
                        this.f3080 = false;
                        this.f3081 = false;
                    }
                    if (i22 == 3 && i26 == 3) {
                        this.f3093 = 1;
                        if (i23 == -1) {
                            this.f3094 = 1.0f / f;
                        }
                        i = (int) (this.f3094 * i16);
                        if (i21 != 3) {
                            i2 = i2;
                            i3 = 4;
                        }
                    }
                    z5 = true;
                    i3 = i26;
                    int[] iArr6 = this.f3086;
                    iArr6[0] = i2;
                    iArr6[1] = i3;
                    if (z5) {
                        int i28 = this.f3093;
                        i4 = -1;
                        boolean z25 = i28 != 0 || i28 == -1;
                        if (z5 || !((i12 = this.f3093) == 1 || i12 == i4)) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (iArr4[0] == 2 || !(this instanceof C0794)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                            i5 = 0;
                        } else {
                            i5 = i17;
                        }
                        c07711 = this.f3108;
                        z8 = !c07711.m2277();
                        z9 = z4;
                        boolean z26 = zArr[0];
                        boolean z27 = zArr[1];
                        i6 = this.f3082;
                        iArr = this.f3095;
                        C0779 c077111 = c07710;
                        if (i6 != 2 || this.f3080) {
                            c2786 = c2785M3540;
                            c2787 = c2785M3541;
                            z10 = z9;
                            iArr2 = iArr;
                            z11 = z16;
                            c2788 = c2785M3542;
                            z12 = z18;
                            c07712 = c07711;
                            i7 = i2;
                            z13 = z8;
                        } else {
                            if (!z || (c1564 = this.f3076) == null) {
                                z14 = z25;
                            } else {
                                C1014 c1015 = c1564.f11393;
                                z14 = z25;
                                if (c1015.f3710 && c1564.f11394.f3710) {
                                    if (z) {
                                        c1792.m3533(c2785M3540, c1015.f3707);
                                        c1792.m3533(c2785M3541, this.f3076.f11394.f3707);
                                        if (this.f3112 != null && z9 && zArr2[0] && !m2322()) {
                                            c1792.m3535(c1792.m3540(this.f3112.f3103), c2785M3541, 0, 8);
                                        }
                                    }
                                    c2786 = c2785M3540;
                                    c2787 = c2785M3541;
                                    z10 = z9;
                                    iArr2 = iArr;
                                    z11 = z16;
                                    c2788 = c2785M3542;
                                    z12 = z18;
                                    c07712 = c07711;
                                    i7 = i2;
                                    z13 = z8;
                                }
                            }
                            C0793 c07910 = this.f3112;
                            C2785 c2785M35420 = c07910 != null ? c1792.m3540(c07910.f3103) : null;
                            C0793 c07911 = this.f3112;
                            C2785 c2785M35421 = c07911 != null ? c1792.m3540(c07911.f3101) : null;
                            i7 = i2;
                            z10 = z9;
                            iArr2 = iArr;
                            z12 = z18;
                            c07712 = c07711;
                            c2787 = c2785M3541;
                            c2786 = c2785M3540;
                            c2788 = c2785M3542;
                            c1792 = c1791;
                            boolean z28 = z8;
                            C2785 c27812 = c2785M35420;
                            z11 = z16;
                            m2306(c1792, true, z10, z11, zArr2[0], c2785M35421, c27812, iArr4[0], z7, c07714, c07715, this.f3117, i5, this.f3120, iArr2[0], this.f3122, z14, iArr4[1] == 3, r19, z12, z26, i7, i3, this.f3087, this.f3088, this.f3089, z28);
                            z13 = z28;
                        }
                        if (z || (c3549 = this.f3077) == null) {
                            c2789 = c2788;
                            c27810 = r30;
                            c27811 = c2785;
                            i8 = 0;
                            i9 = 8;
                            c2 = 1;
                            i10 = 1;
                        } else {
                            C1014 c1016 = c3549.f11393;
                            if (c1016.f3710 && c3549.f11394.f3710) {
                                int i29 = c1016.f3707;
                                c2789 = c2788;
                                c1792.m3533(c2789, i29);
                                c27810 = c2785M3543;
                                c1792.m3533(c27810, this.f3077.f11394.f3707);
                                c27811 = c2785;
                                c1792.m3533(c27811, this.f3077.f11148.f3707);
                                C0793 c07912 = this.f3112;
                                if (c07912 == null || z12 || !z11) {
                                    i8 = 0;
                                    i9 = 8;
                                    c2 = 1;
                                } else {
                                    c2 = 1;
                                    if (zArr2[1]) {
                                        i8 = 0;
                                        i9 = 8;
                                        c1792.m3535(c1792.m3540(c07912.f3104), c27810, 0, 8);
                                    } else {
                                        i8 = 0;
                                        i9 = 8;
                                    }
                                }
                                i10 = i8;
                            } else {
                                c2789 = c2788;
                                c27810 = r30;
                                c27811 = c2785;
                                i8 = 0;
                                i9 = 8;
                                c2 = 1;
                                i10 = 1;
                            }
                        }
                        if (this.f3083 == 2) {
                            i11 = i8;
                        } else {
                            i11 = i10;
                        }
                        if (i11 == 0 && !this.f3081) {
                            ?? r9 = (r27[c2] == 2 && (this instanceof C0794)) ? c2 : i8;
                            int i30 = r9 != 0 ? i8 : i;
                            C0793 c07913 = this.f3112;
                            C2785 c2785M35422 = c07913 != null ? c1792.m3540(c07913.f3104) : null;
                            C0793 c07914 = this.f3112;
                            C2785 c2785M35423 = c07914 != null ? c1792.m3540(c07914.f3102) : null;
                            int i31 = this.f3119;
                            if (i31 <= 0 && this.f3125 != i9) {
                                c07713 = c077111;
                                r27 = z13;
                            } else if (c07718.f2881 != null) {
                                c1792.m3534(c27811, c2789, i31, i9);
                                c1792.m3534(c27811, c1792.m3540(c07718.f2881), i8, i9);
                                c07713 = c077111;
                                if (z11) {
                                    c1792.m3535(c2785M35422, c1792.m3540(c07713), i8, 5);
                                }
                                r27 = i8;
                            } else {
                                c07713 = c077111;
                                if (this.f3125 == i9) {
                                    c1792.m3534(c27811, c2789, i8, i9);
                                    r27 = z13;
                                } else {
                                    c1792.m3534(c27811, c2789, i31, i9);
                                    r27 = z13;
                                }
                            }
                            boolean z29 = zArr2[c2];
                            int i32 = i8;
                            int i33 = r27[c2];
                            int i34 = this.f3118;
                            int i35 = this.f3121;
                            int i36 = iArr2[c2];
                            float f6 = this.f3123;
                            int i37 = iArr4[i32 == true ? 1 : 0];
                            ?? r18 = i32;
                            if (i37 == 3) {
                                r18 = c2;
                            }
                            c1792 = c1791;
                            m2306(c1792, false, z11, z10, z29, c2785M35423, c2785M35422, i33, r9, c0779, c07713, i34, i30, i35, i36, f6, z6, r18, z12, r19, z27, i3, i7, this.f3090, this.f3091, this.f3092, r27);
                        }
                        if (z5) {
                            if (this.f3093 == 1) {
                                float f7 = this.f3094;
                                C0266 c0266M3549 = c1792.m3541();
                                c0266M3549.f1465.m1361(c27810, -1.0f);
                                c0266M3549.f1465.m1361(c2789, 1.0f);
                                c0266M3549.f1465.m1361(c2787, f7);
                                c0266M3549.f1465.m1361(c2786, -f7);
                                c1792.m3532(c0266M3549);
                            } else {
                                float f8 = this.f3094;
                                C0266 c0266M35410 = c1792.m3541();
                                c0266M35410.f1465.m1361(c2787, -1.0f);
                                c0266M35410.f1465.m1361(c2786, 1.0f);
                                c0266M35410.f1465.m1361(c27810, f8);
                                c0266M35410.f1465.m1361(c2789, -f8);
                                c1792.m3532(c0266M35410);
                            }
                        }
                        if (c07712.m2277()) {
                            C0779 c07722 = c07712;
                            C0793 c07915 = c07722.f2881.f2879;
                            float radians3 = (float) Math.toRadians(this.f3096 + 90.0f);
                            int iM2276 = c07722.m2274();
                            C2785 c2785M354111 = c1792.m3540(mo2311(2));
                            C2785 c2785M354112 = c1792.m3540(mo2311(3));
                            C2785 c2785M354113 = c1792.m3540(mo2311(4));
                            C2785 c2785M354114 = c1792.m3540(mo2311(5));
                            C2785 c2785M354115 = c1792.m3540(c07915.mo2311(2));
                            C2785 c2785M354116 = c1792.m3540(c07915.mo2311(3));
                            C2785 c2785M354117 = c1792.m3540(c07915.mo2311(4));
                            C2785 c2785M354118 = c1792.m3540(c07915.mo2311(5));
                            C0266 c0266M35411 = c1792.m3541();
                            double d5 = radians3;
                            double dSin3 = Math.sin(d5);
                            double d6 = iM2276;
                            c0266M35411.f1465.m1361(c2785M354116, 0.5f);
                            c0266M35411.f1465.m1361(c2785M354118, 0.5f);
                            c0266M35411.f1465.m1361(c2785M354112, -0.5f);
                            c0266M35411.f1465.m1361(c2785M354114, -0.5f);
                            c0266M35411.f1463 = -((float) (dSin3 * d6));
                            c1792.m3532(c0266M35411);
                            C0266 c0266M35412 = c1792.m3541();
                            float fCos3 = (float) (Math.cos(d5) * d6);
                            c0266M35412.f1465.m1361(c2785M354115, 0.5f);
                            c0266M35412.f1465.m1361(c2785M354117, 0.5f);
                            c0266M35412.f1465.m1361(c2785M354111, -0.5f);
                            c0266M35412.f1465.m1361(c2785M354113, -0.5f);
                            c0266M35412.f1463 = -fCos3;
                            c1792.m3532(c0266M35412);
                        }
                        this.f3080 = false;
                        this.f3081 = false;
                    }
                    i4 = -1;
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (iArr4[0] == 2) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        i5 = 0;
                    } else {
                        i5 = i17;
                    }
                    c07711 = this.f3108;
                    z8 = !c07711.m2277();
                    z9 = z4;
                    boolean z210 = zArr[0];
                    boolean z211 = zArr[1];
                    i6 = this.f3082;
                    iArr = this.f3095;
                    C0779 c077112 = c07710;
                    if (i6 != 2) {
                        c2786 = c2785M3540;
                        c2787 = c2785M3541;
                        z10 = z9;
                        iArr2 = iArr;
                        z11 = z16;
                        c2788 = c2785M3542;
                        z12 = z18;
                        c07712 = c07711;
                        i7 = i2;
                        z13 = z8;
                    } else {
                        c2786 = c2785M3540;
                        c2787 = c2785M3541;
                        z10 = z9;
                        iArr2 = iArr;
                        z11 = z16;
                        c2788 = c2785M3542;
                        z12 = z18;
                        c07712 = c07711;
                        i7 = i2;
                        z13 = z8;
                    }
                    if (z) {
                        c2789 = c2788;
                        c27810 = r30;
                        c27811 = c2785;
                        i8 = 0;
                        i9 = 8;
                        c2 = 1;
                        i10 = 1;
                    } else {
                        c2789 = c2788;
                        c27810 = r30;
                        c27811 = c2785;
                        i8 = 0;
                        i9 = 8;
                        c2 = 1;
                        i10 = 1;
                    }
                    if (this.f3083 == 2) {
                        i11 = i8;
                    } else {
                        i11 = i10;
                    }
                    if (i11 == 0) {
                    }
                    if (z5) {
                        if (this.f3093 == 1) {
                            float f9 = this.f3094;
                            C0266 c0266M35413 = c1792.m3541();
                            c0266M35413.f1465.m1361(c27810, -1.0f);
                            c0266M35413.f1465.m1361(c2789, 1.0f);
                            c0266M35413.f1465.m1361(c2787, f9);
                            c0266M35413.f1465.m1361(c2786, -f9);
                            c1792.m3532(c0266M35413);
                        } else {
                            float f10 = this.f3094;
                            C0266 c0266M35414 = c1792.m3541();
                            c0266M35414.f1465.m1361(c2787, -1.0f);
                            c0266M35414.f1465.m1361(c2786, 1.0f);
                            c0266M35414.f1465.m1361(c27810, f10);
                            c0266M35414.f1465.m1361(c2789, -f10);
                            c1792.m3532(c0266M35414);
                        }
                    }
                    if (c07712.m2277()) {
                        C0779 c07723 = c07712;
                        C0793 c07916 = c07723.f2881.f2879;
                        float radians4 = (float) Math.toRadians(this.f3096 + 90.0f);
                        int iM2277 = c07723.m2274();
                        C2785 c2785M354119 = c1792.m3540(mo2311(2));
                        C2785 c2785M3541110 = c1792.m3540(mo2311(3));
                        C2785 c2785M3541111 = c1792.m3540(mo2311(4));
                        C2785 c2785M3541112 = c1792.m3540(mo2311(5));
                        C2785 c2785M3541113 = c1792.m3540(c07916.mo2311(2));
                        C2785 c2785M3541114 = c1792.m3540(c07916.mo2311(3));
                        C2785 c2785M3541115 = c1792.m3540(c07916.mo2311(4));
                        C2785 c2785M3541116 = c1792.m3540(c07916.mo2311(5));
                        C0266 c0266M35415 = c1792.m3541();
                        double d7 = radians4;
                        double dSin4 = Math.sin(d7);
                        double d8 = iM2277;
                        c0266M35415.f1465.m1361(c2785M3541114, 0.5f);
                        c0266M35415.f1465.m1361(c2785M3541116, 0.5f);
                        c0266M35415.f1465.m1361(c2785M3541110, -0.5f);
                        c0266M35415.f1465.m1361(c2785M3541112, -0.5f);
                        c0266M35415.f1463 = -((float) (dSin4 * d8));
                        c1792.m3532(c0266M35415);
                        C0266 c0266M35416 = c1792.m3541();
                        float fCos4 = (float) (Math.cos(d7) * d8);
                        c0266M35416.f1465.m1361(c2785M3541113, 0.5f);
                        c0266M35416.f1465.m1361(c2785M3541115, 0.5f);
                        c0266M35416.f1465.m1361(c2785M354119, -0.5f);
                        c0266M35416.f1465.m1361(c2785M3541111, -0.5f);
                        c0266M35416.f1463 = -fCos4;
                        c1792.m3532(c0266M35416);
                    }
                    this.f3080 = false;
                    this.f3081 = false;
                }
                if (i23 == -1) {
                    if (z19 && !z20) {
                        this.f3093 = 0;
                    } else if (!z19 && z20) {
                        this.f3093 = 1;
                        if (i23 == -1) {
                            this.f3094 = 1.0f / f;
                        }
                    }
                }
                if (this.f3093 == 0 && (!c0779.m2277() || !c07710.m2277())) {
                    this.f3093 = 1;
                } else if (this.f3093 == 1 && (!c07714.m2277() || !c07715.m2277())) {
                    this.f3093 = 0;
                }
                if (this.f3093 == -1 && (!c0779.m2277() || !c07710.m2277() || !c07714.m2277() || !c07715.m2277())) {
                    if (c0779.m2277() && c07710.m2277()) {
                        this.f3093 = 0;
                    } else if (c07714.m2277() && c07715.m2277()) {
                        this.f3094 = 1.0f / this.f3094;
                        this.f3093 = 1;
                    }
                }
                if (this.f3093 == -1) {
                    int i38 = this.f3087;
                    if (i38 > 0 && this.f3090 == 0) {
                        this.f3093 = 0;
                    } else if (i38 == 0 && this.f3090 > 0) {
                        this.f3094 = 1.0f / this.f3094;
                        this.f3093 = 1;
                    }
                }
                i = i20;
                z5 = true;
                i3 = i26;
                int[] iArr7 = this.f3086;
                iArr7[0] = i2;
                iArr7[1] = i3;
                if (z5) {
                    int i210 = this.f3093;
                    i4 = -1;
                    if (i210 != 0) {
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (iArr4[0] == 2) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        i5 = 0;
                    } else {
                        i5 = i17;
                    }
                    c07711 = this.f3108;
                    z8 = !c07711.m2277();
                    z9 = z4;
                    boolean z212 = zArr[0];
                    boolean z213 = zArr[1];
                    i6 = this.f3082;
                    iArr = this.f3095;
                    C0779 c077113 = c07710;
                    if (i6 != 2) {
                        c2786 = c2785M3540;
                        c2787 = c2785M3541;
                        z10 = z9;
                        iArr2 = iArr;
                        z11 = z16;
                        c2788 = c2785M3542;
                        z12 = z18;
                        c07712 = c07711;
                        i7 = i2;
                        z13 = z8;
                    } else {
                        c2786 = c2785M3540;
                        c2787 = c2785M3541;
                        z10 = z9;
                        iArr2 = iArr;
                        z11 = z16;
                        c2788 = c2785M3542;
                        z12 = z18;
                        c07712 = c07711;
                        i7 = i2;
                        z13 = z8;
                    }
                    if (z) {
                        c2789 = c2788;
                        c27810 = r30;
                        c27811 = c2785;
                        i8 = 0;
                        i9 = 8;
                        c2 = 1;
                        i10 = 1;
                    } else {
                        c2789 = c2788;
                        c27810 = r30;
                        c27811 = c2785;
                        i8 = 0;
                        i9 = 8;
                        c2 = 1;
                        i10 = 1;
                    }
                    if (this.f3083 == 2) {
                        i11 = i8;
                    } else {
                        i11 = i10;
                    }
                    if (i11 == 0) {
                    }
                    if (z5) {
                        if (this.f3093 == 1) {
                            float f11 = this.f3094;
                            C0266 c0266M35417 = c1792.m3541();
                            c0266M35417.f1465.m1361(c27810, -1.0f);
                            c0266M35417.f1465.m1361(c2789, 1.0f);
                            c0266M35417.f1465.m1361(c2787, f11);
                            c0266M35417.f1465.m1361(c2786, -f11);
                            c1792.m3532(c0266M35417);
                        } else {
                            float f12 = this.f3094;
                            C0266 c0266M35418 = c1792.m3541();
                            c0266M35418.f1465.m1361(c2787, -1.0f);
                            c0266M35418.f1465.m1361(c2786, 1.0f);
                            c0266M35418.f1465.m1361(c27810, f12);
                            c0266M35418.f1465.m1361(c2789, -f12);
                            c1792.m3532(c0266M35418);
                        }
                    }
                    if (c07712.m2277()) {
                        C0779 c07724 = c07712;
                        C0793 c07917 = c07724.f2881.f2879;
                        float radians5 = (float) Math.toRadians(this.f3096 + 90.0f);
                        int iM2278 = c07724.m2274();
                        C2785 c2785M3541117 = c1792.m3540(mo2311(2));
                        C2785 c2785M3541118 = c1792.m3540(mo2311(3));
                        C2785 c2785M3541119 = c1792.m3540(mo2311(4));
                        C2785 c2785M35411110 = c1792.m3540(mo2311(5));
                        C2785 c2785M35411111 = c1792.m3540(c07917.mo2311(2));
                        C2785 c2785M35411112 = c1792.m3540(c07917.mo2311(3));
                        C2785 c2785M35411113 = c1792.m3540(c07917.mo2311(4));
                        C2785 c2785M35411114 = c1792.m3540(c07917.mo2311(5));
                        C0266 c0266M35419 = c1792.m3541();
                        double d9 = radians5;
                        double dSin5 = Math.sin(d9);
                        double d10 = iM2278;
                        c0266M35419.f1465.m1361(c2785M35411112, 0.5f);
                        c0266M35419.f1465.m1361(c2785M35411114, 0.5f);
                        c0266M35419.f1465.m1361(c2785M3541118, -0.5f);
                        c0266M35419.f1465.m1361(c2785M35411110, -0.5f);
                        c0266M35419.f1463 = -((float) (dSin5 * d10));
                        c1792.m3532(c0266M35419);
                        C0266 c0266M354110 = c1792.m3541();
                        float fCos5 = (float) (Math.cos(d9) * d10);
                        c0266M354110.f1465.m1361(c2785M35411111, 0.5f);
                        c0266M354110.f1465.m1361(c2785M35411113, 0.5f);
                        c0266M354110.f1465.m1361(c2785M3541117, -0.5f);
                        c0266M354110.f1465.m1361(c2785M3541119, -0.5f);
                        c0266M354110.f1463 = -fCos5;
                        c1792.m3532(c0266M354110);
                    }
                    this.f3080 = false;
                    this.f3081 = false;
                }
                i4 = -1;
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (iArr4[0] == 2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i5 = 0;
                } else {
                    i5 = i17;
                }
                c07711 = this.f3108;
                z8 = !c07711.m2277();
                z9 = z4;
                boolean z214 = zArr[0];
                boolean z215 = zArr[1];
                i6 = this.f3082;
                iArr = this.f3095;
                C0779 c077114 = c07710;
                if (i6 != 2) {
                    c2786 = c2785M3540;
                    c2787 = c2785M3541;
                    z10 = z9;
                    iArr2 = iArr;
                    z11 = z16;
                    c2788 = c2785M3542;
                    z12 = z18;
                    c07712 = c07711;
                    i7 = i2;
                    z13 = z8;
                } else {
                    c2786 = c2785M3540;
                    c2787 = c2785M3541;
                    z10 = z9;
                    iArr2 = iArr;
                    z11 = z16;
                    c2788 = c2785M3542;
                    z12 = z18;
                    c07712 = c07711;
                    i7 = i2;
                    z13 = z8;
                }
                if (z) {
                    c2789 = c2788;
                    c27810 = r30;
                    c27811 = c2785;
                    i8 = 0;
                    i9 = 8;
                    c2 = 1;
                    i10 = 1;
                } else {
                    c2789 = c2788;
                    c27810 = r30;
                    c27811 = c2785;
                    i8 = 0;
                    i9 = 8;
                    c2 = 1;
                    i10 = 1;
                }
                if (this.f3083 == 2) {
                    i11 = i8;
                } else {
                    i11 = i10;
                }
                if (i11 == 0) {
                }
                if (z5) {
                    if (this.f3093 == 1) {
                        float f13 = this.f3094;
                        C0266 c0266M354111 = c1792.m3541();
                        c0266M354111.f1465.m1361(c27810, -1.0f);
                        c0266M354111.f1465.m1361(c2789, 1.0f);
                        c0266M354111.f1465.m1361(c2787, f13);
                        c0266M354111.f1465.m1361(c2786, -f13);
                        c1792.m3532(c0266M354111);
                    } else {
                        float f14 = this.f3094;
                        C0266 c0266M354112 = c1792.m3541();
                        c0266M354112.f1465.m1361(c2787, -1.0f);
                        c0266M354112.f1465.m1361(c2786, 1.0f);
                        c0266M354112.f1465.m1361(c27810, f14);
                        c0266M354112.f1465.m1361(c2789, -f14);
                        c1792.m3532(c0266M354112);
                    }
                }
                if (c07712.m2277()) {
                    C0779 c07725 = c07712;
                    C0793 c07918 = c07725.f2881.f2879;
                    float radians6 = (float) Math.toRadians(this.f3096 + 90.0f);
                    int iM2279 = c07725.m2274();
                    C2785 c2785M35411115 = c1792.m3540(mo2311(2));
                    C2785 c2785M35411116 = c1792.m3540(mo2311(3));
                    C2785 c2785M35411117 = c1792.m3540(mo2311(4));
                    C2785 c2785M35411118 = c1792.m3540(mo2311(5));
                    C2785 c2785M35411119 = c1792.m3540(c07918.mo2311(2));
                    C2785 c2785M354111110 = c1792.m3540(c07918.mo2311(3));
                    C2785 c2785M354111111 = c1792.m3540(c07918.mo2311(4));
                    C2785 c2785M354111112 = c1792.m3540(c07918.mo2311(5));
                    C0266 c0266M354113 = c1792.m3541();
                    double d11 = radians6;
                    double dSin6 = Math.sin(d11);
                    double d12 = iM2279;
                    c0266M354113.f1465.m1361(c2785M354111110, 0.5f);
                    c0266M354113.f1465.m1361(c2785M354111112, 0.5f);
                    c0266M354113.f1465.m1361(c2785M35411116, -0.5f);
                    c0266M354113.f1465.m1361(c2785M35411118, -0.5f);
                    c0266M354113.f1463 = -((float) (dSin6 * d12));
                    c1792.m3532(c0266M354113);
                    C0266 c0266M354114 = c1792.m3541();
                    float fCos6 = (float) (Math.cos(d11) * d12);
                    c0266M354114.f1465.m1361(c2785M35411119, 0.5f);
                    c0266M354114.f1465.m1361(c2785M354111111, 0.5f);
                    c0266M354114.f1465.m1361(c2785M35411115, -0.5f);
                    c0266M354114.f1465.m1361(c2785M35411117, -0.5f);
                    c0266M354114.f1463 = -fCos6;
                    c1792.m3532(c0266M354114);
                }
                this.f3080 = false;
                this.f3081 = false;
            }
            z5 = false;
            int[] iArr8 = this.f3086;
            iArr8[0] = i2;
            iArr8[1] = i3;
            if (z5) {
                int i211 = this.f3093;
                i4 = -1;
                if (i211 != 0) {
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (iArr4[0] == 2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i5 = 0;
                } else {
                    i5 = i17;
                }
                c07711 = this.f3108;
                z8 = !c07711.m2277();
                z9 = z4;
                boolean z216 = zArr[0];
                boolean z217 = zArr[1];
                i6 = this.f3082;
                iArr = this.f3095;
                C0779 c077115 = c07710;
                if (i6 != 2) {
                    c2786 = c2785M3540;
                    c2787 = c2785M3541;
                    z10 = z9;
                    iArr2 = iArr;
                    z11 = z16;
                    c2788 = c2785M3542;
                    z12 = z18;
                    c07712 = c07711;
                    i7 = i2;
                    z13 = z8;
                } else {
                    c2786 = c2785M3540;
                    c2787 = c2785M3541;
                    z10 = z9;
                    iArr2 = iArr;
                    z11 = z16;
                    c2788 = c2785M3542;
                    z12 = z18;
                    c07712 = c07711;
                    i7 = i2;
                    z13 = z8;
                }
                if (z) {
                    c2789 = c2788;
                    c27810 = r30;
                    c27811 = c2785;
                    i8 = 0;
                    i9 = 8;
                    c2 = 1;
                    i10 = 1;
                } else {
                    c2789 = c2788;
                    c27810 = r30;
                    c27811 = c2785;
                    i8 = 0;
                    i9 = 8;
                    c2 = 1;
                    i10 = 1;
                }
                if (this.f3083 == 2) {
                    i11 = i8;
                } else {
                    i11 = i10;
                }
                if (i11 == 0) {
                }
                if (z5) {
                    if (this.f3093 == 1) {
                        float f15 = this.f3094;
                        C0266 c0266M354115 = c1792.m3541();
                        c0266M354115.f1465.m1361(c27810, -1.0f);
                        c0266M354115.f1465.m1361(c2789, 1.0f);
                        c0266M354115.f1465.m1361(c2787, f15);
                        c0266M354115.f1465.m1361(c2786, -f15);
                        c1792.m3532(c0266M354115);
                    } else {
                        float f16 = this.f3094;
                        C0266 c0266M354116 = c1792.m3541();
                        c0266M354116.f1465.m1361(c2787, -1.0f);
                        c0266M354116.f1465.m1361(c2786, 1.0f);
                        c0266M354116.f1465.m1361(c27810, f16);
                        c0266M354116.f1465.m1361(c2789, -f16);
                        c1792.m3532(c0266M354116);
                    }
                }
                if (c07712.m2277()) {
                    C0779 c07726 = c07712;
                    C0793 c07919 = c07726.f2881.f2879;
                    float radians7 = (float) Math.toRadians(this.f3096 + 90.0f);
                    int iM22710 = c07726.m2274();
                    C2785 c2785M354111113 = c1792.m3540(mo2311(2));
                    C2785 c2785M354111114 = c1792.m3540(mo2311(3));
                    C2785 c2785M354111115 = c1792.m3540(mo2311(4));
                    C2785 c2785M354111116 = c1792.m3540(mo2311(5));
                    C2785 c2785M354111117 = c1792.m3540(c07919.mo2311(2));
                    C2785 c2785M354111118 = c1792.m3540(c07919.mo2311(3));
                    C2785 c2785M354111119 = c1792.m3540(c07919.mo2311(4));
                    C2785 c2785M3541111110 = c1792.m3540(c07919.mo2311(5));
                    C0266 c0266M354117 = c1792.m3541();
                    double d13 = radians7;
                    double dSin7 = Math.sin(d13);
                    double d14 = iM22710;
                    c0266M354117.f1465.m1361(c2785M354111118, 0.5f);
                    c0266M354117.f1465.m1361(c2785M3541111110, 0.5f);
                    c0266M354117.f1465.m1361(c2785M354111114, -0.5f);
                    c0266M354117.f1465.m1361(c2785M354111116, -0.5f);
                    c0266M354117.f1463 = -((float) (dSin7 * d14));
                    c1792.m3532(c0266M354117);
                    C0266 c0266M354118 = c1792.m3541();
                    float fCos7 = (float) (Math.cos(d13) * d14);
                    c0266M354118.f1465.m1361(c2785M354111117, 0.5f);
                    c0266M354118.f1465.m1361(c2785M354111119, 0.5f);
                    c0266M354118.f1465.m1361(c2785M354111113, -0.5f);
                    c0266M354118.f1465.m1361(c2785M354111115, -0.5f);
                    c0266M354118.f1463 = -fCos7;
                    c1792.m3532(c0266M354118);
                }
                this.f3080 = false;
                this.f3081 = false;
            }
            i4 = -1;
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (iArr4[0] == 2) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z7) {
                i5 = 0;
            } else {
                i5 = i17;
            }
            c07711 = this.f3108;
            z8 = !c07711.m2277();
            z9 = z4;
            boolean z218 = zArr[0];
            boolean z219 = zArr[1];
            i6 = this.f3082;
            iArr = this.f3095;
            C0779 c077116 = c07710;
            if (i6 != 2) {
                c2786 = c2785M3540;
                c2787 = c2785M3541;
                z10 = z9;
                iArr2 = iArr;
                z11 = z16;
                c2788 = c2785M3542;
                z12 = z18;
                c07712 = c07711;
                i7 = i2;
                z13 = z8;
            } else {
                c2786 = c2785M3540;
                c2787 = c2785M3541;
                z10 = z9;
                iArr2 = iArr;
                z11 = z16;
                c2788 = c2785M3542;
                z12 = z18;
                c07712 = c07711;
                i7 = i2;
                z13 = z8;
            }
            if (z) {
                c2789 = c2788;
                c27810 = r30;
                c27811 = c2785;
                i8 = 0;
                i9 = 8;
                c2 = 1;
                i10 = 1;
            } else {
                c2789 = c2788;
                c27810 = r30;
                c27811 = c2785;
                i8 = 0;
                i9 = 8;
                c2 = 1;
                i10 = 1;
            }
            if (this.f3083 == 2) {
                i11 = i8;
            } else {
                i11 = i10;
            }
            if (i11 == 0) {
            }
            if (z5) {
                if (this.f3093 == 1) {
                    float f17 = this.f3094;
                    C0266 c0266M354119 = c1792.m3541();
                    c0266M354119.f1465.m1361(c27810, -1.0f);
                    c0266M354119.f1465.m1361(c2789, 1.0f);
                    c0266M354119.f1465.m1361(c2787, f17);
                    c0266M354119.f1465.m1361(c2786, -f17);
                    c1792.m3532(c0266M354119);
                } else {
                    float f18 = this.f3094;
                    C0266 c0266M3541110 = c1792.m3541();
                    c0266M3541110.f1465.m1361(c2787, -1.0f);
                    c0266M3541110.f1465.m1361(c2786, 1.0f);
                    c0266M3541110.f1465.m1361(c27810, f18);
                    c0266M3541110.f1465.m1361(c2789, -f18);
                    c1792.m3532(c0266M3541110);
                }
            }
            if (c07712.m2277()) {
                C0779 c07727 = c07712;
                C0793 c079110 = c07727.f2881.f2879;
                float radians8 = (float) Math.toRadians(this.f3096 + 90.0f);
                int iM22711 = c07727.m2274();
                C2785 c2785M3541111111 = c1792.m3540(mo2311(2));
                C2785 c2785M3541111112 = c1792.m3540(mo2311(3));
                C2785 c2785M3541111113 = c1792.m3540(mo2311(4));
                C2785 c2785M3541111114 = c1792.m3540(mo2311(5));
                C2785 c2785M3541111115 = c1792.m3540(c079110.mo2311(2));
                C2785 c2785M3541111116 = c1792.m3540(c079110.mo2311(3));
                C2785 c2785M3541111117 = c1792.m3540(c079110.mo2311(4));
                C2785 c2785M3541111118 = c1792.m3540(c079110.mo2311(5));
                C0266 c0266M3541111 = c1792.m3541();
                double d15 = radians8;
                double dSin8 = Math.sin(d15);
                double d16 = iM22711;
                c0266M3541111.f1465.m1361(c2785M3541111116, 0.5f);
                c0266M3541111.f1465.m1361(c2785M3541111118, 0.5f);
                c0266M3541111.f1465.m1361(c2785M3541111112, -0.5f);
                c0266M3541111.f1465.m1361(c2785M3541111114, -0.5f);
                c0266M3541111.f1463 = -((float) (dSin8 * d16));
                c1792.m3532(c0266M3541111);
                C0266 c0266M3541112 = c1792.m3541();
                float fCos8 = (float) (Math.cos(d15) * d16);
                c0266M3541112.f1465.m1361(c2785M3541111115, 0.5f);
                c0266M3541112.f1465.m1361(c2785M3541111117, 0.5f);
                c0266M3541112.f1465.m1361(c2785M3541111111, -0.5f);
                c0266M3541112.f1465.m1361(c2785M3541111113, -0.5f);
                c0266M3541112.f1463 = -fCos8;
                c1792.m3532(c0266M3541112);
            }
            this.f3080 = false;
            this.f3081 = false;
        }
        c2785 = c2785M3544;
        c07714 = c07714;
        i = i20;
        i2 = i24;
        i3 = i25;
        z5 = false;
        int[] iArr9 = this.f3086;
        iArr9[0] = i2;
        iArr9[1] = i3;
        if (z5) {
            int i212 = this.f3093;
            i4 = -1;
            if (i212 != 0) {
            }
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (iArr4[0] == 2) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z7) {
                i5 = 0;
            } else {
                i5 = i17;
            }
            c07711 = this.f3108;
            z8 = !c07711.m2277();
            z9 = z4;
            boolean z2110 = zArr[0];
            boolean z2111 = zArr[1];
            i6 = this.f3082;
            iArr = this.f3095;
            C0779 c077117 = c07710;
            if (i6 != 2) {
                c2786 = c2785M3540;
                c2787 = c2785M3541;
                z10 = z9;
                iArr2 = iArr;
                z11 = z16;
                c2788 = c2785M3542;
                z12 = z18;
                c07712 = c07711;
                i7 = i2;
                z13 = z8;
            } else {
                c2786 = c2785M3540;
                c2787 = c2785M3541;
                z10 = z9;
                iArr2 = iArr;
                z11 = z16;
                c2788 = c2785M3542;
                z12 = z18;
                c07712 = c07711;
                i7 = i2;
                z13 = z8;
            }
            if (z) {
                c2789 = c2788;
                c27810 = r30;
                c27811 = c2785;
                i8 = 0;
                i9 = 8;
                c2 = 1;
                i10 = 1;
            } else {
                c2789 = c2788;
                c27810 = r30;
                c27811 = c2785;
                i8 = 0;
                i9 = 8;
                c2 = 1;
                i10 = 1;
            }
            if (this.f3083 == 2) {
                i11 = i8;
            } else {
                i11 = i10;
            }
            if (i11 == 0) {
            }
            if (z5) {
                if (this.f3093 == 1) {
                    float f19 = this.f3094;
                    C0266 c0266M3541113 = c1792.m3541();
                    c0266M3541113.f1465.m1361(c27810, -1.0f);
                    c0266M3541113.f1465.m1361(c2789, 1.0f);
                    c0266M3541113.f1465.m1361(c2787, f19);
                    c0266M3541113.f1465.m1361(c2786, -f19);
                    c1792.m3532(c0266M3541113);
                } else {
                    float f110 = this.f3094;
                    C0266 c0266M3541114 = c1792.m3541();
                    c0266M3541114.f1465.m1361(c2787, -1.0f);
                    c0266M3541114.f1465.m1361(c2786, 1.0f);
                    c0266M3541114.f1465.m1361(c27810, f110);
                    c0266M3541114.f1465.m1361(c2789, -f110);
                    c1792.m3532(c0266M3541114);
                }
            }
            if (c07712.m2277()) {
                C0779 c07728 = c07712;
                C0793 c079111 = c07728.f2881.f2879;
                float radians9 = (float) Math.toRadians(this.f3096 + 90.0f);
                int iM22712 = c07728.m2274();
                C2785 c2785M3541111119 = c1792.m3540(mo2311(2));
                C2785 c2785M35411111110 = c1792.m3540(mo2311(3));
                C2785 c2785M35411111111 = c1792.m3540(mo2311(4));
                C2785 c2785M35411111112 = c1792.m3540(mo2311(5));
                C2785 c2785M35411111113 = c1792.m3540(c079111.mo2311(2));
                C2785 c2785M35411111114 = c1792.m3540(c079111.mo2311(3));
                C2785 c2785M35411111115 = c1792.m3540(c079111.mo2311(4));
                C2785 c2785M35411111116 = c1792.m3540(c079111.mo2311(5));
                C0266 c0266M3541115 = c1792.m3541();
                double d17 = radians9;
                double dSin9 = Math.sin(d17);
                double d18 = iM22712;
                c0266M3541115.f1465.m1361(c2785M35411111114, 0.5f);
                c0266M3541115.f1465.m1361(c2785M35411111116, 0.5f);
                c0266M3541115.f1465.m1361(c2785M35411111110, -0.5f);
                c0266M3541115.f1465.m1361(c2785M35411111112, -0.5f);
                c0266M3541115.f1463 = -((float) (dSin9 * d18));
                c1792.m3532(c0266M3541115);
                C0266 c0266M3541116 = c1792.m3541();
                float fCos9 = (float) (Math.cos(d17) * d18);
                c0266M3541116.f1465.m1361(c2785M35411111113, 0.5f);
                c0266M3541116.f1465.m1361(c2785M35411111115, 0.5f);
                c0266M3541116.f1465.m1361(c2785M3541111119, -0.5f);
                c0266M3541116.f1465.m1361(c2785M35411111111, -0.5f);
                c0266M3541116.f1463 = -fCos9;
                c1792.m3532(c0266M3541116);
            }
            this.f3080 = false;
            this.f3081 = false;
        }
        i4 = -1;
        if (z5) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (iArr4[0] == 2) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (z7) {
            i5 = 0;
        } else {
            i5 = i17;
        }
        c07711 = this.f3108;
        z8 = !c07711.m2277();
        z9 = z4;
        boolean z2112 = zArr[0];
        boolean z2113 = zArr[1];
        i6 = this.f3082;
        iArr = this.f3095;
        C0779 c077118 = c07710;
        if (i6 != 2) {
            c2786 = c2785M3540;
            c2787 = c2785M3541;
            z10 = z9;
            iArr2 = iArr;
            z11 = z16;
            c2788 = c2785M3542;
            z12 = z18;
            c07712 = c07711;
            i7 = i2;
            z13 = z8;
        } else {
            c2786 = c2785M3540;
            c2787 = c2785M3541;
            z10 = z9;
            iArr2 = iArr;
            z11 = z16;
            c2788 = c2785M3542;
            z12 = z18;
            c07712 = c07711;
            i7 = i2;
            z13 = z8;
        }
        if (z) {
            c2789 = c2788;
            c27810 = r30;
            c27811 = c2785;
            i8 = 0;
            i9 = 8;
            c2 = 1;
            i10 = 1;
        } else {
            c2789 = c2788;
            c27810 = r30;
            c27811 = c2785;
            i8 = 0;
            i9 = 8;
            c2 = 1;
            i10 = 1;
        }
        if (this.f3083 == 2) {
            i11 = i8;
        } else {
            i11 = i10;
        }
        if (i11 == 0) {
        }
        if (z5) {
            if (this.f3093 == 1) {
                float f111 = this.f3094;
                C0266 c0266M3541117 = c1792.m3541();
                c0266M3541117.f1465.m1361(c27810, -1.0f);
                c0266M3541117.f1465.m1361(c2789, 1.0f);
                c0266M3541117.f1465.m1361(c2787, f111);
                c0266M3541117.f1465.m1361(c2786, -f111);
                c1792.m3532(c0266M3541117);
            } else {
                float f112 = this.f3094;
                C0266 c0266M3541118 = c1792.m3541();
                c0266M3541118.f1465.m1361(c2787, -1.0f);
                c0266M3541118.f1465.m1361(c2786, 1.0f);
                c0266M3541118.f1465.m1361(c27810, f112);
                c0266M3541118.f1465.m1361(c2789, -f112);
                c1792.m3532(c0266M3541118);
            }
        }
        if (c07712.m2277()) {
            C0779 c07729 = c07712;
            C0793 c079112 = c07729.f2881.f2879;
            float radians10 = (float) Math.toRadians(this.f3096 + 90.0f);
            int iM22713 = c07729.m2274();
            C2785 c2785M35411111117 = c1792.m3540(mo2311(2));
            C2785 c2785M35411111118 = c1792.m3540(mo2311(3));
            C2785 c2785M35411111119 = c1792.m3540(mo2311(4));
            C2785 c2785M354111111110 = c1792.m3540(mo2311(5));
            C2785 c2785M354111111111 = c1792.m3540(c079112.mo2311(2));
            C2785 c2785M354111111112 = c1792.m3540(c079112.mo2311(3));
            C2785 c2785M354111111113 = c1792.m3540(c079112.mo2311(4));
            C2785 c2785M354111111114 = c1792.m3540(c079112.mo2311(5));
            C0266 c0266M3541119 = c1792.m3541();
            double d19 = radians10;
            double dSin10 = Math.sin(d19);
            double d110 = iM22713;
            c0266M3541119.f1465.m1361(c2785M354111111112, 0.5f);
            c0266M3541119.f1465.m1361(c2785M354111111114, 0.5f);
            c0266M3541119.f1465.m1361(c2785M35411111118, -0.5f);
            c0266M3541119.f1465.m1361(c2785M354111111110, -0.5f);
            c0266M3541119.f1463 = -((float) (dSin10 * d110));
            c1792.m3532(c0266M3541119);
            C0266 c0266M35411110 = c1792.m3541();
            float fCos10 = (float) (Math.cos(d19) * d110);
            c0266M35411110.f1465.m1361(c2785M354111111111, 0.5f);
            c0266M35411110.f1465.m1361(c2785M354111111113, 0.5f);
            c0266M35411110.f1465.m1361(c2785M35411111117, -0.5f);
            c0266M35411110.f1465.m1361(c2785M35411111119, -0.5f);
            c0266M35411110.f1463 = -fCos10;
            c1792.m3532(c0266M35411110);
        }
        this.f3080 = false;
        this.f3081 = false;
    }

    public boolean mo1486() {
        return this.f3125 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x038a  */
    /* JADX WARN: Code duplicated, block: B:193:0x038e  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:227:0x041a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0422  */
    /* JADX WARN: Code duplicated, block: B:240:0x0437  */
    /* JADX WARN: Code duplicated, block: B:245:0x0441  */
    /* JADX WARN: Code duplicated, block: B:247:0x0445  */
    /* JADX WARN: Code duplicated, block: B:248:0x0447  */
    /* JADX WARN: Code duplicated, block: B:251:0x044f  */
    /* JADX WARN: Code duplicated, block: B:257:0x045d A[PHI: r4
      0x045d: PHI (r4v16 int) = (r4v15 int), (r4v20 int), (r4v20 int), (r4v20 int) binds: [B:250:0x044d, B:252:0x0453, B:253:0x0455, B:255:0x0459] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:260:0x046f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x0471  */
    /* JADX WARN: Code duplicated, block: B:262:0x0476  */
    /* JADX WARN: Code duplicated, block: B:264:0x0479  */
    /* JADX WARN: Code duplicated, block: B:273:0x0491  */
    /* JADX WARN: Code duplicated, block: B:276:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:287:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:306:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:315:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x017c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0197 A[ADDED_TO_REGION] */
    public final void m2306(C1791 c1791, boolean z, boolean z2, boolean z3, boolean z4, C2785 c2785, C2785 c2786, int i, boolean z5, C0779 c0779, C0779 c07710, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        int iMin;
        int i10;
        int i11;
        boolean z13;
        C2785 c2785M3540;
        C2785 c2785M3541;
        int i12;
        char c;
        boolean z14;
        C0779 c07711;
        C2785 c2787;
        C2785 c2788;
        int i13;
        boolean z15;
        boolean z16;
        boolean z17;
        int i14;
        boolean z18;
        C0793 c0793;
        C2785 c2789;
        boolean z19;
        int iMin2;
        int i15;
        boolean z20;
        int iM2274;
        int i16;
        int i17;
        int i18;
        HashSet hashSet;
        int i19;
        int i20;
        int i21;
        int i22;
        c1791 = c1791;
        int i23 = i8;
        int i24 = i9;
        C2785 c2785M3542 = c1791.m3540(c0779);
        C2785 c2785M3543 = c1791.m3540(c07710);
        C2785 c2785M3544 = c1791.m3540(c0779.f2881);
        C2785 c2785M3545 = c1791.m3540(c07710.f2881);
        boolean zM2277 = c0779.m2277();
        boolean zM2278 = c07710.m2277();
        boolean zM2279 = this.f3108.m2277();
        int i25 = zM2278 ? (zM2277 ? 1 : 0) + 1 : zM2277 ? 1 : 0;
        if (zM2279) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i6;
        int iM4759 = AbstractC2784.m4759(i);
        boolean z21 = (iM4759 == 0 || iM4759 == 1 || iM4759 != 2 || i27 == 4) ? false : true;
        if (this.f3125 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            z12 = z21;
            iMin = i3;
        }
        if (z11) {
            if (!zM2277 && !zM2278 && !zM2279) {
                c1791.m3533(c2785M3542, i2);
            } else if (zM2277 && !zM2278) {
                i10 = 8;
                c1791.m3534(c2785M3542, c2785M3544, c0779.m2274(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (false) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    c1791.m3535(c2785M3543, c2785M3542, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        c1791.m3536(c2785M3543, c2785M3542, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        c1791.m3534(c2785M3543, c2785M3542, iMin, 8);
                    } else if (z8) {
                        c1791.m3534(c2785M3543, c2785M3542, iMin, 5);
                        c1791.m3536(c2785M3543, c2785M3542, iMin, 8);
                    } else {
                        c1791.m3534(c2785M3543, c2785M3542, iMin, 5);
                        c1791.m3536(c2785M3543, c2785M3542, iMin, 8);
                    }
                } else if (i27 == 2) {
                    int i28 = c0779.f2880;
                    if (i28 == 3 || i28 == 5) {
                        c2785M3540 = c1791.m3540(this.f3112.mo2311(3));
                        c2785M3541 = c1791.m3540(this.f3112.mo2311(5));
                    } else {
                        c2785M3540 = c1791.m3540(this.f3112.mo2311(2));
                        c2785M3541 = c1791.m3540(this.f3112.mo2311(4));
                    }
                    C0266 c0266M3541 = c1791.m3541();
                    c0266M3541.f1465.m1361(c2785M3543, -1.0f);
                    c0266M3541.f1465.m1361(c2785M3542, 1.0f);
                    c0266M3541.f1465.m1361(c2785M3541, f2);
                    c0266M3541.f1465.m1361(c2785M3540, -f2);
                    c1791.m3532(c0266M3541);
                    i11 = i23;
                } else {
                    i11 = i23;
                    z13 = z12;
                    z4 = true;
                }
                if (!z11) {
                    i12 = 3;
                    c = 2;
                } else {
                    if (!z8) {
                        if ((zM2277 && !zM2278 && !zM2279) || (zM2277 && !zM2278)) {
                            c2787 = c2785M3545;
                        } else {
                            if (!zM2277 || !zM2278) {
                                c2787 = c2785M3545;
                                if (!zM2277 && zM2278) {
                                    C0793 c0794 = c0779.f2881.f2879;
                                    int i29 = i24;
                                    C0793 c0795 = c07710.f2881.f2879;
                                    z4 = z4;
                                    C0793 c0796 = this.f3112;
                                    int i30 = 6;
                                    if (z13) {
                                        if (i27 == 0) {
                                            if (i29 != 0 || i11 != 0) {
                                                i22 = 5;
                                                z16 = true;
                                                z17 = false;
                                                z15 = true;
                                                i14 = 5;
                                            } else if (c2785M3544.f8890 && c2787.f8890) {
                                                c1791.m3534(c2785M3542, c2785M3544, c0779.m2274(), 8);
                                                c1791.m3534(c2785M3543, c2787, -c07710.m2274(), 8);
                                                return;
                                            } else {
                                                i22 = 8;
                                                z16 = false;
                                                z17 = true;
                                                z15 = false;
                                                i14 = 8;
                                            }
                                            if ((c0794 instanceof C0367) || (c0795 instanceof C0367)) {
                                                c2788 = c2785M3544;
                                                c2785M3543 = c2785M3543;
                                                i13 = 4;
                                            } else {
                                                c2788 = c2785M3544;
                                                c2785M3543 = c2785M3543;
                                                i13 = i22;
                                            }
                                            i30 = 6;
                                        } else {
                                            if (i27 == 1) {
                                                i27 = i27;
                                                c2788 = c2785M3544;
                                                c2785M3542 = c2785M3542;
                                                c2785M3543 = c2785M3543;
                                                c1791 = c1791;
                                                c2786 = c2786;
                                                i30 = 6;
                                                i13 = 4;
                                                z15 = true;
                                                z16 = true;
                                                z17 = false;
                                            } else if (i27 != 3) {
                                                c2788 = c2785M3544;
                                                c2785M3543 = c2785M3543;
                                                i13 = 4;
                                                z15 = false;
                                                z16 = false;
                                            } else if (this.f3093 == -1) {
                                                if (z9) {
                                                    i27 = i27;
                                                    c2788 = c2785M3544;
                                                    c2785M3542 = c2785M3542;
                                                    c2785M3543 = c2785M3543;
                                                    c1791 = c1791;
                                                    c2786 = c2786;
                                                    i30 = z2 ? 5 : 4;
                                                } else {
                                                    i27 = i27;
                                                    c2788 = c2785M3544;
                                                    c2785M3542 = c2785M3542;
                                                    c2785M3543 = c2785M3543;
                                                    c1791 = c1791;
                                                    c2786 = c2786;
                                                    i30 = 8;
                                                }
                                                i13 = 5;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                            } else if (z6) {
                                                if (i7 == 2 || i7 == 1) {
                                                    i20 = 4;
                                                    i21 = 5;
                                                } else {
                                                    i20 = 5;
                                                    i21 = 8;
                                                }
                                                i27 = i27;
                                                c2788 = c2785M3544;
                                                c2785M3542 = c2785M3542;
                                                c2785M3543 = c2785M3543;
                                                i13 = i20;
                                                i14 = i21;
                                                i30 = 6;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                                c1791 = c1791;
                                                c2786 = c2786;
                                            } else {
                                                if (i29 > 0) {
                                                    c2788 = c2785M3544;
                                                    c2785M3543 = c2785M3543;
                                                    i13 = 5;
                                                } else if (i29 != 0 || i11 != 0) {
                                                    c2788 = c2785M3544;
                                                    c2785M3543 = c2785M3543;
                                                    i13 = 4;
                                                } else if (z9) {
                                                    i27 = i27;
                                                    c2788 = c2785M3544;
                                                    c2785M3542 = c2785M3542;
                                                    c2785M3543 = c2785M3543;
                                                    c2786 = c2786;
                                                    i14 = (c0794 == c0796 || c0795 == c0796) ? 5 : 4;
                                                    i30 = 6;
                                                    i13 = 4;
                                                    z15 = true;
                                                    z16 = true;
                                                    z17 = true;
                                                    c1791 = c1791;
                                                } else {
                                                    c2788 = c2785M3544;
                                                    c2785M3543 = c2785M3543;
                                                    i13 = 8;
                                                }
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                                i14 = 5;
                                            }
                                            i14 = 8;
                                        }
                                        if (z15 || c2788 != c2787 || c0794 == c0796) {
                                            z18 = true;
                                        } else {
                                            z15 = false;
                                            z18 = false;
                                        }
                                        if (z16) {
                                            if (z13 && !z7 && !z9 && c2788 == c2785 && c2787 == c2786) {
                                                i19 = 8;
                                                z19 = false;
                                                i14 = 8;
                                                z18 = false;
                                            } else {
                                                i19 = i30;
                                                z19 = z2;
                                            }
                                            c2789 = c2785M3542;
                                            c0793 = c0794;
                                            c07710 = c07710;
                                            c1791.m3531(c2789, c2788, c0779.m2274(), f, c2787, c2785M3543, c07710.m2274(), i19);
                                        } else {
                                            c0793 = c0794;
                                            c07710 = c07710;
                                            c2789 = c2785M3542;
                                            z19 = z2;
                                        }
                                        if (this.f3125 != 8 && ((hashSet = c07710.f2876) == null || hashSet.size() <= 0)) {
                                            return;
                                        }
                                        if (z15) {
                                            if (z19 || c2788 == c2787 || z13 || !((c0793 instanceof C0367) || (c0795 instanceof C0367))) {
                                                i18 = i14;
                                            } else {
                                                i18 = 6;
                                            }
                                            c1791.m3535(c2789, c2788, c0779.m2274(), i18);
                                            c1791.m3536(c2785M3543, c2787, -c07710.m2274(), i18);
                                            i14 = i18;
                                        }
                                        if (z19 || !z10 || (c0793 instanceof C0367) || (c0795 instanceof C0367)) {
                                            iMin2 = i13;
                                            i15 = i14;
                                            z20 = z18;
                                        } else {
                                            iMin2 = 6;
                                            i15 = 6;
                                            z20 = true;
                                        }
                                        if (z20) {
                                            if (z17 && (!z9 || z3)) {
                                                if (c0793 != c0796 && c0795 != c0796) {
                                                    i30 = iMin2;
                                                }
                                                if ((c0793 instanceof C1506) || (c0795 instanceof C1506)) {
                                                    i30 = 5;
                                                }
                                                if ((c0793 instanceof C0367) || (c0795 instanceof C0367)) {
                                                    i30 = 5;
                                                }
                                                if (z9) {
                                                    i17 = 5;
                                                } else {
                                                    i17 = i30;
                                                }
                                                iMin2 = Math.max(i17, iMin2);
                                            }
                                            if (z19) {
                                                iMin2 = Math.min(i15, iMin2);
                                                if (z6 || z9 || !(c0793 == c0796 || c0795 == c0796)) {
                                                    i16 = iMin2;
                                                } else {
                                                    i16 = 4;
                                                }
                                            } else {
                                                i16 = iMin2;
                                            }
                                            c1791.m3534(c2789, c2788, c0779.m2274(), i16);
                                            c1791.m3534(c2785M3543, c2787, -c07710.m2274(), i16);
                                        }
                                        if (z19) {
                                            if (c2785 == c2788) {
                                                iM2274 = c0779.m2274();
                                            } else {
                                                iM2274 = 0;
                                            }
                                            if (c2788 != c2785) {
                                                c1791.m3535(c2789, c2785, iM2274, 5);
                                            }
                                        }
                                        if (z19 && z13 != 0 && i4 == 0 && i11 == 0) {
                                            if (z13 == 0 && i27 == 3) {
                                                c1791.m3535(c2785M3543, c2789, 0, 8);
                                            } else {
                                                c1791.m3535(c2785M3543, c2789, 0, 5);
                                            }
                                        }
                                    } else {
                                        if (c2785M3544.f8890 && c2787.f8890) {
                                            c1791.m3531(c2785M3542, c2785M3544, c0779.m2274(), f, c2787, c2785M3543, c07710.m2274(), 8);
                                            if (z2 && z4) {
                                                int iM2275 = c07710.f2881 != null ? c07710.m2274() : 0;
                                                if (c2787 != c2786) {
                                                    c1791.m3535(c2786, c2785M3543, iM2275, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        c2788 = c2785M3544;
                                        c2785M3543 = c2785M3543;
                                        i13 = 4;
                                        z15 = true;
                                        z16 = true;
                                    }
                                    z17 = false;
                                    i14 = 5;
                                    if (z15) {
                                        z18 = true;
                                    } else {
                                        z18 = true;
                                    }
                                    if (z16) {
                                        if (z13) {
                                            i19 = i30;
                                            z19 = z2;
                                        } else {
                                            i19 = i30;
                                            z19 = z2;
                                        }
                                        c2789 = c2785M3542;
                                        c0793 = c0794;
                                        c07710 = c07710;
                                        c1791.m3531(c2789, c2788, c0779.m2274(), f, c2787, c2785M3543, c07710.m2274(), i19);
                                    } else {
                                        c0793 = c0794;
                                        c07710 = c07710;
                                        c2789 = c2785M3542;
                                        z19 = z2;
                                    }
                                    if (this.f3125 != 8) {
                                    }
                                    if (z15) {
                                        if (z19) {
                                            i18 = i14;
                                        } else {
                                            i18 = i14;
                                        }
                                        c1791.m3535(c2789, c2788, c0779.m2274(), i18);
                                        c1791.m3536(c2785M3543, c2787, -c07710.m2274(), i18);
                                        i14 = i18;
                                    }
                                    if (z19) {
                                        iMin2 = i13;
                                        i15 = i14;
                                        z20 = z18;
                                    } else {
                                        iMin2 = i13;
                                        i15 = i14;
                                        z20 = z18;
                                    }
                                    if (z20) {
                                        if (z17) {
                                            if (c0793 != c0796) {
                                                i30 = iMin2;
                                            }
                                            if (c0793 instanceof C1506) {
                                                i30 = 5;
                                            } else {
                                                i30 = 5;
                                            }
                                            if (c0793 instanceof C0367) {
                                                i30 = 5;
                                            } else {
                                                i30 = 5;
                                            }
                                            if (z9) {
                                                i17 = 5;
                                            } else {
                                                i17 = i30;
                                            }
                                            iMin2 = Math.max(i17, iMin2);
                                        }
                                        if (z19) {
                                            iMin2 = Math.min(i15, iMin2);
                                            if (z6) {
                                                i16 = iMin2;
                                            } else {
                                                i16 = iMin2;
                                            }
                                        } else {
                                            i16 = iMin2;
                                        }
                                        c1791.m3534(c2789, c2788, c0779.m2274(), i16);
                                        c1791.m3534(c2785M3543, c2787, -c07710.m2274(), i16);
                                    }
                                    if (z19) {
                                        if (c2785 == c2788) {
                                            iM2274 = c0779.m2274();
                                        } else {
                                            iM2274 = 0;
                                        }
                                        if (c2788 != c2785) {
                                            c1791.m3535(c2789, c2785, iM2274, 5);
                                        }
                                    }
                                    if (z19) {
                                        if (z13 == 0) {
                                            c1791.m3535(c2785M3543, c2789, 0, 5);
                                        } else {
                                            c1791.m3535(c2785M3543, c2789, 0, 5);
                                        }
                                    }
                                }
                                if (z19 || !z4) {
                                    return;
                                }
                                int iM2276 = c07710.f2881 != null ? c07710.m2274() : 0;
                                if (c2787 != c2786) {
                                    c1791.m3535(c2786, c2785M3543, iM2276, 5);
                                    return;
                                }
                                return;
                            }
                            c2787 = c2785M3545;
                            c1791.m3534(c2785M3543, c2787, -c07710.m2274(), 8);
                            if (z2) {
                                c1791.m3535(c2785M3542, c2785, 0, 5);
                            }
                        }
                        z19 = z2;
                        if (z19) {
                            return;
                        } else {
                            return;
                        }
                    }
                    c = 2;
                    i12 = 3;
                }
                if (i26 >= c && z2 && z4) {
                    c1791.m3535(c2785M3542, c2785, 0, 8);
                    C0779 c07712 = this.f3105;
                    boolean z22 = z || c07712.f2881 == null;
                    if (z || (c07711 = c07712.f2881) == null) {
                        z14 = z22;
                    } else {
                        C0793 c0797 = c07711.f2879;
                        if (c0797.f3115 != 0.0f) {
                            int[] iArr = c0797.f3134;
                            if (iArr[0] == i12 && iArr[1] == i12) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    }
                    if (z14) {
                        c1791.m3535(c2786, c2785M3543, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMax = Math.max(i23, iMin);
            if (i24 > 0) {
                iMax = Math.min(i24, iMax);
            }
            c1791.m3534(c2785M3543, c2785M3542, iMax, 8);
            i11 = i23;
            z13 = false;
            if (!z11) {
                i12 = 3;
                c = 2;
            } else {
                if (!z8) {
                    if (zM2277) {
                        if (!zM2277) {
                            c2787 = c2785M3545;
                            if (!zM2277) {
                            }
                            z19 = z2;
                        } else {
                            c2787 = c2785M3545;
                            if (!zM2277) {
                            }
                            z19 = z2;
                        }
                    } else if (!zM2277) {
                        c2787 = c2785M3545;
                        if (!zM2277) {
                        }
                        z19 = z2;
                    } else {
                        c2787 = c2785M3545;
                        if (!zM2277) {
                        }
                        z19 = z2;
                    }
                    if (z19) {
                        return;
                    } else {
                        return;
                    }
                }
                c = 2;
                i12 = 3;
            }
            if (i26 >= c) {
            }
        }
        if (z5) {
            c1791.m3534(c2785M3543, c2785M3542, 0, 3);
            if (i4 > 0) {
                c1791.m3535(c2785M3543, c2785M3542, i4, 8);
            }
            if (i5 < 2147483647) {
                c1791.m3536(c2785M3543, c2785M3542, i5, 8);
            }
        } else {
            c1791.m3534(c2785M3543, c2785M3542, iMin, 8);
        }
        z4 = z4;
        z13 = z12;
        i11 = i23;
        if (!z11) {
            i12 = 3;
            c = 2;
        } else {
            if (!z8) {
                if (zM2277) {
                    if (false) {
                        c2787 = c2785M3545;
                        if (!zM2277) {
                        }
                        z19 = z2;
                    } else {
                        c2787 = c2785M3545;
                        if (false) {
                        }
                        z19 = z2;
                    }
                } else if (true) {
                    c2787 = c2785M3545;
                    if (true) {
                    }
                    z19 = z2;
                } else {
                    c2787 = c2785M3545;
                    if (!zM2277) {
                    }
                    z19 = z2;
                }
                if (z19) {
                    return;
                } else {
                    return;
                }
            }
            c = 2;
            i12 = 3;
        }
        if (i26 >= 2) {
        }
    }

    public final void m2307(int i, C0793 c0793, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    m2307(2, c0793, i2, 0);
                    m2307(4, c0793, i2, 0);
                    mo2311(7).m2270(c0793.mo2311(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        m2307(3, c0793, i2, 0);
                        m2307(5, c0793, i2, 0);
                        mo2311(7).m2270(c0793.mo2311(i2), 0);
                        return;
                    }
                    return;
                }
            }
            C0779 c0779Mo2311 = mo2311(2);
            C0779 c0779Mo2312 = mo2311(4);
            C0779 c0779Mo2313 = mo2311(3);
            C0779 c0779Mo2314 = mo2311(5);
            boolean z2 = true;
            if ((c0779Mo2311 == null || !c0779Mo2311.m2277()) && (c0779Mo2312 == null || !c0779Mo2312.m2277())) {
                m2307(2, c0793, 2, 0);
                m2307(4, c0793, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((c0779Mo2313 == null || !c0779Mo2313.m2277()) && (c0779Mo2314 == null || !c0779Mo2314.m2277())) {
                m2307(3, c0793, 3, 0);
                m2307(5, c0793, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo2311(7).m2270(c0793.mo2311(7), 0);
                return;
            } else if (z) {
                mo2311(8).m2270(c0793.mo2311(8), 0);
                return;
            } else {
                if (z2) {
                    mo2311(9).m2270(c0793.mo2311(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            C0779 c0779Mo2315 = mo2311(2);
            C0779 c0779Mo2316 = c0793.mo2311(i2);
            C0779 c0779Mo2317 = mo2311(4);
            c0779Mo2315.m2270(c0779Mo2316, 0);
            c0779Mo2317.m2270(c0779Mo2316, 0);
            mo2311(8).m2270(c0779Mo2316, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            C0779 c0779Mo2318 = c0793.mo2311(i2);
            mo2311(3).m2270(c0779Mo2318, 0);
            mo2311(5).m2270(c0779Mo2318, 0);
            mo2311(9).m2270(c0779Mo2318, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            mo2311(2).m2270(c0793.mo2311(2), 0);
            mo2311(4).m2270(c0793.mo2311(4), 0);
            mo2311(8).m2270(c0793.mo2311(8), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            mo2311(3).m2270(c0793.mo2311(3), 0);
            mo2311(5).m2270(c0793.mo2311(5), 0);
            mo2311(9).m2270(c0793.mo2311(9), 0);
            return;
        }
        C0779 c0779Mo2319 = mo2311(i);
        C0779 c0779Mo23110 = c0793.mo2311(i2);
        if (c0779Mo2319.m2278(c0779Mo23110)) {
            if (i == 6) {
                C0779 c0779Mo23111 = mo2311(3);
                C0779 c0779Mo23112 = mo2311(5);
                if (c0779Mo23111 != null) {
                    c0779Mo23111.m2279();
                }
                if (c0779Mo23112 != null) {
                    c0779Mo23112.m2279();
                }
                i3 = 0;
            } else if (i == 3 || i == 5) {
                C0779 c0779Mo23113 = mo2311(6);
                if (c0779Mo23113 != null) {
                    c0779Mo23113.m2279();
                }
                C0779 c0779Mo23114 = mo2311(7);
                if (c0779Mo23114.f2881 != c0779Mo23110) {
                    c0779Mo23114.m2279();
                }
                C0779 c0779M2275 = mo2311(i).m2275();
                C0779 c0779Mo23115 = mo2311(9);
                if (c0779Mo23115.m2277()) {
                    c0779M2275.m2279();
                    c0779Mo23115.m2279();
                }
            } else if (i == 2 || i == 4) {
                C0779 c0779Mo23116 = mo2311(7);
                if (c0779Mo23116.f2881 != c0779Mo23110) {
                    c0779Mo23116.m2279();
                }
                C0779 c0779M2276 = mo2311(i).m2275();
                C0779 c0779Mo23117 = mo2311(8);
                if (c0779Mo23117.m2277()) {
                    c0779M2276.m2279();
                    c0779Mo23117.m2279();
                }
            }
            c0779Mo2319.m2270(c0779Mo23110, i3);
        }
    }

    public final void m2308(C0779 c0779, C0779 c07710, int i) {
        if (c0779.f2879 == this) {
            m2307(c0779.f2880, c07710.f2879, c07710.f2880, i);
        }
    }

    public final void m2309(C1791 c1791) {
        c1791.m3540(this.f3101);
        c1791.m3540(this.f3102);
        c1791.m3540(this.f3103);
        c1791.m3540(this.f3104);
        if (this.f3119 > 0) {
            c1791.m3540(this.f3105);
        }
    }

    public final void m2310() {
        if (this.f3076 == null) {
            C1564 c1564 = new C1564(this);
            c1564.f11393.f3705 = 4;
            c1564.f11394.f3705 = 5;
            c1564.f11391 = 0;
            this.f3076 = c1564;
        }
        if (this.f3077 == null) {
            C3549 c3549 = new C3549(this);
            C1014 c1014 = new C1014(c3549);
            c3549.f11148 = c1014;
            c3549.f11149 = null;
            c3549.f11393.f3705 = 6;
            c3549.f11394.f3705 = 7;
            c1014.f3705 = 8;
            c3549.f11391 = 1;
            this.f3077 = c3549;
        }
    }

    public C0779 mo2311(int i) {
        switch (AbstractC2784.m4759(i)) {
            case 0:
                return null;
            case 1:
                return this.f3101;
            case 2:
                return this.f3102;
            case 3:
                return this.f3103;
            case 4:
                return this.f3104;
            case 5:
                return this.f3105;
            case 6:
                return this.f3108;
            case 7:
                return this.f3106;
            case 8:
                return this.f3107;
            default:
                throw new AssertionError(AbstractC2784.m4758(i));
        }
    }

    public final int m2312(int i) {
        int[] iArr = this.f3134;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int m2313() {
        if (this.f3125 == 8) {
            return 0;
        }
        return this.f3114;
    }

    public final C0793 m2314(int i) {
        C0779 c0779;
        C0779 c07710;
        if (i != 0) {
            if (i == 1 && (c07710 = (c0779 = this.f3104).f2881) != null && c07710.f2881 == c0779) {
                return c07710.f2879;
            }
            return null;
        }
        C0779 c07711 = this.f3103;
        C0779 c07712 = c07711.f2881;
        if (c07712 == null || c07712.f2881 != c07711) {
            return null;
        }
        return c07712.f2879;
    }

    public final C0793 m2315(int i) {
        C0779 c0779;
        C0779 c07710;
        if (i != 0) {
            if (i == 1 && (c07710 = (c0779 = this.f3102).f2881) != null && c07710.f2881 == c0779) {
                return c07710.f2879;
            }
            return null;
        }
        C0779 c07711 = this.f3101;
        C0779 c07712 = c07711.f2881;
        if (c07712 == null || c07712.f2881 != c07711) {
            return null;
        }
        return c07712.f2879;
    }

    public final int m2316() {
        if (this.f3125 == 8) {
            return 0;
        }
        return this.f3113;
    }

    public final int m2317() {
        C0793 c0793 = this.f3112;
        return (c0793 == null || !(c0793 instanceof C0794)) ? this.f3117 : ((C0794) c0793).f3141 + this.f3117;
    }

    public final int m2318() {
        C0793 c0793 = this.f3112;
        return (c0793 == null || !(c0793 instanceof C0794)) ? this.f3118 : ((C0794) c0793).f3142 + this.f3118;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean m2319(int i) {
        if (i == 0) {
            if ((this.f3101.f2881 != null ? 1 : 0) + (this.f3103.f2881 != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.f3102.f2881 != null ? 1 : 0) + (this.f3104.f2881 != null ? 1 : 0) + (this.f3105.f2881 != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final void m2320(int i, int i2, int i3, int i4, C0793 c0793) {
        mo2311(i).m2271(c0793.mo2311(i2), i3, i4, true);
    }

    public final boolean m2321(int i) {
        C0779 c0779;
        C0779 c07710;
        int i2 = i * 2;
        C0779[] c0779Arr = this.f3109;
        C0779 c07711 = c0779Arr[i2];
        C0779 c07712 = c07711.f2881;
        return (c07712 == null || c07712.f2881 == c07711 || (c07710 = (c0779 = c0779Arr[i2 + 1]).f2881) == null || c07710.f2881 != c0779) ? false : true;
    }

    public final boolean m2322() {
        C0779 c0779 = this.f3101;
        C0779 c07710 = c0779.f2881;
        if (c07710 != null && c07710.f2881 == c0779) {
            return true;
        }
        C0779 c07711 = this.f3103;
        C0779 c07712 = c07711.f2881;
        return c07712 != null && c07712.f2881 == c07711;
    }

    public final boolean m2323() {
        C0779 c0779 = this.f3102;
        C0779 c07710 = c0779.f2881;
        if (c07710 != null && c07710.f2881 == c0779) {
            return true;
        }
        C0779 c07711 = this.f3104;
        C0779 c07712 = c07711.f2881;
        return c07712 != null && c07712.f2881 == c07711;
    }

    public final boolean m2324() {
        return this.f3079 && this.f3125 != 8;
    }

    public boolean mo1487() {
        if (this.f3080) {
            return true;
        }
        return this.f3101.f2878 && this.f3103.f2878;
    }

    public boolean mo1488() {
        if (this.f3081) {
            return true;
        }
        return this.f3102.f2878 && this.f3104.f2878;
    }

    public void mo2325() {
        this.f3101.m2279();
        this.f3102.m2279();
        this.f3103.m2279();
        this.f3104.m2279();
        this.f3105.m2279();
        this.f3106.m2279();
        this.f3107.m2279();
        this.f3108.m2279();
        this.f3112 = null;
        this.f3096 = 0.0f;
        this.f3113 = 0;
        this.f3114 = 0;
        this.f3115 = 0.0f;
        this.f3116 = -1;
        this.f3117 = 0;
        this.f3118 = 0;
        this.f3119 = 0;
        this.f3120 = 0;
        this.f3121 = 0;
        this.f3122 = 0.5f;
        this.f3123 = 0.5f;
        int[] iArr = this.f3134;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f3124 = null;
        this.f3125 = 0;
        this.f3127 = 0;
        this.f3128 = 0;
        float[] fArr = this.f3129;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3082 = -1;
        this.f3083 = -1;
        int[] iArr2 = this.f3095;
        iArr2[0] = 2147483647;
        iArr2[1] = 2147483647;
        this.f3084 = 0;
        this.f3085 = 0;
        this.f3089 = 1.0f;
        this.f3092 = 1.0f;
        this.f3088 = 2147483647;
        this.f3091 = 2147483647;
        this.f3087 = 0;
        this.f3090 = 0;
        this.f3093 = -1;
        this.f3094 = 1.0f;
        boolean[] zArr = this.f3078;
        zArr[0] = true;
        zArr[1] = true;
        this.f3098 = false;
        boolean[] zArr2 = this.f3111;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3079 = true;
    }

    public final void m2326() {
        C0793 c0793 = this.f3112;
        if (c0793 != null && (c0793 instanceof C0794)) {
            ((C0794) c0793).getClass();
        }
        ArrayList arrayList = this.f3110;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0779) arrayList.get(i)).m2279();
        }
    }

    public void mo2327(C0243 c0243) {
        this.f3101.m2280();
        this.f3102.m2280();
        this.f3103.m2280();
        this.f3104.m2280();
        this.f3105.m2280();
        this.f3108.m2280();
        this.f3106.m2280();
        this.f3107.m2280();
    }

    public final void m2328(int i) {
        this.f3119 = i;
        this.f3097 = i > 0;
    }

    public final void m2329(int i, int i2) {
        this.f3101.m2281(i);
        this.f3103.m2281(i2);
        this.f3117 = i;
        this.f3113 = i2 - i;
        this.f3080 = true;
    }

    public final void m2330(int i, int i2) {
        this.f3102.m2281(i);
        this.f3104.m2281(i2);
        this.f3118 = i;
        this.f3114 = i2 - i;
        if (this.f3097) {
            this.f3105.m2281(i + this.f3119);
        }
        this.f3081 = true;
    }

    public final void m2331(int i) {
        this.f3114 = i;
        int i2 = this.f3121;
        if (i < i2) {
            this.f3114 = i2;
        }
    }

    public final void m2332(int i) {
        this.f3134[0] = i;
    }

    public final void m2333(int i) {
        this.f3134[1] = i;
    }

    public final void m2334(int i) {
        this.f3113 = i;
        int i2 = this.f3120;
        if (i < i2) {
            this.f3113 = i2;
        }
    }

    public void mo2335(boolean z, boolean z2) {
        int i;
        int i2;
        C1564 c1564 = this.f3076;
        boolean z3 = z & c1564.f11392;
        C3549 c3549 = this.f3077;
        boolean z4 = z2 & c3549.f11392;
        int i3 = c1564.f11393.f3707;
        int i4 = c3549.f11393.f3707;
        int i5 = c1564.f11394.f3707;
        int i6 = c3549.f11394.f3707;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == -2147483648 || i3 == 2147483647 || i4 == -2147483648 || i4 == 2147483647 || i5 == -2147483648 || i5 == 2147483647 || i6 == -2147483648 || i6 == 2147483647) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f3117 = i3;
        }
        if (z4) {
            this.f3118 = i4;
        }
        if (this.f3125 == 8) {
            this.f3113 = 0;
            this.f3114 = 0;
            return;
        }
        int[] iArr = this.f3134;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.f3113)) {
                i8 = i2;
            }
            this.f3113 = i8;
            int i10 = this.f3120;
            if (i8 < i10) {
                this.f3113 = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.f3114)) {
                i9 = i;
            }
            this.f3114 = i9;
            int i11 = this.f3121;
            if (i9 < i11) {
                this.f3114 = i11;
            }
        }
    }

    public void mo2336(C1791 c1791, boolean z) {
        int i;
        int i2;
        C3549 c3549;
        C1564 c1564;
        c1791.getClass();
        int iM3529 = C1791.m3529(this.f3101);
        int iM35210 = C1791.m3529(this.f3102);
        int iM35211 = C1791.m3529(this.f3103);
        int iM35212 = C1791.m3529(this.f3104);
        if (z && (c1564 = this.f3076) != null) {
            C1014 c1014 = c1564.f11393;
            if (c1014.f3710) {
                C1014 c1015 = c1564.f11394;
                if (c1015.f3710) {
                    iM3529 = c1014.f3707;
                    iM35211 = c1015.f3707;
                }
            }
        }
        if (z && (c3549 = this.f3077) != null) {
            C1014 c1016 = c3549.f11393;
            if (c1016.f3710) {
                C1014 c1017 = c3549.f11394;
                if (c1017.f3710) {
                    iM35210 = c1016.f3707;
                    iM35212 = c1017.f3707;
                }
            }
        }
        int i3 = iM35212 - iM35210;
        if (iM35211 - iM3529 < 0 || i3 < 0 || iM3529 == -2147483648 || iM3529 == 2147483647 || iM35210 == -2147483648 || iM35210 == 2147483647 || iM35211 == -2147483648 || iM35211 == 2147483647 || iM35212 == -2147483648 || iM35212 == 2147483647) {
            iM3529 = 0;
            iM35210 = 0;
            iM35211 = 0;
            iM35212 = 0;
        }
        int i4 = iM35211 - iM3529;
        int i5 = iM35212 - iM35210;
        this.f3117 = iM3529;
        this.f3118 = iM35210;
        if (this.f3125 == 8) {
            this.f3113 = 0;
            this.f3114 = 0;
            return;
        }
        int[] iArr = this.f3134;
        if (iArr[0] == 1 && i4 < (i2 = this.f3113)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f3114)) {
            i5 = i;
        }
        this.f3113 = i4;
        this.f3114 = i5;
        int i6 = this.f3121;
        if (i5 < i6) {
            this.f3114 = i6;
        }
        int i7 = this.f3120;
        if (i4 < i7) {
            this.f3113 = i7;
        }
    }
}
