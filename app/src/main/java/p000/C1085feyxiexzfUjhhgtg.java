package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能ᛲ要点脸ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1085feyxiexzfUjhhgtg implements InterfaceC1081feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ScrollFeedbackProvider f4158Ujhhgtgfeyxiexzf;

    public C1085feyxiexzfUjhhgtg(NestedScrollView nestedScrollView) {
        this.f4158Ujhhgtgfeyxiexzf = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p000.InterfaceC1081feyxiexzfUjhhgtg
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f4158Ujhhgtgfeyxiexzf.onScrollLimit(i, i2, i3, z);
    }

    @Override // p000.InterfaceC1081feyxiexzfUjhhgtg
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f4158Ujhhgtgfeyxiexzf.onScrollProgress(i, i2, i3, i4);
    }
}
