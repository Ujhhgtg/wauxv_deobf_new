package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲀᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1402 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5062;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC0128 f5063;

    public /* synthetic */ RunnableC1402(ViewOnTouchListenerC0128 viewOnTouchListenerC0128, int i) {
        this.f5062 = i;
        this.f5063 = viewOnTouchListenerC0128;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5062) {
            case 0:
                ViewParent parent = this.f5063.f1088.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ViewOnTouchListenerC0128 viewOnTouchListenerC0128 = this.f5063;
                viewOnTouchListenerC0128.m1132();
                View view = viewOnTouchListenerC0128.f1088;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0128.m1134()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    viewOnTouchListenerC0128.f1091 = true;
                    break;
                }
                break;
        }
    }
}
