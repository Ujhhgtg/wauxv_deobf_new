package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import me.hd.wauxv.R;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3723feyxiexzfUjhhgtg;
import p000.C0226Ujhhgtgfeyxiexzf;
import p000.C0689Ujhhgtgfeyxiexzf;
import p000.C1017feyxiexzfUjhhgtg;
import p000.C1900feyxiexzfUjhhgtg;
import p000.C2450feyxiexzfUjhhgtg;
import p000.C2478feyxiexzfUjhhgtg;
import p000.C2501feyxiexzfUjhhgtg;
import p000.C2667feyxiexzfUjhhgtg;
import p000.C2668feyxiexzfUjhhgtg;
import p000.C2669Ujhhgtgfeyxiexzf;
import p000.C2948feyxiexzfUjhhgtg;
import p000.C2949feyxiexzfUjhhgtg;
import p000.C2956feyxiexzfUjhhgtg;
import p000.C3726feyxiexzfUjhhgtg;
import p000.RunnableC2349Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC3723feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f638Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f639Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f640Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f641Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f642Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f643Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f644Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f645Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf f646Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ColorStateList f647Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f648Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f649Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f650Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final boolean f651Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f652Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f653Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean f654Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f655Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final boolean f656Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final boolean f657Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean f658Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f659Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f660Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f661Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1017feyxiexzfUjhhgtg f662feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f663feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2450feyxiexzfUjhhgtg f664feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ValueAnimator f665feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f666feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f667feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public int f668feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final float f669feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f670feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final float f671feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public boolean f672feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f673feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final boolean f674feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public int f675feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public C1900feyxiexzfUjhhgtg f676feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f677feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public int f678feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f679feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final float f680feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public int f681feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f682feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f683feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public WeakReference f684feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public WeakReference f685feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final ArrayList f686Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public VelocityTracker f687Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f688Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f689Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f690Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public HashMap f691Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final SparseIntArray f692feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final C2668feyxiexzfUjhhgtg f693feyxiexzfUjhhgtg;

    public BottomSheetBehavior() {
        this.f638Ujhhgtgfeyxiexzf = 0;
        this.f639Ujhhgtgfeyxiexzf = true;
        this.f648Ujhhgtgfeyxiexzf = -1;
        this.f649Ujhhgtgfeyxiexzf = -1;
        this.f664feyxiexzfUjhhgtg = new C2450feyxiexzfUjhhgtg(this);
        this.f669feyxiexzfUjhhgtg = 0.5f;
        this.f671feyxiexzfUjhhgtg = -1.0f;
        this.f674feyxiexzfUjhhgtg = true;
        this.f675feyxiexzfUjhhgtg = 4;
        this.f680feyxiexzfUjhhgtg = 0.1f;
        this.f686Ujhhgtgfeyxiexzf = new ArrayList();
        this.f689Ujhhgtgfeyxiexzf = -1;
        this.f692feyxiexzfUjhhgtg = new SparseIntArray();
        this.f693feyxiexzfUjhhgtg = new C2668feyxiexzfUjhhgtg(this, 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static View m778Ujhhgtgfeyxiexzf(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM778Ujhhgtgfeyxiexzf = m778Ujhhgtgfeyxiexzf(viewGroup.getChildAt(i));
            if (viewM778Ujhhgtgfeyxiexzf != null) {
                return viewM778Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static int m779Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo780Ujhhgtgfeyxiexzf(C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg) {
        this.f684feyxiexzfUjhhgtg = null;
        this.f676feyxiexzfUjhhgtg = null;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void mo781Ujhhgtgfeyxiexzf() {
        this.f684feyxiexzfUjhhgtg = null;
        this.f676feyxiexzfUjhhgtg = null;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo761Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg;
        if (!view.isShown() || !this.f674feyxiexzfUjhhgtg) {
            this.f677feyxiexzfUjhhgtg = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f688Ujhhgtgfeyxiexzf = -1;
            this.f689Ujhhgtgfeyxiexzf = -1;
            VelocityTracker velocityTracker = this.f687Ujhhgtgfeyxiexzf;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f687Ujhhgtgfeyxiexzf = null;
            }
        }
        if (this.f687Ujhhgtgfeyxiexzf == null) {
            this.f687Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        this.f687Ujhhgtgfeyxiexzf.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f689Ujhhgtgfeyxiexzf = (int) motionEvent.getY();
            if (this.f675feyxiexzfUjhhgtg != 2) {
                WeakReference weakReference = this.f685feyxiexzfUjhhgtg;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m69Ujhhgtgfeyxiexzf(view2, x, this.f689Ujhhgtgfeyxiexzf)) {
                    this.f688Ujhhgtgfeyxiexzf = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f690Ujhhgtgfeyxiexzf = true;
                }
            }
            this.f677feyxiexzfUjhhgtg = this.f688Ujhhgtgfeyxiexzf == -1 && !coordinatorLayout.m69Ujhhgtgfeyxiexzf(view, x, this.f689Ujhhgtgfeyxiexzf);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f690Ujhhgtgfeyxiexzf = false;
            this.f688Ujhhgtgfeyxiexzf = -1;
            if (this.f677feyxiexzfUjhhgtg) {
                this.f677feyxiexzfUjhhgtg = false;
                return false;
            }
        }
        if (this.f677feyxiexzfUjhhgtg || (c1900feyxiexzfUjhhgtg = this.f676feyxiexzfUjhhgtg) == null || !c1900feyxiexzfUjhhgtg.m3253Ujhhgtgfeyxiexzf(motionEvent)) {
            WeakReference weakReference2 = this.f685feyxiexzfUjhhgtg;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f677feyxiexzfUjhhgtg || this.f675feyxiexzfUjhhgtg == 1 || coordinatorLayout.m69Ujhhgtgfeyxiexzf(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f676feyxiexzfUjhhgtg == null || (i = this.f689Ujhhgtgfeyxiexzf) == -1 || Math.abs(i - motionEvent.getY()) <= this.f676feyxiexzfUjhhgtg.f6335Ujhhgtgfeyxiexzf) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo762Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f684feyxiexzfUjhhgtg == null) {
            this.f644Ujhhgtgfeyxiexzf = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f651Ujhhgtgfeyxiexzf || this.f643Ujhhgtgfeyxiexzf) ? false : true;
            if (this.f652Ujhhgtgfeyxiexzf || this.f653Ujhhgtgfeyxiexzf || this.f654Ujhhgtgfeyxiexzf || this.f656Ujhhgtgfeyxiexzf || this.f657Ujhhgtgfeyxiexzf || this.f658Ujhhgtgfeyxiexzf || z) {
                AbstractC1937feyxiexzfUjhhgtg.m3277Ujhhgtgfeyxiexzf(view, new C2667feyxiexzfUjhhgtg(this, z));
            }
            AbstractC1901feyxiexzfUjhhgtg.m3267Ujhhgtgfeyxiexzf(view, new C0689Ujhhgtgfeyxiexzf(view));
            this.f684feyxiexzfUjhhgtg = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationMedium2, 300);
            AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationShort3, Opcodes.FCMPG);
            AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f646Ujhhgtgfeyxiexzf;
            if (c0226Ujhhgtgfeyxiexzf != null) {
                view.setBackground(c0226Ujhhgtgfeyxiexzf);
                float elevation = this.f671feyxiexzfUjhhgtg;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c0226Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(elevation);
            } else {
                ColorStateList colorStateList = this.f647Ujhhgtgfeyxiexzf;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m795feyxiexzfUjhhgtg();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f676feyxiexzfUjhhgtg == null) {
            this.f676feyxiexzfUjhhgtg = new C1900feyxiexzfUjhhgtg(coordinatorLayout.getContext(), coordinatorLayout, this.f693feyxiexzfUjhhgtg);
        }
        int top = view.getTop();
        coordinatorLayout.m71Ujhhgtgfeyxiexzf(view, i);
        this.f682feyxiexzfUjhhgtg = coordinatorLayout.getWidth();
        this.f683feyxiexzfUjhhgtg = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f681feyxiexzfUjhhgtg = height;
        int iMin = this.f683feyxiexzfUjhhgtg;
        int i2 = iMin - height;
        int i3 = this.f660Ujhhgtgfeyxiexzf;
        if (i2 < i3) {
            boolean z2 = this.f655Ujhhgtgfeyxiexzf;
            int i4 = this.f649Ujhhgtgfeyxiexzf;
            if (z2) {
                if (i4 != -1) {
                    iMin = Math.min(iMin, i4);
                }
                this.f681feyxiexzfUjhhgtg = iMin;
            } else {
                int iMin2 = iMin - i3;
                if (i4 != -1) {
                    iMin2 = Math.min(iMin2, i4);
                }
                this.f681feyxiexzfUjhhgtg = iMin2;
            }
        }
        this.f667feyxiexzfUjhhgtg = Math.max(0, this.f683feyxiexzfUjhhgtg - this.f681feyxiexzfUjhhgtg);
        this.f668feyxiexzfUjhhgtg = (int) ((1.0f - this.f669feyxiexzfUjhhgtg) * this.f683feyxiexzfUjhhgtg);
        m783Ujhhgtgfeyxiexzf();
        int i5 = this.f675feyxiexzfUjhhgtg;
        if (i5 == 3) {
            view.offsetTopAndBottom(m787Ujhhgtgfeyxiexzf());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.f668feyxiexzfUjhhgtg);
        } else if (this.f672feyxiexzfUjhhgtg && i5 == 5) {
            view.offsetTopAndBottom(this.f683feyxiexzfUjhhgtg);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.f670feyxiexzfUjhhgtg);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m796feyxiexzfUjhhgtg(this.f675feyxiexzfUjhhgtg, false);
        this.f685feyxiexzfUjhhgtg = new WeakReference(m778Ujhhgtgfeyxiexzf(view));
        ArrayList arrayList = this.f686Ujhhgtgfeyxiexzf;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo763Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m779Ujhhgtgfeyxiexzf(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f648Ujhhgtgfeyxiexzf, marginLayoutParams.width), m779Ujhhgtgfeyxiexzf(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f649Ujhhgtgfeyxiexzf, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean mo782Ujhhgtgfeyxiexzf(View view) {
        WeakReference weakReference = this.f685feyxiexzfUjhhgtg;
        return (weakReference == null || view != weakReference.get() || this.f675feyxiexzfUjhhgtg == 3) ? false : true;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo764Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f685feyxiexzfUjhhgtg;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.f674feyxiexzfUjhhgtg;
        if (i2 > 0) {
            if (i4 < m787Ujhhgtgfeyxiexzf()) {
                int iM787Ujhhgtgfeyxiexzf = top - m787Ujhhgtgfeyxiexzf();
                iArr[1] = iM787Ujhhgtgfeyxiexzf;
                int i5 = -iM787Ujhhgtgfeyxiexzf;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view.offsetTopAndBottom(i5);
                m792feyxiexzfUjhhgtg(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view.offsetTopAndBottom(-i2);
                m792feyxiexzfUjhhgtg(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f670feyxiexzfUjhhgtg;
            if (i4 > i6 && !this.f672feyxiexzfUjhhgtg) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                Field field3 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view.offsetTopAndBottom(i8);
                m792feyxiexzfUjhhgtg(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                Field field4 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view.offsetTopAndBottom(-i2);
                m792feyxiexzfUjhhgtg(1);
            }
        }
        m786Ujhhgtgfeyxiexzf(view.getTop());
        this.f678feyxiexzfUjhhgtg = i2;
        this.f679feyxiexzfUjhhgtg = true;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final void mo766Ujhhgtgfeyxiexzf(View view, Parcelable parcelable) {
        C2669Ujhhgtgfeyxiexzf c2669Ujhhgtgfeyxiexzf = (C2669Ujhhgtgfeyxiexzf) parcelable;
        int i = this.f638Ujhhgtgfeyxiexzf;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f642Ujhhgtgfeyxiexzf = c2669Ujhhgtgfeyxiexzf.f8538Ujhhgtgfeyxiexzf;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f639Ujhhgtgfeyxiexzf = c2669Ujhhgtgfeyxiexzf.f8539Ujhhgtgfeyxiexzf;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f672feyxiexzfUjhhgtg = c2669Ujhhgtgfeyxiexzf.f8540Ujhhgtgfeyxiexzf;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f673feyxiexzfUjhhgtg = c2669Ujhhgtgfeyxiexzf.f8541Ujhhgtgfeyxiexzf;
            }
        }
        int i2 = c2669Ujhhgtgfeyxiexzf.f8537Ujhhgtgfeyxiexzf;
        if (i2 == 1 || i2 == 2) {
            this.f675feyxiexzfUjhhgtg = 4;
        } else {
            this.f675feyxiexzfUjhhgtg = i2;
        }
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final Parcelable mo767Ujhhgtgfeyxiexzf(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C2669Ujhhgtgfeyxiexzf(this);
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final boolean mo768Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        this.f678feyxiexzfUjhhgtg = 0;
        this.f679feyxiexzfUjhhgtg = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final void mo769Ujhhgtgfeyxiexzf(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m787Ujhhgtgfeyxiexzf()) {
            m792feyxiexzfUjhhgtg(3);
            return;
        }
        WeakReference weakReference = this.f685feyxiexzfUjhhgtg;
        if (weakReference != null && view2 == weakReference.get() && this.f679feyxiexzfUjhhgtg) {
            if (this.f678feyxiexzfUjhhgtg > 0) {
                if (!this.f639Ujhhgtgfeyxiexzf && view.getTop() > this.f668feyxiexzfUjhhgtg) {
                    i3 = 6;
                }
            } else if (this.f672feyxiexzfUjhhgtg) {
                VelocityTracker velocityTracker = this.f687Ujhhgtgfeyxiexzf;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f640Ujhhgtgfeyxiexzf);
                    yVelocity = this.f687Ujhhgtgfeyxiexzf.getYVelocity(this.f688Ujhhgtgfeyxiexzf);
                }
                if (m793feyxiexzfUjhhgtg(view, yVelocity)) {
                    i3 = 5;
                } else if (this.f678feyxiexzfUjhhgtg == 0) {
                    top2 = view.getTop();
                    if (this.f639Ujhhgtgfeyxiexzf) {
                        i2 = this.f668feyxiexzfUjhhgtg;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f670feyxiexzfUjhhgtg)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f670feyxiexzfUjhhgtg)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f667feyxiexzfUjhhgtg) >= Math.abs(top2 - this.f670feyxiexzfUjhhgtg)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.f639Ujhhgtgfeyxiexzf) {
                        top = view.getTop();
                        if (Math.abs(top - this.f668feyxiexzfUjhhgtg) < Math.abs(top - this.f670feyxiexzfUjhhgtg)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f678feyxiexzfUjhhgtg == 0) {
                top2 = view.getTop();
                if (this.f639Ujhhgtgfeyxiexzf) {
                    i2 = this.f668feyxiexzfUjhhgtg;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f670feyxiexzfUjhhgtg)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f670feyxiexzfUjhhgtg)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.f667feyxiexzfUjhhgtg) >= Math.abs(top2 - this.f670feyxiexzfUjhhgtg)) {
                    i3 = 4;
                }
            } else {
                if (!this.f639Ujhhgtgfeyxiexzf) {
                    top = view.getTop();
                    if (Math.abs(top - this.f668feyxiexzfUjhhgtg) < Math.abs(top - this.f670feyxiexzfUjhhgtg)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            m794feyxiexzfUjhhgtg(view, i3, false);
            this.f679feyxiexzfUjhhgtg = false;
        }
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final boolean mo770Ujhhgtgfeyxiexzf(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f675feyxiexzfUjhhgtg;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg = this.f676feyxiexzfUjhhgtg;
        if (c1900feyxiexzfUjhhgtg != null && (this.f674feyxiexzfUjhhgtg || i == 1)) {
            c1900feyxiexzfUjhhgtg.m3247Ujhhgtgfeyxiexzf(motionEvent);
        }
        if (actionMasked == 0) {
            this.f688Ujhhgtgfeyxiexzf = -1;
            this.f689Ujhhgtgfeyxiexzf = -1;
            VelocityTracker velocityTracker = this.f687Ujhhgtgfeyxiexzf;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f687Ujhhgtgfeyxiexzf = null;
            }
        }
        if (this.f687Ujhhgtgfeyxiexzf == null) {
            this.f687Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        this.f687Ujhhgtgfeyxiexzf.addMovement(motionEvent);
        if (this.f676feyxiexzfUjhhgtg != null && ((this.f674feyxiexzfUjhhgtg || this.f675feyxiexzfUjhhgtg == 1) && actionMasked == 2 && !this.f677feyxiexzfUjhhgtg)) {
            float fAbs = Math.abs(this.f689Ujhhgtgfeyxiexzf - motionEvent.getY());
            C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg2 = this.f676feyxiexzfUjhhgtg;
            if (fAbs > c1900feyxiexzfUjhhgtg2.f6335Ujhhgtgfeyxiexzf) {
                c1900feyxiexzfUjhhgtg2.m3239Ujhhgtgfeyxiexzf(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f677feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m783Ujhhgtgfeyxiexzf() {
        int iM785Ujhhgtgfeyxiexzf = m785Ujhhgtgfeyxiexzf();
        if (this.f639Ujhhgtgfeyxiexzf) {
            this.f670feyxiexzfUjhhgtg = Math.max(this.f683feyxiexzfUjhhgtg - iM785Ujhhgtgfeyxiexzf, this.f667feyxiexzfUjhhgtg);
        } else {
            this.f670feyxiexzfUjhhgtg = this.f683feyxiexzfUjhhgtg - iM785Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final float m784Ujhhgtgfeyxiexzf() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.f646Ujhhgtgfeyxiexzf != null && (weakReference = this.f684feyxiexzfUjhhgtg) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f684feyxiexzfUjhhgtg.get();
            if (m789feyxiexzfUjhhgtg() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM1365Ujhhgtgfeyxiexzf = this.f646Ujhhgtgfeyxiexzf.m1365Ujhhgtgfeyxiexzf();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fM1365Ujhhgtgfeyxiexzf <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fM1365Ujhhgtgfeyxiexzf;
                    }
                } else {
                    f = 0.0f;
                }
                C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f646Ujhhgtgfeyxiexzf;
                float fMo2475Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.f3978Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo2475Ujhhgtgfeyxiexzf > 0.0f) {
                        f2 = radius2 / fMo2475Ujhhgtgfeyxiexzf;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final int m785Ujhhgtgfeyxiexzf() {
        int i;
        if (this.f643Ujhhgtgfeyxiexzf) {
            return Math.min(Math.max(this.f644Ujhhgtgfeyxiexzf, this.f683feyxiexzfUjhhgtg - ((this.f682feyxiexzfUjhhgtg * 9) / 16)), this.f681feyxiexzfUjhhgtg) + this.f659Ujhhgtgfeyxiexzf;
        }
        return (this.f651Ujhhgtgfeyxiexzf || this.f652Ujhhgtgfeyxiexzf || (i = this.f650Ujhhgtgfeyxiexzf) <= 0) ? this.f642Ujhhgtgfeyxiexzf + this.f659Ujhhgtgfeyxiexzf : Math.max(this.f642Ujhhgtgfeyxiexzf, i + this.f645Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m786Ujhhgtgfeyxiexzf(int i) {
        if (((View) this.f684feyxiexzfUjhhgtg.get()) != null) {
            ArrayList arrayList = this.f686Ujhhgtgfeyxiexzf;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f670feyxiexzfUjhhgtg;
            if (i <= i2 && i2 != m787Ujhhgtgfeyxiexzf()) {
                m787Ujhhgtgfeyxiexzf();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m787Ujhhgtgfeyxiexzf() {
        if (this.f639Ujhhgtgfeyxiexzf) {
            return this.f667feyxiexzfUjhhgtg;
        }
        return Math.max(this.f666feyxiexzfUjhhgtg, this.f655Ujhhgtgfeyxiexzf ? 0 : this.f660Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m788feyxiexzfUjhhgtg(int i) {
        if (i == 3) {
            return m787Ujhhgtgfeyxiexzf();
        }
        if (i == 4) {
            return this.f670feyxiexzfUjhhgtg;
        }
        if (i == 5) {
            return this.f683feyxiexzfUjhhgtg;
        }
        if (i == 6) {
            return this.f668feyxiexzfUjhhgtg;
        }
        throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Invalid state to get top offset: "));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m789feyxiexzfUjhhgtg() {
        WeakReference weakReference = this.f684feyxiexzfUjhhgtg;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f684feyxiexzfUjhhgtg.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m790feyxiexzfUjhhgtg(int i) {
        if (i == -1) {
            if (this.f643Ujhhgtgfeyxiexzf) {
                return;
            } else {
                this.f643Ujhhgtgfeyxiexzf = true;
            }
        } else {
            if (!this.f643Ujhhgtgfeyxiexzf && this.f642Ujhhgtgfeyxiexzf == i) {
                return;
            }
            this.f643Ujhhgtgfeyxiexzf = false;
            this.f642Ujhhgtgfeyxiexzf = Math.max(0, i);
        }
        m798feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m791feyxiexzfUjhhgtg(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f672feyxiexzfUjhhgtg && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f639Ujhhgtgfeyxiexzf && m788feyxiexzfUjhhgtg(i) <= this.f667feyxiexzfUjhhgtg) ? 3 : i;
        WeakReference weakReference = this.f684feyxiexzfUjhhgtg;
        if (weakReference == null || weakReference.get() == null) {
            m792feyxiexzfUjhhgtg(i);
            return;
        }
        View view = (View) this.f684feyxiexzfUjhhgtg.get();
        RunnableC2349Ujhhgtgfeyxiexzf runnableC2349Ujhhgtgfeyxiexzf = new RunnableC2349Ujhhgtgfeyxiexzf(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (view.isAttachedToWindow()) {
                view.post(runnableC2349Ujhhgtgfeyxiexzf);
                return;
            }
        }
        runnableC2349Ujhhgtgfeyxiexzf.run();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m792feyxiexzfUjhhgtg(int i) {
        if (this.f675feyxiexzfUjhhgtg == i) {
            return;
        }
        this.f675feyxiexzfUjhhgtg = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f672feyxiexzfUjhhgtg;
        }
        WeakReference weakReference = this.f684feyxiexzfUjhhgtg;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m797feyxiexzfUjhhgtg(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m797feyxiexzfUjhhgtg(false);
        }
        m796feyxiexzfUjhhgtg(i, true);
        ArrayList arrayList = this.f686Ujhhgtgfeyxiexzf;
        if (arrayList.size() <= 0) {
            m795feyxiexzfUjhhgtg();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m793feyxiexzfUjhhgtg(View view, float f) {
        if (this.f673feyxiexzfUjhhgtg) {
            return true;
        }
        if (view.getTop() < this.f670feyxiexzfUjhhgtg) {
            return false;
        }
        return Math.abs(((f * this.f680feyxiexzfUjhhgtg) + ((float) view.getTop())) - ((float) this.f670feyxiexzfUjhhgtg)) / ((float) m785Ujhhgtgfeyxiexzf()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m792feyxiexzfUjhhgtg(2);
        m796feyxiexzfUjhhgtg(r4, true);
        r2.f664feyxiexzfUjhhgtg.m3692Ujhhgtgfeyxiexzf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m3252Ujhhgtgfeyxiexzf(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m794feyxiexzfUjhhgtg(View view, int i, boolean z) {
        int iM788feyxiexzfUjhhgtg = m788feyxiexzfUjhhgtg(i);
        C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg = this.f676feyxiexzfUjhhgtg;
        if (c1900feyxiexzfUjhhgtg != null) {
            if (!z) {
                int left = view.getLeft();
                c1900feyxiexzfUjhhgtg.f6351Ujhhgtgfeyxiexzf = view;
                c1900feyxiexzfUjhhgtg.f6336Ujhhgtgfeyxiexzf = -1;
                boolean zM3245Ujhhgtgfeyxiexzf = c1900feyxiexzfUjhhgtg.m3245Ujhhgtgfeyxiexzf(left, iM788feyxiexzfUjhhgtg, 0, 0);
                if (!zM3245Ujhhgtgfeyxiexzf && c1900feyxiexzfUjhhgtg.f6334Ujhhgtgfeyxiexzf == 0 && c1900feyxiexzfUjhhgtg.f6351Ujhhgtgfeyxiexzf != null) {
                    c1900feyxiexzfUjhhgtg.f6351Ujhhgtgfeyxiexzf = null;
                }
            }
        }
        m792feyxiexzfUjhhgtg(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final void m795feyxiexzfUjhhgtg() {
        View view;
        int iM4404Ujhhgtgfeyxiexzf;
        WeakReference weakReference = this.f684feyxiexzfUjhhgtg;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, 524288);
        AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
        AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, 262144);
        AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
        AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, 1048576);
        AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
        SparseIntArray sparseIntArray = this.f692feyxiexzfUjhhgtg;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, i);
            AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 6;
        if (!this.f639Ujhhgtgfeyxiexzf && this.f675feyxiexzfUjhhgtg != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = new C2501feyxiexzfUjhhgtg(i2, 3, this);
            ArrayList arrayListM3258Ujhhgtgfeyxiexzf = AbstractC1901feyxiexzfUjhhgtg.m3258Ujhhgtgfeyxiexzf(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListM3258Ujhhgtgfeyxiexzf.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = AbstractC1901feyxiexzfUjhhgtg.f6357Ujhhgtgfeyxiexzf;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListM3258Ujhhgtgfeyxiexzf.size(); i7++) {
                            z &= ((C2956feyxiexzfUjhhgtg) arrayListM3258Ujhhgtgfeyxiexzf.get(i7)).m4404Ujhhgtgfeyxiexzf() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iM4404Ujhhgtgfeyxiexzf = i5;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C2956feyxiexzfUjhhgtg) arrayListM3258Ujhhgtgfeyxiexzf.get(i3)).f9265Ujhhgtgfeyxiexzf).getLabel())) {
                    iM4404Ujhhgtgfeyxiexzf = ((C2956feyxiexzfUjhhgtg) arrayListM3258Ujhhgtgfeyxiexzf.get(i3)).m4404Ujhhgtgfeyxiexzf();
                    break;
                }
                i3++;
            }
            if (iM4404Ujhhgtgfeyxiexzf != -1) {
                C2956feyxiexzfUjhhgtg c2956feyxiexzfUjhhgtg = new C2956feyxiexzfUjhhgtg(null, iM4404Ujhhgtgfeyxiexzf, string, c2501feyxiexzfUjhhgtg, null);
                View.AccessibilityDelegate accessibilityDelegateM3256Ujhhgtgfeyxiexzf = AbstractC1901feyxiexzfUjhhgtg.m3256Ujhhgtgfeyxiexzf(view);
                C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = accessibilityDelegateM3256Ujhhgtgfeyxiexzf == null ? null : accessibilityDelegateM3256Ujhhgtgfeyxiexzf instanceof C2948feyxiexzfUjhhgtg ? ((C2948feyxiexzfUjhhgtg) accessibilityDelegateM3256Ujhhgtgfeyxiexzf).f9249Ujhhgtgfeyxiexzf : new C2949feyxiexzfUjhhgtg(accessibilityDelegateM3256Ujhhgtgfeyxiexzf);
                if (c2949feyxiexzfUjhhgtg == null) {
                    c2949feyxiexzfUjhhgtg = new C2949feyxiexzfUjhhgtg();
                }
                AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(view, c2949feyxiexzfUjhhgtg);
                AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, c2956feyxiexzfUjhhgtg.m4404Ujhhgtgfeyxiexzf());
                AbstractC1901feyxiexzfUjhhgtg.m3258Ujhhgtgfeyxiexzf(view).add(c2956feyxiexzfUjhhgtg);
                AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
            }
            sparseIntArray.put(0, iM4404Ujhhgtgfeyxiexzf);
        }
        if (this.f672feyxiexzfUjhhgtg) {
            int i8 = 5;
            if (this.f675feyxiexzfUjhhgtg != 5) {
                AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9259Ujhhgtgfeyxiexzf, new C2501feyxiexzfUjhhgtg(i8, 3, this));
            }
        }
        int i9 = this.f675feyxiexzfUjhhgtg;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9258Ujhhgtgfeyxiexzf, new C2501feyxiexzfUjhhgtg(this.f639Ujhhgtgfeyxiexzf ? 4 : 6, 3, this));
            return;
        }
        if (i9 == 4) {
            AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9257Ujhhgtgfeyxiexzf, new C2501feyxiexzfUjhhgtg(this.f639Ujhhgtgfeyxiexzf ? 3 : 6, 3, this));
        } else {
            if (i9 != 6) {
                return;
            }
            AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9258Ujhhgtgfeyxiexzf, new C2501feyxiexzfUjhhgtg(i10, 3, this));
            AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9257Ujhhgtgfeyxiexzf, new C2501feyxiexzfUjhhgtg(i11, 3, this));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void m796feyxiexzfUjhhgtg(int i, boolean z) {
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f675feyxiexzfUjhhgtg == 3 && (this.f661Ujhhgtgfeyxiexzf || m789feyxiexzfUjhhgtg());
        if (this.f663feyxiexzfUjhhgtg == z2 || (c0226Ujhhgtgfeyxiexzf = this.f646Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        this.f663feyxiexzfUjhhgtg = z2;
        ValueAnimator valueAnimator = this.f665feyxiexzfUjhhgtg;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c0226Ujhhgtgfeyxiexzf.m1370Ujhhgtgfeyxiexzf(this.f663feyxiexzfUjhhgtg ? m784Ujhhgtgfeyxiexzf() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf, z2 ? m784Ujhhgtgfeyxiexzf() : 1.0f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m797feyxiexzfUjhhgtg(boolean z) {
        WeakReference weakReference = this.f684feyxiexzfUjhhgtg;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f691Ujhhgtgfeyxiexzf != null) {
                    return;
                } else {
                    this.f691Ujhhgtgfeyxiexzf = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f684feyxiexzfUjhhgtg.get() && z) {
                    this.f691Ujhhgtgfeyxiexzf.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f691Ujhhgtgfeyxiexzf = null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m798feyxiexzfUjhhgtg() {
        View view;
        if (this.f684feyxiexzfUjhhgtg != null) {
            m783Ujhhgtgfeyxiexzf();
            if (this.f675feyxiexzfUjhhgtg != 4 || (view = (View) this.f684feyxiexzfUjhhgtg.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f638Ujhhgtgfeyxiexzf = 0;
        int i2 = 1;
        this.f639Ujhhgtgfeyxiexzf = true;
        this.f648Ujhhgtgfeyxiexzf = -1;
        this.f649Ujhhgtgfeyxiexzf = -1;
        this.f664feyxiexzfUjhhgtg = new C2450feyxiexzfUjhhgtg(this);
        this.f669feyxiexzfUjhhgtg = 0.5f;
        this.f671feyxiexzfUjhhgtg = -1.0f;
        this.f674feyxiexzfUjhhgtg = true;
        this.f675feyxiexzfUjhhgtg = 4;
        this.f680feyxiexzfUjhhgtg = 0.1f;
        this.f686Ujhhgtgfeyxiexzf = new ArrayList();
        this.f689Ujhhgtgfeyxiexzf = -1;
        this.f692feyxiexzfUjhhgtg = new SparseIntArray();
        this.f693feyxiexzfUjhhgtg = new C2668feyxiexzfUjhhgtg(this, 0);
        this.f645Ujhhgtgfeyxiexzf = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3118Ujhhgtgfeyxiexzf);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f647Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f662feyxiexzfUjhhgtg = C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m2507Ujhhgtgfeyxiexzf();
        }
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f662feyxiexzfUjhhgtg;
        if (c1017feyxiexzfUjhhgtg != null) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg);
            this.f646Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf;
            c0226Ujhhgtgfeyxiexzf.m1367Ujhhgtgfeyxiexzf(context);
            ColorStateList colorStateList = this.f647Ujhhgtgfeyxiexzf;
            if (colorStateList != null) {
                this.f646Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f646Ujhhgtgfeyxiexzf.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m784Ujhhgtgfeyxiexzf(), 1.0f);
        this.f665feyxiexzfUjhhgtg = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f665feyxiexzfUjhhgtg.addUpdateListener(new C2478feyxiexzfUjhhgtg(i2, this));
        this.f671feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f648Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f649Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m790feyxiexzfUjhhgtg(i);
        } else {
            m790feyxiexzfUjhhgtg(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f672feyxiexzfUjhhgtg != z) {
            this.f672feyxiexzfUjhhgtg = z;
            if (!z && this.f675feyxiexzfUjhhgtg == 5) {
                m791feyxiexzfUjhhgtg(4);
            }
            m795feyxiexzfUjhhgtg();
        }
        this.f651Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f639Ujhhgtgfeyxiexzf != z2) {
            this.f639Ujhhgtgfeyxiexzf = z2;
            if (this.f684feyxiexzfUjhhgtg != null) {
                m783Ujhhgtgfeyxiexzf();
            }
            m792feyxiexzfUjhhgtg((this.f639Ujhhgtgfeyxiexzf && this.f675feyxiexzfUjhhgtg == 6) ? 3 : this.f675feyxiexzfUjhhgtg);
            m796feyxiexzfUjhhgtg(this.f675feyxiexzfUjhhgtg, true);
            m795feyxiexzfUjhhgtg();
        }
        this.f673feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f674feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f638Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f669feyxiexzfUjhhgtg = f;
            if (this.f684feyxiexzfUjhhgtg != null) {
                this.f668feyxiexzfUjhhgtg = (int) ((1.0f - f) * this.f683feyxiexzfUjhhgtg);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f666feyxiexzfUjhhgtg = i3;
                    m796feyxiexzfUjhhgtg(this.f675feyxiexzfUjhhgtg, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f666feyxiexzfUjhhgtg = dimensionPixelOffset;
                    m796feyxiexzfUjhhgtg(this.f675feyxiexzfUjhhgtg, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f641Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f652Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f653Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f654Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f655Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f656Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f657Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f658Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f661Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f640Ujhhgtgfeyxiexzf = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo765Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
