package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴ能不能ᛲᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1064feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0745Ujhhgtgfeyxiexzf, InterfaceC0597Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1064feyxiexzfUjhhgtg f4122Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4123Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4124Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4125Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4122Ujhhgtgfeyxiexzf = new C1064feyxiexzfUjhhgtg("SnsEnhanceHook");
        f4123Ujhhgtgfeyxiexzf = "朋友圈";
        f4124Ujhhgtgfeyxiexzf = "朋友圈增强";
        f4125Ujhhgtgfeyxiexzf = "查看历史撤回以及缓存过的朋友圈内容";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static String m2550feyxiexzfUjhhgtg(String str) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (!AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str, "select *,rowid from SnsInfo", false)) {
            return str;
        }
        if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str, "WHERE SnsInfo.userName=", false)) {
            str = AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(str, "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", "(sourceType in (0,2,8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))"), "(snsId >= ", "(1=1 or snsId >= ");
        }
        return AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(str, "(sourceType & 2 != 0 )", "(1=1)");
    }

    @Override // p000.InterfaceC0597Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo1870Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "clicfg_sns_flutter_self_page")) {
                c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf("0");
            }
        }
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo2083Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String strM2550feyxiexzfUjhhgtg = m2550feyxiexzfUjhhgtg(str);
            if (strM2550feyxiexzfUjhhgtg.equals(str)) {
                return;
            }
            c0578Ujhhgtgfeyxiexzf.getClass();
            new C2501feyxiexzfUjhhgtg(1, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf(strM2550feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final void mo2084Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String strM2550feyxiexzfUjhhgtg = m2550feyxiexzfUjhhgtg(str);
            if (strM2550feyxiexzfUjhhgtg.equals(str)) {
                return;
            }
            c0578Ujhhgtgfeyxiexzf.getClass();
            new C2501feyxiexzfUjhhgtg(0, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf(strM2550feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4125Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4124Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4123Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
