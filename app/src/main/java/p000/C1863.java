package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1863 implements Cloneable {

    public /* synthetic */ boolean f6187;

    public /* synthetic */ long[] f6188;

    public /* synthetic */ Object[] f6189;

    public /* synthetic */ int f6190;

    public C1863() {
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
        this.f6188 = new long[i4];
        this.f6189 = new Object[i4];
    }

    public final Object clone() {
        C1863 c1863 = (C1863) super.clone();
        c1863.f6188 = (long[]) this.f6188.clone();
        c1863.f6189 = (Object[]) this.f6189.clone();
        return c1863;
    }

    public final String toString() {
        if (m3634() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6190 * 28);
        sb.append('{');
        int i = this.f6190;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m3632(i2));
            sb.append('=');
            Object objM3635 = m3635(i2);
            if (objM3635 != sb) {
                sb.append(objM3635);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void m3630() {
        int i = this.f6190;
        Object[] objArr = this.f6189;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f6190 = 0;
        this.f6187 = false;
    }

    public final Object m3631(long j) {
        Object obj;
        int iM3206 = AbstractC1460.m3206(this.f6188, this.f6190, j);
        if (iM3206 < 0 || (obj = this.f6189[iM3206]) == AbstractC1460.f5198) {
            return null;
        }
        return obj;
    }

    public final long m3632(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6190)) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f6187) {
            long[] jArr = this.f6188;
            Object[] objArr = this.f6189;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1460.f5198) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6187 = false;
            this.f6190 = i3;
        }
        return this.f6188[i];
    }

    public final void m3633(Object obj, long j) {
        Object obj2 = AbstractC1460.f5198;
        int iM3206 = AbstractC1460.m3206(this.f6188, this.f6190, j);
        if (iM3206 >= 0) {
            this.f6189[iM3206] = obj;
            return;
        }
        int i = ~iM3206;
        int i2 = this.f6190;
        if (i < i2) {
            Object[] objArr = this.f6189;
            if (objArr[i] == obj2) {
                this.f6188[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f6187) {
            long[] jArr = this.f6188;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f6189;
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
                this.f6187 = false;
                this.f6190 = i3;
                i = ~AbstractC1460.m3206(this.f6188, i3, j);
            }
        }
        int i5 = this.f6190;
        if (i5 >= this.f6188.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f6188 = Arrays.copyOf(this.f6188, i9);
            this.f6189 = Arrays.copyOf(this.f6189, i9);
        }
        int i10 = this.f6190 - i;
        if (i10 != 0) {
            long[] jArr2 = this.f6188;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f6189;
            AbstractC0270.m1380(objArr3, objArr3, i11, i, this.f6190);
        }
        this.f6188[i] = j;
        this.f6189[i] = obj;
        this.f6190++;
    }

    public final int m3634() {
        if (this.f6187) {
            int i = this.f6190;
            long[] jArr = this.f6188;
            Object[] objArr = this.f6189;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1460.f5198) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f6187 = false;
            this.f6190 = i2;
        }
        return this.f6190;
    }

    public final Object m3635(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6190)) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f6187) {
            long[] jArr = this.f6188;
            Object[] objArr = this.f6189;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1460.f5198) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6187 = false;
            this.f6190 = i3;
        }
        return this.f6189[i];
    }
}
