package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛴᛱfeyxiexzfᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0392Ujhhgtgfeyxiexzf extends AbstractC0212Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final TreeMap f2131Ujhhgtgfeyxiexzf;

    public C0392Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        super("method_ids", c3268feyxiexzfUjhhgtg, 4);
        this.f2131Ujhhgtgfeyxiexzf = new TreeMap();
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final Collection mo1505Ujhhgtgfeyxiexzf() {
        return this.f2131Ujhhgtgfeyxiexzf.values();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m1645Ujhhgtgfeyxiexzf(AbstractC3756feyxiexzfUjhhgtg abstractC3756feyxiexzfUjhhgtg) {
        if (abstractC3756feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("ref == null");
        }
        m2563Ujhhgtgfeyxiexzf();
        C0396Ujhhgtgfeyxiexzf c0396Ujhhgtgfeyxiexzf = (C0396Ujhhgtgfeyxiexzf) this.f2131Ujhhgtgfeyxiexzf.get(abstractC3756feyxiexzfUjhhgtg);
        if (c0396Ujhhgtgfeyxiexzf != null) {
            return c0396Ujhhgtgfeyxiexzf.m1909Ujhhgtgfeyxiexzf();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final synchronized void m1646Ujhhgtgfeyxiexzf(AbstractC3756feyxiexzfUjhhgtg abstractC3756feyxiexzfUjhhgtg) {
        try {
            if (abstractC3756feyxiexzfUjhhgtg == null) {
                throw new NullPointerException("method == null");
            }
            m2564Ujhhgtgfeyxiexzf();
            if (((C0396Ujhhgtgfeyxiexzf) this.f2131Ujhhgtgfeyxiexzf.get(abstractC3756feyxiexzfUjhhgtg)) == null) {
                this.f2131Ujhhgtgfeyxiexzf.put(abstractC3756feyxiexzfUjhhgtg, new C0396Ujhhgtgfeyxiexzf(abstractC3756feyxiexzfUjhhgtg));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
