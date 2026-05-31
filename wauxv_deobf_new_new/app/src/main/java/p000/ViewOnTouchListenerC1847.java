package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲁᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1847 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f6133;

    public /* synthetic */ ViewOnTouchListenerC1847(Object obj, int i) {
        this.f6132 = i;
        this.f6133 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f6132) {
            case 0:
                AbstractC1848 abstractC1848 = (AbstractC1848) this.f6133;
                RunnableC1844 runnableC1844 = abstractC1848.f6149;
                Handler handler = abstractC1848.f6153;
                C0233 c0233 = abstractC1848.f6157;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0233 != null && c0233.isShowing() && x >= 0 && x < c0233.getWidth() && y >= 0 && y < c0233.getHeight()) {
                    handler.postDelayed(runnableC1844, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(runnableC1844);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f6133).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
