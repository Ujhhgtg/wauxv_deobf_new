package p000;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᤞᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0155 implements InterfaceC0883, Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0154 f1165;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0877 f1166;

    public C0155(EnumC1769 enumC1769, AbstractC0878 abstractC0878) {
        AbstractC2861.m4864(new C1619(enumC1769, this));
        C0154 c0154 = new C0154(this);
        this.f1165 = c0154;
        this.f1166 = AbstractC2209.m4140(abstractC0878, c0154).mo941(new C2857());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo1199(null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void mo1199(CancellationException cancellationException) {
        InterfaceC1698 interfaceC1698 = (InterfaceC1698) this.f1166.mo942(C1133.f4207);
        if (interfaceC1698 != null) {
            interfaceC1698.mo3441(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void mo1200(Throwable th) {
        mo1201(th);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public void mo1201(Throwable th) {
        AbstractC2202.m4002(th);
    }

    @Override // p000.InterfaceC0883
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final InterfaceC0877 mo96() {
        return this.f1166;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public void mo617() {
    }
}
