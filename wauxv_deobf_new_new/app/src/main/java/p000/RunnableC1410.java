package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1410 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5091;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC0136 f5092;

    public /* synthetic */ RunnableC1410(ViewOnTouchListenerC0136 viewOnTouchListenerC0136, int i) {
        this.f5091 = i;
        this.f5092 = viewOnTouchListenerC0136;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5091) {
            case 0:
                ViewParent parent = this.f5092.f1156.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ViewOnTouchListenerC0136 viewOnTouchListenerC0136 = this.f5092;
                viewOnTouchListenerC0136.m1278();
                View view = viewOnTouchListenerC0136.f1156;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0136.m1280()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    viewOnTouchListenerC0136.f1159 = true;
                    break;
                }
                break;
        }
    }
}
