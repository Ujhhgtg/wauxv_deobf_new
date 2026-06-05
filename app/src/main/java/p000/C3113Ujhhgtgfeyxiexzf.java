package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3113Ujhhgtgfeyxiexzf implements InterfaceC0751Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final byte[] f9676Ujhhgtgfeyxiexzf = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final byte[] f9677Ujhhgtgfeyxiexzf = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f9678Ujhhgtgfeyxiexzf = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static int m4638Ujhhgtgfeyxiexzf(InterfaceC3132Ujhhgtgfeyxiexzf interfaceC3132Ujhhgtgfeyxiexzf, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        try {
            int iMo3852Ujhhgtgfeyxiexzf = interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf();
            if ((iMo3852Ujhhgtgfeyxiexzf & 65496) == 65496 || iMo3852Ujhhgtgfeyxiexzf == 19789 || iMo3852Ujhhgtgfeyxiexzf == 18761) {
                int iM4642Ujhhgtgfeyxiexzf = m4642Ujhhgtgfeyxiexzf(interfaceC3132Ujhhgtgfeyxiexzf, 225);
                if (iM4642Ujhhgtgfeyxiexzf != -1) {
                    byte[] bArr = (byte[]) c0271Ujhhgtgfeyxiexzf.m1462Ujhhgtgfeyxiexzf(iM4642Ujhhgtgfeyxiexzf, byte[].class);
                    try {
                        return m4643Ujhhgtgfeyxiexzf(interfaceC3132Ujhhgtgfeyxiexzf, bArr, iM4642Ujhhgtgfeyxiexzf);
                    } finally {
                        c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo3852Ujhhgtgfeyxiexzf);
                return -1;
            }
        } catch (C3131Ujhhgtgfeyxiexzf unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m4639Ujhhgtgfeyxiexzf(InterfaceC3132Ujhhgtgfeyxiexzf interfaceC3132Ujhhgtgfeyxiexzf) {
        try {
            int iMo3852Ujhhgtgfeyxiexzf = interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf();
            if (iMo3852Ujhhgtgfeyxiexzf == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo3853Ujhhgtgfeyxiexzf = (iMo3852Ujhhgtgfeyxiexzf << 8) | interfaceC3132Ujhhgtgfeyxiexzf.mo3853Ujhhgtgfeyxiexzf();
            if (iMo3853Ujhhgtgfeyxiexzf == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo3853Ujhhgtgfeyxiexzf2 = (iMo3853Ujhhgtgfeyxiexzf << 8) | interfaceC3132Ujhhgtgfeyxiexzf.mo3853Ujhhgtgfeyxiexzf();
            if (iMo3853Ujhhgtgfeyxiexzf2 == -1991225785) {
                interfaceC3132Ujhhgtgfeyxiexzf.skip(21L);
                try {
                    return interfaceC3132Ujhhgtgfeyxiexzf.mo3853Ujhhgtgfeyxiexzf() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C3131Ujhhgtgfeyxiexzf unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo3853Ujhhgtgfeyxiexzf2 == 1380533830) {
                interfaceC3132Ujhhgtgfeyxiexzf.skip(4L);
                if (((interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf() << 16) | interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo3852Ujhhgtgfeyxiexzf2 = (interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf() << 16) | interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf();
                if ((iMo3852Ujhhgtgfeyxiexzf2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo3852Ujhhgtgfeyxiexzf2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    interfaceC3132Ujhhgtgfeyxiexzf.skip(4L);
                    return (interfaceC3132Ujhhgtgfeyxiexzf.mo3853Ujhhgtgfeyxiexzf() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC3132Ujhhgtgfeyxiexzf.skip(4L);
                short sMo3853Ujhhgtgfeyxiexzf = interfaceC3132Ujhhgtgfeyxiexzf.mo3853Ujhhgtgfeyxiexzf();
                if ((sMo3853Ujhhgtgfeyxiexzf & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sMo3853Ujhhgtgfeyxiexzf & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf() << 16) | interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo3852Ujhhgtgfeyxiexzf3 = (interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf() << 16) | interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf();
            if (iMo3852Ujhhgtgfeyxiexzf3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo3852Ujhhgtgfeyxiexzf3 == 1635150182;
            interfaceC3132Ujhhgtgfeyxiexzf.skip(4L);
            int i3 = iMo3853Ujhhgtgfeyxiexzf2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo3852Ujhhgtgfeyxiexzf4 = (interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf() << 16) | interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf();
                    if (iMo3852Ujhhgtgfeyxiexzf4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo3852Ujhhgtgfeyxiexzf4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C3131Ujhhgtgfeyxiexzf unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static boolean m4640Ujhhgtgfeyxiexzf(InterfaceC3132Ujhhgtgfeyxiexzf interfaceC3132Ujhhgtgfeyxiexzf, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        boolean zM4641Ujhhgtgfeyxiexzf;
        if (m4639Ujhhgtgfeyxiexzf(interfaceC3132Ujhhgtgfeyxiexzf) == ImageHeaderParser$ImageType.JPEG) {
            int iM4642Ujhhgtgfeyxiexzf = m4642Ujhhgtgfeyxiexzf(interfaceC3132Ujhhgtgfeyxiexzf, 226);
            while (iM4642Ujhhgtgfeyxiexzf > 0) {
                byte[] bArr = (byte[]) c0271Ujhhgtgfeyxiexzf.m1462Ujhhgtgfeyxiexzf(iM4642Ujhhgtgfeyxiexzf, byte[].class);
                try {
                    int iMo3854Ujhhgtgfeyxiexzf = interfaceC3132Ujhhgtgfeyxiexzf.mo3854Ujhhgtgfeyxiexzf(iM4642Ujhhgtgfeyxiexzf, bArr);
                    if (iMo3854Ujhhgtgfeyxiexzf != iM4642Ujhhgtgfeyxiexzf) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM4642Ujhhgtgfeyxiexzf + ", actually read: " + iMo3854Ujhhgtgfeyxiexzf);
                        }
                        zM4641Ujhhgtgfeyxiexzf = false;
                    } else {
                        zM4641Ujhhgtgfeyxiexzf = m4641Ujhhgtgfeyxiexzf(bArr, iM4642Ujhhgtgfeyxiexzf, f9677Ujhhgtgfeyxiexzf);
                    }
                    if (zM4641Ujhhgtgfeyxiexzf) {
                        c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                        return true;
                    }
                    c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                    iM4642Ujhhgtgfeyxiexzf = m4642Ujhhgtgfeyxiexzf(interfaceC3132Ujhhgtgfeyxiexzf, 226);
                } catch (Throwable th) {
                    c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m4641Ujhhgtgfeyxiexzf(byte[] bArr, int i, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static int m4642Ujhhgtgfeyxiexzf(InterfaceC3132Ujhhgtgfeyxiexzf interfaceC3132Ujhhgtgfeyxiexzf, int i) {
        short sMo3853Ujhhgtgfeyxiexzf;
        int iMo3852Ujhhgtgfeyxiexzf;
        long j;
        long jSkip;
        do {
            short sMo3853Ujhhgtgfeyxiexzf2 = interfaceC3132Ujhhgtgfeyxiexzf.mo3853Ujhhgtgfeyxiexzf();
            if (sMo3853Ujhhgtgfeyxiexzf2 == 255) {
                sMo3853Ujhhgtgfeyxiexzf = interfaceC3132Ujhhgtgfeyxiexzf.mo3853Ujhhgtgfeyxiexzf();
                if (sMo3853Ujhhgtgfeyxiexzf != 218) {
                    if (sMo3853Ujhhgtgfeyxiexzf != 217) {
                        iMo3852Ujhhgtgfeyxiexzf = interfaceC3132Ujhhgtgfeyxiexzf.mo3852Ujhhgtgfeyxiexzf() - 2;
                        if (sMo3853Ujhhgtgfeyxiexzf == i) {
                            return iMo3852Ujhhgtgfeyxiexzf;
                        }
                        j = iMo3852Ujhhgtgfeyxiexzf;
                        jSkip = interfaceC3132Ujhhgtgfeyxiexzf.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo3853Ujhhgtgfeyxiexzf2));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo3853Ujhhgtgfeyxiexzf) + ", wanted to skip: " + iMo3852Ujhhgtgfeyxiexzf + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m4643Ujhhgtgfeyxiexzf(InterfaceC3132Ujhhgtgfeyxiexzf interfaceC3132Ujhhgtgfeyxiexzf, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo3854Ujhhgtgfeyxiexzf = interfaceC3132Ujhhgtgfeyxiexzf.mo3854Ujhhgtgfeyxiexzf(i, bArr);
        if (iMo3854Ujhhgtgfeyxiexzf != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo3854Ujhhgtgfeyxiexzf);
                return -1;
            }
        } else if (m4641Ujhhgtgfeyxiexzf(bArr, i, f9676Ujhhgtgfeyxiexzf)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s != 18761) {
                if (s != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i2 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i3 = i2 + 6;
            short s2 = byteBuffer.remaining() - i3 >= 2 ? byteBuffer.getShort(i3) : (short) -1;
            for (int i4 = 0; i4 < s2; i4++) {
                int i5 = (i4 * 12) + i2 + 8;
                short s3 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
                if (s3 == 274) {
                    int i6 = i5 + 2;
                    short s4 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                    if (s4 >= 1 && s4 <= 12) {
                        int i7 = i5 + 4;
                        int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                        if (i8 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i4 + " tagType=" + ((int) s3) + " formatCode=" + ((int) s4) + " componentCount=" + i8);
                            }
                            int i9 = i8 + f9678Ujhhgtgfeyxiexzf[s4];
                            if (i9 <= 4) {
                                int i10 = i5 + 8;
                                if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                    if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i10 >= 2) {
                                            return byteBuffer.getShort(i10);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) s3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s4));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s4));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final ImageHeaderParser$ImageType mo2087Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(byteBuffer, "Argument must not be null");
        return m4639Ujhhgtgfeyxiexzf(new C2594feyxiexzfUjhhgtg(2, byteBuffer));
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo2088Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        C2594feyxiexzfUjhhgtg c2594feyxiexzfUjhhgtg = new C2594feyxiexzfUjhhgtg(2, byteBuffer);
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf, "Argument must not be null");
        return m4640Ujhhgtgfeyxiexzf(c2594feyxiexzfUjhhgtg, c0271Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo2089Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        C2594feyxiexzfUjhhgtg c2594feyxiexzfUjhhgtg = new C2594feyxiexzfUjhhgtg(2, byteBuffer);
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf, "Argument must not be null");
        return m4638Ujhhgtgfeyxiexzf(c2594feyxiexzfUjhhgtg, c0271Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final ImageHeaderParser$ImageType mo2090Ujhhgtgfeyxiexzf(InputStream inputStream) {
        return m4639Ujhhgtgfeyxiexzf(new C2965Ujhhgtgfeyxiexzf(14, inputStream));
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo2091Ujhhgtgfeyxiexzf(InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(14, inputStream);
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf, "Argument must not be null");
        return m4638Ujhhgtgfeyxiexzf(c2965Ujhhgtgfeyxiexzf, c0271Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo2092Ujhhgtgfeyxiexzf(InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(inputStream, "Argument must not be null");
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(14, inputStream);
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf, "Argument must not be null");
        return m4640Ujhhgtgfeyxiexzf(c2965Ujhhgtgfeyxiexzf, c0271Ujhhgtgfeyxiexzf);
    }
}
