package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2810 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8995;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Activity f8996;

    public /* synthetic */ C2810(Activity activity, int i) {
        this.f8995 = i;
        this.f8996 = activity;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int i = this.f8995;
        int i2 = 1;
        Activity activity = this.f8996;
        switch (i) {
            case 0:
                C1836 c1836 = new C1836(10);
                String[] strArr = AbstractC1471.f5234;
                String str = "default";
                String str2 = "默认";
                C2812 c2812 = new C2812();
                c2812.f8999 = "";
                "";
                c2812.f8999 = str;
                c2812.f9000 = str2;
                c1836.add(c2812);
                C0810.f3180.getClass();
                List listM2476 = C0810.m2476();
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(listM2476, 10));
                for (Object obj2 : listM2476) {
                    C2812 c2813 = new C2812();
                    c2813.f8999 = "";
                    c2813.f9000 = "";
                    int i3 = AbstractC1768.f5906;
                    C1300 c1300M3558 = AbstractC2727.m4713(obj2).m3558();
                    c1300M3558.f6475 = "field_labelID";
                    c2813.f8999 = String.valueOf(((C1316) AbstractC2844.m4775(c1300M3558)).m3127());
                    C1300 c1300M3559 = AbstractC2727.m4713(obj2).m3558();
                    c1300M3559.f6475 = "field_labelName";
                    c2813.f9000 = (String) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127();
                    arrayList.add(c2813);
                }
                c1836.addAll(arrayList);
                final C1836 c1836M5324 = AbstractC3744.m5324(c1836);
                C2815 c2815 = C2815.f9003;
                final C2810 c2810 = new C2810(activity, i2);
                c2815.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(c1836M5324, 10));
                ListIterator listIterator = c1836M5324.listIterator(0);
                while (true) {
                    C1834 c1834 = (C1834) listIterator;
                    if (c1834.hasNext()) {
                        C2812 c2814 = (C2812) c1834.next();
                        String str3 = c2814.f8999;
                        String string = c2814.f9000;
                        if (!AbstractC1469.m3322(str3, "default")) {
                            StringBuilder sbM4787 = AbstractC2844.m4787(string);
                            sbM4787.append(" [");
                            C0810 c0810 = C0810.f3180;
                            String str4 = c2814.f8999;
                            c0810.getClass();
                            sbM4787.append(C0810.m2477(str4).size());
                            sbM4787.append(']');
                            string = sbM4787.toString();
                        }
                        arrayList2.add(string);
                    } else {
                        String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                        ArrayList arrayList3 = new ArrayList(AbstractC0741.m2313(c1836M5324, 10));
                        ListIterator listIterator2 = c1836M5324.listIterator(0);
                        while (true) {
                            C1834 c1835 = (C1834) listIterator2;
                            if (!c1835.hasNext()) {
                                final boolean[] zArrM2301 = AbstractC0739.m2301(arrayList3);
                                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                                builder.setTitle("请选择过滤标签");
                                builder.setMultiChoiceItems(strArr2, zArrM2301, new DialogInterface.OnMultiChoiceClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᤞᲁᛸᤝ
                                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i4, boolean z) {
                                        zArrM2301[i4] = z;
                                    }
                                });
                                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᤞᲁᤝᛸ
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i4) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                                        ArrayList arrayList4 = new ArrayList();
                                        int i5 = 0;
                                        ListIterator listIterator3 = c1836M5324.listIterator(0);
                                        while (true) {
                                            C1834 c1837 = (C1834) listIterator3;
                                            if (!c1837.hasNext()) {
                                                ArrayList arrayList5 = new ArrayList(AbstractC0741.m2313(arrayList4, 10));
                                                Iterator it = arrayList4.iterator();
                                                while (it.hasNext()) {
                                                    arrayList5.add(((C2812) it.next()).f8999);
                                                }
                                                Set setM2308 = AbstractC0739.m2308(arrayList5);
                                                C2814.f9002.m2671(setM2308);
                                                c2810.invoke(setM2308);
                                                return;
                                            }
                                            Object next = c1837.next();
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                AbstractC0740.m2312();
                                                throw null;
                                            }
                                            if (zArrM2301[i5]) {
                                                arrayList4.add(next);
                                            }
                                            i5 = i6;
                                        }
                                    }
                                });
                                builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                                builder.show();
                                return Boolean.TRUE;
                            }
                            arrayList3.add(Boolean.valueOf(C2814.f9002.m2665().contains(((C2812) c1835.next()).f8999)));
                        }
                    }
                }
                break;
            default:
                C2821.f9012.getClass();
                C1576.f5470.getClass();
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(C1576.m3460() ? C2820.f9011.m2662() : AbstractC1468.m3308(C2821.m4767()));
                int i4 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(viewGroup).m3560();
                Class cls = Integer.TYPE;
                ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(cls)}, 3, c2004M3560)).m4025(0, 0, 0);
                C2004 c2004M3561 = AbstractC2727.m4713(viewGroup).m3560();
                String[] strArr3 = AbstractC1471.f5234;
                c2004M3561.f6475 = "getAdapter";
                C1300 c1300M35510 = AbstractC2727.m4713(((C2013) AbstractC2844.m4776(c2004M3561)).m4025(new Object[0])).m3558();
                c1300M35510.f4724 = "com.tencent.mm.plugin.mvvmlist.MvvmList";
                Object objM3126 = ((C1316) AbstractC2844.m4775(c1300M35510)).m3126();
                Method methodM2610 = AbstractC0972.m2610(C2813.f9001);
                if (methodM2610.getParameterCount() == 4) {
                    methodM2610.invoke(null, objM3126, null, 1, null);
                } else {
                    methodM2610.invoke(objM3126, null);
                }
                return C3554.UNIT;
        }
    }
}
