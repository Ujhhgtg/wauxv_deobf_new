package p000;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᲁᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2303 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m4283(OkHttpClient.Builder builder) {
        List<Interceptor> listInterceptors = builder.interceptors();
        C2183 c2183 = C2183.f7224;
        if (listInterceptors.contains(c2183)) {
            return;
        }
        builder.addInterceptor(c2183);
    }
}
