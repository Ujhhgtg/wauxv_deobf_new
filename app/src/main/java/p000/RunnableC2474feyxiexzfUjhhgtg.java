package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2474feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8024Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f8025Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f8026Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC2474feyxiexzfUjhhgtg(int i, int i2, Object obj) {
        this.f8024Ujhhgtgfeyxiexzf = i2;
        this.f8026Ujhhgtgfeyxiexzf = obj;
        this.f8025Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8024Ujhhgtgfeyxiexzf) {
            case 0:
                ((AbstractC2475feyxiexzfUjhhgtg) this.f8026Ujhhgtgfeyxiexzf).f8034Ujhhgtgfeyxiexzf.m5025Ujhhgtgfeyxiexzf(this.f8025Ujhhgtgfeyxiexzf, 4);
                break;
            case 1:
                C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = (C0709Ujhhgtgfeyxiexzf) this.f8026Ujhhgtgfeyxiexzf;
                int i = this.f8025Ujhhgtgfeyxiexzf;
                AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtg = (AbstractC1791feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
                if (abstractC1791feyxiexzfUjhhgtg != null) {
                    abstractC1791feyxiexzfUjhhgtg.mo3167feyxiexzfUjhhgtg(i);
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f8026Ujhhgtgfeyxiexzf;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f8025Ujhhgtgfeyxiexzf == 1) {
                    while (i2 < size) {
                        ((AbstractC3389Ujhhgtgfeyxiexzf) arrayList.get(i2)).mo4784Ujhhgtgfeyxiexzf();
                        i2++;
                    }
                } else {
                    while (i2 < size) {
                        ((AbstractC3389Ujhhgtgfeyxiexzf) arrayList.get(i2)).mo4812Ujhhgtgfeyxiexzf();
                        i2++;
                    }
                }
                break;
            default:
                ((AbstractC0410Ujhhgtgfeyxiexzf) this.f8026Ujhhgtgfeyxiexzf).m1697Ujhhgtgfeyxiexzf(this.f8025Ujhhgtgfeyxiexzf);
                break;
        }
    }

    public RunnableC2474feyxiexzfUjhhgtg(List list, int i, Throwable th) {
        this.f8024Ujhhgtgfeyxiexzf = 2;
        AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(list, "initCallbacks cannot be null");
        this.f8026Ujhhgtgfeyxiexzf = new ArrayList(list);
        this.f8025Ujhhgtgfeyxiexzf = i;
    }

    public RunnableC2474feyxiexzfUjhhgtg(AbstractC2475feyxiexzfUjhhgtg abstractC2475feyxiexzfUjhhgtg) {
        this.f8024Ujhhgtgfeyxiexzf = 0;
        this.f8026Ujhhgtgfeyxiexzf = abstractC2475feyxiexzfUjhhgtg;
        this.f8025Ujhhgtgfeyxiexzf = -1;
    }
}
