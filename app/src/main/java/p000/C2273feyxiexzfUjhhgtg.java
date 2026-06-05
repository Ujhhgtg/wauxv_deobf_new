package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛲ要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2273feyxiexzfUjhhgtg extends C2272Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf f7451Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf f7452Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public C0688Ujhhgtgfeyxiexzf f7453Ujhhgtgfeyxiexzf;

    public C2273feyxiexzfUjhhgtg(C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, WindowInsets windowInsets) {
        super(c2256feyxiexzfUjhhgtg, windowInsets);
        this.f7451Ujhhgtgfeyxiexzf = null;
        this.f7452Ujhhgtgfeyxiexzf = null;
        this.f7453Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public C0688Ujhhgtgfeyxiexzf mo3433Ujhhgtgfeyxiexzf() {
        if (this.f7452Ujhhgtgfeyxiexzf == null) {
            this.f7452Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1957Ujhhgtgfeyxiexzf(this.f7440Ujhhgtgfeyxiexzf.getMandatorySystemGestureInsets());
        }
        return this.f7452Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public C0688Ujhhgtgfeyxiexzf mo3435Ujhhgtgfeyxiexzf() {
        if (this.f7451Ujhhgtgfeyxiexzf == null) {
            this.f7451Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1957Ujhhgtgfeyxiexzf(this.f7440Ujhhgtgfeyxiexzf.getSystemGestureInsets());
        }
        return this.f7451Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public C0688Ujhhgtgfeyxiexzf mo3437Ujhhgtgfeyxiexzf() {
        if (this.f7453Ujhhgtgfeyxiexzf == null) {
            this.f7453Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1957Ujhhgtgfeyxiexzf(this.f7440Ujhhgtgfeyxiexzf.getTappableElementInsets());
        }
        return this.f7453Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2270feyxiexzfUjhhgtg, p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public C2256feyxiexzfUjhhgtg mo3439Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        return C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, this.f7440Ujhhgtgfeyxiexzf.inset(i, i2, i3, i4));
    }

    @Override // p000.C2271feyxiexzfUjhhgtg, p000.C2252Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public void mo3445Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf c0688Ujhhgtgfeyxiexzf) {
    }
}
