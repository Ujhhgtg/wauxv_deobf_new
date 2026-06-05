package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲ要点脸ᛱUjhhgtgᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2479feyxiexzfUjhhgtg extends AbstractC3643Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8104Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f8105Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2480feyxiexzfUjhhgtg f8106Ujhhgtgfeyxiexzf;

    public int getMargin() {
        return this.f8106Ujhhgtgfeyxiexzf.f8109Ujhhgtgfeyxiexzf;
    }

    public int getType() {
        return this.f8104Ujhhgtgfeyxiexzf;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f8106Ujhhgtgfeyxiexzf.f8108feyxiexzfUjhhgtg = z;
    }

    public void setDpMargin(int i) {
        this.f8106Ujhhgtgfeyxiexzf.f8109Ujhhgtgfeyxiexzf = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f8106Ujhhgtgfeyxiexzf.f8109Ujhhgtgfeyxiexzf = i;
    }

    public void setType(int i) {
        this.f8104Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC3643Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo51Ujhhgtgfeyxiexzf(C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, boolean z) {
        int i = this.f8104Ujhhgtgfeyxiexzf;
        this.f8105Ujhhgtgfeyxiexzf = i;
        if (z) {
            if (i == 5) {
                this.f8105Ujhhgtgfeyxiexzf = 1;
            } else if (i == 6) {
                this.f8105Ujhhgtgfeyxiexzf = 0;
            }
        } else if (i == 5) {
            this.f8105Ujhhgtgfeyxiexzf = 0;
        } else if (i == 6) {
            this.f8105Ujhhgtgfeyxiexzf = 1;
        }
        if (c3655Ujhhgtgfeyxiexzf instanceof C2480feyxiexzfUjhhgtg) {
            ((C2480feyxiexzfUjhhgtg) c3655Ujhhgtgfeyxiexzf).f8107Ujhhgtgfeyxiexzf = this.f8105Ujhhgtgfeyxiexzf;
        }
    }
}
