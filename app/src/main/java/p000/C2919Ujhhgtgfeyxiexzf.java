package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2919Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f9203Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public ByteBuffer f9204Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f9205Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f9206Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0420Ujhhgtgfeyxiexzf f9207Ujhhgtgfeyxiexzf;

    public C2919Ujhhgtgfeyxiexzf() {
        if (C0420Ujhhgtgfeyxiexzf.f2255Ujhhgtgfeyxiexzf == null) {
            C0420Ujhhgtgfeyxiexzf.f2255Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(25);
        }
        this.f9207Ujhhgtgfeyxiexzf = C0420Ujhhgtgfeyxiexzf.f2255Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m4288Ujhhgtgfeyxiexzf(int i) {
        return this.f9204Ujhhgtgfeyxiexzf.getInt(i) + i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m4289Ujhhgtgfeyxiexzf(int i) {
        if (i < this.f9206Ujhhgtgfeyxiexzf) {
            return this.f9204Ujhhgtgfeyxiexzf.getShort(this.f9205Ujhhgtgfeyxiexzf + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4290Ujhhgtgfeyxiexzf(int i, ByteBuffer byteBuffer) {
        this.f9204Ujhhgtgfeyxiexzf = byteBuffer;
        if (byteBuffer == null) {
            this.f9203Ujhhgtgfeyxiexzf = 0;
            this.f9205Ujhhgtgfeyxiexzf = 0;
            this.f9206Ujhhgtgfeyxiexzf = 0;
        } else {
            this.f9203Ujhhgtgfeyxiexzf = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f9205Ujhhgtgfeyxiexzf = i2;
            this.f9206Ujhhgtgfeyxiexzf = this.f9204Ujhhgtgfeyxiexzf.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String m4291Ujhhgtgfeyxiexzf(int i) {
        ByteBuffer byteBuffer = this.f9204Ujhhgtgfeyxiexzf;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        this.f9207Ujhhgtgfeyxiexzf.getClass();
        if (!byteBuffer.hasArray()) {
            if ((i4 | i3 | ((byteBuffer.limit() - i4) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i3)));
            }
            int i5 = i4 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i4 < i5) {
                byte b = byteBuffer.get(i4);
                if (b < 0) {
                    break;
                }
                i4++;
                cArr[i6] = (char) b;
                i6++;
            }
            int i7 = i6;
            while (i4 < i5) {
                int i8 = i4 + 1;
                byte b2 = byteBuffer.get(i4);
                if (b2 >= 0) {
                    int i9 = i7 + 1;
                    cArr[i7] = (char) b2;
                    while (i8 < i5) {
                        byte b3 = byteBuffer.get(i8);
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i9] = (char) b3;
                        i9++;
                    }
                    i7 = i9;
                    i4 = i8;
                } else if (b2 < -32) {
                    if (i8 >= i5) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i4 += 2;
                    AbstractC3590Ujhhgtgfeyxiexzf.m5131Ujhhgtgfeyxiexzf(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i10 = i4 + 2;
                    i4 += 3;
                    AbstractC3590Ujhhgtgfeyxiexzf.m5130Ujhhgtgfeyxiexzf(b2, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i11 = i4 + 3;
                    byte b5 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    AbstractC3590Ujhhgtgfeyxiexzf.m5129Ujhhgtgfeyxiexzf(b2, b4, b5, byteBuffer.get(i11), cArr, i7);
                    i7 += 2;
                }
            }
            return new String(cArr, 0, i7);
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + i4;
        if ((iArrayOffset | i3 | ((bArrArray.length - iArrayOffset) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArrArray.length), Integer.valueOf(iArrayOffset), Integer.valueOf(i3)));
        }
        int i12 = iArrayOffset + i3;
        char[] cArr2 = new char[i3];
        int i13 = 0;
        while (iArrayOffset < i12) {
            byte b6 = bArrArray[iArrayOffset];
            if (b6 < 0) {
                break;
            }
            iArrayOffset++;
            cArr2[i13] = (char) b6;
            i13++;
        }
        int i14 = i13;
        while (iArrayOffset < i12) {
            int i15 = iArrayOffset + 1;
            byte b7 = bArrArray[iArrayOffset];
            if (b7 >= 0) {
                int i16 = i14 + 1;
                cArr2[i14] = (char) b7;
                while (i15 < i12) {
                    byte b8 = bArrArray[i15];
                    if (b8 < 0) {
                        break;
                    }
                    i15++;
                    cArr2[i16] = (char) b8;
                    i16++;
                }
                i14 = i16;
                iArrayOffset = i15;
            } else if (b7 < -32) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                iArrayOffset += 2;
                AbstractC3590Ujhhgtgfeyxiexzf.m5131Ujhhgtgfeyxiexzf(b7, bArrArray[i15], cArr2, i14);
                i14++;
            } else if (b7 < -16) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC3590Ujhhgtgfeyxiexzf.m5130Ujhhgtgfeyxiexzf(b7, bArrArray[i15], bArrArray[i17], cArr2, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b9 = bArrArray[i15];
                int i18 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC3590Ujhhgtgfeyxiexzf.m5129Ujhhgtgfeyxiexzf(b7, b9, b10, bArrArray[i18], cArr2, i14);
                i14 += 2;
            }
        }
        return new String(cArr2, 0, i14);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m4292Ujhhgtgfeyxiexzf(int i) {
        int i2 = i + this.f9203Ujhhgtgfeyxiexzf;
        return this.f9204Ujhhgtgfeyxiexzf.getInt(i2) + i2 + 4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m4293Ujhhgtgfeyxiexzf(int i) {
        int i2 = i + this.f9203Ujhhgtgfeyxiexzf;
        return this.f9204Ujhhgtgfeyxiexzf.getInt(this.f9204Ujhhgtgfeyxiexzf.getInt(i2) + i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C2919Ujhhgtgfeyxiexzf m4294Ujhhgtgfeyxiexzf(int i) {
        C2919Ujhhgtgfeyxiexzf c2919Ujhhgtgfeyxiexzf = new C2919Ujhhgtgfeyxiexzf();
        int iM4289Ujhhgtgfeyxiexzf = m4289Ujhhgtgfeyxiexzf(4);
        if (iM4289Ujhhgtgfeyxiexzf == 0) {
            return null;
        }
        c2919Ujhhgtgfeyxiexzf.m4290Ujhhgtgfeyxiexzf(m4288Ujhhgtgfeyxiexzf((i * 4) + m4292Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf)), this.f9204Ujhhgtgfeyxiexzf);
        return c2919Ujhhgtgfeyxiexzf;
    }
}
