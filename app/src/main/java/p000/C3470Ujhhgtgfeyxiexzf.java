package p000;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3470Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public ByteBuffer f10782Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f10783Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f10784Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int[] f10785Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f10787Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f10788Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f10789Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int[] f10790Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10791Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f10792Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C3382feyxiexzfUjhhgtg f10793Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final C0420Ujhhgtgfeyxiexzf f10794Ujhhgtgfeyxiexzf;

    public C3470Ujhhgtgfeyxiexzf() {
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10559Ujhhgtgfeyxiexzf;
        if (C0420Ujhhgtgfeyxiexzf.f2255Ujhhgtgfeyxiexzf == null) {
            C0420Ujhhgtgfeyxiexzf.f2255Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(25);
        }
        C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = C0420Ujhhgtgfeyxiexzf.f2255Ujhhgtgfeyxiexzf;
        this.f10784Ujhhgtgfeyxiexzf = 1;
        this.f10785Ujhhgtgfeyxiexzf = null;
        this.f10786Ujhhgtgfeyxiexzf = 0;
        this.f10787Ujhhgtgfeyxiexzf = false;
        this.f10788Ujhhgtgfeyxiexzf = false;
        this.f10790Ujhhgtgfeyxiexzf = new int[16];
        this.f10791Ujhhgtgfeyxiexzf = 0;
        this.f10792Ujhhgtgfeyxiexzf = 0;
        this.f10793Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f10782Ujhhgtgfeyxiexzf = byteBufferOrder;
        this.f10794Ujhhgtgfeyxiexzf = c0420Ujhhgtgfeyxiexzf;
        this.f10783Ujhhgtgfeyxiexzf = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4954Ujhhgtgfeyxiexzf(byte b) {
        m4965Ujhhgtgfeyxiexzf(1, 0);
        ByteBuffer byteBuffer = this.f10782Ujhhgtgfeyxiexzf;
        int i = this.f10783Ujhhgtgfeyxiexzf - 1;
        this.f10783Ujhhgtgfeyxiexzf = i;
        byteBuffer.put(i, b);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m4955Ujhhgtgfeyxiexzf(byte b, int i) {
        if (b != 0) {
            m4954Ujhhgtgfeyxiexzf(b);
            m4966Ujhhgtgfeyxiexzf(i);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4956Ujhhgtgfeyxiexzf(int i) {
        m4965Ujhhgtgfeyxiexzf(4, 0);
        int iM4964Ujhhgtgfeyxiexzf = (m4964Ujhhgtgfeyxiexzf() - i) + 4;
        ByteBuffer byteBuffer = this.f10782Ujhhgtgfeyxiexzf;
        int i2 = this.f10783Ujhhgtgfeyxiexzf - 4;
        this.f10783Ujhhgtgfeyxiexzf = i2;
        byteBuffer.putInt(i2, iM4964Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m4957Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i2 != 0) {
            m4956Ujhhgtgfeyxiexzf(i2);
            m4966Ujhhgtgfeyxiexzf(i);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m4958Ujhhgtgfeyxiexzf(short s) {
        m4965Ujhhgtgfeyxiexzf(2, 0);
        ByteBuffer byteBuffer = this.f10782Ujhhgtgfeyxiexzf;
        int i = this.f10783Ujhhgtgfeyxiexzf - 2;
        this.f10783Ujhhgtgfeyxiexzf = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m4959Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = this.f10794Ujhhgtgfeyxiexzf;
        c0420Ujhhgtgfeyxiexzf.getClass();
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
                                    throw new C0670Ujhhgtgfeyxiexzf(i5, length2);
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
        m4954Ujhhgtgfeyxiexzf((byte) 0);
        m4968Ujhhgtgfeyxiexzf(1, i6, 1);
        ByteBuffer byteBuffer = this.f10782Ujhhgtgfeyxiexzf;
        int i8 = this.f10783Ujhhgtgfeyxiexzf - i6;
        this.f10783Ujhhgtgfeyxiexzf = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.f10782Ujhhgtgfeyxiexzf;
        c0420Ujhhgtgfeyxiexzf.getClass();
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
                                    throw new C0670Ujhhgtgfeyxiexzf(i4, length3);
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
                            throw new C0670Ujhhgtgfeyxiexzf(i4 - 1, length3);
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
                                throw new C0670Ujhhgtgfeyxiexzf(i4, length4);
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
        return m4962Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int m4960Ujhhgtgfeyxiexzf(int[] iArr) {
        if (this.f10787Ujhhgtgfeyxiexzf) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        m4968Ujhhgtgfeyxiexzf(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m4956Ujhhgtgfeyxiexzf(iArr[length]);
        }
        return m4962Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m4961Ujhhgtgfeyxiexzf() {
        int i;
        if (this.f10785Ujhhgtgfeyxiexzf == null || !this.f10787Ujhhgtgfeyxiexzf) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m4965Ujhhgtgfeyxiexzf(4, 0);
        ByteBuffer byteBuffer = this.f10782Ujhhgtgfeyxiexzf;
        int i2 = this.f10783Ujhhgtgfeyxiexzf - 4;
        this.f10783Ujhhgtgfeyxiexzf = i2;
        byteBuffer.putInt(i2, 0);
        int iM4964Ujhhgtgfeyxiexzf = m4964Ujhhgtgfeyxiexzf();
        int i3 = this.f10786Ujhhgtgfeyxiexzf - 1;
        while (i3 >= 0 && this.f10785Ujhhgtgfeyxiexzf[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f10785Ujhhgtgfeyxiexzf[i4];
            m4958Ujhhgtgfeyxiexzf((short) (i5 != 0 ? iM4964Ujhhgtgfeyxiexzf - i5 : 0));
        }
        m4958Ujhhgtgfeyxiexzf((short) (iM4964Ujhhgtgfeyxiexzf - this.f10789Ujhhgtgfeyxiexzf));
        m4958Ujhhgtgfeyxiexzf((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f10791Ujhhgtgfeyxiexzf) {
                i = 0;
                break;
            }
            int iCapacity = this.f10782Ujhhgtgfeyxiexzf.capacity() - this.f10790Ujhhgtgfeyxiexzf[i6];
            int i7 = this.f10783Ujhhgtgfeyxiexzf;
            short s = this.f10782Ujhhgtgfeyxiexzf.getShort(iCapacity);
            if (s == this.f10782Ujhhgtgfeyxiexzf.getShort(i7)) {
                int i8 = 2;
                while (true) {
                    if (i8 >= s) {
                        i = this.f10790Ujhhgtgfeyxiexzf[i6];
                        break loop2;
                    }
                    if (this.f10782Ujhhgtgfeyxiexzf.getShort(iCapacity + i8) != this.f10782Ujhhgtgfeyxiexzf.getShort(i7 + i8)) {
                        break;
                    }
                    i8 += 2;
                }
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.f10782Ujhhgtgfeyxiexzf.capacity() - iM4964Ujhhgtgfeyxiexzf;
            this.f10783Ujhhgtgfeyxiexzf = iCapacity2;
            this.f10782Ujhhgtgfeyxiexzf.putInt(iCapacity2, i - iM4964Ujhhgtgfeyxiexzf);
        } else {
            int i9 = this.f10791Ujhhgtgfeyxiexzf;
            int[] iArr = this.f10790Ujhhgtgfeyxiexzf;
            if (i9 == iArr.length) {
                this.f10790Ujhhgtgfeyxiexzf = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f10790Ujhhgtgfeyxiexzf;
            int i10 = this.f10791Ujhhgtgfeyxiexzf;
            this.f10791Ujhhgtgfeyxiexzf = i10 + 1;
            iArr2[i10] = m4964Ujhhgtgfeyxiexzf();
            ByteBuffer byteBuffer2 = this.f10782Ujhhgtgfeyxiexzf;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM4964Ujhhgtgfeyxiexzf, m4964Ujhhgtgfeyxiexzf() - iM4964Ujhhgtgfeyxiexzf);
        }
        this.f10787Ujhhgtgfeyxiexzf = false;
        return iM4964Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int m4962Ujhhgtgfeyxiexzf() {
        if (!this.f10787Ujhhgtgfeyxiexzf) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f10787Ujhhgtgfeyxiexzf = false;
        int i = this.f10792Ujhhgtgfeyxiexzf;
        ByteBuffer byteBuffer = this.f10782Ujhhgtgfeyxiexzf;
        int i2 = this.f10783Ujhhgtgfeyxiexzf - 4;
        this.f10783Ujhhgtgfeyxiexzf = i2;
        byteBuffer.putInt(i2, i);
        return m4964Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4963Ujhhgtgfeyxiexzf(int i) {
        m4965Ujhhgtgfeyxiexzf(this.f10784Ujhhgtgfeyxiexzf, 4);
        m4956Ujhhgtgfeyxiexzf(i);
        this.f10782Ujhhgtgfeyxiexzf.position(this.f10783Ujhhgtgfeyxiexzf);
        this.f10788Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int m4964Ujhhgtgfeyxiexzf() {
        return this.f10782Ujhhgtgfeyxiexzf.capacity() - this.f10783Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4965Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3;
        if (i > this.f10784Ujhhgtgfeyxiexzf) {
            this.f10784Ujhhgtgfeyxiexzf = i;
        }
        int i4 = ((~((this.f10782Ujhhgtgfeyxiexzf.capacity() - this.f10783Ujhhgtgfeyxiexzf) + i2)) + 1) & (i - 1);
        while (this.f10783Ujhhgtgfeyxiexzf < i4 + i + i2) {
            int iCapacity = this.f10782Ujhhgtgfeyxiexzf.capacity();
            ByteBuffer byteBuffer = this.f10782Ujhhgtgfeyxiexzf;
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
            this.f10793Ujhhgtgfeyxiexzf.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f10782Ujhhgtgfeyxiexzf = byteBufferOrder;
            this.f10783Ujhhgtgfeyxiexzf = (byteBufferOrder.capacity() - iCapacity) + this.f10783Ujhhgtgfeyxiexzf;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f10782Ujhhgtgfeyxiexzf;
            int i6 = this.f10783Ujhhgtgfeyxiexzf - 1;
            this.f10783Ujhhgtgfeyxiexzf = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m4966Ujhhgtgfeyxiexzf(int i) {
        this.f10785Ujhhgtgfeyxiexzf[i] = m4964Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m4967Ujhhgtgfeyxiexzf(int i) {
        if (this.f10787Ujhhgtgfeyxiexzf) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f10785Ujhhgtgfeyxiexzf;
        if (iArr == null || iArr.length < i) {
            this.f10785Ujhhgtgfeyxiexzf = new int[i];
        }
        this.f10786Ujhhgtgfeyxiexzf = i;
        Arrays.fill(this.f10785Ujhhgtgfeyxiexzf, 0, i, 0);
        this.f10787Ujhhgtgfeyxiexzf = true;
        this.f10789Ujhhgtgfeyxiexzf = m4964Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4968Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        if (this.f10787Ujhhgtgfeyxiexzf) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f10792Ujhhgtgfeyxiexzf = i2;
        int i4 = i * i2;
        m4965Ujhhgtgfeyxiexzf(4, i4);
        m4965Ujhhgtgfeyxiexzf(i3, i4);
        this.f10787Ujhhgtgfeyxiexzf = true;
    }
}
