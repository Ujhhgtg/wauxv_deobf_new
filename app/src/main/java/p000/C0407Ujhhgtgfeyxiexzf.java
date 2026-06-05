package p000;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ要点脸ᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0407Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final WeakHashMap f2191Ujhhgtgfeyxiexzf = new WeakHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String[] f2192Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String[] f2193Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final List f2194Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2195Ujhhgtgfeyxiexzf;

    public C0407Ujhhgtgfeyxiexzf(String str) {
        List listAsList = Arrays.asList(str.split("\\."));
        this.f2194Ujhhgtgfeyxiexzf = listAsList;
        int size = listAsList.size();
        this.f2195Ujhhgtgfeyxiexzf = size;
        this.f2192Ujhhgtgfeyxiexzf = new String[size + 1];
        this.f2193Ujhhgtgfeyxiexzf = new String[size + 1];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0407Ujhhgtgfeyxiexzf m1687Ujhhgtgfeyxiexzf(String str) {
        WeakHashMap weakHashMap = f2191Ujhhgtgfeyxiexzf;
        if (weakHashMap.containsKey(str)) {
            C0407Ujhhgtgfeyxiexzf c0407Ujhhgtgfeyxiexzf = (C0407Ujhhgtgfeyxiexzf) weakHashMap.get(str);
            if (c0407Ujhhgtgfeyxiexzf != null) {
                return c0407Ujhhgtgfeyxiexzf;
            }
            weakHashMap.remove(str);
        }
        C0407Ujhhgtgfeyxiexzf c0407Ujhhgtgfeyxiexzf2 = new C0407Ujhhgtgfeyxiexzf(str);
        weakHashMap.put(str, c0407Ujhhgtgfeyxiexzf2);
        String[] strArr = c0407Ujhhgtgfeyxiexzf2.f2192Ujhhgtgfeyxiexzf;
        int i = c0407Ujhhgtgfeyxiexzf2.f2195Ujhhgtgfeyxiexzf;
        strArr[i] = str;
        String[] strArr2 = c0407Ujhhgtgfeyxiexzf2.f2193Ujhhgtgfeyxiexzf;
        strArr2[i] = str;
        if (i == 1) {
            return c0407Ujhhgtgfeyxiexzf2;
        }
        List list = c0407Ujhhgtgfeyxiexzf2.f2194Ujhhgtgfeyxiexzf;
        strArr[1] = (String) list.get(0);
        strArr2[1] = (String) list.get(i - 1);
        return c0407Ujhhgtgfeyxiexzf2;
    }
}
