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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲀᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1980 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f6562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final MenuC1975 f6563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f6564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public View f6566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f6568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC1985 f6569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public AbstractC1978 f6570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f6571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6567 = 8388611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C1979 f6572 = new C1979(this);

    public C1980(Context context, MenuC1975 menuC1975, View view, boolean z, int i, int i2) {
        this.f6562 = context;
        this.f6563 = menuC1975;
        this.f6566 = view;
        this.f6564 = z;
        this.f6565 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC1978 m3974() {
        AbstractC1978 viewOnKeyListenerC2867;
        if (this.f6570 == null) {
            Context context = this.f6562;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC2867 = new ViewOnKeyListenerC0549(context, this.f6566, this.f6565, this.f6564);
            } else {
                viewOnKeyListenerC2867 = new ViewOnKeyListenerC2867(this.f6562, this.f6563, this.f6566, this.f6565, this.f6564);
            }
            viewOnKeyListenerC2867.mo2067(this.f6563);
            viewOnKeyListenerC2867.mo2072(this.f6572);
            viewOnKeyListenerC2867.mo2068(this.f6566);
            viewOnKeyListenerC2867.mo1290(this.f6569);
            viewOnKeyListenerC2867.mo2069(this.f6568);
            viewOnKeyListenerC2867.mo2070(this.f6567);
            this.f6570 = viewOnKeyListenerC2867;
        }
        return this.f6570;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m3975() {
        AbstractC1978 abstractC1978 = this.f6570;
        return abstractC1978 != null && abstractC1978.mo2064();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1281() {
        this.f6570 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f6571;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3976(int i, int i2, boolean z, boolean z2) {
        AbstractC1978 abstractC1978M3974 = m3974();
        abstractC1978M3974.mo2073(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f6567, this.f6566.getLayoutDirection()) & 7) == 5) {
                i -= this.f6566.getWidth();
            }
            abstractC1978M3974.mo2071(i);
            abstractC1978M3974.mo2074(i2);
            int i3 = (int) ((this.f6562.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1978M3974.f6560 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC1978M3974.mo2065();
    }
}
