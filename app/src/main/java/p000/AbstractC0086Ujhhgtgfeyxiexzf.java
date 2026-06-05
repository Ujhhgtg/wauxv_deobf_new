package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ要点脸ᛲ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0086Ujhhgtgfeyxiexzf extends ViewGroup {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f1165Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f1166Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1167Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f1168Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f1169Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f1170Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f1171Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f1172Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int[] f1173Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int[] f1174Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public Drawable f1175Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f1176Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f1177Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f1178Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f1179Ujhhgtgfeyxiexzf;

    public AbstractC0086Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f1165Ujhhgtgfeyxiexzf = true;
        this.f1166Ujhhgtgfeyxiexzf = -1;
        this.f1167Ujhhgtgfeyxiexzf = 0;
        this.f1169Ujhhgtgfeyxiexzf = 8388659;
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3168Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context, attributeSet, iArr, 0);
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(this, context, iArr, attributeSet, (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, 0);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1171Ujhhgtgfeyxiexzf = typedArray.getFloat(4, -1.0f);
        this.f1166Ujhhgtgfeyxiexzf = typedArray.getInt(3, -1);
        this.f1172Ujhhgtgfeyxiexzf = typedArray.getBoolean(7, false);
        setDividerDrawable(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(5));
        this.f1178Ujhhgtgfeyxiexzf = typedArray.getInt(8, 0);
        this.f1179Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelSize(6, 0);
        c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0090Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1166Ujhhgtgfeyxiexzf < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1166Ujhhgtgfeyxiexzf;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1166Ujhhgtgfeyxiexzf == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1167Ujhhgtgfeyxiexzf;
        if (this.f1168Ujhhgtgfeyxiexzf == 1 && (i = this.f1169Ujhhgtgfeyxiexzf & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1170Ujhhgtgfeyxiexzf) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1170Ujhhgtgfeyxiexzf;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0090Ujhhgtgfeyxiexzf) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1166Ujhhgtgfeyxiexzf;
    }

    public Drawable getDividerDrawable() {
        return this.f1175Ujhhgtgfeyxiexzf;
    }

    public int getDividerPadding() {
        return this.f1179Ujhhgtgfeyxiexzf;
    }

    public int getDividerWidth() {
        return this.f1176Ujhhgtgfeyxiexzf;
    }

    public int getGravity() {
        return this.f1169Ujhhgtgfeyxiexzf;
    }

    public int getOrientation() {
        return this.f1168Ujhhgtgfeyxiexzf;
    }

    public int getShowDividers() {
        return this.f1178Ujhhgtgfeyxiexzf;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1171Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.f1175Ujhhgtgfeyxiexzf == null) {
            return;
        }
        int i2 = 0;
        if (this.f1168Ujhhgtgfeyxiexzf == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m1138Ujhhgtgfeyxiexzf(i2)) {
                    m1136Ujhhgtgfeyxiexzf(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0090Ujhhgtgfeyxiexzf) childAt.getLayoutParams())).topMargin) - this.f1177Ujhhgtgfeyxiexzf);
                }
                i2++;
            }
            if (m1138Ujhhgtgfeyxiexzf(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f1177Ujhhgtgfeyxiexzf;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0090Ujhhgtgfeyxiexzf) childAt2.getLayoutParams())).bottomMargin;
                }
                m1136Ujhhgtgfeyxiexzf(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m1138Ujhhgtgfeyxiexzf(i2)) {
                C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf = (C0090Ujhhgtgfeyxiexzf) childAt3.getLayoutParams();
                m1137Ujhhgtgfeyxiexzf(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).leftMargin) - this.f1176Ujhhgtgfeyxiexzf);
            }
            i2++;
        }
        if (m1138Ujhhgtgfeyxiexzf(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf2 = (C0090Ujhhgtgfeyxiexzf) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).leftMargin;
                    i = this.f1176Ujhhgtgfeyxiexzf;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f1176Ujhhgtgfeyxiexzf;
                right = left - i;
            }
            m1137Ujhhgtgfeyxiexzf(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        char c = 2;
        if (this.f1168Ujhhgtgfeyxiexzf == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i17 = i3 - i;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.f1169Ujhhgtgfeyxiexzf;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            if (i19 != 16) {
                paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f1170Ujhhgtgfeyxiexzf;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f1170Ujhhgtgfeyxiexzf) / 2);
            }
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf = (C0090Ujhhgtgfeyxiexzf) childAt.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i15 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).leftMargin + paddingLeft2;
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).rightMargin;
                        }
                        if (m1138Ujhhgtgfeyxiexzf(i21)) {
                            paddingTop += this.f1177Ujhhgtgfeyxiexzf;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).bottomMargin + i23;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).leftMargin;
                        i14 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (m1138Ujhhgtgfeyxiexzf(i21)) {
                        paddingTop += this.f1177Ujhhgtgfeyxiexzf;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).topMargin;
                    childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).bottomMargin + i24;
                }
                i21++;
                c = c;
                i16 = 8;
            }
            return;
        }
        boolean z2 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.f1169Ujhhgtgfeyxiexzf;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z3 = this.f1165Ujhhgtgfeyxiexzf;
        int[] iArr = this.f1173Ujhhgtgfeyxiexzf;
        int[] iArr2 = this.f1174Ujhhgtgfeyxiexzf;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f1170Ujhhgtgfeyxiexzf;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f1170Ujhhgtgfeyxiexzf) / 2);
        }
        if (z2) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf2 = (C0090Ujhhgtgfeyxiexzf) childAt2.getLayoutParams();
                    int i31 = paddingLeft;
                    if (z3) {
                        i8 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).gravity;
                        if (i9 < 0) {
                            i9 = i28;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (m1138Ujhhgtgfeyxiexzf(i30)) {
                                i12 = i31 + this.f1176Ujhhgtgfeyxiexzf;
                            } else {
                                i12 = i31;
                            }
                            int i32 = i12 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).leftMargin;
                            childAt2.layout(i32, i11, i32 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).rightMargin + i32;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (m1138Ujhhgtgfeyxiexzf(i30)) {
                            i12 = i31 + this.f1176Ujhhgtgfeyxiexzf;
                        } else {
                            i12 = i31;
                        }
                        int i33 = i12 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).leftMargin;
                        childAt2.layout(i33, i11, i33 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).rightMargin + i33;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).gravity;
                    if (i9 < 0) {
                        i9 = i28;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = i8 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).topMargin;
                            if (baseline != -1) {
                                i11 = (iArr[1] - baseline) + i11;
                            }
                        } else if (i10 != 80) {
                            i11 = i8;
                        } else {
                            i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m1138Ujhhgtgfeyxiexzf(i30)) {
                            i12 = i31 + this.f1176Ujhhgtgfeyxiexzf;
                        } else {
                            i12 = i31;
                        }
                        int i34 = i12 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).leftMargin;
                        childAt2.layout(i34, i11, i34 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).rightMargin + i34;
                    } else {
                        i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (m1138Ujhhgtgfeyxiexzf(i30)) {
                        i12 = i31 + this.f1176Ujhhgtgfeyxiexzf;
                    } else {
                        i12 = i31;
                    }
                    int i35 = i12 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).leftMargin;
                    childAt2.layout(i35, i11, i35 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).rightMargin + i35;
                }
                i29++;
                i6 = i7;
                paddingTop2 = i8;
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:233:0x0501  */
    /* JADX WARN: Code duplicated, block: B:235:0x0505  */
    /* JADX WARN: Code duplicated, block: B:237:0x0526  */
    /* JADX WARN: Code duplicated, block: B:243:0x0536  */
    /* JADX WARN: Code duplicated, block: B:246:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0540  */
    /* JADX WARN: Code duplicated, block: B:250:0x0547 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054a  */
    /* JADX WARN: Code duplicated, block: B:366:0x079c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int baseline;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf;
        View view;
        int i11;
        int[] iArr2;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int measuredHeight;
        boolean z4;
        boolean z5;
        int iMax2;
        int i15;
        int baseline2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        int i22;
        int i23;
        View view2;
        boolean z7;
        AbstractC0086Ujhhgtgfeyxiexzf abstractC0086Ujhhgtgfeyxiexzf = this;
        int i24 = -2;
        int iMax3 = 0;
        int i25 = 1073741824;
        int i26 = 8;
        if (abstractC0086Ujhhgtgfeyxiexzf.f1168Ujhhgtgfeyxiexzf == 1) {
            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = 0;
            int virtualChildCount = abstractC0086Ujhhgtgfeyxiexzf.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i27 = abstractC0086Ujhhgtgfeyxiexzf.f1166Ujhhgtgfeyxiexzf;
            boolean z8 = abstractC0086Ujhhgtgfeyxiexzf.f1172Ujhhgtgfeyxiexzf;
            int i28 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z9 = false;
            int i29 = 0;
            boolean z10 = false;
            boolean z11 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i28 < virtualChildCount) {
                int i30 = mode;
                View childAt = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i28);
                if (childAt == null) {
                    abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                } else {
                    if (childAt.getVisibility() != i26) {
                        if (abstractC0086Ujhhgtgfeyxiexzf.m1138Ujhhgtgfeyxiexzf(i28)) {
                            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf += abstractC0086Ujhhgtgfeyxiexzf.f1177Ujhhgtgfeyxiexzf;
                        }
                        C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf2 = (C0090Ujhhgtgfeyxiexzf) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).weight;
                        f += f2;
                        if (mode2 == i25 && ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).height == 0 && f2 > 0.0f) {
                            int i31 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i31, ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).topMargin + i31 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).bottomMargin);
                            view2 = childAt;
                            i20 = mode2;
                            i21 = i27;
                            z6 = z8;
                            i22 = i28;
                            z9 = true;
                            i23 = i30;
                        } else {
                            if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).height = i24;
                                i19 = 0;
                            }
                            i20 = mode2;
                            z6 = z8;
                            i21 = i27;
                            i22 = i28;
                            i23 = i30;
                            abstractC0086Ujhhgtgfeyxiexzf.measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf : 0);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).height = i19;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i32 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                            view2 = childAt;
                            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i32, i32 + measuredHeight2 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).topMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i21 >= 0 && i21 == i22 + 1) {
                            abstractC0086Ujhhgtgfeyxiexzf.f1167Ujhhgtgfeyxiexzf = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                        }
                        if (i22 < i21 && ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i23 == 1073741824 || ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i33 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i33;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i29, measuredState);
                        if (z11) {
                            i29 = iCombineMeasuredStates;
                            boolean z13 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).width == -1;
                            if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).weight > 0.0f) {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i33);
                            } else {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i33);
                            }
                            z11 = z13;
                        } else {
                            i29 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).weight > 0.0f) {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i33);
                        } else {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i33);
                        }
                        z11 = z13;
                    }
                    i28 = i22 + 1;
                    i27 = i21;
                    mode = i23;
                    z8 = z6;
                    mode2 = i20;
                    i24 = -2;
                    i25 = 1073741824;
                    i26 = 8;
                }
                i20 = mode2;
                i21 = i27;
                z6 = z8;
                i22 = i28;
                i23 = i30;
                i28 = i22 + 1;
                i27 = i21;
                mode = i23;
                z8 = z6;
                mode2 = i20;
                i24 = -2;
                i25 = 1073741824;
                i26 = 8;
            }
            int i34 = mode;
            int i35 = mode2;
            boolean z14 = z8;
            int i36 = i29;
            int i37 = i2;
            if (abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf > 0 && abstractC0086Ujhhgtgfeyxiexzf.m1138Ujhhgtgfeyxiexzf(virtualChildCount)) {
                abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf += abstractC0086Ujhhgtgfeyxiexzf.f1177Ujhhgtgfeyxiexzf;
            }
            if (z14 && (i35 == Integer.MIN_VALUE || i35 == 0)) {
                abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = 0;
                for (int i38 = 0; i38 < virtualChildCount; i38++) {
                    View childAt2 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i38);
                    if (childAt2 == null) {
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                    } else if (childAt2.getVisibility() != 8) {
                        C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf3 = (C0090Ujhhgtgfeyxiexzf) childAt2.getLayoutParams();
                        int i39 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i39, i39 + iMax6 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf3).topMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf3).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC0086Ujhhgtgfeyxiexzf.getPaddingBottom() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingTop() + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC0086Ujhhgtgfeyxiexzf.getSuggestedMinimumHeight()), i37, 0);
            int i40 = (iResolveSizeAndState & 16777215) - abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
            if (z9 || (i40 != 0 && f > 0.0f)) {
                float f3 = abstractC0086Ujhhgtgfeyxiexzf.f1171Ujhhgtgfeyxiexzf;
                if (f3 > 0.0f) {
                    f = f3;
                }
                abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = 0;
                int iCombineMeasuredStates2 = i36;
                int i41 = 0;
                while (i41 < virtualChildCount) {
                    View childAt3 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i41);
                    if (childAt3.getVisibility() == 8) {
                        i41 = i41;
                    } else {
                        C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf4 = (C0090Ujhhgtgfeyxiexzf) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).weight;
                        if (f4 > 0.0f) {
                            int i42 = (int) ((i40 * f4) / f);
                            f -= f4;
                            i40 -= i42;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC0086Ujhhgtgfeyxiexzf.getPaddingRight() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingLeft() + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).rightMargin, ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).width);
                            if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).height == 0) {
                                i18 = 1073741824;
                                if (i35 == 1073741824) {
                                    if (i42 <= 0) {
                                        i42 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i18 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i42;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i18));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i43 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i43;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i34 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).width == -1) {
                                measuredWidth2 = i43;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).width == i17;
                        int i44 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i44, childAt3.getMeasuredHeight() + i44 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).topMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf4).bottomMargin);
                        z11 = z15;
                    }
                    i41++;
                }
                abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = abstractC0086Ujhhgtgfeyxiexzf.getPaddingBottom() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingTop() + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                i36 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i35 != 1073741824) {
                    for (int i45 = 0; i45 < virtualChildCount; i45++) {
                        View childAt4 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i45);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0090Ujhhgtgfeyxiexzf) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i34 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC0086Ujhhgtgfeyxiexzf.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC0086Ujhhgtgfeyxiexzf.getPaddingRight() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingLeft() + iMax4, abstractC0086Ujhhgtgfeyxiexzf.getSuggestedMinimumWidth()), i, i36), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC0086Ujhhgtgfeyxiexzf.getMeasuredWidth(), 1073741824);
                int i46 = 0;
                while (i46 < virtualChildCount) {
                    View childAt5 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i46);
                    if (childAt5.getVisibility() != 8) {
                        C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf5 = (C0090Ujhhgtgfeyxiexzf) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf5).width == -1) {
                            int i47 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf5).height;
                            ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf5).height = childAt5.getMeasuredHeight();
                            abstractC0086Ujhhgtgfeyxiexzf.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i37, 0);
                            ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf5).height = i47;
                        }
                    }
                    i46++;
                    i37 = i2;
                }
                return;
            }
            return;
        }
        int i48 = i;
        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = 0;
        int virtualChildCount2 = abstractC0086Ujhhgtgfeyxiexzf.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i48);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (abstractC0086Ujhhgtgfeyxiexzf.f1173Ujhhgtgfeyxiexzf == null || abstractC0086Ujhhgtgfeyxiexzf.f1174Ujhhgtgfeyxiexzf == null) {
            abstractC0086Ujhhgtgfeyxiexzf.f1173Ujhhgtgfeyxiexzf = new int[4];
            abstractC0086Ujhhgtgfeyxiexzf.f1174Ujhhgtgfeyxiexzf = new int[4];
        }
        int[] iArr3 = abstractC0086Ujhhgtgfeyxiexzf.f1173Ujhhgtgfeyxiexzf;
        int[] iArr4 = abstractC0086Ujhhgtgfeyxiexzf.f1174Ujhhgtgfeyxiexzf;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = abstractC0086Ujhhgtgfeyxiexzf.f1165Ujhhgtgfeyxiexzf;
        boolean z17 = abstractC0086Ujhhgtgfeyxiexzf.f1172Ujhhgtgfeyxiexzf;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i49 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i49);
            if (childAt6 == null) {
                abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                i10 = i49;
                i15 = i51;
                iArr2 = iArr3;
                iArr = iArr4;
                z = z16;
                z2 = z17;
            } else {
                int i52 = i50;
                if (childAt6.getVisibility() == 8) {
                    i48 = i;
                    i10 = i49;
                    i15 = i51;
                    iArr = iArr4;
                    z = z16;
                    z2 = z17;
                    i50 = i52;
                    iArr2 = iArr3;
                } else {
                    if (abstractC0086Ujhhgtgfeyxiexzf.m1138Ujhhgtgfeyxiexzf(i49)) {
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf += abstractC0086Ujhhgtgfeyxiexzf.f1176Ujhhgtgfeyxiexzf;
                    }
                    C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf6 = (C0090Ujhhgtgfeyxiexzf) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).weight;
                    f5 += f6;
                    int i53 = i49;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).width == 0 && f6 > 0.0f) {
                        if (z18) {
                            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).rightMargin + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                        } else {
                            int i54 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i54, ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).leftMargin + i54 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            i11 = i52;
                            i10 = i53;
                            c0090Ujhhgtgfeyxiexzf = c0090Ujhhgtgfeyxiexzf6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        } else {
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            z21 = true;
                            i11 = i52;
                            i10 = i53;
                            i13 = 1073741824;
                            c0090Ujhhgtgfeyxiexzf = c0090Ujhhgtgfeyxiexzf6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        }
                        if (mode4 == i13 && ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).height == -1) {
                            z3 = true;
                            z20 = true;
                        } else {
                            z3 = false;
                        }
                        i14 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).topMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i14;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                            baseline2 = view.getBaseline();
                            z4 = z3;
                            if (baseline2 != -1) {
                                i16 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).gravity;
                                if (i16 < 0) {
                                    i16 = abstractC0086Ujhhgtgfeyxiexzf.f1169Ujhhgtgfeyxiexzf;
                                }
                                int i55 = (((i16 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i55] = Math.max(iArr2[i55], baseline2);
                                iArr[i55] = Math.max(iArr[i55], measuredHeight - baseline2);
                            }
                        } else {
                            z4 = z3;
                        }
                        int iMax9 = Math.max(i11, measuredHeight);
                        if (z19 || ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).weight > 0.0f) {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax7 = Math.max(i9, i14);
                            iMax2 = i12;
                        } else {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax2 = Math.max(i12, i14);
                            iMax7 = i9;
                        }
                        int i56 = iMax2;
                        i50 = iMax9;
                        i15 = i56;
                        z19 = z5;
                    } else {
                        if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).width != 0 || f6 <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf6).width = -2;
                            i8 = 0;
                        }
                        iArr = iArr4;
                        i9 = iMax7;
                        i10 = i53;
                        z = z16;
                        z2 = z17;
                        int i57 = i8;
                        c0090Ujhhgtgfeyxiexzf = c0090Ujhhgtgfeyxiexzf6;
                        view = childAt6;
                        i11 = i52;
                        i48 = i;
                        iArr2 = iArr3;
                        i12 = i51;
                        abstractC0086Ujhhgtgfeyxiexzf.measureChildWithMargins(view, i48, f5 == 0.0f ? abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf : 0, i2, 0);
                        if (i57 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).width = i57;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z18) {
                            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).rightMargin + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                        } else {
                            int i58 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i58, i58 + measuredWidth3 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i13 = 1073741824;
                    if (mode4 == i13) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i14 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).topMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i14;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z) {
                        baseline2 = view.getBaseline();
                        z4 = z3;
                        if (baseline2 != -1) {
                            i16 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).gravity;
                            if (i16 < 0) {
                                i16 = abstractC0086Ujhhgtgfeyxiexzf.f1169Ujhhgtgfeyxiexzf;
                            }
                            int i59 = (((i16 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i59] = Math.max(iArr2[i59], baseline2);
                            iArr[i59] = Math.max(iArr[i59], measuredHeight - baseline2);
                        }
                    } else {
                        z4 = z3;
                    }
                    int iMax10 = Math.max(i11, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).weight > 0.0f) {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax7 = Math.max(i9, i14);
                        iMax2 = i12;
                    } else {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax2 = Math.max(i12, i14);
                        iMax7 = i9;
                    }
                    int i510 = iMax2;
                    i50 = iMax10;
                    i15 = i510;
                    z19 = z5;
                }
            }
            i51 = i15;
            i49 = i10 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z;
            z17 = z2;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z22 = z16;
        boolean z23 = z17;
        int i60 = i50;
        int i61 = i51;
        int i62 = iMax7;
        if (abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf > 0 && abstractC0086Ujhhgtgfeyxiexzf.m1138Ujhhgtgfeyxiexzf(virtualChildCount2)) {
            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf += abstractC0086Ujhhgtgfeyxiexzf.f1176Ujhhgtgfeyxiexzf;
        }
        int i63 = iArr5[1];
        int iMax11 = (i63 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i60 : Math.max(i60, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i63, iArr5[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = 0;
            for (int i64 = 0; i64 < virtualChildCount2; i64++) {
                View childAt7 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i64);
                if (childAt7 == null) {
                    abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                } else if (childAt7.getVisibility() != 8) {
                    C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf7 = (C0090Ujhhgtgfeyxiexzf) childAt7.getLayoutParams();
                    if (z18) {
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf7).rightMargin + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                    } else {
                        int i65 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i65, i65 + iMax8 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf7).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC0086Ujhhgtgfeyxiexzf.getPaddingRight() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingLeft() + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC0086Ujhhgtgfeyxiexzf.getSuggestedMinimumWidth()), i48, 0);
        int i66 = (iResolveSizeAndState2 & 16777215) - abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
        if (z21 || (i66 != 0 && f5 > 0.0f)) {
            float f7 = abstractC0086Ujhhgtgfeyxiexzf.f1171Ujhhgtgfeyxiexzf;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = 0;
            iMax11 = -1;
            int i67 = 0;
            while (i67 < virtualChildCount2) {
                View childAt8 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i67);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf8 = (C0090Ujhhgtgfeyxiexzf) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).weight;
                    if (f8 > 0.0f) {
                        int i68 = (int) ((i66 * f8) / f5);
                        f5 -= f8;
                        i66 -= i68;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, abstractC0086Ujhhgtgfeyxiexzf.getPaddingBottom() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingTop() + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).topMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).bottomMargin, ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).height);
                        if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).width == 0) {
                            i7 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i68 <= 0) {
                                    i68 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i68, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i7 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i68;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i7), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z18) {
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).rightMargin + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                    } else {
                        int i69 = abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
                        abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = Math.max(i69, childAt8.getMeasuredWidth() + i69 + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).leftMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).height == -1;
                    int i70 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).topMargin + ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i70;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z24) {
                        i70 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i61, i70);
                    if (z19) {
                        i6 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i6) {
                            int i71 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf8).gravity;
                            if (i71 < 0) {
                                i71 = abstractC0086Ujhhgtgfeyxiexzf.f1169Ujhhgtgfeyxiexzf;
                            }
                            int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i72] = Math.max(iArr5[i72], baseline);
                            iArr6[i72] = Math.max(iArr6[i72], measuredHeight4 - baseline);
                        }
                        z19 = z25;
                        i61 = iMax12;
                    } else {
                        i6 = -1;
                    }
                    if (!z22) {
                    }
                    z19 = z25;
                    i61 = iMax12;
                }
                i67++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf = abstractC0086Ujhhgtgfeyxiexzf.getPaddingRight() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingLeft() + abstractC0086Ujhhgtgfeyxiexzf.f1170Ujhhgtgfeyxiexzf;
            int i73 = iArr5[1];
            if (i73 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[c3]))));
            }
            iMax = i61;
        } else {
            iMax = Math.max(i61, i62);
            if (z23 && mode3 != 1073741824) {
                for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                    View childAt9 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i74);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0090Ujhhgtgfeyxiexzf) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        abstractC0086Ujhhgtgfeyxiexzf.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(abstractC0086Ujhhgtgfeyxiexzf.getPaddingBottom() + abstractC0086Ujhhgtgfeyxiexzf.getPaddingTop() + iMax11, abstractC0086Ujhhgtgfeyxiexzf.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z20) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC0086Ujhhgtgfeyxiexzf.getMeasuredHeight(), 1073741824);
            int i75 = i5;
            while (i75 < virtualChildCount2) {
                View childAt10 = abstractC0086Ujhhgtgfeyxiexzf.getChildAt(i75);
                if (childAt10.getVisibility() != 8) {
                    C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf9 = (C0090Ujhhgtgfeyxiexzf) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf9).height == -1) {
                        int i76 = ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf9).width;
                        ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf9).width = childAt10.getMeasuredWidth();
                        abstractC0086Ujhhgtgfeyxiexzf.measureChildWithMargins(childAt10, i48, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf9).width = i76;
                    }
                }
                i75++;
                abstractC0086Ujhhgtgfeyxiexzf = this;
                i48 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1165Ujhhgtgfeyxiexzf = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1166Ujhhgtgfeyxiexzf = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1175Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f1175Ujhhgtgfeyxiexzf = drawable;
        if (drawable != null) {
            this.f1176Ujhhgtgfeyxiexzf = drawable.getIntrinsicWidth();
            this.f1177Ujhhgtgfeyxiexzf = drawable.getIntrinsicHeight();
        } else {
            this.f1176Ujhhgtgfeyxiexzf = 0;
            this.f1177Ujhhgtgfeyxiexzf = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1179Ujhhgtgfeyxiexzf = i;
    }

    public void setGravity(int i) {
        if (this.f1169Ujhhgtgfeyxiexzf != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1169Ujhhgtgfeyxiexzf = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1169Ujhhgtgfeyxiexzf;
        if ((8388615 & i3) != i2) {
            this.f1169Ujhhgtgfeyxiexzf = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1172Ujhhgtgfeyxiexzf = z;
    }

    public void setOrientation(int i) {
        if (this.f1168Ujhhgtgfeyxiexzf != i) {
            this.f1168Ujhhgtgfeyxiexzf = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1178Ujhhgtgfeyxiexzf) {
            requestLayout();
        }
        this.f1178Ujhhgtgfeyxiexzf = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1169Ujhhgtgfeyxiexzf;
        if ((i3 & 112) != i2) {
            this.f1169Ujhhgtgfeyxiexzf = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1171Ujhhgtgfeyxiexzf = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1136Ujhhgtgfeyxiexzf(Canvas canvas, int i) {
        this.f1175Ujhhgtgfeyxiexzf.setBounds(getPaddingLeft() + this.f1179Ujhhgtgfeyxiexzf, i, (getWidth() - getPaddingRight()) - this.f1179Ujhhgtgfeyxiexzf, this.f1177Ujhhgtgfeyxiexzf + i);
        this.f1175Ujhhgtgfeyxiexzf.draw(canvas);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1137Ujhhgtgfeyxiexzf(Canvas canvas, int i) {
        this.f1175Ujhhgtgfeyxiexzf.setBounds(i, getPaddingTop() + this.f1179Ujhhgtgfeyxiexzf, this.f1176Ujhhgtgfeyxiexzf + i, (getHeight() - getPaddingBottom()) - this.f1179Ujhhgtgfeyxiexzf);
        this.f1175Ujhhgtgfeyxiexzf.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: merged with bridge method [inline-methods] */
    public C0090Ujhhgtgfeyxiexzf generateDefaultLayoutParams() {
        int i = this.f1168Ujhhgtgfeyxiexzf;
        if (i == 0) {
            return new C0090Ujhhgtgfeyxiexzf(-2, -2);
        }
        if (i == 1) {
            return new C0090Ujhhgtgfeyxiexzf(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: merged with bridge method [inline-methods] */
    public C0090Ujhhgtgfeyxiexzf generateLayoutParams(AttributeSet attributeSet) {
        return new C0090Ujhhgtgfeyxiexzf(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: merged with bridge method [inline-methods] */
    public C0090Ujhhgtgfeyxiexzf generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0090Ujhhgtgfeyxiexzf) {
            return new C0090Ujhhgtgfeyxiexzf((C0090Ujhhgtgfeyxiexzf) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0090Ujhhgtgfeyxiexzf((ViewGroup.MarginLayoutParams) layoutParams) : new C0090Ujhhgtgfeyxiexzf(layoutParams);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m1138Ujhhgtgfeyxiexzf(int i) {
        if (i == 0) {
            return (this.f1178Ujhhgtgfeyxiexzf & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1178Ujhhgtgfeyxiexzf & 4) != 0;
        }
        if ((this.f1178Ujhhgtgfeyxiexzf & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }
}
