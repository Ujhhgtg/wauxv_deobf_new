package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Field;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲀᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final double f6388 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final ColorDrawable f6389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final MaterialCardView f6390;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1948 f6392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1948 f6393;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6394;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6395;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6396;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6397;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public Drawable f6398;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public Drawable f6399;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f6400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public ColorStateList f6401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C2738 f6402;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ColorStateList f6403;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public RippleDrawable f6404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public LayerDrawable f6405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C1948 f6406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f6408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public ValueAnimator f6409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final TimeInterpolator f6410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int f6411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int f6412;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Rect f6391 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f6407 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public float f6413 = 0.0f;

    static {
        f6389 = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C1941(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f6390 = materialCardView;
        C1948 c1948 = new C1948(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f6392 = c1948;
        c1948.m3912(materialCardView.getContext());
        c1948.m3916();
        C2737 c2737M4728 = c1948.f6437.f6419.m4728();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC2521.f7988, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            c2737M4728.m4723(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f6393 = new C1948();
        m3898(c2737M4728.m4722());
        this.f6410 = AbstractC3744.m5342(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0172.f1253);
        this.f6411 = AbstractC3744.m5341(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f6412 = AbstractC3744.m5341(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static float m3891(AbstractC1471 abstractC1471, float f) {
        if (abstractC1471 instanceof C2666) {
            return (float) ((1.0d - f6388) * ((double) f));
        }
        if (abstractC1471 instanceof C0950) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final float m3892() {
        AbstractC1471 abstractC1471 = this.f6402.f8798;
        C1948 c1948 = this.f6392;
        return Math.max(Math.max(m3891(abstractC1471, c1948.m3910()), m3891(this.f6402.f8799, c1948.f6437.f6419.f8803.mo1060(c1948.m3909()))), Math.max(m3891(this.f6402.f8800, c1948.f6437.f6419.f8804.mo1060(c1948.m3909())), m3891(this.f6402.f8801, c1948.f6437.f6419.f8805.mo1060(c1948.m3909()))));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final LayerDrawable m3893() {
        if (this.f6404 == null) {
            int[] iArr = AbstractC2646.f8350;
            this.f6406 = new C1948(this.f6402);
            this.f6404 = new RippleDrawable(this.f6400, null, this.f6406);
        }
        if (this.f6405 == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f6404, this.f6393, this.f6399});
            this.f6405 = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f6405;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1940 m3894(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.f6390;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (m3899() ? m3892() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (m3899() ? m3892() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C1940(drawable, iCeil, i, iCeil, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3895(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f6405 != null) {
            MaterialCardView materialCardView = this.f6390;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m3899() ? m3892() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m3899() ? m3892() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f6396;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.f6394) - this.f6395) - iCeil2 : this.f6394;
            int i7 = (i5 & 80) == 80 ? this.f6394 : ((i2 - this.f6394) - this.f6395) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.f6394 : ((i - this.f6394) - this.f6395) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.f6394) - this.f6395) - iCeil : this.f6394;
            Field field = AbstractC3638.f11333;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.f6405.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3896(boolean z, boolean z2) {
        Drawable drawable = this.f6399;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.f6413 = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = z ? 1.0f - this.f6413 : this.f6413;
            ValueAnimator valueAnimator = this.f6409;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f6409 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f6413, f);
            this.f6409 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C1121(this, 1));
            this.f6409.setInterpolator(this.f6410);
            this.f6409.setDuration((long) ((z ? this.f6411 : this.f6412) * f2));
            this.f6409.start();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3897(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f6399 = drawableMutate;
            drawableMutate.setTintList(this.f6401);
            m3896(this.f6390.f712, false);
        } else {
            this.f6399 = f6389;
        }
        LayerDrawable layerDrawable = this.f6405;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f6399);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3898(C2738 c2738) {
        this.f6402 = c2738;
        C1948 c1948 = this.f6392;
        c1948.setShapeAppearanceModel(c2738);
        c1948.f6458 = !c1948.f6437.f6419.m4727(c1948.m3909());
        C1948 c1949 = this.f6393;
        if (c1949 != null) {
            c1949.setShapeAppearanceModel(c2738);
        }
        C1948 c19410 = this.f6406;
        if (c19410 != null) {
            c19410.setShapeAppearanceModel(c2738);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m3899() {
        MaterialCardView materialCardView = this.f6390;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        C1948 c1948 = this.f6392;
        return c1948.f6437.f6419.m4727(c1948.m3909()) && materialCardView.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m3900() {
        View view = this.f6390;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3901() {
        Drawable drawable = this.f6398;
        Drawable drawableM3893 = m3900() ? m3893() : this.f6393;
        this.f6398 = drawableM3893;
        if (drawable != drawableM3893) {
            MaterialCardView materialCardView = this.f6390;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM3893);
            } else {
                materialCardView.setForeground(m3894(drawableM3893));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3902() {
        float fM3892;
        MaterialCardView materialCardView = this.f6390;
        float cardViewRadius = 0.0f;
        if (materialCardView.getPreventCornerOverlap()) {
            C1948 c1948 = this.f6392;
            if (!c1948.f6437.f6419.m4727(c1948.m3909())) {
                fM3892 = m3892();
            } else if (m3899()) {
                fM3892 = m3892();
            } else {
                fM3892 = 0.0f;
            }
        } else if (m3899()) {
            fM3892 = m3892();
        } else {
            fM3892 = 0.0f;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f6388) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fM3892 - cardViewRadius);
        Rect rect = this.f6391;
        materialCardView.f2253.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        C0519 c0519 = materialCardView.f2255;
        AbstractC0539 abstractC0539 = (AbstractC0539) c0519.f2209;
        if (!abstractC0539.getUseCompatPadding()) {
            c0519.m2011(0, 0, 0, 0);
            return;
        }
        C2663 c2663 = (C2663) ((Drawable) c0519.f2208);
        float f = c2663.f8630;
        float f2 = c2663.f8626;
        int iCeil = (int) Math.ceil(AbstractC2664.m4660(f, f2, abstractC0539.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC2664.m4661(f, f2, abstractC0539.getPreventCornerOverlap()));
        c0519.m2011(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3903() {
        boolean z = this.f6407;
        MaterialCardView materialCardView = this.f6390;
        if (!z) {
            materialCardView.setBackgroundInternal(m3894(this.f6392));
        }
        materialCardView.setForeground(m3894(this.f6398));
    }
}
