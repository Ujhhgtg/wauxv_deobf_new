package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲈᲀᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC1995 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f6618;

    public /* synthetic */ ChoreographerFrameCallbackC1995(Object obj, int i) {
        this.f6617 = i;
        this.f6618 = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f6617) {
            case 0:
                if (((AbstractC1997) this.f6618).f2850) {
                    throw null;
                }
                return;
            default:
                ((Runnable) this.f6618).run();
                return;
        }
    }
}
