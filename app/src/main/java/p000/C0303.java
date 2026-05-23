package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0303 extends AbstractC2862 implements InterfaceC1429 {

    public final /* synthetic */ int f1521;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0303(int i, InterfaceC0842 interfaceC0842, int i2) {
        super(i, interfaceC0842);
        this.f1521 = i2;
    }

    @Override // p000.InterfaceC1429
    public final Object mo1196(Object obj, Object obj2) throws Throwable {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f1521) {
            case 0:
                C0303 c0303 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                Unit unit = Unit.INSTANCE;
                c0303.mo1198(unit);
                return unit;
            case 1:
                C0303 c0304 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                Unit c3498 = Unit.INSTANCE;
                c0304.mo1198(c3498);
                return c3498;
            case 2:
                C0303 c0305 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                Unit c3499 = Unit.INSTANCE;
                c0305.mo1198(c3499);
                return c3499;
            case 3:
                C0303 c0306 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                Unit c34910 = Unit.INSTANCE;
                c0306.mo1198(c34910);
                return c34910;
            default:
                C0303 c0307 = (C0303) mo1197(interfaceC0842, interfaceC0883);
                Unit c34911 = Unit.INSTANCE;
                c0307.mo1198(c34911);
                return c34911;
        }
    }

    @Override // p000.AbstractC0370
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
    public final Object mo1198(Object obj) throws Throwable {
        int i = this.f1521;
        Unit unit = Unit.INSTANCE;
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
                                        if (0 < length) {
                                            if (!AbstractC1270.m2977(fileArrListFiles[0])) {
                                            }
                                            0++;
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
                
                C0860.m2381();
                break;
            case 2:
                AbstractC0743.m2188(obj);
                
                C0860.m2381();
                break;
            case 3:
                AbstractC0743.m2188(obj);
                
                C0860.m2381();
                break;
            default:
                AbstractC0743.m2188(obj);
                C2321 c2321 = C2321.f7452;
                String[] strArr2 = AbstractC1574.f5469;
                String str = "emoji";
                ArrayList arrayList2 = C2321.f7459;
                
                File[] fileArrListFiles2 = new File(C2321.f7453, "emoji").listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file2 : fileArrListFiles2) {
                        if (file2.isFile()) {
                            List listM2212 = AbstractC0745.listOf("png", "jpg", "gif");
                            String name = file2.getName();
                            int iM4838 = AbstractC2841.m4838(name, '.', 0, 6);
                            String lowerCase = (iM4838 == -1 ? "" : name.substring(iM4838 + 1, name.length())).toLowerCase(Locale.ROOT);
                            "toLowerCase(...)";
                            if (listM2212.contains(lowerCase)) {
                                C1170 c1170 = C1170.f4301;
                                String absolutePath = file2.getAbsolutePath();
                                
                                String strM2762 = C1170.m2762(absolutePath);
                                
                                Object objM2761 = C1164.m2761(strM2762);
                                
                                AbstractC1574.dexToMethod(C1161.f4288).invoke(objM2761, null, Boolean.TRUE);
                                arrayList2.add(AbstractC1574.dexToCtor(C2318.f7449).newInstance(objM2761, 2, "", 0));
                            }
                        }
                    }
                }
                break;
        }
        return unit;
    }
}
