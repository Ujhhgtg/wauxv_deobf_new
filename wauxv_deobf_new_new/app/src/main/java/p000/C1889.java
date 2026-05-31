package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲀᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1889 implements Cloneable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public /* synthetic */ boolean f6261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public /* synthetic */ long[] f6262;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public /* synthetic */ Object[] f6263;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public /* synthetic */ int f6264;

    public C1889() {
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
        this.f6262 = new long[i4];
        this.f6263 = new Object[i4];
    }

    public final Object clone() {
        C1889 c1889 = (C1889) super.clone();
        c1889.f6262 = (long[]) this.f6262.clone();
        c1889.f6263 = (Object[]) this.f6263.clone();
        return c1889;
    }

    public final String toString() {
        if (m3812() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6264 * 28);
        sb.append('{');
        int i = this.f6264;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m3810(i2));
            sb.append('=');
            Object objM3813 = m3813(i2);
            if (objM3813 != sb) {
                sb.append(objM3813);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3808() {
        int i = this.f6264;
        Object[] objArr = this.f6263;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f6264 = 0;
        this.f6261 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m3809(long j) {
        Object obj;
        int iM3324 = AbstractC1469.m3324(this.f6262, this.f6264, j);
        if (iM3324 < 0 || (obj = this.f6263[iM3324]) == AbstractC1468.f5217) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long m3810(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6264)) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f6261) {
            long[] jArr = this.f6262;
            Object[] objArr = this.f6263;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1468.f5217) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6261 = false;
            this.f6264 = i3;
        }
        return this.f6262[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3811(Object obj, long j) {
        Object obj2 = AbstractC1468.f5217;
        int iM3324 = AbstractC1469.m3324(this.f6262, this.f6264, j);
        if (iM3324 >= 0) {
            this.f6263[iM3324] = obj;
            return;
        }
        int i = ~iM3324;
        int i2 = this.f6264;
        if (i < i2) {
            Object[] objArr = this.f6263;
            if (objArr[i] == obj2) {
                this.f6262[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f6261) {
            long[] jArr = this.f6262;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f6263;
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
                this.f6261 = false;
                this.f6264 = i3;
                i = ~AbstractC1469.m3324(this.f6262, i3, j);
            }
        }
        int i5 = this.f6264;
        if (i5 >= this.f6262.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f6262 = Arrays.copyOf(this.f6262, i9);
            this.f6263 = Arrays.copyOf(this.f6263, i9);
        }
        int i10 = this.f6264 - i;
        if (i10 != 0) {
            long[] jArr2 = this.f6262;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f6263;
            AbstractC0280.m1526(objArr3, objArr3, i11, i, this.f6264);
        }
        this.f6262[i] = j;
        this.f6263[i] = obj;
        this.f6264++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3812() {
        if (this.f6261) {
            int i = this.f6264;
            long[] jArr = this.f6262;
            Object[] objArr = this.f6263;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1468.f5217) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f6261 = false;
            this.f6264 = i2;
        }
        return this.f6264;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object m3813(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6264)) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f6261) {
            long[] jArr = this.f6262;
            Object[] objArr = this.f6263;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1468.f5217) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6261 = false;
            this.f6264 = i3;
        }
        return this.f6263[i];
    }
}
