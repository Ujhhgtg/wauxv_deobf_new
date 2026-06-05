package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.r;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.AbstractC0445Ujhhgtgfeyxiexzf;
import p000.AbstractC0615Ujhhgtgfeyxiexzf;
import p000.AbstractC1264feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3381feyxiexzfUjhhgtg;
import p000.C0196Ujhhgtgfeyxiexzf;
import p000.C0430Ujhhgtgfeyxiexzf;
import p000.C0431Ujhhgtgfeyxiexzf;
import p000.C0447Ujhhgtgfeyxiexzf;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C1080feyxiexzfUjhhgtg;
import p000.C3158feyxiexzfUjhhgtg;
import p000.InterfaceC0432Ujhhgtgfeyxiexzf;
import p000.InterfaceC0448Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0432Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static final float f256feyxiexzfUjhhgtg = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static final C0196Ujhhgtgfeyxiexzf f257feyxiexzfUjhhgtg = new C0196Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final int[] f258feyxiexzfUjhhgtg = {R.attr.fillViewport};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f259Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public long f260Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Rect f261Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final OverScroller f262Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final EdgeEffect f263Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final EdgeEffect f264Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C1080feyxiexzfUjhhgtg f265Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f266Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f267Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f268Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public View f269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean f270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public VelocityTracker f271Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f272Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f273Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f274Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final int f275Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final int f276Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f277Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int[] f278Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int[] f279Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f280Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f281feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public C0447Ujhhgtgfeyxiexzf f282feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0431Ujhhgtgfeyxiexzf f283feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0430Ujhhgtgfeyxiexzf f284feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f285feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C3158feyxiexzfUjhhgtg f286feyxiexzfUjhhgtg;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.nestedScrollViewStyle);
        this.f261Ujhhgtgfeyxiexzf = new Rect();
        this.f267Ujhhgtgfeyxiexzf = true;
        this.f268Ujhhgtgfeyxiexzf = false;
        this.f269Ujhhgtgfeyxiexzf = null;
        this.f270Ujhhgtgfeyxiexzf = false;
        this.f273Ujhhgtgfeyxiexzf = true;
        this.f277Ujhhgtgfeyxiexzf = -1;
        this.f278Ujhhgtgfeyxiexzf = new int[2];
        this.f279Ujhhgtgfeyxiexzf = new int[2];
        this.f286feyxiexzfUjhhgtg = new C3158feyxiexzfUjhhgtg(getContext(), new C0709Ujhhgtgfeyxiexzf((Object) this));
        int i = Build.VERSION.SDK_INT;
        this.f263Ujhhgtgfeyxiexzf = i >= 31 ? AbstractC3381feyxiexzfUjhhgtg.m4882Ujhhgtgfeyxiexzf(context, attributeSet) : new EdgeEffect(context);
        this.f264Ujhhgtgfeyxiexzf = i >= 31 ? AbstractC3381feyxiexzfUjhhgtg.m4882Ujhhgtgfeyxiexzf(context, attributeSet) : new EdgeEffect(context);
        this.f259Ujhhgtgfeyxiexzf = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f262Ujhhgtgfeyxiexzf = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f274Ujhhgtgfeyxiexzf = viewConfiguration.getScaledTouchSlop();
        this.f275Ujhhgtgfeyxiexzf = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f276Ujhhgtgfeyxiexzf = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f258feyxiexzfUjhhgtg, me.hd.wauxv.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f283feyxiexzfUjhhgtg = new C0431Ujhhgtgfeyxiexzf();
        this.f284feyxiexzfUjhhgtg = new C0430Ujhhgtgfeyxiexzf(this);
        setNestedScrollingEnabled(true);
        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(this, f257feyxiexzfUjhhgtg);
    }

    private C1080feyxiexzfUjhhgtg getScrollFeedbackProvider() {
        if (this.f265Ujhhgtgfeyxiexzf == null) {
            this.f265Ujhhgtgfeyxiexzf = new C1080feyxiexzfUjhhgtg(this);
        }
        return this.f265Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static boolean m76Ujhhgtgfeyxiexzf(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m76Ujhhgtgfeyxiexzf((View) parent, nestedScrollView);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.f262Ujhhgtgfeyxiexzf.isFinished()) {
            return;
        }
        this.f262Ujhhgtgfeyxiexzf.computeScrollOffset();
        int currY = this.f262Ujhhgtgfeyxiexzf.getCurrY();
        int i2 = currY - this.f281feyxiexzfUjhhgtg;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f263Ujhhgtgfeyxiexzf;
        EdgeEffect edgeEffect2 = this.f264Ujhhgtgfeyxiexzf;
        if (i2 <= 0 || AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) == 0.0f) {
            if (i2 < 0 && AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.f281feyxiexzfUjhhgtg = currY;
            iArr = this.f279Ujhhgtgfeyxiexzf;
            iArr[1] = 0;
            this.f284feyxiexzfUjhhgtg.m1750Ujhhgtgfeyxiexzf(iArr, 0, i3, 1, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC0445Ujhhgtgfeyxiexzf.m1774Ujhhgtgfeyxiexzf(this, Math.abs(this.f262Ujhhgtgfeyxiexzf.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                m84Ujhhgtgfeyxiexzf(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.f284feyxiexzfUjhhgtg.m1751Ujhhgtgfeyxiexzf(0, scrollY2, 0, i4, this.f278Ujhhgtgfeyxiexzf, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f262Ujhhgtgfeyxiexzf.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f262Ujhhgtgfeyxiexzf.getCurrVelocity());
                    }
                }
                this.f262Ujhhgtgfeyxiexzf.abortAnimation();
                m91Ujhhgtgfeyxiexzf(1);
            }
            if (this.f262Ujhhgtgfeyxiexzf.isFinished()) {
                m91Ujhhgtgfeyxiexzf(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        int i5 = i2;
        this.f281feyxiexzfUjhhgtg = currY;
        iArr = this.f279Ujhhgtgfeyxiexzf;
        iArr[1] = 0;
        this.f284feyxiexzfUjhhgtg.m1750Ujhhgtgfeyxiexzf(iArr, 0, i5, 1, null);
        i = i5 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC0445Ujhhgtgfeyxiexzf.m1774Ujhhgtgfeyxiexzf(this, Math.abs(this.f262Ujhhgtgfeyxiexzf.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            m84Ujhhgtgfeyxiexzf(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i6 = i - scrollY4;
            iArr[1] = 0;
            this.f284feyxiexzfUjhhgtg.m1751Ujhhgtgfeyxiexzf(0, scrollY4, 0, i6, this.f278Ujhhgtgfeyxiexzf, 1, iArr);
            i = i6 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f262Ujhhgtgfeyxiexzf.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f262Ujhhgtgfeyxiexzf.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f262Ujhhgtgfeyxiexzf.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f262Ujhhgtgfeyxiexzf.getCurrVelocity());
            }
            this.f262Ujhhgtgfeyxiexzf.abortAnimation();
            m91Ujhhgtgfeyxiexzf(1);
        }
        if (this.f262Ujhhgtgfeyxiexzf.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            m91Ujhhgtgfeyxiexzf(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM80Ujhhgtgfeyxiexzf;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f261Ujhhgtgfeyxiexzf.setEmpty();
            int childCount = getChildCount();
            int i = Opcodes.IXOR;
            if (childCount > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() != 0) {
                        zM80Ujhhgtgfeyxiexzf = false;
                    } else {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            zM80Ujhhgtgfeyxiexzf = keyEvent.isAltPressed() ? m80Ujhhgtgfeyxiexzf(33) : m77Ujhhgtgfeyxiexzf(33);
                        } else if (keyCode != 20) {
                            if (keyCode == 62) {
                                if (keyEvent.isShiftPressed()) {
                                    i = 33;
                                }
                                m85Ujhhgtgfeyxiexzf(i);
                            } else if (keyCode == 92) {
                                zM80Ujhhgtgfeyxiexzf = m80Ujhhgtgfeyxiexzf(33);
                            } else if (keyCode == 93) {
                                zM80Ujhhgtgfeyxiexzf = m80Ujhhgtgfeyxiexzf(Opcodes.IXOR);
                            } else if (keyCode == 122) {
                                m85Ujhhgtgfeyxiexzf(33);
                            } else if (keyCode == 123) {
                                m85Ujhhgtgfeyxiexzf(Opcodes.IXOR);
                            }
                            zM80Ujhhgtgfeyxiexzf = false;
                        } else {
                            zM80Ujhhgtgfeyxiexzf = keyEvent.isAltPressed() ? m80Ujhhgtgfeyxiexzf(Opcodes.IXOR) : m77Ujhhgtgfeyxiexzf(Opcodes.IXOR);
                        }
                    }
                } else if (isFocused() || keyEvent.getKeyCode() == 4) {
                    zM80Ujhhgtgfeyxiexzf = false;
                } else {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, Opcodes.IXOR);
                    if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(Opcodes.IXOR)) {
                        zM80Ujhhgtgfeyxiexzf = false;
                    } else {
                        zM80Ujhhgtgfeyxiexzf = true;
                    }
                }
            } else if (isFocused()) {
                zM80Ujhhgtgfeyxiexzf = false;
            } else {
                zM80Ujhhgtgfeyxiexzf = false;
            }
            if (!zM80Ujhhgtgfeyxiexzf) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f284feyxiexzfUjhhgtg.m1748Ujhhgtgfeyxiexzf(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f284feyxiexzfUjhhgtg.m1749Ujhhgtgfeyxiexzf(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f284feyxiexzfUjhhgtg.m1750Ujhhgtgfeyxiexzf(iArr, i, i2, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f284feyxiexzfUjhhgtg.m1751Ujhhgtgfeyxiexzf(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f263Ujhhgtgfeyxiexzf;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f264Ujhhgtgfeyxiexzf;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = this.f283feyxiexzfUjhhgtg;
        return c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf | c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f285feyxiexzfUjhhgtg == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f285feyxiexzfUjhhgtg = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f285feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f284feyxiexzfUjhhgtg.m1753Ujhhgtgfeyxiexzf(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f284feyxiexzfUjhhgtg.f2287Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f268Ujhhgtgfeyxiexzf = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f270Ujhhgtgfeyxiexzf) {
            if (AbstractC1264feyxiexzfUjhhgtg.m2798Ujhhgtgfeyxiexzf(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i = 9;
                width = (int) motionEvent.getX();
            } else if (AbstractC1264feyxiexzfUjhhgtg.m2798Ujhhgtgfeyxiexzf(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m87Ujhhgtgfeyxiexzf(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, AbstractC1264feyxiexzfUjhhgtg.m2798Ujhhgtgfeyxiexzf(motionEvent, r.a.s));
                if (i == 0) {
                    return true;
                }
                this.f286feyxiexzfUjhhgtg.m4669Ujhhgtgfeyxiexzf(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f270Ujhhgtgfeyxiexzf) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m90Ujhhgtgfeyxiexzf(motionEvent) && this.f262Ujhhgtgfeyxiexzf.isFinished()) {
                        z = false;
                    }
                    this.f270Ujhhgtgfeyxiexzf = z;
                    velocityTracker = this.f271Ujhhgtgfeyxiexzf;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f271Ujhhgtgfeyxiexzf = null;
                    }
                } else {
                    this.f266Ujhhgtgfeyxiexzf = y;
                    this.f277Ujhhgtgfeyxiexzf = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f271Ujhhgtgfeyxiexzf;
                    if (velocityTracker3 == null) {
                        this.f271Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f271Ujhhgtgfeyxiexzf.addMovement(motionEvent);
                    this.f262Ujhhgtgfeyxiexzf.computeScrollOffset();
                    if (!m90Ujhhgtgfeyxiexzf(motionEvent) && this.f262Ujhhgtgfeyxiexzf.isFinished()) {
                        z = false;
                    }
                    this.f270Ujhhgtgfeyxiexzf = z;
                    this.f284feyxiexzfUjhhgtg.m1754Ujhhgtgfeyxiexzf(2, 0);
                }
            } else {
                if (!m90Ujhhgtgfeyxiexzf(motionEvent)) {
                    z = false;
                }
                this.f270Ujhhgtgfeyxiexzf = z;
                velocityTracker = this.f271Ujhhgtgfeyxiexzf;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f271Ujhhgtgfeyxiexzf = null;
                }
            }
        } else if (i == 1) {
            this.f270Ujhhgtgfeyxiexzf = false;
            this.f277Ujhhgtgfeyxiexzf = -1;
            velocityTracker2 = this.f271Ujhhgtgfeyxiexzf;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f271Ujhhgtgfeyxiexzf = null;
            }
            if (this.f262Ujhhgtgfeyxiexzf.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m91Ujhhgtgfeyxiexzf(0);
        } else if (i == 2) {
            int i2 = this.f277Ujhhgtgfeyxiexzf;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f266Ujhhgtgfeyxiexzf) > this.f274Ujhhgtgfeyxiexzf && (2 & getNestedScrollAxes()) == 0) {
                        this.f270Ujhhgtgfeyxiexzf = true;
                        this.f266Ujhhgtgfeyxiexzf = y2;
                        if (this.f271Ujhhgtgfeyxiexzf == null) {
                            this.f271Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
                        }
                        this.f271Ujhhgtgfeyxiexzf.addMovement(motionEvent);
                        this.f280Ujhhgtgfeyxiexzf = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f270Ujhhgtgfeyxiexzf = false;
            this.f277Ujhhgtgfeyxiexzf = -1;
            velocityTracker2 = this.f271Ujhhgtgfeyxiexzf;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f271Ujhhgtgfeyxiexzf = null;
            }
            if (this.f262Ujhhgtgfeyxiexzf.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m91Ujhhgtgfeyxiexzf(0);
        } else if (i == 6) {
            m83Ujhhgtgfeyxiexzf(motionEvent);
        }
        return this.f270Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f267Ujhhgtgfeyxiexzf = false;
        View view = this.f269Ujhhgtgfeyxiexzf;
        if (view != null && m76Ujhhgtgfeyxiexzf(view, this)) {
            View view2 = this.f269Ujhhgtgfeyxiexzf;
            Rect rect = this.f261Ujhhgtgfeyxiexzf;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM78Ujhhgtgfeyxiexzf = m78Ujhhgtgfeyxiexzf(rect);
            if (iM78Ujhhgtgfeyxiexzf != 0) {
                scrollBy(0, iM78Ujhhgtgfeyxiexzf);
            }
        }
        this.f269Ujhhgtgfeyxiexzf = null;
        if (!this.f268Ujhhgtgfeyxiexzf) {
            if (this.f282feyxiexzfUjhhgtg != null) {
                scrollTo(getScrollX(), this.f282feyxiexzfUjhhgtg.f2347Ujhhgtgfeyxiexzf);
                this.f282feyxiexzfUjhhgtg = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f268Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f272Ujhhgtgfeyxiexzf && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m79Ujhhgtgfeyxiexzf((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f284feyxiexzfUjhhgtg.m1749Ujhhgtgfeyxiexzf(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f284feyxiexzfUjhhgtg.m1750Ujhhgtgfeyxiexzf(iArr, i, i2, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m82Ujhhgtgfeyxiexzf(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo14Ujhhgtgfeyxiexzf(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = Opcodes.IXOR;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m81Ujhhgtgfeyxiexzf(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0447Ujhhgtgfeyxiexzf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0447Ujhhgtgfeyxiexzf c0447Ujhhgtgfeyxiexzf = (C0447Ujhhgtgfeyxiexzf) parcelable;
        super.onRestoreInstanceState(c0447Ujhhgtgfeyxiexzf.getSuperState());
        this.f282feyxiexzfUjhhgtg = c0447Ujhhgtgfeyxiexzf;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0447Ujhhgtgfeyxiexzf c0447Ujhhgtgfeyxiexzf = new C0447Ujhhgtgfeyxiexzf(super.onSaveInstanceState());
        c0447Ujhhgtgfeyxiexzf.f2347Ujhhgtgfeyxiexzf = getScrollY();
        return c0447Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m81Ujhhgtgfeyxiexzf(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f261Ujhhgtgfeyxiexzf;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM78Ujhhgtgfeyxiexzf = m78Ujhhgtgfeyxiexzf(rect);
        if (iM78Ujhhgtgfeyxiexzf != 0) {
            if (this.f273Ujhhgtgfeyxiexzf) {
                m89Ujhhgtgfeyxiexzf(0, iM78Ujhhgtgfeyxiexzf, false);
            } else {
                scrollBy(0, iM78Ujhhgtgfeyxiexzf);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo13Ujhhgtgfeyxiexzf(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo15Ujhhgtgfeyxiexzf(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM1888Ujhhgtgfeyxiexzf;
        int iRound;
        int i;
        ViewParent parent2;
        if (this.f271Ujhhgtgfeyxiexzf == null) {
            this.f271Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f280Ujhhgtgfeyxiexzf = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f280Ujhhgtgfeyxiexzf);
        C0430Ujhhgtgfeyxiexzf c0430Ujhhgtgfeyxiexzf = this.f284feyxiexzfUjhhgtg;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f263Ujhhgtgfeyxiexzf;
            EdgeEffect edgeEffect2 = this.f264Ujhhgtgfeyxiexzf;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f271Ujhhgtgfeyxiexzf;
                velocityTracker.computeCurrentVelocity(1000, this.f276Ujhhgtgfeyxiexzf);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f277Ujhhgtgfeyxiexzf);
                if (Math.abs(yVelocity) >= this.f275Ujhhgtgfeyxiexzf) {
                    if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) != 0.0f) {
                        if (m88Ujhhgtgfeyxiexzf(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m79Ujhhgtgfeyxiexzf(-yVelocity);
                        }
                    } else if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m88Ujhhgtgfeyxiexzf(edgeEffect2, i2)) {
                            edgeEffect2.onAbsorb(i2);
                        } else {
                            m79Ujhhgtgfeyxiexzf(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!c0430Ujhhgtgfeyxiexzf.m1749Ujhhgtgfeyxiexzf(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m79Ujhhgtgfeyxiexzf(i3);
                        }
                    }
                } else if (this.f262Ujhhgtgfeyxiexzf.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f277Ujhhgtgfeyxiexzf = -1;
                this.f270Ujhhgtgfeyxiexzf = false;
                VelocityTracker velocityTracker2 = this.f271Ujhhgtgfeyxiexzf;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f271Ujhhgtgfeyxiexzf = null;
                }
                m91Ujhhgtgfeyxiexzf(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f277Ujhhgtgfeyxiexzf);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f277Ujhhgtgfeyxiexzf + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f266Ujhhgtgfeyxiexzf - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) != 0.0f) {
                        fM1888Ujhhgtgfeyxiexzf = -AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect, -height, x);
                        if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) != 0.0f) {
                        fM1888Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect2, height, 1.0f - x);
                        if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i4 - iRound;
                        if (!this.f270Ujhhgtgfeyxiexzf && Math.abs(i) > this.f274Ujhhgtgfeyxiexzf) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f270Ujhhgtgfeyxiexzf = true;
                            if (i > 0) {
                                i -= this.f274Ujhhgtgfeyxiexzf;
                            } else {
                                i += this.f274Ujhhgtgfeyxiexzf;
                            }
                        }
                        if (this.f270Ujhhgtgfeyxiexzf) {
                            int iM87Ujhhgtgfeyxiexzf = m87Ujhhgtgfeyxiexzf(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f266Ujhhgtgfeyxiexzf = y - iM87Ujhhgtgfeyxiexzf;
                            this.f280Ujhhgtgfeyxiexzf += iM87Ujhhgtgfeyxiexzf;
                        }
                    }
                    f = fM1888Ujhhgtgfeyxiexzf;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i4 - iRound;
                    if (!this.f270Ujhhgtgfeyxiexzf) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f270Ujhhgtgfeyxiexzf = true;
                        if (i > 0) {
                            i -= this.f274Ujhhgtgfeyxiexzf;
                        } else {
                            i += this.f274Ujhhgtgfeyxiexzf;
                        }
                    }
                    if (this.f270Ujhhgtgfeyxiexzf) {
                        int iM87Ujhhgtgfeyxiexzf2 = m87Ujhhgtgfeyxiexzf(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f266Ujhhgtgfeyxiexzf = y - iM87Ujhhgtgfeyxiexzf2;
                        this.f280Ujhhgtgfeyxiexzf += iM87Ujhhgtgfeyxiexzf2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f270Ujhhgtgfeyxiexzf && getChildCount() > 0) {
                    if (this.f262Ujhhgtgfeyxiexzf.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f277Ujhhgtgfeyxiexzf = -1;
                this.f270Ujhhgtgfeyxiexzf = false;
                VelocityTracker velocityTracker3 = this.f271Ujhhgtgfeyxiexzf;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f271Ujhhgtgfeyxiexzf = null;
                }
                m91Ujhhgtgfeyxiexzf(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f266Ujhhgtgfeyxiexzf = (int) motionEvent.getY(actionIndex);
                this.f277Ujhhgtgfeyxiexzf = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m83Ujhhgtgfeyxiexzf(motionEvent);
                this.f266Ujhhgtgfeyxiexzf = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f277Ujhhgtgfeyxiexzf));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f270Ujhhgtgfeyxiexzf && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f262Ujhhgtgfeyxiexzf.isFinished()) {
                this.f262Ujhhgtgfeyxiexzf.abortAnimation();
                m91Ujhhgtgfeyxiexzf(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f266Ujhhgtgfeyxiexzf = y2;
            this.f277Ujhhgtgfeyxiexzf = pointerId;
            c0430Ujhhgtgfeyxiexzf.m1754Ujhhgtgfeyxiexzf(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f271Ujhhgtgfeyxiexzf;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f267Ujhhgtgfeyxiexzf) {
            this.f269Ujhhgtgfeyxiexzf = view2;
        } else {
            Rect rect = this.f261Ujhhgtgfeyxiexzf;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM78Ujhhgtgfeyxiexzf = m78Ujhhgtgfeyxiexzf(rect);
            if (iM78Ujhhgtgfeyxiexzf != 0) {
                scrollBy(0, iM78Ujhhgtgfeyxiexzf);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM78Ujhhgtgfeyxiexzf = m78Ujhhgtgfeyxiexzf(rect);
        boolean z2 = iM78Ujhhgtgfeyxiexzf != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM78Ujhhgtgfeyxiexzf);
                return z2;
            }
            m89Ujhhgtgfeyxiexzf(0, iM78Ujhhgtgfeyxiexzf, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f271Ujhhgtgfeyxiexzf) != null) {
            velocityTracker.recycle();
            this.f271Ujhhgtgfeyxiexzf = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f267Ujhhgtgfeyxiexzf = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f272Ujhhgtgfeyxiexzf) {
            this.f272Ujhhgtgfeyxiexzf = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0430Ujhhgtgfeyxiexzf c0430Ujhhgtgfeyxiexzf = this.f284feyxiexzfUjhhgtg;
        if (c0430Ujhhgtgfeyxiexzf.f2287Ujhhgtgfeyxiexzf) {
            ViewGroup viewGroup = c0430Ujhhgtgfeyxiexzf.f2286Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            viewGroup.stopNestedScroll();
        }
        c0430Ujhhgtgfeyxiexzf.f2287Ujhhgtgfeyxiexzf = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f273Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f284feyxiexzfUjhhgtg.m1754Ujhhgtgfeyxiexzf(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m91Ujhhgtgfeyxiexzf(0);
    }

    @Override // p000.InterfaceC0432Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo11Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m82Ujhhgtgfeyxiexzf(i4, i5, iArr);
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo12Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4, int i5) {
        m82Ujhhgtgfeyxiexzf(i4, i5, null);
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo13Ujhhgtgfeyxiexzf(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo14Ujhhgtgfeyxiexzf(View view, View view2, int i, int i2) {
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = this.f283feyxiexzfUjhhgtg;
        if (i2 == 1) {
            c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf = i;
        } else {
            c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf = i;
        }
        this.f284feyxiexzfUjhhgtg.m1754Ujhhgtgfeyxiexzf(2, i2);
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo15Ujhhgtgfeyxiexzf(View view, int i) {
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = this.f283feyxiexzfUjhhgtg;
        if (i == 1) {
            c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf = 0;
        } else {
            c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf = 0;
        }
        m91Ujhhgtgfeyxiexzf(i);
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo16Ujhhgtgfeyxiexzf(View view, int i, int i2, int[] iArr, int i3) {
        this.f284feyxiexzfUjhhgtg.m1750Ujhhgtgfeyxiexzf(iArr, i, i2, i3, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean m77Ujhhgtgfeyxiexzf(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m81Ujhhgtgfeyxiexzf(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m87Ujhhgtgfeyxiexzf(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f261Ujhhgtgfeyxiexzf;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m87Ujhhgtgfeyxiexzf(m78Ujhhgtgfeyxiexzf(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m81Ujhhgtgfeyxiexzf(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m78Ujhhgtgfeyxiexzf(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m79Ujhhgtgfeyxiexzf(int i) {
        if (getChildCount() > 0) {
            this.f262Ujhhgtgfeyxiexzf.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f284feyxiexzfUjhhgtg.m1754Ujhhgtgfeyxiexzf(2, 1);
            this.f281feyxiexzfUjhhgtg = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC0445Ujhhgtgfeyxiexzf.m1774Ujhhgtgfeyxiexzf(this, Math.abs(this.f262Ujhhgtgfeyxiexzf.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m80Ujhhgtgfeyxiexzf(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f261Ujhhgtgfeyxiexzf;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m86Ujhhgtgfeyxiexzf(i, rect.top, rect.bottom);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m81Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        Rect rect = this.f261Ujhhgtgfeyxiexzf;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m82Ujhhgtgfeyxiexzf(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f284feyxiexzfUjhhgtg.m1751Ujhhgtgfeyxiexzf(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m83Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f277Ujhhgtgfeyxiexzf) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f266Ujhhgtgfeyxiexzf = (int) motionEvent.getY(i);
            this.f277Ujhhgtgfeyxiexzf = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f271Ujhhgtgfeyxiexzf;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m84Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.f284feyxiexzfUjhhgtg.m1753Ujhhgtgfeyxiexzf(1)) {
                this.f262Ujhhgtgfeyxiexzf.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.f262Ujhhgtgfeyxiexzf.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m85Ujhhgtgfeyxiexzf(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f261Ujhhgtgfeyxiexzf;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m86Ujhhgtgfeyxiexzf(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m86Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            m87Ujhhgtgfeyxiexzf(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m87Ujhhgtgfeyxiexzf(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        C0430Ujhhgtgfeyxiexzf c0430Ujhhgtgfeyxiexzf = this.f284feyxiexzfUjhhgtg;
        if (i4 == 1) {
            c0430Ujhhgtgfeyxiexzf.m1754Ujhhgtgfeyxiexzf(2, i4);
        }
        boolean zM1750Ujhhgtgfeyxiexzf = this.f284feyxiexzfUjhhgtg.m1750Ujhhgtgfeyxiexzf(this.f279Ujhhgtgfeyxiexzf, 0, i, i4, this.f278Ujhhgtgfeyxiexzf);
        int[] iArr = this.f278Ujhhgtgfeyxiexzf;
        int[] iArr2 = this.f279Ujhhgtgfeyxiexzf;
        if (zM1750Ujhhgtgfeyxiexzf) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = m84Ujhhgtgfeyxiexzf(i5, 0, scrollY, scrollRange) && !c0430Ujhhgtgfeyxiexzf.m1753Ujhhgtgfeyxiexzf(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f4157Ujhhgtgfeyxiexzf.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.f284feyxiexzfUjhhgtg.m1751Ujhhgtgfeyxiexzf(0, scrollY2, 0, i5 - scrollY2, this.f278Ujhhgtgfeyxiexzf, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f264Ujhhgtgfeyxiexzf;
        EdgeEffect edgeEffect2 = this.f263Ujhhgtgfeyxiexzf;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().f4157Ujhhgtgfeyxiexzf.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.f271Ujhhgtgfeyxiexzf) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                m91Ujhhgtgfeyxiexzf(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f4157Ujhhgtgfeyxiexzf.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        } else {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m91Ujhhgtgfeyxiexzf(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final boolean m88Ujhhgtgfeyxiexzf(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM1880Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f259Ujhhgtgfeyxiexzf * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f256feyxiexzfUjhhgtg;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM1880Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m89Ujhhgtgfeyxiexzf(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f260Ujhhgtgfeyxiexzf > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f262Ujhhgtgfeyxiexzf.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                this.f284feyxiexzfUjhhgtg.m1754Ujhhgtgfeyxiexzf(2, 1);
            } else {
                m91Ujhhgtgfeyxiexzf(1);
            }
            this.f281feyxiexzfUjhhgtg = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f262Ujhhgtgfeyxiexzf.isFinished()) {
                this.f262Ujhhgtgfeyxiexzf.abortAnimation();
                m91Ujhhgtgfeyxiexzf(1);
            }
            scrollBy(i, i2);
        }
        this.f260Ujhhgtgfeyxiexzf = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean m90Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f263Ujhhgtgfeyxiexzf;
        if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect) != 0.0f) {
            AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f264Ujhhgtgfeyxiexzf;
        if (AbstractC0615Ujhhgtgfeyxiexzf.m1880Ujhhgtgfeyxiexzf(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC0615Ujhhgtgfeyxiexzf.m1888Ujhhgtgfeyxiexzf(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m91Ujhhgtgfeyxiexzf(int i) {
        this.f284feyxiexzfUjhhgtg.m1755Ujhhgtgfeyxiexzf(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC0448Ujhhgtgfeyxiexzf interfaceC0448Ujhhgtgfeyxiexzf) {
    }
}
