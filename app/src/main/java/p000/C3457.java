package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3457 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0707 f10931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f10932;

    public C3457(C0707 c0707, boolean z) {
        List list = Collections.EMPTY_LIST;
        this.f10931 = c0707;
        this.f10932 = z ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3457)) {
            return false;
        }
        C3457 c3457 = (C3457) obj;
        if (!this.f10931.equals(c3457.f10931)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return AbstractC2207.m4087(list, list) && this.f10932 == c3457.f10932;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10932) + ((Collections.EMPTY_LIST.hashCode() + (this.f10931.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String name;
        StringBuilder sb = new StringBuilder();
        C0707 c0707 = this.f10931;
        Class clsMo2114 = c0707.mo2114();
        if (clsMo2114 == null) {
            name = c0707.toString();
        } else if (!clsMo2114.isArray()) {
            name = clsMo2114.getName();
        } else if (clsMo2114.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsMo2114.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsMo2114.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsMo2114.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsMo2114.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsMo2114.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsMo2114.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsMo2114.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = Collections.EMPTY_LIST;
        sb.append(name + (list.isEmpty() ? "" : AbstractC0744.m2196(list, ", ", "<", ">", new C3424(4), 24)) + ((this.f10932 & 1) != 0 ? "?" : ""));
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
