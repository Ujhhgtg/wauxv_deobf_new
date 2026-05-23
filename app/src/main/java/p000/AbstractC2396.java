package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲈᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2396 extends AbstractC0739 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2395 f7659;

    public AbstractC2396(InterfaceC1743 interfaceC1743) {
        super(interfaceC1743);
        this.f7659 = new C2395(interfaceC1743.mo1363());
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return this.f7659;
    }

    @Override // p000.AbstractC0056, p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return m929(interfaceC0974, null);
    }

    @Override // p000.AbstractC0739, p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        int iMo928 = mo928(obj);
        C2395 c2395 = this.f7659;
        InterfaceC0767 interfaceC0767Mo2809 = interfaceC1206.mo2809(c2395, iMo928);
        mo1643(interfaceC0767Mo2809, obj, iMo928);
        interfaceC0767Mo2809.mo2242(c2395);
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final Object mo925() {
        return (AbstractC2394) mo931(mo1642());
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo926(Object obj) {
        return ((AbstractC2394) obj).mo1641();
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final Iterator mo927(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final Object mo932(Object obj) {
        return ((AbstractC2394) obj).mo1639();
    }

    @Override // p000.AbstractC0739
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final void mo1364(Object obj, int i, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public abstract Object mo1642();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public abstract void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i);
}
