package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱᛳᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0667Ujhhgtgfeyxiexzf implements Comparable, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0667Ujhhgtgfeyxiexzf f2779Ujhhgtgfeyxiexzf = new C0667Ujhhgtgfeyxiexzf(-31557014167219200L, 0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0667Ujhhgtgfeyxiexzf f2780Ujhhgtgfeyxiexzf = new C0667Ujhhgtgfeyxiexzf(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f2781Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2782Ujhhgtgfeyxiexzf;

    public C0667Ujhhgtgfeyxiexzf(long j, int i) {
        this.f2781Ujhhgtgfeyxiexzf = j;
        this.f2782Ujhhgtgfeyxiexzf = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i = AbstractC0669Ujhhgtgfeyxiexzf.f2785Ujhhgtgfeyxiexzf;
        C0673Ujhhgtgfeyxiexzf c0673Ujhhgtgfeyxiexzf = new C0673Ujhhgtgfeyxiexzf();
        c0673Ujhhgtgfeyxiexzf.f2791Ujhhgtgfeyxiexzf = this.f2781Ujhhgtgfeyxiexzf;
        c0673Ujhhgtgfeyxiexzf.f2792Ujhhgtgfeyxiexzf = this.f2782Ujhhgtgfeyxiexzf;
        return c0673Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        C0667Ujhhgtgfeyxiexzf c0667Ujhhgtgfeyxiexzf = (C0667Ujhhgtgfeyxiexzf) obj;
        long j = this.f2781Ujhhgtgfeyxiexzf;
        long j2 = c0667Ujhhgtgfeyxiexzf.f2781Ujhhgtgfeyxiexzf;
        if (j < j2) {
            i = -1;
        } else {
            i = j == j2 ? 0 : 1;
        }
        return i != 0 ? i : C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(this.f2782Ujhhgtgfeyxiexzf, c0667Ujhhgtgfeyxiexzf.f2782Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0667Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0667Ujhhgtgfeyxiexzf c0667Ujhhgtgfeyxiexzf = (C0667Ujhhgtgfeyxiexzf) obj;
        return this.f2781Ujhhgtgfeyxiexzf == c0667Ujhhgtgfeyxiexzf.f2781Ujhhgtgfeyxiexzf && this.f2782Ujhhgtgfeyxiexzf == c0667Ujhhgtgfeyxiexzf.f2782Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return (this.f2782Ujhhgtgfeyxiexzf * 51) + Long.hashCode(this.f2781Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j = this.f2781Ujhhgtgfeyxiexzf;
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
        long jM2692Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2692Ujhhgtgfeyxiexzf(j10, j9, ((j10 / j12) + (j11 * j10)) - (j10 / j13), j8);
        if (jM2692Ujhhgtgfeyxiexzf < 0) {
            j10--;
            jM2692Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2692Ujhhgtgfeyxiexzf(j10, j9, ((j10 / j12) + (j11 * j10)) - (j10 / j13), j8);
        }
        int i2 = (int) jM2692Ujhhgtgfeyxiexzf;
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
        AbstractC2855feyxiexzfUjhhgtg.m4206feyxiexzfUjhhgtg(sb, sb, i4);
        sb.append('-');
        AbstractC2855feyxiexzfUjhhgtg.m4206feyxiexzfUjhhgtg(sb, sb, i5);
        sb.append('T');
        AbstractC2855feyxiexzfUjhhgtg.m4206feyxiexzfUjhhgtg(sb, sb, i7);
        sb.append(':');
        AbstractC2855feyxiexzfUjhhgtg.m4206feyxiexzfUjhhgtg(sb, sb, i9);
        sb.append(':');
        AbstractC2855feyxiexzfUjhhgtg.m4206feyxiexzfUjhhgtg(sb, sb, i10);
        int i12 = this.f2782Ujhhgtgfeyxiexzf;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = AbstractC2855feyxiexzfUjhhgtg.f9110Ujhhgtgfeyxiexzf;
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
