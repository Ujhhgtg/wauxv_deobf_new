package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᤝᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0215 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Object f1330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object f1331;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object f1332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f1333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f1335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m1243(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static ColorStateList m1244(Context context, int i) {
        int iM4919 = AbstractC2918.m4919(context, R.attr.colorControlHighlight);
        int iM4918 = AbstractC2918.m4918(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC2918.f9369;
        int[] iArr2 = AbstractC2918.f9371;
        int iM2224 = AbstractC0752.m2224(iM4919, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC2918.f9370, AbstractC2918.f9373}, new int[]{iM4918, iM2224, AbstractC0752.m2224(iM4919, i), i});
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static LayerDrawable m1245(C2577 c2577, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM4588 = c2577.m4588(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM4589 = c2577.m4588(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM4588 instanceof BitmapDrawable) && drawableM4588.getIntrinsicWidth() == dimensionPixelSize && drawableM4588.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM4588;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM4588.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM4588.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM4589 instanceof BitmapDrawable) && drawableM4589.getIntrinsicWidth() == dimensionPixelSize && drawableM4589.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM4589;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM4589.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM4589.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m1246(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0216.f1336;
        }
        drawableMutate.setColorFilter(C0216.m1249(i, mode));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01be A[LOOP:20: B:101:0x01b8->B:103:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:209:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:350:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1247() {
        int i;
        int i2;
        int i3;
        C2526 c2526;
        C1550 c1550;
        C2706 c2706M2441;
        Iterator it;
        boolean z;
        C1828 c1828;
        C0577 c0577;
        int[] iArr;
        int i4;
        C0574 c0574;
        int i5;
        C2525 c2525;
        C2525 c2525M4551;
        C2525 c2525M4552;
        if (((C0951) this.f1335) != null) {
            return;
        }
        C2308 c2308 = (C2308) this.f1330;
        int i6 = c2308.f7430;
        if (c2308.f7434 >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = c2308.f7431.size();
        C1089[] c1089Arr = new C1089[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            c1089Arr[i8] = ((AbstractC0950) c2308.f7431.get(i8)).f3468;
        }
        c2308.m4171(c1089Arr);
        int i9 = c2308.f7436;
        do {
            int i10 = ((c2308.f7434 + i6) + c2308.f7435) - i9;
            Iterator it2 = c2308.f7431.iterator();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (it2.hasNext()) {
                C2526 c2527 = ((AbstractC0950) it2.next()).f3470;
                for (int i15 = 0; i15 < c2527.f4836.length; i15++) {
                    C2525 c2528 = (C2525) c2527.m3062(i15);
                    if (c2528.f8056.getType().m4972()) {
                        int i16 = c2528.f8055;
                        boolean z2 = i16 >= i10;
                        if ((i16 & 1) == 0) {
                            if (z2) {
                                i12++;
                            } else {
                                i14++;
                            }
                        } else if (z2) {
                            i11++;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            i = 1;
            if (i11 > i12 && i13 > i14) {
                c2308.m4168();
            } else if (i11 <= i12) {
                if (i13 <= i14) {
                    break;
                }
                c2308.m4168();
                if (i9 != 0 && i12 > i11) {
                    c2308.m4167();
                }
            } else {
                c2308.m4167();
            }
        } while (c2308.m4171(c1089Arr));
        if (c2308.f7434 == 0) {
            int size2 = c2308.f7431.size();
            for (int i17 = 0; i17 < size2; i17++) {
                AbstractC0950 abstractC0950 = (AbstractC0950) c2308.f7431.get(i17);
                C1089 c1089 = abstractC0950.f3468;
                C1089 c10810 = c1089Arr[i17];
                if (c1089 != c10810) {
                    c2308.f7431.set(i17, abstractC0950.mo2416(c10810));
                }
            }
            i2 = i6;
        } else {
            int size3 = c2308.f7431.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            int i18 = 0;
            while (i18 < size3) {
                AbstractC0950 abstractC0950Mo1346 = (AbstractC0950) c2308.f7431.get(i18);
                C1089 c10811 = abstractC0950Mo1346.f3468;
                C2788 c2788 = abstractC0950Mo1346.f3469;
                C2526 c2529 = abstractC0950Mo1346.f3470;
                C1089 c1089M4169 = c1089Arr[i18];
                if (c1089M4169 != null) {
                    size3 = size3;
                    c1089Arr = c1089Arr;
                    i18 = i18;
                    c1550 = null;
                    c2706M2441 = null;
                } else {
                    c1089M4169 = c2308.m4169(abstractC0950Mo1346);
                    BitSet bitSetMo3110 = c1089M4169.f3929.mo3110(abstractC0950Mo1346);
                    boolean z3 = bitSetMo3110.get(i7);
                    boolean z4 = c10811.f3930;
                    if (z4) {
                        bitSetMo3110.set(i7);
                    }
                    int length = c2529.f4836.length - bitSetMo3110.cardinality();
                    if (length == 0) {
                        c2526 = C2526.f8058;
                        i3 = 0;
                    } else {
                        C2526 c25210 = new C2526(length);
                        int i19 = 0;
                        for (int i20 = 0; i20 < c2529.f4836.length; i20++) {
                            if (!bitSetMo3110.get(i20)) {
                                c25210.m3063(i19, c2529.m3062(i20));
                                i19++;
                            }
                        }
                        if (c2529.f6944) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            c25210.f6944 = false;
                        }
                        c2526 = c25210;
                    }
                    if (z4) {
                        bitSetMo3110.set(i3, z3);
                    }
                    c1550 = c2526.f4836.length == 0 ? null : new C1550(c2788, c2526);
                    if (!z4 || bitSetMo3110.get(i3)) {
                        c2706M2441 = null;
                    } else {
                        C2525 c25211 = (C2525) c2529.m3062(i3);
                        c2706M2441 = AbstractC0950.m2441(c2788, c25211, c25211.m4544(i3));
                    }
                    abstractC0950Mo1346 = abstractC0950Mo1346.mo1346(c2529.m4549(z4, bitSetMo3110));
                }
                if (abstractC0950Mo1346 instanceof C0734) {
                    C0734 c0734 = (C0734) abstractC0950Mo1346;
                    if (c0734.f2762) {
                        arrayList2.add(c0734);
                    } else {
                        if (c1550 != null) {
                            arrayList.add(c1550);
                        }
                        if (!(abstractC0950Mo1346 instanceof AbstractC3693) && arrayList2.size() > 0) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((C0734) it.next());
                            }
                            arrayList2.clear();
                        }
                        if (c1089M4169 != c10811) {
                            abstractC0950Mo1346 = abstractC0950Mo1346.mo2416(c1089M4169);
                        }
                        arrayList.add(abstractC0950Mo1346);
                        if (c2706M2441 != null) {
                            arrayList.add(c2706M2441);
                        }
                    }
                } else {
                    if (c1550 != null) {
                        arrayList.add(c1550);
                    }
                    if (!(abstractC0950Mo1346 instanceof AbstractC3693)) {
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C0734) it.next());
                        }
                        arrayList2.clear();
                    }
                    if (c1089M4169 != c10811) {
                        abstractC0950Mo1346 = abstractC0950Mo1346.mo2416(c1089M4169);
                    }
                    arrayList.add(abstractC0950Mo1346);
                    if (c2706M2441 != null) {
                        arrayList.add(c2706M2441);
                    }
                }
                i18++;
                i6 = i6;
                size3 = size3;
                c1089Arr = c1089Arr;
                i7 = 0;
            }
            i2 = i6;
            c2308.f7431 = arrayList;
        }
        do {
            int size4 = c2308.f7431.size();
            int iMo1344 = 0;
            for (int i21 = 0; i21 < size4; i21++) {
                AbstractC0950 abstractC0951 = (AbstractC0950) c2308.f7431.get(i21);
                if (iMo1344 < 0) {
                    abstractC0951.getClass();
                    throw new IllegalArgumentException("address < 0");
                }
                abstractC0951.f3467 = iMo1344;
                iMo1344 += abstractC0951.mo1344();
            }
            int size5 = c2308.f7431.size();
            int i22 = 0;
            z = false;
            while (i22 < size5) {
                AbstractC0950 abstractC0952 = (AbstractC0950) c2308.f7431.get(i22);
                if (abstractC0952 instanceof C2896) {
                    C1089 c10812 = abstractC0952.f3468;
                    C2896 c2896 = (C2896) abstractC0952;
                    if (c10812.f3929.mo3108(c2896)) {
                        continue;
                    } else {
                        if (c10812.f3927 == 40) {
                            C1089 c1089M4170 = c2308.m4170(abstractC0952, c10812);
                            if (c1089M4170 == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            c2308.f7431.set(i22, abstractC0952.mo2416(c1089M4170));
                        } else {
                            try {
                                int i23 = i22 + 1;
                                C0734 c0735 = (C0734) c2308.f7431.get(i23);
                                c2308.f7431.set(i22, new C2896(AbstractC1090.f3965, c2896.f3469, C2526.f8058, c2896.f9313));
                                c2308.f7431.add(i22, c2896.m4905(c0735));
                                size5++;
                                i22 = i23;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("unpaired TargetInsn");
                            } catch (IndexOutOfBoundsException unused2) {
                                throw new IllegalStateException("unpaired TargetInsn (dangling)");
                            }
                        }
                        z = true;
                    }
                }
                i22++;
            }
        } while (z);
        ArrayList arrayList3 = c2308.f7431;
        int i24 = c2308.f7434 + i2 + c2308.f7435;
        int size6 = arrayList3.size();
        C0951 c0951 = new C0951(size6, i24);
        for (int i25 = 0; i25 < size6; i25++) {
            c0951.m3063(i25, (AbstractC0950) arrayList3.get(i25));
        }
        c0951.f6944 = false;
        this.f1335 = c0951;
        int i26 = C2383.f7644;
        Object obj = C2788.f8904;
        int length2 = c0951.f4836.length;
        C2382[] c2382Arr = new C2382[length2];
        C2788 c2789 = obj;
        int i27 = 0;
        for (int i28 = 0; i28 < length2; i28++) {
            AbstractC0950 abstractC0953 = (AbstractC0950) c0951.m3062(i28);
            if (!(abstractC0953 instanceof C0734)) {
                C2788 c27810 = abstractC0953.f3469;
                if (!c27810.equals(obj) && c27810.f8907 != c2789.f8907) {
                    c2382Arr[i27] = new C2382(abstractC0953.m2442(), c27810);
                    i27++;
                    c2789 = c27810;
                }
            }
        }
        C2383 c2383 = new C2383(i27);
        for (int i29 = 0; i29 < i27; i29++) {
            c2383.m3063(i29, c2382Arr[i29]);
        }
        c2383.f6944 = false;
        this.f1333 = c2383;
        C0951 c0952 = (C0951) this.f1335;
        C1828 c1829 = C1828.f6114;
        int length3 = c0952.f4836.length;
        C0662 c0662 = new C0662(length3);
        int i30 = 0;
        while (true) {
            Object obj2 = c0662.f2530;
            if (i30 >= length3) {
                c0662.m2048(Integer.MAX_VALUE, 0);
                ArrayList<C1827> arrayList4 = (ArrayList) obj2;
                int size7 = arrayList4.size();
                int i31 = size7 - c0662.f2529;
                if (i31 == 0) {
                    c1828 = C1828.f6114;
                } else {
                    C1827[] c1827Arr = new C1827[i31];
                    if (size7 == i31) {
                        arrayList4.toArray(c1827Arr);
                    } else {
                        int i32 = 0;
                        for (C1827 c1827 : arrayList4) {
                            if (c1827 != null) {
                                c1827Arr[i32] = c1827;
                                i32++;
                            }
                        }
                    }
                    Arrays.sort(c1827Arr);
                    c1828 = new C1828(i31);
                    for (int i33 = 0; i33 < i31; i33++) {
                        c1828.m3063(i33, c1827Arr[i33]);
                    }
                    c1828.f6944 = false;
                }
                this.f1334 = c1828;
                C0243 c0243 = (C0243) this.f1331;
                C0662 c0663 = (C0662) c0243.f1404;
                int[] iArr2 = (int[]) c0243.f1405;
                C0243 c0244 = (C0243) c0243.f1406;
                int length4 = iArr2.length;
                C0404 c0404 = (C0404) c0663.f2530;
                ArrayList arrayList5 = new ArrayList(length4);
                C0574 c0575 = C0574.f2340;
                int i34 = 0;
                C0402 c0402 = null;
                C0402 c0403 = null;
                while (i34 < length4) {
                    C0402 c0402M1597 = c0404.m1597(iArr2[i34]);
                    C0442 c0442 = c0402M1597.f1898;
                    if (c0442.m1645().f5588.m4599()) {
                        C1660 c1660 = c0402M1597.f1899;
                        int i35 = c1660.f5610;
                        int i36 = c0402M1597.f1900;
                        InterfaceC3454 interfaceC3454Mo3047 = c0442.m1645().mo3047();
                        int size8 = interfaceC3454Mo3047.size();
                        if (size8 == 0) {
                            c0574 = C0574.f2340;
                            iArr = iArr2;
                            i4 = length4;
                        } else {
                            if ((i36 == -1 && i35 != size8) || (i36 != -1 && (i35 != size8 + 1 || i36 != c1660.m3384(size8)))) {
                                throw new RuntimeException("shouldn't happen: weird successors list");
                            }
                            for (int i37 = 0; i37 < size8; i37++) {
                                if (interfaceC3454Mo3047.getType(i37).equals(C3448.f10882)) {
                                    size8 = i37 + 1;
                                    break;
                                }
                            }
                            C0574 c0576 = new C0574(size8);
                            int i38 = 0;
                            while (i38 < size8) {
                                c0576.m3063(i38, new C0573(new C0918(interfaceC3454Mo3047.getType(i38)), ((C0734[]) c0244.f1404)[c1660.m3384(i38)].m2442()));
                                i38++;
                                iArr2 = iArr2;
                                length4 = length4;
                            }
                            iArr = iArr2;
                            i4 = length4;
                            c0576.f6944 = false;
                            c0574 = c0576;
                        }
                        if (c0575.f4836.length != 0) {
                            if (c0575.equals(c0574)) {
                                if (c0402 == null) {
                                    throw new NullPointerException("start == null");
                                }
                                if (((C0734[]) c0244.f1406)[c0402M1597.f1897].m2442() - ((C0734[]) c0244.f1405)[c0402.f1897].m2442() <= 65535) {
                                    c0403 = c0402M1597;
                                }
                            }
                            if (c0575.f4836.length != 0) {
                                arrayList5.add(new C0576(((C0734[]) c0244.f1405)[c0402.f1897].m2442(), ((C0734[]) c0244.f1406)[c0403.f1897].m2442(), c0575));
                            }
                            c0575 = c0574;
                            c0402 = c0402M1597;
                            c0403 = c0402;
                        } else {
                            c0575 = c0574;
                            c0402 = c0402M1597;
                            c0403 = c0402;
                        }
                    } else {
                        c0404 = c0404;
                        iArr = iArr2;
                        i4 = length4;
                    }
                    i34++;
                    c0404 = c0404;
                    iArr2 = iArr;
                    length4 = i4;
                }
                if (c0575.f4836.length != 0) {
                    arrayList5.add(new C0576(((C0734[]) c0244.f1405)[c0402.f1897].m2442(), ((C0734[]) c0244.f1406)[c0403.f1897].m2442(), c0575));
                }
                int size9 = arrayList5.size();
                if (size9 == 0) {
                    c0577 = C0577.f2350;
                } else {
                    C0577 c0578 = new C0577(size9);
                    for (int i39 = 0; i39 < size9; i39++) {
                        c0578.m3063(i39, (C0576) arrayList5.get(i39));
                    }
                    c0578.f6944 = false;
                    c0577 = c0578;
                }
                this.f1332 = c0577;
                this.f1330 = null;
                this.f1331 = null;
                return;
            }
            AbstractC0950 abstractC0954 = (AbstractC0950) c0952.m3062(i30);
            if (abstractC0954 instanceof AbstractC1829) {
                abstractC0954.m2442();
                throw null;
            }
            if (abstractC0954 instanceof AbstractC1830) {
                int iM2442 = abstractC0954.m2442();
                ArrayList arrayList6 = (ArrayList) obj2;
                C2525 c25212 = null;
                int i40 = c25212.f8055;
                C2525 c2525M2046 = C0662.m2046(null);
                c0662.m2048(iM2442, i40);
                C2525 c2525M4553 = ((C2527) c0662.f2531).m4551(i40);
                if (c2525M2046.m4539(c2525M4553)) {
                    i5 = i;
                } else {
                    C2525[] c2525Arr = ((C2527) c0662.f2531).f8059;
                    int length5 = c2525Arr.length;
                    int i41 = 0;
                    while (true) {
                        if (i41 >= length5) {
                            c2525 = null;
                            break;
                        }
                        c2525 = c2525Arr[i41];
                        if (c2525 != null && c2525M2046.m4541(c2525)) {
                            break;
                        } else {
                            i41++;
                        }
                    }
                    if (c2525 != null) {
                        c0662.m2050(iM2442, 4, c2525);
                    }
                    int i42 = ((int[]) c0662.f2532)[i40];
                    if (c2525M4553 != null) {
                        c0662.m2049(iM2442, 3, c2525M4553);
                    } else if (i42 >= 0) {
                        C1827 c18210 = (C1827) arrayList6.get(i42);
                        int i43 = c18210.f6110;
                        C2525 c25213 = c18210.f6112;
                        if (i43 == iM2442) {
                            if (c25213.m4539(c2525M2046)) {
                                arrayList6.set(i42, null);
                                c0662.f2529++;
                                ((C2527) c0662.f2531).m4552(c2525M2046);
                                ((int[]) c0662.f2532)[i40] = -1;
                                i5 = i;
                            } else {
                                if (3 != c18210.f6111) {
                                    c18210 = new C1827(c18210.f6110, 3, c25213);
                                }
                                arrayList6.set(i42, c18210);
                            }
                        }
                    }
                    if (i40 > 0 && (c2525M4552 = ((C2527) c0662.f2531).m4551(i40 - 1)) != null && c2525M4552.f8056.getType().m4972()) {
                        c0662.m2050(iM2442, 6, c2525M4552);
                    }
                    if (c2525M2046.f8056.getType().m4972() && (c2525M4551 = ((C2527) c0662.f2531).m4551(i40 + 1)) != null) {
                        c0662.m2050(iM2442, 5, c2525M4551);
                    }
                    i5 = i;
                    c0662.m2049(iM2442, i5, c2525M2046);
                }
            } else {
                i5 = i;
            }
            i30++;
            i = i5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList m1248(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC2203.m4030(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC2203.m4030(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m1244(context, AbstractC2918.m4919(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m1244(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m1244(context, AbstractC2918.m4919(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC2203.m4030(context, R.color.abc_tint_spinner);
            }
            if (m1243((int[]) this.f1331, i)) {
                return AbstractC2918.m4920(context, R.attr.colorControlNormal);
            }
            if (m1243((int[]) this.f1334, i)) {
                return AbstractC2203.m4030(context, R.color.abc_tint_default);
            }
            if (m1243((int[]) this.f1335, i)) {
                return AbstractC2203.m4030(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC2203.m4030(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM4920 = AbstractC2918.m4920(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM4920 == null || !colorStateListM4920.isStateful()) {
            iArr[0] = AbstractC2918.f9369;
            iArr2[0] = AbstractC2918.m4918(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC2918.f9372;
            iArr2[1] = AbstractC2918.m4919(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2918.f9373;
            iArr2[2] = AbstractC2918.m4919(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC2918.f9369;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM4920.getColorForState(iArr3, 0);
            iArr[1] = AbstractC2918.f9372;
            iArr2[1] = AbstractC2918.m4919(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2918.f9373;
            iArr2[2] = colorStateListM4920.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
