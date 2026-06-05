package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱ要点脸ᛴᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2604feyxiexzfUjhhgtg extends HashMap {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3880Ujhhgtgfeyxiexzf(String str) {
        String strM3833Ujhhgtgfeyxiexzf = C2585feyxiexzfUjhhgtg.m3833Ujhhgtgfeyxiexzf(str);
        String str2 = (strM3833Ujhhgtgfeyxiexzf.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM3833Ujhhgtgfeyxiexzf} : C2585feyxiexzfUjhhgtg.f8364Ujhhgtgfeyxiexzf.split(strM3833Ujhhgtgfeyxiexzf))[1];
        if (containsKey(str2)) {
            ((C2600feyxiexzfUjhhgtg) get(str2)).f8404Ujhhgtgfeyxiexzf.add(str);
            return;
        }
        C2600feyxiexzfUjhhgtg c2600feyxiexzfUjhhgtg = new C2600feyxiexzfUjhhgtg();
        ArrayList arrayList = new ArrayList();
        c2600feyxiexzfUjhhgtg.f8404Ujhhgtgfeyxiexzf = arrayList;
        arrayList.add(str);
        put(str2, c2600feyxiexzfUjhhgtg);
    }
}
