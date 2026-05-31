package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p000.AbstractC0580;
import p000.AbstractC0985;
import p000.AbstractC2844;
import p000.AbstractC3528;
import p000.C0481;
import p000.C0516;
import p000.C3554;
import p000.InterfaceC0485;
import p000.InterfaceC1433;

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
        private final InterfaceC0485 source;

        public BomAwareReader(InterfaceC0485 interfaceC0485, Charset charset) {
            this.source = interfaceC0485;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C3554 c3554;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                c3554 = C3554.UNIT;
            } else {
                c3554 = null;
            }
            if (c3554 == null) {
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
                inputStreamReader = new InputStreamReader(this.source.mo1887(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            Charset charset = AbstractC0580.UTF_8;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            C0481 c0481 = new C0481();
            c0481.m1896(str, 0, str.length(), charset);
            return create(c0481, mediaType, c0481.f2128);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C0516 c0516, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c0516, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC0485 interfaceC0485, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(interfaceC0485, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            C0481 c0481 = new C0481();
            c0481.write(bArr, 0, bArr.length);
            return create(c0481, mediaType, bArr.length);
        }

        public final ResponseBody create(C0516 c0516, MediaType mediaType) {
            C0481 c0481 = new C0481();
            c0481.m1889(c0516);
            return create(c0481, mediaType, c0516.mo1964());
        }

        public final ResponseBody create(final InterfaceC0485 interfaceC0485, final MediaType mediaType, final long j) {
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
                public InterfaceC0485 source() {
                    return interfaceC0485;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, C0516 c0516) {
            return create(c0516, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, InterfaceC0485 interfaceC0485) {
            return create(interfaceC0485, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(AbstractC0580.UTF_8)) == null) ? AbstractC0580.UTF_8 : charset;
    }

    private final <T> T consumeSource(InterfaceC1433 interfaceC1433, InterfaceC1433 interfaceC1434) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2844.m4780(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0485 interfaceC0485Source = source();
        try {
            T t = (T) interfaceC1433.invoke(interfaceC0485Source);
            AbstractC3528.m5090(interfaceC0485Source, null);
            int iIntValue = ((Number) interfaceC1434.invoke(t)).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return t;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(interfaceC0485Source, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(InterfaceC0485 interfaceC0485, MediaType mediaType, long j) {
        return Companion.create(interfaceC0485, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().mo1887();
    }

    public final C0516 byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2844.m4780(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0485 interfaceC0485Source = source();
        try {
            C0516 c0516Mo1874 = interfaceC0485Source.mo1874();
            interfaceC0485Source.close();
            int iMo1964 = c0516Mo1874.mo1964();
            if (jContentLength == -1 || jContentLength == iMo1964) {
                return c0516Mo1874;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iMo1964 + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(interfaceC0485Source, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2844.m4780(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0485 interfaceC0485Source = source();
        try {
            byte[] bArrMo1858 = interfaceC0485Source.mo1858();
            interfaceC0485Source.close();
            int length = bArrMo1858.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrMo1858;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(interfaceC0485Source, th);
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

    public abstract InterfaceC0485 source();

    public final String string() throws IOException {
        InterfaceC0485 interfaceC0485Source = source();
        try {
            String string = interfaceC0485Source.readString(Util.readBomAsCharset(interfaceC0485Source, charset()));
            interfaceC0485Source.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(interfaceC0485Source, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(C0516 c0516, MediaType mediaType) {
        return Companion.create(c0516, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, InterfaceC0485 interfaceC0485) {
        return Companion.create(mediaType, j, interfaceC0485);
    }

    public static final ResponseBody create(MediaType mediaType, C0516 c0516) {
        return Companion.create(mediaType, c0516);
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
