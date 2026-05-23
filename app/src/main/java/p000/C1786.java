package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᤝᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1786 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC1138 f5928;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f5929;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f5930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f5931;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f5932;

    public C1786() {
        m3522();
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5929 + ", mCoordinate=" + this.f5930 + ", mLayoutFromEnd=" + this.f5931 + ", mValid=" + this.f5932 + '}';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3519() {
        this.f5930 = this.f5931 ? this.f5928.mo2742() : this.f5928.mo2746();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3520(View view, int i) {
        if (this.f5931) {
            int iMo2737 = this.f5928.mo2737(view);
            AbstractC1138 abstractC1138 = this.f5928;
            this.f5930 = (-2147483648 == abstractC1138.f4232 ? 0 : abstractC1138.mo2747() - abstractC1138.f4232) + iMo2737;
        } else {
            this.f5930 = this.f5928.mo2740(view);
        }
        this.f5929 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3521(View view, int i) {
        AbstractC1138 abstractC1138 = this.f5928;
        int iMo2747 = -2147483648 == abstractC1138.f4232 ? 0 : abstractC1138.mo2747() - abstractC1138.f4232;
        if (iMo2747 >= 0) {
            m3520(view, i);
            return;
        }
        this.f5929 = i;
        if (!this.f5931) {
            int iMo2740 = this.f5928.mo2740(view);
            int iMo2746 = iMo2740 - this.f5928.mo2746();
            this.f5930 = iMo2740;
            if (iMo2746 > 0) {
                int iMo2742 = (this.f5928.mo2742() - Math.min(0, (this.f5928.mo2742() - iMo2747) - this.f5928.mo2737(view))) - (this.f5928.mo2738(view) + iMo2740);
                if (iMo2742 < 0) {
                    this.f5930 -= Math.min(iMo2746, -iMo2742);
                    return;
                }
                return;
            }
            return;
        }
        int iMo2743 = (this.f5928.mo2742() - iMo2747) - this.f5928.mo2737(view);
        this.f5930 = this.f5928.mo2742() - iMo2743;
        if (iMo2743 > 0) {
            int iMo2738 = this.f5930 - this.f5928.mo2738(view);
            int iMo2748 = this.f5928.mo2746();
            int iMin = iMo2738 - (Math.min(this.f5928.mo2740(view) - iMo2748, 0) + iMo2748);
            if (iMin < 0) {
                this.f5930 = Math.min(iMo2743, -iMin) + this.f5930;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3522() {
        this.f5929 = -1;
        this.f5930 = -2147483648;
        this.f5931 = false;
        this.f5932 = false;
    }
}
