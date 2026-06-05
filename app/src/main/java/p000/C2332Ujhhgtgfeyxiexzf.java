package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2332Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0596Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2332Ujhhgtgfeyxiexzf f7617Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f7618Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f7619Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f7620Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final boolean f7621Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f7617Ujhhgtgfeyxiexzf = new C2332Ujhhgtgfeyxiexzf("AppBrandForceShareHook");
        f7618Ujhhgtgfeyxiexzf = "小程序";
        f7619Ujhhgtgfeyxiexzf = "程序强制分享";
        f7620Ujhhgtgfeyxiexzf = "程序强制可转发给朋友或分享到朋友圈";
        f7621Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f7620Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f7619Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f7618Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public final boolean mo1482feyxiexzfUjhhgtg() {
        return f7621Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m3531feyxiexzfUjhhgtg(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, CharSequence charSequence, boolean z) {
        if (mo1424feyxiexzfUjhhgtg() && z) {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            boolean z2 = true;
            boolean z3 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(charSequence, "转发给朋友") || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(charSequence, "分享到朋友圈");
            boolean z4 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(charSequence, "轉發給朋友") || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(charSequence, "分享到朋友圈");
            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(charSequence, "Send to Chat") && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(charSequence, "Share on Moments")) {
                z2 = false;
            }
            if (z3 || z4 || z2) {
                c0578Ujhhgtgfeyxiexzf.getClass();
                new C2501feyxiexzfUjhhgtg(4, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf(Boolean.FALSE);
            }
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
