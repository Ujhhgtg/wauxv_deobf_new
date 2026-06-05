package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0097Ujhhgtgfeyxiexzf implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0253Ujhhgtgfeyxiexzf f1207Ujhhgtgfeyxiexzf;

    public C0097Ujhhgtgfeyxiexzf(AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf) {
        this.f1207Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf = this.f1207Ujhhgtgfeyxiexzf;
        RunnableC0102Ujhhgtgfeyxiexzf runnableC0102Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf.f1600Ujhhgtgfeyxiexzf;
        C2351Ujhhgtgfeyxiexzf c2351Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf;
        if (i != 1 || c2351Ujhhgtgfeyxiexzf.getInputMethodMode() == 2 || c2351Ujhhgtgfeyxiexzf.getContentView() == null) {
            return;
        }
        abstractC0253Ujhhgtgfeyxiexzf.f1604Ujhhgtgfeyxiexzf.removeCallbacks(runnableC0102Ujhhgtgfeyxiexzf);
        runnableC0102Ujhhgtgfeyxiexzf.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
