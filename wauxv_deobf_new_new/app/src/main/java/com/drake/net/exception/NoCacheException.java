package com.drake.net.exception;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.Request;
import p000.AbstractC0580;
import p000.AbstractC0985;
import p000.AbstractC1095;
import p000.AbstractC2234;
import p000.C0516;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NoCacheException extends NetException {
    public /* synthetic */ NoCacheException(Request request, String str, Throwable th, int i, AbstractC0985 abstractC0985) {
        this(request, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    @Override // com.drake.net.exception.NetException, java.lang.Throwable
    public String getLocalizedMessage() throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("cacheKey = ");
        Request request = getRequest();
        AbstractC1095.m2807(request.tag(AbstractC2234.class));
        byte[] bytes = (request.method() + request.url()).getBytes(AbstractC0580.UTF_8);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        sb.append(new C0516(messageDigest.digest()).mo1965());
        sb.append(' ');
        sb.append(super.getLocalizedMessage());
        return sb.toString();
    }

    public NoCacheException(Request request, String str, Throwable th) {
        super(request, str, th);
    }
}
