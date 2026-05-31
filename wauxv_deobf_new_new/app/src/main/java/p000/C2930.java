package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᲁᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2930 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f9370;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f9371;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f9372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2929[] f9373 = new C2929[bc.e];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f9374 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0493 f9375 = new C0493();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f9376;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C2929[] f9377;

    public C2930(C0706 c0706) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2929 m4928(Object obj) {
        if (obj instanceof Integer) {
            return m4929(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m4929(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m4929(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m4929(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m4929(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m4929(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return m4930(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m4930(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return m4933(8, (String) obj);
        }
        if (!(obj instanceof C3506)) {
            throw new IllegalArgumentException("value " + obj);
        }
        C3506 c3506 = (C3506) obj;
        int i = c3506.f11080;
        if (i == 12) {
            i = 10;
        }
        if (i == 10) {
            return m4933(7, c3506.f11081.substring(c3506.f11082, c3506.f11083));
        }
        return i == 11 ? m4933(16, c3506.m5039()) : m4933(7, c3506.m5039());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2929 m4929(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C2929 c2929M4936 = m4936(i3); c2929M4936 != null; c2929M4936 = c2929M4936.f9369) {
            if (c2929M4936.f9362 == i && c2929M4936.f9368 == i3 && c2929M4936.f9366 == i2) {
                return c2929M4936;
            }
        }
        C0493 c0493 = this.f9375;
        c0493.m1915(i);
        c0493.m1917(i2);
        int i4 = this.f9374;
        this.f9374 = i4 + 1;
        C2929 c2929 = new C2929(i4, i, i2, i3);
        m4937(c2929);
        return c2929;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2929 m4930(int i, long j) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        int i4 = (i + i2 + i3) & Integer.MAX_VALUE;
        for (C2929 c2929M4936 = m4936(i4); c2929M4936 != null; c2929M4936 = c2929M4936.f9369) {
            if (c2929M4936.f9362 == i && c2929M4936.f9368 == i4 && c2929M4936.f9366 == j) {
                return c2929M4936;
            }
        }
        int i5 = this.f9374;
        C0493 c0493 = this.f9375;
        c0493.m1915(i);
        int i6 = c0493.f2147;
        int i7 = i6 + 8;
        if (i7 > c0493.f2146.length) {
            c0493.m1905(8);
        }
        byte[] bArr = c0493.f2146;
        bArr[i6] = (byte) (i3 >>> 24);
        bArr[i6 + 1] = (byte) (i3 >>> 16);
        bArr[i6 + 2] = (byte) (i3 >>> 8);
        bArr[i6 + 3] = (byte) i3;
        bArr[i6 + 4] = (byte) (i2 >>> 24);
        bArr[i6 + 5] = (byte) (i2 >>> 16);
        bArr[i6 + 6] = (byte) (i2 >>> 8);
        bArr[i6 + 7] = (byte) i2;
        c0493.f2147 = i7;
        this.f9374 += 2;
        C2929 c2929 = new C2929(i5, i, j, i4);
        m4937(c2929);
        return c2929;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2929 m4931(int i, String str, String str2, String str3) {
        C0493 c0493;
        int i2;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C2929 c2929M4936 = m4936(iHashCode); c2929M4936 != null; c2929M4936 = c2929M4936.f9369) {
            if (c2929M4936.f9362 == i && c2929M4936.f9368 == iHashCode && c2929M4936.f9363.equals(str) && c2929M4936.f9364.equals(str2) && c2929M4936.f9365.equals(str3)) {
                return c2929M4936;
            }
        }
        int i3 = m4933(7, str).f9361;
        int iHashCode2 = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode()) + 12);
        C2929 c2929M4937 = m4936(iHashCode2);
        while (true) {
            c0493 = this.f9375;
            if (c2929M4937 == null) {
                c0493.m1914(12, m4932(str2), m4932(str3));
                int i4 = this.f9374;
                this.f9374 = i4 + 1;
                m4937(new C2929(i4, str2, str3, iHashCode2));
                i2 = i4;
                break;
            }
            if (c2929M4937.f9362 == 12 && c2929M4937.f9368 == iHashCode2 && c2929M4937.f9364.equals(str2) && c2929M4937.f9365.equals(str3)) {
                i2 = c2929M4937.f9361;
                break;
            }
            c2929M4937 = c2929M4937.f9369;
        }
        c0493.m1914(i, i3, i2);
        int i5 = this.f9374;
        this.f9374 = i5 + 1;
        C2929 c2929 = new C2929(i5, i, str, str2, str3, 0L, iHashCode);
        m4937(c2929);
        return c2929;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m4932(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C2929 c2929M4936 = m4936(iHashCode); c2929M4936 != null; c2929M4936 = c2929M4936.f9369) {
            if (c2929M4936.f9362 == 1 && c2929M4936.f9368 == iHashCode && c2929M4936.f9365.equals(str)) {
                return c2929M4936.f9361;
            }
        }
        C0493 c0493 = this.f9375;
        c0493.m1915(1);
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException();
        }
        int i = c0493.f2147;
        int i2 = i + 2;
        if (i2 + length > c0493.f2146.length) {
            c0493.m1905(length + 2);
        }
        byte[] bArr = c0493.f2146;
        bArr[i] = (byte) (length >>> 8);
        bArr[i + 1] = (byte) length;
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 1 || cCharAt > 127) {
                c0493.f2147 = i2;
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
                int i6 = c0493.f2147;
                int i7 = i6 - i3;
                int i8 = i7 - 2;
                if (i8 >= 0) {
                    byte[] bArr2 = c0493.f2146;
                    bArr2[i8] = (byte) (i5 >>> 8);
                    bArr2[i7 - 1] = (byte) i5;
                }
                if ((i6 + i5) - i3 > c0493.f2146.length) {
                    c0493.m1905(i5 - i3);
                }
                int i9 = c0493.f2147;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (cCharAt3 >= 1 && cCharAt3 <= 127) {
                        c0493.f2146[i9] = (byte) cCharAt3;
                        i9++;
                    } else if (cCharAt3 <= 2047) {
                        byte[] bArr3 = c0493.f2146;
                        int i10 = i9 + 1;
                        bArr3[i9] = (byte) (((cCharAt3 >> 6) & 31) | Opcodes.CHECKCAST);
                        i9 += 2;
                        bArr3[i10] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        byte[] bArr4 = c0493.f2146;
                        bArr4[i9] = (byte) (((cCharAt3 >> '\f') & 15) | 224);
                        int i11 = i9 + 2;
                        bArr4[i9 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                        i9 += 3;
                        bArr4[i11] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i3++;
                }
                c0493.f2147 = i9;
                int i12 = this.f9374;
                this.f9374 = i12 + 1;
                m4937(new C2929(i12, str, 1, iHashCode));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c0493.f2147 = i2;
        int i13 = this.f9374;
        this.f9374 = i13 + 1;
        m4937(new C2929(i13, str, 1, iHashCode));
        return i13;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2929 m4933(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C2929 c2929M4936 = m4936(iHashCode); c2929M4936 != null; c2929M4936 = c2929M4936.f9369) {
            if (c2929M4936.f9362 == i && c2929M4936.f9368 == iHashCode && c2929M4936.f9365.equals(str)) {
                return c2929M4936;
            }
        }
        this.f9375.m1913(i, m4932(str));
        int i2 = this.f9374;
        this.f9374 = i2 + 1;
        C2929 c2929 = new C2929(i2, str, i, iHashCode);
        m4937(c2929);
        return c2929;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m4934(C2929 c2929) {
        if (this.f9377 == null) {
            this.f9377 = new C2929[16];
        }
        int i = this.f9376;
        C2929[] c2929Arr = this.f9377;
        if (i == c2929Arr.length) {
            C2929[] c2929Arr2 = new C2929[c2929Arr.length * 2];
            System.arraycopy(c2929Arr, 0, c2929Arr2, 0, c2929Arr.length);
            this.f9377 = c2929Arr2;
        }
        C2929[] c2929Arr3 = this.f9377;
        int i2 = this.f9376;
        this.f9376 = i2 + 1;
        c2929Arr3[i2] = c2929;
        m4937(c2929);
        return c2929.f9361;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m4935(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C2929 c2929M4936 = m4936(iHashCode); c2929M4936 != null; c2929M4936 = c2929M4936.f9369) {
            if (c2929M4936.f9362 == 128 && c2929M4936.f9368 == iHashCode && c2929M4936.f9365.equals(str)) {
                return c2929M4936.f9361;
            }
        }
        return m4934(new C2929(this.f9376, str, 128, iHashCode));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2929 m4936(int i) {
        C2929[] c2929Arr = this.f9373;
        return c2929Arr[i % c2929Arr.length];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4937(C2929 c2929) {
        int i = this.f9372;
        C2929[] c2929Arr = this.f9373;
        if (i > (c2929Arr.length * 3) / 4) {
            int length = c2929Arr.length;
            int i2 = (length * 2) + 1;
            C2929[] c2929Arr2 = new C2929[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C2929 c29210 = this.f9373[i3];
                while (c29210 != null) {
                    int i4 = c29210.f9368 % i2;
                    C2929 c29211 = c29210.f9369;
                    c29210.f9369 = c2929Arr2[i4];
                    c2929Arr2[i4] = c29210;
                    c29210 = c29211;
                }
            }
            this.f9373 = c2929Arr2;
        }
        this.f9372++;
        int i5 = c2929.f9368;
        C2929[] c2929Arr3 = this.f9373;
        int length2 = i5 % c2929Arr3.length;
        c2929.f9369 = c2929Arr3[length2];
        c2929Arr3[length2] = c2929;
    }
}
