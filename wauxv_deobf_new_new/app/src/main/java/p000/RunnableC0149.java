package p000;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0149 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1203;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1204;

    public /* synthetic */ RunnableC0149(Object obj, int i) {
        this.f1203 = i;
        this.f1204 = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    @Override // java.lang.Runnable
    public final void run() {
        int iM3575;
        C0144 c0144;
        int i = this.f1203;
        int iM3576 = 0;
        Object obj = this.f1204;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                return;
            case 1:
                C0253 c0253 = (C0253) obj;
                c0253.getClass();
                while (true) {
                    try {
                        c0253.m1461((C0151) ((ReferenceQueue) c0253.f1479).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ViewOnTouchListenerC1849 viewOnTouchListenerC1849 = (ViewOnTouchListenerC1849) obj;
                AbstractC1117 abstractC1117 = viewOnTouchListenerC1849.f6161;
                C0323 c0323 = viewOnTouchListenerC1849.f6159;
                if (viewOnTouchListenerC1849.f6173) {
                    if (viewOnTouchListenerC1849.f6171) {
                        viewOnTouchListenerC1849.f6171 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0323.f1620 = jCurrentAnimationTimeMillis;
                        c0323.f1622 = -1L;
                        c0323.f1621 = jCurrentAnimationTimeMillis;
                        c0323.f1623 = 0.5f;
                    }
                    if ((c0323.f1622 > 0 && AnimationUtils.currentAnimationTimeMillis() > c0323.f1622 + ((long) c0323.f1624)) || !viewOnTouchListenerC1849.m3759()) {
                        viewOnTouchListenerC1849.f6173 = false;
                        return;
                    }
                    if (viewOnTouchListenerC1849.f6172) {
                        viewOnTouchListenerC1849.f6172 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        abstractC1117.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0323.f1621 == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM1552 = c0323.m1552(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c0323.f1621;
                    c0323.f1621 = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC1849.f6175.scrollListBy((int) (j * ((fM1552 * 4.0f) + ((-4.0f) * fM1552 * fM1552)) * c0323.f1619));
                    Field field = AbstractC3638.f11333;
                    abstractC1117.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                C0337 c0337 = (C0337) obj;
                c0337.f1654 = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0337.f1656;
                C3639 c3639 = bottomSheetBehavior.f662;
                if (c3639 != null && c3639.m5191()) {
                    c0337.m1579(c0337.f1653);
                    return;
                } else {
                    if (bottomSheetBehavior.f661 == 2) {
                        bottomSheetBehavior.m793(c0337.f1653);
                        return;
                    }
                    return;
                }
            case 4:
                C0776 c0776 = ((RunnableC0938) obj).f3446;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c0776.f2879;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC0034.m877(((C0942) c0776.f2881).m897());
                return;
            case 5:
                ((DialogInterfaceOnCancelListenerC1035) obj).f3781.getClass();
                return;
            case 6:
                AbstractC1117 abstractC1118 = (AbstractC1117) obj;
                abstractC1118.f4166 = null;
                abstractC1118.drawableStateChanged();
                return;
            case 7:
                C1277 c1277 = (C1277) obj;
                ValueAnimator valueAnimator = c1277.f4681;
                int i2 = c1277.f4682;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c1277.f4682 = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                AbstractComponentCallbacksC1414 abstractComponentCallbacksC1414 = (AbstractComponentCallbacksC1414) obj;
                if (abstractComponentCallbacksC1414.f5099 != null) {
                    if (abstractComponentCallbacksC1414.f5099 == null) {
                        C0253 c0254 = new C0253(11);
                        Object obj2 = AbstractComponentCallbacksC1414.f5094;
                        c0254.f1478 = obj2;
                        c0254.f1479 = obj2;
                        c0254.f1480 = obj2;
                        abstractComponentCallbacksC1414.f5099 = c0254;
                    }
                    abstractComponentCallbacksC1414.f5099.getClass();
                    return;
                }
                return;
            case 9:
                ((C0552) obj).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case 10:
                C1700 c1700 = (C1700) obj;
                if (c1700.f5730 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = c1700.f5755;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    AbstractC2546 layoutManager = c1700.f5745.getLayoutManager();
                    if (c1700.f5754 == null) {
                        c1700.f5754 = new Rect();
                    }
                    View view = c1700.f5730.f8157;
                    Rect rect = c1700.f5754;
                    RecyclerView recyclerView = layoutManager.f8093;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.m233(view));
                    }
                    if (layoutManager.mo152()) {
                        int i3 = (int) (c1700.f5737 + c1700.f5735);
                        int paddingLeft = (i3 - c1700.f5754.left) - c1700.f5745.getPaddingLeft();
                        float f = c1700.f5735;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((c1700.f5730.f8157.getWidth() + i3) + c1700.f5754.right) - (c1700.f5745.getWidth() - c1700.f5745.getPaddingRight())) <= 0)) {
                            iM3575 = 0;
                        } else {
                            iM3575 = paddingLeft;
                        }
                    } else {
                        iM3575 = 0;
                    }
                    if (layoutManager.mo153()) {
                        int i4 = (int) (c1700.f5738 + c1700.f5736);
                        int paddingTop = (i4 - c1700.f5754.top) - c1700.f5745.getPaddingTop();
                        float f2 = c1700.f5736;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((c1700.f5730.f8157.getHeight() + i4) + c1700.f5754.bottom) - (c1700.f5745.getHeight() - c1700.f5745.getPaddingBottom())) > 0)) {
                            iM3576 = paddingTop;
                        }
                    }
                    if (iM3575 != 0) {
                        AbstractC1698 abstractC1698 = c1700.f5740;
                        RecyclerView recyclerView2 = c1700.f5745;
                        int width = c1700.f5730.f8157.getWidth();
                        c1700.f5745.getWidth();
                        iM3575 = abstractC1698.m3575(recyclerView2, width, iM3575, j3);
                    }
                    int i5 = iM3575;
                    if (iM3576 != 0) {
                        AbstractC1698 abstractC1699 = c1700.f5740;
                        RecyclerView recyclerView3 = c1700.f5745;
                        int height = c1700.f5730.f8157.getHeight();
                        c1700.f5745.getHeight();
                        iM3576 = abstractC1699.m3575(recyclerView3, height, iM3576, j3);
                    }
                    if (i5 == 0 && iM3576 == 0) {
                        c1700.f5755 = Long.MIN_VALUE;
                        return;
                    }
                    if (c1700.f5755 == Long.MIN_VALUE) {
                        c1700.f5755 = jCurrentTimeMillis;
                    }
                    c1700.f5745.scrollBy(i5, iM3576);
                    AbstractC2563 abstractC2563 = c1700.f5730;
                    if (abstractC2563 != null) {
                        c1700.m3586(abstractC2563);
                    }
                    c1700.f5745.removeCallbacks(c1700.f5746);
                    RecyclerView recyclerView4 = c1700.f5745;
                    Field field2 = AbstractC3638.f11333;
                    recyclerView4.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                C0937 c0937 = (C0937) obj;
                EditText editText = ((C1992) c0937.f3444).f6593;
                if (editText == null) {
                    return;
                }
                editText.requestFocus();
                ((C1992) c0937.f3444).f6593.setFocusableInTouchMode(true);
                C1992 c1992 = (C1992) c0937.f3444;
                c1992.f6600.m901(c1992.f6593, true);
                EditText editText2 = ((C1992) c0937.f3444).f6593;
                editText2.setSelection(editText2.getText().length());
                ((C1992) c0937.f3444).f6600.getClass();
                return;
            case Opcodes.FCONST_1 /* 12 */:
                C1992 c1993 = (C1992) obj;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c1993.f6586;
                if (dialogXBaseRelativeLayout2 != null) {
                    dialogXBaseRelativeLayout2.setVisibility(8);
                }
                AbstractC0034.m877(c1993.f6600.m897());
                return;
            case 13:
                ComponentCallbacks2C2619 componentCallbacks2C2619 = (ComponentCallbacks2C2619) obj;
                componentCallbacks2C2619.f8288.mo756(componentCallbacks2C2619);
                return;
            case Opcodes.DCONST_0 /* 14 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f101) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f101 = false;
                    return;
                }
                return;
            case 15:
                ((StaggeredGridLayoutManager) obj).m267();
                return;
            case 16:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f854.f4354;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case Opcodes.SIPUSH /* 17 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f148;
                if (actionMenuView == null || (c0144 = actionMenuView.f82) == null) {
                    return;
                }
                c0144.m1292();
                return;
            default:
                ((C3639) obj).m5199(0);
                return;
        }
    }
}
