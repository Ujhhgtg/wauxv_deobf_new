package p000;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2713 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C3400 timeout();

    void write(C0504 c0504, long j);
}
