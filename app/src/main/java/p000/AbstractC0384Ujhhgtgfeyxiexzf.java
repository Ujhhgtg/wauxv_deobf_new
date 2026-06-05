package p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛱfeyxiexzfᛱ能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0384Ujhhgtgfeyxiexzf extends AbstractC2890feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC0401Ujhhgtgfeyxiexzf f2096Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public long f2097Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public long f2098Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public long f2099Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2100Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f2101Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f2102Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public Interpolator f2103Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public Interpolator f2104Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public EnumC1443feyxiexzfUjhhgtg f2105Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public InterfaceC3549feyxiexzfUjhhgtg f2106Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public InterfaceC3549feyxiexzfUjhhgtg f2107Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public InterfaceC3545feyxiexzfUjhhgtg f2108Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public FrameLayout f2109Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public ImageView f2110Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public ArrayList f2111Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f2112Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C1464feyxiexzfUjhhgtg f2113Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f2114Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public float f2115feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public float f2116feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f2117feyxiexzfUjhhgtg;

    private final int getLayoutGravity() {
        int iOrdinal = this.f2105Ujhhgtgfeyxiexzf.ordinal();
        if (iOrdinal == 1) {
            return 8388659;
        }
        if (iOrdinal == 2) {
            return 8388661;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 17 : 8388693;
        }
        return 8388691;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static /* synthetic */ void m1626Ujhhgtgfeyxiexzf(AbstractC0384Ujhhgtgfeyxiexzf abstractC0384Ujhhgtgfeyxiexzf, View view, float f, long j, long j2) {
        abstractC0384Ujhhgtgfeyxiexzf.m1629Ujhhgtgfeyxiexzf(view, f, j, j2, new PathInterpolator(0.95f, 0.0f, 0.07f, 1.0f));
    }

    public final InterfaceC0401Ujhhgtgfeyxiexzf getAdapter() {
        return this.f2096Ujhhgtgfeyxiexzf;
    }

    public final long getCloseAnimationDuration() {
        return this.f2099Ujhhgtgfeyxiexzf;
    }

    public final Interpolator getCloseInterpolatorAnimator() {
        Interpolator interpolator = this.f2104Ujhhgtgfeyxiexzf;
        if (interpolator != null) {
            return interpolator;
        }
        return null;
    }

    public final long getDelayBetweenItemsAnimation() {
        return this.f2097Ujhhgtgfeyxiexzf;
    }

    public final int getMainButtonColor() {
        return this.f2100Ujhhgtgfeyxiexzf;
    }

    public final Drawable getMainButtonIcon() {
        return this.f2102Ujhhgtgfeyxiexzf;
    }

    public final int getMainButtonIconColor() {
        return this.f2101Ujhhgtgfeyxiexzf;
    }

    public final ImageView getMenuButton() {
        return this.f2110Ujhhgtgfeyxiexzf;
    }

    public final FrameLayout getMetaBallsContainerFrameLayout() {
        FrameLayout frameLayout = this.f2109Ujhhgtgfeyxiexzf;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    public final InterfaceC3549feyxiexzfUjhhgtg getOnItemSelectedListener() {
        return this.f2106Ujhhgtgfeyxiexzf;
    }

    public final InterfaceC3545feyxiexzfUjhhgtg getOnMenuClosed() {
        return this.f2108Ujhhgtgfeyxiexzf;
    }

    public final InterfaceC3549feyxiexzfUjhhgtg getOnMenuToggled() {
        return this.f2107Ujhhgtgfeyxiexzf;
    }

    public final long getOpenAnimationDuration() {
        return this.f2098Ujhhgtgfeyxiexzf;
    }

    public final Interpolator getOpenInterpolatorAnimator() {
        Interpolator interpolator = this.f2103Ujhhgtgfeyxiexzf;
        if (interpolator != null) {
            return interpolator;
        }
        return null;
    }

    public final EnumC1443feyxiexzfUjhhgtg getPositionGravity() {
        return this.f2105Ujhhgtgfeyxiexzf;
    }

    public final void setAdapter(InterfaceC0401Ujhhgtgfeyxiexzf interfaceC0401Ujhhgtgfeyxiexzf) {
        this.f2096Ujhhgtgfeyxiexzf = interfaceC0401Ujhhgtgfeyxiexzf;
        m1627Ujhhgtgfeyxiexzf(getMetaBallsContainerFrameLayout());
    }

    public final void setCloseAnimationDuration(long j) {
        this.f2099Ujhhgtgfeyxiexzf = j;
    }

    public final void setCloseInterpolatorAnimator(Interpolator interpolator) {
        this.f2104Ujhhgtgfeyxiexzf = interpolator;
    }

    public final void setDelayBetweenItemsAnimation(long j) {
        this.f2097Ujhhgtgfeyxiexzf = j;
    }

    public final void setMainButtonColor(int i) {
        Drawable background;
        this.f2100Ujhhgtgfeyxiexzf = i;
        ImageView imageView = this.f2110Ujhhgtgfeyxiexzf;
        if (imageView == null || (background = imageView.getBackground()) == null) {
            return;
        }
        background.setTint(i);
    }

    public final void setMainButtonIcon(Drawable drawable) {
        Drawable drawable2;
        this.f2102Ujhhgtgfeyxiexzf = drawable;
        C1464feyxiexzfUjhhgtg c1464feyxiexzfUjhhgtg = this.f2113Ujhhgtgfeyxiexzf;
        if (c1464feyxiexzfUjhhgtg != null) {
            c1464feyxiexzfUjhhgtg.f5083Ujhhgtgfeyxiexzf = drawable;
        }
        if (c1464feyxiexzfUjhhgtg == null || (drawable2 = c1464feyxiexzfUjhhgtg.f5083Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        drawable2.setTint(this.f2101Ujhhgtgfeyxiexzf);
    }

    public final void setMainButtonIconColor(int i) {
        Drawable drawable;
        this.f2101Ujhhgtgfeyxiexzf = i;
        C1464feyxiexzfUjhhgtg c1464feyxiexzfUjhhgtg = this.f2113Ujhhgtgfeyxiexzf;
        if (c1464feyxiexzfUjhhgtg == null || (drawable = c1464feyxiexzfUjhhgtg.f5083Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        drawable.setTint(i);
    }

    public final void setMenuButton(ImageView imageView) {
        this.f2110Ujhhgtgfeyxiexzf = imageView;
    }

    public final void setMetaBallsContainerFrameLayout(FrameLayout frameLayout) {
        this.f2109Ujhhgtgfeyxiexzf = frameLayout;
    }

    public final void setOnItemSelectedListener(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        this.f2106Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtg;
    }

    public final void setOnMenuClosed(InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        this.f2108Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
    }

    public final void setOnMenuToggled(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        this.f2107Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtg;
    }

    public final void setOpenAnimationDuration(long j) {
        this.f2098Ujhhgtgfeyxiexzf = j;
    }

    public final void setOpenInterpolatorAnimator(Interpolator interpolator) {
        this.f2103Ujhhgtgfeyxiexzf = interpolator;
    }

    public final void setPositionGravity(EnumC1443feyxiexzfUjhhgtg enumC1443feyxiexzfUjhhgtg) {
        this.f2105Ujhhgtgfeyxiexzf = enumC1443feyxiexzfUjhhgtg;
        if (getMetaBallsContainerFrameLayout().getChildCount() != 0) {
            m1627Ujhhgtgfeyxiexzf(getMetaBallsContainerFrameLayout());
        }
    }

    @Override // p000.AbstractC2890feyxiexzfUjhhgtg
    public final void setupBaseViews(Context context) {
        super.setupBaseViews(context);
        this.f2114Ujhhgtgfeyxiexzf = getPaddingLeft();
        this.f2115feyxiexzfUjhhgtg = getPaddingRight();
        this.f2116feyxiexzfUjhhgtg = getPaddingTop();
        this.f2117feyxiexzfUjhhgtg = getPaddingBottom();
        setPadding(0, 0, 0, 0);
        setMetaBallsContainerFrameLayout(new FrameLayout(context));
        addView(getMetaBallsContainerFrameLayout(), new FrameLayout.LayoutParams(-1, -1));
        if (this.f9160Ujhhgtgfeyxiexzf) {
            return;
        }
        FrameLayout metaBallsContainerFrameLayout = getMetaBallsContainerFrameLayout();
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200.0f, -32640.0f})));
        metaBallsContainerFrameLayout.setLayerType(2, paint);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1627Ujhhgtgfeyxiexzf(FrameLayout frameLayout) {
        this.f2112Ujhhgtgfeyxiexzf = false;
        frameLayout.removeAllViews();
        int dimension = (int) getResources().getDimension(R.dimen.menu_item_size);
        int dimension2 = (int) getResources().getDimension(R.dimen.main_button_size);
        int dimension3 = (int) getResources().getDimension(R.dimen.margins_to_compensate_cutoff);
        int layoutGravity = getLayoutGravity();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension, dimension);
        int i = ((dimension2 - dimension) / 2) + dimension3;
        layoutParams.setMargins(((int) this.f2114Ujhhgtgfeyxiexzf) + i, ((int) this.f2116feyxiexzfUjhhgtg) + i, ((int) this.f2115feyxiexzfUjhhgtg) + i, i + ((int) this.f2117feyxiexzfUjhhgtg));
        layoutParams.gravity = layoutGravity;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.setMargins(((int) this.f2114Ujhhgtgfeyxiexzf) + dimension3, ((int) this.f2116feyxiexzfUjhhgtg) + dimension3, ((int) this.f2115feyxiexzfUjhhgtg) + dimension3, dimension3 + ((int) this.f2117feyxiexzfUjhhgtg));
        layoutParams2.gravity = layoutGravity;
        int iMo1684Ujhhgtgfeyxiexzf = this.f2096Ujhhgtgfeyxiexzf.mo1684Ujhhgtgfeyxiexzf();
        for (int i2 = 0; i2 < iMo1684Ujhhgtgfeyxiexzf; i2++) {
            C3093Ujhhgtgfeyxiexzf c3093Ujhhgtgfeyxiexzf = new C3093Ujhhgtgfeyxiexzf(getContext(), getResources().getDimension(R.dimen.menu_item_touch_area_size));
            c3093Ujhhgtgfeyxiexzf.setBackgroundResource(R.drawable.gradient_oval);
            c3093Ujhhgtgfeyxiexzf.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), R.animator.button_scale));
            c3093Ujhhgtgfeyxiexzf.getBackground().setTint(this.f2096Ujhhgtgfeyxiexzf.mo1683Ujhhgtgfeyxiexzf());
            c3093Ujhhgtgfeyxiexzf.setImageDrawable(this.f2096Ujhhgtgfeyxiexzf.mo1682Ujhhgtgfeyxiexzf(i2));
            c3093Ujhhgtgfeyxiexzf.setColorFilter(this.f2096Ujhhgtgfeyxiexzf.mo1685Ujhhgtgfeyxiexzf());
            int dimension4 = (int) getResources().getDimension(R.dimen.menu_item_padding);
            c3093Ujhhgtgfeyxiexzf.setPadding(dimension4, dimension4, dimension4, dimension4);
            c3093Ujhhgtgfeyxiexzf.setOnClickListener(new ViewOnClickListenerC0107Ujhhgtgfeyxiexzf(this, i2, 1));
            c3093Ujhhgtgfeyxiexzf.setEnabled(false);
            if (!this.f9160Ujhhgtgfeyxiexzf) {
                c3093Ujhhgtgfeyxiexzf.setLayerType(2, null);
            }
            frameLayout.addView(c3093Ujhhgtgfeyxiexzf, layoutParams);
        }
        C3093Ujhhgtgfeyxiexzf c3093Ujhhgtgfeyxiexzf2 = new C3093Ujhhgtgfeyxiexzf(getContext(), getResources().getDimension(R.dimen.main_button_touch_area_size));
        c3093Ujhhgtgfeyxiexzf2.setBackgroundResource(R.drawable.gradient_oval);
        c3093Ujhhgtgfeyxiexzf2.getBackground().setTint(this.f2100Ujhhgtgfeyxiexzf);
        Drawable drawable = this.f2102Ujhhgtgfeyxiexzf;
        C1464feyxiexzfUjhhgtg c1464feyxiexzfUjhhgtg = new C1464feyxiexzfUjhhgtg(this.f2101Ujhhgtgfeyxiexzf, getContext(), drawable != null ? drawable.mutate() : null);
        this.f2113Ujhhgtgfeyxiexzf = c1464feyxiexzfUjhhgtg;
        c3093Ujhhgtgfeyxiexzf2.setImageDrawable(c1464feyxiexzfUjhhgtg);
        int dimension5 = (int) getResources().getDimension(R.dimen.main_button_padding);
        c3093Ujhhgtgfeyxiexzf2.setPadding(dimension5, dimension5, dimension5, dimension5);
        c3093Ujhhgtgfeyxiexzf2.setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(7, this));
        this.f2110Ujhhgtgfeyxiexzf = c3093Ujhhgtgfeyxiexzf2;
        frameLayout.addView(c3093Ujhhgtgfeyxiexzf2, layoutParams2);
        if (this.f9160Ujhhgtgfeyxiexzf) {
            TextureView textureView = new TextureView(getContext());
            this.f9162Ujhhgtgfeyxiexzf = textureView;
            textureView.setSurfaceTextureListener(null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ObjectAnimator m1628Ujhhgtgfeyxiexzf(View view, float f, float f2, long j, Interpolator interpolator, long j2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, view.getTranslationX(), f).setDuration(j2);
        duration.setInterpolator(interpolator);
        duration.setStartDelay(j);
        duration.start();
        ArrayList arrayList = this.f2111Ujhhgtgfeyxiexzf;
        arrayList.add(duration);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), f2).setDuration(j2);
        duration2.setStartDelay(j);
        duration2.setInterpolator(interpolator);
        duration2.start();
        arrayList.add(duration2);
        return duration2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ObjectAnimator m1629Ujhhgtgfeyxiexzf(View view, float f, long j, long j2, BaseInterpolator baseInterpolator) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), f).setDuration(j);
        duration.setStartDelay(j2);
        duration.setInterpolator(baseInterpolator);
        duration.start();
        ArrayList arrayList = this.f2111Ujhhgtgfeyxiexzf;
        arrayList.add(duration);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), f).setDuration(j);
        duration2.setStartDelay(j2);
        duration2.setInterpolator(baseInterpolator);
        duration2.start();
        arrayList.add(duration2);
        return duration;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1630Ujhhgtgfeyxiexzf(final Drawable drawable, long j, long j2, int i, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(drawable.getAlpha(), i).setDuration(j2);
        if (z) {
            drawable.setAlpha(0);
        }
        final C0974feyxiexzfUjhhgtg c0974feyxiexzfUjhhgtg = new C0974feyxiexzfUjhhgtg();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛱfeyxiexzfᛱ能不能ᛲᛴ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Drawable drawable2 = drawable;
                drawable2.setAlpha(iIntValue);
                if (z && (drawable2 instanceof AnimatedVectorDrawable)) {
                    C0974feyxiexzfUjhhgtg c0974feyxiexzfUjhhgtg2 = c0974feyxiexzfUjhhgtg;
                    if (c0974feyxiexzfUjhhgtg2.f3868Ujhhgtgfeyxiexzf) {
                        return;
                    }
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable2;
                    if (animatedVectorDrawable.getAlpha() > 0) {
                        animatedVectorDrawable.start();
                        c0974feyxiexzfUjhhgtg2.f3868Ujhhgtgfeyxiexzf = true;
                    }
                }
            }
        });
        duration.setStartDelay(j);
        duration.start();
        this.f2111Ujhhgtgfeyxiexzf.add(duration);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public abstract void mo1631Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1632Ujhhgtgfeyxiexzf() {
        if (this.f2112Ujhhgtgfeyxiexzf) {
            ArrayList<ValueAnimator> arrayList = this.f2111Ujhhgtgfeyxiexzf;
            for (ValueAnimator valueAnimator : arrayList) {
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            arrayList.clear();
            long j = 0;
            for (int childCount = getMetaBallsContainerFrameLayout().getChildCount() - 2; -1 < childCount; childCount--) {
                View childAt = getMetaBallsContainerFrameLayout().getChildAt(childCount);
                long j2 = j;
                ObjectAnimator objectAnimatorM1628Ujhhgtgfeyxiexzf = m1628Ujhhgtgfeyxiexzf(childAt, 0.0f, 0.0f, j2, getCloseInterpolatorAnimator(), this.f2099Ujhhgtgfeyxiexzf);
                long j3 = (long) (this.f2099Ujhhgtgfeyxiexzf * 0.33f);
                m1629Ujhhgtgfeyxiexzf(childAt, 0.1f, j3, j2 + j3, new LinearInterpolator());
                m1630Ujhhgtgfeyxiexzf(((ImageView) childAt).getDrawable(), j2, (long) (this.f2099Ujhhgtgfeyxiexzf * 0.16f), 0, false);
                j = j2 + this.f2097Ujhhgtgfeyxiexzf;
                if (childCount == 0) {
                    objectAnimatorM1628Ujhhgtgfeyxiexzf.addListener(new C2994Ujhhgtgfeyxiexzf(5, this));
                }
            }
            long j4 = j;
            m1626Ujhhgtgfeyxiexzf(this, this.f2110Ujhhgtgfeyxiexzf, 1.0f, 300L, 0L);
            if (this.f9160Ujhhgtgfeyxiexzf) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(this.f2099Ujhhgtgfeyxiexzf + j4);
                duration.addUpdateListener(new C3235feyxiexzfUjhhgtg(2, this));
                duration.start();
            }
            C1464feyxiexzfUjhhgtg c1464feyxiexzfUjhhgtg = this.f2113Ujhhgtgfeyxiexzf;
            if (c1464feyxiexzfUjhhgtg != null) {
                c1464feyxiexzfUjhhgtg.m2969Ujhhgtgfeyxiexzf(0.0f);
            }
        } else {
            mo1631Ujhhgtgfeyxiexzf();
            C1464feyxiexzfUjhhgtg c1464feyxiexzfUjhhgtg2 = this.f2113Ujhhgtgfeyxiexzf;
            if (c1464feyxiexzfUjhhgtg2 != null) {
                c1464feyxiexzfUjhhgtg2.m2969Ujhhgtgfeyxiexzf(1.0f);
            }
        }
        boolean z = !this.f2112Ujhhgtgfeyxiexzf;
        this.f2112Ujhhgtgfeyxiexzf = z;
        InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg = this.f2107Ujhhgtgfeyxiexzf;
        if (interfaceC3549feyxiexzfUjhhgtg != null) {
            interfaceC3549feyxiexzfUjhhgtg.invoke(Boolean.valueOf(z));
        }
    }
}
