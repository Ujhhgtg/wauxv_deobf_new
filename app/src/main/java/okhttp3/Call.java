package okhttp3;

import p000.C1744Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface Call extends Cloneable {

    /* JADX INFO: compiled from: obf */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C1744Ujhhgtgfeyxiexzf timeout();
}
