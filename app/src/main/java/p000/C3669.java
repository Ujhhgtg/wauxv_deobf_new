package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3669 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C3669 f11451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3665 f11452;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f11451 = C3662.f11448;
        } else if (i >= 30) {
            f11451 = C3660.f11447;
        } else {
            f11451 = C3665.f11449;
        }
    }

    public C3669(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f11452 = new C3664(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f11452 = new C3662(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f11452 = new C3661(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f11452 = new C3660(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f11452 = new C3659(this, windowInsets);
        } else if (i >= 28) {
            this.f11452 = new C3658(this, windowInsets);
        } else {
            this.f11452 = new C3657(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1646 m5298(C1646 c1646, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c1646.f5580 - i);
        int iMax2 = Math.max(0, c1646.f5581 - i2);
        int iMax3 = Math.max(0, c1646.f5582 - i3);
        int iMax4 = Math.max(0, c1646.f5583 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c1646 : C1646.m3375(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C3669 m5299(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C3669 c3669 = new C3669(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = AbstractC3578.f11184;
            C3669 c3669M5152 = AbstractC3571.m5152(view);
            C3665 c3665 = c3669.f11452;
            c3665.mo5274(c3669M5152);
            View rootView = view.getRootView();
            c3665.mo5262(rootView);
            c3665.mo5267(rootView);
            c3665.mo5268();
            c3665.mo5275(view.getWindowSystemUiVisibility());
        }
        return c3669;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3669) {
            return Objects.equals(this.f11452, ((C3669) obj).f11452);
        }
        return false;
    }

    public final int hashCode() {
        C3665 c3665 = this.f11452;
        if (c3665 == null) {
            return 0;
        }
        return c3665.hashCode();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m5300() {
        return this.f11452.mo5266().f5583;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m5301() {
        return this.f11452.mo5266().f5581;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final WindowInsets m5302() {
        C3665 c3665 = this.f11452;
        if (c3665 instanceof AbstractC3656) {
            return ((AbstractC3656) c3665).f11433;
        }
        return null;
    }

    public C3669() {
        this.f11452 = new C3665(this);
    }
}
