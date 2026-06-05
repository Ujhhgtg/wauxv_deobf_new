package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3641Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f11374Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f11375Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3655Ujhhgtgfeyxiexzf f11376Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f11377Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C3641Ujhhgtgfeyxiexzf f11378Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C1224feyxiexzfUjhhgtg f11381Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public HashSet f11373Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f11379Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f11380Ujhhgtgfeyxiexzf = -1;

    public C3641Ujhhgtgfeyxiexzf(C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, int i) {
        this.f11376Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf;
        this.f11377Ujhhgtgfeyxiexzf = i;
    }

    public final String toString() {
        return this.f11376Ujhhgtgfeyxiexzf.f11623Ujhhgtgfeyxiexzf + ":" + AbstractC1225feyxiexzfUjhhgtg.m2712Ujhhgtgfeyxiexzf(this.f11377Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5285Ujhhgtgfeyxiexzf(C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf, int i) {
        m5286Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf, i, -1, false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m5286Ujhhgtgfeyxiexzf(C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf, int i, int i2, boolean z) {
        if (c3641Ujhhgtgfeyxiexzf == null) {
            m5294Ujhhgtgfeyxiexzf();
            return true;
        }
        if (!z && !m5293Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf)) {
            return false;
        }
        this.f11378Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf;
        if (c3641Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf == null) {
            c3641Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf = new HashSet();
        }
        HashSet hashSet = this.f11378Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f11379Ujhhgtgfeyxiexzf = i;
        } else {
            this.f11379Ujhhgtgfeyxiexzf = 0;
        }
        this.f11380Ujhhgtgfeyxiexzf = i2;
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m5287Ujhhgtgfeyxiexzf(int i, C2226feyxiexzfUjhhgtg c2226feyxiexzfUjhhgtg, ArrayList arrayList) {
        HashSet hashSet = this.f11373Ujhhgtgfeyxiexzf;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC3590Ujhhgtgfeyxiexzf.m5125Ujhhgtgfeyxiexzf(((C3641Ujhhgtgfeyxiexzf) it.next()).f11376Ujhhgtgfeyxiexzf, i, arrayList, c2226feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int m5288Ujhhgtgfeyxiexzf() {
        if (this.f11375Ujhhgtgfeyxiexzf) {
            return this.f11374Ujhhgtgfeyxiexzf;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m5289Ujhhgtgfeyxiexzf() {
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf;
        if (this.f11376Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf == 8) {
            return 0;
        }
        int i = this.f11380Ujhhgtgfeyxiexzf;
        return (i <= -1 || (c3641Ujhhgtgfeyxiexzf = this.f11378Ujhhgtgfeyxiexzf) == null || c3641Ujhhgtgfeyxiexzf.f11376Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf != 8) ? this.f11379Ujhhgtgfeyxiexzf : i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C3641Ujhhgtgfeyxiexzf m5290Ujhhgtgfeyxiexzf() {
        int i = this.f11377Ujhhgtgfeyxiexzf;
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f11376Ujhhgtgfeyxiexzf;
        switch (iM2713feyxiexzfUjhhgtg) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c3655Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg;
            case 2:
                return c3655Ujhhgtgfeyxiexzf.f11601feyxiexzfUjhhgtg;
            case 3:
                return c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg;
            case 4:
                return c3655Ujhhgtgfeyxiexzf.f11599feyxiexzfUjhhgtg;
            default:
                throw new AssertionError(AbstractC1225feyxiexzfUjhhgtg.m2712Ujhhgtgfeyxiexzf(i));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean m5291Ujhhgtgfeyxiexzf() {
        HashSet hashSet = this.f11373Ujhhgtgfeyxiexzf;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C3641Ujhhgtgfeyxiexzf) it.next()).m5290Ujhhgtgfeyxiexzf().m5292Ujhhgtgfeyxiexzf()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m5292Ujhhgtgfeyxiexzf() {
        return this.f11378Ujhhgtgfeyxiexzf != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[RETURN] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m5293Ujhhgtgfeyxiexzf(C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf) {
        if (c3641Ujhhgtgfeyxiexzf != null) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.f11376Ujhhgtgfeyxiexzf;
            int i = c3641Ujhhgtgfeyxiexzf.f11377Ujhhgtgfeyxiexzf;
            int i2 = this.f11377Ujhhgtgfeyxiexzf;
            if (i != i2) {
                switch (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2)) {
                    case 0:
                    case 5:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(c3655Ujhhgtgfeyxiexzf instanceof C0527Ujhhgtgfeyxiexzf)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(c3655Ujhhgtgfeyxiexzf instanceof C0527Ujhhgtgfeyxiexzf)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC1225feyxiexzfUjhhgtg.m2712Ujhhgtgfeyxiexzf(i2));
                }
            } else if (i2 != 6 || (c3655Ujhhgtgfeyxiexzf.f11594feyxiexzfUjhhgtg && this.f11376Ujhhgtgfeyxiexzf.f11594feyxiexzfUjhhgtg)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5294Ujhhgtgfeyxiexzf() {
        HashSet hashSet;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = this.f11378Ujhhgtgfeyxiexzf;
        if (c3641Ujhhgtgfeyxiexzf != null && (hashSet = c3641Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf) != null) {
            hashSet.remove(this);
            if (this.f11378Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf.size() == 0) {
                this.f11378Ujhhgtgfeyxiexzf.f11373Ujhhgtgfeyxiexzf = null;
            }
        }
        this.f11373Ujhhgtgfeyxiexzf = null;
        this.f11378Ujhhgtgfeyxiexzf = null;
        this.f11379Ujhhgtgfeyxiexzf = 0;
        this.f11380Ujhhgtgfeyxiexzf = -1;
        this.f11375Ujhhgtgfeyxiexzf = false;
        this.f11374Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m5295Ujhhgtgfeyxiexzf() {
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg = this.f11381Ujhhgtgfeyxiexzf;
        if (c1224feyxiexzfUjhhgtg == null) {
            this.f11381Ujhhgtgfeyxiexzf = new C1224feyxiexzfUjhhgtg(1);
        } else {
            c1224feyxiexzfUjhhgtg.m2686Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5296Ujhhgtgfeyxiexzf(int i) {
        this.f11374Ujhhgtgfeyxiexzf = i;
        this.f11375Ujhhgtgfeyxiexzf = true;
    }
}
