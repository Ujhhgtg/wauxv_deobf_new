package androidx.activity;

import p000.C1315feyxiexzfUjhhgtg;
import p000.InterfaceC0053Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.InterfaceC2773Ujhhgtgfeyxiexzf;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0053Ujhhgtgfeyxiexzf, InterfaceC2773Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C1315feyxiexzfUjhhgtg f1Ujhhgtgfeyxiexzf;

    @Override // p000.InterfaceC2773Ujhhgtgfeyxiexzf
    public final void cancel() {
        throw null;
    }

    @Override // p000.InterfaceC0053Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo0Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        if (ujhhgtgfeyxiexzf == Ujhhgtgfeyxiexzf.ON_START) {
            throw null;
        }
        if (ujhhgtgfeyxiexzf != Ujhhgtgfeyxiexzf.ON_STOP) {
            if (ujhhgtgfeyxiexzf == Ujhhgtgfeyxiexzf.ON_DESTROY) {
                cancel();
            }
        } else {
            C1315feyxiexzfUjhhgtg c1315feyxiexzfUjhhgtg = this.f1Ujhhgtgfeyxiexzf;
            if (c1315feyxiexzfUjhhgtg != null) {
                c1315feyxiexzfUjhhgtg.cancel();
            }
        }
    }
}
