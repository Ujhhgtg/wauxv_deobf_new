package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC3349Ujhhgtgfeyxiexzf implements Runnable, Comparable, InterfaceC3227feyxiexzfUjhhgtg {
    private volatile Object _heap;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public long f10461Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f10462Ujhhgtgfeyxiexzf;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f10461Ujhhgtgfeyxiexzf - ((AbstractRunnableC3349Ujhhgtgfeyxiexzf) obj).f10461Ujhhgtgfeyxiexzf;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f10461Ujhhgtgfeyxiexzf + ']';
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m4851Ujhhgtgfeyxiexzf(long j, C3352Ujhhgtgfeyxiexzf c3352Ujhhgtgfeyxiexzf, AbstractC3351Ujhhgtgfeyxiexzf abstractC3351Ujhhgtgfeyxiexzf) {
        synchronized (this) {
            if (this._heap == AbstractC1243feyxiexzfUjhhgtg.f4580Ujhhgtgfeyxiexzf) {
                return 2;
            }
            synchronized (c3352Ujhhgtgfeyxiexzf) {
                try {
                    AbstractRunnableC3349Ujhhgtgfeyxiexzf[] abstractRunnableC3349UjhhgtgfeyxiexzfArr = c3352Ujhhgtgfeyxiexzf.f6561Ujhhgtgfeyxiexzf;
                    AbstractRunnableC3349Ujhhgtgfeyxiexzf abstractRunnableC3349Ujhhgtgfeyxiexzf = abstractRunnableC3349UjhhgtgfeyxiexzfArr != null ? abstractRunnableC3349UjhhgtgfeyxiexzfArr[0] : null;
                    if (AbstractC3351Ujhhgtgfeyxiexzf.f10467Ujhhgtgfeyxiexzf.get(abstractC3351Ujhhgtgfeyxiexzf) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC3349Ujhhgtgfeyxiexzf == null) {
                        c3352Ujhhgtgfeyxiexzf.f10468Ujhhgtgfeyxiexzf = j;
                    } else {
                        long j2 = abstractRunnableC3349Ujhhgtgfeyxiexzf.f10461Ujhhgtgfeyxiexzf;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c3352Ujhhgtgfeyxiexzf.f10468Ujhhgtgfeyxiexzf > 0) {
                            c3352Ujhhgtgfeyxiexzf.f10468Ujhhgtgfeyxiexzf = j;
                        }
                    }
                    long j3 = this.f10461Ujhhgtgfeyxiexzf;
                    long j4 = c3352Ujhhgtgfeyxiexzf.f10468Ujhhgtgfeyxiexzf;
                    if (j3 - j4 < 0) {
                        this.f10461Ujhhgtgfeyxiexzf = j4;
                    }
                    c3352Ujhhgtgfeyxiexzf.m3344Ujhhgtgfeyxiexzf(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4852Ujhhgtgfeyxiexzf(C3352Ujhhgtgfeyxiexzf c3352Ujhhgtgfeyxiexzf) {
        if (this._heap == AbstractC1243feyxiexzfUjhhgtg.f4580Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c3352Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3227feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo2039Ujhhgtgfeyxiexzf() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C3290Ujhhgtgfeyxiexzf c3290Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.f4580Ujhhgtgfeyxiexzf;
                if (obj == c3290Ujhhgtgfeyxiexzf) {
                    return;
                }
                C3352Ujhhgtgfeyxiexzf c3352Ujhhgtgfeyxiexzf = obj instanceof C3352Ujhhgtgfeyxiexzf ? (C3352Ujhhgtgfeyxiexzf) obj : null;
                if (c3352Ujhhgtgfeyxiexzf != null) {
                    synchronized (c3352Ujhhgtgfeyxiexzf) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C1991feyxiexzfUjhhgtg ? (C1991feyxiexzfUjhhgtg) obj2 : null) != null) {
                            c3352Ujhhgtgfeyxiexzf.m3345Ujhhgtgfeyxiexzf(this.f10462Ujhhgtgfeyxiexzf);
                        }
                    }
                }
                this._heap = c3290Ujhhgtgfeyxiexzf;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
