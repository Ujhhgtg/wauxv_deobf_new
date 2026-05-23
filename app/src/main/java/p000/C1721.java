package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲇᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1721 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1721 f5816 = new C1721();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2399 f5817;

    static {
        int length;
        Comparable comparable;
        C2397 c2397 = C2397.f7668;
        if (AbstractC2841.m4836("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C1892) AbstractC2400.f7671.values()).iterator();
        while (((AbstractC1889) it).hasNext()) {
            InterfaceC1743 interfaceC1743 = (InterfaceC1743) ((C1887) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(interfaceC1743.mo1363().mo1342())) {
                String str = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + AbstractC2519.classToKClass(interfaceC1743.getClass()).m2128() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            ";
                List listM4839 = AbstractC2841.m4839(str);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM4839) {
                    if (!AbstractC2841.m4836((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(arrayList, 10));
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
                        } else if (!AbstractC3681.m5332(str2.charAt(length))) {
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
                listM4839.size();
                int iM2211 = AbstractC0745.m2211(listM4839);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listM4839) {
                    int i = length + 1;
                    if (length < 0) {
                        AbstractC0745.m2213();
                        throw null;
                    }
                    String str3 = (String) obj2;
                    if ((length == 0 || length == iM2211) && AbstractC2841.m4836(str3)) {
                        str3 = null;
                    } else {
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(AbstractC1194.m2780(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        String strSubstring = str3.substring(length4);
                        if (true) {
                            str3 = strSubstring;
                        }
                    }
                    if (str3 != null) {
                        arrayList3.add(str3);
                    }
                    length = i;
                }
                StringBuilder sb = new StringBuilder(length3);
                AbstractC0744.m2194(arrayList3, sb, "\n", "", "", null);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        f5817 = new C2399("kotlinx.serialization.json.JsonLiteral", c2397);
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return f5817;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        C2828 c2828M5065 = AbstractC3471.m5065(interfaceC0974);
        AbstractC1715 abstractC1715M4812 = c2828M5065.m4812();
        if (abstractC1715M4812 instanceof C1720) {
            return (C1720) abstractC1715M4812;
        }
        String str = "Unexpected JSON element, expected JsonLiteral, had " + AbstractC2519.classToKClass(abstractC1715M4812.getClass());
        
        throw new C1713(AbstractC3681.m5327(-1, str, null, null, AbstractC3681.m5333(-1, abstractC1715M4812.toString()).toString()));
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        Double dValueOf;
        C1720 c1720 = (C1720) obj;
        String str = c1720.f5815;
        AbstractC3471.m5063(interfaceC1206);
        if (c1720.f5814) {
            interfaceC1206.mo2808(str);
            return;
        }
        Long lM4854 = AbstractC2848.m4854(str);
        if (lM4854 != null) {
            interfaceC1206.mo2807(lM4854.longValue());
            return;
        }
        C3482 c3482M3990 = AbstractC2201.m3990(str);
        if (c3482M3990 != null) {
            interfaceC1206.mo2803(C3486.f10985).mo2807(c3482M3990.f10979);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = AbstractC2847.m4850(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            interfaceC1206.mo2799(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            interfaceC1206.mo2802(bool.booleanValue());
        } else {
            interfaceC1206.mo2808(str);
        }
    }
}
