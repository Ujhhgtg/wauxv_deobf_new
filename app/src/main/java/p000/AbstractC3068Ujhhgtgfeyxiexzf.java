package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3068Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f9497Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3216feyxiexzfUjhhgtg f9498Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1234feyxiexzfUjhhgtg f9499Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0960feyxiexzfUjhhgtg f9500Ujhhgtgfeyxiexzf;

    public AbstractC3068Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        if (c3216feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c1234feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("position == null");
        }
        if (c0960feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("registers == null");
        }
        this.f9497Ujhhgtgfeyxiexzf = -1;
        this.f9498Ujhhgtgfeyxiexzf = c3216feyxiexzfUjhhgtg;
        this.f9499Ujhhgtgfeyxiexzf = c1234feyxiexzfUjhhgtg;
        this.f9500Ujhhgtgfeyxiexzf = c0960feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static C1047feyxiexzfUjhhgtg m4543Ujhhgtgfeyxiexzf(C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg2) {
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg;
        boolean z = c0961feyxiexzfUjhhgtg.m2455Ujhhgtgfeyxiexzf() == 1;
        boolean zM3127Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType().m3127Ujhhgtgfeyxiexzf();
        int i = c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf;
        if ((c0961feyxiexzfUjhhgtg2.f3830Ujhhgtgfeyxiexzf | i) < 16) {
            if (zM3127Ujhhgtgfeyxiexzf) {
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f9968Ujhhgtgfeyxiexzf;
            } else {
                c3216feyxiexzfUjhhgtg = z ? AbstractC3212feyxiexzfUjhhgtg.f9962Ujhhgtgfeyxiexzf : AbstractC3212feyxiexzfUjhhgtg.f9965Ujhhgtgfeyxiexzf;
            }
        } else if (i < 256) {
            if (zM3127Ujhhgtgfeyxiexzf) {
                c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f9969Ujhhgtgfeyxiexzf;
            } else {
                c3216feyxiexzfUjhhgtg = z ? AbstractC3212feyxiexzfUjhhgtg.f9963Ujhhgtgfeyxiexzf : AbstractC3212feyxiexzfUjhhgtg.f9966Ujhhgtgfeyxiexzf;
            }
        } else if (zM3127Ujhhgtgfeyxiexzf) {
            c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f9970Ujhhgtgfeyxiexzf;
        } else {
            c3216feyxiexzfUjhhgtg = z ? AbstractC3212feyxiexzfUjhhgtg.f9964Ujhhgtgfeyxiexzf : AbstractC3212feyxiexzfUjhhgtg.f9967Ujhhgtgfeyxiexzf;
        }
        return new C1047feyxiexzfUjhhgtg(c3216feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg.m2446Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtg2));
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m4545Ujhhgtgfeyxiexzf());
        sb.append(' ');
        sb.append(this.f9499Ujhhgtgfeyxiexzf);
        sb.append(": ");
        sb.append(this.f9498Ujhhgtgfeyxiexzf.m4712Ujhhgtgfeyxiexzf());
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = this.f9500Ujhhgtgfeyxiexzf;
        if (c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length != 0) {
            z = true;
            sb.append(c0960feyxiexzfUjhhgtg.m4971Ujhhgtgfeyxiexzf(" ", null, true));
        } else {
            z = false;
        }
        String strMo1802Ujhhgtgfeyxiexzf = mo1802Ujhhgtgfeyxiexzf();
        if (strMo1802Ujhhgtgfeyxiexzf != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo1802Ujhhgtgfeyxiexzf);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public abstract String mo1802Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public abstract int mo1865Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public String mo1803Ujhhgtgfeyxiexzf() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public String mo1804Ujhhgtgfeyxiexzf() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m4544Ujhhgtgfeyxiexzf() {
        int i = this.f9497Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String m4545Ujhhgtgfeyxiexzf() {
        int i = this.f9497Ujhhgtgfeyxiexzf;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public abstract String mo1866Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public abstract AbstractC3068Ujhhgtgfeyxiexzf mo1805Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public abstract AbstractC3068Ujhhgtgfeyxiexzf mo3477Ujhhgtgfeyxiexzf(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public abstract AbstractC3068Ujhhgtgfeyxiexzf mo1806Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public abstract void mo1867Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf);
}
