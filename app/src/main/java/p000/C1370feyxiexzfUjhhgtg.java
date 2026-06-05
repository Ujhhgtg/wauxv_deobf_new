package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛳᛴᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1370feyxiexzfUjhhgtg implements InterfaceC1724Ujhhgtgfeyxiexzf, Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3154Ujhhgtgfeyxiexzf f4861Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1942Ujhhgtgfeyxiexzf f4862Ujhhgtgfeyxiexzf;

    public C1370feyxiexzfUjhhgtg(C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf, C2427Ujhhgtgfeyxiexzf c2427Ujhhgtgfeyxiexzf, C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        this.f4861Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf;
        int length = c2427Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            C2422Ujhhgtgfeyxiexzf c2422Ujhhgtgfeyxiexzf = new C2422Ujhhgtgfeyxiexzf((C2425Ujhhgtgfeyxiexzf) c2427Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i), c3268feyxiexzfUjhhgtg);
            C2423Ujhhgtgfeyxiexzf c2423Ujhhgtgfeyxiexzf = new C2423Ujhhgtgfeyxiexzf(4, 4);
            c2423Ujhhgtgfeyxiexzf.f7841Ujhhgtgfeyxiexzf = c2422Ujhhgtgfeyxiexzf;
            arrayList.add(c2423Ujhhgtgfeyxiexzf);
        }
        this.f4862Ujhhgtgfeyxiexzf = new C1942Ujhhgtgfeyxiexzf(EnumC0704Ujhhgtgfeyxiexzf.f2897Ujhhgtgfeyxiexzf, arrayList);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4861Ujhhgtgfeyxiexzf.compareTo(((C1370feyxiexzfUjhhgtg) obj).f4861Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1370feyxiexzfUjhhgtg)) {
            return false;
        }
        return this.f4861Ujhhgtgfeyxiexzf.equals(((C1370feyxiexzfUjhhgtg) obj).f4861Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f4861Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4861Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        sb.append(": ");
        boolean z = true;
        for (C2423Ujhhgtgfeyxiexzf c2423Ujhhgtgfeyxiexzf : this.f4862Ujhhgtgfeyxiexzf.f6417Ujhhgtgfeyxiexzf) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c2423Ujhhgtgfeyxiexzf.f7841Ujhhgtgfeyxiexzf.f7839Ujhhgtgfeyxiexzf.toString());
        }
        return sb.toString();
    }
}
