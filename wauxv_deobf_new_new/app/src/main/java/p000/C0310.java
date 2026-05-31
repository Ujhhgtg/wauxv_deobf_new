package p000;

import android.widget.BaseAdapter;
import android.widget.ListView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᲇᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0310 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1592;

    public /* synthetic */ C0310(Object obj, int i, Object obj2) {
        this.f1590 = i;
        this.f1591 = obj;
        this.f1592 = obj2;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String[] strArrNames;
        switch (this.f1590) {
            case 0:
                C2041 c2041 = (C2041) this.f1591;
                C0713 c0713 = (C0713) this.f1592;
                C0312 c0312 = C0312.f1594;
                Long lM4915 = AbstractC2908.m4915(String.valueOf(c2041.f6811.getText()));
                c0312.m2670(lM4915 != null ? lM4915.longValue() : 86400L);
                C0311.f1593.m2671(AbstractC0739.m2308((Set) c0713.f2721));
                return C3554.UNIT;
            case 1:
                C0310 c0310 = (C0310) this.f1591;
                C2950 c2950 = (C2950) this.f1592;
                c0310.invoke();
                C0615.f2456.getClass();
                C0615.m2140(c2950, c0310);
                return C3554.UNIT;
            case 2:
                BaseAdapter baseAdapter = (BaseAdapter) this.f1591;
                ListView listView = (ListView) this.f1592;
                C0919.f3411.getClass();
                AbstractC0972.m2610(C0918.f3410).invoke(baseAdapter, Boolean.TRUE);
                C0854.f3277.getClass();
                AbstractC0972.m2610(C0853.f3276).invoke(listView, null);
                baseAdapter.notifyDataSetChanged();
                return C3554.UNIT;
            case 3:
                InterfaceC2715 interfaceC2715 = (InterfaceC2715) this.f1591;
                AbstractC1725 abstractC1725 = (AbstractC1725) this.f1592;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1732 c1732 = abstractC1725.f5842;
                AbstractC1467.m3281(abstractC1725, interfaceC2715);
                int iMo3641 = interfaceC2715.mo3641();
                for (int i = 0; i < iMo3641; i++) {
                    List listMo3643 = interfaceC2715.mo3643(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listMo3643) {
                        if (obj instanceof InterfaceC1746) {
                            arrayList.add(obj);
                        }
                    }
                    InterfaceC1746 interfaceC1746 = (InterfaceC1746) AbstractC0739.m2299(arrayList);
                    if (interfaceC1746 != null && (strArrNames = interfaceC1746.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = AbstractC1469.m3322(interfaceC2715.mo3640(), C2719.f8737) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new C1734(AbstractC2234.m4167(-1, "The suggested name '" + str + "' for " + str2 + ' ' + interfaceC2715.mo3642(i) + " is already one of the names for " + str2 + ' ' + interfaceC2715.mo3642(((Number) AbstractC1924.m3871(linkedHashMap, str)).intValue()) + " in " + interfaceC2715, null, null, null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C1192.f4327 : linkedHashMap;
            case 4:
                C1270 c1270 = new C1270((String) ((C2933) ((C0519) this.f1591).f2208).getValue(), (String) this.f1592);
                String str3 = "WAuxiliary";
                if (str3.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                c1270.f4603 = new C0378(str3.charAt(0));
                String str4 = c1270.f4601 + c1270.f4602;
                ConcurrentHashMap concurrentHashMap = C1270.f4600;
                SharedPreferencesC1271 sharedPreferencesC1271 = (SharedPreferencesC1271) concurrentHashMap.get(str4);
                if (sharedPreferencesC1271 == null) {
                    synchronized (C1270.class) {
                        try {
                            sharedPreferencesC1271 = (SharedPreferencesC1271) concurrentHashMap.get(str4);
                            if (sharedPreferencesC1271 == null) {
                                SharedPreferencesC1271 sharedPreferencesC1272 = new SharedPreferencesC1271(c1270.f4601, c1270.f4602, null, c1270.f4603, 0);
                                concurrentHashMap.put(str4, sharedPreferencesC1272);
                                sharedPreferencesC1271 = sharedPreferencesC1272;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return sharedPreferencesC1271;
            case 5:
                String str5 = (String) this.f1591;
                C2421 c2421 = new C2421((Consumer) this.f1592, 1);
                C2204 c2204 = C2204.f7254;
                String[] strArr = AbstractC1471.f5234;
                LinkedList linkedList = new LinkedList();
                String str6 = "";
                String str7 = "";
                c2204.getClass();
                Object objNewInstance = AbstractC0972.m2609(C2203.f7253).newInstance(str5, linkedList, 1, str6, str7, 0, 1089, null);
                C2213 c2213 = C2213.f7263;
                C2198 c2198 = new C2198(c2421, 0);
                c2213.getClass();
                C2213.m4154(objNewInstance, c2198);
                return C3554.UNIT;
            case 6:
                C2579 c2579 = (C2579) this.f1591;
                CharSequence charSequence = (CharSequence) this.f1592;
                return AbstractC1272.m3093(c2579.f8199.matcher(charSequence), 0, charSequence);
            default:
                C1693 c1693 = (C1693) this.f1591;
                ArrayList arrayList2 = (ArrayList) this.f1592;
                if (((MaterialRadioButton) c1693.f5698).isChecked()) {
                    C2939.f9395.m2669(EnumC2935.f9387.f9390);
                    C2940.f9396.m2671(AbstractC0739.m2308(arrayList2));
                } else if (((MaterialRadioButton) c1693.f5696).isChecked()) {
                    C2939.f9395.m2669(EnumC2935.f9388.f9390);
                    C2938.f9394.m2671(AbstractC0739.m2308(arrayList2));
                }
                return C3554.UNIT;
        }
    }
}
