package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲀᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1695 implements InterfaceC2549 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1700 f5705;

    public C1695(C1700 c1700) {
        this.f5705 = c1700;
    }

    @Override // p000.InterfaceC2549
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo3108(MotionEvent motionEvent) {
        C1700 c1700 = this.f5705;
        RunnableC0149 runnableC0149 = c1700.f5746;
        c1700.f5751.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c1700.f5747;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1700.f5739 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c1700.f5739);
        if (iFindPointerIndex >= 0) {
            c1700.m3581(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC2563 abstractC2563 = c1700.f5730;
        if (abstractC2563 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c1700.m3589(c1700.f5742, iFindPointerIndex, motionEvent);
                    c1700.m3586(abstractC2563);
                    c1700.f5745.removeCallbacks(runnableC0149);
                    runnableC0149.run();
                    c1700.f5745.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c1700.f5739) {
                    c1700.f5739 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c1700.m3589(c1700.f5742, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c1700.f5747;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c1700.m3588(null, 0);
        c1700.f5739 = -1;
    }

    @Override // p000.InterfaceC2549
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo3109(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C1700 c1700 = this.f5705;
        c1700.f5751.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C1696 c1696 = null;
        if (actionMasked == 0) {
            c1700.f5739 = motionEvent.getPointerId(0);
            c1700.f5731 = motionEvent.getX();
            c1700.f5732 = motionEvent.getY();
            VelocityTracker velocityTracker = c1700.f5747;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1700.f5747 = VelocityTracker.obtain();
            if (c1700.f5730 == null) {
                ArrayList arrayList = c1700.f5743;
                if (!arrayList.isEmpty()) {
                    View viewM3584 = c1700.m3584(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C1696 c1697 = (C1696) arrayList.get(size);
                        if (c1697.f5710.f8157 == viewM3584) {
                            c1696 = c1697;
                            break;
                        }
                    }
                }
                if (c1696 != null) {
                    AbstractC2563 abstractC2563 = c1696.f5710;
                    c1700.f5731 -= c1696.f5714;
                    c1700.f5732 -= c1696.f5715;
                    c1700.m3583(abstractC2563, true);
                    if (c1700.f5728.remove(abstractC2563.f8157)) {
                        c1700.f5740.mo2128(c1700.f5745, abstractC2563);
                    }
                    c1700.m3588(abstractC2563, c1696.f5711);
                    c1700.m3589(c1700.f5742, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c1700.f5739 = -1;
            c1700.m3588(null, 0);
        } else {
            int i = c1700.f5739;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c1700.m3581(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c1700.f5747;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c1700.f5730 != null;
    }

    @Override // p000.InterfaceC2549
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo3110(boolean z) {
        if (z) {
            this.f5705.m3588(null, 0);
        }
    }
}
