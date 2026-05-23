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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2362 implements InterfaceC1425 {

    public final /* synthetic */ int f7585;

    public final /* synthetic */ Map f7586;

    public final /* synthetic */ long f7587;

    public final /* synthetic */ Object f7588;

    public /* synthetic */ C2362(Map map, Object obj, long j, int i) {
        this.f7585 = i;
        this.f7586 = map;
        this.f7588 = obj;
        this.f7587 = j;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f7585) {
            case 0:
                String str = (String) this.f7588;
                C3515 c3515 = (C3515) obj;
                OkHttpClient okHttpClient = c3515.f1765;
                Request.Builder builder = c3515.f1764;
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j = this.f7587;
                builderNewBuilder.connectTimeout(j, TimeUnit.SECONDS);
                builderNewBuilder.readTimeout(j, TimeUnit.SECONDS);
                builderNewBuilder.writeTimeout(j, TimeUnit.SECONDS);
                AbstractC2271.m4154(builderNewBuilder);
                OkHttpClient okHttpClientM4155 = AbstractC2272.m4155(builderNewBuilder.build());
                c3515.f1765 = okHttpClientM4155;
                Cache cache = okHttpClientM4155.cache();
                builder.tag(C1391.class, cache != null ? new C1391(OkHttpUtils.diskLruCache(cache)) : null);
                Map map = this.f7586;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                c3515.m1521(str);
                break;
            default:
                Map map2 = (Map) this.f7588;
                C0438 c0438 = (C0438) obj;
                OkHttpClient okHttpClient2 = c0438.f1765;
                Request.Builder builder2 = c0438.f1764;
                OkHttpClient.Builder builderNewBuilder2 = okHttpClient2.newBuilder();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long j2 = this.f7587;
                builderNewBuilder2.connectTimeout(j2, TimeUnit.SECONDS);
                builderNewBuilder2.readTimeout(j2, TimeUnit.SECONDS);
                builderNewBuilder2.writeTimeout(j2, TimeUnit.SECONDS);
                AbstractC2271.m4154(builderNewBuilder2);
                OkHttpClient okHttpClientM4156 = AbstractC2272.m4155(builderNewBuilder2.build());
                c0438.f1765 = okHttpClientM4156;
                Cache cache2 = okHttpClientM4156.cache();
                builder2.tag(C1391.class, cache2 != null ? new C1391(OkHttpUtils.diskLruCache(cache2)) : null);
                Map map3 = this.f7586;
                if (map3 != null) {
                    for (Map.Entry entry2 : map3.entrySet()) {
                        builder2.addHeader((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                boolean z = false;
                if (map3 != null) {
                    String[] strArr = AbstractC1574.f5469;
                    String str2 = (String) map3.get("Content-Type");
                    if (str2 != null && AbstractC2841.m4828(str2, "application/json", true)) {
                        z = true;
                    }
                }
                if (map2 != null) {
                    if (z) {
                        c0438.f2000 = RequestBody.Companion.create(new JSONObject(map2).toString(), AbstractC1923.f6356);
                    } else {
                        for (Map.Entry entry3 : map2.entrySet()) {
                            String str3 = (String) entry3.getKey();
                            String string = ((String) entry3.getValue()).toString();
                            FormBody.Builder builder3 = c0438.f2002;
                            if (true) {
                                builder3.add(str3, string);
                            }
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
