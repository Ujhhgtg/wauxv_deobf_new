package androidx.lifecycle;

import p000.AbstractC3118Ujhhgtgfeyxiexzf;
import p000.InterfaceC0053Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.InterfaceC3115Ujhhgtgfeyxiexzf;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0053Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3115Ujhhgtgfeyxiexzf f293Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC0053Ujhhgtgfeyxiexzf f294Ujhhgtgfeyxiexzf;

    public DefaultLifecycleObserverAdapter(InterfaceC3115Ujhhgtgfeyxiexzf interfaceC3115Ujhhgtgfeyxiexzf, InterfaceC0053Ujhhgtgfeyxiexzf interfaceC0053Ujhhgtgfeyxiexzf) {
        this.f293Ujhhgtgfeyxiexzf = interfaceC3115Ujhhgtgfeyxiexzf;
        this.f294Ujhhgtgfeyxiexzf = interfaceC0053Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0053Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo0Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        int i = AbstractC3118Ujhhgtgfeyxiexzf.f9694Ujhhgtgfeyxiexzf[ujhhgtgfeyxiexzf.ordinal()];
        InterfaceC3115Ujhhgtgfeyxiexzf interfaceC3115Ujhhgtgfeyxiexzf = this.f293Ujhhgtgfeyxiexzf;
        switch (i) {
            case 1:
                interfaceC3115Ujhhgtgfeyxiexzf.mo868Ujhhgtgfeyxiexzf();
                break;
            case 2:
                interfaceC3115Ujhhgtgfeyxiexzf.onStart(interfaceC0083Ujhhgtgfeyxiexzf);
                break;
            case 3:
                interfaceC3115Ujhhgtgfeyxiexzf.mo94Ujhhgtgfeyxiexzf();
                break;
            case 4:
                interfaceC3115Ujhhgtgfeyxiexzf.mo869Ujhhgtgfeyxiexzf();
                break;
            case 5:
                interfaceC3115Ujhhgtgfeyxiexzf.onStop(interfaceC0083Ujhhgtgfeyxiexzf);
                break;
            case 6:
                interfaceC3115Ujhhgtgfeyxiexzf.onDestroy(interfaceC0083Ujhhgtgfeyxiexzf);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0053Ujhhgtgfeyxiexzf interfaceC0053Ujhhgtgfeyxiexzf = this.f294Ujhhgtgfeyxiexzf;
        if (interfaceC0053Ujhhgtgfeyxiexzf != null) {
            interfaceC0053Ujhhgtgfeyxiexzf.mo0Ujhhgtgfeyxiexzf(interfaceC0083Ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf);
        }
    }
}
