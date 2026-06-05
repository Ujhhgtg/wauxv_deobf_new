package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ能不能ᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0822feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C2790feyxiexzfUjhhgtg f3260Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public RecyclerView f3261Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2073feyxiexzfUjhhgtg f3262Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2073feyxiexzfUjhhgtg f3263Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C0069Ujhhgtgfeyxiexzf f3264Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f3265Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f3266Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean f3267Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f3268Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f3269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f3270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f3271Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f3272Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f3273Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f3274Ujhhgtgfeyxiexzf;

    public AbstractC0822feyxiexzfUjhhgtg() {
        C0827feyxiexzfUjhhgtg c0827feyxiexzfUjhhgtg = new C0827feyxiexzfUjhhgtg(this, 0);
        C0827feyxiexzfUjhhgtg c0827feyxiexzfUjhhgtg2 = new C0827feyxiexzfUjhhgtg(this, 1);
        this.f3262Ujhhgtgfeyxiexzf = new C2073feyxiexzfUjhhgtg(c0827feyxiexzfUjhhgtg);
        this.f3263Ujhhgtgfeyxiexzf = new C2073feyxiexzfUjhhgtg(c0827feyxiexzfUjhhgtg2);
        this.f3265Ujhhgtgfeyxiexzf = false;
        this.f3266Ujhhgtgfeyxiexzf = false;
        this.f3267Ujhhgtgfeyxiexzf = true;
        this.f3268Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static int m2188Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static int m2189Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, boolean z) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static int m2190feyxiexzfUjhhgtg(View view) {
        return view.getBottom() + ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3280Ujhhgtgfeyxiexzf.bottom;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m2191feyxiexzfUjhhgtg(View view) {
        return view.getLeft() - ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3280Ujhhgtgfeyxiexzf.left;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static int m2192feyxiexzfUjhhgtg(View view) {
        Rect rect = ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3280Ujhhgtgfeyxiexzf;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static int m2193feyxiexzfUjhhgtg(View view) {
        Rect rect = ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3280Ujhhgtgfeyxiexzf;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static int m2194feyxiexzfUjhhgtg(View view) {
        return view.getRight() + ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3280Ujhhgtgfeyxiexzf.right;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static int m2195feyxiexzfUjhhgtg(View view) {
        return view.getTop() - ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3280Ujhhgtgfeyxiexzf.top;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static int m2196feyxiexzfUjhhgtg(View view) {
        return ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static C0823feyxiexzfUjhhgtg m2197feyxiexzfUjhhgtg(Context context, AttributeSet attributeSet, int i, int i2) {
        C0823feyxiexzfUjhhgtg c0823feyxiexzfUjhhgtg = new C0823feyxiexzfUjhhgtg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0803feyxiexzfUjhhgtg.f3191Ujhhgtgfeyxiexzf, i, i2);
        c0823feyxiexzfUjhhgtg.f3275Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0823feyxiexzfUjhhgtg.f3276Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0823feyxiexzfUjhhgtg.f3277Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0823feyxiexzfUjhhgtg.f3278Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0823feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public static boolean m2198feyxiexzfUjhhgtg(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public static void m2199feyxiexzfUjhhgtg(View view, int i, int i2, int i3, int i4) {
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) view.getLayoutParams();
        Rect rect = c0825feyxiexzfUjhhgtg.f3280Ujhhgtgfeyxiexzf;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).bottomMargin);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2200Ujhhgtgfeyxiexzf(View view, int i, boolean z) {
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
        if (z || abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf()) {
            C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) this.f3261Ujhhgtgfeyxiexzf.f363Ujhhgtgfeyxiexzf.f6810Ujhhgtgfeyxiexzf;
            C2295Ujhhgtgfeyxiexzf c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg.get(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
            if (c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf == null) {
                c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf = C2295Ujhhgtgfeyxiexzf.m3506Ujhhgtgfeyxiexzf();
                c1044feyxiexzfUjhhgtg.put(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg, c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf);
            }
            c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf.f7526Ujhhgtgfeyxiexzf |= 1;
        } else {
            this.f3261Ujhhgtgfeyxiexzf.f363Ujhhgtgfeyxiexzf.m3373Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
        }
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) view.getLayoutParams();
        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2187Ujhhgtgfeyxiexzf() || abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2180Ujhhgtgfeyxiexzf()) {
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2180Ujhhgtgfeyxiexzf()) {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3254Ujhhgtgfeyxiexzf.m2240Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
            } else {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf &= -33;
            }
            this.f3260Ujhhgtgfeyxiexzf.m4075Ujhhgtgfeyxiexzf(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f3261Ujhhgtgfeyxiexzf) {
                C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f3260Ujhhgtgfeyxiexzf;
                C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf = (C2816Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf;
                int iIndexOfChild = ((C0787feyxiexzfUjhhgtg) c2790feyxiexzfUjhhgtg.f8834Ujhhgtgfeyxiexzf).f3094Ujhhgtgfeyxiexzf.indexOfChild(view);
                int iM4145Ujhhgtgfeyxiexzf = (iIndexOfChild == -1 || c2816Ujhhgtgfeyxiexzf.m4147Ujhhgtgfeyxiexzf(iIndexOfChild)) ? -1 : iIndexOfChild - c2816Ujhhgtgfeyxiexzf.m4145Ujhhgtgfeyxiexzf(iIndexOfChild);
                if (i == -1) {
                    i = this.f3260Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
                }
                if (iM4145Ujhhgtgfeyxiexzf == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f3261Ujhhgtgfeyxiexzf.indexOfChild(view));
                    throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2702Ujhhgtgfeyxiexzf(this.f3261Ujhhgtgfeyxiexzf, sb));
                }
                if (iM4145Ujhhgtgfeyxiexzf != i) {
                    AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.f370Ujhhgtgfeyxiexzf;
                    View viewM2202Ujhhgtgfeyxiexzf = abstractC0822feyxiexzfUjhhgtg.m2202Ujhhgtgfeyxiexzf(iM4145Ujhhgtgfeyxiexzf);
                    if (viewM2202Ujhhgtgfeyxiexzf == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM4145Ujhhgtgfeyxiexzf + abstractC0822feyxiexzfUjhhgtg.f3261Ujhhgtgfeyxiexzf.toString());
                    }
                    abstractC0822feyxiexzfUjhhgtg.m2202Ujhhgtgfeyxiexzf(iM4145Ujhhgtgfeyxiexzf);
                    abstractC0822feyxiexzfUjhhgtg.f3260Ujhhgtgfeyxiexzf.m4076Ujhhgtgfeyxiexzf(iM4145Ujhhgtgfeyxiexzf);
                    C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg2 = (C0825feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams();
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2 = RecyclerView.m204feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf);
                    if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.m2179Ujhhgtgfeyxiexzf()) {
                        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg2 = (C1044feyxiexzfUjhhgtg) abstractC0822feyxiexzfUjhhgtg.f3261Ujhhgtgfeyxiexzf.f363Ujhhgtgfeyxiexzf.f6810Ujhhgtgfeyxiexzf;
                        C2295Ujhhgtgfeyxiexzf c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2 = (C2295Ujhhgtgfeyxiexzf) c1044feyxiexzfUjhhgtg2.get(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2);
                        if (c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2 == null) {
                            c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2 = C2295Ujhhgtgfeyxiexzf.m3506Ujhhgtgfeyxiexzf();
                            c1044feyxiexzfUjhhgtg2.put(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2, c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2);
                        }
                        c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2.f7526Ujhhgtgfeyxiexzf = 1 | c2295UjhhgtgfeyxiexzfM3506Ujhhgtgfeyxiexzf2.f7526Ujhhgtgfeyxiexzf;
                    } else {
                        abstractC0822feyxiexzfUjhhgtg.f3261Ujhhgtgfeyxiexzf.f363Ujhhgtgfeyxiexzf.m3373Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2);
                    }
                    abstractC0822feyxiexzfUjhhgtg.f3260Ujhhgtgfeyxiexzf.m4075Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf, i, c0825feyxiexzfUjhhgtg2, abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.m2179Ujhhgtgfeyxiexzf());
                }
            } else {
                this.f3260Ujhhgtgfeyxiexzf.m4074Ujhhgtgfeyxiexzf(view, i, false);
                c0825feyxiexzfUjhhgtg.f3281Ujhhgtgfeyxiexzf = true;
                C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf = this.f3264Ujhhgtgfeyxiexzf;
                if (c0069Ujhhgtgfeyxiexzf != null && c0069Ujhhgtgfeyxiexzf.f1092Ujhhgtgfeyxiexzf) {
                    c0069Ujhhgtgfeyxiexzf.f1089Ujhhgtgfeyxiexzf.getClass();
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3 = RecyclerView.m204feyxiexzfUjhhgtg(view);
                    if ((abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3 != null ? abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg3.m2173Ujhhgtgfeyxiexzf() : -1) == c0069Ujhhgtgfeyxiexzf.f1088Ujhhgtgfeyxiexzf) {
                        c0069Ujhhgtgfeyxiexzf.f1093Ujhhgtgfeyxiexzf = view;
                        if (RecyclerView.f349feyxiexzfUjhhgtg) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c0825feyxiexzfUjhhgtg.f3282Ujhhgtgfeyxiexzf) {
            if (RecyclerView.f349feyxiexzfUjhhgtg) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf);
            }
            abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.invalidate();
            c0825feyxiexzfUjhhgtg.f3282Ujhhgtgfeyxiexzf = false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo151Ujhhgtgfeyxiexzf(String str) {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            recyclerView.m207Ujhhgtgfeyxiexzf(str);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public boolean mo152Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public boolean mo153Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public boolean mo118Ujhhgtgfeyxiexzf(C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg) {
        return c0825feyxiexzfUjhhgtg != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public int mo156Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public int mo119Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public int mo120Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public int mo157Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public int mo121Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public int mo122Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2201Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg) {
        for (int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf() - 1; iM2203Ujhhgtgfeyxiexzf >= 0; iM2203Ujhhgtgfeyxiexzf--) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf);
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf);
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                if (RecyclerView.f349feyxiexzfUjhhgtg) {
                    Log.d("RecyclerView", "ignoring view " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                }
            } else if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2177Ujhhgtgfeyxiexzf() || abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() || this.f3261Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf.f3112Ujhhgtgfeyxiexzf) {
                m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf);
                this.f3260Ujhhgtgfeyxiexzf.m4076Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf);
                c0831feyxiexzfUjhhgtg.m2238Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
                this.f3261Ujhhgtgfeyxiexzf.f363Ujhhgtgfeyxiexzf.m3373Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
            } else {
                m2215feyxiexzfUjhhgtg(iM2203Ujhhgtgfeyxiexzf);
                c0831feyxiexzfUjhhgtg.m2237Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public View mo158Ujhhgtgfeyxiexzf(int i) {
        int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
        for (int i2 = 0; i2 < iM2203Ujhhgtgfeyxiexzf; i2++) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i2);
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf);
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2173Ujhhgtgfeyxiexzf() == i && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf() && (this.f3261Ujhhgtgfeyxiexzf.f412feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf || !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf())) {
                return viewM2202Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public abstract C0825feyxiexzfUjhhgtg mo123Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public C0825feyxiexzfUjhhgtg mo124Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        return new C0825feyxiexzfUjhhgtg(context, attributeSet);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public C0825feyxiexzfUjhhgtg mo125Ujhhgtgfeyxiexzf(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0825feyxiexzfUjhhgtg) {
            return new C0825feyxiexzfUjhhgtg((C0825feyxiexzfUjhhgtg) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0825feyxiexzfUjhhgtg((ViewGroup.MarginLayoutParams) layoutParams) : new C0825feyxiexzfUjhhgtg(layoutParams);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final View m2202Ujhhgtgfeyxiexzf(int i) {
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f3260Ujhhgtgfeyxiexzf;
        if (c2790feyxiexzfUjhhgtg != null) {
            return c2790feyxiexzfUjhhgtg.m4083Ujhhgtgfeyxiexzf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m2203Ujhhgtgfeyxiexzf() {
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f3260Ujhhgtgfeyxiexzf;
        if (c2790feyxiexzfUjhhgtg != null) {
            return c2790feyxiexzfUjhhgtg.m4084Ujhhgtgfeyxiexzf();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public int mo126Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView == null || recyclerView.f369Ujhhgtgfeyxiexzf == null || !mo152Ujhhgtgfeyxiexzf()) {
            return 1;
        }
        return this.f3261Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public void mo809feyxiexzfUjhhgtg(Rect rect, View view) {
        boolean z = RecyclerView.f348feyxiexzfUjhhgtg;
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) view.getLayoutParams();
        Rect rect2 = c0825feyxiexzfUjhhgtg.f3280Ujhhgtgfeyxiexzf;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).bottomMargin);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final int m2204feyxiexzfUjhhgtg() {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        AbstractC0795feyxiexzfUjhhgtg adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo2134Ujhhgtgfeyxiexzf();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final int m2205feyxiexzfUjhhgtg() {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m2206feyxiexzfUjhhgtg() {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final int m2207feyxiexzfUjhhgtg() {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m2208feyxiexzfUjhhgtg() {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public int mo127feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView == null || recyclerView.f369Ujhhgtgfeyxiexzf == null || !mo153Ujhhgtgfeyxiexzf()) {
            return 1;
        }
        return this.f3261Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2209feyxiexzfUjhhgtg(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C0825feyxiexzfUjhhgtg) view.getLayoutParams()).f3280Ujhhgtgfeyxiexzf;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3261Ujhhgtgfeyxiexzf != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3261Ujhhgtgfeyxiexzf.f368Ujhhgtgfeyxiexzf;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ */
    public boolean mo159feyxiexzfUjhhgtg() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ */
    public boolean mo160feyxiexzfUjhhgtg() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ */
    public void mo263feyxiexzfUjhhgtg(int i) {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            int iM4084Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
            for (int i2 = 0; i2 < iM4084Ujhhgtgfeyxiexzf; i2++) {
                recyclerView.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ */
    public void mo264feyxiexzfUjhhgtg(int i) {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            int iM4084Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf();
            for (int i2 = 0; i2 < iM4084Ujhhgtgfeyxiexzf; i2++) {
                recyclerView.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ */
    public abstract void mo161Ujhhgtgfeyxiexzf(RecyclerView recyclerView);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ */
    public View mo128Ujhhgtgfeyxiexzf(View view, int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ */
    public void mo162Ujhhgtgfeyxiexzf(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = recyclerView.f359Ujhhgtgfeyxiexzf;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3261Ujhhgtgfeyxiexzf.canScrollVertically(-1) && !this.f3261Ujhhgtgfeyxiexzf.canScrollHorizontally(-1) && !this.f3261Ujhhgtgfeyxiexzf.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf;
        if (abstractC0795feyxiexzfUjhhgtg != null) {
            accessibilityEvent.setItemCount(abstractC0795feyxiexzfUjhhgtg.mo2134Ujhhgtgfeyxiexzf());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ */
    public void mo129Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        if (this.f3261Ujhhgtgfeyxiexzf.canScrollVertically(-1) || this.f3261Ujhhgtgfeyxiexzf.canScrollHorizontally(-1)) {
            c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(8192);
            accessibilityNodeInfo.setScrollable(true);
            c2963feyxiexzfUjhhgtg.m4438Ujhhgtgfeyxiexzf(67108864, true);
        }
        if (this.f3261Ujhhgtgfeyxiexzf.canScrollVertically(1) || this.f3261Ujhhgtgfeyxiexzf.canScrollHorizontally(1)) {
            c2963feyxiexzfUjhhgtg.m4432Ujhhgtgfeyxiexzf(4096);
            accessibilityNodeInfo.setScrollable(true);
            c2963feyxiexzfUjhhgtg.m4438Ujhhgtgfeyxiexzf(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2962feyxiexzfUjhhgtg.m4428Ujhhgtgfeyxiexzf(mo127feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg), mo126Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg), 0).f9271Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ */
    public void mo130Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        c2963feyxiexzfUjhhgtg.m4440Ujhhgtgfeyxiexzf(C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(mo153Ujhhgtgfeyxiexzf() ? m2196feyxiexzfUjhhgtg(view) : 0, 1, mo152Ujhhgtgfeyxiexzf() ? m2196feyxiexzfUjhhgtg(view) : 0, 1, false));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2210Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
        if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg == null || abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf()) {
            return;
        }
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f3260Ujhhgtgfeyxiexzf;
        if (((ArrayList) c2790feyxiexzfUjhhgtg.f8836Ujhhgtgfeyxiexzf).contains(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf)) {
            return;
        }
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        mo130Ujhhgtgfeyxiexzf(recyclerView.f359Ujhhgtgfeyxiexzf, recyclerView.f412feyxiexzfUjhhgtg, view, c2963feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ */
    public void mo136feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ */
    public Parcelable mo164feyxiexzfUjhhgtg() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r0
      0x0060: PHI (r0v8 int) = (r0v5 int), (r0v15 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ */
    public boolean mo138Ujhhgtgfeyxiexzf(int i, Bundle bundle) {
        int iM2208feyxiexzfUjhhgtg;
        int iM2206feyxiexzfUjhhgtg;
        float f;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.f359Ujhhgtgfeyxiexzf;
        int iHeight = this.f3274Ujhhgtgfeyxiexzf;
        int iWidth = this.f3273Ujhhgtgfeyxiexzf;
        Rect rect = new Rect();
        if (this.f3261Ujhhgtgfeyxiexzf.getMatrix().isIdentity() && this.f3261Ujhhgtgfeyxiexzf.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            iM2208feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.canScrollVertically(1) ? (iHeight - m2208feyxiexzfUjhhgtg()) - m2205feyxiexzfUjhhgtg() : 0;
            if (this.f3261Ujhhgtgfeyxiexzf.canScrollHorizontally(1)) {
                iM2206feyxiexzfUjhhgtg = (iWidth - m2206feyxiexzfUjhhgtg()) - m2207feyxiexzfUjhhgtg();
            } else {
                iM2206feyxiexzfUjhhgtg = 0;
            }
        } else if (i != 8192) {
            iM2208feyxiexzfUjhhgtg = 0;
            iM2206feyxiexzfUjhhgtg = 0;
        } else {
            iM2208feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.canScrollVertically(-1) ? -((iHeight - m2208feyxiexzfUjhhgtg()) - m2205feyxiexzfUjhhgtg()) : 0;
            if (this.f3261Ujhhgtgfeyxiexzf.canScrollHorizontally(-1)) {
                iM2206feyxiexzfUjhhgtg = -((iWidth - m2206feyxiexzfUjhhgtg()) - m2207feyxiexzfUjhhgtg());
            } else {
                iM2206feyxiexzfUjhhgtg = 0;
            }
        }
        if (iM2208feyxiexzfUjhhgtg != 0 || iM2206feyxiexzfUjhhgtg != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.f348feyxiexzfUjhhgtg) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    iM2206feyxiexzfUjhhgtg = (int) (iM2206feyxiexzfUjhhgtg * f);
                    iM2208feyxiexzfUjhhgtg = (int) (iM2208feyxiexzfUjhhgtg * f);
                }
                this.f3261Ujhhgtgfeyxiexzf.m255Ujhhgtgfeyxiexzf(iM2206feyxiexzfUjhhgtg, iM2208feyxiexzfUjhhgtg, true);
                return true;
            }
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = recyclerView.f369Ujhhgtgfeyxiexzf;
            if (abstractC0795feyxiexzfUjhhgtg != null) {
                if (i == 4096) {
                    recyclerView.m256Ujhhgtgfeyxiexzf(abstractC0795feyxiexzfUjhhgtg.mo2134Ujhhgtgfeyxiexzf() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.m256Ujhhgtgfeyxiexzf(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2211feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg) {
        for (int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf() - 1; iM2203Ujhhgtgfeyxiexzf >= 0; iM2203Ujhhgtgfeyxiexzf--) {
            if (!RecyclerView.m204feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf)).m2186Ujhhgtgfeyxiexzf()) {
                m2214feyxiexzfUjhhgtg(iM2203Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m2212Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg) {
        ArrayList arrayList = c0831feyxiexzfUjhhgtg.f3292Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i)).f3241Ujhhgtgfeyxiexzf;
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(view);
            if (!abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf()) {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2185Ujhhgtgfeyxiexzf(false);
                if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2181Ujhhgtgfeyxiexzf()) {
                    this.f3261Ujhhgtgfeyxiexzf.removeDetachedView(view, false);
                }
                AbstractC0793feyxiexzfUjhhgtg abstractC0793feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.f395feyxiexzfUjhhgtg;
                if (abstractC0793feyxiexzfUjhhgtg != null) {
                    abstractC0793feyxiexzfUjhhgtg.mo2127Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                }
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2185Ujhhgtgfeyxiexzf(true);
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2 = RecyclerView.m204feyxiexzfUjhhgtg(view);
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.f3254Ujhhgtgfeyxiexzf = null;
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.f3255Ujhhgtgfeyxiexzf = false;
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2.f3250Ujhhgtgfeyxiexzf &= -33;
                c0831feyxiexzfUjhhgtg.m2237Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c0831feyxiexzfUjhhgtg.f3293Ujhhgtgfeyxiexzf;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3261Ujhhgtgfeyxiexzf.invalidate();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2213Ujhhgtgfeyxiexzf(View view, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg) {
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f3260Ujhhgtgfeyxiexzf;
        C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) c2790feyxiexzfUjhhgtg.f8834Ujhhgtgfeyxiexzf;
        int i = c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf = 1;
            c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf = view;
            int iIndexOfChild = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C2816Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf).m4149Ujhhgtgfeyxiexzf(iIndexOfChild)) {
                    c2790feyxiexzfUjhhgtg.m4089Ujhhgtgfeyxiexzf(view);
                }
                c0787feyxiexzfUjhhgtg.m2103Ujhhgtgfeyxiexzf(iIndexOfChild);
            }
            c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf = 0;
            c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf = null;
            c0831feyxiexzfUjhhgtg.m2236Ujhhgtgfeyxiexzf(view);
        } catch (Throwable th) {
            c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf = 0;
            c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m2214feyxiexzfUjhhgtg(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg) {
        View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i);
        m2215feyxiexzfUjhhgtg(i);
        c0831feyxiexzfUjhhgtg.m2236Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2215feyxiexzfUjhhgtg(int i) {
        if (m2202Ujhhgtgfeyxiexzf(i) != null) {
            C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = this.f3260Ujhhgtgfeyxiexzf;
            C0787feyxiexzfUjhhgtg c0787feyxiexzfUjhhgtg = (C0787feyxiexzfUjhhgtg) c2790feyxiexzfUjhhgtg.f8834Ujhhgtgfeyxiexzf;
            int i2 = c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iM4085Ujhhgtgfeyxiexzf = c2790feyxiexzfUjhhgtg.m4085Ujhhgtgfeyxiexzf(i);
                View childAt = c0787feyxiexzfUjhhgtg.f3094Ujhhgtgfeyxiexzf.getChildAt(iM4085Ujhhgtgfeyxiexzf);
                if (childAt != null) {
                    c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf = 1;
                    c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf = childAt;
                    if (((C2816Ujhhgtgfeyxiexzf) c2790feyxiexzfUjhhgtg.f8835Ujhhgtgfeyxiexzf).m4149Ujhhgtgfeyxiexzf(iM4085Ujhhgtgfeyxiexzf)) {
                        c2790feyxiexzfUjhhgtg.m4089Ujhhgtgfeyxiexzf(childAt);
                    }
                    c0787feyxiexzfUjhhgtg.m2103Ujhhgtgfeyxiexzf(iM4085Ujhhgtgfeyxiexzf);
                }
            } finally {
                c2790feyxiexzfUjhhgtg.f8833Ujhhgtgfeyxiexzf = 0;
                c2790feyxiexzfUjhhgtg.f8837Ujhhgtgfeyxiexzf = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ */
    public boolean mo810Ujhhgtgfeyxiexzf(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iM2206feyxiexzfUjhhgtg = m2206feyxiexzfUjhhgtg();
        int iM2208feyxiexzfUjhhgtg = m2208feyxiexzfUjhhgtg();
        int iM2207feyxiexzfUjhhgtg = this.f3273Ujhhgtgfeyxiexzf - m2207feyxiexzfUjhhgtg();
        int iM2205feyxiexzfUjhhgtg = this.f3274Ujhhgtgfeyxiexzf - m2205feyxiexzfUjhhgtg();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM2206feyxiexzfUjhhgtg;
        int iMin = Math.min(0, i);
        int i2 = top - iM2208feyxiexzfUjhhgtg;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iM2207feyxiexzfUjhhgtg;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iM2205feyxiexzfUjhhgtg);
        if (this.f3261Ujhhgtgfeyxiexzf.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM2206feyxiexzfUjhhgtg2 = m2206feyxiexzfUjhhgtg();
                int iM2208feyxiexzfUjhhgtg2 = m2208feyxiexzfUjhhgtg();
                int iM2207feyxiexzfUjhhgtg2 = this.f3273Ujhhgtgfeyxiexzf - m2207feyxiexzfUjhhgtg();
                int iM2205feyxiexzfUjhhgtg2 = this.f3274Ujhhgtgfeyxiexzf - m2205feyxiexzfUjhhgtg();
                Rect rect2 = this.f3261Ujhhgtgfeyxiexzf.f366Ujhhgtgfeyxiexzf;
                mo809feyxiexzfUjhhgtg(rect2, focusedChild);
                if (rect2.left - i4 < iM2207feyxiexzfUjhhgtg2 && rect2.right - i4 > iM2206feyxiexzfUjhhgtg2 && rect2.top - i5 < iM2205feyxiexzfUjhhgtg2 && rect2.bottom - i5 > iM2208feyxiexzfUjhhgtg2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.m255Ujhhgtgfeyxiexzf(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.m255Ujhhgtgfeyxiexzf(i4, i5, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2216feyxiexzfUjhhgtg() {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ */
    public int mo139Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ */
    public void mo165Ujhhgtgfeyxiexzf(int i) {
        if (RecyclerView.f349feyxiexzfUjhhgtg) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ */
    public int mo140Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2217Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
        m2218Ujhhgtgfeyxiexzf(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m2218Ujhhgtgfeyxiexzf(int i, int i2) {
        this.f3273Ujhhgtgfeyxiexzf = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3271Ujhhgtgfeyxiexzf = mode;
        if (mode == 0 && !RecyclerView.f352feyxiexzfUjhhgtg) {
            this.f3273Ujhhgtgfeyxiexzf = 0;
        }
        this.f3274Ujhhgtgfeyxiexzf = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3272Ujhhgtgfeyxiexzf = mode2;
        if (mode2 != 0 || RecyclerView.f352feyxiexzfUjhhgtg) {
            return;
        }
        this.f3274Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ */
    public void mo141Ujhhgtgfeyxiexzf(Rect rect, int i, int i2) {
        int iM2207feyxiexzfUjhhgtg = m2207feyxiexzfUjhhgtg() + m2206feyxiexzfUjhhgtg() + rect.width();
        int iM2205feyxiexzfUjhhgtg = m2205feyxiexzfUjhhgtg() + m2208feyxiexzfUjhhgtg() + rect.height();
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        this.f3261Ujhhgtgfeyxiexzf.setMeasuredDimension(m2188Ujhhgtgfeyxiexzf(i, iM2207feyxiexzfUjhhgtg, recyclerView.getMinimumWidth()), m2188Ujhhgtgfeyxiexzf(i2, iM2205feyxiexzfUjhhgtg, this.f3261Ujhhgtgfeyxiexzf.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final void m2219feyxiexzfUjhhgtg(int i, int i2) {
        int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
        if (iM2203Ujhhgtgfeyxiexzf == 0) {
            this.f3261Ujhhgtgfeyxiexzf.m211Ujhhgtgfeyxiexzf(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM2203Ujhhgtgfeyxiexzf; i7++) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i7);
            Rect rect = this.f3261Ujhhgtgfeyxiexzf.f366Ujhhgtgfeyxiexzf;
            mo809feyxiexzfUjhhgtg(rect, viewM2202Ujhhgtgfeyxiexzf);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f3261Ujhhgtgfeyxiexzf.f366Ujhhgtgfeyxiexzf.set(i6, i4, i3, i5);
        mo141Ujhhgtgfeyxiexzf(this.f3261Ujhhgtgfeyxiexzf.f366Ujhhgtgfeyxiexzf, i, i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final void m2220feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3261Ujhhgtgfeyxiexzf = null;
            this.f3260Ujhhgtgfeyxiexzf = null;
            this.f3273Ujhhgtgfeyxiexzf = 0;
            this.f3274Ujhhgtgfeyxiexzf = 0;
        } else {
            this.f3261Ujhhgtgfeyxiexzf = recyclerView;
            this.f3260Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf;
            this.f3273Ujhhgtgfeyxiexzf = recyclerView.getWidth();
            this.f3274Ujhhgtgfeyxiexzf = recyclerView.getHeight();
        }
        this.f3271Ujhhgtgfeyxiexzf = 1073741824;
        this.f3272Ujhhgtgfeyxiexzf = 1073741824;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final boolean m2221feyxiexzfUjhhgtg(View view, int i, int i2, C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg) {
        return (!view.isLayoutRequested() && this.f3267Ujhhgtgfeyxiexzf && m2198feyxiexzfUjhhgtg(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).width) && m2198feyxiexzfUjhhgtg(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ */
    public boolean mo166feyxiexzfUjhhgtg() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final boolean m2222feyxiexzfUjhhgtg(View view, int i, int i2, C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg) {
        return (this.f3267Ujhhgtgfeyxiexzf && m2198feyxiexzfUjhhgtg(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).width) && m2198feyxiexzfUjhhgtg(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ */
    public void mo167feyxiexzfUjhhgtg(RecyclerView recyclerView, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m2223Ujhhgtgfeyxiexzf(C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf) {
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf2 = this.f3264Ujhhgtgfeyxiexzf;
        if (c0069Ujhhgtgfeyxiexzf2 != null && c0069Ujhhgtgfeyxiexzf != c0069Ujhhgtgfeyxiexzf2 && c0069Ujhhgtgfeyxiexzf2.f1092Ujhhgtgfeyxiexzf) {
            c0069Ujhhgtgfeyxiexzf2.m1085Ujhhgtgfeyxiexzf();
        }
        this.f3264Ujhhgtgfeyxiexzf = c0069Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        RunnableC0818feyxiexzfUjhhgtg runnableC0818feyxiexzfUjhhgtg = recyclerView.f409feyxiexzfUjhhgtg;
        runnableC0818feyxiexzfUjhhgtg.f3237Ujhhgtgfeyxiexzf.removeCallbacks(runnableC0818feyxiexzfUjhhgtg);
        runnableC0818feyxiexzfUjhhgtg.f3233Ujhhgtgfeyxiexzf.abortAnimation();
        if (c0069Ujhhgtgfeyxiexzf.f1095Ujhhgtgfeyxiexzf) {
            Log.w("RecyclerView", "An instance of " + c0069Ujhhgtgfeyxiexzf.getClass().getSimpleName() + " was started more than once. Each instance of" + c0069Ujhhgtgfeyxiexzf.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0069Ujhhgtgfeyxiexzf.f1089Ujhhgtgfeyxiexzf = recyclerView;
        c0069Ujhhgtgfeyxiexzf.f1090Ujhhgtgfeyxiexzf = this;
        int i = c0069Ujhhgtgfeyxiexzf.f1088Ujhhgtgfeyxiexzf;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f412feyxiexzfUjhhgtg.f3205Ujhhgtgfeyxiexzf = i;
        c0069Ujhhgtgfeyxiexzf.f1092Ujhhgtgfeyxiexzf = true;
        c0069Ujhhgtgfeyxiexzf.f1091Ujhhgtgfeyxiexzf = true;
        c0069Ujhhgtgfeyxiexzf.f1093Ujhhgtgfeyxiexzf = recyclerView.f370Ujhhgtgfeyxiexzf.mo158Ujhhgtgfeyxiexzf(i);
        c0069Ujhhgtgfeyxiexzf.f1089Ujhhgtgfeyxiexzf.f409feyxiexzfUjhhgtg.m2162Ujhhgtgfeyxiexzf();
        c0069Ujhhgtgfeyxiexzf.f1095Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ */
    public boolean mo142Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ */
    public void mo132feyxiexzfUjhhgtg() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ */
    public void mo265feyxiexzfUjhhgtg(AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ */
    public void mo758feyxiexzfUjhhgtg(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ */
    public void mo137Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ */
    public void mo163Ujhhgtgfeyxiexzf(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ */
    public void mo266feyxiexzfUjhhgtg(int i) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public void mo155Ujhhgtgfeyxiexzf(int i, C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ */
    public void mo131feyxiexzfUjhhgtg(int i, int i2) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ */
    public void mo133feyxiexzfUjhhgtg(int i, int i2) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ */
    public void mo134feyxiexzfUjhhgtg(int i, int i2) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ */
    public void mo135feyxiexzfUjhhgtg(int i, int i2) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public void mo154Ujhhgtgfeyxiexzf(int i, int i2, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf) {
    }
}
