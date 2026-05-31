package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲀᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0425 extends AbstractC2165 {
    @Override // p000.AbstractC2165
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
        C0422 c0422 = (C0422) getMenuView();
        if (c0422.f1991 != z) {
            c0422.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1283(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC0423 interfaceC0423) {
        setOnItemReselectedListener(interfaceC0423);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0424 interfaceC0424) {
        setOnItemSelectedListener(interfaceC0424);
    }
}
