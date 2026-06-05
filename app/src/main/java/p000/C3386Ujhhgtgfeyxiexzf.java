package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3386Ujhhgtgfeyxiexzf extends AbstractC1264feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0425Ujhhgtgfeyxiexzf f10585Ujhhgtgfeyxiexzf;

    public C3386Ujhhgtgfeyxiexzf(C0425Ujhhgtgfeyxiexzf c0425Ujhhgtgfeyxiexzf) {
        this.f10585Ujhhgtgfeyxiexzf = c0425Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1264feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo2816Ujhhgtgfeyxiexzf(Throwable th) {
        ((C3391Ujhhgtgfeyxiexzf) this.f10585Ujhhgtgfeyxiexzf.f2272Ujhhgtgfeyxiexzf).m4910Ujhhgtgfeyxiexzf(th);
    }

    @Override // p000.AbstractC1264feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo2819Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        C0425Ujhhgtgfeyxiexzf c0425Ujhhgtgfeyxiexzf = this.f10585Ujhhgtgfeyxiexzf;
        c0425Ujhhgtgfeyxiexzf.f2274Ujhhgtgfeyxiexzf = c0416Ujhhgtgfeyxiexzf;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf2 = (C0416Ujhhgtgfeyxiexzf) c0425Ujhhgtgfeyxiexzf.f2274Ujhhgtgfeyxiexzf;
        C3391Ujhhgtgfeyxiexzf c3391Ujhhgtgfeyxiexzf = (C3391Ujhhgtgfeyxiexzf) c0425Ujhhgtgfeyxiexzf.f2272Ujhhgtgfeyxiexzf;
        c0425Ujhhgtgfeyxiexzf.f2273Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(c0416Ujhhgtgfeyxiexzf2, c3391Ujhhgtgfeyxiexzf.f10597Ujhhgtgfeyxiexzf, c3391Ujhhgtgfeyxiexzf.f10599Ujhhgtgfeyxiexzf, Build.VERSION.SDK_INT >= 34 ? AbstractC3396feyxiexzfUjhhgtg.m4913Ujhhgtgfeyxiexzf() : AbstractC1265feyxiexzfUjhhgtg.m2825Ujhhgtgfeyxiexzf());
        C3391Ujhhgtgfeyxiexzf c3391Ujhhgtgfeyxiexzf2 = (C3391Ujhhgtgfeyxiexzf) c0425Ujhhgtgfeyxiexzf.f2272Ujhhgtgfeyxiexzf;
        c3391Ujhhgtgfeyxiexzf2.getClass();
        ArrayList arrayList = new ArrayList();
        c3391Ujhhgtgfeyxiexzf2.f10591Ujhhgtgfeyxiexzf.writeLock().lock();
        try {
            c3391Ujhhgtgfeyxiexzf2.f10593Ujhhgtgfeyxiexzf = 1;
            arrayList.addAll(c3391Ujhhgtgfeyxiexzf2.f10592Ujhhgtgfeyxiexzf);
            c3391Ujhhgtgfeyxiexzf2.f10592Ujhhgtgfeyxiexzf.clear();
            c3391Ujhhgtgfeyxiexzf2.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
            c3391Ujhhgtgfeyxiexzf2.f10594Ujhhgtgfeyxiexzf.post(new RunnableC2474feyxiexzfUjhhgtg(arrayList, c3391Ujhhgtgfeyxiexzf2.f10593Ujhhgtgfeyxiexzf, (Throwable) null));
        } catch (Throwable th) {
            c3391Ujhhgtgfeyxiexzf2.f10591Ujhhgtgfeyxiexzf.writeLock().unlock();
            throw th;
        }
    }
}
