package okhttp3;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1318feyxiexzfUjhhgtg;
import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C1744Ujhhgtgfeyxiexzf;
import p000.C2402Ujhhgtgfeyxiexzf;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.InterfaceC2596feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c2633Ujhhgtgfeyxiexzf, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        public final RequestBody create(byte[] bArr) {
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            Charset charset = AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(final C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, final MediaType mediaType) {
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg) {
                    interfaceC2596feyxiexzfUjhhgtg.mo2150Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i, final int i2) {
            Util.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg) {
                    interfaceC2596feyxiexzfUjhhgtg.mo2152feyxiexzfUjhhgtg(i, i2, bArr);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg) {
                    File file2 = file;
                    Logger logger = AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf;
                    C2402Ujhhgtgfeyxiexzf c2402Ujhhgtgfeyxiexzf = new C2402Ujhhgtgfeyxiexzf(new FileInputStream(file2), 1, C1744Ujhhgtgfeyxiexzf.NONE);
                    try {
                        interfaceC2596feyxiexzfUjhhgtg.mo2147Ujhhgtgfeyxiexzf(c2402Ujhhgtgfeyxiexzf);
                        c2402Ujhhgtgfeyxiexzf.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(c2402Ujhhgtgfeyxiexzf, th);
                            throw th2;
                        }
                    }
                }
            };
        }

        public final RequestBody create(MediaType mediaType, String str) {
            return create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
            return create(c2633Ujhhgtgfeyxiexzf, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
            return create(bArr, mediaType, i, i2);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, MediaType mediaType) {
        return Companion.create(c2633Ujhhgtgfeyxiexzf, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg);

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        return Companion.create(mediaType, c2633Ujhhgtgfeyxiexzf);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.create(mediaType, bArr, i);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.create(bArr, mediaType, i);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }
}
