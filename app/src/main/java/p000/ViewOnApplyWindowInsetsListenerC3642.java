package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤞᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3642 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC0592 f11401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C3669 f11402;

    public ViewOnApplyWindowInsetsListenerC3642(View view, AbstractC0592 abstractC0592) {
        C3669 c3669Mo5245;
        this.f11401 = abstractC0592;
        Field field = AbstractC3578.f11184;
        C3669 c3669M5152 = AbstractC3571.m5152(view);
        if (c3669M5152 != null) {
            int i = Build.VERSION.SDK_INT;
            c3669Mo5245 = (i >= 36 ? new C3654(c3669M5152) : i >= 35 ? new C3653(c3669M5152) : i >= 34 ? new C3652(c3669M5152) : i >= 31 ? new C3651(c3669M5152) : i >= 30 ? new C3650(c3669M5152) : i >= 29 ? new C3649(c3669M5152) : new C3648(c3669M5152)).mo5245();
        } else {
            c3669Mo5245 = null;
        }
        this.f11402 = c3669Mo5245;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f11402 = C3669.m5299(view, windowInsets);
            return C3643.m5237(view, windowInsets);
        }
        C3669 c3669M5299 = C3669.m5299(view, windowInsets);
        C3665 c3665 = c3669M5299.f11452;
        if (this.f11402 == null) {
            Field field = AbstractC3578.f11184;
            this.f11402 = AbstractC3571.m5152(view);
        }
        if (this.f11402 == null) {
            this.f11402 = c3669M5299;
            return C3643.m5237(view, windowInsets);
        }
        AbstractC0592 abstractC0592M5238 = C3643.m5238(view);
        if (abstractC0592M5238 != null && Objects.equals((C3669) abstractC0592M5238.f2400, c3669M5299)) {
            return C3643.m5237(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        C3669 c3669 = this.f11402;
        int i = 1;
        while (i <= 512) {
            C1646 c1646Mo5265 = c3665.mo5265(i);
            C1646 c1646Mo5266 = c3669.f11452.mo5265(i);
            int i2 = c1646Mo5265.f5580;
            int i3 = c1646Mo5265.f5583;
            int i4 = c1646Mo5265.f5582;
            int i5 = c1646Mo5265.f5581;
            int i6 = c1646Mo5266.f5580;
            int i7 = c1646Mo5266.f5583;
            int i8 = c1646Mo5266.f5582;
            int i9 = c1646Mo5266.f5581;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.f11402 = c3669M5299;
            return C3643.m5237(view, windowInsets);
        }
        C3669 c36610 = this.f11402;
        if ((i10 & 8) != 0) {
            interpolator = C3643.f11403;
        } else if ((i11 & 8) != 0) {
            interpolator = C3643.f11404;
        } else if ((i10 & 519) != 0) {
            interpolator = C3643.f11405;
        } else {
            interpolator = (i11 & 519) != 0 ? C3643.f11406 : null;
        }
        C3647 c3647 = new C3647(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        c3647.f11416.mo5243(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c3647.f11416.mo5240());
        C1646 c1646Mo5267 = c3665.mo5265(i12);
        C1646 c1646Mo5268 = c36610.f11452.mo5265(i12);
        int iMin = Math.min(c1646Mo5267.f5580, c1646Mo5268.f5580);
        int i13 = c1646Mo5267.f5581;
        int i14 = c1646Mo5268.f5581;
        int iMin2 = Math.min(i13, i14);
        int i15 = c1646Mo5267.f5582;
        int i16 = c1646Mo5268.f5582;
        int iMin3 = Math.min(i15, i16);
        int i17 = c1646Mo5267.f5583;
        int i18 = c1646Mo5268.f5583;
        C2825 c2825 = new C2825(C1646.m3375(iMin, iMin2, iMin3, Math.min(i17, i18)), 6, C1646.m3375(Math.max(c1646Mo5267.f5580, c1646Mo5268.f5580), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        C3643.m5234(view, c3647, c3669M5299, false);
        duration.addUpdateListener(new C3641(c3647, c3669M5299, c36610, i12, view));
        duration.addListener(new C3431(c3647, view));
        RunnableC0570 runnableC0570 = new RunnableC0570(view, c3647, c2825, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC2292 viewTreeObserverOnPreDrawListenerC2292 = new ViewTreeObserverOnPreDrawListenerC2292(view, runnableC0570);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2292);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2292);
        this.f11402 = c3669M5299;
        return C3643.m5237(view, windowInsets);
    }
}
