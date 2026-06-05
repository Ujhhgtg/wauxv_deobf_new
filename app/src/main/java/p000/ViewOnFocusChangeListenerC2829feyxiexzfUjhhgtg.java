package p000;

import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC2829feyxiexzfUjhhgtg implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8990Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3336feyxiexzfUjhhgtg f8991Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnFocusChangeListenerC2829feyxiexzfUjhhgtg(AbstractC3336feyxiexzfUjhhgtg abstractC3336feyxiexzfUjhhgtg, int i) {
        this.f8990Ujhhgtgfeyxiexzf = i;
        this.f8991Ujhhgtgfeyxiexzf = abstractC3336feyxiexzfUjhhgtg;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f8990Ujhhgtgfeyxiexzf) {
            case 0:
                C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg = (C2834feyxiexzfUjhhgtg) this.f8991Ujhhgtgfeyxiexzf;
                c2834feyxiexzfUjhhgtg.m4163Ujhhgtgfeyxiexzf(c2834feyxiexzfUjhhgtg.m4164Ujhhgtgfeyxiexzf());
                break;
            default:
                C3245feyxiexzfUjhhgtg c3245feyxiexzfUjhhgtg = (C3245feyxiexzfUjhhgtg) this.f8991Ujhhgtgfeyxiexzf;
                c3245feyxiexzfUjhhgtg.f10177Ujhhgtgfeyxiexzf = z;
                c3245feyxiexzfUjhhgtg.m4840Ujhhgtgfeyxiexzf();
                if (!z) {
                    c3245feyxiexzfUjhhgtg.m4745Ujhhgtgfeyxiexzf(false);
                    c3245feyxiexzfUjhhgtg.f10178Ujhhgtgfeyxiexzf = false;
                }
                break;
        }
    }
}
