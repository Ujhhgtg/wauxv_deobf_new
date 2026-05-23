package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᤝᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1819 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1821 f6056;

    public C1819(AbstractC1821 abstractC1821) {
        this.f6056 = abstractC1821;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AbstractC1821 abstractC1821 = this.f6056;
        RunnableC1817 runnableC1817 = abstractC1821.f6074;
        C0223 c0223 = abstractC1821.f6082;
        if (i != 1 || c0223.getInputMethodMode() == 2 || c0223.getContentView() == null) {
            return;
        }
        abstractC1821.f6078.removeCallbacks(runnableC1817);
        runnableC1817.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
