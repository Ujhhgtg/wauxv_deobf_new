package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲈᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2491 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C0575 f7941;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public RecyclerView f7942;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2825 f7943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2825 f7944;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C1790 f7945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f7946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f7947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f7948;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f7949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f7950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f7951;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f7952;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f7953;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f7954;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f7955;

    public AbstractC2491() {
        C2489 c2489 = new C2489(this, 0);
        C2489 c24810 = new C2489(this, 1);
        this.f7943 = new C2825(c2489);
        this.f7944 = new C2825(c24810);
        this.f7946 = false;
        this.f7947 = false;
        this.f7948 = true;
        this.f7949 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static int m4452(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static int m4453(int i, int i2, int i3, int i4, boolean z) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static int m4454(View view) {
        return view.getBottom() + ((C2492) view.getLayoutParams()).f7957.bottom;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static int m4455(View view) {
        return view.getLeft() - ((C2492) view.getLayoutParams()).f7957.left;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static int m4456(View view) {
        Rect rect = ((C2492) view.getLayoutParams()).f7957;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static int m4457(View view) {
        Rect rect = ((C2492) view.getLayoutParams()).f7957;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static int m4458(View view) {
        return view.getRight() + ((C2492) view.getLayoutParams()).f7957.right;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static int m4459(View view) {
        return view.getTop() - ((C2492) view.getLayoutParams()).f7957.top;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static int m4460(View view) {
        return ((C2492) view.getLayoutParams()).f7956.m4512();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static C2490 m4461(Context context, AttributeSet attributeSet, int i, int i2) {
        C2490 c2490 = new C2490();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2466.f7838, i, i2);
        c2490.f7937 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c2490.f7938 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c2490.f7939 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c2490.f7940 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c2490;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static boolean m4462(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public static void m4463(View view, int i, int i2, int i3, int i4) {
        C2492 c2492 = (C2492) view.getLayoutParams();
        Rect rect = c2492.f7957;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c2492).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c2492).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c2492).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c2492).bottomMargin);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4464(View view, int i, boolean z) {
        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
        if (z || abstractC2508M204.m4518()) {
            C2705 c2705 = (C2705) this.f7942.f362.f9072;
            C3584 c3584M5202 = (C3584) c2705.get(abstractC2508M204);
            if (c3584M5202 == null) {
                c3584M5202 = C3584.m5202();
                c2705.put(abstractC2508M204, c3584M5202);
            }
            c3584M5202.f11216 |= 1;
        } else {
            this.f7942.f362.m4807(abstractC2508M204);
        }
        C2492 c2492 = (C2492) view.getLayoutParams();
        if (abstractC2508M204.m4526() || abstractC2508M204.m4519()) {
            if (abstractC2508M204.m4519()) {
                abstractC2508M204.f8019.m4501(abstractC2508M204);
            } else {
                abstractC2508M204.f8015 &= -33;
            }
            this.f7941.m1985(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f7942) {
                C0575 c0575 = this.f7941;
                C0689 c0689 = (C0689) c0575.f2344;
                int iIndexOfChild = ((C2481) c0575.f2343).f7925.indexOfChild(view);
                int iM2071 = (iIndexOfChild == -1 || c0689.m2073(iIndexOfChild)) ? -1 : iIndexOfChild - c0689.m2071(iIndexOfChild);
                if (i == -1) {
                    i = this.f7941.m1994();
                }
                if (iM2071 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f7942.indexOfChild(view));
                    throw new IllegalStateException(AbstractC2784.m4747(this.f7942, sb));
                }
                if (iM2071 != i) {
                    AbstractC2491 abstractC2491 = this.f7942.f369;
                    View viewM4466 = abstractC2491.m4466(iM2071);
                    if (viewM4466 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM2071 + abstractC2491.f7942.toString());
                    }
                    abstractC2491.m4466(iM2071);
                    abstractC2491.f7941.m1986(iM2071);
                    C2492 c2493 = (C2492) viewM4466.getLayoutParams();
                    AbstractC2508 abstractC2508M205 = RecyclerView.m204(viewM4466);
                    if (abstractC2508M205.m4518()) {
                        C2705 c2706 = (C2705) abstractC2491.f7942.f362.f9072;
                        C3584 c3584M5203 = (C3584) c2706.get(abstractC2508M205);
                        if (c3584M5203 == null) {
                            c3584M5203 = C3584.m5202();
                            c2706.put(abstractC2508M205, c3584M5203);
                        }
                        c3584M5203.f11216 = 1 | c3584M5203.f11216;
                    } else {
                        abstractC2491.f7942.f362.m4807(abstractC2508M205);
                    }
                    abstractC2491.f7941.m1985(viewM4466, i, c2493, abstractC2508M205.m4518());
                }
            } else {
                this.f7941.m1984(view, i, false);
                c2492.f7958 = true;
                C1790 c1790 = this.f7945;
                if (c1790 != null && c1790.f5956) {
                    c1790.f5953.getClass();
                    AbstractC2508 abstractC2508M206 = RecyclerView.m204(view);
                    if ((abstractC2508M206 != null ? abstractC2508M206.m4512() : -1) == c1790.f5952) {
                        c1790.f5957 = view;
                        if (RecyclerView.f348) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c2492.f7959) {
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c2492.f7956);
            }
            abstractC2508M204.f8006.invalidate();
            c2492.f7959 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo151(String str) {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            recyclerView.m207(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public boolean mo152() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public boolean mo153() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public boolean mo107(C2492 c2492) {
        return c2492 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public int mo156(C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public int mo108(C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo109(C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public int mo157(C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public int mo110(C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public int mo111(C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m4465(C2498 c2498) {
        for (int iM4467 = m4467() - 1; iM4467 >= 0; iM4467--) {
            View viewM4466 = m4466(iM4467);
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(viewM4466);
            if (abstractC2508M204.m4525()) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "ignoring view " + abstractC2508M204);
                }
            } else if (!abstractC2508M204.m4516() || abstractC2508M204.m4518() || this.f7942.f368.f7927) {
                m4466(iM4467);
                this.f7941.m1986(iM4467);
                c2498.m4499(viewM4466);
                this.f7942.f362.m4807(abstractC2508M204);
            } else {
                m4479(iM4467);
                c2498.m4498(abstractC2508M204);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public View mo158(int i) {
        int iM4467 = m4467();
        for (int i2 = 0; i2 < iM4467; i2++) {
            View viewM4466 = m4466(i2);
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(viewM4466);
            if (abstractC2508M204 != null && abstractC2508M204.m4512() == i && !abstractC2508M204.m4525() && (this.f7942.f411.f7990 || !abstractC2508M204.m4518())) {
                return viewM4466;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public abstract C2492 mo112();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public C2492 mo113(Context context, AttributeSet attributeSet) {
        return new C2492(context, attributeSet);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public C2492 mo114(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2492) {
            return new C2492((C2492) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2492((ViewGroup.MarginLayoutParams) layoutParams) : new C2492(layoutParams);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final View m4466(int i) {
        C0575 c0575 = this.f7941;
        if (c0575 != null) {
            return c0575.m1993(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int m4467() {
        C0575 c0575 = this.f7941;
        if (c0575 != null) {
            return c0575.m1994();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public int mo115(C2498 c2498, C2504 c2504) {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView == null || recyclerView.f368 == null || !mo152()) {
            return 1;
        }
        return this.f7942.f368.mo2040();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public void mo666(Rect rect, View view) {
        boolean z = RecyclerView.f347;
        C2492 c2492 = (C2492) view.getLayoutParams();
        Rect rect2 = c2492.f7957;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2492).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2492).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2492).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2492).bottomMargin);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final int m4468() {
        RecyclerView recyclerView = this.f7942;
        AbstractC2482 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo2040();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final int m4469() {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final int m4470() {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final int m4471() {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final int m4472() {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public int mo116(C2498 c2498, C2504 c2504) {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView == null || recyclerView.f368 == null || !mo153()) {
            return 1;
        }
        return this.f7942.f368.mo2040();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m4473(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C2492) view.getLayoutParams()).f7957;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7942 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7942.f367;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public boolean mo159() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public boolean mo160() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ */
    public void mo263(int i) {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            int iM1994 = recyclerView.f361.m1994();
            for (int i2 = 0; i2 < iM1994; i2++) {
                recyclerView.f361.m1993(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ */
    public void mo264(int i) {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            int iM1994 = recyclerView.f361.m1994();
            for (int i2 = 0; i2 < iM1994; i2++) {
                recyclerView.f361.m1993(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public abstract void mo161(RecyclerView recyclerView);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public View mo117(View view, int i, C2498 c2498, C2504 c2504) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public void mo162(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7942;
        C2498 c2498 = recyclerView.f358;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7942.canScrollVertically(-1) && !this.f7942.canScrollHorizontally(-1) && !this.f7942.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC2482 abstractC2482 = this.f7942.f368;
        if (abstractC2482 != null) {
            accessibilityEvent.setItemCount(abstractC2482.mo2040());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public void mo118(C2498 c2498, C2504 c2504, C0092 c0092) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
        if (this.f7942.canScrollVertically(-1) || this.f7942.canScrollHorizontally(-1)) {
            c0092.m1088(8192);
            accessibilityNodeInfo.setScrollable(true);
            c0092.m1094(67108864, true);
        }
        if (this.f7942.canScrollVertically(1) || this.f7942.canScrollHorizontally(1)) {
            c0092.m1088(4096);
            accessibilityNodeInfo.setScrollable(true);
            c0092.m1094(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo116(c2498, c2504), mo115(c2498, c2504), false, 0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ */
    public void mo119(C2498 c2498, C2504 c2504, View view, C0092 c0092) {
        c0092.m1096(C0091.m1085(mo153() ? m4460(view) : 0, 1, mo152() ? m4460(view) : 0, 1, false));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public final void m4474(View view, C0092 c0092) {
        AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
        if (abstractC2508M204 == null || abstractC2508M204.m4518()) {
            return;
        }
        C0575 c0575 = this.f7941;
        if (((ArrayList) c0575.f2345).contains(abstractC2508M204.f8006)) {
            return;
        }
        RecyclerView recyclerView = this.f7942;
        mo119(recyclerView.f358, recyclerView.f411, view, c0092);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ */
    public void mo125(C2498 c2498, C2504 c2504) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ */
    public Parcelable mo164() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r0
      0x0060: PHI (r0v8 int) = (r0v5 int), (r0v15 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ */
    public boolean mo127(int i, Bundle bundle) {
        int iM4472;
        int iM4470;
        float f;
        C2498 c2498 = this.f7942.f358;
        int iHeight = this.f7955;
        int iWidth = this.f7954;
        Rect rect = new Rect();
        if (this.f7942.getMatrix().isIdentity() && this.f7942.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            iM4472 = this.f7942.canScrollVertically(1) ? (iHeight - m4472()) - m4469() : 0;
            if (this.f7942.canScrollHorizontally(1)) {
                iM4470 = (iWidth - m4470()) - m4471();
            } else {
                iM4470 = 0;
            }
        } else if (i != 8192) {
            iM4472 = 0;
            iM4470 = 0;
        } else {
            iM4472 = this.f7942.canScrollVertically(-1) ? -((iHeight - m4472()) - m4469()) : 0;
            if (this.f7942.canScrollHorizontally(-1)) {
                iM4470 = -((iWidth - m4470()) - m4471());
            } else {
                iM4470 = 0;
            }
        }
        if (iM4472 != 0 || iM4470 != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.f347) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    iM4470 = (int) (iM4470 * f);
                    iM4472 = (int) (iM4472 * f);
                }
                this.f7942.m255(iM4470, iM4472, true);
                return true;
            }
            RecyclerView recyclerView = this.f7942;
            AbstractC2482 abstractC2482 = recyclerView.f368;
            if (abstractC2482 != null) {
                if (i == 4096) {
                    recyclerView.m256(abstractC2482.mo2040() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.m256(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public final void m4475(C2498 c2498) {
        for (int iM4467 = m4467() - 1; iM4467 >= 0; iM4467--) {
            if (!RecyclerView.m204(m4466(iM4467)).m4525()) {
                m4478(iM4467, c2498);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public final void m4476(C2498 c2498) {
        ArrayList arrayList = c2498.f7967;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC2508) arrayList.get(i)).f8006;
            AbstractC2508 abstractC2508M204 = RecyclerView.m204(view);
            if (!abstractC2508M204.m4525()) {
                abstractC2508M204.m4524(false);
                if (abstractC2508M204.m4520()) {
                    this.f7942.removeDetachedView(view, false);
                }
                AbstractC2487 abstractC2487 = this.f7942.f394;
                if (abstractC2487 != null) {
                    abstractC2487.mo2566(abstractC2508M204);
                }
                abstractC2508M204.m4524(true);
                AbstractC2508 abstractC2508M205 = RecyclerView.m204(view);
                abstractC2508M205.f8019 = null;
                abstractC2508M205.f8020 = false;
                abstractC2508M205.f8015 &= -33;
                c2498.m4498(abstractC2508M205);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c2498.f7968;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7942.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public final void m4477(View view, C2498 c2498) {
        C0575 c0575 = this.f7941;
        C2481 c2481 = (C2481) c0575.f2343;
        int i = c0575.f2342;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0575.f2342 = 1;
            c0575.f2346 = view;
            int iIndexOfChild = c2481.f7925.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C0689) c0575.f2344).m2075(iIndexOfChild)) {
                    c0575.m1999(view);
                }
                c2481.m4440(iIndexOfChild);
            }
            c0575.f2342 = 0;
            c0575.f2346 = null;
            c2498.m4497(view);
        } catch (Throwable th) {
            c0575.f2342 = 0;
            c0575.f2346 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public final void m4478(int i, C2498 c2498) {
        View viewM4466 = m4466(i);
        m4479(i);
        c2498.m4497(viewM4466);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public final void m4479(int i) {
        if (m4466(i) != null) {
            C0575 c0575 = this.f7941;
            C2481 c2481 = (C2481) c0575.f2343;
            int i2 = c0575.f2342;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iM1995 = c0575.m1995(i);
                View childAt = c2481.f7925.getChildAt(iM1995);
                if (childAt != null) {
                    c0575.f2342 = 1;
                    c0575.f2346 = childAt;
                    if (((C0689) c0575.f2344).m2075(iM1995)) {
                        c0575.m1999(childAt);
                    }
                    c2481.m4440(iM1995);
                }
            } finally {
                c0575.f2342 = 0;
                c0575.f2346 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ */
    public boolean mo667(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iM4470 = m4470();
        int iM4472 = m4472();
        int iM4471 = this.f7954 - m4471();
        int iM4469 = this.f7955 - m4469();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM4470;
        int iMin = Math.min(0, i);
        int i2 = top - iM4472;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iM4471;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iM4469);
        if (this.f7942.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM4473 = m4470();
                int iM4474 = m4472();
                int iM4475 = this.f7954 - m4471();
                int iM44610 = this.f7955 - m4469();
                Rect rect2 = this.f7942.f365;
                mo666(rect2, focusedChild);
                if (rect2.left - i4 < iM4475 && rect2.right - i4 > iM4473 && rect2.top - i5 < iM44610 && rect2.bottom - i5 > iM4474) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.m255(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.m255(i4, i5, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ, reason: contains not printable characters */
    public final void m4480() {
        RecyclerView recyclerView = this.f7942;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ */
    public int mo128(int i, C2498 c2498, C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ */
    public void mo165(int i) {
        if (RecyclerView.f348) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ */
    public int mo129(int i, C2498 c2498, C2504 c2504) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
    public final void m4481(RecyclerView recyclerView) {
        m4482(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ, reason: contains not printable characters */
    public final void m4482(int i, int i2) {
        this.f7954 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f7952 = mode;
        if (mode == 0 && !RecyclerView.f351) {
            this.f7954 = 0;
        }
        this.f7955 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f7953 = mode2;
        if (mode2 != 0 || RecyclerView.f351) {
            return;
        }
        this.f7955 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ */
    public void mo130(Rect rect, int i, int i2) {
        int iM4471 = m4471() + m4470() + rect.width();
        int iM4469 = m4469() + m4472() + rect.height();
        RecyclerView recyclerView = this.f7942;
        Field field = AbstractC3578.f11184;
        this.f7942.setMeasuredDimension(m4452(i, iM4471, recyclerView.getMinimumWidth()), m4452(i2, iM4469, this.f7942.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
    public final void m4483(int i, int i2) {
        int iM4467 = m4467();
        if (iM4467 == 0) {
            this.f7942.m211(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM4467; i7++) {
            View viewM4466 = m4466(i7);
            Rect rect = this.f7942.f365;
            mo666(rect, viewM4466);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f7942.f365.set(i6, i4, i3, i5);
        mo130(this.f7942.f365, i, i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲈᲁ, reason: contains not printable characters */
    public final void m4484(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7942 = null;
            this.f7941 = null;
            this.f7954 = 0;
            this.f7955 = 0;
        } else {
            this.f7942 = recyclerView;
            this.f7941 = recyclerView.f361;
            this.f7954 = recyclerView.getWidth();
            this.f7955 = recyclerView.getHeight();
        }
        this.f7952 = 1073741824;
        this.f7953 = 1073741824;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᤞᲈ, reason: contains not printable characters */
    public final boolean m4485(View view, int i, int i2, C2492 c2492) {
        return (!view.isLayoutRequested() && this.f7948 && m4462(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c2492).width) && m4462(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c2492).height)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᲈᤞ */
    public boolean mo166() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ, reason: contains not printable characters */
    public final boolean m4486(View view, int i, int i2, C2492 c2492) {
        return (this.f7948 && m4462(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c2492).width) && m4462(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c2492).height)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ */
    public void mo167(RecyclerView recyclerView, C2504 c2504, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ, reason: contains not printable characters */
    public final void m4487(C1790 c1790) {
        C1790 c1791 = this.f7945;
        if (c1791 != null && c1790 != c1791 && c1791.f5956) {
            c1791.m3528();
        }
        this.f7945 = c1790;
        RecyclerView recyclerView = this.f7942;
        RunnableC2507 runnableC2507 = recyclerView.f408;
        runnableC2507.f8004.removeCallbacks(runnableC2507);
        runnableC2507.f8000.abortAnimation();
        if (c1790.f5959) {
            Log.w("RecyclerView", "An instance of " + c1790.getClass().getSimpleName() + " was started more than once. Each instance of" + c1790.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c1790.f5953 = recyclerView;
        c1790.f5954 = this;
        int i = c1790.f5952;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f411.f7984 = i;
        c1790.f5956 = true;
        c1790.f5955 = true;
        c1790.f5957 = recyclerView.f369.mo158(i);
        c1790.f5953.f408.m4507();
        c1790.f5959 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ */
    public boolean mo131() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ */
    public void mo121() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public void mo265(AbstractC2482 abstractC2482) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public void mo616(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ */
    public void mo126(C2504 c2504) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ */
    public void mo163(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ */
    public void mo266(int i) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo155(int i, C1439 c1439) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ */
    public void mo120(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ */
    public void mo122(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ */
    public void mo123(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ */
    public void mo124(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo154(int i, int i2, C2504 c2504, C1439 c1439) {
    }
}
