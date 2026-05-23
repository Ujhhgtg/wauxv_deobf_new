package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1681 extends GestureDetector.SimpleOnGestureListener {

    public boolean f5683 = true;

    public final /* synthetic */ C1682 f5684;

    public C1681(C1682 c1682) {
        this.f5684 = c1682;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM3416;
        AbstractC2508 abstractC2508M232;
        C1682 c1682 = this.f5684;
        C0662 c0662 = c1682.f5697;
        if (!this.f5683 || (viewM3416 = c1682.m3416(motionEvent)) == null || (abstractC2508M232 = c1682.f5702.m232(viewM3416)) == null) {
            return;
        }
        RecyclerView recyclerView = c1682.f5702;
        
        if ((C0662.m2044(786444, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c1682.f5696;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c1682.f5688 = x;
                c1682.f5689 = y;
                c1682.f5693 = 0.0f;
                c1682.f5692 = 0.0f;
                
                c1682.m3420(abstractC2508M232, 2);
            }
        }
    }
}
