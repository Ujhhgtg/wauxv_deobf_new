package p000;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛴ要点脸ᛳᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1336feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final void m2862Ujhhgtgfeyxiexzf(OkHttpClient.Builder builder) {
        List<Interceptor> listInterceptors = builder.interceptors();
        C0468Ujhhgtgfeyxiexzf c0468Ujhhgtgfeyxiexzf = C0468Ujhhgtgfeyxiexzf.f2376Ujhhgtgfeyxiexzf;
        if (listInterceptors.contains(c0468Ujhhgtgfeyxiexzf)) {
            return;
        }
        builder.addInterceptor(c0468Ujhhgtgfeyxiexzf);
    }
}
