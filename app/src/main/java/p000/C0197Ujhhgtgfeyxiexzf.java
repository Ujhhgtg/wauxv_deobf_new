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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳᛴ要点脸ᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0197Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final double f1423feyxiexzfUjhhgtg = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final ColorDrawable f1424feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final MaterialCardView f1425Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf f1427Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf f1428Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1429Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f1430Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f1431Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f1432Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Drawable f1433Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f1434Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public ColorStateList f1435Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f1436Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public C1017feyxiexzfUjhhgtg f1437Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public ColorStateList f1438Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public RippleDrawable f1439Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public LayerDrawable f1440Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C0226Ujhhgtgfeyxiexzf f1441Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public boolean f1443Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public ValueAnimator f1444Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final TimeInterpolator f1445Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f1446Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int f1447Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Rect f1426Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f1442Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f1448Ujhhgtgfeyxiexzf = 0.0f;

    static {
        f1424feyxiexzfUjhhgtg = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C0197Ujhhgtgfeyxiexzf(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f1425Ujhhgtgfeyxiexzf = materialCardView;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f1427Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf;
        c0226Ujhhgtgfeyxiexzf.m1367Ujhhgtgfeyxiexzf(materialCardView.getContext());
        c0226Ujhhgtgfeyxiexzf.m1371Ujhhgtgfeyxiexzf();
        C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3119Ujhhgtgfeyxiexzf, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2508Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f1428Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf();
        m1266Ujhhgtgfeyxiexzf(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
        this.f1445Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9412Ujhhgtgfeyxiexzf);
        this.f1446Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f1447Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static float m1259Ujhhgtgfeyxiexzf(AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtg, float f) {
        if (abstractC3612feyxiexzfUjhhgtg instanceof C0945feyxiexzfUjhhgtg) {
            return (float) ((1.0d - f1423feyxiexzfUjhhgtg) * ((double) f));
        }
        if (abstractC3612feyxiexzfUjhhgtg instanceof C3063Ujhhgtgfeyxiexzf) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final float m1260Ujhhgtgfeyxiexzf() {
        AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtg = this.f1437Ujhhgtgfeyxiexzf.f3973Ujhhgtgfeyxiexzf;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f1427Ujhhgtgfeyxiexzf;
        return Math.max(Math.max(m1259Ujhhgtgfeyxiexzf(abstractC3612feyxiexzfUjhhgtg, c0226Ujhhgtgfeyxiexzf.m1365Ujhhgtgfeyxiexzf()), m1259Ujhhgtgfeyxiexzf(this.f1437Ujhhgtgfeyxiexzf.f3974Ujhhgtgfeyxiexzf, c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.f3978Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf()))), Math.max(m1259Ujhhgtgfeyxiexzf(this.f1437Ujhhgtgfeyxiexzf.f3975Ujhhgtgfeyxiexzf, c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.f3979Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf())), m1259Ujhhgtgfeyxiexzf(this.f1437Ujhhgtgfeyxiexzf.f3976Ujhhgtgfeyxiexzf, c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.f3980Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf()))));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final LayerDrawable m1261Ujhhgtgfeyxiexzf() {
        if (this.f1439Ujhhgtgfeyxiexzf == null) {
            int[] iArr = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
            this.f1441Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(this.f1437Ujhhgtgfeyxiexzf);
            this.f1439Ujhhgtgfeyxiexzf = new RippleDrawable(this.f1435Ujhhgtgfeyxiexzf, null, this.f1441Ujhhgtgfeyxiexzf);
        }
        if (this.f1440Ujhhgtgfeyxiexzf == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f1439Ujhhgtgfeyxiexzf, this.f1428Ujhhgtgfeyxiexzf, this.f1434Ujhhgtgfeyxiexzf});
            this.f1440Ujhhgtgfeyxiexzf = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f1440Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0198Ujhhgtgfeyxiexzf m1262Ujhhgtgfeyxiexzf(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.f1425Ujhhgtgfeyxiexzf;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (m1267Ujhhgtgfeyxiexzf() ? m1260Ujhhgtgfeyxiexzf() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (m1267Ujhhgtgfeyxiexzf() ? m1260Ujhhgtgfeyxiexzf() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C0198Ujhhgtgfeyxiexzf(drawable, iCeil, i, iCeil, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1263Ujhhgtgfeyxiexzf(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f1440Ujhhgtgfeyxiexzf != null) {
            MaterialCardView materialCardView = this.f1425Ujhhgtgfeyxiexzf;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m1267Ujhhgtgfeyxiexzf() ? m1260Ujhhgtgfeyxiexzf() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m1267Ujhhgtgfeyxiexzf() ? m1260Ujhhgtgfeyxiexzf() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f1431Ujhhgtgfeyxiexzf;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.f1429Ujhhgtgfeyxiexzf) - this.f1430Ujhhgtgfeyxiexzf) - iCeil2 : this.f1429Ujhhgtgfeyxiexzf;
            int i7 = (i5 & 80) == 80 ? this.f1429Ujhhgtgfeyxiexzf : ((i2 - this.f1429Ujhhgtgfeyxiexzf) - this.f1430Ujhhgtgfeyxiexzf) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.f1429Ujhhgtgfeyxiexzf : ((i - this.f1429Ujhhgtgfeyxiexzf) - this.f1430Ujhhgtgfeyxiexzf) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.f1429Ujhhgtgfeyxiexzf) - this.f1430Ujhhgtgfeyxiexzf) - iCeil : this.f1429Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.f1440Ujhhgtgfeyxiexzf.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1264Ujhhgtgfeyxiexzf(boolean z, boolean z2) {
        Drawable drawable = this.f1434Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.f1448Ujhhgtgfeyxiexzf = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = z ? 1.0f - this.f1448Ujhhgtgfeyxiexzf : this.f1448Ujhhgtgfeyxiexzf;
            ValueAnimator valueAnimator = this.f1444Ujhhgtgfeyxiexzf;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f1444Ujhhgtgfeyxiexzf = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f1448Ujhhgtgfeyxiexzf, f);
            this.f1444Ujhhgtgfeyxiexzf = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C3235feyxiexzfUjhhgtg(1, this));
            this.f1444Ujhhgtgfeyxiexzf.setInterpolator(this.f1445Ujhhgtgfeyxiexzf);
            this.f1444Ujhhgtgfeyxiexzf.setDuration((long) ((z ? this.f1446Ujhhgtgfeyxiexzf : this.f1447Ujhhgtgfeyxiexzf) * f2));
            this.f1444Ujhhgtgfeyxiexzf.start();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1265Ujhhgtgfeyxiexzf(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1434Ujhhgtgfeyxiexzf = drawableMutate;
            drawableMutate.setTintList(this.f1436Ujhhgtgfeyxiexzf);
            m1264Ujhhgtgfeyxiexzf(this.f1425Ujhhgtgfeyxiexzf.f726Ujhhgtgfeyxiexzf, false);
        } else {
            this.f1434Ujhhgtgfeyxiexzf = f1424feyxiexzfUjhhgtg;
        }
        LayerDrawable layerDrawable = this.f1440Ujhhgtgfeyxiexzf;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f1434Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m1266Ujhhgtgfeyxiexzf(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        this.f1437Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f1427Ujhhgtgfeyxiexzf;
        c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg);
        c0226Ujhhgtgfeyxiexzf.f1548Ujhhgtgfeyxiexzf = !c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2513Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf());
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = this.f1428Ujhhgtgfeyxiexzf;
        if (c0226Ujhhgtgfeyxiexzf2 != null) {
            c0226Ujhhgtgfeyxiexzf2.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg);
        }
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf3 = this.f1441Ujhhgtgfeyxiexzf;
        if (c0226Ujhhgtgfeyxiexzf3 != null) {
            c0226Ujhhgtgfeyxiexzf3.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m1267Ujhhgtgfeyxiexzf() {
        MaterialCardView materialCardView = this.f1425Ujhhgtgfeyxiexzf;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f1427Ujhhgtgfeyxiexzf;
        return c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2513Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf()) && materialCardView.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m1268Ujhhgtgfeyxiexzf() {
        View view = this.f1425Ujhhgtgfeyxiexzf;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m1269Ujhhgtgfeyxiexzf() {
        Drawable drawable = this.f1433Ujhhgtgfeyxiexzf;
        Drawable drawableM1261Ujhhgtgfeyxiexzf = m1268Ujhhgtgfeyxiexzf() ? m1261Ujhhgtgfeyxiexzf() : this.f1428Ujhhgtgfeyxiexzf;
        this.f1433Ujhhgtgfeyxiexzf = drawableM1261Ujhhgtgfeyxiexzf;
        if (drawable != drawableM1261Ujhhgtgfeyxiexzf) {
            MaterialCardView materialCardView = this.f1425Ujhhgtgfeyxiexzf;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM1261Ujhhgtgfeyxiexzf);
            } else {
                materialCardView.setForeground(m1262Ujhhgtgfeyxiexzf(drawableM1261Ujhhgtgfeyxiexzf));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1270Ujhhgtgfeyxiexzf() {
        float fM1260Ujhhgtgfeyxiexzf;
        MaterialCardView materialCardView = this.f1425Ujhhgtgfeyxiexzf;
        float cardViewRadius = 0.0f;
        if (materialCardView.getPreventCornerOverlap()) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f1427Ujhhgtgfeyxiexzf;
            if (!c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2513Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf())) {
                fM1260Ujhhgtgfeyxiexzf = m1260Ujhhgtgfeyxiexzf();
            } else if (m1267Ujhhgtgfeyxiexzf()) {
                fM1260Ujhhgtgfeyxiexzf = m1260Ujhhgtgfeyxiexzf();
            } else {
                fM1260Ujhhgtgfeyxiexzf = 0.0f;
            }
        } else if (m1267Ujhhgtgfeyxiexzf()) {
            fM1260Ujhhgtgfeyxiexzf = m1260Ujhhgtgfeyxiexzf();
        } else {
            fM1260Ujhhgtgfeyxiexzf = 0.0f;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f1423feyxiexzfUjhhgtg) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fM1260Ujhhgtgfeyxiexzf - cardViewRadius);
        Rect rect = this.f1426Ujhhgtgfeyxiexzf;
        materialCardView.f8782Ujhhgtgfeyxiexzf.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = materialCardView.f8784Ujhhgtgfeyxiexzf;
        AbstractC2777Ujhhgtgfeyxiexzf abstractC2777Ujhhgtgfeyxiexzf = (AbstractC2777Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
        if (!abstractC2777Ujhhgtgfeyxiexzf.getUseCompatPadding()) {
            c2629Ujhhgtgfeyxiexzf.m3967feyxiexzfUjhhgtg(0, 0, 0, 0);
            return;
        }
        C0947feyxiexzfUjhhgtg c0947feyxiexzfUjhhgtg = (C0947feyxiexzfUjhhgtg) ((Drawable) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf);
        float f = c0947feyxiexzfUjhhgtg.f3802Ujhhgtgfeyxiexzf;
        float f2 = c0947feyxiexzfUjhhgtg.f3798Ujhhgtgfeyxiexzf;
        int iCeil = (int) Math.ceil(AbstractC0943feyxiexzfUjhhgtg.m2433Ujhhgtgfeyxiexzf(f, f2, abstractC2777Ujhhgtgfeyxiexzf.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC0943feyxiexzfUjhhgtg.m2434Ujhhgtgfeyxiexzf(f, f2, abstractC2777Ujhhgtgfeyxiexzf.getPreventCornerOverlap()));
        c2629Ujhhgtgfeyxiexzf.m3967feyxiexzfUjhhgtg(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m1271Ujhhgtgfeyxiexzf() {
        boolean z = this.f1442Ujhhgtgfeyxiexzf;
        MaterialCardView materialCardView = this.f1425Ujhhgtgfeyxiexzf;
        if (!z) {
            materialCardView.setBackgroundInternal(m1262Ujhhgtgfeyxiexzf(this.f1427Ujhhgtgfeyxiexzf));
        }
        materialCardView.setForeground(m1262Ujhhgtgfeyxiexzf(this.f1433Ujhhgtgfeyxiexzf));
    }
}
