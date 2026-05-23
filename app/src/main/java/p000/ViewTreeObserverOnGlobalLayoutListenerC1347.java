package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1347 implements ViewTreeObserver.OnGlobalLayoutListener {

    public final /* synthetic */ View f4820;

    public final /* synthetic */ C1349 f4821;

    public ViewTreeObserverOnGlobalLayoutListenerC1347(C1349 c1349, View view) {
        this.f4821 = c1349;
        this.f4820 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        View view = this.f4820;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getHeight();
        int i = Build.VERSION.SDK_INT;
        C1349 c1349 = this.f4821;
        WindowInsetsController windowInsetsController = i >= 30 ? c1349.m3058().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
            rect.bottom = height;
        }
        int i2 = height - rect.bottom;
        if (i2 != c1349.f4832) {
            c1349.f4832 = i2;
            int i3 = 0;
            C1348 c1348 = c1349.f4831;
            if (c1348 != null) {
                c1349.m3056(c1348);
            }
        }
    }
}
