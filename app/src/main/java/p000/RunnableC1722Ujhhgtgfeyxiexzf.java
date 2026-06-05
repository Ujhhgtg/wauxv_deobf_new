package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1722Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f5779Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f5780Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC1722Ujhhgtgfeyxiexzf(Toolbar toolbar, int i) {
        this.f5779Ujhhgtgfeyxiexzf = i;
        this.f5780Ujhhgtgfeyxiexzf = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5779Ujhhgtgfeyxiexzf) {
            case 0:
                C1733Ujhhgtgfeyxiexzf c1733Ujhhgtgfeyxiexzf = this.f5780Ujhhgtgfeyxiexzf.f185feyxiexzfUjhhgtg;
                MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = c1733Ujhhgtgfeyxiexzf == null ? null : c1733Ujhhgtgfeyxiexzf.f5808Ujhhgtgfeyxiexzf;
                if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
                    menuItemC0357Ujhhgtgfeyxiexzf.collapseActionView();
                }
                break;
            default:
                this.f5780Ujhhgtgfeyxiexzf.m43Ujhhgtgfeyxiexzf();
                break;
        }
    }
}
