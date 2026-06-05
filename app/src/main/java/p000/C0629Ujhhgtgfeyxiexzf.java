package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0629Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0629Ujhhgtgfeyxiexzf f2673Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final String f2674Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f2675Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final List f2676Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928775538266342794L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928774262661055882L);
        f2673Ujhhgtgfeyxiexzf = new C0629Ujhhgtgfeyxiexzf();
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = AbstractC1389feyxiexzfUjhhgtg.f4886Ujhhgtgfeyxiexzf;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f2674Ujhhgtgfeyxiexzf = AbstractC1389feyxiexzfUjhhgtg.m2877Ujhhgtgfeyxiexzf("Resource", "Group");
        f2675Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C3471Ujhhgtgfeyxiexzf(3));
        f2676Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(new C0627Ujhhgtgfeyxiexzf(EnumC0628Ujhhgtgfeyxiexzf.f2663Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf, 0, "全部", true, new String[0]), new C0627Ujhhgtgfeyxiexzf(EnumC0628Ujhhgtgfeyxiexzf.f2664Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf, 1, "群聊", true, new String[0]), new C0627Ujhhgtgfeyxiexzf(EnumC0628Ujhhgtgfeyxiexzf.f2665Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf, 2, "好友", true, new String[0]), new C0627Ujhhgtgfeyxiexzf(EnumC0628Ujhhgtgfeyxiexzf.f2666Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf, 3, "公众号", true, new String[0]), new C0627Ujhhgtgfeyxiexzf(EnumC0628Ujhhgtgfeyxiexzf.f2667Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf, 4, "未读", true, new String[0]), new C0627Ujhhgtgfeyxiexzf(EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf, 5, "示例", true, new String[]{"weixin"}));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static List m1906Ujhhgtgfeyxiexzf() {
        List listM1907Ujhhgtgfeyxiexzf = m1907Ujhhgtgfeyxiexzf();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1907Ujhhgtgfeyxiexzf) {
            if (((C0627Ujhhgtgfeyxiexzf) obj).f2660Ujhhgtgfeyxiexzf) {
                arrayList.add(obj);
            }
        }
        return AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(arrayList, new C2419Ujhhgtgfeyxiexzf(13));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static List m1907Ujhhgtgfeyxiexzf() {
        Object c0919feyxiexzfUjhhgtg;
        File file = new File(f2674Ujhhgtgfeyxiexzf, "groupItemsV2.json");
        boolean zExists = file.exists();
        List list = f2676Ujhhgtgfeyxiexzf;
        if (!zExists) {
            m1908Ujhhgtgfeyxiexzf(list);
            return list;
        }
        try {
            AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf = (AbstractC0728Ujhhgtgfeyxiexzf) f2675Ujhhgtgfeyxiexzf.getValue();
            String strM4946feyxiexzfUjhhgtg = AbstractC3445Ujhhgtgfeyxiexzf.m4946feyxiexzfUjhhgtg(file);
            abstractC0728Ujhhgtgfeyxiexzf.getClass();
            c0919feyxiexzfUjhhgtg = (List) abstractC0728Ujhhgtgfeyxiexzf.m2044Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C0627Ujhhgtgfeyxiexzf.Companion.serializer()), strM4946feyxiexzfUjhhgtg);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Object obj = list;
        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) == null) {
            obj = c0919feyxiexzfUjhhgtg;
        }
        return (List) obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean m1908Ujhhgtgfeyxiexzf(List list) {
        Object c0919feyxiexzfUjhhgtg;
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList.add(C0627Ujhhgtgfeyxiexzf.m1903Ujhhgtgfeyxiexzf((C0627Ujhhgtgfeyxiexzf) obj, i, null, 29));
            i = i2;
        }
        try {
            File file = new File(f2674Ujhhgtgfeyxiexzf, "groupItemsV2.json");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf = (AbstractC0728Ujhhgtgfeyxiexzf) f2675Ujhhgtgfeyxiexzf.getValue();
            abstractC0728Ujhhgtgfeyxiexzf.getClass();
            AbstractC3445Ujhhgtgfeyxiexzf.m4947feyxiexzfUjhhgtg(file, abstractC0728Ujhhgtgfeyxiexzf.m2045Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C0627Ujhhgtgfeyxiexzf.Companion.serializer()), arrayList));
            c0919feyxiexzfUjhhgtg = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        return !(c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg);
    }
}
