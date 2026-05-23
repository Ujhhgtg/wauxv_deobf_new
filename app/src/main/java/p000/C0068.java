package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0068 {

    public static final C0068 f999;

    public static final C0068 f1000;

    public final Throwable f1001;

    static {
        if (AbstractFutureC0074.f1012) {
            f1000 = null;
            f999 = null;
        } else {
            f1000 = new C0068(null, false);
            f999 = new C0068(null, true);
        }
    }

    public C0068(Throwable th, boolean z) {
        this.f1001 = th;
    }
}
