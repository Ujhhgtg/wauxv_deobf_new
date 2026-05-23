package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1949 {

    public final Context f6457;

    public final MenuC1944 f6458;

    public final boolean f6459;

    public final int f6460;

    public View f6461;

    public boolean f6463;

    public InterfaceC1954 f6464;

    public AbstractC1947 f6465;

    public PopupWindow.OnDismissListener f6466;

    public int f6462 = 8388611;

    public final C1948 f6467 = new C1948(this);

    public C1949(Context context, MenuC1944 menuC1944, View view, boolean z, int i, int i2) {
        this.f6457 = context;
        this.f6458 = menuC1944;
        this.f6461 = view;
        this.f6459 = z;
        this.f6460 = i;
    }

    public final AbstractC1947 m3780() {
        AbstractC1947 viewOnKeyListenerC2808;
        if (this.f6465 == null) {
            Context context = this.f6457;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC2808 = new ViewOnKeyListenerC0572(context, this.f6461, this.f6460, this.f6459);
            } else {
                viewOnKeyListenerC2808 = new ViewOnKeyListenerC2808(this.f6457, this.f6458, this.f6461, this.f6460, this.f6459);
            }
            viewOnKeyListenerC2808.mo1970(this.f6458);
            viewOnKeyListenerC2808.mo1975(this.f6467);
            viewOnKeyListenerC2808.mo1971(this.f6461);
            viewOnKeyListenerC2808.mo1144(this.f6464);
            viewOnKeyListenerC2808.mo1972(this.f6463);
            viewOnKeyListenerC2808.mo1973(this.f6462);
            this.f6465 = viewOnKeyListenerC2808;
        }
        return this.f6465;
    }

    public final boolean m3781() {
        AbstractC1947 abstractC1947 = this.f6465;
        return abstractC1947 != null && abstractC1947.mo1967();
    }

    public void mo1135() {
        this.f6465 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f6466;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void m3782(int i, int i2, boolean z, boolean z2) {
        AbstractC1947 abstractC1947M3780 = m3780();
        abstractC1947M3780.mo1976(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f6462, this.f6461.getLayoutDirection()) & 7) == 5) {
                i -= this.f6461.getWidth();
            }
            abstractC1947M3780.mo1974(i);
            abstractC1947M3780.mo1977(i2);
            int i3 = (int) ((this.f6457.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1947M3780.f6455 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC1947M3780.mo1968();
    }
}
