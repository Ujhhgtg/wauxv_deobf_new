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
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import p000.AbstractC1152feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.AbstractC3530Ujhhgtgfeyxiexzf;
import p000.AbstractC3534Ujhhgtgfeyxiexzf;
import p000.C0789feyxiexzfUjhhgtg;
import p000.C0806feyxiexzfUjhhgtg;
import p000.C2466feyxiexzfUjhhgtg;
import p000.C2597feyxiexzfUjhhgtg;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.C3310feyxiexzfUjhhgtg;
import p000.C3312feyxiexzfUjhhgtg;
import p000.InterfaceC0140Ujhhgtgfeyxiexzf;
import p000.InterfaceC1026feyxiexzfUjhhgtg;
import p000.InterfaceC1227feyxiexzfUjhhgtg;
import p000.InterfaceC2595feyxiexzfUjhhgtg;
import p000.InterfaceC2596feyxiexzfUjhhgtg;

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
        private final InterfaceC2595feyxiexzfUjhhgtg bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = new C0789feyxiexzfUjhhgtg(new AbstractC3530Ujhhgtgfeyxiexzf(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // p000.AbstractC3530Ujhhgtgfeyxiexzf, java.io.Closeable, java.lang.AutoCloseable
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
        public InterfaceC2595feyxiexzfUjhhgtg source() {
            return this.bodySource;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
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
                    Iterator it = AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf(strValue, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C3310feyxiexzfUjhhgtg.f10347Ujhhgtgfeyxiexzf : treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) throws NoSuchAlgorithmException {
            byte[] bytes = httpUrl.toString().getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes, 0, bytes.length);
            return new C2633Ujhhgtgfeyxiexzf(messageDigest.digest()).mo2579Ujhhgtgfeyxiexzf();
        }

        public final int readInt$okhttp(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) throws IOException {
            try {
                long jMo2111Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtg.mo2111Ujhhgtgfeyxiexzf();
                String strMo2116Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtg.mo2116Ujhhgtgfeyxiexzf();
                if (jMo2111Ujhhgtgfeyxiexzf >= 0 && jMo2111Ujhhgtgfeyxiexzf <= 2147483647L && strMo2116Ujhhgtgfeyxiexzf.length() <= 0) {
                    return (int) jMo2111Ujhhgtgfeyxiexzf;
                }
                throw new IOException("expected an int but was \"" + jMo2111Ujhhgtgfeyxiexzf + strMo2116Ujhhgtgfeyxiexzf + '\"');
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
                if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(headers.values(str), request.headers(str))) {
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
        private final InterfaceC1026feyxiexzfUjhhgtg body;
        private final InterfaceC1026feyxiexzfUjhhgtg cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;

        public RealCacheRequest(DiskLruCache.Editor editor) {
            this.editor = editor;
            InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtgNewSink = editor.newSink(1);
            this.cacheOut = interfaceC1026feyxiexzfUjhhgtgNewSink;
            this.body = new AbstractC3534Ujhhgtgfeyxiexzf(interfaceC1026feyxiexzfUjhhgtgNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // p000.AbstractC3534Ujhhgtgfeyxiexzf, p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
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
        public InterfaceC1026feyxiexzfUjhhgtg body() {
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
    public static final class AnonymousClass1 implements Iterator<String>, InterfaceC0140Ujhhgtgfeyxiexzf {
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
                        this.nextUrl = new C0789feyxiexzfUjhhgtg(next.getSource(0)).mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
                        AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(next, null);
                        return true;
                    } catch (Throwable th) {
                        try {
                            continue;
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(next, th);
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
    public final File m922deprecated_directory() {
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
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(strMethod, "GET")) {
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
            public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
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

        public Entry(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) throws IOException {
            try {
                C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = new C0789feyxiexzfUjhhgtg(interfaceC1227feyxiexzfUjhhgtg);
                String strMo2112Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
                HttpUrl httpUrl = HttpUrl.Companion.parse(strMo2112Ujhhgtgfeyxiexzf);
                if (httpUrl == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strMo2112Ujhhgtgfeyxiexzf));
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(c0789feyxiexzfUjhhgtg);
                for (int i = 0; i < int$okhttp; i++) {
                    builder.addLenient$okhttp(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE));
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE));
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(c0789feyxiexzfUjhhgtg);
                for (int i2 = 0; i2 < int$okhttp2; i2++) {
                    builder2.addLenient$okhttp(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE));
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
                    String strMo2112Ujhhgtgfeyxiexzf2 = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
                    if (strMo2112Ujhhgtgfeyxiexzf2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo2112Ujhhgtgfeyxiexzf2 + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!c0789feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf() ? TlsVersion.Companion.forJavaName(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE)), readCertificateList(c0789feyxiexzfUjhhgtg), readCertificateList(c0789feyxiexzfUjhhgtg));
                } else {
                    this.handshake = null;
                }
                interfaceC1227feyxiexzfUjhhgtg.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(interfaceC1227feyxiexzfUjhhgtg, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) throws IOException {
            int int$okhttp = Cache.Companion.readInt$okhttp(interfaceC2595feyxiexzfUjhhgtg);
            if (int$okhttp == -1) {
                return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i = 0; i < int$okhttp; i++) {
                    String strMo2116Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtg.mo2116Ujhhgtgfeyxiexzf();
                    C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
                    C2633Ujhhgtgfeyxiexzf c2633UjhhgtgfeyxiexzfM3698Ujhhgtgfeyxiexzf = C2466feyxiexzfUjhhgtg.m3698Ujhhgtgfeyxiexzf(strMo2116Ujhhgtgfeyxiexzf);
                    if (c2633UjhhgtgfeyxiexzfM3698Ujhhgtgfeyxiexzf == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c2633UjhhgtgfeyxiexzfM3698Ujhhgtgfeyxiexzf.mo2585Ujhhgtgfeyxiexzf(c2633UjhhgtgfeyxiexzfM3698Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), c2598feyxiexzfUjhhgtg);
                    arrayList.add(certificateFactory.generateCertificate(new C2597feyxiexzfUjhhgtg(c2598feyxiexzfUjhhgtg, 0)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg, List<? extends Certificate> list) throws IOException {
            try {
                interfaceC2596feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    interfaceC2596feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(C2466feyxiexzfUjhhgtg.m3702feyxiexzfUjhhgtg(it.next().getEncoded()).mo2576Ujhhgtgfeyxiexzf()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.url, request.url()) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg = new C0806feyxiexzfUjhhgtg(editor.newSink(0));
            try {
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.url.toString());
                c0806feyxiexzfUjhhgtg.writeByte(10);
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.requestMethod);
                c0806feyxiexzfUjhhgtg.writeByte(10);
                c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(this.varyHeaders.size());
                c0806feyxiexzfUjhhgtg.writeByte(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.varyHeaders.name(i));
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.varyHeaders.value(i));
                    c0806feyxiexzfUjhhgtg.writeByte(10);
                }
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(new StatusLine(this.protocol, this.code, this.message).toString());
                c0806feyxiexzfUjhhgtg.writeByte(10);
                c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(this.responseHeaders.size() + 2);
                c0806feyxiexzfUjhhgtg.writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.responseHeaders.name(i2));
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.responseHeaders.value(i2));
                    c0806feyxiexzfUjhhgtg.writeByte(10);
                }
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(SENT_MILLIS);
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
                c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(this.sentRequestMillis);
                c0806feyxiexzfUjhhgtg.writeByte(10);
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(RECEIVED_MILLIS);
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
                c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(this.receivedResponseMillis);
                c0806feyxiexzfUjhhgtg.writeByte(10);
                if (isHttps()) {
                    c0806feyxiexzfUjhhgtg.writeByte(10);
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.handshake.cipherSuite().javaName());
                    c0806feyxiexzfUjhhgtg.writeByte(10);
                    writeCertList(c0806feyxiexzfUjhhgtg, this.handshake.peerCertificates());
                    writeCertList(c0806feyxiexzfUjhhgtg, this.handshake.localCertificates());
                    c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.handshake.tlsVersion().javaName());
                    c0806feyxiexzfUjhhgtg.writeByte(10);
                }
                c0806feyxiexzfUjhhgtg.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(c0806feyxiexzfUjhhgtg, th);
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
