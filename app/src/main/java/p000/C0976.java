package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲁᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0976 extends C0222 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float f3581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Rect f3582;

    public C0976(Context context, float f) {
        super(context);
        this.f3581 = f;
        this.f3582 = new Rect();
    }

    private final Rect getDecreasedHitRect() {
        float width = getWidth();
        float f = this.f3581;
        float f2 = (width - f) / 2.0f;
        float height = (getHeight() - f) / 2.0f;
        int i = (int) f2;
        int i2 = (int) height;
        int width2 = (int) (getWidth() - f2);
        int height2 = (int) (getHeight() - height);
        Rect rect = this.f3582;
        rect.set(i, i2, width2, height2);
        return rect;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || getDecreasedHitRect().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
