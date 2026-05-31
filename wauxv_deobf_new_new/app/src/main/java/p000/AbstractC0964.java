package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲈᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0964 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2933 f3503 = new C2933(new C0112(25));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m2569(Boolean bool) {
        String[] strArr = AbstractC1471.f5234;
        try {
            int i = 0;
            C1333 c1333M4688 = AbstractC2713.m4688(new C0281(AbstractC2236.m4229(), 0), C0963.f3502);
            "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>";
            C1333 c1333M4689 = AbstractC2713.m4688(AbstractC2713.m4688(AbstractC2713.m4688(c1333M4688, new C0943(9)), new C0062(bool, 5)), new C0943(10));
            final InterfaceC1433[] interfaceC1433Arr = {new C0943(11), new C0943(12)};
            Comparator comparator = new Comparator() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᤝᲁᤞᲀ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (InterfaceC1433 interfaceC1433 : interfaceC1433Arr) {
                        int iM3095 = AbstractC1272.m3095((Comparable) interfaceC1433.invoke(obj), (Comparable) interfaceC1433.invoke(obj2));
                        if (iM3095 != 0) {
                            return iM3095;
                        }
                    }
                    return 0;
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            C1332 c1332 = new C1332(c1333M4689);
            while (c1332.hasNext()) {
                arrayList.add(c1332.next());
            }
            AbstractC0744.m2315(arrayList, comparator);
            for (Object obj : arrayList) {
                String strMo1275 = ((AbstractC2927) obj).mo1275();
                Object arrayList2 = linkedHashMap.get(strMo1275);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(strMo1275, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List<AbstractC2927> list = (List) entry.getValue();
                C1836 c1836 = new C1836(list.size() + 1);
                c1836.add(new C0370(AbstractC2901.m4878(str, "/")));
                for (AbstractC2927 abstractC2927 : list) {
                    String strMo1274 = abstractC2927.mo1274();
                    String strMo1273 = abstractC2927.mo1273();
                    InterfaceC1433 interfaceC1433Mo1276 = abstractC2927.mo1276();
                    ViewOnLongClickListenerC0962 viewOnLongClickListenerC0962 = null;
                    ViewOnClickListenerC0961 viewOnClickListenerC0961 = interfaceC1433Mo1276 != null ? new ViewOnClickListenerC0961(interfaceC1433Mo1276, 0) : null;
                    InterfaceC1433 interfaceC1433Mo2142 = abstractC2927.mo2142();
                    if (interfaceC1433Mo2142 != null) {
                        viewOnLongClickListenerC0962 = new ViewOnLongClickListenerC0962(interfaceC1433Mo2142, i);
                    }
                    c1836.add(new C0373(strMo1274, strMo1273, abstractC2927, viewOnClickListenerC0961, viewOnLongClickListenerC0962));
                }
                AbstractC0745.m2316(arrayList3, AbstractC3744.m5324(c1836));
            }
            return AbstractC0739.m2305(arrayList3);
        } catch (Exception unused) {
            return C1191.f4326;
        }
    }
}
