package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734 extends AbstractC0063 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1767 f2825;

    public AbstractC0734(InterfaceC1767 interfaceC1767) {
        this.f2825 = interfaceC1767;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        int iMo1072 = mo1072(obj);
        InterfaceC2715 interfaceC2715Mo1509 = mo1509();
        InterfaceC0765 interfaceC0765Mo2931 = interfaceC1207.mo2931(interfaceC2715Mo1509, iMo1072);
        Iterator itMo1071 = mo1071(obj);
        for (int i = 0; i < iMo1072; i++) {
            interfaceC0765Mo2931.mo2346(mo1509(), i, this.f2825, itMo1071.next());
        }
        interfaceC0765Mo2931.mo2343(interfaceC2715Mo1509);
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        mo1510(obj, i, interfaceC0764.mo2338(mo1509(), i, this.f2825, null));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public abstract void mo1510(Object obj, int i, Object obj2);
}
