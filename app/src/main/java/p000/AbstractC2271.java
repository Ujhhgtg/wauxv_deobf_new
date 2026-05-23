package p000;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2271 {
    public static final void m4154(OkHttpClient.Builder builder) {
        List<Interceptor> listInterceptors = builder.interceptors();
        C2149 c2149 = C2149.f7100;
        if (listInterceptors.contains(c2149)) {
            return;
        }
        builder.addInterceptor(c2149);
    }
}
