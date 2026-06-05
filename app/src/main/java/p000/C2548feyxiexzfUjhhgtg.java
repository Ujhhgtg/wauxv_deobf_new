package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛳᛲᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2548feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f8268Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f8269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f8270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f8271Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f8272Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f8273Ujhhgtgfeyxiexzf;

    public C2548feyxiexzfUjhhgtg(C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg, int i, int i2, C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg) {
        if (c3159feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("cf == null");
        }
        if (c3382feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM3906Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i2);
        this.f8271Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg;
        this.f8268Ujhhgtgfeyxiexzf = i;
        this.f8269Ujhhgtgfeyxiexzf = i2;
        this.f8272Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        this.f8273Ujhhgtgfeyxiexzf = new C2657Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf);
        this.f8270Ujhhgtgfeyxiexzf = -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m3799Ujhhgtgfeyxiexzf() {
        if (this.f8270Ujhhgtgfeyxiexzf < 0) {
            C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf = (C2657Ujhhgtgfeyxiexzf) this.f8273Ujhhgtgfeyxiexzf;
            int length = c2657Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
            int iMo2154Ujhhgtgfeyxiexzf = this.f8269Ujhhgtgfeyxiexzf + 2;
            C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg = (C3159feyxiexzfUjhhgtg) this.f8271Ujhhgtgfeyxiexzf;
            C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf;
            for (int i = 0; i < length; i++) {
                try {
                    AbstractC2482feyxiexzfUjhhgtg abstractC2482feyxiexzfUjhhgtgM4902Ujhhgtgfeyxiexzf = ((C3382feyxiexzfUjhhgtg) this.f8272Ujhhgtgfeyxiexzf).m4902Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg, this.f8268Ujhhgtgfeyxiexzf, iMo2154Ujhhgtgfeyxiexzf);
                    iMo2154Ujhhgtgfeyxiexzf += abstractC2482feyxiexzfUjhhgtgM4902Ujhhgtgfeyxiexzf.mo2154Ujhhgtgfeyxiexzf();
                    c2657Ujhhgtgfeyxiexzf.m4970Ujhhgtgfeyxiexzf(i, abstractC2482feyxiexzfUjhhgtgM4902Ujhhgtgfeyxiexzf);
                } catch (C1404feyxiexzfUjhhgtg e) {
                    e.m4861Ujhhgtgfeyxiexzf("...while parsing attributes[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C1404feyxiexzfUjhhgtg c1404feyxiexzfUjhhgtg = new C1404feyxiexzfUjhhgtg(null, e2);
                    c1404feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf("...while parsing attributes[" + i + "]");
                    throw c1404feyxiexzfUjhhgtg;
                }
            }
            this.f8270Ujhhgtgfeyxiexzf = iMo2154Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m3800Ujhhgtgfeyxiexzf() {
        this.f8268Ujhhgtgfeyxiexzf = 1;
        this.f8272Ujhhgtgfeyxiexzf = (C0381Ujhhgtgfeyxiexzf) this.f8271Ujhhgtgfeyxiexzf;
        this.f8270Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean m3801Ujhhgtgfeyxiexzf() {
        C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf = ((C0381Ujhhgtgfeyxiexzf) this.f8272Ujhhgtgfeyxiexzf).f2092Ujhhgtgfeyxiexzf.m3098Ujhhgtgfeyxiexzf();
        int iM1223Ujhhgtgfeyxiexzf = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(6);
        return !(iM1223Ujhhgtgfeyxiexzf == 0 || ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).get(iM1223Ujhhgtgfeyxiexzf + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf) == 0) || this.f8269Ujhhgtgfeyxiexzf == 65039;
    }

    public C2548feyxiexzfUjhhgtg(C0381Ujhhgtgfeyxiexzf c0381Ujhhgtgfeyxiexzf) {
        this.f8268Ujhhgtgfeyxiexzf = 1;
        this.f8271Ujhhgtgfeyxiexzf = c0381Ujhhgtgfeyxiexzf;
        this.f8272Ujhhgtgfeyxiexzf = c0381Ujhhgtgfeyxiexzf;
    }
}
