package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.umeng.commonsdk.debug.UMLogUtils;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ要点脸ᛱUjhhgtgᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0924feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static int m2415Ujhhgtgfeyxiexzf(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static View m2416Ujhhgtgfeyxiexzf(View view, int i, ViewGroup viewGroup, boolean z) {
        return AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(view.getContext()).inflate(i, viewGroup, z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static String m2417Ujhhgtgfeyxiexzf(StringBuilder sb, Integer num, char c) {
        sb.append(num);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static String m2418Ujhhgtgfeyxiexzf(StringBuilder sb, String str) {
        sb.append(UMLogUtils.makeUrl(str));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static StringBuilder m2419Ujhhgtgfeyxiexzf(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m2420Ujhhgtgfeyxiexzf(C1412feyxiexzfUjhhgtg c1412feyxiexzfUjhhgtg, String str, boolean z, int i) {
        c1412feyxiexzfUjhhgtg.m2922Ujhhgtgfeyxiexzf(str, z);
        c1412feyxiexzfUjhhgtg.m2923Ujhhgtgfeyxiexzf(new C2468feyxiexzfUjhhgtg(i, 10));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m2421Ujhhgtgfeyxiexzf(String str, Exception exc, String str2) {
        Log.e(str2, str + exc);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static void m2422Ujhhgtgfeyxiexzf(String str, String str2, Throwable th) {
        Log.e(str2, str + th);
    }
}
