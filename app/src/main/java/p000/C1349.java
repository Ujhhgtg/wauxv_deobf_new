package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1349 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f4826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f4827;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0094 f4828;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public AbstractC0027 f4829;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ViewOnLayoutChangeListenerC0445 f4830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C1348 f4831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f4832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f4833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC1347 f4834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3056(C1348 c1348) {
        C0094 c0094 = this.f4828;
        if (c0094 == null) {
            return;
        }
        c1348.f4822 = c0094.m1122(1) + c1348.f4822;
        c1348.f4823 = this.f4828.m1122(2) + c1348.f4823;
        c1348.f4824 = this.f4828.m1122(3) + c1348.f4824;
        int iM1122 = this.f4828.m1122(4) + c1348.f4825;
        c1348.f4825 = iM1122;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4827;
        if (dialogXBaseRelativeLayout == null) {
            int i = c1348.f4822;
            int i2 = c1348.f4823;
            int i3 = c1348.f4824;
            Field field = AbstractC3578.f11184;
            dialogXBaseRelativeLayout.setPaddingRelative(i, i2, i3, iM1122);
        }
        int i4 = c1348.f4822;
        int i5 = c1348.f4823;
        int i6 = c1348.f4824;
        int i7 = c1348.f4825;
        boolean z = this.f4833;
        int i8 = this.f4832;
        int i9 = 0;
        C0094 c0095 = this.f4828;
        if (!z) {
            i8 = 0;
        }
        int i10 = i7 + i8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = (DialogXBaseRelativeLayout) c0095.f1049;
        if (dialogXBaseRelativeLayout2.f946 == null) {
            dialogXBaseRelativeLayout2.f946 = new Rect();
        }
        C1646 c1646 = null;
        if (dialogXBaseRelativeLayout2.getRootWindowInsets() != null) {
            C3665 c3665 = C3669.m5299(null, dialogXBaseRelativeLayout2.getRootWindowInsets()).f11452;
            boolean zMo5271 = c3665.mo5271(2);
            if (!c3665.mo5271(8) && zMo5271) {
                C1646 c1646Mo5265 = c3665.mo5265(519);
                if (c1646Mo5265.f5583 != i10 || c1646Mo5265.f5581 != i5 || c1646Mo5265.f5580 != i4 || c1646Mo5265.f5582 != i6) {
                    c1646 = c1646Mo5265;
                }
            }
        }
        if (c1646 != null) {
            dialogXBaseRelativeLayout2.f946.left = Math.max(c1646.f5580, i4);
            dialogXBaseRelativeLayout2.f946.top = Math.max(c1646.f5581, i5);
            dialogXBaseRelativeLayout2.f946.right = Math.max(c1646.f5582, i6);
            dialogXBaseRelativeLayout2.f946.bottom = Math.max(c1646.f5583, i10);
        } else {
            Rect rect = dialogXBaseRelativeLayout2.f946;
            rect.left = i4;
            rect.top = i5;
            rect.right = i6;
            rect.bottom = i10;
        }
        Rect rect2 = dialogXBaseRelativeLayout2.f946;
        dialogXBaseRelativeLayout2.m765(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3057(C3669 c3669, C1348 c1348) {
        int iM2642;
        int iM2643;
        int iM2641;
        int iM2644;
        int rotation;
        if (this.f4827 == null || c3669 == null) {
            return;
        }
        C3665 c3665 = c3669.f11452;
        this.f4831 = c1348;
        C1077 c1077Mo5288 = c3665.mo5288();
        if (c1077Mo5288 != null) {
            int i = Build.VERSION.SDK_INT;
            iM2643 = i >= 28 ? AbstractC1076.m2643(c1077Mo5288.f3894) : 0;
            iM2641 = i >= 28 ? AbstractC1076.m2641(c1077Mo5288.f3894) : 0;
            iM2644 = i >= 28 ? AbstractC1076.m2642(c1077Mo5288.f3894) : 0;
            iM2642 = i >= 28 ? AbstractC1076.m2642(c1077Mo5288.f3894) : 0;
        } else {
            iM2642 = 0;
            iM2643 = 0;
            iM2641 = 0;
            iM2644 = 0;
        }
        C1646 c1646Mo5265 = c3665.mo5265(527);
        int i2 = c1646Mo5265.f5580;
        int i3 = c1646Mo5265.f5581;
        int i4 = c1646Mo5265.f5583;
        int i5 = c1646Mo5265.f5582;
        int windowSystemUiVisibility = this.f4827.getRootView().getWindowSystemUiVisibility();
        int i6 = Build.VERSION.SDK_INT;
        boolean z = i6 >= 30 || (windowSystemUiVisibility & 4) == 0;
        int i7 = ((i6 >= 30 || (windowSystemUiVisibility & 2) == 0) && (c3665.mo5271(8) || c3665.mo5271(2))) ? i4 : 0;
        int i8 = (z && c3665.mo5271(1)) ? i3 : 0;
        if (i3 == 0 && i4 == 0 && c1646Mo5265.f5580 == 0 && i5 == 0) {
            int i9 = 0;
            AbstractC0027 abstractC0027 = this.f4829;
            Activity activityM740 = abstractC0027 == null ? AbstractC0027.m740() : abstractC0027.m754();
            if (activityM740 != null && activityM740.getResources().getConfiguration().orientation == 2 && (rotation = activityM740.getWindowManager().getDefaultDisplay().getRotation()) != 1 && rotation == 3) {
                c1348.f4824 = m3060();
                c1348.f4822 = m3059();
            } else {
                c1348.f4823 = m3060();
                c1348.f4825 = m3059();
            }
            this.f4833 = true;
            View viewM3058 = m3058();
            if (viewM3058 != null) {
                if (this.f4834 != null) {
                    viewM3058.getViewTreeObserver().removeOnGlobalLayoutListener(this.f4834);
                }
                ViewTreeObserver viewTreeObserver = viewM3058.getViewTreeObserver();
                ViewTreeObserverOnGlobalLayoutListenerC1347 viewTreeObserverOnGlobalLayoutListenerC1347 = new ViewTreeObserverOnGlobalLayoutListenerC1347(this, viewM3058);
                this.f4834 = viewTreeObserverOnGlobalLayoutListenerC1347;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1347);
            }
        } else {
            this.f4833 = false;
            
            c1348.f4823 = Math.max(i8, iM2643) + c1348.f4823;
            
            c1348.f4825 = Math.max(i7, iM2642) + c1348.f4825;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4827;
            Field field = AbstractC3578.f11184;
            boolean z2 = dialogXBaseRelativeLayout.getLayoutDirection() == 1;
            
            if (z2) {
                c1348.f4822 = Math.max(i5, iM2644) + c1348.f4822;
            } else {
                c1348.f4822 = Math.max(i2, iM2641) + c1348.f4822;
            }
            
            if (z2) {
                c1348.f4824 = Math.max(i2, iM2641) + c1348.f4824;
            } else {
                c1348.f4824 = Math.max(i5, iM2644) + c1348.f4824;
            }
        }
        m3056(c1348);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final View m3058() {
        AbstractC0027 abstractC0027 = this.f4829;
        Activity activityM740 = abstractC0027 == null ? AbstractC0027.m740() : abstractC0027.m754();
        if (activityM740 == null) {
            return null;
        }
        return activityM740.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m3059() {
        if (!m3061() && m3058() != null) {
            int i = Build.VERSION.SDK_INT;
            WindowInsetsController windowInsetsController = i >= 30 ? m3058().getWindowInsetsController() : null;
            if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
                int i2 = 0;
                return 0;
            }
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4827;
            Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f4827.getContext().getResources();
            int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return system.getDimensionPixelSize(identifier);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3060() {
        if (m3061() || m3058() == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowInsetsController windowInsetsController = i >= 30 ? m3058().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 8192) == 0) {
            return 0;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4827;
        Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f4827.getContext().getResources();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m3061() {
        AbstractC0027 abstractC0027 = this.f4829;
        Activity activityM740 = abstractC0027 == null ? AbstractC0027.m740() : abstractC0027.m754();
        if (activityM740 == null) {
            return false;
        }
        return ((activityM740.getWindow().getAttributes().flags & 1024) == 0 && (activityM740.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) ? false : true;
    }
}
