package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲈᲀᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0427 implements InterfaceC2713 {
    @Override // p000.InterfaceC2713
    public final C3400 timeout() {
        return C3400.NONE;
    }

    @Override // p000.InterfaceC2713
    public final void write(C0504 c0504, long j) throws EOFException {
        c0504.skip(j);
    }

    @Override // p000.InterfaceC2713, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.InterfaceC2713, java.io.Flushable
    public final void flush() {
    }
}
