package p000;

import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0450 extends AbstractC2131 {
    @Override // p000.AbstractC2131
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
        C0447 c0447 = (C0447) getMenuView();
        if (c0447.f2019 != z) {
            c0447.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1137(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC0448 interfaceC0448) {
        setOnItemReselectedListener(interfaceC0448);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0449 interfaceC0449) {
        setOnItemSelectedListener(interfaceC0449);
    }
}
