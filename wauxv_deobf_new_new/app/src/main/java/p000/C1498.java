package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1498 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1498 f5308;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String f5309;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2933 f5310;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final List f5311;

    static {
        AbstractC1471.m3394(-666316931332739L);
        AbstractC1471.m3394(-667317658712707L);
        f5308 = new C1498();
        C2933 c2933 = AbstractC2381.f7642;
        String[] strArr = AbstractC1471.f5234;
        f5309 = AbstractC2381.m4344("Resource", "Group");
        f5310 = new C2933(new C1356(4));
        f5311 = AbstractC0740.m2311(new C1496(EnumC1497.f5298.f5306, 0, "全部", true, new String[0]), new C1496(EnumC1497.f5299.f5306, 1, "群聊", true, new String[0]), new C1496(EnumC1497.f5300.f5306, 2, "好友", true, new String[0]), new C1496(EnumC1497.f5301.f5306, 3, "公众号", true, new String[0]), new C1496(EnumC1497.f5302.f5306, 4, "未读", true, new String[0]), new C1496(EnumC1497.f5303.f5306, 5, "示例", true, new String[]{"weixin"}));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m3422() {
        List listM3423 = m3423();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3423) {
            if (((C1496) obj).f5295) {
                arrayList.add(obj);
            }
        }
        return AbstractC0739.m2300(arrayList, new C0179(13));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static List m3423() {
        Object c2641;
        File file = new File(f5309, "groupItemsV2.json");
        boolean zExists = file.exists();
        List list = f5311;
        if (!zExists) {
            m3424(list);
            return list;
        }
        try {
            AbstractC1725 abstractC1725 = (AbstractC1725) f5310.getValue();
            String strM3146 = AbstractC1330.m3146(file);
            abstractC1725.getClass();
            c2641 = (List) abstractC1725.m3636(new C0268(C1496.Companion.serializer()), strM3146);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Object obj = list;
        if (C2642.m4616(c2641) == null) {
            obj = c2641;
        }
        return (List) obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m3424(List list) {
        Object c2641;
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList.add(C1496.m3419((C1496) obj, i, null, 29));
            i = i2;
        }
        try {
            File file = new File(f5309, "groupItemsV2.json");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            AbstractC1725 abstractC1725 = (AbstractC1725) f5310.getValue();
            abstractC1725.getClass();
            AbstractC1330.m3147(file, abstractC1725.m3637(new C0268(C1496.Companion.serializer()), arrayList));
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        return !(c2641 instanceof C2641);
    }
}
