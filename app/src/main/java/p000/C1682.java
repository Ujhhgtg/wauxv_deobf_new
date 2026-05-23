package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1682 extends AbstractC2488 {

    public float f5688;

    public float f5689;

    public float f5690;

    public float f5691;

    public float f5692;

    public float f5693;

    public float f5694;

    public float f5695;

    public final C0662 f5697;

    public int f5699;

    public int f5701;

    public RecyclerView f5702;

    public VelocityTracker f5704;

    public ArrayList f5705;

    public ArrayList f5706;

    public GestureDetector f5708;

    public C1681 f5709;

    public Rect f5711;

    public long f5712;

    public final ArrayList f5685 = new ArrayList();

    public final float[] f5686 = new float[2];

    public AbstractC2508 f5687 = null;

    public int f5696 = -1;

    public int f5698 = 0;

    public final ArrayList f5700 = new ArrayList();

    public final RunnableC0141 f5703 = new RunnableC0141(10, this);

    public View f5707 = null;

    public final C1678 f5710 = new C1678(this);

    public C1682(C0662 c0662) {
        this.f5697 = c0662;
    }

    public static boolean m3409(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // p000.AbstractC2488
    public final void mo3410(Rect rect, View view) {
        rect.setEmpty();
    }

    @Override // p000.AbstractC2488
    public final void mo3411(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.f5687 != null) {
            float[] fArr = this.f5686;
            m3417(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC2508 abstractC2508 = this.f5687;
        this.f5697.getClass();
        ArrayList arrayList = this.f5700;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1679 c1679 = (C1679) arrayList.get(i);
            AbstractC2508 abstractC2509 = c1679.f5670;
            float f3 = c1679.f5666;
            float f4 = c1679.f5668;
            if (f3 == f4) {
                c1679.f5674 = abstractC2509.f8006.getTranslationX();
            } else {
                c1679.f5674 = ((f4 - f3) * c1679.f5678) + f3;
            }
            float f5 = c1679.f5667;
            float f6 = c1679.f5669;
            if (f5 == f6) {
                c1679.f5675 = abstractC2509.f8006.getTranslationY();
            } else {
                c1679.f5675 = ((f6 - f5) * c1679.f5678) + f5;
            }
            int iSave = canvas.save();
            C0662.m2047(recyclerView, c1679.f5670, c1679.f5674, c1679.f5675, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC2508 != null) {
            int iSave2 = canvas.save();
            C0662.m2047(recyclerView, abstractC2508, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // p000.AbstractC2488
    public final void mo1959(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.f5687 != null) {
            float[] fArr = this.f5686;
            m3417(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC2508 abstractC2508 = this.f5687;
        this.f5697.getClass();
        ArrayList arrayList = this.f5700;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1679 c1679 = (C1679) arrayList.get(i);
            int iSave = canvas.save();
            View view = c1679.f5670.f8006;
            canvas.restoreToCount(iSave);
        }
        if (abstractC2508 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C1679 c16710 = (C1679) arrayList.get(i2);
            boolean z2 = c16710.f5677;
            if (z2 && !c16710.f5673) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int m3412(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f5692 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f5704;
        C0662 c0662 = this.f5697;
        if (velocityTracker != null && this.f5696 > -1) {
            float f = this.f5691;
            c0662.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5704.getXVelocity(this.f5696);
            float yVelocity = this.f5704.getYVelocity(this.f5696);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f5690 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f5702.getWidth();
        c0662.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f5692) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void m3413(int i, int i2, MotionEvent motionEvent) {
        int iM2044;
        View viewM3416;
        if (this.f5687 == null && i == 2 && this.f5698 != 2) {
            this.f5697.getClass();
            if (this.f5702.getScrollState() == 1) {
                return;
            }
            AbstractC2491 layoutManager = this.f5702.getLayoutManager();
            int i3 = this.f5696;
            AbstractC2508 abstractC2508M232 = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.f5688;
                float y = motionEvent.getY(iFindPointerIndex) - this.f5689;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.f5701;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.mo152()) && ((fAbs2 <= fAbs || !layoutManager.mo153()) && (viewM3416 = m3416(motionEvent)) != null))) {
                    abstractC2508M232 = this.f5702.m232(viewM3416);
                }
            }
            if (abstractC2508M232 == null || (iM2044 = (C0662.m2044(786444, this.f5702.getLayoutDirection()) & 65280) >> 8) == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.f5688;
            float f3 = y2 - this.f5689;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.f5701;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iM2044 & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iM2044 & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iM2044 & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iM2044 & 2) == 0) {
                        return;
                    }
                }
                this.f5693 = 0.0f;
                this.f5692 = 0.0f;
                this.f5696 = motionEvent.getPointerId(0);
                m3420(abstractC2508M232, 1);
            }
        }
    }

    public final int m3414(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f5693 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f5704;
        C0662 c0662 = this.f5697;
        if (velocityTracker != null && this.f5696 > -1) {
            float f = this.f5691;
            c0662.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5704.getXVelocity(this.f5696);
            float yVelocity = this.f5704.getYVelocity(this.f5696);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f5690 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f5702.getHeight();
        c0662.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f5693) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void m3415(AbstractC2508 abstractC2508, boolean z) {
        ArrayList arrayList = this.f5700;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1679 c1679 = (C1679) arrayList.get(size);
            if (c1679.f5670 == abstractC2508) {
                c1679.f5676 |= z;
                if (!c1679.f5677) {
                    c1679.f5672.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m3416(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC2508 abstractC2508 = this.f5687;
        if (abstractC2508 != null) {
            View view = abstractC2508.f8006;
            if (m3409(view, x, y, this.f5694 + this.f5692, this.f5695 + this.f5693)) {
                return view;
            }
        }
        ArrayList arrayList = this.f5700;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1679 c1679 = (C1679) arrayList.get(size);
            View view2 = c1679.f5670.f8006;
            if (m3409(view2, x, y, c1679.f5674, c1679.f5675)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f5702;
        for (int iM1994 = recyclerView.f361.m1994() - 1; iM1994 >= 0; iM1994--) {
            View viewM1993 = recyclerView.f361.m1993(iM1994);
            float translationX = viewM1993.getTranslationX();
            float translationY = viewM1993.getTranslationY();
            if (x >= viewM1993.getLeft() + translationX && x <= viewM1993.getRight() + translationX && y >= viewM1993.getTop() + translationY && y <= viewM1993.getBottom() + translationY) {
                return viewM1993;
            }
        }
        return null;
    }

    public final void m3417(float[] fArr) {
        if ((this.f5699 & 12) != 0) {
            fArr[0] = (this.f5694 + this.f5692) - this.f5687.f8006.getLeft();
        } else {
            fArr[0] = this.f5687.f8006.getTranslationX();
        }
        if ((this.f5699 & 3) != 0) {
            fArr[1] = (this.f5695 + this.f5693) - this.f5687.f8006.getTop();
        } else {
            fArr[1] = this.f5687.f8006.getTranslationY();
        }
    }

    public final void m3418(AbstractC2508 abstractC2508) {
        AbstractC0982 abstractC0982;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        if (!this.f5702.isLayoutRequested() && this.f5698 == 2) {
            C0662 c0662 = this.f5697;
            c0662.getClass();
            int i2 = (int) (this.f5694 + this.f5692);
            int i3 = (int) (this.f5695 + this.f5693);
            View view = abstractC2508.f8006;
            if (Math.abs(i3 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i2 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList = this.f5705;
                if (arrayList == null) {
                    this.f5705 = new ArrayList();
                    this.f5706 = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f5706.clear();
                }
                int iRound = Math.round(this.f5694 + this.f5692);
                int iRound2 = Math.round(this.f5695 + this.f5693);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC2491 layoutManager = this.f5702.getLayoutManager();
                int iM4467 = layoutManager.m4467();
                int i6 = 0;
                while (i6 < iM4467) {
                    View viewM4466 = layoutManager.m4466(i6);
                    if (viewM4466 == view) {
                        i = i6;
                    } else {
                        i = i6;
                        if (viewM4466.getBottom() >= iRound2 && viewM4466.getTop() <= height && viewM4466.getRight() >= iRound && viewM4466.getLeft() <= width) {
                            AbstractC2508 abstractC2508M232 = this.f5702.m232(viewM4466);
                            int iAbs5 = Math.abs(i4 - ((viewM4466.getRight() + viewM4466.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((viewM4466.getBottom() + viewM4466.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f5705.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f5706.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f5705.add(i9, abstractC2508M232);
                            this.f5706.add(i9, Integer.valueOf(i7));
                        }
                        i6 = i + 1;
                        i2 = i2;
                        i3 = i3;
                    }
                    i6 = i + 1;
                    i2 = i2;
                    i3 = i3;
                }
                int i11 = i2;
                int i12 = i3;
                ArrayList arrayList2 = this.f5705;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i11;
                int height2 = view.getHeight() + i12;
                int left2 = i11 - view.getLeft();
                int top2 = i12 - view.getTop();
                int size2 = arrayList2.size();
                AbstractC2508 abstractC2509 = null;
                int i13 = -1;
                for (int i14 = 0; i14 < size2; i14++) {
                    AbstractC2508 abstractC25010 = (AbstractC2508) arrayList2.get(i14);
                    if (left2 > 0 && (right = abstractC25010.f8006.getRight() - width2) < 0 && abstractC25010.f8006.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                        i13 = iAbs4;
                        abstractC2509 = abstractC25010;
                    }
                    if (left2 < 0 && (left = abstractC25010.f8006.getLeft() - i11) > 0 && abstractC25010.f8006.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                        i13 = iAbs3;
                        abstractC2509 = abstractC25010;
                    }
                    if (top2 < 0 && (top = abstractC25010.f8006.getTop() - i12) > 0 && abstractC25010.f8006.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                        i13 = iAbs2;
                        abstractC2509 = abstractC25010;
                    }
                    if (top2 > 0 && (bottom = abstractC25010.f8006.getBottom() - height2) < 0 && abstractC25010.f8006.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                        i13 = iAbs;
                        abstractC2509 = abstractC25010;
                    }
                }
                if (abstractC2509 == null) {
                    this.f5705.clear();
                    this.f5706.clear();
                    return;
                }
                View view2 = abstractC2509.f8006;
                int iM4510 = abstractC2509.m4510();
                abstractC2508.m4510();
                String[] strArr = AbstractC1574.f5469;
                List list = (List) c0662.f2530;
                int iM4511 = abstractC2508.m4511();
                int iM4512 = abstractC2509.m4511();
                if (iM4511 == -1 || iM4512 == -1 || iM4511 == iM4512) {
                    return;
                }
                list.add(iM4512, list.remove(iM4511));
                ((C0658) c0662.f2531).f7926.m4444(iM4511, iM4512);
                if (list.isEmpty()) {
                    abstractC0982 = C0661.f2525;
                    break;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC2207.m4087(((C0655) it.next()).f2516, "群工具")) {
                            abstractC0982 = C0660.f2524;
                            break;
                        }
                    } else {
                        abstractC0982 = C0661.f2525;
                        break;
                    }
                }
                abstractC0982.m2548(AbstractC0744.m2196((List) c0662.f2530, ",", null, null, new C0645(14), 30));
                RecyclerView recyclerView = this.f5702;
                AbstractC2491 layoutManager2 = recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    if (layoutManager2.mo152()) {
                        if (AbstractC2491.m4455(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.m253(iM4510);
                        }
                        if (AbstractC2491.m4458(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.m253(iM4510);
                        }
                    }
                    if (layoutManager2.mo153()) {
                        if (AbstractC2491.m4459(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.m253(iM4510);
                        }
                        if (AbstractC2491.m4454(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.m253(iM4510);
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
                int iM4460 = AbstractC2491.m4460(view);
                int iM4461 = AbstractC2491.m4460(view2);
                byte b = iM4460 < iM4461 ? (byte) 1 : (byte) -1;
                if (linearLayoutManager.f337) {
                    if (b == 1) {
                        linearLayoutManager.mo190(iM4461, linearLayoutManager.f334.mo2742() - (linearLayoutManager.f334.mo2738(view) + linearLayoutManager.f334.mo2740(view2)));
                        return;
                    } else {
                        linearLayoutManager.mo190(iM4461, linearLayoutManager.f334.mo2742() - linearLayoutManager.f334.mo2737(view2));
                        return;
                    }
                }
                if (b == -1) {
                    linearLayoutManager.mo190(iM4461, linearLayoutManager.f334.mo2740(view2));
                } else {
                    linearLayoutManager.mo190(iM4461, linearLayoutManager.f334.mo2737(view2) - linearLayoutManager.f334.mo2738(view));
                }
            }
        }
    }

    public final void m3419(View view) {
        if (view == this.f5707) {
            this.f5707 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
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
    /* JADX WARN: Type inference failed for: r2v1, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᲇᛸᤝᲈ] */
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
    public final void m3420(AbstractC2508 abstractC2508, int i) {
        C0662 c0662;
        ?? r12;
        boolean z;
        Vibrator defaultVibrator;
        ?? r13;
        ?? r14;
        int iM2045;
        char c;
        float fSignum;
        char c2;
        long j;
        if (abstractC2508 == this.f5687 && i == this.f5698) {
            return;
        }
        this.f5712 = -9223372036854775808L;
        int i2 = this.f5698;
        m3415(abstractC2508, true);
        this.f5698 = i;
        if (i == 2) {
            if (abstractC2508 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f5707 = abstractC2508.f8006;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f5687;
        C0662 c0663 = this.f5697;
        if (r2 != 0) {
            View view = r2.f8006;
            if (view.getParent() != null) {
                if (i2 == 2 || this.f5698 == 2) {
                    iM2045 = 0;
                } else {
                    c0663.getClass();
                    int iM2044 = (C0662.m2044(786444, this.f5702.getLayoutDirection()) & 65280) >> 8;
                    if (iM2044 == 0) {
                        iM2045 = 0;
                    } else if (Math.abs(this.f5692) > Math.abs(this.f5693)) {
                        int iM3412 = m3412(iM2044);
                        if (iM3412 > 0) {
                            iM2045 = C0662.m2045(iM3412, this.f5702.getLayoutDirection());
                        } else {
                            iM2045 = m3414(iM2044);
                            if (iM2045 <= 0) {
                                iM2045 = 0;
                            }
                        }
                    } else {
                        int iM3414 = m3414(iM2044);
                        if (iM3414 > 0) {
                            iM2045 = iM3414;
                        } else {
                            int iM3413 = m3412(iM2044);
                            if (iM3413 > 0) {
                                iM2045 = C0662.m2045(iM3413, this.f5702.getLayoutDirection());
                            } else {
                                iM2045 = 0;
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f5704;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f5704 = null;
                }
                float fSignum2 = 0.0f;
                if (iM2045 == 1 || iM2045 == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f5693) * this.f5702.getHeight();
                    c2 = 4;
                } else if (iM2045 == 4 || iM2045 == 8 || iM2045 == 16 || iM2045 == 32) {
                    c = 0;
                    fSignum2 = Math.signum(this.f5692) * this.f5702.getWidth();
                    c2 = 4;
                    fSignum = 0.0f;
                } else {
                    c2 = 4;
                    fSignum = 0.0f;
                    c = 0;
                }
                if (i2 == 2) {
                    c2 = '\b';
                } else if (iM2045 > 0) {
                    c2 = 2;
                }
                float[] fArr = this.f5686;
                m3417(fArr);
                c0662 = c0663;
                char c3 = c2;
                ?? r15 = 0;
                C1679 c1679 = new C1679(this, r2, i2, fArr[0], fArr[1], fSignum2, fSignum, iM2045, r2);
                RecyclerView recyclerView = this.f5702;
                c0662.getClass();
                AbstractC2487 itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c3 == '\b' ? 200L : 250L;
                } else {
                    j = c3 == '\b' ? itemAnimator.f7933 : itemAnimator.f7932;
                }
                ValueAnimator valueAnimator = c1679.f5672;
                valueAnimator.setDuration(j);
                this.f5700.add(c1679);
                r2.m4524(r15);
                valueAnimator.start();
                z = true;
                r14 = r15;
            } else {
                c0662 = c0663;
                r14 = 0;
                m3419(view);
                c0662.getClass();
                C0662.m2043(r2);
                z = false;
            }
            this.f5687 = null;
            r12 = r14;
        } else {
            c0662 = c0663;
            r12 = 0;
            z = false;
        }
        if (abstractC2508 != null) {
            View view2 = abstractC2508.f8006;
            RecyclerView recyclerView2 = this.f5702;
            c0662.getClass();
            this.f5699 = (C0662.m2044(786444, recyclerView2.getLayoutDirection()) & i3) >> (this.f5698 * 8);
            this.f5694 = view2.getLeft();
            this.f5695 = view2.getTop();
            this.f5687 = abstractC2508;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f5702.getParent();
        if (parent != 0) {
            if (this.f5687 != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.f5702.getLayoutManager().f7946 = true;
        }
        if (this.f5698 != 0) {
            Context context = ((RecyclerView) c0662.f2532).getContext();
            String[] strArr = AbstractC1574.f5469;
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = context.getSystemService("vibrator_manager");
                defaultVibrator = AbstractC0451.m1658(systemService).getDefaultVibrator();
            } else {
                Object systemService2 = context.getSystemService("vibrator");
                defaultVibrator = (Vibrator) systemService2;
            }
            defaultVibrator.vibrate(VibrationEffect.createOneShot(40L, -1));
        } else {
            c0662.getClass();
        }
        this.f5702.invalidate();
    }

    public final void m3421(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f5688;
        this.f5692 = f;
        this.f5693 = y - this.f5689;
        if ((i & 4) == 0) {
            this.f5692 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f5692 = Math.min(0.0f, this.f5692);
        }
        if ((i & 1) == 0) {
            this.f5693 = Math.max(0.0f, this.f5693);
        }
        if ((i & 2) == 0) {
            this.f5693 = Math.min(0.0f, this.f5693);
        }
    }
}
