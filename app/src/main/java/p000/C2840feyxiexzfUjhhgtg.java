package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2840feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f9020Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ArrayList f9021Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashSet f9022Ujhhgtgfeyxiexzf = new HashSet();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f9023Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ArrayList f9024Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f9025Ujhhgtgfeyxiexzf = new ArrayList();

    public C2840feyxiexzfUjhhgtg(String str) {
        this.f9020Ujhhgtgfeyxiexzf = str;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m4166Ujhhgtgfeyxiexzf(C2840feyxiexzfUjhhgtg c2840feyxiexzfUjhhgtg, String str, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        if (!c2840feyxiexzfUjhhgtg.f9022Ujhhgtgfeyxiexzf.add(str)) {
            StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("Element with name '", str, "' is already registered in ");
            sbM2419Ujhhgtgfeyxiexzf.append(c2840feyxiexzfUjhhgtg.f9020Ujhhgtgfeyxiexzf);
            throw new IllegalArgumentException(sbM2419Ujhhgtgfeyxiexzf.toString().toString());
        }
        c2840feyxiexzfUjhhgtg.f9021Ujhhgtgfeyxiexzf.add(str);
        c2840feyxiexzfUjhhgtg.f9023Ujhhgtgfeyxiexzf.add(interfaceC1121feyxiexzfUjhhgtg);
        c2840feyxiexzfUjhhgtg.f9024Ujhhgtgfeyxiexzf.add(C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf);
        c2840feyxiexzfUjhhgtg.f9025Ujhhgtgfeyxiexzf.add(false);
    }
}
