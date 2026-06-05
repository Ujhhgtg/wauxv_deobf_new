package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3393feyxiexzfUjhhgtg extends AbstractC1264feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1264feyxiexzfUjhhgtg f10604Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f10605Ujhhgtgfeyxiexzf;

    public C3393feyxiexzfUjhhgtg(AbstractC1264feyxiexzfUjhhgtg abstractC1264feyxiexzfUjhhgtg, ThreadPoolExecutor threadPoolExecutor) {
        this.f10604Ujhhgtgfeyxiexzf = abstractC1264feyxiexzfUjhhgtg;
        this.f10605Ujhhgtgfeyxiexzf = threadPoolExecutor;
    }

    @Override // p000.AbstractC1264feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo2816Ujhhgtgfeyxiexzf(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f10605Ujhhgtgfeyxiexzf;
        try {
            this.f10604Ujhhgtgfeyxiexzf.mo2816Ujhhgtgfeyxiexzf(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.AbstractC1264feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo2819Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        ThreadPoolExecutor threadPoolExecutor = this.f10605Ujhhgtgfeyxiexzf;
        try {
            this.f10604Ujhhgtgfeyxiexzf.mo2819Ujhhgtgfeyxiexzf(c0416Ujhhgtgfeyxiexzf);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
