package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3416Ujhhgtgfeyxiexzf extends C0938feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final HashMap f10642Ujhhgtgfeyxiexzf = new HashMap();

    @Override // p000.C0938feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final C0930feyxiexzfUjhhgtg mo2431Ujhhgtgfeyxiexzf(Object obj) {
        return (C0930feyxiexzfUjhhgtg) this.f10642Ujhhgtgfeyxiexzf.get(obj);
    }

    @Override // p000.C0938feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo2432Ujhhgtgfeyxiexzf(Object obj) {
        Object objMo2432Ujhhgtgfeyxiexzf = super.mo2432Ujhhgtgfeyxiexzf(obj);
        this.f10642Ujhhgtgfeyxiexzf.remove(obj);
        return objMo2432Ujhhgtgfeyxiexzf;
    }
}
