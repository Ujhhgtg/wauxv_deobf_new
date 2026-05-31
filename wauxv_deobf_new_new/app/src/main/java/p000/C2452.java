package p000;

import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲇᲁᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2452 implements InterfaceC2715 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC2451 f7814;

    public C2452(String str, AbstractC2451 abstractC2451) {
        this.f7813 = str;
        this.f7814 = abstractC2451;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2452)) {
            return false;
        }
        C2452 c2452 = (C2452) obj;
        return AbstractC1469.m3322(this.f7813, c2452.f7813) && AbstractC1469.m3322(this.f7814, c2452.f7814);
    }

    public final int hashCode() {
        return (this.f7814.hashCode() * 31) + this.f7813.hashCode();
    }

    public final String toString() {
        return AbstractC1095.m2801(new StringBuilder("PrimitiveDescriptor("), this.f7813, ')');
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1488() {
        return this.f7813;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4392() {
        throw new IllegalStateException(AbstractC2844.m4786(new StringBuilder("Primitive descriptor "), this.f7813, " does not have elements"));
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3639(String str) {
        m4392();
        throw null;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC2236 mo3640() {
        return this.f7814;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3641() {
        return 0;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3642(int i) {
        m4392();
        throw null;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3643(int i) {
        m4392();
        throw null;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2715 mo3644(int i) {
        m4392();
        throw null;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3645(int i) {
        m4392();
        throw null;
    }
}
