package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ能不能要点脸ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1138feyxiexzfUjhhgtg implements Cloneable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public /* synthetic */ int[] f4303Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public /* synthetic */ Object[] f4304Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public /* synthetic */ int f4305Ujhhgtgfeyxiexzf;

    public C1138feyxiexzfUjhhgtg() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f4303Ujhhgtgfeyxiexzf = new int[i4];
        this.f4304Ujhhgtgfeyxiexzf = new Object[i4];
    }

    public final Object clone() {
        C1138feyxiexzfUjhhgtg c1138feyxiexzfUjhhgtg = (C1138feyxiexzfUjhhgtg) super.clone();
        c1138feyxiexzfUjhhgtg.f4303Ujhhgtgfeyxiexzf = (int[]) this.f4303Ujhhgtgfeyxiexzf.clone();
        c1138feyxiexzfUjhhgtg.f4304Ujhhgtgfeyxiexzf = (Object[]) this.f4304Ujhhgtgfeyxiexzf.clone();
        return c1138feyxiexzfUjhhgtg;
    }

    public final String toString() {
        int i = this.f4305Ujhhgtgfeyxiexzf;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f4305Ujhhgtgfeyxiexzf;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4303Ujhhgtgfeyxiexzf[i3]);
            sb.append('=');
            Object obj = this.f4304Ujhhgtgfeyxiexzf[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2604Ujhhgtgfeyxiexzf(int i, Object obj) {
        int i2 = this.f4305Ujhhgtgfeyxiexzf;
        if (i2 != 0 && i <= this.f4303Ujhhgtgfeyxiexzf[i2 - 1]) {
            m2606Ujhhgtgfeyxiexzf(i, obj);
            return;
        }
        if (i2 >= this.f4303Ujhhgtgfeyxiexzf.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            this.f4303Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f4303Ujhhgtgfeyxiexzf, i6);
            this.f4304Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f4304Ujhhgtgfeyxiexzf, i6);
        }
        this.f4303Ujhhgtgfeyxiexzf[i2] = i;
        this.f4304Ujhhgtgfeyxiexzf[i2] = obj;
        this.f4305Ujhhgtgfeyxiexzf = i2 + 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object m2605Ujhhgtgfeyxiexzf(int i) {
        Object obj;
        int iM5147Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5147Ujhhgtgfeyxiexzf(this.f4305Ujhhgtgfeyxiexzf, i, this.f4303Ujhhgtgfeyxiexzf);
        if (iM5147Ujhhgtgfeyxiexzf < 0 || (obj = this.f4304Ujhhgtgfeyxiexzf[iM5147Ujhhgtgfeyxiexzf]) == AbstractC1246feyxiexzfUjhhgtg.f4592Ujhhgtgfeyxiexzf) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2606Ujhhgtgfeyxiexzf(int i, Object obj) {
        int iM5147Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5147Ujhhgtgfeyxiexzf(this.f4305Ujhhgtgfeyxiexzf, i, this.f4303Ujhhgtgfeyxiexzf);
        if (iM5147Ujhhgtgfeyxiexzf >= 0) {
            this.f4304Ujhhgtgfeyxiexzf[iM5147Ujhhgtgfeyxiexzf] = obj;
            return;
        }
        int i2 = ~iM5147Ujhhgtgfeyxiexzf;
        int i3 = this.f4305Ujhhgtgfeyxiexzf;
        if (i2 < i3) {
            Object[] objArr = this.f4304Ujhhgtgfeyxiexzf;
            if (objArr[i2] == AbstractC1246feyxiexzfUjhhgtg.f4592Ujhhgtgfeyxiexzf) {
                this.f4303Ujhhgtgfeyxiexzf[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f4303Ujhhgtgfeyxiexzf.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.f4303Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f4303Ujhhgtgfeyxiexzf, i7);
            this.f4304Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f4304Ujhhgtgfeyxiexzf, i7);
        }
        int i8 = this.f4305Ujhhgtgfeyxiexzf;
        if (i8 - i2 != 0) {
            int[] iArr = this.f4303Ujhhgtgfeyxiexzf;
            int i9 = i2 + 1;
            AbstractC2391Ujhhgtgfeyxiexzf.m3643Ujhhgtgfeyxiexzf(iArr, i9, i2, i8, iArr);
            Object[] objArr2 = this.f4304Ujhhgtgfeyxiexzf;
            AbstractC2391Ujhhgtgfeyxiexzf.m3644Ujhhgtgfeyxiexzf(objArr2, objArr2, i9, i2, this.f4305Ujhhgtgfeyxiexzf);
        }
        this.f4303Ujhhgtgfeyxiexzf[i2] = i;
        this.f4304Ujhhgtgfeyxiexzf[i2] = obj;
        this.f4305Ujhhgtgfeyxiexzf++;
    }
}
