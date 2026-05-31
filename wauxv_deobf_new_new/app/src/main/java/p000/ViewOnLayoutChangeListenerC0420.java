package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲀᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0420 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1985;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1986;

    public /* synthetic */ ViewOnLayoutChangeListenerC0420(Object obj, int i) {
        this.f1985 = i;
        this.f1986 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0338 c0338;
        int i9 = this.f1985;
        Object obj = this.f1986;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                ViewOnAttachStateChangeListenerC1346 viewOnAttachStateChangeListenerC1346 = (ViewOnAttachStateChangeListenerC1346) obj;
                WindowInsets rootWindowInsets = view.getRootView().getRootWindowInsets();
                if (rootWindowInsets == null) {
                    ((C1349) viewOnAttachStateChangeListenerC1346.f4816).getClass();
                    int i10 = DialogXBaseRelativeLayout.f998;
                    return;
                } else {
                    ((C1349) viewOnAttachStateChangeListenerC1346.f4816).getClass();
                    int i11 = DialogXBaseRelativeLayout.f998;
                    ((C1349) viewOnAttachStateChangeListenerC1346.f4816).m3160(C3729.m5305(null, rootWindowInsets), new C1348((C1348) viewOnAttachStateChangeListenerC1346.f4815));
                    return;
                }
            case 2:
                C0421 c0421 = (C0421) obj;
                ImageView imageView = c0421.f7125;
                if (imageView.getVisibility() != 0 || (c0338 = c0421.f7143) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c0338.setBounds(rect);
                c0338.m1588(imageView, null);
                return;
            default:
                C3478 c3478 = (C3478) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                c3478.f10949 = iArr[0];
                view.getWindowVisibleDisplayFrame(c3478.f10942);
                return;
        }
    }
}
