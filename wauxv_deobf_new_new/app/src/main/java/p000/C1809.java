package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᛸᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1809 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC1144 f5984;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f5985;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f5986;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f5987;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f5988;

    public C1809() {
        m3694();
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5985 + ", mCoordinate=" + this.f5986 + ", mLayoutFromEnd=" + this.f5987 + ", mValid=" + this.f5988 + '}';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3691() {
        this.f5986 = this.f5987 ? this.f5984.mo2886() : this.f5984.mo2890();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3692(View view, int i) {
        if (this.f5987) {
            int iMo2881 = this.f5984.mo2881(view);
            AbstractC1144 abstractC1144 = this.f5984;
            this.f5986 = (Integer.MIN_VALUE == abstractC1144.f4244 ? 0 : abstractC1144.mo2891() - abstractC1144.f4244) + iMo2881;
        } else {
            this.f5986 = this.f5984.mo2884(view);
        }
        this.f5985 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3693(View view, int i) {
        AbstractC1144 abstractC1144 = this.f5984;
        int iMo2891 = Integer.MIN_VALUE == abstractC1144.f4244 ? 0 : abstractC1144.mo2891() - abstractC1144.f4244;
        if (iMo2891 >= 0) {
            m3692(view, i);
            return;
        }
        this.f5985 = i;
        if (!this.f5987) {
            int iMo2884 = this.f5984.mo2884(view);
            int iMo2890 = iMo2884 - this.f5984.mo2890();
            this.f5986 = iMo2884;
            if (iMo2890 > 0) {
                int iMo2886 = (this.f5984.mo2886() - Math.min(0, (this.f5984.mo2886() - iMo2891) - this.f5984.mo2881(view))) - (this.f5984.mo2882(view) + iMo2884);
                if (iMo2886 < 0) {
                    this.f5986 -= Math.min(iMo2890, -iMo2886);
                    return;
                }
                return;
            }
            return;
        }
        int iMo2887 = (this.f5984.mo2886() - iMo2891) - this.f5984.mo2881(view);
        this.f5986 = this.f5984.mo2886() - iMo2887;
        if (iMo2887 > 0) {
            int iMo2882 = this.f5986 - this.f5984.mo2882(view);
            int iMo2892 = this.f5984.mo2890();
            int iMin = iMo2882 - (Math.min(this.f5984.mo2884(view) - iMo2892, 0) + iMo2892);
            if (iMin < 0) {
                this.f5986 = Math.min(iMo2887, -iMin) + this.f5986;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3694() {
        this.f5985 = -1;
        this.f5986 = Integer.MIN_VALUE;
        this.f5987 = false;
        this.f5988 = false;
    }
}
