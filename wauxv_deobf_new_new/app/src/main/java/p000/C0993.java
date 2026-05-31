package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᛸᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0993 implements InterfaceC1620 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final byte[] f3622 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f3623 = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f3624 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static int m2676(InterfaceC0992 interfaceC0992, C1893 c1893) {
        try {
            int iMo1248 = interfaceC0992.mo1248();
            if ((iMo1248 & 65496) == 65496 || iMo1248 == 19789 || iMo1248 == 18761) {
                int iM2680 = m2680(interfaceC0992, 225);
                if (iM2680 != -1) {
                    byte[] bArr = (byte[]) c1893.m3818(iM2680, byte[].class);
                    try {
                        return m2681(interfaceC0992, bArr, iM2680);
                    } finally {
                        c1893.m3823(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo1248);
                return -1;
            }
        } catch (C0991 unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m2677(InterfaceC0992 interfaceC0992) {
        try {
            int iMo1248 = interfaceC0992.mo1248();
            if (iMo1248 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo1252 = (iMo1248 << 8) | interfaceC0992.mo1252();
            if (iMo1252 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo1253 = (iMo1252 << 8) | interfaceC0992.mo1252();
            if (iMo1253 == -1991225785) {
                interfaceC0992.skip(21L);
                try {
                    return interfaceC0992.mo1252() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0991 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo1253 == 1380533830) {
                interfaceC0992.skip(4L);
                if (((interfaceC0992.mo1248() << 16) | interfaceC0992.mo1248()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo1249 = (interfaceC0992.mo1248() << 16) | interfaceC0992.mo1248();
                if ((iMo1249 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo1249 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    interfaceC0992.skip(4L);
                    return (interfaceC0992.mo1252() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC0992.skip(4L);
                short sMo1252 = interfaceC0992.mo1252();
                if ((sMo1252 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sMo1252 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC0992.mo1248() << 16) | interfaceC0992.mo1248()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo12410 = (interfaceC0992.mo1248() << 16) | interfaceC0992.mo1248();
            if (iMo12410 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo12410 == 1635150182;
            interfaceC0992.skip(4L);
            int i3 = iMo1253 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo12411 = (interfaceC0992.mo1248() << 16) | interfaceC0992.mo1248();
                    if (iMo12411 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo12411 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0991 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static boolean m2678(InterfaceC0992 interfaceC0992, C1893 c1893) {
        boolean zM2679;
        if (m2677(interfaceC0992) == ImageHeaderParser$ImageType.JPEG) {
            int iM2680 = m2680(interfaceC0992, 226);
            while (iM2680 > 0) {
                byte[] bArr = (byte[]) c1893.m3818(iM2680, byte[].class);
                try {
                    int iMo1257 = interfaceC0992.mo1257(iM2680, bArr);
                    if (iMo1257 != iM2680) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM2680 + ", actually read: " + iMo1257);
                        }
                        zM2679 = false;
                    } else {
                        zM2679 = m2679(bArr, iM2680, f3623);
                    }
                    if (zM2679) {
                        c1893.m3823(bArr);
                        return true;
                    }
                    c1893.m3823(bArr);
                    iM2680 = m2680(interfaceC0992, 226);
                } catch (Throwable th) {
                    c1893.m3823(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static boolean m2679(byte[] bArr, int i, byte[] bArr2) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static int m2680(InterfaceC0992 interfaceC0992, int i) {
        short sMo1252;
        int iMo1248;
        long j;
        long jSkip;
        do {
            short sMo1253 = interfaceC0992.mo1252();
            if (sMo1253 == 255) {
                sMo1252 = interfaceC0992.mo1252();
                if (sMo1252 != 218) {
                    if (sMo1252 != 217) {
                        iMo1248 = interfaceC0992.mo1248() - 2;
                        if (sMo1252 == i) {
                            return iMo1248;
                        }
                        j = iMo1248;
                        jSkip = interfaceC0992.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo1253));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo1252) + ", wanted to skip: " + iMo1248 + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static int m2681(InterfaceC0992 interfaceC0992, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo1257 = interfaceC0992.mo1257(i, bArr);
        if (iMo1257 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo1257);
                return -1;
            }
        } else if (m2679(bArr, i, f3622)) {
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
                            int i9 = i8 + f3624[s4];
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

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo2682(ByteBuffer byteBuffer) {
        AbstractC2727.m4693(byteBuffer, "Argument must not be null");
        return m2677(new C0482(2, byteBuffer));
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo2683(ByteBuffer byteBuffer, C1893 c1893) {
        C0482 c0482 = new C0482(2, byteBuffer);
        AbstractC2727.m4693(c1893, "Argument must not be null");
        return m2678(c0482, c1893);
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo2684(ByteBuffer byteBuffer, C1893 c1893) {
        C0482 c0482 = new C0482(2, byteBuffer);
        AbstractC2727.m4693(c1893, "Argument must not be null");
        return m2676(c0482, c1893);
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo2685(InputStream inputStream) {
        return m2677(new C0102(inputStream, 14));
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int mo2686(InputStream inputStream, C1893 c1893) {
        C0102 c0102 = new C0102(inputStream, 14);
        AbstractC2727.m4693(c1893, "Argument must not be null");
        return m2676(c0102, c1893);
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean mo2687(InputStream inputStream, C1893 c1893) {
        AbstractC2727.m4693(inputStream, "Argument must not be null");
        C0102 c0102 = new C0102(inputStream, 14);
        AbstractC2727.m4693(c1893, "Argument must not be null");
        return m2678(c0102, c1893);
    }
}
