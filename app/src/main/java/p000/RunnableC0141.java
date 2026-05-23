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
import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0141 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1135;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1136;

    public /* synthetic */ RunnableC0141(int i, Object obj) {
        this.f1135 = i;
        this.f1136 = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    @Override // java.lang.Runnable
    public final void run() {
        int iM2055;
        C0136 c0136;
        int i = this.f1135;
        int iM2056 = 0;
        Object obj = this.f1136;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                return;
            case 1:
                C0243 c0243 = (C0243) obj;
                c0243.getClass();
                while (true) {
                    try {
                        c0243.m1315((C0143) ((ReferenceQueue) c0243.f1405).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ViewOnTouchListenerC1822 viewOnTouchListenerC1822 = (ViewOnTouchListenerC1822) obj;
                AbstractC1111 abstractC1111 = viewOnTouchListenerC1822.f6086;
                C0311 c0311 = viewOnTouchListenerC1822.f6084;
                if (viewOnTouchListenerC1822.f6098) {
                    if (viewOnTouchListenerC1822.f6096) {
                        viewOnTouchListenerC1822.f6096 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0311.f1544 = jCurrentAnimationTimeMillis;
                        c0311.f1546 = -1L;
                        c0311.f1545 = jCurrentAnimationTimeMillis;
                        c0311.f1547 = 0.5f;
                    }
                    if ((c0311.f1546 > 0 && AnimationUtils.currentAnimationTimeMillis() > c0311.f1546 + ((long) c0311.f1548)) || !viewOnTouchListenerC1822.m3581()) {
                        viewOnTouchListenerC1822.f6098 = false;
                        return;
                    }
                    if (viewOnTouchListenerC1822.f6097) {
                        viewOnTouchListenerC1822.f6097 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        abstractC1111.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0311.f1545 == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM1406 = c0311.m1406(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c0311.f1545;
                    c0311.f1545 = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC1822.f6100.scrollListBy((int) (j * ((fM1406 * 4.0f) + ((-4.0f) * fM1406 * fM1406)) * c0311.f1543));
                    Field field = AbstractC3578.f11184;
                    abstractC1111.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                C0362 c0362 = (C0362) obj;
                c0362.f1683 = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0362.f1685;
                C3579 c3579 = bottomSheetBehavior.f610;
                if (c3579 != null && c3579.m5185()) {
                    c0362.m1474(c0362.f1682);
                    return;
                } else {
                    if (bottomSheetBehavior.f609 == 2) {
                        bottomSheetBehavior.m650(c0362.f1682);
                        return;
                    }
                    return;
                }
            case 4:
                C0662 c0662 = ((RunnableC0939) obj).f3439;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c0662.f2530;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC0027.m733(((C0943) c0662.f2532).m753());
                return;
            case 5:
                ((DialogInterfaceOnCancelListenerC1032) obj).f3774.getClass();
                return;
            case 6:
                AbstractC1111 abstractC1112 = (AbstractC1111) obj;
                abstractC1112.f4155 = null;
                abstractC1112.drawableStateChanged();
                return;
            case 7:
                C1275 c1275 = (C1275) obj;
                ValueAnimator valueAnimator = c1275.f4681;
                int i2 = c1275.f4682;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c1275.f4682 = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                AbstractComponentCallbacksC1406 abstractComponentCallbacksC1406 = (AbstractComponentCallbacksC1406) obj;
                if (abstractComponentCallbacksC1406.f5070 != null) {
                    if (abstractComponentCallbacksC1406.f5070 == null) {
                        C0243 c0244 = new C0243(11);
                        Object obj2 = AbstractComponentCallbacksC1406.f5065;
                        c0244.f1404 = obj2;
                        c0244.f1405 = obj2;
                        c0244.f1406 = obj2;
                        abstractComponentCallbacksC1406.f5070 = c0244;
                    }
                    abstractComponentCallbacksC1406.f5070.getClass();
                    return;
                }
                return;
            case 9:
                ((C0575) obj).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case 10:
                C1682 c1682 = (C1682) obj;
                if (c1682.f5687 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = c1682.f5712;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    AbstractC2491 layoutManager = c1682.f5702.getLayoutManager();
                    if (c1682.f5711 == null) {
                        c1682.f5711 = new Rect();
                    }
                    View view = c1682.f5687.f8006;
                    Rect rect = c1682.f5711;
                    RecyclerView recyclerView = layoutManager.f7942;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.m233(view));
                    }
                    if (layoutManager.mo152()) {
                        int i3 = (int) (c1682.f5694 + c1682.f5692);
                        int paddingLeft = (i3 - c1682.f5711.left) - c1682.f5702.getPaddingLeft();
                        float f = c1682.f5692;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((c1682.f5687.f8006.getWidth() + i3) + c1682.f5711.right) - (c1682.f5702.getWidth() - c1682.f5702.getPaddingRight())) <= 0)) {
                            iM2055 = 0;
                        } else {
                            iM2055 = paddingLeft;
                        }
                    } else {
                        iM2055 = 0;
                    }
                    if (layoutManager.mo153()) {
                        int i4 = (int) (c1682.f5695 + c1682.f5693);
                        int paddingTop = (i4 - c1682.f5711.top) - c1682.f5702.getPaddingTop();
                        float f2 = c1682.f5693;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((c1682.f5687.f8006.getHeight() + i4) + c1682.f5711.bottom) - (c1682.f5702.getHeight() - c1682.f5702.getPaddingBottom())) > 0)) {
                            iM2056 = paddingTop;
                        }
                    }
                    if (iM2055 != 0) {
                        C0662 c0663 = c1682.f5697;
                        RecyclerView recyclerView2 = c1682.f5702;
                        int width = c1682.f5687.f8006.getWidth();
                        c1682.f5702.getWidth();
                        iM2055 = c0663.m2055(recyclerView2, width, iM2055, j3);
                    }
                    int i5 = iM2055;
                    if (iM2056 != 0) {
                        C0662 c0664 = c1682.f5697;
                        RecyclerView recyclerView3 = c1682.f5702;
                        int height = c1682.f5687.f8006.getHeight();
                        c1682.f5702.getHeight();
                        iM2056 = c0664.m2055(recyclerView3, height, iM2056, j3);
                    }
                    if (i5 == 0 && iM2056 == 0) {
                        c1682.f5712 = Long.MIN_VALUE;
                        return;
                    }
                    if (c1682.f5712 == Long.MIN_VALUE) {
                        c1682.f5712 = jCurrentTimeMillis;
                    }
                    c1682.f5702.scrollBy(i5, iM2056);
                    AbstractC2508 abstractC2508 = c1682.f5687;
                    if (abstractC2508 != null) {
                        c1682.m3418(abstractC2508);
                    }
                    c1682.f5702.removeCallbacks(c1682.f5703);
                    RecyclerView recyclerView4 = c1682.f5702;
                    Field field2 = AbstractC3578.f11184;
                    recyclerView4.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                C0938 c0938 = (C0938) obj;
                EditText editText = ((C1961) c0938.f3437).f6488;
                if (editText == null) {
                    return;
                }
                editText.requestFocus();
                ((C1961) c0938.f3437).f6488.setFocusableInTouchMode(true);
                C1961 c1961 = (C1961) c0938.f3437;
                c1961.f6495.m757(c1961.f6488, true);
                EditText editText2 = ((C1961) c0938.f3437).f6488;
                editText2.setSelection(editText2.getText().length());
                ((C1961) c0938.f3437).f6495.getClass();
                return;
            case Opcodes.FCONST_1 /* 12 */:
                C1961 c1962 = (C1961) obj;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c1962.f6481;
                if (dialogXBaseRelativeLayout2 != null) {
                    dialogXBaseRelativeLayout2.setVisibility(8);
                }
                AbstractC0027.m733(c1962.f6495.m753());
                return;
            case 13:
                ComponentCallbacks2C2563 componentCallbacks2C2563 = (ComponentCallbacks2C2563) obj;
                componentCallbacks2C2563.f8135.mo613(componentCallbacks2C2563);
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
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f788.f4357;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case Opcodes.SIPUSH /* 17 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f148;
                if (actionMenuView == null || (c0136 = actionMenuView.f82) == null) {
                    return;
                }
                c0136.m1146();
                return;
            default:
                ((C3579) obj).m5193(0);
                return;
        }
    }
}
