package com.drake.net.exception;

import java.io.IOException;
import okhttp3.Request;
import p000.AbstractC0981;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class NetException extends IOException {
    private String occurred;
    private final Request request;

    public /* synthetic */ NetException(Request request, String str, Throwable th, int i, AbstractC0981 abstractC0981) {
        this(request, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getMessage() == null) {
            str = "";
        } else {
            str = getMessage() + ' ';
        }
        sb.append(str);
        sb.append(getRequest().url());
        sb.append(this.occurred);
        return sb.toString();
    }

    public final String getOccurred() {
        return this.occurred;
    }

    public Request getRequest() {
        return this.request;
    }

    public final void setOccurred(String str) {
        this.occurred = str;
    }

    public NetException(Request request, String str, Throwable th) {
        super(str, th);
        this.request = request;
        this.occurred = "";
    }
}
