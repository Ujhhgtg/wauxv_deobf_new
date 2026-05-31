package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᛸᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1666 implements Comparable, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1666 f5630 = new C1666(-31557014167219200L, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1666 f5631 = new C1666(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long f5632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5633;

    public C1666(long j, int i) {
        this.f5632 = j;
        this.f5633 = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i = AbstractC1668.f5634;
        C1672 c1672 = new C1672();
        c1672.f5639 = this.f5632;
        c1672.f5640 = this.f5633;
        return c1672;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        C1666 c1666 = (C1666) obj;
        long j = this.f5632;
        long j2 = c1666.f5632;
        if (j < j2) {
            i = -1;
        } else {
            i = j == j2 ? 0 : 1;
        }
        return i != 0 ? i : AbstractC1469.m3327(this.f5633, c1666.f5633);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1666)) {
            return false;
        }
        C1666 c1666 = (C1666) obj;
        return this.f5632 == c1666.f5632 && this.f5633 == c1666.f5633;
    }

    public final int hashCode() {
        return (this.f5633 * 51) + Long.hashCode(this.f5632);
    }

    public final String toString() {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j = this.f5632;
        long j2 = j / 86400;
        long j3 = 0;
        if ((j ^ 86400) < 0 && j2 * 86400 != j) {
            j2--;
        }
        long j4 = j % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = (j2 + ((long) 719528)) - ((long) 60);
        if (j5 < 0) {
            long j6 = 146097;
            long j7 = ((j5 + 1) / j6) - 1;
            j3 = ((long) 400) * j7;
            j5 += (-j7) * j6;
        }
        long j8 = j5;
        long j9 = 400;
        long j10 = ((j9 * j8) + ((long) 591)) / ((long) 146097);
        long j11 = 365;
        long j12 = 4;
        long j13 = 100;
        long jM4771 = AbstractC2844.m4771(j10, j9, ((j10 / j12) + (j11 * j10)) - (j10 / j13), j8);
        if (jM4771 < 0) {
            j10--;
            jM4771 = AbstractC2844.m4771(j10, j9, ((j10 / j12) + (j11 * j10)) - (j10 / j13), j8);
        }
        int i2 = (int) jM4771;
        int i3 = ((i2 * 5) + 2) / Opcodes.IFEQ;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j10 + j3 + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        AbstractC0972.m2593(sb, sb, i4);
        sb.append('-');
        AbstractC0972.m2593(sb, sb, i5);
        sb.append('T');
        AbstractC0972.m2593(sb, sb, i7);
        sb.append(':');
        AbstractC0972.m2593(sb, sb, i9);
        sb.append(':');
        AbstractC0972.m2593(sb, sb, i10);
        int i12 = this.f5633;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = AbstractC0972.f3529;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
