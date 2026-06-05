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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0542Ujhhgtgfeyxiexzf implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2526Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f2527Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f2528Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3587Ujhhgtgfeyxiexzf f2529Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0542Ujhhgtgfeyxiexzf(C0544Ujhhgtgfeyxiexzf c0544Ujhhgtgfeyxiexzf, C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf, InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        this.f2527Ujhhgtgfeyxiexzf = c0544Ujhhgtgfeyxiexzf;
        this.f2528Ujhhgtgfeyxiexzf = c0627Ujhhgtgfeyxiexzf;
        this.f2529Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0219  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x0219, please report this as an issue */
    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        Object c0919feyxiexzfUjhhgtg;
        List<C0627Ujhhgtgfeyxiexzf> listM1906Ujhhgtgfeyxiexzf;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Throwable thM2409Ujhhgtgfeyxiexzf;
        Object serializable;
        int i = this.f2526Ujhhgtgfeyxiexzf;
        Object c0919feyxiexzfUjhhgtg4 = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        InterfaceC3587Ujhhgtgfeyxiexzf interfaceC3587Ujhhgtgfeyxiexzf = this.f2529Ujhhgtgfeyxiexzf;
        Object obj3 = this.f2528Ujhhgtgfeyxiexzf;
        Object obj4 = this.f2527Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C0544Ujhhgtgfeyxiexzf c0544Ujhhgtgfeyxiexzf = (C0544Ujhhgtgfeyxiexzf) obj4;
                C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) obj3;
                InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg = (InterfaceC3545feyxiexzfUjhhgtg) interfaceC3587Ujhhgtgfeyxiexzf;
                List list = (List) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3663feyxiexzfUjhhgtg) it.next()).f11657Ujhhgtgfeyxiexzf);
                }
                Set setM4256Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList);
                c0544Ujhhgtgfeyxiexzf.getClass();
                C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
                File file = new File(C0629Ujhhgtgfeyxiexzf.f2674Ujhhgtgfeyxiexzf, MagicFactory.get(4928830002746623370L, strArr));
                if (file.exists()) {
                    try {
                        C0732Ujhhgtgfeyxiexzf c0732Ujhhgtgfeyxiexzf = AbstractC0728Ujhhgtgfeyxiexzf.f2996Ujhhgtgfeyxiexzf;
                        String strM4946feyxiexzfUjhhgtg = AbstractC3445Ujhhgtgfeyxiexzf.m4946feyxiexzfUjhhgtg(file);
                        c0732Ujhhgtgfeyxiexzf.getClass();
                        c0919feyxiexzfUjhhgtg = (List) c0732Ujhhgtgfeyxiexzf.m2044Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C0627Ujhhgtgfeyxiexzf.Companion.serializer()), strM4946feyxiexzfUjhhgtg);
                    } catch (Throwable th) {
                        c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                    }
                    if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) != null) {
                        C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
                        c0919feyxiexzfUjhhgtg = C0629Ujhhgtgfeyxiexzf.m1906Ujhhgtgfeyxiexzf();
                    }
                    listM1906Ujhhgtgfeyxiexzf = (List) c0919feyxiexzfUjhhgtg;
                    break;
                } else {
                    listM1906Ujhhgtgfeyxiexzf = C0629Ujhhgtgfeyxiexzf.m1906Ujhhgtgfeyxiexzf();
                }
                boolean z = false;
                if (!listM1906Ujhhgtgfeyxiexzf.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM1906Ujhhgtgfeyxiexzf, 10));
                    boolean z2 = false;
                    for (C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf2 : listM1906Ujhhgtgfeyxiexzf) {
                        if (AbstractC1192feyxiexzfUjhhgtg.m2679feyxiexzfUjhhgtg(c0627Ujhhgtgfeyxiexzf2.f2657Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf.f2657Ujhhgtgfeyxiexzf) && c0627Ujhhgtgfeyxiexzf2.f2658Ujhhgtgfeyxiexzf == c0627Ujhhgtgfeyxiexzf.f2658Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0627Ujhhgtgfeyxiexzf2.f2659Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf)) {
                            z2 = true;
                            c0627Ujhhgtgfeyxiexzf2 = new C0627Ujhhgtgfeyxiexzf(c0627Ujhhgtgfeyxiexzf2.f2657Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf2.f2658Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf2.f2659Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf2.f2660Ujhhgtgfeyxiexzf, (String[]) setM4256Ujhhgtgfeyxiexzf.toArray(new String[0]));
                        }
                        arrayList2.add(c0627Ujhhgtgfeyxiexzf2);
                    }
                    if (z2) {
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            C0732Ujhhgtgfeyxiexzf c0732Ujhhgtgfeyxiexzf2 = AbstractC0728Ujhhgtgfeyxiexzf.f2996Ujhhgtgfeyxiexzf;
                            c0732Ujhhgtgfeyxiexzf2.getClass();
                            AbstractC3445Ujhhgtgfeyxiexzf.m4947feyxiexzfUjhhgtg(file, c0732Ujhhgtgfeyxiexzf2.m2045Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C0627Ujhhgtgfeyxiexzf.Companion.serializer()), arrayList2));
                        } catch (Throwable th2) {
                            c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th2);
                        }
                        z = !(c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg);
                    }
                    break;
                }
                if (z) {
                    interfaceC3545feyxiexzfUjhhgtg.invoke();
                } else {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928830062876165514L, strArr));
                }
                return Boolean.FALSE;
            default:
                C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = (C0416Ujhhgtgfeyxiexzf) obj4;
                String str = (String) obj3;
                InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg = (InterfaceC3549feyxiexzfUjhhgtg) interfaceC3587Ujhhgtgfeyxiexzf;
                Intent intent = (Intent) obj2;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf((String) obj, C2277Ujhhgtgfeyxiexzf.f7460Ujhhgtgfeyxiexzf ? C2277Ujhhgtgfeyxiexzf.m3472Ujhhgtgfeyxiexzf((String) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf) : C2277Ujhhgtgfeyxiexzf.m3473Ujhhgtgfeyxiexzf((Context) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf))) {
                    Class<C2679Ujhhgtgfeyxiexzf> cls = C2679Ujhhgtgfeyxiexzf.class;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String str2 = str + c0416Ujhhgtgfeyxiexzf.m1720Ujhhgtgfeyxiexzf();
                            Class<C2679Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                            if (clsM5159Ujhhgtgfeyxiexzf != null) {
                                cls = clsM5159Ujhhgtgfeyxiexzf;
                            }
                            int i2 = AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf;
                            Object serializable2 = extras.getSerializable(str2);
                            if (serializable2 == null) {
                                serializable2 = null;
                            }
                            if (AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf >= 33 && (serializable = extras.getSerializable(str2, cls)) != null) {
                                serializable2 = serializable;
                            }
                            c0919feyxiexzfUjhhgtg2 = (C2679Ujhhgtgfeyxiexzf) serializable2;
                        } else {
                            c0919feyxiexzfUjhhgtg2 = null;
                        }
                    } catch (Throwable th3) {
                        c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th3);
                    }
                    if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                    C2679Ujhhgtgfeyxiexzf c2679Ujhhgtgfeyxiexzf = (C2679Ujhhgtgfeyxiexzf) c0919feyxiexzfUjhhgtg2;
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf;
                    if (AbstractC3594Ujhhgtgfeyxiexzf.f11192Ujhhgtgfeyxiexzf && c2679Ujhhgtgfeyxiexzf != null) {
                        C2680Ujhhgtgfeyxiexzf c2680Ujhhgtgfeyxiexzf = c2679Ujhhgtgfeyxiexzf.f8566Ujhhgtgfeyxiexzf;
                        String str3 = c2680Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf;
                        Object obj5 = c2680Ujhhgtgfeyxiexzf.f8568Ujhhgtgfeyxiexzf;
                        int i3 = c2679Ujhhgtgfeyxiexzf.f8564Ujhhgtgfeyxiexzf;
                        String str4 = c2679Ujhhgtgfeyxiexzf.f8562Ujhhgtgfeyxiexzf;
                        int i4 = c2679Ujhhgtgfeyxiexzf.f8565Ujhhgtgfeyxiexzf;
                        if (c2679Ujhhgtgfeyxiexzf.f8563Ujhhgtgfeyxiexzf) {
                            try {
                                C2274Ujhhgtgfeyxiexzf c2274Ujhhgtgfeyxiexzf = (C2274Ujhhgtgfeyxiexzf) concurrentHashMap.get(str4);
                                if (c2274Ujhhgtgfeyxiexzf == null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    c2274Ujhhgtgfeyxiexzf = new C2274Ujhhgtgfeyxiexzf();
                                    c2274Ujhhgtgfeyxiexzf.f7454Ujhhgtgfeyxiexzf = arrayList3;
                                    c2274Ujhhgtgfeyxiexzf.f7455Ujhhgtgfeyxiexzf = arrayList4;
                                    c2274Ujhhgtgfeyxiexzf.f7456Ujhhgtgfeyxiexzf = arrayList5;
                                    c2274Ujhhgtgfeyxiexzf.f7457Ujhhgtgfeyxiexzf = arrayList6;
                                    concurrentHashMap.put(str4, c2274Ujhhgtgfeyxiexzf);
                                }
                                ArrayList arrayList7 = c2274Ujhhgtgfeyxiexzf.f7457Ujhhgtgfeyxiexzf;
                                ArrayList arrayList8 = c2274Ujhhgtgfeyxiexzf.f7456Ujhhgtgfeyxiexzf;
                                ArrayList arrayList9 = c2274Ujhhgtgfeyxiexzf.f7455Ujhhgtgfeyxiexzf;
                                ArrayList arrayList10 = c2274Ujhhgtgfeyxiexzf.f7454Ujhhgtgfeyxiexzf;
                                if (obj5 instanceof List) {
                                    c0919feyxiexzfUjhhgtg3 = (List) obj5;
                                    if (!arrayList10.isEmpty() || i4 <= 0) {
                                        arrayList10.add(i4, c0919feyxiexzfUjhhgtg3);
                                        if (arrayList10.size() == i3) {
                                            ArrayList arrayList11 = new ArrayList();
                                            Iterator it2 = arrayList10.iterator();
                                            while (it2.hasNext()) {
                                                arrayList11.addAll((List) it2.next());
                                            }
                                            interfaceC3549feyxiexzfUjhhgtg.invoke(arrayList11);
                                            arrayList10.clear();
                                            concurrentHashMap.remove(str4);
                                        }
                                        thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg3);
                                        if (thM2409Ujhhgtgfeyxiexzf != null) {
                                            ArrayList arrayList12 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                            C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str3 + "\"", thM2409Ujhhgtgfeyxiexzf);
                                        }
                                    }
                                } else if (obj5 instanceof Map) {
                                    c0919feyxiexzfUjhhgtg3 = (Map) obj5;
                                    if (!arrayList9.isEmpty() || i4 <= 0) {
                                        arrayList9.add(i4, c0919feyxiexzfUjhhgtg3);
                                        if (arrayList9.size() == i3) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Iterator it3 = arrayList9.iterator();
                                            while (it3.hasNext()) {
                                                for (Map.Entry entry : ((Map) it3.next()).entrySet()) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            interfaceC3549feyxiexzfUjhhgtg.invoke(linkedHashMap);
                                            arrayList9.clear();
                                            concurrentHashMap.remove(str4);
                                        }
                                        thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg3);
                                        if (thM2409Ujhhgtgfeyxiexzf != null) {
                                            ArrayList arrayList13 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                            C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str3 + "\"", thM2409Ujhhgtgfeyxiexzf);
                                        }
                                    }
                                } else if (obj5 instanceof Set) {
                                    c0919feyxiexzfUjhhgtg3 = (Set) obj5;
                                    if (!arrayList8.isEmpty() || i4 <= 0) {
                                        arrayList8.add(i4, c0919feyxiexzfUjhhgtg3);
                                        if (arrayList8.size() == i3) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            Iterator it4 = arrayList8.iterator();
                                            while (it4.hasNext()) {
                                                linkedHashSet.addAll((Set) it4.next());
                                            }
                                            interfaceC3549feyxiexzfUjhhgtg.invoke(linkedHashSet);
                                            arrayList8.clear();
                                            concurrentHashMap.remove(str4);
                                        }
                                        thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg3);
                                        if (thM2409Ujhhgtgfeyxiexzf != null) {
                                            ArrayList arrayList14 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                            C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str3 + "\"", thM2409Ujhhgtgfeyxiexzf);
                                        }
                                    }
                                } else {
                                    if (obj5 instanceof String) {
                                        c0919feyxiexzfUjhhgtg3 = (String) obj5;
                                        if (!arrayList7.isEmpty() || i4 <= 0) {
                                            arrayList7.add(i4, c0919feyxiexzfUjhhgtg3);
                                            if (arrayList7.size() == i3) {
                                                StringBuilder sb = new StringBuilder();
                                                Iterator it5 = arrayList7.iterator();
                                                while (it5.hasNext()) {
                                                    sb.append((String) it5.next());
                                                }
                                                interfaceC3549feyxiexzfUjhhgtg.invoke(sb.toString());
                                                arrayList7.clear();
                                                concurrentHashMap.remove(str4);
                                            }
                                        }
                                    } else {
                                        ArrayList arrayList15 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                        C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(6, "Unsupported segments data key of \"" + str3 + "\"'s type", null);
                                        c0919feyxiexzfUjhhgtg3 = c0919feyxiexzfUjhhgtg4;
                                    }
                                    thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg3);
                                    if (thM2409Ujhhgtgfeyxiexzf != null) {
                                        ArrayList arrayList16 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                        C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str3 + "\"", thM2409Ujhhgtgfeyxiexzf);
                                    }
                                }
                            } catch (Throwable th4) {
                                c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th4);
                            }
                        } else if (obj5 != null) {
                            interfaceC3549feyxiexzfUjhhgtg.invoke(obj5);
                        }
                    }
                    break;
                }
                return c0919feyxiexzfUjhhgtg4;
        }
    }

    public /* synthetic */ C0542Ujhhgtgfeyxiexzf(C2277Ujhhgtgfeyxiexzf c2277Ujhhgtgfeyxiexzf, C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf, String str, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        this.f2527Ujhhgtgfeyxiexzf = c0416Ujhhgtgfeyxiexzf;
        this.f2528Ujhhgtgfeyxiexzf = str;
        this.f2529Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtg;
    }
}
