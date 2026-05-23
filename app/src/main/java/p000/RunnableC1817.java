package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᛸᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1817 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6053;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1821 f6054;

    public /* synthetic */ RunnableC1817(AbstractC1821 abstractC1821, int i) {
        this.f6053 = i;
        this.f6054 = abstractC1821;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6053) {
            case 0:
                C1952 c1952 = this.f6054.f6063;
                if (c1952 != null) {
                    c1952.setListSelectionHidden(true);
                    c1952.requestLayout();
                }
                break;
            default:
                AbstractC1821 abstractC1821 = this.f6054;
                C1952 c1953 = abstractC1821.f6063;
                if (c1953 != null && c1953.isAttachedToWindow() && abstractC1821.f6063.getCount() > abstractC1821.f6063.getChildCount() && abstractC1821.f6063.getChildCount() <= Integer.MAX_VALUE) {
                    abstractC1821.f6082.setInputMethodMode(2);
                    abstractC1821.mo1968();
                    break;
                }
                break;
        }
    }
}
