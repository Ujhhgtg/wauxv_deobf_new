package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛴᛳ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0682Ujhhgtgfeyxiexzf extends C0680Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0682Ujhhgtgfeyxiexzf f2810Ujhhgtgfeyxiexzf = new C0682Ujhhgtgfeyxiexzf(1, 0, 1);

    @Override // p000.C0680Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0682Ujhhgtgfeyxiexzf)) {
            return false;
        }
        if (isEmpty() && ((C0682Ujhhgtgfeyxiexzf) obj).isEmpty()) {
            return true;
        }
        C0682Ujhhgtgfeyxiexzf c0682Ujhhgtgfeyxiexzf = (C0682Ujhhgtgfeyxiexzf) obj;
        return this.f2805Ujhhgtgfeyxiexzf == c0682Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf && this.f2806Ujhhgtgfeyxiexzf == c0682Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C0680Ujhhgtgfeyxiexzf
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2805Ujhhgtgfeyxiexzf * 31) + this.f2806Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C0680Ujhhgtgfeyxiexzf
    public final boolean isEmpty() {
        return this.f2805Ujhhgtgfeyxiexzf > this.f2806Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C0680Ujhhgtgfeyxiexzf
    public final String toString() {
        return this.f2805Ujhhgtgfeyxiexzf + ".." + this.f2806Ujhhgtgfeyxiexzf;
    }
}
