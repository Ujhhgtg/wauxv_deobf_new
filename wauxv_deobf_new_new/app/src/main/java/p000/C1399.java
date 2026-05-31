package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.RealResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᛸᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1399 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final DiskLruCache f5041;

    public C1399(DiskLruCache diskLruCache) {
        this.f5041 = diskLruCache;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5041.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f5041.flush();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Response m3210(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.f5041.get(AbstractC1394.m3205(request));
            if (snapshot != null) {
                try {
                    C1395 c1395 = new C1395(snapshot.getSource(0));
                    RequestBody requestBodyBody = request.body();
                    Headers headers = c1395.f5026;
                    String str = headers.get("Content-Type");
                    String str2 = headers.get("Content-Length");
                    Response.Builder builderReceivedResponseAtMillis = new Response.Builder().request(new Request.Builder().url(c1395.f5020).method(c1395.f5022, requestBodyBody).headers(c1395.f5021).build()).protocol(c1395.f5023).code(c1395.f5024).message(c1395.f5025).headers(headers).handshake(c1395.f5027).sentRequestAtMillis(c1395.f5028).receivedResponseAtMillis(c1395.f5029);
                    Response responseBuild = builderReceivedResponseAtMillis.cacheResponse(builderReceivedResponseAtMillis.build()).body(new C1393(snapshot, str, str2)).build();
                    if (request.tag(AbstractC2235.class) == null) {
                        return responseBuild.newBuilder().request(request).build();
                    }
                    throw new ClassCastException();
                } catch (IOException unused) {
                    Util.closeQuietly(snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Response m3211(Response response) {
        DiskLruCache.Editor editorEdit$default;
        C1397 c1397;
        if (response.isSuccessful()) {
            C1395 c1395 = new C1395(response);
            try {
                editorEdit$default = DiskLruCache.edit$default(this.f5041, AbstractC1394.m3205(response.request()), 0L, 2, null);
                if (editorEdit$default != null) {
                    try {
                        c1395.m3209(editorEdit$default);
                        c1397 = new C1397(this, editorEdit$default);
                    } catch (IOException unused) {
                        if (editorEdit$default != null) {
                            try {
                                editorEdit$default.abort();
                            } catch (IOException unused2) {
                            }
                        }
                        c1397 = null;
                    }
                    if (c1397 != null) {
                        C2530 c2530 = new C2530(c1397.f5034);
                        ResponseBody responseBodyBody = response.body();
                        if (responseBodyBody != null) {
                            return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), responseBodyBody.contentLength(), new C2531(new C1398(responseBodyBody.source(), c1397, c2530)))).build();
                        }
                    }
                }
            } catch (IOException unused3) {
                editorEdit$default = null;
            }
        }
        return response;
    }
}
