package p000;

import android.view.Choreographer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2411 {
    public static void m4376(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC1964(1, runnable));
    }
}
