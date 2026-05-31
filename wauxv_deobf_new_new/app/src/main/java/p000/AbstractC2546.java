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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᲈᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2546 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C0552 f8092;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public RecyclerView f8093;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2885 f8094;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2885 f8095;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C1813 f8096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f8097;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f8098;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f8099;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f8100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f8101;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f8102;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f8103;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f8104;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f8105;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f8106;

    public AbstractC2546() {
        C2544 c2544 = new C2544(this, 0);
        C2544 c2545 = new C2544(this, 1);
        this.f8094 = new C2885(c2544);
        this.f8095 = new C2885(c2545);
        this.f8097 = false;
        this.f8098 = false;
        this.f8099 = true;
        this.f8100 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static int m4474(int i, int i2, int i3) {
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
    public static int m4475(int i, int i2, int i3, int i4, boolean z) {
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
    public static int m4476(View view) {
        return view.getBottom() + ((C2547) view.getLayoutParams()).f8108.bottom;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static int m4477(View view) {
        return view.getLeft() - ((C2547) view.getLayoutParams()).f8108.left;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static int m4478(View view) {
        Rect rect = ((C2547) view.getLayoutParams()).f8108;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static int m4479(View view) {
        Rect rect = ((C2547) view.getLayoutParams()).f8108;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static int m4480(View view) {
        return view.getRight() + ((C2547) view.getLayoutParams()).f8108.right;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static int m4481(View view) {
        return view.getTop() - ((C2547) view.getLayoutParams()).f8108.top;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static int m4482(View view) {
        return ((C2547) view.getLayoutParams()).f8107.m4534();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static C2545 m4483(Context context, AttributeSet attributeSet, int i, int i2) {
        C2545 c2545 = new C2545();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2520.f7984, i, i2);
        c2545.f8088 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c2545.f8089 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c2545.f8090 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c2545.f8091 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c2545;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static boolean m4484(int i, int i2, int i3) {
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
    public static void m4485(View view, int i, int i2, int i3, int i4) {
        C2547 c2547 = (C2547) view.getLayoutParams();
        Rect rect = c2547.f8108;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c2547).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c2547).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c2547).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c2547).bottomMargin);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4486(View view, int i, boolean z) {
        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
        if (z || abstractC2563M204.m4540()) {
            C2767 c2767 = (C2767) this.f8093.f362.f9234;
            C3644 c3644M5208 = (C3644) c2767.get(abstractC2563M204);
            if (c3644M5208 == null) {
                c3644M5208 = C3644.m5208();
                c2767.put(abstractC2563M204, c3644M5208);
            }
            c3644M5208.f11365 |= 1;
        } else {
            this.f8093.f362.m4840(abstractC2563M204);
        }
        C2547 c2547 = (C2547) view.getLayoutParams();
        if (abstractC2563M204.m4548() || abstractC2563M204.m4541()) {
            if (abstractC2563M204.m4541()) {
                abstractC2563M204.f8170.m4522(abstractC2563M204);
            } else {
                abstractC2563M204.f8166 &= -33;
            }
            this.f8092.m2082(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f8093) {
                C0552 c0552 = this.f8092;
                C0680 c0680 = (C0680) c0552.f2306;
                int iIndexOfChild = ((C2536) c0552.f2305).f8076.indexOfChild(view);
                int iM2166 = (iIndexOfChild == -1 || c0680.m2168(iIndexOfChild)) ? -1 : iIndexOfChild - c0680.m2166(iIndexOfChild);
                if (i == -1) {
                    i = this.f8092.m2091();
                }
                if (iM2166 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f8093.indexOfChild(view));
                    throw new IllegalStateException(AbstractC2844.m4781(this.f8093, sb));
                }
                if (iM2166 != i) {
                    AbstractC2546 abstractC2546 = this.f8093.f369;
                    View viewM4488 = abstractC2546.m4488(iM2166);
                    if (viewM4488 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM2166 + abstractC2546.f8093.toString());
                    }
                    abstractC2546.m4488(iM2166);
                    abstractC2546.f8092.m2083(iM2166);
                    C2547 c2548 = (C2547) viewM4488.getLayoutParams();
                    AbstractC2563 abstractC2563M205 = RecyclerView.m204(viewM4488);
                    if (abstractC2563M205.m4540()) {
                        C2767 c2768 = (C2767) abstractC2546.f8093.f362.f9234;
                        C3644 c3644M5209 = (C3644) c2768.get(abstractC2563M205);
                        if (c3644M5209 == null) {
                            c3644M5209 = C3644.m5208();
                            c2768.put(abstractC2563M205, c3644M5209);
                        }
                        c3644M5209.f11365 = 1 | c3644M5209.f11365;
                    } else {
                        abstractC2546.f8093.f362.m4840(abstractC2563M205);
                    }
                    abstractC2546.f8092.m2082(viewM4488, i, c2548, abstractC2563M205.m4540());
                }
            } else {
                this.f8092.m2081(view, i, false);
                c2547.f8109 = true;
                C1813 c1813 = this.f8096;
                if (c1813 != null && c1813.f6012) {
                    c1813.f6009.getClass();
                    AbstractC2563 abstractC2563M206 = RecyclerView.m204(view);
                    if ((abstractC2563M206 != null ? abstractC2563M206.m4534() : -1) == c1813.f6008) {
                        c1813.f6013 = view;
                        if (RecyclerView.f348) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c2547.f8110) {
            if (RecyclerView.f348) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c2547.f8107);
            }
            abstractC2563M204.f8157.invalidate();
            c2547.f8110 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo151(String str) {
        RecyclerView recyclerView = this.f8093;
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
    public boolean mo107(C2547 c2547) {
        return c2547 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public int mo156(C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public int mo108(C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo109(C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public int mo157(C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public int mo110(C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public int mo111(C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m4487(C2553 c2553) {
        for (int iM4489 = m4489() - 1; iM4489 >= 0; iM4489--) {
            View viewM4488 = m4488(iM4489);
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(viewM4488);
            if (abstractC2563M204.m4547()) {
                if (RecyclerView.f348) {
                    Log.d("RecyclerView", "ignoring view " + abstractC2563M204);
                }
            } else if (!abstractC2563M204.m4538() || abstractC2563M204.m4540() || this.f8093.f368.f8078) {
                m4488(iM4489);
                this.f8092.m2083(iM4489);
                c2553.m4520(viewM4488);
                this.f8093.f362.m4840(abstractC2563M204);
            } else {
                m4500(iM4489);
                c2553.m4519(abstractC2563M204);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public View mo158(int i) {
        int iM4489 = m4489();
        for (int i2 = 0; i2 < iM4489; i2++) {
            View viewM4488 = m4488(i2);
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(viewM4488);
            if (abstractC2563M204 != null && abstractC2563M204.m4534() == i && !abstractC2563M204.m4547() && (this.f8093.f411.f8141 || !abstractC2563M204.m4540())) {
                return viewM4488;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public abstract C2547 mo112();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public C2547 mo113(Context context, AttributeSet attributeSet) {
        return new C2547(context, attributeSet);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public C2547 mo114(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2547) {
            return new C2547((C2547) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2547((ViewGroup.MarginLayoutParams) layoutParams) : new C2547(layoutParams);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final View m4488(int i) {
        C0552 c0552 = this.f8092;
        if (c0552 != null) {
            return c0552.m2090(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int m4489() {
        C0552 c0552 = this.f8092;
        if (c0552 != null) {
            return c0552.m2091();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public int mo115(C2553 c2553, C2559 c2559) {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView == null || recyclerView.f368 == null || !mo152()) {
            return 1;
        }
        return this.f8093.f368.mo2124();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public void mo810(Rect rect, View view) {
        boolean z = RecyclerView.f347;
        C2547 c2547 = (C2547) view.getLayoutParams();
        Rect rect2 = c2547.f8108;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2547).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2547).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2547).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2547).bottomMargin);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final int m4490() {
        RecyclerView recyclerView = this.f8093;
        AbstractC2537 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo2124();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final int m4491() {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final int m4492() {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final int m4493() {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final int m4494() {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public int mo116(C2553 c2553, C2559 c2559) {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView == null || recyclerView.f368 == null || !mo153()) {
            return 1;
        }
        return this.f8093.f368.mo2124();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m4495(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C2547) view.getLayoutParams()).f8108;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f8093 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f8093.f367;
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
        RecyclerView recyclerView = this.f8093;
        if (recyclerView != null) {
            int iM2091 = recyclerView.f361.m2091();
            for (int i2 = 0; i2 < iM2091; i2++) {
                recyclerView.f361.m2090(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ */
    public void mo264(int i) {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView != null) {
            int iM2091 = recyclerView.f361.m2091();
            for (int i2 = 0; i2 < iM2091; i2++) {
                recyclerView.f361.m2090(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public abstract void mo161(RecyclerView recyclerView);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public View mo117(View view, int i, C2553 c2553, C2559 c2559) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public void mo162(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f8093;
        C2553 c2553 = recyclerView.f358;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f8093.canScrollVertically(-1) && !this.f8093.canScrollHorizontally(-1) && !this.f8093.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC2537 abstractC2537 = this.f8093.f368;
        if (abstractC2537 != null) {
            accessibilityEvent.setItemCount(abstractC2537.mo2124());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public void mo118(C2553 c2553, C2559 c2559, C0100 c0100) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0100.f1113;
        if (this.f8093.canScrollVertically(-1) || this.f8093.canScrollHorizontally(-1)) {
            c0100.m1234(8192);
            accessibilityNodeInfo.setScrollable(true);
            c0100.m1240(67108864, true);
        }
        if (this.f8093.canScrollVertically(1) || this.f8093.canScrollHorizontally(1)) {
            c0100.m1234(4096);
            accessibilityNodeInfo.setScrollable(true);
            c0100.m1240(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0099.m1230(mo116(c2553, c2559), mo115(c2553, c2559), 0).f1112);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ */
    public void mo119(C2553 c2553, C2559 c2559, View view, C0100 c0100) {
        c0100.m1242(C0099.m1231(mo153() ? m4482(view) : 0, 1, mo152() ? m4482(view) : 0, 1, false));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public final void m4496(View view, C0100 c0100) {
        AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
        if (abstractC2563M204 == null || abstractC2563M204.m4540()) {
            return;
        }
        C0552 c0552 = this.f8092;
        if (((ArrayList) c0552.f2307).contains(abstractC2563M204.f8157)) {
            return;
        }
        RecyclerView recyclerView = this.f8093;
        mo119(recyclerView.f358, recyclerView.f411, view, c0100);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ */
    public void mo125(C2553 c2553, C2559 c2559) {
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
        int iM4494;
        int iM4492;
        float f;
        C2553 c2553 = this.f8093.f358;
        int iHeight = this.f8106;
        int iWidth = this.f8105;
        Rect rect = new Rect();
        if (this.f8093.getMatrix().isIdentity() && this.f8093.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            iM4494 = this.f8093.canScrollVertically(1) ? (iHeight - m4494()) - m4491() : 0;
            if (this.f8093.canScrollHorizontally(1)) {
                iM4492 = (iWidth - m4492()) - m4493();
            } else {
                iM4492 = 0;
            }
        } else if (i != 8192) {
            iM4494 = 0;
            iM4492 = 0;
        } else {
            iM4494 = this.f8093.canScrollVertically(-1) ? -((iHeight - m4494()) - m4491()) : 0;
            if (this.f8093.canScrollHorizontally(-1)) {
                iM4492 = -((iWidth - m4492()) - m4493());
            } else {
                iM4492 = 0;
            }
        }
        if (iM4494 != 0 || iM4492 != 0) {
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
                    iM4492 = (int) (iM4492 * f);
                    iM4494 = (int) (iM4494 * f);
                }
                this.f8093.m255(iM4492, iM4494, true);
                return true;
            }
            RecyclerView recyclerView = this.f8093;
            AbstractC2537 abstractC2537 = recyclerView.f368;
            if (abstractC2537 != null) {
                if (i == 4096) {
                    recyclerView.m256(abstractC2537.mo2124() - 1);
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
    public final void m4497(C2553 c2553) {
        for (int iM4489 = m4489() - 1; iM4489 >= 0; iM4489--) {
            if (!RecyclerView.m204(m4488(iM4489)).m4547()) {
                View viewM4488 = m4488(iM4489);
                m4500(iM4489);
                c2553.m4518(viewM4488);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public final void m4498(C2553 c2553) {
        ArrayList arrayList = c2553.f8118;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC2563) arrayList.get(i)).f8157;
            AbstractC2563 abstractC2563M204 = RecyclerView.m204(view);
            if (!abstractC2563M204.m4547()) {
                abstractC2563M204.m4546(false);
                if (abstractC2563M204.m4542()) {
                    this.f8093.removeDetachedView(view, false);
                }
                AbstractC2542 abstractC2542 = this.f8093.f394;
                if (abstractC2542 != null) {
                    abstractC2542.mo2690(abstractC2563M204);
                }
                abstractC2563M204.m4546(true);
                AbstractC2563 abstractC2563M205 = RecyclerView.m204(view);
                abstractC2563M205.f8170 = null;
                abstractC2563M205.f8171 = false;
                abstractC2563M205.f8166 &= -33;
                c2553.m4519(abstractC2563M205);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c2553.f8119;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f8093.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public final void m4499(View view, C2553 c2553) {
        C0552 c0552 = this.f8092;
        C2536 c2536 = (C2536) c0552.f2305;
        int i = c0552.f2304;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0552.f2304 = 1;
            c0552.f2308 = view;
            int iIndexOfChild = c2536.f8076.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C0680) c0552.f2306).m2170(iIndexOfChild)) {
                    c0552.m2096(view);
                }
                c2536.m4461(iIndexOfChild);
            }
            c0552.f2304 = 0;
            c0552.f2308 = null;
            c2553.m4518(view);
        } catch (Throwable th) {
            c0552.f2304 = 0;
            c0552.f2308 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public final void m4500(int i) {
        if (m4488(i) != null) {
            C0552 c0552 = this.f8092;
            C2536 c2536 = (C2536) c0552.f2305;
            int i2 = c0552.f2304;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iM2092 = c0552.m2092(i);
                View childAt = c2536.f8076.getChildAt(iM2092);
                if (childAt != null) {
                    c0552.f2304 = 1;
                    c0552.f2308 = childAt;
                    if (((C0680) c0552.f2306).m2170(iM2092)) {
                        c0552.m2096(childAt);
                    }
                    c2536.m4461(iM2092);
                }
            } finally {
                c0552.f2304 = 0;
                c0552.f2308 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ */
    public boolean mo811(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iM4492 = m4492();
        int iM4494 = m4494();
        int iM4493 = this.f8105 - m4493();
        int iM4491 = this.f8106 - m4491();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM4492;
        int iMin = Math.min(0, i);
        int i2 = top - iM4494;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iM4493;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iM4491);
        if (this.f8093.getLayoutDirection() != 1) {
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
                int iM4495 = m4492();
                int iM4496 = m4494();
                int iM4497 = this.f8105 - m4493();
                int iM4498 = this.f8106 - m4491();
                Rect rect2 = this.f8093.f365;
                mo810(rect2, focusedChild);
                if (rect2.left - i4 < iM4497 && rect2.right - i4 > iM4495 && rect2.top - i5 < iM4498 && rect2.bottom - i5 > iM4496) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public final void m4501() {
        RecyclerView recyclerView = this.f8093;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ */
    public int mo128(int i, C2553 c2553, C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ */
    public void mo165(int i) {
        if (RecyclerView.f348) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ */
    public int mo129(int i, C2553 c2553, C2559 c2559) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ, reason: contains not printable characters */
    public final void m4502(RecyclerView recyclerView) {
        m4503(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
    public final void m4503(int i, int i2) {
        this.f8105 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f8103 = mode;
        if (mode == 0 && !RecyclerView.f351) {
            this.f8105 = 0;
        }
        this.f8106 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f8104 = mode2;
        if (mode2 != 0 || RecyclerView.f351) {
            return;
        }
        this.f8106 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ */
    public void mo130(Rect rect, int i, int i2) {
        int iM4493 = m4493() + m4492() + rect.width();
        int iM4491 = m4491() + m4494() + rect.height();
        RecyclerView recyclerView = this.f8093;
        Field field = AbstractC3638.f11333;
        this.f8093.setMeasuredDimension(m4474(i, iM4493, recyclerView.getMinimumWidth()), m4474(i2, iM4491, this.f8093.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ, reason: contains not printable characters */
    public final void m4504(int i, int i2) {
        int iM4489 = m4489();
        if (iM4489 == 0) {
            this.f8093.m211(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM4489; i7++) {
            View viewM4488 = m4488(i7);
            Rect rect = this.f8093.f365;
            mo810(rect, viewM4488);
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
        this.f8093.f365.set(i6, i4, i3, i5);
        mo130(this.f8093.f365, i, i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
    public final void m4505(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f8093 = null;
            this.f8092 = null;
            this.f8105 = 0;
            this.f8106 = 0;
        } else {
            this.f8093 = recyclerView;
            this.f8092 = recyclerView.f361;
            this.f8105 = recyclerView.getWidth();
            this.f8106 = recyclerView.getHeight();
        }
        this.f8103 = 1073741824;
        this.f8104 = 1073741824;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲈᲁ, reason: contains not printable characters */
    public final boolean m4506(View view, int i, int i2, C2547 c2547) {
        return (!view.isLayoutRequested() && this.f8099 && m4484(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c2547).width) && m4484(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c2547).height)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᤞᲈ */
    public boolean mo166() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᲈᤞ, reason: contains not printable characters */
    public final boolean m4507(View view, int i, int i2, C2547 c2547) {
        return (this.f8099 && m4484(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c2547).width) && m4484(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c2547).height)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ */
    public void mo167(RecyclerView recyclerView, C2559 c2559, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ, reason: contains not printable characters */
    public final void m4508(C1813 c1813) {
        C1813 c1814 = this.f8096;
        if (c1814 != null && c1813 != c1814 && c1814.f6012) {
            c1814.m3700();
        }
        this.f8096 = c1813;
        RecyclerView recyclerView = this.f8093;
        RunnableC2562 runnableC2562 = recyclerView.f408;
        runnableC2562.f8155.removeCallbacks(runnableC2562);
        runnableC2562.f8151.abortAnimation();
        if (c1813.f6015) {
            Log.w("RecyclerView", "An instance of " + c1813.getClass().getSimpleName() + " was started more than once. Each instance of" + c1813.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c1813.f6009 = recyclerView;
        c1813.f6010 = this;
        int i = c1813.f6008;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f411.f8135 = i;
        c1813.f6012 = true;
        c1813.f6011 = true;
        c1813.f6013 = recyclerView.f369.mo158(i);
        c1813.f6009.f408.m4529();
        c1813.f6015 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ */
    public boolean mo131() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ */
    public void mo121() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public void mo265(AbstractC2537 abstractC2537) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public void mo759(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ */
    public void mo126(C2559 c2559) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ */
    public void mo163(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ */
    public void mo266(int i) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo155(int i, C1447 c1447) {
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
    public void mo154(int i, int i2, C2559 c2559, C1447 c1447) {
    }
}
