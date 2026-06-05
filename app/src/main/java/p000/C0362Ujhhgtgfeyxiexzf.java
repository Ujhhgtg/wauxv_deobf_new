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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能ᛲᛱfeyxiexzfᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0362Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f2058Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final MenuC0355Ujhhgtgfeyxiexzf f2059Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f2060Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2061Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public View f2062Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f2064Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public InterfaceC0372Ujhhgtgfeyxiexzf f2065Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public AbstractC0365Ujhhgtgfeyxiexzf f2066Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f2067Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f2063Ujhhgtgfeyxiexzf = 8388611;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C0366Ujhhgtgfeyxiexzf f2068Ujhhgtgfeyxiexzf = new C0366Ujhhgtgfeyxiexzf(this);

    public C0362Ujhhgtgfeyxiexzf(Context context, MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, View view, boolean z, int i, int i2) {
        this.f2058Ujhhgtgfeyxiexzf = context;
        this.f2059Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
        this.f2062Ujhhgtgfeyxiexzf = view;
        this.f2060Ujhhgtgfeyxiexzf = z;
        this.f2061Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AbstractC0365Ujhhgtgfeyxiexzf m1575Ujhhgtgfeyxiexzf() {
        AbstractC0365Ujhhgtgfeyxiexzf viewOnKeyListenerC1124feyxiexzfUjhhgtg;
        if (this.f2066Ujhhgtgfeyxiexzf == null) {
            Context context = this.f2058Ujhhgtgfeyxiexzf;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1124feyxiexzfUjhhgtg = new ViewOnKeyListenerC2787feyxiexzfUjhhgtg(context, this.f2062Ujhhgtgfeyxiexzf, this.f2061Ujhhgtgfeyxiexzf, this.f2060Ujhhgtgfeyxiexzf);
            } else {
                viewOnKeyListenerC1124feyxiexzfUjhhgtg = new ViewOnKeyListenerC1124feyxiexzfUjhhgtg(this.f2058Ujhhgtgfeyxiexzf, this.f2059Ujhhgtgfeyxiexzf, this.f2062Ujhhgtgfeyxiexzf, this.f2061Ujhhgtgfeyxiexzf, this.f2060Ujhhgtgfeyxiexzf);
            }
            viewOnKeyListenerC1124feyxiexzfUjhhgtg.mo1584Ujhhgtgfeyxiexzf(this.f2059Ujhhgtgfeyxiexzf);
            viewOnKeyListenerC1124feyxiexzfUjhhgtg.mo1589Ujhhgtgfeyxiexzf(this.f2068Ujhhgtgfeyxiexzf);
            viewOnKeyListenerC1124feyxiexzfUjhhgtg.mo1585Ujhhgtgfeyxiexzf(this.f2062Ujhhgtgfeyxiexzf);
            viewOnKeyListenerC1124feyxiexzfUjhhgtg.mo1597Ujhhgtgfeyxiexzf(this.f2065Ujhhgtgfeyxiexzf);
            viewOnKeyListenerC1124feyxiexzfUjhhgtg.mo1586Ujhhgtgfeyxiexzf(this.f2064Ujhhgtgfeyxiexzf);
            viewOnKeyListenerC1124feyxiexzfUjhhgtg.mo1587Ujhhgtgfeyxiexzf(this.f2063Ujhhgtgfeyxiexzf);
            this.f2066Ujhhgtgfeyxiexzf = viewOnKeyListenerC1124feyxiexzfUjhhgtg;
        }
        return this.f2066Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m1576Ujhhgtgfeyxiexzf() {
        AbstractC0365Ujhhgtgfeyxiexzf abstractC0365Ujhhgtgfeyxiexzf = this.f2066Ujhhgtgfeyxiexzf;
        return abstractC0365Ujhhgtgfeyxiexzf != null && abstractC0365Ujhhgtgfeyxiexzf.mo1415Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void mo1577Ujhhgtgfeyxiexzf() {
        this.f2066Ujhhgtgfeyxiexzf = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2067Ujhhgtgfeyxiexzf;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1578Ujhhgtgfeyxiexzf(int i, int i2, boolean z, boolean z2) {
        AbstractC0365Ujhhgtgfeyxiexzf abstractC0365UjhhgtgfeyxiexzfM1575Ujhhgtgfeyxiexzf = m1575Ujhhgtgfeyxiexzf();
        abstractC0365UjhhgtgfeyxiexzfM1575Ujhhgtgfeyxiexzf.mo1590Ujhhgtgfeyxiexzf(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f2063Ujhhgtgfeyxiexzf, this.f2062Ujhhgtgfeyxiexzf.getLayoutDirection()) & 7) == 5) {
                i -= this.f2062Ujhhgtgfeyxiexzf.getWidth();
            }
            abstractC0365UjhhgtgfeyxiexzfM1575Ujhhgtgfeyxiexzf.mo1588Ujhhgtgfeyxiexzf(i);
            abstractC0365UjhhgtgfeyxiexzfM1575Ujhhgtgfeyxiexzf.mo1591Ujhhgtgfeyxiexzf(i2);
            int i3 = (int) ((this.f2058Ujhhgtgfeyxiexzf.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0365UjhhgtgfeyxiexzfM1575Ujhhgtgfeyxiexzf.f2073Ujhhgtgfeyxiexzf = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC0365UjhhgtgfeyxiexzfM1575Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
    }
}
