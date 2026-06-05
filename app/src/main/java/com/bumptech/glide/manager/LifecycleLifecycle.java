package com.bumptech.glide.manager;

import java.util.Iterator;
import p000.AbstractC1860Ujhhgtgfeyxiexzf;
import p000.InterfaceC0049Ujhhgtgfeyxiexzf;
import p000.InterfaceC0050Ujhhgtgfeyxiexzf;
import p000.InterfaceC0052Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.InterfaceC1320feyxiexzfUjhhgtg;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC0052Ujhhgtgfeyxiexzf, InterfaceC0050Ujhhgtgfeyxiexzf {
    @InterfaceC1320feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf.ON_DESTROY)
    public void onDestroy(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf) {
        Iterator it = AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC0049Ujhhgtgfeyxiexzf) it.next()).mo1052Ujhhgtgfeyxiexzf();
        }
        interfaceC0083Ujhhgtgfeyxiexzf.mo895Ujhhgtgfeyxiexzf().m102Ujhhgtgfeyxiexzf(this);
    }

    @InterfaceC1320feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf.ON_START)
    public void onStart(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf) {
        Iterator it = AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC0049Ujhhgtgfeyxiexzf) it.next()).mo1054Ujhhgtgfeyxiexzf();
        }
    }

    @InterfaceC1320feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf.ON_STOP)
    public void onStop(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf) {
        Iterator it = AbstractC1860Ujhhgtgfeyxiexzf.m3196Ujhhgtgfeyxiexzf(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC0049Ujhhgtgfeyxiexzf) it.next()).mo1053Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC0052Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo754Ujhhgtgfeyxiexzf(InterfaceC0049Ujhhgtgfeyxiexzf interfaceC0049Ujhhgtgfeyxiexzf) {
        throw null;
    }

    @Override // p000.InterfaceC0052Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo755Ujhhgtgfeyxiexzf(InterfaceC0049Ujhhgtgfeyxiexzf interfaceC0049Ujhhgtgfeyxiexzf) {
        throw null;
    }
}
