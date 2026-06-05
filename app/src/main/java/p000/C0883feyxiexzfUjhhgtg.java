package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0883feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static C0883feyxiexzfUjhhgtg f3416Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public WeakHashMap f3418Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final WeakHashMap f3419Ujhhgtgfeyxiexzf = new WeakHashMap(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public TypedValue f3420Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f3421Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2363Ujhhgtgfeyxiexzf f3422Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final PorterDuff.Mode f3415Ujhhgtgfeyxiexzf = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final C0882feyxiexzfUjhhgtg f3417Ujhhgtgfeyxiexzf = new C0882feyxiexzfUjhhgtg(6);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static synchronized C0883feyxiexzfUjhhgtg m2355Ujhhgtgfeyxiexzf() {
        try {
            if (f3416Ujhhgtgfeyxiexzf == null) {
                f3416Ujhhgtgfeyxiexzf = new C0883feyxiexzfUjhhgtg();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3416Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m2356Ujhhgtgfeyxiexzf(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0882feyxiexzfUjhhgtg c0882feyxiexzfUjhhgtg = f3417Ujhhgtgfeyxiexzf;
        c0882feyxiexzfUjhhgtg.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0882feyxiexzfUjhhgtg.m4930Ujhhgtgfeyxiexzf(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Drawable m2357Ujhhgtgfeyxiexzf(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f3420Ujhhgtgfeyxiexzf == null) {
            this.f3420Ujhhgtgfeyxiexzf = new TypedValue();
        }
        TypedValue typedValue = this.f3420Ujhhgtgfeyxiexzf;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf = (C0267Ujhhgtgfeyxiexzf) this.f3419Ujhhgtgfeyxiexzf.get(context);
            drawableNewDrawable = null;
            if (c0267Ujhhgtgfeyxiexzf != null && (weakReference = (WeakReference) c0267Ujhhgtgfeyxiexzf.m1450Ujhhgtgfeyxiexzf(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM5148Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5148Ujhhgtgfeyxiexzf(c0267Ujhhgtgfeyxiexzf.f1657Ujhhgtgfeyxiexzf, c0267Ujhhgtgfeyxiexzf.f1659Ujhhgtgfeyxiexzf, j);
                    if (iM5148Ujhhgtgfeyxiexzf >= 0) {
                        Object[] objArr = c0267Ujhhgtgfeyxiexzf.f1658Ujhhgtgfeyxiexzf;
                        Object obj = objArr[iM5148Ujhhgtgfeyxiexzf];
                        Object obj2 = AbstractC3611Ujhhgtgfeyxiexzf.f11232Ujhhgtgfeyxiexzf;
                        if (obj != obj2) {
                            objArr[iM5148Ujhhgtgfeyxiexzf] = obj2;
                            c0267Ujhhgtgfeyxiexzf.f1656Ujhhgtgfeyxiexzf = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM3582Ujhhgtgfeyxiexzf = null;
        if (this.f3422Ujhhgtgfeyxiexzf != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM3582Ujhhgtgfeyxiexzf = new LayerDrawable(new Drawable[]{m2358Ujhhgtgfeyxiexzf(context, R.drawable.abc_cab_background_internal_bg), m2358Ujhhgtgfeyxiexzf(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM3582Ujhhgtgfeyxiexzf = C2363Ujhhgtgfeyxiexzf.m3582Ujhhgtgfeyxiexzf(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM3582Ujhhgtgfeyxiexzf = C2363Ujhhgtgfeyxiexzf.m3582Ujhhgtgfeyxiexzf(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM3582Ujhhgtgfeyxiexzf = C2363Ujhhgtgfeyxiexzf.m3582Ujhhgtgfeyxiexzf(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM3582Ujhhgtgfeyxiexzf == null) {
            return layerDrawableM3582Ujhhgtgfeyxiexzf;
        }
        layerDrawableM3582Ujhhgtgfeyxiexzf.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM3582Ujhhgtgfeyxiexzf.getConstantState();
                if (constantState2 != null) {
                    C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf2 = (C0267Ujhhgtgfeyxiexzf) this.f3419Ujhhgtgfeyxiexzf.get(context);
                    if (c0267Ujhhgtgfeyxiexzf2 == null) {
                        c0267Ujhhgtgfeyxiexzf2 = new C0267Ujhhgtgfeyxiexzf();
                        this.f3419Ujhhgtgfeyxiexzf.put(context, c0267Ujhhgtgfeyxiexzf2);
                    }
                    c0267Ujhhgtgfeyxiexzf2.m1452Ujhhgtgfeyxiexzf(new WeakReference(constantState2), j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM3582Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final synchronized Drawable m2358Ujhhgtgfeyxiexzf(Context context, int i) {
        return m2359Ujhhgtgfeyxiexzf(context, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final synchronized Drawable m2359Ujhhgtgfeyxiexzf(Context context, int i) {
        Drawable drawableM2357Ujhhgtgfeyxiexzf;
        try {
            if (!this.f3421Ujhhgtgfeyxiexzf) {
                this.f3421Ujhhgtgfeyxiexzf = true;
                Drawable drawableM2358Ujhhgtgfeyxiexzf = m2358Ujhhgtgfeyxiexzf(context, R.drawable.abc_vector_test);
                if (drawableM2358Ujhhgtgfeyxiexzf == null || (!(drawableM2358Ujhhgtgfeyxiexzf instanceof C1888feyxiexzfUjhhgtg) && !"android.graphics.drawable.VectorDrawable".equals(drawableM2358Ujhhgtgfeyxiexzf.getClass().getName()))) {
                    this.f3421Ujhhgtgfeyxiexzf = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM2357Ujhhgtgfeyxiexzf = m2357Ujhhgtgfeyxiexzf(context, i);
            if (drawableM2357Ujhhgtgfeyxiexzf == null) {
                drawableM2357Ujhhgtgfeyxiexzf = context.getDrawable(i);
            }
            if (drawableM2357Ujhhgtgfeyxiexzf != null) {
                drawableM2357Ujhhgtgfeyxiexzf = m2361Ujhhgtgfeyxiexzf(i, context, drawableM2357Ujhhgtgfeyxiexzf);
            }
            if (drawableM2357Ujhhgtgfeyxiexzf != null) {
                AbstractC3252feyxiexzfUjhhgtg.m4756Ujhhgtgfeyxiexzf(drawableM2357Ujhhgtgfeyxiexzf);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM2357Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final synchronized ColorStateList m2360Ujhhgtgfeyxiexzf(Context context, int i) {
        ColorStateList colorStateList;
        C1138feyxiexzfUjhhgtg c1138feyxiexzfUjhhgtg;
        WeakHashMap weakHashMap = this.f3418Ujhhgtgfeyxiexzf;
        ColorStateList colorStateListM3585Ujhhgtgfeyxiexzf = null;
        colorStateList = (weakHashMap == null || (c1138feyxiexzfUjhhgtg = (C1138feyxiexzfUjhhgtg) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1138feyxiexzfUjhhgtg.m2605Ujhhgtgfeyxiexzf(i);
        if (colorStateList == null) {
            C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = this.f3422Ujhhgtgfeyxiexzf;
            if (c2363Ujhhgtgfeyxiexzf != null) {
                colorStateListM3585Ujhhgtgfeyxiexzf = c2363Ujhhgtgfeyxiexzf.m3585Ujhhgtgfeyxiexzf(context, i);
            }
            if (colorStateListM3585Ujhhgtgfeyxiexzf != null) {
                if (this.f3418Ujhhgtgfeyxiexzf == null) {
                    this.f3418Ujhhgtgfeyxiexzf = new WeakHashMap();
                }
                C1138feyxiexzfUjhhgtg c1138feyxiexzfUjhhgtg2 = (C1138feyxiexzfUjhhgtg) this.f3418Ujhhgtgfeyxiexzf.get(context);
                if (c1138feyxiexzfUjhhgtg2 == null) {
                    c1138feyxiexzfUjhhgtg2 = new C1138feyxiexzfUjhhgtg();
                    this.f3418Ujhhgtgfeyxiexzf.put(context, c1138feyxiexzfUjhhgtg2);
                }
                c1138feyxiexzfUjhhgtg2.m2604Ujhhgtgfeyxiexzf(i, colorStateListM3585Ujhhgtgfeyxiexzf);
            }
            colorStateList = colorStateListM3585Ujhhgtgfeyxiexzf;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Drawable m2361Ujhhgtgfeyxiexzf(int i, Context context, Drawable drawable) {
        int i2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListM2360Ujhhgtgfeyxiexzf = m2360Ujhhgtgfeyxiexzf(context, i);
        if (colorStateListM2360Ujhhgtgfeyxiexzf != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListM2360Ujhhgtgfeyxiexzf);
            PorterDuff.Mode mode = null;
            if (this.f3422Ujhhgtgfeyxiexzf != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f3422Ujhhgtgfeyxiexzf != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM3350Ujhhgtgfeyxiexzf = AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C2364Ujhhgtgfeyxiexzf.f7707Ujhhgtgfeyxiexzf;
                C2363Ujhhgtgfeyxiexzf.m3583Ujhhgtgfeyxiexzf(drawableFindDrawableByLayerId, iM3350Ujhhgtgfeyxiexzf, mode2);
                C2363Ujhhgtgfeyxiexzf.m3583Ujhhgtgfeyxiexzf(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlNormal), mode2);
                C2363Ujhhgtgfeyxiexzf.m3583Ujhhgtgfeyxiexzf(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM3349Ujhhgtgfeyxiexzf = AbstractC2008feyxiexzfUjhhgtg.m3349Ujhhgtgfeyxiexzf(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C2364Ujhhgtgfeyxiexzf.f7707Ujhhgtgfeyxiexzf;
                C2363Ujhhgtgfeyxiexzf.m3583Ujhhgtgfeyxiexzf(drawableFindDrawableByLayerId2, iM3349Ujhhgtgfeyxiexzf, mode3);
                C2363Ujhhgtgfeyxiexzf.m3583Ujhhgtgfeyxiexzf(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlActivated), mode3);
                C2363Ujhhgtgfeyxiexzf.m3583Ujhhgtgfeyxiexzf(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = this.f3422Ujhhgtgfeyxiexzf;
        if (c2363Ujhhgtgfeyxiexzf != null) {
            PorterDuff.Mode mode4 = C2364Ujhhgtgfeyxiexzf.f7707Ujhhgtgfeyxiexzf;
            boolean z = true;
            if (C2363Ujhhgtgfeyxiexzf.m3580Ujhhgtgfeyxiexzf((int[]) c2363Ujhhgtgfeyxiexzf.f7701Ujhhgtgfeyxiexzf, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C2363Ujhhgtgfeyxiexzf.m3580Ujhhgtgfeyxiexzf((int[]) c2363Ujhhgtgfeyxiexzf.f7703Ujhhgtgfeyxiexzf, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C2363Ujhhgtgfeyxiexzf.m3580Ujhhgtgfeyxiexzf((int[]) c2363Ujhhgtgfeyxiexzf.f7704Ujhhgtgfeyxiexzf, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z = false;
                        i2 = 0;
                    }
                    if (z) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C2364Ujhhgtgfeyxiexzf.m3586Ujhhgtgfeyxiexzf(AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                    }
                }
                i2 = 16842801;
            }
            iRound = -1;
            if (z) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C2364Ujhhgtgfeyxiexzf.m3586Ujhhgtgfeyxiexzf(AbstractC2008feyxiexzfUjhhgtg.m3350Ujhhgtgfeyxiexzf(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
            }
        }
        return drawable;
    }
}
