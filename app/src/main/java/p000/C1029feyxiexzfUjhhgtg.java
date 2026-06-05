package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ能不能要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1029feyxiexzfUjhhgtg implements InterfaceC2883feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C1030feyxiexzfUjhhgtg f4027Ujhhgtgfeyxiexzf;

    public C1029feyxiexzfUjhhgtg(C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtg) {
        this.f4027Ujhhgtgfeyxiexzf = c1030feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC2883feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo2375Ujhhgtgfeyxiexzf(boolean z) {
        ArrayList arrayList;
        AbstractC1860Ujhhgtgfeyxiexzf.m3192Ujhhgtgfeyxiexzf();
        synchronized (this.f4027Ujhhgtgfeyxiexzf) {
            arrayList = new ArrayList((HashSet) this.f4027Ujhhgtgfeyxiexzf.f4032Ujhhgtgfeyxiexzf);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC2883feyxiexzfUjhhgtg) it.next()).mo2375Ujhhgtgfeyxiexzf(z);
        }
    }
}
