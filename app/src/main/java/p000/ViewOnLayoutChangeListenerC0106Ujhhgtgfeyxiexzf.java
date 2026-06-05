package p000;

import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ能不能ᛳ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0106Ujhhgtgfeyxiexzf implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1223Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C0113Ujhhgtgfeyxiexzf f1224Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnLayoutChangeListenerC0106Ujhhgtgfeyxiexzf(C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf, int i) {
        this.f1223Ujhhgtgfeyxiexzf = i;
        this.f1224Ujhhgtgfeyxiexzf = c0113Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f1223Ujhhgtgfeyxiexzf) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                this.f1224Ujhhgtgfeyxiexzf.m1175Ujhhgtgfeyxiexzf(false);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf = this.f1224Ujhhgtgfeyxiexzf;
                C0113Ujhhgtgfeyxiexzf.m1169Ujhhgtgfeyxiexzf(c0113Ujhhgtgfeyxiexzf);
                c0113Ujhhgtgfeyxiexzf.m1175Ujhhgtgfeyxiexzf(false);
                break;
        }
    }
}
