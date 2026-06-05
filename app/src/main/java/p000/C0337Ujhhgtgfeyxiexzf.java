package p000;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0337Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0599Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0337Ujhhgtgfeyxiexzf f1963Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f1964Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f1965Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f1966Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C0317Ujhhgtgfeyxiexzf f1967Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928358986568172938L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928359081057453450L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928362474081617290L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928362431131944330L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928362525621224842L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f1963Ujhhgtgfeyxiexzf = new C0337Ujhhgtgfeyxiexzf("MsgBgColorHook");
        f1964Ujhhgtgfeyxiexzf = "美化";
        f1965Ujhhgtgfeyxiexzf = "消息背景颜色";
        f1966Ujhhgtgfeyxiexzf = "仅支持配置部分消息, 与背景气泡冲突";
        f1967Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(10);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static void m1536feyxiexzfUjhhgtg(View view, boolean z) {
        int color;
        int color2;
        view.setPadding(32, 20, 32, 20);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = 16;
        marginLayoutParams.rightMargin = 16;
        view.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int iM5234Ujhhgtgfeyxiexzf = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Float.valueOf(1.0f), view.getContext());
        if (AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(view.getContext())) {
            color = Color.parseColor((!z ? C0335Ujhhgtgfeyxiexzf.f1961Ujhhgtgfeyxiexzf : C0339Ujhhgtgfeyxiexzf.f1969Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
        } else {
            color = Color.parseColor((!z ? C0332Ujhhgtgfeyxiexzf.f1950Ujhhgtgfeyxiexzf : C0341Ujhhgtgfeyxiexzf.f1971Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
        }
        gradientDrawable.setStroke(iM5234Ujhhgtgfeyxiexzf, color);
        gradientDrawable.setCornerRadius(AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Float.valueOf(8.0f), view.getContext()));
        if (AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(view.getContext())) {
            color2 = Color.parseColor((!z ? C0336Ujhhgtgfeyxiexzf.f1962Ujhhgtgfeyxiexzf : C0340Ujhhgtgfeyxiexzf.f1970Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
        } else {
            color2 = Color.parseColor((!z ? C0331Ujhhgtgfeyxiexzf.f1949Ujhhgtgfeyxiexzf : C0342Ujhhgtgfeyxiexzf.f1972Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
        }
        gradientDrawable.setColor(color2);
        view.setBackground(gradientDrawable);
    }

    @Override // p000.InterfaceC0599Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1535Ujhhgtgfeyxiexzf(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo1424feyxiexzfUjhhgtg()) {
            int type = msgInfoBean.getType();
            if (type == EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7417Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7425Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7426Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf.getClass();
                View viewFindViewById = view.findViewById(C0510Ujhhgtgfeyxiexzf.m1793feyxiexzfUjhhgtg());
                if (viewFindViewById != null) {
                    m1536feyxiexzfUjhhgtg(viewFindViewById, msgInfoBean.isSend());
                    return;
                }
                return;
            }
            if (type != EnumC2267feyxiexzfUjhhgtg.f7409Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                if (type == EnumC2267feyxiexzfUjhhgtg.f7415Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                    C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf.getClass();
                    C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                    View viewFindViewById2 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0509Ujhhgtgfeyxiexzf.f2442Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1798feyxiexzfUjhhgtg()));
                    if (viewFindViewById2 != null) {
                        m1536feyxiexzfUjhhgtg(viewFindViewById2, msgInfoBean.isSend());
                        return;
                    }
                    return;
                }
                return;
            }
            C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf.getClass();
            C0580Ujhhgtgfeyxiexzf c0580Ujhhgtgfeyxiexzf = C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf;
            c0580Ujhhgtgfeyxiexzf.getClass();
            View viewFindViewById3 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0499Ujhhgtgfeyxiexzf.f2426Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1795feyxiexzfUjhhgtg()));
            if (viewFindViewById3 != null) {
                m1536feyxiexzfUjhhgtg(viewFindViewById3, msgInfoBean.isSend());
            }
            c0580Ujhhgtgfeyxiexzf.getClass();
            View viewFindViewById4 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0502Ujhhgtgfeyxiexzf.f2429Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1796feyxiexzfUjhhgtg()));
            if (viewFindViewById4 != null) {
                m1536feyxiexzfUjhhgtg(viewFindViewById4, msgInfoBean.isSend());
            }
            c0580Ujhhgtgfeyxiexzf.getClass();
            View viewFindViewById5 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0501Ujhhgtgfeyxiexzf.f2428Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1798feyxiexzfUjhhgtg()));
            if (viewFindViewById5 != null) {
                m1536feyxiexzfUjhhgtg(viewFindViewById5, msgInfoBean.isSend());
            }
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f1966Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f1965Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f1964Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f1967Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
