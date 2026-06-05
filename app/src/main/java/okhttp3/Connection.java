package okhttp3;

import java.net.Socket;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
