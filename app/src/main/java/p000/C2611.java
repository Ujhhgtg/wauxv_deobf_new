package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2611 extends RuntimeException {

    public C1229 f8490;

    public C2611(String str, AbstractC2707 abstractC2707) {
        this.f8490 = new C1229(str, abstractC2707, null);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f8490.getMessage();
    }
}
