package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲁᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1527 extends AbstractC0877 implements InterfaceC1010 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Handler f5373;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f5374;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1527 f5375;

    public C1527(Handler handler, boolean z) {
        this.f5373 = handler;
        this.f5374 = z;
        this.f5375 = z ? this : new C1527(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1527)) {
            return false;
        }
        C1527 c1527 = (C1527) obj;
        return c1527.f5373 == this.f5373 && c1527.f5374 == this.f5374;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5373) ^ (this.f5374 ? 1231 : 1237);
    }

    @Override // p000.AbstractC0877
    public final String toString() {
        C1527 c1527;
        String str;
        C1006 c1006 = AbstractC1080.f3904;
        C1527 c1528 = AbstractC1908.f6303;
        if (this == c1528) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1527 = c1528.f5375;
            } catch (UnsupportedOperationException unused) {
                c1527 = null;
            }
            str = this == c1527 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f5373.toString();
        return this.f5374 ? AbstractC2844.m4782(string, ".immediate") : string;
    }

    @Override // p000.InterfaceC1010
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final void mo2701(long j, C0535 c0535) {
        RunnableC1326 runnableC1326 = new RunnableC1326(c0535, 1, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f5373.postDelayed(runnableC1326, j)) {
            AbstractC1586.m3478(c0535, new C0532(new C1526(this, 0, runnableC1326), 0));
        } else {
            m3431(c0535.f2244, runnableC1326);
        }
    }

    @Override // p000.AbstractC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2509(InterfaceC0876 interfaceC0876, Runnable runnable) {
        if (this.f5373.post(runnable)) {
            return;
        }
        m3431(interfaceC0876, runnable);
    }

    @Override // p000.AbstractC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final boolean mo2510(InterfaceC0876 interfaceC0876) {
        return (this.f5374 && AbstractC1469.m3322(Looper.myLooper(), this.f5373.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m3431(InterfaceC0876 interfaceC0876, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC1716 interfaceC1716 = (InterfaceC1716) interfaceC0876.mo1086(C1139.f4219);
        if (interfaceC1716 != null) {
            interfaceC1716.mo3609(cancellationException);
        }
        C1006 c1006 = AbstractC1080.f3904;
        ExecutorC0994.f3625.mo2509(interfaceC0876, runnable);
    }
}
