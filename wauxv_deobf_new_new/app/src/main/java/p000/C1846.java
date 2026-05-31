package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲁᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1846 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1848 f6131;

    public C1846(AbstractC1848 abstractC1848) {
        this.f6131 = abstractC1848;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AbstractC1848 abstractC1848 = this.f6131;
        RunnableC1844 runnableC1844 = abstractC1848.f6149;
        C0233 c0233 = abstractC1848.f6157;
        if (i != 1 || c0233.getInputMethodMode() == 2 || c0233.getContentView() == null) {
            return;
        }
        abstractC1848.f6153.removeCallbacks(runnableC1844);
        runnableC1844.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
