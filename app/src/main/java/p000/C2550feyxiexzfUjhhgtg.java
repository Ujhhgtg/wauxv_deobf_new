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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛳᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2550feyxiexzfUjhhgtg implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8275Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8276Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8277Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2550feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f8275Ujhhgtgfeyxiexzf = i;
        this.f8276Ujhhgtgfeyxiexzf = obj;
        this.f8277Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        String[] strArrNames;
        switch (this.f8275Ujhhgtgfeyxiexzf) {
            case 0:
                C0319Ujhhgtgfeyxiexzf c0319Ujhhgtgfeyxiexzf = (C0319Ujhhgtgfeyxiexzf) this.f8276Ujhhgtgfeyxiexzf;
                C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg = (C2823feyxiexzfUjhhgtg) this.f8277Ujhhgtgfeyxiexzf;
                C2552feyxiexzfUjhhgtg c2552feyxiexzfUjhhgtg = C2552feyxiexzfUjhhgtg.f8279Ujhhgtgfeyxiexzf;
                Long lM2674feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2674feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0319Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf));
                c2552feyxiexzfUjhhgtg.m4627Ujhhgtgfeyxiexzf(lM2674feyxiexzfUjhhgtg != null ? lM2674feyxiexzfUjhhgtg.longValue() : 86400L);
                C2551feyxiexzfUjhhgtg.f8278Ujhhgtgfeyxiexzf.m4628Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf((Set) c2823feyxiexzfUjhhgtg.f8980Ujhhgtgfeyxiexzf));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 1:
                C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg = (C2550feyxiexzfUjhhgtg) this.f8276Ujhhgtgfeyxiexzf;
                C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = (C1981Ujhhgtgfeyxiexzf) this.f8277Ujhhgtgfeyxiexzf;
                c2550feyxiexzfUjhhgtg.invoke();
                C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf.getClass();
                C2726Ujhhgtgfeyxiexzf.m4038feyxiexzfUjhhgtg(c1981Ujhhgtgfeyxiexzf, c2550feyxiexzfUjhhgtg);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 2:
                BaseAdapter baseAdapter = (BaseAdapter) this.f8276Ujhhgtgfeyxiexzf;
                ListView listView = (ListView) this.f8277Ujhhgtgfeyxiexzf;
                C3059Ujhhgtgfeyxiexzf.f9476Ujhhgtgfeyxiexzf.getClass();
                AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3058Ujhhgtgfeyxiexzf.f9475Ujhhgtgfeyxiexzf).invoke(baseAdapter, Boolean.TRUE);
                C3717feyxiexzfUjhhgtg.f11767Ujhhgtgfeyxiexzf.getClass();
                AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3716feyxiexzfUjhhgtg.f11766Ujhhgtgfeyxiexzf).invoke(listView, null);
                baseAdapter.notifyDataSetChanged();
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 3:
                InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = (InterfaceC1121feyxiexzfUjhhgtg) this.f8276Ujhhgtgfeyxiexzf;
                AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf = (AbstractC0728Ujhhgtgfeyxiexzf) this.f8277Ujhhgtgfeyxiexzf;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf = abstractC0728Ujhhgtgfeyxiexzf.f2997Ujhhgtgfeyxiexzf;
                AbstractC3516feyxiexzfUjhhgtg.m5067Ujhhgtgfeyxiexzf(abstractC0728Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
                int iMo1120Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf();
                for (int i = 0; i < iMo1120Ujhhgtgfeyxiexzf; i++) {
                    List listMo1122Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1122Ujhhgtgfeyxiexzf(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listMo1122Ujhhgtgfeyxiexzf) {
                        if (obj instanceof InterfaceC0123Ujhhgtgfeyxiexzf) {
                            arrayList.add(obj);
                        }
                    }
                    InterfaceC0123Ujhhgtgfeyxiexzf interfaceC0123Ujhhgtgfeyxiexzf = (InterfaceC0123Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4247feyxiexzfUjhhgtg(arrayList);
                    if (interfaceC0123Ujhhgtgfeyxiexzf != null && (strArrNames = interfaceC0123Ujhhgtgfeyxiexzf.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), C1098feyxiexzfUjhhgtg.f4180Ujhhgtgfeyxiexzf) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new C0138Ujhhgtgfeyxiexzf(AbstractC3611Ujhhgtgfeyxiexzf.m5215Ujhhgtgfeyxiexzf(-1, "The suggested name '" + str + "' for " + str2 + ' ' + interfaceC1121feyxiexzfUjhhgtg.mo1121Ujhhgtgfeyxiexzf(i) + " is already one of the names for " + str2 + ' ' + interfaceC1121feyxiexzfUjhhgtg.mo1121Ujhhgtgfeyxiexzf(((Number) AbstractC0202Ujhhgtgfeyxiexzf.m1279Ujhhgtgfeyxiexzf(linkedHashMap, str)).intValue()) + " in " + interfaceC1121feyxiexzfUjhhgtg, null, null, null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C3308feyxiexzfUjhhgtg.f10345Ujhhgtgfeyxiexzf : linkedHashMap;
            case 4:
                C3514feyxiexzfUjhhgtg c3514feyxiexzfUjhhgtg = new C3514feyxiexzfUjhhgtg((String) ((C2065feyxiexzfUjhhgtg) ((C2629Ujhhgtgfeyxiexzf) this.f8276Ujhhgtgfeyxiexzf).f8461Ujhhgtgfeyxiexzf).getValue(), (String) this.f8277Ujhhgtgfeyxiexzf);
                String str3 = "WAuxiliary";
                if (str3.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                c3514feyxiexzfUjhhgtg.f10932Ujhhgtgfeyxiexzf = new C2496feyxiexzfUjhhgtg(str3.charAt(0));
                String str4 = c3514feyxiexzfUjhhgtg.f10930Ujhhgtgfeyxiexzf + c3514feyxiexzfUjhhgtg.f10931Ujhhgtgfeyxiexzf;
                ConcurrentHashMap concurrentHashMap = C3514feyxiexzfUjhhgtg.f10929Ujhhgtgfeyxiexzf;
                SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf = (SharedPreferencesC3515Ujhhgtgfeyxiexzf) concurrentHashMap.get(str4);
                if (sharedPreferencesC3515Ujhhgtgfeyxiexzf == null) {
                    synchronized (C3514feyxiexzfUjhhgtg.class) {
                        try {
                            sharedPreferencesC3515Ujhhgtgfeyxiexzf = (SharedPreferencesC3515Ujhhgtgfeyxiexzf) concurrentHashMap.get(str4);
                            if (sharedPreferencesC3515Ujhhgtgfeyxiexzf == null) {
                                SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf2 = new SharedPreferencesC3515Ujhhgtgfeyxiexzf(c3514feyxiexzfUjhhgtg.f10930Ujhhgtgfeyxiexzf, c3514feyxiexzfUjhhgtg.f10931Ujhhgtgfeyxiexzf, null, c3514feyxiexzfUjhhgtg.f10932Ujhhgtgfeyxiexzf, 0);
                                concurrentHashMap.put(str4, sharedPreferencesC3515Ujhhgtgfeyxiexzf2);
                                sharedPreferencesC3515Ujhhgtgfeyxiexzf = sharedPreferencesC3515Ujhhgtgfeyxiexzf2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return sharedPreferencesC3515Ujhhgtgfeyxiexzf;
            case 5:
                String str5 = (String) this.f8276Ujhhgtgfeyxiexzf;
                C1455feyxiexzfUjhhgtg c1455feyxiexzfUjhhgtg = new C1455feyxiexzfUjhhgtg((Consumer) this.f8277Ujhhgtgfeyxiexzf, 1);
                C0457Ujhhgtgfeyxiexzf c0457Ujhhgtgfeyxiexzf = C0457Ujhhgtgfeyxiexzf.f2360Ujhhgtgfeyxiexzf;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                LinkedList linkedList = new LinkedList();
                String str6 = "";
                String str7 = "";
                c0457Ujhhgtgfeyxiexzf.getClass();
                Object objNewInstance = AbstractC1791feyxiexzfUjhhgtg.m3153feyxiexzfUjhhgtg(C0461Ujhhgtgfeyxiexzf.f2364Ujhhgtgfeyxiexzf).newInstance(str5, linkedList, 1, str6, str7, 0, 1089, null);
                C1345feyxiexzfUjhhgtg c1345feyxiexzfUjhhgtg = C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf;
                C0451Ujhhgtgfeyxiexzf c0451Ujhhgtgfeyxiexzf = new C0451Ujhhgtgfeyxiexzf(c1455feyxiexzfUjhhgtg, 0);
                c1345feyxiexzfUjhhgtg.getClass();
                C1345feyxiexzfUjhhgtg.m2867feyxiexzfUjhhgtg(objNewInstance, c0451Ujhhgtgfeyxiexzf);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 6:
                C0964feyxiexzfUjhhgtg c0964feyxiexzfUjhhgtg = (C0964feyxiexzfUjhhgtg) this.f8276Ujhhgtgfeyxiexzf;
                CharSequence charSequence = (CharSequence) this.f8277Ujhhgtgfeyxiexzf;
                return AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(c0964feyxiexzfUjhhgtg.f3835Ujhhgtgfeyxiexzf.matcher(charSequence), 0, charSequence);
            default:
                C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = (C0701Ujhhgtgfeyxiexzf) this.f8276Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = (ArrayList) this.f8277Ujhhgtgfeyxiexzf;
                if (((MaterialRadioButton) c0701Ujhhgtgfeyxiexzf.f2878Ujhhgtgfeyxiexzf).isChecked()) {
                    C2071Ujhhgtgfeyxiexzf.f6807Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(EnumC2067feyxiexzfUjhhgtg.f6799Ujhhgtgfeyxiexzf.f6802Ujhhgtgfeyxiexzf);
                    C2072feyxiexzfUjhhgtg.f6808Ujhhgtgfeyxiexzf.m4628Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList2));
                } else if (((MaterialRadioButton) c0701Ujhhgtgfeyxiexzf.f2876Ujhhgtgfeyxiexzf).isChecked()) {
                    C2071Ujhhgtgfeyxiexzf.f6807Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(EnumC2067feyxiexzfUjhhgtg.f6800Ujhhgtgfeyxiexzf.f6802Ujhhgtgfeyxiexzf);
                    C2070Ujhhgtgfeyxiexzf.f6806Ujhhgtgfeyxiexzf.m4628Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList2));
                }
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    }
}
