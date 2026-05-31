package p000;

import com.umeng.analytics.pro.bv;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1125 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0348 f4190 = new C0348(22);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final long f4191 = AbstractC2235.m4198(4611686018427387903L);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final long f4192 = AbstractC2235.m4198(-4611686018427387903L);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final long f4193 = 9223372036854759646L;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long f4194;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final long m2843(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long jM4193 = AbstractC2235.m4193(j, j4);
        if (-4611686018426L > jM4193 || jM4193 >= 4611686018427L) {
            return AbstractC2235.m4198(jM4193);
        }
        long j5 = ((jM4193 * j3) + (j2 - (j4 * j3))) << 1;
        int i = AbstractC1126.f4195;
        return j5;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m2844(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC1095.m2795(i3, "Desired length ", " is less than zero."));
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int m2845(long j) {
        if (m2846(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean m2846(long j) {
        return j == f4191 || j == f4192;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final long m2847(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m2843(j >> 1, j2 >> 1) : m2843(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC2235.m4198(j3 / ((long) 1000000));
            }
            long j4 = j3 << 1;
            int i2 = AbstractC1126.f4195;
            return j4;
        }
        long jM4193 = AbstractC2235.m4193(j >> 1, j2 >> 1);
        if (jM4193 == 9223372036854759646L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jM4193 == 4611686018427387903L || jM4193 == -4611686018427387903L) {
            return AbstractC2235.m4198(jM4193);
        }
        if (-4611686018426L > jM4193 || jM4193 >= 4611686018427L) {
            return AbstractC2235.m4198(AbstractC3744.m5329(jM4193));
        }
        long j5 = (jM4193 * ((long) 1000000)) << 1;
        int i3 = AbstractC1126.f4195;
        return j5;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final long m2848(long j, EnumC1128 enumC1128) {
        if (j == f4191) {
            return Long.MAX_VALUE;
        }
        if (j == f4192) {
            return Long.MIN_VALUE;
        }
        return enumC1128.f4205.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC1128.NANOSECONDS : EnumC1128.MILLISECONDS).f4205);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C1125) obj).f4194;
        long j2 = this.f4194;
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
        if (obj instanceof C1125) {
            return this.f4194 == ((C1125) obj).f4194;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4194);
    }

    public final String toString() {
        long j = this.f4194;
        if (j == 0) {
            return "0s";
        }
        if (j == f4191) {
            return "Infinity";
        }
        if (j == f4192) {
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
            int i2 = AbstractC1126.f4195;
        }
        long jM2848 = m2848(j, EnumC1128.DAYS);
        int iM2848 = m2846(j) ? 0 : (int) (m2848(j, EnumC1128.HOURS) % ((long) 24));
        int iM2849 = m2846(j) ? 0 : (int) (m2848(j, EnumC1128.MINUTES) % ((long) 60));
        int iM28410 = m2846(j) ? 0 : (int) (m2848(j, EnumC1128.SECONDS) % ((long) 60));
        int iM2845 = m2845(j);
        boolean z2 = jM2848 != 0;
        boolean z3 = iM2848 != 0;
        boolean z4 = iM2849 != 0;
        boolean z5 = (iM28410 == 0 && iM2845 == 0) ? false : true;
        if (z2) {
            sb.append(jM2848);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM2848);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM2849);
            sb.append('m');
            i = i4;
        }
        if (z5) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM28410 != 0 || z2 || z3 || z4) {
                m2844(sb, iM28410, iM2845, 9, bv.aB, false);
            } else if (iM2845 >= 1000000) {
                m2844(sb, iM2845 / 1000000, iM2845 % 1000000, 6, "ms", false);
            } else if (iM2845 >= 1000) {
                m2844(sb, iM2845 / 1000, iM2845 % 1000, 3, "us", false);
            } else {
                sb.append(iM2845);
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
