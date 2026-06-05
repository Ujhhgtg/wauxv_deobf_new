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
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3012feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9362Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f9363Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3012feyxiexzfUjhhgtg(int i, Object obj) {
        this.f9362Ujhhgtgfeyxiexzf = i;
        this.f9363Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    @Override // java.lang.Runnable
    public final void run() {
        int iM1994Ujhhgtgfeyxiexzf;
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf;
        int i = this.f9362Ujhhgtgfeyxiexzf;
        int iM1994Ujhhgtgfeyxiexzf2 = 0;
        Object obj = this.f9363Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                return;
            case 1:
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) obj;
                c2366Ujhhgtgfeyxiexzf.getClass();
                while (true) {
                    try {
                        c2366Ujhhgtgfeyxiexzf.m3597Ujhhgtgfeyxiexzf((C3014Ujhhgtgfeyxiexzf) ((ReferenceQueue) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf viewOnTouchListenerC0254Ujhhgtgfeyxiexzf = (ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf) obj;
                AbstractC3231feyxiexzfUjhhgtg abstractC3231feyxiexzfUjhhgtg = viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1612Ujhhgtgfeyxiexzf;
                C2441feyxiexzfUjhhgtg c2441feyxiexzfUjhhgtg = viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1610Ujhhgtgfeyxiexzf;
                if (viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1624Ujhhgtgfeyxiexzf) {
                    if (viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1622Ujhhgtgfeyxiexzf) {
                        viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1622Ujhhgtgfeyxiexzf = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2441feyxiexzfUjhhgtg.f7899Ujhhgtgfeyxiexzf = jCurrentAnimationTimeMillis;
                        c2441feyxiexzfUjhhgtg.f7901Ujhhgtgfeyxiexzf = -1L;
                        c2441feyxiexzfUjhhgtg.f7900Ujhhgtgfeyxiexzf = jCurrentAnimationTimeMillis;
                        c2441feyxiexzfUjhhgtg.f7902Ujhhgtgfeyxiexzf = 0.5f;
                    }
                    if ((c2441feyxiexzfUjhhgtg.f7901Ujhhgtgfeyxiexzf > 0 && AnimationUtils.currentAnimationTimeMillis() > c2441feyxiexzfUjhhgtg.f7901Ujhhgtgfeyxiexzf + ((long) c2441feyxiexzfUjhhgtg.f7903Ujhhgtgfeyxiexzf)) || !viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.m1422Ujhhgtgfeyxiexzf()) {
                        viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1624Ujhhgtgfeyxiexzf = false;
                        return;
                    }
                    if (viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1623Ujhhgtgfeyxiexzf) {
                        viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1623Ujhhgtgfeyxiexzf = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        abstractC3231feyxiexzfUjhhgtg.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c2441feyxiexzfUjhhgtg.f7900Ujhhgtgfeyxiexzf == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM3681Ujhhgtgfeyxiexzf = c2441feyxiexzfUjhhgtg.m3681Ujhhgtgfeyxiexzf(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c2441feyxiexzfUjhhgtg.f7900Ujhhgtgfeyxiexzf;
                    c2441feyxiexzfUjhhgtg.f7900Ujhhgtgfeyxiexzf = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1626Ujhhgtgfeyxiexzf.scrollListBy((int) (j * ((fM3681Ujhhgtgfeyxiexzf * 4.0f) + ((-4.0f) * fM3681Ujhhgtgfeyxiexzf * fM3681Ujhhgtgfeyxiexzf)) * c2441feyxiexzfUjhhgtg.f7898Ujhhgtgfeyxiexzf));
                    Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    abstractC3231feyxiexzfUjhhgtg.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                C2450feyxiexzfUjhhgtg c2450feyxiexzfUjhhgtg = (C2450feyxiexzfUjhhgtg) obj;
                c2450feyxiexzfUjhhgtg.f7932Ujhhgtgfeyxiexzf = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c2450feyxiexzfUjhhgtg.f7934Ujhhgtgfeyxiexzf;
                C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg = bottomSheetBehavior.f676feyxiexzfUjhhgtg;
                if (c1900feyxiexzfUjhhgtg != null && c1900feyxiexzfUjhhgtg.m3243Ujhhgtgfeyxiexzf()) {
                    c2450feyxiexzfUjhhgtg.m3692Ujhhgtgfeyxiexzf(c2450feyxiexzfUjhhgtg.f7931Ujhhgtgfeyxiexzf);
                    return;
                } else {
                    if (bottomSheetBehavior.f675feyxiexzfUjhhgtg == 2) {
                        bottomSheetBehavior.m792feyxiexzfUjhhgtg(c2450feyxiexzfUjhhgtg.f7931Ujhhgtgfeyxiexzf);
                        return;
                    }
                    return;
                }
            case 4:
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf = ((RunnableC3051Ujhhgtgfeyxiexzf) obj).f9437Ujhhgtgfeyxiexzf;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c3639Ujhhgtgfeyxiexzf.f11369Ujhhgtgfeyxiexzf;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                Ujhhgtgfeyxiexzf.m878Ujhhgtgfeyxiexzf(((C3082Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf).m898Ujhhgtgfeyxiexzf());
                return;
            case 5:
                ((DialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg) obj).f9818Ujhhgtgfeyxiexzf.getClass();
                return;
            case 6:
                AbstractC3231feyxiexzfUjhhgtg abstractC3231feyxiexzfUjhhgtg2 = (AbstractC3231feyxiexzfUjhhgtg) obj;
                abstractC3231feyxiexzfUjhhgtg2.f10144Ujhhgtgfeyxiexzf = null;
                abstractC3231feyxiexzfUjhhgtg2.drawableStateChanged();
                return;
            case 7:
                C3419Ujhhgtgfeyxiexzf c3419Ujhhgtgfeyxiexzf = (C3419Ujhhgtgfeyxiexzf) obj;
                ValueAnimator valueAnimator = c3419Ujhhgtgfeyxiexzf.f10673feyxiexzfUjhhgtg;
                int i2 = c3419Ujhhgtgfeyxiexzf.f10674feyxiexzfUjhhgtg;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c3419Ujhhgtgfeyxiexzf.f10674feyxiexzfUjhhgtg = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf = (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf) obj;
                if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11028Ujhhgtgfeyxiexzf != null) {
                    if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11028Ujhhgtgfeyxiexzf == null) {
                        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = new C2366Ujhhgtgfeyxiexzf(11);
                        Object obj2 = AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11023Ujhhgtgfeyxiexzf;
                        c2366Ujhhgtgfeyxiexzf2.f7714Ujhhgtgfeyxiexzf = obj2;
                        c2366Ujhhgtgfeyxiexzf2.f7715Ujhhgtgfeyxiexzf = obj2;
                        c2366Ujhhgtgfeyxiexzf2.f7716Ujhhgtgfeyxiexzf = obj2;
                        abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11028Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf2;
                    }
                    abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf.f11028Ujhhgtgfeyxiexzf.getClass();
                    return;
                }
                return;
            case 9:
                ((C2790feyxiexzfUjhhgtg) obj).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case 10:
                C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf = (C0708Ujhhgtgfeyxiexzf) obj;
                if (c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = c0708Ujhhgtgfeyxiexzf.f2943feyxiexzfUjhhgtg;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    AbstractC0822feyxiexzfUjhhgtg layoutManager = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getLayoutManager();
                    if (c0708Ujhhgtgfeyxiexzf.f2942feyxiexzfUjhhgtg == null) {
                        c0708Ujhhgtgfeyxiexzf.f2942feyxiexzfUjhhgtg = new Rect();
                    }
                    View view = c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf;
                    Rect rect = c0708Ujhhgtgfeyxiexzf.f2942feyxiexzfUjhhgtg;
                    RecyclerView recyclerView = layoutManager.f3261Ujhhgtgfeyxiexzf;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.m233feyxiexzfUjhhgtg(view));
                    }
                    if (layoutManager.mo152Ujhhgtgfeyxiexzf()) {
                        int i3 = (int) (c0708Ujhhgtgfeyxiexzf.f2925Ujhhgtgfeyxiexzf + c0708Ujhhgtgfeyxiexzf.f2923Ujhhgtgfeyxiexzf);
                        int paddingLeft = (i3 - c0708Ujhhgtgfeyxiexzf.f2942feyxiexzfUjhhgtg.left) - c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getPaddingLeft();
                        float f = c0708Ujhhgtgfeyxiexzf.f2923Ujhhgtgfeyxiexzf;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getWidth() + i3) + c0708Ujhhgtgfeyxiexzf.f2942feyxiexzfUjhhgtg.right) - (c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getWidth() - c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getPaddingRight())) <= 0)) {
                            iM1994Ujhhgtgfeyxiexzf = 0;
                        } else {
                            iM1994Ujhhgtgfeyxiexzf = paddingLeft;
                        }
                    } else {
                        iM1994Ujhhgtgfeyxiexzf = 0;
                    }
                    if (layoutManager.mo153Ujhhgtgfeyxiexzf()) {
                        int i4 = (int) (c0708Ujhhgtgfeyxiexzf.f2926Ujhhgtgfeyxiexzf + c0708Ujhhgtgfeyxiexzf.f2924Ujhhgtgfeyxiexzf);
                        int paddingTop = (i4 - c0708Ujhhgtgfeyxiexzf.f2942feyxiexzfUjhhgtg.top) - c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getPaddingTop();
                        float f2 = c0708Ujhhgtgfeyxiexzf.f2924Ujhhgtgfeyxiexzf;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getHeight() + i4) + c0708Ujhhgtgfeyxiexzf.f2942feyxiexzfUjhhgtg.bottom) - (c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getHeight() - c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getPaddingBottom())) > 0)) {
                            iM1994Ujhhgtgfeyxiexzf2 = paddingTop;
                        }
                    }
                    if (iM1994Ujhhgtgfeyxiexzf != 0) {
                        AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = c0708Ujhhgtgfeyxiexzf.f2928Ujhhgtgfeyxiexzf;
                        RecyclerView recyclerView2 = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf;
                        int width = c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getWidth();
                        c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getWidth();
                        iM1994Ujhhgtgfeyxiexzf = abstractC0699Ujhhgtgfeyxiexzf.m1994Ujhhgtgfeyxiexzf(recyclerView2, width, iM1994Ujhhgtgfeyxiexzf, j3);
                    }
                    int i5 = iM1994Ujhhgtgfeyxiexzf;
                    if (iM1994Ujhhgtgfeyxiexzf2 != 0) {
                        AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf2 = c0708Ujhhgtgfeyxiexzf.f2928Ujhhgtgfeyxiexzf;
                        RecyclerView recyclerView3 = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf;
                        int height = c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getHeight();
                        c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getHeight();
                        iM1994Ujhhgtgfeyxiexzf2 = abstractC0699Ujhhgtgfeyxiexzf2.m1994Ujhhgtgfeyxiexzf(recyclerView3, height, iM1994Ujhhgtgfeyxiexzf2, j3);
                    }
                    if (i5 == 0 && iM1994Ujhhgtgfeyxiexzf2 == 0) {
                        c0708Ujhhgtgfeyxiexzf.f2943feyxiexzfUjhhgtg = Long.MIN_VALUE;
                        return;
                    }
                    if (c0708Ujhhgtgfeyxiexzf.f2943feyxiexzfUjhhgtg == Long.MIN_VALUE) {
                        c0708Ujhhgtgfeyxiexzf.f2943feyxiexzfUjhhgtg = jCurrentTimeMillis;
                    }
                    c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.scrollBy(i5, iM1994Ujhhgtgfeyxiexzf2);
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf;
                    if (abstractC0821feyxiexzfUjhhgtg != null) {
                        c0708Ujhhgtgfeyxiexzf.m2008Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
                    }
                    c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.removeCallbacks(c0708Ujhhgtgfeyxiexzf.f2934Ujhhgtgfeyxiexzf);
                    RecyclerView recyclerView4 = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf;
                    Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    recyclerView4.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                C3052Ujhhgtgfeyxiexzf c3052Ujhhgtgfeyxiexzf = (C3052Ujhhgtgfeyxiexzf) obj;
                EditText editText = ((C0399Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf).f2156Ujhhgtgfeyxiexzf;
                if (editText == null) {
                    return;
                }
                editText.requestFocus();
                ((C0399Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf).f2156Ujhhgtgfeyxiexzf.setFocusableInTouchMode(true);
                C0399Ujhhgtgfeyxiexzf c0399Ujhhgtgfeyxiexzf = (C0399Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf;
                c0399Ujhhgtgfeyxiexzf.f2163Ujhhgtgfeyxiexzf.m902Ujhhgtgfeyxiexzf(c0399Ujhhgtgfeyxiexzf.f2156Ujhhgtgfeyxiexzf, true);
                EditText editText2 = ((C0399Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf).f2156Ujhhgtgfeyxiexzf;
                editText2.setSelection(editText2.getText().length());
                ((C0399Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf).f2163Ujhhgtgfeyxiexzf.getClass();
                return;
            case Opcodes.FCONST_1 /* 12 */:
                C0399Ujhhgtgfeyxiexzf c0399Ujhhgtgfeyxiexzf2 = (C0399Ujhhgtgfeyxiexzf) obj;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c0399Ujhhgtgfeyxiexzf2.f2149Ujhhgtgfeyxiexzf;
                if (dialogXBaseRelativeLayout2 != null) {
                    dialogXBaseRelativeLayout2.setVisibility(8);
                }
                Ujhhgtgfeyxiexzf.m878Ujhhgtgfeyxiexzf(c0399Ujhhgtgfeyxiexzf2.f2163Ujhhgtgfeyxiexzf.m898Ujhhgtgfeyxiexzf());
                return;
            case 13:
                ComponentCallbacks2C0894feyxiexzfUjhhgtg componentCallbacks2C0894feyxiexzfUjhhgtg = (ComponentCallbacks2C0894feyxiexzfUjhhgtg) obj;
                componentCallbacks2C0894feyxiexzfUjhhgtg.f3444Ujhhgtgfeyxiexzf.mo755Ujhhgtgfeyxiexzf(componentCallbacks2C0894feyxiexzfUjhhgtg);
                return;
            case Opcodes.DCONST_0 /* 14 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f102Ujhhgtgfeyxiexzf) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f102Ujhhgtgfeyxiexzf = false;
                    return;
                }
                return;
            case 15:
                ((StaggeredGridLayoutManager) obj).m267feyxiexzfUjhhgtg();
                return;
            case 16:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f868Ujhhgtgfeyxiexzf.f10396Ujhhgtgfeyxiexzf;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case Opcodes.SIPUSH /* 17 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f149Ujhhgtgfeyxiexzf;
                if (actionMenuView == null || (c3007Ujhhgtgfeyxiexzf = actionMenuView.f83Ujhhgtgfeyxiexzf) == null) {
                    return;
                }
                c3007Ujhhgtgfeyxiexzf.m4458Ujhhgtgfeyxiexzf();
                return;
            default:
                ((C1900feyxiexzfUjhhgtg) obj).m3251Ujhhgtgfeyxiexzf(0);
                return;
        }
    }
}
