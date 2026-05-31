package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤝᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3729 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C3729 f11600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3725 f11601;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f11600 = C3722.f11597;
        } else if (i >= 30) {
            f11600 = C3720.f11596;
        } else {
            f11600 = C3725.f11598;
        }
    }

    public C3729(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f11601 = new C3724(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f11601 = new C3722(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f11601 = new C3721(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f11601 = new C3720(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f11601 = new C3719(this, windowInsets);
        } else if (i >= 28) {
            this.f11601 = new C3718(this, windowInsets);
        } else {
            this.f11601 = new C3717(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1660 m5304(C1660 c1660, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c1660.f5615 - i);
        int iMax2 = Math.max(0, c1660.f5616 - i2);
        int iMax3 = Math.max(0, c1660.f5617 - i3);
        int iMax4 = Math.max(0, c1660.f5618 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c1660 : C1660.m3539(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C3729 m5305(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C3729 c3729 = new C3729(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = AbstractC3638.f11333;
            C3729 c3729M5158 = AbstractC3631.m5158(view);
            C3725 c3725 = c3729.f11601;
            c3725.mo5280(c3729M5158);
            View rootView = view.getRootView();
            c3725.mo5268(rootView);
            c3725.mo5273(rootView);
            c3725.mo5274();
            c3725.mo5281(view.getWindowSystemUiVisibility());
        }
        return c3729;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3729) {
            return Objects.equals(this.f11601, ((C3729) obj).f11601);
        }
        return false;
    }

    public final int hashCode() {
        C3725 c3725 = this.f11601;
        if (c3725 == null) {
            return 0;
        }
        return c3725.hashCode();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m5306() {
        return this.f11601.mo5272().f5618;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m5307() {
        return this.f11601.mo5272().f5616;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final WindowInsets m5308() {
        C3725 c3725 = this.f11601;
        if (c3725 instanceof AbstractC3716) {
            return ((AbstractC3716) c3725).f11582;
        }
        return null;
    }

    public C3729() {
        this.f11601 = new C3725(this);
    }
}
