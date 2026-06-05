package p000;

import com.alibaba.fastjson2.JSONB;
import com.umeng.analytics.pro.ek;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2633Ujhhgtgfeyxiexzf implements Serializable, Comparable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C2633Ujhhgtgfeyxiexzf f8466Ujhhgtgfeyxiexzf = new C2633Ujhhgtgfeyxiexzf(new byte[0]);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final byte[] f8467Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public transient int f8468Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public transient String f8469Ujhhgtgfeyxiexzf;

    public C2633Ujhhgtgfeyxiexzf(byte[] bArr) {
        this.f8467Ujhhgtgfeyxiexzf = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = new C2633Ujhhgtgfeyxiexzf(bArr);
        Field declaredField = C2633Ujhhgtgfeyxiexzf.class.getDeclaredField("上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ");
        declaredField.setAccessible(true);
        declaredField.set(this, c2633Ujhhgtgfeyxiexzf.f8467Ujhhgtgfeyxiexzf);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f8467Ujhhgtgfeyxiexzf.length);
        objectOutputStream.write(this.f8467Ujhhgtgfeyxiexzf);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = (C2633Ujhhgtgfeyxiexzf) obj;
        int iMo2578Ujhhgtgfeyxiexzf = mo2578Ujhhgtgfeyxiexzf();
        int iMo2578Ujhhgtgfeyxiexzf2 = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
        int iMin = Math.min(iMo2578Ujhhgtgfeyxiexzf, iMo2578Ujhhgtgfeyxiexzf2);
        for (int i = 0; i < iMin; i++) {
            int iMo2581Ujhhgtgfeyxiexzf = mo2581Ujhhgtgfeyxiexzf(i) & 255;
            int iMo2581Ujhhgtgfeyxiexzf2 = c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i) & 255;
            if (iMo2581Ujhhgtgfeyxiexzf != iMo2581Ujhhgtgfeyxiexzf2) {
                return iMo2581Ujhhgtgfeyxiexzf < iMo2581Ujhhgtgfeyxiexzf2 ? -1 : 1;
            }
        }
        if (iMo2578Ujhhgtgfeyxiexzf == iMo2578Ujhhgtgfeyxiexzf2) {
            return 0;
        }
        return iMo2578Ujhhgtgfeyxiexzf < iMo2578Ujhhgtgfeyxiexzf2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2633Ujhhgtgfeyxiexzf) {
            C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = (C2633Ujhhgtgfeyxiexzf) obj;
            int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
            byte[] bArr = this.f8467Ujhhgtgfeyxiexzf;
            if (iMo2578Ujhhgtgfeyxiexzf == bArr.length && c2633Ujhhgtgfeyxiexzf.mo2583Ujhhgtgfeyxiexzf(bArr, 0, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f8468Ujhhgtgfeyxiexzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f8467Ujhhgtgfeyxiexzf);
        this.f8468Ujhhgtgfeyxiexzf = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.f8467Ujhhgtgfeyxiexzf;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strM3968Ujhhgtgfeyxiexzf = m3968Ujhhgtgfeyxiexzf();
            String strM2681feyxiexzfUjhhgtg = AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM3968Ujhhgtgfeyxiexzf.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM3968Ujhhgtgfeyxiexzf.length()) {
                return AbstractC1225feyxiexzfUjhhgtg.m2704Ujhhgtgfeyxiexzf("[text=", strM2681feyxiexzfUjhhgtg, ']');
            }
            return "[size=" + this.f8467Ujhhgtgfeyxiexzf.length + " text=" + strM2681feyxiexzfUjhhgtg + "…]";
        }
        if (this.f8467Ujhhgtgfeyxiexzf.length <= 64) {
            return "[hex=" + mo2579Ujhhgtgfeyxiexzf() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.f8467Ujhhgtgfeyxiexzf.length);
        sb.append(" hex=");
        byte[] bArr2 = this.f8467Ujhhgtgfeyxiexzf;
        if (64 > bArr2.length) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4802Ujhhgtgfeyxiexzf(new StringBuilder("endIndex > length("), this.f8467Ujhhgtgfeyxiexzf.length, ')').toString());
        }
        sb.append((64 == bArr2.length ? this : new C2633Ujhhgtgfeyxiexzf(AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(0, 64, bArr2))).mo2579Ujhhgtgfeyxiexzf());
        sb.append("…]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public String mo2576Ujhhgtgfeyxiexzf() {
        byte[] bArr = this.f8467Ujhhgtgfeyxiexzf;
        byte[] bArr2 = AbstractC2917Ujhhgtgfeyxiexzf.f9201Ujhhgtgfeyxiexzf;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & ek.m) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & JSONB.Constants.BC_INT32_BYTE_MAX];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & ek.m) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public C2633Ujhhgtgfeyxiexzf mo2577Ujhhgtgfeyxiexzf(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f8467Ujhhgtgfeyxiexzf, 0, mo2578Ujhhgtgfeyxiexzf());
        return new C2633Ujhhgtgfeyxiexzf(messageDigest.digest());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public int mo2578Ujhhgtgfeyxiexzf() {
        return this.f8467Ujhhgtgfeyxiexzf.length;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public String mo2579Ujhhgtgfeyxiexzf() {
        byte[] bArr = this.f8467Ujhhgtgfeyxiexzf;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC2855feyxiexzfUjhhgtg.f9109Ujhhgtgfeyxiexzf;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & ek.m];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public byte[] mo2580Ujhhgtgfeyxiexzf() {
        return this.f8467Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public byte mo2581Ujhhgtgfeyxiexzf(int i) {
        return this.f8467Ujhhgtgfeyxiexzf[i];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public boolean mo2582Ujhhgtgfeyxiexzf(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, int i) {
        return c2633Ujhhgtgfeyxiexzf.mo2583Ujhhgtgfeyxiexzf(this.f8467Ujhhgtgfeyxiexzf, 0, 0, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public boolean mo2583Ujhhgtgfeyxiexzf(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f8467Ujhhgtgfeyxiexzf;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public C2633Ujhhgtgfeyxiexzf mo2584Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f8467Ujhhgtgfeyxiexzf;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C2633Ujhhgtgfeyxiexzf(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final String m3968Ujhhgtgfeyxiexzf() {
        String str = this.f8469Ujhhgtgfeyxiexzf;
        if (str != null) {
            return str;
        }
        String str2 = new String(mo2580Ujhhgtgfeyxiexzf(), AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        this.f8469Ujhhgtgfeyxiexzf = str2;
        return str2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public void mo2585Ujhhgtgfeyxiexzf(int i, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) {
        c2598feyxiexzfUjhhgtg.write(this.f8467Ujhhgtgfeyxiexzf, 0, i);
    }
}
