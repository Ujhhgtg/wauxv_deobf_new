package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᤝᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2863 extends AbstractC0743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f9170;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f9171 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f9172;

    public C2863(SwipeDismissBehavior swipeDismissBehavior) {
        this.f9172 = swipeDismissBehavior;
    }

    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1683(View view, int i) {
        int width;
        int width2;
        int width3;
        Field field = AbstractC3578.f11184;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f9172.f568;
        if (i2 == 0) {
            if (z) {
                width = this.f9170 - view.getWidth();
                width2 = this.f9170;
            } else {
                width = this.f9170;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f9170 - view.getWidth();
            width2 = view.getWidth() + this.f9170;
        } else if (z) {
            width = this.f9170;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f9170 - view.getWidth();
            width2 = this.f9170;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo1684(View view, int i) {
        return view.getTop();
    }

    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final int mo1685(View view) {
        return view.getWidth();
    }

    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo2189(View view, int i) {
        this.f9171 = i;
        this.f9170 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f9172;
            swipeDismissBehavior.f567 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f567 = false;
        }
    }

    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final void mo1688(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f9172;
        float f = width * swipeDismissBehavior.f569;
        float width2 = view.getWidth() * swipeDismissBehavior.f570;
        float fAbs = Math.abs(i - this.f9170);
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
    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final void mo1689(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.f9171 = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f9172;
        if (f != 0.0f) {
            Field field = AbstractC3578.f11184;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.f568;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.f9170;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f9170;
                    if (left < i2) {
                        i = this.f9170 - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f9170 - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f9170) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f9170;
                    if (left < i2) {
                        i = this.f9170 - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f9170 - width;
                }
                z = true;
            } else {
                i = this.f9170;
            }
        }
        if (swipeDismissBehavior.f565.m5194(i, view.getTop())) {
            RunnableC0132 runnableC0132 = new RunnableC0132(swipeDismissBehavior, view, z);
            Field field2 = AbstractC3578.f11184;
            view.postOnAnimation(runnableC0132);
        }
    }

    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final boolean mo1690(View view, int i) {
        int i2 = this.f9171;
        return (i2 == -1 || i2 == i) && this.f9172.mo635(view);
    }

    @Override // p000.AbstractC0743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final void mo1687(int i) {
    }
}
