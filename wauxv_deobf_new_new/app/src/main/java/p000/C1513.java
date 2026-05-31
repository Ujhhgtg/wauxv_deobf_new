package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲈᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1513 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5337 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f5338;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f5339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1444 f5340;

    public /* synthetic */ C1513(C1515 c1515, C1496 c1496, InterfaceC1422 interfaceC1422) {
        this.f5338 = c1515;
        this.f5339 = c1496;
        this.f5340 = interfaceC1422;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01ff, please report this as an issue */
    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        Object c2641;
        List<C1496> listM3422;
        Object c2642;
        Object c2643;
        Throwable thM4616;
        int i = this.f5337;
        Object c2644 = C3554.UNIT;
        InterfaceC1444 interfaceC1444 = this.f5340;
        Object obj3 = this.f5339;
        Object obj4 = this.f5338;
        switch (i) {
            case 0:
                C1515 c1515 = (C1515) obj4;
                C1496 c1496 = (C1496) obj3;
                InterfaceC1422 interfaceC1422 = (InterfaceC1422) interfaceC1444;
                List list = (List) obj;
                String[] strArr = AbstractC1471.f5234;
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0800) it.next()).f3167);
                }
                Set setM2308 = AbstractC0739.m2308(arrayList);
                c1515.getClass();
                C1498.f5308.getClass();
                File file = new File(C1498.f5309, "groupItemsV2.json");
                if (file.exists()) {
                    try {
                        C1724 c1724 = AbstractC1725.f5841;
                        String strM3146 = AbstractC1330.m3146(file);
                        c1724.getClass();
                        c2641 = (List) c1724.m3636(new C0268(C1496.Companion.serializer()), strM3146);
                    } catch (Throwable th) {
                        c2641 = new C2641(th);
                    }
                    if (C2642.m4616(c2641) != null) {
                        C1498.f5308.getClass();
                        c2641 = C1498.m3422();
                    }
                    listM3422 = (List) c2641;
                    break;
                } else {
                    listM3422 = C1498.m3422();
                }
                boolean z = false;
                if (!listM3422.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(listM3422, 10));
                    boolean z2 = false;
                    for (C1496 c1497 : listM3422) {
                        if (AbstractC2909.m4916(c1497.f5292, c1496.f5292) && c1497.f5293 == c1496.f5293 && AbstractC1469.m3322(c1497.f5294, c1496.f5294)) {
                            z2 = true;
                            c1497 = new C1496(c1497.f5292, c1497.f5293, c1497.f5294, c1497.f5295, (String[]) setM2308.toArray(new String[0]));
                        }
                        arrayList2.add(c1497);
                    }
                    if (z2) {
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            C1724 c1725 = AbstractC1725.f5841;
                            c1725.getClass();
                            AbstractC1330.m3147(file, c1725.m3637(new C0268(C1496.Companion.serializer()), arrayList2));
                        } catch (Throwable th2) {
                            c2644 = new C2641(th2);
                        }
                        z = !(c2644 instanceof C2641);
                    }
                    break;
                }
                if (z) {
                    interfaceC1422.invoke();
                } else {
                    AbstractC2894.m4856(null, 3, "保存失败");
                }
                return Boolean.FALSE;
            default:
                C2136 c2136 = (C2136) obj4;
                String str = (String) obj3;
                InterfaceC1433 interfaceC1433 = (InterfaceC1433) interfaceC1444;
                Intent intent = (Intent) obj2;
                if (AbstractC1469.m3322((String) obj, C3749.f11733 ? C3749.m5351((String) c2136.f7060) : C3749.m5352((Context) c2136.f7059))) {
                    try {
                        Bundle extras = intent.getExtras();
                        Object serializable = extras != null ? extras.getSerializable(str + c2136.m4100()) : null;
                        c2642 = serializable instanceof C0570 ? (C0570) serializable : null;
                    } catch (Throwable th3) {
                        c2642 = new C2641(th3);
                    }
                    if (c2642 instanceof C2641) {
                        c2642 = null;
                    }
                    C0570 c0570 = (C0570) c2642;
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2136.f7061;
                    if (AbstractC2240.f7305 && c0570 != null) {
                        C0569 c0569 = c0570.f2361;
                        String str2 = c0569.f2355;
                        Object obj5 = c0569.f2356;
                        int i2 = c0570.f2359;
                        String str3 = c0570.f2357;
                        int i3 = c0570.f2360;
                        if (c0570.f2358) {
                            try {
                                C3748 c3748 = (C3748) concurrentHashMap.get(str3);
                                if (c3748 == null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    c3748 = new C3748();
                                    c3748.f11729 = arrayList3;
                                    c3748.f11730 = arrayList4;
                                    c3748.f11731 = arrayList5;
                                    c3748.f11732 = arrayList6;
                                    concurrentHashMap.put(str3, c3748);
                                }
                                ArrayList arrayList7 = c3748.f11732;
                                ArrayList arrayList8 = c3748.f11731;
                                ArrayList arrayList9 = c3748.f11730;
                                ArrayList arrayList10 = c3748.f11729;
                                if (obj5 instanceof List) {
                                    c2643 = (List) obj5;
                                    if (!arrayList10.isEmpty() || i3 <= 0) {
                                        arrayList10.add(i3, c2643);
                                        if (arrayList10.size() == i2) {
                                            ArrayList arrayList11 = new ArrayList();
                                            Iterator it2 = arrayList10.iterator();
                                            while (it2.hasNext()) {
                                                arrayList11.addAll((List) it2.next());
                                            }
                                            interfaceC1433.invoke(arrayList11);
                                            arrayList10.clear();
                                            concurrentHashMap.remove(str3);
                                        }
                                        thM4616 = C2642.m4616(c2643);
                                        if (thM4616 != null) {
                                            ArrayList arrayList12 = C3741.f11709;
                                            C3741.m5317(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4616);
                                        }
                                    }
                                } else if (obj5 instanceof Map) {
                                    c2643 = (Map) obj5;
                                    if (!arrayList9.isEmpty() || i3 <= 0) {
                                        arrayList9.add(i3, c2643);
                                        if (arrayList9.size() == i2) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Iterator it3 = arrayList9.iterator();
                                            while (it3.hasNext()) {
                                                for (Map.Entry entry : ((Map) it3.next()).entrySet()) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            interfaceC1433.invoke(linkedHashMap);
                                            arrayList9.clear();
                                            concurrentHashMap.remove(str3);
                                        }
                                        thM4616 = C2642.m4616(c2643);
                                        if (thM4616 != null) {
                                            ArrayList arrayList13 = C3741.f11709;
                                            C3741.m5317(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4616);
                                        }
                                    }
                                } else if (obj5 instanceof Set) {
                                    c2643 = (Set) obj5;
                                    if (!arrayList8.isEmpty() || i3 <= 0) {
                                        arrayList8.add(i3, c2643);
                                        if (arrayList8.size() == i2) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            Iterator it4 = arrayList8.iterator();
                                            while (it4.hasNext()) {
                                                linkedHashSet.addAll((Set) it4.next());
                                            }
                                            interfaceC1433.invoke(linkedHashSet);
                                            arrayList8.clear();
                                            concurrentHashMap.remove(str3);
                                        }
                                        thM4616 = C2642.m4616(c2643);
                                        if (thM4616 != null) {
                                            ArrayList arrayList14 = C3741.f11709;
                                            C3741.m5317(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4616);
                                        }
                                    }
                                } else {
                                    if (obj5 instanceof String) {
                                        c2643 = (String) obj5;
                                        if (!arrayList7.isEmpty() || i3 <= 0) {
                                            arrayList7.add(i3, c2643);
                                            if (arrayList7.size() == i2) {
                                                StringBuilder sb = new StringBuilder();
                                                Iterator it5 = arrayList7.iterator();
                                                while (it5.hasNext()) {
                                                    sb.append((String) it5.next());
                                                }
                                                interfaceC1433.invoke(sb.toString());
                                                arrayList7.clear();
                                                concurrentHashMap.remove(str3);
                                            }
                                        }
                                    } else {
                                        ArrayList arrayList15 = C3741.f11709;
                                        C3741.m5317(6, "Unsupported segments data key of \"" + str2 + "\"'s type", null);
                                        c2643 = c2644;
                                    }
                                    thM4616 = C2642.m4616(c2643);
                                    if (thM4616 != null) {
                                        ArrayList arrayList16 = C3741.f11709;
                                        C3741.m5317(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4616);
                                    }
                                }
                            } catch (Throwable th4) {
                                c2643 = new C2641(th4);
                            }
                        } else if (obj5 != null) {
                            interfaceC1433.invoke(obj5);
                        }
                    }
                    break;
                }
                return c2644;
        }
    }

    public /* synthetic */ C1513(C3749 c3749, C2136 c2136, String str, InterfaceC1433 interfaceC1433) {
        this.f5338 = c2136;
        this.f5339 = str;
        this.f5340 = interfaceC1433;
    }
}
