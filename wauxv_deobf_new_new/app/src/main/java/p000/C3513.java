package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᛸᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3513 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0702 f11087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f11088;

    public C3513(C0702 c0702, boolean z) {
        List list = Collections.EMPTY_LIST;
        this.f11087 = c0702;
        this.f11088 = z ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3513)) {
            return false;
        }
        C3513 c3513 = (C3513) obj;
        if (!this.f11087.equals(c3513.f11087)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return AbstractC1469.m3322(list, list) && this.f11088 == c3513.f11088;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11088) + ((Collections.EMPTY_LIST.hashCode() + (this.f11087.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String name;
        StringBuilder sb = new StringBuilder();
        C0702 c0702 = this.f11087;
        Class clsMo2209 = c0702.mo2209();
        if (clsMo2209 == null) {
            name = c0702.toString();
        } else if (!clsMo2209.isArray()) {
            name = clsMo2209.getName();
        } else if (clsMo2209.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsMo2209.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsMo2209.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsMo2209.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsMo2209.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsMo2209.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsMo2209.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsMo2209.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = Collections.EMPTY_LIST;
        sb.append(name + (list.isEmpty() ? "" : AbstractC0739.m2295(list, ", ", "<", ">", new C2868(26), 24)) + ((this.f11088 & 1) != 0 ? "?" : ""));
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
