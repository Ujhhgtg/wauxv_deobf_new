package p000;

import bsh.Node;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1862Ujhhgtgfeyxiexzf extends C1863Ujhhgtgfeyxiexzf {
    public C1862Ujhhgtgfeyxiexzf(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    @Override // p000.C1863Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C3353Ujhhgtgfeyxiexzf mo2570Ujhhgtgfeyxiexzf(String str, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        String string;
        if (str == null) {
            string = getMessage();
        } else {
            StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(str, ": ");
            sbM4805Ujhhgtgfeyxiexzf.append(getMessage());
            string = sbM4805Ujhhgtgfeyxiexzf.toString();
        }
        return new C1985Ujhhgtgfeyxiexzf(string, getCause(), node, c2637feyxiexzfUjhhgtg, false);
    }
}
