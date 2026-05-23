package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0056 implements InterfaceC1743 {
    @Override // p000.InterfaceC1743
    public Object mo924(InterfaceC0974 interfaceC0974) {
        return m929(interfaceC0974, null);
    }

    public abstract Object mo925();

    public abstract int mo926(Object obj);

    public abstract Iterator mo927(Object obj);

    public abstract int mo928(Object obj);

    public final Object m929(InterfaceC0974 interfaceC0974, Object obj) {
        Object objMo931 = obj != null ? mo931(obj) : mo925();
        int iMo926 = mo926(objMo931);
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(mo1363());
        
        while (true) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(mo1363());
            if (iMo2230 == -1) {
                interfaceC0766Mo2512.mo2228(mo1363());
                return mo932(objMo931);
            }
            mo930(interfaceC0766Mo2512, iMo2230 + iMo926, objMo931);
        }
    }

    public abstract void mo930(InterfaceC0766 interfaceC0766, int i, Object obj);

    public abstract Object mo931(Object obj);

    public abstract Object mo932(Object obj);
}
