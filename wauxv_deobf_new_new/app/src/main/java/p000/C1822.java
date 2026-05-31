package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲁᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1822 extends AbstractC0063 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1821 f6065;

    public C1822() {
        C2899 c2899 = C2899.f9270;
        C1740 c1740 = C1740.f5874;
        this.f6065 = new C1821(C2899.f9271, C1740.f5875);
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return this.f6065;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        int size = ((Map) obj).size();
        C1821 c1821 = this.f6065;
        InterfaceC0765 interfaceC0765Mo2931 = interfaceC1207.mo2931(c1821, size);
        Iterator itMo1071 = mo1071(obj);
        int i = 0;
        while (itMo1071.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo1071.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            interfaceC0765Mo2931.mo2346(c1821, i, C2899.f9270, key);
            i += 2;
            interfaceC0765Mo2931.mo2346(c1821, i2, C1740.f5874, value);
        }
        interfaceC0765Mo2931.mo2343(c1821);
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final Object mo1069() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo1070(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final Iterator mo1071(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        Map map = (Map) obj;
        C1740 c1740 = C1740.f5874;
        C2899 c2899 = C2899.f9270;
        C1821 c1821 = this.f6065;
        Object objMo2338 = interfaceC0764.mo2338(c1821, i, c2899, null);
        int iMo2331 = interfaceC0764.mo2331(c1821);
        if (iMo2331 != i + 1) {
            throw new IllegalArgumentException(AbstractC2844.m4779(i, "Value must follow key in a map, index for key: ", ", returned index for value: ", iMo2331).toString());
        }
        map.put(objMo2338, (!map.containsKey(objMo2338) || (C1740.f5875.f8726 instanceof AbstractC2451)) ? interfaceC0764.mo2338(c1821, iMo2331, c1740, null) : interfaceC0764.mo2338(c1821, iMo2331, c1740, AbstractC1924.m3871(map, objMo2338)));
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final Object mo1076(Object obj) {
        return (LinkedHashMap) obj;
    }
}
