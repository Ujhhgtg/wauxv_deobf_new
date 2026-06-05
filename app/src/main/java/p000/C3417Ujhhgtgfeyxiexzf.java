package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3417Ujhhgtgfeyxiexzf extends AbstractC0833feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3419Ujhhgtgfeyxiexzf f10643Ujhhgtgfeyxiexzf;

    public C3417Ujhhgtgfeyxiexzf(C3419Ujhhgtgfeyxiexzf c3419Ujhhgtgfeyxiexzf) {
        this.f10643Ujhhgtgfeyxiexzf = c3419Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0833feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo2243Ujhhgtgfeyxiexzf(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C3419Ujhhgtgfeyxiexzf c3419Ujhhgtgfeyxiexzf = this.f10643Ujhhgtgfeyxiexzf;
        int i3 = c3419Ujhhgtgfeyxiexzf.f10648Ujhhgtgfeyxiexzf;
        int iComputeVerticalScrollRange = c3419Ujhhgtgfeyxiexzf.f10666Ujhhgtgfeyxiexzf.computeVerticalScrollRange();
        int i4 = c3419Ujhhgtgfeyxiexzf.f10665Ujhhgtgfeyxiexzf;
        c3419Ujhhgtgfeyxiexzf.f10667Ujhhgtgfeyxiexzf = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c3419Ujhhgtgfeyxiexzf.f10666Ujhhgtgfeyxiexzf.computeHorizontalScrollRange();
        int i5 = c3419Ujhhgtgfeyxiexzf.f10664Ujhhgtgfeyxiexzf;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c3419Ujhhgtgfeyxiexzf.f10668Ujhhgtgfeyxiexzf = z;
        boolean z2 = c3419Ujhhgtgfeyxiexzf.f10667Ujhhgtgfeyxiexzf;
        if (!z2 && !z) {
            if (c3419Ujhhgtgfeyxiexzf.f10669Ujhhgtgfeyxiexzf != 0) {
                c3419Ujhhgtgfeyxiexzf.m4917Ujhhgtgfeyxiexzf(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c3419Ujhhgtgfeyxiexzf.f10659Ujhhgtgfeyxiexzf = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c3419Ujhhgtgfeyxiexzf.f10658Ujhhgtgfeyxiexzf = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c3419Ujhhgtgfeyxiexzf.f10668Ujhhgtgfeyxiexzf) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c3419Ujhhgtgfeyxiexzf.f10662Ujhhgtgfeyxiexzf = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c3419Ujhhgtgfeyxiexzf.f10661Ujhhgtgfeyxiexzf = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c3419Ujhhgtgfeyxiexzf.f10669Ujhhgtgfeyxiexzf;
        if (i6 == 0 || i6 == 1) {
            c3419Ujhhgtgfeyxiexzf.m4917Ujhhgtgfeyxiexzf(1);
        }
    }
}
