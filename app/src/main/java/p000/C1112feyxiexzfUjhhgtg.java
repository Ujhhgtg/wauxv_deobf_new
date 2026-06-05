package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸ᛴᛲᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1112feyxiexzfUjhhgtg extends AbstractC0833feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C1019feyxiexzfUjhhgtg f4211Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f4212Ujhhgtgfeyxiexzf;

    public C1112feyxiexzfUjhhgtg(C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg, int i) {
        this.f4211Ujhhgtgfeyxiexzf = c1019feyxiexzfUjhhgtg;
        this.f4212Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC0833feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo2242Ujhhgtgfeyxiexzf(RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        int i2 = this.f4212Ujhhgtgfeyxiexzf;
        if (recyclerView.m228feyxiexzfUjhhgtg(i2) == null) {
            return;
        }
        recyclerView.postDelayed(new RunnableC3262feyxiexzfUjhhgtg(recyclerView, i2, this.f4211Ujhhgtgfeyxiexzf, 1), 150L);
        ArrayList arrayList = recyclerView.f414feyxiexzfUjhhgtg;
        if (arrayList != null) {
            arrayList.remove(this);
        }
    }
}
