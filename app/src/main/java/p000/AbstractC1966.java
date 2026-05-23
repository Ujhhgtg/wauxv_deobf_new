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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲇᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1966 extends AbstractC0756 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC1963 f6517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public long f6518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public long f6519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public long f6520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f6522;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Drawable f6523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Interpolator f6524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Interpolator f6525;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public EnumC2381 f6526;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public InterfaceC1425 f6527;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public InterfaceC1425 f6528;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public InterfaceC1414 f6529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public FrameLayout f6530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public ImageView f6531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public ArrayList f6532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f6533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public C2296 f6534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public float f6535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public float f6536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public float f6537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public float f6538;

    private final int getLayoutGravity() {
        int iOrdinal = this.f6526.ordinal();
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static /* synthetic */ void m3792(AbstractC1966 abstractC1966, View view, float f, long j, long j2) {
        abstractC1966.m3795(view, f, j, j2, new PathInterpolator(0.95f, 0.0f, 0.07f, 1.0f));
    }

    public final InterfaceC1963 getAdapter() {
        return this.f6517;
    }

    public final long getCloseAnimationDuration() {
        return this.f6520;
    }

    public final Interpolator getCloseInterpolatorAnimator() {
        Interpolator interpolator = this.f6525;
        if (interpolator != null) {
            return interpolator;
        }
        return null;
    }

    public final long getDelayBetweenItemsAnimation() {
        return this.f6518;
    }

    public final int getMainButtonColor() {
        return this.f6521;
    }

    public final Drawable getMainButtonIcon() {
        return this.f6523;
    }

    public final int getMainButtonIconColor() {
        return this.f6522;
    }

    public final ImageView getMenuButton() {
        return this.f6531;
    }

    public final FrameLayout getMetaBallsContainerFrameLayout() {
        FrameLayout frameLayout = this.f6530;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    public final InterfaceC1425 getOnItemSelectedListener() {
        return this.f6527;
    }

    public final InterfaceC1414 getOnMenuClosed() {
        return this.f6529;
    }

    public final InterfaceC1425 getOnMenuToggled() {
        return this.f6528;
    }

    public final long getOpenAnimationDuration() {
        return this.f6519;
    }

    public final Interpolator getOpenInterpolatorAnimator() {
        Interpolator interpolator = this.f6524;
        if (interpolator != null) {
            return interpolator;
        }
        return null;
    }

    public final EnumC2381 getPositionGravity() {
        return this.f6526;
    }

    public final void setAdapter(InterfaceC1963 interfaceC1963) {
        this.f6517 = interfaceC1963;
        m3793(getMetaBallsContainerFrameLayout());
    }

    public final void setCloseAnimationDuration(long j) {
        this.f6520 = j;
    }

    public final void setCloseInterpolatorAnimator(Interpolator interpolator) {
        this.f6525 = interpolator;
    }

    public final void setDelayBetweenItemsAnimation(long j) {
        this.f6518 = j;
    }

    public final void setMainButtonColor(int i) {
        Drawable background;
        this.f6521 = i;
        ImageView imageView = this.f6531;
        if (imageView == null || (background = imageView.getBackground()) == null) {
            return;
        }
        background.setTint(i);
    }

    public final void setMainButtonIcon(Drawable drawable) {
        Drawable drawable2;
        this.f6523 = drawable;
        C2296 c2296 = this.f6534;
        if (c2296 != null) {
            c2296.f7392 = drawable;
        }
        if (c2296 == null || (drawable2 = c2296.f7392) == null) {
            return;
        }
        drawable2.setTint(this.f6522);
    }

    public final void setMainButtonIconColor(int i) {
        Drawable drawable;
        this.f6522 = i;
        C2296 c2296 = this.f6534;
        if (c2296 == null || (drawable = c2296.f7392) == null) {
            return;
        }
        drawable.setTint(i);
    }

    public final void setMenuButton(ImageView imageView) {
        this.f6531 = imageView;
    }

    public final void setMetaBallsContainerFrameLayout(FrameLayout frameLayout) {
        this.f6530 = frameLayout;
    }

    public final void setOnItemSelectedListener(InterfaceC1425 interfaceC1425) {
        this.f6527 = interfaceC1425;
    }

    public final void setOnMenuClosed(InterfaceC1414 interfaceC1414) {
        this.f6529 = interfaceC1414;
    }

    public final void setOnMenuToggled(InterfaceC1425 interfaceC1425) {
        this.f6528 = interfaceC1425;
    }

    public final void setOpenAnimationDuration(long j) {
        this.f6519 = j;
    }

    public final void setOpenInterpolatorAnimator(Interpolator interpolator) {
        this.f6524 = interpolator;
    }

    public final void setPositionGravity(EnumC2381 enumC2381) {
        this.f6526 = enumC2381;
        if (getMetaBallsContainerFrameLayout().getChildCount() != 0) {
            m3793(getMetaBallsContainerFrameLayout());
        }
    }

    @Override // p000.AbstractC0756
    public final void setupBaseViews(Context context) {
        super.setupBaseViews(context);
        this.f6535 = getPaddingLeft();
        this.f6536 = getPaddingRight();
        this.f6537 = getPaddingTop();
        this.f6538 = getPaddingBottom();
        setPadding(0, 0, 0, 0);
        setMetaBallsContainerFrameLayout(new FrameLayout(context));
        addView(getMetaBallsContainerFrameLayout(), new FrameLayout.LayoutParams(-1, -1));
        if (this.f2850) {
            return;
        }
        FrameLayout metaBallsContainerFrameLayout = getMetaBallsContainerFrameLayout();
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200.0f, -32640.0f})));
        metaBallsContainerFrameLayout.setLayerType(2, paint);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3793(FrameLayout frameLayout) {
        this.f6533 = false;
        frameLayout.removeAllViews();
        int dimension = (int) getResources().getDimension(R.dimen.menu_item_size);
        int dimension2 = (int) getResources().getDimension(R.dimen.main_button_size);
        int dimension3 = (int) getResources().getDimension(R.dimen.margins_to_compensate_cutoff);
        int layoutGravity = getLayoutGravity();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension, dimension);
        int i = ((dimension2 - dimension) / 2) + dimension3;
        layoutParams.setMargins(((int) this.f6535) + i, ((int) this.f6537) + i, ((int) this.f6536) + i, i + ((int) this.f6538));
        layoutParams.gravity = layoutGravity;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.setMargins(((int) this.f6535) + dimension3, ((int) this.f6537) + dimension3, ((int) this.f6536) + dimension3, dimension3 + ((int) this.f6538));
        layoutParams2.gravity = layoutGravity;
        int iMo1506 = this.f6517.mo1506();
        for (int i2 = 0; i2 < iMo1506; i2++) {
            C0976 c0976 = new C0976(getContext(), getResources().getDimension(R.dimen.menu_item_touch_area_size));
            c0976.setBackgroundResource(R.drawable.gradient_oval);
            c0976.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), R.animator.button_scale));
            c0976.getBackground().setTint(this.f6517.mo1505());
            c0976.setImageDrawable(this.f6517.mo1502(i2));
            c0976.setColorFilter(this.f6517.mo1509());
            int dimension4 = (int) getResources().getDimension(R.dimen.menu_item_padding);
            c0976.setPadding(dimension4, dimension4, dimension4, dimension4);
            c0976.setOnClickListener(new ViewOnClickListenerC1800(this, i2, 1));
            c0976.setEnabled(false);
            if (!this.f2850) {
                c0976.setLayerType(2, null);
            }
            frameLayout.addView(c0976, layoutParams);
        }
        C0976 c0977 = new C0976(getContext(), getResources().getDimension(R.dimen.main_button_touch_area_size));
        c0977.setBackgroundResource(R.drawable.gradient_oval);
        c0977.getBackground().setTint(this.f6521);
        Drawable drawable = this.f6523;
        C2296 c2296 = new C2296(this.f6522, getContext(), drawable != null ? drawable.mutate() : null);
        this.f6534 = c2296;
        c0977.setImageDrawable(c2296);
        int dimension5 = (int) getResources().getDimension(R.dimen.main_button_padding);
        c0977.setPadding(dimension5, dimension5, dimension5, dimension5);
        c0977.setOnClickListener(new ViewOnClickListenerC0103(7, this));
        this.f6531 = c0977;
        frameLayout.addView(c0977, layoutParams2);
        if (this.f2850) {
            TextureView textureView = new TextureView(getContext());
            this.f2852 = textureView;
            textureView.setSurfaceTextureListener(null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ObjectAnimator m3794(View view, float f, float f2, long j, Interpolator interpolator, long j2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, view.getTranslationX(), f).setDuration(j2);
        duration.setInterpolator(interpolator);
        duration.setStartDelay(j);
        duration.start();
        ArrayList arrayList = this.f6532;
        arrayList.add(duration);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), f2).setDuration(j2);
        duration2.setStartDelay(j);
        duration2.setInterpolator(interpolator);
        duration2.start();
        arrayList.add(duration2);
        return duration2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ObjectAnimator m3795(View view, float f, long j, long j2, BaseInterpolator baseInterpolator) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), f).setDuration(j);
        duration.setStartDelay(j2);
        duration.setInterpolator(baseInterpolator);
        duration.start();
        ArrayList arrayList = this.f6532;
        arrayList.add(duration);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), f).setDuration(j);
        duration2.setStartDelay(j2);
        duration2.setInterpolator(baseInterpolator);
        duration2.start();
        arrayList.add(duration2);
        return duration;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3796(final Drawable drawable, long j, long j2, int i, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(drawable.getAlpha(), i).setDuration(j2);
        if (z) {
            drawable.setAlpha(0);
        }
        final C2515 c2515 = new C2515();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲇᲀᛸᤝ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Drawable drawable2 = drawable;
                drawable2.setAlpha(iIntValue);
                if (z && (drawable2 instanceof AnimatedVectorDrawable)) {
                    C2515 c2516 = c2515;
                    if (c2516.f8042) {
                        return;
                    }
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable2;
                    if (animatedVectorDrawable.getAlpha() > 0) {
                        animatedVectorDrawable.start();
                        c2516.f8042 = true;
                    }
                }
            }
        });
        duration.setStartDelay(j);
        duration.start();
        this.f6532.add(duration);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract void mo2615();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3797() {
        if (this.f6533) {
            ArrayList<ValueAnimator> arrayList = this.f6532;
            for (ValueAnimator valueAnimator : arrayList) {
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            arrayList.clear();
            int i = 2;
            long j = 0;
            for (int childCount = getMetaBallsContainerFrameLayout().getChildCount() - 2; -1 < childCount; childCount--) {
                View childAt = getMetaBallsContainerFrameLayout().getChildAt(childCount);
                long j2 = j;
                ObjectAnimator objectAnimatorM3794 = m3794(childAt, 0.0f, 0.0f, j2, getCloseInterpolatorAnimator(), this.f6520);
                long j3 = (long) (this.f6520 * 0.33f);
                m3795(childAt, 0.1f, j3, j2 + j3, new LinearInterpolator());
                m3796(((ImageView) childAt).getDrawable(), j2, (long) (this.f6520 * 0.16f), 0, false);
                j = j2 + this.f6518;
                if (childCount == 0) {
                    objectAnimatorM3794.addListener(new C0123(5, this));
                }
            }
            long j4 = j;
            m3792(this, this.f6531, 1.0f, 300L, 0L);
            if (this.f2850) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(this.f6520 + j4);
                duration.addUpdateListener(new C1115(2, this));
                duration.start();
            }
            C2296 c2296 = this.f6534;
            if (c2296 != null) {
                c2296.m4161(0.0f);
            }
        } else {
            mo2615();
            C2296 c2297 = this.f6534;
            if (c2297 != null) {
                c2297.m4161(1.0f);
            }
        }
        boolean z = !this.f6533;
        this.f6533 = z;
        InterfaceC1425 interfaceC1425 = this.f6528;
        if (interfaceC1425 != null) {
            interfaceC1425.invoke(Boolean.valueOf(z));
        }
    }
}
