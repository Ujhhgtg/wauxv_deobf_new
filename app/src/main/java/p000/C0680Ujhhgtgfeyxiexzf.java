package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛴᛱfeyxiexzfᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0680Ujhhgtgfeyxiexzf implements Iterable, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f2805Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2806Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f2807Ujhhgtgfeyxiexzf;

    public C0680Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2805Ujhhgtgfeyxiexzf = i;
        this.f2806Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1882Ujhhgtgfeyxiexzf(i, i2, i3);
        this.f2807Ujhhgtgfeyxiexzf = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0680Ujhhgtgfeyxiexzf)) {
            return false;
        }
        if (isEmpty() && ((C0680Ujhhgtgfeyxiexzf) obj).isEmpty()) {
            return true;
        }
        C0680Ujhhgtgfeyxiexzf c0680Ujhhgtgfeyxiexzf = (C0680Ujhhgtgfeyxiexzf) obj;
        return this.f2805Ujhhgtgfeyxiexzf == c0680Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf && this.f2806Ujhhgtgfeyxiexzf == c0680Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf && this.f2807Ujhhgtgfeyxiexzf == c0680Ujhhgtgfeyxiexzf.f2807Ujhhgtgfeyxiexzf;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2805Ujhhgtgfeyxiexzf * 31) + this.f2806Ujhhgtgfeyxiexzf) * 31) + this.f2807Ujhhgtgfeyxiexzf;
    }

    public boolean isEmpty() {
        int i = this.f2807Ujhhgtgfeyxiexzf;
        int i2 = this.f2806Ujhhgtgfeyxiexzf;
        int i3 = this.f2805Ujhhgtgfeyxiexzf;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0679Ujhhgtgfeyxiexzf(this.f2805Ujhhgtgfeyxiexzf, this.f2806Ujhhgtgfeyxiexzf, this.f2807Ujhhgtgfeyxiexzf);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2806Ujhhgtgfeyxiexzf;
        int i2 = this.f2805Ujhhgtgfeyxiexzf;
        int i3 = this.f2807Ujhhgtgfeyxiexzf;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
