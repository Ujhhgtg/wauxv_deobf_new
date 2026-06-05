package p000;

import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱ能不能ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0503Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0604Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0503Ujhhgtgfeyxiexzf f2430Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2431Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f2432Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2433Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f2430Ujhhgtgfeyxiexzf = new C0503Ujhhgtgfeyxiexzf("MsgListHideOrShowHook");
        f2431Ujhhgtgfeyxiexzf = "菜单";
        f2432Ujhhgtgfeyxiexzf = "消息列表";
        f2433Ujhhgtgfeyxiexzf = "为主页菜单添加消息列表隐藏或者显示";
    }

    @Override // p000.InterfaceC0604Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List mo1792Ujhhgtgfeyxiexzf() {
        if (!mo1424feyxiexzfUjhhgtg()) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        return AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(new C0592Ujhhgtgfeyxiexzf(R.id.MenuItem_Home_MsgListHide, "列表隐藏", R.drawable.ic_menu_hide_24dp, new C0478Ujhhgtgfeyxiexzf(1)), new C0592Ujhhgtgfeyxiexzf(R.id.MenuItem_Home_MsgListShow, "列表显示", R.drawable.ic_menu_show_24dp, new C0478Ujhhgtgfeyxiexzf(2)));
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f2433Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f2432Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f2431Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
