package p000;

import com.alibaba.fastjson2.JSONB;
import com.umeng.analytics.pro.ek;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0539 implements Serializable, Comparable {

    public static final C0539 f2244 = new C0539(new byte[0]);

    public final byte[] f2245;

    public transient int f2246;

    public transient String f2247;

    public C0539(byte[] bArr) {
        this.f2245 = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0539 c0539 = (C0539) obj;
        int iMo1870 = mo1870();
        int iMo1871 = c0539.mo1870();
        int iMin = Math.min(iMo1870, iMo1871);
        for (int i = 0; i < iMin; i++) {
            int iMo1873 = mo1873(i) & 255;
            int iMo1874 = c0539.mo1873(i) & 255;
            if (iMo1873 != iMo1874) {
                return iMo1873 < iMo1874 ? -1 : 1;
            }
        }
        if (iMo1870 == iMo1871) {
            return 0;
        }
        return iMo1870 < iMo1871 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0539) {
            C0539 c0539 = (C0539) obj;
            int iMo1870 = c0539.mo1870();
            byte[] bArr = this.f2245;
            if (iMo1870 == bArr.length && c0539.mo1875(bArr, 0, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f2246;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f2245);
        this.f2246 = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.f2245;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            byte b2 = bArr[0];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (false) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = 3;
                        if (length > 3) {
                            byte b3 = bArr[1];
                            if (true) {
                                if (false) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & -64) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & -64) != 128) {
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
                            if (false) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = 2;
                        if (length > 2) {
                            byte b6 = bArr[1];
                            if (true) {
                                if (false) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & -64) != 128) {
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
                            if (false) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = 1;
                    if (length > 1) {
                        byte b8 = bArr[1];
                        if (true) {
                            if (false) {
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
                        if (false) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = 1;
                if (false) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((false || b2 >= 32) && (127 > b2 || false))) && true) {
                    0 += 1;
                    0++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((false || b >= 32) && (127 > b || false))) && true) {
                                i3 += 1;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strM1877 = m1877();
            String strM4857 = AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(strM1877.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM1877.length()) {
                return AbstractC2784.m4749("[text=", strM4857, ']');
            }
            return "[size=" + bArr.length + " text=" + strM4857 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo1871() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (false) {
            throw new IllegalArgumentException(AbstractC2784.m4750(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((false ? this : new C0539(AbstractC0270.m1384(0, 64, bArr))).mo1871());
        sb.append("…]");
        return sb.toString();
    }

    public String mo1868() {
        byte[] bArr = AbstractC0047.f977;
        byte[] bArr2 = this.f2245;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC0599.f2413);
    }

    public C0539 mo1869(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f2245, 0, mo1870());
        return new C0539(messageDigest.digest());
    }

    public int mo1870() {
        return this.f2245.length;
    }

    public String mo1871() {
        byte[] bArr = this.f2245;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC0743.f2837;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte[] mo1872() {
        return this.f2245;
    }

    public byte mo1873(int i) {
        return this.f2245[i];
    }

    public boolean mo1874(C0539 c0539, int i) {
        return c0539.mo1875(this.f2245, 0, 0, i);
    }

    public boolean mo1875(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f2245;
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

    public C0539 mo1876() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f2245;
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
                return new C0539(bArrCopyOf);
            }
            i++;
        }
    }

    public final String m1877() {
        String str = this.f2247;
        if (str != null) {
            return str;
        }
        String str2 = new String(mo1872(), AbstractC0599.f2413);
        this.f2247 = str2;
        return str2;
    }

    public void mo1878(int i, C0504 c0504) {
        c0504.write(this.f2245, 0, i);
    }
}
