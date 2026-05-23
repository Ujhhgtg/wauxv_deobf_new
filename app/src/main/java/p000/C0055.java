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
public final /* synthetic */ class C0055 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f988;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f989;

    public /* synthetic */ C0055(int i, Object obj) {
        this.f988 = i;
        this.f989 = obj;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        int i = this.f988;
        boolean zM4828 = true;
        int i2 = 5;
        int i3 = 4;
        C0816 c0816 = null;
        Unit unit = Unit.INSTANCE;
        Object obj2 = this.f989;
        switch (i) {
            case 0:
                return obj == ((AbstractC0063) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                C1803 c1803 = (C1803) obj2;
                C1563 c1563 = (C1563) obj;
                
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                Integer num = (Integer) (c2585 instanceof C2585 ? null : c2585);
                c1803.setSelectedTabIndex(num != null ? num.intValue() : 0);
                return unit;
            case 2:
                C0450 c0450 = (C0450) obj2;
                C1563 c1564 = (C1563) obj;
                
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                Integer num2 = (Integer) (c2586 instanceof C2585 ? null : c2586);
                c0450.setSelectedItemId(num2 != null ? num2.intValue() : 0);
                return unit;
            case 3:
                CompoundButton compoundButton = (CompoundButton) obj2;
                C0815 c0815 = (C0815) obj;
                if (AbstractC2841.m4836(((EditText) c0815.f3186.getValue()).getText())) {
                    String string = compoundButton.getText().toString();
                    C0816 c0817 = c0815.f3181;
                    if (c0817 == null) {
                        "info";
                    } else {
                        c0816 = c0817;
                    }
                    List listM2369 = c0816.m2369(string);
                    c0815.f3192 = new C0800(c0815);
                    ((RecyclerView) c0815.f3185.getValue()).setAdapter(c0815.f3192);
                    C0800.m2351(c0815.f3192, listM2369);
                } else {
                    c0815.m2365(((EditText) c0815.f3186.getValue()).getText().toString());
                }
                c0815.m2364();
                return unit;
            case 4:
                Boolean bool = (Boolean) obj2;
                AbstractC2867 abstractC2867 = (AbstractC2867) obj;
                String[] strArr = AbstractC1574.f5469;
                if (bool.equals(Boolean.TRUE)) {
                    zM4828 = AbstractC2841.m4828(abstractC2867.mo1129(), "测试", false);
                } else {
                    if (!bool.equals(Boolean.FALSE)) {
                        throw new C0761();
                    }
                    if (AbstractC2841.m4828(abstractC2867.mo1129(), "测试", false)) {
                        zM4828 = false;
                    }
                }
                return Boolean.valueOf(zM4828);
            case 5:
                C3689 c3689 = (C3689) obj2;
                C1563 c1565 = (C1563) obj;
                
                try {
                    c2587 = c1565.m3267()[0];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                Object obj3 = c2587 instanceof C2585 ? null : c2587;
                if (obj3 != null) {
                    int i4 = 0;
                    C1744 c1744M2484 = AbstractC0968.startFieldResolution(obj3);
                    C1846 c1846 = C1846.f6140;
                    MethodResolver c1973M3492 = c1744M2484.m3492();
                    String[] strArr2 = AbstractC1574.f5469;
                    c1973M3492.f6370 = "getLatitude";
                    C3689 c3689M4174 = c1846.m4174((C1982) AbstractC0744.firstInList(c1973M3492.m3799()), 1);
                    c1846.m3263(c3689M4174, new C1608(29));
                    c3689M4174.m5352();
                    MethodResolver c1973M3493 = c1744M2484.m3492();
                    c1973M3493.f6370 = "getLongitude";
                    C3689 c3689M4175 = c1846.m4174((C1982) AbstractC0744.firstInList(c1973M3493.m3799()), 1);
                    c1846.m3263(c3689M4175, new C1837(5));
                    c3689M4175.m5352();
                }
                C3689.m5349(c3689);
                return unit;
            case 6:
                C1563 c1566 = (C1563) obj;
                int parameterCount = ((Constructor) obj2).getParameterCount();
                int i5 = 8;
                if (parameterCount != 13 && parameterCount != 14) {
                    i5 = 7;
                }
                
                try {
                    c2588 = c1566.m3267()[i5];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                if (c2588 instanceof C2585) {
                    c2588 = null;
                }
                String str = (String) c2588;
                if (str == null) {
                    str = "";
                }
                C0408 c0408 = new C0408(i5, 6, c1566);
                
                String strM2542 = C2054.f6841.m2542();
                String[] strArr3 = AbstractC1574.f5469;
                c0408.m1608(AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(strM2542, "${sendText}", str), "${line}", "\n"), "${sendTime}", AbstractC3681.m5339(System.currentTimeMillis(), C2055.f6842.m2542(), null, 2)));
                return unit;
            case 7:
                List list = (List) obj2;
                C1332 c1332 = (C1332) obj;
                
                C0705 c0705 = new C0705(4);
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2837((String) it.next(), 5, false));
                }
                c0705.f2688 = new ArrayList(arrayList);
                c1332.f4791 = c0705;
                return unit;
            default:
                AbstractC3681.m5338((Context) obj2, 4, (String) obj);
                return unit;
        }
    }
}
