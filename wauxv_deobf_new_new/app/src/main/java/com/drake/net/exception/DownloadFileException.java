package com.drake.net.exception;

import okhttp3.Response;
import p000.AbstractC0985;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class DownloadFileException extends HttpResponseException {
    private Object tag;

    public /* synthetic */ DownloadFileException(Response response, String str, Throwable th, Object obj, int i, AbstractC0985 abstractC0985) {
        this(response, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : obj);
    }

    public final Object getTag() {
        return this.tag;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public DownloadFileException(Response response, String str, Throwable th, Object obj) {
        super(response, str, th);
        this.tag = obj;
    }
}
