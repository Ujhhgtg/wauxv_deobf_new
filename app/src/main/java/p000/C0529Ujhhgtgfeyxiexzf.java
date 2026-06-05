package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0529Ujhhgtgfeyxiexzf extends AbstractC3740feyxiexzfUjhhgtg implements InterfaceC3123Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Handler f2490Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean f2491Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0529Ujhhgtgfeyxiexzf f2492Ujhhgtgfeyxiexzf;

    public C0529Ujhhgtgfeyxiexzf(Handler handler, boolean z) {
        this.f2490Ujhhgtgfeyxiexzf = handler;
        this.f2491Ujhhgtgfeyxiexzf = z;
        this.f2492Ujhhgtgfeyxiexzf = z ? this : new C0529Ujhhgtgfeyxiexzf(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0529Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0529Ujhhgtgfeyxiexzf c0529Ujhhgtgfeyxiexzf = (C0529Ujhhgtgfeyxiexzf) obj;
        return c0529Ujhhgtgfeyxiexzf.f2490Ujhhgtgfeyxiexzf == this.f2490Ujhhgtgfeyxiexzf && c0529Ujhhgtgfeyxiexzf.f2491Ujhhgtgfeyxiexzf == this.f2491Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2490Ujhhgtgfeyxiexzf) ^ (this.f2491Ujhhgtgfeyxiexzf ? 1231 : 1237);
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    public final String toString() {
        C0529Ujhhgtgfeyxiexzf c0529Ujhhgtgfeyxiexzf;
        String str;
        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
        C0529Ujhhgtgfeyxiexzf c0529Ujhhgtgfeyxiexzf2 = AbstractC0166Ujhhgtgfeyxiexzf.f1350Ujhhgtgfeyxiexzf;
        if (this == c0529Ujhhgtgfeyxiexzf2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c0529Ujhhgtgfeyxiexzf = c0529Ujhhgtgfeyxiexzf2.f2492Ujhhgtgfeyxiexzf;
            } catch (UnsupportedOperationException unused) {
                c0529Ujhhgtgfeyxiexzf = null;
            }
            str = this == c0529Ujhhgtgfeyxiexzf ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f2490Ujhhgtgfeyxiexzf.toString();
        return this.f2491Ujhhgtgfeyxiexzf ? AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(string, ".immediate") : string;
    }

    @Override // p000.InterfaceC3123Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public final void mo1128Ujhhgtgfeyxiexzf(long j, C2774Ujhhgtgfeyxiexzf c2774Ujhhgtgfeyxiexzf) {
        RunnableC3468feyxiexzfUjhhgtg runnableC3468feyxiexzfUjhhgtg = new RunnableC3468feyxiexzfUjhhgtg(c2774Ujhhgtgfeyxiexzf, 1, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (!this.f2490Ujhhgtgfeyxiexzf.postDelayed(runnableC3468feyxiexzfUjhhgtg, j)) {
            m1827feyxiexzfUjhhgtg(c2774Ujhhgtgfeyxiexzf.f8774Ujhhgtgfeyxiexzf, runnableC3468feyxiexzfUjhhgtg);
        } else {
            AbstractC3594Ujhhgtgfeyxiexzf.m5180Ujhhgtgfeyxiexzf(c2774Ujhhgtgfeyxiexzf, new C2644feyxiexzfUjhhgtg(0, new C0530Ujhhgtgfeyxiexzf(this, 0, runnableC3468feyxiexzfUjhhgtg)));
        }
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final void mo1129feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Runnable runnable) {
        if (this.f2490Ujhhgtgfeyxiexzf.post(runnable)) {
            return;
        }
        m1827feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, runnable);
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean mo1826feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg) {
        return (this.f2491Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(Looper.myLooper(), this.f2490Ujhhgtgfeyxiexzf.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final void m1827feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf = (InterfaceC0717Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf);
        if (interfaceC0717Ujhhgtgfeyxiexzf != null) {
            interfaceC0717Ujhhgtgfeyxiexzf.mo1766feyxiexzfUjhhgtg(cancellationException);
        }
        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
        ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf.mo1129feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, runnable);
    }
}
