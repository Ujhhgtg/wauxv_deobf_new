package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛳᛲ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1369feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1369feyxiexzfUjhhgtg f4850Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4851Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f4852Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final ArrayList f4853Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f4854Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final String f4855Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final String f4856Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C1269feyxiexzfUjhhgtg f4857Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final C1269feyxiexzfUjhhgtg f4858Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final boolean f4859Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static final Set f4860Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928404826754123146L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928404882588697994L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928404994257847690L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4850Ujhhgtgfeyxiexzf = new C1369feyxiexzfUjhhgtg("PanelEmojiHook");
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = AbstractC1389feyxiexzfUjhhgtg.f4886Ujhhgtgfeyxiexzf;
        f4851Ujhhgtgfeyxiexzf = AbstractC1389feyxiexzfUjhhgtg.m2877Ujhhgtgfeyxiexzf("Resource", "Panel");
        f4852Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0478Ujhhgtgfeyxiexzf(8));
        f4853Ujhhgtgfeyxiexzf = new ArrayList();
        f4854Ujhhgtgfeyxiexzf = "聊天";
        f4855Ujhhgtgfeyxiexzf = "面板本地表情";
        f4856Ujhhgtgfeyxiexzf = "为聊天面板的表情分组添加本地表情包";
        f4857Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(25);
        f4858Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(26);
        f4859Ujhhgtgfeyxiexzf = true;
        f4860Ujhhgtgfeyxiexzf = AbstractC2391Ujhhgtgfeyxiexzf.m3654feyxiexzfUjhhgtg(new String[]{"png", "jpg", "jpeg", "gif", "webp"});
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static ArrayList m2870feyxiexzfUjhhgtg() {
        Object c0919feyxiexzfUjhhgtg;
        List listM4248feyxiexzfUjhhgtg;
        C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg;
        File[] fileArrListFiles;
        List list = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        try {
            C1372feyxiexzfUjhhgtg c1372feyxiexzfUjhhgtg = C1372feyxiexzfUjhhgtg.f4865Ujhhgtgfeyxiexzf;
            if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(c1372feyxiexzfUjhhgtg.m4623Ujhhgtgfeyxiexzf())) {
                c0919feyxiexzfUjhhgtg = list;
            } else {
                AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf = (AbstractC0728Ujhhgtgfeyxiexzf) f4852Ujhhgtgfeyxiexzf.getValue();
                String strM4623Ujhhgtgfeyxiexzf = c1372feyxiexzfUjhhgtg.m4623Ujhhgtgfeyxiexzf();
                abstractC0728Ujhhgtgfeyxiexzf.getClass();
                c0919feyxiexzfUjhhgtg = (List) abstractC0728Ujhhgtgfeyxiexzf.m2044Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C1364feyxiexzfUjhhgtg.Companion.serializer()), strM4623Ujhhgtgfeyxiexzf);
            }
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) != null) {
            c0919feyxiexzfUjhhgtg = list;
        }
        List list2 = (List) c0919feyxiexzfUjhhgtg;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        File[] fileArrListFiles2 = new File(f4851Ujhhgtgfeyxiexzf).listFiles();
        if (fileArrListFiles2 != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles2) {
                if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile()) {
                            String name = file2.getName();
                            int iM2633feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2633feyxiexzfUjhhgtg(name, '.', 0, 6);
                            String lowerCase = (iM2633feyxiexzfUjhhgtg == -1 ? "" : name.substring(iM2633feyxiexzfUjhhgtg + 1, name.length())).toLowerCase(Locale.ROOT);
                            "toLowerCase(...)";
                            if (f4860Ujhhgtgfeyxiexzf.contains(lowerCase)) {
                                arrayList.add(file);
                                break;
                            }
                        }
                    }
                }
            }
            listM4248feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(arrayList, new C2419Ujhhgtgfeyxiexzf(17));
        } else {
            listM4248feyxiexzfUjhhgtg = null;
        }
        if (listM4248feyxiexzfUjhhgtg != null) {
            list = listM4248feyxiexzfUjhhgtg;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            File file3 = (File) obj;
            arrayList2.add(new C1364feyxiexzfUjhhgtg(file3.getName(), C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(file3.getName(), "emoji") ? "面板表情" : file3.getName(), i, true));
            i = i2;
        }
        if (list2.isEmpty()) {
            m2872feyxiexzfUjhhgtg(arrayList2);
            return arrayList2;
        }
        int iM1280Ujhhgtgfeyxiexzf = AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList2, 10));
        if (iM1280Ujhhgtgfeyxiexzf < 16) {
            iM1280Ujhhgtgfeyxiexzf = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM1280Ujhhgtgfeyxiexzf);
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((C1364feyxiexzfUjhhgtg) obj2).f4844Ujhhgtgfeyxiexzf, obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (linkedHashMap.containsKey(((C1364feyxiexzfUjhhgtg) obj3).f4844Ujhhgtgfeyxiexzf)) {
                arrayList3.add(obj3);
            }
        }
        List listM4248feyxiexzfUjhhgtg2 = AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(arrayList3, new C2419Ujhhgtgfeyxiexzf(15));
        ArrayList arrayList4 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM4248feyxiexzfUjhhgtg2, 10));
        int i3 = 0;
        for (Object obj4 : listM4248feyxiexzfUjhhgtg2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg2 = (C1364feyxiexzfUjhhgtg) obj4;
            String str = c1364feyxiexzfUjhhgtg2.f4845Ujhhgtgfeyxiexzf;
            String str2 = c1364feyxiexzfUjhhgtg2.f4844Ujhhgtgfeyxiexzf;
            if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str) && ((c1364feyxiexzfUjhhgtg = (C1364feyxiexzfUjhhgtg) linkedHashMap.get(str2)) == null || (str = c1364feyxiexzfUjhhgtg.f4845Ujhhgtgfeyxiexzf) == null)) {
                str = str2;
            }
            arrayList4.add(C1364feyxiexzfUjhhgtg.m2869Ujhhgtgfeyxiexzf(c1364feyxiexzfUjhhgtg2, str, i3, false, 9));
            i3 = i4;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : arrayList2) {
            C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg3 = (C1364feyxiexzfUjhhgtg) obj5;
            if (!arrayList4.isEmpty()) {
                Iterator it = arrayList4.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((C1364feyxiexzfUjhhgtg) it.next()).f4844Ujhhgtgfeyxiexzf, c1364feyxiexzfUjhhgtg3.f4844Ujhhgtgfeyxiexzf));
            }
            arrayList5.add(obj5);
        }
        ArrayList arrayList6 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList5, 10));
        int i5 = 0;
        for (Object obj6 : arrayList5) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList6.add(C1364feyxiexzfUjhhgtg.m2869Ujhhgtgfeyxiexzf((C1364feyxiexzfUjhhgtg) obj6, null, arrayList4.size() + i5, false, 11));
            i5 = i6;
        }
        ArrayList arrayListM4245feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4245feyxiexzfUjhhgtg(arrayList4, arrayList6);
        ArrayList arrayList7 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayListM4245feyxiexzfUjhhgtg, 10));
        int i7 = 0;
        for (Object obj7 : arrayListM4245feyxiexzfUjhhgtg) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList7.add(C1364feyxiexzfUjhhgtg.m2869Ujhhgtgfeyxiexzf((C1364feyxiexzfUjhhgtg) obj7, null, i7, false, 11));
            i7 = i8;
        }
        if (!arrayList7.equals(list2)) {
            m2872feyxiexzfUjhhgtg(arrayList7);
        }
        return arrayList7;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static List m2871feyxiexzfUjhhgtg(String str) {
        Object c0919feyxiexzfUjhhgtg;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        File[] fileArrListFiles = new File(f4851Ujhhgtgfeyxiexzf, str).listFiles();
        ArrayList arrayList = null;
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList2 = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    int iM2633feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2633feyxiexzfUjhhgtg(name, '.', 0, 6);
                    String lowerCase = (iM2633feyxiexzfUjhhgtg == -1 ? "" : name.substring(iM2633feyxiexzfUjhhgtg + 1, name.length())).toLowerCase(Locale.ROOT);
                    "toLowerCase(...)";
                    if (f4860Ujhhgtgfeyxiexzf.contains(lowerCase)) {
                        arrayList2.add(file);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (File file2 : arrayList2) {
                try {
                    C3293Ujhhgtgfeyxiexzf c3293Ujhhgtgfeyxiexzf = C3293Ujhhgtgfeyxiexzf.f10330Ujhhgtgfeyxiexzf;
                    String absolutePath = file2.getAbsolutePath();
                    c3293Ujhhgtgfeyxiexzf.getClass();
                    String strM4786feyxiexzfUjhhgtg = C3293Ujhhgtgfeyxiexzf.m4786feyxiexzfUjhhgtg(absolutePath);
                    C3287Ujhhgtgfeyxiexzf.f10316Ujhhgtgfeyxiexzf.getClass();
                    Object objM4785feyxiexzfUjhhgtg = C3287Ujhhgtgfeyxiexzf.m4785feyxiexzfUjhhgtg(strM4786feyxiexzfUjhhgtg);
                    C3280Ujhhgtgfeyxiexzf.f10300Ujhhgtgfeyxiexzf.getClass();
                    AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3277Ujhhgtgfeyxiexzf.f10297Ujhhgtgfeyxiexzf).invoke(objM4785feyxiexzfUjhhgtg, null, Boolean.TRUE);
                    c0919feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3153feyxiexzfUjhhgtg(C1384feyxiexzfUjhhgtg.f4879Ujhhgtgfeyxiexzf).newInstance(objM4785feyxiexzfUjhhgtg, 2, "", 0);
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                if (c0919feyxiexzfUjhhgtg != null) {
                    arrayList3.add(c0919feyxiexzfUjhhgtg);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf : arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public static void m2872feyxiexzfUjhhgtg(ArrayList arrayList) {
        C1372feyxiexzfUjhhgtg c1372feyxiexzfUjhhgtg = C1372feyxiexzfUjhhgtg.f4865Ujhhgtgfeyxiexzf;
        AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf = (AbstractC0728Ujhhgtgfeyxiexzf) f4852Ujhhgtgfeyxiexzf.getValue();
        ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList2.add(C1364feyxiexzfUjhhgtg.m2869Ujhhgtgfeyxiexzf((C1364feyxiexzfUjhhgtg) obj, null, i, false, 11));
            i = i2;
        }
        abstractC0728Ujhhgtgfeyxiexzf.getClass();
        c1372feyxiexzfUjhhgtg.m4629Ujhhgtgfeyxiexzf(abstractC0728Ujhhgtgfeyxiexzf.m2045Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C1364feyxiexzfUjhhgtg.Companion.serializer()), arrayList2));
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1384feyxiexzfUjhhgtg.f4879Ujhhgtgfeyxiexzf, dexKitBridge, new C1269feyxiexzfUjhhgtg(11));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1367feyxiexzfUjhhgtg.f4849Ujhhgtgfeyxiexzf, dexKitBridge, new C1269feyxiexzfUjhhgtg(12));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1366feyxiexzfUjhhgtg.f4848Ujhhgtgfeyxiexzf, dexKitBridge, new C1269feyxiexzfUjhhgtg(13));
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C2554feyxiexzfUjhhgtg(2, null, 5));
        List listSingletonList = Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1367feyxiexzfUjhhgtg.f4849Ujhhgtgfeyxiexzf));
        C1369feyxiexzfUjhhgtg c1369feyxiexzfUjhhgtg = f4850Ujhhgtgfeyxiexzf;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c1369feyxiexzfUjhhgtg, listSingletonList);
        c1369feyxiexzfUjhhgtg.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C1269feyxiexzfUjhhgtg(16));
        c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf2 = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c1369feyxiexzfUjhhgtg, Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1366feyxiexzfUjhhgtg.f4848Ujhhgtgfeyxiexzf)));
        c1369feyxiexzfUjhhgtg.m1845feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf2, new C1269feyxiexzfUjhhgtg(17));
        c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf2.m3485Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4856Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4855Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4854Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f4857Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3549feyxiexzfUjhhgtg mo2873feyxiexzfUjhhgtg() {
        return f4858Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public final boolean mo1482feyxiexzfUjhhgtg() {
        return f4859Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final synchronized void m2874feyxiexzfUjhhgtg() {
        try {
            ArrayList arrayListM2870feyxiexzfUjhhgtg = m2870feyxiexzfUjhhgtg();
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM2870feyxiexzfUjhhgtg) {
                if (((C1364feyxiexzfUjhhgtg) obj).f4847Ujhhgtgfeyxiexzf) {
                    arrayList.add(obj);
                }
            }
            List<C1364feyxiexzfUjhhgtg> listM4248feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(arrayList, new C2419Ujhhgtgfeyxiexzf(16));
            ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM4248feyxiexzfUjhhgtg, 10));
            for (C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg : listM4248feyxiexzfUjhhgtg) {
                C1369feyxiexzfUjhhgtg c1369feyxiexzfUjhhgtg = f4850Ujhhgtgfeyxiexzf;
                String str = c1364feyxiexzfUjhhgtg.f4844Ujhhgtgfeyxiexzf;
                c1369feyxiexzfUjhhgtg.getClass();
                arrayList2.add(new C1385feyxiexzfUjhhgtg(c1364feyxiexzfUjhhgtg, m2871feyxiexzfUjhhgtg(str)));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!((C1385feyxiexzfUjhhgtg) obj2).f4881Ujhhgtgfeyxiexzf.isEmpty()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = f4853Ujhhgtgfeyxiexzf;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        } catch (Throwable th) {
            throw th;
        }
    }
}
