package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤞᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2925 extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f9343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f9344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f9345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final PointF f9346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final PointF f9347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f9348;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f9349;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public InterfaceC2924 f9350;

    public C2925(Context context) {
        super(context, null, 0);
        this.f9346 = new PointF();
        this.f9347 = new PointF();
        this.f9343 = ViewConfiguration.get(context).getScaledTouchSlop();
        setClickable(true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ff  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float fAbs;
        float f;
        InterfaceC2924 interfaceC2924;
        C2136 c2136;
        C1300 c1300M3558;
        Object origin;
        C2013 c2013;
        InterfaceC2924 interfaceC2925;
        Object obj;
        C1300 c1300M3559;
        Vibrator defaultVibrator;
        String[] strArr = AbstractC1471.f5234;
        int action = motionEvent.getAction();
        PointF pointF = this.f9346;
        PointF pointF2 = this.f9347;
        if (action != 0) {
            if (action == 1) {
                fAbs = Math.abs(motionEvent.getRawX() - pointF.x);
                f = this.f9343;
                if (fAbs <= f && Math.abs(motionEvent.getRawY() - pointF.y) <= f && Math.abs(getScrollX()) <= 10 && (interfaceC2925 = this.f9350) != null) {
                    int i = AbstractC1768.f5906;
                    obj = ((C2136) interfaceC2925).f7060;
                    c1300M3559 = AbstractC2727.m4713(obj).m3558();
                    c1300M3559.f6475 = "checkBox";
                    if (((View) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127()).getVisibility() == 0) {
                        C1300 c1300M35510 = AbstractC2727.m4713(obj).m3558();
                        c1300M35510.f6475 = "maskView";
                        ((View) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127()).performClick();
                        this.f9348 = false;
                        this.f9349 = false;
                        return true;
                    }
                }
                if (Math.abs(getScrollX()) > this.f9345) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt.addUpdateListener(new C1121(this, 4));
                    valueAnimatorOfInt.setDuration(100L);
                    valueAnimatorOfInt.start();
                    interfaceC2924 = this.f9350;
                    if (interfaceC2924 != null) {
                        c2136 = (C2136) interfaceC2924;
                        int i2 = AbstractC1768.f5906;
                        c1300M3558 = AbstractC2727.m4713(c2136.f7060).m3558();
                        c1300M3558.f6475 = "checkBox";
                        if (((View) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).getVisibility() != 0) {
                            C2933 c2933 = new C2933(new C0630(c2136.f7062, 1));
                            C0588 c0588 = C0588.f2397;
                            FrameLayout frameLayout = (FrameLayout) c2933.getValue();
                            origin = ((MsgInfoBean) c2136.f7061).getOrigin();
                            c0588.getClass();
                            C2004 c2004M3560 = AbstractC2727.m4713(frameLayout).m3560();
                            c2004M3560.f6648 = AbstractC2574.m4549(Boolean.TYPE);
                            c2004M3560.f4481 = new C0581(11);
                            c2013 = (C2013) AbstractC0739.m2290(c2004M3560.m3993());
                            if (c2013.f6671.getParameterCount() == 2) {
                                c2013.m4025(origin, null);
                            } else {
                                c2013.m4025(origin);
                            }
                        }
                    }
                } else {
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt2.addUpdateListener(new C1121(this, 4));
                    valueAnimatorOfInt2.setDuration(100L);
                    valueAnimatorOfInt2.start();
                }
                this.f9348 = false;
                this.f9349 = false;
            } else if (action == 2) {
                float rawX = pointF2.x - motionEvent.getRawX();
                if (Math.abs(rawX) > 10.0f || Math.abs(getScrollX()) > 10) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    scrollBy((int) rawX, 0);
                    if (getScrollX() < 0) {
                        scrollTo(0, 0);
                    }
                    int scrollX = getScrollX();
                    int i3 = this.f9344;
                    if (scrollX > i3) {
                        scrollTo(i3, 0);
                    }
                    if (Math.abs(getScrollX()) <= this.f9345) {
                        this.f9349 = false;
                    } else if (!this.f9349) {
                        InterfaceC2924 interfaceC2926 = this.f9350;
                        if (interfaceC2926 != null) {
                            Context context = ((C2925) ((C2136) interfaceC2926).f7059).getContext();
                            if (Build.VERSION.SDK_INT >= 31) {
                                Object systemService = context.getSystemService("vibrator_manager");
                                "null cannot be cast to non-null type android.os.VibratorManager";
                                defaultVibrator = AbstractC0426.m1764(systemService).getDefaultVibrator();
                            } else {
                                Object systemService2 = context.getSystemService("vibrator");
                                "null cannot be cast to non-null type android.os.Vibrator";
                                defaultVibrator = (Vibrator) systemService2;
                            }
                            defaultVibrator.vibrate(VibrationEffect.createOneShot(40L, -1));
                        }
                        this.f9349 = true;
                    }
                }
                pointF2.set(motionEvent.getRawX(), motionEvent.getRawY());
            } else if (action == 3) {
                fAbs = Math.abs(motionEvent.getRawX() - pointF.x);
                f = this.f9343;
                if (fAbs <= f) {
                    int i4 = AbstractC1768.f5906;
                    obj = ((C2136) interfaceC2925).f7060;
                    c1300M3559 = AbstractC2727.m4713(obj).m3558();
                    c1300M3559.f6475 = "checkBox";
                    if (((View) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127()).getVisibility() == 0) {
                        C1300 c1300M35511 = AbstractC2727.m4713(obj).m3558();
                        c1300M35511.f6475 = "maskView";
                        ((View) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127()).performClick();
                        this.f9348 = false;
                        this.f9349 = false;
                        return true;
                    }
                }
                if (Math.abs(getScrollX()) > this.f9345) {
                    ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt3.addUpdateListener(new C1121(this, 4));
                    valueAnimatorOfInt3.setDuration(100L);
                    valueAnimatorOfInt3.start();
                    interfaceC2924 = this.f9350;
                    if (interfaceC2924 != null) {
                        c2136 = (C2136) interfaceC2924;
                        int i5 = AbstractC1768.f5906;
                        c1300M3558 = AbstractC2727.m4713(c2136.f7060).m3558();
                        c1300M3558.f6475 = "checkBox";
                        if (((View) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).getVisibility() != 0) {
                            C2933 c2934 = new C2933(new C0630(c2136.f7062, 1));
                            C0588 c0589 = C0588.f2397;
                            FrameLayout frameLayout2 = (FrameLayout) c2934.getValue();
                            origin = ((MsgInfoBean) c2136.f7061).getOrigin();
                            c0589.getClass();
                            C2004 c2004M3561 = AbstractC2727.m4713(frameLayout2).m3560();
                            c2004M3561.f6648 = AbstractC2574.m4549(Boolean.TYPE);
                            c2004M3561.f4481 = new C0581(11);
                            c2013 = (C2013) AbstractC0739.m2290(c2004M3561.m3993());
                            if (c2013.f6671.getParameterCount() == 2) {
                                c2013.m4025(origin, null);
                            } else {
                                c2013.m4025(origin);
                            }
                        }
                    }
                } else {
                    ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt4.addUpdateListener(new C1121(this, 4));
                    valueAnimatorOfInt4.setDuration(100L);
                    valueAnimatorOfInt4.start();
                }
                this.f9348 = false;
                this.f9349 = false;
            }
        } else {
            if (this.f9348) {
                return false;
            }
            this.f9348 = true;
            pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
            pointF2.set(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final InterfaceC2924 getSmoothListener() {
        return this.f9350;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || Math.abs(motionEvent.getRawX() - this.f9346.x) <= this.f9343) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        C1332 c1332 = new C1332(AbstractC2713.m4688(new C0281(this, 3), new C2868(10)));
        while (c1332.hasNext()) {
            View view = (View) c1332.next();
            view.layout(paddingLeft, getPaddingTop(), view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + getPaddingTop());
            paddingLeft += view.getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String[] strArr = AbstractC1471.f5234;
        super.onMeasure(i, i2);
        int measuredWidth = 0;
        this.f9344 = 0;
        C1332 c1332 = new C1332(AbstractC2713.m4688(new C0281(this, 3), new C2868(11)));
        int iMax = 0;
        boolean z = false;
        int i3 = 0;
        while (c1332.hasNext()) {
            Object next = c1332.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            View view = (View) next;
            setClickable(true);
            measureChild(view, i, i2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iMax = Math.max(iMax, view.getMeasuredHeight());
            if (View.MeasureSpec.getMode(i2) != 1073741824 && marginLayoutParams.height == -1) {
                z = true;
            }
            if (i3 > 0) {
                this.f9344 = view.getMeasuredWidth() + this.f9344;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            i3 = i4;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + measuredWidth, getPaddingBottom() + getPaddingTop() + iMax);
        this.f9345 = (this.f9344 * 4) / 10;
        if (z) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            C1332 c1333 = new C1332(AbstractC2713.m4688(new C0281(this, 3), new C2868(12)));
            while (c1333.hasNext()) {
                View view2 = (View) c1333.next();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2.height == -1) {
                    int i5 = marginLayoutParams2.width;
                    marginLayoutParams2.width = view2.getMeasuredWidth();
                    measureChildWithMargins(view2, i, 0, iMakeMeasureSpec, 0);
                    marginLayoutParams2.width = i5;
                }
            }
        }
    }

    public final void setSmoothListener(InterfaceC2924 interfaceC2924) {
        this.f9350 = interfaceC2924;
    }
}
