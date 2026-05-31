package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᤝᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2776 implements InterfaceC2429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1892 f8926;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f8927;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Bitmap.Config f8928;

    public C2776(C1892 c1892) {
        this.f8926 = c1892;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2776) {
            C2776 c2776 = (C2776) obj;
            if (this.f8927 == c2776.f8927 && AbstractC3580.m5117(this.f8928, c2776.f8928)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f8927 * 31;
        Bitmap.Config config = this.f8928;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2777.m4756(this.f8927, this.f8928);
    }

    @Override // p000.InterfaceC2429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo3814() {
        this.f8926.m1625(this);
    }
}
