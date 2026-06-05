package p000;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1026feyxiexzfUjhhgtg extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C1744Ujhhgtgfeyxiexzf timeout();

    void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j);
}
