package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2846Ujhhgtgfeyxiexzf extends AbstractC2926Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0146Ujhhgtgfeyxiexzf f9045Ujhhgtgfeyxiexzf;

    public AbstractC2846Ujhhgtgfeyxiexzf(InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf) {
        this.f9045Ujhhgtgfeyxiexzf = interfaceC0146Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        int iMo1111Ujhhgtgfeyxiexzf = mo1111Ujhhgtgfeyxiexzf(obj);
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtgMo1106Ujhhgtgfeyxiexzf = mo1106Ujhhgtgfeyxiexzf();
        InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf = interfaceC3329Ujhhgtgfeyxiexzf.mo2349Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtgMo1106Ujhhgtgfeyxiexzf, iMo1111Ujhhgtgfeyxiexzf);
        Iterator itMo1110Ujhhgtgfeyxiexzf = mo1110Ujhhgtgfeyxiexzf(obj);
        for (int i = 0; i < iMo1111Ujhhgtgfeyxiexzf; i++) {
            interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf.mo2333Ujhhgtgfeyxiexzf(mo1106Ujhhgtgfeyxiexzf(), i, this.f9045Ujhhgtgfeyxiexzf, itMo1110Ujhhgtgfeyxiexzf.next());
        }
        interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf.mo2322Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtgMo1106Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public void mo1112Ujhhgtgfeyxiexzf(InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtg, int i, Object obj) {
        mo2245Ujhhgtgfeyxiexzf(obj, i, interfaceC2876feyxiexzfUjhhgtg.mo2279feyxiexzfUjhhgtg(mo1106Ujhhgtgfeyxiexzf(), i, this.f9045Ujhhgtgfeyxiexzf, null));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public abstract void mo2245Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2);
}
