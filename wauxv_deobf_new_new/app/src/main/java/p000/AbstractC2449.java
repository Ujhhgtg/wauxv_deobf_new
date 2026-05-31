package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲇᛸᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2449 extends AbstractC0734 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2448 f7803;

    public AbstractC2449(InterfaceC1767 interfaceC1767) {
        super(interfaceC1767);
        this.f7803 = new C2448(interfaceC1767.mo1509());
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return this.f7803;
    }

    @Override // p000.AbstractC0063, p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        return m1073(interfaceC0978, null);
    }

    @Override // p000.AbstractC0734, p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        int iMo1072 = mo1072(obj);
        C2448 c2448 = this.f7803;
        InterfaceC0765 interfaceC0765Mo2931 = interfaceC1207.mo2931(c2448, iMo1072);
        mo1749(interfaceC0765Mo2931, obj, iMo1072);
        interfaceC0765Mo2931.mo2343(c2448);
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final Object mo1069() {
        return (AbstractC2447) mo1075(mo1748());
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo1070(Object obj) {
        return ((AbstractC2447) obj).mo1747();
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final Iterator mo1071(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final Object mo1076(Object obj) {
        return ((AbstractC2447) obj).mo1745();
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final void mo1510(Object obj, int i, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public abstract Object mo1748();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public abstract void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i);
}
