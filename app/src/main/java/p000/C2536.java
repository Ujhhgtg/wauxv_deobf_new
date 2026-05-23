package p000;

import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᲁᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2536 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f8087;

    public /* synthetic */ C2536(String str, int i) {
        this.f8086 = i;
        this.f8087 = str;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f8086) {
            case 0:
                C0180 c0180 = (C0180) obj;
                C2536 c2536 = new C2536(this.f8087, 1);
                c0180.getClass();
                C0173 c0173 = new C0173(4);
                c2536.invoke(c0173);
                List arrayList = c0180.f1230;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c0180.f1230 = arrayList;
                arrayList.add(c0173);
                break;
            case 1:
                C0173 c0174 = (C0173) obj;
                String[] strArr = AbstractC1574.f5469;
                String str = "dalvik.annotation.Signature";
                c0174.getClass();
                C0705 c0705 = new C0705(4);
                c0705.f2683 = new C2837(str, 5, false);
                c0174.f1207 = c0705;
                C0166 c0166 = new C0166(4);
                c0166.f1193 = new C2837("value", 5, false);
                C0168 c0168 = new C0168(4);
                c0168.f1198 = 1;
                c0168.f1198 = 2;
                C0168.m1218(c0168, "Lcom/tencent/mm/sdk/event/IListener<");
                C0168.m1218(c0168, this.f8087);
                C0168.m1218(c0168, ">;");
                C0169 c0169 = new C0169();
                c0169.f1199 = c0168;
                c0169.f1200 = 12;
                c0166.f1194 = c0169;
                C0167 c0167 = c0174.f1208;
                if (c0167 == null) {
                    c0167 = new C0167(0);
                }
                c0174.f1208 = c0167;
                List arrayList2 = c0167.f1196;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                c0167.f1196 = arrayList2;
                arrayList2.add(c0166);
                break;
            case 2:
                C3515 c3515 = (C3515) obj;
                c3515.m1521(C2721.f8780.m2542());
                c3515.f1764.tag(C2206.class, new C2206(this.f8087));
                break;
            case 3:
                ((C3515) obj).m1521(this.f8087);
                break;
            case 4:
                ((C3515) obj).m1521(this.f8087);
                break;
            case 5:
                ((C3515) obj).m1521(this.f8087);
                break;
            case 6:
                ((C3515) obj).m1521(this.f8087);
                break;
            case 7:
                ((C3515) obj).m1521(this.f8087);
                break;
            default:
                ((C3515) obj).m1521(this.f8087);
                break;
        }
        return C3497.f10997;
    }
}
