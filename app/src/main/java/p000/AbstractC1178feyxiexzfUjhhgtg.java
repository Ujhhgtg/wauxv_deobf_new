package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳᛲ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1178feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f4467Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(C1179feyxiexzfUjhhgtg.f4468Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final void m2663Ujhhgtgfeyxiexzf(InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(Looper.myLooper(), Looper.getMainLooper())) {
            interfaceC3545feyxiexzfUjhhgtg.invoke();
        } else {
            ((Handler) f4467Ujhhgtgfeyxiexzf.getValue()).post(new RunnableC2779feyxiexzfUjhhgtg(interfaceC3545feyxiexzfUjhhgtg));
        }
    }
}
