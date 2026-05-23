package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import p000.AbstractC1403;
import p000.C0504;
import p000.InterfaceC1425;
import p000.InterfaceC2713;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends AbstractC1403 {
    private boolean hasErrors;
    private final InterfaceC1425 onException;

    public FaultHidingSink(InterfaceC2713 interfaceC2713, InterfaceC1425 interfaceC1425) {
        super(interfaceC2713);
        this.onException = interfaceC1425;
    }

    @Override // p000.AbstractC1403, p000.InterfaceC2713, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // p000.AbstractC1403, p000.InterfaceC2713, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final InterfaceC1425 getOnException() {
        return this.onException;
    }

    @Override // p000.AbstractC1403, p000.InterfaceC2713
    public void write(C0504 c0504, long j) throws EOFException {
        if (this.hasErrors) {
            c0504.skip(j);
            return;
        }
        try {
            super.write(c0504, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
