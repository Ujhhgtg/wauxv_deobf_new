package com.umeng.analytics.pro;

import p000.AbstractC2844;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum cb {
    UnKnownCode(5000),
    Timeout(5001),
    NetworkUnavailable(5002),
    SSLException(5003),
    IOException(5004),
    UnKnownHostException(5005),
    HttpError(5006),
    EmptyResponse(5007),
    ErrorResponse(5008),
    ErrorMakeRequestBody(5009);

    private final int k;

    cb(int i) {
        this.k = i;
    }

    private String b() {
        return AbstractC2844.m4785(new StringBuilder("错误码："), this.k, " 错误信息：");
    }

    public String a() {
        if (this == UnKnownCode) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--未知错误--");
        }
        if (this == Timeout) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--连接超时--");
        }
        if (this == NetworkUnavailable) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--网络不可用--");
        }
        if (this == SSLException) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--SSL证书认证失败--");
        }
        if (this == IOException) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--IO异常--");
        }
        if (this == HttpError) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--服务端返回HTTP错误--");
        }
        if (this == EmptyResponse) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--服务端返回数据为空--");
        }
        if (this == ErrorResponse) {
            return AbstractC2844.m4786(new StringBuilder(), b(), "--服务端返回错误数据--");
        }
        return this == ErrorMakeRequestBody ? AbstractC2844.m4786(new StringBuilder(), b(), "--请求报文构建错误--") : "unknown";
    }
}
