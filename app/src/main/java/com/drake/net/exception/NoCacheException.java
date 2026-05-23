package com.drake.net.exception;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.Request;
import p000.AbstractC0599;
import p000.AbstractC0981;
import p000.AbstractC1194;
import p000.AbstractC2201;
import p000.C0539;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NoCacheException extends NetException {
    public /* synthetic */ NoCacheException(Request request, String str, Throwable th, int i, AbstractC0981 abstractC0981) {
        this(request, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    @Override // com.drake.net.exception.NetException, java.lang.Throwable
    public String getLocalizedMessage() throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("cacheKey = ");
        Request request = getRequest();
        AbstractC1194.m2791(request.tag(AbstractC2201.class));
        byte[] bytes = (request.method() + request.url()).getBytes(AbstractC0599.f2413);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        sb.append(new C0539(messageDigest.digest()).mo1871());
        sb.append(' ');
        sb.append(super.getLocalizedMessage());
        return sb.toString();
    }

    public NoCacheException(Request request, String str, Throwable th) {
        super(request, str, th);
    }
}
