package com.drake.net.exception;

import p000.InterfaceC3745Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetCancellationExceptionKt {
    public static final NetCancellationException NetCancellationException(InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf, String str) {
        return new NetCancellationException(interfaceC3745Ujhhgtgfeyxiexzf, str);
    }

    public static /* synthetic */ NetCancellationException NetCancellationException$default(InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return NetCancellationException(interfaceC3745Ujhhgtgfeyxiexzf, str);
    }
}
