package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0936feyxiexzfUjhhgtg implements InterfaceC0058Ujhhgtgfeyxiexzf, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f3772Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0936feyxiexzfUjhhgtg.class, Object.class, "上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile InterfaceC3545feyxiexzfUjhhgtg f3773Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public volatile Object f3774Ujhhgtgfeyxiexzf;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C0652Ujhhgtgfeyxiexzf(getValue());
    }

    @Override // p000.InterfaceC0058Ujhhgtgfeyxiexzf
    public final Object getValue() {
        Object obj = this.f3774Ujhhgtgfeyxiexzf;
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf;
        if (obj != c3382feyxiexzfUjhhgtg) {
            return obj;
        }
        InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg = this.f3773Ujhhgtgfeyxiexzf;
        if (interfaceC3545feyxiexzfUjhhgtg != null) {
            Object objInvoke = interfaceC3545feyxiexzfUjhhgtg.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3772Ujhhgtgfeyxiexzf;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3382feyxiexzfUjhhgtg, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c3382feyxiexzfUjhhgtg) {
                }
            }
            this.f3773Ujhhgtgfeyxiexzf = null;
            return objInvoke;
        }
        return this.f3774Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        return this.f3774Ujhhgtgfeyxiexzf != C3382feyxiexzfUjhhgtg.f10569Ujhhgtgfeyxiexzf ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
