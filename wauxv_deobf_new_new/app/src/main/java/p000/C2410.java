package p000;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2410 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Map f7720;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ long f7721;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7722;

    public /* synthetic */ C2410(Map map, Object obj, long j, int i) {
        this.f7719 = i;
        this.f7720 = map;
        this.f7722 = obj;
        this.f7721 = j;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f7719) {
            case 0:
                String str = (String) this.f7722;
                C3573 c3573 = (C3573) obj;
                OkHttpClient okHttpClient = c3573.f1736;
                Request.Builder builder = c3573.f1735;
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j = this.f7721;
                builderNewBuilder.connectTimeout(j, timeUnit);
                builderNewBuilder.readTimeout(j, timeUnit);
                builderNewBuilder.writeTimeout(j, timeUnit);
                AbstractC2303.m4283(builderNewBuilder);
                OkHttpClient okHttpClientM4284 = AbstractC2304.m4284(builderNewBuilder.build());
                c3573.f1736 = okHttpClientM4284;
                Cache cache = okHttpClientM4284.cache();
                builder.tag(C1399.class, cache != null ? new C1399(OkHttpUtils.diskLruCache(cache)) : null);
                Map map = this.f7720;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                c3573.m1627(str);
                break;
            default:
                Map map2 = (Map) this.f7722;
                C0413 c0413 = (C0413) obj;
                OkHttpClient okHttpClient2 = c0413.f1736;
                Request.Builder builder2 = c0413.f1735;
                OkHttpClient.Builder builderNewBuilder2 = okHttpClient2.newBuilder();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long j2 = this.f7721;
                builderNewBuilder2.connectTimeout(j2, timeUnit2);
                builderNewBuilder2.readTimeout(j2, timeUnit2);
                builderNewBuilder2.writeTimeout(j2, timeUnit2);
                AbstractC2303.m4283(builderNewBuilder2);
                OkHttpClient okHttpClientM4285 = AbstractC2304.m4284(builderNewBuilder2.build());
                c0413.f1736 = okHttpClientM4285;
                Cache cache2 = okHttpClientM4285.cache();
                builder2.tag(C1399.class, cache2 != null ? new C1399(OkHttpUtils.diskLruCache(cache2)) : null);
                Map map3 = this.f7720;
                if (map3 != null) {
                    for (Map.Entry entry2 : map3.entrySet()) {
                        builder2.addHeader((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                boolean z = false;
                if (map3 != null) {
                    String[] strArr = AbstractC1471.f5234;
                    String str2 = (String) map3.get("Content-Type");
                    if (str2 != null && AbstractC2901.m4861(str2, "application/json", true)) {
                        z = true;
                    }
                }
                if (map2 != null) {
                    if (z) {
                        c0413.f1972 = RequestBody.Companion.create(new JSONObject(map2).toString(), AbstractC1954.f6461);
                    } else {
                        for (Map.Entry entry3 : map2.entrySet()) {
                            String str3 = (String) entry3.getKey();
                            String string = ((String) entry3.getValue()).toString();
                            FormBody.Builder builder3 = c0413.f1974;
                            if (string != null) {
                                builder3.add(str3, string);
                            }
                        }
                    }
                }
                break;
        }
        return C3554.UNIT;
    }
}
