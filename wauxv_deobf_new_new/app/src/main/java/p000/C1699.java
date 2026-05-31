package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲁᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1699 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f5726 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1700 f5727;

    public C1699(C1700 c1700) {
        this.f5727 = c1700;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM3584;
        AbstractC2563 abstractC2563M232;
        C1700 c1700 = this.f5727;
        AbstractC1698 abstractC1698 = c1700.f5740;
        if (!this.f5726 || (viewM3584 = c1700.m3584(motionEvent)) == null || (abstractC2563M232 = c1700.f5745.m232(viewM3584)) == null) {
            return;
        }
        if ((AbstractC1698.m3571(abstractC1698.mo2129(), c1700.f5745.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c1700.f5739;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c1700.f5731 = x;
                c1700.f5732 = y;
                c1700.f5736 = 0.0f;
                c1700.f5735 = 0.0f;
                abstractC1698.getClass();
                c1700.m3588(abstractC2563M232, 2);
            }
        }
    }
}
