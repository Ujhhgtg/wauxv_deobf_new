package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛳ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2646feyxiexzfUjhhgtg implements InterfaceC0143Ujhhgtgfeyxiexzf, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public transient InterfaceC0143Ujhhgtgfeyxiexzf f8494Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f8495Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Class f8496Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f8497Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String f8498Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean f8499Ujhhgtgfeyxiexzf;

    public AbstractC2646feyxiexzfUjhhgtg(Object obj, Class cls, String str, String str2, boolean z) {
        this.f8495Ujhhgtgfeyxiexzf = obj;
        this.f8496Ujhhgtgfeyxiexzf = cls;
        this.f8497Ujhhgtgfeyxiexzf = str;
        this.f8498Ujhhgtgfeyxiexzf = str2;
        this.f8499Ujhhgtgfeyxiexzf = z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public InterfaceC0143Ujhhgtgfeyxiexzf mo2264Ujhhgtgfeyxiexzf() {
        InterfaceC0143Ujhhgtgfeyxiexzf interfaceC0143Ujhhgtgfeyxiexzf = this.f8494Ujhhgtgfeyxiexzf;
        if (interfaceC0143Ujhhgtgfeyxiexzf != null) {
            return interfaceC0143Ujhhgtgfeyxiexzf;
        }
        InterfaceC0143Ujhhgtgfeyxiexzf interfaceC0143UjhhgtgfeyxiexzfMo1483Ujhhgtgfeyxiexzf = mo1483Ujhhgtgfeyxiexzf();
        this.f8494Ujhhgtgfeyxiexzf = interfaceC0143UjhhgtgfeyxiexzfMo1483Ujhhgtgfeyxiexzf;
        return interfaceC0143UjhhgtgfeyxiexzfMo1483Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public abstract InterfaceC0143Ujhhgtgfeyxiexzf mo1483Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC2808Ujhhgtgfeyxiexzf m3977Ujhhgtgfeyxiexzf() {
        boolean z = this.f8499Ujhhgtgfeyxiexzf;
        Class cls = this.f8496Ujhhgtgfeyxiexzf;
        if (!z) {
            return AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls);
        }
        AbstractC0959feyxiexzfUjhhgtg.f3826Ujhhgtgfeyxiexzf.getClass();
        return new C1479feyxiexzfUjhhgtg(cls);
    }
}
