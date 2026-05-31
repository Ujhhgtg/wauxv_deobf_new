package p000;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᲇᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0748 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2839;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2840;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f2841;

    public /* synthetic */ C0748(Object obj, Serializable serializable, int i) {
        this.f2839 = i;
        this.f2840 = obj;
        this.f2841 = serializable;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        switch (this.f2839) {
            case 0:
                InterfaceC0876[] interfaceC0876Arr = (InterfaceC0876[]) this.f2840;
                C2570 c2570 = (C2570) this.f2841;
                int i = c2570.f8190;
                c2570.f8190 = i + 1;
                interfaceC0876Arr[i] = (InterfaceC0874) obj2;
                return C3554.UNIT;
            default:
                ArrayList arrayList = (ArrayList) this.f2840;
                ArrayList arrayList2 = (ArrayList) this.f2841;
                List<C0800> list = (List) obj;
                for (C0800 c0800 : list) {
                    for (C2348 c2348 : AbstractC0739.m2309(arrayList, arrayList2)) {
                        C2199.m4148(((Number) c2348.f7568).intValue(), c0800.f3167, (String) c2348.f7567);
                    }
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC1471.f5234;
                sb.append("已转发");
                sb.append(arrayList.size());
                sb.append("条语音至");
                sb.append(list.size());
                sb.append("个会话");
                AbstractC2894.m4856(null, 3, sb.toString());
                return Boolean.FALSE;
        }
    }
}
