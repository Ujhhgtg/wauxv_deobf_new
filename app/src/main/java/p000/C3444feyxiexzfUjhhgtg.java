package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能ᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3444feyxiexzfUjhhgtg extends AbstractC0212Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final TreeMap f10726Ujhhgtgfeyxiexzf;

    public C3444feyxiexzfUjhhgtg(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        super("field_ids", c3268feyxiexzfUjhhgtg, 4);
        this.f10726Ujhhgtgfeyxiexzf = new TreeMap();
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final Collection mo1505Ujhhgtgfeyxiexzf() {
        return this.f10726Ujhhgtgfeyxiexzf.values();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m4943Ujhhgtgfeyxiexzf(C3140Ujhhgtgfeyxiexzf c3140Ujhhgtgfeyxiexzf) {
        if (c3140Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("ref == null");
        }
        m2563Ujhhgtgfeyxiexzf();
        C3443feyxiexzfUjhhgtg c3443feyxiexzfUjhhgtg = (C3443feyxiexzfUjhhgtg) this.f10726Ujhhgtgfeyxiexzf.get(c3140Ujhhgtgfeyxiexzf);
        if (c3443feyxiexzfUjhhgtg != null) {
            return c3443feyxiexzfUjhhgtg.m1909Ujhhgtgfeyxiexzf();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final synchronized C3443feyxiexzfUjhhgtg m4944Ujhhgtgfeyxiexzf(C3140Ujhhgtgfeyxiexzf c3140Ujhhgtgfeyxiexzf) {
        C3443feyxiexzfUjhhgtg c3443feyxiexzfUjhhgtg;
        try {
            if (c3140Ujhhgtgfeyxiexzf == null) {
                throw new NullPointerException("field == null");
            }
            m2564Ujhhgtgfeyxiexzf();
            c3443feyxiexzfUjhhgtg = (C3443feyxiexzfUjhhgtg) this.f10726Ujhhgtgfeyxiexzf.get(c3140Ujhhgtgfeyxiexzf);
            if (c3443feyxiexzfUjhhgtg == null) {
                c3443feyxiexzfUjhhgtg = new C3443feyxiexzfUjhhgtg(c3140Ujhhgtgfeyxiexzf);
                this.f10726Ujhhgtgfeyxiexzf.put(c3140Ujhhgtgfeyxiexzf, c3443feyxiexzfUjhhgtg);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3443feyxiexzfUjhhgtg;
    }
}
