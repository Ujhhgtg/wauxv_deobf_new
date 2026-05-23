package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲀᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3569 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C3669 f11181 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ View f11182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2274 f11183;

    public ViewOnApplyWindowInsetsListenerC3569(View view, InterfaceC2274 interfaceC2274) {
        this.f11182 = view;
        this.f11183 = interfaceC2274;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C3669 c3669M5299 = C3669.m5299(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC2274 interfaceC2274 = this.f11183;
        if (i < 30) {
            AbstractC3570.m5149(windowInsets, this.f11182);
            if (c3669M5299.equals(this.f11181)) {
                return interfaceC2274.mo1108(view, c3669M5299).m5302();
            }
        }
        this.f11181 = c3669M5299;
        C3669 c3669Mo1108 = interfaceC2274.mo1108(view, c3669M5299);
        if (i >= 30) {
            return c3669Mo1108.m5302();
        }
        Field field = AbstractC3578.f11184;
        view.requestApplyInsets();
        return c3669Mo1108.m5302();
    }
}
