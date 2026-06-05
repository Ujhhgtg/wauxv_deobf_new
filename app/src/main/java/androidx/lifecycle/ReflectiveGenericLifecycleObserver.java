package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p000.C2826feyxiexzfUjhhgtg;
import p000.C2844feyxiexzfUjhhgtg;
import p000.InterfaceC0050Ujhhgtgfeyxiexzf;
import p000.InterfaceC0053Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0053Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC0050Ujhhgtgfeyxiexzf f295Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2844feyxiexzfUjhhgtg f296Ujhhgtgfeyxiexzf;

    public ReflectiveGenericLifecycleObserver(InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf) {
        this.f295Ujhhgtgfeyxiexzf = interfaceC0050Ujhhgtgfeyxiexzf;
        C2826feyxiexzfUjhhgtg c2826feyxiexzfUjhhgtg = C2826feyxiexzfUjhhgtg.f8985Ujhhgtgfeyxiexzf;
        Class<?> cls = interfaceC0050Ujhhgtgfeyxiexzf.getClass();
        C2844feyxiexzfUjhhgtg c2844feyxiexzfUjhhgtg = (C2844feyxiexzfUjhhgtg) c2826feyxiexzfUjhhgtg.f8986Ujhhgtgfeyxiexzf.get(cls);
        this.f296Ujhhgtgfeyxiexzf = c2844feyxiexzfUjhhgtg == null ? c2826feyxiexzfUjhhgtg.m4156Ujhhgtgfeyxiexzf(cls, null) : c2844feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0053Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo0Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        HashMap map = this.f296Ujhhgtgfeyxiexzf.f9042Ujhhgtgfeyxiexzf;
        List list = (List) map.get(ujhhgtgfeyxiexzf);
        InterfaceC0050Ujhhgtgfeyxiexzf interfaceC0050Ujhhgtgfeyxiexzf = this.f295Ujhhgtgfeyxiexzf;
        C2844feyxiexzfUjhhgtg.m4176Ujhhgtgfeyxiexzf(list, interfaceC0083Ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf, interfaceC0050Ujhhgtgfeyxiexzf);
        C2844feyxiexzfUjhhgtg.m4176Ujhhgtgfeyxiexzf((List) map.get(Ujhhgtgfeyxiexzf.ON_ANY), interfaceC0083Ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf, interfaceC0050Ujhhgtgfeyxiexzf);
    }
}
