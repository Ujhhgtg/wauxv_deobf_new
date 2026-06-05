package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3628feyxiexzfUjhhgtg implements InterfaceC3661feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11341Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f11342Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3628feyxiexzfUjhhgtg(int i, Object obj) {
        this.f11341Ujhhgtgfeyxiexzf = i;
        this.f11342Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC3661feyxiexzfUjhhgtg
    public final void accept(Object obj) {
        switch (this.f11341Ujhhgtgfeyxiexzf) {
            case 0:
                C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf = (C3629Ujhhgtgfeyxiexzf) obj;
                if (c3629Ujhhgtgfeyxiexzf == null) {
                    c3629Ujhhgtgfeyxiexzf = new C3629Ujhhgtgfeyxiexzf(-3);
                }
                ((C2629Ujhhgtgfeyxiexzf) this.f11342Ujhhgtgfeyxiexzf).m3950feyxiexzfUjhhgtg(c3629Ujhhgtgfeyxiexzf);
                return;
            default:
                C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf2 = (C3629Ujhhgtgfeyxiexzf) obj;
                synchronized (AbstractC3630feyxiexzfUjhhgtg.f11347Ujhhgtgfeyxiexzf) {
                    try {
                        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = AbstractC3630feyxiexzfUjhhgtg.f11348Ujhhgtgfeyxiexzf;
                        ArrayList arrayList = (ArrayList) c1044feyxiexzfUjhhgtg.get((String) this.f11342Ujhhgtgfeyxiexzf);
                        if (arrayList == null) {
                            return;
                        }
                        c1044feyxiexzfUjhhgtg.remove((String) this.f11342Ujhhgtgfeyxiexzf);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC3661feyxiexzfUjhhgtg) arrayList.get(i)).accept(c3629Ujhhgtgfeyxiexzf2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
