package com.drake.net.exception;

import okhttp3.Request;
import p000.AbstractC0985;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class HttpFailureException extends NetException {
    public /* synthetic */ HttpFailureException(Request request, String str, Throwable th, int i, AbstractC0985 abstractC0985) {
        this(request, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    public HttpFailureException(Request request, String str, Throwable th) {
        super(request, str, th);
    }
}
