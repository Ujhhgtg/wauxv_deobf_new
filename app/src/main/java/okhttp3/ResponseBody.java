package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C1943Ujhhgtgfeyxiexzf;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.InterfaceC2595feyxiexzfUjhhgtg;
import p000.InterfaceC3549feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* JADX INFO: compiled from: obf */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final InterfaceC2595feyxiexzfUjhhgtg source;

        public BomAwareReader(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, Charset charset) {
            this.source = interfaceC2595feyxiexzfUjhhgtg;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            } else {
                c1943Ujhhgtgfeyxiexzf = null;
            }
            if (c1943Ujhhgtgfeyxiexzf == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.mo2120feyxiexzfUjhhgtg(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            Charset charset = AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
            c2598feyxiexzfUjhhgtg.m3875feyxiexzfUjhhgtg(str, 0, str.length(), charset);
            return create(c2598feyxiexzfUjhhgtg, mediaType, c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c2633Ujhhgtgfeyxiexzf, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(interfaceC2595feyxiexzfUjhhgtg, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
            c2598feyxiexzfUjhhgtg.write(bArr, 0, bArr.length);
            return create(c2598feyxiexzfUjhhgtg, mediaType, bArr.length);
        }

        public final ResponseBody create(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, MediaType mediaType) {
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
            c2598feyxiexzfUjhhgtg.m3868feyxiexzfUjhhgtg(c2633Ujhhgtgfeyxiexzf);
            return create(c2598feyxiexzfUjhhgtg, mediaType, c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf());
        }

        public final ResponseBody create(final InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, final MediaType mediaType, final long j) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public InterfaceC2595feyxiexzfUjhhgtg source() {
                    return interfaceC2595feyxiexzfUjhhgtg;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
            return create(c2633Ujhhgtgfeyxiexzf, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) {
            return create(interfaceC2595feyxiexzfUjhhgtg, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf)) == null) ? AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf : charset;
    }

    private final <T> T consumeSource(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtgSource = source();
        try {
            T t = (T) interfaceC3549feyxiexzfUjhhgtg.invoke(interfaceC2595feyxiexzfUjhhgtgSource);
            AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(interfaceC2595feyxiexzfUjhhgtgSource, null);
            int iIntValue = ((Number) interfaceC3549feyxiexzfUjhhgtg2.invoke(t)).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return t;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(interfaceC2595feyxiexzfUjhhgtgSource, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, MediaType mediaType, long j) {
        return Companion.create(interfaceC2595feyxiexzfUjhhgtg, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().mo2120feyxiexzfUjhhgtg();
    }

    public final C2633Ujhhgtgfeyxiexzf byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtgSource = source();
        try {
            C2633Ujhhgtgfeyxiexzf c2633UjhhgtgfeyxiexzfMo2114Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtgSource.mo2114Ujhhgtgfeyxiexzf();
            interfaceC2595feyxiexzfUjhhgtgSource.close();
            int iMo2578Ujhhgtgfeyxiexzf = c2633UjhhgtgfeyxiexzfMo2114Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
            if (jContentLength == -1 || jContentLength == iMo2578Ujhhgtgfeyxiexzf) {
                return c2633UjhhgtgfeyxiexzfMo2114Ujhhgtgfeyxiexzf;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iMo2578Ujhhgtgfeyxiexzf + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(interfaceC2595feyxiexzfUjhhgtgSource, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtgSource = source();
        try {
            byte[] bArrMo2107Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtgSource.mo2107Ujhhgtgfeyxiexzf();
            interfaceC2595feyxiexzfUjhhgtgSource.close();
            int length = bArrMo2107Ujhhgtgfeyxiexzf.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrMo2107Ujhhgtgfeyxiexzf;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(interfaceC2595feyxiexzfUjhhgtgSource, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract InterfaceC2595feyxiexzfUjhhgtg source();

    public final String string() throws IOException {
        InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtgSource = source();
        try {
            String string = interfaceC2595feyxiexzfUjhhgtgSource.readString(Util.readBomAsCharset(interfaceC2595feyxiexzfUjhhgtgSource, charset()));
            interfaceC2595feyxiexzfUjhhgtgSource.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(interfaceC2595feyxiexzfUjhhgtgSource, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, MediaType mediaType) {
        return Companion.create(c2633Ujhhgtgfeyxiexzf, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) {
        return Companion.create(mediaType, j, interfaceC2595feyxiexzfUjhhgtg);
    }

    public static final ResponseBody create(MediaType mediaType, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        return Companion.create(mediaType, c2633Ujhhgtgfeyxiexzf);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
