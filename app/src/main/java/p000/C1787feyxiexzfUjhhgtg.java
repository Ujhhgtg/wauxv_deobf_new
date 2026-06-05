package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1787feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final View f6029Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final HashMap f6028Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f6030Ujhhgtgfeyxiexzf = new ArrayList();

    public C1787feyxiexzfUjhhgtg(View view) {
        this.f6029Ujhhgtgfeyxiexzf = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1787feyxiexzfUjhhgtg)) {
            return false;
        }
        C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg = (C1787feyxiexzfUjhhgtg) obj;
        return this.f6029Ujhhgtgfeyxiexzf == c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf && this.f6028Ujhhgtgfeyxiexzf.equals(c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f6028Ujhhgtgfeyxiexzf.hashCode() + (this.f6029Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM4805Ujhhgtgfeyxiexzf.append(this.f6029Ujhhgtgfeyxiexzf);
        sbM4805Ujhhgtgfeyxiexzf.append("\n");
        String strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(sbM4805Ujhhgtgfeyxiexzf.toString(), "    values:");
        HashMap map = this.f6028Ujhhgtgfeyxiexzf;
        for (String str : map.keySet()) {
            strM2703Ujhhgtgfeyxiexzf = strM2703Ujhhgtgfeyxiexzf + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM2703Ujhhgtgfeyxiexzf;
    }
}
