package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᛸᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1331 extends AbstractC1663 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f4781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0775 f4782;

    public C1331(C2648 c2648, C2848 c2848, C2582 c2582, ArrayList arrayList, AbstractC0775 abstractC0775) {
        super(c2648, c2848, null, c2582);
        int i = c2648.f8360;
        if (i != 1) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "opcode with invalid branchingness: "));
        }
        this.f4781 = arrayList;
        this.f4782 = abstractC0775;
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo3149(InterfaceC1662 interfaceC1662) {
        interfaceC1662.mo1688(this);
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC3510 mo3150() {
        return C2879.f9192;
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC1663 mo3151(C3505 c3505) {
        throw new UnsupportedOperationException("unsupported");
    }
}
