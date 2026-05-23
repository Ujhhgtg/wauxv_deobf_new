package p000;

import com.umeng.analytics.pro.bv;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1119 implements Comparable {

    public static final C0373 f4179 = new C0373(21);

    public static final long f4180 = AbstractC3681.m5323(4611686018427387903L);

    public static final long f4181 = AbstractC3681.m5323(-4611686018427387903L);

    public static final long f4182 = 9223372036854759646L;

    public final long f4183;

    public static final long m2694(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / 1000000L;
        long jM5315 = AbstractC3681.m5315(j, j4);
        if (-4611686018426L > jM5315 || jM5315 >= 4611686018427L) {
            return AbstractC3681.m5323(jM5315);
        }
        long j5 = ((jM5315 * 1000000L) + (j2 - (j4 * 1000000L))) << 1;
        int i = 0;
        return j5;
    }

    public static final void m2695(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC1194.m2780(i3, "Desired length ", " is less than zero."));
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (true) {
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

    public static final int m2696(long j) {
        if (m2697(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final boolean m2697(long j) {
        return j == f4180 || j == f4181;
    }

    public static final long m2698(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m2694(j >> 1, j2 >> 1) : m2694(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC3681.m5323(j3 / ((long) 1000000));
            }
            long j4 = j3 << 1;
            int i2 = 0;
            return j4;
        }
        long jM5315 = AbstractC3681.m5315(j >> 1, j2 >> 1);
        if (jM5315 == 9223372036854759646L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jM5315 == 4611686018427387903L || jM5315 == -4611686018427387903L) {
            return AbstractC3681.m5323(jM5315);
        }
        if (-4611686018426L > jM5315 || jM5315 >= 4611686018427L) {
            return AbstractC3681.m5323(AbstractC2203.m4028(jM5315));
        }
        long j5 = (jM5315 * ((long) 1000000)) << 1;
        int i3 = 0;
        return j5;
    }

    public static final long m2699(long j, EnumC1122 enumC1122) {
        if (j == f4180) {
            return 9223372036854775807L;
        }
        if (j == f4181) {
            return -9223372036854775808L;
        }
        return enumC1122.f4194.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC1122.NANOSECONDS : EnumC1122.MILLISECONDS).f4194);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C1119) obj).f4183;
        long j2 = this.f4183;
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
        if (obj instanceof C1119) {
            return this.f4183 == ((C1119) obj).f4183;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4183);
    }

    public final String toString() {
        long j = this.f4183;
        if (j == 0) {
            return "0s";
        }
        if (j == f4180) {
            return "Infinity";
        }
        if (j == f4181) {
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
            int i2 = 0;
        }
        long jM2699 = m2699(j, EnumC1122.DAYS);
        int iM2699 = m2697(j) ? 0 : (int) (m2699(j, EnumC1122.HOURS) % ((long) 24));
        int iM26910 = m2697(j) ? 0 : (int) (m2699(j, EnumC1122.MINUTES) % ((long) 60));
        int iM26911 = m2697(j) ? 0 : (int) (m2699(j, EnumC1122.SECONDS) % ((long) 60));
        int iM2696 = m2696(j);
        boolean z2 = jM2699 != 0;
        boolean z3 = iM2699 != 0;
        boolean z4 = iM26910 != 0;
        boolean z5 = (iM26911 == 0 && iM2696 == 0) ? false : true;
        if (z2) {
            sb.append(jM2699);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM2699);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM26910);
            sb.append('m');
            i = i4;
        }
        if (z5) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM26911 != 0 || z2 || z3 || z4) {
                m2695(sb, iM26911, iM2696, 9, "s", false);
            } else if (iM2696 >= 1000000) {
                m2695(sb, iM2696 / 1000000, iM2696 % 1000000, 6, "ms", false);
            } else if (iM2696 >= 1000) {
                m2695(sb, iM2696 / 1000, iM2696 % 1000, 3, "us", false);
            } else {
                sb.append(iM2696);
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
