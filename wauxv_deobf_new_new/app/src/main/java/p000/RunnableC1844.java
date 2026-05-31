package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲁᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1844 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1848 f6129;

    public /* synthetic */ RunnableC1844(AbstractC1848 abstractC1848, int i) {
        this.f6128 = i;
        this.f6129 = abstractC1848;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6128) {
            case 0:
                C1983 c1983 = this.f6129.f6138;
                if (c1983 != null) {
                    c1983.setListSelectionHidden(true);
                    c1983.requestLayout();
                }
                break;
            default:
                AbstractC1848 abstractC1848 = this.f6129;
                C1983 c1984 = abstractC1848.f6138;
                if (c1984 != null && c1984.isAttachedToWindow() && abstractC1848.f6138.getCount() > abstractC1848.f6138.getChildCount() && abstractC1848.f6138.getChildCount() <= Integer.MAX_VALUE) {
                    abstractC1848.f6157.setInputMethodMode(2);
                    abstractC1848.mo2065();
                    break;
                }
                break;
        }
    }
}
