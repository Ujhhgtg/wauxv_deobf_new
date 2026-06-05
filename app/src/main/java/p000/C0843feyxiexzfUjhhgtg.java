package p000;

import android.os.Handler;
import androidx.lifecycle.Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳᛴ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0843feyxiexzfUjhhgtg implements InterfaceC0083Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C0843feyxiexzfUjhhgtg f3318Ujhhgtgfeyxiexzf = new C0843feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f3319Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f3320Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Handler f3323Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f3321Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f3322Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Ujhhgtgfeyxiexzf f3324Ujhhgtgfeyxiexzf = new Ujhhgtgfeyxiexzf(this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final RunnableC2779feyxiexzfUjhhgtg f3325Ujhhgtgfeyxiexzf = new RunnableC2779feyxiexzfUjhhgtg(4, this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0709Ujhhgtgfeyxiexzf f3326Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2247Ujhhgtgfeyxiexzf() {
        int i = this.f3320Ujhhgtgfeyxiexzf + 1;
        this.f3320Ujhhgtgfeyxiexzf = i;
        if (i == 1) {
            if (!this.f3321Ujhhgtgfeyxiexzf) {
                this.f3323Ujhhgtgfeyxiexzf.removeCallbacks(this.f3325Ujhhgtgfeyxiexzf);
            } else {
                this.f3324Ujhhgtgfeyxiexzf.m100Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.ON_RESUME);
                this.f3321Ujhhgtgfeyxiexzf = false;
            }
        }
    }

    @Override // p000.InterfaceC0083Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final Ujhhgtgfeyxiexzf mo895Ujhhgtgfeyxiexzf() {
        return this.f3324Ujhhgtgfeyxiexzf;
    }
}
