package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2785Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8796Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8797Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8798Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8799Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f8800Ujhhgtgfeyxiexzf;

    public RunnableC2785Ujhhgtgfeyxiexzf(C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf, C2786Ujhhgtgfeyxiexzf c2786Ujhhgtgfeyxiexzf, MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf, MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        this.f8800Ujhhgtgfeyxiexzf = c2965Ujhhgtgfeyxiexzf;
        this.f8797Ujhhgtgfeyxiexzf = c2786Ujhhgtgfeyxiexzf;
        this.f8798Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf;
        this.f8799Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8796Ujhhgtgfeyxiexzf) {
            case 0:
                ViewOnKeyListenerC2787feyxiexzfUjhhgtg viewOnKeyListenerC2787feyxiexzfUjhhgtg = (ViewOnKeyListenerC2787feyxiexzfUjhhgtg) ((C2965Ujhhgtgfeyxiexzf) this.f8800Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) this.f8798Ujhhgtgfeyxiexzf;
                C2786Ujhhgtgfeyxiexzf c2786Ujhhgtgfeyxiexzf = (C2786Ujhhgtgfeyxiexzf) this.f8797Ujhhgtgfeyxiexzf;
                if (c2786Ujhhgtgfeyxiexzf != null) {
                    viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8828feyxiexzfUjhhgtg = true;
                    c2786Ujhhgtgfeyxiexzf.f8802Ujhhgtgfeyxiexzf.m1544Ujhhgtgfeyxiexzf(false);
                    viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8828feyxiexzfUjhhgtg = false;
                }
                if (menuItemC0357Ujhhgtgfeyxiexzf.isEnabled() && menuItemC0357Ujhhgtgfeyxiexzf.hasSubMenu()) {
                    ((MenuC0355Ujhhgtgfeyxiexzf) this.f8799Ujhhgtgfeyxiexzf).m1557Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf, null, 4);
                    break;
                }
                break;
            default:
                C2237feyxiexzfUjhhgtg.m3405Ujhhgtgfeyxiexzf((View) this.f8797Ujhhgtgfeyxiexzf, (C2234feyxiexzfUjhhgtg) this.f8798Ujhhgtgfeyxiexzf, (C2073feyxiexzfUjhhgtg) this.f8799Ujhhgtgfeyxiexzf);
                ((ValueAnimator) this.f8800Ujhhgtgfeyxiexzf).start();
                break;
        }
    }

    public RunnableC2785Ujhhgtgfeyxiexzf(View view, C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg, C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg, ValueAnimator valueAnimator) {
        this.f8797Ujhhgtgfeyxiexzf = view;
        this.f8798Ujhhgtgfeyxiexzf = c2234feyxiexzfUjhhgtg;
        this.f8799Ujhhgtgfeyxiexzf = c2073feyxiexzfUjhhgtg;
        this.f8800Ujhhgtgfeyxiexzf = valueAnimator;
    }
}
