package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᤝᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2794 implements Cloneable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public /* synthetic */ int[] f8918;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public /* synthetic */ Object[] f8919;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public /* synthetic */ int f8920;

    public C2794() {
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
        this.f8918 = new int[i4];
        this.f8919 = new Object[i4];
    }

    public final Object clone() {
        C2794 c2794 = (C2794) super.clone();
        c2794.f8918 = (int[]) this.f8918.clone();
        c2794.f8919 = (Object[]) this.f8919.clone();
        return c2794;
    }

    public final String toString() {
        int i = this.f8920;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f8920;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8918[i3]);
            sb.append('=');
            Object obj = this.f8919[i3];
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
    public final void m4776(int i, Object obj) {
        int i2 = this.f8920;
        if (i2 != 0 && i <= this.f8918[i2 - 1]) {
            m4778(i, obj);
            return;
        }
        if (i2 >= this.f8918.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            this.f8918 = Arrays.copyOf(this.f8918, i6);
            this.f8919 = Arrays.copyOf(this.f8919, i6);
        }
        this.f8918[i2] = i;
        this.f8919[i2] = obj;
        this.f8920 = i2 + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m4777(int i) {
        Object obj;
        int iM3205 = AbstractC1460.m3205(this.f8920, i, this.f8918);
        if (iM3205 < 0 || (obj = this.f8919[iM3205]) == AbstractC3453.f10926) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4778(int i, Object obj) {
        int iM3205 = AbstractC1460.m3205(this.f8920, i, this.f8918);
        if (iM3205 >= 0) {
            this.f8919[iM3205] = obj;
            return;
        }
        int i2 = ~iM3205;
        int i3 = this.f8920;
        if (i2 < i3) {
            Object[] objArr = this.f8919;
            if (objArr[i2] == AbstractC3453.f10926) {
                this.f8918[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f8918.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.f8918 = Arrays.copyOf(this.f8918, i7);
            this.f8919 = Arrays.copyOf(this.f8919, i7);
        }
        int i8 = this.f8920;
        if (i8 - i2 != 0) {
            int[] iArr = this.f8918;
            int i9 = i2 + 1;
            AbstractC0270.m1379(iArr, i9, i2, i8, iArr);
            Object[] objArr2 = this.f8919;
            AbstractC0270.m1380(objArr2, objArr2, i9, i2, this.f8920);
        }
        this.f8918[i2] = i;
        this.f8919[i2] = obj;
        this.f8920++;
    }
}
