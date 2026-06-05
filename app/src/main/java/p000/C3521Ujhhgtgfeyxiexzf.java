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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3521Ujhhgtgfeyxiexzf implements Closeable, Flushable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final DiskLruCache f11004Ujhhgtgfeyxiexzf;

    public C3521Ujhhgtgfeyxiexzf(DiskLruCache diskLruCache) {
        this.f11004Ujhhgtgfeyxiexzf = diskLruCache;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11004Ujhhgtgfeyxiexzf.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f11004Ujhhgtgfeyxiexzf.flush();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Response m5080Ujhhgtgfeyxiexzf(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.f11004Ujhhgtgfeyxiexzf.get(AbstractC3536Ujhhgtgfeyxiexzf.m5085Ujhhgtgfeyxiexzf(request));
            if (snapshot != null) {
                try {
                    C3537Ujhhgtgfeyxiexzf c3537Ujhhgtgfeyxiexzf = new C3537Ujhhgtgfeyxiexzf(snapshot.getSource(0));
                    RequestBody requestBodyBody = request.body();
                    Headers headers = c3537Ujhhgtgfeyxiexzf.f11048Ujhhgtgfeyxiexzf;
                    String str = headers.get("Content-Type");
                    String str2 = headers.get("Content-Length");
                    Response.Builder builderReceivedResponseAtMillis = new Response.Builder().request(new Request.Builder().url(c3537Ujhhgtgfeyxiexzf.f11042Ujhhgtgfeyxiexzf).method(c3537Ujhhgtgfeyxiexzf.f11044Ujhhgtgfeyxiexzf, requestBodyBody).headers(c3537Ujhhgtgfeyxiexzf.f11043Ujhhgtgfeyxiexzf).build()).protocol(c3537Ujhhgtgfeyxiexzf.f11045Ujhhgtgfeyxiexzf).code(c3537Ujhhgtgfeyxiexzf.f11046Ujhhgtgfeyxiexzf).message(c3537Ujhhgtgfeyxiexzf.f11047Ujhhgtgfeyxiexzf).headers(headers).handshake(c3537Ujhhgtgfeyxiexzf.f11049Ujhhgtgfeyxiexzf).sentRequestAtMillis(c3537Ujhhgtgfeyxiexzf.f11050Ujhhgtgfeyxiexzf).receivedResponseAtMillis(c3537Ujhhgtgfeyxiexzf.f11051Ujhhgtgfeyxiexzf);
                    Response responseBuild = builderReceivedResponseAtMillis.cacheResponse(builderReceivedResponseAtMillis.build()).body(new C3535Ujhhgtgfeyxiexzf(snapshot, str, str2)).build();
                    if (request.tag(AbstractC1265feyxiexzfUjhhgtg.class) == null) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Response m5081Ujhhgtgfeyxiexzf(Response response) {
        DiskLruCache.Editor editorEdit$default;
        C3539Ujhhgtgfeyxiexzf c3539Ujhhgtgfeyxiexzf;
        if (response.isSuccessful()) {
            C3537Ujhhgtgfeyxiexzf c3537Ujhhgtgfeyxiexzf = new C3537Ujhhgtgfeyxiexzf(response);
            try {
                editorEdit$default = DiskLruCache.edit$default(this.f11004Ujhhgtgfeyxiexzf, AbstractC3536Ujhhgtgfeyxiexzf.m5085Ujhhgtgfeyxiexzf(response.request()), 0L, 2, null);
                if (editorEdit$default != null) {
                    try {
                        c3537Ujhhgtgfeyxiexzf.m5089Ujhhgtgfeyxiexzf(editorEdit$default);
                        c3539Ujhhgtgfeyxiexzf = new C3539Ujhhgtgfeyxiexzf(this, editorEdit$default);
                    } catch (IOException unused) {
                        if (editorEdit$default != null) {
                            try {
                                editorEdit$default.abort();
                            } catch (IOException unused2) {
                            }
                        }
                        c3539Ujhhgtgfeyxiexzf = null;
                    }
                    if (c3539Ujhhgtgfeyxiexzf != null) {
                        C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg = new C0806feyxiexzfUjhhgtg(c3539Ujhhgtgfeyxiexzf.f11056Ujhhgtgfeyxiexzf);
                        ResponseBody responseBodyBody = response.body();
                        if (responseBodyBody != null) {
                            return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), responseBodyBody.contentLength(), new C0789feyxiexzfUjhhgtg(new C3540Ujhhgtgfeyxiexzf(responseBodyBody.source(), c3539Ujhhgtgfeyxiexzf, c0806feyxiexzfUjhhgtg)))).build();
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
