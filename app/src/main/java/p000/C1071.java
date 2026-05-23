package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1071 extends Exception {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Throwable f3885;

    public C1071(Throwable th, AbstractC0878 abstractC0878, InterfaceC0877 interfaceC0877) {
        super("Coroutine dispatcher " + abstractC0878 + " threw an exception, context = " + interfaceC0877, th);
        this.f3885 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3885;
    }
}
