package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲈᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2593 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8240;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f8241;

    public /* synthetic */ C2593(String str, int i) {
        this.f8240 = i;
        this.f8241 = str;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f8240) {
            case 0:
                C0188 c0188 = (C0188) obj;
                C2593 c2593 = new C2593(this.f8241, 1);
                c0188.getClass();
                C0181 c0181 = new C0181();
                c2593.invoke(c0181);
                List arrayList = c0188.f1298;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c0188.f1298 = arrayList;
                arrayList.add(c0181);
                break;
            case 1:
                C0181 c0182 = (C0181) obj;
                String[] strArr = AbstractC1471.f5234;
                String str = "dalvik.annotation.Signature";
                c0182.getClass();
                C0700 c0700 = new C0700();
                c0700.f2677 = new C2897(str, 5, false);
                c0182.f1275 = c0700;
                C0174 c0174 = new C0174();
                c0174.f1261 = new C2897("value", 5, false);
                C0176 c0176 = new C0176();
                c0176.f1266 = 1;
                c0176.f1266 = 2;
                C0176.m1364(c0176, "Lcom/tencent/mm/sdk/event/IListener<");
                C0176.m1364(c0176, this.f8241);
                C0176.m1364(c0176, ">;");
                C0177 c0177 = new C0177();
                c0177.f1267 = c0176;
                c0177.f1268 = 12;
                c0174.f1262 = c0177;
                C0175 c0175 = c0182.f1276;
                if (c0175 == null) {
                    c0175 = new C0175(0);
                }
                c0182.f1276 = c0175;
                List arrayList2 = c0175.f1264;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                c0175.f1264 = arrayList2;
                arrayList2.add(c0174);
                break;
            case 2:
                C3573 c3573 = (C3573) obj;
                c3573.m1627(C2781.f8942.m2666());
                c3573.f1735.tag(C2238.class, new C2238(this.f8241));
                break;
            case 3:
                ((C3573) obj).m1627(this.f8241);
                break;
            case 4:
                ((C3573) obj).m1627(this.f8241);
                break;
            case 5:
                ((C3573) obj).m1627(this.f8241);
                break;
            case 6:
                ((C3573) obj).m1627(this.f8241);
                break;
            case 7:
                ((C3573) obj).m1627(this.f8241);
                break;
            default:
                ((C3573) obj).m1627(this.f8241);
                break;
        }
        return C3554.UNIT;
    }
}
