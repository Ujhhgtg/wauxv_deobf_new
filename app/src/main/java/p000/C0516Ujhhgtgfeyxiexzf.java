package p000;

import android.graphics.Color;
import android.view.View;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸ᛳ能不能ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0516Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0599Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0516Ujhhgtgfeyxiexzf f2460Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2461Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f2462Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2463Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C0504Ujhhgtgfeyxiexzf f2464Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928361645152929162L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928361602203256202L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f2460Ujhhgtgfeyxiexzf = new C0516Ujhhgtgfeyxiexzf("MsgTvColorHook");
        f2461Ujhhgtgfeyxiexzf = "美化";
        f2462Ujhhgtgfeyxiexzf = "消息文本颜色";
        f2463Ujhhgtgfeyxiexzf = "当前仅支持配置微信部分消息文本颜色";
        f2464Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(3);
    }

    @Override // p000.InterfaceC0599Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1535Ujhhgtgfeyxiexzf(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        int color;
        if (mo1424feyxiexzfUjhhgtg()) {
            int type = msgInfoBean.getType();
            if (type == EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7417Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7425Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7426Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf.getClass();
                View viewFindViewById = view.findViewById(C0510Ujhhgtgfeyxiexzf.m1793feyxiexzfUjhhgtg());
                if (viewFindViewById != null) {
                    int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(viewFindViewById).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "setTextColor";
                    C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf);
                    if (AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(viewFindViewById.getContext())) {
                        color = Color.parseColor((!msgInfoBean.isSend() ? C0505Ujhhgtgfeyxiexzf.f2435Ujhhgtgfeyxiexzf : C0507Ujhhgtgfeyxiexzf.f2440Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
                    } else {
                        color = Color.parseColor((!msgInfoBean.isSend() ? C0508Ujhhgtgfeyxiexzf.f2441Ujhhgtgfeyxiexzf : C0515Ujhhgtgfeyxiexzf.f2459Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
                    }
                    c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(Integer.valueOf(color));
                }
            }
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f2463Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f2462Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f2461Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f2464Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
