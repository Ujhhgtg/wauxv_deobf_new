package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1515 extends AbstractC0878 implements InterfaceC1006 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Handler f5342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f5343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1515 f5344;

    public C1515(Handler handler, boolean z) {
        this.f5342 = handler;
        this.f5343 = z;
        this.f5344 = z ? this : new C1515(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1515)) {
            return false;
        }
        C1515 c1515 = (C1515) obj;
        return c1515.f5342 == this.f5342 && c1515.f5343 == this.f5343;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5342) ^ (this.f5343 ? 1231 : 1237);
    }

    @Override // p000.AbstractC0878
    public final String toString() {
        C1515 c1515;
        String str;
        C1002 c1002 = AbstractC1075.f3893;
        C1515 c1516 = AbstractC1881.f6228;
        if (this == c1516) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1515 = c1516.f5344;
            } catch (UnsupportedOperationException unused) {
                c1515 = null;
            }
            str = this == c1515 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f5342.toString();
        return this.f5343 ? AbstractC2784.m4748(string, ".immediate") : string;
    }

    @Override // p000.InterfaceC1006
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final void mo2577(long j, C0558 c0558) {
        RunnableC1324 runnableC1324 = new RunnableC1324(c0558, 1, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f5342.postDelayed(runnableC1324, j)) {
            AbstractC2207.m4100(c0558, new C0555(0, new C1514(this, 0, runnableC1324)));
        } else {
            m3250(c0558.f2288, runnableC1324);
        }
    }

    @Override // p000.AbstractC0878
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2392(InterfaceC0877 interfaceC0877, Runnable runnable) {
        if (this.f5342.post(runnable)) {
            return;
        }
        m3250(interfaceC0877, runnable);
    }

    @Override // p000.AbstractC0878
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final boolean mo2393(InterfaceC0877 interfaceC0877) {
        return (this.f5343 && AbstractC2207.m4087(Looper.myLooper(), this.f5342.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m3250(InterfaceC0877 interfaceC0877, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC1698 interfaceC1698 = (InterfaceC1698) interfaceC0877.mo942(C1133.f4207);
        if (interfaceC1698 != null) {
            interfaceC1698.mo3441(cancellationException);
        }
        C1002 c1002 = AbstractC1075.f3893;
        ExecutorC0990.f3609.mo2392(interfaceC0877, runnable);
    }
}
