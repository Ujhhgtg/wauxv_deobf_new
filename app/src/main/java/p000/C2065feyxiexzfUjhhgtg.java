package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2065feyxiexzfUjhhgtg implements InterfaceC0058Ujhhgtgfeyxiexzf, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public InterfaceC3545feyxiexzfUjhhgtg f6793Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public volatile Object f6794Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f6795Ujhhgtgfeyxiexzf = this;

    public C2065feyxiexzfUjhhgtg(InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        this.f6793Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
    }

    private final Object writeReplace() {
        return new C0652Ujhhgtgfeyxiexzf(getValue());
    }

    @Override // p000.InterfaceC0058Ujhhgtgfeyxiexzf
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f6794Ujhhgtgfeyxiexzf;
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf;
        if (obj != c3382feyxiexzfUjhhgtg) {
            return obj;
        }
        synchronized (this.f6795Ujhhgtgfeyxiexzf) {
            objInvoke = this.f6794Ujhhgtgfeyxiexzf;
            if (objInvoke == c3382feyxiexzfUjhhgtg) {
                objInvoke = this.f6793Ujhhgtgfeyxiexzf.invoke();
                this.f6794Ujhhgtgfeyxiexzf = objInvoke;
                this.f6793Ujhhgtgfeyxiexzf = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f6794Ujhhgtgfeyxiexzf != C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
