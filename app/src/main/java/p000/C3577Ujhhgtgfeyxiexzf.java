package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3577Ujhhgtgfeyxiexzf implements Handler.Callback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11112Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f11113Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3577Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f11112Ujhhgtgfeyxiexzf = i;
        this.f11113Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f11112Ujhhgtgfeyxiexzf) {
            case 0:
                C3580feyxiexzfUjhhgtg c3580feyxiexzfUjhhgtg = (C3580feyxiexzfUjhhgtg) this.f11113Ujhhgtgfeyxiexzf;
                int i = message.what;
                if (i == 1) {
                    c3580feyxiexzfUjhhgtg.m5114Ujhhgtgfeyxiexzf((C3582feyxiexzfUjhhgtg) message.obj);
                    return true;
                }
                if (i == 2) {
                    c3580feyxiexzfUjhhgtg.f11128Ujhhgtgfeyxiexzf.m2370Ujhhgtgfeyxiexzf((C3582feyxiexzfUjhhgtg) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg = (C2962feyxiexzfUjhhgtg) this.f11113Ujhhgtgfeyxiexzf;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (c2962feyxiexzfUjhhgtg.f9271Ujhhgtgfeyxiexzf) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
