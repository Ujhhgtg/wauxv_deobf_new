package com.drake.net.exception;

import okhttp3.Response;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ServerResponseException extends HttpResponseException {
    private Object tag;

    public /* synthetic */ ServerResponseException(Response response, String str, Throwable th, Object obj, int i, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(response, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : obj);
    }

    public final Object getTag() {
        return this.tag;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public ServerResponseException(Response response, String str, Throwable th, Object obj) {
        super(response, str, th);
        this.tag = obj;
    }
}
