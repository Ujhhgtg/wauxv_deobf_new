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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1502 implements InterfaceC1429 {

    public final /* synthetic */ int f5308 = 0;

    public final /* synthetic */ Object f5309;

    public final /* synthetic */ Object f5310;

    public final /* synthetic */ InterfaceC1436 f5311;

    public /* synthetic */ C1502(C1503 c1503, C1484 c1484, C0106 c0106) {
        this.f5309 = c1503;
        this.f5310 = c1484;
        this.f5311 = c0106;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01ff, please report this as an issue */
    @Override // p000.InterfaceC1429
    public final Object mo1196(Object obj, Object obj2) {
        Object c2585;
        List<C1484> listM3243;
        Object c2586;
        Object c2587;
        Throwable thM4594;
        int i = 0;
        Object c2588 = Unit.INSTANCE;
        InterfaceC1436 interfaceC1436 = this.f5311;
        Object obj3 = this.f5310;
        Object obj4 = this.f5309;
        switch (0) {
            case 0:
                C1503 c1503 = (C1503) obj4;
                C1484 c1484 = (C1484) obj3;
                C0106 c0106 = (C0106) interfaceC1436;
                List list = (List) obj;
                String[] strArr = AbstractC1574.f5469;
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0801) it.next()).f3160);
                }
                Set setM2209 = AbstractC0744.m2209(arrayList);
                
                
                File file = new File(C1486.f5276, "groupItemsV2.json");
                if (file.exists()) {
                    try {
                        C1706 c1706 = C1706.f5798;
                        String strM3043 = AbstractC1328.m3043(file);
                        
                        c2585 = (List) c1706.m3468(new C0258(C1484.Companion.serializer()), strM3043);
                    } catch (Throwable th) {
                        c2585 = new C2585(th);
                    }
                    if (C2586.m4594(c2585) != null) {
                        
                        c2585 = C1486.m3243();
                    }
                    listM3243 = (List) c2585;
                    break;
                } else {
                    listM3243 = C1486.m3243();
                }
                boolean z = false;
                if (!listM3243.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(listM3243, 10));
                    boolean z2 = false;
                    for (C1484 c1485 : listM3243) {
                        if (AbstractC2849.m4855(c1485.f5259, c1484.f5259) && c1485.f5260 == c1484.f5260 && AbstractC2207.m4087(c1485.f5261, c1484.f5261)) {
                            z2 = true;
                            c1485 = new C1484(c1485.f5259, c1485.f5260, c1485.f5261, c1485.f5262, (String[]) setM2209.toArray(new String[0]));
                        }
                        arrayList2.add(c1485);
                    }
                    if (z2) {
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            C1706 c1707 = C1706.f5798;
                            
                            AbstractC1328.m3044(file, c1707.m3469(new C0258(C1484.Companion.serializer()), arrayList2));
                        } catch (Throwable th2) {
                            c2588 = new C2585(th2);
                        }
                        z = !(c2588 instanceof C2585);
                    }
                    break;
                }
                if (false) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("保存成功, 重启");
                    
                    sb.append((String) C1565.f5447.m1086(C1565.f5441[5]));
                    sb.append("生效");
                    AbstractC2834.m4823(null, 3, sb.toString());
                    c0106.invoke();
                } else {
                    AbstractC2834.m4823(null, 3, "保存失败");
                }
                return Boolean.FALSE;
            default:
                C2103 c2103 = (C2103) obj4;
                String str = (String) obj3;
                InterfaceC1425 interfaceC1425 = (InterfaceC1425) interfaceC1436;
                Intent intent = (Intent) obj2;
                if (AbstractC2207.m4087((String) obj, C3686.f11576 ? C3686.m5343((String) c2103.f6936) : C3686.m5344((Context) c2103.f6935))) {
                    try {
                        Bundle extras = intent.getExtras();
                        Object serializable = extras != null ? extras.getSerializable(str + c2103.m3916()) : null;
                        c2586 = serializable instanceof C0589 ? (C0589) serializable : null;
                    } catch (Throwable th3) {
                        c2586 = new C2585(th3);
                    }
                    if (c2586 instanceof C2585) {
                        c2586 = null;
                    }
                    C0589 c0589 = (C0589) c2586;
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2103.f6937;
                    if (AbstractC2205.f7173 && c0589 != null) {
                        C0588 c0588 = c0589.f2395;
                        String str2 = c0588.f2389;
                        Object obj5 = c0588.f2390;
                        int i2 = c0589.f2393;
                        String str3 = c0589.f2391;
                        int i3 = c0589.f2394;
                        if (c0589.f2392) {
                            try {
                                C3685 c3685 = (C3685) concurrentHashMap.get(str3);
                                if (c3685 == null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    c3685 = new C3685();
                                    c3685.f11572 = arrayList3;
                                    c3685.f11573 = arrayList4;
                                    c3685.f11574 = arrayList5;
                                    c3685.f11575 = arrayList6;
                                    concurrentHashMap.put(str3, c3685);
                                }
                                ArrayList arrayList7 = c3685.f11575;
                                ArrayList arrayList8 = c3685.f11574;
                                ArrayList arrayList9 = c3685.f11573;
                                ArrayList arrayList10 = c3685.f11572;
                                if (obj5 instanceof List) {
                                    c2587 = (List) obj5;
                                    if (!arrayList10.isEmpty() || i3 <= 0) {
                                        arrayList10.add(i3, c2587);
                                        if (arrayList10.size() == i2) {
                                            ArrayList arrayList11 = new ArrayList();
                                            Iterator it2 = arrayList10.iterator();
                                            while (it2.hasNext()) {
                                                arrayList11.addAll((List) it2.next());
                                            }
                                            interfaceC1425.invoke(arrayList11);
                                            arrayList10.clear();
                                            concurrentHashMap.remove(str3);
                                        }
                                        thM4594 = C2586.m4594(c2587);
                                        if (thM4594 != null) {
                                            ArrayList arrayList12 = C3678.f11549;
                                            C3678.m5308(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4594);
                                        }
                                    }
                                } else if (obj5 instanceof Map) {
                                    c2587 = (Map) obj5;
                                    if (!arrayList9.isEmpty() || i3 <= 0) {
                                        arrayList9.add(i3, c2587);
                                        if (arrayList9.size() == i2) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Iterator it3 = arrayList9.iterator();
                                            while (it3.hasNext()) {
                                                for (Map.Entry entry : ((Map) it3.next()).entrySet()) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            interfaceC1425.invoke(linkedHashMap);
                                            arrayList9.clear();
                                            concurrentHashMap.remove(str3);
                                        }
                                        thM4594 = C2586.m4594(c2587);
                                        if (thM4594 != null) {
                                            ArrayList arrayList13 = C3678.f11549;
                                            C3678.m5308(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4594);
                                        }
                                    }
                                } else if (obj5 instanceof Set) {
                                    c2587 = (Set) obj5;
                                    if (!arrayList8.isEmpty() || i3 <= 0) {
                                        arrayList8.add(i3, c2587);
                                        if (arrayList8.size() == i2) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            Iterator it4 = arrayList8.iterator();
                                            while (it4.hasNext()) {
                                                linkedHashSet.addAll((Set) it4.next());
                                            }
                                            interfaceC1425.invoke(linkedHashSet);
                                            arrayList8.clear();
                                            concurrentHashMap.remove(str3);
                                        }
                                        thM4594 = C2586.m4594(c2587);
                                        if (thM4594 != null) {
                                            ArrayList arrayList14 = C3678.f11549;
                                            C3678.m5308(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4594);
                                        }
                                    }
                                } else {
                                    if (obj5 instanceof String) {
                                        c2587 = (String) obj5;
                                        if (!arrayList7.isEmpty() || i3 <= 0) {
                                            arrayList7.add(i3, c2587);
                                            if (arrayList7.size() == i2) {
                                                StringBuilder sb2 = new StringBuilder();
                                                Iterator it5 = arrayList7.iterator();
                                                while (it5.hasNext()) {
                                                    sb2.append((String) it5.next());
                                                }
                                                interfaceC1425.invoke(sb2.toString());
                                                arrayList7.clear();
                                                concurrentHashMap.remove(str3);
                                            }
                                        }
                                    } else {
                                        ArrayList arrayList15 = C3678.f11549;
                                        C3678.m5308(6, "Unsupported segments data key of \"" + str2 + "\"'s type", null);
                                        c2587 = c2588;
                                    }
                                    thM4594 = C2586.m4594(c2587);
                                    if (thM4594 != null) {
                                        ArrayList arrayList16 = C3678.f11549;
                                        C3678.m5308(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str2 + "\"", thM4594);
                                    }
                                }
                            } catch (Throwable th4) {
                                c2587 = new C2585(th4);
                            }
                        } else if (obj5 != null) {
                            interfaceC1425.invoke(obj5);
                        }
                    }
                    break;
                }
                return c2588;
        }
    }

    public /* synthetic */ C1502(C3686 c3686, C2103 c2103, String str, InterfaceC1425 interfaceC1425) {
        this.f5309 = c2103;
        this.f5310 = str;
        this.f5311 = interfaceC1425;
    }
}
