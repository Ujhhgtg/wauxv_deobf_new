package com.drake.net.exception;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.Request;
import p000.AbstractC1264feyxiexzfUjhhgtg;
import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NoCacheException extends NetException {
    public /* synthetic */ NoCacheException(Request request, String str, Throwable th, int i, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(request, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    @Override // com.drake.net.exception.NetException, java.lang.Throwable
    public String getLocalizedMessage() throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("cacheKey = ");
        Request request = getRequest();
        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(request.tag(AbstractC1264feyxiexzfUjhhgtg.class));
        byte[] bytes = (request.method() + request.url()).getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        sb.append(new C2633Ujhhgtgfeyxiexzf(messageDigest.digest()).mo2579Ujhhgtgfeyxiexzf());
        sb.append(' ');
        sb.append(super.getLocalizedMessage());
        return sb.toString();
    }

    public NoCacheException(Request request, String str, Throwable th) {
        super(request, str, th);
    }
}
