package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import p000.AbstractC0580;
import p000.AbstractC0985;
import p000.AbstractC1411;
import p000.AbstractC1412;
import p000.AbstractC1469;
import p000.AbstractC2901;
import p000.AbstractC3528;
import p000.C0348;
import p000.C0480;
import p000.C0481;
import p000.C0516;
import p000.C1191;
import p000.C1194;
import p000.C2530;
import p000.C2531;
import p000.InterfaceC0484;
import p000.InterfaceC0485;
import p000.InterfaceC1761;
import p000.InterfaceC2774;
import p000.InterfaceC2846;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* JADX INFO: compiled from: obf */
    public static final class CacheResponseBody extends ResponseBody {
        private final InterfaceC0485 bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = new C2531(new AbstractC1412(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // p000.AbstractC1412, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public InterfaceC0485 source() {
            return this.bodySource;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(headers.name(i))) {
                    String strValue = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = AbstractC2901.m4875(strValue, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(AbstractC2901.m4882((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C1194.f4329 : treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) throws NoSuchAlgorithmException {
            byte[] bytes = httpUrl.toString().getBytes(AbstractC0580.UTF_8);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes, 0, bytes.length);
            return new C0516(messageDigest.digest()).mo1965();
        }

        public final int readInt$okhttp(InterfaceC0485 interfaceC0485) throws IOException {
            try {
                long jMo1865 = interfaceC0485.mo1865();
                String strMo1877 = interfaceC0485.mo1877();
                if (jMo1865 >= 0 && jMo1865 <= 2147483647L && strMo1877.length() <= 0) {
                    return (int) jMo1865;
                }
                throw new IOException("expected an int but was \"" + jMo1865 + strMo1877 + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            return varyHeaders(response.networkResponse().request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            Set<String> setVaryFields = varyFields(response.headers());
            if (setVaryFields != null && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!AbstractC1469.m3322(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> setVaryFields = varyFields(headers2);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String strName = headers.name(i);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, headers.value(i));
                }
            }
            return builder.build();
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class RealCacheRequest implements CacheRequest {
        private final InterfaceC2774 body;
        private final InterfaceC2774 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;

        public RealCacheRequest(DiskLruCache.Editor editor) {
            this.editor = editor;
            InterfaceC2774 interfaceC2774NewSink = editor.newSink(1);
            this.cacheOut = interfaceC2774NewSink;
            this.body = new AbstractC1411(interfaceC2774NewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // p000.AbstractC1411, p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = Cache.this;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public InterfaceC2774 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    /* JADX INFO: compiled from: obf */
    public static final class AnonymousClass1 implements Iterator<String>, InterfaceC1761 {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        public AnonymousClass1(Cache cache) {
            this.delegate = cache.getCache$okhttp().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = new C2531(next.getSource(0)).mo1867(Long.MAX_VALUE);
                        AbstractC3528.m5090(next, null);
                        return true;
                    } catch (Throwable th) {
                        try {
                            continue;
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3528.m5090(next, th);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()");
            }
            this.delegate.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m921deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) throws NoSuchAlgorithmException {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editorEdit$default;
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC1469.m3322(strMethod, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(Request request) {
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        try {
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        DiskLruCache.Editor editorEdit;
        Entry entry = new Entry(response2);
        try {
            editorEdit = ((CacheResponseBody) response.body()).getSnapshot().edit();
            if (editorEdit == null) {
                return;
            }
            try {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            } catch (IOException unused) {
                abortQuietly(editorEdit);
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    public final Iterator<String> urls() {
        return new AnonymousClass1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    /* JADX INFO: compiled from: obf */
    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        /* JADX INFO: compiled from: obf */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
                this();
            }

            private Companion() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(InterfaceC2846 interfaceC2846) throws IOException {
            try {
                C2531 c2531 = new C2531(interfaceC2846);
                String strMo1867 = c2531.mo1867(Long.MAX_VALUE);
                HttpUrl httpUrl = HttpUrl.Companion.parse(strMo1867);
                if (httpUrl == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strMo1867));
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = c2531.mo1867(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(c2531);
                for (int i = 0; i < int$okhttp; i++) {
                    builder.addLenient$okhttp(c2531.mo1867(Long.MAX_VALUE));
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(c2531.mo1867(Long.MAX_VALUE));
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(c2531);
                for (int i2 = 0; i2 < int$okhttp2; i2++) {
                    builder2.addLenient$okhttp(c2531.mo1867(Long.MAX_VALUE));
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String strMo1868 = c2531.mo1867(Long.MAX_VALUE);
                    if (strMo1868.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo1868 + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!c2531.mo1860() ? TlsVersion.Companion.forJavaName(c2531.mo1867(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(c2531.mo1867(Long.MAX_VALUE)), readCertificateList(c2531), readCertificateList(c2531));
                } else {
                    this.handshake = null;
                }
                interfaceC2846.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3528.m5090(interfaceC2846, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return AbstractC1469.m3322(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(InterfaceC0485 interfaceC0485) throws IOException {
            int int$okhttp = Cache.Companion.readInt$okhttp(interfaceC0485);
            if (int$okhttp == -1) {
                return C1191.f4326;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i = 0; i < int$okhttp; i++) {
                    String strMo1877 = interfaceC0485.mo1877();
                    C0481 c0481 = new C0481();
                    C0516 c0516M1601 = C0348.m1601(strMo1877);
                    if (c0516M1601 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c0516M1601.mo1972(c0516M1601.mo1964(), c0481);
                    arrayList.add(certificateFactory.generateCertificate(new C0480(c0481, 0)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(InterfaceC0484 interfaceC0484, List<? extends Certificate> list) throws IOException {
            try {
                interfaceC0484.mo1885(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    interfaceC0484.mo1869(C0348.m1605(it.next().getEncoded()).mo1962()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            return AbstractC1469.m3322(this.url, request.url()) && AbstractC1469.m3322(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            C2530 c2530 = new C2530(editor.newSink(0));
            try {
                c2530.mo1869(this.url.toString());
                c2530.writeByte(10);
                c2530.mo1869(this.requestMethod);
                c2530.writeByte(10);
                c2530.mo1885(this.varyHeaders.size());
                c2530.writeByte(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    c2530.mo1869(this.varyHeaders.name(i));
                    c2530.mo1869(": ");
                    c2530.mo1869(this.varyHeaders.value(i));
                    c2530.writeByte(10);
                }
                c2530.mo1869(new StatusLine(this.protocol, this.code, this.message).toString());
                c2530.writeByte(10);
                c2530.mo1885(this.responseHeaders.size() + 2);
                c2530.writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c2530.mo1869(this.responseHeaders.name(i2));
                    c2530.mo1869(": ");
                    c2530.mo1869(this.responseHeaders.value(i2));
                    c2530.writeByte(10);
                }
                c2530.mo1869(SENT_MILLIS);
                c2530.mo1869(": ");
                c2530.mo1885(this.sentRequestMillis);
                c2530.writeByte(10);
                c2530.mo1869(RECEIVED_MILLIS);
                c2530.mo1869(": ");
                c2530.mo1885(this.receivedResponseMillis);
                c2530.writeByte(10);
                if (isHttps()) {
                    c2530.writeByte(10);
                    c2530.mo1869(this.handshake.cipherSuite().javaName());
                    c2530.writeByte(10);
                    writeCertList(c2530, this.handshake.peerCertificates());
                    writeCertList(c2530, this.handshake.localCertificates());
                    c2530.mo1869(this.handshake.tlsVersion().javaName());
                    c2530.writeByte(10);
                }
                c2530.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3528.m5090(c2530, th);
                    throw th2;
                }
            }
        }

        public Entry(Response response) {
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
