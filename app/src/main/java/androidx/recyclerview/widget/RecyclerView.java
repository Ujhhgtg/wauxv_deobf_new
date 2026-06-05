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
import p000.AbstractC0615Ujhhgtgfeyxiexzf;
import p000.AbstractC0792feyxiexzfUjhhgtg;
import p000.AbstractC0793feyxiexzfUjhhgtg;
import p000.AbstractC0795feyxiexzfUjhhgtg;
import p000.AbstractC0803feyxiexzfUjhhgtg;
import p000.AbstractC0819feyxiexzfUjhhgtg;
import p000.AbstractC0821feyxiexzfUjhhgtg;
import p000.AbstractC0822feyxiexzfUjhhgtg;
import p000.AbstractC0824feyxiexzfUjhhgtg;
import p000.AbstractC0826feyxiexzfUjhhgtg;
import p000.AbstractC0833feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC1264feyxiexzfUjhhgtg;
import p000.AbstractC1894Ujhhgtgfeyxiexzf;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC2852feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0069Ujhhgtgfeyxiexzf;
import p000.C0267Ujhhgtgfeyxiexzf;
import p000.C0430Ujhhgtgfeyxiexzf;
import p000.C0431Ujhhgtgfeyxiexzf;
import p000.C0708Ujhhgtgfeyxiexzf;
import p000.C0787feyxiexzfUjhhgtg;
import p000.C0810feyxiexzfUjhhgtg;
import p000.C0811feyxiexzfUjhhgtg;
import p000.C0812feyxiexzfUjhhgtg;
import p000.C0813feyxiexzfUjhhgtg;
import p000.C0816feyxiexzfUjhhgtg;
import p000.C0825feyxiexzfUjhhgtg;
import p000.C0828feyxiexzfUjhhgtg;
import p000.C0829feyxiexzfUjhhgtg;
import p000.C0831feyxiexzfUjhhgtg;
import p000.C1044feyxiexzfUjhhgtg;
import p000.C1444feyxiexzfUjhhgtg;
import p000.C2073feyxiexzfUjhhgtg;
import p000.C2295Ujhhgtgfeyxiexzf;
import p000.C2790feyxiexzfUjhhgtg;
import p000.C2816Ujhhgtgfeyxiexzf;
import p000.C3016Ujhhgtgfeyxiexzf;
import p000.C3017Ujhhgtgfeyxiexzf;
import p000.C3116Ujhhgtgfeyxiexzf;
import p000.C3158feyxiexzfUjhhgtg;
import p000.C3419Ujhhgtgfeyxiexzf;
import p000.C3570Ujhhgtgfeyxiexzf;
import p000.InterfaceC0796feyxiexzfUjhhgtg;
import p000.InterfaceC0830feyxiexzfUjhhgtg;
import p000.InterfaceC0832feyxiexzfUjhhgtg;
import p000.InterpolatorC0700Ujhhgtgfeyxiexzf;
import p000.RunnableC0786feyxiexzfUjhhgtg;
import p000.RunnableC0818feyxiexzfUjhhgtg;
import p000.RunnableC3565Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static boolean f348feyxiexzfUjhhgtg = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static boolean f349feyxiexzfUjhhgtg = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final int[] f350feyxiexzfUjhhgtg = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final float f351feyxiexzfUjhhgtg = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static final boolean f352feyxiexzfUjhhgtg = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final boolean f353feyxiexzfUjhhgtg = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final Class[] f354Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final InterpolatorC0700Ujhhgtgfeyxiexzf f355Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final C0811feyxiexzfUjhhgtg f356feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f357Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0813feyxiexzfUjhhgtg f358Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0831feyxiexzfUjhhgtg f359Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C0812feyxiexzfUjhhgtg f360Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C3017Ujhhgtgfeyxiexzf f361Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2790feyxiexzfUjhhgtg f362Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C2073feyxiexzfUjhhgtg f363Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f364Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final RunnableC0786feyxiexzfUjhhgtg f365Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Rect f366Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final Rect f367Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final RectF f368Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public AbstractC0795feyxiexzfUjhhgtg f369Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public AbstractC0822feyxiexzfUjhhgtg f370Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final ArrayList f371Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f372Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final ArrayList f373Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public InterfaceC0832feyxiexzfUjhhgtg f374Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f375Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f376Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f377Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f378Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f379feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f380feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f381feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f382feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f383feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final AccessibilityManager f384feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public ArrayList f385feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public boolean f386feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public boolean f387feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f388feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f389feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public AbstractC0792feyxiexzfUjhhgtg f390feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public EdgeEffect f391feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public EdgeEffect f392feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public EdgeEffect f393feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public EdgeEffect f394feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public AbstractC0793feyxiexzfUjhhgtg f395feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f396feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public int f397feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public VelocityTracker f398feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f399feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f400feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public int f401feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f402feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f403Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f404Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f405Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final float f406Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final float f407Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f408Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final RunnableC0818feyxiexzfUjhhgtg f409feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public RunnableC3565Ujhhgtgfeyxiexzf f410feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final C3570Ujhhgtgfeyxiexzf f411feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final C0810feyxiexzfUjhhgtg f412feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public AbstractC0833feyxiexzfUjhhgtg f413feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ArrayList f414feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f415Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f416Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final C0787feyxiexzfUjhhgtg f417feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f418feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C0816feyxiexzfUjhhgtg f419Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int[] f420feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public C0430Ujhhgtgfeyxiexzf f421Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int[] f422Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final int[] f423feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int[] f424feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f425Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final RunnableC0786feyxiexzfUjhhgtg f426feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f427Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f428Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f429Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f430Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final C0787feyxiexzfUjhhgtg f431Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C3158feyxiexzfUjhhgtg f432Ujhhgtgfeyxiexzf;

    static {
        Class cls = Integer.TYPE;
        f354Ujhhgtgfeyxiexzf = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f355Ujhhgtgfeyxiexzf = new InterpolatorC0700Ujhhgtgfeyxiexzf(2);
        f356feyxiexzfUjhhgtg = new C0811feyxiexzfUjhhgtg();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, me.hd.wauxv.R.attr.recyclerViewStyle);
    }

    private C0430Ujhhgtgfeyxiexzf getScrollingChildHelper() {
        if (this.f421Ujhhgtgfeyxiexzf == null) {
            this.f421Ujhhgtgfeyxiexzf = new C0430Ujhhgtgfeyxiexzf(this);
        }
        return this.f421Ujhhgtgfeyxiexzf;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f348feyxiexzfUjhhgtg = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f349feyxiexzfUjhhgtg = z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m201Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        WeakReference weakReference = abstractC0821feyxiexzfUjhhgtg.f3242Ujhhgtgfeyxiexzf;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0821feyxiexzfUjhhgtg.f3242Ujhhgtgfeyxiexzf = null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static int m202Ujhhgtgfeyxiexzf(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static RecyclerView m203feyxiexzfUjhhgtg(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM203feyxiexzfUjhhgtg = m203feyxiexzfUjhhgtg(viewGroup.getChildAt(i));
            if (recyclerViewM203feyxiexzfUjhhgtg != null) {
                return recyclerViewM203feyxiexzfUjhhgtg;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static AbstractC0821feyxiexzfUjhhgtg m204feyxiexzfUjhhgtg(View view) {
        if (view == null) {
            return null;
        }
        return ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3279Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            abstractC0822feyxiexzfUjhhgtg.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0825feyxiexzfUjhhgtg) && this.f370Ujhhgtgfeyxiexzf.mo118Ujhhgtgfeyxiexzf((C0825feyxiexzfUjhhgtg) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null && abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf()) {
            return this.f370Ujhhgtgfeyxiexzf.mo156Ujhhgtgfeyxiexzf(this.f412feyxiexzfUjhhgtg);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null && abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf()) {
            return this.f370Ujhhgtgfeyxiexzf.mo119Ujhhgtgfeyxiexzf(this.f412feyxiexzfUjhhgtg);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null && abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf()) {
            return this.f370Ujhhgtgfeyxiexzf.mo120Ujhhgtgfeyxiexzf(this.f412feyxiexzfUjhhgtg);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null && abstractC0822feyxiexzfUjhhgtg.mo153Ujhhgtgfeyxiexzf()) {
            return this.f370Ujhhgtgfeyxiexzf.mo157Ujhhgtgfeyxiexzf(this.f412feyxiexzfUjhhgtg);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null && abstractC0822feyxiexzfUjhhgtg.mo153Ujhhgtgfeyxiexzf()) {
            return this.f370Ujhhgtgfeyxiexzf.mo121Ujhhgtgfeyxiexzf(this.f412feyxiexzfUjhhgtg);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null && abstractC0822feyxiexzfUjhhgtg.mo153Ujhhgtgfeyxiexzf()) {
            return this.f370Ujhhgtgfeyxiexzf.mo122Ujhhgtgfeyxiexzf(this.f412feyxiexzfUjhhgtg);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC0822feyxiexzfUjhhgtg layoutManager = getLayoutManager();
        int iMo2134Ujhhgtgfeyxiexzf = 0;
        if (layoutManager != null) {
            if (layoutManager.mo153Ujhhgtgfeyxiexzf()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m255Ujhhgtgfeyxiexzf(0, measuredHeight, false);
                        return true;
                    }
                    m255Ujhhgtgfeyxiexzf(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo160feyxiexzfUjhhgtg = layoutManager.mo160feyxiexzfUjhhgtg();
                    if (keyCode == 122) {
                        if (zMo160feyxiexzfUjhhgtg) {
                            iMo2134Ujhhgtgfeyxiexzf = getAdapter().mo2134Ujhhgtgfeyxiexzf();
                        }
                    } else if (!zMo160feyxiexzfUjhhgtg) {
                        iMo2134Ujhhgtgfeyxiexzf = getAdapter().mo2134Ujhhgtgfeyxiexzf();
                    }
                    m256Ujhhgtgfeyxiexzf(iMo2134Ujhhgtgfeyxiexzf);
                    return true;
                }
            } else if (layoutManager.mo152Ujhhgtgfeyxiexzf()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m255Ujhhgtgfeyxiexzf(measuredWidth, 0, false);
                        return true;
                    }
                    m255Ujhhgtgfeyxiexzf(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo160feyxiexzfUjhhgtg2 = layoutManager.mo160feyxiexzfUjhhgtg();
                    if (keyCode2 == 122) {
                        if (zMo160feyxiexzfUjhhgtg2) {
                            iMo2134Ujhhgtgfeyxiexzf = getAdapter().mo2134Ujhhgtgfeyxiexzf();
                        }
                    } else if (!zMo160feyxiexzfUjhhgtg2) {
                        iMo2134Ujhhgtgfeyxiexzf = getAdapter().mo2134Ujhhgtgfeyxiexzf();
                    }
                    m256Ujhhgtgfeyxiexzf(iMo2134Ujhhgtgfeyxiexzf);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m1748Ujhhgtgfeyxiexzf(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m1749Ujhhgtgfeyxiexzf(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1750Ujhhgtgfeyxiexzf(iArr, i, i2, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m1751Ujhhgtgfeyxiexzf(i, i2, i3, i4, iArr, 0, null);
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
        ArrayList arrayList = this.f372Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0826feyxiexzfUjhhgtg) arrayList.get(i)).mo2000Ujhhgtgfeyxiexzf(canvas, this);
        }
        EdgeEffect edgeEffect = this.f391feyxiexzfUjhhgtg;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f364Ujhhgtgfeyxiexzf ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f391feyxiexzfUjhhgtg;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f392feyxiexzfUjhhgtg;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f364Ujhhgtgfeyxiexzf) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f392feyxiexzfUjhhgtg;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f393feyxiexzfUjhhgtg;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f364Ujhhgtgfeyxiexzf ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f393feyxiexzfUjhhgtg;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f394feyxiexzfUjhhgtg;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f364Ujhhgtgfeyxiexzf) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f394feyxiexzfUjhhgtg;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f395feyxiexzfUjhhgtg == null || arrayList.size() <= 0 || !this.f395feyxiexzfUjhhgtg.mo2129Ujhhgtgfeyxiexzf()) ? z : true) {
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
        View viewMo128Ujhhgtgfeyxiexzf;
        int i2;
        byte b;
        boolean z;
        this.f370Ujhhgtgfeyxiexzf.getClass();
        boolean z2 = true;
        boolean z3 = (this.f369Ujhhgtgfeyxiexzf == null || this.f370Ujhhgtgfeyxiexzf == null || m235feyxiexzfUjhhgtg() || this.f380feyxiexzfUjhhgtg) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        if (z3 && (i == 2 || i == 1)) {
            if (this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? Opcodes.IXOR : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.f370Ujhhgtgfeyxiexzf.mo152Ujhhgtgfeyxiexzf()) {
                z = focusFinder.findNextFocus(this, view, (this.f370Ujhhgtgfeyxiexzf.f3261Ujhhgtgfeyxiexzf.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                m210Ujhhgtgfeyxiexzf();
                if (m225feyxiexzfUjhhgtg(view) != null) {
                    m257feyxiexzfUjhhgtg();
                    this.f370Ujhhgtgfeyxiexzf.mo128Ujhhgtgfeyxiexzf(view, i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
                    m259Ujhhgtgfeyxiexzf(false);
                }
                return null;
            }
            viewMo128Ujhhgtgfeyxiexzf = focusFinder.findNextFocus(this, view, i);
            if (viewMo128Ujhhgtgfeyxiexzf == null) {
            }
            if (viewMo128Ujhhgtgfeyxiexzf != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                return viewMo128Ujhhgtgfeyxiexzf;
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z3) {
            m210Ujhhgtgfeyxiexzf();
            if (m225feyxiexzfUjhhgtg(view) != null) {
                m257feyxiexzfUjhhgtg();
                viewMo128Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.mo128Ujhhgtgfeyxiexzf(view, i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
                m259Ujhhgtgfeyxiexzf(false);
            }
            return null;
        }
        viewMo128Ujhhgtgfeyxiexzf = viewFindNextFocus;
        if (viewMo128Ujhhgtgfeyxiexzf == null && !viewMo128Ujhhgtgfeyxiexzf.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m250feyxiexzfUjhhgtg(viewMo128Ujhhgtgfeyxiexzf, null);
            return view;
        }
        if (viewMo128Ujhhgtgfeyxiexzf != null || viewMo128Ujhhgtgfeyxiexzf == this || viewMo128Ujhhgtgfeyxiexzf == view) {
            z2 = false;
        } else if (m225feyxiexzfUjhhgtg(viewMo128Ujhhgtgfeyxiexzf) == null) {
            z2 = false;
        } else if (view != null && m225feyxiexzfUjhhgtg(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f366Ujhhgtgfeyxiexzf;
            rect.set(0, 0, width, height);
            int width2 = viewMo128Ujhhgtgfeyxiexzf.getWidth();
            int height2 = viewMo128Ujhhgtgfeyxiexzf.getHeight();
            Rect rect2 = this.f367Ujhhgtgfeyxiexzf;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewMo128Ujhhgtgfeyxiexzf, rect2);
            int i3 = this.f370Ujhhgtgfeyxiexzf.f3261Ujhhgtgfeyxiexzf.getLayoutDirection() == 1 ? -1 : 1;
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
                                    throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, sb));
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
            return viewMo128Ujhhgtgfeyxiexzf;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            return abstractC0822feyxiexzfUjhhgtg.mo123Ujhhgtgfeyxiexzf();
        }
        throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            return abstractC0822feyxiexzfUjhhgtg.mo124Ujhhgtgfeyxiexzf(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0795feyxiexzfUjhhgtg getAdapter() {
        return this.f369Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null) {
            return super.getBaseline();
        }
        abstractC0822feyxiexzfUjhhgtg.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f364Ujhhgtgfeyxiexzf;
    }

    public C0816feyxiexzfUjhhgtg getCompatAccessibilityDelegate() {
        return this.f419Ujhhgtgfeyxiexzf;
    }

    public AbstractC0792feyxiexzfUjhhgtg getEdgeEffectFactory() {
        return this.f390feyxiexzfUjhhgtg;
    }

    public AbstractC0793feyxiexzfUjhhgtg getItemAnimator() {
        return this.f395feyxiexzfUjhhgtg;
    }

    public int getItemDecorationCount() {
        return this.f372Ujhhgtgfeyxiexzf.size();
    }

    public AbstractC0822feyxiexzfUjhhgtg getLayoutManager() {
        return this.f370Ujhhgtgfeyxiexzf;
    }

    public int getMaxFlingVelocity() {
        return this.f405Ujhhgtgfeyxiexzf;
    }

    public int getMinFlingVelocity() {
        return this.f404Ujhhgtgfeyxiexzf;
    }

    public long getNanoTime() {
        if (f353feyxiexzfUjhhgtg) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0824feyxiexzfUjhhgtg getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f408Ujhhgtgfeyxiexzf;
    }

    public C0828feyxiexzfUjhhgtg getRecycledViewPool() {
        return this.f359Ujhhgtgfeyxiexzf.m2231Ujhhgtgfeyxiexzf();
    }

    public int getScrollState() {
        return this.f396feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m1753Ujhhgtgfeyxiexzf(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f375Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f380feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2287Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f388feyxiexzfUjhhgtg = 0;
        this.f375Ujhhgtgfeyxiexzf = true;
        this.f377Ujhhgtgfeyxiexzf = this.f377Ujhhgtgfeyxiexzf && !isLayoutRequested();
        this.f359Ujhhgtgfeyxiexzf.m2232Ujhhgtgfeyxiexzf();
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            abstractC0822feyxiexzfUjhhgtg.f3266Ujhhgtgfeyxiexzf = true;
            abstractC0822feyxiexzfUjhhgtg.mo758feyxiexzfUjhhgtg(this);
        }
        this.f418feyxiexzfUjhhgtg = false;
        if (f353feyxiexzfUjhhgtg) {
            ThreadLocal threadLocal = RunnableC3565Ujhhgtgfeyxiexzf.f11079Ujhhgtgfeyxiexzf;
            RunnableC3565Ujhhgtgfeyxiexzf runnableC3565Ujhhgtgfeyxiexzf = (RunnableC3565Ujhhgtgfeyxiexzf) threadLocal.get();
            this.f410feyxiexzfUjhhgtg = runnableC3565Ujhhgtgfeyxiexzf;
            if (runnableC3565Ujhhgtgfeyxiexzf == null) {
                this.f410feyxiexzfUjhhgtg = new RunnableC3565Ujhhgtgfeyxiexzf();
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC3565Ujhhgtgfeyxiexzf runnableC3565Ujhhgtgfeyxiexzf2 = this.f410feyxiexzfUjhhgtg;
                runnableC3565Ujhhgtgfeyxiexzf2.f11083Ujhhgtgfeyxiexzf = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC3565Ujhhgtgfeyxiexzf2);
            }
            ArrayList arrayList = this.f410feyxiexzfUjhhgtg.f11081Ujhhgtgfeyxiexzf;
            if (f348feyxiexzfUjhhgtg && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC3565Ujhhgtgfeyxiexzf runnableC3565Ujhhgtgfeyxiexzf;
        super.onDetachedFromWindow();
        AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = this.f395feyxiexzfUjhhgtg;
        if (abstractC0793feyxiexzfUjhhgtg != null) {
            abstractC0793feyxiexzfUjhhgtg.mo2128Ujhhgtgfeyxiexzf();
        }
        m261Ujhhgtgfeyxiexzf();
        int i = 0;
        this.f375Ujhhgtgfeyxiexzf = false;
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            abstractC0822feyxiexzfUjhhgtg.f3266Ujhhgtgfeyxiexzf = false;
            abstractC0822feyxiexzfUjhhgtg.mo161Ujhhgtgfeyxiexzf(this);
        }
        this.f425Ujhhgtgfeyxiexzf.clear();
        removeCallbacks(this.f426feyxiexzfUjhhgtg);
        this.f363Ujhhgtgfeyxiexzf.getClass();
        while (C2295Ujhhgtgfeyxiexzf.f7525Ujhhgtgfeyxiexzf.mo2933Ujhhgtgfeyxiexzf() != null) {
        }
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c0831feyxiexzfUjhhgtg.f3294Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC3612feyxiexzfUjhhgtg.m5233Ujhhgtgfeyxiexzf(((AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i2)).f3241Ujhhgtgfeyxiexzf);
        }
        c0831feyxiexzfUjhhgtg.m2233Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg.f3299Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C1444feyxiexzfUjhhgtg c1444feyxiexzfUjhhgtg = (C1444feyxiexzfUjhhgtg) childAt.getTag(me.hd.wauxv.R.id.pooling_container_listener_holder_tag);
            if (c1444feyxiexzfUjhhgtg == null) {
                c1444feyxiexzfUjhhgtg = new C1444feyxiexzfUjhhgtg();
                childAt.setTag(me.hd.wauxv.R.id.pooling_container_listener_holder_tag, c1444feyxiexzfUjhhgtg);
            }
            ArrayList arrayList2 = c1444feyxiexzfUjhhgtg.f5054Ujhhgtgfeyxiexzf;
            int iM4191Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(arrayList2);
            if (-1 < iM4191Ujhhgtgfeyxiexzf) {
                arrayList2.get(iM4191Ujhhgtgfeyxiexzf).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!f353feyxiexzfUjhhgtg || (runnableC3565Ujhhgtgfeyxiexzf = this.f410feyxiexzfUjhhgtg) == null) {
            return;
        }
        boolean zRemove = runnableC3565Ujhhgtgfeyxiexzf.f11081Ujhhgtgfeyxiexzf.remove(this);
        if (f348feyxiexzfUjhhgtg && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f410feyxiexzfUjhhgtg = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f372Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0826feyxiexzfUjhhgtg) arrayList.get(i)).mo1999Ujhhgtgfeyxiexzf(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.f370Ujhhgtgfeyxiexzf != null && !this.f380feyxiexzfUjhhgtg && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f370Ujhhgtgfeyxiexzf.mo152Ujhhgtgfeyxiexzf() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.f370Ujhhgtgfeyxiexzf.mo152Ujhhgtgfeyxiexzf()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.f430Ujhhgtgfeyxiexzf;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f407Ujhhgtgfeyxiexzf);
            int i3 = (int) (axisValue * this.f406Ujhhgtgfeyxiexzf);
            if (z) {
                OverScroller overScroller = this.f409feyxiexzfUjhhgtg.f3233Ujhhgtgfeyxiexzf;
                m255Ujhhgtgfeyxiexzf((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
                if (abstractC0822feyxiexzfUjhhgtg == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f380feyxiexzfUjhhgtg) {
                    int[] iArr = this.f424feyxiexzfUjhhgtg;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo152Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf();
                    boolean zMo153Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf();
                    int i4 = zMo153Ujhhgtgfeyxiexzf ? (zMo152Ujhhgtgfeyxiexzf ? 1 : 0) | 2 : zMo152Ujhhgtgfeyxiexzf ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM247Ujhhgtgfeyxiexzf = i3 - m247Ujhhgtgfeyxiexzf(i3, y);
                    int iM248Ujhhgtgfeyxiexzf = i2 - m248Ujhhgtgfeyxiexzf(i2, x);
                    getScrollingChildHelper().m1754Ujhhgtgfeyxiexzf(i4, 1);
                    if (m216Ujhhgtgfeyxiexzf(this.f424feyxiexzfUjhhgtg, zMo152Ujhhgtgfeyxiexzf ? iM247Ujhhgtgfeyxiexzf : 0, zMo153Ujhhgtgfeyxiexzf ? iM248Ujhhgtgfeyxiexzf : 0, 1, this.f422Ujhhgtgfeyxiexzf)) {
                        iM247Ujhhgtgfeyxiexzf -= iArr[0];
                        iM248Ujhhgtgfeyxiexzf -= iArr[1];
                    }
                    m251feyxiexzfUjhhgtg(zMo152Ujhhgtgfeyxiexzf ? iM247Ujhhgtgfeyxiexzf : 0, zMo153Ujhhgtgfeyxiexzf ? iM248Ujhhgtgfeyxiexzf : 0, motionEvent, 1);
                    RunnableC3565Ujhhgtgfeyxiexzf runnableC3565Ujhhgtgfeyxiexzf = this.f410feyxiexzfUjhhgtg;
                    if (runnableC3565Ujhhgtgfeyxiexzf != null && (iM247Ujhhgtgfeyxiexzf != 0 || iM248Ujhhgtgfeyxiexzf != 0)) {
                        runnableC3565Ujhhgtgfeyxiexzf.m5103Ujhhgtgfeyxiexzf(this, iM247Ujhhgtgfeyxiexzf, iM248Ujhhgtgfeyxiexzf);
                    }
                    m260feyxiexzfUjhhgtg(1);
                }
            }
            if (i != 0 && !z) {
                this.f432Ujhhgtgfeyxiexzf.m4669Ujhhgtgfeyxiexzf(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f380feyxiexzfUjhhgtg) {
            this.f374Ujhhgtgfeyxiexzf = null;
            if (m226feyxiexzfUjhhgtg(motionEvent)) {
                VelocityTracker velocityTracker = this.f398feyxiexzfUjhhgtg;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m260feyxiexzfUjhhgtg(0);
                m246Ujhhgtgfeyxiexzf();
                setScrollState(0);
                return true;
            }
            AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
            if (abstractC0822feyxiexzfUjhhgtg != null) {
                boolean zMo152Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf();
                boolean zMo153Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf();
                if (this.f398feyxiexzfUjhhgtg == null) {
                    this.f398feyxiexzfUjhhgtg = VelocityTracker.obtain();
                }
                this.f398feyxiexzfUjhhgtg.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f381feyxiexzfUjhhgtg) {
                        this.f381feyxiexzfUjhhgtg = false;
                    }
                    this.f397feyxiexzfUjhhgtg = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f401feyxiexzfUjhhgtg = x;
                    this.f399feyxiexzfUjhhgtg = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f402feyxiexzfUjhhgtg = y;
                    this.f400feyxiexzfUjhhgtg = y;
                    EdgeEffect edgeEffect = this.f391feyxiexzfUjhhgtg;
                    if (edgeEffect == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f391feyxiexzfUjhhgtg, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f393feyxiexzfUjhhgtg;
                    if (edgeEffect2 != null && AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f393feyxiexzfUjhhgtg, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.f392feyxiexzfUjhhgtg;
                    if (edgeEffect3 != null && AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f392feyxiexzfUjhhgtg, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.f394feyxiexzfUjhhgtg;
                    if (edgeEffect4 != null && AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f394feyxiexzfUjhhgtg, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.f396feyxiexzfUjhhgtg == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m260feyxiexzfUjhhgtg(1);
                    }
                    int[] iArr = this.f423feyxiexzfUjhhgtg;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m258feyxiexzfUjhhgtg(0);
                } else if (actionMasked == 1) {
                    this.f398feyxiexzfUjhhgtg.clear();
                    m260feyxiexzfUjhhgtg(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f397feyxiexzfUjhhgtg);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f397feyxiexzfUjhhgtg + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f396feyxiexzfUjhhgtg != 1) {
                        int i = x2 - this.f399feyxiexzfUjhhgtg;
                        int i2 = y2 - this.f400feyxiexzfUjhhgtg;
                        if (!zMo152Ujhhgtgfeyxiexzf || Math.abs(i) <= this.f403Ujhhgtgfeyxiexzf) {
                            z2 = false;
                        } else {
                            this.f401feyxiexzfUjhhgtg = x2;
                            z2 = true;
                        }
                        if (zMo153Ujhhgtgfeyxiexzf && Math.abs(i2) > this.f403Ujhhgtgfeyxiexzf) {
                            this.f402feyxiexzfUjhhgtg = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f398feyxiexzfUjhhgtg;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m260feyxiexzfUjhhgtg(0);
                    m246Ujhhgtgfeyxiexzf();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f397feyxiexzfUjhhgtg = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f401feyxiexzfUjhhgtg = x3;
                    this.f399feyxiexzfUjhhgtg = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f402feyxiexzfUjhhgtg = y3;
                    this.f400feyxiexzfUjhhgtg = y3;
                } else if (actionMasked == 6) {
                    m241feyxiexzfUjhhgtg(motionEvent);
                }
                if (this.f396feyxiexzfUjhhgtg == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m213Ujhhgtgfeyxiexzf();
        Trace.endSection();
        this.f377Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null) {
            m211Ujhhgtgfeyxiexzf(i, i2);
            return;
        }
        boolean zMo159feyxiexzfUjhhgtg = abstractC0822feyxiexzfUjhhgtg.mo159feyxiexzfUjhhgtg();
        boolean z = false;
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
        if (zMo159feyxiexzfUjhhgtg) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f370Ujhhgtgfeyxiexzf.f3261Ujhhgtgfeyxiexzf.m211Ujhhgtgfeyxiexzf(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f427Ujhhgtgfeyxiexzf = z;
            if (z || this.f369Ujhhgtgfeyxiexzf == null) {
                return;
            }
            if (c0810feyxiexzfUjhhgtg.f3208Ujhhgtgfeyxiexzf == 1) {
                m214Ujhhgtgfeyxiexzf();
            }
            this.f370Ujhhgtgfeyxiexzf.m2218Ujhhgtgfeyxiexzf(i, i2);
            c0810feyxiexzfUjhhgtg.f3213Ujhhgtgfeyxiexzf = true;
            m215Ujhhgtgfeyxiexzf();
            this.f370Ujhhgtgfeyxiexzf.m2219feyxiexzfUjhhgtg(i, i2);
            if (this.f370Ujhhgtgfeyxiexzf.mo166feyxiexzfUjhhgtg()) {
                this.f370Ujhhgtgfeyxiexzf.m2218Ujhhgtgfeyxiexzf(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c0810feyxiexzfUjhhgtg.f3213Ujhhgtgfeyxiexzf = true;
                m215Ujhhgtgfeyxiexzf();
                this.f370Ujhhgtgfeyxiexzf.m2219feyxiexzfUjhhgtg(i, i2);
            }
            this.f428Ujhhgtgfeyxiexzf = getMeasuredWidth();
            this.f429Ujhhgtgfeyxiexzf = getMeasuredHeight();
            return;
        }
        if (this.f376Ujhhgtgfeyxiexzf) {
            this.f370Ujhhgtgfeyxiexzf.f3261Ujhhgtgfeyxiexzf.m211Ujhhgtgfeyxiexzf(i, i2);
            return;
        }
        if (this.f383feyxiexzfUjhhgtg) {
            m257feyxiexzfUjhhgtg();
            m239feyxiexzfUjhhgtg();
            m243Ujhhgtgfeyxiexzf();
            m240feyxiexzfUjhhgtg(true);
            if (c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf) {
                c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf = true;
            } else {
                this.f361Ujhhgtgfeyxiexzf.m4476Ujhhgtgfeyxiexzf();
                c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf = false;
            }
            this.f383feyxiexzfUjhhgtg = false;
            m259Ujhhgtgfeyxiexzf(false);
        } else if (c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = this.f369Ujhhgtgfeyxiexzf;
        if (abstractC0795feyxiexzfUjhhgtg != null) {
            c0810feyxiexzfUjhhgtg.f3209Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg.mo2134Ujhhgtgfeyxiexzf();
        } else {
            c0810feyxiexzfUjhhgtg.f3209Ujhhgtgfeyxiexzf = 0;
        }
        m257feyxiexzfUjhhgtg();
        this.f370Ujhhgtgfeyxiexzf.f3261Ujhhgtgfeyxiexzf.m211Ujhhgtgfeyxiexzf(i, i2);
        m259Ujhhgtgfeyxiexzf(false);
        c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m235feyxiexzfUjhhgtg()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0812feyxiexzfUjhhgtg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0812feyxiexzfUjhhgtg c0812feyxiexzfUjhhgtg = (C0812feyxiexzfUjhhgtg) parcelable;
        this.f360Ujhhgtgfeyxiexzf = c0812feyxiexzfUjhhgtg;
        super.onRestoreInstanceState(c0812feyxiexzfUjhhgtg.f9210Ujhhgtgfeyxiexzf);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0812feyxiexzfUjhhgtg c0812feyxiexzfUjhhgtg = new C0812feyxiexzfUjhhgtg(super.onSaveInstanceState());
        C0812feyxiexzfUjhhgtg c0812feyxiexzfUjhhgtg2 = this.f360Ujhhgtgfeyxiexzf;
        if (c0812feyxiexzfUjhhgtg2 != null) {
            c0812feyxiexzfUjhhgtg.f3219Ujhhgtgfeyxiexzf = c0812feyxiexzfUjhhgtg2.f3219Ujhhgtgfeyxiexzf;
            return c0812feyxiexzfUjhhgtg;
        }
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            c0812feyxiexzfUjhhgtg.f3219Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.mo164feyxiexzfUjhhgtg();
            return c0812feyxiexzfUjhhgtg;
        }
        c0812feyxiexzfUjhhgtg.f3219Ujhhgtgfeyxiexzf = null;
        return c0812feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f394feyxiexzfUjhhgtg = null;
        this.f392feyxiexzfUjhhgtg = null;
        this.f393feyxiexzfUjhhgtg = null;
        this.f391feyxiexzfUjhhgtg = null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[PHI: r1
      0x0111: PHI (r1v45 int) = (r1v31 int), (r1v49 int) binds: [B:56:0x00fa, B:60:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM226feyxiexzfUjhhgtg;
        boolean z;
        if (!this.f380feyxiexzfUjhhgtg && !this.f381feyxiexzfUjhhgtg) {
            InterfaceC0832feyxiexzfUjhhgtg interfaceC0832feyxiexzfUjhhgtg = this.f374Ujhhgtgfeyxiexzf;
            if (interfaceC0832feyxiexzfUjhhgtg == null) {
                zM226feyxiexzfUjhhgtg = motionEvent.getAction() == 0 ? false : m226feyxiexzfUjhhgtg(motionEvent);
            } else {
                interfaceC0832feyxiexzfUjhhgtg.mo1977Ujhhgtgfeyxiexzf(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f374Ujhhgtgfeyxiexzf = null;
                }
                zM226feyxiexzfUjhhgtg = true;
            }
            if (zM226feyxiexzfUjhhgtg) {
                VelocityTracker velocityTracker = this.f398feyxiexzfUjhhgtg;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m260feyxiexzfUjhhgtg(0);
                m246Ujhhgtgfeyxiexzf();
                setScrollState(0);
                return true;
            }
            AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
            if (abstractC0822feyxiexzfUjhhgtg != null) {
                boolean zMo152Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf();
                boolean zMo153Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf();
                if (this.f398feyxiexzfUjhhgtg == null) {
                    this.f398feyxiexzfUjhhgtg = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f423feyxiexzfUjhhgtg;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f398feyxiexzfUjhhgtg.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f398feyxiexzfUjhhgtg;
                        int i = this.f405Ujhhgtgfeyxiexzf;
                        velocityTracker2.computeCurrentVelocity(1000, i);
                        float f = zMo152Ujhhgtgfeyxiexzf ? -this.f398feyxiexzfUjhhgtg.getXVelocity(this.f397feyxiexzfUjhhgtg) : 0.0f;
                        float f2 = zMo153Ujhhgtgfeyxiexzf ? -this.f398feyxiexzfUjhhgtg.getYVelocity(this.f397feyxiexzfUjhhgtg) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !m229feyxiexzfUjhhgtg((int) f, (int) f2, this.f404Ujhhgtgfeyxiexzf, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f398feyxiexzfUjhhgtg;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        m260feyxiexzfUjhhgtg(0);
                        m246Ujhhgtgfeyxiexzf();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f397feyxiexzfUjhhgtg);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f397feyxiexzfUjhhgtg + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f401feyxiexzfUjhhgtg - x;
                        int iMax2 = this.f402feyxiexzfUjhhgtg - y;
                        if (this.f396feyxiexzfUjhhgtg != 1) {
                            if (zMo152Ujhhgtgfeyxiexzf) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.f403Ujhhgtgfeyxiexzf) : Math.min(0, iMax + this.f403Ujhhgtgfeyxiexzf);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zMo153Ujhhgtgfeyxiexzf) {
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f403Ujhhgtgfeyxiexzf) : Math.min(0, iMax2 + this.f403Ujhhgtgfeyxiexzf);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.f396feyxiexzfUjhhgtg == 1) {
                            int[] iArr2 = this.f424feyxiexzfUjhhgtg;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iM247Ujhhgtgfeyxiexzf = iMax - m247Ujhhgtgfeyxiexzf(iMax, motionEvent.getY());
                            int iM248Ujhhgtgfeyxiexzf = iMax2 - m248Ujhhgtgfeyxiexzf(iMax2, motionEvent.getX());
                            boolean zM216Ujhhgtgfeyxiexzf = m216Ujhhgtgfeyxiexzf(this.f424feyxiexzfUjhhgtg, zMo152Ujhhgtgfeyxiexzf ? iM247Ujhhgtgfeyxiexzf : 0, zMo153Ujhhgtgfeyxiexzf ? iM248Ujhhgtgfeyxiexzf : 0, 0, this.f422Ujhhgtgfeyxiexzf);
                            int[] iArr3 = this.f422Ujhhgtgfeyxiexzf;
                            if (zM216Ujhhgtgfeyxiexzf) {
                                iM247Ujhhgtgfeyxiexzf -= iArr2[0];
                                iM248Ujhhgtgfeyxiexzf -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i2 = iM247Ujhhgtgfeyxiexzf;
                            int i3 = iM248Ujhhgtgfeyxiexzf;
                            this.f401feyxiexzfUjhhgtg = x - iArr3[0];
                            this.f402feyxiexzfUjhhgtg = y - iArr3[1];
                            if (m251feyxiexzfUjhhgtg(zMo152Ujhhgtgfeyxiexzf ? i2 : 0, zMo153Ujhhgtgfeyxiexzf ? i3 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC3565Ujhhgtgfeyxiexzf runnableC3565Ujhhgtgfeyxiexzf = this.f410feyxiexzfUjhhgtg;
                            if (runnableC3565Ujhhgtgfeyxiexzf != null && (i2 != 0 || i3 != 0)) {
                                runnableC3565Ujhhgtgfeyxiexzf.m5103Ujhhgtgfeyxiexzf(this, i2, i3);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f398feyxiexzfUjhhgtg;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        m260feyxiexzfUjhhgtg(0);
                        m246Ujhhgtgfeyxiexzf();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f397feyxiexzfUjhhgtg = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f401feyxiexzfUjhhgtg = x2;
                        this.f399feyxiexzfUjhhgtg = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f402feyxiexzfUjhhgtg = y2;
                        this.f400feyxiexzfUjhhgtg = y2;
                    } else if (actionMasked == 6) {
                        m241feyxiexzfUjhhgtg(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f397feyxiexzfUjhhgtg = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.f401feyxiexzfUjhhgtg = x3;
                this.f399feyxiexzfUjhhgtg = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.f402feyxiexzfUjhhgtg = y3;
                this.f400feyxiexzfUjhhgtg = y3;
                m258feyxiexzfUjhhgtg(0);
                this.f398feyxiexzfUjhhgtg.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(view);
        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null) {
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2181Ujhhgtgfeyxiexzf()) {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf &= -257;
            } else if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, sb));
            }
        } else if (f348feyxiexzfUjhhgtg) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, sb2));
        }
        view.clearAnimation();
        m212Ujhhgtgfeyxiexzf(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.f3264Ujhhgtgfeyxiexzf;
        if ((c0069Ujhhgtgfeyxiexzf == null || !c0069Ujhhgtgfeyxiexzf.f1092Ujhhgtgfeyxiexzf) && !m235feyxiexzfUjhhgtg() && view2 != null) {
            m250feyxiexzfUjhhgtg(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f370Ujhhgtgfeyxiexzf.mo810Ujhhgtgfeyxiexzf(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f373Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0832feyxiexzfUjhhgtg) arrayList.get(i)).mo1979Ujhhgtgfeyxiexzf(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f378Ujhhgtgfeyxiexzf != 0 || this.f380feyxiexzfUjhhgtg) {
            this.f379feyxiexzfUjhhgtg = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f380feyxiexzfUjhhgtg) {
            return;
        }
        boolean zMo152Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf();
        boolean zMo153Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf();
        if (zMo152Ujhhgtgfeyxiexzf || zMo153Ujhhgtgfeyxiexzf) {
            if (!zMo152Ujhhgtgfeyxiexzf) {
                i = 0;
            }
            if (!zMo153Ujhhgtgfeyxiexzf) {
                i2 = 0;
            }
            m251feyxiexzfUjhhgtg(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m235feyxiexzfUjhhgtg()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f382feyxiexzfUjhhgtg |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0816feyxiexzfUjhhgtg c0816feyxiexzfUjhhgtg) {
        this.f419Ujhhgtgfeyxiexzf = c0816feyxiexzfUjhhgtg;
        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(this, c0816feyxiexzfUjhhgtg);
    }

    public void setAdapter(AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg) {
        setLayoutFrozen(false);
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg2 = this.f369Ujhhgtgfeyxiexzf;
        C0813feyxiexzfUjhhgtg c0813feyxiexzfUjhhgtg = this.f358Ujhhgtgfeyxiexzf;
        if (abstractC0795feyxiexzfUjhhgtg2 != null) {
            abstractC0795feyxiexzfUjhhgtg2.f3111Ujhhgtgfeyxiexzf.unregisterObserver(c0813feyxiexzfUjhhgtg);
            this.f369Ujhhgtgfeyxiexzf.mo2142Ujhhgtgfeyxiexzf();
        }
        AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = this.f395feyxiexzfUjhhgtg;
        if (abstractC0793feyxiexzfUjhhgtg != null) {
            abstractC0793feyxiexzfUjhhgtg.mo2128Ujhhgtgfeyxiexzf();
        }
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            abstractC0822feyxiexzfUjhhgtg.m2211feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg);
            this.f370Ujhhgtgfeyxiexzf.m2212Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg);
        }
        c0831feyxiexzfUjhhgtg.f3292Ujhhgtgfeyxiexzf.clear();
        c0831feyxiexzfUjhhgtg.m2234Ujhhgtgfeyxiexzf();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f361Ujhhgtgfeyxiexzf;
        c3017Ujhhgtgfeyxiexzf.m4494feyxiexzfUjhhgtg((ArrayList) c3017Ujhhgtgfeyxiexzf.f9378Ujhhgtgfeyxiexzf);
        c3017Ujhhgtgfeyxiexzf.m4494feyxiexzfUjhhgtg((ArrayList) c3017Ujhhgtgfeyxiexzf.f9379Ujhhgtgfeyxiexzf);
        c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf = 0;
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg3 = this.f369Ujhhgtgfeyxiexzf;
        this.f369Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg;
        if (abstractC0795feyxiexzfUjhhgtg != null) {
            abstractC0795feyxiexzfUjhhgtg.f3111Ujhhgtgfeyxiexzf.registerObserver(c0813feyxiexzfUjhhgtg);
            abstractC0795feyxiexzfUjhhgtg.mo2138Ujhhgtgfeyxiexzf(this);
        }
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg2 = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg2 != null) {
            abstractC0822feyxiexzfUjhhgtg2.mo265feyxiexzfUjhhgtg(this.f369Ujhhgtgfeyxiexzf);
        }
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg4 = this.f369Ujhhgtgfeyxiexzf;
        c0831feyxiexzfUjhhgtg.f3292Ujhhgtgfeyxiexzf.clear();
        c0831feyxiexzfUjhhgtg.m2234Ujhhgtgfeyxiexzf();
        c0831feyxiexzfUjhhgtg.m2233Ujhhgtgfeyxiexzf(abstractC0795feyxiexzfUjhhgtg3, true);
        C0828feyxiexzfUjhhgtg c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf = c0831feyxiexzfUjhhgtg.m2231Ujhhgtgfeyxiexzf();
        if (abstractC0795feyxiexzfUjhhgtg3 != null) {
            c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf.f3286Ujhhgtgfeyxiexzf--;
        }
        if (c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf.f3286Ujhhgtgfeyxiexzf == 0) {
            SparseArray sparseArray = c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf.f3285Ujhhgtgfeyxiexzf;
            for (int i = 0; i < sparseArray.size(); i++) {
                C0829feyxiexzfUjhhgtg c0829feyxiexzfUjhhgtg = (C0829feyxiexzfUjhhgtg) sparseArray.valueAt(i);
                Iterator it = c0829feyxiexzfUjhhgtg.f3288Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    AbstractC3612feyxiexzfUjhhgtg.m5233Ujhhgtgfeyxiexzf(((AbstractC0821feyxiexzfUjhhgtg) it.next()).f3241Ujhhgtgfeyxiexzf);
                }
                c0829feyxiexzfUjhhgtg.f3288Ujhhgtgfeyxiexzf.clear();
            }
        }
        if (abstractC0795feyxiexzfUjhhgtg4 != null) {
            c0828feyxiexzfUjhhgtgM2231Ujhhgtgfeyxiexzf.f3286Ujhhgtgfeyxiexzf++;
        }
        c0831feyxiexzfUjhhgtg.m2232Ujhhgtgfeyxiexzf();
        this.f412feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = true;
        m244Ujhhgtgfeyxiexzf(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0796feyxiexzfUjhhgtg interfaceC0796feyxiexzfUjhhgtg) {
        if (interfaceC0796feyxiexzfUjhhgtg == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(interfaceC0796feyxiexzfUjhhgtg != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f364Ujhhgtgfeyxiexzf) {
            this.f394feyxiexzfUjhhgtg = null;
            this.f392feyxiexzfUjhhgtg = null;
            this.f393feyxiexzfUjhhgtg = null;
            this.f391feyxiexzfUjhhgtg = null;
        }
        this.f364Ujhhgtgfeyxiexzf = z;
        super.setClipToPadding(z);
        if (this.f377Ujhhgtgfeyxiexzf) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0792feyxiexzfUjhhgtg abstractC0792feyxiexzfUjhhgtg) {
        abstractC0792feyxiexzfUjhhgtg.getClass();
        this.f390feyxiexzfUjhhgtg = abstractC0792feyxiexzfUjhhgtg;
        this.f394feyxiexzfUjhhgtg = null;
        this.f392feyxiexzfUjhhgtg = null;
        this.f393feyxiexzfUjhhgtg = null;
        this.f391feyxiexzfUjhhgtg = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f376Ujhhgtgfeyxiexzf = z;
    }

    public void setItemAnimator(AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg) {
        AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg2 = this.f395feyxiexzfUjhhgtg;
        if (abstractC0793feyxiexzfUjhhgtg2 != null) {
            abstractC0793feyxiexzfUjhhgtg2.mo2128Ujhhgtgfeyxiexzf();
            this.f395feyxiexzfUjhhgtg.f3105Ujhhgtgfeyxiexzf = null;
        }
        this.f395feyxiexzfUjhhgtg = abstractC0793feyxiexzfUjhhgtg;
        if (abstractC0793feyxiexzfUjhhgtg != null) {
            abstractC0793feyxiexzfUjhhgtg.f3105Ujhhgtgfeyxiexzf = this.f417feyxiexzfUjhhgtg;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        c0831feyxiexzfUjhhgtg.f3296Ujhhgtgfeyxiexzf = i;
        c0831feyxiexzfUjhhgtg.m2241Ujhhgtgfeyxiexzf();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg) {
        if (abstractC0822feyxiexzfUjhhgtg == this.f370Ujhhgtgfeyxiexzf) {
            return;
        }
        m261Ujhhgtgfeyxiexzf();
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg2 = this.f370Ujhhgtgfeyxiexzf;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg2 != null) {
            AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = this.f395feyxiexzfUjhhgtg;
            if (abstractC0793feyxiexzfUjhhgtg != null) {
                abstractC0793feyxiexzfUjhhgtg.mo2128Ujhhgtgfeyxiexzf();
            }
            this.f370Ujhhgtgfeyxiexzf.m2211feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg);
            this.f370Ujhhgtgfeyxiexzf.m2212Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg);
            c0831feyxiexzfUjhhgtg.f3292Ujhhgtgfeyxiexzf.clear();
            c0831feyxiexzfUjhhgtg.m2234Ujhhgtgfeyxiexzf();
            if (this.f375Ujhhgtgfeyxiexzf) {
                AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg3 = this.f370Ujhhgtgfeyxiexzf;
                abstractC0822feyxiexzfUjhhgtg3.f3266Ujhhgtgfeyxiexzf = false;
                abstractC0822feyxiexzfUjhhgtg3.mo161Ujhhgtgfeyxiexzf(this);
            }
            this.f370Ujhhgtgfeyxiexzf.m2220feyxiexzfUjhhgtg(null);
            this.f370Ujhhgtgfeyxiexzf = null;
        } else {
            c0831feyxiexzfUjhhgtg.f3292Ujhhgtgfeyxiexzf.clear();
            c0831feyxiexzfUjhhgtg.m2234Ujhhgtgfeyxiexzf();
        }
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f362Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = ((C0787feyxiexzfUjhhgtg) c2790feyxiexzfUjhhgtg.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf;
        ((C2816Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf).m4150Ujhhgtgfeyxiexzf();
        ArrayList arrayList = (ArrayList) c2790feyxiexzfUjhhgtg.f8836Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg((View) arrayList.get(size));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null) {
                int i = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3256Ujhhgtgfeyxiexzf;
                if (recyclerView.m235feyxiexzfUjhhgtg()) {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3257Ujhhgtgfeyxiexzf = i;
                    recyclerView.f425Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                } else {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.setImportantForAccessibility(i);
                }
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3256Ujhhgtgfeyxiexzf = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.m212Ujhhgtgfeyxiexzf(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f370Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            if (abstractC0822feyxiexzfUjhhgtg.f3261Ujhhgtgfeyxiexzf != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0822feyxiexzfUjhhgtg);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(abstractC0822feyxiexzfUjhhgtg.f3261Ujhhgtgfeyxiexzf, sb));
            }
            abstractC0822feyxiexzfUjhhgtg.m2220feyxiexzfUjhhgtg(this);
            if (this.f375Ujhhgtgfeyxiexzf) {
                AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg4 = this.f370Ujhhgtgfeyxiexzf;
                abstractC0822feyxiexzfUjhhgtg4.f3266Ujhhgtgfeyxiexzf = true;
                abstractC0822feyxiexzfUjhhgtg4.mo758feyxiexzfUjhhgtg(this);
            }
        }
        c0831feyxiexzfUjhhgtg.m2241Ujhhgtgfeyxiexzf();
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
        C0430Ujhhgtgfeyxiexzf scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2287Ujhhgtgfeyxiexzf) {
            ViewGroup viewGroup = scrollingChildHelper.f2286Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f2287Ujhhgtgfeyxiexzf = z;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0833feyxiexzfUjhhgtg abstractC0833feyxiexzfUjhhgtg) {
        this.f413feyxiexzfUjhhgtg = abstractC0833feyxiexzfUjhhgtg;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f408Ujhhgtgfeyxiexzf = z;
    }

    public void setRecycledViewPool(C0828feyxiexzfUjhhgtg c0828feyxiexzfUjhhgtg) {
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = c0831feyxiexzfUjhhgtg.f3299Ujhhgtgfeyxiexzf;
        c0831feyxiexzfUjhhgtg.m2233Ujhhgtgfeyxiexzf(recyclerView.f369Ujhhgtgfeyxiexzf, false);
        C0828feyxiexzfUjhhgtg c0828feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg.f3298Ujhhgtgfeyxiexzf;
        if (c0828feyxiexzfUjhhgtg2 != null) {
            c0828feyxiexzfUjhhgtg2.f3286Ujhhgtgfeyxiexzf--;
        }
        c0831feyxiexzfUjhhgtg.f3298Ujhhgtgfeyxiexzf = c0828feyxiexzfUjhhgtg;
        if (c0828feyxiexzfUjhhgtg != null && recyclerView.getAdapter() != null) {
            c0831feyxiexzfUjhhgtg.f3298Ujhhgtgfeyxiexzf.f3286Ujhhgtgfeyxiexzf++;
        }
        c0831feyxiexzfUjhhgtg.m2232Ujhhgtgfeyxiexzf();
    }

    public void setScrollState(int i) {
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf;
        if (i == this.f396feyxiexzfUjhhgtg) {
            return;
        }
        if (f349feyxiexzfUjhhgtg) {
            StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "setting scroll state to ", " from ");
            sbM4804Ujhhgtgfeyxiexzf.append(this.f396feyxiexzfUjhhgtg);
            Log.d("RecyclerView", sbM4804Ujhhgtgfeyxiexzf.toString(), new Exception());
        }
        this.f396feyxiexzfUjhhgtg = i;
        if (i != 2) {
            RunnableC0818feyxiexzfUjhhgtg runnableC0818feyxiexzfUjhhgtg = this.f409feyxiexzfUjhhgtg;
            runnableC0818feyxiexzfUjhhgtg.f3237Ujhhgtgfeyxiexzf.removeCallbacks(runnableC0818feyxiexzfUjhhgtg);
            runnableC0818feyxiexzfUjhhgtg.f3233Ujhhgtgfeyxiexzf.abortAnimation();
            AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
            if (abstractC0822feyxiexzfUjhhgtg != null && (c0069Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.f3264Ujhhgtgfeyxiexzf) != null) {
                c0069Ujhhgtgfeyxiexzf.m1085Ujhhgtgfeyxiexzf();
            }
        }
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg2 = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg2 != null) {
            abstractC0822feyxiexzfUjhhgtg2.mo266feyxiexzfUjhhgtg(i);
        }
        AbstractC0833feyxiexzfUjhhgtg abstractC0833feyxiexzfUjhhgtg = this.f413feyxiexzfUjhhgtg;
        if (abstractC0833feyxiexzfUjhhgtg != null) {
            abstractC0833feyxiexzfUjhhgtg.mo2242Ujhhgtgfeyxiexzf(this, i);
        }
        ArrayList arrayList = this.f414feyxiexzfUjhhgtg;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0833feyxiexzfUjhhgtg) this.f414feyxiexzfUjhhgtg.get(size)).mo2242Ujhhgtgfeyxiexzf(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f403Ujhhgtgfeyxiexzf = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f403Ujhhgtgfeyxiexzf = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0819feyxiexzfUjhhgtg abstractC0819feyxiexzfUjhhgtg) {
        this.f359Ujhhgtgfeyxiexzf.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m1754Ujhhgtgfeyxiexzf(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m1755Ujhhgtgfeyxiexzf(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f380feyxiexzfUjhhgtg) {
            m207Ujhhgtgfeyxiexzf("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f380feyxiexzfUjhhgtg = true;
                this.f381feyxiexzfUjhhgtg = true;
                m261Ujhhgtgfeyxiexzf();
                return;
            }
            this.f380feyxiexzfUjhhgtg = false;
            if (this.f379feyxiexzfUjhhgtg && this.f370Ujhhgtgfeyxiexzf != null && this.f369Ujhhgtgfeyxiexzf != null) {
                requestLayout();
            }
            this.f379feyxiexzfUjhhgtg = false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m205Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
        boolean z = view.getParent() == this;
        this.f359Ujhhgtgfeyxiexzf.m2240Ujhhgtgfeyxiexzf(m232feyxiexzfUjhhgtg(view));
        if (abstractC0821feyxiexzfUjhhgtg.m2181Ujhhgtgfeyxiexzf()) {
            this.f362Ujhhgtgfeyxiexzf.m4075Ujhhgtgfeyxiexzf(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f362Ujhhgtgfeyxiexzf.m4074Ujhhgtgfeyxiexzf(view, -1, true);
            return;
        }
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f362Ujhhgtgfeyxiexzf;
        int iIndexOfChild = ((C0787feyxiexzfUjhhgtg) c2790feyxiexzfUjhhgtg.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C2816Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf).m4151Ujhhgtgfeyxiexzf(iIndexOfChild);
            c2790feyxiexzfUjhhgtg.m4088Ujhhgtgfeyxiexzf(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m206Ujhhgtgfeyxiexzf(AbstractC0826feyxiexzfUjhhgtg abstractC0826feyxiexzfUjhhgtg) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            abstractC0822feyxiexzfUjhhgtg.mo151Ujhhgtgfeyxiexzf("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f372Ujhhgtgfeyxiexzf;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0826feyxiexzfUjhhgtg);
        m237feyxiexzfUjhhgtg();
        requestLayout();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m207Ujhhgtgfeyxiexzf(String str) {
        if (m235feyxiexzfUjhhgtg()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f389feyxiexzfUjhhgtg > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder(""))));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m208Ujhhgtgfeyxiexzf() {
        int iM4087Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        for (int i = 0; i < iM4087Ujhhgtgfeyxiexzf; i++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i));
            if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3244Ujhhgtgfeyxiexzf = -1;
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3247Ujhhgtgfeyxiexzf = -1;
            }
        }
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c0831feyxiexzfUjhhgtg.f3292Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = c0831feyxiexzfUjhhgtg.f3294Ujhhgtgfeyxiexzf;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList2.get(i2);
            abstractC0821feyxiexzfUjhhgtg.f3244Ujhhgtgfeyxiexzf = -1;
            abstractC0821feyxiexzfUjhhgtg.f3247Ujhhgtgfeyxiexzf = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = (AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i3);
            abstractC0821feyxiexzfUjhhgtg2.f3244Ujhhgtgfeyxiexzf = -1;
            abstractC0821feyxiexzfUjhhgtg2.f3247Ujhhgtgfeyxiexzf = -1;
        }
        ArrayList arrayList3 = c0831feyxiexzfUjhhgtg.f3293Ujhhgtgfeyxiexzf;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg3 = (AbstractC0821feyxiexzfUjhhgtg) c0831feyxiexzfUjhhgtg.f3293Ujhhgtgfeyxiexzf.get(i4);
                abstractC0821feyxiexzfUjhhgtg3.f3244Ujhhgtgfeyxiexzf = -1;
                abstractC0821feyxiexzfUjhhgtg3.f3247Ujhhgtgfeyxiexzf = -1;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m209Ujhhgtgfeyxiexzf(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f391feyxiexzfUjhhgtg;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f391feyxiexzfUjhhgtg.onRelease();
            zIsFinished = this.f391feyxiexzfUjhhgtg.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f393feyxiexzfUjhhgtg;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f393feyxiexzfUjhhgtg.onRelease();
            zIsFinished |= this.f393feyxiexzfUjhhgtg.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f392feyxiexzfUjhhgtg;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f392feyxiexzfUjhhgtg.onRelease();
            zIsFinished |= this.f392feyxiexzfUjhhgtg.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f394feyxiexzfUjhhgtg;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f394feyxiexzfUjhhgtg.onRelease();
            zIsFinished |= this.f394feyxiexzfUjhhgtg.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m210Ujhhgtgfeyxiexzf() {
        if (!this.f377Ujhhgtgfeyxiexzf || this.f386feyxiexzfUjhhgtg) {
            Trace.beginSection("RV FullInvalidate");
            m213Ujhhgtgfeyxiexzf();
            Trace.endSection();
            return;
        }
        if (this.f361Ujhhgtgfeyxiexzf.m4484Ujhhgtgfeyxiexzf()) {
            C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f361Ujhhgtgfeyxiexzf;
            int i = c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c3017Ujhhgtgfeyxiexzf.m4484Ujhhgtgfeyxiexzf()) {
                    Trace.beginSection("RV FullInvalidate");
                    m213Ujhhgtgfeyxiexzf();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m257feyxiexzfUjhhgtg();
            m239feyxiexzfUjhhgtg();
            this.f361Ujhhgtgfeyxiexzf.m4492feyxiexzfUjhhgtg();
            if (!this.f379feyxiexzfUjhhgtg) {
                int iM4084Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
                for (int i2 = 0; i2 < iM4084Ujhhgtgfeyxiexzf; i2++) {
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i2));
                    if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2182Ujhhgtgfeyxiexzf()) {
                        m213Ujhhgtgfeyxiexzf();
                    }
                }
                this.f361Ujhhgtgfeyxiexzf.m4473Ujhhgtgfeyxiexzf();
            }
            m259Ujhhgtgfeyxiexzf(true);
            m240feyxiexzfUjhhgtg(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m211Ujhhgtgfeyxiexzf(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setMeasuredDimension(AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i, paddingRight, getMinimumWidth()), AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m212Ujhhgtgfeyxiexzf(View view) {
        m204feyxiexzfUjhhgtg(view);
        ArrayList arrayList = this.f385feyxiexzfUjhhgtg;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf = (C0708Ujhhgtgfeyxiexzf) this.f385feyxiexzfUjhhgtg.get(size);
                c0708Ujhhgtgfeyxiexzf.m2009Ujhhgtgfeyxiexzf(view);
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.m232feyxiexzfUjhhgtg(view);
                if (abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg != null) {
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = c0708Ujhhgtgfeyxiexzf.f2918Ujhhgtgfeyxiexzf;
                    if (abstractC0821feyxiexzfUjhhgtg == null || abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg != abstractC0821feyxiexzfUjhhgtg) {
                        c0708Ujhhgtgfeyxiexzf.m2005Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg, false);
                        if (c0708Ujhhgtgfeyxiexzf.f2916Ujhhgtgfeyxiexzf.remove(abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf)) {
                            c0708Ujhhgtgfeyxiexzf.f2928Ujhhgtgfeyxiexzf.mo1986Ujhhgtgfeyxiexzf(c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf, abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg);
                        }
                    } else {
                        c0708Ujhhgtgfeyxiexzf.m2010Ujhhgtgfeyxiexzf(null, 0);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m213Ujhhgtgfeyxiexzf() {
        boolean z;
        long j;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg;
        int i;
        int iM2158Ujhhgtgfeyxiexzf;
        int i2;
        int iMin;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg;
        View view;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z2;
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf;
        ?? r3;
        boolean zM4645Ujhhgtgfeyxiexzf;
        boolean z3;
        if (this.f369Ujhhgtgfeyxiexzf == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f370Ujhhgtgfeyxiexzf == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
        boolean z4 = false;
        c0810feyxiexzfUjhhgtg.f3213Ujhhgtgfeyxiexzf = false;
        boolean z5 = true;
        boolean z6 = this.f427Ujhhgtgfeyxiexzf && !(this.f428Ujhhgtgfeyxiexzf == getWidth() && this.f429Ujhhgtgfeyxiexzf == getHeight());
        this.f428Ujhhgtgfeyxiexzf = 0;
        this.f429Ujhhgtgfeyxiexzf = 0;
        this.f427Ujhhgtgfeyxiexzf = false;
        if (c0810feyxiexzfUjhhgtg.f3208Ujhhgtgfeyxiexzf == 1) {
            m214Ujhhgtgfeyxiexzf();
            this.f370Ujhhgtgfeyxiexzf.m2217Ujhhgtgfeyxiexzf(this);
            m215Ujhhgtgfeyxiexzf();
        } else {
            C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f361Ujhhgtgfeyxiexzf;
            if ((((ArrayList) c3017Ujhhgtgfeyxiexzf.f9379Ujhhgtgfeyxiexzf).isEmpty() || ((ArrayList) c3017Ujhhgtgfeyxiexzf.f9378Ujhhgtgfeyxiexzf).isEmpty()) && !z6 && this.f370Ujhhgtgfeyxiexzf.f3273Ujhhgtgfeyxiexzf == getWidth() && this.f370Ujhhgtgfeyxiexzf.f3274Ujhhgtgfeyxiexzf == getHeight()) {
                this.f370Ujhhgtgfeyxiexzf.m2217Ujhhgtgfeyxiexzf(this);
            } else {
                this.f370Ujhhgtgfeyxiexzf.m2217Ujhhgtgfeyxiexzf(this);
                m215Ujhhgtgfeyxiexzf();
            }
        }
        c0810feyxiexzfUjhhgtg.m2157Ujhhgtgfeyxiexzf(4);
        m257feyxiexzfUjhhgtg();
        m239feyxiexzfUjhhgtg();
        c0810feyxiexzfUjhhgtg.f3208Ujhhgtgfeyxiexzf = 1;
        boolean z7 = c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg = this.f363Ujhhgtgfeyxiexzf;
        if (z7) {
            int iM4084Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf() - 1;
            while (iM4084Ujhhgtgfeyxiexzf >= 0) {
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(iM4084Ujhhgtgfeyxiexzf));
                if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                    z3 = z5;
                } else {
                    long jM231feyxiexzfUjhhgtg = m231feyxiexzfUjhhgtg(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                    this.f395feyxiexzfUjhhgtg.getClass();
                    C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf2 = new C0431Ujhhgtgfeyxiexzf();
                    c0431Ujhhgtgfeyxiexzf2.m1756Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                    C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf = (C0267Ujhhgtgfeyxiexzf) c2073feyxiexzfUjhhgtg.f6811Ujhhgtgfeyxiexzf;
                    C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf;
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = (AbstractC0821feyxiexzfUjhhgtg) c0267Ujhhgtgfeyxiexzf.m1450Ujhhgtgfeyxiexzf(jM231feyxiexzfUjhhgtg);
                    if (abstractC0821feyxiexzfUjhhgtg2 == null || abstractC0821feyxiexzfUjhhgtg2.m2186Ujhhgtgfeyxiexzf()) {
                        z3 = z5;
                        c2073feyxiexzfUjhhgtg.m3369Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, c0431Ujhhgtgfeyxiexzf2);
                    } else {
                        z3 = z5;
                        C2295Ujhhgtgfeyxiexzf c2295Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg.get(abstractC0821feyxiexzfUjhhgtg2);
                        boolean z8 = (c2295Ujhhgtgfeyxiexzf == null || (c2295Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf & 1) == 0) ? false : z3;
                        C2295Ujhhgtgfeyxiexzf c2295Ujhhgtgfeyxiexzf2 = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg.get(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                        boolean z9 = (c2295Ujhhgtgfeyxiexzf2 == null || (c2295Ujhhgtgfeyxiexzf2.f7526Ujhhgtgfeyxiexzf & 1) == 0) ? false : z3;
                        if (z8 && abstractC0821feyxiexzfUjhhgtg2 == abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg) {
                            c2073feyxiexzfUjhhgtg.m3369Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, c0431Ujhhgtgfeyxiexzf2);
                        } else {
                            C0431Ujhhgtgfeyxiexzf c0431UjhhgtgfeyxiexzfM3372Ujhhgtgfeyxiexzf = c2073feyxiexzfUjhhgtg.m3372Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg2, 4);
                            c2073feyxiexzfUjhhgtg.m3369Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, c0431Ujhhgtgfeyxiexzf2);
                            C0431Ujhhgtgfeyxiexzf c0431UjhhgtgfeyxiexzfM3372Ujhhgtgfeyxiexzf2 = c2073feyxiexzfUjhhgtg.m3372Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, 8);
                            if (c0431UjhhgtgfeyxiexzfM3372Ujhhgtgfeyxiexzf == null) {
                                int iM4084Ujhhgtgfeyxiexzf2 = this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
                                for (int i4 = 0; i4 < iM4084Ujhhgtgfeyxiexzf2; i4++) {
                                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2 = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i4));
                                    if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2 != abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg && m231feyxiexzfUjhhgtg(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2) == jM231feyxiexzfUjhhgtg) {
                                        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = this.f369Ujhhgtgfeyxiexzf;
                                        if (abstractC0795feyxiexzfUjhhgtg == null || !abstractC0795feyxiexzfUjhhgtg.f3112Ujhhgtgfeyxiexzf) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                                            throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                                        throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0821feyxiexzfUjhhgtg2 + " cannot be found but it is necessary for " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg + m223feyxiexzfUjhhgtg());
                            } else {
                                abstractC0821feyxiexzfUjhhgtg2.m2185Ujhhgtgfeyxiexzf(false);
                                if (z8) {
                                    m205Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg2);
                                }
                                if (abstractC0821feyxiexzfUjhhgtg2 != abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg) {
                                    if (z9) {
                                        m205Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                                    }
                                    abstractC0821feyxiexzfUjhhgtg2.f3248Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg;
                                    m205Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg2);
                                    c0831feyxiexzfUjhhgtg.m2240Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg2);
                                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2185Ujhhgtgfeyxiexzf(false);
                                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3249Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg2;
                                }
                                if (this.f395feyxiexzfUjhhgtg.mo2125Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg2, abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, c0431UjhhgtgfeyxiexzfM3372Ujhhgtgfeyxiexzf, c0431UjhhgtgfeyxiexzfM3372Ujhhgtgfeyxiexzf2)) {
                                    m242feyxiexzfUjhhgtg();
                                }
                            }
                        }
                    }
                }
                iM4084Ujhhgtgfeyxiexzf--;
                z5 = z3;
            }
            z = z5;
            C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg2 = (C1044feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf;
            int i5 = c1044feyxiexzfUjhhgtg2.f4069Ujhhgtgfeyxiexzf - 1;
            while (i5 >= 0) {
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg3 = (AbstractC0821feyxiexzfUjhhgtg) c1044feyxiexzfUjhhgtg2.m2536Ujhhgtgfeyxiexzf(i5);
                C2295Ujhhgtgfeyxiexzf c2295Ujhhgtgfeyxiexzf3 = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg2.mo2538Ujhhgtgfeyxiexzf(i5);
                int i6 = c2295Ujhhgtgfeyxiexzf3.f7526Ujhhgtgfeyxiexzf;
                int i7 = i6 & 3;
                C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = this.f431Ujhhgtgfeyxiexzf;
                if (i7 == 3) {
                    RecyclerView recyclerView = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
                    recyclerView.f370Ujhhgtgfeyxiexzf.m2213Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf, recyclerView.f359Ujhhgtgfeyxiexzf);
                    r3 = z4;
                } else if ((i6 & 1) != 0) {
                    C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf3 = c2295Ujhhgtgfeyxiexzf3.f7527Ujhhgtgfeyxiexzf;
                    if (c0431Ujhhgtgfeyxiexzf3 == null) {
                        RecyclerView recyclerView2 = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
                        recyclerView2.f370Ujhhgtgfeyxiexzf.m2213Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf, recyclerView2.f359Ujhhgtgfeyxiexzf);
                        r3 = z4;
                    } else {
                        c0787feyxiexzfUjhhgtg.m2102Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3, c0431Ujhhgtgfeyxiexzf3, c2295Ujhhgtgfeyxiexzf3.f7528Ujhhgtgfeyxiexzf);
                        r3 = z4;
                    }
                } else if ((i6 & 14) == 14) {
                    c0787feyxiexzfUjhhgtg.m2101Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3, c2295Ujhhgtgfeyxiexzf3.f7527Ujhhgtgfeyxiexzf, c2295Ujhhgtgfeyxiexzf3.f7528Ujhhgtgfeyxiexzf);
                    r3 = z4;
                } else {
                    if ((i6 & 12) == 12) {
                        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf4 = c2295Ujhhgtgfeyxiexzf3.f7527Ujhhgtgfeyxiexzf;
                        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf5 = c2295Ujhhgtgfeyxiexzf3.f7528Ujhhgtgfeyxiexzf;
                        c0787feyxiexzfUjhhgtg.getClass();
                        abstractC0821feyxiexzfUjhhgtg3.m2185Ujhhgtgfeyxiexzf(z4);
                        RecyclerView recyclerView3 = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf;
                        if (!recyclerView3.f386feyxiexzfUjhhgtg) {
                            C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = (C3116Ujhhgtgfeyxiexzf) recyclerView3.f395feyxiexzfUjhhgtg;
                            c3116Ujhhgtgfeyxiexzf.getClass();
                            int i8 = c0431Ujhhgtgfeyxiexzf4.f2289Ujhhgtgfeyxiexzf;
                            int i9 = c0431Ujhhgtgfeyxiexzf5.f2289Ujhhgtgfeyxiexzf;
                            if (i8 == i9 && c0431Ujhhgtgfeyxiexzf4.f2290Ujhhgtgfeyxiexzf == c0431Ujhhgtgfeyxiexzf5.f2290Ujhhgtgfeyxiexzf) {
                                c3116Ujhhgtgfeyxiexzf.m2126Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3);
                                zM4645Ujhhgtgfeyxiexzf = false;
                            } else {
                                zM4645Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf.m4645Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3, i8, c0431Ujhhgtgfeyxiexzf4.f2290Ujhhgtgfeyxiexzf, i9, c0431Ujhhgtgfeyxiexzf5.f2290Ujhhgtgfeyxiexzf);
                            }
                            if (zM4645Ujhhgtgfeyxiexzf) {
                                recyclerView3.m242feyxiexzfUjhhgtg();
                            }
                        } else if (recyclerView3.f395feyxiexzfUjhhgtg.mo2125Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3, abstractC0821feyxiexzfUjhhgtg3, c0431Ujhhgtgfeyxiexzf4, c0431Ujhhgtgfeyxiexzf5)) {
                            recyclerView3.m242feyxiexzfUjhhgtg();
                        }
                        r3 = 0;
                    } else {
                        if ((i6 & 4) != 0) {
                            c0431Ujhhgtgfeyxiexzf = null;
                            c0787feyxiexzfUjhhgtg.m2102Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3, c2295Ujhhgtgfeyxiexzf3.f7527Ujhhgtgfeyxiexzf, null);
                        } else {
                            c0431Ujhhgtgfeyxiexzf = null;
                            if ((i6 & 8) != 0) {
                                c0787feyxiexzfUjhhgtg.m2101Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg3, c2295Ujhhgtgfeyxiexzf3.f7527Ujhhgtgfeyxiexzf, c2295Ujhhgtgfeyxiexzf3.f7528Ujhhgtgfeyxiexzf);
                            }
                        }
                        r3 = 0;
                    }
                    c2295Ujhhgtgfeyxiexzf3.f7526Ujhhgtgfeyxiexzf = r3;
                    c2295Ujhhgtgfeyxiexzf3.f7527Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf;
                    c2295Ujhhgtgfeyxiexzf3.f7528Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf;
                    C2295Ujhhgtgfeyxiexzf.f7525Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(c2295Ujhhgtgfeyxiexzf3);
                    i5--;
                    z4 = false;
                }
                c0431Ujhhgtgfeyxiexzf = null;
                c2295Ujhhgtgfeyxiexzf3.f7526Ujhhgtgfeyxiexzf = r3;
                c2295Ujhhgtgfeyxiexzf3.f7527Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf;
                c2295Ujhhgtgfeyxiexzf3.f7528Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf;
                C2295Ujhhgtgfeyxiexzf.f7525Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(c2295Ujhhgtgfeyxiexzf3);
                i5--;
                z4 = false;
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.f370Ujhhgtgfeyxiexzf.m2212Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg);
        c0810feyxiexzfUjhhgtg.f3206Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.f3209Ujhhgtgfeyxiexzf;
        this.f386feyxiexzfUjhhgtg = false;
        this.f387feyxiexzfUjhhgtg = false;
        c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf = false;
        this.f370Ujhhgtgfeyxiexzf.f3265Ujhhgtgfeyxiexzf = false;
        ArrayList arrayList = c0831feyxiexzfUjhhgtg.f3293Ujhhgtgfeyxiexzf;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg.f3270Ujhhgtgfeyxiexzf) {
            abstractC0822feyxiexzfUjhhgtg.f3269Ujhhgtgfeyxiexzf = 0;
            abstractC0822feyxiexzfUjhhgtg.f3270Ujhhgtgfeyxiexzf = false;
            c0831feyxiexzfUjhhgtg.m2241Ujhhgtgfeyxiexzf();
        }
        this.f370Ujhhgtgfeyxiexzf.mo137Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
        boolean z10 = z;
        m240feyxiexzfUjhhgtg(z10);
        m259Ujhhgtgfeyxiexzf(false);
        ((C1044feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf).clear();
        ((C0267Ujhhgtgfeyxiexzf) c2073feyxiexzfUjhhgtg.f6811Ujhhgtgfeyxiexzf).m1449Ujhhgtgfeyxiexzf();
        int[] iArr = this.f420feyxiexzfUjhhgtg;
        int i10 = iArr[0];
        int i11 = iArr[z10 ? 1 : 0];
        m227feyxiexzfUjhhgtg(iArr);
        if ((iArr[0] == i10 && iArr[z10 ? 1 : 0] == i11) ? false : true) {
            m218Ujhhgtgfeyxiexzf(0, 0);
        }
        if (this.f408Ujhhgtgfeyxiexzf && this.f369Ujhhgtgfeyxiexzf != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = c0810feyxiexzfUjhhgtg.f3217Ujhhgtgfeyxiexzf;
                if (j == -1) {
                    abstractC0821feyxiexzfUjhhgtg = null;
                } else {
                    abstractC0821feyxiexzfUjhhgtg = null;
                }
                if (abstractC0821feyxiexzfUjhhgtg != null) {
                    view3 = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                    if (!((ArrayList) this.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(view3)) {
                        if (this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf() > 0) {
                            int i12 = c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf;
                            if (i12 != -1) {
                            }
                            iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                            i2 = i;
                            while (true) {
                                if (i2 < iM2158Ujhhgtgfeyxiexzf) {
                                    abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 = m228feyxiexzfUjhhgtg(i2);
                                    if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 != null) {
                                        view2 = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iM2158Ujhhgtgfeyxiexzf, i) - 1; iMin >= 0; iMin--) {
                                    abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg = m228feyxiexzfUjhhgtg(iMin);
                                    if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg == null) {
                                        break;
                                        break;
                                    }
                                    view = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf() > 0) {
                        int i13 = c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf;
                        if (i13 != -1) {
                        }
                        iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                        i2 = i;
                        while (true) {
                            if (i2 < iM2158Ujhhgtgfeyxiexzf) {
                                abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 = m228feyxiexzfUjhhgtg(i2);
                                if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 != null) {
                                    view2 = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg = m228feyxiexzfUjhhgtg(iMin);
                                if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg == null) {
                                    break;
                                    break;
                                }
                                view = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf() > 0) {
                    int i14 = c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf;
                    if (i14 != -1) {
                    }
                    iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                    i2 = i;
                    while (true) {
                        if (i2 < iM2158Ujhhgtgfeyxiexzf) {
                            abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 = m228feyxiexzfUjhhgtg(i2);
                            if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 != null) {
                                view2 = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg = m228feyxiexzfUjhhgtg(iMin);
                            if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg == null) {
                                break;
                                break;
                            }
                            view = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = c0810feyxiexzfUjhhgtg.f3218Ujhhgtgfeyxiexzf;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(getFocusedChild())) {
                j = c0810feyxiexzfUjhhgtg.f3217Ujhhgtgfeyxiexzf;
                if (j == -1 && (z2 = this.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf) && z2) {
                    int iM4087Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
                    abstractC0821feyxiexzfUjhhgtg = null;
                    for (int i15 = 0; i15 < iM4087Ujhhgtgfeyxiexzf; i15++) {
                        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3 = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i15));
                        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3 != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.m2179Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.f3245Ujhhgtgfeyxiexzf == j) {
                            if (!((ArrayList) this.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf)) {
                                abstractC0821feyxiexzfUjhhgtg = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3;
                                break;
                            }
                            abstractC0821feyxiexzfUjhhgtg = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3;
                        }
                    }
                } else {
                    abstractC0821feyxiexzfUjhhgtg = null;
                }
                if (abstractC0821feyxiexzfUjhhgtg != null) {
                    view3 = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                    if (!((ArrayList) this.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf() > 0) {
                        int i16 = c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf;
                        i = i16 != -1 ? i16 : 0;
                        iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                        i2 = i;
                        while (true) {
                            if (i2 < iM2158Ujhhgtgfeyxiexzf) {
                                abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 = m228feyxiexzfUjhhgtg(i2);
                                if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 != null) {
                                    view2 = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg = m228feyxiexzfUjhhgtg(iMin);
                                if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg == null) {
                                    break;
                                }
                                view = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf() > 0) {
                    int i17 = c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf;
                    if (i17 != -1) {
                    }
                    iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                    i2 = i;
                    while (true) {
                        if (i2 < iM2158Ujhhgtgfeyxiexzf) {
                            abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 = m228feyxiexzfUjhhgtg(i2);
                            if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2 != null) {
                                view2 = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg = m228feyxiexzfUjhhgtg(iMin);
                            if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg == null) {
                                break;
                                break;
                            }
                            view = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = c0810feyxiexzfUjhhgtg.f3218Ujhhgtgfeyxiexzf;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        c0810feyxiexzfUjhhgtg.f3217Ujhhgtgfeyxiexzf = -1L;
        c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf = -1;
        c0810feyxiexzfUjhhgtg.f3218Ujhhgtgfeyxiexzf = -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m214Ujhhgtgfeyxiexzf() {
        C2295Ujhhgtgfeyxiexzf c2295Ujhhgtgfeyxiexzf;
        View viewM225feyxiexzfUjhhgtg;
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
        c0810feyxiexzfUjhhgtg.m2157Ujhhgtgfeyxiexzf(1);
        m224feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
        c0810feyxiexzfUjhhgtg.f3213Ujhhgtgfeyxiexzf = false;
        m257feyxiexzfUjhhgtg();
        C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg = this.f363Ujhhgtgfeyxiexzf;
        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf;
        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg2 = (C1044feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf;
        c1044feyxiexzfUjhhgtg.clear();
        C0267Ujhhgtgfeyxiexzf c0267Ujhhgtgfeyxiexzf = (C0267Ujhhgtgfeyxiexzf) c2073feyxiexzfUjhhgtg.f6811Ujhhgtgfeyxiexzf;
        c0267Ujhhgtgfeyxiexzf.m1449Ujhhgtgfeyxiexzf();
        m239feyxiexzfUjhhgtg();
        m243Ujhhgtgfeyxiexzf();
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = null;
        View focusedChild = (this.f408Ujhhgtgfeyxiexzf && hasFocus() && this.f369Ujhhgtgfeyxiexzf != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM225feyxiexzfUjhhgtg = m225feyxiexzfUjhhgtg(focusedChild)) != null) {
            abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = m232feyxiexzfUjhhgtg(viewM225feyxiexzfUjhhgtg);
        }
        if (abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg == null) {
            c0810feyxiexzfUjhhgtg.f3217Ujhhgtgfeyxiexzf = -1L;
            c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf = -1;
            c0810feyxiexzfUjhhgtg.f3218Ujhhgtgfeyxiexzf = -1;
        } else {
            c0810feyxiexzfUjhhgtg.f3217Ujhhgtgfeyxiexzf = this.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf ? abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.f3245Ujhhgtgfeyxiexzf : -1L;
            c0810feyxiexzfUjhhgtg.f3216Ujhhgtgfeyxiexzf = this.f386feyxiexzfUjhhgtg ? -1 : abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() ? abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.f3244Ujhhgtgfeyxiexzf : abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.m2171Ujhhgtgfeyxiexzf();
            View focusedChild2 = abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c0810feyxiexzfUjhhgtg.f3218Ujhhgtgfeyxiexzf = id;
        }
        c0810feyxiexzfUjhhgtg.f3212Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf && this.f416Ujhhgtgfeyxiexzf;
        this.f416Ujhhgtgfeyxiexzf = false;
        this.f415Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf;
        c0810feyxiexzfUjhhgtg.f3209Ujhhgtgfeyxiexzf = this.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf();
        m227feyxiexzfUjhhgtg(this.f420feyxiexzfUjhhgtg);
        if (c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf) {
            int iM4084Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
            for (int i = 0; i < iM4084Ujhhgtgfeyxiexzf; i++) {
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i));
                if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf() && (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2177Ujhhgtgfeyxiexzf() || this.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf)) {
                    AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = this.f395feyxiexzfUjhhgtg;
                    AbstractC0793feyxiexzfUjhhgtg.m2124Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2174Ujhhgtgfeyxiexzf();
                    abstractC0793feyxiexzfUjhhgtg.getClass();
                    C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = new C0431Ujhhgtgfeyxiexzf();
                    c0431Ujhhgtgfeyxiexzf.m1756Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                    C2295Ujhhgtgfeyxiexzf c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg2.get(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                    if (c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf == null) {
                        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = C2295Ujhhgtgfeyxiexzf.m3506Ujhhgtgfeyxiexzf();
                        c1044feyxiexzfUjhhgtg2.put(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf);
                    }
                    c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf.f7527Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf;
                    c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf |= 4;
                    if (c0810feyxiexzfUjhhgtg.f3212Ujhhgtgfeyxiexzf && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2182Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2177Ujhhgtgfeyxiexzf()) {
                        c0267Ujhhgtgfeyxiexzf.m1452Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, m231feyxiexzfUjhhgtg(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg));
                    }
                }
            }
        }
        if (c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf) {
            int iM4087Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
            for (int i2 = 0; i2 < iM4087Ujhhgtgfeyxiexzf; i2++) {
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2 = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i2));
                if (f348feyxiexzfUjhhgtg && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.f3243Ujhhgtgfeyxiexzf == -1 && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.m2179Ujhhgtgfeyxiexzf()) {
                    throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.m2186Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.f3244Ujhhgtgfeyxiexzf == -1) {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.f3244Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.f3243Ujhhgtgfeyxiexzf;
                }
            }
            boolean z = c0810feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf;
            c0810feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = false;
            this.f370Ujhhgtgfeyxiexzf.mo136feyxiexzfUjhhgtg(this.f359Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
            c0810feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = z;
            for (int i3 = 0; i3 < this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf(); i3++) {
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3 = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i3));
                if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.m2186Ujhhgtgfeyxiexzf() && ((c2295Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg2.get(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3)) == null || (c2295Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf & 4) == 0)) {
                    AbstractC0793feyxiexzfUjhhgtg.m2124Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3);
                    boolean z2 = (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.f3250Ujhhgtgfeyxiexzf & 8192) != 0;
                    AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg2 = this.f395feyxiexzfUjhhgtg;
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.m2174Ujhhgtgfeyxiexzf();
                    abstractC0793feyxiexzfUjhhgtg2.getClass();
                    C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf2 = new C0431Ujhhgtgfeyxiexzf();
                    c0431Ujhhgtgfeyxiexzf2.m1756Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3);
                    if (z2) {
                        m245Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3, c0431Ujhhgtgfeyxiexzf2);
                    } else {
                        C2295Ujhhgtgfeyxiexzf c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2 = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg2.get(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3);
                        if (c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2 == null) {
                            c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2 = C2295Ujhhgtgfeyxiexzf.m3506Ujhhgtgfeyxiexzf();
                            c1044feyxiexzfUjhhgtg2.put(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3, c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2);
                        }
                        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2.f7526Ujhhgtgfeyxiexzf |= 2;
                        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2.f7527Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf2;
                    }
                }
            }
            m208Ujhhgtgfeyxiexzf();
        } else {
            m208Ujhhgtgfeyxiexzf();
        }
        m240feyxiexzfUjhhgtg(true);
        m259Ujhhgtgfeyxiexzf(false);
        c0810feyxiexzfUjhhgtg.f3208Ujhhgtgfeyxiexzf = 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m215Ujhhgtgfeyxiexzf() {
        m257feyxiexzfUjhhgtg();
        m239feyxiexzfUjhhgtg();
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
        c0810feyxiexzfUjhhgtg.m2157Ujhhgtgfeyxiexzf(6);
        this.f361Ujhhgtgfeyxiexzf.m4476Ujhhgtgfeyxiexzf();
        c0810feyxiexzfUjhhgtg.f3209Ujhhgtgfeyxiexzf = this.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf();
        c0810feyxiexzfUjhhgtg.f3207Ujhhgtgfeyxiexzf = 0;
        if (this.f360Ujhhgtgfeyxiexzf != null) {
            AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = this.f369Ujhhgtgfeyxiexzf;
            int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(abstractC0795feyxiexzfUjhhgtg.f3113Ujhhgtgfeyxiexzf);
            if (iM2713feyxiexzfUjhhgtg == 1 ? abstractC0795feyxiexzfUjhhgtg.mo2134Ujhhgtgfeyxiexzf() > 0 : iM2713feyxiexzfUjhhgtg != 2) {
                Parcelable parcelable = this.f360Ujhhgtgfeyxiexzf.f3219Ujhhgtgfeyxiexzf;
                if (parcelable != null) {
                    this.f370Ujhhgtgfeyxiexzf.mo163Ujhhgtgfeyxiexzf(parcelable);
                }
                this.f360Ujhhgtgfeyxiexzf = null;
            }
        }
        c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf = false;
        this.f370Ujhhgtgfeyxiexzf.mo136feyxiexzfUjhhgtg(this.f359Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
        c0810feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf && this.f395feyxiexzfUjhhgtg != null;
        c0810feyxiexzfUjhhgtg.f3208Ujhhgtgfeyxiexzf = 4;
        m240feyxiexzfUjhhgtg(true);
        m259Ujhhgtgfeyxiexzf(false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final boolean m216Ujhhgtgfeyxiexzf(int[] iArr, int i, int i2, int i3, int[] iArr2) {
        return getScrollingChildHelper().m1750Ujhhgtgfeyxiexzf(iArr, i, i2, i3, iArr2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m217Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m1751Ujhhgtgfeyxiexzf(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m218Ujhhgtgfeyxiexzf(int i, int i2) {
        this.f389feyxiexzfUjhhgtg++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0833feyxiexzfUjhhgtg abstractC0833feyxiexzfUjhhgtg = this.f413feyxiexzfUjhhgtg;
        if (abstractC0833feyxiexzfUjhhgtg != null) {
            abstractC0833feyxiexzfUjhhgtg.mo2243Ujhhgtgfeyxiexzf(this, i, i2);
        }
        ArrayList arrayList = this.f414feyxiexzfUjhhgtg;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0833feyxiexzfUjhhgtg) this.f414feyxiexzfUjhhgtg.get(size)).mo2243Ujhhgtgfeyxiexzf(this, i, i2);
            }
        }
        this.f389feyxiexzfUjhhgtg--;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m219Ujhhgtgfeyxiexzf() {
        if (this.f394feyxiexzfUjhhgtg != null) {
            return;
        }
        ((C0811feyxiexzfUjhhgtg) this.f390feyxiexzfUjhhgtg).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f394feyxiexzfUjhhgtg = edgeEffect;
        if (this.f364Ujhhgtgfeyxiexzf) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m220Ujhhgtgfeyxiexzf() {
        if (this.f391feyxiexzfUjhhgtg != null) {
            return;
        }
        ((C0811feyxiexzfUjhhgtg) this.f390feyxiexzfUjhhgtg).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f391feyxiexzfUjhhgtg = edgeEffect;
        if (this.f364Ujhhgtgfeyxiexzf) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m221feyxiexzfUjhhgtg() {
        if (this.f393feyxiexzfUjhhgtg != null) {
            return;
        }
        ((C0811feyxiexzfUjhhgtg) this.f390feyxiexzfUjhhgtg).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f393feyxiexzfUjhhgtg = edgeEffect;
        if (this.f364Ujhhgtgfeyxiexzf) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m222feyxiexzfUjhhgtg() {
        if (this.f392feyxiexzfUjhhgtg != null) {
            return;
        }
        ((C0811feyxiexzfUjhhgtg) this.f390feyxiexzfUjhhgtg).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f392feyxiexzfUjhhgtg = edgeEffect;
        if (this.f364Ujhhgtgfeyxiexzf) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String m223feyxiexzfUjhhgtg() {
        return " " + super.toString() + ", adapter:" + this.f369Ujhhgtgfeyxiexzf + ", layout:" + this.f370Ujhhgtgfeyxiexzf + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m224feyxiexzfUjhhgtg(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (getScrollState() != 2) {
            c0810feyxiexzfUjhhgtg.getClass();
            return;
        }
        OverScroller overScroller = this.f409feyxiexzfUjhhgtg.f3233Ujhhgtgfeyxiexzf;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0810feyxiexzfUjhhgtg.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final View m225feyxiexzfUjhhgtg(View view) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m226feyxiexzfUjhhgtg(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f373Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0832feyxiexzfUjhhgtg interfaceC0832feyxiexzfUjhhgtg = (InterfaceC0832feyxiexzfUjhhgtg) arrayList.get(i);
            if (interfaceC0832feyxiexzfUjhhgtg.mo1978Ujhhgtgfeyxiexzf(motionEvent) && action != 3) {
                this.f374Ujhhgtgfeyxiexzf = interfaceC0832feyxiexzfUjhhgtg;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final void m227feyxiexzfUjhhgtg(int[] iArr) {
        int iM4084Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
        if (iM4084Ujhhgtgfeyxiexzf == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM4084Ujhhgtgfeyxiexzf; i3++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i3));
            if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                int iM2173Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2173Ujhhgtgfeyxiexzf();
                if (iM2173Ujhhgtgfeyxiexzf < i) {
                    i = iM2173Ujhhgtgfeyxiexzf;
                }
                if (iM2173Ujhhgtgfeyxiexzf > i2) {
                    i2 = iM2173Ujhhgtgfeyxiexzf;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final AbstractC0821feyxiexzfUjhhgtg m228feyxiexzfUjhhgtg(int i) {
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = null;
        if (this.f386feyxiexzfUjhhgtg) {
            return null;
        }
        int iM4087Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        for (int i2 = 0; i2 < iM4087Ujhhgtgfeyxiexzf; i2++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i2));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() && m230feyxiexzfUjhhgtg(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg) == i) {
                if (!((ArrayList) this.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf)) {
                    return abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg;
                }
                abstractC0821feyxiexzfUjhhgtg = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg;
            }
        }
        return abstractC0821feyxiexzfUjhhgtg;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean m229feyxiexzfUjhhgtg(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f380feyxiexzfUjhhgtg) {
            boolean zMo152Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf();
            boolean zMo153Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf();
            if (!zMo152Ujhhgtgfeyxiexzf || Math.abs(i) < i3) {
                i = 0;
            }
            if (!zMo153Ujhhgtgfeyxiexzf || Math.abs(i2) < i3) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.f391feyxiexzfUjhhgtg;
                    if (edgeEffect == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.f393feyxiexzfUjhhgtg;
                        if (edgeEffect2 == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (m254feyxiexzfUjhhgtg(this.f393feyxiexzfUjhhgtg, i, getWidth())) {
                            this.f393feyxiexzfUjhhgtg.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i6 = -i;
                        if (m254feyxiexzfUjhhgtg(this.f391feyxiexzfUjhhgtg, i6, getWidth())) {
                            this.f391feyxiexzfUjhhgtg.onAbsorb(i6);
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
                    EdgeEffect edgeEffect3 = this.f392feyxiexzfUjhhgtg;
                    if (edgeEffect3 == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f394feyxiexzfUjhhgtg;
                        if (edgeEffect4 == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect4) == 0.0f) {
                            i5 = i2;
                            i2 = 0;
                        } else if (m254feyxiexzfUjhhgtg(this.f394feyxiexzfUjhhgtg, i2, getHeight())) {
                            this.f394feyxiexzfUjhhgtg.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i7 = -i2;
                        if (m254feyxiexzfUjhhgtg(this.f392feyxiexzfUjhhgtg, i7, getHeight())) {
                            this.f392feyxiexzfUjhhgtg.onAbsorb(i7);
                            i2 = 0;
                        }
                    }
                    i5 = 0;
                }
                RunnableC0818feyxiexzfUjhhgtg runnableC0818feyxiexzfUjhhgtg = this.f409feyxiexzfUjhhgtg;
                if (iMax != 0 || i2 != 0) {
                    int i8 = -i4;
                    iMax = Math.max(i8, Math.min(iMax, i4));
                    i2 = Math.max(i8, Math.min(i2, i4));
                    m258feyxiexzfUjhhgtg(1);
                    runnableC0818feyxiexzfUjhhgtg.m2161Ujhhgtgfeyxiexzf(iMax, i2);
                }
                if (i != 0 || i5 != 0) {
                    float f = i;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z = zMo152Ujhhgtgfeyxiexzf || zMo153Ujhhgtgfeyxiexzf;
                        dispatchNestedFling(f, f2, z);
                        if (z) {
                            m258feyxiexzfUjhhgtg(1);
                            int i9 = -i4;
                            runnableC0818feyxiexzfUjhhgtg.m2161Ujhhgtgfeyxiexzf(Math.max(i9, Math.min(i, i4)), Math.max(i9, Math.min(i5, i4)));
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final int m230feyxiexzfUjhhgtg(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        if ((abstractC0821feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf & 524) == 0 && abstractC0821feyxiexzfUjhhgtg.m2176Ujhhgtgfeyxiexzf()) {
            int i = abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf;
            ArrayList arrayList = (ArrayList) this.f361Ujhhgtgfeyxiexzf.f9378Ujhhgtgfeyxiexzf;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) arrayList.get(i2);
                int i3 = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                        if (i4 <= i) {
                            int i5 = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf;
                        if (i6 == i) {
                            i = c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf <= i) {
                    i += c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final long m231feyxiexzfUjhhgtg(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        return this.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf ? abstractC0821feyxiexzfUjhhgtg.f3245Ujhhgtgfeyxiexzf : abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final AbstractC0821feyxiexzfUjhhgtg m232feyxiexzfUjhhgtg(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m204feyxiexzfUjhhgtg(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final Rect m233feyxiexzfUjhhgtg(View view) {
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) view.getLayoutParams();
        boolean z = c0825feyxiexzfUjhhgtg.f3281Ujhhgtgfeyxiexzf;
        Rect rect = c0825feyxiexzfUjhhgtg.f3280Ujhhgtgfeyxiexzf;
        if (!z || (this.f412feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf && (c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2182Ujhhgtgfeyxiexzf() || c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2177Ujhhgtgfeyxiexzf()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f372Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f366Ujhhgtgfeyxiexzf;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0826feyxiexzfUjhhgtg) arrayList.get(i)).mo1998Ujhhgtgfeyxiexzf(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0825feyxiexzfUjhhgtg.f3281Ujhhgtgfeyxiexzf = false;
        return rect;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean m234feyxiexzfUjhhgtg() {
        return !this.f377Ujhhgtgfeyxiexzf || this.f386feyxiexzfUjhhgtg || this.f361Ujhhgtgfeyxiexzf.m4484Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final boolean m235feyxiexzfUjhhgtg() {
        return this.f388feyxiexzfUjhhgtg > 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m236feyxiexzfUjhhgtg(int i) {
        if (this.f370Ujhhgtgfeyxiexzf == null) {
            return;
        }
        setScrollState(2);
        this.f370Ujhhgtgfeyxiexzf.mo165Ujhhgtgfeyxiexzf(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final void m237feyxiexzfUjhhgtg() {
        int iM4087Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        for (int i = 0; i < iM4087Ujhhgtgfeyxiexzf; i++) {
            ((C0825feyxiexzfUjhhgtg) this.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i).getLayoutParams()).f3281Ujhhgtgfeyxiexzf = true;
        }
        ArrayList arrayList = this.f359Ujhhgtgfeyxiexzf.f3294Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) ((AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i2)).f3241Ujhhgtgfeyxiexzf.getLayoutParams();
            if (c0825feyxiexzfUjhhgtg != null) {
                c0825feyxiexzfUjhhgtg.f3281Ujhhgtgfeyxiexzf = true;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public final void m238feyxiexzfUjhhgtg(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM4087Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        for (int i4 = 0; i4 < iM4087Ujhhgtgfeyxiexzf; i4++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i4));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                int i5 = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf;
                C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
                if (i5 >= i3) {
                    if (f349feyxiexzfUjhhgtg) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg + " now at position " + (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf - i2));
                    }
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(-i2, z);
                    c0810feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = true;
                } else if (i5 >= i) {
                    if (f349feyxiexzfUjhhgtg) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg + " now REMOVED");
                    }
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(8);
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(-i2, z);
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf = i - 1;
                    c0810feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = true;
                }
            }
        }
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c0831feyxiexzfUjhhgtg.f3294Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList.get(size);
            if (abstractC0821feyxiexzfUjhhgtg != null) {
                int i6 = abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf;
                if (i6 >= i3) {
                    if (f349feyxiexzfUjhhgtg) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC0821feyxiexzfUjhhgtg + " now at position " + (abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf - i2));
                    }
                    abstractC0821feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(-i2, z);
                } else if (i6 >= i) {
                    abstractC0821feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(8);
                    c0831feyxiexzfUjhhgtg.m2235Ujhhgtgfeyxiexzf(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m239feyxiexzfUjhhgtg() {
        this.f388feyxiexzfUjhhgtg++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m240feyxiexzfUjhhgtg(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f388feyxiexzfUjhhgtg - 1;
        this.f388feyxiexzfUjhhgtg = i2;
        if (i2 < 1) {
            if (f348feyxiexzfUjhhgtg && i2 < 0) {
                throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f388feyxiexzfUjhhgtg = 0;
            if (z) {
                int i3 = this.f382feyxiexzfUjhhgtg;
                this.f382feyxiexzfUjhhgtg = 0;
                if (i3 != 0 && (accessibilityManager = this.f384feyxiexzfUjhhgtg) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f425Ujhhgtgfeyxiexzf;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList.get(size);
                    if (abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.getParent() == this && !abstractC0821feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf() && (i = abstractC0821feyxiexzfUjhhgtg.f3257Ujhhgtgfeyxiexzf) != -1) {
                        abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.setImportantForAccessibility(i);
                        abstractC0821feyxiexzfUjhhgtg.f3257Ujhhgtgfeyxiexzf = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m241feyxiexzfUjhhgtg(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f397feyxiexzfUjhhgtg) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f397feyxiexzfUjhhgtg = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f401feyxiexzfUjhhgtg = x;
            this.f399feyxiexzfUjhhgtg = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f402feyxiexzfUjhhgtg = y;
            this.f400feyxiexzfUjhhgtg = y;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m242feyxiexzfUjhhgtg() {
        if (this.f418feyxiexzfUjhhgtg || !this.f375Ujhhgtgfeyxiexzf) {
            return;
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        postOnAnimation(this.f426feyxiexzfUjhhgtg);
        this.f418feyxiexzfUjhhgtg = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m243Ujhhgtgfeyxiexzf() {
        boolean z;
        boolean z2 = false;
        if (this.f386feyxiexzfUjhhgtg) {
            C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f361Ujhhgtgfeyxiexzf;
            c3017Ujhhgtgfeyxiexzf.m4494feyxiexzfUjhhgtg((ArrayList) c3017Ujhhgtgfeyxiexzf.f9378Ujhhgtgfeyxiexzf);
            c3017Ujhhgtgfeyxiexzf.m4494feyxiexzfUjhhgtg((ArrayList) c3017Ujhhgtgfeyxiexzf.f9379Ujhhgtgfeyxiexzf);
            c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf = 0;
            if (this.f387feyxiexzfUjhhgtg) {
                this.f370Ujhhgtgfeyxiexzf.mo132feyxiexzfUjhhgtg();
            }
        }
        if (this.f395feyxiexzfUjhhgtg == null || !this.f370Ujhhgtgfeyxiexzf.mo142Ujhhgtgfeyxiexzf()) {
            this.f361Ujhhgtgfeyxiexzf.m4476Ujhhgtgfeyxiexzf();
        } else {
            this.f361Ujhhgtgfeyxiexzf.m4492feyxiexzfUjhhgtg();
        }
        boolean z3 = this.f415Ujhhgtgfeyxiexzf || this.f416Ujhhgtgfeyxiexzf;
        boolean z4 = this.f377Ujhhgtgfeyxiexzf && this.f395feyxiexzfUjhhgtg != null && ((z = this.f386feyxiexzfUjhhgtg) || z3 || this.f370Ujhhgtgfeyxiexzf.f3265Ujhhgtgfeyxiexzf) && (!z || this.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf);
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
        c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf = z4;
        if (z4 && z3 && !this.f386feyxiexzfUjhhgtg && this.f395feyxiexzfUjhhgtg != null && this.f370Ujhhgtgfeyxiexzf.mo142Ujhhgtgfeyxiexzf()) {
            z2 = true;
        }
        c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf = z2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m244Ujhhgtgfeyxiexzf(boolean z) {
        this.f387feyxiexzfUjhhgtg = z | this.f387feyxiexzfUjhhgtg;
        this.f386feyxiexzfUjhhgtg = true;
        int iM4087Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        for (int i = 0; i < iM4087Ujhhgtgfeyxiexzf; i++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = m204feyxiexzfUjhhgtg(this.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(6);
            }
        }
        m237feyxiexzfUjhhgtg();
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c0831feyxiexzfUjhhgtg.f3294Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i2);
            if (abstractC0821feyxiexzfUjhhgtg != null) {
                abstractC0821feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(6);
                abstractC0821feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(1024);
            }
        }
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = c0831feyxiexzfUjhhgtg.f3299Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf;
        if (abstractC0795feyxiexzfUjhhgtg == null || !abstractC0795feyxiexzfUjhhgtg.f3112Ujhhgtgfeyxiexzf) {
            c0831feyxiexzfUjhhgtg.m2234Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m245Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf) {
        abstractC0821feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf &= -8193;
        boolean z = this.f412feyxiexzfUjhhgtg.f3212Ujhhgtgfeyxiexzf;
        C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg = this.f363Ujhhgtgfeyxiexzf;
        if (z && abstractC0821feyxiexzfUjhhgtg.m2182Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() && !abstractC0821feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
            ((C0267Ujhhgtgfeyxiexzf) c2073feyxiexzfUjhhgtg.f6811Ujhhgtgfeyxiexzf).m1452Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, m231feyxiexzfUjhhgtg(abstractC0821feyxiexzfUjhhgtg));
        }
        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf;
        C2295Ujhhgtgfeyxiexzf c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg.get(abstractC0821feyxiexzfUjhhgtg);
        if (c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf == null) {
            c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = C2295Ujhhgtgfeyxiexzf.m3506Ujhhgtgfeyxiexzf();
            c1044feyxiexzfUjhhgtg.put(abstractC0821feyxiexzfUjhhgtg, c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf);
        }
        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf.f7527Ujhhgtgfeyxiexzf = c0431Ujhhgtgfeyxiexzf;
        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf |= 4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m246Ujhhgtgfeyxiexzf() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f391feyxiexzfUjhhgtg;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f391feyxiexzfUjhhgtg.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f392feyxiexzfUjhhgtg;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f392feyxiexzfUjhhgtg.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f393feyxiexzfUjhhgtg;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f393feyxiexzfUjhhgtg.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f394feyxiexzfUjhhgtg;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f394feyxiexzfUjhhgtg.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int m247Ujhhgtgfeyxiexzf(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f391feyxiexzfUjhhgtg;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f393feyxiexzfUjhhgtg;
            if (edgeEffect2 != null && AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f393feyxiexzfUjhhgtg.onRelease();
                } else {
                    float fM1888Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f393feyxiexzfUjhhgtg, width, height);
                    if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(this.f393feyxiexzfUjhhgtg) == 0.0f) {
                        this.f393feyxiexzfUjhhgtg.onRelease();
                    }
                    f2 = fM1888Ujhhgtgfeyxiexzf;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f391feyxiexzfUjhhgtg.onRelease();
            } else {
                float f3 = -AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f391feyxiexzfUjhhgtg, -width, 1.0f - height);
                if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(this.f391feyxiexzfUjhhgtg) == 0.0f) {
                    this.f391feyxiexzfUjhhgtg.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m248Ujhhgtgfeyxiexzf(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f392feyxiexzfUjhhgtg;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f394feyxiexzfUjhhgtg;
            if (edgeEffect2 != null && AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f394feyxiexzfUjhhgtg.onRelease();
                } else {
                    float fM1888Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f394feyxiexzfUjhhgtg, height, 1.0f - width);
                    if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(this.f394feyxiexzfUjhhgtg) == 0.0f) {
                        this.f394feyxiexzfUjhhgtg.onRelease();
                    }
                    f2 = fM1888Ujhhgtgfeyxiexzf;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f392feyxiexzfUjhhgtg.onRelease();
            } else {
                float f3 = -AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f392feyxiexzfUjhhgtg, -height, width);
                if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(this.f392feyxiexzfUjhhgtg) == 0.0f) {
                    this.f392feyxiexzfUjhhgtg.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final void m249feyxiexzfUjhhgtg(AbstractC0826feyxiexzfUjhhgtg abstractC0826feyxiexzfUjhhgtg) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            abstractC0822feyxiexzfUjhhgtg.mo151Ujhhgtgfeyxiexzf("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f372Ujhhgtgfeyxiexzf;
        arrayList.remove(abstractC0826feyxiexzfUjhhgtg);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m237feyxiexzfUjhhgtg();
        requestLayout();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final void m250feyxiexzfUjhhgtg(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f366Ujhhgtgfeyxiexzf;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0825feyxiexzfUjhhgtg) {
            C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) layoutParams;
            if (!c0825feyxiexzfUjhhgtg.f3281Ujhhgtgfeyxiexzf) {
                Rect rect2 = c0825feyxiexzfUjhhgtg.f3280Ujhhgtgfeyxiexzf;
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
        this.f370Ujhhgtgfeyxiexzf.mo810Ujhhgtgfeyxiexzf(this, view, this.f366Ujhhgtgfeyxiexzf, !this.f377Ujhhgtgfeyxiexzf, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
      0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final boolean m251feyxiexzfUjhhgtg(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        m210Ujhhgtgfeyxiexzf();
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = this.f369Ujhhgtgfeyxiexzf;
        int[] iArr = this.f424feyxiexzfUjhhgtg;
        if (abstractC0795feyxiexzfUjhhgtg != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m252feyxiexzfUjhhgtg(i, i2, iArr);
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
        if (!this.f372Ujhhgtgfeyxiexzf.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m217Ujhhgtgfeyxiexzf(i4, i5, i6, i7, this.f422Ujhhgtgfeyxiexzf, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.f401feyxiexzfUjhhgtg;
        int[] iArr2 = this.f422Ujhhgtgfeyxiexzf;
        int i13 = iArr2[0];
        this.f401feyxiexzfUjhhgtg = i12 - i13;
        int i14 = this.f402feyxiexzfUjhhgtg;
        int i15 = iArr2[1];
        this.f402feyxiexzfUjhhgtg = i14 - i15;
        int[] iArr3 = this.f423feyxiexzfUjhhgtg;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || AbstractC1264feyxiexzfUjhhgtg.m2798Ujhhgtgfeyxiexzf(motionEvent, r.a.s)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    m220Ujhhgtgfeyxiexzf();
                    z = true;
                    z2 = false;
                    AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f391feyxiexzfUjhhgtg, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        m221feyxiexzfUjhhgtg();
                        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f393feyxiexzfUjhhgtg, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        m222feyxiexzfUjhhgtg();
                        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f392feyxiexzfUjhhgtg, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        m219Ujhhgtgfeyxiexzf();
                        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f394feyxiexzfUjhhgtg, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && AbstractC1264feyxiexzfUjhhgtg.m2798Ujhhgtgfeyxiexzf(motionEvent, 4194304)) {
                            m246Ujhhgtgfeyxiexzf();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        m246Ujhhgtgfeyxiexzf();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    m222feyxiexzfUjhhgtg();
                    AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f392feyxiexzfUjhhgtg, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    m219Ujhhgtgfeyxiexzf();
                    AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(this.f394feyxiexzfUjhhgtg, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        m246Ujhhgtgfeyxiexzf();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    m246Ujhhgtgfeyxiexzf();
                }
            }
            m209Ujhhgtgfeyxiexzf(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            m218Ujhhgtgfeyxiexzf(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m252feyxiexzfUjhhgtg(int i, int i2, int[] iArr) {
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg;
        m257feyxiexzfUjhhgtg();
        m239feyxiexzfUjhhgtg();
        Trace.beginSection("RV Scroll");
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = this.f412feyxiexzfUjhhgtg;
        m224feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f359Ujhhgtgfeyxiexzf;
        int iMo139Ujhhgtgfeyxiexzf = i != 0 ? this.f370Ujhhgtgfeyxiexzf.mo139Ujhhgtgfeyxiexzf(i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg) : 0;
        int iMo140Ujhhgtgfeyxiexzf = i2 != 0 ? this.f370Ujhhgtgfeyxiexzf.mo140Ujhhgtgfeyxiexzf(i2, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg) : 0;
        Trace.endSection();
        int iM4084Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
        for (int i3 = 0; i3 < iM4084Ujhhgtgfeyxiexzf; i3++) {
            View viewM4083Ujhhgtgfeyxiexzf = this.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i3);
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = m232feyxiexzfUjhhgtg(viewM4083Ujhhgtgfeyxiexzf);
            if (abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg != null && (abstractC0821feyxiexzfUjhhgtg = abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.f3249Ujhhgtgfeyxiexzf) != null) {
                View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                int left = viewM4083Ujhhgtgfeyxiexzf.getLeft();
                int top = viewM4083Ujhhgtgfeyxiexzf.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m240feyxiexzfUjhhgtg(true);
        m259Ujhhgtgfeyxiexzf(false);
        if (iArr != null) {
            iArr[0] = iMo139Ujhhgtgfeyxiexzf;
            iArr[1] = iMo140Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m253feyxiexzfUjhhgtg(int i) {
        if (this.f380feyxiexzfUjhhgtg) {
            return;
        }
        m261Ujhhgtgfeyxiexzf();
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0822feyxiexzfUjhhgtg.mo165Ujhhgtgfeyxiexzf(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean m254feyxiexzfUjhhgtg(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM1880Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f357Ujhhgtgfeyxiexzf * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f351feyxiexzfUjhhgtg;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM1880Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m255Ujhhgtgfeyxiexzf(int i, int i2, boolean z) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f380feyxiexzfUjhhgtg) {
            return;
        }
        if (!abstractC0822feyxiexzfUjhhgtg.mo152Ujhhgtgfeyxiexzf()) {
            i = 0;
        }
        if (!this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf()) {
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
            getScrollingChildHelper().m1754Ujhhgtgfeyxiexzf(i3, 1);
        }
        this.f409feyxiexzfUjhhgtg.m2163Ujhhgtgfeyxiexzf(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m256Ujhhgtgfeyxiexzf(int i) {
        if (this.f380feyxiexzfUjhhgtg) {
            return;
        }
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0822feyxiexzfUjhhgtg.mo167feyxiexzfUjhhgtg(this, this.f412feyxiexzfUjhhgtg, i);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void m257feyxiexzfUjhhgtg() {
        int i = this.f378Ujhhgtgfeyxiexzf + 1;
        this.f378Ujhhgtgfeyxiexzf = i;
        if (i != 1 || this.f380feyxiexzfUjhhgtg) {
            return;
        }
        this.f379feyxiexzfUjhhgtg = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m258feyxiexzfUjhhgtg(int i) {
        boolean zMo152Ujhhgtgfeyxiexzf = this.f370Ujhhgtgfeyxiexzf.mo152Ujhhgtgfeyxiexzf();
        int i2 = zMo152Ujhhgtgfeyxiexzf;
        if (this.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf()) {
            i2 = (zMo152Ujhhgtgfeyxiexzf ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m1754Ujhhgtgfeyxiexzf(i2, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m259Ujhhgtgfeyxiexzf(boolean z) {
        if (this.f378Ujhhgtgfeyxiexzf < 1) {
            if (f348feyxiexzfUjhhgtg) {
                throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f378Ujhhgtgfeyxiexzf = 1;
        }
        if (!z && !this.f380feyxiexzfUjhhgtg) {
            this.f379feyxiexzfUjhhgtg = false;
        }
        if (this.f378Ujhhgtgfeyxiexzf == 1) {
            if (z && this.f379feyxiexzfUjhhgtg && !this.f380feyxiexzfUjhhgtg && this.f370Ujhhgtgfeyxiexzf != null && this.f369Ujhhgtgfeyxiexzf != null) {
                m213Ujhhgtgfeyxiexzf();
            }
            if (!this.f380feyxiexzfUjhhgtg) {
                this.f379feyxiexzfUjhhgtg = false;
            }
        }
        this.f378Ujhhgtgfeyxiexzf--;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m260feyxiexzfUjhhgtg(int i) {
        getScrollingChildHelper().m1755Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m261Ujhhgtgfeyxiexzf() {
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf;
        setScrollState(0);
        RunnableC0818feyxiexzfUjhhgtg runnableC0818feyxiexzfUjhhgtg = this.f409feyxiexzfUjhhgtg;
        runnableC0818feyxiexzfUjhhgtg.f3237Ujhhgtgfeyxiexzf.removeCallbacks(runnableC0818feyxiexzfUjhhgtg);
        runnableC0818feyxiexzfUjhhgtg.f3233Ujhhgtgfeyxiexzf.abortAnimation();
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg == null || (c0069Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.f3264Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        c0069Ujhhgtgfeyxiexzf.m1085Ujhhgtgfeyxiexzf();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f358Ujhhgtgfeyxiexzf = new C0813feyxiexzfUjhhgtg(this);
        this.f359Ujhhgtgfeyxiexzf = new C0831feyxiexzfUjhhgtg(this);
        this.f363Ujhhgtgfeyxiexzf = new C2073feyxiexzfUjhhgtg();
        this.f365Ujhhgtgfeyxiexzf = new RunnableC0786feyxiexzfUjhhgtg(this, 0);
        this.f366Ujhhgtgfeyxiexzf = new Rect();
        this.f367Ujhhgtgfeyxiexzf = new Rect();
        this.f368Ujhhgtgfeyxiexzf = new RectF();
        this.f371Ujhhgtgfeyxiexzf = new ArrayList();
        this.f372Ujhhgtgfeyxiexzf = new ArrayList();
        this.f373Ujhhgtgfeyxiexzf = new ArrayList();
        this.f378Ujhhgtgfeyxiexzf = 0;
        this.f386feyxiexzfUjhhgtg = false;
        this.f387feyxiexzfUjhhgtg = false;
        this.f388feyxiexzfUjhhgtg = 0;
        this.f389feyxiexzfUjhhgtg = 0;
        this.f390feyxiexzfUjhhgtg = f356feyxiexzfUjhhgtg;
        C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = new C3116Ujhhgtgfeyxiexzf();
        Object[] objArr = null;
        c3116Ujhhgtgfeyxiexzf.f3105Ujhhgtgfeyxiexzf = null;
        c3116Ujhhgtgfeyxiexzf.f3106Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f3107Ujhhgtgfeyxiexzf = 120L;
        c3116Ujhhgtgfeyxiexzf.f3108Ujhhgtgfeyxiexzf = 120L;
        c3116Ujhhgtgfeyxiexzf.f3109Ujhhgtgfeyxiexzf = 250L;
        c3116Ujhhgtgfeyxiexzf.f3110Ujhhgtgfeyxiexzf = 250L;
        int i3 = 1;
        c3116Ujhhgtgfeyxiexzf.f9682Ujhhgtgfeyxiexzf = true;
        c3116Ujhhgtgfeyxiexzf.f9683Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9684Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9685Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9686Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9687Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9688Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9689Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9690Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9691Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9692Ujhhgtgfeyxiexzf = new ArrayList();
        c3116Ujhhgtgfeyxiexzf.f9693Ujhhgtgfeyxiexzf = new ArrayList();
        this.f395feyxiexzfUjhhgtg = c3116Ujhhgtgfeyxiexzf;
        this.f396feyxiexzfUjhhgtg = 0;
        this.f397feyxiexzfUjhhgtg = -1;
        this.f406Ujhhgtgfeyxiexzf = Float.MIN_VALUE;
        this.f407Ujhhgtgfeyxiexzf = Float.MIN_VALUE;
        this.f408Ujhhgtgfeyxiexzf = true;
        this.f409feyxiexzfUjhhgtg = new RunnableC0818feyxiexzfUjhhgtg(this);
        this.f411feyxiexzfUjhhgtg = f353feyxiexzfUjhhgtg ? new C3570Ujhhgtgfeyxiexzf() : null;
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg = new C0810feyxiexzfUjhhgtg();
        c0810feyxiexzfUjhhgtg.f3205Ujhhgtgfeyxiexzf = -1;
        c0810feyxiexzfUjhhgtg.f3206Ujhhgtgfeyxiexzf = 0;
        c0810feyxiexzfUjhhgtg.f3207Ujhhgtgfeyxiexzf = 0;
        c0810feyxiexzfUjhhgtg.f3208Ujhhgtgfeyxiexzf = 1;
        c0810feyxiexzfUjhhgtg.f3209Ujhhgtgfeyxiexzf = 0;
        c0810feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3212Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3213Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3214Ujhhgtgfeyxiexzf = false;
        c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf = false;
        this.f412feyxiexzfUjhhgtg = c0810feyxiexzfUjhhgtg;
        this.f415Ujhhgtgfeyxiexzf = false;
        this.f416Ujhhgtgfeyxiexzf = false;
        C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = new C0787feyxiexzfUjhhgtg(this);
        this.f417feyxiexzfUjhhgtg = c0787feyxiexzfUjhhgtg;
        this.f418feyxiexzfUjhhgtg = false;
        this.f420feyxiexzfUjhhgtg = new int[2];
        this.f422Ujhhgtgfeyxiexzf = new int[2];
        this.f423feyxiexzfUjhhgtg = new int[2];
        this.f424feyxiexzfUjhhgtg = new int[2];
        this.f425Ujhhgtgfeyxiexzf = new ArrayList();
        this.f426feyxiexzfUjhhgtg = new RunnableC0786feyxiexzfUjhhgtg(this, i3);
        this.f428Ujhhgtgfeyxiexzf = 0;
        this.f429Ujhhgtgfeyxiexzf = 0;
        this.f431Ujhhgtgfeyxiexzf = new C0787feyxiexzfUjhhgtg(this);
        this.f432Ujhhgtgfeyxiexzf = new C3158feyxiexzfUjhhgtg(getContext(), new C0787feyxiexzfUjhhgtg(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f403Ujhhgtgfeyxiexzf = viewConfiguration.getScaledTouchSlop();
        this.f406Ujhhgtgfeyxiexzf = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f407Ujhhgtgfeyxiexzf = viewConfiguration.getScaledVerticalScrollFactor();
        this.f404Ujhhgtgfeyxiexzf = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f405Ujhhgtgfeyxiexzf = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f357Ujhhgtgfeyxiexzf = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f395feyxiexzfUjhhgtg.f3105Ujhhgtgfeyxiexzf = c0787feyxiexzfUjhhgtg;
        this.f361Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(new C0787feyxiexzfUjhhgtg(this));
        this.f362Ujhhgtgfeyxiexzf = new C2790feyxiexzfUjhhgtg(new C0787feyxiexzfUjhhgtg(this));
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        if (AbstractC1894Ujhhgtgfeyxiexzf.m3228Ujhhgtgfeyxiexzf(this) == 0) {
            AbstractC1894Ujhhgtgfeyxiexzf.m3229Ujhhgtgfeyxiexzf(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f384feyxiexzfUjhhgtg = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0816feyxiexzfUjhhgtg(this));
        int[] iArr = AbstractC0803feyxiexzfUjhhgtg.f3191Ujhhgtgfeyxiexzf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f364Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            new C3419Ujhhgtgfeyxiexzf(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(me.hd.wauxv.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(me.hd.wauxv.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(me.hd.wauxv.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f430Ujhhgtgfeyxiexzf = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
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
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0822feyxiexzfUjhhgtg.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f354Ujhhgtgfeyxiexzf);
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
                    setLayoutManager((AbstractC0822feyxiexzfUjhhgtg) constructor.newInstance(objArr));
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
        int[] iArr2 = f350feyxiexzfUjhhgtg;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(me.hd.wauxv.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f370Ujhhgtgfeyxiexzf;
        if (abstractC0822feyxiexzfUjhhgtg != null) {
            return abstractC0822feyxiexzfUjhhgtg.mo125Ujhhgtgfeyxiexzf(layoutParams);
        }
        throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void setOnFlingListener(AbstractC0824feyxiexzfUjhhgtg abstractC0824feyxiexzfUjhhgtg) {
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0830feyxiexzfUjhhgtg interfaceC0830feyxiexzfUjhhgtg) {
    }
}
