package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p000.AbstractC0599;
import p000.AbstractC0981;
import p000.AbstractC1458;
import p000.AbstractC2784;
import p000.C0504;
import p000.C0539;
import p000.C3497;
import p000.InterfaceC0508;
import p000.InterfaceC1425;

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
        private final InterfaceC0508 source;

        public BomAwareReader(InterfaceC0508 interfaceC0508, Charset charset) {
            this.source = interfaceC0508;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C3497 c3497;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                c3497 = C3497.f10997;
            } else {
                c3497 = null;
            }
            if (c3497 == null) {
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
                inputStreamReader = new InputStreamReader(this.source.mo1793(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0981 abstractC0981) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            Charset charset = AbstractC0599.f2413;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            C0504 c0504 = new C0504();
            c0504.m1802(str, 0, str.length(), charset);
            return create(c0504, mediaType, c0504.f2172);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C0539 c0539, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c0539, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC0508 interfaceC0508, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(interfaceC0508, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            C0504 c0504 = new C0504();
            c0504.write(bArr, 0, bArr.length);
            return create(c0504, mediaType, bArr.length);
        }

        public final ResponseBody create(C0539 c0539, MediaType mediaType) {
            C0504 c0504 = new C0504();
            c0504.m1795(c0539);
            return create(c0504, mediaType, c0539.mo1870());
        }

        public final ResponseBody create(final InterfaceC0508 interfaceC0508, final MediaType mediaType, final long j) {
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
                public InterfaceC0508 source() {
                    return interfaceC0508;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, C0539 c0539) {
            return create(c0539, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, InterfaceC0508 interfaceC0508) {
            return create(interfaceC0508, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(AbstractC0599.f2413)) == null) ? AbstractC0599.f2413 : charset;
    }

    private final <T> T consumeSource(InterfaceC1425 interfaceC1425, InterfaceC1425 interfaceC1426) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2784.m4746(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0508 interfaceC0508Source = source();
        try {
            T t = (T) interfaceC1425.invoke(interfaceC0508Source);
            AbstractC1458.m3154(interfaceC0508Source, null);
            int iIntValue = ((Number) interfaceC1426.invoke(t)).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return t;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1458.m3154(interfaceC0508Source, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(InterfaceC0508 interfaceC0508, MediaType mediaType, long j) {
        return Companion.create(interfaceC0508, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().mo1793();
    }

    public final C0539 byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2784.m4746(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0508 interfaceC0508Source = source();
        try {
            C0539 c0539Mo1780 = interfaceC0508Source.mo1780();
            interfaceC0508Source.close();
            int iMo1870 = c0539Mo1780.mo1870();
            if (jContentLength == -1 || jContentLength == iMo1870) {
                return c0539Mo1780;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iMo1870 + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1458.m3154(interfaceC0508Source, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2784.m4746(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0508 interfaceC0508Source = source();
        try {
            byte[] bArrMo1764 = interfaceC0508Source.mo1764();
            interfaceC0508Source.close();
            int length = bArrMo1764.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrMo1764;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1458.m3154(interfaceC0508Source, th);
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

    public abstract InterfaceC0508 source();

    public final String string() throws IOException {
        InterfaceC0508 interfaceC0508Source = source();
        try {
            String string = interfaceC0508Source.readString(Util.readBomAsCharset(interfaceC0508Source, charset()));
            interfaceC0508Source.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1458.m3154(interfaceC0508Source, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(C0539 c0539, MediaType mediaType) {
        return Companion.create(c0539, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, InterfaceC0508 interfaceC0508) {
        return Companion.create(mediaType, j, interfaceC0508);
    }

    public static final ResponseBody create(MediaType mediaType, C0539 c0539) {
        return Companion.create(mediaType, c0539);
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
