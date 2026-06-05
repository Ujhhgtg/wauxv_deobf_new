package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ要点脸ᛲ能不能ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1228feyxiexzfUjhhgtg extends C2401Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Socket f4554Ujhhgtgfeyxiexzf;

    public C1228feyxiexzfUjhhgtg(Socket socket) {
        this.f4554Ujhhgtgfeyxiexzf = socket;
    }

    @Override // p000.C2401Ujhhgtgfeyxiexzf
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000.C2401Ujhhgtgfeyxiexzf
    public final void timedOut() {
        Socket socket = this.f4554Ujhhgtgfeyxiexzf;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf;
            boolean z = false;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(message, "getsockname failed", false) : false) {
                    z = true;
                }
            }
            if (!z) {
                throw e;
            }
            AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
