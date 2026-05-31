package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0341 extends AbstractC0780 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f1711;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f1712;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0342 f1713;

    public int getMargin() {
        return this.f1713.f1716;
    }

    public int getType() {
        return this.f1711;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1713.f1715 = z;
    }

    public void setDpMargin(int i) {
        this.f1713.f1716 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1713.f1716 = i;
    }

    public void setType(int i) {
        this.f1711 = i;
    }

    @Override // p000.AbstractC0780
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo51(C0792 c0792, boolean z) {
        int i = this.f1711;
        this.f1712 = i;
        if (z) {
            if (i == 5) {
                this.f1712 = 1;
            } else if (i == 6) {
                this.f1712 = 0;
            }
        } else if (i == 5) {
            this.f1712 = 0;
        } else if (i == 6) {
            this.f1712 = 1;
        }
        if (c0792 instanceof C0342) {
            ((C0342) c0792).f1714 = this.f1712;
        }
    }
}
