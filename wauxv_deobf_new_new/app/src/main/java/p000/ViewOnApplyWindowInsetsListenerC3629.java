package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᲇᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3629 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C3729 f11330 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ View f11331;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2306 f11332;

    public ViewOnApplyWindowInsetsListenerC3629(View view, InterfaceC2306 interfaceC2306) {
        this.f11331 = view;
        this.f11332 = interfaceC2306;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C3729 c3729M5305 = C3729.m5305(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC2306 interfaceC2306 = this.f11332;
        if (i < 30) {
            AbstractC3630.m5155(windowInsets, this.f11331);
            if (c3729M5305.equals(this.f11330)) {
                return interfaceC2306.mo1254(view, c3729M5305).m5308();
            }
        }
        this.f11330 = c3729M5305;
        C3729 c3729Mo1254 = interfaceC2306.mo1254(view, c3729M5305);
        if (i >= 30) {
            return c3729Mo1254.m5308();
        }
        Field field = AbstractC3638.f11333;
        view.requestApplyInsets();
        return c3729Mo1254.m5308();
    }
}
