package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤞᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0366 extends AbstractC0781 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f1740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f1741;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0367 f1742;

    public int getMargin() {
        return this.f1742.f1745;
    }

    public int getType() {
        return this.f1740;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1742.f1744 = z;
    }

    public void setDpMargin(int i) {
        this.f1742.f1745 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1742.f1745 = i;
    }

    public void setType(int i) {
        this.f1740 = i;
    }

    @Override // p000.AbstractC0781
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo51(C0793 c0793, boolean z) {
        int i = this.f1740;
        this.f1741 = i;
        if (z) {
            if (i == 5) {
                this.f1741 = 1;
            } else if (i == 6) {
                this.f1741 = 0;
            }
        } else if (i == 5) {
            this.f1741 = 0;
        } else if (i == 6) {
            this.f1741 = 1;
        }
        if (c0793 instanceof C0367) {
            ((C0367) c0793).f1743 = this.f1741;
        }
    }
}
