package okhttp3;

import com.umeng.analytics.pro.ek;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import okhttp3.internal.Util;
import p000.AbstractC0580;
import p000.AbstractC0985;
import p000.AbstractC1469;
import p000.AbstractC2844;
import p000.C0481;
import p000.C0516;
import p000.InterfaceC0484;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final C0516 boundaryByteString;
    private long contentLength = -1;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* JADX INFO: compiled from: obf */
    public static final class Builder {
        private final C0516 boundary;
        private final List<Part> parts;
        private MediaType type;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder addFormDataPart(String str, String str2) {
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
        }

        public final Builder setType(MediaType mediaType) {
            if (AbstractC1469.m3322(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType).toString());
        }

        public Builder(String str) {
            C0516 c0516 = new C0516(str.getBytes(AbstractC0580.UTF_8));
            c0516.f2203 = str;
            this.boundary = c0516;
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            this.parts.add(part);
            return this;
        }

        public /* synthetic */ Builder(String str, int i, AbstractC0985 abstractC0985) {
            this((i & 1) != 0 ? UUID.randomUUID().toString() : str);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append('\"');
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        /* JADX INFO: compiled from: obf */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
                this();
            }

            public final Part create(RequestBody requestBody) {
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            private Companion() {
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                AbstractC0985 abstractC0985 = null;
                if ((headers != null ? headers.get("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new Part(headers, requestBody, abstractC0985);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                StringBuilder sbM4787 = AbstractC2844.m4787("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sbM4787, str);
                if (str2 != null) {
                    sbM4787.append("; filename=");
                    companion.appendQuotedString$okhttp(sbM4787, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sbM4787.toString()).build(), requestBody);
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, AbstractC0985 abstractC0985) {
            this(headers, requestBody);
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m992deprecated_body() {
            return this.body;
        }

        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m993deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{ek.k, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(C0516 c0516, MediaType mediaType, List<Part> list) {
        this.boundaryByteString = c0516;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(InterfaceC0484 interfaceC0484, boolean z) throws EOFException {
        C0481 c0481;
        if (z) {
            interfaceC0484 = new C0481();
            c0481 = interfaceC0484;
        } else {
            c0481 = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            interfaceC0484.write(DASHDASH);
            interfaceC0484.mo1871(this.boundaryByteString);
            interfaceC0484.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    interfaceC0484.mo1869(headers.name(i2)).write(COLONSPACE).mo1869(headers.value(i2)).write(CRLF);
                }
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                interfaceC0484.mo1869("Content-Type: ").mo1869(mediaTypeContentType.toString()).write(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                interfaceC0484.mo1869("Content-Length: ").mo1885(jContentLength).write(CRLF);
            } else if (z) {
                c0481.m1855();
                return -1L;
            }
            byte[] bArr = CRLF;
            interfaceC0484.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                requestBodyBody.writeTo(interfaceC0484);
            }
            interfaceC0484.write(bArr);
        }
        byte[] bArr2 = DASHDASH;
        interfaceC0484.write(bArr2);
        interfaceC0484.mo1871(this.boundaryByteString);
        interfaceC0484.write(bArr2);
        interfaceC0484.write(CRLF);
        if (!z) {
            return j;
        }
        long j2 = j + c0481.f2128;
        c0481.m1855();
        return j2;
    }

    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m988deprecated_boundary() {
        return boundary();
    }

    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m989deprecated_parts() {
        return this.parts;
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m990deprecated_size() {
        return size();
    }

    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m991deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.m1971();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws EOFException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC0484 interfaceC0484) throws EOFException {
        writeOrCountBytes(interfaceC0484, false);
    }
}
