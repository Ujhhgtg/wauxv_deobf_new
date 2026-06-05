package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3474Ujhhgtgfeyxiexzf extends AbstractC0417Ujhhgtgfeyxiexzf implements InterfaceC1724Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object[] f10801Ujhhgtgfeyxiexzf;

    public AbstractC3474Ujhhgtgfeyxiexzf(int i) {
        super(i != 0);
        try {
            this.f10801Ujhhgtgfeyxiexzf = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10801Ujhhgtgfeyxiexzf, ((AbstractC3474Ujhhgtgfeyxiexzf) obj).f10801Ujhhgtgfeyxiexzf);
    }

    public C1784feyxiexzfUjhhgtg getType(int i) {
        return (C1784feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10801Ujhhgtgfeyxiexzf);
    }

    public final int size() {
        return this.f10801Ujhhgtgfeyxiexzf.length;
    }

    public final String toString() {
        String name = getClass().getName();
        return m4971Ujhhgtgfeyxiexzf(name.substring(name.lastIndexOf(46) + 1) + '{', "}", false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public String mo1392Ujhhgtgfeyxiexzf() {
        String name = getClass().getName();
        return m4971Ujhhgtgfeyxiexzf(name.substring(name.lastIndexOf(46) + 1) + '{', "}", true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final Object m4969Ujhhgtgfeyxiexzf(int i) {
        try {
            Object obj = this.f10801Ujhhgtgfeyxiexzf[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4970Ujhhgtgfeyxiexzf(int i, Object obj) {
        m1729Ujhhgtgfeyxiexzf();
        try {
            this.f10801Ujhhgtgfeyxiexzf[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i >= 0) {
                throw new IndexOutOfBoundsException("n >= size()");
            }
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final String m4971Ujhhgtgfeyxiexzf(String str, String str2, boolean z) {
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((InterfaceC1724Ujhhgtgfeyxiexzf) this.f10801Ujhhgtgfeyxiexzf[i]).mo1392Ujhhgtgfeyxiexzf());
            } else {
                sb.append(this.f10801Ujhhgtgfeyxiexzf[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }
}
