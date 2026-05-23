package com.drake.net.exception;

import p000.InterfaceC0883;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetCancellationExceptionKt {
    public static final NetCancellationException NetCancellationException(InterfaceC0883 interfaceC0883, String str) {
        return new NetCancellationException(interfaceC0883, str);
    }

    public static /* synthetic */ NetCancellationException NetCancellationException$default(InterfaceC0883 interfaceC0883, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return NetCancellationException(interfaceC0883, str);
    }
}
