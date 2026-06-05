package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2662feyxiexzfUjhhgtg extends AbstractC0444Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int f8527feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final int f8528feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final int f8529feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final int f8530feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f8531feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final ArrayList f8532feyxiexzfUjhhgtg;

    public C2662feyxiexzfUjhhgtg(Context context) {
        super(context);
        this.f8532feyxiexzfUjhhgtg = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f8527feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f8528feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f8529feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f8530feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMin;
        int i4;
        int i5;
        int i6;
        MenuC0355Ujhhgtgfeyxiexzf menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.m1552Ujhhgtgfeyxiexzf().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f8532feyxiexzfUjhhgtg;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i7 = this.f8529feyxiexzfUjhhgtg;
        if (labelVisibilityMode != -1 ? labelVisibilityMode != 0 : size2 <= 3) {
            iMin = Math.min(size / (size2 != 0 ? size2 : 1), i7);
            i4 = size - (size2 * iMin);
            for (i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getVisibility() != 8) {
                    i6 = 0;
                } else if (i4 > 0) {
                    i6 = iMin + 1;
                    i4--;
                } else {
                    i6 = iMin;
                }
                arrayList.add(Integer.valueOf(i6));
            }
        } else if (this.f8531feyxiexzfUjhhgtg) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.f8530feyxiexzfUjhhgtg;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i8 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin2 = Math.min(size - (this.f8528feyxiexzfUjhhgtg * i8), Math.min(iMax, i7));
            int i9 = size - iMin2;
            int iMin3 = Math.min(i9 / (i8 != 0 ? i8 : 1), this.f8527feyxiexzfUjhhgtg);
            int i10 = i9 - (i8 * iMin3);
            int i11 = 0;
            while (i11 < childCount) {
                if (getChildAt(i11).getVisibility() != 8) {
                    i3 = i11 == getSelectedItemPosition() ? iMin2 : iMin3;
                    if (i10 > 0) {
                        i3++;
                        i10--;
                    }
                } else {
                    i3 = 0;
                }
                arrayList.add(Integer.valueOf(i3));
                i11++;
            }
        } else {
            iMin = Math.min(size / (size2 != 0 ? size2 : 1), i7);
            i4 = size - (size2 * iMin);
            while (i5 < childCount) {
                if (getChildAt(i5).getVisibility() != 8) {
                    i6 = 0;
                } else if (i4 > 0) {
                    i6 = iMin + 1;
                    i4--;
                } else {
                    i6 = iMin;
                }
                arrayList.add(Integer.valueOf(i6));
            }
        }
        int measuredWidth = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i12)).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f8531feyxiexzfUjhhgtg = z;
    }
}
