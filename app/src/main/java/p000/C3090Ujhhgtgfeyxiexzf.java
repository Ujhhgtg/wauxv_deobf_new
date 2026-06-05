package p000;

import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3090Ujhhgtgfeyxiexzf extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2363Ujhhgtgfeyxiexzf f9583Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public byte[] f9584Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f9585Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C3154Ujhhgtgfeyxiexzf f9586Ujhhgtgfeyxiexzf;

    public C3090Ujhhgtgfeyxiexzf(C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf, boolean z, C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf) {
        super(1, -1);
        if (c2363Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("code == null");
        }
        this.f9583Ujhhgtgfeyxiexzf = c2363Ujhhgtgfeyxiexzf;
        this.f9585Ujhhgtgfeyxiexzf = z;
        this.f9586Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2902Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo2860Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf, int i) {
        try {
            byte[] bArrM4589Ujhhgtgfeyxiexzf = m4589Ujhhgtgfeyxiexzf(c0295Ujhhgtgfeyxiexzf.f4172Ujhhgtgfeyxiexzf, null, null, false);
            this.f9584Ujhhgtgfeyxiexzf = bArrM4589Ujhhgtgfeyxiexzf;
            m2861Ujhhgtgfeyxiexzf(bArrM4589Ujhhgtgfeyxiexzf.length);
        } catch (RuntimeException e) {
            throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while placing debug info for " + this.f9586Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf(), e);
        }
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3887Ujhhgtgfeyxiexzf(m2858Ujhhgtgfeyxiexzf() + " debug info");
            m4589Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, null, c2608Ujhhgtgfeyxiexzf, true);
        }
        c2608Ujhhgtgfeyxiexzf.m3892Ujhhgtgfeyxiexzf(this.f9584Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final byte[] m4589Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, String str, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, boolean z) {
        C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = this.f9583Ujhhgtgfeyxiexzf;
        c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
        C1450feyxiexzfUjhhgtg c1450feyxiexzfUjhhgtg = (C1450feyxiexzfUjhhgtg) c2363Ujhhgtgfeyxiexzf.f7704Ujhhgtgfeyxiexzf;
        c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
        C0240Ujhhgtgfeyxiexzf c0240Ujhhgtgfeyxiexzf = (C0240Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7705Ujhhgtgfeyxiexzf;
        c2363Ujhhgtgfeyxiexzf.m3584Ujhhgtgfeyxiexzf();
        C3067Ujhhgtgfeyxiexzf c3067Ujhhgtgfeyxiexzf = (C3067Ujhhgtgfeyxiexzf) c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf;
        C3089Ujhhgtgfeyxiexzf c3089Ujhhgtgfeyxiexzf = new C3089Ujhhgtgfeyxiexzf(c1450feyxiexzfUjhhgtg, c0240Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg, c3067Ujhhgtgfeyxiexzf.m4541Ujhhgtgfeyxiexzf(), c3067Ujhhgtgfeyxiexzf.f9496Ujhhgtgfeyxiexzf, this.f9585Ujhhgtgfeyxiexzf, this.f9586Ujhhgtgfeyxiexzf);
        if (c2608Ujhhgtgfeyxiexzf == null) {
            try {
                return c3089Ujhhgtgfeyxiexzf.m4582Ujhhgtgfeyxiexzf();
            } catch (IOException e) {
                throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while encoding debug info", e);
            }
        }
        c3089Ujhhgtgfeyxiexzf.f9580Ujhhgtgfeyxiexzf = str;
        c3089Ujhhgtgfeyxiexzf.f9579Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf;
        c3089Ujhhgtgfeyxiexzf.f9581Ujhhgtgfeyxiexzf = z;
        try {
            return c3089Ujhhgtgfeyxiexzf.m4582Ujhhgtgfeyxiexzf();
        } catch (IOException e2) {
            throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while encoding debug info", e2);
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
    }
}
