package p000;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ能不能ᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0895feyxiexzfUjhhgtg implements InterfaceC2883feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1030feyxiexzfUjhhgtg f3452Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C0894feyxiexzfUjhhgtg f3453Ujhhgtgfeyxiexzf;

    public C0895feyxiexzfUjhhgtg(ComponentCallbacks2C0894feyxiexzfUjhhgtg componentCallbacks2C0894feyxiexzfUjhhgtg, C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtg) {
        this.f3453Ujhhgtgfeyxiexzf = componentCallbacks2C0894feyxiexzfUjhhgtg;
        this.f3452Ujhhgtgfeyxiexzf = c1030feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC2883feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo2375Ujhhgtgfeyxiexzf(boolean z) {
        if (z) {
            synchronized (this.f3453Ujhhgtgfeyxiexzf) {
                C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtg = this.f3452Ujhhgtgfeyxiexzf;
                for (InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg : AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf((Set) c1030feyxiexzfUjhhgtg.f4031Ujhhgtgfeyxiexzf)) {
                    if (!interfaceC0994feyxiexzfUjhhgtg.mo2500Ujhhgtgfeyxiexzf() && !interfaceC0994feyxiexzfUjhhgtg.mo2498Ujhhgtgfeyxiexzf()) {
                        interfaceC0994feyxiexzfUjhhgtg.clear();
                        if (c1030feyxiexzfUjhhgtg.f4030Ujhhgtgfeyxiexzf) {
                            ((HashSet) c1030feyxiexzfUjhhgtg.f4032Ujhhgtgfeyxiexzf).add(interfaceC0994feyxiexzfUjhhgtg);
                        } else {
                            interfaceC0994feyxiexzfUjhhgtg.mo2499Ujhhgtgfeyxiexzf();
                        }
                    }
                }
            }
        }
    }
}
