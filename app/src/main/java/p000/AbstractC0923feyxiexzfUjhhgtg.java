package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ能不能要点脸ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0923feyxiexzfUjhhgtg extends AbstractC2483feyxiexzfUjhhgtg implements InterfaceC3588feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f3742Ujhhgtgfeyxiexzf;

    public AbstractC0923feyxiexzfUjhhgtg(int i, InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) {
        super(interfaceC3704Ujhhgtgfeyxiexzf);
        if (interfaceC3704Ujhhgtgfeyxiexzf != null && interfaceC3704Ujhhgtgfeyxiexzf.mo2414Ujhhgtgfeyxiexzf() != C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f3742Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3588feyxiexzfUjhhgtg
    public final int getArity() {
        return this.f3742Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    public final String toString() {
        if (this.f8115Ujhhgtgfeyxiexzf != null) {
            return super.toString();
        }
        AbstractC0959feyxiexzfUjhhgtg.f3826Ujhhgtgfeyxiexzf.getClass();
        return C0955feyxiexzfUjhhgtg.m2442Ujhhgtgfeyxiexzf(this);
    }

    @Override // p000.InterfaceC3704Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC3739feyxiexzfUjhhgtg mo2414Ujhhgtgfeyxiexzf() {
        return C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf;
    }
}
