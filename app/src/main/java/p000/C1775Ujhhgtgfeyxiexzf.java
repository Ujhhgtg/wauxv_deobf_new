package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱUjhhgtgᛱ要点脸能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1775Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2839feyxiexzfUjhhgtg f5950Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f5951Ujhhgtgfeyxiexzf;

    public C1775Ujhhgtgfeyxiexzf(C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtg, boolean z) {
        List list = Collections.EMPTY_LIST;
        this.f5950Ujhhgtgfeyxiexzf = c2839feyxiexzfUjhhgtg;
        this.f5951Ujhhgtgfeyxiexzf = z ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1775Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1775Ujhhgtgfeyxiexzf c1775Ujhhgtgfeyxiexzf = (C1775Ujhhgtgfeyxiexzf) obj;
        if (!this.f5950Ujhhgtgfeyxiexzf.equals(c1775Ujhhgtgfeyxiexzf.f5950Ujhhgtgfeyxiexzf)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(list, list) && this.f5951Ujhhgtgfeyxiexzf == c1775Ujhhgtgfeyxiexzf.f5951Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5951Ujhhgtgfeyxiexzf) + ((Collections.EMPTY_LIST.hashCode() + (this.f5950Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String name;
        StringBuilder sb = new StringBuilder();
        C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtg = this.f5950Ujhhgtgfeyxiexzf;
        Class clsMo2998Ujhhgtgfeyxiexzf = c2839feyxiexzfUjhhgtg.mo2998Ujhhgtgfeyxiexzf();
        if (clsMo2998Ujhhgtgfeyxiexzf == null) {
            name = c2839feyxiexzfUjhhgtg.toString();
        } else if (!clsMo2998Ujhhgtgfeyxiexzf.isArray()) {
            name = clsMo2998Ujhhgtgfeyxiexzf.getName();
        } else if (clsMo2998Ujhhgtgfeyxiexzf.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsMo2998Ujhhgtgfeyxiexzf.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsMo2998Ujhhgtgfeyxiexzf.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsMo2998Ujhhgtgfeyxiexzf.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsMo2998Ujhhgtgfeyxiexzf.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsMo2998Ujhhgtgfeyxiexzf.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsMo2998Ujhhgtgfeyxiexzf.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsMo2998Ujhhgtgfeyxiexzf.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = Collections.EMPTY_LIST;
        sb.append(name + (list.isEmpty() ? "" : AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(list, ", ", "<", ">", new C1127feyxiexzfUjhhgtg(26), 24)) + ((this.f5951Ujhhgtgfeyxiexzf & 1) != 0 ? "?" : ""));
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
