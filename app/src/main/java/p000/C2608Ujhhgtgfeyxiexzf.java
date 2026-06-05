package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2608Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean f8411Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public byte[] f8412Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f8413Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f8414Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ArrayList f8415Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f8416Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f8417Ujhhgtgfeyxiexzf;

    public C2608Ujhhgtgfeyxiexzf() {
        this(new byte[1000], true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m3884Ujhhgtgfeyxiexzf() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3885Ujhhgtgfeyxiexzf(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f8413Ujhhgtgfeyxiexzf + i2) & (~i2);
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(i3);
        } else if (i3 > this.f8412Ujhhgtgfeyxiexzf.length) {
            m3884Ujhhgtgfeyxiexzf();
            throw null;
        }
        Arrays.fill(this.f8412Ujhhgtgfeyxiexzf, this.f8413Ujhhgtgfeyxiexzf, i3, (byte) 0);
        this.f8413Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3886Ujhhgtgfeyxiexzf(int i, String str) {
        int i2;
        if (this.f8415Ujhhgtgfeyxiexzf == null) {
            return;
        }
        m3889Ujhhgtgfeyxiexzf();
        int size = this.f8415Ujhhgtgfeyxiexzf.size();
        if (size == 0) {
            i2 = 0;
        } else {
            i2 = ((C2605Ujhhgtgfeyxiexzf) this.f8415Ujhhgtgfeyxiexzf.get(size - 1)).f8407Ujhhgtgfeyxiexzf;
        }
        int i3 = this.f8413Ujhhgtgfeyxiexzf;
        if (i2 <= i3) {
            i2 = i3;
        }
        this.f8415Ujhhgtgfeyxiexzf.add(new C2605Ujhhgtgfeyxiexzf(i2, i + i2, str));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3887Ujhhgtgfeyxiexzf(String str) {
        if (this.f8415Ujhhgtgfeyxiexzf == null) {
            return;
        }
        m3889Ujhhgtgfeyxiexzf();
        this.f8415Ujhhgtgfeyxiexzf.add(new C2605Ujhhgtgfeyxiexzf(this.f8413Ujhhgtgfeyxiexzf, Integer.MAX_VALUE, str));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m3888Ujhhgtgfeyxiexzf() {
        return this.f8415Ujhhgtgfeyxiexzf != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3889Ujhhgtgfeyxiexzf() {
        int size;
        ArrayList arrayList = this.f8415Ujhhgtgfeyxiexzf;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        C2605Ujhhgtgfeyxiexzf c2605Ujhhgtgfeyxiexzf = (C2605Ujhhgtgfeyxiexzf) this.f8415Ujhhgtgfeyxiexzf.get(size - 1);
        int i = this.f8413Ujhhgtgfeyxiexzf;
        if (c2605Ujhhgtgfeyxiexzf.f8407Ujhhgtgfeyxiexzf == Integer.MAX_VALUE) {
            c2605Ujhhgtgfeyxiexzf.f8407Ujhhgtgfeyxiexzf = i;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m3890Ujhhgtgfeyxiexzf(int i) {
        byte[] bArr = this.f8412Ujhhgtgfeyxiexzf;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f8413Ujhhgtgfeyxiexzf);
            this.f8412Ujhhgtgfeyxiexzf = bArr2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final byte[] m3891Ujhhgtgfeyxiexzf() {
        int i = this.f8413Ujhhgtgfeyxiexzf;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f8412Ujhhgtgfeyxiexzf, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3892Ujhhgtgfeyxiexzf(byte[] bArr) {
        int length = bArr.length;
        int i = this.f8413Ujhhgtgfeyxiexzf;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(i2);
        } else if (i2 > this.f8412Ujhhgtgfeyxiexzf.length) {
            m3884Ujhhgtgfeyxiexzf();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f8412Ujhhgtgfeyxiexzf, i, length);
        this.f8413Ujhhgtgfeyxiexzf = i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3893Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8413Ujhhgtgfeyxiexzf;
        int i3 = i2 + 1;
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(i3);
        } else if (i3 > this.f8412Ujhhgtgfeyxiexzf.length) {
            m3884Ujhhgtgfeyxiexzf();
            throw null;
        }
        this.f8412Ujhhgtgfeyxiexzf[i2] = (byte) i;
        this.f8413Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3894Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8413Ujhhgtgfeyxiexzf;
        int i3 = i2 + 4;
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(i3);
        } else if (i3 > this.f8412Ujhhgtgfeyxiexzf.length) {
            m3884Ujhhgtgfeyxiexzf();
            throw null;
        }
        byte[] bArr = this.f8412Ujhhgtgfeyxiexzf;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f8413Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3895Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8413Ujhhgtgfeyxiexzf;
        int i3 = i2 + 2;
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(i3);
        } else if (i3 > this.f8412Ujhhgtgfeyxiexzf.length) {
            m3884Ujhhgtgfeyxiexzf();
            throw null;
        }
        byte[] bArr = this.f8412Ujhhgtgfeyxiexzf;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f8413Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m3896Ujhhgtgfeyxiexzf(int i) {
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(this.f8413Ujhhgtgfeyxiexzf + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            m3893Ujhhgtgfeyxiexzf((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int m3897Ujhhgtgfeyxiexzf(int i) {
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(this.f8413Ujhhgtgfeyxiexzf + 5);
        }
        int i2 = this.f8413Ujhhgtgfeyxiexzf;
        while (true) {
            int i3 = i;
            i >>>= 7;
            if (i == 0) {
                m3893Ujhhgtgfeyxiexzf((byte) (i3 & 127));
                return this.f8413Ujhhgtgfeyxiexzf - i2;
            }
            m3893Ujhhgtgfeyxiexzf((byte) ((i3 & 127) | 128));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3898Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f8413Ujhhgtgfeyxiexzf + i;
        if (this.f8411Ujhhgtgfeyxiexzf) {
            m3890Ujhhgtgfeyxiexzf(i2);
        } else if (i2 > this.f8412Ujhhgtgfeyxiexzf.length) {
            m3884Ujhhgtgfeyxiexzf();
            throw null;
        }
        Arrays.fill(this.f8412Ujhhgtgfeyxiexzf, this.f8413Ujhhgtgfeyxiexzf, i2, (byte) 0);
        this.f8413Ujhhgtgfeyxiexzf = i2;
    }

    public C2608Ujhhgtgfeyxiexzf(byte[] bArr, boolean z) {
        this.f8411Ujhhgtgfeyxiexzf = z;
        this.f8412Ujhhgtgfeyxiexzf = bArr;
        this.f8413Ujhhgtgfeyxiexzf = 0;
        this.f8414Ujhhgtgfeyxiexzf = false;
        this.f8415Ujhhgtgfeyxiexzf = null;
        this.f8416Ujhhgtgfeyxiexzf = 0;
        this.f8417Ujhhgtgfeyxiexzf = 0;
    }
}
