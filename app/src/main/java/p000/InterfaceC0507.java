package p000;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0507 extends InterfaceC2713, WritableByteChannel {
    @Override // p000.InterfaceC2713, java.io.Flushable
    void flush();

    InterfaceC0507 write(byte[] bArr);

    InterfaceC0507 writeByte(int i);

    InterfaceC0507 writeInt(int i);

    InterfaceC0507 writeShort(int i);

    C0504 mo1760();

    InterfaceC0507 mo1763();

    long mo1769(InterfaceC2786 interfaceC2786);

    InterfaceC0507 mo1770();

    InterfaceC0507 mo1775(String str);

    InterfaceC0507 mo1777(C0539 c0539);

    InterfaceC0507 mo1779(long j);

    InterfaceC0507 mo1788(int i, int i2, byte[] bArr);

    InterfaceC0507 mo1791(long j);
}
