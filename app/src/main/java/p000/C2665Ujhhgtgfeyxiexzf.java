package p000;

import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2665Ujhhgtgfeyxiexzf extends AbstractC0450Ujhhgtgfeyxiexzf {
    @Override // p000.AbstractC0450Ujhhgtgfeyxiexzf
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C2662feyxiexzfUjhhgtg c2662feyxiexzfUjhhgtg = (C2662feyxiexzfUjhhgtg) getMenuView();
        if (c2662feyxiexzfUjhhgtg.f8531feyxiexzfUjhhgtg != z) {
            c2662feyxiexzfUjhhgtg.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1593Ujhhgtgfeyxiexzf(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC2663feyxiexzfUjhhgtg interfaceC2663feyxiexzfUjhhgtg) {
        setOnItemReselectedListener(interfaceC2663feyxiexzfUjhhgtg);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC2664feyxiexzfUjhhgtg interfaceC2664feyxiexzfUjhhgtg) {
        setOnItemSelectedListener(interfaceC2664feyxiexzfUjhhgtg);
    }
}
