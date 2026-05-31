package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᲁᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2854 implements Cloneable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public /* synthetic */ int[] f9080;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public /* synthetic */ Object[] f9081;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public /* synthetic */ int f9082;

    public C2854() {
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
        this.f9080 = new int[i4];
        this.f9081 = new Object[i4];
    }

    public final Object clone() {
        C2854 c2854 = (C2854) super.clone();
        c2854.f9080 = (int[]) this.f9080.clone();
        c2854.f9081 = (Object[]) this.f9081.clone();
        return c2854;
    }

    public final String toString() {
        int i = this.f9082;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f9082;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f9080[i3]);
            sb.append('=');
            Object obj = this.f9081[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4809(int i, Object obj) {
        int i2 = this.f9082;
        if (i2 != 0 && i <= this.f9080[i2 - 1]) {
            m4811(i, obj);
            return;
        }
        if (i2 >= this.f9080.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            this.f9080 = Arrays.copyOf(this.f9080, i6);
            this.f9081 = Arrays.copyOf(this.f9081, i6);
        }
        this.f9080[i2] = i;
        this.f9081[i2] = obj;
        this.f9082 = i2 + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m4810(int i) {
        Object obj;
        int iM3323 = AbstractC1469.m3323(this.f9082, i, this.f9080);
        if (iM3323 < 0 || (obj = this.f9081[iM3323]) == C1787.f5943) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4811(int i, Object obj) {
        int iM3323 = AbstractC1469.m3323(this.f9082, i, this.f9080);
        if (iM3323 >= 0) {
            this.f9081[iM3323] = obj;
            return;
        }
        int i2 = ~iM3323;
        int i3 = this.f9082;
        if (i2 < i3) {
            Object[] objArr = this.f9081;
            if (objArr[i2] == C1787.f5943) {
                this.f9080[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f9080.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.f9080 = Arrays.copyOf(this.f9080, i7);
            this.f9081 = Arrays.copyOf(this.f9081, i7);
        }
        int i8 = this.f9082;
        if (i8 - i2 != 0) {
            int[] iArr = this.f9080;
            int i9 = i2 + 1;
            AbstractC0280.m1525(iArr, i9, i2, i8, iArr);
            Object[] objArr2 = this.f9081;
            AbstractC0280.m1526(objArr2, objArr2, i9, i2, this.f9082);
        }
        this.f9080[i2] = i;
        this.f9081[i2] = obj;
        this.f9082++;
    }
}
