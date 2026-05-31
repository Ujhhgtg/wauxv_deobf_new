package p000;

import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᤝᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1840 implements InterfaceC2715 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2715 f6126;

    public AbstractC1840(InterfaceC2715 interfaceC2715) {
        this.f6126 = interfaceC2715;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1840)) {
            return false;
        }
        AbstractC1840 abstractC1840 = (AbstractC1840) obj;
        return AbstractC1469.m3322(this.f6126, abstractC1840.f6126) && AbstractC1469.m3322(mo1488(), abstractC1840.mo1488());
    }

    public final int hashCode() {
        return mo1488().hashCode() + (this.f6126.hashCode() * 31);
    }

    public final String toString() {
        return mo1488() + '(' + this.f6126 + ')';
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3639(String str) {
        Integer numM4914 = AbstractC2908.m4914(str);
        if (numM4914 != null) {
            return numM4914.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC2236 mo3640() {
        return C2911.f9281;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3641() {
        return 1;
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
        StringBuilder sbM2802 = AbstractC1095.m2802(i, "Illegal index ", ", ");
        sbM2802.append(mo1488());
        sbM2802.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM2802.toString().toString());
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2715 mo3644(int i) {
        if (i >= 0) {
            return this.f6126;
        }
        StringBuilder sbM2802 = AbstractC1095.m2802(i, "Illegal index ", ", ");
        sbM2802.append(mo1488());
        sbM2802.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM2802.toString().toString());
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3645(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM2802 = AbstractC1095.m2802(i, "Illegal index ", ", ");
        sbM2802.append(mo1488());
        sbM2802.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM2802.toString().toString());
    }
}
