package p000;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲁᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1700 extends AbstractC2543 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f5731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f5732;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f5733;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float f5734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f5735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f5736;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f5737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f5738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final AbstractC1698 f5740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f5742;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f5744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public RecyclerView f5745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public VelocityTracker f5747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public ArrayList f5748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public ArrayList f5749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public GestureDetector f5751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C1699 f5752;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public Rect f5754;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public long f5755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f5728 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float[] f5729 = new float[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public AbstractC2563 f5730 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f5739 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f5741 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final ArrayList f5743 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final RunnableC0149 f5746 = new RunnableC0149(this, 10);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public View f5750 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final C1695 f5753 = new C1695(this);

    public C1700(AbstractC1698 abstractC1698) {
        this.f5740 = abstractC1698;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static boolean m3576(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // p000.AbstractC2543
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo3577(Rect rect, View view) {
        rect.setEmpty();
    }

    @Override // p000.AbstractC2543
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo3578(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.f5730 != null) {
            float[] fArr = this.f5729;
            m3585(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC2563 abstractC2563 = this.f5730;
        this.f5740.getClass();
        ArrayList arrayList = this.f5743;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1696 c1696 = (C1696) arrayList.get(i);
            AbstractC2563 abstractC2564 = c1696.f5710;
            float f3 = c1696.f5706;
            float f4 = c1696.f5708;
            if (f3 == f4) {
                c1696.f5714 = abstractC2564.f8157.getTranslationX();
            } else {
                c1696.f5714 = ((f4 - f3) * c1696.f5718) + f3;
            }
            float f5 = c1696.f5707;
            float f6 = c1696.f5709;
            if (f5 == f6) {
                c1696.f5715 = abstractC2564.f8157.getTranslationY();
            } else {
                c1696.f5715 = ((f6 - f5) * c1696.f5718) + f5;
            }
            int iSave = canvas.save();
            AbstractC1698.m3574(recyclerView, c1696.f5710, c1696.f5714, c1696.f5715, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC2563 != null) {
            int iSave2 = canvas.save();
            AbstractC1698.m3574(recyclerView, abstractC2563, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // p000.AbstractC2543
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2055(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.f5730 != null) {
            float[] fArr = this.f5729;
            m3585(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC2563 abstractC2563 = this.f5730;
        this.f5740.getClass();
        ArrayList arrayList = this.f5743;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1696 c1696 = (C1696) arrayList.get(i);
            int iSave = canvas.save();
            View view = c1696.f5710.f8157;
            canvas.restoreToCount(iSave);
        }
        if (abstractC2563 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C1696 c1697 = (C1696) arrayList.get(i2);
            boolean z2 = c1697.f5717;
            if (z2 && !c1697.f5713) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3579(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5745;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C1695 c1695 = this.f5753;
        if (recyclerView2 != null) {
            recyclerView2.m249(this);
            RecyclerView recyclerView3 = this.f5745;
            recyclerView3.f372.remove(c1695);
            if (recyclerView3.f373 == c1695) {
                recyclerView3.f373 = null;
            }
            ArrayList arrayList = this.f5745.f384;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f5743;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1696 c1696 = (C1696) arrayList2.get(0);
                c1696.f5712.cancel();
                this.f5740.mo2128(this.f5745, c1696.f5710);
            }
            arrayList2.clear();
            this.f5750 = null;
            VelocityTracker velocityTracker = this.f5747;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5747 = null;
            }
            C1699 c1699 = this.f5752;
            if (c1699 != null) {
                c1699.f5726 = false;
                this.f5752 = null;
            }
            if (this.f5751 != null) {
                this.f5751 = null;
            }
        }
        this.f5745 = recyclerView;
        Resources resources = recyclerView.getResources();
        this.f5733 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.f5734 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.f5744 = ViewConfiguration.get(this.f5745.getContext()).getScaledTouchSlop();
        this.f5745.m206(this);
        this.f5745.f372.add(c1695);
        RecyclerView recyclerView4 = this.f5745;
        if (recyclerView4.f384 == null) {
            recyclerView4.f384 = new ArrayList();
        }
        recyclerView4.f384.add(this);
        this.f5752 = new C1699(this);
        this.f5751 = new GestureDetector(this.f5745.getContext(), this.f5752);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m3580(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f5735 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f5747;
        AbstractC1698 abstractC1698 = this.f5740;
        if (velocityTracker != null && this.f5739 > -1) {
            float f = this.f5734;
            abstractC1698.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5747.getXVelocity(this.f5739);
            float yVelocity = this.f5747.getYVelocity(this.f5739);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f5733 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f5745.getWidth();
        abstractC1698.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f5735) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3581(int i, int i2, MotionEvent motionEvent) {
        View viewM3584;
        if (this.f5730 == null && i == 2 && this.f5741 != 2) {
            AbstractC1698 abstractC1698 = this.f5740;
            abstractC1698.getClass();
            if (this.f5745.getScrollState() == 1) {
                return;
            }
            AbstractC2546 layoutManager = this.f5745.getLayoutManager();
            int i3 = this.f5739;
            AbstractC2563 abstractC2563M232 = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.f5731;
                float y = motionEvent.getY(iFindPointerIndex) - this.f5732;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.f5744;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.mo152()) && ((fAbs2 <= fAbs || !layoutManager.mo153()) && (viewM3584 = m3584(motionEvent)) != null))) {
                    abstractC2563M232 = this.f5745.m232(viewM3584);
                }
            }
            if (abstractC2563M232 == null) {
                return;
            }
            int iM3571 = (AbstractC1698.m3571(abstractC1698.mo2129(), this.f5745.getLayoutDirection()) & 65280) >> 8;
            if (iM3571 == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.f5731;
            float f3 = y2 - this.f5732;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.f5744;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iM3571 & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iM3571 & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iM3571 & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iM3571 & 2) == 0) {
                        return;
                    }
                }
                this.f5736 = 0.0f;
                this.f5735 = 0.0f;
                this.f5739 = motionEvent.getPointerId(0);
                m3588(abstractC2563M232, 1);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m3582(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f5736 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f5747;
        AbstractC1698 abstractC1698 = this.f5740;
        if (velocityTracker != null && this.f5739 > -1) {
            float f = this.f5734;
            abstractC1698.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5747.getXVelocity(this.f5739);
            float yVelocity = this.f5747.getYVelocity(this.f5739);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f5733 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f5745.getHeight();
        abstractC1698.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f5736) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3583(AbstractC2563 abstractC2563, boolean z) {
        ArrayList arrayList = this.f5743;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1696 c1696 = (C1696) arrayList.get(size);
            if (c1696.f5710 == abstractC2563) {
                c1696.f5716 |= z;
                if (!c1696.f5717) {
                    c1696.f5712.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final View m3584(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC2563 abstractC2563 = this.f5730;
        if (abstractC2563 != null) {
            View view = abstractC2563.f8157;
            if (m3576(view, x, y, this.f5737 + this.f5735, this.f5738 + this.f5736)) {
                return view;
            }
        }
        ArrayList arrayList = this.f5743;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1696 c1696 = (C1696) arrayList.get(size);
            View view2 = c1696.f5710.f8157;
            if (m3576(view2, x, y, c1696.f5714, c1696.f5715)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f5745;
        for (int iM2091 = recyclerView.f361.m2091() - 1; iM2091 >= 0; iM2091--) {
            View viewM2090 = recyclerView.f361.m2090(iM2091);
            float translationX = viewM2090.getTranslationX();
            float translationY = viewM2090.getTranslationY();
            if (x >= viewM2090.getLeft() + translationX && x <= viewM2090.getRight() + translationX && y >= viewM2090.getTop() + translationY && y <= viewM2090.getBottom() + translationY) {
                return viewM2090;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3585(float[] fArr) {
        if ((this.f5742 & 12) != 0) {
            fArr[0] = (this.f5737 + this.f5735) - this.f5730.f8157.getLeft();
        } else {
            fArr[0] = this.f5730.f8157.getTranslationX();
        }
        if ((this.f5742 & 3) != 0) {
            fArr[1] = (this.f5738 + this.f5736) - this.f5730.f8157.getTop();
        } else {
            fArr[1] = this.f5730.f8157.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3586(AbstractC2563 abstractC2563) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        if (!this.f5745.isLayoutRequested() && this.f5741 == 2) {
            AbstractC1698 abstractC1698 = this.f5740;
            abstractC1698.getClass();
            int i2 = (int) (this.f5737 + this.f5735);
            int i3 = (int) (this.f5738 + this.f5736);
            View view = abstractC2563.f8157;
            if (Math.abs(i3 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i2 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f5748;
                if (arrayList2 == null) {
                    this.f5748 = new ArrayList();
                    this.f5749 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f5749.clear();
                }
                int iRound = Math.round(this.f5737 + this.f5735);
                int iRound2 = Math.round(this.f5738 + this.f5736);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC2546 layoutManager = this.f5745.getLayoutManager();
                int iM4489 = layoutManager.m4489();
                int i6 = 0;
                while (i6 < iM4489) {
                    View viewM4488 = layoutManager.m4488(i6);
                    if (viewM4488 == view) {
                        i = i6;
                    } else {
                        i = i6;
                        if (viewM4488.getBottom() >= iRound2 && viewM4488.getTop() <= height && viewM4488.getRight() >= iRound && viewM4488.getLeft() <= width) {
                            AbstractC2563 abstractC2563M232 = this.f5745.m232(viewM4488);
                            int iAbs5 = Math.abs(i4 - ((viewM4488.getRight() + viewM4488.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((viewM4488.getBottom() + viewM4488.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f5748.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f5749.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f5748.add(i9, abstractC2563M232);
                            this.f5749.add(i9, Integer.valueOf(i7));
                        }
                        i6 = i + 1;
                        i2 = i2;
                        i3 = i3;
                        iRound = iRound;
                    }
                    i6 = i + 1;
                    i2 = i2;
                    i3 = i3;
                    iRound = iRound;
                }
                int i11 = i2;
                int i12 = i3;
                ArrayList arrayList3 = this.f5748;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i11;
                int height2 = view.getHeight() + i12;
                int left2 = i11 - view.getLeft();
                int top2 = i12 - view.getTop();
                int size2 = arrayList3.size();
                AbstractC2563 abstractC2564 = null;
                int i13 = -1;
                int i14 = 0;
                while (i14 < size2) {
                    AbstractC2563 abstractC2565 = (AbstractC2563) arrayList3.get(i14);
                    if (left2 <= 0 || (right = abstractC2565.f8157.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (abstractC2565.f8157.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                            i13 = iAbs4;
                            abstractC2564 = abstractC2565;
                        }
                    }
                    if (left2 < 0 && (left = abstractC2565.f8157.getLeft() - i11) > 0 && abstractC2565.f8157.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                        i13 = iAbs3;
                        abstractC2564 = abstractC2565;
                    }
                    if (top2 < 0 && (top = abstractC2565.f8157.getTop() - i12) > 0 && abstractC2565.f8157.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                        i13 = iAbs2;
                        abstractC2564 = abstractC2565;
                    }
                    if (top2 > 0 && (bottom = abstractC2565.f8157.getBottom() - height2) < 0 && abstractC2565.f8157.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                        i13 = iAbs;
                        abstractC2564 = abstractC2565;
                    }
                    i14++;
                    arrayList3 = arrayList;
                }
                if (abstractC2564 == null) {
                    this.f5748.clear();
                    this.f5749.clear();
                    return;
                }
                View view2 = abstractC2564.f8157;
                int iM4532 = abstractC2564.m4532();
                abstractC2563.m4532();
                if (abstractC1698.mo2130(abstractC2563, abstractC2564)) {
                    RecyclerView recyclerView = this.f5745;
                    AbstractC2546 layoutManager2 = recyclerView.getLayoutManager();
                    if (!(layoutManager2 instanceof LinearLayoutManager)) {
                        if (layoutManager2.mo152()) {
                            if (AbstractC2546.m4477(view2) <= recyclerView.getPaddingLeft()) {
                                recyclerView.m253(iM4532);
                            }
                            if (AbstractC2546.m4480(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.m253(iM4532);
                            }
                        }
                        if (layoutManager2.mo153()) {
                            if (AbstractC2546.m4481(view2) <= recyclerView.getPaddingTop()) {
                                recyclerView.m253(iM4532);
                            }
                            if (AbstractC2546.m4476(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.m253(iM4532);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                    linearLayoutManager.mo151("Cannot drop a view during a scroll or layout calculation");
                    linearLayoutManager.m173();
                    linearLayoutManager.m188();
                    int iM4482 = AbstractC2546.m4482(view);
                    int iM4483 = AbstractC2546.m4482(view2);
                    byte b = iM4482 < iM4483 ? (byte) 1 : (byte) -1;
                    if (linearLayoutManager.f337) {
                        if (b == 1) {
                            linearLayoutManager.mo190(iM4483, linearLayoutManager.f334.mo2886() - (linearLayoutManager.f334.mo2882(view) + linearLayoutManager.f334.mo2884(view2)));
                            return;
                        } else {
                            linearLayoutManager.mo190(iM4483, linearLayoutManager.f334.mo2886() - linearLayoutManager.f334.mo2881(view2));
                            return;
                        }
                    }
                    if (b == -1) {
                        linearLayoutManager.mo190(iM4483, linearLayoutManager.f334.mo2884(view2));
                    } else {
                        linearLayoutManager.mo190(iM4483, linearLayoutManager.f334.mo2881(view2) - linearLayoutManager.f334.mo2882(view));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3587(View view) {
        if (view == this.f5750) {
            this.f5750 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲁᛸᤝᲇ] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲁᛸᲀᲈ] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲁᛸᲀᲈ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m3588(AbstractC2563 abstractC2563, int i) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        ?? r4;
        int iM3582;
        char c;
        float fSignum;
        Object obj;
        long j;
        if (abstractC2563 == this.f5730 && i == this.f5741) {
            return;
        }
        this.f5755 = Long.MIN_VALUE;
        int i2 = this.f5741;
        m3583(abstractC2563, true);
        this.f5741 = i;
        if (i == 2) {
            if (abstractC2563 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f5750 = abstractC2563.f8157;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f5730;
        AbstractC1698 abstractC1698 = this.f5740;
        if (r2 != 0) {
            View view = r2.f8157;
            if (view.getParent() != null) {
                if (i2 == 2 || this.f5741 == 2) {
                    iM3582 = 0;
                } else {
                    int iMo2129 = abstractC1698.mo2129();
                    int iM3571 = (AbstractC1698.m3571(iMo2129, this.f5745.getLayoutDirection()) & 65280) >> 8;
                    if (iM3571 == 0) {
                        iM3582 = 0;
                    } else {
                        int i4 = (iMo2129 & 65280) >> 8;
                        if (Math.abs(this.f5735) > Math.abs(this.f5736)) {
                            iM3582 = m3580(iM3571);
                            if (iM3582 <= 0) {
                                iM3582 = m3582(iM3571);
                                if (iM3582 <= 0) {
                                    iM3582 = 0;
                                }
                            } else if ((i4 & iM3582) == 0) {
                                iM3582 = AbstractC1698.m3572(iM3582, this.f5745.getLayoutDirection());
                            }
                        } else {
                            iM3582 = m3582(iM3571);
                            if (iM3582 <= 0) {
                                iM3582 = m3580(iM3571);
                                if (iM3582 <= 0) {
                                    iM3582 = 0;
                                } else if ((i4 & iM3582) == 0) {
                                    iM3582 = AbstractC1698.m3572(iM3582, this.f5745.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f5747;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f5747 = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iM3582 == 1 || iM3582 == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f5736) * this.f5745.getHeight();
                    obj = null;
                } else if (iM3582 == 4 || iM3582 == 8 || iM3582 == 16 || iM3582 == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f5735) * this.f5745.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (i2 == 2) {
                    c2 = '\b';
                } else if (iM3582 > 0) {
                    c2 = 2;
                }
                float[] fArr = this.f5729;
                m3585(fArr);
                char c3 = c2;
                ?? r15 = c;
                C1696 c1696 = new C1696(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iM3582, r2);
                RecyclerView recyclerView = this.f5745;
                abstractC1698.getClass();
                AbstractC2542 itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c3 == '\b' ? 200L : 250L;
                } else {
                    j = c3 == '\b' ? itemAnimator.f8084 : itemAnimator.f8083;
                }
                ValueAnimator valueAnimator = c1696.f5712;
                valueAnimator.setDuration(j);
                this.f5743.add(c1696);
                r2.m4546(r15);
                valueAnimator.start();
                r4 = abstractC1698;
                z = true;
                r14 = r15;
            } else {
                r14 = 0;
                m3587(view);
                ?? r5 = abstractC1698;
                r5.mo2128(this.f5745, r2);
                z = false;
                r4 = r5;
            }
            this.f5730 = null;
            r3 = r4;
            r12 = r14;
        } else {
            r3 = abstractC1698;
            r12 = 0;
            z = false;
        }
        if (abstractC2563 != null) {
            View view2 = abstractC2563.f8157;
            this.f5742 = (AbstractC1698.m3571(r3.mo2129(), this.f5745.getLayoutDirection()) & i3) >> (this.f5741 * 8);
            this.f5737 = view2.getLeft();
            this.f5738 = view2.getTop();
            this.f5730 = abstractC2563;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f5745.getParent();
        if (parent != 0) {
            if (this.f5730 != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.f5745.getLayoutManager().f8097 = true;
        }
        r3.mo2131(this.f5741);
        this.f5745.invalidate();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m3589(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f5731;
        this.f5735 = f;
        this.f5736 = y - this.f5732;
        if ((i & 4) == 0) {
            this.f5735 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f5735 = Math.min(0.0f, this.f5735);
        }
        if ((i & 1) == 0) {
            this.f5736 = Math.max(0.0f, this.f5736);
        }
        if ((i & 2) == 0) {
            this.f5736 = Math.min(0.0f, this.f5736);
        }
    }
}
