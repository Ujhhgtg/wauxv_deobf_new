package p000;

import bsh.Node;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1863Ujhhgtgfeyxiexzf extends Exception {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public C3353Ujhhgtgfeyxiexzf mo2569Ujhhgtgfeyxiexzf(Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        return mo2570Ujhhgtgfeyxiexzf(null, node, c2637feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public C3353Ujhhgtgfeyxiexzf mo2570Ujhhgtgfeyxiexzf(String str, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        if (((Boolean) RunnableC0026Ujhhgtgfeyxiexzf.f514Ujhhgtgfeyxiexzf.get()).booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str == null ? "" : str.concat(": "));
        sbM2707Ujhhgtgfeyxiexzf.append(getMessage());
        return new C3353Ujhhgtgfeyxiexzf(sbM2707Ujhhgtgfeyxiexzf.toString(), node, c2637feyxiexzfUjhhgtg, this);
    }
}
