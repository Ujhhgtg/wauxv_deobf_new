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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᤝᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2633 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C2633 f8325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public WeakHashMap f8327;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final WeakHashMap f8328 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public TypedValue f8329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f8330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0225 f8331;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final PorterDuff.Mode f8324 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C2632 f8326 = new C2632(6);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static synchronized C2633 m4607() {
        try {
            if (f8325 == null) {
                f8325 = new C2633();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8325;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m4608(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C2632 c2632 = f8326;
        c2632.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c2632.m3136(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Drawable m4609(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f8329 == null) {
            this.f8329 = new TypedValue();
        }
        TypedValue typedValue = this.f8329;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C1889 c1889 = (C1889) this.f8328.get(context);
            drawableNewDrawable = null;
            if (c1889 != null && (weakReference = (WeakReference) c1889.m3809(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM3324 = AbstractC1469.m3324(c1889.f6262, c1889.f6264, j);
                    if (iM3324 >= 0) {
                        Object[] objArr = c1889.f6263;
                        Object obj = objArr[iM3324];
                        Object obj2 = AbstractC1468.f5217;
                        if (obj != obj2) {
                            objArr[iM3324] = obj2;
                            c1889.f6261 = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM1391 = null;
        if (this.f8331 != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM1391 = new LayerDrawable(new Drawable[]{m4610(context, R.drawable.abc_cab_background_internal_bg), m4610(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM1391 = C0225.m1391(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM1391 = C0225.m1391(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM1391 = C0225.m1391(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM1391 == null) {
            return layerDrawableM1391;
        }
        layerDrawableM1391.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM1391.getConstantState();
                if (constantState2 != null) {
                    C1889 c18810 = (C1889) this.f8328.get(context);
                    if (c18810 == null) {
                        c18810 = new C1889();
                        this.f8328.put(context, c18810);
                    }
                    c18810.m3811(new WeakReference(constantState2), j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM1391;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final synchronized Drawable m4610(Context context, int i) {
        return m4611(context, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final synchronized Drawable m4611(Context context, int i) {
        Drawable drawableM4609;
        try {
            if (!this.f8330) {
                this.f8330 = true;
                Drawable drawableM4610 = m4610(context, R.drawable.abc_vector_test);
                if (drawableM4610 == null || (!(drawableM4610 instanceof C3600) && !"android.graphics.drawable.VectorDrawable".equals(drawableM4610.getClass().getName()))) {
                    this.f8330 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM4609 = m4609(context, i);
            if (drawableM4609 == null) {
                drawableM4609 = context.getDrawable(i);
            }
            if (drawableM4609 != null) {
                drawableM4609 = m4613(i, context, drawableM4609);
            }
            if (drawableM4609 != null) {
                AbstractC1111.m2823(drawableM4609);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM4609;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final synchronized ColorStateList m4612(Context context, int i) {
        ColorStateList colorStateList;
        C2854 c2854;
        WeakHashMap weakHashMap = this.f8327;
        ColorStateList colorStateListM1394 = null;
        colorStateList = (weakHashMap == null || (c2854 = (C2854) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2854.m4810(i);
        if (colorStateList == null) {
            C0225 c0225 = this.f8331;
            if (c0225 != null) {
                colorStateListM1394 = c0225.m1394(context, i);
            }
            if (colorStateListM1394 != null) {
                if (this.f8327 == null) {
                    this.f8327 = new WeakHashMap();
                }
                C2854 c2855 = (C2854) this.f8327.get(context);
                if (c2855 == null) {
                    c2855 = new C2854();
                    this.f8327.put(context, c2855);
                }
                c2855.m4809(i, colorStateListM1394);
            }
            colorStateList = colorStateListM1394;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Drawable m4613(int i, Context context, Drawable drawable) {
        int i2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListM4612 = m4612(context, i);
        if (colorStateListM4612 != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListM4612);
            PorterDuff.Mode mode = null;
            if (this.f8331 != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f8331 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM4981 = AbstractC2977.m4981(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0226.f1410;
                C0225.m1392(drawableFindDrawableByLayerId, iM4981, mode2);
                C0225.m1392(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2977.m4981(context, R.attr.colorControlNormal), mode2);
                C0225.m1392(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC2977.m4981(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM4980 = AbstractC2977.m4980(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0226.f1410;
                C0225.m1392(drawableFindDrawableByLayerId2, iM4980, mode3);
                C0225.m1392(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2977.m4981(context, R.attr.colorControlActivated), mode3);
                C0225.m1392(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC2977.m4981(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0225 c0225 = this.f8331;
        if (c0225 != null) {
            PorterDuff.Mode mode4 = C0226.f1410;
            boolean z = true;
            if (C0225.m1389((int[]) c0225.f1404, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C0225.m1389((int[]) c0225.f1406, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0225.m1389((int[]) c0225.f1407, i)) {
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
                        drawableMutate.setColorFilter(C0226.m1395(AbstractC2977.m4981(context, i2), mode4));
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
                drawableMutate.setColorFilter(C0226.m1395(AbstractC2977.m4981(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
            }
        }
        return drawable;
    }
}
