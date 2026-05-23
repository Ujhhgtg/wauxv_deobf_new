package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.umeng.analytics.pro.bc;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲀᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1258 extends C0078 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final Rect f4577 = new Rect(2147483647, 2147483647, -2147483648, -2147483648);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C1227 f4578 = new C1227(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1227 f4579 = new C1227(2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AccessibilityManager f4584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final View f4585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1257 f4586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Rect f4580 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Rect f4581 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Rect f4582 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int[] f4583 = new int[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4587 = -2147483648;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f4588 = -2147483648;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f4589 = -2147483648;

    public AbstractC1258(View view) {
        this.f4585 = view;
        this.f4584 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        Field field = AbstractC3578.f11184;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p000.C0078
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C0094 mo963(View view) {
        if (this.f4586 == null) {
            this.f4586 = new C1257(this);
        }
        return this.f4586;
    }

    @Override // p000.C0078
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo722(View view, C0092 c0092) {
        this.f1024.onInitializeAccessibilityNodeInfo(view, c0092.f1045);
        mo2079(c0092);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m2940(int i) {
        if (this.f4588 != i) {
            return false;
        }
        this.f4588 = -2147483648;
        mo2080(i, false);
        m2948(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AccessibilityEvent m2941(int i, int i2) {
        View view = this.f4585;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        C0092 c0092M2946 = m2946(i);
        accessibilityEventObtain2.getText().add(c0092M2946.m1093());
        AccessibilityNodeInfo accessibilityNodeInfo = c0092M2946.f1045;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C0092 m2942(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0092 c0092 = new C0092(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c0092.m1095("android.view.View");
        Rect rect = f4577;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.f4585;
        accessibilityNodeInfoObtain.setParent(view);
        mo1546(i, c0092);
        if (c0092.m1093() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f4581;
        c0092.m1092(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        c0092.f1046 = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f4587 == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0092.m1088(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0092.m1088(64);
        }
        boolean z = this.f4588 == i;
        if (z) {
            c0092.m1088(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0092.m1088(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f4583;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f4580;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0092.m1092(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f4582;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return c0092;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m2943(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f4584;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo1543 = mo1543(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f4589;
            if (i2 != iMo1543) {
                this.f4589 = iMo1543;
                m2948(iMo1543, 128);
                m2948(i2, 256);
            }
            if (iMo1543 == -2147483648) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.f4589) == -2147483648) {
                return false;
            }
            if (true) {
                this.f4589 = -2147483648;
                m2948(-2147483648, 128);
                m2948(i, 256);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public abstract int mo1543(float f, float f2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public abstract void mo1544(ArrayList arrayList);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m2944(int i) {
        View view;
        ViewParent parent;
        if (i == -2147483648 || !this.f4584.isEnabled() || (parent = (view = this.f4585).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM2941 = m2941(i, 2048);
        accessibilityEventM2941.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventM2941);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a4  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean m2945(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        C0092 c0092;
        int i4;
        int i5;
        int i6;
        Rect rect2;
        int i7;
        Rect rect3;
        int i8;
        C0092 c0093;
        int i9;
        int iM5003;
        int iM5004;
        ArrayList arrayList = new ArrayList();
        mo1544(arrayList);
        C2794 c2794 = new C2794();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c2794.m4778(((Integer) arrayList.get(i10)).intValue(), m2942(((Integer) arrayList.get(i10)).intValue()));
        }
        int i11 = this.f4588;
        C0092 c0094 = i11 == -2147483648 ? null : (C0092) c2794.m4777(i11);
        C1227 c1227 = f4578;
        C1227 c1228 = f4579;
        View view = this.f4585;
        if (i == 1 || i == 2) {
            i2 = -1;
            i3 = 0;
            Field field = AbstractC3578.f11184;
            boolean z = view.getLayoutDirection() == 1;
            
            int i12 = c2794.f8920;
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList2.add((C0092) c2794.f8919[i13]);
            }
            Collections.sort(arrayList2, new C1368(z, c1227));
            if (i == 1) {
                int size = arrayList2.size();
                if (c0094 != null) {
                    size = arrayList2.indexOf(c0094);
                }
                int i14 = size - 1;
                if (i14 >= 0) {
                    obj = arrayList2.get(i14);
                } else {
                    obj = null;
                }
            } else {
                if (false) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0094 == null ? -1 : arrayList2.lastIndexOf(c0094)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            c0092 = (C0092) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i15 = this.f4588;
            if (i15 != -2147483648) {
                m2946(i15).m1092(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i == 17) {
                        i6 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i == 33) {
                        i6 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i == 66) {
                        i6 = -1;
                        rect4.set(-1, 0, -1, height);
                    } else {
                        if (false) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i6 = -1;
                        rect4.set(0, -1, width, -1);
                    }
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    i3 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (true) {
                    i3 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i != 66) {
                    i3 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i3 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                
                i7 = c2794.f8920;
                rect3 = new Rect();
                c0092 = null;
                for (i8 = 0; i8 < i7; i8++) {
                    c0093 = (C0092) c2794.f8919[i8];
                    if (c0093 == c0094) {
                        
                        c0093.m1092(rect3);
                        if (AbstractC3453.m5000(i, rect4, rect3)) {
                            if (AbstractC3453.m5000(i, rect4, rect2) || AbstractC3453.m4984(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                c0092 = c0093;
                            } else if (AbstractC3453.m4984(i, rect4, rect2, rect3)) {
                                int iM5005 = AbstractC3453.m5003(i, rect4, rect3);
                                int iM5006 = AbstractC3453.m5004(i, rect4, rect3);
                                i9 = (iM5006 * iM5006) + (iM5005 * 13 * iM5005);
                                iM5003 = AbstractC3453.m5003(i, rect4, rect2);
                                iM5004 = AbstractC3453.m5004(i, rect4, rect2);
                                if (i9 < (iM5004 * iM5004) + (iM5003 * 13 * iM5003)) {
                                    rect2.set(rect3);
                                    c0092 = c0093;
                                }
                            }
                        }
                    }
                }
                i2 = i6;
            }
            i6 = -1;
            rect2 = new Rect(rect4);
            if (i != 17) {
                i3 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (true) {
                i3 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i != 66) {
                i3 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i3 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            
            i7 = c2794.f8920;
            rect3 = new Rect();
            c0092 = null;
            while (i8 < i7) {
                c0093 = (C0092) c2794.f8919[i8];
                if (c0093 == c0094) {
                    
                    c0093.m1092(rect3);
                    if (AbstractC3453.m5000(i, rect4, rect3)) {
                        if (AbstractC3453.m5000(i, rect4, rect2)) {
                            rect2.set(rect3);
                            c0092 = c0093;
                        } else if (AbstractC3453.m4984(i, rect4, rect2, rect3)) {
                            int iM5007 = AbstractC3453.m5003(i, rect4, rect3);
                            int iM5008 = AbstractC3453.m5004(i, rect4, rect3);
                            i9 = (iM5008 * iM5008) + (iM5007 * 13 * iM5007);
                            iM5003 = AbstractC3453.m5003(i, rect4, rect2);
                            iM5004 = AbstractC3453.m5004(i, rect4, rect2);
                            if (i9 < (iM5004 * iM5004) + (iM5003 * 13 * iM5003)) {
                                rect2.set(rect3);
                                c0092 = c0093;
                            }
                        }
                    }
                }
            }
            i2 = -1;
        }
        C0092 c0095 = c0092;
        if (c0095 == null) {
            i5 = -2147483648;
        } else {
            int i16 = c2794.f8920;
            int i17 = 0;
            while (true) {
                if (i17 >= i16) {
                    i4 = -1;
                    break;
                }
                if (c2794.f8919[i17] == c0095) {
                    i4 = i17;
                    break;
                }
                i17++;
            }
            i5 = c2794.f8918[i4];
        }
        return m2947(i5);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C0092 m2946(int i) {
        if (i != -1) {
            return m2942(i);
        }
        View view = this.f4585;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C0092 c0092 = new C0092(accessibilityNodeInfoObtain);
        Field field = AbstractC3578.f11184;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo1544(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0092.f1045.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0092;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public abstract boolean mo1545(int i, int i2, Bundle bundle);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public abstract void mo1546(int i, C0092 c0092);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean m2947(int i) {
        int i2;
        View view = this.f4585;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f4588) == i) {
            return false;
        }
        if (i2 != -2147483648) {
            m2940(i2);
        }
        if (i == -2147483648) {
            return false;
        }
        this.f4588 = i;
        mo2080(i, true);
        m2948(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m2948(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == -2147483648 || !this.f4584.isEnabled() || (parent = (view = this.f4585).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, m2941(i, i2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public void mo2079(C0092 c0092) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public void mo2080(int i, boolean z) {
    }
}
