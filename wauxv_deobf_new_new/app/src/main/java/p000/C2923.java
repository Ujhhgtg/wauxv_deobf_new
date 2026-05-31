package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤝᲁᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2923 extends AbstractC1467 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f9340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f9341 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f9342;

    public C2923(SwipeDismissBehavior swipeDismissBehavior) {
        this.f9342 = swipeDismissBehavior;
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo1791(View view, int i) {
        int width;
        int width2;
        int width3;
        Field field = AbstractC3638.f11333;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f9342.f620;
        if (i2 == 0) {
            if (z) {
                width = this.f9340 - view.getWidth();
                width2 = this.f9340;
            } else {
                width = this.f9340;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f9340 - view.getWidth();
            width2 = view.getWidth() + this.f9340;
        } else if (z) {
            width = this.f9340;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f9340 - view.getWidth();
            width2 = this.f9340;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final int mo1792(View view, int i) {
        return view.getTop();
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final int mo1793(View view) {
        return view.getWidth();
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final void mo3298(View view, int i) {
        this.f9341 = i;
        this.f9340 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f9342;
            swipeDismissBehavior.f619 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f619 = false;
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final void mo1796(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f9342;
        float f = width * swipeDismissBehavior.f621;
        float width2 = view.getWidth() * swipeDismissBehavior.f622;
        float fAbs = Math.abs(i - this.f9340);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final void mo1797(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.f9341 = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f9342;
        if (f != 0.0f) {
            Field field = AbstractC3638.f11333;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.f620;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.f9340;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f9340;
                    if (left < i2) {
                        i = this.f9340 - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f9340 - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f9340) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f9340;
                    if (left < i2) {
                        i = this.f9340 - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f9340 - width;
                }
                z = true;
            } else {
                i = this.f9340;
            }
        }
        if (swipeDismissBehavior.f617.m5200(i, view.getTop())) {
            RunnableC0140 runnableC0140 = new RunnableC0140(swipeDismissBehavior, view, z);
            Field field2 = AbstractC3638.f11333;
            view.postOnAnimation(runnableC0140);
        }
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public final boolean mo1798(View view, int i) {
        int i2 = this.f9341;
        return (i2 == -1 || i2 == i) && this.f9342.mo778(view);
    }

    @Override // p000.AbstractC1467
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo1795(int i) {
    }
}
