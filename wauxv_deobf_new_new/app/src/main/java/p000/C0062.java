package p000;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0062 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1053;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1054;

    public /* synthetic */ C0062(Object obj, int i) {
        this.f1053 = i;
        this.f1054 = obj;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        int i = this.f1053;
        boolean zM4861 = true;
        C0815 c0815 = null;
        C3554 c3554 = C3554.UNIT;
        Object obj2 = this.f1054;
        switch (i) {
            case 0:
                return obj == ((AbstractC0070) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                C1830 c1830 = (C1830) obj2;
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Integer num = (Integer) (c2641 instanceof C2641 ? null : c2641);
                c1830.setSelectedTabIndex(num != null ? num.intValue() : 0);
                return c3554;
            case 2:
                C0425 c0425 = (C0425) obj2;
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                Integer num2 = (Integer) (c2642 instanceof C2641 ? null : c2642);
                c0425.setSelectedItemId(num2 != null ? num2.intValue() : 0);
                return c3554;
            case 3:
                C1496 c1496 = (C1496) obj2;
                C1496 c1497 = (C1496) obj;
                return Boolean.valueOf(AbstractC1469.m3322(c1497.f5292, c1496.f5292) && c1497.f5293 == c1496.f5293 && AbstractC1469.m3322(c1497.f5294, c1496.f5294));
            case 4:
                CompoundButton compoundButton = (CompoundButton) obj2;
                C0814 c0814 = (C0814) obj;
                if (AbstractC2901.m4869(((EditText) c0814.f3193.getValue()).getText())) {
                    String string = compoundButton.getText().toString();
                    C0815 c0816 = c0814.f3188;
                    if (c0816 == null) {
                        "info";
                    } else {
                        c0815 = c0816;
                    }
                    List listM2485 = c0815.m2485(string);
                    c0814.f3199 = new C0799(c0814);
                    ((RecyclerView) c0814.f3192.getValue()).setAdapter(c0814.f3199);
                    C0799.m2467(c0814.f3199, listM2485);
                } else {
                    c0814.m2481(((EditText) c0814.f3193.getValue()).getText().toString());
                }
                c0814.m2480();
                return c3554;
            case 5:
                Boolean bool = (Boolean) obj2;
                AbstractC2927 abstractC2927 = (AbstractC2927) obj;
                String[] strArr = AbstractC1471.f5234;
                if (bool.equals(Boolean.TRUE)) {
                    zM4861 = AbstractC2901.m4861(abstractC2927.mo1275(), "测试/", false);
                } else {
                    if (!bool.equals(Boolean.FALSE)) {
                        throw new C0758();
                    }
                    if (AbstractC2901.m4861(abstractC2927.mo1275(), "测试/", false)) {
                        zM4861 = false;
                    }
                }
                return Boolean.valueOf(zM4861);
            case 6:
                return Boolean.valueOf(((C1363) obj).f4875 == ((C1363) obj2).f4875);
            case 7:
                C3752 c3752 = (C3752) obj2;
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2643 = c1576.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                Object obj3 = c2643 instanceof C2641 ? null : c2643;
                if (obj3 != null) {
                    int i2 = AbstractC1768.f5906;
                    C1681 c1681M4713 = AbstractC2727.m4713(obj3);
                    C1872 c1872 = C1872.f6214;
                    C2004 c2004M3560 = c1681M4713.m3560();
                    String[] strArr2 = AbstractC1471.f5234;
                    c2004M3560.f6475 = "getLatitude";
                    C3752 c3752M4303 = c1872.m4303((C2013) AbstractC0739.m2290(c2004M3560.m3993()), 1);
                    c1872.m3444(c3752M4303, new C1633(15));
                    c3752M4303.m5360();
                    C2004 c2004M3561 = c1681M4713.m3560();
                    c2004M3561.f6475 = "getLongitude";
                    C3752 c3752M4304 = c1872.m4303((C2013) AbstractC0739.m2290(c2004M3561.m3993()), 1);
                    c1872.m3444(c3752M4304, new C1633(21));
                    c3752M4304.m5360();
                }
                C3752.m5357(c3752);
                return c3554;
            case 8:
                C1574 c1577 = (C1574) obj;
                int parameterCount = ((Constructor) obj2).getParameterCount();
                int i3 = 8;
                if (parameterCount != 13 && parameterCount != 14) {
                    i3 = 7;
                }
                c1577.getClass();
                try {
                    c2644 = c1577.m3447()[i3];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                if (c2644 instanceof C2641) {
                    c2644 = null;
                }
                String str = (String) c2644;
                if (str == null) {
                    str = "";
                }
                C0383 c0383 = new C0383(i3, 6, c1577);
                C2089.f6967.getClass();
                String strM2666 = C2087.f6965.m2666();
                String[] strArr3 = AbstractC1471.f5234;
                c0383.m1714(AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(strM2666, "${sendText}", str), "${line}", "\n"), "${sendTime}", AbstractC2234.m4188(System.currentTimeMillis(), C2088.f6966.m2666(), null, 2)));
                return c3554;
            case 9:
                List list = (List) obj2;
                C1334 c1334 = (C1334) obj;
                c1334.getClass();
                C0700 c0700 = new C0700();
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2897((String) it.next(), 5, false));
                }
                c0700.f2682 = new ArrayList(arrayList);
                c1334.f4791 = c0700;
                return c3554;
            case 10:
                ((Runnable) obj2).run();
                return c3554;
            default:
                AbstractC1467.m3288((Context) obj2, 4, (String) obj);
                return c3554;
        }
    }
}
