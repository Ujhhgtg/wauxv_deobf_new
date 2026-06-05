package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸能不能ᛴᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC0402Ujhhgtgfeyxiexzf implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2180Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f2181Ujhhgtgfeyxiexzf;

    public /* synthetic */ ChoreographerFrameCallbackC0402Ujhhgtgfeyxiexzf(AbstractC0384Ujhhgtgfeyxiexzf abstractC0384Ujhhgtgfeyxiexzf) {
        this.f2181Ujhhgtgfeyxiexzf = abstractC0384Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f2180Ujhhgtgfeyxiexzf) {
            case 0:
                if (((AbstractC0384Ujhhgtgfeyxiexzf) this.f2181Ujhhgtgfeyxiexzf).f9160Ujhhgtgfeyxiexzf) {
                    throw null;
                }
                return;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0851feyxiexzfUjhhgtg((Context) this.f2181Ujhhgtgfeyxiexzf, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
