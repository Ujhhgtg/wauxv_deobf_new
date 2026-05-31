package p000;

import okhttp3.MediaType;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᛸᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1954 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final MediaType f6461;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final MediaType f6462;

    static {
        MediaType.Companion companion = MediaType.Companion;
        companion.get("image/*");
        companion.get("image/gif");
        companion.get("image/jpeg");
        companion.get("image/png");
        companion.get("video/mpeg");
        companion.get("text/plain");
        f6461 = companion.get("application/json; charset=utf-8");
        companion.get("application/xml");
        companion.get("text/html");
        f6462 = companion.get("multipart/form-data");
        companion.get("application/octet-stream");
        companion.get("application/x-www-form-urlencoded");
    }
}
