package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲁᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0402 implements InterfaceC2774 {
    @Override // p000.InterfaceC2774
    public final C3459 timeout() {
        return C3459.NONE;
    }

    @Override // p000.InterfaceC2774
    public final void write(C0481 c0481, long j) throws EOFException {
        c0481.skip(j);
    }

    @Override // p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.InterfaceC2774, java.io.Flushable
    public final void flush() {
    }
}
