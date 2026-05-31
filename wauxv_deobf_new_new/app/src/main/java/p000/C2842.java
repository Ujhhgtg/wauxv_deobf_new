package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᛸᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2842 extends C0290 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Socket f9045;

    public C2842(Socket socket) {
        this.f9045 = socket;
    }

    @Override // p000.C0290
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000.C0290
    public final void timedOut() {
        Socket socket = this.f9045;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = AbstractC2305.f7492;
            boolean z = false;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC2901.m4861(message, "getsockname failed", false) : false) {
                    z = true;
                }
            }
            if (!z) {
                throw e;
            }
            AbstractC2305.f7492.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC2305.f7492.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
