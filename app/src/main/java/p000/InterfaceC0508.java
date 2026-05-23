package p000;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0508 extends InterfaceC2786, ReadableByteChannel {
    C2477 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    String readString(Charset charset);

    void skip(long j);

    C0504 mo1760();

    C0539 mo1762(long j);

    byte[] mo1764();

    boolean mo1766();

    int mo1767(C2302 c2302);

    long mo1771();

    String mo1773(long j);

    void mo1776(C0504 c0504, long j);

    C0539 mo1780();

    boolean mo1781(long j);

    String mo1783();

    boolean mo1787(long j, C0539 c0539);

    void mo1790(long j);

    long mo1792();

    InputStream mo1793();
}
