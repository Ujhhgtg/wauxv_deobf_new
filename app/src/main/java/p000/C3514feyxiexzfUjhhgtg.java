package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛴᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3514feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final ConcurrentHashMap f10929Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f10930Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f10931Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2496feyxiexzfUjhhgtg f10932Ujhhgtgfeyxiexzf;

    public C3514feyxiexzfUjhhgtg(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("path is empty");
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        this.f10930Ujhhgtgfeyxiexzf = str.endsWith("/") ? str : str.concat("/");
        this.f10931Ujhhgtgfeyxiexzf = str2;
    }
}
