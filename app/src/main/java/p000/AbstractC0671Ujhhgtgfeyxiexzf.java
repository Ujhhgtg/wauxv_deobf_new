package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱ能不能ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0671Ujhhgtgfeyxiexzf implements InterfaceC1724Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0927feyxiexzfUjhhgtg f2786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1234feyxiexzfUjhhgtg f2787Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0961feyxiexzfUjhhgtg f2788Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0960feyxiexzfUjhhgtg f2789Ujhhgtgfeyxiexzf;

    public AbstractC0671Ujhhgtgfeyxiexzf(C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        if (c0927feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c1234feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("position == null");
        }
        if (c0960feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("sources == null");
        }
        this.f2786Ujhhgtgfeyxiexzf = c0927feyxiexzfUjhhgtg;
        this.f2787Ujhhgtgfeyxiexzf = c1234feyxiexzfUjhhgtg;
        this.f2788Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtg;
        this.f2789Ujhhgtgfeyxiexzf = c0960feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo1938Ujhhgtgfeyxiexzf = mo1938Ujhhgtgfeyxiexzf();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.f2787Ujhhgtgfeyxiexzf);
        sb.append(' ');
        sb.append(this.f2786Ujhhgtgfeyxiexzf);
        if (strMo1938Ujhhgtgfeyxiexzf != null) {
            sb.append(' ');
            sb.append(strMo1938Ujhhgtgfeyxiexzf);
        }
        sb.append(" :: ");
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = this.f2788Ujhhgtgfeyxiexzf;
        if (c0961feyxiexzfUjhhgtg != null) {
            sb.append(c0961feyxiexzfUjhhgtg);
            sb.append(" <- ");
        }
        sb.append(this.f2789Ujhhgtgfeyxiexzf);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        String strMo1938Ujhhgtgfeyxiexzf = mo1938Ujhhgtgfeyxiexzf();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f2787Ujhhgtgfeyxiexzf);
        sb.append(": ");
        C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg = this.f2786Ujhhgtgfeyxiexzf;
        String string = c0927feyxiexzfUjhhgtg.f3756Ujhhgtgfeyxiexzf;
        if (string == null) {
            string = c0927feyxiexzfUjhhgtg.toString();
        }
        sb.append(string);
        if (strMo1938Ujhhgtgfeyxiexzf != null) {
            sb.append("(");
            sb.append(strMo1938Ujhhgtgfeyxiexzf);
            sb.append(")");
        }
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = this.f2788Ujhhgtgfeyxiexzf;
        if (c0961feyxiexzfUjhhgtg == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c0961feyxiexzfUjhhgtg.m2458Ujhhgtgfeyxiexzf(true));
        }
        sb.append(" <-");
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = this.f2789Ujhhgtgfeyxiexzf;
        int length = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(" ");
                sb.append(((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i)).m2458Ujhhgtgfeyxiexzf(true));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public abstract void mo1936Ujhhgtgfeyxiexzf(InterfaceC0690Ujhhgtgfeyxiexzf interfaceC0690Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public abstract InterfaceC1790feyxiexzfUjhhgtg mo1937Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public String mo1938Ujhhgtgfeyxiexzf() {
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public abstract AbstractC0671Ujhhgtgfeyxiexzf mo1939Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg);
}
