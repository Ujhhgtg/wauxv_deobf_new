package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᛸᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0960 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2873 f3486 = new C2873(new C0104(25));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m2450(Boolean bool) {
        try {
            C1331 c1331M4654 = AbstractC2652.m4654(new C0271(0, AbstractC2209.m4128()), C0959.f3485);
            C1331 c1331M4655 = AbstractC2652.m4654(AbstractC2652.m4654(AbstractC2652.m4654(c1331M4654, new C0853(22)), new C0055(4, bool)), new C0853(23));
            final InterfaceC1425[] interfaceC1425Arr = {new C0853(24), new C0853(25)};
            Comparator comparator = new Comparator() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᲀᤞᤝᲁ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (InterfaceC1425 interfaceC1425 : interfaceC1425Arr) {
                        int iM3291 = AbstractC1574.m3291((Comparable) interfaceC1425.invoke(obj), (Comparable) interfaceC1425.invoke(obj2));
                        if (iM3291 != 0) {
                            return iM3291;
                        }
                    }
                    return 0;
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            C1330 c1330 = new C1330(c1331M4655);
            while (c1330.hasNext()) {
                arrayList.add(c1330.next());
            }
            AbstractC0749.m2216(arrayList, comparator);
            for (Object obj : arrayList) {
                String strMo1129 = ((AbstractC2867) obj).mo1129();
                Object arrayList2 = linkedHashMap.get(strMo1129);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(strMo1129, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List<AbstractC2867> list = (List) entry.getValue();
                List listSingletonList = Collections.singletonList(new C0395(str));
                ArrayList arrayList4 = new ArrayList(AbstractC0746.m2214(list, 10));
                for (AbstractC2867 abstractC2867 : list) {
                    String strMo1128 = abstractC2867.mo1128();
                    String strMo1127 = abstractC2867.mo1127();
                    InterfaceC1425 interfaceC1425Mo1130 = abstractC2867.mo1130();
                    arrayList4.add(new C0398(strMo1128, strMo1127, abstractC2867, interfaceC1425Mo1130 != null ? new ViewOnClickListenerC0958(interfaceC1425Mo1130, 0) : null));
                }
                AbstractC0750.m2217(arrayList3, AbstractC0744.m2198(listSingletonList, arrayList4));
            }
            return AbstractC0744.m2206(arrayList3);
        } catch (Exception unused) {
            return C1189.f4329;
        }
    }
}
