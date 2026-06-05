package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ要点脸ᛳ能不能ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1234feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C1234feyxiexzfUjhhgtg f4561Ujhhgtgfeyxiexzf = new C1234feyxiexzfUjhhgtg(null, -1, -1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf f4562Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f4563Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f4564Ujhhgtgfeyxiexzf;

    public C1234feyxiexzfUjhhgtg(C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f4562Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf;
        this.f4563Ujhhgtgfeyxiexzf = i;
        this.f4564Ujhhgtgfeyxiexzf = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f4562Ujhhgtgfeyxiexzf;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        Object obj2;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf;
        if (!(obj instanceof C1234feyxiexzfUjhhgtg)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = (C1234feyxiexzfUjhhgtg) obj;
        return this.f4563Ujhhgtgfeyxiexzf == c1234feyxiexzfUjhhgtg.f4563Ujhhgtgfeyxiexzf && this.f4564Ujhhgtgfeyxiexzf == c1234feyxiexzfUjhhgtg.f4564Ujhhgtgfeyxiexzf && ((c3056Ujhhgtgfeyxiexzf = this.f4562Ujhhgtgfeyxiexzf) == obj2 || (c3056Ujhhgtgfeyxiexzf != null && c3056Ujhhgtgfeyxiexzf.equals(obj2)));
    }

    public final int hashCode() {
        return this.f4562Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf.hashCode() + this.f4563Ujhhgtgfeyxiexzf + this.f4564Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = this.f4562Ujhhgtgfeyxiexzf;
        if (c3056Ujhhgtgfeyxiexzf != null) {
            sb.append(c3056Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
            sb.append(":");
        }
        int i = this.f4564Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f4563Ujhhgtgfeyxiexzf;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i2));
        }
        return sb.toString();
    }
}
