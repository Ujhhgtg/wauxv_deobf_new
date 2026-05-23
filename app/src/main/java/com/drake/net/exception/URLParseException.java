package com.drake.net.exception;

import p000.AbstractC0981;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class URLParseException extends Exception {
    private String occurred;

    /* JADX WARN: Multi-variable type inference failed */
    public URLParseException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return super.getLocalizedMessage() + this.occurred;
    }

    public final String getOccurred() {
        return this.occurred;
    }

    public final void setOccurred(String str) {
        this.occurred = str;
    }

    public /* synthetic */ URLParseException(String str, Throwable th, int i, AbstractC0981 abstractC0981) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public URLParseException(String str, Throwable th) {
        super(str, th);
        this.occurred = "";
    }
}
