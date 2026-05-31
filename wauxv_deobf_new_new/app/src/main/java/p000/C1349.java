package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲈᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1349 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f4823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f4824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0102 f4825;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public AbstractC0034 f4826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ViewOnLayoutChangeListenerC0420 f4827;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C1348 f4828;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f4829;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f4830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC1347 f4831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3159(C1348 c1348) {
        C0102 c0102 = this.f4825;
        if (c0102 == null) {
            return;
        }
        c1348.f4819 = c0102.m1268(1) + c1348.f4819;
        c1348.f4820 = this.f4825.m1268(2) + c1348.f4820;
        c1348.f4821 = this.f4825.m1268(3) + c1348.f4821;
        int iM1268 = this.f4825.m1268(4) + c1348.f4822;
        c1348.f4822 = iM1268;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4824;
        if (dialogXBaseRelativeLayout == null) {
            int i = c1348.f4819;
            int i2 = c1348.f4820;
            int i3 = c1348.f4821;
            Field field = AbstractC3638.f11333;
            dialogXBaseRelativeLayout.setPaddingRelative(i, i2, i3, iM1268);
        }
        int i4 = c1348.f4819;
        int i5 = c1348.f4820;
        int i6 = c1348.f4821;
        int i7 = c1348.f4822;
        boolean z = this.f4830;
        int i8 = this.f4829;
        int i9 = DialogXBaseRelativeLayout.f998;
        C0102 c0103 = this.f4825;
        if (!z) {
            i8 = 0;
        }
        int i10 = i7 + i8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = (DialogXBaseRelativeLayout) c0103.f1117;
        if (dialogXBaseRelativeLayout2.f1012 == null) {
            dialogXBaseRelativeLayout2.f1012 = new Rect();
        }
        C1660 c1660 = null;
        if (dialogXBaseRelativeLayout2.getRootWindowInsets() != null) {
            C3725 c3725 = C3729.m5305(null, dialogXBaseRelativeLayout2.getRootWindowInsets()).f11601;
            boolean zMo5277 = c3725.mo5277(2);
            if (!c3725.mo5277(8) && zMo5277) {
                C1660 c1660Mo5271 = c3725.mo5271(519);
                if (c1660Mo5271.f5618 != i10 || c1660Mo5271.f5616 != i5 || c1660Mo5271.f5615 != i4 || c1660Mo5271.f5617 != i6) {
                    c1660 = c1660Mo5271;
                }
            }
        }
        if (c1660 != null) {
            dialogXBaseRelativeLayout2.f1012.left = Math.max(c1660.f5615, i4);
            dialogXBaseRelativeLayout2.f1012.top = Math.max(c1660.f5616, i5);
            dialogXBaseRelativeLayout2.f1012.right = Math.max(c1660.f5617, i6);
            dialogXBaseRelativeLayout2.f1012.bottom = Math.max(c1660.f5618, i10);
        } else {
            Rect rect = dialogXBaseRelativeLayout2.f1012;
            rect.left = i4;
            rect.top = i5;
            rect.right = i6;
            rect.bottom = i10;
        }
        Rect rect2 = dialogXBaseRelativeLayout2.f1012;
        dialogXBaseRelativeLayout2.m909(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3160(C3729 c3729, C1348 c1348) {
        int iM2768;
        int iM2769;
        int iM2767;
        int iM27610;
        int rotation;
        if (this.f4824 == null || c3729 == null) {
            return;
        }
        C3725 c3725 = c3729.f11601;
        this.f4828 = c1348;
        C1082 c1082Mo5294 = c3725.mo5294();
        if (c1082Mo5294 != null) {
            int i = Build.VERSION.SDK_INT;
            iM2769 = i >= 28 ? AbstractC1081.m2769(c1082Mo5294.f3905) : 0;
            iM2767 = i >= 28 ? AbstractC1081.m2767(c1082Mo5294.f3905) : 0;
            iM27610 = i >= 28 ? AbstractC1081.m2768(c1082Mo5294.f3905) : 0;
            iM2768 = i >= 28 ? AbstractC1081.m2768(c1082Mo5294.f3905) : 0;
        } else {
            iM2768 = 0;
            iM2769 = 0;
            iM2767 = 0;
            iM27610 = 0;
        }
        C1660 c1660Mo5271 = c3725.mo5271(527);
        int i2 = c1660Mo5271.f5615;
        int i3 = c1660Mo5271.f5616;
        int i4 = c1660Mo5271.f5618;
        int i5 = c1660Mo5271.f5617;
        int windowSystemUiVisibility = this.f4824.getRootView().getWindowSystemUiVisibility();
        int i6 = Build.VERSION.SDK_INT;
        boolean z = i6 >= 30 || (windowSystemUiVisibility & 4) == 0;
        int i7 = ((i6 >= 30 || (windowSystemUiVisibility & 2) == 0) && (c3725.mo5277(8) || c3725.mo5277(2))) ? i4 : 0;
        int i8 = (z && c3725.mo5277(1)) ? i3 : 0;
        if (i3 == 0 && i4 == 0 && c1660Mo5271.f5615 == 0 && i5 == 0) {
            int i9 = DialogXBaseRelativeLayout.f998;
            AbstractC0034 abstractC0034 = this.f4826;
            Activity activityM884 = abstractC0034 == null ? AbstractC0034.m884() : abstractC0034.m898();
            if (activityM884 != null && activityM884.getResources().getConfiguration().orientation == 2 && (rotation = activityM884.getWindowManager().getDefaultDisplay().getRotation()) != 1 && rotation == 3) {
                c1348.f4821 = m3163();
                c1348.f4819 = m3162();
            } else {
                c1348.f4820 = m3163();
                c1348.f4822 = m3162();
            }
            this.f4830 = true;
            View viewM3161 = m3161();
            if (viewM3161 != null) {
                if (this.f4831 != null) {
                    viewM3161.getViewTreeObserver().removeOnGlobalLayoutListener(this.f4831);
                }
                ViewTreeObserver viewTreeObserver = viewM3161.getViewTreeObserver();
                ViewTreeObserverOnGlobalLayoutListenerC1347 viewTreeObserverOnGlobalLayoutListenerC1347 = new ViewTreeObserverOnGlobalLayoutListenerC1347(this, viewM3161);
                this.f4831 = viewTreeObserverOnGlobalLayoutListenerC1347;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1347);
            }
        } else {
            this.f4830 = false;
            this.f4825.getClass();
            c1348.f4820 = Math.max(i8, iM2769) + c1348.f4820;
            this.f4825.getClass();
            c1348.f4822 = Math.max(i7, iM2768) + c1348.f4822;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4824;
            Field field = AbstractC3638.f11333;
            boolean z2 = dialogXBaseRelativeLayout.getLayoutDirection() == 1;
            this.f4825.getClass();
            if (z2) {
                c1348.f4819 = Math.max(i5, iM27610) + c1348.f4819;
            } else {
                c1348.f4819 = Math.max(i2, iM2767) + c1348.f4819;
            }
            this.f4825.getClass();
            if (z2) {
                c1348.f4821 = Math.max(i2, iM2767) + c1348.f4821;
            } else {
                c1348.f4821 = Math.max(i5, iM27610) + c1348.f4821;
            }
        }
        m3159(c1348);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final View m3161() {
        AbstractC0034 abstractC0034 = this.f4826;
        Activity activityM884 = abstractC0034 == null ? AbstractC0034.m884() : abstractC0034.m898();
        if (activityM884 == null) {
            return null;
        }
        return activityM884.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m3162() {
        if (!m3164() && m3161() != null) {
            int i = Build.VERSION.SDK_INT;
            WindowInsetsController windowInsetsController = i >= 30 ? m3161().getWindowInsetsController() : null;
            if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
                int i2 = DialogXBaseRelativeLayout.f998;
                return 0;
            }
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4824;
            Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f4824.getContext().getResources();
            int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return system.getDimensionPixelSize(identifier);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3163() {
        if (m3164() || m3161() == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowInsetsController windowInsetsController = i >= 30 ? m3161().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 8192) == 0) {
            return 0;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f4824;
        Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f4824.getContext().getResources();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m3164() {
        AbstractC0034 abstractC0034 = this.f4826;
        Activity activityM884 = abstractC0034 == null ? AbstractC0034.m884() : abstractC0034.m898();
        if (activityM884 == null) {
            return false;
        }
        return ((activityM884.getWindow().getAttributes().flags & 1024) == 0 && (activityM884.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) ? false : true;
    }
}
