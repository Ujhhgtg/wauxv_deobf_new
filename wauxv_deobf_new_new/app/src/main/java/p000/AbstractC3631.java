package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᲇᤞᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3631 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C3729 m5158(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C3729 c3729M5305 = C3729.m5305(null, rootWindowInsets);
        C3725 c3725 = c3729M5305.f11601;
        c3725.mo5280(c3729M5305);
        View rootView = view.getRootView();
        c3725.mo5268(rootView);
        c3725.mo5273(rootView);
        c3725.mo5274();
        return c3729M5305;
    }
}
