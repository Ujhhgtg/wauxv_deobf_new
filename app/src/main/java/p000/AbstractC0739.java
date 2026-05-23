package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0739 extends AbstractC0056 {

    public final InterfaceC1743 f2831;

    public AbstractC0739(InterfaceC1743 interfaceC1743) {
        this.f2831 = interfaceC1743;
    }

    @Override // p000.InterfaceC1743
    public void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        int iMo928 = mo928(obj);
        InterfaceC2654 interfaceC2654Mo1363 = mo1363();
        InterfaceC0767 interfaceC0767Mo2809 = interfaceC1206.mo2809(interfaceC2654Mo1363, iMo928);
        Iterator itMo927 = mo927(obj);
        for (int i = 0; i < iMo928; i++) {
            interfaceC0767Mo2809.mo2245(mo1363(), i, this.f2831, itMo927.next());
        }
        interfaceC0767Mo2809.mo2242(interfaceC2654Mo1363);
    }

    @Override // p000.AbstractC0056
    public void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        mo1364(obj, i, interfaceC0766.mo2237(mo1363(), i, this.f2831, null));
    }

    public abstract void mo1364(Object obj, int i, Object obj2);
}
