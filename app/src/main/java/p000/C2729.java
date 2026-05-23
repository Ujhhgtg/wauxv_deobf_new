package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲁᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2729 implements InterfaceC1430 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8796;

    public /* synthetic */ C2729(int i) {
        this.f8796 = i;
    }

    @Override // p000.InterfaceC1430
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo3133(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int i = this.f8796;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                int i2 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(obj2).m3490();
                c1299M3490.f6370 = "field_snsId";
                final long jLongValue = ((Number) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).longValue();
                AbstractC1458.m3166(C2732.f8799, new InterfaceC1425() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲁᲈᤞᛸ
                    @Override // p000.InterfaceC1425
                    public final Object invoke(Object obj4) throws IOException {
                        C2365 c2365 = new C2365((C2732) obj4, jLongValue, 1);
                        C0815 c0815 = new C0815();
                        C0816 c0816 = new C0816(c0815);
                        c2365.invoke(c0816);
                        c0815.f3181 = c0816;
                        c0815.m2362().mo3369(new C0466(c0815)).m3791();
                        return C3497.f10997;
                    }
                });
                return c3497;
            default:
                Activity activity = (Activity) obj;
                C2733 c2733 = C2733.f8803;
                int i3 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(obj2).m3492();
                String[] strArr = AbstractC1574.f5469;
                c1973M3492.f6370 = "getLocalid";
                String str = (String) ((C1982) AbstractC2784.m4742(c1973M3492)).m3832(new Object[0]);
                C1973 c1973M3493 = AbstractC0968.m2484(obj2).m3492();
                c1973M3493.f6370 = "getTypeFlag";
                int iIntValue = ((Number) ((C1982) AbstractC2784.m4742(c1973M3493)).m3832(new Object[0])).intValue();
                C1973 c1973M3494 = AbstractC0968.m2484(obj3).m3492();
                c1973M3494.f6370 = "toByteArray";
                byte[] bArr = (byte[]) ((C1982) AbstractC2784.m4742(c1973M3494)).m3832(new Object[0]);
                C2427 c2427 = C2427.f7718;
                c2427.getClass();
                C3397 c3397 = (C3397) c2427.m4387(C3397.Companion.serializer(), bArr);
                C1299 c1299M3491 = AbstractC0968.m2484(obj3).m3490();
                c1299M3491.f6370 = "ContentObj";
                C1299 c1299M3492 = AbstractC0968.m2484(((C1315) AbstractC2784.m4741(c1299M3491)).m3023()).m3490();
                c1299M3492.f4725 = AbstractC2519.m4527(LinkedList.class);
                Object obj4 = null;
                boolean z = false;
                Object obj5 = null;
                for (Object obj6 : c1299M3492.m3014()) {
                    LinkedList linkedList = (LinkedList) ((C1315) obj6).m3024();
                    if (linkedList != null && (!linkedList.isEmpty())) {
                        if (z) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj5 = obj6;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                LinkedList linkedList2 = (LinkedList) ((C1315) obj5).m3024();
                if (iIntValue == EnumC3676.f11520.f11526) {
                    String str2 = c3397.f10701;
                    Intent intent = new Intent();
                    intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    intent.putExtra("Ksnsupload_type", 9);
                    intent.putExtra("Kdescription", str2);
                    activity.startActivity(intent);
                } else {
                    int i4 = EnumC3676.f11519.f11526;
                    EnumC1999 enumC1999 = EnumC1999.STATIC;
                    if (iIntValue == i4) {
                        String str3 = c3397.f10701;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj7 : linkedList2) {
                            C1764.f5887.getClass();
                            Object objInvoke = AbstractC1574.m3315(C1762.f5885).invoke(obj4, obj7);
                            "null cannot be cast to non-null type kotlin.String";
                            String str4 = (String) objInvoke;
                            C2726 c2726 = C2726.f8790;
                            C2763.f8852.getClass();
                            int i5 = AbstractC1745.f5844;
                            C0796 c0796M3486 = AbstractC0968.m2483(AbstractC1574.m3313(C2762.f8851)).m3486();
                            c0796M3486.m2888(Arrays.copyOf(new Object[]{AbstractC2519.m4527(String.class)}, 1));
                            C0798 c0798 = (C0798) AbstractC0744.m2191(c0796M3486.m2344());
                            ArrayList arrayList2 = arrayList;
                            Object[] objArr = {"timeline"};
                            Constructor constructor = c0798.f3157;
                            Constructor constructor2 = constructor != null ? constructor : null;
                            if (constructor2 != null && !constructor2.isAccessible()) {
                                constructor2.setAccessible(true);
                            }
                            Object objNewInstance = constructor.newInstance(Arrays.copyOf(objArr, 1));
                            c2726.getClass();
                            C2725 c2725 = C2725.f8789;
                            Method methodM3315 = AbstractC1574.m3315(c2725);
                            C2724.f8788.getClass();
                            C1973 c1973M3495 = AbstractC0968.m2483(AbstractC1574.m3313(C2723.f8787)).m3492();
                            c1973M3495.m3800(enumC1999);
                            c1973M3495.f6543 = AbstractC1574.m3315(c2725).getDeclaringClass();
                            Object objInvoke2 = methodM3315.invoke(((C1982) AbstractC1194.m2778(c1973M3495)).m3831(new Object[0]), obj7, 2, null, objNewInstance);
                            "null cannot be cast to non-null type kotlin.Boolean";
                            if (!((Boolean) objInvoke2).booleanValue()) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                arrayList2.add(str4);
                            }
                            arrayList = arrayList2;
                            obj4 = null;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        AbstractC0744.m2204(arrayList, arrayList3);
                        ((Handler) AbstractC1472.f5245.getValue()).postDelayed(new RunnableC1509(new C1501(activity, arrayList3, str3, 2), c2733, 0), 500L);
                    } else {
                        if (iIntValue != EnumC3676.f11521.f11526) {
                            if (iIntValue != EnumC3676.f11522.f11526) {
                                if (iIntValue == EnumC3676.f11523.f11526) {
                                    AbstractC2834.m4823(null, 3, "暂不支持 视频号");
                                    return c3497;
                                }
                                if (iIntValue == EnumC3676.f11524.f11526) {
                                    AbstractC2834.m4823(null, 3, "暂不支持 实况");
                                    return c3497;
                                }
                                AbstractC2834.m4823(null, 3, "暂不支持的转圈类型: " + iIntValue);
                                return c3497;
                            }
                            String str5 = c3397.f10701;
                            Object objM2191 = AbstractC0744.m2191(linkedList2);
                            C2779.f8880.getClass();
                            Object objInvoke3 = AbstractC1574.m3315(C2777.f8878).invoke(null, objM2191);
                            String str6 = objInvoke3 instanceof String ? (String) objInvoke3 : null;
                            Object objInvoke4 = AbstractC1574.m3315(C2778.f8879).invoke(null, objM2191);
                            "null cannot be cast to non-null type kotlin.String";
                            String str7 = (String) objInvoke4;
                            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
                            C2781 c2781 = C2781.f8882;
                            String str8 = "";
                            c2781.getClass();
                            C2780 c2780 = C2780.f8881;
                            Method methodM3316 = AbstractC1574.m3315(c2780);
                            C2724.f8788.getClass();
                            int i6 = AbstractC1745.f5844;
                            C1973 c1973M3496 = AbstractC0968.m2483(AbstractC1574.m3313(C2723.f8787)).m3492();
                            c1973M3496.m3800(enumC1999);
                            c1973M3496.f6543 = AbstractC1574.m3315(c2780).getDeclaringClass();
                            Object objInvoke5 = methodM3316.invoke(((C1982) AbstractC1194.m2778(c1973M3496)).m3831(new Object[0]), objM2191, Integer.valueOf(iCurrentTimeMillis), str, Boolean.FALSE, Boolean.TRUE, 30, str8);
                            "null cannot be cast to non-null type kotlin.Boolean";
                            ((Boolean) objInvoke5).getClass();
                            if (str6 != null) {
                                ((Handler) AbstractC1472.f5245.getValue()).postDelayed(new RunnableC1509(new C1932(activity, str6, str7, str5), c2733, 0), 500L);
                                return c3497;
                            }
                            AbstractC2834.m4823(null, 3, "视频暂未缓存或者获取路径失败");
                            return c3497;
                        }
                        String str9 = c3397.f10701;
                        C2950 c2950 = c3397.f10704;
                        List list = c2950.f9436;
                        String str10 = c2950.f9434;
                        String str11 = c2950.f9435;
                        String str12 = ((C2977) AbstractC0744.m2191(list)).f9526;
                        Intent intent2 = new Intent();
                        intent2.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        intent2.putExtra("Ksnsupload_type", 1);
                        intent2.putExtra("Ksnsupload_title", str10);
                        intent2.putExtra("Ksnsupload_link", str11);
                        intent2.putExtra("Ksnsupload_imgurl", str12);
                        intent2.putExtra("Kdescription", str9);
                        activity.startActivity(intent2);
                    }
                }
                return c3497;
        }
    }
}
