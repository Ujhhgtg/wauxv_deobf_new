package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᲇᛸᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2900 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String f9318;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final long f9319;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int f9320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int f9321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final long f9322;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1133 f9323;

    static {
        String property;
        int i = AbstractC2883.f9237;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f9318 = property;
        f9319 = AbstractC2205.m4075("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, 9223372036854775807L);
        int i2 = AbstractC2883.f9237;
        if (i2 < 2) {
            i2 = 2;
        }
        f9320 = AbstractC2205.m4076(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f9321 = AbstractC2205.m4076(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f9322 = TimeUnit.SECONDS.toNanos(AbstractC2205.m4075("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, 9223372036854775807L));
        f9323 = C1133.f4210;
    }
}
