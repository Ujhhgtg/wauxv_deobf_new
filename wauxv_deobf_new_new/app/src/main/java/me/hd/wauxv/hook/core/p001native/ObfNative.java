package me.hd.wauxv.hook.core.p001native;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObfNative {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ObfNative f1036 = new ObfNative();

    static {
        System.loadLibrary("wauxv-core");
    }

    public final native String get(long j, String[] strArr);
}
