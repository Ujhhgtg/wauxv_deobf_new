package p000;

import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3051Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9436Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C3639Ujhhgtgfeyxiexzf f9437Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3051Ujhhgtgfeyxiexzf(C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf, int i) {
        this.f9436Ujhhgtgfeyxiexzf = i;
        this.f9437Ujhhgtgfeyxiexzf = c3639Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaxRelativeLayout maxRelativeLayout;
        int i = this.f9436Ujhhgtgfeyxiexzf;
        C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf = this.f9437Ujhhgtgfeyxiexzf;
        int i2 = 0;
        switch (i) {
            case 0:
                C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf;
                if (c3082Ujhhgtgfeyxiexzf.f9533feyxiexzfUjhhgtg == null) {
                    c3082Ujhhgtgfeyxiexzf.f9533feyxiexzfUjhhgtg = new C3081Ujhhgtgfeyxiexzf(i2, c3639Ujhhgtgfeyxiexzf);
                }
                C3081Ujhhgtgfeyxiexzf c3081Ujhhgtgfeyxiexzf = c3082Ujhhgtgfeyxiexzf.f9533feyxiexzfUjhhgtg;
                if (c3081Ujhhgtgfeyxiexzf != null) {
                    if (c3081Ujhhgtgfeyxiexzf == null) {
                        c3082Ujhhgtgfeyxiexzf.f9533feyxiexzfUjhhgtg = new C3081Ujhhgtgfeyxiexzf(i2, c3639Ujhhgtgfeyxiexzf);
                    }
                    c3082Ujhhgtgfeyxiexzf.f9533feyxiexzfUjhhgtg.m4548Ujhhgtgfeyxiexzf(c3082Ujhhgtgfeyxiexzf);
                }
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf2 = c3082Ujhhgtgfeyxiexzf.f9527feyxiexzfUjhhgtg;
                if (c3639Ujhhgtgfeyxiexzf2 != null && (maxRelativeLayout = (MaxRelativeLayout) c3639Ujhhgtgfeyxiexzf2.f11370Ujhhgtgfeyxiexzf) != null) {
                    maxRelativeLayout.setVisibility(0);
                }
                c3082Ujhhgtgfeyxiexzf.m906feyxiexzfUjhhgtg(EnumC0044Ujhhgtgfeyxiexzf.f1060Ujhhgtgfeyxiexzf);
                break;
            default:
                C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf2 = (C3082Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf;
                if (c3082Ujhhgtgfeyxiexzf2.f9533feyxiexzfUjhhgtg == null) {
                    c3082Ujhhgtgfeyxiexzf2.f9533feyxiexzfUjhhgtg = new C3081Ujhhgtgfeyxiexzf(i2, c3639Ujhhgtgfeyxiexzf);
                }
                c3082Ujhhgtgfeyxiexzf2.f9533feyxiexzfUjhhgtg.m4547Ujhhgtgfeyxiexzf(c3082Ujhhgtgfeyxiexzf2);
                RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = new RunnableC3012feyxiexzfUjhhgtg(4, this);
                long jM5278Ujhhgtgfeyxiexzf = c3639Ujhhgtgfeyxiexzf.m5278Ujhhgtgfeyxiexzf(null);
                if (jM5278Ujhhgtgfeyxiexzf >= 0) {
                    AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
                    Ujhhgtgfeyxiexzf.m883Ujhhgtgfeyxiexzf().postDelayed(runnableC3012feyxiexzfUjhhgtg, jM5278Ujhhgtgfeyxiexzf);
                    break;
                }
                break;
        }
    }
}
