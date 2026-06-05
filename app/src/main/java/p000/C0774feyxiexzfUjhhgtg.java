package p000;

import com.chad.library.adapter4.layoutmanager.QuickGridLayoutManager;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ能不能ᛳᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0774feyxiexzfUjhhgtg extends AbstractC0624Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public AbstractC0624Ujhhgtgfeyxiexzf f3065Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ QuickGridLayoutManager f3066Ujhhgtgfeyxiexzf;

    public C0774feyxiexzfUjhhgtg(QuickGridLayoutManager quickGridLayoutManager) {
        this.f3066Ujhhgtgfeyxiexzf = quickGridLayoutManager;
    }

    @Override // p000.AbstractC0624Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1900Ujhhgtgfeyxiexzf(int i) {
        QuickGridLayoutManager quickGridLayoutManager = this.f3066Ujhhgtgfeyxiexzf;
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = quickGridLayoutManager.f610feyxiexzfUjhhgtg;
        if (abstractC0795feyxiexzfUjhhgtg == null) {
            return 1;
        }
        if (abstractC0795feyxiexzfUjhhgtg instanceof InterfaceC3564feyxiexzfUjhhgtg) {
            return quickGridLayoutManager.f323feyxiexzfUjhhgtg;
        }
        if (!(abstractC0795feyxiexzfUjhhgtg instanceof C3662feyxiexzfUjhhgtg)) {
            AbstractC0624Ujhhgtgfeyxiexzf abstractC0624Ujhhgtgfeyxiexzf = this.f3065Ujhhgtgfeyxiexzf;
            if (abstractC0624Ujhhgtgfeyxiexzf != null) {
                return abstractC0624Ujhhgtgfeyxiexzf.mo1900Ujhhgtgfeyxiexzf(i);
            }
            return 1;
        }
        if (i == R.id.BaseQuickAdapter_empty_view) {
            return quickGridLayoutManager.f323feyxiexzfUjhhgtg;
        }
        AbstractC0624Ujhhgtgfeyxiexzf abstractC0624Ujhhgtgfeyxiexzf2 = this.f3065Ujhhgtgfeyxiexzf;
        if (abstractC0624Ujhhgtgfeyxiexzf2 != null) {
            return abstractC0624Ujhhgtgfeyxiexzf2.mo1900Ujhhgtgfeyxiexzf(i);
        }
        return 1;
    }
}
