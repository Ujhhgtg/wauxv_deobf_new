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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᤝᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0225 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Object f1404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object f1405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object f1406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f1407;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f1409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m1389(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static ColorStateList m1390(Context context, int i) {
        int iM4981 = AbstractC2977.m4981(context, R.attr.colorControlHighlight);
        int iM4980 = AbstractC2977.m4980(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC2977.f9536;
        int[] iArr2 = AbstractC2977.f9538;
        int iM2324 = AbstractC0747.m2324(iM4981, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC2977.f9537, AbstractC2977.f9540}, new int[]{iM4980, iM2324, AbstractC0747.m2324(iM4981, i), i});
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static LayerDrawable m1391(C2633 c2633, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM4610 = c2633.m4610(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM4611 = c2633.m4610(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM4610 instanceof BitmapDrawable) && drawableM4610.getIntrinsicWidth() == dimensionPixelSize && drawableM4610.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM4610;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM4610.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM4610.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM4611 instanceof BitmapDrawable) && drawableM4611.getIntrinsicWidth() == dimensionPixelSize && drawableM4611.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM4611;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM4611.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM4611.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m1392(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0226.f1410;
        }
        drawableMutate.setColorFilter(C0226.m1395(i, mode));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01be A[LOOP:20: B:101:0x01b8->B:103:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:209:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:350:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1393() {
        int i;
        int i2;
        int i3;
        C2582 c2582;
        C1562 c1562;
        C2768 c2768M2560;
        Iterator it;
        boolean z;
        C1855 c1855;
        C0554 c0554;
        int[] iArr;
        int i4;
        C0551 c0551;
        int i5;
        C2581 c2581;
        C2581 c2581M4573;
        C2581 c2581M4574;
        if (((C0954) this.f1409) != null) {
            return;
        }
        C2341 c2341 = (C2341) this.f1404;
        int i6 = c2341.f7552;
        if (c2341.f7556 >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = c2341.f7553.size();
        C1094[] c1094Arr = new C1094[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            c1094Arr[i8] = ((AbstractC0953) c2341.f7553.get(i8)).f3483;
        }
        c2341.m4300(c1094Arr);
        int i9 = c2341.f7558;
        do {
            int i10 = ((c2341.f7556 + i6) + c2341.f7557) - i9;
            Iterator it2 = c2341.f7553.iterator();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (it2.hasNext()) {
                C2582 c2583 = ((AbstractC0953) it2.next()).f3485;
                for (int i15 = 0; i15 < c2583.f4833.length; i15++) {
                    C2581 c2584 = (C2581) c2583.m3165(i15);
                    if (c2584.f8206.getType().m5034()) {
                        int i16 = c2584.f8205;
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
                c2341.m4297();
            } else if (i11 <= i12) {
                if (i13 <= i14) {
                    break;
                }
                c2341.m4297();
                if (i9 != 0 && i12 > i11) {
                    c2341.m4296();
                }
            } else {
                c2341.m4296();
            }
        } while (c2341.m4300(c1094Arr));
        if (c2341.f7556 == 0) {
            int size2 = c2341.f7553.size();
            for (int i17 = 0; i17 < size2; i17++) {
                AbstractC0953 abstractC0953 = (AbstractC0953) c2341.f7553.get(i17);
                C1094 c1094 = abstractC0953.f3483;
                C1094 c1095 = c1094Arr[i17];
                if (c1094 != c1095) {
                    c2341.f7553.set(i17, abstractC0953.mo2533(c1095));
                }
            }
            i2 = i6;
        } else {
            int size3 = c2341.f7553.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            int i18 = 0;
            while (i18 < size3) {
                AbstractC0953 abstractC0953Mo1492 = (AbstractC0953) c2341.f7553.get(i18);
                C1094 c1096 = abstractC0953Mo1492.f3483;
                C2848 c2848 = abstractC0953Mo1492.f3484;
                C2582 c2585 = abstractC0953Mo1492.f3485;
                C1094 c1094M4298 = c1094Arr[i18];
                if (c1094M4298 != null) {
                    size3 = size3;
                    c1094Arr = c1094Arr;
                    i18 = i18;
                    c1562 = null;
                    c2768M2560 = null;
                } else {
                    c1094M4298 = c2341.m4298(abstractC0953Mo1492);
                    BitSet bitSetMo3218 = c1094M4298.f3940.mo3218(abstractC0953Mo1492);
                    boolean z3 = bitSetMo3218.get(i7);
                    boolean z4 = c1096.f3941;
                    if (z4) {
                        bitSetMo3218.set(i7);
                    }
                    int length = c2585.f4833.length - bitSetMo3218.cardinality();
                    if (length == 0) {
                        c2582 = C2582.f8208;
                        i3 = 0;
                    } else {
                        C2582 c2586 = new C2582(length);
                        int i19 = 0;
                        for (int i20 = 0; i20 < c2585.f4833.length; i20++) {
                            if (!bitSetMo3218.get(i20)) {
                                c2586.m3166(i19, c2585.m3165(i20));
                                i19++;
                            }
                        }
                        if (c2585.f7068) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            c2586.f7068 = false;
                        }
                        c2582 = c2586;
                    }
                    if (z4) {
                        bitSetMo3218.set(i3, z3);
                    }
                    c1562 = c2582.f4833.length == 0 ? null : new C1562(c2848, c2582);
                    if (!z4 || bitSetMo3218.get(i3)) {
                        c2768M2560 = null;
                    } else {
                        C2581 c2587 = (C2581) c2585.m3165(i3);
                        c2768M2560 = AbstractC0953.m2560(c2848, c2587, c2587.m4566(i3));
                    }
                    abstractC0953Mo1492 = abstractC0953Mo1492.mo1492(c2585.m4571(z4, bitSetMo3218));
                }
                if (abstractC0953Mo1492 instanceof C0729) {
                    C0729 c0729 = (C0729) abstractC0953Mo1492;
                    if (c0729.f2756) {
                        arrayList2.add(c0729);
                    } else {
                        if (c1562 != null) {
                            arrayList.add(c1562);
                        }
                        if (!(abstractC0953Mo1492 instanceof AbstractC3756) && arrayList2.size() > 0) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((C0729) it.next());
                            }
                            arrayList2.clear();
                        }
                        if (c1094M4298 != c1096) {
                            abstractC0953Mo1492 = abstractC0953Mo1492.mo2533(c1094M4298);
                        }
                        arrayList.add(abstractC0953Mo1492);
                        if (c2768M2560 != null) {
                            arrayList.add(c2768M2560);
                        }
                    }
                } else {
                    if (c1562 != null) {
                        arrayList.add(c1562);
                    }
                    if (!(abstractC0953Mo1492 instanceof AbstractC3756)) {
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C0729) it.next());
                        }
                        arrayList2.clear();
                    }
                    if (c1094M4298 != c1096) {
                        abstractC0953Mo1492 = abstractC0953Mo1492.mo2533(c1094M4298);
                    }
                    arrayList.add(abstractC0953Mo1492);
                    if (c2768M2560 != null) {
                        arrayList.add(c2768M2560);
                    }
                }
                i18++;
                i6 = i6;
                size3 = size3;
                c1094Arr = c1094Arr;
                i7 = 0;
            }
            i2 = i6;
            c2341.f7553 = arrayList;
        }
        do {
            int size4 = c2341.f7553.size();
            int iMo1490 = 0;
            for (int i21 = 0; i21 < size4; i21++) {
                AbstractC0953 abstractC0954 = (AbstractC0953) c2341.f7553.get(i21);
                if (iMo1490 < 0) {
                    abstractC0954.getClass();
                    throw new IllegalArgumentException("address < 0");
                }
                abstractC0954.f3482 = iMo1490;
                iMo1490 += abstractC0954.mo1490();
            }
            int size5 = c2341.f7553.size();
            int i22 = 0;
            z = false;
            while (i22 < size5) {
                AbstractC0953 abstractC0955 = (AbstractC0953) c2341.f7553.get(i22);
                if (abstractC0955 instanceof C2955) {
                    C1094 c1097 = abstractC0955.f3483;
                    C2955 c2955 = (C2955) abstractC0955;
                    if (c1097.f3940.mo3216(c2955)) {
                        continue;
                    } else {
                        if (c1097.f3938 == 40) {
                            C1094 c1094M4299 = c2341.m4299(abstractC0955, c1097);
                            if (c1094M4299 == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            c2341.f7553.set(i22, abstractC0955.mo2533(c1094M4299));
                        } else {
                            try {
                                int i23 = i22 + 1;
                                C0729 c07210 = (C0729) c2341.f7553.get(i23);
                                c2341.f7553.set(i22, new C2955(AbstractC1096.f3976, c2955.f3484, C2582.f8208, c2955.f9480));
                                c2341.f7553.add(i22, c2955.m4967(c07210));
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
        ArrayList arrayList3 = c2341.f7553;
        int i24 = c2341.f7556 + i2 + c2341.f7557;
        int size6 = arrayList3.size();
        C0954 c0954 = new C0954(size6, i24);
        for (int i25 = 0; i25 < size6; i25++) {
            c0954.m3166(i25, (AbstractC0953) arrayList3.get(i25));
        }
        c0954.f7068 = false;
        this.f1409 = c0954;
        int i26 = C2436.f7788;
        Object obj = C2848.f9066;
        int length2 = c0954.f4833.length;
        C2435[] c2435Arr = new C2435[length2];
        C2848 c2849 = obj;
        int i27 = 0;
        for (int i28 = 0; i28 < length2; i28++) {
            AbstractC0953 abstractC0956 = (AbstractC0953) c0954.m3165(i28);
            if (!(abstractC0956 instanceof C0729)) {
                C2848 c28410 = abstractC0956.f3484;
                if (!c28410.equals(obj) && c28410.f9069 != c2849.f9069) {
                    c2435Arr[i27] = new C2435(abstractC0956.m2561(), c28410);
                    i27++;
                    c2849 = c28410;
                }
            }
        }
        C2436 c2436 = new C2436(i27);
        for (int i29 = 0; i29 < i27; i29++) {
            c2436.m3166(i29, c2435Arr[i29]);
        }
        c2436.f7068 = false;
        this.f1407 = c2436;
        C0954 c0955 = (C0954) this.f1409;
        C1855 c1856 = C1855.f6189;
        int length3 = c0955.f4833.length;
        C0776 c0776 = new C0776(length3);
        int i30 = 0;
        while (true) {
            Object obj2 = c0776.f2879;
            if (i30 >= length3) {
                c0776.m2373(Integer.MAX_VALUE, 0);
                ArrayList<C1854> arrayList4 = (ArrayList) obj2;
                int size7 = arrayList4.size();
                int i31 = size7 - c0776.f2878;
                if (i31 == 0) {
                    c1855 = C1855.f6189;
                } else {
                    C1854[] c1854Arr = new C1854[i31];
                    if (size7 == i31) {
                        arrayList4.toArray(c1854Arr);
                    } else {
                        int i32 = 0;
                        for (C1854 c1854 : arrayList4) {
                            if (c1854 != null) {
                                c1854Arr[i32] = c1854;
                                i32++;
                            }
                        }
                    }
                    Arrays.sort(c1854Arr);
                    c1855 = new C1855(i31);
                    for (int i33 = 0; i33 < i31; i33++) {
                        c1855.m3166(i33, c1854Arr[i33]);
                    }
                    c1855.f7068 = false;
                }
                this.f1408 = c1855;
                C0253 c0253 = (C0253) this.f1405;
                C0776 c0777 = (C0776) c0253.f1478;
                int[] iArr2 = (int[]) c0253.f1479;
                C0253 c0254 = (C0253) c0253.f1480;
                int length4 = iArr2.length;
                C0379 c0379 = (C0379) c0777.f2879;
                ArrayList arrayList5 = new ArrayList(length4);
                C0551 c0552 = C0551.f2302;
                int i34 = 0;
                C0377 c0377 = null;
                C0377 c0378 = null;
                while (i34 < length4) {
                    C0377 c0377M1703 = c0379.m1703(iArr2[i34]);
                    C0417 c0417 = c0377M1703.f1870;
                    if (c0417.m1751().f5623.m4629()) {
                        C1676 c1676 = c0377M1703.f1871;
                        int i35 = c1676.f5648;
                        int i36 = c0377M1703.f1872;
                        InterfaceC3510 interfaceC3510Mo3150 = c0417.m1751().mo3150();
                        int size8 = interfaceC3510Mo3150.size();
                        if (size8 == 0) {
                            c0551 = C0551.f2302;
                            iArr = iArr2;
                            i4 = length4;
                        } else {
                            if ((i36 == -1 && i35 != size8) || (i36 != -1 && (i35 != size8 + 1 || i36 != c1676.m3548(size8)))) {
                                throw new RuntimeException("shouldn't happen: weird successors list");
                            }
                            for (int i37 = 0; i37 < size8; i37++) {
                                if (interfaceC3510Mo3150.getType(i37).equals(C3505.f11042)) {
                                    size8 = i37 + 1;
                                    break;
                                }
                            }
                            C0551 c0553 = new C0551(size8);
                            int i38 = 0;
                            while (i38 < size8) {
                                c0553.m3166(i38, new C0550(new C0917(interfaceC3510Mo3150.getType(i38)), ((C0729[]) c0254.f1478)[c1676.m3548(i38)].m2561()));
                                i38++;
                                iArr2 = iArr2;
                                length4 = length4;
                            }
                            iArr = iArr2;
                            i4 = length4;
                            c0553.f7068 = false;
                            c0551 = c0553;
                        }
                        if (c0552.f4833.length != 0) {
                            if (c0552.equals(c0551)) {
                                if (c0377 == null) {
                                    throw new NullPointerException("start == null");
                                }
                                if (((C0729[]) c0254.f1480)[c0377M1703.f1869].m2561() - ((C0729[]) c0254.f1479)[c0377.f1869].m2561() <= 65535) {
                                    c0378 = c0377M1703;
                                }
                            }
                            if (c0552.f4833.length != 0) {
                                arrayList5.add(new C0553(((C0729[]) c0254.f1479)[c0377.f1869].m2561(), ((C0729[]) c0254.f1480)[c0378.f1869].m2561(), c0552));
                            }
                            c0552 = c0551;
                            c0377 = c0377M1703;
                            c0378 = c0377;
                        } else {
                            c0552 = c0551;
                            c0377 = c0377M1703;
                            c0378 = c0377;
                        }
                    } else {
                        c0379 = c0379;
                        iArr = iArr2;
                        i4 = length4;
                    }
                    i34++;
                    c0379 = c0379;
                    iArr2 = iArr;
                    length4 = i4;
                }
                if (c0552.f4833.length != 0) {
                    arrayList5.add(new C0553(((C0729[]) c0254.f1479)[c0377.f1869].m2561(), ((C0729[]) c0254.f1480)[c0378.f1869].m2561(), c0552));
                }
                int size9 = arrayList5.size();
                if (size9 == 0) {
                    c0554 = C0554.f2312;
                } else {
                    C0554 c0555 = new C0554(size9);
                    for (int i39 = 0; i39 < size9; i39++) {
                        c0555.m3166(i39, (C0553) arrayList5.get(i39));
                    }
                    c0555.f7068 = false;
                    c0554 = c0555;
                }
                this.f1406 = c0554;
                this.f1404 = null;
                this.f1405 = null;
                return;
            }
            AbstractC0953 abstractC0957 = (AbstractC0953) c0955.m3165(i30);
            if (abstractC0957 instanceof AbstractC1856) {
                abstractC0957.m2561();
                throw null;
            }
            if (abstractC0957 instanceof AbstractC1857) {
                int iM2561 = abstractC0957.m2561();
                ArrayList arrayList6 = (ArrayList) obj2;
                C2581 c2588 = null;
                int i40 = c2588.f8205;
                C2581 c2581M2372 = C0776.m2372(null);
                c0776.m2373(iM2561, i40);
                C2581 c2581M4575 = ((C2583) c0776.f2880).m4573(i40);
                if (c2581M2372.m4561(c2581M4575)) {
                    i5 = i;
                } else {
                    C2581[] c2581Arr = ((C2583) c0776.f2880).f8209;
                    int length5 = c2581Arr.length;
                    int i41 = 0;
                    while (true) {
                        if (i41 >= length5) {
                            c2581 = null;
                            break;
                        }
                        c2581 = c2581Arr[i41];
                        if (c2581 != null && c2581M2372.m4563(c2581)) {
                            break;
                        } else {
                            i41++;
                        }
                    }
                    if (c2581 != null) {
                        c0776.m2375(iM2561, 4, c2581);
                    }
                    int i42 = ((int[]) c0776.f2881)[i40];
                    if (c2581M4575 != null) {
                        c0776.m2374(iM2561, 3, c2581M4575);
                    } else if (i42 >= 0) {
                        C1854 c1857 = (C1854) arrayList6.get(i42);
                        int i43 = c1857.f6185;
                        C2581 c2589 = c1857.f6187;
                        if (i43 == iM2561) {
                            if (c2589.m4561(c2581M2372)) {
                                arrayList6.set(i42, null);
                                c0776.f2878++;
                                ((C2583) c0776.f2880).m4574(c2581M2372);
                                ((int[]) c0776.f2881)[i40] = -1;
                                i5 = i;
                            } else {
                                if (3 != c1857.f6186) {
                                    c1857 = new C1854(c1857.f6185, 3, c2589);
                                }
                                arrayList6.set(i42, c1857);
                            }
                        }
                    }
                    if (i40 > 0 && (c2581M4574 = ((C2583) c0776.f2880).m4573(i40 - 1)) != null && c2581M4574.f8206.getType().m5034()) {
                        c0776.m2375(iM2561, 6, c2581M4574);
                    }
                    if (c2581M2372.f8206.getType().m5034() && (c2581M4573 = ((C2583) c0776.f2880).m4573(i40 + 1)) != null) {
                        c0776.m2375(iM2561, 5, c2581M4573);
                    }
                    i5 = i;
                    c0776.m2374(iM2561, i5, c2581M2372);
                }
            } else {
                i5 = i;
            }
            i30++;
            i = i5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList m1394(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC1469.m3333(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1469.m3333(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m1390(context, AbstractC2977.m4981(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m1390(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m1390(context, AbstractC2977.m4981(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1469.m3333(context, R.color.abc_tint_spinner);
            }
            if (m1389((int[]) this.f1405, i)) {
                return AbstractC2977.m4982(context, R.attr.colorControlNormal);
            }
            if (m1389((int[]) this.f1408, i)) {
                return AbstractC1469.m3333(context, R.color.abc_tint_default);
            }
            if (m1389((int[]) this.f1409, i)) {
                return AbstractC1469.m3333(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1469.m3333(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM4982 = AbstractC2977.m4982(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM4982 == null || !colorStateListM4982.isStateful()) {
            iArr[0] = AbstractC2977.f9536;
            iArr2[0] = AbstractC2977.m4980(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC2977.f9539;
            iArr2[1] = AbstractC2977.m4981(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2977.f9540;
            iArr2[2] = AbstractC2977.m4981(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC2977.f9536;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM4982.getColorForState(iArr3, 0);
            iArr[1] = AbstractC2977.f9539;
            iArr2[1] = AbstractC2977.m4981(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2977.f9540;
            iArr2[2] = colorStateListM4982.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
