package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲇᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1002 extends AbstractC2635 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1002 f3662;

    static {
        int i = AbstractC2900.f9320;
        int i2 = AbstractC2900.f9321;
        long j = AbstractC2900.f9322;
        String str = AbstractC2900.f9318;
        C1002 c1002 = new C1002();
        c1002.f8529 = new ExecutorC0882(i, i2, j, str);
        f3662 = c1002;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC0878
    public final String toString() {
        return "Dispatchers.Default";
    }
}
