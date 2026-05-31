package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᲈᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0314 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1596;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0314(int i, InterfaceC0841 interfaceC0841, int i2) {
        super(i, interfaceC0841);
        this.f1596 = i2;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) throws Throwable {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f1596) {
            case 0:
                C0314 c0314 = (C0314) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3554 = C3554.UNIT;
                c0314.mo1344(c3554);
                return c3554;
            case 1:
                C0314 c0315 = (C0314) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3555 = C3554.UNIT;
                c0315.mo1344(c3555);
                return c3555;
            case 2:
                C0314 c0316 = (C0314) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3556 = C3554.UNIT;
                c0316.mo1344(c3556);
                return c3556;
            case 3:
                C0314 c0317 = (C0314) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3557 = C3554.UNIT;
                c0317.mo1344(c3557);
                return c3557;
            case 4:
                C0314 c0318 = (C0314) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3558 = C3554.UNIT;
                c0318.mo1344(c3558);
                return c3558;
            default:
                C0314 c0319 = (C0314) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3559 = C3554.UNIT;
                c0319.mo1344(c3559);
                return c3559;
        }
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f1596) {
            case 0:
                return new C0314(2, interfaceC0841, 0);
            case 1:
                return new C0314(2, interfaceC0841, 1);
            case 2:
                return new C0314(2, interfaceC0841, 2);
            case 3:
                return new C0314(2, interfaceC0841, 3);
            case 4:
                return new C0314(2, interfaceC0841, 4);
            default:
                return new C0314(2, interfaceC0841, 5);
        }
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        int i = this.f1596;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                AbstractC1470.m3372(obj);
                C1332 c1332 = new C1332(AbstractC2713.m4688(new C0281(AbstractC0715.m2235(), 1), new C0207(27)));
                while (c1332.hasNext()) {
                    C0714 c0714 = (C0714) c1332.next();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator it = c0714.f2723.iterator();
                    while (it.hasNext()) {
                        File file = new File((String) it.next());
                        if (file.exists()) {
                            if (!file.isFile()) {
                                File[] fileArrListFiles = file.listFiles();
                                if (fileArrListFiles != null) {
                                    int length = fileArrListFiles.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            if (!AbstractC2902.m4887(fileArrListFiles[i2])) {
                                            }
                                            i2++;
                                            break;
                                        }
                                    }
                                }
                                file.delete();
                            } else {
                                file.delete();
                            }
                            break;
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    ArrayList arrayList = C3741.f11709;
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = AbstractC1471.f5234;
                    sb.append("auto clean: name(");
                    sb.append(c0714.f2722);
                    sb.append(") costTime(");
                    sb.append(jCurrentTimeMillis2);
                    sb.append("ms)");
                    C3741.m5314(14, sb.toString());
                }
                break;
            case 1:
                AbstractC1470.m3372(obj);
                C0859.f3282.getClass();
                C0859.m2498();
                break;
            case 2:
                AbstractC1470.m3372(obj);
                C0859.f3282.getClass();
                C0859.m2498();
                break;
            case 3:
                AbstractC1470.m3372(obj);
                AbstractC2894.m4856(null, 3, "联系人列表加载失败");
                break;
            case 4:
                AbstractC1470.m3372(obj);
                C0859.f3282.getClass();
                C0859.m2498();
                break;
            default:
                AbstractC1470.m3372(obj);
                C2361.f7587.m4309();
                break;
        }
        return c3554;
    }
}
