package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3475feyxiexzfUjhhgtg extends AbstractC0699Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3476feyxiexzfUjhhgtg f10802Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ArrayList f10803Ujhhgtgfeyxiexzf;

    public C3475feyxiexzfUjhhgtg(C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg, ArrayList arrayList) {
        this.f10802Ujhhgtgfeyxiexzf = c3476feyxiexzfUjhhgtg;
        this.f10803Ujhhgtgfeyxiexzf = arrayList;
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1986Ujhhgtgfeyxiexzf(RecyclerView recyclerView, AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        super.mo1986Ujhhgtgfeyxiexzf(recyclerView, abstractC0821feyxiexzfUjhhgtg);
        C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf.getClass();
        C3613Ujhhgtgfeyxiexzf.m5252feyxiexzfUjhhgtg(this.f10803Ujhhgtgfeyxiexzf, this.f10802Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo1987Ujhhgtgfeyxiexzf() {
        return AbstractC0699Ujhhgtgfeyxiexzf.m1982Ujhhgtgfeyxiexzf(3);
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final boolean mo1995Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2) {
        int iM2172Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
        int iM2172Ujhhgtgfeyxiexzf2 = abstractC0821feyxiexzfUjhhgtg2.m2172Ujhhgtgfeyxiexzf();
        if (iM2172Ujhhgtgfeyxiexzf == -1 || iM2172Ujhhgtgfeyxiexzf2 == -1 || iM2172Ujhhgtgfeyxiexzf == iM2172Ujhhgtgfeyxiexzf2) {
            return false;
        }
        ArrayList arrayList = this.f10803Ujhhgtgfeyxiexzf;
        arrayList.add(iM2172Ujhhgtgfeyxiexzf2, arrayList.remove(iM2172Ujhhgtgfeyxiexzf));
        this.f10802Ujhhgtgfeyxiexzf.f3111Ujhhgtgfeyxiexzf.m2132Ujhhgtgfeyxiexzf(iM2172Ujhhgtgfeyxiexzf, iM2172Ujhhgtgfeyxiexzf2);
        return true;
    }
}
