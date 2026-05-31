package p000;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᲈᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2304 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final OkHttpClient m4284(OkHttpClient okHttpClient) {
        List<Interceptor> listInterceptors = okHttpClient.interceptors();
        C2183 c2183 = C2183.f7224;
        return !listInterceptors.contains(c2183) ? okHttpClient.newBuilder().addInterceptor(c2183).build() : okHttpClient;
    }
}
