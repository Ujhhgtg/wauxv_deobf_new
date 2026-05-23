package p000;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᛸᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2111 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6955;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f6956;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f6957;

    public /* synthetic */ C2111(int i, Serializable serializable, Object obj) {
        this.f6955 = i;
        this.f6956 = serializable;
        this.f6957 = obj;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        switch (this.f6955) {
            case 0:
                String str = (String) this.f6956;
                C1283 c1283 = (C1283) this.f6957;
                List list = (List) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1133.m2721(c1283.f4688, ((C0801) it.next()).f3160, str);
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC1574.f5469;
                sb.append("已转发至");
                sb.append(list.size());
                sb.append("个会话");
                AbstractC2834.m4823(null, 3, sb.toString());
                break;
            case 1:
                String str2 = (String) this.f6956;
                C1283 c1284 = (C1283) this.f6957;
                List list2 = (List) obj;
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    C1133.m2721(c1284.f4688, ((C0801) it2.next()).f3160, str2);
                }
                StringBuilder sb2 = new StringBuilder();
                String[] strArr2 = AbstractC1574.f5469;
                sb2.append(MagicFactory.get(-541707045173940L, strArr2));
                sb2.append(list2.size());
                sb2.append(MagicFactory.get(-541728520010420L, strArr2));
                AbstractC2834.m4823(null, 3, sb2.toString());
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f6956;
                ArrayList arrayList2 = (ArrayList) this.f6957;
                List<C0801> list3 = (List) obj;
                for (C0801 c0801 : list3) {
                    for (C2315 c2315 : AbstractC0744.m2210(arrayList, arrayList2)) {
                        C1133.m2721(((Number) c2315.f7446).intValue(), c0801.f3160, (String) c2315.f7445);
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                String[] strArr3 = AbstractC1574.f5469;
                sb3.append(MagicFactory.get(-572875622841012L, strArr3));
                sb3.append(arrayList.size());
                sb3.append(MagicFactory.get(-572892802710196L, strArr3));
                sb3.append(list3.size());
                sb3.append(MagicFactory.get(-572914277546676L, strArr3));
                AbstractC2834.m4823(null, 3, sb3.toString());
                break;
        }
        return Boolean.FALSE;
    }
}
