package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC0745;
import p000.AbstractC0968;
import p000.AbstractC1194;
import p000.AbstractC1459;
import p000.AbstractC2466;
import p000.AbstractC2482;
import p000.AbstractC2486;
import p000.AbstractC2487;
import p000.AbstractC2488;
import p000.AbstractC2491;
import p000.AbstractC2493;
import p000.AbstractC2495;
import p000.AbstractC2506;
import p000.AbstractC2508;
import p000.AbstractC2665;
import p000.AbstractC2784;
import p000.AbstractC3573;
import p000.AbstractC3578;
import p000.C0145;
import p000.C0146;
import p000.C0575;
import p000.C0662;
import p000.C0689;
import p000.C0997;
import p000.C1040;
import p000.C1275;
import p000.C1439;
import p000.C1682;
import p000.C1790;
import p000.C1863;
import p000.C2136;
import p000.C2139;
import p000.C2377;
import p000.C2481;
import p000.C2492;
import p000.C2496;
import p000.C2497;
import p000.C2498;
import p000.C2500;
import p000.C2501;
import p000.C2504;
import p000.C2505;
import p000.C2510;
import p000.C2705;
import p000.C2825;
import p000.C3584;
import p000.InterfaceC2485;
import p000.InterfaceC2494;
import p000.InterfaceC2499;
import p000.InterpolatorC1680;
import p000.RunnableC1441;
import p000.RunnableC2480;
import p000.RunnableC2507;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲈᲁ, reason: contains not printable characters */
    public static boolean f347 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᤞᲈ, reason: contains not printable characters */
    public static boolean f348 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᲈᤞ, reason: contains not printable characters */
    public static final int[] f349 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ, reason: contains not printable characters */
    public static final float f350 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ, reason: contains not printable characters */
    public static final boolean f351 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ, reason: contains not printable characters */
    public static final boolean f352 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ, reason: contains not printable characters */
    public static final Class[] f353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public static final InterpolatorC1680 f354;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᲈᤞ, reason: contains not printable characters */
    public static final C2505 f355;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f356;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2500 f357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2498 f358;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2501 f359;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0146 f360;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0575 f361;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2825 f362;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f363;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final RunnableC2480 f364;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Rect f365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Rect f366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final RectF f367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public AbstractC2482 f368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public AbstractC2491 f369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final ArrayList f370;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final ArrayList f371;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final ArrayList f372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public InterfaceC2494 f373;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f374;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f375;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f376;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public int f377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public boolean f378;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public boolean f379;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public boolean f380;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public int f381;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public boolean f382;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final AccessibilityManager f383;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public ArrayList f384;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public boolean f385;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public boolean f386;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f387;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int f388;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public AbstractC2486 f389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public EdgeEffect f390;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public EdgeEffect f391;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public EdgeEffect f392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public EdgeEffect f393;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public AbstractC2487 f394;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public int f395;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public int f396;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public VelocityTracker f397;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public int f398;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public int f399;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public int f400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public int f401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public int f402;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public final int f403;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public final int f404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public final float f405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public final float f406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public boolean f407;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final RunnableC2507 f408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public RunnableC1441 f409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public final C1439 f410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public final C2504 f411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public AbstractC2495 f412;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public ArrayList f413;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public boolean f414;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public boolean f415;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final C2481 f416;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public boolean f417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public C2510 f418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public final int[] f419;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public C2136 f420;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public final int[] f421;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public final int[] f422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public final int[] f423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ, reason: contains not printable characters */
    public final ArrayList f424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ, reason: contains not printable characters */
    public final RunnableC2480 f425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ, reason: contains not printable characters */
    public boolean f426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ, reason: contains not printable characters */
    public int f427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
    public int f428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ, reason: contains not printable characters */
    public final boolean f429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ, reason: contains not printable characters */
    public final C2481 f430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
    public final C1040 f431;

    static {
        Class cls = Integer.TYPE;
        f353 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f354 = new InterpolatorC1680(2);
        f355 = new C2505();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, me.hd.wauxv.R.attr.recyclerViewStyle);
    }

    private C2136 getScrollingChildHelper() {
        if (this.f420 == null) {
            this.f420 = new C2136(this);
        }
        return this.f420;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f347 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f348 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static void m201(AbstractC2508 abstractC2508) {
        WeakReference weakReference = abstractC2508.f8007;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC2508.f8006) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC2508.f8007 = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static int m202(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC0968.m2472(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC0968.m2478(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC0968.m2472(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC0968.m2478(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static RecyclerView m203(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM203 = m203(viewGroup.getChildAt(i));
            if (recyclerViewM203 != null) {
                return recyclerViewM203;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static AbstractC2508 m204(View view) {
        if (view == null) {
            return null;
        }
        return ((C2492) view.getLayoutParams()).f7956;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            abstractC2491.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2492) && this.f369.mo107((C2492) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null && abstractC2491.mo152()) {
            return this.f369.mo156(this.f411);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null && abstractC2491.mo152()) {
            return this.f369.mo108(this.f411);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null && abstractC2491.mo152()) {
            return this.f369.mo109(this.f411);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null && abstractC2491.mo153()) {
            return this.f369.mo157(this.f411);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null && abstractC2491.mo153()) {
            return this.f369.mo110(this.f411);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null && abstractC2491.mo153()) {
            return this.f369.mo111(this.f411);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC2491 layoutManager = getLayoutManager();
        int iMo2040 = 0;
        if (layoutManager != null) {
            if (layoutManager.mo153()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m255(0, measuredHeight, false);
                        return true;
                    }
                    m255(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo160 = layoutManager.mo160();
                    if (keyCode == 122) {
                        if (zMo160) {
                            iMo2040 = getAdapter().mo2040();
                        }
                    } else if (!zMo160) {
                        iMo2040 = getAdapter().mo2040();
                    }
                    m256(iMo2040);
                    return true;
                }
            } else if (layoutManager.mo152()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m255(measuredWidth, 0, false);
                        return true;
                    }
                    m255(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo161 = layoutManager.mo160();
                    if (keyCode2 == 122) {
                        if (zMo161) {
                            iMo2040 = getAdapter().mo2040();
                        }
                    } else if (!zMo161) {
                        iMo2040 = getAdapter().mo2040();
                    }
                    m256(iMo2040);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m3944(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m3945(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3946(iArr, i, i2, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m3947(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f371;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC2488) arrayList.get(i)).mo1959(canvas, this);
        }
        EdgeEffect edgeEffect = this.f390;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f363 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f390;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f391;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f363) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f391;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f392;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f363 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f392;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f393;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f363) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f393;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f394 == null || arrayList.size() <= 0 || !this.f394.mo2568()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x0198  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewMo117;
        int i2;
        byte b;
        boolean z;
        this.f369.getClass();
        boolean z2 = true;
        boolean z3 = (this.f368 == null || this.f369 == null || m235() || this.f379) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C2504 c2504 = this.f411;
        C2498 c2498 = this.f358;
        if (z3 && (i == 2 || i == 1)) {
            if (this.f369.mo153()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? Opcodes.IXOR : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.f369.mo152()) {
                z = focusFinder.findNextFocus(this, view, (this.f369.f7942.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                m210();
                if (m225(view) != null) {
                    m257();
                    this.f369.mo117(view, i, c2498, c2504);
                    m259(false);
                }
                return null;
            }
            viewMo117 = focusFinder.findNextFocus(this, view, i);
            if (viewMo117 == null) {
            }
            if (viewMo117 != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                return viewMo117;
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z3) {
            m210();
            if (m225(view) != null) {
                m257();
                viewMo117 = this.f369.mo117(view, i, c2498, c2504);
                m259(false);
            }
            return null;
        }
        viewMo117 = viewFindNextFocus;
        if (viewMo117 == null && !viewMo117.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m250(viewMo117, null);
            return view;
        }
        if (viewMo117 != null || viewMo117 == this || viewMo117 == view) {
            z2 = false;
        } else if (m225(viewMo117) == null) {
            z2 = false;
        } else if (view != null && m225(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f365;
            rect.set(0, 0, width, height);
            int width2 = viewMo117.getWidth();
            int height2 = viewMo117.getHeight();
            Rect rect2 = this.f366;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewMo117, rect2);
            int i3 = this.f369.f7942.getLayoutDirection() == 1 ? -1 : 1;
            int i4 = rect.left;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    StringBuilder sb = new StringBuilder("Invalid direction: ");
                                    sb.append(i);
                                    throw new IllegalArgumentException(AbstractC2784.m4747(this, sb));
                                }
                                if (b <= 0) {
                                    z2 = false;
                                }
                            } else if (i2 <= 0) {
                                z2 = false;
                            }
                        } else if (b >= 0) {
                            z2 = false;
                        }
                    } else if (i2 >= 0) {
                        z2 = false;
                    }
                } else if (b <= 0 && (b != 0 || i2 * i3 <= 0)) {
                    z2 = false;
                }
            } else if (b >= 0 && (b != 0 || i2 * i3 >= 0)) {
                z2 = false;
            }
        }
        if (z2) {
            return viewMo117;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            return abstractC2491.mo112();
        }
        throw new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            return abstractC2491.mo113(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC2482 getAdapter() {
        return this.f368;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null) {
            return super.getBaseline();
        }
        abstractC2491.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f363;
    }

    public C2510 getCompatAccessibilityDelegate() {
        return this.f418;
    }

    public AbstractC2486 getEdgeEffectFactory() {
        return this.f389;
    }

    public AbstractC2487 getItemAnimator() {
        return this.f394;
    }

    public int getItemDecorationCount() {
        return this.f371.size();
    }

    public AbstractC2491 getLayoutManager() {
        return this.f369;
    }

    public int getMaxFlingVelocity() {
        return this.f404;
    }

    public int getMinFlingVelocity() {
        return this.f403;
    }

    public long getNanoTime() {
        if (f352) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC2493 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f407;
    }

    public C2497 getRecycledViewPool() {
        return this.f358.m4492();
    }

    public int getScrollState() {
        return this.f395;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m3949(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f374;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f379;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f7074;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f387 = 0;
        this.f374 = true;
        this.f376 = this.f376 && !isLayoutRequested();
        this.f358.m4493();
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            abstractC2491.f7947 = true;
            abstractC2491.mo616(this);
        }
        this.f417 = false;
        if (f352) {
            ThreadLocal threadLocal = RunnableC1441.f5104;
            RunnableC1441 runnableC1441 = (RunnableC1441) threadLocal.get();
            this.f409 = runnableC1441;
            if (runnableC1441 == null) {
                this.f409 = new RunnableC1441();
                Field field = AbstractC3578.f11184;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1441 runnableC1442 = this.f409;
                runnableC1442.f5108 = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1442);
            }
            ArrayList arrayList = this.f409.f5106;
            if (f347 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC1441 runnableC1441;
        super.onDetachedFromWindow();
        AbstractC2487 abstractC2487 = this.f394;
        if (abstractC2487 != null) {
            abstractC2487.mo2567();
        }
        m261();
        int i = 0;
        this.f374 = false;
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            abstractC2491.f7947 = false;
            abstractC2491.mo161(this);
        }
        this.f424.clear();
        removeCallbacks(this.f425);
        this.f362.getClass();
        while (C3584.f11215.mo1312() != null) {
        }
        C2498 c2498 = this.f358;
        ArrayList arrayList = c2498.f7969;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC1459.m3175(((AbstractC2508) arrayList.get(i2)).f8006);
        }
        c2498.m4494(c2498.f7974.f368, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C2377 c2377 = (C2377) childAt.getTag(me.hd.wauxv.R.id.pooling_container_listener_holder_tag);
            if (c2377 == null) {
                c2377 = new C2377();
                childAt.setTag(me.hd.wauxv.R.id.pooling_container_listener_holder_tag, c2377);
            }
            ArrayList arrayList2 = c2377.f7632;
            int iM2211 = AbstractC0745.m2211(arrayList2);
            if (-1 < iM2211) {
                arrayList2.get(iM2211).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!f352 || (runnableC1441 = this.f409) == null) {
            return;
        }
        boolean zRemove = runnableC1441.f5106.remove(this);
        if (f347 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f409 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f371;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2488) arrayList.get(i)).mo3411(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.f369 != null && !this.f379 && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.f369.mo153() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f369.mo152() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f369.mo153()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.f369.mo152()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.f429;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f406);
            int i3 = (int) (axisValue * this.f405);
            if (z) {
                OverScroller overScroller = this.f408.f8000;
                m255((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                AbstractC2491 abstractC2491 = this.f369;
                if (abstractC2491 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f379) {
                    int[] iArr = this.f423;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo152 = abstractC2491.mo152();
                    boolean zMo153 = this.f369.mo153();
                    int i4 = zMo153 ? (zMo152 ? 1 : 0) | 2 : zMo152 ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM247 = i3 - m247(i3, y);
                    int iM248 = i2 - m248(i2, x);
                    getScrollingChildHelper().m3950(i4, 1);
                    if (m216(this.f423, zMo152 ? iM247 : 0, zMo153 ? iM248 : 0, 1, this.f421)) {
                        iM247 -= iArr[0];
                        iM248 -= iArr[1];
                    }
                    m251(zMo152 ? iM247 : 0, zMo153 ? iM248 : 0, motionEvent, 1);
                    RunnableC1441 runnableC1441 = this.f409;
                    if (runnableC1441 != null && (iM247 != 0 || iM248 != 0)) {
                        runnableC1441.m3137(this, iM247, iM248);
                    }
                    m260(1);
                }
            }
            if (i != 0 && !z) {
                this.f431.m2606(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f379) {
            this.f373 = null;
            if (m226(motionEvent)) {
                VelocityTracker velocityTracker = this.f397;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m260(0);
                m246();
                setScrollState(0);
                return true;
            }
            AbstractC2491 abstractC2491 = this.f369;
            if (abstractC2491 != null) {
                boolean zMo152 = abstractC2491.mo152();
                boolean zMo153 = this.f369.mo153();
                if (this.f397 == null) {
                    this.f397 = VelocityTracker.obtain();
                }
                this.f397.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f380) {
                        this.f380 = false;
                    }
                    this.f396 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f400 = x;
                    this.f398 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f401 = y;
                    this.f399 = y;
                    EdgeEffect edgeEffect = this.f390;
                    if (edgeEffect == null || AbstractC0968.m2472(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        AbstractC0968.m2478(this.f390, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f392;
                    if (edgeEffect2 != null && AbstractC0968.m2472(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC0968.m2478(this.f392, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.f391;
                    if (edgeEffect3 != null && AbstractC0968.m2472(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC0968.m2478(this.f391, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.f393;
                    if (edgeEffect4 != null && AbstractC0968.m2472(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC0968.m2478(this.f393, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.f395 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m260(1);
                    }
                    int[] iArr = this.f422;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m258(0);
                } else if (actionMasked == 1) {
                    this.f397.clear();
                    m260(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f396);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f396 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f395 != 1) {
                        int i = x2 - this.f398;
                        int i2 = y2 - this.f399;
                        if (!zMo152 || Math.abs(i) <= this.f402) {
                            z2 = false;
                        } else {
                            this.f400 = x2;
                            z2 = true;
                        }
                        if (zMo153 && Math.abs(i2) > this.f402) {
                            this.f401 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f397;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m260(0);
                    m246();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f396 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f400 = x3;
                    this.f398 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f401 = y3;
                    this.f399 = y3;
                } else if (actionMasked == 6) {
                    m241(motionEvent);
                }
                if (this.f395 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m213();
        Trace.endSection();
        this.f376 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null) {
            m211(i, i2);
            return;
        }
        boolean zMo159 = abstractC2491.mo159();
        boolean z = false;
        C2504 c2504 = this.f411;
        if (zMo159) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f369.f7942.m211(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f426 = z;
            if (z || this.f368 == null) {
                return;
            }
            if (c2504.f7987 == 1) {
                m214();
            }
            this.f369.m4482(i, i2);
            c2504.f7992 = true;
            m215();
            this.f369.m4483(i, i2);
            if (this.f369.mo166()) {
                this.f369.m4482(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c2504.f7992 = true;
                m215();
                this.f369.m4483(i, i2);
            }
            this.f427 = getMeasuredWidth();
            this.f428 = getMeasuredHeight();
            return;
        }
        if (this.f375) {
            this.f369.f7942.m211(i, i2);
            return;
        }
        if (this.f382) {
            m257();
            m239();
            m243();
            m240(true);
            if (c2504.f7994) {
                c2504.f7990 = true;
            } else {
                this.f360.m1166();
                c2504.f7990 = false;
            }
            this.f382 = false;
            m259(false);
        } else if (c2504.f7994) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC2482 abstractC2482 = this.f368;
        if (abstractC2482 != null) {
            c2504.f7988 = abstractC2482.mo2040();
        } else {
            c2504.f7988 = 0;
        }
        m257();
        this.f369.f7942.m211(i, i2);
        m259(false);
        c2504.f7990 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m235()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2501)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2501 c2501 = (C2501) parcelable;
        this.f359 = c2501;
        super.onRestoreInstanceState(c2501.f986);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2501 c2501 = new C2501(super.onSaveInstanceState());
        C2501 c2502 = this.f359;
        if (c2502 != null) {
            c2501.f7976 = c2502.f7976;
            return c2501;
        }
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            c2501.f7976 = abstractC2491.mo164();
            return c2501;
        }
        c2501.f7976 = null;
        return c2501;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f393 = null;
        this.f391 = null;
        this.f392 = null;
        this.f390 = null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[PHI: r1
      0x0111: PHI (r1v45 int) = (r1v31 int), (r1v49 int) binds: [B:56:0x00fa, B:60:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM226;
        boolean z;
        if (!this.f379 && !this.f380) {
            InterfaceC2494 interfaceC2494 = this.f373;
            if (interfaceC2494 == null) {
                zM226 = motionEvent.getAction() == 0 ? false : m226(motionEvent);
            } else {
                interfaceC2494.mo3005(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f373 = null;
                }
                zM226 = true;
            }
            if (zM226) {
                VelocityTracker velocityTracker = this.f397;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m260(0);
                m246();
                setScrollState(0);
                return true;
            }
            AbstractC2491 abstractC2491 = this.f369;
            if (abstractC2491 != null) {
                boolean zMo152 = abstractC2491.mo152();
                boolean zMo153 = this.f369.mo153();
                if (this.f397 == null) {
                    this.f397 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f422;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f397.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f397;
                        int i = this.f404;
                        velocityTracker2.computeCurrentVelocity(1000, i);
                        float f = zMo152 ? -this.f397.getXVelocity(this.f396) : 0.0f;
                        float f2 = zMo153 ? -this.f397.getYVelocity(this.f396) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !m229((int) f, (int) f2, this.f403, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f397;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        m260(0);
                        m246();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f396);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f396 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f400 - x;
                        int iMax2 = this.f401 - y;
                        if (this.f395 != 1) {
                            if (zMo152) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.f402) : Math.min(0, iMax + this.f402);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zMo153) {
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f402) : Math.min(0, iMax2 + this.f402);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.f395 == 1) {
                            int[] iArr2 = this.f423;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iM247 = iMax - m247(iMax, motionEvent.getY());
                            int iM248 = iMax2 - m248(iMax2, motionEvent.getX());
                            boolean zM216 = m216(this.f423, zMo152 ? iM247 : 0, zMo153 ? iM248 : 0, 0, this.f421);
                            int[] iArr3 = this.f421;
                            if (zM216) {
                                iM247 -= iArr2[0];
                                iM248 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i2 = iM247;
                            int i3 = iM248;
                            this.f400 = x - iArr3[0];
                            this.f401 = y - iArr3[1];
                            if (m251(zMo152 ? i2 : 0, zMo153 ? i3 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC1441 runnableC1441 = this.f409;
                            if (runnableC1441 != null && (i2 != 0 || i3 != 0)) {
                                runnableC1441.m3137(this, i2, i3);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f397;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        m260(0);
                        m246();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f396 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f400 = x2;
                        this.f398 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f401 = y2;
                        this.f399 = y2;
                    } else if (actionMasked == 6) {
                        m241(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f396 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.f400 = x3;
                this.f398 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.f401 = y3;
                this.f399 = y3;
                m258(0);
                this.f397.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC2508 abstractC2508M204 = m204(view);
        if (abstractC2508M204 != null) {
            if (abstractC2508M204.m4520()) {
                abstractC2508M204.f8015 &= -257;
            } else if (!abstractC2508M204.m4525()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC2508M204);
                throw new IllegalArgumentException(AbstractC2784.m4747(this, sb));
            }
        } else if (f347) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC2784.m4747(this, sb2));
        }
        view.clearAnimation();
        m212(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C1790 c1790 = this.f369.f7945;
        if ((c1790 == null || !c1790.f5956) && !m235() && view2 != null) {
            m250(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f369.mo667(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f372;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC2494) arrayList.get(i)).mo3007(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f377 != 0 || this.f379) {
            this.f378 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f379) {
            return;
        }
        boolean zMo152 = abstractC2491.mo152();
        boolean zMo153 = this.f369.mo153();
        if (zMo152 || zMo153) {
            if (!zMo152) {
                i = 0;
            }
            if (!zMo153) {
                i2 = 0;
            }
            m251(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m235()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f381 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C2510 c2510) {
        this.f418 = c2510;
        AbstractC3578.m5177(this, c2510);
    }

    public void setAdapter(AbstractC2482 abstractC2482) {
        setLayoutFrozen(false);
        AbstractC2482 abstractC2483 = this.f368;
        C2500 c2500 = this.f357;
        if (abstractC2483 != null) {
            abstractC2483.f7926.unregisterObserver(c2500);
            this.f368.mo2356();
        }
        AbstractC2487 abstractC2487 = this.f394;
        if (abstractC2487 != null) {
            abstractC2487.mo2567();
        }
        AbstractC2491 abstractC2491 = this.f369;
        C2498 c2498 = this.f358;
        if (abstractC2491 != null) {
            abstractC2491.m4475(c2498);
            this.f369.m4476(c2498);
        }
        c2498.f7967.clear();
        c2498.m4495();
        C0146 c0146 = this.f360;
        c0146.m1184((ArrayList) c0146.f1151);
        c0146.m1184((ArrayList) c0146.f1152);
        c0146.f1149 = 0;
        AbstractC2482 abstractC2484 = this.f368;
        this.f368 = abstractC2482;
        if (abstractC2482 != null) {
            abstractC2482.f7926.registerObserver(c2500);
            abstractC2482.mo2354(this);
        }
        AbstractC2491 abstractC2492 = this.f369;
        if (abstractC2492 != null) {
            abstractC2492.mo265(this.f368);
        }
        AbstractC2482 abstractC2485 = this.f368;
        c2498.f7967.clear();
        c2498.m4495();
        c2498.m4494(abstractC2484, true);
        C2497 c2497M4492 = c2498.m4492();
        if (abstractC2484 != null) {
            c2497M4492.f7965--;
        }
        if (c2497M4492.f7965 == 0) {
            SparseArray sparseArray = c2497M4492.f7964;
            for (int i = 0; i < sparseArray.size(); i++) {
                C2496 c2496 = (C2496) sparseArray.valueAt(i);
                Iterator it = c2496.f7960.iterator();
                while (it.hasNext()) {
                    AbstractC1459.m3175(((AbstractC2508) it.next()).f8006);
                }
                c2496.f7960.clear();
            }
        }
        if (abstractC2485 != null) {
            c2497M4492.f7965++;
        }
        c2498.m4493();
        this.f411.f7989 = true;
        m244(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC2485 interfaceC2485) {
        if (interfaceC2485 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(interfaceC2485 != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f363) {
            this.f393 = null;
            this.f391 = null;
            this.f392 = null;
            this.f390 = null;
        }
        this.f363 = z;
        super.setClipToPadding(z);
        if (this.f376) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC2486 abstractC2486) {
        abstractC2486.getClass();
        this.f389 = abstractC2486;
        this.f393 = null;
        this.f391 = null;
        this.f392 = null;
        this.f390 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f375 = z;
    }

    public void setItemAnimator(AbstractC2487 abstractC2487) {
        AbstractC2487 abstractC2488 = this.f394;
        if (abstractC2488 != null) {
            abstractC2488.mo2567();
            this.f394.f7929 = null;
        }
        this.f394 = abstractC2487;
        if (abstractC2487 != null) {
            abstractC2487.f7929 = this.f416;
        }
    }

    public void setItemViewCacheSize(int i) {
        C2498 c2498 = this.f358;
        c2498.f7971 = i;
        c2498.m4502();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC2491 abstractC2491) {
        if (abstractC2491 == this.f369) {
            return;
        }
        m261();
        AbstractC2491 abstractC2492 = this.f369;
        C2498 c2498 = this.f358;
        if (abstractC2492 != null) {
            AbstractC2487 abstractC2487 = this.f394;
            if (abstractC2487 != null) {
                abstractC2487.mo2567();
            }
            this.f369.m4475(c2498);
            this.f369.m4476(c2498);
            c2498.f7967.clear();
            c2498.m4495();
            if (this.f374) {
                AbstractC2491 abstractC2493 = this.f369;
                abstractC2493.f7947 = false;
                abstractC2493.mo161(this);
            }
            this.f369.m4484(null);
            this.f369 = null;
        } else {
            c2498.f7967.clear();
            c2498.m4495();
        }
        C0575 c0575 = this.f361;
        RecyclerView recyclerView = ((C2481) c0575.f2343).f7925;
        ((C0689) c0575.f2344).m2076();
        ArrayList arrayList = (ArrayList) c0575.f2345;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2508 abstractC2508M204 = m204((View) arrayList.get(size));
            if (abstractC2508M204 != null) {
                int i = abstractC2508M204.f8021;
                if (recyclerView.m235()) {
                    abstractC2508M204.f8022 = i;
                    recyclerView.f424.add(abstractC2508M204);
                } else {
                    abstractC2508M204.f8006.setImportantForAccessibility(i);
                }
                abstractC2508M204.f8021 = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.m212(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f369 = abstractC2491;
        if (abstractC2491 != null) {
            if (abstractC2491.f7942 != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC2491);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC2784.m4747(abstractC2491.f7942, sb));
            }
            abstractC2491.m4484(this);
            if (this.f374) {
                AbstractC2491 abstractC2494 = this.f369;
                abstractC2494.f7947 = true;
                abstractC2494.mo616(this);
            }
        }
        c2498.m4502();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C2136 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f7074) {
            ViewGroup viewGroup = scrollingChildHelper.f7073;
            Field field = AbstractC3578.f11184;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f7074 = z;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2495 abstractC2495) {
        this.f412 = abstractC2495;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f407 = z;
    }

    public void setRecycledViewPool(C2497 c2497) {
        C2498 c2498 = this.f358;
        RecyclerView recyclerView = c2498.f7974;
        c2498.m4494(recyclerView.f368, false);
        C2497 c2499 = c2498.f7973;
        if (c2499 != null) {
            c2499.f7965--;
        }
        c2498.f7973 = c2497;
        if (c2497 != null && recyclerView.getAdapter() != null) {
            c2498.f7973.f7965++;
        }
        c2498.m4493();
    }

    public void setScrollState(int i) {
        C1790 c1790;
        if (i == this.f395) {
            return;
        }
        if (f348) {
            StringBuilder sbM2787 = AbstractC1194.m2787(i, "setting scroll state to ", " from ");
            sbM2787.append(this.f395);
            Log.d("RecyclerView", sbM2787.toString(), new Exception());
        }
        this.f395 = i;
        if (i != 2) {
            RunnableC2507 runnableC2507 = this.f408;
            runnableC2507.f8004.removeCallbacks(runnableC2507);
            runnableC2507.f8000.abortAnimation();
            AbstractC2491 abstractC2491 = this.f369;
            if (abstractC2491 != null && (c1790 = abstractC2491.f7945) != null) {
                c1790.m3528();
            }
        }
        AbstractC2491 abstractC2492 = this.f369;
        if (abstractC2492 != null) {
            abstractC2492.mo266(i);
        }
        AbstractC2495 abstractC2495 = this.f412;
        if (abstractC2495 != null) {
            abstractC2495.mo4488(this, i);
        }
        ArrayList arrayList = this.f413;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2495) this.f413.get(size)).mo4488(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f402 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f402 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC2506 abstractC2506) {
        this.f358.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m3950(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m3951(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f379) {
            m207("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f379 = true;
                this.f380 = true;
                m261();
                return;
            }
            this.f379 = false;
            if (this.f378 && this.f369 != null && this.f368 != null) {
                requestLayout();
            }
            this.f378 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m205(AbstractC2508 abstractC2508) {
        View view = abstractC2508.f8006;
        boolean z = view.getParent() == this;
        this.f358.m4501(m232(view));
        if (abstractC2508.m4520()) {
            this.f361.m1985(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f361.m1984(view, -1, true);
            return;
        }
        C0575 c0575 = this.f361;
        int iIndexOfChild = ((C2481) c0575.f2343).f7925.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0689) c0575.f2344).m2077(iIndexOfChild);
            c0575.m1998(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m206(AbstractC2488 abstractC2488) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            abstractC2491.mo151("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f371;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC2488);
        m237();
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m207(String str) {
        if (m235()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f388 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder(""))));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m208() {
        int iM1997 = this.f361.m1997();
        for (int i = 0; i < iM1997; i++) {
            AbstractC2508 abstractC2508M204 = m204(this.f361.m1996(i));
            if (!abstractC2508M204.m4525()) {
                abstractC2508M204.f8009 = -1;
                abstractC2508M204.f8012 = -1;
            }
        }
        C2498 c2498 = this.f358;
        ArrayList arrayList = c2498.f7967;
        ArrayList arrayList2 = c2498.f7969;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC2508 abstractC2508 = (AbstractC2508) arrayList2.get(i2);
            abstractC2508.f8009 = -1;
            abstractC2508.f8012 = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC2508 abstractC2509 = (AbstractC2508) arrayList.get(i3);
            abstractC2509.f8009 = -1;
            abstractC2509.f8012 = -1;
        }
        ArrayList arrayList3 = c2498.f7968;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC2508 abstractC25010 = (AbstractC2508) c2498.f7968.get(i4);
                abstractC25010.f8009 = -1;
                abstractC25010.f8012 = -1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m209(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f390;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f390.onRelease();
            zIsFinished = this.f390.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f392;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f392.onRelease();
            zIsFinished |= this.f392.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f391;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f391.onRelease();
            zIsFinished |= this.f391.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f393;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f393.onRelease();
            zIsFinished |= this.f393.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m210() {
        if (!this.f376 || this.f385) {
            Trace.beginSection("RV FullInvalidate");
            m213();
            Trace.endSection();
            return;
        }
        if (this.f360.m1174()) {
            C0146 c0146 = this.f360;
            int i = c0146.f1149;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c0146.m1174()) {
                    Trace.beginSection("RV FullInvalidate");
                    m213();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m257();
            m239();
            this.f360.m1182();
            if (!this.f378) {
                int iM1994 = this.f361.m1994();
                for (int i2 = 0; i2 < iM1994; i2++) {
                    AbstractC2508 abstractC2508M204 = m204(this.f361.m1993(i2));
                    if (abstractC2508M204 != null && !abstractC2508M204.m4525() && abstractC2508M204.m4521()) {
                        m213();
                    }
                }
                this.f360.m1163();
            }
            m259(true);
            m240(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m211(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = AbstractC3578.f11184;
        setMeasuredDimension(AbstractC2491.m4452(i, paddingRight, getMinimumWidth()), AbstractC2491.m4452(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m212(View view) {
        m204(view);
        ArrayList arrayList = this.f384;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1682 c1682 = (C1682) this.f384.get(size);
                c1682.m3419(view);
                AbstractC2508 abstractC2508M232 = c1682.f5702.m232(view);
                if (abstractC2508M232 != null) {
                    AbstractC2508 abstractC2508 = c1682.f5687;
                    if (abstractC2508 == null || abstractC2508M232 != abstractC2508) {
                        c1682.m3415(abstractC2508M232, false);
                        if (c1682.f5685.remove(abstractC2508M232.f8006)) {
                            c1682.f5697.getClass();
                            C0662.m2043(abstractC2508M232);
                        }
                    } else {
                        c1682.m3420(null, 0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x034a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0390  */
    /* JADX WARN: Code duplicated, block: B:187:0x0393  */
    /* JADX WARN: Code duplicated, block: B:193:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:197:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:200:0x03be  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:206:0x03cf A[LOOP:4: B:199:0x03bc->B:206:0x03cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ed A[LOOP:5: B:208:0x03da->B:215:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03f0 A[EDGE_INSN: B:251:0x03f0->B:216:0x03f0 BREAK  A[LOOP:5: B:208:0x03da->B:215:0x03ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m213() {
        boolean z;
        long j;
        AbstractC2508 abstractC2508;
        int i;
        int iM4505;
        int i2;
        int iMin;
        AbstractC2508 abstractC2508M228;
        View view;
        AbstractC2508 abstractC2508M229;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z2;
        C2139 c2139;
        ?? r3;
        boolean zM2569;
        boolean z3;
        if (this.f368 == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f369 == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C2504 c2504 = this.f411;
        boolean z4 = false;
        c2504.f7992 = false;
        boolean z5 = true;
        boolean z6 = this.f426 && !(this.f427 == getWidth() && this.f428 == getHeight());
        this.f427 = 0;
        this.f428 = 0;
        this.f426 = false;
        if (c2504.f7987 == 1) {
            m214();
            this.f369.m4481(this);
            m215();
        } else {
            C0146 c0146 = this.f360;
            if ((((ArrayList) c0146.f1152).isEmpty() || ((ArrayList) c0146.f1151).isEmpty()) && !z6 && this.f369.f7954 == getWidth() && this.f369.f7955 == getHeight()) {
                this.f369.m4481(this);
            } else {
                this.f369.m4481(this);
                m215();
            }
        }
        c2504.m4504(4);
        m257();
        m239();
        c2504.f7987 = 1;
        boolean z7 = c2504.f7993;
        C2498 c2498 = this.f358;
        C2825 c2825 = this.f362;
        if (z7) {
            int iM1994 = this.f361.m1994() - 1;
            while (iM1994 >= 0) {
                AbstractC2508 abstractC2508M204 = m204(this.f361.m1993(iM1994));
                if (abstractC2508M204.m4525()) {
                    z3 = z5;
                } else {
                    long jM231 = m231(abstractC2508M204);
                    this.f394.getClass();
                    C2139 c21310 = new C2139();
                    c21310.m3952(abstractC2508M204);
                    C1863 c1863 = (C1863) c2825.f9073;
                    C2705 c2705 = (C2705) c2825.f9072;
                    AbstractC2508 abstractC2509 = (AbstractC2508) c1863.m3631(jM231);
                    if (abstractC2509 == null || abstractC2509.m4525()) {
                        z3 = z5;
                        c2825.m4803(abstractC2508M204, c21310);
                    } else {
                        z3 = z5;
                        C3584 c3584 = (C3584) c2705.get(abstractC2509);
                        boolean z8 = (c3584 == null || (c3584.f11216 & 1) == 0) ? false : z3;
                        C3584 c3585 = (C3584) c2705.get(abstractC2508M204);
                        boolean z9 = (c3585 == null || (c3585.f11216 & 1) == 0) ? false : z3;
                        if (z8 && abstractC2509 == abstractC2508M204) {
                            c2825.m4803(abstractC2508M204, c21310);
                        } else {
                            C2139 c2139M4806 = c2825.m4806(abstractC2509, 4);
                            c2825.m4803(abstractC2508M204, c21310);
                            C2139 c2139M4807 = c2825.m4806(abstractC2508M204, 8);
                            if (c2139M4806 == null) {
                                int iM1995 = this.f361.m1994();
                                for (int i4 = 0; i4 < iM1995; i4++) {
                                    AbstractC2508 abstractC2508M205 = m204(this.f361.m1993(i4));
                                    if (abstractC2508M205 != abstractC2508M204 && m231(abstractC2508M205) == jM231) {
                                        AbstractC2482 abstractC2482 = this.f368;
                                        if (abstractC2482 == null || !abstractC2482.f7927) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(abstractC2508M205);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(abstractC2508M204);
                                            throw new IllegalStateException(AbstractC2784.m4747(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(abstractC2508M205);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(abstractC2508M204);
                                        throw new IllegalStateException(AbstractC2784.m4747(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC2509 + " cannot be found but it is necessary for " + abstractC2508M204 + m223());
                            } else {
                                abstractC2509.m4524(false);
                                if (z8) {
                                    m205(abstractC2509);
                                }
                                if (abstractC2509 != abstractC2508M204) {
                                    if (z9) {
                                        m205(abstractC2508M204);
                                    }
                                    abstractC2509.f8013 = abstractC2508M204;
                                    m205(abstractC2509);
                                    c2498.m4501(abstractC2509);
                                    abstractC2508M204.m4524(false);
                                    abstractC2508M204.f8014 = abstractC2509;
                                }
                                if (this.f394.mo2565(abstractC2509, abstractC2508M204, c2139M4806, c2139M4807)) {
                                    m242();
                                }
                            }
                        }
                    }
                }
                iM1994--;
                z5 = z3;
            }
            z = z5;
            C2705 c2706 = (C2705) c2825.f9072;
            int i5 = c2706.f8716 - 1;
            while (i5 >= 0) {
                AbstractC2508 abstractC25010 = (AbstractC2508) c2706.m4706(i5);
                C3584 c3586 = (C3584) c2706.mo1918(i5);
                int i6 = c3586.f11216;
                int i7 = i6 & 3;
                C2481 c2481 = this.f430;
                if (i7 == 3) {
                    RecyclerView recyclerView = c2481.f7925;
                    recyclerView.f369.m4477(abstractC25010.f8006, recyclerView.f358);
                    r3 = z4;
                } else if ((i6 & 1) != 0) {
                    C2139 c21311 = c3586.f11217;
                    if (c21311 == null) {
                        RecyclerView recyclerView2 = c2481.f7925;
                        recyclerView2.f369.m4477(abstractC25010.f8006, recyclerView2.f358);
                        r3 = z4;
                    } else {
                        c2481.m4439(abstractC25010, c21311, c3586.f11218);
                        r3 = z4;
                    }
                } else if ((i6 & 14) == 14) {
                    c2481.m4438(abstractC25010, c3586.f11217, c3586.f11218);
                    r3 = z4;
                } else {
                    if ((i6 & 12) == 12) {
                        C2139 c21312 = c3586.f11217;
                        C2139 c21313 = c3586.f11218;
                        c2481.getClass();
                        abstractC25010.m4524(z4);
                        RecyclerView recyclerView3 = c2481.f7925;
                        if (!recyclerView3.f385) {
                            C0997 c0997 = (C0997) recyclerView3.f394;
                            c0997.getClass();
                            int i8 = c21312.f7076;
                            int i9 = c21313.f7076;
                            if (i8 == i9 && c21312.f7077 == c21313.f7077) {
                                c0997.m4447(abstractC25010);
                                zM2569 = false;
                            } else {
                                zM2569 = c0997.m2569(abstractC25010, i8, c21312.f7077, i9, c21313.f7077);
                            }
                            if (zM2569) {
                                recyclerView3.m242();
                            }
                        } else if (recyclerView3.f394.mo2565(abstractC25010, abstractC25010, c21312, c21313)) {
                            recyclerView3.m242();
                        }
                        r3 = 0;
                    } else {
                        if ((i6 & 4) != 0) {
                            c2139 = null;
                            c2481.m4439(abstractC25010, c3586.f11217, null);
                        } else {
                            c2139 = null;
                            if ((i6 & 8) != 0) {
                                c2481.m4438(abstractC25010, c3586.f11217, c3586.f11218);
                            }
                        }
                        r3 = 0;
                    }
                    c3586.f11216 = r3;
                    c3586.f11217 = c2139;
                    c3586.f11218 = c2139;
                    C3584.f11215.mo1311(c3586);
                    i5--;
                    z4 = false;
                }
                c2139 = null;
                c3586.f11216 = r3;
                c3586.f11217 = c2139;
                c3586.f11218 = c2139;
                C3584.f11215.mo1311(c3586);
                i5--;
                z4 = false;
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.f369.m4476(c2498);
        c2504.f7985 = c2504.f7988;
        this.f385 = false;
        this.f386 = false;
        c2504.f7993 = false;
        c2504.f7994 = false;
        this.f369.f7946 = false;
        ArrayList arrayList = c2498.f7968;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491.f7951) {
            abstractC2491.f7950 = 0;
            abstractC2491.f7951 = false;
            c2498.m4502();
        }
        this.f369.mo126(c2504);
        boolean z10 = z;
        m240(z10);
        m259(false);
        ((C2705) c2825.f9072).clear();
        ((C1863) c2825.f9073).m3630();
        int[] iArr = this.f419;
        int i10 = iArr[0];
        int i11 = iArr[z10 ? 1 : 0];
        m227(iArr);
        if ((iArr[0] == i10 && iArr[z10 ? 1 : 0] == i11) ? false : true) {
            m218(0, 0);
        }
        if (this.f407 && this.f368 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = c2504.f7996;
                if (j == -1) {
                    abstractC2508 = null;
                } else {
                    abstractC2508 = null;
                }
                if (abstractC2508 != null) {
                    view3 = abstractC2508.f8006;
                    if (!((ArrayList) this.f361.f2345).contains(view3)) {
                        if (this.f361.m1994() > 0) {
                            int i12 = c2504.f7995;
                            if (i12 != -1) {
                            }
                            iM4505 = c2504.m4505();
                            i2 = i;
                            while (true) {
                                if (i2 < iM4505) {
                                    abstractC2508M229 = m228(i2);
                                    if (abstractC2508M229 != null) {
                                        view2 = abstractC2508M229.f8006;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iM4505, i) - 1; iMin >= 0; iMin--) {
                                    abstractC2508M228 = m228(iMin);
                                    if (abstractC2508M228 == null) {
                                        break;
                                        break;
                                    }
                                    view = abstractC2508M228.f8006;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f361.m1994() > 0) {
                        int i13 = c2504.f7995;
                        if (i13 != -1) {
                        }
                        iM4505 = c2504.m4505();
                        i2 = i;
                        while (true) {
                            if (i2 < iM4505) {
                                abstractC2508M229 = m228(i2);
                                if (abstractC2508M229 != null) {
                                    view2 = abstractC2508M229.f8006;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC2508M228 = m228(iMin);
                                if (abstractC2508M228 == null) {
                                    break;
                                    break;
                                }
                                view = abstractC2508M228.f8006;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f361.m1994() > 0) {
                    int i14 = c2504.f7995;
                    if (i14 != -1) {
                    }
                    iM4505 = c2504.m4505();
                    i2 = i;
                    while (true) {
                        if (i2 < iM4505) {
                            abstractC2508M229 = m228(i2);
                            if (abstractC2508M229 != null) {
                                view2 = abstractC2508M229.f8006;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC2508M228 = m228(iMin);
                            if (abstractC2508M228 == null) {
                                break;
                                break;
                            }
                            view = abstractC2508M228.f8006;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = c2504.f7997;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.f361.f2345).contains(getFocusedChild())) {
                j = c2504.f7996;
                if (j == -1 && (z2 = this.f368.f7927) && z2) {
                    int iM1997 = this.f361.m1997();
                    abstractC2508 = null;
                    for (int i15 = 0; i15 < iM1997; i15++) {
                        AbstractC2508 abstractC2508M206 = m204(this.f361.m1996(i15));
                        if (abstractC2508M206 != null && !abstractC2508M206.m4518() && abstractC2508M206.f8010 == j) {
                            if (!((ArrayList) this.f361.f2345).contains(abstractC2508M206.f8006)) {
                                abstractC2508 = abstractC2508M206;
                                break;
                            }
                            abstractC2508 = abstractC2508M206;
                        }
                    }
                } else {
                    abstractC2508 = null;
                }
                if (abstractC2508 != null) {
                    view3 = abstractC2508.f8006;
                    if (!((ArrayList) this.f361.f2345).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.f361.m1994() > 0) {
                        int i16 = c2504.f7995;
                        i = i16 != -1 ? i16 : 0;
                        iM4505 = c2504.m4505();
                        i2 = i;
                        while (true) {
                            if (i2 < iM4505) {
                                abstractC2508M229 = m228(i2);
                                if (abstractC2508M229 != null) {
                                    view2 = abstractC2508M229.f8006;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC2508M228 = m228(iMin);
                                if (abstractC2508M228 == null) {
                                    break;
                                }
                                view = abstractC2508M228.f8006;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f361.m1994() > 0) {
                    int i17 = c2504.f7995;
                    if (i17 != -1) {
                    }
                    iM4505 = c2504.m4505();
                    i2 = i;
                    while (true) {
                        if (i2 < iM4505) {
                            abstractC2508M229 = m228(i2);
                            if (abstractC2508M229 != null) {
                                view2 = abstractC2508M229.f8006;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC2508M228 = m228(iMin);
                            if (abstractC2508M228 == null) {
                                break;
                                break;
                            }
                            view = abstractC2508M228.f8006;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = c2504.f7997;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        c2504.f7996 = -1L;
        c2504.f7995 = -1;
        c2504.f7997 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m214() {
        C3584 c3584;
        View viewM225;
        C2504 c2504 = this.f411;
        c2504.m4504(1);
        m224(c2504);
        c2504.f7992 = false;
        m257();
        C2825 c2825 = this.f362;
        C2705 c2705 = (C2705) c2825.f9072;
        C2705 c2706 = (C2705) c2825.f9072;
        c2705.clear();
        C1863 c1863 = (C1863) c2825.f9073;
        c1863.m3630();
        m239();
        m243();
        AbstractC2508 abstractC2508M232 = null;
        View focusedChild = (this.f407 && hasFocus() && this.f368 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM225 = m225(focusedChild)) != null) {
            abstractC2508M232 = m232(viewM225);
        }
        if (abstractC2508M232 == null) {
            c2504.f7996 = -1L;
            c2504.f7995 = -1;
            c2504.f7997 = -1;
        } else {
            c2504.f7996 = this.f368.f7927 ? abstractC2508M232.f8010 : -1L;
            c2504.f7995 = this.f385 ? -1 : abstractC2508M232.m4518() ? abstractC2508M232.f8009 : abstractC2508M232.m4510();
            View focusedChild2 = abstractC2508M232.f8006;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c2504.f7997 = id;
        }
        c2504.f7991 = c2504.f7993 && this.f415;
        this.f415 = false;
        this.f414 = false;
        c2504.f7990 = c2504.f7994;
        c2504.f7988 = this.f368.mo2040();
        m227(this.f419);
        if (c2504.f7993) {
            int iM1994 = this.f361.m1994();
            for (int i = 0; i < iM1994; i++) {
                AbstractC2508 abstractC2508M204 = m204(this.f361.m1993(i));
                if (!abstractC2508M204.m4525() && (!abstractC2508M204.m4516() || this.f368.f7927)) {
                    AbstractC2487 abstractC2487 = this.f394;
                    AbstractC2487.m4446(abstractC2508M204);
                    abstractC2508M204.m4513();
                    abstractC2487.getClass();
                    C2139 c2139 = new C2139();
                    c2139.m3952(abstractC2508M204);
                    C3584 c3584M5202 = (C3584) c2706.get(abstractC2508M204);
                    if (c3584M5202 == null) {
                        c3584M5202 = C3584.m5202();
                        c2706.put(abstractC2508M204, c3584M5202);
                    }
                    c3584M5202.f11217 = c2139;
                    c3584M5202.f11216 |= 4;
                    if (c2504.f7991 && abstractC2508M204.m4521() && !abstractC2508M204.m4518() && !abstractC2508M204.m4525() && !abstractC2508M204.m4516()) {
                        c1863.m3633(abstractC2508M204, m231(abstractC2508M204));
                    }
                }
            }
        }
        if (c2504.f7994) {
            int iM1997 = this.f361.m1997();
            for (int i2 = 0; i2 < iM1997; i2++) {
                AbstractC2508 abstractC2508M205 = m204(this.f361.m1996(i2));
                if (f347 && abstractC2508M205.f8008 == -1 && !abstractC2508M205.m4518()) {
                    throw new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!abstractC2508M205.m4525() && abstractC2508M205.f8009 == -1) {
                    abstractC2508M205.f8009 = abstractC2508M205.f8008;
                }
            }
            boolean z = c2504.f7989;
            c2504.f7989 = false;
            this.f369.mo125(this.f358, c2504);
            c2504.f7989 = z;
            for (int i3 = 0; i3 < this.f361.m1994(); i3++) {
                AbstractC2508 abstractC2508M206 = m204(this.f361.m1993(i3));
                if (!abstractC2508M206.m4525() && ((c3584 = (C3584) c2706.get(abstractC2508M206)) == null || (c3584.f11216 & 4) == 0)) {
                    AbstractC2487.m4446(abstractC2508M206);
                    boolean z2 = (abstractC2508M206.f8015 & 8192) != 0;
                    AbstractC2487 abstractC2488 = this.f394;
                    abstractC2508M206.m4513();
                    abstractC2488.getClass();
                    C2139 c21310 = new C2139();
                    c21310.m3952(abstractC2508M206);
                    if (z2) {
                        m245(abstractC2508M206, c21310);
                    } else {
                        C3584 c3584M5203 = (C3584) c2706.get(abstractC2508M206);
                        if (c3584M5203 == null) {
                            c3584M5203 = C3584.m5202();
                            c2706.put(abstractC2508M206, c3584M5203);
                        }
                        c3584M5203.f11216 |= 2;
                        c3584M5203.f11217 = c21310;
                    }
                }
            }
            m208();
        } else {
            m208();
        }
        m240(true);
        m259(false);
        c2504.f7987 = 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m215() {
        m257();
        m239();
        C2504 c2504 = this.f411;
        c2504.m4504(6);
        this.f360.m1166();
        c2504.f7988 = this.f368.mo2040();
        c2504.f7986 = 0;
        if (this.f359 != null) {
            AbstractC2482 abstractC2482 = this.f368;
            int iM4759 = AbstractC2784.m4759(abstractC2482.f7928);
            if (iM4759 == 1 ? abstractC2482.mo2040() > 0 : iM4759 != 2) {
                Parcelable parcelable = this.f359.f7976;
                if (parcelable != null) {
                    this.f369.mo163(parcelable);
                }
                this.f359 = null;
            }
        }
        c2504.f7990 = false;
        this.f369.mo125(this.f358, c2504);
        c2504.f7989 = false;
        c2504.f7993 = c2504.f7993 && this.f394 != null;
        c2504.f7987 = 4;
        m240(true);
        m259(false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final boolean m216(int[] iArr, int i, int i2, int i3, int[] iArr2) {
        return getScrollingChildHelper().m3946(iArr, i, i2, i3, iArr2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m217(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m3947(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m218(int i, int i2) {
        this.f388++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC2495 abstractC2495 = this.f412;
        if (abstractC2495 != null) {
            abstractC2495.mo3003(this, i, i2);
        }
        ArrayList arrayList = this.f413;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2495) this.f413.get(size)).mo3003(this, i, i2);
            }
        }
        this.f388--;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m219() {
        if (this.f393 != null) {
            return;
        }
        ((C2505) this.f389).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f393 = edgeEffect;
        if (this.f363) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m220() {
        if (this.f390 != null) {
            return;
        }
        ((C2505) this.f389).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f390 = edgeEffect;
        if (this.f363) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final void m221() {
        if (this.f392 != null) {
            return;
        }
        ((C2505) this.f389).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f392 = edgeEffect;
        if (this.f363) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void m222() {
        if (this.f391 != null) {
            return;
        }
        ((C2505) this.f389).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f391 = edgeEffect;
        if (this.f363) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final String m223() {
        return " " + super.toString() + ", adapter:" + this.f368 + ", layout:" + this.f369 + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void m224(C2504 c2504) {
        if (getScrollState() != 2) {
            c2504.getClass();
            return;
        }
        OverScroller overScroller = this.f408.f8000;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c2504.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final View m225(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m226(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f372;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2494 interfaceC2494 = (InterfaceC2494) arrayList.get(i);
            if (interfaceC2494.mo3006(motionEvent) && action != 3) {
                this.f373 = interfaceC2494;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m227(int[] iArr) {
        int iM1994 = this.f361.m1994();
        if (iM1994 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM1994; i3++) {
            AbstractC2508 abstractC2508M204 = m204(this.f361.m1993(i3));
            if (!abstractC2508M204.m4525()) {
                int iM4512 = abstractC2508M204.m4512();
                if (iM4512 < i) {
                    i = iM4512;
                }
                if (iM4512 > i2) {
                    i2 = iM4512;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final AbstractC2508 m228(int i) {
        AbstractC2508 abstractC2508 = null;
        if (this.f385) {
            return null;
        }
        int iM1997 = this.f361.m1997();
        for (int i2 = 0; i2 < iM1997; i2++) {
            AbstractC2508 abstractC2508M204 = m204(this.f361.m1996(i2));
            if (abstractC2508M204 != null && !abstractC2508M204.m4518() && m230(abstractC2508M204) == i) {
                if (!((ArrayList) this.f361.f2345).contains(abstractC2508M204.f8006)) {
                    return abstractC2508M204;
                }
                abstractC2508 = abstractC2508M204;
            }
        }
        return abstractC2508;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final boolean m229(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f379) {
            boolean zMo152 = abstractC2491.mo152();
            boolean zMo153 = this.f369.mo153();
            if (!zMo152 || Math.abs(i) < i3) {
                i = 0;
            }
            if (!zMo153 || Math.abs(i2) < i3) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.f390;
                    if (edgeEffect == null || AbstractC0968.m2472(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.f392;
                        if (edgeEffect2 == null || AbstractC0968.m2472(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (m254(this.f392, i, getWidth())) {
                            this.f392.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i6 = -i;
                        if (m254(this.f390, i6, getWidth())) {
                            this.f390.onAbsorb(i6);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i2 == 0) {
                    i5 = i2;
                    i2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.f391;
                    if (edgeEffect3 == null || AbstractC0968.m2472(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f393;
                        if (edgeEffect4 == null || AbstractC0968.m2472(edgeEffect4) == 0.0f) {
                            i5 = i2;
                            i2 = 0;
                        } else if (m254(this.f393, i2, getHeight())) {
                            this.f393.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i7 = -i2;
                        if (m254(this.f391, i7, getHeight())) {
                            this.f391.onAbsorb(i7);
                            i2 = 0;
                        }
                    }
                    i5 = 0;
                }
                RunnableC2507 runnableC2507 = this.f408;
                if (iMax != 0 || i2 != 0) {
                    int i8 = -i4;
                    iMax = Math.max(i8, Math.min(iMax, i4));
                    i2 = Math.max(i8, Math.min(i2, i4));
                    m258(1);
                    runnableC2507.m4506(iMax, i2);
                }
                if (i != 0 || i5 != 0) {
                    float f = i;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z = zMo152 || zMo153;
                        dispatchNestedFling(f, f2, z);
                        if (z) {
                            m258(1);
                            int i9 = -i4;
                            runnableC2507.m4506(Math.max(i9, Math.min(i, i4)), Math.max(i9, Math.min(i5, i4)));
                            return true;
                        }
                    }
                } else if (iMax != 0 || i2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final int m230(AbstractC2508 abstractC2508) {
        if ((abstractC2508.f8015 & 524) == 0 && abstractC2508.m4515()) {
            int i = abstractC2508.f8008;
            ArrayList arrayList = (ArrayList) this.f360.f1151;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0145 c0145 = (C0145) arrayList.get(i2);
                int i3 = c0145.f1144;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c0145.f1145;
                        if (i4 <= i) {
                            int i5 = c0145.f1147;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c0145.f1145;
                        if (i6 == i) {
                            i = c0145.f1147;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c0145.f1147 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c0145.f1145 <= i) {
                    i += c0145.f1147;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final long m231(AbstractC2508 abstractC2508) {
        return this.f368.f7927 ? abstractC2508.f8010 : abstractC2508.f8008;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final AbstractC2508 m232(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m204(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final Rect m233(View view) {
        C2492 c2492 = (C2492) view.getLayoutParams();
        boolean z = c2492.f7958;
        Rect rect = c2492.f7957;
        if (!z || (this.f411.f7990 && (c2492.f7956.m4521() || c2492.f7956.m4516()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f371;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f365;
            rect2.set(0, 0, 0, 0);
            ((AbstractC2488) arrayList.get(i)).mo3410(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c2492.f7958 = false;
        return rect;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final boolean m234() {
        return !this.f376 || this.f385 || this.f360.m1174();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final boolean m235() {
        return this.f387 > 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void m236(int i) {
        if (this.f369 == null) {
            return;
        }
        setScrollState(2);
        this.f369.mo165(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void m237() {
        int iM1997 = this.f361.m1997();
        for (int i = 0; i < iM1997; i++) {
            ((C2492) this.f361.m1996(i).getLayoutParams()).f7958 = true;
        }
        ArrayList arrayList = this.f358.f7969;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2492 c2492 = (C2492) ((AbstractC2508) arrayList.get(i2)).f8006.getLayoutParams();
            if (c2492 != null) {
                c2492.f7958 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public final void m238(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM1997 = this.f361.m1997();
        for (int i4 = 0; i4 < iM1997; i4++) {
            AbstractC2508 abstractC2508M204 = m204(this.f361.m1996(i4));
            if (abstractC2508M204 != null && !abstractC2508M204.m4525()) {
                int i5 = abstractC2508M204.f8008;
                C2504 c2504 = this.f411;
                if (i5 >= i3) {
                    if (f348) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC2508M204 + " now at position " + (abstractC2508M204.f8008 - i2));
                    }
                    abstractC2508M204.m4522(-i2, z);
                    c2504.f7989 = true;
                } else if (i5 >= i) {
                    if (f348) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC2508M204 + " now REMOVED");
                    }
                    abstractC2508M204.m4509(8);
                    abstractC2508M204.m4522(-i2, z);
                    abstractC2508M204.f8008 = i - 1;
                    c2504.f7989 = true;
                }
            }
        }
        C2498 c2498 = this.f358;
        ArrayList arrayList = c2498.f7969;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2508 abstractC2508 = (AbstractC2508) arrayList.get(size);
            if (abstractC2508 != null) {
                int i6 = abstractC2508.f8008;
                if (i6 >= i3) {
                    if (f348) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC2508 + " now at position " + (abstractC2508.f8008 - i2));
                    }
                    abstractC2508.m4522(-i2, z);
                } else if (i6 >= i) {
                    abstractC2508.m4509(8);
                    c2498.m4496(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final void m239() {
        this.f387++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final void m240(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f387 - 1;
        this.f387 = i2;
        if (i2 < 1) {
            if (f347 && i2 < 0) {
                throw new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f387 = 0;
            if (z) {
                int i3 = this.f381;
                this.f381 = 0;
                if (i3 != 0 && (accessibilityManager = this.f383) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f424;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC2508 abstractC2508 = (AbstractC2508) arrayList.get(size);
                    if (abstractC2508.f8006.getParent() == this && !abstractC2508.m4525() && (i = abstractC2508.f8022) != -1) {
                        abstractC2508.f8006.setImportantForAccessibility(i);
                        abstractC2508.f8022 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final void m241(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f396) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f396 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f400 = x;
            this.f398 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f401 = y;
            this.f399 = y;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public final void m242() {
        if (this.f417 || !this.f374) {
            return;
        }
        Field field = AbstractC3578.f11184;
        postOnAnimation(this.f425);
        this.f417 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public final void m243() {
        boolean z;
        boolean z2 = false;
        if (this.f385) {
            C0146 c0146 = this.f360;
            c0146.m1184((ArrayList) c0146.f1151);
            c0146.m1184((ArrayList) c0146.f1152);
            c0146.f1149 = 0;
            if (this.f386) {
                this.f369.mo121();
            }
        }
        if (this.f394 == null || !this.f369.mo131()) {
            this.f360.m1166();
        } else {
            this.f360.m1182();
        }
        boolean z3 = this.f414 || this.f415;
        boolean z4 = this.f376 && this.f394 != null && ((z = this.f385) || z3 || this.f369.f7946) && (!z || this.f368.f7927);
        C2504 c2504 = this.f411;
        c2504.f7993 = z4;
        if (z4 && z3 && !this.f385 && this.f394 != null && this.f369.mo131()) {
            z2 = true;
        }
        c2504.f7994 = z2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public final void m244(boolean z) {
        this.f386 = z | this.f386;
        this.f385 = true;
        int iM1997 = this.f361.m1997();
        for (int i = 0; i < iM1997; i++) {
            AbstractC2508 abstractC2508M204 = m204(this.f361.m1996(i));
            if (abstractC2508M204 != null && !abstractC2508M204.m4525()) {
                abstractC2508M204.m4509(6);
            }
        }
        m237();
        C2498 c2498 = this.f358;
        ArrayList arrayList = c2498.f7969;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC2508 abstractC2508 = (AbstractC2508) arrayList.get(i2);
            if (abstractC2508 != null) {
                abstractC2508.m4509(6);
                abstractC2508.m4509(1024);
            }
        }
        AbstractC2482 abstractC2482 = c2498.f7974.f368;
        if (abstractC2482 == null || !abstractC2482.f7927) {
            c2498.m4495();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public final void m245(AbstractC2508 abstractC2508, C2139 c2139) {
        abstractC2508.f8015 &= -8193;
        boolean z = this.f411.f7991;
        C2825 c2825 = this.f362;
        if (z && abstractC2508.m4521() && !abstractC2508.m4518() && !abstractC2508.m4525()) {
            ((C1863) c2825.f9073).m3633(abstractC2508, m231(abstractC2508));
        }
        C2705 c2705 = (C2705) c2825.f9072;
        C3584 c3584M5202 = (C3584) c2705.get(abstractC2508);
        if (c3584M5202 == null) {
            c3584M5202 = C3584.m5202();
            c2705.put(abstractC2508, c3584M5202);
        }
        c3584M5202.f11217 = c2139;
        c3584M5202.f11216 |= 4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public final void m246() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f390;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f390.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f391;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f391.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f392;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f392.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f393;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f393.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public final int m247(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f390;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0968.m2472(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f392;
            if (edgeEffect2 != null && AbstractC0968.m2472(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f392.onRelease();
                } else {
                    float fM2478 = AbstractC0968.m2478(this.f392, width, height);
                    if (AbstractC0968.m2472(this.f392) == 0.0f) {
                        this.f392.onRelease();
                    }
                    f2 = fM2478;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f390.onRelease();
            } else {
                float f3 = -AbstractC0968.m2478(this.f390, -width, 1.0f - height);
                if (AbstractC0968.m2472(this.f390) == 0.0f) {
                    this.f390.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public final int m248(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f391;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0968.m2472(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f393;
            if (edgeEffect2 != null && AbstractC0968.m2472(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f393.onRelease();
                } else {
                    float fM2478 = AbstractC0968.m2478(this.f393, height, 1.0f - width);
                    if (AbstractC0968.m2472(this.f393) == 0.0f) {
                        this.f393.onRelease();
                    }
                    f2 = fM2478;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f391.onRelease();
            } else {
                float f3 = -AbstractC0968.m2478(this.f391, -height, width);
                if (AbstractC0968.m2472(this.f391) == 0.0f) {
                    this.f391.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public final void m249(AbstractC2488 abstractC2488) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            abstractC2491.mo151("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f371;
        arrayList.remove(abstractC2488);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m237();
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final void m250(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f365;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2492) {
            C2492 c2492 = (C2492) layoutParams;
            if (!c2492.f7958) {
                Rect rect2 = c2492.f7957;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f369.mo667(this, view, this.f365, !this.f376, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
      0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public final boolean m251(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        m210();
        AbstractC2482 abstractC2482 = this.f368;
        int[] iArr = this.f423;
        if (abstractC2482 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m252(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f371.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m217(i4, i5, i6, i7, this.f421, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.f400;
        int[] iArr2 = this.f421;
        int i13 = iArr2[0];
        this.f400 = i12 - i13;
        int i14 = this.f401;
        int i15 = iArr2[1];
        this.f401 = i14 - i15;
        int[] iArr3 = this.f422;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || AbstractC2665.m4667(motionEvent, r.a.s)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    m220();
                    z = true;
                    z2 = false;
                    AbstractC0968.m2478(this.f390, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        m221();
                        AbstractC0968.m2478(this.f392, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        m222();
                        AbstractC0968.m2478(this.f391, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        m219();
                        AbstractC0968.m2478(this.f393, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && AbstractC2665.m4667(motionEvent, 4194304)) {
                            m246();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        m246();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    m222();
                    AbstractC0968.m2478(this.f391, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    m219();
                    AbstractC0968.m2478(this.f393, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        m246();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    m246();
                }
            }
            m209(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            m218(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public final void m252(int i, int i2, int[] iArr) {
        AbstractC2508 abstractC2508;
        m257();
        m239();
        Trace.beginSection("RV Scroll");
        C2504 c2504 = this.f411;
        m224(c2504);
        C2498 c2498 = this.f358;
        int iMo128 = i != 0 ? this.f369.mo128(i, c2498, c2504) : 0;
        int iMo129 = i2 != 0 ? this.f369.mo129(i2, c2498, c2504) : 0;
        Trace.endSection();
        int iM1994 = this.f361.m1994();
        for (int i3 = 0; i3 < iM1994; i3++) {
            View viewM1993 = this.f361.m1993(i3);
            AbstractC2508 abstractC2508M232 = m232(viewM1993);
            if (abstractC2508M232 != null && (abstractC2508 = abstractC2508M232.f8014) != null) {
                View view = abstractC2508.f8006;
                int left = viewM1993.getLeft();
                int top = viewM1993.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m240(true);
        m259(false);
        if (iArr != null) {
            iArr[0] = iMo128;
            iArr[1] = iMo129;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public final void m253(int i) {
        if (this.f379) {
            return;
        }
        m261();
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2491.mo165(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public final boolean m254(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM2472 = AbstractC0968.m2472(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f356 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f350;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM2472;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public final void m255(int i, int i2, boolean z) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f379) {
            return;
        }
        if (!abstractC2491.mo152()) {
            i = 0;
        }
        if (!this.f369.mo153()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m3950(i3, 1);
        }
        this.f408.m4508(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final void m256(int i) {
        if (this.f379) {
            return;
        }
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2491.mo167(this, this.f411, i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final void m257() {
        int i = this.f377 + 1;
        this.f377 = i;
        if (i != 1 || this.f379) {
            return;
        }
        this.f378 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final void m258(int i) {
        boolean zMo152 = this.f369.mo152();
        int i2 = zMo152;
        if (this.f369.mo153()) {
            i2 = (zMo152 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m3950(i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final void m259(boolean z) {
        if (this.f377 < 1) {
            if (f347) {
                throw new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f377 = 1;
        }
        if (!z && !this.f379) {
            this.f378 = false;
        }
        if (this.f377 == 1) {
            if (z && this.f378 && !this.f379 && this.f369 != null && this.f368 != null) {
                m213();
            }
            if (!this.f379) {
                this.f378 = false;
            }
        }
        this.f377--;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public final void m260(int i) {
        getScrollingChildHelper().m3951(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public final void m261() {
        C1790 c1790;
        setScrollState(0);
        RunnableC2507 runnableC2507 = this.f408;
        runnableC2507.f8004.removeCallbacks(runnableC2507);
        runnableC2507.f8000.abortAnimation();
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 == null || (c1790 = abstractC2491.f7945) == null) {
            return;
        }
        c1790.m3528();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f357 = new C2500(this);
        this.f358 = new C2498(this);
        this.f362 = new C2825();
        this.f364 = new RunnableC2480(this, 0);
        this.f365 = new Rect();
        this.f366 = new Rect();
        this.f367 = new RectF();
        this.f370 = new ArrayList();
        this.f371 = new ArrayList();
        this.f372 = new ArrayList();
        this.f377 = 0;
        this.f385 = false;
        this.f386 = false;
        this.f387 = 0;
        this.f388 = 0;
        this.f389 = f355;
        C0997 c0997 = new C0997();
        Object[] objArr = null;
        c0997.f7929 = null;
        c0997.f7930 = new ArrayList();
        c0997.f7931 = 120L;
        c0997.f7932 = 120L;
        c0997.f7933 = 250L;
        c0997.f7934 = 250L;
        int i3 = 1;
        c0997.f3642 = true;
        c0997.f3643 = new ArrayList();
        c0997.f3644 = new ArrayList();
        c0997.f3645 = new ArrayList();
        c0997.f3646 = new ArrayList();
        c0997.f3647 = new ArrayList();
        c0997.f3648 = new ArrayList();
        c0997.f3649 = new ArrayList();
        c0997.f3650 = new ArrayList();
        c0997.f3651 = new ArrayList();
        c0997.f3652 = new ArrayList();
        c0997.f3653 = new ArrayList();
        this.f394 = c0997;
        this.f395 = 0;
        this.f396 = -1;
        this.f405 = Float.MIN_VALUE;
        this.f406 = Float.MIN_VALUE;
        this.f407 = true;
        this.f408 = new RunnableC2507(this);
        this.f410 = f352 ? new C1439() : null;
        C2504 c2504 = new C2504();
        c2504.f7984 = -1;
        c2504.f7985 = 0;
        c2504.f7986 = 0;
        c2504.f7987 = 1;
        c2504.f7988 = 0;
        c2504.f7989 = false;
        c2504.f7990 = false;
        c2504.f7991 = false;
        c2504.f7992 = false;
        c2504.f7993 = false;
        c2504.f7994 = false;
        this.f411 = c2504;
        this.f414 = false;
        this.f415 = false;
        C2481 c2481 = new C2481(this);
        this.f416 = c2481;
        this.f417 = false;
        this.f419 = new int[2];
        this.f421 = new int[2];
        this.f422 = new int[2];
        this.f423 = new int[2];
        this.f424 = new ArrayList();
        this.f425 = new RunnableC2480(this, i3);
        this.f427 = 0;
        this.f428 = 0;
        this.f430 = new C2481(this);
        this.f431 = new C1040(getContext(), new C2481(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f402 = viewConfiguration.getScaledTouchSlop();
        this.f405 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f406 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f403 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f404 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f356 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f394.f7929 = c2481;
        this.f360 = new C0146(new C2481(this));
        this.f361 = new C0575(new C2481(this));
        Field field = AbstractC3578.f11184;
        if (AbstractC3573.m5154(this) == 0) {
            AbstractC3573.m5155(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f383 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C2510(this));
        int[] iArr = AbstractC2466.f7838;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC3578.m5176(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f363 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC2784.m4747(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            new C1275(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(me.hd.wauxv.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(me.hd.wauxv.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(me.hd.wauxv.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f429 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC2491.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f353);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[i3] = attributeSet;
                        objArr2[2] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC2491) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = f349;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC3578.m5176(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(me.hd.wauxv.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2491 abstractC2491 = this.f369;
        if (abstractC2491 != null) {
            return abstractC2491.mo114(layoutParams);
        }
        throw new IllegalStateException(AbstractC2784.m4747(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void setOnFlingListener(AbstractC2493 abstractC2493) {
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2499 interfaceC2499) {
    }
}
