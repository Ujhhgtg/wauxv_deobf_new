package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p000.AbstractC0985;
import p000.AbstractC2844;
import p000.AbstractC2901;
import p000.C0481;
import p000.C1413;
import p000.C3459;
import p000.InterfaceC0484;
import p000.InterfaceC0485;
import p000.InterfaceC2774;
import p000.InterfaceC2846;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final InterfaceC0484 sink;
    private final InterfaceC0485 source;
    private int state;
    private Headers trailers;

    /* JADX INFO: compiled from: obf */
    public abstract class AbstractSource implements InterfaceC2846 {
        private boolean closed;
        private final C1413 timeout;

        public AbstractSource() {
            this.timeout = new C1413(Http1ExchangeCodec.this.source.timeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        public final boolean getClosed() {
            return this.closed;
        }

        public final C1413 getTimeout() {
            return this.timeout;
        }

        @Override // p000.InterfaceC2846
        public long read(C0481 c0481, long j) throws IOException {
            try {
                return Http1ExchangeCodec.this.source.read(c0481, j);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // p000.InterfaceC2846
        public C3459 timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class ChunkedSink implements InterfaceC2774 {
        private boolean closed;
        private final C1413 timeout;

        public ChunkedSink() {
            this.timeout = new C1413(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.mo1869("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // p000.InterfaceC2774, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // p000.InterfaceC2774
        public C3459 timeout() {
            return this.timeout;
        }

        @Override // p000.InterfaceC2774
        public void write(C0481 c0481, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.mo1873(j);
            Http1ExchangeCodec.this.sink.mo1869("\r\n");
            Http1ExchangeCodec.this.sink.write(c0481, j);
            Http1ExchangeCodec.this.sink.mo1869("\r\n");
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        public ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() throws ProtocolException {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                Http1ExchangeCodec.this.source.mo1877();
            }
            try {
                this.bytesRemainingInChunk = Http1ExchangeCodec.this.source.mo1886();
                String string = AbstractC2901.m4882(Http1ExchangeCodec.this.source.mo1877()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !string.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                    HttpHeaders.receiveHeaders(Http1ExchangeCodec.this.client.cookieJar(), this.url, Http1ExchangeCodec.this.trailers);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.InterfaceC2846
        public long read(C0481 c0481, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j2 = this.bytesRemainingInChunk;
            if (j2 == 0 || j2 == Http1ExchangeCodec.NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
            }
            long j3 = super.read(c0481, Math.min(j, this.bytesRemainingInChunk));
            if (j3 != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.bytesRemainingInChunk -= j3;
                return j3;
            }
            Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.InterfaceC2846
        public long read(C0481 c0481, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.bytesRemaining;
            if (j2 == 0) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j3 = super.read(c0481, Math.min(j2, j));
            if (j3 == Http1ExchangeCodec.NO_CHUNK_YET) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j4 = this.bytesRemaining - j3;
            this.bytesRemaining = j4;
            if (j4 == 0) {
                responseBodyComplete();
            }
            return j3;
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class KnownLengthSink implements InterfaceC2774 {
        private boolean closed;
        private final C1413 timeout;

        public KnownLengthSink() {
            this.timeout = new C1413(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // p000.InterfaceC2774, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // p000.InterfaceC2774
        public C3459 timeout() {
            return this.timeout;
        }

        @Override // p000.InterfaceC2774
        public void write(C0481 c0481, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(c0481.f2128, 0L, j);
            Http1ExchangeCodec.this.sink.write(c0481, j);
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.InterfaceC2846
        public long read(C0481 c0481, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j2 = super.read(c0481, j);
            if (j2 != Http1ExchangeCodec.NO_CHUNK_YET) {
                return j2;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return Http1ExchangeCodec.NO_CHUNK_YET;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, InterfaceC0485 interfaceC0485, InterfaceC0484 interfaceC0484) {
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = interfaceC0485;
        this.sink = interfaceC0484;
        this.headersReader = new HeadersReader(interfaceC0485);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(C1413 c1413) {
        C3459 c3459 = c1413.f5093;
        c1413.f5093 = C3459.NONE;
        c3459.clearDeadline();
        c3459.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    private final InterfaceC2774 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2846 newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2846 newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2774 newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2846 newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC2774 createRequestBody(Request request, long j) throws ProtocolException {
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC2846 openResponseBodySource(Response response) {
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = Util.headersContentLength(response);
        return jHeadersContentLength != NO_CHUNK_YET ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) throws IOException {
        int i = this.state;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (z && statusLine.code == 100) {
                return null;
            }
            int i2 = statusLine.code;
            if (i2 == 100) {
                this.state = 3;
                return builderHeaders;
            }
            if (102 > i2 || i2 >= 200) {
                this.state = 4;
                return builderHeaders;
            }
            this.state = 3;
            return builderHeaders;
        } catch (EOFException e) {
            throw new IOException(AbstractC2844.m4790("unexpected end of stream on ", getConnection().route().address().url().redact()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        if (HttpHeaders.promisesBody(response)) {
            return isChunked(response) ? NO_CHUNK_YET : Util.headersContentLength(response);
        }
        return 0L;
    }

    public final void skipConnectBody(Response response) {
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == NO_CHUNK_YET) {
            return;
        }
        InterfaceC2846 interfaceC2846NewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(interfaceC2846NewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        interfaceC2846NewFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        Headers headers = this.trailers;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(Headers headers, String str) {
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.mo1869(str).mo1869("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.mo1869(headers.name(i)).mo1869(": ").mo1869(headers.value(i)).mo1869("\r\n");
        }
        this.sink.mo1869("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.INSTANCE.get(request, getConnection().route().proxy().type()));
    }

    private final boolean isChunked(Request request) {
        return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
    }
}
