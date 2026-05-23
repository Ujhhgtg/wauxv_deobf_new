package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0794 extends C0793 {

    public ArrayList f3135 = new ArrayList();

    public final C0243 f3136 = new C0243(this);

    public final C1013 f3137;

    public C0784 f3138;

    public boolean f3139;

    public final C1791 f3140;

    public int f3141;

    public int f3142;

    public int f3143;

    public int f3144;

    public C0581[] f3145;

    public C0581[] f3146;

    public int f3147;

    public boolean f3148;

    public boolean f3149;

    public WeakReference f3150;

    public WeakReference f3151;

    public WeakReference f3152;

    public WeakReference f3153;

    public final C0407 f3154;

    public C0794() {
        C1013 c1013 = new C1013();
        c1013.f3694 = true;
        c1013.f3695 = true;
        c1013.f3697 = new ArrayList();
        new ArrayList();
        c1013.f3698 = null;
        c1013.f3699 = new C0407();
        c1013.f3700 = new ArrayList();
        c1013.f3693 = this;
        c1013.f3696 = this;
        this.f3137 = c1013;
        this.f3138 = null;
        this.f3139 = false;
        this.f3140 = new C1791();
        this.f3143 = 0;
        this.f3144 = 0;
        this.f3145 = new C0581[4];
        this.f3146 = new C0581[4];
        this.f3147 = 257;
        this.f3148 = false;
        this.f3149 = false;
        this.f3150 = null;
        this.f3151 = null;
        this.f3152 = null;
        this.f3153 = null;
        this.f3154 = new C0407();
    }

    public static void m2337(C0793 c0793, C0784 c0784, C0407 c0407) {
        int i;
        int i2;
        if (c0784 == null) {
            return;
        }
        int[] iArr = c0793.f3134;
        int[] iArr2 = c0793.f3086;
        c0407.f1910 = iArr[0];
        c0407.f1911 = iArr[1];
        c0407.f1912 = c0793.m2316();
        c0407.f1913 = c0793.m2313();
        c0407.f1918 = false;
        c0407.f1919 = 0;
        boolean z = c0407.f1910 == 3;
        boolean z2 = c0407.f1911 == 3;
        boolean z3 = z && c0793.f3115 > 0.0f;
        boolean z4 = z2 && c0793.f3115 > 0.0f;
        if (z && c0793.m2319(0) && c0793.f3084 == 0 && !z3) {
            c0407.f1910 = 2;
            if (z2 && c0793.f3085 == 0) {
                c0407.f1910 = 1;
            }
            z = false;
        }
        if (z2 && c0793.m2319(1) && c0793.f3085 == 0 && !z4) {
            c0407.f1911 = 2;
            if (z && c0793.f3084 == 0) {
                c0407.f1911 = 1;
            }
            z2 = false;
        }
        if (c0793.mo1487()) {
            c0407.f1910 = 1;
            z = false;
        }
        if (c0793.mo1488()) {
            c0407.f1911 = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr2[0] == 4) {
                c0407.f1910 = 1;
            } else if (!z2) {
                if (c0407.f1911 == 1) {
                    i2 = c0407.f1913;
                } else {
                    c0407.f1910 = 2;
                    c0784.m2293(c0793, c0407);
                    i2 = c0407.f1915;
                }
                c0407.f1910 = 1;
                int i3 = c0793.f3116;
                if (i3 == 0 || i3 == -1) {
                    c0407.f1912 = (int) (c0793.f3115 * i2);
                } else {
                    c0407.f1912 = (int) (c0793.f3115 / i2);
                }
            }
        }
        if (z4) {
            if (iArr2[1] == 4) {
                c0407.f1911 = 1;
            } else if (!z) {
                if (c0407.f1910 == 1) {
                    i = c0407.f1912;
                } else {
                    c0407.f1911 = 2;
                    c0784.m2293(c0793, c0407);
                    i = c0407.f1914;
                }
                c0407.f1911 = 1;
                int i4 = c0793.f3116;
                if (i4 == 0 || i4 == -1) {
                    c0407.f1913 = (int) (i / c0793.f3115);
                } else {
                    c0407.f1913 = (int) (i * c0793.f3115);
                }
            }
        }
        c0784.m2293(c0793, c0407);
        c0793.m2334(c0407.f1914);
        c0793.m2331(c0407.f1915);
        c0793.f3097 = c0407.f1917;
        c0793.m2328(c0407.f1916);
        c0407.f1919 = 0;
    }

    @Override // p000.C0793
    public final void mo2325() {
        this.f3140.m3548();
        this.f3141 = 0;
        this.f3142 = 0;
        this.f3135.clear();
        super.mo2325();
    }

    @Override // p000.C0793
    public final void mo2327(C0243 c0243) {
        super.mo2327(c0243);
        int size = this.f3135.size();
        for (int i = 0; i < size; i++) {
            ((C0793) this.f3135.get(i)).mo2327(c0243);
        }
    }

    @Override // p000.C0793
    public final void mo2335(boolean z, boolean z2) {
        super.mo2335(z, z2);
        int size = this.f3135.size();
        for (int i = 0; i < size; i++) {
            ((C0793) this.f3135.get(i)).mo2335(z, z2);
        }
    }

    public final void m2338(C0793 c0793, int i) {
        if (i == 0) {
            int i2 = this.f3143 + 1;
            C0581[] c0581Arr = this.f3146;
            if (i2 >= c0581Arr.length) {
                this.f3146 = (C0581[]) Arrays.copyOf(c0581Arr, c0581Arr.length * 2);
            }
            C0581[] c0581Arr2 = this.f3146;
            int i3 = this.f3143;
            c0581Arr2[i3] = new C0581(c0793, 0, this.f3139);
            this.f3143 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f3144 + 1;
            C0581[] c0581Arr3 = this.f3145;
            if (i4 >= c0581Arr3.length) {
                this.f3145 = (C0581[]) Arrays.copyOf(c0581Arr3, c0581Arr3.length * 2);
            }
            C0581[] c0581Arr4 = this.f3145;
            int i5 = this.f3144;
            c0581Arr4[i5] = new C0581(c0793, 1, this.f3139);
            this.f3144 = i5 + 1;
        }
    }

    public final void m2339(C1791 c1791) {
        C0794 c0794;
        C1791 c1792;
        boolean zM2343 = m2343(64);
        mo1485(c1791, zM2343);
        int size = this.f3135.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0793 c0793 = (C0793) this.f3135.get(i);
            boolean[] zArr = c0793.f3111;
            zArr[0] = false;
            zArr[1] = false;
            if (c0793 instanceof C0367) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0793 c0795 = (C0793) this.f3135.get(i2);
                if (c0795 instanceof C0367) {
                    C0367 c0367 = (C0367) c0795;
                    for (int i3 = 0; i3 < c0367.f5368; i3++) {
                        C0793 c0796 = c0367.f5367[i3];
                        int i4 = c0367.f1743;
                        if (i4 == 0 || i4 == 1) {
                            c0796.f3111[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            c0796.f3111[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            C0793 c0797 = (C0793) this.f3135.get(i5);
            c0797.getClass();
            if ((c0797 instanceof C1367) || (c0797 instanceof C1506)) {
                c0797.mo1485(c1791, zM2343);
            }
        }
        if (C1791.f5968) {
            HashSet<C0793> hashSet = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                C0793 c0798 = (C0793) this.f3135.get(i6);
                c0798.getClass();
                if (!(c0798 instanceof C1367) && !(c0798 instanceof C1506)) {
                    hashSet.add(c0798);
                }
            }
            c0794 = this;
            c1792 = c1791;
            c0794.m2305(this, c1792, hashSet, this.f3134[0] == 2 ? 0 : 1, false);
            for (C0793 c0799 : hashSet) {
                AbstractC2201.m3965(this, c1792, c0799);
                c0799.mo1485(c1792, zM2343);
            }
        } else {
            c0794 = this;
            c1792 = c1791;
            for (int i7 = 0; i7 < size; i7++) {
                C0793 c07910 = (C0793) c0794.f3135.get(i7);
                if (c07910 instanceof C0794) {
                    int[] iArr = c07910.f3134;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        c07910.m2332(1);
                    }
                    if (i9 == 2) {
                        c07910.m2333(1);
                    }
                    c07910.mo1485(c1792, zM2343);
                    if (i8 == 2) {
                        c07910.m2332(2);
                    }
                    if (i9 == 2) {
                        c07910.m2333(2);
                    }
                } else {
                    AbstractC2201.m3965(this, c1792, c07910);
                    if (!(c07910 instanceof C1367) && !(c07910 instanceof C1506)) {
                        c07910.mo1485(c1792, zM2343);
                    }
                }
            }
        }
        if (c0794.f3143 > 0) {
            AbstractC3471.m5064(this, c1792, null, 0);
        }
        if (c0794.f3144 > 0) {
            AbstractC3471.m5064(this, c1792, null, 1);
        }
    }

    public final void m2340(C0779 c0779) {
        WeakReference weakReference = this.f3150;
        if (weakReference == null || weakReference.get() == null || c0779.m2273() > ((C0779) this.f3150.get()).m2273()) {
            this.f3150 = new WeakReference(c0779);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    public final boolean m2341(int i, boolean z) {
        boolean z2;
        boolean z3;
        C1013 c1013 = this.f3137;
        ArrayList<AbstractC3640> arrayList = c1013.f3697;
        C0794 c0794 = c1013.f3693;
        boolean z4 = false;
        int iM2312 = c0794.m2312(0);
        int[] iArr = c0794.f3134;
        int iM2313 = c0794.m2312(1);
        int iM2317 = c0794.m2317();
        int iM2318 = c0794.m2318();
        if (z && (iM2312 == 2 || iM2313 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = true;
                    break;
                }
                AbstractC3640 abstractC3640 = (AbstractC3640) it.next();
                if (abstractC3640.f11391 == i && !abstractC3640.mo2008()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && iM2312 == 2) {
                    c0794.m2332(1);
                    c0794.m2334(c1013.m2582(c0794, 0));
                    c0794.f3076.f11390.mo2588(c0794.m2316());
                }
            } else if (z3 && iM2313 == 2) {
                c0794.m2333(1);
                c0794.m2331(c1013.m2582(c0794, 1));
                c0794.f3077.f11390.mo2588(c0794.m2313());
            }
        }
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iM2316 = c0794.m2316() + iM2317;
                c0794.f3076.f11394.mo2588(iM2316);
                c0794.f3076.f11390.mo2588(iM2316 - iM2317);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iM2314 = c0794.m2313() + iM2318;
                c0794.f3077.f11394.mo2588(iM2314);
                c0794.f3077.f11390.mo2588(iM2314 - iM2318);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c1013.m2585();
        for (AbstractC3640 abstractC3641 : arrayList) {
            if (abstractC3641.f11391 == i && (abstractC3641.f11387 != c0794 || abstractC3641.f11392)) {
                abstractC3641.mo2005();
            }
        }
        for (AbstractC3640 abstractC3642 : arrayList) {
            if (abstractC3642.f11391 == i && (z2 || abstractC3642.f11387 != c0794)) {
                if (!abstractC3642.f11393.f3710 || !abstractC3642.f11394.f3710 || (!(abstractC3642 instanceof C0582) && !abstractC3642.f11390.f3710)) {
                    c0794.m2332(iM2312);
                    c0794.m2333(iM2313);
                    return false;
                }
            }
        }
        z4 = true;
        c0794.m2332(iM2312);
        c0794.m2333(iM2313);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:360:0x064d  */
    /* JADX WARN: Code duplicated, block: B:374:0x067c  */
    /* JADX WARN: Code duplicated, block: B:399:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:404:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:411:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:414:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:416:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:420:0x070a  */
    /* JADX WARN: Code duplicated, block: B:423:0x071c A[Catch: Exception -> 0x072a, LOOP:14: B:422:0x071a->B:423:0x071c, LOOP_END, TryCatch #4 {Exception -> 0x072a, blocks: (B:421:0x070e, B:423:0x071c, B:426:0x0731), top: B:539:0x070e }] */
    /* JADX WARN: Code duplicated, block: B:439:0x0763  */
    /* JADX WARN: Code duplicated, block: B:442:0x0769 A[Catch: Exception -> 0x0759, TryCatch #6 {Exception -> 0x0759, blocks: (B:433:0x0752, B:440:0x0765, B:442:0x0769, B:444:0x076f, B:445:0x0789, B:447:0x078d, B:449:0x0793, B:453:0x07a9, B:456:0x07b4, B:458:0x07b8, B:460:0x07be), top: B:543:0x0752 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x078d A[Catch: Exception -> 0x0759, TryCatch #6 {Exception -> 0x0759, blocks: (B:433:0x0752, B:440:0x0765, B:442:0x0769, B:444:0x076f, B:445:0x0789, B:447:0x078d, B:449:0x0793, B:453:0x07a9, B:456:0x07b4, B:458:0x07b8, B:460:0x07be), top: B:543:0x0752 }] */
    /* JADX WARN: Code duplicated, block: B:458:0x07b8 A[Catch: Exception -> 0x0759, TryCatch #6 {Exception -> 0x0759, blocks: (B:433:0x0752, B:440:0x0765, B:442:0x0769, B:444:0x076f, B:445:0x0789, B:447:0x078d, B:449:0x0793, B:453:0x07a9, B:456:0x07b4, B:458:0x07b8, B:460:0x07be), top: B:543:0x0752 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:477:0x0805  */
    /* JADX WARN: Code duplicated, block: B:479:0x081d A[LOOP:15: B:478:0x081b->B:479:0x081d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:480:0x082b  */
    /* JADX WARN: Code duplicated, block: B:482:0x0833 A[LOOP:17: B:481:0x0831->B:482:0x0833, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:484:0x0843  */
    /* JADX WARN: Code duplicated, block: B:501:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:504:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:505:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:508:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:509:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:511:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:513:0x08ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:516:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:519:0x0902 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:524:0x0916  */
    /* JADX WARN: Code duplicated, block: B:528:0x0926  */
    /* JADX WARN: Code duplicated, block: B:589:0x06fe A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᤞᲇᲁᲈ, ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᤞᲇᲈᲁ] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v112, types: [int] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v80, types: [int] */
    /* JADX WARN: Type inference failed for: r6v69, types: [int] */
    /* JADX WARN: Type inference failed for: r6v83, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m2342() {
        boolean[] zArr;
        ?? r18;
        C0779 c0779;
        int i;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i2;
        boolean zM2343;
        ?? r13;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6;
        int iMax;
        ?? r3;
        ?? r16;
        int iMax2;
        boolean z7;
        ?? r0;
        ?? r1;
        ?? r14;
        ?? r2;
        ?? r4;
        boolean zM2344;
        int size;
        int i5;
        int i6;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0779 c07710;
        C0793 c0793;
        C3639 c3639;
        C3639 c36310;
        int iM5225;
        int i7;
        ArrayList arrayList;
        C3639 c36311;
        C3639 c36312;
        boolean z8;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z9;
        int i8;
        boolean z10;
        boolean[] zArr2 = AbstractC2201.f7163;
        int i9 = 0;
        this.f3117 = 0;
        this.f3118 = 0;
        this.f3148 = false;
        this.f3149 = false;
        int size2 = this.f3135.size();
        int iMax3 = Math.max(0, m2316());
        int iMax4 = Math.max(0, m2313());
        int[] iArr = this.f3134;
        int i10 = iArr[1];
        int i11 = iArr[0];
        boolean zM3968 = AbstractC2201.m3968(this.f3147, 1);
        C0779 c07711 = this.f3102;
        C0779 c07712 = this.f3101;
        if (zM3968) {
            C0784 c0784 = this.f3138;
            int i12 = iArr[0];
            int i13 = iArr[1];
            this.f3080 = false;
            this.f3081 = false;
            ArrayList arrayList4 = this.f3110;
            int size3 = arrayList4.size();
            while (i9 < size3) {
                boolean[] zArr3 = zArr2;
                C0779 c07713 = (C0779) arrayList4.get(i9);
                c07713.f2878 = false;
                c07713.f2877 = 0;
                i9++;
                zArr2 = zArr3;
            }
            zArr = zArr2;
            boolean z11 = false;
            ArrayList arrayList5 = this.f3135;
            int size4 = arrayList5.size();
            int i14 = 0;
            while (i14 < size4) {
                int[] iArr2 = iArr;
                C0793 c0794 = (C0793) arrayList5.get(i14);
                c0794.f3080 = z11;
                c0794.f3081 = z11;
                ArrayList arrayList6 = c0794.f3110;
                int size5 = arrayList6.size();
                int i15 = i14;
                int i16 = 0;
                while (i16 < size5) {
                    int i17 = size5;
                    C0779 c07714 = (C0779) arrayList6.get(i16);
                    c07714.f2878 = false;
                    c07714.f2877 = 0;
                    i16++;
                    arrayList6 = arrayList6;
                    size5 = i17;
                }
                i14 = i15 + 1;
                z11 = false;
                iArr = iArr2;
            }
            r18 = iArr;
            boolean z12 = z11;
            boolean z13 = this.f3139;
            if (i12 == 1) {
                m2329(z12 ? 1 : 0, m2316());
            } else {
                c07712.m2281(z12 ? 1 : 0);
                this.f3117 = z12 ? 1 : 0;
            }
            boolean z14 = false;
            int i18 = 0;
            boolean z15 = false;
            while (true) {
                z9 = z14;
                if (i18 >= size4) {
                    break;
                }
                C0793 c0795 = (C0793) arrayList5.get(i18);
                int i19 = i18;
                if (c0795 instanceof C1506) {
                    C1506 c1506 = (C1506) c0795;
                    z10 = z15;
                    if (c1506.f5321 == 1) {
                        int i20 = c1506.f5318;
                        if (i20 != -1) {
                            c1506.m3244(i20);
                        } else if (c1506.f5319 != -1 && mo1487()) {
                            c1506.m3244(m2316() - c1506.f5319);
                        } else if (mo1487()) {
                            c1506.m3244((int) ((c1506.f5317 * m2316()) + 0.5f));
                        }
                        z9 = true;
                    }
                } else {
                    z10 = z15;
                    if ((c0795 instanceof C0367) && ((C0367) c0795).m1490() == 0) {
                        z14 = z9;
                        z15 = true;
                    }
                    i18 = i19 + 1;
                }
                z14 = z9;
                z15 = z10;
                i18 = i19 + 1;
            }
            boolean z16 = z15;
            if (z9) {
                int i21 = 0;
                while (i21 < size4) {
                    C0793 c0796 = (C0793) arrayList5.get(i21);
                    if (c0796 instanceof C1506) {
                        C1506 c1507 = (C1506) c0796;
                        i8 = i21;
                        if (c1507.f5321 == 1) {
                            AbstractC2202.m4008(c0784, c1507, z13);
                        }
                    } else {
                        i8 = i21;
                    }
                    i21 = i8 + 1;
                }
            }
            AbstractC2202.m4008(c0784, this, z13);
            if (z16) {
                for (int i22 = 0; i22 < size4; i22++) {
                    C0793 c0797 = (C0793) arrayList5.get(i22);
                    if (c0797 instanceof C0367) {
                        C0367 c0367 = (C0367) c0797;
                        if (c0367.m1490() == 0 && c0367.m1489()) {
                            AbstractC2202.m4008(c0784, c0367, z13);
                        }
                    }
                }
            }
            if (i13 == 1) {
                m2330(0, m2313());
            } else {
                c07711.m2281(0);
                this.f3118 = 0;
            }
            boolean z17 = false;
            boolean z18 = false;
            for (int i23 = 0; i23 < size4; i23++) {
                C0793 c0798 = (C0793) arrayList5.get(i23);
                boolean z19 = z17;
                if (c0798 instanceof C1506) {
                    C1506 c1508 = (C1506) c0798;
                    if (c1508.f5321 == 0) {
                        int i24 = c1508.f5318;
                        if (i24 != -1) {
                            c1508.m3244(i24);
                        } else if (c1508.f5319 != -1 && mo1488()) {
                            c1508.m3244(m2313() - c1508.f5319);
                        } else if (mo1488()) {
                            c1508.m3244((int) ((c1508.f5317 * m2313()) + 0.5f));
                        }
                        z18 = true;
                    }
                } else {
                    if ((c0798 instanceof C0367) && ((C0367) c0798).m1490() == 1) {
                        z17 = true;
                    }
                }
                z17 = z19;
            }
            boolean z20 = z17;
            if (z18) {
                for (int i25 = 0; i25 < size4; i25++) {
                    C0793 c0799 = (C0793) arrayList5.get(i25);
                    if (c0799 instanceof C1506) {
                        C1506 c1509 = (C1506) c0799;
                        if (c1509.f5321 == 0) {
                            AbstractC2202.m4022(c0784, c1509);
                        }
                    }
                }
            }
            AbstractC2202.m4022(c0784, this);
            if (z20) {
                for (int i26 = 0; i26 < size4; i26++) {
                    C0793 c07910 = (C0793) arrayList5.get(i26);
                    if (c07910 instanceof C0367) {
                        C0367 c0368 = (C0367) c07910;
                        if (c0368.m1490() == 1 && c0368.m1489()) {
                            AbstractC2202.m4022(c0784, c0368);
                        }
                    }
                }
            }
            for (int i27 = 0; i27 < size4; i27++) {
                C0793 c07911 = (C0793) arrayList5.get(i27);
                if (c07911.m2324() && AbstractC2202.m3996(c07911)) {
                    m2337(c07911, c0784, AbstractC2202.f7164);
                    AbstractC2202.m4008(c0784, c07911, z13);
                    AbstractC2202.m4022(c0784, c07911);
                }
            }
            for (int i28 = 0; i28 < size2; i28++) {
                C0793 c07912 = (C0793) this.f3135.get(i28);
                if (c07912.m2324() && !(c07912 instanceof C1506) && !(c07912 instanceof C0367) && !(c07912 instanceof C1367) && !c07912.f3098) {
                    int iM2312 = c07912.m2312(0);
                    int iM2313 = c07912.m2312(1);
                    if (iM2312 != 3 || c07912.f3084 == 1 || iM2313 != 3 || c07912.f3085 == 1) {
                        m2337(c07912, this.f3138, new C0407());
                    }
                }
            }
        } else {
            zArr = zArr2;
            r18 = iArr;
        }
        C1791 c1791 = this.f3140;
        if (size2 > 2 && ((i11 == 2 || i10 == 2) && AbstractC2201.m3968(this.f3147, 1024))) {
            C0784 c0785 = this.f3138;
            ArrayList arrayList7 = this.f3135;
            int size6 = arrayList7.size();
            int i29 = 0;
            while (true) {
                if (i29 >= size6) {
                    c0779 = c07712;
                    int i30 = 0;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    while (i30 < size6) {
                        int i31 = i30;
                        C0793 c07913 = (C0793) arrayList7.get(i30);
                        ArrayList arrayList14 = arrayList8;
                        ?? r5 = r18[0];
                        ArrayList arrayList15 = arrayList9;
                        ?? r6 = r18[1];
                        ArrayList arrayList16 = arrayList10;
                        int[] iArr3 = c07913.f3134;
                        ArrayList arrayList17 = arrayList11;
                        if (!AbstractC1270.m3000(r5, r6, iArr3[0], iArr3[1])) {
                            m2337(c07913, c0785, this.f3154);
                        }
                        boolean z21 = c07913 instanceof C1506;
                        if (z21) {
                            C1506 c15010 = (C1506) c07913;
                            if (c15010.f5321 == 0) {
                                arrayList10 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList10.add(c15010);
                            } else {
                                arrayList10 = arrayList16;
                            }
                            z8 = z21;
                            if (c15010.f5321 == 1) {
                                arrayList2 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList2.add(c15010);
                            } else {
                                arrayList2 = arrayList14;
                            }
                        } else {
                            z8 = z21;
                            arrayList2 = arrayList14;
                            arrayList10 = arrayList16;
                        }
                        if (c07913 instanceof AbstractC1532) {
                            if (c07913 instanceof C0367) {
                                C0367 c0369 = (C0367) c07913;
                                if (c0369.m1490() == 0) {
                                    arrayList3 = arrayList15 == null ? new ArrayList() : arrayList15;
                                    arrayList3.add(c0369);
                                } else {
                                    arrayList3 = arrayList15;
                                }
                                if (c0369.m1490() == 1) {
                                    ArrayList arrayList18 = arrayList17 == null ? new ArrayList() : arrayList17;
                                    arrayList18.add(c0369);
                                    arrayList17 = arrayList18;
                                }
                                arrayList9 = arrayList3;
                            } else {
                                arrayList2 = arrayList2;
                                c0785 = c0785;
                                AbstractC1532 abstractC1532 = (AbstractC1532) c07913;
                                arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList9.add(abstractC1532);
                                arrayList11 = arrayList17 == null ? new ArrayList() : arrayList17;
                                arrayList11.add(abstractC1532);
                            }
                            if (c07913.f3101.f2881 == null && c07913.f3103.f2881 == null && !z8 && !(c07913 instanceof C0367)) {
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                }
                                ArrayList arrayList19 = arrayList12;
                                arrayList19.add(c07913);
                                arrayList12 = arrayList19;
                            }
                            if (c07913.f3102.f2881 != null && c07913.f3104.f2881 == null && c07913.f3105.f2881 == null && !z8 && !(c07913 instanceof C0367)) {
                                if (arrayList13 == null) {
                                    arrayList13 = new ArrayList();
                                }
                                ArrayList arrayList20 = arrayList13;
                                arrayList20.add(c07913);
                                arrayList13 = arrayList20;
                            }
                            i30 = i31 + 1;
                            arrayList8 = arrayList2;
                            c0785 = c0785;
                        } else {
                            arrayList9 = arrayList15;
                        }
                        arrayList11 = arrayList17;
                        if (c07913.f3101.f2881 == null) {
                            if (arrayList12 == null) {
                                arrayList12 = new ArrayList();
                            }
                            ArrayList arrayList110 = arrayList12;
                            arrayList110.add(c07913);
                            arrayList12 = arrayList110;
                        }
                        if (c07913.f3102.f2881 != null) {
                        }
                        i30 = i31 + 1;
                        arrayList8 = arrayList2;
                        c0785 = c0785;
                    }
                    ArrayList arrayList21 = arrayList8;
                    ArrayList<AbstractC1532> arrayList22 = arrayList9;
                    ArrayList arrayList23 = arrayList10;
                    ArrayList<AbstractC1532> arrayList24 = arrayList11;
                    ArrayList<C3639> arrayList25 = new ArrayList();
                    if (arrayList21 != null) {
                        Iterator it = arrayList21.iterator();
                        while (it.hasNext()) {
                            AbstractC1270.m2979((C1506) it.next(), 0, arrayList25, null);
                        }
                    }
                    C3639 c36313 = null;
                    int i32 = 0;
                    if (arrayList22 != null) {
                        for (AbstractC1532 abstractC1533 : arrayList22) {
                            C3639 c3639M2979 = AbstractC1270.m2979(abstractC1533, i32, arrayList25, c36313);
                            abstractC1533.m3258(i32, c3639M2979, arrayList25);
                            c3639M2979.m5224(arrayList25);
                            c36313 = null;
                            i32 = 0;
                        }
                    }
                    HashSet hashSet = mo2311(2).f2876;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            AbstractC1270.m2979(((C0779) it2.next()).f2879, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet2 = mo2311(4).f2876;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            AbstractC1270.m2979(((C0779) it3.next()).f2879, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet3 = mo2311(7).f2876;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            AbstractC1270.m2979(((C0779) it4.next()).f2879, 0, arrayList25, null);
                        }
                    }
                    C3639 c36314 = null;
                    if (arrayList12 != null) {
                        Iterator it5 = arrayList12.iterator();
                        while (it5.hasNext()) {
                            AbstractC1270.m2979((C0793) it5.next(), 0, arrayList25, null);
                        }
                    }
                    if (arrayList23 != null) {
                        Iterator it6 = arrayList23.iterator();
                        while (it6.hasNext()) {
                            AbstractC1270.m2979((C1506) it6.next(), 1, arrayList25, null);
                        }
                    }
                    int i33 = 1;
                    if (arrayList24 != null) {
                        for (AbstractC1532 abstractC1534 : arrayList24) {
                            C3639 c3639M29710 = AbstractC1270.m2979(abstractC1534, i33, arrayList25, c36314);
                            abstractC1534.m3258(i33, c3639M29710, arrayList25);
                            c3639M29710.m5224(arrayList25);
                            c36314 = null;
                            i33 = 1;
                        }
                    }
                    HashSet hashSet4 = mo2311(3).f2876;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            AbstractC1270.m2979(((C0779) it7.next()).f2879, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet5 = mo2311(6).f2876;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            AbstractC1270.m2979(((C0779) it8.next()).f2879, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet6 = mo2311(5).f2876;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            AbstractC1270.m2979(((C0779) it9.next()).f2879, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet7 = mo2311(7).f2876;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            AbstractC1270.m2979(((C0779) it10.next()).f2879, 1, arrayList25, null);
                        }
                    }
                    boolean z22 = true;
                    if (arrayList13 != null) {
                        Iterator it11 = arrayList13.iterator();
                        while (it11.hasNext()) {
                            AbstractC1270.m2979((C0793) it11.next(), 1, arrayList25, null);
                        }
                    }
                    int i34 = 0;
                    while (i34 < size6) {
                        C0793 c07914 = (C0793) arrayList7.get(i34);
                        int[] iArr4 = c07914.f3134;
                        boolean z23 = z22;
                        if (iArr4[0] == 3 && iArr4[z23 ? 1 : 0] == 3) {
                            int i35 = c07914.f3132;
                            int size7 = arrayList25.size();
                            int i36 = 0;
                            while (true) {
                                if (i36 >= size7) {
                                    i7 = i34;
                                    arrayList = arrayList7;
                                    c36311 = null;
                                    break;
                                }
                                i7 = i34;
                                c36311 = (C3639) arrayList25.get(i36);
                                arrayList = arrayList7;
                                if (i35 == c36311.f11382) {
                                    break;
                                }
                                i36++;
                                arrayList7 = arrayList;
                                i34 = i7;
                            }
                            int i37 = c07914.f3133;
                            int size8 = arrayList25.size();
                            int i38 = 0;
                            while (true) {
                                if (i38 >= size8) {
                                    c36312 = null;
                                    break;
                                }
                                c36312 = (C3639) arrayList25.get(i38);
                                if (i37 == c36312.f11382) {
                                    break;
                                } else {
                                    i38++;
                                }
                            }
                            if (c36311 != null && c36312 != null) {
                                c36311.m5226(0, c36312);
                                c36312.f11383 = 2;
                                arrayList25.remove(c36311);
                            }
                        } else {
                            i7 = i34;
                            arrayList = arrayList7;
                        }
                        i34 = i7 + 1;
                        arrayList7 = arrayList;
                        z22 = true;
                    }
                    if (arrayList25.size() <= 1) {
                        break;
                    }
                    int i39 = 0;
                    if (r18[0] == 2) {
                        int i40 = 0;
                        c3639 = null;
                        for (C3639 c36315 : arrayList25) {
                            if (c36315.f11383 != 1) {
                                int iM5226 = c36315.m5225(c1791, i39);
                                if (iM5226 > i40) {
                                    c3639 = c36315;
                                    i40 = iM5226;
                                }
                                i39 = 0;
                            }
                        }
                        if (c3639 != null) {
                            m2332(1);
                            m2334(i40);
                        } else {
                            c3639 = null;
                        }
                    } else {
                        c3639 = null;
                    }
                    if (r18[1] == 2) {
                        int i41 = 0;
                        c36310 = null;
                        for (C3639 c36316 : arrayList25) {
                            if (c36316.f11383 != 0 && (iM5225 = c36316.m5225(c1791, 1)) > i41) {
                                c36310 = c36316;
                                i41 = iM5225;
                            }
                        }
                        if (c36310 != null) {
                            m2333(1);
                            m2331(i41);
                        } else {
                            c36310 = null;
                        }
                    } else {
                        c36310 = null;
                    }
                    if (c3639 != null || c36310 != null) {
                        if (i11 == 2) {
                            if (iMax3 >= m2316() || iMax3 <= 0) {
                                iMax3 = m2316();
                            } else {
                                m2334(iMax3);
                                this.f3148 = true;
                            }
                        }
                        if (i10 == 2) {
                            if (iMax4 >= m2313() || iMax4 <= 0) {
                                iMax4 = m2313();
                            } else {
                                m2331(iMax4);
                                this.f3149 = true;
                            }
                        }
                        i = iMax3;
                        z = true;
                        break;
                    }
                } else {
                    C0793 c07915 = (C0793) arrayList7.get(i29);
                    ?? r7 = r18[0];
                    ?? r8 = r18[1];
                    int i42 = i29;
                    int[] iArr5 = c07915.f3134;
                    c0779 = c07712;
                    if (AbstractC1270.m3000(r7, r8, iArr5[0], iArr5[1]) && !(c07915 instanceof C1367)) {
                        i29 = i42 + 1;
                        c07712 = c0779;
                    }
                }
            }
            if (!m2343(64) || m2343(128)) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1791.getClass();
            c1791.f5976 = false;
            if (this.f3147 == 0 && z2) {
                c = 1;
                c1791.f5976 = true;
            } else {
                c = 1;
            }
            ArrayList arrayList26 = this.f3135;
            if (r18[0] != 2 || r18[c] == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f3143 = 0;
            this.f3144 = 0;
            for (i2 = 0; i2 < size2; i2++) {
                c0793 = (C0793) this.f3135.get(i2);
                if (c0793 instanceof C0794) {
                    ((C0794) c0793).m2342();
                }
            }
            zM2343 = m2343(64);
            r13 = z;
            i3 = 0;
            z4 = true;
            while (z4) {
                int i43 = i3 + 1;
                try {
                    c1791.m3548();
                    this.f3143 = 0;
                    this.f3144 = 0;
                    m2309(c1791);
                    for (i6 = 0; i6 < size2; i6++) {
                        ((C0793) this.f3135.get(i6)).m2309(c1791);
                    }
                    m2339(c1791);
                    try {
                        weakReference = this.f3150;
                        if (weakReference != null || weakReference.get() == null) {
                            z5 = z3;
                        } else {
                            z5 = z3;
                            try {
                                c1791.m3535(c1791.m3540((C0779) this.f3150.get()), c1791.m3540(c07711), 0, 5);
                                this.f3150 = null;
                            } catch (Exception e) {
                                e = e;
                                z4 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                if (z4) {
                                    zArr[2] = false;
                                    zM2344 = m2343(64);
                                    mo2336(c1791, zM2344);
                                    size = this.f3135.size();
                                    for (i5 = 0; i5 < size; i5++) {
                                        ((C0793) this.f3135.get(i5)).mo2336(c1791, zM2344);
                                    }
                                } else {
                                    mo2336(c1791, zM2343);
                                    for (i4 = 0; i4 < size2; i4++) {
                                        ((C0793) this.f3135.get(i4)).mo2336(c1791, zM2343);
                                    }
                                }
                                if (z5) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                iMax = Math.max(this.f3120, m2316());
                                if (iMax > m2316()) {
                                    m2334(iMax);
                                    r3 = 1;
                                    r18[0] = 1;
                                    z6 = true;
                                    r16 = 1;
                                } else {
                                    r3 = 1;
                                    r16 = r13;
                                }
                                iMax2 = Math.max(this.f3121, m2313());
                                if (iMax2 > m2313()) {
                                    m2331(iMax2);
                                    r18[r3] = r3;
                                    r4 = r3;
                                    z7 = r4 == true ? 1 : 0;
                                } else {
                                    z7 = z6;
                                    r0 = r16;
                                }
                                if (r0 == 0) {
                                    if (r18[0] == 2) {
                                        r2 = r0;
                                        if (m2316() > i) {
                                            this.f3148 = r3;
                                            r18[0] = r3;
                                            m2334(i);
                                            ?? r9 = r3;
                                            z7 = r9 == true ? 1 : 0;
                                            r2 = r9;
                                        }
                                    }
                                    r0 = r4;
                                    r2 = r0;
                                    r2 = r0;
                                    r1 = r2;
                                    r1 = r2;
                                    if (r18[r3] != 2) {
                                    }
                                    z4 = z7;
                                    i3 = i43;
                                    z3 = z5;
                                    c07711 = c07711;
                                    r13 = r14;
                                } else {
                                    r0 = r4;
                                    r1 = r0;
                                }
                                r1 = r2;
                                r14 = r1;
                                z4 = z7;
                                i3 = i43;
                                z3 = z5;
                                c07711 = c07711;
                                r13 = r14;
                            }
                        }
                        weakReference2 = this.f3152;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            c1791.m3535(c1791.m3540(this.f3104), c1791.m3540((C0779) this.f3152.get()), 0, 5);
                            this.f3152 = null;
                        }
                        weakReference3 = this.f3151;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            c07710 = c0779;
                            try {
                                c0779 = c07710;
                                c1791.m3535(c1791.m3540((C0779) this.f3151.get()), c1791.m3540(c07710), 0, 5);
                                this.f3151 = null;
                            } catch (Exception e2) {
                                e = e2;
                                c0779 = c07710;
                                z4 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                if (z4) {
                                    zArr[2] = false;
                                    zM2344 = m2343(64);
                                    mo2336(c1791, zM2344);
                                    size = this.f3135.size();
                                    while (i5 < size) {
                                        ((C0793) this.f3135.get(i5)).mo2336(c1791, zM2344);
                                    }
                                } else {
                                    mo2336(c1791, zM2343);
                                    while (i4 < size2) {
                                        ((C0793) this.f3135.get(i4)).mo2336(c1791, zM2343);
                                    }
                                }
                                if (z5) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                iMax = Math.max(this.f3120, m2316());
                                if (iMax > m2316()) {
                                    m2334(iMax);
                                    r3 = 1;
                                    r18[0] = 1;
                                    z6 = true;
                                    r16 = 1;
                                } else {
                                    r3 = 1;
                                    r16 = r13;
                                }
                                iMax2 = Math.max(this.f3121, m2313());
                                if (iMax2 > m2313()) {
                                    m2331(iMax2);
                                    r18[r3] = r3;
                                    r4 = r3;
                                    z7 = r4 == true ? 1 : 0;
                                } else {
                                    z7 = z6;
                                    r0 = r16;
                                }
                                if (r0 == 0) {
                                    if (r18[0] == 2) {
                                        r2 = r0;
                                        if (m2316() > i) {
                                            this.f3148 = r3;
                                            r18[0] = r3;
                                            m2334(i);
                                            ?? r10 = r3;
                                            z7 = r10 == true ? 1 : 0;
                                            r2 = r10;
                                        }
                                    }
                                    r0 = r4;
                                    r2 = r0;
                                    r2 = r0;
                                    r1 = r2;
                                    r1 = r2;
                                    if (r18[r3] != 2) {
                                    }
                                    z4 = z7;
                                    i3 = i43;
                                    z3 = z5;
                                    c07711 = c07711;
                                    r13 = r14;
                                } else {
                                    r0 = r4;
                                    r1 = r0;
                                }
                                r1 = r2;
                                r14 = r1;
                                z4 = z7;
                                i3 = i43;
                                z3 = z5;
                                c07711 = c07711;
                                r13 = r14;
                            }
                        }
                        weakReference4 = this.f3153;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            try {
                                try {
                                    c1791.m3535(c1791.m3540(this.f3103), c1791.m3540((C0779) this.f3153.get()), 0, 5);
                                    try {
                                        this.f3153 = null;
                                    } catch (Exception e3) {
                                        e = e3;
                                        z4 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    z4 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    if (z4) {
                                        zArr[2] = false;
                                        zM2344 = m2343(64);
                                        mo2336(c1791, zM2344);
                                        size = this.f3135.size();
                                        while (i5 < size) {
                                            ((C0793) this.f3135.get(i5)).mo2336(c1791, zM2344);
                                        }
                                    } else {
                                        mo2336(c1791, zM2343);
                                        while (i4 < size2) {
                                            ((C0793) this.f3135.get(i4)).mo2336(c1791, zM2343);
                                        }
                                    }
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    iMax = Math.max(this.f3120, m2316());
                                    if (iMax > m2316()) {
                                        m2334(iMax);
                                        r3 = 1;
                                        r18[0] = 1;
                                        z6 = true;
                                        r16 = 1;
                                    } else {
                                        r3 = 1;
                                        r16 = r13;
                                    }
                                    iMax2 = Math.max(this.f3121, m2313());
                                    if (iMax2 > m2313()) {
                                        m2331(iMax2);
                                        r18[r3] = r3;
                                        r4 = r3;
                                        z7 = r4 == true ? 1 : 0;
                                    } else {
                                        z7 = z6;
                                        r0 = r16;
                                    }
                                    if (r0 == 0) {
                                        if (r18[0] == 2) {
                                            r2 = r0;
                                            if (m2316() > i) {
                                                this.f3148 = r3;
                                                r18[0] = r3;
                                                m2334(i);
                                                ?? r11 = r3;
                                                z7 = r11 == true ? 1 : 0;
                                                r2 = r11;
                                            }
                                        }
                                        r0 = r4;
                                        r2 = r0;
                                        r2 = r0;
                                        r1 = r2;
                                        r1 = r2;
                                        if (r18[r3] != 2) {
                                        }
                                        z4 = z7;
                                        i3 = i43;
                                        z3 = z5;
                                        c07711 = c07711;
                                        r13 = r14;
                                    } else {
                                        r0 = r4;
                                        r1 = r0;
                                    }
                                    r1 = r2;
                                    r14 = r1;
                                    z4 = z7;
                                    i3 = i43;
                                    z3 = z5;
                                    c07711 = c07711;
                                    r13 = r14;
                                }
                            } catch (Exception e5) {
                                e = e5;
                            }
                        }
                        c1791.m3544();
                        z4 = true;
                    } catch (Exception e6) {
                        e = e6;
                        z5 = z3;
                    }
                } catch (Exception e7) {
                    e = e7;
                    z5 = z3;
                }
                if (z4) {
                    zArr[2] = false;
                    zM2344 = m2343(64);
                    mo2336(c1791, zM2344);
                    size = this.f3135.size();
                    while (i5 < size) {
                        ((C0793) this.f3135.get(i5)).mo2336(c1791, zM2344);
                    }
                } else {
                    mo2336(c1791, zM2343);
                    while (i4 < size2) {
                        ((C0793) this.f3135.get(i4)).mo2336(c1791, zM2343);
                    }
                }
                if (z5 || i43 >= 8 || !zArr[2]) {
                    z6 = false;
                } else {
                    int iMax5 = 0;
                    int iMax6 = 0;
                    for (int i44 = 0; i44 < size2; i44++) {
                        C0793 c07916 = (C0793) this.f3135.get(i44);
                        iMax5 = Math.max(iMax5, c07916.m2316() + c07916.f3117);
                        iMax6 = Math.max(iMax6, c07916.m2313() + c07916.f3118);
                    }
                    int iMax7 = Math.max(this.f3120, iMax5);
                    int iMax8 = Math.max(this.f3121, iMax6);
                    if (i11 != 2 || m2316() >= iMax7) {
                        z6 = false;
                        r13 = r13;
                    } else {
                        m2334(iMax7);
                        r18[0] = 2;
                        z6 = true;
                        r13 = 1;
                    }
                    if (i10 == 2 && m2313() < iMax8) {
                        m2331(iMax8);
                        r18[1] = 2;
                        z6 = true;
                        r13 = 1;
                    }
                }
                iMax = Math.max(this.f3120, m2316());
                if (iMax > m2316()) {
                    m2334(iMax);
                    r3 = 1;
                    r18[0] = 1;
                    z6 = true;
                    r16 = 1;
                } else {
                    r3 = 1;
                    r16 = r13;
                }
                iMax2 = Math.max(this.f3121, m2313());
                if (iMax2 > m2313()) {
                    m2331(iMax2);
                    r18[r3] = r3;
                    r4 = r3;
                    z7 = r4 == true ? 1 : 0;
                } else {
                    z7 = z6;
                    r0 = r16;
                }
                if (r0 == 0) {
                    if (r18[0] == 2 && i > 0) {
                        r2 = r0;
                        if (m2316() > i) {
                            this.f3148 = r3;
                            r18[0] = r3;
                            m2334(i);
                            ?? r12 = r3;
                            z7 = r12 == true ? 1 : 0;
                            r2 = r12;
                        }
                    }
                    r0 = r4;
                    r2 = r0;
                    r2 = r0;
                    r1 = r2;
                    r1 = r2;
                    if (r18[r3] != 2 && iMax4 > 0 && m2313() > iMax4) {
                        r1 = r2;
                        this.f3149 = r3;
                        r18[r3] = r3;
                        m2331(iMax4);
                        z7 = true;
                        r14 = 1;
                    }
                    z4 = z7;
                    i3 = i43;
                    z3 = z5;
                    c07711 = c07711;
                    r13 = r14;
                } else {
                    r0 = r4;
                    r1 = r0;
                }
                r1 = r2;
                r14 = r1;
                z4 = z7;
                i3 = i43;
                z3 = z5;
                c07711 = c07711;
                r13 = r14;
            }
            this.f3135 = arrayList26;
            if (r13 != 0) {
                r18[0] = i11;
                r18[1] = i10;
            }
            mo2327(c1791.f5981);
        }
        c0779 = c07712;
        i = iMax3;
        z = false;
        if (m2343(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        c1791.getClass();
        c1791.f5976 = false;
        if (this.f3147 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList27 = this.f3135;
        if (r18[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.f3143 = 0;
        this.f3144 = 0;
        while (i2 < size2) {
            c0793 = (C0793) this.f3135.get(i2);
            if (c0793 instanceof C0794) {
                ((C0794) c0793).m2342();
            }
        }
        zM2343 = m2343(64);
        r13 = z;
        i3 = 0;
        z4 = true;
        while (z4) {
            int i45 = i3 + 1;
            c1791.m3548();
            this.f3143 = 0;
            this.f3144 = 0;
            m2309(c1791);
            while (i6 < size2) {
                ((C0793) this.f3135.get(i6)).m2309(c1791);
            }
            m2339(c1791);
            weakReference = this.f3150;
            if (weakReference != null) {
                z5 = z3;
                weakReference2 = this.f3152;
                if (weakReference2 != null) {
                    c1791.m3535(c1791.m3540(this.f3104), c1791.m3540((C0779) this.f3152.get()), 0, 5);
                    this.f3152 = null;
                }
                weakReference3 = this.f3151;
                if (weakReference3 != null) {
                    c07710 = c0779;
                    c0779 = c07710;
                    c1791.m3535(c1791.m3540((C0779) this.f3151.get()), c1791.m3540(c07710), 0, 5);
                    this.f3151 = null;
                }
                weakReference4 = this.f3153;
                if (weakReference4 == null) {
                }
                c1791.m3544();
                z4 = true;
            } else {
                z5 = z3;
                weakReference2 = this.f3152;
                if (weakReference2 != null) {
                    c1791.m3535(c1791.m3540(this.f3104), c1791.m3540((C0779) this.f3152.get()), 0, 5);
                    this.f3152 = null;
                }
                weakReference3 = this.f3151;
                if (weakReference3 != null) {
                    c07710 = c0779;
                    c0779 = c07710;
                    c1791.m3535(c1791.m3540((C0779) this.f3151.get()), c1791.m3540(c07710), 0, 5);
                    this.f3151 = null;
                }
                weakReference4 = this.f3153;
                if (weakReference4 == null) {
                }
                c1791.m3544();
                z4 = true;
            }
            if (z4) {
                zArr[2] = false;
                zM2344 = m2343(64);
                mo2336(c1791, zM2344);
                size = this.f3135.size();
                while (i5 < size) {
                    ((C0793) this.f3135.get(i5)).mo2336(c1791, zM2344);
                }
            } else {
                mo2336(c1791, zM2343);
                while (i4 < size2) {
                    ((C0793) this.f3135.get(i4)).mo2336(c1791, zM2343);
                }
            }
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            iMax = Math.max(this.f3120, m2316());
            if (iMax > m2316()) {
                m2334(iMax);
                r3 = 1;
                r18[0] = 1;
                z6 = true;
                r16 = 1;
            } else {
                r3 = 1;
                r16 = r13;
            }
            iMax2 = Math.max(this.f3121, m2313());
            if (iMax2 > m2313()) {
                m2331(iMax2);
                r18[r3] = r3;
                r4 = r3;
                z7 = r4 == true ? 1 : 0;
            } else {
                z7 = z6;
                r0 = r16;
            }
            if (r0 == 0) {
                if (r18[0] == 2) {
                    r2 = r0;
                    if (m2316() > i) {
                        this.f3148 = r3;
                        r18[0] = r3;
                        m2334(i);
                        ?? r15 = r3;
                        z7 = r15 == true ? 1 : 0;
                        r2 = r15;
                    }
                }
                r0 = r4;
                r2 = r0;
                r2 = r0;
                r1 = r2;
                r1 = r2;
                if (r18[r3] != 2) {
                }
                z4 = z7;
                i3 = i45;
                z3 = z5;
                c07711 = c07711;
                r13 = r14;
            } else {
                r0 = r4;
                r1 = r0;
            }
            r1 = r2;
            r14 = r1;
            z4 = z7;
            i3 = i45;
            z3 = z5;
            c07711 = c07711;
            r13 = r14;
        }
        this.f3135 = arrayList27;
        if (r13 != 0) {
            r18[0] = i11;
            r18[1] = i10;
        }
        mo2327(c1791.f5981);
    }

    public final boolean m2343(int i) {
        return (this.f3147 & i) == i;
    }
}
