package p000;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛴ要点脸ᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1337feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final OkHttpClient m2863Ujhhgtgfeyxiexzf(OkHttpClient okHttpClient) {
        List<Interceptor> listInterceptors = okHttpClient.interceptors();
        C0468Ujhhgtgfeyxiexzf c0468Ujhhgtgfeyxiexzf = C0468Ujhhgtgfeyxiexzf.f2376Ujhhgtgfeyxiexzf;
        return !listInterceptors.contains(c0468Ujhhgtgfeyxiexzf) ? okHttpClient.newBuilder().addInterceptor(c0468Ujhhgtgfeyxiexzf).build() : okHttpClient;
    }
}
