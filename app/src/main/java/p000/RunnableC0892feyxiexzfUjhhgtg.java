package p000;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ要点脸ᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0892feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3436Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f3437Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3438Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC0892feyxiexzfUjhhgtg(int i, int i2, Object obj) {
        this.f3436Ujhhgtgfeyxiexzf = i2;
        this.f3438Ujhhgtgfeyxiexzf = obj;
        this.f3437Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3436Ujhhgtgfeyxiexzf) {
            case 0:
                ((AbstractC1791feyxiexzfUjhhgtg) this.f3438Ujhhgtgfeyxiexzf).mo3167feyxiexzfUjhhgtg(this.f3437Ujhhgtgfeyxiexzf);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3438Ujhhgtgfeyxiexzf;
                View view = (View) sideSheetBehavior.f852Ujhhgtgfeyxiexzf.get();
                if (view != null) {
                    sideSheetBehavior.m832Ujhhgtgfeyxiexzf(view, this.f3437Ujhhgtgfeyxiexzf, false);
                }
                break;
        }
    }
}
