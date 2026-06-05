package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0092Ujhhgtgfeyxiexzf implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0253Ujhhgtgfeyxiexzf f1198Ujhhgtgfeyxiexzf;

    public C0092Ujhhgtgfeyxiexzf(AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf) {
        this.f1198Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf;
        if (i == -1 || (c0363Ujhhgtgfeyxiexzf = this.f1198Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        c0363Ujhhgtgfeyxiexzf.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
