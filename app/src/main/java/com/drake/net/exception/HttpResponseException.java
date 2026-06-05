package com.drake.net.exception;

import okhttp3.Response;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class HttpResponseException extends NetException {
    private final Response response;

    public /* synthetic */ HttpResponseException(Response response, String str, Throwable th, int i, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(response, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    public Response getResponse() {
        return this.response;
    }

    public HttpResponseException(Response response, String str, Throwable th) {
        super(response.request(), str, th);
        this.response = response;
    }
}
