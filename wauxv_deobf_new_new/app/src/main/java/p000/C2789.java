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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᲈᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2789 implements InterfaceC1438 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8958;

    public /* synthetic */ C2789(int i) {
        this.f8958 = i;
    }

    @Override // p000.InterfaceC1438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo2135(Object obj, Object obj2, Object obj3) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int i = this.f8958;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                int i2 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(obj2).m3558();
                c1300M3558.f6475 = "field_snsId";
                final long jLongValue = ((Number) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).longValue();
                C1787.m3673(C2792.f8961, new InterfaceC1433() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᲈᤞᛸᤝ
                    @Override // p000.InterfaceC1433
                    public final Object invoke(Object obj4) {
                        C2413 c2413 = new C2413((C2792) obj4, jLongValue, 1);
                        C1006 c1006 = AbstractC1080.f3904;
                        AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c2413, (InterfaceC0841) null));
                        return C3554.UNIT;
                    }
                });
                return c3554;
            default:
                Activity activity = (Activity) obj;
                C2793 c2793 = C2793.f8965;
                int i3 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(obj2).m3560();
                String[] strArr = AbstractC1471.f5234;
                c2004M3560.f6475 = "getLocalid";
                String str = (String) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                C2004 c2004M3561 = AbstractC2727.m4713(obj2).m3560();
                c2004M3561.f6475 = "getTypeFlag";
                int iIntValue = ((Number) ((C2013) AbstractC2844.m4776(c2004M3561)).m4026(new Object[0])).intValue();
                C2004 c2004M3562 = AbstractC2727.m4713(obj3).m3560();
                c2004M3562.f6475 = "toByteArray";
                byte[] bArr = (byte[]) ((C2013) AbstractC2844.m4776(c2004M3562)).m4026(new Object[0]);
                C2480 c2480 = C2480.f7862;
                c2480.getClass();
                C3456 c3456 = (C3456) c2480.m4408(C3456.Companion.serializer(), bArr);
                C1300 c1300M3559 = AbstractC2727.m4713(obj3).m3558();
                c1300M3559.f6475 = "ContentObj";
                C1300 c1300M35510 = AbstractC2727.m4713(((C1316) AbstractC2844.m4775(c1300M3559)).m3126()).m3558();
                c1300M35510.f4724 = AbstractC2574.m4549(LinkedList.class);
                Iterator it = c1300M35510.m3117().iterator();
                Object obj4 = null;
                boolean z = false;
                Object obj5 = null;
                while (true) {
                    int i4 = 1;
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        LinkedList linkedList = (LinkedList) ((C1316) obj5).m3127();
                        if (iIntValue == EnumC3736.f11669.f11675) {
                            String str2 = c3456.f10868;
                            Intent intent = new Intent();
                            intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            intent.putExtra("Ksnsupload_type", 9);
                            intent.putExtra("Kdescription", str2);
                            activity.startActivity(intent);
                        } else {
                            int i5 = EnumC3736.f11668.f11675;
                            EnumC2030 enumC2030 = EnumC2030.STATIC;
                            if (iIntValue == i5) {
                                String str3 = c3456.f10868;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj6 : linkedList) {
                                    C1786.f5940.getClass();
                                    Object objInvoke = AbstractC0972.m2610(C1784.f5938).invoke(obj4, obj6);
                                    "null cannot be cast to non-null type kotlin.String";
                                    String str4 = (String) objInvoke;
                                    C2786 c2786 = C2786.f8952;
                                    C2823.f9014.getClass();
                                    int i6 = AbstractC1768.f5906;
                                    C0795 c0795M3555 = AbstractC2727.m4712(AbstractC0972.m2608(C2822.f9013)).m3555();
                                    c0795M3555.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(String.class)}, i4));
                                    Object objM2466 = ((C0797) AbstractC0739.m2290(c0795M3555.m2459())).m2466("timeline");
                                    c2786.getClass();
                                    C2785 c2785 = C2785.f8951;
                                    Method methodM2610 = AbstractC0972.m2610(c2785);
                                    C2784.f8950.getClass();
                                    C2004 c2004M3563 = AbstractC2727.m4712(AbstractC0972.m2608(C2783.f8949)).m3560();
                                    c2004M3563.m3994(enumC2030);
                                    c2004M3563.f6648 = AbstractC0972.m2610(c2785).getDeclaringClass();
                                    Object objInvoke2 = methodM2610.invoke(((C2013) AbstractC1095.m2793(c2004M3563)).m4025(new Object[0]), obj6, 2, null, objM2466);
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
                                AbstractC0739.m2303(arrayList, arrayList2);
                                ((Handler) AbstractC1483.f5277.getValue()).postDelayed(new RunnableC1521(new C1355(activity, arrayList2, str3, 3), c2793, 0), 500L);
                            } else if (iIntValue == EnumC3736.f11670.f11675) {
                                String str5 = c3456.f10868;
                                C3009 c3009 = c3456.f10871;
                                List list = c3009.f9603;
                                String str6 = c3009.f9601;
                                String str7 = c3009.f9602;
                                String str8 = ((C3036) AbstractC0739.m2290(list)).f9693;
                                Intent intent2 = new Intent();
                                intent2.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                                intent2.putExtra("Ksnsupload_type", 1);
                                intent2.putExtra("Ksnsupload_title", str6);
                                intent2.putExtra("Ksnsupload_link", str7);
                                intent2.putExtra("Ksnsupload_imgurl", str8);
                                intent2.putExtra("Kdescription", str5);
                                activity.startActivity(intent2);
                            } else if (iIntValue == EnumC3736.f11671.f11675) {
                                String str9 = c3456.f10868;
                                Object objM2290 = AbstractC0739.m2290(linkedList);
                                C2839.f9042.getClass();
                                Object objInvoke3 = AbstractC0972.m2610(C2837.f9040).invoke(null, objM2290);
                                String str10 = objInvoke3 instanceof String ? (String) objInvoke3 : null;
                                Object objInvoke4 = AbstractC0972.m2610(C2838.f9041).invoke(null, objM2290);
                                "null cannot be cast to non-null type kotlin.String";
                                String str11 = (String) objInvoke4;
                                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
                                C2841 c2841 = C2841.f9044;
                                String str12 = "";
                                c2841.getClass();
                                C2840 c2840 = C2840.f9043;
                                Method methodM2611 = AbstractC0972.m2610(c2840);
                                C2784.f8950.getClass();
                                int i7 = AbstractC1768.f5906;
                                C2004 c2004M3564 = AbstractC2727.m4712(AbstractC0972.m2608(C2783.f8949)).m3560();
                                c2004M3564.m3994(enumC2030);
                                c2004M3564.f6648 = AbstractC0972.m2610(c2840).getDeclaringClass();
                                Object objInvoke5 = methodM2611.invoke(((C2013) AbstractC1095.m2793(c2004M3564)).m4025(new Object[0]), objM2290, Integer.valueOf(iCurrentTimeMillis), str, Boolean.FALSE, Boolean.TRUE, 30, str12);
                                "null cannot be cast to non-null type kotlin.Boolean";
                                ((Boolean) objInvoke5).getClass();
                                if (str10 != null) {
                                    ((Handler) AbstractC1483.f5277.getValue()).postDelayed(new RunnableC1521(new C1963(activity, str10, str11, str9), c2793, 0), 500L);
                                } else {
                                    AbstractC2894.m4856(null, 3, "视频暂未缓存或者获取路径失败");
                                }
                            } else if (iIntValue == EnumC3736.f11672.f11675) {
                                AbstractC2894.m4856(null, 3, "暂不支持 视频号");
                            } else if (iIntValue == EnumC3736.f11673.f11675) {
                                AbstractC2894.m4856(null, 3, "暂不支持 实况");
                            } else {
                                AbstractC2894.m4856(null, 3, "暂不支持的转圈类型: " + iIntValue);
                            }
                        }
                        return c3554;
                    }
                    Object next = it.next();
                    LinkedList linkedList2 = (LinkedList) ((C1316) next).m3127();
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
