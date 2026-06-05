package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2995feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9310Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f9311Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC2995feyxiexzfUjhhgtg(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f9310Ujhhgtgfeyxiexzf = i;
        this.f9311Ujhhgtgfeyxiexzf = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9310Ujhhgtgfeyxiexzf) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9311Ujhhgtgfeyxiexzf;
                actionBarOverlayLayout.m17Ujhhgtgfeyxiexzf();
                actionBarOverlayLayout.f74Ujhhgtgfeyxiexzf = actionBarOverlayLayout.f57Ujhhgtgfeyxiexzf.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f75Ujhhgtgfeyxiexzf);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9311Ujhhgtgfeyxiexzf;
                actionBarOverlayLayout2.m17Ujhhgtgfeyxiexzf();
                actionBarOverlayLayout2.f74Ujhhgtgfeyxiexzf = actionBarOverlayLayout2.f57Ujhhgtgfeyxiexzf.animate().translationY(-actionBarOverlayLayout2.f57Ujhhgtgfeyxiexzf.getHeight()).setListener(actionBarOverlayLayout2.f75Ujhhgtgfeyxiexzf);
                break;
        }
    }
}
