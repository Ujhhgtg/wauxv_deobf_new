package p000;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3359feyxiexzfUjhhgtg extends AbstractC3740feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public long f10506Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f10507Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C2377Ujhhgtgfeyxiexzf f10508Ujhhgtgfeyxiexzf;

    public abstract void shutdown();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final void m4864feyxiexzfUjhhgtg() {
        long j = this.f10506Ujhhgtgfeyxiexzf - JSONWriter.MASK_IGNORE_NON_FIELD_GETTER;
        this.f10506Ujhhgtgfeyxiexzf = j;
        if (j <= 0 && this.f10507Ujhhgtgfeyxiexzf) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public abstract Thread mo3793feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m4865feyxiexzfUjhhgtg(boolean z) {
        this.f10506Ujhhgtgfeyxiexzf = (z ? JSONWriter.MASK_IGNORE_NON_FIELD_GETTER : 1L) + this.f10506Ujhhgtgfeyxiexzf;
        if (z) {
            return;
        }
        this.f10507Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final boolean m4866feyxiexzfUjhhgtg() {
        C2377Ujhhgtgfeyxiexzf c2377Ujhhgtgfeyxiexzf = this.f10508Ujhhgtgfeyxiexzf;
        if (c2377Ujhhgtgfeyxiexzf == null) {
            return false;
        }
        AbstractC3196feyxiexzfUjhhgtg abstractC3196feyxiexzfUjhhgtg = (AbstractC3196feyxiexzfUjhhgtg) (c2377Ujhhgtgfeyxiexzf.isEmpty() ? null : c2377Ujhhgtgfeyxiexzf.removeFirst());
        if (abstractC3196feyxiexzfUjhhgtg == null) {
            return false;
        }
        abstractC3196feyxiexzfUjhhgtg.run();
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ */
    public void mo4652feyxiexzfUjhhgtg(long j, AbstractRunnableC3349Ujhhgtgfeyxiexzf abstractRunnableC3349Ujhhgtgfeyxiexzf) {
        RunnableC3128Ujhhgtgfeyxiexzf.f9719Ujhhgtgfeyxiexzf.m4857feyxiexzfUjhhgtg(j, abstractRunnableC3349Ujhhgtgfeyxiexzf);
    }
}
