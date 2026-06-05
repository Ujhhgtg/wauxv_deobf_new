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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3504feyxiexzfUjhhgtg extends C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final Rect f10905Ujhhgtgfeyxiexzf = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C3339feyxiexzfUjhhgtg f10906Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3339feyxiexzfUjhhgtg f10907Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final AccessibilityManager f10912Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final View f10913Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C3503feyxiexzfUjhhgtg f10914Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Rect f10908Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Rect f10909Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Rect f10910Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int[] f10911Ujhhgtgfeyxiexzf = new int[2];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f10915Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10916Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f10917Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;

    public AbstractC3504feyxiexzfUjhhgtg(View view) {
        this.f10913Ujhhgtgfeyxiexzf = view;
        this.f10912Ujhhgtgfeyxiexzf = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C2965Ujhhgtgfeyxiexzf mo2165Ujhhgtgfeyxiexzf(View view) {
        if (this.f10914Ujhhgtgfeyxiexzf == null) {
            this.f10914Ujhhgtgfeyxiexzf = new C3503feyxiexzfUjhhgtg(this);
        }
        return this.f10914Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityNodeInfo(view, c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf);
        mo4153Ujhhgtgfeyxiexzf(c2963feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m5017Ujhhgtgfeyxiexzf(int i) {
        if (this.f10916Ujhhgtgfeyxiexzf != i) {
            return false;
        }
        this.f10916Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
        mo4154Ujhhgtgfeyxiexzf(i, false);
        m5025Ujhhgtgfeyxiexzf(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final AccessibilityEvent m5018Ujhhgtgfeyxiexzf(int i, int i2) {
        View view = this.f10913Ujhhgtgfeyxiexzf;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtgM5023Ujhhgtgfeyxiexzf = m5023Ujhhgtgfeyxiexzf(i);
        accessibilityEventObtain2.getText().add(c2963feyxiexzfUjhhgtgM5023Ujhhgtgfeyxiexzf.m4437Ujhhgtgfeyxiexzf());
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtgM5023Ujhhgtgfeyxiexzf.f9272Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2963feyxiexzfUjhhgtg m5019Ujhhgtgfeyxiexzf(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg = new C2963feyxiexzfUjhhgtg(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c2963feyxiexzfUjhhgtg.m4439Ujhhgtgfeyxiexzf("android.view.View");
        Rect rect = f10905Ujhhgtgfeyxiexzf;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.f10913Ujhhgtgfeyxiexzf;
        accessibilityNodeInfoObtain.setParent(view);
        mo3731Ujhhgtgfeyxiexzf(i, c2963feyxiexzfUjhhgtg);
        if (c2963feyxiexzfUjhhgtg.m4437Ujhhgtgfeyxiexzf() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f10909Ujhhgtgfeyxiexzf;
        c2963feyxiexzfUjhhgtg.m4436Ujhhgtgfeyxiexzf(rect2);
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
        c2963feyxiexzfUjhhgtg.f9273Ujhhgtgfeyxiexzf = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f10915Ujhhgtgfeyxiexzf == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(64);
        }
        boolean z = this.f10916Ujhhgtgfeyxiexzf == i;
        if (z) {
            c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f10911Ujhhgtgfeyxiexzf;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f10908Ujhhgtgfeyxiexzf;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c2963feyxiexzfUjhhgtg.m4436Ujhhgtgfeyxiexzf(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f10910Ujhhgtgfeyxiexzf;
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
        return c2963feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final boolean m5020Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f10912Ujhhgtgfeyxiexzf;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo3728Ujhhgtgfeyxiexzf = mo3728Ujhhgtgfeyxiexzf(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f10917Ujhhgtgfeyxiexzf;
            if (i2 != iMo3728Ujhhgtgfeyxiexzf) {
                this.f10917Ujhhgtgfeyxiexzf = iMo3728Ujhhgtgfeyxiexzf;
                m5025Ujhhgtgfeyxiexzf(iMo3728Ujhhgtgfeyxiexzf, 128);
                m5025Ujhhgtgfeyxiexzf(i2, bc.e);
            }
            if (iMo3728Ujhhgtgfeyxiexzf == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.f10917Ujhhgtgfeyxiexzf) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.f10917Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
                m5025Ujhhgtgfeyxiexzf(Integer.MIN_VALUE, 128);
                m5025Ujhhgtgfeyxiexzf(i, bc.e);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public abstract int mo3728Ujhhgtgfeyxiexzf(float f, float f2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public abstract void mo3729Ujhhgtgfeyxiexzf(ArrayList arrayList);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5021Ujhhgtgfeyxiexzf(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f10912Ujhhgtgfeyxiexzf.isEnabled() || (parent = (view = this.f10913Ujhhgtgfeyxiexzf).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM5018Ujhhgtgfeyxiexzf = m5018Ujhhgtgfeyxiexzf(i, 2048);
        accessibilityEventM5018Ujhhgtgfeyxiexzf.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventM5018Ujhhgtgfeyxiexzf);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m5022Ujhhgtgfeyxiexzf(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg;
        int i4;
        int i5;
        int i6;
        Rect rect2;
        int i7;
        Rect rect3;
        int i8;
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg2;
        int i9;
        int iM5064Ujhhgtgfeyxiexzf;
        int iM5066Ujhhgtgfeyxiexzf;
        ArrayList arrayList = new ArrayList();
        mo3729Ujhhgtgfeyxiexzf(arrayList);
        C1138feyxiexzfUjhhgtg c1138feyxiexzfUjhhgtg = new C1138feyxiexzfUjhhgtg();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c1138feyxiexzfUjhhgtg.m2606Ujhhgtgfeyxiexzf(((Integer) arrayList.get(i10)).intValue(), m5019Ujhhgtgfeyxiexzf(((Integer) arrayList.get(i10)).intValue()));
        }
        int i11 = this.f10916Ujhhgtgfeyxiexzf;
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg3 = i11 == Integer.MIN_VALUE ? null : (C2963feyxiexzfUjhhgtg) c1138feyxiexzfUjhhgtg.m2605Ujhhgtgfeyxiexzf(i11);
        C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg = f10906Ujhhgtgfeyxiexzf;
        C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg2 = f10907Ujhhgtgfeyxiexzf;
        View view = this.f10913Ujhhgtgfeyxiexzf;
        if (i == 1 || i == 2) {
            i2 = -1;
            i3 = 0;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            boolean z = view.getLayoutDirection() == 1;
            c3339feyxiexzfUjhhgtg2.getClass();
            int i12 = c1138feyxiexzfUjhhgtg.f4305Ujhhgtgfeyxiexzf;
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList2.add((C2963feyxiexzfUjhhgtg) c1138feyxiexzfUjhhgtg.f4304Ujhhgtgfeyxiexzf[i13]);
            }
            Collections.sort(arrayList2, new C3620feyxiexzfUjhhgtg(z, c3339feyxiexzfUjhhgtg));
            if (i == 1) {
                int size = arrayList2.size();
                if (c2963feyxiexzfUjhhgtg3 != null) {
                    size = arrayList2.indexOf(c2963feyxiexzfUjhhgtg3);
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
                int iLastIndexOf = (c2963feyxiexzfUjhhgtg3 == null ? -1 : arrayList2.lastIndexOf(c2963feyxiexzfUjhhgtg3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            c2963feyxiexzfUjhhgtg = (C2963feyxiexzfUjhhgtg) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i15 = this.f10916Ujhhgtgfeyxiexzf;
            if (i15 != Integer.MIN_VALUE) {
                m5023Ujhhgtgfeyxiexzf(i15).m4436Ujhhgtgfeyxiexzf(rect4);
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
                c3339feyxiexzfUjhhgtg2.getClass();
                i7 = c1138feyxiexzfUjhhgtg.f4305Ujhhgtgfeyxiexzf;
                rect3 = new Rect();
                c2963feyxiexzfUjhhgtg = null;
                for (i8 = i3; i8 < i7; i8++) {
                    c2963feyxiexzfUjhhgtg2 = (C2963feyxiexzfUjhhgtg) c1138feyxiexzfUjhhgtg.f4304Ujhhgtgfeyxiexzf[i8];
                    if (c2963feyxiexzfUjhhgtg2 == c2963feyxiexzfUjhhgtg3) {
                        c3339feyxiexzfUjhhgtg.getClass();
                        c2963feyxiexzfUjhhgtg2.m4436Ujhhgtgfeyxiexzf(rect3);
                        if (AbstractC3516feyxiexzfUjhhgtg.m5063Ujhhgtgfeyxiexzf(i, rect4, rect3)) {
                            if (AbstractC3516feyxiexzfUjhhgtg.m5063Ujhhgtgfeyxiexzf(i, rect4, rect2) || AbstractC3516feyxiexzfUjhhgtg.m5049Ujhhgtgfeyxiexzf(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                c2963feyxiexzfUjhhgtg = c2963feyxiexzfUjhhgtg2;
                            } else if (AbstractC3516feyxiexzfUjhhgtg.m5049Ujhhgtgfeyxiexzf(i, rect4, rect2, rect3)) {
                                int iM5064Ujhhgtgfeyxiexzf2 = AbstractC3516feyxiexzfUjhhgtg.m5064Ujhhgtgfeyxiexzf(i, rect4, rect3);
                                int iM5066Ujhhgtgfeyxiexzf2 = AbstractC3516feyxiexzfUjhhgtg.m5066Ujhhgtgfeyxiexzf(i, rect4, rect3);
                                i9 = (iM5066Ujhhgtgfeyxiexzf2 * iM5066Ujhhgtgfeyxiexzf2) + (iM5064Ujhhgtgfeyxiexzf2 * 13 * iM5064Ujhhgtgfeyxiexzf2);
                                iM5064Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5064Ujhhgtgfeyxiexzf(i, rect4, rect2);
                                iM5066Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5066Ujhhgtgfeyxiexzf(i, rect4, rect2);
                                if (i9 < (iM5066Ujhhgtgfeyxiexzf * iM5066Ujhhgtgfeyxiexzf) + (iM5064Ujhhgtgfeyxiexzf * 13 * iM5064Ujhhgtgfeyxiexzf)) {
                                    rect2.set(rect3);
                                    c2963feyxiexzfUjhhgtg = c2963feyxiexzfUjhhgtg2;
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
            c3339feyxiexzfUjhhgtg2.getClass();
            i7 = c1138feyxiexzfUjhhgtg.f4305Ujhhgtgfeyxiexzf;
            rect3 = new Rect();
            c2963feyxiexzfUjhhgtg = null;
            while (i8 < i7) {
                c2963feyxiexzfUjhhgtg2 = (C2963feyxiexzfUjhhgtg) c1138feyxiexzfUjhhgtg.f4304Ujhhgtgfeyxiexzf[i8];
                if (c2963feyxiexzfUjhhgtg2 == c2963feyxiexzfUjhhgtg3) {
                    c3339feyxiexzfUjhhgtg.getClass();
                    c2963feyxiexzfUjhhgtg2.m4436Ujhhgtgfeyxiexzf(rect3);
                    if (AbstractC3516feyxiexzfUjhhgtg.m5063Ujhhgtgfeyxiexzf(i, rect4, rect3)) {
                        if (AbstractC3516feyxiexzfUjhhgtg.m5063Ujhhgtgfeyxiexzf(i, rect4, rect2)) {
                            rect2.set(rect3);
                            c2963feyxiexzfUjhhgtg = c2963feyxiexzfUjhhgtg2;
                        } else if (AbstractC3516feyxiexzfUjhhgtg.m5049Ujhhgtgfeyxiexzf(i, rect4, rect2, rect3)) {
                            int iM5064Ujhhgtgfeyxiexzf3 = AbstractC3516feyxiexzfUjhhgtg.m5064Ujhhgtgfeyxiexzf(i, rect4, rect3);
                            int iM5066Ujhhgtgfeyxiexzf3 = AbstractC3516feyxiexzfUjhhgtg.m5066Ujhhgtgfeyxiexzf(i, rect4, rect3);
                            i9 = (iM5066Ujhhgtgfeyxiexzf3 * iM5066Ujhhgtgfeyxiexzf3) + (iM5064Ujhhgtgfeyxiexzf3 * 13 * iM5064Ujhhgtgfeyxiexzf3);
                            iM5064Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5064Ujhhgtgfeyxiexzf(i, rect4, rect2);
                            iM5066Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5066Ujhhgtgfeyxiexzf(i, rect4, rect2);
                            if (i9 < (iM5066Ujhhgtgfeyxiexzf * iM5066Ujhhgtgfeyxiexzf) + (iM5064Ujhhgtgfeyxiexzf * 13 * iM5064Ujhhgtgfeyxiexzf)) {
                                rect2.set(rect3);
                                c2963feyxiexzfUjhhgtg = c2963feyxiexzfUjhhgtg2;
                            }
                        }
                    }
                }
            }
            i2 = i6;
        }
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg4 = c2963feyxiexzfUjhhgtg;
        if (c2963feyxiexzfUjhhgtg4 == null) {
            i5 = Integer.MIN_VALUE;
        } else {
            int i16 = c1138feyxiexzfUjhhgtg.f4305Ujhhgtgfeyxiexzf;
            int i17 = i3;
            while (true) {
                if (i17 >= i16) {
                    i4 = i2;
                    break;
                }
                if (c1138feyxiexzfUjhhgtg.f4304Ujhhgtgfeyxiexzf[i17] == c2963feyxiexzfUjhhgtg4) {
                    i4 = i17;
                    break;
                }
                i17++;
            }
            i5 = c1138feyxiexzfUjhhgtg.f4303Ujhhgtgfeyxiexzf[i4];
        }
        return m5024Ujhhgtgfeyxiexzf(i5);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2963feyxiexzfUjhhgtg m5023Ujhhgtgfeyxiexzf(int i) {
        if (i != -1) {
            return m5019Ujhhgtgfeyxiexzf(i);
        }
        View view = this.f10913Ujhhgtgfeyxiexzf;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg = new C2963feyxiexzfUjhhgtg(accessibilityNodeInfoObtain);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo3729Ujhhgtgfeyxiexzf(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return c2963feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public abstract boolean mo3730Ujhhgtgfeyxiexzf(int i, int i2, Bundle bundle);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public abstract void mo3731Ujhhgtgfeyxiexzf(int i, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m5024Ujhhgtgfeyxiexzf(int i) {
        int i2;
        View view = this.f10913Ujhhgtgfeyxiexzf;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f10916Ujhhgtgfeyxiexzf) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m5017Ujhhgtgfeyxiexzf(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f10916Ujhhgtgfeyxiexzf = i;
        mo4154Ujhhgtgfeyxiexzf(i, true);
        m5025Ujhhgtgfeyxiexzf(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5025Ujhhgtgfeyxiexzf(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f10912Ujhhgtgfeyxiexzf.isEnabled() || (parent = (view = this.f10913Ujhhgtgfeyxiexzf).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, m5018Ujhhgtgfeyxiexzf(i, i2));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public void mo4153Ujhhgtgfeyxiexzf(C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public void mo4154Ujhhgtgfeyxiexzf(int i, boolean z) {
    }
}
