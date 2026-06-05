package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3576feyxiexzfUjhhgtg implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object f11109Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f11110Ujhhgtgfeyxiexzf = -2;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3254feyxiexzfUjhhgtg f11111Ujhhgtgfeyxiexzf;

    public C3576feyxiexzfUjhhgtg(C3254feyxiexzfUjhhgtg c3254feyxiexzfUjhhgtg) {
        this.f11111Ujhhgtgfeyxiexzf = c3254feyxiexzfUjhhgtg;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11110Ujhhgtgfeyxiexzf < 0) {
            m5112Ujhhgtgfeyxiexzf();
        }
        return this.f11110Ujhhgtgfeyxiexzf == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11110Ujhhgtgfeyxiexzf < 0) {
            m5112Ujhhgtgfeyxiexzf();
        }
        if (this.f11110Ujhhgtgfeyxiexzf == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f11109Ujhhgtgfeyxiexzf;
        this.f11110Ujhhgtgfeyxiexzf = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [上海高中ᛱ谢子非ᛱ要点脸ᛴᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱ能不能, 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5112Ujhhgtgfeyxiexzf() {
        int i = this.f11110Ujhhgtgfeyxiexzf;
        C3254feyxiexzfUjhhgtg c3254feyxiexzfUjhhgtg = this.f11111Ujhhgtgfeyxiexzf;
        Object objInvoke = i == -2 ? ((InterfaceC3545feyxiexzfUjhhgtg) c3254feyxiexzfUjhhgtg.f10206Ujhhgtgfeyxiexzf).invoke() : ((AbstractC3569Ujhhgtgfeyxiexzf) c3254feyxiexzfUjhhgtg.f10207Ujhhgtgfeyxiexzf).invoke(this.f11109Ujhhgtgfeyxiexzf);
        this.f11109Ujhhgtgfeyxiexzf = objInvoke;
        this.f11110Ujhhgtgfeyxiexzf = objInvoke == null ? 0 : 1;
    }
}
