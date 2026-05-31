package p000;

import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲁᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1821 implements InterfaceC2715 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2715 f6063;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2715 f6064;

    public C1821(InterfaceC2715 interfaceC2715, InterfaceC2715 interfaceC2716) {
        this.f6063 = interfaceC2715;
        this.f6064 = interfaceC2716;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1821)) {
            return false;
        }
        C1821 c1821 = (C1821) obj;
        return AbstractC1469.m3322(this.f6063, c1821.f6063) && AbstractC1469.m3322(this.f6064, c1821.f6064);
    }

    public final int hashCode() {
        return this.f6064.hashCode() + ((this.f6063.hashCode() + 710441009) * 31);
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f6063 + ", " + this.f6064 + ')';
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1488() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3639(String str) {
        Integer numM4914 = AbstractC2908.m4914(str);
        if (numM4914 != null) {
            return numM4914.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC2236 mo3640() {
        return C2911.f9282;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3641() {
        return 2;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3642(int i) {
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3643(int i) {
        if (i >= 0) {
            return C1191.f4326;
        }
        throw new IllegalArgumentException(AbstractC1095.m2795(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2715 mo3644(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1095.m2795(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f6063;
        }
        if (i2 == 1) {
            return this.f6064;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3645(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC1095.m2795(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }
}
