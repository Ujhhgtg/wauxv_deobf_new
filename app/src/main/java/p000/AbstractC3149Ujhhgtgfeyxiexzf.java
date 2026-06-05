package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱ能不能ᛳᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3149Ujhhgtgfeyxiexzf extends AbstractC3150Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f9757Ujhhgtgfeyxiexzf;

    public AbstractC3149Ujhhgtgfeyxiexzf(long j) {
        this.f9757Ujhhgtgfeyxiexzf = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9757Ujhhgtgfeyxiexzf == ((AbstractC3149Ujhhgtgfeyxiexzf) obj).f9757Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        long j = this.f9757Ujhhgtgfeyxiexzf;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo4535Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        long j = ((AbstractC3149Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9757Ujhhgtgfeyxiexzf;
        long j2 = this.f9757Ujhhgtgfeyxiexzf;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo4536Ujhhgtgfeyxiexzf() {
        return true;
    }

    @Override // p000.AbstractC3150Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final boolean mo4663Ujhhgtgfeyxiexzf() {
        long j = this.f9757Ujhhgtgfeyxiexzf;
        return ((long) ((int) j)) == j;
    }

    @Override // p000.AbstractC3150Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final int mo4664Ujhhgtgfeyxiexzf() {
        return (int) this.f9757Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3150Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final long mo4665Ujhhgtgfeyxiexzf() {
        return this.f9757Ujhhgtgfeyxiexzf;
    }
}
