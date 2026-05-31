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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2361 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2361 f7587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f7588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C2933 f7589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final ArrayList f7590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f7591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f7592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f7593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C2262 f7594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C2262 f7595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final boolean f7596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final Set f7597;

    static {
        AbstractC1471.m3394(-544249665813123L);
        AbstractC1471.m3394(-544331270191747L);
        AbstractC1471.m3394(-544357039995523L);
        String[] strArr = AbstractC1471.f5234;
        f7587 = new C2361("PanelEmojiHook");
        C2933 c2933 = AbstractC2381.f7642;
        f7588 = AbstractC2381.m4344("Resource", "Panel");
        f7589 = new C2933(new C2096(7));
        f7590 = new ArrayList();
        f7591 = "聊天";
        f7592 = "面板本地表情";
        f7593 = "为聊天面板的表情分组添加本地表情包";
        f7594 = new C2262(25);
        f7595 = new C2262(26);
        f7596 = true;
        f7597 = AbstractC0280.m1536(new String[]{"png", "jpg", "jpeg", "gif", "webp"});
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static ArrayList m4306() {
        Object c2641;
        List listM2300;
        C2358 c2358;
        File[] fileArrListFiles;
        List list = C1191.f4326;
        try {
            C2359 c2359 = C2359.f7585;
            if (AbstractC2901.m4869(c2359.m2666())) {
                c2641 = list;
            } else {
                AbstractC1725 abstractC1725 = (AbstractC1725) f7589.getValue();
                String strM2666 = c2359.m2666();
                abstractC1725.getClass();
                c2641 = (List) abstractC1725.m3636(new C0268(C2358.Companion.serializer()), strM2666);
            }
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) != null) {
            c2641 = list;
        }
        List list2 = (List) c2641;
        String[] strArr = AbstractC1471.f5234;
        File[] fileArrListFiles2 = new File(f7588).listFiles();
        if (fileArrListFiles2 != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles2) {
                if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile()) {
                            String name = file2.getName();
                            int iM4871 = AbstractC2901.m4871(name, '.', 0, 6);
                            String lowerCase = (iM4871 == -1 ? "" : name.substring(iM4871 + 1, name.length())).toLowerCase(Locale.ROOT);
                            "toLowerCase(...)";
                            if (f7597.contains(lowerCase)) {
                                arrayList.add(file);
                                break;
                            }
                        }
                    }
                }
            }
            listM2300 = AbstractC0739.m2300(arrayList, new C0179(17));
        } else {
            listM2300 = null;
        }
        if (listM2300 != null) {
            list = listM2300;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            File file3 = (File) obj;
            arrayList2.add(new C2358(file3.getName(), AbstractC1469.m3322(file3.getName(), "emoji") ? "面板表情" : file3.getName(), i, true));
            i = i2;
        }
        if (list2.isEmpty()) {
            m4308(arrayList2);
            return arrayList2;
        }
        int iM3872 = AbstractC1924.m3872(AbstractC0741.m2313(arrayList2, 10));
        if (iM3872 < 16) {
            iM3872 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM3872);
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((C2358) obj2).f7581, obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (linkedHashMap.containsKey(((C2358) obj3).f7581)) {
                arrayList3.add(obj3);
            }
        }
        List listM2301 = AbstractC0739.m2300(arrayList3, new C0179(15));
        ArrayList arrayList4 = new ArrayList(AbstractC0741.m2313(listM2301, 10));
        int i3 = 0;
        for (Object obj4 : listM2301) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            C2358 c23510 = (C2358) obj4;
            String str = c23510.f7582;
            String str2 = c23510.f7581;
            if (AbstractC2901.m4869(str) && ((c2358 = (C2358) linkedHashMap.get(str2)) == null || (str = c2358.f7582) == null)) {
                str = str2;
            }
            arrayList4.add(C2358.m4305(c23510, str, i3, false, 9));
            i3 = i4;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : arrayList2) {
            C2358 c23511 = (C2358) obj5;
            if (!arrayList4.isEmpty()) {
                Iterator it = arrayList4.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!AbstractC1469.m3322(((C2358) it.next()).f7581, c23511.f7581));
            }
            arrayList5.add(obj5);
        }
        ArrayList arrayList6 = new ArrayList(AbstractC0741.m2313(arrayList5, 10));
        int i5 = 0;
        for (Object obj6 : arrayList5) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList6.add(C2358.m4305((C2358) obj6, null, arrayList4.size() + i5, false, 11));
            i5 = i6;
        }
        ArrayList arrayListM2297 = AbstractC0739.m2297(arrayList4, arrayList6);
        ArrayList arrayList7 = new ArrayList(AbstractC0741.m2313(arrayListM2297, 10));
        int i7 = 0;
        for (Object obj7 : arrayListM2297) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList7.add(C2358.m4305((C2358) obj7, null, i7, false, 11));
            i7 = i8;
        }
        if (!arrayList7.equals(list2)) {
            m4308(arrayList7);
        }
        return arrayList7;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static List m4307(String str) {
        Object c2641;
        String[] strArr = AbstractC1471.f5234;
        File[] fileArrListFiles = new File(f7588, str).listFiles();
        ArrayList arrayList = null;
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList2 = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    int iM4871 = AbstractC2901.m4871(name, '.', 0, 6);
                    String lowerCase = (iM4871 == -1 ? "" : name.substring(iM4871 + 1, name.length())).toLowerCase(Locale.ROOT);
                    "toLowerCase(...)";
                    if (f7597.contains(lowerCase)) {
                        arrayList2.add(file);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (File file2 : arrayList2) {
                try {
                    C1172 c1172 = C1172.f4298;
                    String absolutePath = file2.getAbsolutePath();
                    c1172.getClass();
                    String strM2906 = C1172.m2906(absolutePath);
                    C1166.f4288.getClass();
                    Object objM2905 = C1166.m2905(strM2906);
                    C1163.f4285.getClass();
                    AbstractC0972.m2610(C1162.f4284).invoke(objM2905, null, Boolean.TRUE);
                    c2641 = AbstractC0972.m2609(C2351.f7572).newInstance(objM2905, 2, "", 0);
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                if (c2641 != null) {
                    arrayList3.add(c2641);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? C1191.f4326 : arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static void m4308(ArrayList arrayList) {
        C2359 c2359 = C2359.f7585;
        AbstractC1725 abstractC1725 = (AbstractC1725) f7589.getValue();
        ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList2.add(C2358.m4305((C2358) obj, null, i, false, 11));
            i = i2;
        }
        abstractC1725.getClass();
        c2359.m2672(abstractC1725.m3637(new C0268(C2358.Companion.serializer()), arrayList2));
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2351.f7572, dexKitBridge, new C2262(11));
        AbstractC0972.m2592(C2354.f7576, dexKitBridge, new C2262(12));
        AbstractC0972.m2592(C2353.f7575, dexKitBridge, new C2262(13));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        C1006 c1006 = AbstractC1080.f3904;
        AbstractC1471.m3404(ExecutorC0994.f3625, new C0314(2, null, 5));
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C2354.f7576));
        C2361 c2361 = f7587;
        C3752 c3752M4301 = C2342.m4301(c2361, listSingletonList);
        c2361.m3443(c3752M4301, new C2262(16));
        c3752M4301.m5360();
        C3752 c3752M4302 = C2342.m4301(c2361, Collections.singletonList(AbstractC0972.m2610(C2353.f7575)));
        c2361.m3444(c3752M4302, new C2262(17));
        c3752M4302.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7593;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f7592;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f7591;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f7594;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final InterfaceC1433 mo2142() {
        return f7595;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f7596;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final synchronized void m4309() {
        try {
            ArrayList arrayListM4306 = m4306();
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM4306) {
                if (((C2358) obj).f7584) {
                    arrayList.add(obj);
                }
            }
            List<C2358> listM2300 = AbstractC0739.m2300(arrayList, new C0179(16));
            ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(listM2300, 10));
            for (C2358 c2358 : listM2300) {
                C2361 c2361 = f7587;
                String str = c2358.f7581;
                c2361.getClass();
                arrayList2.add(new C2352(c2358, m4307(str)));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!((C2352) obj2).f7574.isEmpty()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = f7590;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        } catch (Throwable th) {
            throw th;
        }
    }
}
