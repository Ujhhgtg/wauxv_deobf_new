package com.drake.net.exception;

import okhttp3.Request;
import p000.AbstractC0981;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkingException extends HttpFailureException {
    public /* synthetic */ NetworkingException(Request request, String str, Throwable th, int i, AbstractC0981 abstractC0981) {
        this(request, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    public NetworkingException(Request request, String str, Throwable th) {
        super(request, str, th);
    }
}
