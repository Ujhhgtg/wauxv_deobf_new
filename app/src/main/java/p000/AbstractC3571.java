package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3571 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C3669 m5152(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C3669 c3669M5299 = C3669.m5299(null, rootWindowInsets);
        C3665 c3665 = c3669M5299.f11452;
        c3665.mo5274(c3669M5299);
        View rootView = view.getRootView();
        c3665.mo5262(rootView);
        c3665.mo5267(rootView);
        c3665.mo5268();
        return c3669M5299;
    }
}
