package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ能不能ᛲ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0296Ujhhgtgfeyxiexzf extends C0670Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final List f1748Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f1749Ujhhgtgfeyxiexzf;

    public C0296Ujhhgtgfeyxiexzf(String str, C0296Ujhhgtgfeyxiexzf c0296Ujhhgtgfeyxiexzf, List list, String str2) {
        super(str, c0296Ujhhgtgfeyxiexzf);
        this.f1748Ujhhgtgfeyxiexzf = list;
        this.f1749Ujhhgtgfeyxiexzf = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0296Ujhhgtgfeyxiexzf(String str, ArrayList arrayList) {
        String str2;
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(str2, null, arrayList, str);
    }
}
