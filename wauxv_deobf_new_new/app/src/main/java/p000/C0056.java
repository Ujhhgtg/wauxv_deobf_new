package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0056 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f1044;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ByteBuffer f1045;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1046;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1047;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2135 f1048;

    public C0056() {
        if (C2135.f7054 == null) {
            C2135.f7054 = new C2135(25);
        }
        this.f1048 = C2135.f7054;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m1053(int i) {
        return this.f1045.getInt(i) + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m1054(int i) {
        if (i < this.f1047) {
            return this.f1045.getShort(this.f1046 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1055(int i, ByteBuffer byteBuffer) {
        this.f1045 = byteBuffer;
        if (byteBuffer == null) {
            this.f1044 = 0;
            this.f1046 = 0;
            this.f1047 = 0;
        } else {
            this.f1044 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f1046 = i2;
            this.f1047 = this.f1045.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String m1056(int i) {
        ByteBuffer byteBuffer = this.f1045;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        this.f1048.getClass();
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
                    AbstractC2902.m4894(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i10 = i4 + 2;
                    i4 += 3;
                    AbstractC2902.m4893(b2, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i11 = i4 + 3;
                    byte b5 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    AbstractC2902.m4892(b2, b4, b5, byteBuffer.get(i11), cArr, i7);
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
                AbstractC2902.m4894(b7, bArrArray[i15], cArr2, i14);
                i14++;
            } else if (b7 < -16) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC2902.m4893(b7, bArrArray[i15], bArrArray[i17], cArr2, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b9 = bArrArray[i15];
                int i18 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC2902.m4892(b7, b9, b10, bArrArray[i18], cArr2, i14);
                i14 += 2;
            }
        }
        return new String(cArr2, 0, i14);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m1057(int i) {
        int i2 = i + this.f1044;
        return this.f1045.getInt(i2) + i2 + 4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m1058(int i) {
        int i2 = i + this.f1044;
        return this.f1045.getInt(this.f1045.getInt(i2) + i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0056 m1059(int i) {
        C0056 c0056 = new C0056();
        int iM1054 = m1054(4);
        if (iM1054 == 0) {
            return null;
        }
        c0056.m1055(m1053((i * 4) + m1057(iM1054)), this.f1045);
        return c0056;
    }
}
