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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᛸᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1391 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final DiskLruCache f5012;

    public C1391(DiskLruCache diskLruCache) {
        this.f5012 = diskLruCache;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5012.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f5012.flush();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Response m3102(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.f5012.get(AbstractC1386.m3097(request));
            if (snapshot != null) {
                try {
                    C1387 c1387 = new C1387(snapshot.getSource(0));
                    RequestBody requestBodyBody = request.body();
                    Headers headers = c1387.f4997;
                    String str = headers.get("Content-Type");
                    String str2 = headers.get("Content-Length");
                    Response.Builder builderReceivedResponseAtMillis = new Response.Builder().request(new Request.Builder().url(c1387.f4991).method(c1387.f4993, requestBodyBody).headers(c1387.f4992).build()).protocol(c1387.f4994).code(c1387.f4995).message(c1387.f4996).headers(headers).handshake(c1387.f4998).sentRequestAtMillis(c1387.f4999).receivedResponseAtMillis(c1387.f5000);
                    Response responseBuild = builderReceivedResponseAtMillis.cacheResponse(builderReceivedResponseAtMillis.build()).body(new C1385(snapshot, str, str2)).build();
                    if (request.tag(AbstractC2202.class) == null) {
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
    public final Response m3103(Response response) {
        DiskLruCache.Editor editorEdit$default;
        C1389 c1389;
        if (response.isSuccessful()) {
            C1387 c1387 = new C1387(response);
            try {
                editorEdit$default = DiskLruCache.edit$default(this.f5012, AbstractC1386.m3097(response.request()), 0L, 2, null);
                if (editorEdit$default != null) {
                    try {
                        c1387.m3101(editorEdit$default);
                        c1389 = new C1389(this, editorEdit$default);
                    } catch (IOException unused) {
                        if (editorEdit$default != null) {
                            try {
                                editorEdit$default.abort();
                            } catch (IOException unused2) {
                            }
                        }
                        c1389 = null;
                    }
                    if (c1389 != null) {
                        C2476 c2476 = new C2476(c1389.f5005);
                        ResponseBody responseBodyBody = response.body();
                        if (responseBodyBody != null) {
                            return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), responseBodyBody.contentLength(), new C2477(new C1390(responseBodyBody.source(), c1389, c2476)))).build();
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
