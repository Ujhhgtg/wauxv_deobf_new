package p000;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3027feyxiexzfUjhhgtg implements InterfaceC3745Ujhhgtgfeyxiexzf, Closeable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3026Ujhhgtgfeyxiexzf f9392Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC3739feyxiexzfUjhhgtg f9393Ujhhgtgfeyxiexzf;

    public C3027feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg) {
        AbstractC1178feyxiexzfUjhhgtg.m2663Ujhhgtgfeyxiexzf(new C1179feyxiexzfUjhhgtg(ujhhgtgfeyxiexzf, this));
        C3026Ujhhgtgfeyxiexzf c3026Ujhhgtgfeyxiexzf = new C3026Ujhhgtgfeyxiexzf(this);
        this.f9392Ujhhgtgfeyxiexzf = c3026Ujhhgtgfeyxiexzf;
        this.f9393Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5163feyxiexzfUjhhgtg(abstractC3740feyxiexzfUjhhgtg, c3026Ujhhgtgfeyxiexzf).mo1764feyxiexzfUjhhgtg(new C1175feyxiexzfUjhhgtg());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo1768Ujhhgtgfeyxiexzf(null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo1768Ujhhgtgfeyxiexzf(CancellationException cancellationException) {
        InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf = (InterfaceC0717Ujhhgtgfeyxiexzf) this.f9393Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf);
        if (interfaceC0717Ujhhgtgfeyxiexzf != null) {
            interfaceC0717Ujhhgtgfeyxiexzf.mo1766feyxiexzfUjhhgtg(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public void mo1769Ujhhgtgfeyxiexzf(Throwable th) {
        mo1770feyxiexzfUjhhgtg(th);
    }

    @Override // p000.InterfaceC3745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public final InterfaceC3739feyxiexzfUjhhgtg mo96Ujhhgtgfeyxiexzf() {
        return this.f9393Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public void mo1770feyxiexzfUjhhgtg(Throwable th) {
        AbstractC1243feyxiexzfUjhhgtg.m2735Ujhhgtgfeyxiexzf(th);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public void mo759feyxiexzfUjhhgtg() {
    }
}
