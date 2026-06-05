package com.drake.net.exception;

import okhttp3.Request;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetConnectException extends HttpFailureException {
    public /* synthetic */ NetConnectException(Request request, String str, Throwable th, int i, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(request, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    public NetConnectException(Request request, String str, Throwable th) {
        super(request, str, th);
    }
}
