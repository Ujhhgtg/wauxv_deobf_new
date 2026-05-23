package p000;

import android.view.Choreographer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC1964 implements Choreographer.FrameCallback {

    public final /* synthetic */ int f6512;

    public final /* synthetic */ Object f6513;

    public /* synthetic */ ChoreographerFrameCallbackC1964(int i, Object obj) {
        this.f6512 = i;
        this.f6513 = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f6512) {
            case 0:
                if (((AbstractC1966) this.f6513).f2850) {
                    throw null;
                }
                return;
            default:
                ((Runnable) this.f6513).run();
                return;
        }
    }
}
