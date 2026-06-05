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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲ要点脸ᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2363Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Object f7701Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Object f7702Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object f7703Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f7704Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f7705Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f7706Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m3580Ujhhgtgfeyxiexzf(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static ColorStateList m3581Ujhhgtgfeyxiexzf(Context context, int i) {
        int iM3350Ujhhgtgfeyxiexzf = AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlHighlight);
        int iM3349Ujhhgtgfeyxiexzf = AbstractC2008feyxiexzfUjhhgtg.m3349Ujhhgtgfeyxiexzf(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC2008feyxiexzfUjhhgtg.f6596Ujhhgtgfeyxiexzf;
        int[] iArr2 = AbstractC2008feyxiexzfUjhhgtg.f6598Ujhhgtgfeyxiexzf;
        int iM4260Ujhhgtgfeyxiexzf = AbstractC2857Ujhhgtgfeyxiexzf.m4260Ujhhgtgfeyxiexzf(iM3350Ujhhgtgfeyxiexzf, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC2008feyxiexzfUjhhgtg.f6597Ujhhgtgfeyxiexzf, AbstractC2008feyxiexzfUjhhgtg.f6600Ujhhgtgfeyxiexzf}, new int[]{iM3349Ujhhgtgfeyxiexzf, iM4260Ujhhgtgfeyxiexzf, AbstractC2857Ujhhgtgfeyxiexzf.m4260Ujhhgtgfeyxiexzf(iM3350Ujhhgtgfeyxiexzf, i), i});
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static LayerDrawable m3582Ujhhgtgfeyxiexzf(C0883feyxiexzfUjhhgtg c0883feyxiexzfUjhhgtg, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM2358Ujhhgtgfeyxiexzf = c0883feyxiexzfUjhhgtg.m2358Ujhhgtgfeyxiexzf(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM2358Ujhhgtgfeyxiexzf2 = c0883feyxiexzfUjhhgtg.m2358Ujhhgtgfeyxiexzf(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM2358Ujhhgtgfeyxiexzf instanceof BitmapDrawable) && drawableM2358Ujhhgtgfeyxiexzf.getIntrinsicWidth() == dimensionPixelSize && drawableM2358Ujhhgtgfeyxiexzf.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM2358Ujhhgtgfeyxiexzf;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM2358Ujhhgtgfeyxiexzf.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2358Ujhhgtgfeyxiexzf.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM2358Ujhhgtgfeyxiexzf2 instanceof BitmapDrawable) && drawableM2358Ujhhgtgfeyxiexzf2.getIntrinsicWidth() == dimensionPixelSize && drawableM2358Ujhhgtgfeyxiexzf2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM2358Ujhhgtgfeyxiexzf2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM2358Ujhhgtgfeyxiexzf2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2358Ujhhgtgfeyxiexzf2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m3583Ujhhgtgfeyxiexzf(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C2364Ujhhgtgfeyxiexzf.f7707Ujhhgtgfeyxiexzf;
        }
        drawableMutate.setColorFilter(C2364Ujhhgtgfeyxiexzf.m3586Ujhhgtgfeyxiexzf(i, mode));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01be A[LOOP:20: B:101:0x01b8->B:103:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:209:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:350:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m3584Ujhhgtgfeyxiexzf() {
        int i;
        int i2;
        int i3;
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg;
        C0591Ujhhgtgfeyxiexzf c0591Ujhhgtgfeyxiexzf;
        C1047feyxiexzfUjhhgtg c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf;
        Iterator it;
        boolean z;
        C0240Ujhhgtgfeyxiexzf c0240Ujhhgtgfeyxiexzf;
        C2792Ujhhgtgfeyxiexzf c2792Ujhhgtgfeyxiexzf;
        int[] iArr;
        int i4;
        C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf;
        int i5;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf2;
        if (((C3067Ujhhgtgfeyxiexzf) this.f7706Ujhhgtgfeyxiexzf) != null) {
            return;
        }
        C1476feyxiexzfUjhhgtg c1476feyxiexzfUjhhgtg = (C1476feyxiexzfUjhhgtg) this.f7701Ujhhgtgfeyxiexzf;
        int i6 = c1476feyxiexzfUjhhgtg.f5121Ujhhgtgfeyxiexzf;
        if (c1476feyxiexzfUjhhgtg.f5125Ujhhgtgfeyxiexzf >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.size();
        C3216feyxiexzfUjhhgtg[] c3216feyxiexzfUjhhgtgArr = new C3216feyxiexzfUjhhgtg[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            c3216feyxiexzfUjhhgtgArr[i8] = ((AbstractC3068Ujhhgtgfeyxiexzf) c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.get(i8)).f9498Ujhhgtgfeyxiexzf;
        }
        c1476feyxiexzfUjhhgtg.m2993Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgArr);
        int i9 = c1476feyxiexzfUjhhgtg.f5127Ujhhgtgfeyxiexzf;
        do {
            int i10 = ((c1476feyxiexzfUjhhgtg.f5125Ujhhgtgfeyxiexzf + i6) + c1476feyxiexzfUjhhgtg.f5126Ujhhgtgfeyxiexzf) - i9;
            Iterator it2 = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.iterator();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (it2.hasNext()) {
                C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg2 = ((AbstractC3068Ujhhgtgfeyxiexzf) it2.next()).f9500Ujhhgtgfeyxiexzf;
                for (int i15 = 0; i15 < c0960feyxiexzfUjhhgtg2.f10801Ujhhgtgfeyxiexzf.length; i15++) {
                    C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg2 = (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg2.m4969Ujhhgtgfeyxiexzf(i15);
                    if (c0961feyxiexzfUjhhgtg2.f3831Ujhhgtgfeyxiexzf.getType().m3125Ujhhgtgfeyxiexzf()) {
                        int i16 = c0961feyxiexzfUjhhgtg2.f3830Ujhhgtgfeyxiexzf;
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
                c1476feyxiexzfUjhhgtg.m2990Ujhhgtgfeyxiexzf();
            } else if (i11 <= i12) {
                if (i13 <= i14) {
                    break;
                }
                c1476feyxiexzfUjhhgtg.m2990Ujhhgtgfeyxiexzf();
                if (i9 != 0 && i12 > i11) {
                    c1476feyxiexzfUjhhgtg.m2989Ujhhgtgfeyxiexzf();
                }
            } else {
                c1476feyxiexzfUjhhgtg.m2989Ujhhgtgfeyxiexzf();
            }
        } while (c1476feyxiexzfUjhhgtg.m2993Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgArr));
        if (c1476feyxiexzfUjhhgtg.f5125Ujhhgtgfeyxiexzf == 0) {
            int size2 = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.size();
            for (int i17 = 0; i17 < size2; i17++) {
                AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.get(i17);
                C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg = abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf;
                C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg2 = c3216feyxiexzfUjhhgtgArr[i17];
                if (c3216feyxiexzfUjhhgtg != c3216feyxiexzfUjhhgtg2) {
                    c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.set(i17, abstractC3068Ujhhgtgfeyxiexzf.mo1805Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtg2));
                }
            }
            i2 = i6;
        } else {
            int size3 = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            int i18 = 0;
            while (i18 < size3) {
                AbstractC3068Ujhhgtgfeyxiexzf abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.get(i18);
                C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg3 = abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf;
                C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf.f9499Ujhhgtgfeyxiexzf;
                C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg3 = abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf.f9500Ujhhgtgfeyxiexzf;
                C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf = c3216feyxiexzfUjhhgtgArr[i18];
                if (c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf != null) {
                    size3 = size3;
                    c3216feyxiexzfUjhhgtgArr = c3216feyxiexzfUjhhgtgArr;
                    i18 = i18;
                    c0591Ujhhgtgfeyxiexzf = null;
                    c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf = null;
                } else {
                    c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf = c1476feyxiexzfUjhhgtg.m2991Ujhhgtgfeyxiexzf(abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf);
                    BitSet bitSetMo3163Ujhhgtgfeyxiexzf = c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf.f10102Ujhhgtgfeyxiexzf.mo3163Ujhhgtgfeyxiexzf(abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf);
                    boolean z3 = bitSetMo3163Ujhhgtgfeyxiexzf.get(i7);
                    boolean z4 = c3216feyxiexzfUjhhgtg3.f10103Ujhhgtgfeyxiexzf;
                    if (z4) {
                        bitSetMo3163Ujhhgtgfeyxiexzf.set(i7);
                    }
                    int length = c0960feyxiexzfUjhhgtg3.f10801Ujhhgtgfeyxiexzf.length - bitSetMo3163Ujhhgtgfeyxiexzf.cardinality();
                    if (length == 0) {
                        c0960feyxiexzfUjhhgtg = C0960feyxiexzfUjhhgtg.f3827Ujhhgtgfeyxiexzf;
                        i3 = 0;
                    } else {
                        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg4 = new C0960feyxiexzfUjhhgtg(length);
                        int i19 = 0;
                        for (int i20 = 0; i20 < c0960feyxiexzfUjhhgtg3.f10801Ujhhgtgfeyxiexzf.length; i20++) {
                            if (!bitSetMo3163Ujhhgtgfeyxiexzf.get(i20)) {
                                c0960feyxiexzfUjhhgtg4.m4970Ujhhgtgfeyxiexzf(i19, c0960feyxiexzfUjhhgtg3.m4969Ujhhgtgfeyxiexzf(i20));
                                i19++;
                            }
                        }
                        if (c0960feyxiexzfUjhhgtg3.f2247Ujhhgtgfeyxiexzf) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            c0960feyxiexzfUjhhgtg4.f2247Ujhhgtgfeyxiexzf = false;
                        }
                        c0960feyxiexzfUjhhgtg = c0960feyxiexzfUjhhgtg4;
                    }
                    if (z4) {
                        bitSetMo3163Ujhhgtgfeyxiexzf.set(i3, z3);
                    }
                    c0591Ujhhgtgfeyxiexzf = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length == 0 ? null : new C0591Ujhhgtgfeyxiexzf(c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtg);
                    if (!z4 || bitSetMo3163Ujhhgtgfeyxiexzf.get(i3)) {
                        c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf = null;
                    } else {
                        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg3 = (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg3.m4969Ujhhgtgfeyxiexzf(i3);
                        c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf = AbstractC3068Ujhhgtgfeyxiexzf.m4543Ujhhgtgfeyxiexzf(c1234feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtg3, c0961feyxiexzfUjhhgtg3.m2459Ujhhgtgfeyxiexzf(i3));
                    }
                    abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf = abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf.mo1806Ujhhgtgfeyxiexzf(c0960feyxiexzfUjhhgtg3.m2449Ujhhgtgfeyxiexzf(z4, bitSetMo3163Ujhhgtgfeyxiexzf));
                }
                if (abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf instanceof C2866feyxiexzfUjhhgtg) {
                    C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg = (C2866feyxiexzfUjhhgtg) abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf;
                    if (c2866feyxiexzfUjhhgtg.f9125Ujhhgtgfeyxiexzf) {
                        arrayList2.add(c2866feyxiexzfUjhhgtg);
                    } else {
                        if (c0591Ujhhgtgfeyxiexzf != null) {
                            arrayList.add(c0591Ujhhgtgfeyxiexzf);
                        }
                        if (!(abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf instanceof AbstractC2282feyxiexzfUjhhgtg) && arrayList2.size() > 0) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((C2866feyxiexzfUjhhgtg) it.next());
                            }
                            arrayList2.clear();
                        }
                        if (c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf != c3216feyxiexzfUjhhgtg3) {
                            abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf = abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf.mo1805Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf);
                        }
                        arrayList.add(abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf);
                        if (c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf != null) {
                            arrayList.add(c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf);
                        }
                    }
                } else {
                    if (c0591Ujhhgtgfeyxiexzf != null) {
                        arrayList.add(c0591Ujhhgtgfeyxiexzf);
                    }
                    if (!(abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf instanceof AbstractC2282feyxiexzfUjhhgtg)) {
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C2866feyxiexzfUjhhgtg) it.next());
                        }
                        arrayList2.clear();
                    }
                    if (c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf != c3216feyxiexzfUjhhgtg3) {
                        abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf = abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf.mo1805Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2991Ujhhgtgfeyxiexzf);
                    }
                    arrayList.add(abstractC3068UjhhgtgfeyxiexzfMo1806Ujhhgtgfeyxiexzf);
                    if (c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf != null) {
                        arrayList.add(c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf);
                    }
                }
                i18++;
                i6 = i6;
                size3 = size3;
                c3216feyxiexzfUjhhgtgArr = c3216feyxiexzfUjhhgtgArr;
                i7 = 0;
            }
            i2 = i6;
            c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf = arrayList;
        }
        do {
            int size4 = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.size();
            int iMo1865Ujhhgtgfeyxiexzf = 0;
            for (int i21 = 0; i21 < size4; i21++) {
                AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf2 = (AbstractC3068Ujhhgtgfeyxiexzf) c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.get(i21);
                if (iMo1865Ujhhgtgfeyxiexzf < 0) {
                    abstractC3068Ujhhgtgfeyxiexzf2.getClass();
                    throw new IllegalArgumentException("address < 0");
                }
                abstractC3068Ujhhgtgfeyxiexzf2.f9497Ujhhgtgfeyxiexzf = iMo1865Ujhhgtgfeyxiexzf;
                iMo1865Ujhhgtgfeyxiexzf += abstractC3068Ujhhgtgfeyxiexzf2.mo1865Ujhhgtgfeyxiexzf();
            }
            int size5 = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.size();
            int i22 = 0;
            z = false;
            while (i22 < size5) {
                AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf3 = (AbstractC3068Ujhhgtgfeyxiexzf) c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.get(i22);
                if (abstractC3068Ujhhgtgfeyxiexzf3 instanceof C1966Ujhhgtgfeyxiexzf) {
                    C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg4 = abstractC3068Ujhhgtgfeyxiexzf3.f9498Ujhhgtgfeyxiexzf;
                    C1966Ujhhgtgfeyxiexzf c1966Ujhhgtgfeyxiexzf = (C1966Ujhhgtgfeyxiexzf) abstractC3068Ujhhgtgfeyxiexzf3;
                    if (c3216feyxiexzfUjhhgtg4.f10102Ujhhgtgfeyxiexzf.mo3160Ujhhgtgfeyxiexzf(c1966Ujhhgtgfeyxiexzf)) {
                        continue;
                    } else {
                        if (c3216feyxiexzfUjhhgtg4.f10100Ujhhgtgfeyxiexzf == 40) {
                            C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf = c1476feyxiexzfUjhhgtg.m2992Ujhhgtgfeyxiexzf(abstractC3068Ujhhgtgfeyxiexzf3, c3216feyxiexzfUjhhgtg4);
                            if (c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.set(i22, abstractC3068Ujhhgtgfeyxiexzf3.mo1805Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf));
                        } else {
                            try {
                                int i23 = i22 + 1;
                                C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg2 = (C2866feyxiexzfUjhhgtg) c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.get(i23);
                                c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.set(i22, new C1966Ujhhgtgfeyxiexzf(AbstractC3212feyxiexzfUjhhgtg.f9993feyxiexzfUjhhgtg, c1966Ujhhgtgfeyxiexzf.f9499Ujhhgtgfeyxiexzf, C0960feyxiexzfUjhhgtg.f3827Ujhhgtgfeyxiexzf, c1966Ujhhgtgfeyxiexzf.f6447Ujhhgtgfeyxiexzf));
                                c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf.add(i22, c1966Ujhhgtgfeyxiexzf.m3300Ujhhgtgfeyxiexzf(c2866feyxiexzfUjhhgtg2));
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
        ArrayList arrayList3 = c1476feyxiexzfUjhhgtg.f5122Ujhhgtgfeyxiexzf;
        int i24 = c1476feyxiexzfUjhhgtg.f5125Ujhhgtgfeyxiexzf + i2 + c1476feyxiexzfUjhhgtg.f5126Ujhhgtgfeyxiexzf;
        int size6 = arrayList3.size();
        C3067Ujhhgtgfeyxiexzf c3067Ujhhgtgfeyxiexzf = new C3067Ujhhgtgfeyxiexzf(size6, i24);
        for (int i25 = 0; i25 < size6; i25++) {
            c3067Ujhhgtgfeyxiexzf.m4970Ujhhgtgfeyxiexzf(i25, (AbstractC3068Ujhhgtgfeyxiexzf) arrayList3.get(i25));
        }
        c3067Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        this.f7706Ujhhgtgfeyxiexzf = c3067Ujhhgtgfeyxiexzf;
        int i26 = C1450feyxiexzfUjhhgtg.f5061Ujhhgtgfeyxiexzf;
        Object obj = C1234feyxiexzfUjhhgtg.f4561Ujhhgtgfeyxiexzf;
        int length2 = c3067Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
        C1442feyxiexzfUjhhgtg[] c1442feyxiexzfUjhhgtgArr = new C1442feyxiexzfUjhhgtg[length2];
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg2 = obj;
        int i27 = 0;
        for (int i28 = 0; i28 < length2; i28++) {
            AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf4 = (AbstractC3068Ujhhgtgfeyxiexzf) c3067Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i28);
            if (!(abstractC3068Ujhhgtgfeyxiexzf4 instanceof C2866feyxiexzfUjhhgtg)) {
                C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg3 = abstractC3068Ujhhgtgfeyxiexzf4.f9499Ujhhgtgfeyxiexzf;
                if (!c1234feyxiexzfUjhhgtg3.equals(obj) && c1234feyxiexzfUjhhgtg3.f4564Ujhhgtgfeyxiexzf != c1234feyxiexzfUjhhgtg2.f4564Ujhhgtgfeyxiexzf) {
                    c1442feyxiexzfUjhhgtgArr[i27] = new C1442feyxiexzfUjhhgtg(abstractC3068Ujhhgtgfeyxiexzf4.m4544Ujhhgtgfeyxiexzf(), c1234feyxiexzfUjhhgtg3);
                    i27++;
                    c1234feyxiexzfUjhhgtg2 = c1234feyxiexzfUjhhgtg3;
                }
            }
        }
        C1450feyxiexzfUjhhgtg c1450feyxiexzfUjhhgtg = new C1450feyxiexzfUjhhgtg(i27);
        for (int i29 = 0; i29 < i27; i29++) {
            c1450feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i29, c1442feyxiexzfUjhhgtgArr[i29]);
        }
        c1450feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
        this.f7704Ujhhgtgfeyxiexzf = c1450feyxiexzfUjhhgtg;
        C3067Ujhhgtgfeyxiexzf c3067Ujhhgtgfeyxiexzf2 = (C3067Ujhhgtgfeyxiexzf) this.f7706Ujhhgtgfeyxiexzf;
        C0240Ujhhgtgfeyxiexzf c0240Ujhhgtgfeyxiexzf2 = C0240Ujhhgtgfeyxiexzf.f1570Ujhhgtgfeyxiexzf;
        int length3 = c3067Ujhhgtgfeyxiexzf2.f10801Ujhhgtgfeyxiexzf.length;
        C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf = new C3639Ujhhgtgfeyxiexzf(length3);
        int i30 = 0;
        while (true) {
            Object obj2 = c3639Ujhhgtgfeyxiexzf.f11369Ujhhgtgfeyxiexzf;
            if (i30 >= length3) {
                c3639Ujhhgtgfeyxiexzf.m5273Ujhhgtgfeyxiexzf(Integer.MAX_VALUE, 0);
                ArrayList<C0239Ujhhgtgfeyxiexzf> arrayList4 = (ArrayList) obj2;
                int size7 = arrayList4.size();
                int i31 = size7 - c3639Ujhhgtgfeyxiexzf.f11368Ujhhgtgfeyxiexzf;
                if (i31 == 0) {
                    c0240Ujhhgtgfeyxiexzf = C0240Ujhhgtgfeyxiexzf.f1570Ujhhgtgfeyxiexzf;
                } else {
                    C0239Ujhhgtgfeyxiexzf[] c0239UjhhgtgfeyxiexzfArr = new C0239Ujhhgtgfeyxiexzf[i31];
                    if (size7 == i31) {
                        arrayList4.toArray(c0239UjhhgtgfeyxiexzfArr);
                    } else {
                        int i32 = 0;
                        for (C0239Ujhhgtgfeyxiexzf c0239Ujhhgtgfeyxiexzf : arrayList4) {
                            if (c0239Ujhhgtgfeyxiexzf != null) {
                                c0239UjhhgtgfeyxiexzfArr[i32] = c0239Ujhhgtgfeyxiexzf;
                                i32++;
                            }
                        }
                    }
                    Arrays.sort(c0239UjhhgtgfeyxiexzfArr);
                    c0240Ujhhgtgfeyxiexzf = new C0240Ujhhgtgfeyxiexzf(i31);
                    for (int i33 = 0; i33 < i31; i33++) {
                        c0240Ujhhgtgfeyxiexzf.m4970Ujhhgtgfeyxiexzf(i33, c0239UjhhgtgfeyxiexzfArr[i33]);
                    }
                    c0240Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
                }
                this.f7705Ujhhgtgfeyxiexzf = c0240Ujhhgtgfeyxiexzf;
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) this.f7702Ujhhgtgfeyxiexzf;
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf2 = (C3639Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
                int[] iArr2 = (int[]) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf;
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = (C2366Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf;
                int length4 = iArr2.length;
                C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg = (C2492feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf2.f11369Ujhhgtgfeyxiexzf;
                ArrayList arrayList5 = new ArrayList(length4);
                C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf2 = C2789Ujhhgtgfeyxiexzf.f8831Ujhhgtgfeyxiexzf;
                int i34 = 0;
                C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg = null;
                C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg2 = null;
                while (i34 < length4) {
                    C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf = c2492feyxiexzfUjhhgtg.m3775Ujhhgtgfeyxiexzf(iArr2[i34]);
                    C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf.f8153Ujhhgtgfeyxiexzf;
                    if (c2657Ujhhgtgfeyxiexzf.m3984Ujhhgtgfeyxiexzf().f2786Ujhhgtgfeyxiexzf.m2428Ujhhgtgfeyxiexzf()) {
                        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf.f8154Ujhhgtgfeyxiexzf;
                        int i35 = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
                        int i36 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf.f8155Ujhhgtgfeyxiexzf;
                        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtgMo1937Ujhhgtgfeyxiexzf = c2657Ujhhgtgfeyxiexzf.m3984Ujhhgtgfeyxiexzf().mo1937Ujhhgtgfeyxiexzf();
                        int size8 = interfaceC1790feyxiexzfUjhhgtgMo1937Ujhhgtgfeyxiexzf.size();
                        if (size8 == 0) {
                            c2789Ujhhgtgfeyxiexzf = C2789Ujhhgtgfeyxiexzf.f8831Ujhhgtgfeyxiexzf;
                            iArr = iArr2;
                            i4 = length4;
                        } else {
                            if ((i36 == -1 && i35 != size8) || (i36 != -1 && (i35 != size8 + 1 || i36 != c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(size8)))) {
                                throw new RuntimeException("shouldn't happen: weird successors list");
                            }
                            for (int i37 = 0; i37 < size8; i37++) {
                                if (interfaceC1790feyxiexzfUjhhgtgMo1937Ujhhgtgfeyxiexzf.getType(i37).equals(C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg)) {
                                    size8 = i37 + 1;
                                    break;
                                }
                            }
                            C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf3 = new C2789Ujhhgtgfeyxiexzf(size8);
                            int i38 = 0;
                            while (i38 < size8) {
                                c2789Ujhhgtgfeyxiexzf3.m4970Ujhhgtgfeyxiexzf(i38, new C2788feyxiexzfUjhhgtg(new C3057Ujhhgtgfeyxiexzf(interfaceC1790feyxiexzfUjhhgtgMo1937Ujhhgtgfeyxiexzf.getType(i38)), ((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf2.f7714Ujhhgtgfeyxiexzf)[c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i38)].m4544Ujhhgtgfeyxiexzf()));
                                i38++;
                                iArr2 = iArr2;
                                length4 = length4;
                            }
                            iArr = iArr2;
                            i4 = length4;
                            c2789Ujhhgtgfeyxiexzf3.f2247Ujhhgtgfeyxiexzf = false;
                            c2789Ujhhgtgfeyxiexzf = c2789Ujhhgtgfeyxiexzf3;
                        }
                        if (c2789Ujhhgtgfeyxiexzf2.f10801Ujhhgtgfeyxiexzf.length != 0) {
                            if (c2789Ujhhgtgfeyxiexzf2.equals(c2789Ujhhgtgfeyxiexzf)) {
                                if (c2495feyxiexzfUjhhgtg == null) {
                                    throw new NullPointerException("start == null");
                                }
                                if (((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf2.f7716Ujhhgtgfeyxiexzf)[c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf.f8152Ujhhgtgfeyxiexzf].m4544Ujhhgtgfeyxiexzf() - ((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf2.f7715Ujhhgtgfeyxiexzf)[c2495feyxiexzfUjhhgtg.f8152Ujhhgtgfeyxiexzf].m4544Ujhhgtgfeyxiexzf() <= 65535) {
                                    c2495feyxiexzfUjhhgtg2 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf;
                                }
                            }
                            if (c2789Ujhhgtgfeyxiexzf2.f10801Ujhhgtgfeyxiexzf.length != 0) {
                                arrayList5.add(new C2791Ujhhgtgfeyxiexzf(((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf2.f7715Ujhhgtgfeyxiexzf)[c2495feyxiexzfUjhhgtg.f8152Ujhhgtgfeyxiexzf].m4544Ujhhgtgfeyxiexzf(), ((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf2.f7716Ujhhgtgfeyxiexzf)[c2495feyxiexzfUjhhgtg2.f8152Ujhhgtgfeyxiexzf].m4544Ujhhgtgfeyxiexzf(), c2789Ujhhgtgfeyxiexzf2));
                            }
                            c2789Ujhhgtgfeyxiexzf2 = c2789Ujhhgtgfeyxiexzf;
                            c2495feyxiexzfUjhhgtg = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf;
                            c2495feyxiexzfUjhhgtg2 = c2495feyxiexzfUjhhgtg;
                        } else {
                            c2789Ujhhgtgfeyxiexzf2 = c2789Ujhhgtgfeyxiexzf;
                            c2495feyxiexzfUjhhgtg = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf;
                            c2495feyxiexzfUjhhgtg2 = c2495feyxiexzfUjhhgtg;
                        }
                    } else {
                        c2492feyxiexzfUjhhgtg = c2492feyxiexzfUjhhgtg;
                        iArr = iArr2;
                        i4 = length4;
                    }
                    i34++;
                    c2492feyxiexzfUjhhgtg = c2492feyxiexzfUjhhgtg;
                    iArr2 = iArr;
                    length4 = i4;
                }
                if (c2789Ujhhgtgfeyxiexzf2.f10801Ujhhgtgfeyxiexzf.length != 0) {
                    arrayList5.add(new C2791Ujhhgtgfeyxiexzf(((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf2.f7715Ujhhgtgfeyxiexzf)[c2495feyxiexzfUjhhgtg.f8152Ujhhgtgfeyxiexzf].m4544Ujhhgtgfeyxiexzf(), ((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf2.f7716Ujhhgtgfeyxiexzf)[c2495feyxiexzfUjhhgtg2.f8152Ujhhgtgfeyxiexzf].m4544Ujhhgtgfeyxiexzf(), c2789Ujhhgtgfeyxiexzf2));
                }
                int size9 = arrayList5.size();
                if (size9 == 0) {
                    c2792Ujhhgtgfeyxiexzf = C2792Ujhhgtgfeyxiexzf.f8841Ujhhgtgfeyxiexzf;
                } else {
                    C2792Ujhhgtgfeyxiexzf c2792Ujhhgtgfeyxiexzf2 = new C2792Ujhhgtgfeyxiexzf(size9);
                    for (int i39 = 0; i39 < size9; i39++) {
                        c2792Ujhhgtgfeyxiexzf2.m4970Ujhhgtgfeyxiexzf(i39, (C2791Ujhhgtgfeyxiexzf) arrayList5.get(i39));
                    }
                    c2792Ujhhgtgfeyxiexzf2.f2247Ujhhgtgfeyxiexzf = false;
                    c2792Ujhhgtgfeyxiexzf = c2792Ujhhgtgfeyxiexzf2;
                }
                this.f7703Ujhhgtgfeyxiexzf = c2792Ujhhgtgfeyxiexzf;
                this.f7701Ujhhgtgfeyxiexzf = null;
                this.f7702Ujhhgtgfeyxiexzf = null;
                return;
            }
            AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf5 = (AbstractC3068Ujhhgtgfeyxiexzf) c3067Ujhhgtgfeyxiexzf2.m4969Ujhhgtgfeyxiexzf(i30);
            if (abstractC3068Ujhhgtgfeyxiexzf5 instanceof AbstractC0236Ujhhgtgfeyxiexzf) {
                abstractC3068Ujhhgtgfeyxiexzf5.m4544Ujhhgtgfeyxiexzf();
                throw null;
            }
            if (abstractC3068Ujhhgtgfeyxiexzf5 instanceof AbstractC0235Ujhhgtgfeyxiexzf) {
                int iM4544Ujhhgtgfeyxiexzf = abstractC3068Ujhhgtgfeyxiexzf5.m4544Ujhhgtgfeyxiexzf();
                ArrayList arrayList6 = (ArrayList) obj2;
                C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg4 = null;
                int i40 = c0961feyxiexzfUjhhgtg4.f3830Ujhhgtgfeyxiexzf;
                C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf = C3639Ujhhgtgfeyxiexzf.m5272Ujhhgtgfeyxiexzf(null);
                c3639Ujhhgtgfeyxiexzf.m5273Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf, i40);
                C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf3 = ((C0963feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf).m2461Ujhhgtgfeyxiexzf(i40);
                if (c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf.m2454Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf3)) {
                    i5 = i;
                } else {
                    C0961feyxiexzfUjhhgtg[] c0961feyxiexzfUjhhgtgArr = ((C0963feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf).f3833Ujhhgtgfeyxiexzf;
                    int length5 = c0961feyxiexzfUjhhgtgArr.length;
                    int i41 = 0;
                    while (true) {
                        if (i41 >= length5) {
                            c0961feyxiexzfUjhhgtg = null;
                            break;
                        }
                        c0961feyxiexzfUjhhgtg = c0961feyxiexzfUjhhgtgArr[i41];
                        if (c0961feyxiexzfUjhhgtg != null && c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf.m2456Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg)) {
                            break;
                        } else {
                            i41++;
                        }
                    }
                    if (c0961feyxiexzfUjhhgtg != null) {
                        c3639Ujhhgtgfeyxiexzf.m5275Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf, 4, c0961feyxiexzfUjhhgtg);
                    }
                    int i42 = ((int[]) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf)[i40];
                    if (c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf3 != null) {
                        c3639Ujhhgtgfeyxiexzf.m5274Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf, 3, c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf3);
                    } else if (i42 >= 0) {
                        C0239Ujhhgtgfeyxiexzf c0239Ujhhgtgfeyxiexzf2 = (C0239Ujhhgtgfeyxiexzf) arrayList6.get(i42);
                        int i43 = c0239Ujhhgtgfeyxiexzf2.f1566Ujhhgtgfeyxiexzf;
                        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg5 = c0239Ujhhgtgfeyxiexzf2.f1568Ujhhgtgfeyxiexzf;
                        if (i43 == iM4544Ujhhgtgfeyxiexzf) {
                            if (c0961feyxiexzfUjhhgtg5.m2454Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf)) {
                                arrayList6.set(i42, null);
                                c3639Ujhhgtgfeyxiexzf.f11368Ujhhgtgfeyxiexzf++;
                                ((C0963feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf).m2462Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf);
                                ((int[]) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf)[i40] = -1;
                                i5 = i;
                            } else {
                                if (3 != c0239Ujhhgtgfeyxiexzf2.f1567Ujhhgtgfeyxiexzf) {
                                    c0239Ujhhgtgfeyxiexzf2 = new C0239Ujhhgtgfeyxiexzf(c0239Ujhhgtgfeyxiexzf2.f1566Ujhhgtgfeyxiexzf, 3, c0961feyxiexzfUjhhgtg5);
                                }
                                arrayList6.set(i42, c0239Ujhhgtgfeyxiexzf2);
                            }
                        }
                    }
                    if (i40 > 0 && (c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf2 = ((C0963feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf).m2461Ujhhgtgfeyxiexzf(i40 - 1)) != null && c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf2.f3831Ujhhgtgfeyxiexzf.getType().m3125Ujhhgtgfeyxiexzf()) {
                        c3639Ujhhgtgfeyxiexzf.m5275Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf, 6, c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf2);
                    }
                    if (c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf.f3831Ujhhgtgfeyxiexzf.getType().m3125Ujhhgtgfeyxiexzf() && (c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf = ((C0963feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf).m2461Ujhhgtgfeyxiexzf(i40 + 1)) != null) {
                        c3639Ujhhgtgfeyxiexzf.m5275Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf, 5, c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf);
                    }
                    i5 = i;
                    c3639Ujhhgtgfeyxiexzf.m5274Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf, i5, c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf);
                }
            } else {
                i5 = i;
            }
            i30++;
            i = i5;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public ColorStateList m3585Ujhhgtgfeyxiexzf(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m3581Ujhhgtgfeyxiexzf(context, AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m3581Ujhhgtgfeyxiexzf(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m3581Ujhhgtgfeyxiexzf(context, AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, R.color.abc_tint_spinner);
            }
            if (m3580Ujhhgtgfeyxiexzf((int[]) this.f7702Ujhhgtgfeyxiexzf, i)) {
                return AbstractC2008feyxiexzfUjhhgtg.m3351Ujhhgtgfeyxiexzf(context, R.attr.colorControlNormal);
            }
            if (m3580Ujhhgtgfeyxiexzf((int[]) this.f7705Ujhhgtgfeyxiexzf, i)) {
                return AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, R.color.abc_tint_default);
            }
            if (m3580Ujhhgtgfeyxiexzf((int[]) this.f7706Ujhhgtgfeyxiexzf, i)) {
                return AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM3351Ujhhgtgfeyxiexzf = AbstractC2008feyxiexzfUjhhgtg.m3351Ujhhgtgfeyxiexzf(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM3351Ujhhgtgfeyxiexzf == null || !colorStateListM3351Ujhhgtgfeyxiexzf.isStateful()) {
            iArr[0] = AbstractC2008feyxiexzfUjhhgtg.f6596Ujhhgtgfeyxiexzf;
            iArr2[0] = AbstractC2008feyxiexzfUjhhgtg.m3349Ujhhgtgfeyxiexzf(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC2008feyxiexzfUjhhgtg.f6599Ujhhgtgfeyxiexzf;
            iArr2[1] = AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2008feyxiexzfUjhhgtg.f6600Ujhhgtgfeyxiexzf;
            iArr2[2] = AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC2008feyxiexzfUjhhgtg.f6596Ujhhgtgfeyxiexzf;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM3351Ujhhgtgfeyxiexzf.getColorForState(iArr3, 0);
            iArr[1] = AbstractC2008feyxiexzfUjhhgtg.f6599Ujhhgtgfeyxiexzf;
            iArr2[1] = AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2008feyxiexzfUjhhgtg.f6600Ujhhgtgfeyxiexzf;
            iArr2[2] = colorStateListM3351Ujhhgtgfeyxiexzf.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
