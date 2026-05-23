package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2782 extends C0280 {

    public final Socket f8883;

    public C2782(Socket socket) {
        this.f8883 = socket;
    }

    @Override // p000.C0280
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000.C0280
    public final void timedOut() {
        Socket socket = this.f8883;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = AbstractC2273.f7371;
            boolean z = false;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC2841.m4828(message, "getsockname failed", false) : false) {
                    z = true;
                }
            }
            if (!z) {
                throw e;
            }
            AbstractC2273.f7371.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC2273.f7371.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
