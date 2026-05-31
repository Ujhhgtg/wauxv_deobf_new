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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲀᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1260 extends C0086 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final Rect f4576 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C1224 f4577 = new C1224(2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1224 f4578 = new C1224(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AccessibilityManager f4583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final View f4584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1259 f4585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Rect f4579 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Rect f4580 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Rect f4581 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int[] f4582 = new int[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4586 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f4587 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f4588 = Integer.MIN_VALUE;

    public AbstractC1260(View view) {
        this.f4584 = view;
        this.f4583 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        Field field = AbstractC3638.f11333;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C0102 mo1108(View view) {
        if (this.f4585 == null) {
            this.f4585 = new C1259(this);
        }
        return this.f4585;
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo866(View view, C0100 c0100) {
        this.f1092.onInitializeAccessibilityNodeInfo(view, c0100.f1113);
        mo2174(c0100);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m3059(int i) {
        if (this.f4587 != i) {
            return false;
        }
        this.f4587 = Integer.MIN_VALUE;
        mo2175(i, false);
        m3067(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AccessibilityEvent m3060(int i, int i2) {
        View view = this.f4584;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        C0100 c0100M3065 = m3065(i);
        accessibilityEventObtain2.getText().add(c0100M3065.m1239());
        AccessibilityNodeInfo accessibilityNodeInfo = c0100M3065.f1113;
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
    public final C0100 m3061(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0100 c0100 = new C0100(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c0100.m1241("android.view.View");
        Rect rect = f4576;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.f4584;
        accessibilityNodeInfoObtain.setParent(view);
        mo1652(i, c0100);
        if (c0100.m1239() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f4580;
        c0100.m1238(rect2);
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
        c0100.f1114 = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f4586 == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0100.m1234(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0100.m1234(64);
        }
        boolean z = this.f4587 == i;
        if (z) {
            c0100.m1234(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0100.m1234(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f4582;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f4579;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0100.m1238(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f4581;
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
        return c0100;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m3062(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f4583;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo1649 = mo1649(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f4588;
            if (i2 != iMo1649) {
                this.f4588 = iMo1649;
                m3067(iMo1649, 128);
                m3067(i2, bc.e);
            }
            if (iMo1649 == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.f4588) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.f4588 = Integer.MIN_VALUE;
                m3067(Integer.MIN_VALUE, 128);
                m3067(i, bc.e);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public abstract int mo1649(float f, float f2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public abstract void mo1650(ArrayList arrayList);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3063(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f4583.isEnabled() || (parent = (view = this.f4584).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM3060 = m3060(i, 2048);
        accessibilityEventM3060.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventM3060);
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
    public final boolean m3064(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        C0100 c0100;
        int i4;
        int i5;
        int i6;
        Rect rect2;
        int i7;
        Rect rect3;
        int i8;
        C0100 c0101;
        int i9;
        int iM3400;
        int iM3401;
        ArrayList arrayList = new ArrayList();
        mo1650(arrayList);
        C2854 c2854 = new C2854();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c2854.m4811(((Integer) arrayList.get(i10)).intValue(), m3061(((Integer) arrayList.get(i10)).intValue()));
        }
        int i11 = this.f4587;
        C0100 c0102 = i11 == Integer.MIN_VALUE ? null : (C0100) c2854.m4810(i11);
        C1224 c1224 = f4577;
        C1224 c1225 = f4578;
        View view = this.f4584;
        if (i == 1 || i == 2) {
            i2 = -1;
            i3 = 0;
            Field field = AbstractC3638.f11333;
            boolean z = view.getLayoutDirection() == 1;
            c1225.getClass();
            int i12 = c2854.f9082;
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList2.add((C0100) c2854.f9081[i13]);
            }
            Collections.sort(arrayList2, new C1376(z, c1224));
            if (i == 1) {
                int size = arrayList2.size();
                if (c0102 != null) {
                    size = arrayList2.indexOf(c0102);
                }
                int i14 = size - 1;
                if (i14 >= 0) {
                    obj = arrayList2.get(i14);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0102 == null ? -1 : arrayList2.lastIndexOf(c0102)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            c0100 = (C0100) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i15 = this.f4587;
            if (i15 != Integer.MIN_VALUE) {
                m3065(i15).m1238(rect4);
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
                        if (i != 130) {
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
                } else if (i != 33) {
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
                c1225.getClass();
                i7 = c2854.f9082;
                rect3 = new Rect();
                c0100 = null;
                for (i8 = i3; i8 < i7; i8++) {
                    c0101 = (C0100) c2854.f9081[i8];
                    if (c0101 == c0102) {
                        c1224.getClass();
                        c0101.m1238(rect3);
                        if (AbstractC1471.m3397(i, rect4, rect3)) {
                            if (AbstractC1471.m3397(i, rect4, rect2) || AbstractC1471.m3375(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                c0100 = c0101;
                            } else if (AbstractC1471.m3375(i, rect4, rect2, rect3)) {
                                int iM3402 = AbstractC1471.m3400(i, rect4, rect3);
                                int iM3403 = AbstractC1471.m3401(i, rect4, rect3);
                                i9 = (iM3403 * iM3403) + (iM3402 * 13 * iM3402);
                                iM3400 = AbstractC1471.m3400(i, rect4, rect2);
                                iM3401 = AbstractC1471.m3401(i, rect4, rect2);
                                if (i9 < (iM3401 * iM3401) + (iM3400 * 13 * iM3400)) {
                                    rect2.set(rect3);
                                    c0100 = c0101;
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
            } else if (i != 33) {
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
            c1225.getClass();
            i7 = c2854.f9082;
            rect3 = new Rect();
            c0100 = null;
            while (i8 < i7) {
                c0101 = (C0100) c2854.f9081[i8];
                if (c0101 == c0102) {
                    c1224.getClass();
                    c0101.m1238(rect3);
                    if (AbstractC1471.m3397(i, rect4, rect3)) {
                        if (AbstractC1471.m3397(i, rect4, rect2)) {
                            rect2.set(rect3);
                            c0100 = c0101;
                        } else if (AbstractC1471.m3375(i, rect4, rect2, rect3)) {
                            int iM3404 = AbstractC1471.m3400(i, rect4, rect3);
                            int iM3405 = AbstractC1471.m3401(i, rect4, rect3);
                            i9 = (iM3405 * iM3405) + (iM3404 * 13 * iM3404);
                            iM3400 = AbstractC1471.m3400(i, rect4, rect2);
                            iM3401 = AbstractC1471.m3401(i, rect4, rect2);
                            if (i9 < (iM3401 * iM3401) + (iM3400 * 13 * iM3400)) {
                                rect2.set(rect3);
                                c0100 = c0101;
                            }
                        }
                    }
                }
            }
            i2 = i6;
        }
        C0100 c0103 = c0100;
        if (c0103 == null) {
            i5 = Integer.MIN_VALUE;
        } else {
            int i16 = c2854.f9082;
            int i17 = i3;
            while (true) {
                if (i17 >= i16) {
                    i4 = i2;
                    break;
                }
                if (c2854.f9081[i17] == c0103) {
                    i4 = i17;
                    break;
                }
                i17++;
            }
            i5 = c2854.f9080[i4];
        }
        return m3066(i5);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C0100 m3065(int i) {
        if (i != -1) {
            return m3061(i);
        }
        View view = this.f4584;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C0100 c0100 = new C0100(accessibilityNodeInfoObtain);
        Field field = AbstractC3638.f11333;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo1650(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0100.f1113.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0100;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public abstract boolean mo1651(int i, int i2, Bundle bundle);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public abstract void mo1652(int i, C0100 c0100);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean m3066(int i) {
        int i2;
        View view = this.f4584;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f4587) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m3059(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f4587 = i;
        mo2175(i, true);
        m3067(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m3067(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f4583.isEnabled() || (parent = (view = this.f4584).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, m3060(i, i2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public void mo2174(C0100 c0100) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public void mo2175(int i, boolean z) {
    }
}
