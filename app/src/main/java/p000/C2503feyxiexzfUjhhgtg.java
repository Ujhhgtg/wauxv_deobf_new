package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2503feyxiexzfUjhhgtg implements Handler.Callback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8175Ujhhgtgfeyxiexzf;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f8175Ujhhgtgfeyxiexzf) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                if (i != 1) {
                    return false;
                }
                message.obj.getClass();
                throw new ClassCastException();
            default:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC0901feyxiexzfUjhhgtg) message.obj).mo1444Ujhhgtgfeyxiexzf();
                return true;
        }
    }
}
