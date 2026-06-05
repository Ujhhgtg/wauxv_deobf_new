package p000;

import okhttp3.MediaType;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴ要点脸ᛳ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0232Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final MediaType f1553Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final MediaType f1554Ujhhgtgfeyxiexzf;

    static {
        MediaType.Companion companion = MediaType.Companion;
        companion.get("image/*");
        companion.get("image/gif");
        companion.get("image/jpeg");
        companion.get("image/png");
        companion.get("video/mpeg");
        companion.get("text/plain");
        f1553Ujhhgtgfeyxiexzf = companion.get("application/json; charset=utf-8");
        companion.get("application/xml");
        companion.get("text/html");
        f1554Ujhhgtgfeyxiexzf = companion.get("multipart/form-data");
        companion.get("application/octet-stream");
        companion.get("application/x-www-form-urlencoded");
    }
}
