package p000;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1353 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public ByteBuffer f4834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f4835;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f4836;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int[] f4837;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4838;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f4839;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f4840;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f4841;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int[] f4842;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4844;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C1139 f4845;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C2135 f4846;

    public C1353() {
        C1139 c1139 = C1139.f4217;
        if (C2135.f7054 == null) {
            C2135.f7054 = new C2135(25);
        }
        C2135 c2135 = C2135.f7054;
        this.f4836 = 1;
        this.f4837 = null;
        this.f4838 = 0;
        this.f4839 = false;
        this.f4840 = false;
        this.f4842 = new int[16];
        this.f4843 = 0;
        this.f4844 = 0;
        this.f4845 = c1139;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f4834 = byteBufferOrder;
        this.f4846 = c2135;
        this.f4835 = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3168(byte b) {
        m3179(1, 0);
        ByteBuffer byteBuffer = this.f4834;
        int i = this.f4835 - 1;
        this.f4835 = i;
        byteBuffer.put(i, b);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3169(byte b, int i) {
        if (b != 0) {
            m3168(b);
            m3180(i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3170(int i) {
        m3179(4, 0);
        int iM3178 = (m3178() - i) + 4;
        ByteBuffer byteBuffer = this.f4834;
        int i2 = this.f4835 - 4;
        this.f4835 = i2;
        byteBuffer.putInt(i2, iM3178);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3171(int i, int i2) {
        if (i2 != 0) {
            m3170(i2);
            m3180(i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3172(short s) {
        m3179(2, 0);
        ByteBuffer byteBuffer = this.f4834;
        int i = this.f4835 - 2;
        this.f4835 = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m3173(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        C2135 c2135 = this.f4846;
        c2135.getClass();
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            c = 55296;
            c2 = 2048;
            z = true;
            if (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= 2048) {
                    int length2 = charSequence.length();
                    int i7 = 0;
                    while (i5 < length2) {
                        char cCharAt3 = charSequence.charAt(i5);
                        if (cCharAt3 < 2048) {
                            i7 += (127 - cCharAt3) >>> 31;
                        } else {
                            i7 += 2;
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                                if (Character.codePointAt(charSequence, i5) < 65536) {
                                    throw new C1667(i5, length2);
                                }
                                i5++;
                            }
                        }
                        i5++;
                    }
                    i6 += i7;
                    break;
                }
                i6 += (127 - cCharAt2) >>> 31;
                i5++;
            } else {
                break;
            }
        }
        if (i6 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + JSONWriter.MASK_IGNORE_NON_FIELD_GETTER));
        }
        m3168((byte) 0);
        m3182(1, i6, 1);
        ByteBuffer byteBuffer = this.f4834;
        int i8 = this.f4835 - i6;
        this.f4835 = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.f4834;
        c2135.getClass();
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i9 = iRemaining + iPosition;
            while (true) {
                boolean z2 = z;
                if (i4 >= length3 || (i3 = i4 + iPosition) >= i9 || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                bArrArray[i3] = (byte) cCharAt;
                i4++;
                z = z2;
            }
            if (i4 == length3) {
                i = iPosition + length3;
            } else {
                i = iPosition + i4;
                while (i4 < length3) {
                    char cCharAt4 = charSequence.charAt(i4);
                    if (cCharAt4 < 128 && i < i9) {
                        bArrArray[i] = (byte) cCharAt4;
                        i++;
                    } else if (cCharAt4 < c2 && i <= i9 - 2) {
                        int i10 = i + 1;
                        bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                        i += 2;
                        bArrArray[i10] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c && 57343 >= cCharAt4) || i > i9 - 3) {
                            if (i > i9 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i2 = i4 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i2)))) {
                                    throw new C1667(i4, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i);
                            }
                            int i11 = i4 + 1;
                            if (i11 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i + 3;
                                    bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i += 4;
                                    bArrArray[i12] = (byte) ((codePoint & 63) | 128);
                                    i4 = i11;
                                } else {
                                    i4 = i11;
                                }
                            }
                            throw new C1667(i4 - 1, length3);
                        }
                        bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i13 = i + 2;
                        bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i += 3;
                        bArrArray[i13] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i4++;
                    c = 55296;
                    c2 = 2048;
                }
            }
            byteBuffer2.position(i - iArrayOffset);
        } else {
            int length4 = charSequence.length();
            int iPosition2 = byteBuffer2.position();
            while (i4 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i4);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer2.put(iPosition2 + i4, (byte) cCharAt6);
                    i4++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i4 == length4) {
                byteBuffer2.position(iPosition2 + i4);
            } else {
                iPosition2 += i4;
                while (i4 < length4) {
                    char cCharAt7 = charSequence.charAt(i4);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i14 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> 6) | Opcodes.CHECKCAST));
                                byteBuffer2.put(i14, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i14;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i14;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i15 = i4 + 1;
                                if (i15 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i15);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i16 = iPosition2 + 1;
                                            try {
                                                byteBuffer2.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i17 = iPosition2 + 2;
                                                try {
                                                    byteBuffer2.put(i16, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer2.put(i17, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer2.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i4 = i15;
                                                    i4++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i4 = i15;
                                                    iPosition2 = i17;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i16;
                                                i4 = i15;
                                            }
                                        } else {
                                            i4 = i15;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                    i4 = i15;
                                }
                                throw new C1667(i4, length4);
                            }
                            int i18 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer2.put(i18, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i4++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i18;
                            }
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (Math.max(i4, (iPosition2 - byteBuffer2.position()) + 1) + byteBuffer2.position()));
                    }
                    byteBuffer2.put(iPosition2, (byte) cCharAt7);
                    i4++;
                    iPosition2++;
                }
                byteBuffer2.position(iPosition2);
            }
        }
        return m3176();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m3174(int[] iArr) {
        if (this.f4839) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        m3182(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m3170(iArr[length]);
        }
        return m3176();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m3175() {
        int i;
        if (this.f4837 == null || !this.f4839) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m3179(4, 0);
        ByteBuffer byteBuffer = this.f4834;
        int i2 = this.f4835 - 4;
        this.f4835 = i2;
        byteBuffer.putInt(i2, 0);
        int iM3178 = m3178();
        int i3 = this.f4838 - 1;
        while (i3 >= 0 && this.f4837[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f4837[i4];
            m3172((short) (i5 != 0 ? iM3178 - i5 : 0));
        }
        m3172((short) (iM3178 - this.f4841));
        m3172((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f4843) {
                i = 0;
                break;
            }
            int iCapacity = this.f4834.capacity() - this.f4842[i6];
            int i7 = this.f4835;
            short s = this.f4834.getShort(iCapacity);
            if (s == this.f4834.getShort(i7)) {
                int i8 = 2;
                while (true) {
                    if (i8 >= s) {
                        i = this.f4842[i6];
                        break loop2;
                    }
                    if (this.f4834.getShort(iCapacity + i8) != this.f4834.getShort(i7 + i8)) {
                        break;
                    }
                    i8 += 2;
                }
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.f4834.capacity() - iM3178;
            this.f4835 = iCapacity2;
            this.f4834.putInt(iCapacity2, i - iM3178);
        } else {
            int i9 = this.f4843;
            int[] iArr = this.f4842;
            if (i9 == iArr.length) {
                this.f4842 = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f4842;
            int i10 = this.f4843;
            this.f4843 = i10 + 1;
            iArr2[i10] = m3178();
            ByteBuffer byteBuffer2 = this.f4834;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM3178, m3178() - iM3178);
        }
        this.f4839 = false;
        return iM3178;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int m3176() {
        if (!this.f4839) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f4839 = false;
        int i = this.f4844;
        ByteBuffer byteBuffer = this.f4834;
        int i2 = this.f4835 - 4;
        this.f4835 = i2;
        byteBuffer.putInt(i2, i);
        return m3178();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3177(int i) {
        m3179(this.f4836, 4);
        m3170(i);
        this.f4834.position(this.f4835);
        this.f4840 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int m3178() {
        return this.f4834.capacity() - this.f4835;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3179(int i, int i2) {
        int i3;
        if (i > this.f4836) {
            this.f4836 = i;
        }
        int i4 = ((~((this.f4834.capacity() - this.f4835) + i2)) + 1) & (i - 1);
        while (this.f4835 < i4 + i + i2) {
            int iCapacity = this.f4834.capacity();
            ByteBuffer byteBuffer = this.f4834;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f4845.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f4834 = byteBufferOrder;
            this.f4835 = (byteBufferOrder.capacity() - iCapacity) + this.f4835;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f4834;
            int i6 = this.f4835 - 1;
            this.f4835 = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3180(int i) {
        this.f4837[i] = m3178();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3181(int i) {
        if (this.f4839) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f4837;
        if (iArr == null || iArr.length < i) {
            this.f4837 = new int[i];
        }
        this.f4838 = i;
        Arrays.fill(this.f4837, 0, i, 0);
        this.f4839 = true;
        this.f4841 = m3178();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3182(int i, int i2, int i3) {
        if (this.f4839) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f4844 = i2;
        int i4 = i * i2;
        m3179(4, i4);
        m3179(i3, i4);
        this.f4839 = true;
    }
}
