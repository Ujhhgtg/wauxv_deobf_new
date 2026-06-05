package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴ要点脸能不能ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1073feyxiexzfUjhhgtg implements InterfaceC3556feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4145Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1073feyxiexzfUjhhgtg(int i) {
        this.f4145Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3556feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1207Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
        int i = this.f4145Ujhhgtgfeyxiexzf;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_snsId";
                final long jLongValue = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).longValue();
                AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C1071feyxiexzfUjhhgtg.f4140Ujhhgtgfeyxiexzf, new InterfaceC3549feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴ要点脸ᛱUjhhgtgᛱ能不能ᛲ
                    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
                    public final Object invoke(Object obj4) {
                        C1427feyxiexzfUjhhgtg c1427feyxiexzfUjhhgtg = new C1427feyxiexzfUjhhgtg((C1071feyxiexzfUjhhgtg) obj4, jLongValue, 1);
                        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                        C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c1427feyxiexzfUjhhgtg, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                    }
                });
                return c1943Ujhhgtgfeyxiexzf;
            default:
                Activity activity = (Activity) obj;
                C1070feyxiexzfUjhhgtg c1070feyxiexzfUjhhgtg = C1070feyxiexzfUjhhgtg.f4136Ujhhgtgfeyxiexzf;
                int i3 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2024Ujhhgtgfeyxiexzf();
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "getLocalid";
                String str = (String) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "getTypeFlag";
                int iIntValue = ((Number) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1650Ujhhgtgfeyxiexzf(new Object[0])).intValue();
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj3).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "toByteArray";
                byte[] bArr = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg = C0858feyxiexzfUjhhgtg.f3350Ujhhgtgfeyxiexzf;
                c0858feyxiexzfUjhhgtg.getClass();
                C1734Ujhhgtgfeyxiexzf c1734Ujhhgtgfeyxiexzf = (C1734Ujhhgtgfeyxiexzf) c0858feyxiexzfUjhhgtg.m2263Ujhhgtgfeyxiexzf(C1734Ujhhgtgfeyxiexzf.Companion.serializer(), bArr);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj3).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "ContentObj";
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4938Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(LinkedList.class);
                Iterator it = c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf().iterator();
                Object obj4 = null;
                boolean z = false;
                Object obj5 = null;
                while (true) {
                    int i4 = 1;
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        LinkedList linkedList = (LinkedList) ((C3438feyxiexzfUjhhgtg) obj5).m4939Ujhhgtgfeyxiexzf();
                        if (iIntValue == EnumC2265feyxiexzfUjhhgtg.f7392Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf) {
                            String str2 = c1734Ujhhgtgfeyxiexzf.f5814Ujhhgtgfeyxiexzf;
                            Intent intent = new Intent();
                            intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            intent.putExtra("Ksnsupload_type", 9);
                            intent.putExtra("Kdescription", str2);
                            activity.startActivity(intent);
                        } else {
                            int i5 = EnumC2265feyxiexzfUjhhgtg.f7391Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf;
                            EnumC0283Ujhhgtgfeyxiexzf enumC0283Ujhhgtgfeyxiexzf = EnumC0283Ujhhgtgfeyxiexzf.STATIC;
                            if (iIntValue == i5) {
                                String str3 = c1734Ujhhgtgfeyxiexzf.f5814Ujhhgtgfeyxiexzf;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj6 : linkedList) {
                                    C0064Ujhhgtgfeyxiexzf.f1079Ujhhgtgfeyxiexzf.getClass();
                                    Object objInvoke = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C0062Ujhhgtgfeyxiexzf.f1076Ujhhgtgfeyxiexzf).invoke(obj4, obj6);
                                    "null cannot be cast to non-null type kotlin.String";
                                    String str4 = (String) objInvoke;
                                    C1065feyxiexzfUjhhgtg c1065feyxiexzfUjhhgtg = C1065feyxiexzfUjhhgtg.f4126Ujhhgtgfeyxiexzf;
                                    C1202feyxiexzfUjhhgtg.f4499Ujhhgtgfeyxiexzf.getClass();
                                    int i6 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                                    C3658Ujhhgtgfeyxiexzf c3658UjhhgtgfeyxiexzfM2017Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1203feyxiexzfUjhhgtg.f4500Ujhhgtgfeyxiexzf)).m2017Ujhhgtgfeyxiexzf();
                                    c3658UjhhgtgfeyxiexzfM2017Ujhhgtgfeyxiexzf.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class)}, i4));
                                    Object objM5357Ujhhgtgfeyxiexzf = ((C3660Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3658UjhhgtgfeyxiexzfM2017Ujhhgtgfeyxiexzf.m5356Ujhhgtgfeyxiexzf())).m5357Ujhhgtgfeyxiexzf("timeline");
                                    c1065feyxiexzfUjhhgtg.getClass();
                                    C1062feyxiexzfUjhhgtg c1062feyxiexzfUjhhgtg = C1062feyxiexzfUjhhgtg.f4120Ujhhgtgfeyxiexzf;
                                    Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c1062feyxiexzfUjhhgtg);
                                    C1063feyxiexzfUjhhgtg.f4121Ujhhgtgfeyxiexzf.getClass();
                                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1067feyxiexzfUjhhgtg.f4133Ujhhgtgfeyxiexzf)).m2024Ujhhgtgfeyxiexzf();
                                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1636Ujhhgtgfeyxiexzf(enumC0283Ujhhgtgfeyxiexzf);
                                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f2121feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c1062feyxiexzfUjhhgtg).getDeclaringClass();
                                    Object objInvoke2 = methodM3154feyxiexzfUjhhgtg.invoke(((C0393Ujhhgtgfeyxiexzf) AbstractC3317feyxiexzfUjhhgtg.m4794Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4)).m1649Ujhhgtgfeyxiexzf(new Object[0]), obj6, 2, null, objM5357Ujhhgtgfeyxiexzf);
                                    "null cannot be cast to non-null type kotlin.Boolean";
                                    if (!((Boolean) objInvoke2).booleanValue()) {
                                        str4 = null;
                                    }
                                    if (str4 != null) {
                                        arrayList.add(str4);
                                    }
                                    i4 = 1;
                                    obj4 = null;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                AbstractC2856feyxiexzfUjhhgtg.m4251feyxiexzfUjhhgtg(arrayList, arrayList2);
                                ((Handler) AbstractC3602Ujhhgtgfeyxiexzf.f11213Ujhhgtgfeyxiexzf.getValue()).postDelayed(new RunnableC0523Ujhhgtgfeyxiexzf(new C3472Ujhhgtgfeyxiexzf(activity, arrayList2, str3, 3), c1070feyxiexzfUjhhgtg, 0), 500L);
                            } else if (iIntValue == EnumC2265feyxiexzfUjhhgtg.f7393Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf) {
                                String str5 = c1734Ujhhgtgfeyxiexzf.f5814Ujhhgtgfeyxiexzf;
                                C2020feyxiexzfUjhhgtg c2020feyxiexzfUjhhgtg = c1734Ujhhgtgfeyxiexzf.f5817Ujhhgtgfeyxiexzf;
                                List list = c2020feyxiexzfUjhhgtg.f6616Ujhhgtgfeyxiexzf;
                                String str6 = c2020feyxiexzfUjhhgtg.f6614Ujhhgtgfeyxiexzf;
                                String str7 = c2020feyxiexzfUjhhgtg.f6615Ujhhgtgfeyxiexzf;
                                String str8 = ((C2040feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(list)).f6690Ujhhgtgfeyxiexzf;
                                Intent intent2 = new Intent();
                                intent2.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                                intent2.putExtra("Ksnsupload_type", 1);
                                intent2.putExtra("Ksnsupload_title", str6);
                                intent2.putExtra("Ksnsupload_link", str7);
                                intent2.putExtra("Ksnsupload_imgurl", str8);
                                intent2.putExtra("Kdescription", str5);
                                activity.startActivity(intent2);
                            } else if (iIntValue == EnumC2265feyxiexzfUjhhgtg.f7394Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf) {
                                String str9 = c1734Ujhhgtgfeyxiexzf.f5814Ujhhgtgfeyxiexzf;
                                Object objM4238feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(linkedList);
                                C1218feyxiexzfUjhhgtg.f4528Ujhhgtgfeyxiexzf.getClass();
                                Object objInvoke3 = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1223feyxiexzfUjhhgtg.f4533Ujhhgtgfeyxiexzf).invoke(null, objM4238feyxiexzfUjhhgtg);
                                String str10 = objInvoke3 instanceof String ? (String) objInvoke3 : null;
                                Object objInvoke4 = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1219feyxiexzfUjhhgtg.f4529Ujhhgtgfeyxiexzf).invoke(null, objM4238feyxiexzfUjhhgtg);
                                "null cannot be cast to non-null type kotlin.String";
                                String str11 = (String) objInvoke4;
                                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
                                C1220feyxiexzfUjhhgtg c1220feyxiexzfUjhhgtg = C1220feyxiexzfUjhhgtg.f4530Ujhhgtgfeyxiexzf;
                                String str12 = "";
                                c1220feyxiexzfUjhhgtg.getClass();
                                C1221feyxiexzfUjhhgtg c1221feyxiexzfUjhhgtg = C1221feyxiexzfUjhhgtg.f4531Ujhhgtgfeyxiexzf;
                                Method methodM3154feyxiexzfUjhhgtg2 = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c1221feyxiexzfUjhhgtg);
                                C1063feyxiexzfUjhhgtg.f4121Ujhhgtgfeyxiexzf.getClass();
                                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1067feyxiexzfUjhhgtg.f4133Ujhhgtgfeyxiexzf)).m2024Ujhhgtgfeyxiexzf();
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.m1636Ujhhgtgfeyxiexzf(enumC0283Ujhhgtgfeyxiexzf);
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.f2121feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c1221feyxiexzfUjhhgtg).getDeclaringClass();
                                Object objInvoke5 = methodM3154feyxiexzfUjhhgtg2.invoke(((C0393Ujhhgtgfeyxiexzf) AbstractC3317feyxiexzfUjhhgtg.m4794Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5)).m1649Ujhhgtgfeyxiexzf(new Object[0]), objM4238feyxiexzfUjhhgtg, Integer.valueOf(iCurrentTimeMillis), str, Boolean.FALSE, Boolean.TRUE, 30, str12);
                                "null cannot be cast to non-null type kotlin.Boolean";
                                ((Boolean) objInvoke5).getClass();
                                if (str10 != null) {
                                    ((Handler) AbstractC3602Ujhhgtgfeyxiexzf.f11213Ujhhgtgfeyxiexzf.getValue()).postDelayed(new RunnableC0523Ujhhgtgfeyxiexzf(new C0219Ujhhgtgfeyxiexzf(activity, str10, str11, str9), c1070feyxiexzfUjhhgtg, 0), 500L);
                                } else {
                                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "视频暂未缓存或者获取路径失败");
                                }
                            } else if (iIntValue == EnumC2265feyxiexzfUjhhgtg.f7395Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf) {
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "暂不支持 视频号");
                            } else if (iIntValue == EnumC2265feyxiexzfUjhhgtg.f7396Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf) {
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "暂不支持 实况");
                            } else {
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "暂不支持的转圈类型: " + iIntValue);
                            }
                        }
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                    Object next = it.next();
                    LinkedList linkedList2 = (LinkedList) ((C3438feyxiexzfUjhhgtg) next).m4939Ujhhgtgfeyxiexzf();
                    if (linkedList2 != null && (!linkedList2.isEmpty())) {
                        if (z) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj5 = next;
                        z = true;
                    }
                }
                break;
        }
    }
}
