package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ能不能要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0813feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f3220Ujhhgtgfeyxiexzf;

    public C0813feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        this.f3220Ujhhgtgfeyxiexzf = recyclerView;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2159Ujhhgtgfeyxiexzf() {
        RecyclerView recyclerView = this.f3220Ujhhgtgfeyxiexzf;
        if (!recyclerView.f376Ujhhgtgfeyxiexzf || !recyclerView.f375Ujhhgtgfeyxiexzf) {
            recyclerView.f383feyxiexzfUjhhgtg = true;
            recyclerView.requestLayout();
        } else {
            RunnableC0786feyxiexzfUjhhgtg runnableC0786feyxiexzfUjhhgtg = recyclerView.f365Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            recyclerView.postOnAnimation(runnableC0786feyxiexzfUjhhgtg);
        }
    }
}
