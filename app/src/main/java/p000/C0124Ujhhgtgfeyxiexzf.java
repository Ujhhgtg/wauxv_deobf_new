package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛳᛴ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0124Ujhhgtgfeyxiexzf implements InterfaceC0146Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0124Ujhhgtgfeyxiexzf f1271Ujhhgtgfeyxiexzf = new C0124Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0834feyxiexzfUjhhgtg f1272Ujhhgtgfeyxiexzf;

    static {
        int length;
        Comparable comparable;
        C0839feyxiexzfUjhhgtg c0839feyxiexzfUjhhgtg = C0839feyxiexzfUjhhgtg.f3317Ujhhgtgfeyxiexzf;
        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C0169Ujhhgtgfeyxiexzf) AbstractC0837feyxiexzfUjhhgtg.f3307Ujhhgtgfeyxiexzf.values()).iterator();
        while (((AbstractC0171Ujhhgtgfeyxiexzf) it).hasNext()) {
            InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf = (InterfaceC0146Ujhhgtgfeyxiexzf) ((C0164Ujhhgtgfeyxiexzf) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf().mo1117Ujhhgtgfeyxiexzf())) {
                String str = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf.getClass()).m4165Ujhhgtgfeyxiexzf() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            ";
                List listM2634feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2634feyxiexzfUjhhgtg(str);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM2634feyxiexzfUjhhgtg) {
                    if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList, 10));
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
                        } else if (!AbstractC0217Ujhhgtgfeyxiexzf.m1332feyxiexzfUjhhgtg(str2.charAt(length))) {
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
                listM2634feyxiexzfUjhhgtg.size();
                int iM4191Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(listM2634feyxiexzfUjhhgtg);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listM2634feyxiexzfUjhhgtg) {
                    int i = length + 1;
                    if (length < 0) {
                        AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    String str3 = (String) obj2;
                    if ((length == 0 || length == iM4191Ujhhgtgfeyxiexzf) && AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str3)) {
                        str3 = null;
                    } else {
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        String strSubstring = str3.substring(length4);
                        if (strSubstring != null) {
                            str3 = strSubstring;
                        }
                    }
                    if (str3 != null) {
                        arrayList3.add(str3);
                    }
                    length = i;
                }
                StringBuilder sb = new StringBuilder(length3);
                AbstractC2856feyxiexzfUjhhgtg.m4241feyxiexzfUjhhgtg(arrayList3, sb, "\n", "", "", null);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        f1272Ujhhgtgfeyxiexzf = new C0834feyxiexzfUjhhgtg("kotlinx.serialization.json.JsonLiteral", c0839feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        return f1272Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1180Ujhhgtgfeyxiexzf(InterfaceC3091Ujhhgtgfeyxiexzf interfaceC3091Ujhhgtgfeyxiexzf) {
        C1164feyxiexzfUjhhgtg c1164feyxiexzfUjhhgtgM5048Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5048Ujhhgtgfeyxiexzf(interfaceC3091Ujhhgtgfeyxiexzf);
        AbstractC0120Ujhhgtgfeyxiexzf abstractC0120UjhhgtgfeyxiexzfM2654feyxiexzfUjhhgtg = c1164feyxiexzfUjhhgtgM5048Ujhhgtgfeyxiexzf.m2654feyxiexzfUjhhgtg();
        if (abstractC0120UjhhgtgfeyxiexzfM2654feyxiexzfUjhhgtg instanceof C0121Ujhhgtgfeyxiexzf) {
            return (C0121Ujhhgtgfeyxiexzf) abstractC0120UjhhgtgfeyxiexzfM2654feyxiexzfUjhhgtg;
        }
        throw new C0138Ujhhgtgfeyxiexzf(AbstractC3611Ujhhgtgfeyxiexzf.m5215Ujhhgtgfeyxiexzf(-1, "Unexpected JSON element, expected JsonLiteral, had " + AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(abstractC0120UjhhgtgfeyxiexzfM2654feyxiexzfUjhhgtg.getClass()), null, null, c1164feyxiexzfUjhhgtgM5048Ujhhgtgfeyxiexzf.m2655feyxiexzfUjhhgtg().f2997Ujhhgtgfeyxiexzf.f1300Ujhhgtgfeyxiexzf ? AbstractC3611Ujhhgtgfeyxiexzf.m5222Ujhhgtgfeyxiexzf(-1, abstractC0120UjhhgtgfeyxiexzfM2654feyxiexzfUjhhgtg.toString()).toString() : null));
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        Double dValueOf;
        C0121Ujhhgtgfeyxiexzf c0121Ujhhgtgfeyxiexzf = (C0121Ujhhgtgfeyxiexzf) obj;
        String str = c0121Ujhhgtgfeyxiexzf.f1270Ujhhgtgfeyxiexzf;
        AbstractC3516feyxiexzfUjhhgtg.m5047Ujhhgtgfeyxiexzf(interfaceC3329Ujhhgtgfeyxiexzf);
        if (c0121Ujhhgtgfeyxiexzf.f1269Ujhhgtgfeyxiexzf) {
            interfaceC3329Ujhhgtgfeyxiexzf.mo2348Ujhhgtgfeyxiexzf(str);
            return;
        }
        Long lM2674feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2674feyxiexzfUjhhgtg(str);
        if (lM2674feyxiexzfUjhhgtg != null) {
            interfaceC3329Ujhhgtgfeyxiexzf.mo2345feyxiexzfUjhhgtg(lM2674feyxiexzfUjhhgtg.longValue());
            return;
        }
        C1923feyxiexzfUjhhgtg c1923feyxiexzfUjhhgtgM5248Ujhhgtgfeyxiexzf = AbstractC3612feyxiexzfUjhhgtg.m5248Ujhhgtgfeyxiexzf(str);
        if (c1923feyxiexzfUjhhgtgM5248Ujhhgtgfeyxiexzf != null) {
            interfaceC3329Ujhhgtgfeyxiexzf.mo2331Ujhhgtgfeyxiexzf(C1927Ujhhgtgfeyxiexzf.f6399Ujhhgtgfeyxiexzf).mo2345feyxiexzfUjhhgtg(c1923feyxiexzfUjhhgtgM5248Ujhhgtgfeyxiexzf.f6393Ujhhgtgfeyxiexzf);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = AbstractC1185feyxiexzfUjhhgtg.m2675feyxiexzfUjhhgtg(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            interfaceC3329Ujhhgtgfeyxiexzf.mo2327Ujhhgtgfeyxiexzf(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            interfaceC3329Ujhhgtgfeyxiexzf.mo2330Ujhhgtgfeyxiexzf(bool.booleanValue());
        } else {
            interfaceC3329Ujhhgtgfeyxiexzf.mo2348Ujhhgtgfeyxiexzf(str);
        }
    }
}
