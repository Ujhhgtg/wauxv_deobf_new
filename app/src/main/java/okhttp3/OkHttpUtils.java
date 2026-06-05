package okhttp3;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class OkHttpUtils {
    public static Headers.Builder addLenient(Headers.Builder builder, String str) {
        return builder.addLenient$okhttp(str);
    }

    public static DiskLruCache diskLruCache(Cache cache) {
        return cache.getCache$okhttp();
    }

    public static Headers.Builder headers(Request.Builder builder) {
        return builder.getHeaders$okhttp();
    }

    public static Map<Class<?>, Object> tags(Request.Builder builder) {
        return builder.getTags$okhttp();
    }

    public static Map<Class<?>, Object> tags(Request request) throws IllegalAccessException, NoSuchFieldException {
        Map<Class<?>, Object> tags$okhttp = request.getTags$okhttp();
        if (!tags$okhttp.isEmpty()) {
            Field declaredField = tags$okhttp.getClass().getDeclaredField("m");
            declaredField.setAccessible(true);
            return (Map) declaredField.get(tags$okhttp);
        }
        Field declaredField2 = Request.class.getDeclaredField("tags");
        declaredField2.setAccessible(true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        declaredField2.set(request, linkedHashMap);
        return linkedHashMap;
    }
}
