package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛲᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3455feyxiexzfUjhhgtg implements InterfaceC1117feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10742Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1117feyxiexzfUjhhgtg f10743Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3549feyxiexzfUjhhgtg f10744Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3455feyxiexzfUjhhgtg(InterfaceC1117feyxiexzfUjhhgtg interfaceC1117feyxiexzfUjhhgtg, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg, int i) {
        this.f10742Ujhhgtgfeyxiexzf = i;
        this.f10743Ujhhgtgfeyxiexzf = interfaceC1117feyxiexzfUjhhgtg;
        this.f10744Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC1117feyxiexzfUjhhgtg
    public final Iterator iterator() {
        switch (this.f10742Ujhhgtgfeyxiexzf) {
            case 0:
                return new C3447Ujhhgtgfeyxiexzf(this);
            default:
                return new C1766feyxiexzfUjhhgtg(this);
        }
    }
}
