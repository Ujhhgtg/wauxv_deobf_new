package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0136 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f1153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f1154;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f1155;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final View f1156;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public RunnableC1410 f1157;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public RunnableC1410 f1158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f1159;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f1160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int[] f1161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ View f1163;

    public ViewOnTouchListenerC0136(View view) {
        this.f1161 = new int[2];
        this.f1156 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1153 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1154 = tapTimeout;
        this.f1155 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
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
        C0144 c0144;
        boolean z2;
        AbstractC1978 abstractC1978M1279;
        AbstractC1117 abstractC1117;
        boolean z3 = this.f1159;
        View view2 = this.f1156;
        if (z3) {
            AbstractC1978 abstractC1978M12710 = m1279();
            if (abstractC1978M12710 == null || !abstractC1978M12710.mo2064() || (abstractC1117 = (AbstractC1117) abstractC1978M12710.mo2066()) == null || !abstractC1117.isShown()) {
                switch (this.f1162) {
                    case 1:
                        c0144 = ((C0141) this.f1163).f1170;
                        if (c0144.f1192 != null) {
                            c0144.m1287();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        break;
                    default:
                        abstractC1978M1279 = m1279();
                        if (abstractC1978M1279 != null && abstractC1978M1279.mo2064()) {
                            abstractC1978M1279.dismiss();
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
                int[] iArr = this.f1161;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC1117.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM2834 = abstractC1117.m2834(motionEventObtainNoHistory, this.f1160);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM2834 && z4) {
                    z = true;
                } else {
                    switch (this.f1162) {
                        case 1:
                            c0144 = ((C0141) this.f1163).f1170;
                            if (c0144.f1192 != null) {
                                c0144.m1287();
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            break;
                        default:
                            abstractC1978M1279 = m1279();
                            if (abstractC1978M1279 != null) {
                                abstractC1978M1279.dismiss();
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
                    this.f1160 = motionEvent.getPointerId(0);
                    if (this.f1157 == null) {
                        this.f1157 = new RunnableC1410(this, 0);
                    }
                    view2.postDelayed(this.f1157, this.f1154);
                    if (this.f1158 == null) {
                        this.f1158 = new RunnableC1410(this, 1);
                    }
                    view2.postDelayed(this.f1158, this.f1155);
                } else if (actionMasked2 == 1) {
                    m1278();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1160);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f1153;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m1278();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = m1280();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m1278();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1159 = z;
        return z || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1159 = false;
        this.f1160 = -1;
        RunnableC1410 runnableC1410 = this.f1157;
        if (runnableC1410 != null) {
            this.f1156.removeCallbacks(runnableC1410);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1278() {
        RunnableC1410 runnableC1410 = this.f1158;
        View view = this.f1156;
        if (runnableC1410 != null) {
            view.removeCallbacks(runnableC1410);
        }
        RunnableC1410 runnableC1411 = this.f1157;
        if (runnableC1411 != null) {
            view.removeCallbacks(runnableC1411);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC1978 m1279() {
        C0138 c0138;
        switch (this.f1162) {
            case 0:
                AbstractC0137 abstractC0137 = ((ActionMenuItemView) this.f1163).f6;
                if (abstractC0137 == null || (c0138 = ((C0139) abstractC0137).f1166.f1191) == null) {
                    return null;
                }
                return c0138.m3974();
            default:
                C0138 c0139 = ((C0141) this.f1163).f1170.f1190;
                if (c0139 == null) {
                    return null;
                }
                return c0139.m3974();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m1280() {
        AbstractC1978 abstractC1978M1279;
        switch (this.f1162) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1163;
                InterfaceC1974 interfaceC1974 = actionMenuItemView.f4;
                return interfaceC1974 != null && interfaceC1974.mo6(actionMenuItemView.f1) && (abstractC1978M1279 = m1279()) != null && abstractC1978M1279.mo2064();
            default:
                ((C0141) this.f1163).f1170.m1292();
                return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0136(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f1162 = 0;
        this.f1163 = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0136(C0141 c0141, C0141 c0142) {
        this(c0142);
        this.f1162 = 1;
        this.f1163 = c0141;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
