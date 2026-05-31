package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import p000.AbstractC1411;
import p000.C0481;
import p000.InterfaceC1433;
import p000.InterfaceC2774;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends AbstractC1411 {
    private boolean hasErrors;
    private final InterfaceC1433 onException;

    public FaultHidingSink(InterfaceC2774 interfaceC2774, InterfaceC1433 interfaceC1433) {
        super(interfaceC2774);
        this.onException = interfaceC1433;
    }

    @Override // p000.AbstractC1411, p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // p000.AbstractC1411, p000.InterfaceC2774, java.io.Flushable
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

    public final InterfaceC1433 getOnException() {
        return this.onException;
    }

    @Override // p000.AbstractC1411, p000.InterfaceC2774
    public void write(C0481 c0481, long j) throws EOFException {
        if (this.hasErrors) {
            c0481.skip(j);
            return;
        }
        try {
            super.write(c0481, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
