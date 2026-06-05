package p000;

import com.umeng.analytics.pro.bv;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛳ能不能ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3246feyxiexzfUjhhgtg implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C2466feyxiexzfUjhhgtg f10184Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(22);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final long f10185Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5172Ujhhgtgfeyxiexzf(4611686018427387903L);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final long f10186Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5172Ujhhgtgfeyxiexzf(-4611686018427387903L);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final long f10187Ujhhgtgfeyxiexzf = 9223372036854759646L;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f10188Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final long m4747Ujhhgtgfeyxiexzf(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long jM5165Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5165Ujhhgtgfeyxiexzf(j, j4);
        if (-4611686018426L > jM5165Ujhhgtgfeyxiexzf || jM5165Ujhhgtgfeyxiexzf >= 4611686018427L) {
            return AbstractC3594Ujhhgtgfeyxiexzf.m5172Ujhhgtgfeyxiexzf(jM5165Ujhhgtgfeyxiexzf);
        }
        long j5 = ((jM5165Ujhhgtgfeyxiexzf * j3) + (j2 - (j4 * j3))) << 1;
        int i = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
        return j5;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final void m4748Ujhhgtgfeyxiexzf(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i3, "Desired length ", " is less than zero."));
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i7);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int m4749Ujhhgtgfeyxiexzf(long j) {
        if (m4750Ujhhgtgfeyxiexzf(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final boolean m4750Ujhhgtgfeyxiexzf(long j) {
        return j == f10185Ujhhgtgfeyxiexzf || j == f10186Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final long m4751Ujhhgtgfeyxiexzf(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m4747Ujhhgtgfeyxiexzf(j >> 1, j2 >> 1) : m4747Ujhhgtgfeyxiexzf(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC3594Ujhhgtgfeyxiexzf.m5172Ujhhgtgfeyxiexzf(j3 / ((long) 1000000));
            }
            long j4 = j3 << 1;
            int i2 = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
            return j4;
        }
        long jM5165Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5165Ujhhgtgfeyxiexzf(j >> 1, j2 >> 1);
        if (jM5165Ujhhgtgfeyxiexzf == 9223372036854759646L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jM5165Ujhhgtgfeyxiexzf == 4611686018427387903L || jM5165Ujhhgtgfeyxiexzf == -4611686018427387903L) {
            return AbstractC3594Ujhhgtgfeyxiexzf.m5172Ujhhgtgfeyxiexzf(jM5165Ujhhgtgfeyxiexzf);
        }
        if (-4611686018426L > jM5165Ujhhgtgfeyxiexzf || jM5165Ujhhgtgfeyxiexzf >= 4611686018427L) {
            return AbstractC3594Ujhhgtgfeyxiexzf.m5172Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2795Ujhhgtgfeyxiexzf(jM5165Ujhhgtgfeyxiexzf));
        }
        long j5 = (jM5165Ujhhgtgfeyxiexzf * ((long) 1000000)) << 1;
        int i3 = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
        return j5;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final long m4752Ujhhgtgfeyxiexzf(long j, EnumC3244feyxiexzfUjhhgtg enumC3244feyxiexzfUjhhgtg) {
        if (j == f10185Ujhhgtgfeyxiexzf) {
            return Long.MAX_VALUE;
        }
        if (j == f10186Ujhhgtgfeyxiexzf) {
            return Long.MIN_VALUE;
        }
        return enumC3244feyxiexzfUjhhgtg.f10169Ujhhgtgfeyxiexzf.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC3244feyxiexzfUjhhgtg.NANOSECONDS : EnumC3244feyxiexzfUjhhgtg.MILLISECONDS).f10169Ujhhgtgfeyxiexzf);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C3246feyxiexzfUjhhgtg) obj).f10188Ujhhgtgfeyxiexzf;
        long j2 = this.f10188Ujhhgtgfeyxiexzf;
        long j3 = j2 ^ j;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j2) & 1) - (((int) j) & 1);
            return j2 < 0 ? -i : i;
        }
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3246feyxiexzfUjhhgtg) {
            return this.f10188Ujhhgtgfeyxiexzf == ((C3246feyxiexzfUjhhgtg) obj).f10188Ujhhgtgfeyxiexzf;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10188Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        long j = this.f10188Ujhhgtgfeyxiexzf;
        if (j == 0) {
            return "0s";
        }
        if (j == f10185Ujhhgtgfeyxiexzf) {
            return "Infinity";
        }
        if (j == f10186Ujhhgtgfeyxiexzf) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = ((long) (((int) j) & 1)) + ((-(j >> 1)) << 1);
            int i2 = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
        }
        long jM4752Ujhhgtgfeyxiexzf = m4752Ujhhgtgfeyxiexzf(j, EnumC3244feyxiexzfUjhhgtg.DAYS);
        int iM4752Ujhhgtgfeyxiexzf = m4750Ujhhgtgfeyxiexzf(j) ? 0 : (int) (m4752Ujhhgtgfeyxiexzf(j, EnumC3244feyxiexzfUjhhgtg.HOURS) % ((long) 24));
        int iM4752Ujhhgtgfeyxiexzf2 = m4750Ujhhgtgfeyxiexzf(j) ? 0 : (int) (m4752Ujhhgtgfeyxiexzf(j, EnumC3244feyxiexzfUjhhgtg.MINUTES) % ((long) 60));
        int iM4752Ujhhgtgfeyxiexzf3 = m4750Ujhhgtgfeyxiexzf(j) ? 0 : (int) (m4752Ujhhgtgfeyxiexzf(j, EnumC3244feyxiexzfUjhhgtg.SECONDS) % ((long) 60));
        int iM4749Ujhhgtgfeyxiexzf = m4749Ujhhgtgfeyxiexzf(j);
        boolean z2 = jM4752Ujhhgtgfeyxiexzf != 0;
        boolean z3 = iM4752Ujhhgtgfeyxiexzf != 0;
        boolean z4 = iM4752Ujhhgtgfeyxiexzf2 != 0;
        boolean z5 = (iM4752Ujhhgtgfeyxiexzf3 == 0 && iM4749Ujhhgtgfeyxiexzf == 0) ? false : true;
        if (z2) {
            sb.append(jM4752Ujhhgtgfeyxiexzf);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM4752Ujhhgtgfeyxiexzf);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM4752Ujhhgtgfeyxiexzf2);
            sb.append('m');
            i = i4;
        }
        if (z5) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM4752Ujhhgtgfeyxiexzf3 != 0 || z2 || z3 || z4) {
                m4748Ujhhgtgfeyxiexzf(sb, iM4752Ujhhgtgfeyxiexzf3, iM4749Ujhhgtgfeyxiexzf, 9, bv.aB, false);
            } else if (iM4749Ujhhgtgfeyxiexzf >= 1000000) {
                m4748Ujhhgtgfeyxiexzf(sb, iM4749Ujhhgtgfeyxiexzf / 1000000, iM4749Ujhhgtgfeyxiexzf % 1000000, 6, "ms", false);
            } else if (iM4749Ujhhgtgfeyxiexzf >= 1000) {
                m4748Ujhhgtgfeyxiexzf(sb, iM4749Ujhhgtgfeyxiexzf / 1000, iM4749Ujhhgtgfeyxiexzf % 1000, 3, "us", false);
            } else {
                sb.append(iM4749Ujhhgtgfeyxiexzf);
                sb.append("ns");
            }
            i = i5;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
