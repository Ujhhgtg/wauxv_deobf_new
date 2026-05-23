package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1799 extends AbstractC0056 {

    public final C1798 f6009;

    public C1799() {
        C2839 c2839 = C2839.f9108;
        C1717 c1717 = C1717.f5811;
        this.f6009 = new C1798(C2839.f9109, C1717.f5812);
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return this.f6009;
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        int size = ((Map) obj).size();
        C1798 c1798 = this.f6009;
        InterfaceC0767 interfaceC0767Mo2809 = interfaceC1206.mo2809(c1798, size);
        Iterator itMo927 = mo927(obj);
        int i = 0;
        while (itMo927.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo927.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            interfaceC0767Mo2809.mo2245(c1798, i, C2839.f9108, key);
            i += 2;
            interfaceC0767Mo2809.mo2245(c1798, i2, C1717.f5811, value);
        }
        interfaceC0767Mo2809.mo2242(c1798);
    }

    @Override // p000.AbstractC0056
    public final Object mo925() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC0056
    public final int mo926(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // p000.AbstractC0056
    public final Iterator mo927(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC0056
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        Map map = (Map) obj;
        C1717 c1717 = C1717.f5811;
        C2839 c2839 = C2839.f9108;
        C1798 c1798 = this.f6009;
        Object objMo2237 = interfaceC0766.mo2237(c1798, i, c2839, null);
        int iMo2230 = interfaceC0766.mo2230(c1798);
        if (iMo2230 != i + 1) {
            throw new IllegalArgumentException(AbstractC2784.m4745(i, "Value must follow key in a map, index for key: ", ", returned index for value: ", iMo2230).toString());
        }
        map.put(objMo2237, (!map.containsKey(objMo2237) || (C1717.f5812.f8561 instanceof AbstractC2398)) ? interfaceC0766.mo2237(c1798, iMo2230, c1717, null) : interfaceC0766.mo2237(c1798, iMo2230, c1717, AbstractC1898.m3692(map, objMo2237)));
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // p000.AbstractC0056
    public final Object mo932(Object obj) {
        return (LinkedHashMap) obj;
    }
}
