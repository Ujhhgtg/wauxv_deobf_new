package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤝᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2679 extends AbstractC2680 implements Iterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2678 f8665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f8666 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2681 f8667;

    public C2679(C2681 c2681) {
        this.f8667 = c2681;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8666) {
            return this.f8667.f8668 != null;
        }
        C2678 c2678 = this.f8665;
        return (c2678 == null || c2678.f8663 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8666) {
            this.f8666 = false;
            this.f8665 = this.f8667.f8668;
        } else {
            C2678 c2678 = this.f8665;
            this.f8665 = c2678 != null ? c2678.f8663 : null;
        }
        return this.f8665;
    }

    @Override // p000.AbstractC2680
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo4665(C2678 c2678) {
        C2678 c2679 = this.f8665;
        if (c2678 == c2679) {
            C2678 c26710 = c2679.f8664;
            this.f8665 = c26710;
            this.f8666 = c26710 == null;
        }
    }
}
