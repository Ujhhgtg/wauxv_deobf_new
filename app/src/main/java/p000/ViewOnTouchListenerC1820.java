package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᤝᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1820 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6057;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f6058;

    public /* synthetic */ ViewOnTouchListenerC1820(int i, Object obj) {
        this.f6057 = i;
        this.f6058 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f6057) {
            case 0:
                AbstractC1821 abstractC1821 = (AbstractC1821) this.f6058;
                RunnableC1817 runnableC1817 = abstractC1821.f6074;
                Handler handler = abstractC1821.f6078;
                C0223 c0223 = abstractC1821.f6082;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0223 != null && c0223.isShowing() && x >= 0 && x < c0223.getWidth() && y >= 0 && y < c0223.getHeight()) {
                    handler.postDelayed(runnableC1817, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(runnableC1817);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f6058).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
