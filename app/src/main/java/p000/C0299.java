package p000;

import android.widget.BaseAdapter;
import android.widget.ListView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᲇᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0299 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1517;

    public /* synthetic */ C0299(Object obj, int i, Object obj2) {
        this.f1515 = i;
        this.f1516 = obj;
        this.f1517 = obj2;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        String[] strArrNames;
        switch (this.f1515) {
            case 0:
                C2012 c2012 = (C2012) this.f1516;
                C0718 c0718 = (C0718) this.f1517;
                C0301 c0301 = C0301.f1519;
                Long lM4854 = AbstractC2848.m4854(String.valueOf(c2012.f6709.getText()));
                c0301.m2546(lM4854 != null ? lM4854.longValue() : 86400L);
                C0300.f1518.m2547(AbstractC0744.m2209((Set) c0718.f2727));
                return C3497.f10997;
            case 1:
                BaseAdapter baseAdapter = (BaseAdapter) this.f1516;
                ListView listView = (ListView) this.f1517;
                C0920.f3404.getClass();
                AbstractC1574.m3315(C0919.f3403).invoke(baseAdapter, Boolean.TRUE);
                C0855.f3270.getClass();
                AbstractC1574.m3315(C0854.f3269).invoke(listView, null);
                baseAdapter.notifyDataSetChanged();
                return C3497.f10997;
            case 2:
                InterfaceC2654 interfaceC2654 = (InterfaceC2654) this.f1516;
                C1706 c1706 = (C1706) this.f1517;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c1706.f5799.getClass();
                AbstractC1459.m3194(c1706, interfaceC2654);
                int iMo3473 = interfaceC2654.mo3473();
                for (int i = 0; i < iMo3473; i++) {
                    List listMo3475 = interfaceC2654.mo3475(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listMo3475) {
                        if (obj instanceof InterfaceC1722) {
                            arrayList.add(obj);
                        }
                    }
                    InterfaceC1722 interfaceC1722 = (InterfaceC1722) AbstractC0744.m2200(arrayList);
                    if (interfaceC1722 != null && (strArrNames = interfaceC1722.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = AbstractC2207.m4087(interfaceC2654.mo3472(), C2658.f8572) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new C1713(AbstractC3681.m5327(-1, "The suggested name '" + str + "' for " + str2 + ' ' + interfaceC2654.mo3474(i) + " is already one of the names for " + str2 + ' ' + interfaceC2654.mo3474(((Number) AbstractC1898.m3692(linkedHashMap, str)).intValue()) + " in " + interfaceC2654, null, null, null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C1190.f4330 : linkedHashMap;
            case 3:
                C1268 c1268 = new C1268((String) ((C2873) ((C0542) this.f1516).f2252).getValue(), (String) this.f1517);
                String str3 = "WAuxiliary";
                if (str3.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                c1268.f4604 = new C0403(str3.charAt(0));
                String str4 = c1268.f4602 + c1268.f4603;
                ConcurrentHashMap concurrentHashMap = C1268.f4601;
                SharedPreferencesC1269 sharedPreferencesC1269 = (SharedPreferencesC1269) concurrentHashMap.get(str4);
                if (sharedPreferencesC1269 == null) {
                    synchronized (C1268.class) {
                        try {
                            sharedPreferencesC1269 = (SharedPreferencesC1269) concurrentHashMap.get(str4);
                            if (sharedPreferencesC1269 == null) {
                                SharedPreferencesC1269 sharedPreferencesC12610 = new SharedPreferencesC1269(c1268.f4602, c1268.f4603, null, c1268.f4604, 0);
                                concurrentHashMap.put(str4, sharedPreferencesC12610);
                                sharedPreferencesC1269 = sharedPreferencesC12610;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return sharedPreferencesC1269;
            case 4:
                String str5 = (String) this.f1516;
                C2372 c2372 = new C2372((Consumer) this.f1517, 1);
                C2169 c2169 = C2169.f7130;
                String[] strArr = AbstractC1574.f5469;
                LinkedList linkedList = new LinkedList();
                String str6 = "";
                String str7 = "";
                c2169.getClass();
                Object objNewInstance = AbstractC1574.m3314(C2168.f7129).newInstance(str5, linkedList, 1, str6, str7, 0, 1089, null);
                C2180 c2180 = C2180.f7141;
                C2165 c2165 = new C2165(c2372, 1);
                c2180.getClass();
                C2180.m3961(objNewInstance, c2165);
                return C3497.f10997;
            case 5:
                C2523 c2523 = (C2523) this.f1516;
                CharSequence charSequence = (CharSequence) this.f1517;
                return AbstractC2209.m4123(c2523.f8049.matcher(charSequence), 0, charSequence);
            default:
                C0243 c0243 = (C0243) this.f1516;
                ArrayList arrayList2 = (ArrayList) this.f1517;
                if (((MaterialRadioButton) c0243.f1406).isChecked()) {
                    C2880.f9228.m2545(EnumC2876.f9220.f9223);
                    C2881.f9229.m2547(AbstractC0744.m2209(arrayList2));
                } else if (((MaterialRadioButton) c0243.f1405).isChecked()) {
                    C2880.f9228.m2545(EnumC2876.f9221.f9223);
                    C2879.f9227.m2547(AbstractC0744.m2209(arrayList2));
                }
                return C3497.f10997;
        }
    }
}
