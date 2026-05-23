package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0128 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f1085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f1086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f1087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final View f1088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public RunnableC1402 f1089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public RunnableC1402 f1090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f1091;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f1092;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int[] f1093;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1094;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f1095;

    public ViewOnTouchListenerC0128(View view) {
        this.f1093 = new int[2];
        this.f1088 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1085 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1086 = tapTimeout;
        this.f1087 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C0136 c0136;
        boolean z2;
        AbstractC1947 abstractC1947M1133;
        AbstractC1111 abstractC1111;
        boolean z3 = this.f1091;
        View view2 = this.f1088;
        if (z3) {
            AbstractC1947 abstractC1947M1134 = m1133();
            if (abstractC1947M1134 == null || !abstractC1947M1134.mo1967() || (abstractC1111 = (AbstractC1111) abstractC1947M1134.mo1969()) == null || !abstractC1111.isShown()) {
                switch (this.f1094) {
                    case 1:
                        c0136 = ((C0133) this.f1095).f1102;
                        if (c0136.f1124 != null) {
                            c0136.m1141();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        break;
                    default:
                        abstractC1947M1133 = m1133();
                        if (abstractC1947M1133 != null && abstractC1947M1133.mo1967()) {
                            abstractC1947M1133.dismiss();
                        }
                        z2 = true;
                        break;
                }
                if (z2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1093;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC1111.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM2685 = abstractC1111.m2685(motionEventObtainNoHistory, this.f1092);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM2685 && z4) {
                    z = true;
                } else {
                    switch (this.f1094) {
                        case 1:
                            c0136 = ((C0133) this.f1095).f1102;
                            if (c0136.f1124 != null) {
                                c0136.m1141();
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            break;
                        default:
                            abstractC1947M1133 = m1133();
                            if (abstractC1947M1133 != null) {
                                abstractC1947M1133.dismiss();
                            }
                            z2 = true;
                            break;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f1092 = motionEvent.getPointerId(0);
                    if (this.f1089 == null) {
                        this.f1089 = new RunnableC1402(this, 0);
                    }
                    view2.postDelayed(this.f1089, this.f1086);
                    if (this.f1090 == null) {
                        this.f1090 = new RunnableC1402(this, 1);
                    }
                    view2.postDelayed(this.f1090, this.f1087);
                } else if (actionMasked2 == 1) {
                    m1132();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1092);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f1085;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m1132();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = m1134();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m1132();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1091 = z;
        return z || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1091 = false;
        this.f1092 = -1;
        RunnableC1402 runnableC1402 = this.f1089;
        if (runnableC1402 != null) {
            this.f1088.removeCallbacks(runnableC1402);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1132() {
        RunnableC1402 runnableC1402 = this.f1090;
        View view = this.f1088;
        if (runnableC1402 != null) {
            view.removeCallbacks(runnableC1402);
        }
        RunnableC1402 runnableC1403 = this.f1089;
        if (runnableC1403 != null) {
            view.removeCallbacks(runnableC1403);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC1947 m1133() {
        C0130 c0130;
        switch (this.f1094) {
            case 0:
                AbstractC0129 abstractC0129 = ((ActionMenuItemView) this.f1095).f6;
                if (abstractC0129 == null || (c0130 = ((C0131) abstractC0129).f1098.f1123) == null) {
                    return null;
                }
                return c0130.m3780();
            default:
                C0130 c0131 = ((C0133) this.f1095).f1102.f1122;
                if (c0131 == null) {
                    return null;
                }
                return c0131.m3780();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m1134() {
        AbstractC1947 abstractC1947M1133;
        switch (this.f1094) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1095;
                InterfaceC1943 interfaceC1943 = actionMenuItemView.f4;
                return interfaceC1943 != null && interfaceC1943.mo6(actionMenuItemView.f1) && (abstractC1947M1133 = m1133()) != null && abstractC1947M1133.mo1967();
            default:
                ((C0133) this.f1095).f1102.m1146();
                return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0128(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f1094 = 0;
        this.f1095 = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0128(C0133 c0133, C0133 c0134) {
        this(c0134);
        this.f1094 = 1;
        this.f1095 = c0133;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
