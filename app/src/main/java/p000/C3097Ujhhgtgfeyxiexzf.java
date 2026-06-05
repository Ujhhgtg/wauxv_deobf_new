package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3097Ujhhgtgfeyxiexzf implements InterfaceC3637Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Context f9631Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0895feyxiexzfUjhhgtg f9632Ujhhgtgfeyxiexzf;

    public C3097Ujhhgtgfeyxiexzf(Context context, C0895feyxiexzfUjhhgtg c0895feyxiexzfUjhhgtg) {
        this.f9631Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f9632Ujhhgtgfeyxiexzf = c0895feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo1053Ujhhgtgfeyxiexzf() {
        C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf = C1030feyxiexzfUjhhgtg.m2522Ujhhgtgfeyxiexzf(this.f9631Ujhhgtgfeyxiexzf);
        C0895feyxiexzfUjhhgtg c0895feyxiexzfUjhhgtg = this.f9632Ujhhgtgfeyxiexzf;
        synchronized (c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf) {
            ((HashSet) c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf.f4032Ujhhgtgfeyxiexzf).remove(c0895feyxiexzfUjhhgtg);
            if (c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf.f4030Ujhhgtgfeyxiexzf && ((HashSet) c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf.f4032Ujhhgtgfeyxiexzf).isEmpty()) {
                C3187feyxiexzfUjhhgtg c3187feyxiexzfUjhhgtg = (C3187feyxiexzfUjhhgtg) c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf.f4031Ujhhgtgfeyxiexzf;
                ((ConnectivityManager) ((C3331feyxiexzfUjhhgtg) c3187feyxiexzfUjhhgtg.f9845Ujhhgtgfeyxiexzf).get()).unregisterNetworkCallback((C1031feyxiexzfUjhhgtg) c3187feyxiexzfUjhhgtg.f9846Ujhhgtgfeyxiexzf);
                c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf.f4030Ujhhgtgfeyxiexzf = false;
            }
        }
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1054Ujhhgtgfeyxiexzf() {
        C1030feyxiexzfUjhhgtg c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf = C1030feyxiexzfUjhhgtg.m2522Ujhhgtgfeyxiexzf(this.f9631Ujhhgtgfeyxiexzf);
        C0895feyxiexzfUjhhgtg c0895feyxiexzfUjhhgtg = this.f9632Ujhhgtgfeyxiexzf;
        synchronized (c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf) {
            ((HashSet) c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf.f4032Ujhhgtgfeyxiexzf).add(c0895feyxiexzfUjhhgtg);
            c1030feyxiexzfUjhhgtgM2522Ujhhgtgfeyxiexzf.m2524Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1052Ujhhgtgfeyxiexzf() {
    }
}
