package me.hd.wauxv.hook.core.p001native;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObfNative {

    public static final ObfNative f971 = new ObfNative();

    static {
        System.loadLibrary("wauxv-core");
    }

    public final native String get(long j, String[] strArr);
}
