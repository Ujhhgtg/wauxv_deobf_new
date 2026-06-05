package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1944feyxiexzfUjhhgtg implements InterfaceC0058Ujhhgtgfeyxiexzf, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public InterfaceC3545feyxiexzfUjhhgtg f6419Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f6420Ujhhgtgfeyxiexzf;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C0652Ujhhgtgfeyxiexzf(getValue());
    }

    @Override // p000.InterfaceC0058Ujhhgtgfeyxiexzf
    public final Object getValue() {
        if (this.f6420Ujhhgtgfeyxiexzf == C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf) {
            this.f6420Ujhhgtgfeyxiexzf = this.f6419Ujhhgtgfeyxiexzf.invoke();
            this.f6419Ujhhgtgfeyxiexzf = null;
        }
        return this.f6420Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        return this.f6420Ujhhgtgfeyxiexzf != C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
