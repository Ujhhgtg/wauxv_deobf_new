package p000;

import okhttp3.MediaType;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1923 {

    public static final MediaType f6356;

    public static final MediaType f6357;

    static {
        MediaType.Companion companion = MediaType.Companion;
        companion.get("image/*");
        companion.get("image/gif");
        companion.get("image/jpeg");
        companion.get("image/png");
        companion.get("video/mpeg");
        companion.get("text/plain");
        f6356 = companion.get("application/json; charset=utf-8");
        companion.get("application/xml");
        companion.get("text/html");
        f6357 = companion.get("multipart/form-data");
        companion.get("application/octet-stream");
        companion.get("application/x-www-form-urlencoded");
    }
}
