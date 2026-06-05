package p000;

import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2081feyxiexzfUjhhgtg implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ View f6833Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C1980Ujhhgtgfeyxiexzf f6834Ujhhgtgfeyxiexzf;

    public ViewOnLayoutChangeListenerC2081feyxiexzfUjhhgtg(C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf, View view) {
        this.f6834Ujhhgtgfeyxiexzf = c1980Ujhhgtgfeyxiexzf;
        this.f6833Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f6833Ujhhgtgfeyxiexzf;
        if (view2.getVisibility() == 0) {
            this.f6834Ujhhgtgfeyxiexzf.m3313Ujhhgtgfeyxiexzf(view2);
        }
    }
}
