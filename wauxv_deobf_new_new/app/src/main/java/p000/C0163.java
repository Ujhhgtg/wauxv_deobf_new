package p000;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0163 implements InterfaceC0882, Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0162 f1233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0876 f1234;

    public C0163(EnumC1792 enumC1792, AbstractC0877 abstractC0877) {
        AbstractC2921.m4925(new C1631(enumC1792, this));
        C0162 c0162 = new C0162(this);
        this.f1233 = c0162;
        this.f1234 = AbstractC1586.m3481(abstractC0877, c0162).mo1085(new C2917());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo1345(null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void mo1345(CancellationException cancellationException) {
        InterfaceC1716 interfaceC1716 = (InterfaceC1716) this.f1234.mo1086(C1139.f4219);
        if (interfaceC1716 != null) {
            interfaceC1716.mo3609(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void mo1346(Throwable th) {
        mo1347(th);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public void mo1347(Throwable th) {
        AbstractC0972.m2591(th);
    }

    @Override // p000.InterfaceC0882
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final InterfaceC0876 mo96() {
        return this.f1234;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public void mo760() {
    }
}
