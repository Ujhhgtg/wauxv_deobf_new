package com.drake.net.exception;

import okhttp3.Response;
import p000.AbstractC0981;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RequestParamsException extends HttpResponseException {
    private Object tag;

    public /* synthetic */ RequestParamsException(Response response, String str, Throwable th, Object obj, int i, AbstractC0981 abstractC0981) {
        this(response, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : obj);
    }

    public final Object getTag() {
        return this.tag;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public RequestParamsException(Response response, String str, Throwable th, Object obj) {
        super(response, str, th);
        this.tag = obj;
    }
}
