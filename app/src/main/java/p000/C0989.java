package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0989 implements InterfaceC1607 {

    public static final byte[] f3606 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    public static final byte[] f3607 = "MPF".getBytes(Charset.forName("UTF-8"));

    public static final int[] f3608 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int m2552(InterfaceC0988 interfaceC0988, C1867 c1867) {
        try {
            int iMo1102 = interfaceC0988.mo1102();
            if ((iMo1102 & 65496) == 65496 || iMo1102 == 19789 || iMo1102 == 18761) {
                int iM2556 = m2556(interfaceC0988, 225);
                if (iM2556 != -1) {
                    byte[] bArr = (byte[]) c1867.m3640(iM2556, byte[].class);
                    try {
                        return m2557(interfaceC0988, bArr, iM2556);
                    } finally {
                        c1867.m3645(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo1102);
                return -1;
            }
        } catch (C0987 unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType m2553(InterfaceC0988 interfaceC0988) {
        try {
            int iMo1102 = interfaceC0988.mo1102();
            if (iMo1102 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo1106 = (iMo1102 << 8) | interfaceC0988.mo1106();
            if (iMo1106 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo1107 = (iMo1106 << 8) | interfaceC0988.mo1106();
            if (iMo1107 == -1991225785) {
                interfaceC0988.skip(21L);
                try {
                    return interfaceC0988.mo1106() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0987 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo1107 == 1380533830) {
                interfaceC0988.skip(4L);
                if (((interfaceC0988.mo1102() << 16) | interfaceC0988.mo1102()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo1103 = (interfaceC0988.mo1102() << 16) | interfaceC0988.mo1102();
                if ((iMo1103 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo1103 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    interfaceC0988.skip(4L);
                    return (interfaceC0988.mo1106() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC0988.skip(4L);
                short sMo1106 = interfaceC0988.mo1106();
                if ((sMo1106 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sMo1106 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC0988.mo1102() << 16) | interfaceC0988.mo1102()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo1104 = (interfaceC0988.mo1102() << 16) | interfaceC0988.mo1102();
            if (iMo1104 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo1104 == 1635150182;
            interfaceC0988.skip(4L);
            int i3 = iMo1107 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo1105 = (interfaceC0988.mo1102() << 16) | interfaceC0988.mo1102();
                    if (iMo1105 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo1105 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0987 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean m2554(InterfaceC0988 interfaceC0988, C1867 c1867) {
        boolean zM2555;
        if (m2553(interfaceC0988) == ImageHeaderParser$ImageType.JPEG) {
            int iM2556 = m2556(interfaceC0988, 226);
            while (iM2556 > 0) {
                byte[] bArr = (byte[]) c1867.m3640(iM2556, byte[].class);
                try {
                    int iMo1111 = interfaceC0988.mo1111(iM2556, bArr);
                    if (iMo1111 != iM2556) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM2556 + ", actually read: " + iMo1111);
                        }
                        zM2555 = false;
                    } else {
                        zM2555 = m2555(bArr, iM2556, f3607);
                    }
                    if (zM2555) {
                        c1867.m3645(bArr);
                        return true;
                    }
                    c1867.m3645(bArr);
                    iM2556 = m2556(interfaceC0988, 226);
                } catch (Throwable th) {
                    c1867.m3645(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean m2555(byte[] bArr, int i, byte[] bArr2) {
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

    public static int m2556(InterfaceC0988 interfaceC0988, int i) {
        short sMo1106;
        int iMo1102;
        long j;
        long jSkip;
        do {
            short sMo1107 = interfaceC0988.mo1106();
            if (sMo1107 == 255) {
                sMo1106 = interfaceC0988.mo1106();
                if (sMo1106 != 218) {
                    if (sMo1106 != 217) {
                        iMo1102 = interfaceC0988.mo1102() - 2;
                        if (sMo1106 == i) {
                            return iMo1102;
                        }
                        j = iMo1102;
                        jSkip = interfaceC0988.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo1107));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo1106) + ", wanted to skip: " + iMo1102 + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    public static int m2557(InterfaceC0988 interfaceC0988, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo1111 = interfaceC0988.mo1111(i, bArr);
        if (iMo1111 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo1111);
                return -1;
            }
        } else if (m2555(bArr, i, f3606)) {
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
                            int i9 = i8 + f3608[s4];
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
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=274");
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

    @Override // p000.InterfaceC1607
    public final ImageHeaderParser$ImageType mo2558(ByteBuffer byteBuffer) {
        AbstractC1460.m3210(byteBuffer, "Argument must not be null");
        return m2553(new C0505(2, byteBuffer));
    }

    @Override // p000.InterfaceC1607
    public final boolean mo2559(ByteBuffer byteBuffer, C1867 c1867) {
        C0505 c0505 = new C0505(2, byteBuffer);
        AbstractC1460.m3210(c1867, "Argument must not be null");
        return m2554(c0505, c1867);
    }

    @Override // p000.InterfaceC1607
    public final int mo2560(ByteBuffer byteBuffer, C1867 c1867) {
        C0505 c0505 = new C0505(2, byteBuffer);
        AbstractC1460.m3210(c1867, "Argument must not be null");
        return m2552(c0505, c1867);
    }

    @Override // p000.InterfaceC1607
    public final ImageHeaderParser$ImageType mo2561(InputStream inputStream) {
        return m2553(new C0094(13, inputStream));
    }

    @Override // p000.InterfaceC1607
    public final int mo2562(InputStream inputStream, C1867 c1867) {
        C0094 c0094 = new C0094(13, inputStream);
        AbstractC1460.m3210(c1867, "Argument must not be null");
        return m2552(c0094, c1867);
    }

    @Override // p000.InterfaceC1607
    public final boolean mo2563(InputStream inputStream, C1867 c1867) {
        AbstractC1460.m3210(inputStream, "Argument must not be null");
        C0094 c0094 = new C0094(13, inputStream);
        AbstractC1460.m3210(c1867, "Argument must not be null");
        return m2554(c0094, c1867);
    }
}
