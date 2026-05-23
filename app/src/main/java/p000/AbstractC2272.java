package p000;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2272 {
    public static final OkHttpClient m4155(OkHttpClient okHttpClient) {
        List<Interceptor> listInterceptors = okHttpClient.interceptors();
        C2149 c2149 = C2149.f7100;
        return !listInterceptors.contains(c2149) ? okHttpClient.newBuilder().addInterceptor(c2149).build() : okHttpClient;
    }
}
