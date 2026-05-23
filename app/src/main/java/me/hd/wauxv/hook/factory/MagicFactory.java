package me.hd.wauxv.hook.factory;

import me.hd.wauxv.hook.core.p001native.ObfNative;
import p000.AbstractC2201;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MagicFactory {
    public static final MagicFactory INSTANCE = new MagicFactory();

    private MagicFactory() {
    }

    public static final String get(long j, String[] strArr) {
        return ObfNative.f971.get(j, strArr);
    }

    public static final Class<Object> toAppClass(String str) {
        return AbstractC2201.m3988(str);
    }
}
