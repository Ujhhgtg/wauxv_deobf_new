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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲁᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2750 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f8834;

    public /* synthetic */ C2750(Activity activity, int i) {
        this.f8833 = i;
        this.f8834 = activity;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i = this.f8833;
        int i2 = 1;
        Activity activity = this.f8834;
        switch (i) {
            case 0:
                C1809 c1809 = new C1809(10);
                String[] strArr = AbstractC1574.f5469;
                String str = "default";
                String str2 = "默认";
                C2752 c2752 = new C2752();
                c2752.f8837 = "";
                "";
                c2752.f8837 = str;
                c2752.f8838 = str2;
                c1809.add(c2752);
                C0811.f3173.getClass();
                Method methodM3315 = AbstractC1574.m3315(C0808.f3170);
                C0806.f3168.getClass();
                Object objInvoke = methodM3315.invoke(C0806.m2359(), null);
                "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>";
                List list = (List) objInvoke;
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
                for (Object obj2 : list) {
                    C2752 c2753 = new C2752();
                    c2753.f8837 = "";
                    c2753.f8838 = "";
                    int i3 = AbstractC1745.f5844;
                    C1299 c1299M3490 = AbstractC0968.m2484(obj2).m3490();
                    c1299M3490.f6370 = "field_labelID";
                    c2753.f8837 = String.valueOf(((C1315) AbstractC2784.m4741(c1299M3490)).m3024());
                    C1299 c1299M3491 = AbstractC0968.m2484(obj2).m3490();
                    c1299M3491.f6370 = "field_labelName";
                    c2753.f8838 = (String) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024();
                    arrayList.add(c2753);
                }
                c1809.addAll(arrayList);
                final C1809 c1809M3173 = AbstractC1459.m3173(c1809);
                C2755 c2755 = C2755.f8841;
                final C2750 c2750 = new C2750(activity, i2);
                c2755.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(c1809M3173, 10));
                ListIterator listIterator = c1809M3173.listIterator(0);
                while (true) {
                    C1807 c1807 = (C1807) listIterator;
                    if (c1807.hasNext()) {
                        C2752 c2754 = (C2752) c1807.next();
                        String str3 = c2754.f8837;
                        String string = c2754.f8838;
                        if (!AbstractC2207.m4087(str3, "default")) {
                            StringBuilder sbM4753 = AbstractC2784.m4753(string);
                            sbM4753.append(" [");
                            C0811 c0811 = C0811.f3173;
                            String str4 = c2754.f8837;
                            c0811.getClass();
                            sbM4753.append(C0811.m2360(str4).size());
                            sbM4753.append(']');
                            string = sbM4753.toString();
                        }
                        arrayList2.add(string);
                    } else {
                        String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                        ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(c1809M3173, 10));
                        ListIterator listIterator2 = c1809M3173.listIterator(0);
                        while (true) {
                            C1807 c1808 = (C1807) listIterator2;
                            if (!c1808.hasNext()) {
                                final boolean[] zArrM2202 = AbstractC0744.m2202(arrayList3);
                                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                                builder.setTitle("请选择过滤标签");
                                builder.setMultiChoiceItems(strArr2, zArrM2202, new DialogInterface.OnMultiChoiceClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᤝᲈᲁᛸ
                                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i4, boolean z) {
                                        zArrM2202[i4] = z;
                                    }
                                });
                                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲁᛸᤝᲈ
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i4) throws IllegalAccessException, InvocationTargetException {
                                        ArrayList arrayList4 = new ArrayList();
                                        int i5 = 0;
                                        ListIterator listIterator3 = c1809M3173.listIterator(0);
                                        while (true) {
                                            C1807 c18010 = (C1807) listIterator3;
                                            if (!c18010.hasNext()) {
                                                ArrayList arrayList5 = new ArrayList(AbstractC0746.m2214(arrayList4, 10));
                                                Iterator it = arrayList4.iterator();
                                                while (it.hasNext()) {
                                                    arrayList5.add(((C2752) it.next()).f8837);
                                                }
                                                Set setM2209 = AbstractC0744.m2209(arrayList5);
                                                C2754.f8840.m2547(setM2209);
                                                c2750.invoke(setM2209);
                                                return;
                                            }
                                            Object next = c18010.next();
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                AbstractC0745.m2213();
                                                throw null;
                                            }
                                            if (zArrM2202[i5]) {
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
                            arrayList3.add(Boolean.valueOf(C2754.f8840.m2541().contains(((C2752) c1808.next()).f8837)));
                        }
                    }
                }
                break;
            default:
                C2761.f8850.getClass();
                C1565.f5440.getClass();
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(C1565.m3280() ? C2760.f8849.m2538() : AbstractC0968.m2475(C2761.m4733()));
                int i4 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(viewGroup).m3492();
                Class cls = Integer.TYPE;
                ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls), AbstractC2519.m4527(cls), AbstractC2519.m4527(cls)}, 3, c1973M3492)).m3831(0, 0, 0);
                C1973 c1973M3493 = AbstractC0968.m2484(viewGroup).m3492();
                String[] strArr3 = AbstractC1574.f5469;
                c1973M3493.f6370 = MagicFactory.get(-602777185155764L, strArr3);
                C1299 c1299M3492 = AbstractC0968.m2484(((C1982) AbstractC2784.m4742(c1973M3493)).m3831(new Object[0])).m3490();
                c1299M3492.f4725 = MagicFactory.get(-602824429796020L, strArr3);
                Object objM3023 = ((C1315) AbstractC2784.m4741(c1299M3492)).m3023();
                Method methodM3316 = AbstractC1574.m3315(C2753.f8839);
                if (methodM3316.getParameterCount() == 4) {
                    methodM3316.invoke(null, objM3023, null, 1, null);
                } else {
                    methodM3316.invoke(objM3023, null);
                }
                return C3497.f10997;
        }
    }
}
