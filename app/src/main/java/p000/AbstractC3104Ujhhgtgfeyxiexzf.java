package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳ能不能ᛱfeyxiexzfᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3104Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f9650Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2975feyxiexzfUjhhgtg(24));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static List m4630Ujhhgtgfeyxiexzf(Boolean bool) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        try {
            int i = 0;
            C3455feyxiexzfUjhhgtg c3455feyxiexzfUjhhgtg = new C3455feyxiexzfUjhhgtg(new C2399Ujhhgtgfeyxiexzf(0, AbstractC0217Ujhhgtgfeyxiexzf.m1325Ujhhgtgfeyxiexzf()), C3103Ujhhgtgfeyxiexzf.f9649Ujhhgtgfeyxiexzf, 0);
            MagicFactory.get(4928282003574359434L, strArr);
            C3455feyxiexzfUjhhgtg c3455feyxiexzfUjhhgtg2 = new C3455feyxiexzfUjhhgtg(new C3455feyxiexzfUjhhgtg(new C3455feyxiexzfUjhhgtg(c3455feyxiexzfUjhhgtg, new C3083Ujhhgtgfeyxiexzf(7), 0), new C2925Ujhhgtgfeyxiexzf(5, bool), 0), new C3083Ujhhgtgfeyxiexzf(8), 0);
            final InterfaceC3549feyxiexzfUjhhgtg[] interfaceC3549feyxiexzfUjhhgtgArr = {new C3083Ujhhgtgfeyxiexzf(9), new C3083Ujhhgtgfeyxiexzf(10)};
            Comparator comparator = new Comparator() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛴᛳ要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg : interfaceC3549feyxiexzfUjhhgtgArr) {
                        int iM3274Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3274Ujhhgtgfeyxiexzf((Comparable) interfaceC3549feyxiexzfUjhhgtg.invoke(obj), (Comparable) interfaceC3549feyxiexzfUjhhgtg.invoke(obj2));
                        if (iM3274Ujhhgtgfeyxiexzf != 0) {
                            return iM3274Ujhhgtgfeyxiexzf;
                        }
                    }
                    return 0;
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            C3447Ujhhgtgfeyxiexzf c3447Ujhhgtgfeyxiexzf = new C3447Ujhhgtgfeyxiexzf(c3455feyxiexzfUjhhgtg2);
            while (c3447Ujhhgtgfeyxiexzf.hasNext()) {
                arrayList.add(c3447Ujhhgtgfeyxiexzf.next());
            }
            AbstractC2861Ujhhgtgfeyxiexzf.m4265feyxiexzfUjhhgtg(arrayList, comparator);
            for (Object obj : arrayList) {
                String strMo1480feyxiexzfUjhhgtg = ((AbstractC2059Ujhhgtgfeyxiexzf) obj).mo1480feyxiexzfUjhhgtg();
                Object arrayList2 = linkedHashMap.get(strMo1480feyxiexzfUjhhgtg);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(strMo1480feyxiexzfUjhhgtg, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List<AbstractC2059Ujhhgtgfeyxiexzf> list = (List) entry.getValue();
                C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = new C0094Ujhhgtgfeyxiexzf(list.size() + 1);
                c0094Ujhhgtgfeyxiexzf.add(new C2508feyxiexzfUjhhgtg(AbstractC1152feyxiexzfUjhhgtg.m2640Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928338624128222602L, strArr))));
                for (AbstractC2059Ujhhgtgfeyxiexzf abstractC2059Ujhhgtgfeyxiexzf : list) {
                    String strMo1479feyxiexzfUjhhgtg = abstractC2059Ujhhgtgfeyxiexzf.mo1479feyxiexzfUjhhgtg();
                    String strMo1478feyxiexzfUjhhgtg = abstractC2059Ujhhgtgfeyxiexzf.mo1478feyxiexzfUjhhgtg();
                    InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtgMo1481feyxiexzfUjhhgtg = abstractC2059Ujhhgtgfeyxiexzf.mo1481feyxiexzfUjhhgtg();
                    ViewOnLongClickListenerC3075Ujhhgtgfeyxiexzf viewOnLongClickListenerC3075Ujhhgtgfeyxiexzf = null;
                    ViewOnClickListenerC3076Ujhhgtgfeyxiexzf viewOnClickListenerC3076Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtgMo1481feyxiexzfUjhhgtg != null ? new ViewOnClickListenerC3076Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtgMo1481feyxiexzfUjhhgtg, 0) : null;
                    InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtgMo2873feyxiexzfUjhhgtg = abstractC2059Ujhhgtgfeyxiexzf.mo2873feyxiexzfUjhhgtg();
                    if (interfaceC3549feyxiexzfUjhhgtgMo2873feyxiexzfUjhhgtg != null) {
                        viewOnLongClickListenerC3075Ujhhgtgfeyxiexzf = new ViewOnLongClickListenerC3075Ujhhgtgfeyxiexzf(i, interfaceC3549feyxiexzfUjhhgtgMo2873feyxiexzfUjhhgtg);
                    }
                    c0094Ujhhgtgfeyxiexzf.add(new C2486feyxiexzfUjhhgtg(strMo1479feyxiexzfUjhhgtg, strMo1478feyxiexzfUjhhgtg, abstractC2059Ujhhgtgfeyxiexzf, viewOnClickListenerC3076Ujhhgtgfeyxiexzf, viewOnLongClickListenerC3075Ujhhgtgfeyxiexzf));
                }
                AbstractC2862feyxiexzfUjhhgtg.m4266feyxiexzfUjhhgtg(arrayList3, AbstractC1245feyxiexzfUjhhgtg.m2746Ujhhgtgfeyxiexzf(c0094Ujhhgtgfeyxiexzf));
            }
            return AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(arrayList3);
        } catch (Exception unused) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
    }
}
