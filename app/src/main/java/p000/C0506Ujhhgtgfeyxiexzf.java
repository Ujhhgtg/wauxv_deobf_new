package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸ᛲᛱfeyxiexzfᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0506Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0617Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0506Ujhhgtgfeyxiexzf f2436Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2437Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f2438Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2439Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f2436Ujhhgtgfeyxiexzf = new C0506Ujhhgtgfeyxiexzf(MagicFactory.get(4928842273468188042L, strArr));
        f2437Ujhhgtgfeyxiexzf = MagicFactory.get(4928841311395513738L, strArr);
        f2438Ujhhgtgfeyxiexzf = MagicFactory.get(4928841298510611850L, strArr);
        f2439Ujhhgtgfeyxiexzf = MagicFactory.get(4928841277035775370L, strArr);
    }

    @Override // p000.InterfaceC0617Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final List mo1791Ujhhgtgfeyxiexzf(MsgInfoBean msgInfoBean) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg()) {
            if (msgInfoBean.isText()) {
                return Collections.singletonList(new C2767Ujhhgtgfeyxiexzf(R.id.MenuItem_Chat_MsgRepeat, MagicFactory.get(4928842213338645898L, strArr), R.drawable.ic_menu_repeat_24dp, new C0221Ujhhgtgfeyxiexzf(15)));
            }
            if (msgInfoBean.isImage()) {
                return Collections.singletonList(new C2767Ujhhgtgfeyxiexzf(R.id.MenuItem_Chat_MsgRepeat, MagicFactory.get(4928842337892697482L, strArr), R.drawable.ic_menu_repeat_24dp, new C0221Ujhhgtgfeyxiexzf(16)));
            }
            if (msgInfoBean.isVoice()) {
                return Collections.singletonList(new C2767Ujhhgtgfeyxiexzf(R.id.MenuItem_Chat_MsgRepeat, MagicFactory.get(4928842325007795594L, strArr), R.drawable.ic_menu_repeat_24dp, new C0221Ujhhgtgfeyxiexzf(17)));
            }
            if (msgInfoBean.isVideo()) {
                return Collections.singletonList(new C2767Ujhhgtgfeyxiexzf(R.id.MenuItem_Chat_MsgRepeat, MagicFactory.get(4928842312122893706L, strArr), R.drawable.ic_menu_repeat_24dp, new C0221Ujhhgtgfeyxiexzf(18)));
            }
            if (msgInfoBean.isEmoji()) {
                return Collections.singletonList(new C2767Ujhhgtgfeyxiexzf(R.id.MenuItem_Chat_MsgRepeat, MagicFactory.get(4928842299237991818L, strArr), R.drawable.ic_menu_repeat_24dp, new C0221Ujhhgtgfeyxiexzf(19)));
            }
            if (msgInfoBean.isQuote()) {
                return Collections.singletonList(new C2767Ujhhgtgfeyxiexzf(R.id.MenuItem_Chat_MsgRepeat, MagicFactory.get(4928842286353089930L, strArr), R.drawable.ic_menu_repeat_24dp, new C0221Ujhhgtgfeyxiexzf(20)));
            }
        }
        return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f2439Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f2438Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f2437Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
