package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ要点脸能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1031feyxiexzfUjhhgtg extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3187feyxiexzfUjhhgtg f4033Ujhhgtgfeyxiexzf;

    public C1031feyxiexzfUjhhgtg(C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtg) {
        this.f4033Ujhhgtgfeyxiexzf = c3187feyxiexzfUjhhgtg;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC1860Ujhhgtgfeyxiexzf.m3197Ujhhgtgfeyxiexzf().post(new RunnableC1028feyxiexzfUjhhgtg(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC1860Ujhhgtgfeyxiexzf.m3197Ujhhgtgfeyxiexzf().post(new RunnableC1028feyxiexzfUjhhgtg(this, false));
    }
}
