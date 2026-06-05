package p000;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ能不能ᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0788feyxiexzfUjhhgtg implements InterfaceC1095feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final LinkedHashSet f3095Ujhhgtgfeyxiexzf = new LinkedHashSet();

    public C0788feyxiexzfUjhhgtg(C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf) {
        Object obj;
        C0938feyxiexzfUjhhgtg c0938feyxiexzfUjhhgtg = (C0938feyxiexzfUjhhgtg) c2362Ujhhgtgfeyxiexzf.f7698Ujhhgtgfeyxiexzf;
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf = c0938feyxiexzfUjhhgtg.mo2431Ujhhgtgfeyxiexzf("androidx.savedstate.Restarter");
        if (c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf != null) {
            obj = c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3761Ujhhgtgfeyxiexzf;
        } else {
            C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = new C0930feyxiexzfUjhhgtg("androidx.savedstate.Restarter", this);
            c0938feyxiexzfUjhhgtg.f3782Ujhhgtgfeyxiexzf++;
            C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg2 = c0938feyxiexzfUjhhgtg.f3780Ujhhgtgfeyxiexzf;
            if (c0930feyxiexzfUjhhgtg2 == null) {
                c0938feyxiexzfUjhhgtg.f3779Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
                c0938feyxiexzfUjhhgtg.f3780Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
            } else {
                c0930feyxiexzfUjhhgtg2.f3762Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
                c0930feyxiexzfUjhhgtg.f3763Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg2;
                c0938feyxiexzfUjhhgtg.f3780Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
            }
            obj = null;
        }
        if (((InterfaceC1095feyxiexzfUjhhgtg) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
