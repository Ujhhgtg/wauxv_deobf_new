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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲈᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1997 extends AbstractC0753 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public InterfaceC1994 f6622;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public long f6623;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public long f6624;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public long f6625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f6626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Drawable f6628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Interpolator f6629;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Interpolator f6630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public EnumC2434 f6631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public InterfaceC1433 f6632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public InterfaceC1433 f6633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public InterfaceC1422 f6634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public FrameLayout f6635;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public ImageView f6636;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public ArrayList f6637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f6638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public C2329 f6639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public float f6640;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public float f6641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public float f6642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public float f6643;

    private final int getLayoutGravity() {
        int iOrdinal = this.f6631.ordinal();
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
    public static /* synthetic */ void m3986(AbstractC1997 abstractC1997, View view, float f, long j, long j2) {
        abstractC1997.m3989(view, f, j, j2, new PathInterpolator(0.95f, 0.0f, 0.07f, 1.0f));
    }

    public final InterfaceC1994 getAdapter() {
        return this.f6622;
    }

    public final long getCloseAnimationDuration() {
        return this.f6625;
    }

    public final Interpolator getCloseInterpolatorAnimator() {
        Interpolator interpolator = this.f6630;
        if (interpolator != null) {
            return interpolator;
        }
        return null;
    }

    public final long getDelayBetweenItemsAnimation() {
        return this.f6623;
    }

    public final int getMainButtonColor() {
        return this.f6626;
    }

    public final Drawable getMainButtonIcon() {
        return this.f6628;
    }

    public final int getMainButtonIconColor() {
        return this.f6627;
    }

    public final ImageView getMenuButton() {
        return this.f6636;
    }

    public final FrameLayout getMetaBallsContainerFrameLayout() {
        FrameLayout frameLayout = this.f6635;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    public final InterfaceC1433 getOnItemSelectedListener() {
        return this.f6632;
    }

    public final InterfaceC1422 getOnMenuClosed() {
        return this.f6634;
    }

    public final InterfaceC1433 getOnMenuToggled() {
        return this.f6633;
    }

    public final long getOpenAnimationDuration() {
        return this.f6624;
    }

    public final Interpolator getOpenInterpolatorAnimator() {
        Interpolator interpolator = this.f6629;
        if (interpolator != null) {
            return interpolator;
        }
        return null;
    }

    public final EnumC2434 getPositionGravity() {
        return this.f6631;
    }

    public final void setAdapter(InterfaceC1994 interfaceC1994) {
        this.f6622 = interfaceC1994;
        m3987(getMetaBallsContainerFrameLayout());
    }

    public final void setCloseAnimationDuration(long j) {
        this.f6625 = j;
    }

    public final void setCloseInterpolatorAnimator(Interpolator interpolator) {
        this.f6630 = interpolator;
    }

    public final void setDelayBetweenItemsAnimation(long j) {
        this.f6623 = j;
    }

    public final void setMainButtonColor(int i) {
        Drawable background;
        this.f6626 = i;
        ImageView imageView = this.f6636;
        if (imageView == null || (background = imageView.getBackground()) == null) {
            return;
        }
        background.setTint(i);
    }

    public final void setMainButtonIcon(Drawable drawable) {
        Drawable drawable2;
        this.f6628 = drawable;
        C2329 c2329 = this.f6639;
        if (c2329 != null) {
            c2329.f7514 = drawable;
        }
        if (c2329 == null || (drawable2 = c2329.f7514) == null) {
            return;
        }
        drawable2.setTint(this.f6627);
    }

    public final void setMainButtonIconColor(int i) {
        Drawable drawable;
        this.f6627 = i;
        C2329 c2329 = this.f6639;
        if (c2329 == null || (drawable = c2329.f7514) == null) {
            return;
        }
        drawable.setTint(i);
    }

    public final void setMenuButton(ImageView imageView) {
        this.f6636 = imageView;
    }

    public final void setMetaBallsContainerFrameLayout(FrameLayout frameLayout) {
        this.f6635 = frameLayout;
    }

    public final void setOnItemSelectedListener(InterfaceC1433 interfaceC1433) {
        this.f6632 = interfaceC1433;
    }

    public final void setOnMenuClosed(InterfaceC1422 interfaceC1422) {
        this.f6634 = interfaceC1422;
    }

    public final void setOnMenuToggled(InterfaceC1433 interfaceC1433) {
        this.f6633 = interfaceC1433;
    }

    public final void setOpenAnimationDuration(long j) {
        this.f6624 = j;
    }

    public final void setOpenInterpolatorAnimator(Interpolator interpolator) {
        this.f6629 = interpolator;
    }

    public final void setPositionGravity(EnumC2434 enumC2434) {
        this.f6631 = enumC2434;
        if (getMetaBallsContainerFrameLayout().getChildCount() != 0) {
            m3987(getMetaBallsContainerFrameLayout());
        }
    }

    @Override // p000.AbstractC0753
    public final void setupBaseViews(Context context) {
        super.setupBaseViews(context);
        this.f6640 = getPaddingLeft();
        this.f6641 = getPaddingRight();
        this.f6642 = getPaddingTop();
        this.f6643 = getPaddingBottom();
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
    public final void m3987(FrameLayout frameLayout) {
        this.f6638 = false;
        frameLayout.removeAllViews();
        int dimension = (int) getResources().getDimension(R.dimen.menu_item_size);
        int dimension2 = (int) getResources().getDimension(R.dimen.main_button_size);
        int dimension3 = (int) getResources().getDimension(R.dimen.margins_to_compensate_cutoff);
        int layoutGravity = getLayoutGravity();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension, dimension);
        int i = ((dimension2 - dimension) / 2) + dimension3;
        layoutParams.setMargins(((int) this.f6640) + i, ((int) this.f6642) + i, ((int) this.f6641) + i, i + ((int) this.f6643));
        layoutParams.gravity = layoutGravity;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.setMargins(((int) this.f6640) + dimension3, ((int) this.f6642) + dimension3, ((int) this.f6641) + dimension3, dimension3 + ((int) this.f6643));
        layoutParams2.gravity = layoutGravity;
        int iMo1611 = this.f6622.mo1611();
        for (int i2 = 0; i2 < iMo1611; i2++) {
            C0980 c0980 = new C0980(getContext(), getResources().getDimension(R.dimen.menu_item_touch_area_size));
            c0980.setBackgroundResource(R.drawable.gradient_oval);
            c0980.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), R.animator.button_scale));
            c0980.getBackground().setTint(this.f6622.mo1610());
            c0980.setImageDrawable(this.f6622.mo1607(i2));
            c0980.setColorFilter(this.f6622.mo1614());
            int dimension4 = (int) getResources().getDimension(R.dimen.menu_item_padding);
            c0980.setPadding(dimension4, dimension4, dimension4, dimension4);
            c0980.setOnClickListener(new ViewOnClickListenerC1824(this, i2, 1));
            c0980.setEnabled(false);
            if (!this.f2850) {
                c0980.setLayerType(2, null);
            }
            frameLayout.addView(c0980, layoutParams);
        }
        C0980 c0981 = new C0980(getContext(), getResources().getDimension(R.dimen.main_button_touch_area_size));
        c0981.setBackgroundResource(R.drawable.gradient_oval);
        c0981.getBackground().setTint(this.f6626);
        Drawable drawable = this.f6628;
        C2329 c2329 = new C2329(this.f6627, getContext(), drawable != null ? drawable.mutate() : null);
        this.f6639 = c2329;
        c0981.setImageDrawable(c2329);
        int dimension5 = (int) getResources().getDimension(R.dimen.main_button_padding);
        c0981.setPadding(dimension5, dimension5, dimension5, dimension5);
        c0981.setOnClickListener(new ViewOnClickListenerC0111(this, 7));
        this.f6636 = c0981;
        frameLayout.addView(c0981, layoutParams2);
        if (this.f2850) {
            TextureView textureView = new TextureView(getContext());
            this.f2852 = textureView;
            textureView.setSurfaceTextureListener(null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ObjectAnimator m3988(View view, float f, float f2, long j, Interpolator interpolator, long j2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, view.getTranslationX(), f).setDuration(j2);
        duration.setInterpolator(interpolator);
        duration.setStartDelay(j);
        duration.start();
        ArrayList arrayList = this.f6637;
        arrayList.add(duration);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), f2).setDuration(j2);
        duration2.setStartDelay(j);
        duration2.setInterpolator(interpolator);
        duration2.start();
        arrayList.add(duration2);
        return duration2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ObjectAnimator m3989(View view, float f, long j, long j2, BaseInterpolator baseInterpolator) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), f).setDuration(j);
        duration.setStartDelay(j2);
        duration.setInterpolator(baseInterpolator);
        duration.start();
        ArrayList arrayList = this.f6637;
        arrayList.add(duration);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), f).setDuration(j);
        duration2.setStartDelay(j2);
        duration2.setInterpolator(baseInterpolator);
        duration2.start();
        arrayList.add(duration2);
        return duration;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3990(final Drawable drawable, long j, long j2, int i, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(drawable.getAlpha(), i).setDuration(j2);
        if (z) {
            drawable.setAlpha(0);
        }
        final C2569 c2569 = new C2569();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲈᲁᤝᲀ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Drawable drawable2 = drawable;
                drawable2.setAlpha(iIntValue);
                if (z && (drawable2 instanceof AnimatedVectorDrawable)) {
                    C2569 c25610 = c2569;
                    if (c25610.f8189) {
                        return;
                    }
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable2;
                    if (animatedVectorDrawable.getAlpha() > 0) {
                        animatedVectorDrawable.start();
                        c25610.f8189 = true;
                    }
                }
            }
        });
        duration.setStartDelay(j);
        duration.start();
        this.f6637.add(duration);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract void mo2739();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3991() {
        if (this.f6638) {
            ArrayList<ValueAnimator> arrayList = this.f6637;
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
                ObjectAnimator objectAnimatorM3988 = m3988(childAt, 0.0f, 0.0f, j2, getCloseInterpolatorAnimator(), this.f6625);
                long j3 = (long) (this.f6625 * 0.33f);
                m3989(childAt, 0.1f, j3, j2 + j3, new LinearInterpolator());
                m3990(((ImageView) childAt).getDrawable(), j2, (long) (this.f6625 * 0.16f), 0, false);
                j = j2 + this.f6623;
                if (childCount == 0) {
                    objectAnimatorM3988.addListener(new C0131(this, 5));
                }
            }
            long j4 = j;
            m3986(this, this.f6636, 1.0f, 300L, 0L);
            if (this.f2850) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(this.f6625 + j4);
                duration.addUpdateListener(new C1121(this, i));
                duration.start();
            }
            C2329 c2329 = this.f6639;
            if (c2329 != null) {
                c2329.m4290(0.0f);
            }
        } else {
            mo2739();
            C2329 c23210 = this.f6639;
            if (c23210 != null) {
                c23210.m4290(1.0f);
            }
        }
        boolean z = !this.f6638;
        this.f6638 = z;
        InterfaceC1433 interfaceC1433 = this.f6633;
        if (interfaceC1433 != null) {
            interfaceC1433.invoke(Boolean.valueOf(z));
        }
    }
}
