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
import p000.AbstractC0567;
import p000.AbstractC1194;
import p000.AbstractC2467;
import p000.AbstractC2491;
import p000.C0564;
import p000.C0565;
import p000.C0566;
import p000.C2097;
import p000.C2492;
import p000.C2498;
import p000.C2504;
import p000.InterfaceC2503;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC2491 implements InterfaceC2503 {

    public final C2097 f655;

    public AbstractC0567 f656;

    public final View.OnLayoutChangeListener f657;

    public CarouselLayoutManager() {
        C2097 c2097 = new C2097();
        new C0565();
        this.f657 = new View.OnLayoutChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲀᲈᲁᤝ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0563(0, this.f2293));
            }
        };
        this.f655 = c2097;
        m4480();
        m670(0);
    }

    @Override // p000.InterfaceC2503
    public final PointF mo150(int i) {
        return null;
    }

    @Override // p000.AbstractC2491
    public final boolean mo152() {
        return m668();
    }

    @Override // p000.AbstractC2491
    public final boolean mo153() {
        return !m668();
    }

    @Override // p000.AbstractC2491
    public final int mo156(C2504 c2504) {
        m4467();
        return 0;
    }

    @Override // p000.AbstractC2491
    public final int mo108(C2504 c2504) {
        return 0;
    }

    @Override // p000.AbstractC2491
    public final int mo109(C2504 c2504) {
        return 0;
    }

    @Override // p000.AbstractC2491
    public final int mo157(C2504 c2504) {
        m4467();
        return 0;
    }

    @Override // p000.AbstractC2491
    public final int mo110(C2504 c2504) {
        return 0;
    }

    @Override // p000.AbstractC2491
    public final int mo111(C2504 c2504) {
        return 0;
    }

    @Override // p000.AbstractC2491
    public final C2492 mo112() {
        return new C2492(-2, -2);
    }

    @Override // p000.AbstractC2491
    public final void mo666(Rect rect, View view) {
        super.mo666(rect, view);
        rect.centerY();
        if (m668()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // p000.AbstractC2491
    public final boolean mo159() {
        return true;
    }

    @Override // p000.AbstractC2491
    public final void mo616(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C2097 c2097 = this.f655;
        float dimension = c2097.f6912;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c2097.f6912 = dimension;
        float dimension2 = c2097.f6913;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c2097.f6913 = dimension2;
        m4480();
        recyclerView.addOnLayoutChangeListener(this.f657);
    }

    @Override // p000.AbstractC2491
    public final void mo161(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f657);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // p000.AbstractC2491
    public final View mo117(View view, int i, C2498 c2498, C2504 c2504) {
        byte b;
        if (m4467() == 0) {
            return null;
        }
        int i2 = this.f656.f2300;
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
                } else if (m669()) {
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
        } else if (m669()) {
            b = 1;
        } else {
            b = -1;
        }
        if (false) {
            return null;
        }
        if (b == -1) {
            if (AbstractC2491.m4460(view) == 0) {
                return null;
            }
            int iM4460 = AbstractC2491.m4460(m4466(0)) - 1;
            if (iM4460 < 0 || iM4460 >= m4468()) {
                return m4466(m669() ? m4467() - 1 : 0);
            }
            this.f656.mo1963();
            throw null;
        }
        if (AbstractC2491.m4460(view) == m4468() - 1) {
            return null;
        }
        int iM4461 = AbstractC2491.m4460(m4466(m4467() - 1)) + 1;
        if (iM4461 < 0 || iM4461 >= m4468()) {
            return m4466(m669() ? 0 : m4467() - 1);
        }
        this.f656.mo1963();
        throw null;
    }

    @Override // p000.AbstractC2491
    public final void mo162(AccessibilityEvent accessibilityEvent) {
        super.mo162(accessibilityEvent);
        if (m4467() > 0) {
            accessibilityEvent.setFromIndex(AbstractC2491.m4460(m4466(0)));
            accessibilityEvent.setToIndex(AbstractC2491.m4460(m4466(m4467() - 1)));
        }
    }

    @Override // p000.AbstractC2491
    public final void mo120(int i, int i2) {
        m4468();
    }

    @Override // p000.AbstractC2491
    public final void mo123(int i, int i2) {
        m4468();
    }

    @Override // p000.AbstractC2491
    public final void mo125(C2498 c2498, C2504 c2504) {
        if (c2504.m4505() > 0) {
            if ((m668() ? this.f7954 : this.f7955) > 0.0f) {
                m669();
                View view = c2498.m4500(0, 9223372036854775807L).f8006;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m4475(c2498);
    }

    @Override // p000.AbstractC2491
    public final void mo126(C2504 c2504) {
        if (m4467() == 0) {
            return;
        }
        AbstractC2491.m4460(m4466(0));
    }

    @Override // p000.AbstractC2491
    public final boolean mo667(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.AbstractC2491
    public final int mo128(int i, C2498 c2498, C2504 c2504) {
        if (!m668() || m4467() == 0 || i == 0) {
            return 0;
        }
        View view = c2498.m4500(0, 9223372036854775807L).f8006;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC2491
    public final int mo129(int i, C2498 c2498, C2504 c2504) {
        if (!mo153() || m4467() == 0 || i == 0) {
            return 0;
        }
        View view = c2498.m4500(0, 9223372036854775807L).f8006;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC2491
    public final void mo167(RecyclerView recyclerView, C2504 c2504, int i) {
        C0564 c0564 = new C0564(recyclerView.getContext());
        c0564.f5952 = i;
        m4487(c0564);
    }

    public final boolean m668() {
        return this.f656.f2300 == 0;
    }

    public final boolean m669() {
        return m668() && this.f7942.getLayoutDirection() == 1;
    }

    public final void m670(int i) {
        C0566 c0566;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "invalid orientation:"));
        }
        mo151(null);
        AbstractC0567 abstractC0567 = this.f656;
        if (abstractC0567 == null || i != abstractC0567.f2300) {
            if (i == 0) {
                c0566 = new C0566(this, 1);
            } else {
                if (false) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0566 = new C0566(this, 0);
            }
            this.f656 = c0566;
            m4480();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0565();
        this.f657 = new View.OnLayoutChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲀᲈᲁᤝ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i3 == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
                    return;
                }
                view.post(new RunnableC0563(0, this.f2293));
            }
        };
        this.f655 = new C2097();
        m4480();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7842);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m4480();
            m670(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p000.AbstractC2491
    public final void mo165(int i) {
    }
}
