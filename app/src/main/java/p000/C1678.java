package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲈᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1678 implements InterfaceC2494 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1682 f5665;

    public C1678(C1682 c1682) {
        this.f5665 = c1682;
    }

    @Override // p000.InterfaceC2494
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo3005(MotionEvent motionEvent) {
        C1682 c1682 = this.f5665;
        RunnableC0141 runnableC0141 = c1682.f5703;
        c1682.f5708.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c1682.f5704;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1682.f5696 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c1682.f5696);
        if (iFindPointerIndex >= 0) {
            c1682.m3413(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC2508 abstractC2508 = c1682.f5687;
        if (abstractC2508 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c1682.m3421(c1682.f5699, iFindPointerIndex, motionEvent);
                    c1682.m3418(abstractC2508);
                    c1682.f5702.removeCallbacks(runnableC0141);
                    runnableC0141.run();
                    c1682.f5702.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c1682.f5696) {
                    c1682.f5696 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c1682.m3421(c1682.f5699, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c1682.f5704;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c1682.m3420(null, 0);
        c1682.f5696 = -1;
    }

    @Override // p000.InterfaceC2494
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo3006(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C1682 c1682 = this.f5665;
        c1682.f5708.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C1679 c1679 = null;
        if (actionMasked == 0) {
            c1682.f5696 = motionEvent.getPointerId(0);
            c1682.f5688 = motionEvent.getX();
            c1682.f5689 = motionEvent.getY();
            VelocityTracker velocityTracker = c1682.f5704;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1682.f5704 = VelocityTracker.obtain();
            if (c1682.f5687 == null) {
                ArrayList arrayList = c1682.f5700;
                if (!arrayList.isEmpty()) {
                    View viewM3416 = c1682.m3416(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C1679 c16710 = (C1679) arrayList.get(size);
                        if (c16710.f5670.f8006 == viewM3416) {
                            c1679 = c16710;
                            break;
                        }
                    }
                }
                if (c1679 != null) {
                    AbstractC2508 abstractC2508 = c1679.f5670;
                    c1682.f5688 -= c1679.f5674;
                    c1682.f5689 -= c1679.f5675;
                    c1682.m3415(abstractC2508, true);
                    if (c1682.f5685.remove(abstractC2508.f8006)) {
                        c1682.f5697.getClass();
                        C0662.m2043(abstractC2508);
                    }
                    c1682.m3420(abstractC2508, c1679.f5671);
                    c1682.m3421(c1682.f5699, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c1682.f5696 = -1;
            c1682.m3420(null, 0);
        } else {
            int i = c1682.f5696;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c1682.m3413(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c1682.f5704;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c1682.f5687 != null;
    }

    @Override // p000.InterfaceC2494
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo3007(boolean z) {
        if (z) {
            this.f5665.m3420(null, 0);
        }
    }
}
