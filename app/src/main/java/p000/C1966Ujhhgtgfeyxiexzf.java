package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1966Ujhhgtgfeyxiexzf extends AbstractC3473Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2866feyxiexzfUjhhgtg f6447Ujhhgtgfeyxiexzf;

    public C1966Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg, C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg) {
        super(c3216feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtg);
        if (c2866feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("target == null");
        }
        this.f6447Ujhhgtgfeyxiexzf = c2866feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1802Ujhhgtgfeyxiexzf() {
        C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg = this.f6447Ujhhgtgfeyxiexzf;
        return c2866feyxiexzfUjhhgtg == null ? "????" : c2866feyxiexzfUjhhgtg.m4545Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1805Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg) {
        return new C1966Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtg, this.f9499Ujhhgtgfeyxiexzf, this.f9500Ujhhgtgfeyxiexzf, this.f6447Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1806Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        return new C1966Ujhhgtgfeyxiexzf(this.f9498Ujhhgtgfeyxiexzf, this.f9499Ujhhgtgfeyxiexzf, c0960feyxiexzfUjhhgtg, this.f6447Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int m3298Ujhhgtgfeyxiexzf() {
        return this.f6447Ujhhgtgfeyxiexzf.m4544Ujhhgtgfeyxiexzf() - m4544Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final boolean m3299Ujhhgtgfeyxiexzf() {
        return this.f9497Ujhhgtgfeyxiexzf >= 0 && this.f6447Ujhhgtgfeyxiexzf.f9497Ujhhgtgfeyxiexzf >= 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C1966Ujhhgtgfeyxiexzf m3300Ujhhgtgfeyxiexzf(C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg) {
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg2 = this.f9498Ujhhgtgfeyxiexzf;
        switch (c3216feyxiexzfUjhhgtg2.f10099Ujhhgtgfeyxiexzf) {
            case Opcodes.AALOAD /* 50 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10002feyxiexzfUjhhgtg;
                break;
            case Opcodes.BALOAD /* 51 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10001feyxiexzfUjhhgtg;
                break;
            case 52:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10004feyxiexzfUjhhgtg;
                break;
            case Opcodes.SALOAD /* 53 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10003feyxiexzfUjhhgtg;
                break;
            case Opcodes.ISTORE /* 54 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10006feyxiexzfUjhhgtg;
                break;
            case Opcodes.LSTORE /* 55 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10005feyxiexzfUjhhgtg;
                break;
            case Opcodes.FSTORE /* 56 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10008Ujhhgtgfeyxiexzf;
                break;
            case Opcodes.DSTORE /* 57 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10007Ujhhgtgfeyxiexzf;
                break;
            case Opcodes.ASTORE /* 58 */:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10010Ujhhgtgfeyxiexzf;
                break;
            case 59:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10009Ujhhgtgfeyxiexzf;
                break;
            case 60:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10012Ujhhgtgfeyxiexzf;
                break;
            case 61:
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f10011Ujhhgtgfeyxiexzf;
                break;
            default:
                throw new IllegalArgumentException("bogus opcode: " + c3216feyxiexzfUjhhgtg2);
        }
        return new C1966Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtg, this.f9499Ujhhgtgfeyxiexzf, this.f9500Ujhhgtgfeyxiexzf, c2866feyxiexzfUjhhgtg);
    }
}
