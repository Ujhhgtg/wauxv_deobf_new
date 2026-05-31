package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1076 extends Exception {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Throwable f3896;

    public C1076(Throwable th, AbstractC0877 abstractC0877, InterfaceC0876 interfaceC0876) {
        super("Coroutine dispatcher " + abstractC0877 + " threw an exception, context = " + interfaceC0876, th);
        this.f3896 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3896;
    }
}
