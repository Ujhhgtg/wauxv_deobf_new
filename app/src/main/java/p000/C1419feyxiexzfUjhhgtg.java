package p000;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.Cache;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛲᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1419feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4985Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Map f4986Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ long f4987Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f4988Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1419feyxiexzfUjhhgtg(Map map, Object obj, long j, int i) {
        this.f4985Ujhhgtgfeyxiexzf = i;
        this.f4986Ujhhgtgfeyxiexzf = map;
        this.f4988Ujhhgtgfeyxiexzf = obj;
        this.f4987Ujhhgtgfeyxiexzf = j;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        switch (this.f4985Ujhhgtgfeyxiexzf) {
            case 0:
                String str = (String) this.f4988Ujhhgtgfeyxiexzf;
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf = (C1855Ujhhgtgfeyxiexzf) obj;
                OkHttpClient okHttpClient = c1855Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf;
                Request.Builder builder = c1855Ujhhgtgfeyxiexzf.f8005Ujhhgtgfeyxiexzf;
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j = this.f4987Ujhhgtgfeyxiexzf;
                builderNewBuilder.connectTimeout(j, timeUnit);
                builderNewBuilder.readTimeout(j, timeUnit);
                builderNewBuilder.writeTimeout(j, timeUnit);
                AbstractC1336feyxiexzfUjhhgtg.m2862Ujhhgtgfeyxiexzf(builderNewBuilder);
                OkHttpClient okHttpClientM2863Ujhhgtgfeyxiexzf = AbstractC1337feyxiexzfUjhhgtg.m2863Ujhhgtgfeyxiexzf(builderNewBuilder.build());
                c1855Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf = okHttpClientM2863Ujhhgtgfeyxiexzf;
                Cache cache = okHttpClientM2863Ujhhgtgfeyxiexzf.cache();
                builder.tag(C3521Ujhhgtgfeyxiexzf.class, cache != null ? new C3521Ujhhgtgfeyxiexzf(OkHttpUtils.diskLruCache(cache)) : null);
                Map map = this.f4986Ujhhgtgfeyxiexzf;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                c1855Ujhhgtgfeyxiexzf.m3710Ujhhgtgfeyxiexzf(str);
                break;
            default:
                Map map2 = (Map) this.f4988Ujhhgtgfeyxiexzf;
                C2653Ujhhgtgfeyxiexzf c2653Ujhhgtgfeyxiexzf = (C2653Ujhhgtgfeyxiexzf) obj;
                OkHttpClient okHttpClient2 = c2653Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf;
                Request.Builder builder2 = c2653Ujhhgtgfeyxiexzf.f8005Ujhhgtgfeyxiexzf;
                OkHttpClient.Builder builderNewBuilder2 = okHttpClient2.newBuilder();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long j2 = this.f4987Ujhhgtgfeyxiexzf;
                builderNewBuilder2.connectTimeout(j2, timeUnit2);
                builderNewBuilder2.readTimeout(j2, timeUnit2);
                builderNewBuilder2.writeTimeout(j2, timeUnit2);
                AbstractC1336feyxiexzfUjhhgtg.m2862Ujhhgtgfeyxiexzf(builderNewBuilder2);
                OkHttpClient okHttpClientM2863Ujhhgtgfeyxiexzf2 = AbstractC1337feyxiexzfUjhhgtg.m2863Ujhhgtgfeyxiexzf(builderNewBuilder2.build());
                c2653Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf = okHttpClientM2863Ujhhgtgfeyxiexzf2;
                Cache cache2 = okHttpClientM2863Ujhhgtgfeyxiexzf2.cache();
                builder2.tag(C3521Ujhhgtgfeyxiexzf.class, cache2 != null ? new C3521Ujhhgtgfeyxiexzf(OkHttpUtils.diskLruCache(cache2)) : null);
                Map map3 = this.f4986Ujhhgtgfeyxiexzf;
                if (map3 != null) {
                    for (Map.Entry entry2 : map3.entrySet()) {
                        builder2.addHeader((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                boolean z = false;
                if (map3 != null) {
                    String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    String str2 = (String) map3.get("Content-Type");
                    if (str2 != null && AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str2, "application/json", true)) {
                        z = true;
                    }
                }
                if (map2 != null) {
                    if (z) {
                        c2653Ujhhgtgfeyxiexzf.f8512Ujhhgtgfeyxiexzf = RequestBody.Companion.create(new JSONObject(map2).toString(), AbstractC0232Ujhhgtgfeyxiexzf.f1553Ujhhgtgfeyxiexzf);
                    } else {
                        for (Map.Entry entry3 : map2.entrySet()) {
                            String str3 = (String) entry3.getKey();
                            String str4 = (String) entry3.getValue();
                            FormBody.Builder builder3 = c2653Ujhhgtgfeyxiexzf.f8514Ujhhgtgfeyxiexzf;
                            if (str4 != null) {
                                builder3.add(str3, str4);
                            }
                        }
                    }
                }
                break;
        }
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}
