package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import me.hd.wauxv.R;
import p000.AbstractC1095;
import p000.AbstractC1698;
import p000.AbstractC2521;
import p000.AbstractC2546;
import p000.C0542;
import p000.C0543;
import p000.C0544;
import p000.C2130;
import p000.C2547;
import p000.C2553;
import p000.C2559;
import p000.InterfaceC2558;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC2546 implements InterfaceC2558 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final C2130 f714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public AbstractC1698 f715;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final View.OnLayoutChangeListener f716;

    public CarouselLayoutManager() {
        C2130 c2130 = new C2130();
        new C0543();
        this.f716 = new View.OnLayoutChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲀᤞᲁᲈ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0541(this.f2256, 0));
            }
        };
        this.f714 = c2130;
        m4501();
        m814(0);
    }

    @Override // p000.InterfaceC2558
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final PointF mo150(int i) {
        return null;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo152() {
        return m812();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo153() {
        return !m812();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final int mo156(C2559 c2559) {
        m4489();
        return 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo108(C2559 c2559) {
        return 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final int mo109(C2559 c2559) {
        return 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo157(C2559 c2559) {
        m4489();
        return 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final int mo110(C2559 c2559) {
        return 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final int mo111(C2559 c2559) {
        return 0;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final C2547 mo112() {
        return new C2547(-2, -2);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void mo810(Rect rect, View view) {
        super.mo810(rect, view);
        rect.centerY();
        if (m812()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public final boolean mo159() {
        return true;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public final void mo759(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C2130 c2130 = this.f714;
        float dimension = c2130.f7036;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c2130.f7036 = dimension;
        float dimension2 = c2130.f7037;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c2130.f7037 = dimension2;
        m4501();
        recyclerView.addOnLayoutChangeListener(this.f716);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final void mo161(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f716);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public final View mo117(View view, int i, C2553 c2553, C2559 c2559) {
        byte b;
        if (m4489() == 0) {
            return null;
        }
        int i2 = this.f715.f5725;
        if (i == 1) {
            b = -1;
        } else if (i == 2) {
            b = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                    } else if (i2 == 1) {
                        b = 1;
                    }
                    b = -2147483648;
                } else if (i2 != 0) {
                    b = -2147483648;
                } else if (m813()) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (i2 == 1) {
                b = -1;
            } else {
                b = -2147483648;
            }
        } else if (i2 != 0) {
            b = -2147483648;
        } else if (m813()) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (AbstractC2546.m4482(view) == 0) {
                return null;
            }
            int iM4482 = AbstractC2546.m4482(m4488(0)) - 1;
            if (iM4482 < 0 || iM4482 >= m4490()) {
                return m4488(m813() ? m4489() - 1 : 0);
            }
            this.f715.mo2059();
            throw null;
        }
        if (AbstractC2546.m4482(view) == m4490() - 1) {
            return null;
        }
        int iM4483 = AbstractC2546.m4482(m4488(m4489() - 1)) + 1;
        if (iM4483 < 0 || iM4483 >= m4490()) {
            return m4488(m813() ? 0 : m4489() - 1);
        }
        this.f715.mo2059();
        throw null;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public final void mo162(AccessibilityEvent accessibilityEvent) {
        super.mo162(accessibilityEvent);
        if (m4489() > 0) {
            accessibilityEvent.setFromIndex(AbstractC2546.m4482(m4488(0)));
            accessibilityEvent.setToIndex(AbstractC2546.m4482(m4488(m4489() - 1)));
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ */
    public final void mo120(int i, int i2) {
        m4490();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ */
    public final void mo123(int i, int i2) {
        m4490();
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ */
    public final void mo125(C2553 c2553, C2559 c2559) {
        if (c2559.m4527() > 0) {
            if ((m812() ? this.f8105 : this.f8106) > 0.0f) {
                m813();
                View view = c2553.m4521(0, Long.MAX_VALUE).f8157;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m4497(c2553);
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ */
    public final void mo126(C2559 c2559) {
        if (m4489() == 0) {
            return;
        }
        AbstractC2546.m4482(m4488(0));
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public final boolean mo811(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ */
    public final int mo128(int i, C2553 c2553, C2559 c2559) {
        if (!m812() || m4489() == 0 || i == 0) {
            return 0;
        }
        View view = c2553.m4521(0, Long.MAX_VALUE).f8157;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ */
    public final int mo129(int i, C2553 c2553, C2559 c2559) {
        if (!mo153() || m4489() == 0 || i == 0) {
            return 0;
        }
        View view = c2553.m4521(0, Long.MAX_VALUE).f8157;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ */
    public final void mo167(RecyclerView recyclerView, C2559 c2559, int i) {
        C0542 c0542 = new C0542(recyclerView.getContext());
        c0542.f6008 = i;
        m4508(c0542);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ, reason: contains not printable characters */
    public final boolean m812() {
        return this.f715.f5725 == 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public final boolean m813() {
        return m812() && this.f8093.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᲈᤞ, reason: contains not printable characters */
    public final void m814(int i) {
        C0544 c0544;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "invalid orientation:"));
        }
        mo151(null);
        AbstractC1698 abstractC1698 = this.f715;
        if (abstractC1698 == null || i != abstractC1698.f5725) {
            if (i == 0) {
                c0544 = new C0544(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0544 = new C0544(this, 0);
            }
            this.f715 = c0544;
            m4501();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0543();
        this.f716 = new View.OnLayoutChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲀᤞᲁᲈ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i3 == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
                    return;
                }
                view.post(new RunnableC0541(this.f2256, 0));
            }
        };
        this.f714 = new C2130();
        m4501();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f7989);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m4501();
            m814(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p000.AbstractC2546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ */
    public final void mo165(int i) {
    }
}
