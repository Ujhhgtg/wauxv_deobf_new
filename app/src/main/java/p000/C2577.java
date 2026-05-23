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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2577 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C2577 f8172;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public WeakHashMap f8174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final WeakHashMap f8175 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public TypedValue f8176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f8177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0215 f8178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final PorterDuff.Mode f8171 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C2576 f8173 = new C2576(6);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static synchronized C2577 m4585() {
        try {
            if (f8172 == null) {
                f8172 = new C2577();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8172;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m4586(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C2576 c2576 = f8173;
        c2576.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c2576.m3033(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Drawable m4587(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f8176 == null) {
            this.f8176 = new TypedValue();
        }
        TypedValue typedValue = this.f8176;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C1863 c1863 = (C1863) this.f8175.get(context);
            drawableNewDrawable = null;
            if (c1863 != null && (weakReference = (WeakReference) c1863.m3631(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM3206 = AbstractC1460.m3206(c1863.f6188, c1863.f6190, j);
                    if (iM3206 >= 0) {
                        Object[] objArr = c1863.f6189;
                        Object obj = objArr[iM3206];
                        Object obj2 = AbstractC1460.f5198;
                        if (obj != obj2) {
                            objArr[iM3206] = obj2;
                            c1863.f6187 = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM1245 = null;
        if (this.f8178 != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM1245 = new LayerDrawable(new Drawable[]{m4588(context, R.drawable.abc_cab_background_internal_bg), m4588(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM1245 = C0215.m1245(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM1245 = C0215.m1245(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM1245 = C0215.m1245(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM1245 == null) {
            return layerDrawableM1245;
        }
        layerDrawableM1245.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM1245.getConstantState();
                if (constantState2 != null) {
                    C1863 c1864 = (C1863) this.f8175.get(context);
                    if (c1864 == null) {
                        c1864 = new C1863();
                        this.f8175.put(context, c1864);
                    }
                    c1864.m3633(new WeakReference(constantState2), j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM1245;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final synchronized Drawable m4588(Context context, int i) {
        return m4589(context, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final synchronized Drawable m4589(Context context, int i) {
        Drawable drawableM4587;
        try {
            if (!this.f8177) {
                this.f8177 = true;
                Drawable drawableM4588 = m4588(context, R.drawable.abc_vector_test);
                if (drawableM4588 == null || (!(drawableM4588 instanceof C3542) && !"android.graphics.drawable.VectorDrawable".equals(drawableM4588.getClass().getName()))) {
                    this.f8177 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM4587 = m4587(context, i);
            if (drawableM4587 == null) {
                drawableM4587 = context.getDrawable(i);
            }
            if (drawableM4587 != null) {
                drawableM4587 = m4591(i, context, drawableM4587);
            }
            if (drawableM4587 != null) {
                AbstractC1105.m2674(drawableM4587);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM4587;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final synchronized ColorStateList m4590(Context context, int i) {
        ColorStateList colorStateList;
        C2794 c2794;
        WeakHashMap weakHashMap = this.f8174;
        ColorStateList colorStateListM1248 = null;
        colorStateList = (weakHashMap == null || (c2794 = (C2794) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2794.m4777(i);
        if (colorStateList == null) {
            C0215 c0215 = this.f8178;
            if (c0215 != null) {
                colorStateListM1248 = c0215.m1248(context, i);
            }
            if (colorStateListM1248 != null) {
                if (this.f8174 == null) {
                    this.f8174 = new WeakHashMap();
                }
                C2794 c2795 = (C2794) this.f8174.get(context);
                if (c2795 == null) {
                    c2795 = new C2794();
                    this.f8174.put(context, c2795);
                }
                c2795.m4776(i, colorStateListM1248);
            }
            colorStateList = colorStateListM1248;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Drawable m4591(int i, Context context, Drawable drawable) {
        int i2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListM4590 = m4590(context, i);
        if (colorStateListM4590 != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListM4590);
            PorterDuff.Mode mode = null;
            if (this.f8178 != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f8178 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM4919 = AbstractC2918.m4919(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0216.f1336;
                C0215.m1246(drawableFindDrawableByLayerId, iM4919, mode2);
                C0215.m1246(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2918.m4919(context, R.attr.colorControlNormal), mode2);
                C0215.m1246(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC2918.m4919(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM4918 = AbstractC2918.m4918(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0216.f1336;
                C0215.m1246(drawableFindDrawableByLayerId2, iM4918, mode3);
                C0215.m1246(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2918.m4919(context, R.attr.colorControlActivated), mode3);
                C0215.m1246(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC2918.m4919(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0215 c0215 = this.f8178;
        if (c0215 != null) {
            PorterDuff.Mode mode4 = C0216.f1336;
            boolean z = true;
            if (C0215.m1243((int[]) c0215.f1330, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C0215.m1243((int[]) c0215.f1332, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0215.m1243((int[]) c0215.f1333, i)) {
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
                        drawableMutate.setColorFilter(C0216.m1249(AbstractC2918.m4919(context, i2), mode4));
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
                drawableMutate.setColorFilter(C0216.m1249(AbstractC2918.m4919(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
            }
        }
        return drawable;
    }
}
