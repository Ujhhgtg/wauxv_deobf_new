package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0445 implements View.OnLayoutChangeListener {

    public final /* synthetic */ int f2013;

    public final /* synthetic */ Object f2014;

    public /* synthetic */ ViewOnLayoutChangeListenerC0445(int i, Object obj) {
        this.f2013 = i;
        this.f2014 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0363 c0363;
        int i9 = this.f2013;
        Object obj = this.f2014;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                ViewOnAttachStateChangeListenerC1346 viewOnAttachStateChangeListenerC1346 = (ViewOnAttachStateChangeListenerC1346) obj;
                WindowInsets rootWindowInsets = view.getRootView().getRootWindowInsets();
                if (rootWindowInsets == null) {
                    
                    int i10 = 0;
                    return;
                } else {
                    
                    int i11 = 0;
                    ((C1349) viewOnAttachStateChangeListenerC1346.f4819).m3057(C3669.m5299(null, rootWindowInsets), new C1348((C1348) viewOnAttachStateChangeListenerC1346.f4818));
                    return;
                }
            case 2:
                C0446 c0446 = (C0446) obj;
                ImageView imageView = c0446.f7001;
                if (imageView.getVisibility() != 0 || (c0363 = c0446.f7019) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c0363.setBounds(rect);
                c0363.m1483(imageView, null);
                return;
            default:
                C3420 c3420 = (C3420) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                c3420.f10788 = iArr[0];
                view.getWindowVisibleDisplayFrame(c3420.f10781);
                return;
        }
    }
}
