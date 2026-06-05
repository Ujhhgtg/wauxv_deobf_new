package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛳᛴᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0267Ujhhgtgfeyxiexzf implements Cloneable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public /* synthetic */ boolean f1656Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public /* synthetic */ long[] f1657Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public /* synthetic */ Object[] f1658Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public /* synthetic */ int f1659Ujhhgtgfeyxiexzf;

    public C0267Ujhhgtgfeyxiexzf() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f1657Ujhhgtgfeyxiexzf = new long[i4];
        this.f1658Ujhhgtgfeyxiexzf = new Object[i4];
    }

    public final Object clone() {
        C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf = (C0267Ujhhgtgfeyxiexzf) super.clone();
        c0267Ujhhgtgfeyxiexzf.f1657Ujhhgtgfeyxiexzf = (long[]) this.f1657Ujhhgtgfeyxiexzf.clone();
        c0267Ujhhgtgfeyxiexzf.f1658Ujhhgtgfeyxiexzf = (Object[]) this.f1658Ujhhgtgfeyxiexzf.clone();
        return c0267Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        if (m1453Ujhhgtgfeyxiexzf() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1659Ujhhgtgfeyxiexzf * 28);
        sb.append('{');
        int i = this.f1659Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m1451Ujhhgtgfeyxiexzf(i2));
            sb.append('=');
            Object objM1454Ujhhgtgfeyxiexzf = m1454Ujhhgtgfeyxiexzf(i2);
            if (objM1454Ujhhgtgfeyxiexzf != sb) {
                sb.append(objM1454Ujhhgtgfeyxiexzf);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1449Ujhhgtgfeyxiexzf() {
        int i = this.f1659Ujhhgtgfeyxiexzf;
        Object[] objArr = this.f1658Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1659Ujhhgtgfeyxiexzf = 0;
        this.f1656Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object m1450Ujhhgtgfeyxiexzf(long j) {
        Object obj;
        int iM5148Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5148Ujhhgtgfeyxiexzf(this.f1657Ujhhgtgfeyxiexzf, this.f1659Ujhhgtgfeyxiexzf, j);
        if (iM5148Ujhhgtgfeyxiexzf < 0 || (obj = this.f1658Ujhhgtgfeyxiexzf[iM5148Ujhhgtgfeyxiexzf]) == AbstractC3611Ujhhgtgfeyxiexzf.f11232Ujhhgtgfeyxiexzf) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long m1451Ujhhgtgfeyxiexzf(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1659Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f1656Ujhhgtgfeyxiexzf) {
            long[] jArr = this.f1657Ujhhgtgfeyxiexzf;
            Object[] objArr = this.f1658Ujhhgtgfeyxiexzf;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3611Ujhhgtgfeyxiexzf.f11232Ujhhgtgfeyxiexzf) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1656Ujhhgtgfeyxiexzf = false;
            this.f1659Ujhhgtgfeyxiexzf = i3;
        }
        return this.f1657Ujhhgtgfeyxiexzf[i];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1452Ujhhgtgfeyxiexzf(Object obj, long j) {
        Object obj2 = AbstractC3611Ujhhgtgfeyxiexzf.f11232Ujhhgtgfeyxiexzf;
        int iM5148Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5148Ujhhgtgfeyxiexzf(this.f1657Ujhhgtgfeyxiexzf, this.f1659Ujhhgtgfeyxiexzf, j);
        if (iM5148Ujhhgtgfeyxiexzf >= 0) {
            this.f1658Ujhhgtgfeyxiexzf[iM5148Ujhhgtgfeyxiexzf] = obj;
            return;
        }
        int i = ~iM5148Ujhhgtgfeyxiexzf;
        int i2 = this.f1659Ujhhgtgfeyxiexzf;
        if (i < i2) {
            Object[] objArr = this.f1658Ujhhgtgfeyxiexzf;
            if (objArr[i] == obj2) {
                this.f1657Ujhhgtgfeyxiexzf[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f1656Ujhhgtgfeyxiexzf) {
            long[] jArr = this.f1657Ujhhgtgfeyxiexzf;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f1658Ujhhgtgfeyxiexzf;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f1656Ujhhgtgfeyxiexzf = false;
                this.f1659Ujhhgtgfeyxiexzf = i3;
                i = ~AbstractC3593Ujhhgtgfeyxiexzf.m5148Ujhhgtgfeyxiexzf(this.f1657Ujhhgtgfeyxiexzf, i3, j);
            }
        }
        int i5 = this.f1659Ujhhgtgfeyxiexzf;
        if (i5 >= this.f1657Ujhhgtgfeyxiexzf.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f1657Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f1657Ujhhgtgfeyxiexzf, i9);
            this.f1658Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f1658Ujhhgtgfeyxiexzf, i9);
        }
        int i10 = this.f1659Ujhhgtgfeyxiexzf - i;
        if (i10 != 0) {
            long[] jArr2 = this.f1657Ujhhgtgfeyxiexzf;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f1658Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr3, objArr3, i11, i, this.f1659Ujhhgtgfeyxiexzf);
        }
        this.f1657Ujhhgtgfeyxiexzf[i] = j;
        this.f1658Ujhhgtgfeyxiexzf[i] = obj;
        this.f1659Ujhhgtgfeyxiexzf++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m1453Ujhhgtgfeyxiexzf() {
        if (this.f1656Ujhhgtgfeyxiexzf) {
            int i = this.f1659Ujhhgtgfeyxiexzf;
            long[] jArr = this.f1657Ujhhgtgfeyxiexzf;
            Object[] objArr = this.f1658Ujhhgtgfeyxiexzf;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC3611Ujhhgtgfeyxiexzf.f11232Ujhhgtgfeyxiexzf) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f1656Ujhhgtgfeyxiexzf = false;
            this.f1659Ujhhgtgfeyxiexzf = i2;
        }
        return this.f1659Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object m1454Ujhhgtgfeyxiexzf(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1659Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f1656Ujhhgtgfeyxiexzf) {
            long[] jArr = this.f1657Ujhhgtgfeyxiexzf;
            Object[] objArr = this.f1658Ujhhgtgfeyxiexzf;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3611Ujhhgtgfeyxiexzf.f11232Ujhhgtgfeyxiexzf) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1656Ujhhgtgfeyxiexzf = false;
            this.f1659Ujhhgtgfeyxiexzf = i3;
        }
        return this.f1658Ujhhgtgfeyxiexzf[i];
    }
}
