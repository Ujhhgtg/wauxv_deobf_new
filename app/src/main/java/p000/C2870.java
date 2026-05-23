package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲁᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2870 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f9200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f9201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f9202;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2869[] f9203 = new C2869[bc.e];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f9204 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0516 f9205 = new C0516();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f9206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C2869[] f9207;

    public C2870(C0711 c0711) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2869 m4867(Object obj) {
        if (obj instanceof Integer) {
            return m4868(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m4868(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m4868(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m4868(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m4868(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m4868(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return m4869(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m4869(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return m4872(8, (String) obj);
        }
        if (!(obj instanceof C3449)) {
            throw new IllegalArgumentException("value " + obj);
        }
        C3449 c3449 = (C3449) obj;
        int i = c3449.f10920;
        if (i == 12) {
            i = 10;
        }
        if (i == 10) {
            return m4872(7, c3449.f10921.substring(c3449.f10922, c3449.f10923));
        }
        return i == 11 ? m4872(16, c3449.m4982()) : m4872(7, c3449.m4982());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2869 m4868(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C2869 c2869M4875 = m4875(i3); c2869M4875 != null; c2869M4875 = c2869M4875.f9199) {
            if (c2869M4875.f9192 == i && c2869M4875.f9198 == i3 && c2869M4875.f9196 == i2) {
                return c2869M4875;
            }
        }
        C0516 c0516 = this.f9205;
        c0516.m1821(i);
        c0516.m1823(i2);
        int i4 = this.f9204;
        this.f9204 = i4 + 1;
        C2869 c2869 = new C2869(i4, i, i2, i3);
        m4876(c2869);
        return c2869;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2869 m4869(int i, long j) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        int i4 = (i + i2 + i3) & Integer.MAX_VALUE;
        for (C2869 c2869M4875 = m4875(i4); c2869M4875 != null; c2869M4875 = c2869M4875.f9199) {
            if (c2869M4875.f9192 == i && c2869M4875.f9198 == i4 && c2869M4875.f9196 == j) {
                return c2869M4875;
            }
        }
        int i5 = this.f9204;
        C0516 c0516 = this.f9205;
        c0516.m1821(i);
        int i6 = c0516.f2191;
        int i7 = i6 + 8;
        if (i7 > c0516.f2190.length) {
            c0516.m1811(8);
        }
        byte[] bArr = c0516.f2190;
        bArr[i6] = (byte) (i3 >>> 24);
        bArr[i6 + 1] = (byte) (i3 >>> 16);
        bArr[i6 + 2] = (byte) (i3 >>> 8);
        bArr[i6 + 3] = (byte) i3;
        bArr[i6 + 4] = (byte) (i2 >>> 24);
        bArr[i6 + 5] = (byte) (i2 >>> 16);
        bArr[i6 + 6] = (byte) (i2 >>> 8);
        bArr[i6 + 7] = (byte) i2;
        c0516.f2191 = i7;
        this.f9204 += 2;
        C2869 c2869 = new C2869(i5, i, j, i4);
        m4876(c2869);
        return c2869;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2869 m4870(int i, String str, String str2, String str3) {
        C0516 c0516;
        int i2;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C2869 c2869M4875 = m4875(iHashCode); c2869M4875 != null; c2869M4875 = c2869M4875.f9199) {
            if (c2869M4875.f9192 == i && c2869M4875.f9198 == iHashCode && c2869M4875.f9193.equals(str) && c2869M4875.f9194.equals(str2) && c2869M4875.f9195.equals(str3)) {
                return c2869M4875;
            }
        }
        int i3 = m4872(7, str).f9191;
        int iHashCode2 = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode()) + 12);
        C2869 c2869M4876 = m4875(iHashCode2);
        while (true) {
            c0516 = this.f9205;
            if (c2869M4876 == null) {
                c0516.m1820(12, m4871(str2), m4871(str3));
                int i4 = this.f9204;
                this.f9204 = i4 + 1;
                m4876(new C2869(i4, str2, str3, iHashCode2));
                i2 = i4;
                break;
            }
            if (c2869M4876.f9192 == 12 && c2869M4876.f9198 == iHashCode2 && c2869M4876.f9194.equals(str2) && c2869M4876.f9195.equals(str3)) {
                i2 = c2869M4876.f9191;
                break;
            }
            c2869M4876 = c2869M4876.f9199;
        }
        c0516.m1820(i, i3, i2);
        int i5 = this.f9204;
        this.f9204 = i5 + 1;
        C2869 c2869 = new C2869(i5, i, str, str2, str3, 0L, iHashCode);
        m4876(c2869);
        return c2869;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m4871(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C2869 c2869M4875 = m4875(iHashCode); c2869M4875 != null; c2869M4875 = c2869M4875.f9199) {
            if (c2869M4875.f9192 == 1 && c2869M4875.f9198 == iHashCode && c2869M4875.f9195.equals(str)) {
                return c2869M4875.f9191;
            }
        }
        C0516 c0516 = this.f9205;
        c0516.m1821(1);
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException();
        }
        int i = c0516.f2191;
        int i2 = i + 2;
        if (i2 + length > c0516.f2190.length) {
            c0516.m1811(length + 2);
        }
        byte[] bArr = c0516.f2190;
        bArr[i] = (byte) (length >>> 8);
        bArr[i + 1] = (byte) length;
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 1 || cCharAt > 127) {
                c0516.f2191 = i2;
                int length2 = str.length();
                int i4 = i3;
                int i5 = i4;
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    i5 = (cCharAt2 < 1 || cCharAt2 > 127) ? cCharAt2 <= 2047 ? i5 + 2 : i5 + 3 : i5 + 1;
                    i4++;
                }
                if (i5 > 65535) {
                    throw new IllegalArgumentException();
                }
                int i6 = c0516.f2191;
                int i7 = i6 - i3;
                int i8 = i7 - 2;
                if (i8 >= 0) {
                    byte[] bArr2 = c0516.f2190;
                    bArr2[i8] = (byte) (i5 >>> 8);
                    bArr2[i7 - 1] = (byte) i5;
                }
                if ((i6 + i5) - i3 > c0516.f2190.length) {
                    c0516.m1811(i5 - i3);
                }
                int i9 = c0516.f2191;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (cCharAt3 >= 1 && cCharAt3 <= 127) {
                        c0516.f2190[i9] = (byte) cCharAt3;
                        i9++;
                    } else if (cCharAt3 <= 2047) {
                        byte[] bArr3 = c0516.f2190;
                        int i10 = i9 + 1;
                        bArr3[i9] = (byte) (((cCharAt3 >> 6) & 31) | Opcodes.CHECKCAST);
                        i9 += 2;
                        bArr3[i10] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        byte[] bArr4 = c0516.f2190;
                        bArr4[i9] = (byte) (((cCharAt3 >> '\f') & 15) | 224);
                        int i11 = i9 + 2;
                        bArr4[i9 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                        i9 += 3;
                        bArr4[i11] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i3++;
                }
                c0516.f2191 = i9;
                int i12 = this.f9204;
                this.f9204 = i12 + 1;
                m4876(new C2869(i12, str, 1, iHashCode));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c0516.f2191 = i2;
        int i13 = this.f9204;
        this.f9204 = i13 + 1;
        m4876(new C2869(i13, str, 1, iHashCode));
        return i13;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2869 m4872(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C2869 c2869M4875 = m4875(iHashCode); c2869M4875 != null; c2869M4875 = c2869M4875.f9199) {
            if (c2869M4875.f9192 == i && c2869M4875.f9198 == iHashCode && c2869M4875.f9195.equals(str)) {
                return c2869M4875;
            }
        }
        this.f9205.m1819(i, m4871(str));
        int i2 = this.f9204;
        this.f9204 = i2 + 1;
        C2869 c2869 = new C2869(i2, str, i, iHashCode);
        m4876(c2869);
        return c2869;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m4873(C2869 c2869) {
        if (this.f9207 == null) {
            this.f9207 = new C2869[16];
        }
        int i = this.f9206;
        C2869[] c2869Arr = this.f9207;
        if (i == c2869Arr.length) {
            C2869[] c2869Arr2 = new C2869[c2869Arr.length * 2];
            System.arraycopy(c2869Arr, 0, c2869Arr2, 0, c2869Arr.length);
            this.f9207 = c2869Arr2;
        }
        C2869[] c2869Arr3 = this.f9207;
        int i2 = this.f9206;
        this.f9206 = i2 + 1;
        c2869Arr3[i2] = c2869;
        m4876(c2869);
        return c2869.f9191;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m4874(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C2869 c2869M4875 = m4875(iHashCode); c2869M4875 != null; c2869M4875 = c2869M4875.f9199) {
            if (c2869M4875.f9192 == 128 && c2869M4875.f9198 == iHashCode && c2869M4875.f9195.equals(str)) {
                return c2869M4875.f9191;
            }
        }
        return m4873(new C2869(this.f9206, str, 128, iHashCode));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2869 m4875(int i) {
        C2869[] c2869Arr = this.f9203;
        return c2869Arr[i % c2869Arr.length];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4876(C2869 c2869) {
        int i = this.f9202;
        C2869[] c2869Arr = this.f9203;
        if (i > (c2869Arr.length * 3) / 4) {
            int length = c2869Arr.length;
            int i2 = (length * 2) + 1;
            C2869[] c2869Arr2 = new C2869[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C2869 c28610 = this.f9203[i3];
                while (c28610 != null) {
                    int i4 = c28610.f9198 % i2;
                    C2869 c28611 = c28610.f9199;
                    c28610.f9199 = c2869Arr2[i4];
                    c2869Arr2[i4] = c28610;
                    c28610 = c28611;
                }
            }
            this.f9203 = c2869Arr2;
        }
        this.f9202++;
        int i5 = c2869.f9198;
        C2869[] c2869Arr3 = this.f9203;
        int length2 = i5 % c2869Arr3.length;
        c2869.f9199 = c2869Arr3[length2];
        c2869Arr3[length2] = c2869;
    }
}
