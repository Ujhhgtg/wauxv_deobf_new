package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3254feyxiexzfUjhhgtg implements InterfaceC1117feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10205Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f10206Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3587Ujhhgtgfeyxiexzf f10207Ujhhgtgfeyxiexzf;

    /* JADX WARN: Multi-variable type inference failed */
    public C3254feyxiexzfUjhhgtg(InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        this.f10206Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
        this.f10207Ujhhgtgfeyxiexzf = (AbstractC3569Ujhhgtgfeyxiexzf) interfaceC3549feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC1117feyxiexzfUjhhgtg
    public final Iterator iterator() {
        switch (this.f10205Ujhhgtgfeyxiexzf) {
            case 0:
                return new C3253feyxiexzfUjhhgtg(this);
            default:
                return new C3576feyxiexzfUjhhgtg(this);
        }
    }

    public C3254feyxiexzfUjhhgtg(CharSequence charSequence, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        this.f10206Ujhhgtgfeyxiexzf = charSequence;
        this.f10207Ujhhgtgfeyxiexzf = interfaceC3553feyxiexzfUjhhgtg;
    }
}
