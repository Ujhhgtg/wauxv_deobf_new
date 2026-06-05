package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ要点脸ᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0101Ujhhgtgfeyxiexzf extends DataSetObserver {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0253Ujhhgtgfeyxiexzf f1210Ujhhgtgfeyxiexzf;

    public C0101Ujhhgtgfeyxiexzf(AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf) {
        this.f1210Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf = this.f1210Ujhhgtgfeyxiexzf;
        if (abstractC0253Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.isShowing()) {
            abstractC0253Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f1210Ujhhgtgfeyxiexzf.dismiss();
    }
}
