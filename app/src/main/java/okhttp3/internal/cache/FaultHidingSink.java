package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import p000.AbstractC3534Ujhhgtgfeyxiexzf;
import p000.C2598feyxiexzfUjhhgtg;
import p000.InterfaceC1026feyxiexzfUjhhgtg;
import p000.InterfaceC3549feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends AbstractC3534Ujhhgtgfeyxiexzf {
    private boolean hasErrors;
    private final InterfaceC3549feyxiexzfUjhhgtg onException;

    public FaultHidingSink(InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        super(interfaceC1026feyxiexzfUjhhgtg);
        this.onException = interfaceC3549feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC3534Ujhhgtgfeyxiexzf, p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // p000.AbstractC3534Ujhhgtgfeyxiexzf, p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Flushable
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

    public final InterfaceC3549feyxiexzfUjhhgtg getOnException() {
        return this.onException;
    }

    @Override // p000.AbstractC3534Ujhhgtgfeyxiexzf, p000.InterfaceC1026feyxiexzfUjhhgtg
    public void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws EOFException {
        if (this.hasErrors) {
            c2598feyxiexzfUjhhgtg.skip(j);
            return;
        }
        try {
            super.write(c2598feyxiexzfUjhhgtg, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
