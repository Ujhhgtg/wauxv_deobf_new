package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲁᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1006 extends AbstractC2696 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1006 f3678;

    static {
        int i = AbstractC2959.f9487;
        int i2 = AbstractC2959.f9488;
        long j = AbstractC2959.f9489;
        String str = AbstractC2959.f9485;
        C1006 c1006 = new C1006();
        c1006.f8694 = new ExecutorC0881(i, i2, j, str);
        f3678 = c1006;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC0877
    public final String toString() {
        return "Dispatchers.Default";
    }
}
