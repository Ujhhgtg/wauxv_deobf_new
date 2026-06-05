package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛲ要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2271feyxiexzfUjhhgtg extends AbstractC2270feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf f7450Ujhhgtgfeyxiexzf;

    public C2271feyxiexzfUjhhgtg(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, WindowInsets windowInsets) {
        super(c2256feyxiexzfUjhhgtg, windowInsets);
        this.f7450Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public C2256feyxiexzfUjhhgtg mo3427Ujhhgtgfeyxiexzf() {
        return C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, this.f7440Ujhhgtgfeyxiexzf.consumeStableInsets());
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public C2256feyxiexzfUjhhgtg mo3428Ujhhgtgfeyxiexzf() {
        return C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, this.f7440Ujhhgtgfeyxiexzf.consumeSystemWindowInsets());
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final C0688Ujhhgtgfeyxiexzf mo3434Ujhhgtgfeyxiexzf() {
        if (this.f7450Ujhhgtgfeyxiexzf == null) {
            WindowInsets windowInsets = this.f7440Ujhhgtgfeyxiexzf;
            this.f7450Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f7450Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public boolean mo3440Ujhhgtgfeyxiexzf() {
        return this.f7440Ujhhgtgfeyxiexzf.isConsumed();
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public void mo3445Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf) {
        this.f7450Ujhhgtgfeyxiexzf = c0688Ujhhgtgfeyxiexzf;
    }
}
