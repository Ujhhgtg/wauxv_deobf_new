package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3640Ujhhgtgfeyxiexzf implements InterfaceC1117feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AtomicReference f11372Ujhhgtgfeyxiexzf;

    public C3640Ujhhgtgfeyxiexzf(C2399Ujhhgtgfeyxiexzf c2399Ujhhgtgfeyxiexzf) {
        this.f11372Ujhhgtgfeyxiexzf = new AtomicReference(c2399Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1117feyxiexzfUjhhgtg
    public final Iterator iterator() {
        InterfaceC1117feyxiexzfUjhhgtg interfaceC1117feyxiexzfUjhhgtg = (InterfaceC1117feyxiexzfUjhhgtg) this.f11372Ujhhgtgfeyxiexzf.getAndSet(null);
        if (interfaceC1117feyxiexzfUjhhgtg != null) {
            return interfaceC1117feyxiexzfUjhhgtg.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
