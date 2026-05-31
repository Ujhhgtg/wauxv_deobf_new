package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᲁᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3702 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC0573 f11550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C3729 f11551;

    public ViewOnApplyWindowInsetsListenerC3702(View view, AbstractC0573 abstractC0573) {
        C3729 c3729Mo5251;
        this.f11550 = abstractC0573;
        Field field = AbstractC3638.f11333;
        C3729 c3729M5158 = AbstractC3631.m5158(view);
        if (c3729M5158 != null) {
            int i = Build.VERSION.SDK_INT;
            c3729Mo5251 = (i >= 36 ? new C3714(c3729M5158) : i >= 35 ? new C3713(c3729M5158) : i >= 34 ? new C3712(c3729M5158) : i >= 31 ? new C3711(c3729M5158) : i >= 30 ? new C3710(c3729M5158) : i >= 29 ? new C3709(c3729M5158) : new C3708(c3729M5158)).mo5251();
        } else {
            c3729Mo5251 = null;
        }
        this.f11551 = c3729Mo5251;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f11551 = C3729.m5305(view, windowInsets);
            return C3703.m5243(view, windowInsets);
        }
        C3729 c3729M5305 = C3729.m5305(view, windowInsets);
        C3725 c3725 = c3729M5305.f11601;
        if (this.f11551 == null) {
            Field field = AbstractC3638.f11333;
            this.f11551 = AbstractC3631.m5158(view);
        }
        if (this.f11551 == null) {
            this.f11551 = c3729M5305;
            return C3703.m5243(view, windowInsets);
        }
        AbstractC0573 abstractC0573M5244 = C3703.m5244(view);
        if (abstractC0573M5244 != null && Objects.equals((C3729) abstractC0573M5244.f2366, c3729M5305)) {
            return C3703.m5243(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        C3729 c3729 = this.f11551;
        int i = 1;
        while (i <= 512) {
            C1660 c1660Mo5271 = c3725.mo5271(i);
            C1660 c1660Mo5272 = c3729.f11601.mo5271(i);
            int i2 = c1660Mo5271.f5615;
            int i3 = c1660Mo5271.f5618;
            int i4 = c1660Mo5271.f5617;
            int i5 = c1660Mo5271.f5616;
            int i6 = c1660Mo5272.f5615;
            int i7 = c1660Mo5272.f5618;
            int i8 = c1660Mo5272.f5617;
            int i9 = c1660Mo5272.f5616;
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
            this.f11551 = c3729M5305;
            return C3703.m5243(view, windowInsets);
        }
        C3729 c37210 = this.f11551;
        if ((i10 & 8) != 0) {
            interpolator = C3703.f11552;
        } else if ((i11 & 8) != 0) {
            interpolator = C3703.f11553;
        } else if ((i10 & 519) != 0) {
            interpolator = C3703.f11554;
        } else {
            interpolator = (i11 & 519) != 0 ? C3703.f11555 : null;
        }
        C3707 c3707 = new C3707(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        c3707.f11565.mo5249(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c3707.f11565.mo5246());
        C1660 c1660Mo5273 = c3725.mo5271(i12);
        C1660 c1660Mo5274 = c37210.f11601.mo5271(i12);
        int iMin = Math.min(c1660Mo5273.f5615, c1660Mo5274.f5615);
        int i13 = c1660Mo5273.f5616;
        int i14 = c1660Mo5274.f5616;
        int iMin2 = Math.min(i13, i14);
        int i15 = c1660Mo5273.f5617;
        int i16 = c1660Mo5274.f5617;
        int iMin3 = Math.min(i15, i16);
        int i17 = c1660Mo5273.f5618;
        int i18 = c1660Mo5274.f5618;
        C2885 c2885 = new C2885(C1660.m3539(iMin, iMin2, iMin3, Math.min(i17, i18)), 6, C1660.m3539(Math.max(c1660Mo5273.f5615, c1660Mo5274.f5615), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        C3703.m5240(view, c3707, c3729M5305, false);
        duration.addUpdateListener(new C3701(c3707, c3729M5305, c37210, i12, view));
        duration.addListener(new C3488(c3707, view));
        RunnableC0547 runnableC0547 = new RunnableC0547(view, c3707, c2885, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC2325 viewTreeObserverOnPreDrawListenerC2325 = new ViewTreeObserverOnPreDrawListenerC2325(view, runnableC0547);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2325);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2325);
        this.f11551 = c3729M5305;
        return C3703.m5243(view, windowInsets);
    }
}
