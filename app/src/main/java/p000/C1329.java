package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᤞᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1329 extends AbstractC1649 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f4781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC0777 f4782;

    public C1329(C2590 c2590, C2788 c2788, C2526 c2526, ArrayList arrayList, AbstractC0777 abstractC0777) {
        super(c2590, c2788, null, c2526);
        int i = c2590.f8208;
        if (i != 1) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "opcode with invalid branchingness: "));
        }
        this.f4781 = arrayList;
        this.f4782 = abstractC0777;
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo3046(InterfaceC1648 interfaceC1648) {
        interfaceC1648.mo1582(this);
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC3454 mo3047() {
        return C2819.f9030;
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC1649 mo3048(C3448 c3448) {
        throw new UnsupportedOperationException("unsupported");
    }
}
