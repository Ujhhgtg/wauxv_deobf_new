package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᲇᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0303 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1521;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0303(int i, InterfaceC0842 interfaceC0842, int i2) {
        super(i, interfaceC0842);
        this.f1521 = i2;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) throws Throwable {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f1521) {
            case 0:
                C0303 c0303 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                C3497 c3497 = C3497.f10997;
                c0303.mo1198(c3497);
                return c3497;
            case 1:
                C0303 c0304 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                C3497 c3498 = C3497.f10997;
                c0304.mo1198(c3498);
                return c3498;
            case 2:
                C0303 c0305 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                C3497 c3499 = C3497.f10997;
                c0305.mo1198(c3499);
                return c3499;
            case 3:
                C0303 c0306 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                C3497 c34910 = C3497.f10997;
                c0306.mo1198(c34910);
                return c34910;
            default:
                C0303 c0307 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                C3497 c34911 = C3497.f10997;
                c0307.mo1198(c34911);
                return c34911;
        }
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (this.f1521) {
            case 0:
                return new C0303(2, interfaceC0842, 0);
            case 1:
                return new C0303(2, interfaceC0842, 1);
            case 2:
                return new C0303(2, interfaceC0842, 2);
            case 3:
                return new C0303(2, interfaceC0842, 3);
            default:
                return new C0303(2, interfaceC0842, 4);
        }
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Throwable {
        int i = this.f1521;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                AbstractC0743.m2188(obj);
                C1330 c1330 = new C1330(AbstractC2652.m4654(new C0271(1, AbstractC0720.m2143()), new C0199(22)));
                while (c1330.hasNext()) {
                    C0719 c0719 = (C0719) c1330.next();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator it = c0719.f2729.iterator();
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
                                            if (!AbstractC1270.m2977(fileArrListFiles[i2])) {
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
                    ArrayList arrayList = C3678.f11549;
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = AbstractC1574.f5469;
                    sb.append("auto clean: name(");
                    sb.append(c0719.f2728);
                    sb.append(") costTime(");
                    sb.append(jCurrentTimeMillis2);
                    sb.append("ms)");
                    C3678.m5305(14, sb.toString());
                }
                break;
            case 1:
                AbstractC0743.m2188(obj);
                C0860.f3275.getClass();
                C0860.m2381();
                break;
            case 2:
                AbstractC0743.m2188(obj);
                C0860.f3275.getClass();
                C0860.m2381();
                break;
            case 3:
                AbstractC0743.m2188(obj);
                C0860.f3275.getClass();
                C0860.m2381();
                break;
            default:
                AbstractC0743.m2188(obj);
                C2321 c2321 = C2321.f7452;
                String[] strArr2 = AbstractC1574.f5469;
                String str = MagicFactory.get(-517517789362868L, strArr2);
                ArrayList arrayList2 = C2321.f7459;
                c2321.getClass();
                File[] fileArrListFiles2 = new File(C2321.f7453, str).listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file2 : fileArrListFiles2) {
                        if (file2.isFile()) {
                            List listM2212 = AbstractC0745.m2212(MagicFactory.get(-518144854588084L, strArr2), MagicFactory.get(-518162034457268L, strArr2), MagicFactory.get(-518179214326452L, strArr2));
                            String name = file2.getName();
                            int iM4838 = AbstractC2841.m4838(name, '.', 0, 6);
                            String lowerCase = (iM4838 == -1 ? "" : name.substring(iM4838 + 1, name.length())).toLowerCase(Locale.ROOT);
                            MagicFactory.get(-518196394195636L, strArr2);
                            if (listM2212.contains(lowerCase)) {
                                C1170 c1170 = C1170.f4301;
                                String absolutePath = file2.getAbsolutePath();
                                c1170.getClass();
                                String strM2762 = C1170.m2762(absolutePath);
                                C1164.f4291.getClass();
                                Object objM2761 = C1164.m2761(strM2762);
                                C1162.f4289.getClass();
                                AbstractC1574.m3315(C1161.f4288).invoke(objM2761, null, Boolean.TRUE);
                                arrayList2.add(AbstractC1574.m3314(C2318.f7449).newInstance(objM2761, 2, MagicFactory.get(-518269408639668L, strArr2), 0));
                            }
                        }
                    }
                }
                break;
        }
        return c3497;
    }
}
