package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲁᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1745 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1745 f5879 = new C1745();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2452 f5880;

    static {
        int length;
        Comparable comparable;
        C2450 c2450 = C2450.f7812;
        if (AbstractC2901.m4869("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C1918) AbstractC2453.f7815.values()).iterator();
        while (((AbstractC1915) it).hasNext()) {
            InterfaceC1767 interfaceC1767 = (InterfaceC1767) ((C1913) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(interfaceC1767.mo1509().mo1488())) {
                String str = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + AbstractC2574.m4549(interfaceC1767.getClass()).m2221() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            ";
                List listM4872 = AbstractC2901.m4872(str);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM4872) {
                    if (!AbstractC2901.m4869((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (true) {
                    length = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    int length2 = str2.length();
                    while (true) {
                        if (length >= length2) {
                            length = -1;
                            break;
                        } else if (!AbstractC2727.m4704(str2.charAt(length))) {
                            break;
                        } else {
                            length++;
                        }
                    }
                    if (length == -1) {
                        length = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length));
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    comparable = (Comparable) it3.next();
                    while (it3.hasNext()) {
                        Comparable comparable2 = (Comparable) it3.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listM4872.size();
                int iM2310 = AbstractC0740.m2310(listM4872);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listM4872) {
                    int i = length + 1;
                    if (length < 0) {
                        AbstractC0740.m2312();
                        throw null;
                    }
                    String str3 = (String) obj2;
                    if ((length == 0 || length == iM2310) && AbstractC2901.m4869(str3)) {
                        str3 = null;
                    } else {
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(AbstractC1095.m2795(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        String strSubstring = str3.substring(length4);
                        if (strSubstring != null) {
                            str3 = strSubstring;
                        }
                    }
                    if (str3 != null) {
                        arrayList3.add(str3);
                    }
                    length = i;
                }
                StringBuilder sb = new StringBuilder(length3);
                AbstractC0739.m2293(arrayList3, sb, "\n", "", "", null);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        f5880 = new C2452("kotlinx.serialization.json.JsonLiteral", c2450);
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f5880;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        C2888 c2888M3468 = AbstractC1586.m3468(interfaceC0978);
        AbstractC1736 abstractC1736M4845 = c2888M3468.m4845();
        if (abstractC1736M4845 instanceof C1744) {
            return (C1744) abstractC1736M4845;
        }
        throw new C1734(AbstractC2234.m4167(-1, "Unexpected JSON element, expected JsonLiteral, had " + AbstractC2574.m4549(abstractC1736M4845.getClass()), null, null, c2888M3468.m4846().f5842.f5867 ? AbstractC2234.m4177(-1, abstractC1736M4845.toString()).toString() : null));
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        Double dValueOf;
        C1744 c1744 = (C1744) obj;
        String str = c1744.f5878;
        AbstractC1586.m3467(interfaceC1207);
        if (c1744.f5877) {
            interfaceC1207.mo2930(str);
            return;
        }
        Long lM4915 = AbstractC2908.m4915(str);
        if (lM4915 != null) {
            interfaceC1207.mo2929(lM4915.longValue());
            return;
        }
        C3539 c3539M4715 = AbstractC2727.m4715(str);
        if (c3539M4715 != null) {
            interfaceC1207.mo2925(C3543.f11137).mo2929(c3539M4715.f11131);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = AbstractC2907.m4911(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            interfaceC1207.mo2921(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            interfaceC1207.mo2924(bool.booleanValue());
        } else {
            interfaceC1207.mo2930(str);
        }
    }
}
