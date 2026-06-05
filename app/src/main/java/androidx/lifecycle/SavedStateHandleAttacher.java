package androidx.lifecycle;

import android.os.Bundle;
import p000.C0937feyxiexzfUjhhgtg;
import p000.InterfaceC0053Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0053Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0937feyxiexzfUjhhgtg f297Ujhhgtgfeyxiexzf;

    public SavedStateHandleAttacher(C0937feyxiexzfUjhhgtg c0937feyxiexzfUjhhgtg) {
        this.f297Ujhhgtgfeyxiexzf = c0937feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0053Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo0Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        if (ujhhgtgfeyxiexzf != Ujhhgtgfeyxiexzf.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + ujhhgtgfeyxiexzf).toString());
        }
        interfaceC0083Ujhhgtgfeyxiexzf.mo895Ujhhgtgfeyxiexzf().m102Ujhhgtgfeyxiexzf(this);
        C0937feyxiexzfUjhhgtg c0937feyxiexzfUjhhgtg = this.f297Ujhhgtgfeyxiexzf;
        if (c0937feyxiexzfUjhhgtg.f3776Ujhhgtgfeyxiexzf) {
            return;
        }
        Bundle bundleM3578Ujhhgtgfeyxiexzf = c0937feyxiexzfUjhhgtg.f3775Ujhhgtgfeyxiexzf.m3578Ujhhgtgfeyxiexzf("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0937feyxiexzfUjhhgtg.f3777Ujhhgtgfeyxiexzf;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM3578Ujhhgtgfeyxiexzf != null) {
            bundle.putAll(bundleM3578Ujhhgtgfeyxiexzf);
        }
        c0937feyxiexzfUjhhgtg.f3777Ujhhgtgfeyxiexzf = bundle;
        c0937feyxiexzfUjhhgtg.f3776Ujhhgtgfeyxiexzf = true;
    }
}
