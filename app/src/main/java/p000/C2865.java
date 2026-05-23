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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᤝᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2865 extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f9173;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f9174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f9175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final PointF f9176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final PointF f9177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f9178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f9179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public InterfaceC2864 f9180;

    public C2865(Context context) {
        super(context, null, 0);
        this.f9176 = new PointF();
        this.f9177 = new PointF();
        this.f9173 = ViewConfiguration.get(context).getScaledTouchSlop();
        setClickable(true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x0120  */
    /* JADX WARN: Code duplicated, block: B:41:0x0143  */
    /* JADX WARN: Code duplicated, block: B:43:0x018b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0194  */
    /* JADX WARN: Code duplicated, block: B:45:0x019c  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC2864 interfaceC2864;
        C2103 c2103;
        Object obj;
        C1299 c1299M3490;
        Object origin;
        C1982 c1982;
        Vibrator defaultVibrator;
        String[] strArr = AbstractC1574.f5469;
        int action = motionEvent.getAction();
        PointF pointF = this.f9177;
        if (action != 0) {
            if (action == 1) {
                if (Math.abs(getScrollX()) > this.f9175) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt.addUpdateListener(new C1115(4, this));
                    valueAnimatorOfInt.setDuration(100L);
                    valueAnimatorOfInt.start();
                    interfaceC2864 = this.f9180;
                    if (interfaceC2864 != null) {
                        c2103 = (C2103) interfaceC2864;
                        int i = 0;
                        obj = c2103.f6936;
                        c1299M3490 = AbstractC0968.startMethodResolution_(obj).m3490();
                        c1299M3490.name = "checkBox";
                        if (((View) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).getVisibility() == 0) {
                            C1299 c1299M3491 = AbstractC0968.startMethodResolution_(obj).m3490();
                            c1299M3491.name = "maskView";
                            ((View) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024()).performClick();
                        } else {
                            C2873 c2873 = new C2873(new C0637(1, c2103.f6938));
                            C0607 c0607 = C0607.f2431;
                            FrameLayout frameLayout = (FrameLayout) c2873.getValue();
                            origin = ((MsgInfoBean) c2103.f6937).getOrigin();
                            
                            MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(frameLayout).m3492();
                            c1973M3492.returnType = AbstractC2519.classToKClass(Boolean.TYPE);
                            c1973M3492.f4482 = new C0605(0);
                            c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
                            if (c1982.f6566.getParameterCount() == 2) {
                                c1982.m3831(origin, null);
                            } else {
                                c1982.m3831(origin);
                            }
                        }
                    }
                } else {
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt2.addUpdateListener(new C1115(4, this));
                    valueAnimatorOfInt2.setDuration(100L);
                    valueAnimatorOfInt2.start();
                }
                this.f9178 = false;
                this.f9179 = false;
            } else if (action == 2) {
                float rawX = pointF.x - motionEvent.getRawX();
                if (Math.abs(rawX) > 10.0f || Math.abs(getScrollX()) > 10) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    scrollBy((int) rawX, 0);
                    if (getScrollX() < 0) {
                        scrollTo(0, 0);
                    }
                    int scrollX = getScrollX();
                    int i2 = this.f9174;
                    if (scrollX > i2) {
                        scrollTo(i2, 0);
                    }
                    if (Math.abs(getScrollX()) <= this.f9175) {
                        this.f9179 = false;
                    } else if (!this.f9179) {
                        InterfaceC2864 interfaceC2865 = this.f9180;
                        if (interfaceC2865 != null) {
                            Context context = ((C2865) ((C2103) interfaceC2865).f6935).getContext();
                            if (Build.VERSION.SDK_INT >= 31) {
                                Object systemService = context.getSystemService("vibrator_manager");
                                defaultVibrator = AbstractC0451.m1658(systemService).getDefaultVibrator();
                            } else {
                                Object systemService2 = context.getSystemService("vibrator");
                                defaultVibrator = (Vibrator) systemService2;
                            }
                            defaultVibrator.vibrate(VibrationEffect.createOneShot(40L, -1));
                        }
                        this.f9179 = true;
                    }
                }
                pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
            } else if (action == 3) {
                if (Math.abs(getScrollX()) > this.f9175) {
                    ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt3.addUpdateListener(new C1115(4, this));
                    valueAnimatorOfInt3.setDuration(100L);
                    valueAnimatorOfInt3.start();
                    interfaceC2864 = this.f9180;
                    if (interfaceC2864 != null) {
                        c2103 = (C2103) interfaceC2864;
                        int i3 = 0;
                        obj = c2103.f6936;
                        c1299M3490 = AbstractC0968.startMethodResolution_(obj).m3490();
                        c1299M3490.name = "checkBox";
                        if (((View) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).getVisibility() == 0) {
                            C1299 c1299M3492 = AbstractC0968.startMethodResolution_(obj).m3490();
                            c1299M3492.name = "maskView";
                            ((View) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024()).performClick();
                        } else {
                            C2873 c2874 = new C2873(new C0637(1, c2103.f6938));
                            C0607 c0608 = C0607.f2431;
                            FrameLayout frameLayout2 = (FrameLayout) c2874.getValue();
                            origin = ((MsgInfoBean) c2103.f6937).getOrigin();
                            
                            MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(frameLayout2).m3492();
                            c1973M3493.returnType = AbstractC2519.classToKClass(Boolean.TYPE);
                            c1973M3493.f4482 = new C0605(0);
                            c1982 = (C1982) AbstractC0744.firstInList(c1973M3493.resolve());
                            if (c1982.f6566.getParameterCount() == 2) {
                                c1982.m3831(origin, null);
                            } else {
                                c1982.m3831(origin);
                            }
                        }
                    }
                } else {
                    ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt4.addUpdateListener(new C1115(4, this));
                    valueAnimatorOfInt4.setDuration(100L);
                    valueAnimatorOfInt4.start();
                }
                this.f9178 = false;
                this.f9179 = false;
            }
        } else {
            if (this.f9178) {
                return false;
            }
            this.f9178 = true;
            this.f9176.set(motionEvent.getRawX(), motionEvent.getRawY());
            pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final InterfaceC2864 getSmoothListener() {
        return this.f9180;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || Math.abs(motionEvent.getRawX() - this.f9176.x) <= this.f9173) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        C1330 c1330 = new C1330(AbstractC2652.m4654(new C0271(3, this), new C2798(18)));
        while (c1330.hasNext()) {
            View view = (View) c1330.next();
            view.layout(paddingLeft, getPaddingTop(), view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + getPaddingTop());
            paddingLeft += view.getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String[] strArr = AbstractC1574.f5469;
        super.onMeasure(i, i2);
        int measuredWidth = 0;
        this.f9174 = 0;
        C1330 c1330 = new C1330(AbstractC2652.m4654(new C0271(3, this), new C2798(19)));
        int iMax = 0;
        boolean z = false;
        int i3 = 0;
        while (c1330.hasNext()) {
            Object next = c1330.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0745.m2213();
                throw null;
            }
            View view = (View) next;
            setClickable(true);
            measureChild(view, i, i2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iMax = Math.max(iMax, view.getMeasuredHeight());
            if (View.MeasureSpec.getMode(i2) != 1073741824 && marginLayoutParams.height == -1) {
                z = true;
            }
            if (i3 > 0) {
                this.f9174 = view.getMeasuredWidth() + this.f9174;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            i3 = i4;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + measuredWidth, getPaddingBottom() + getPaddingTop() + iMax);
        this.f9175 = (this.f9174 * 4) / 10;
        if (z) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            C1330 c1331 = new C1330(AbstractC2652.m4654(new C0271(3, this), new C2798(20)));
            while (c1331.hasNext()) {
                View view2 = (View) c1331.next();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
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

    public final void setSmoothListener(InterfaceC2864 interfaceC2864) {
        this.f9180 = interfaceC2864;
    }
}
