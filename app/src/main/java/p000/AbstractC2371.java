package p000;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲈᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2371 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ArrayList f7619 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final HashMap f7620 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final HashMap f7621 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m4340() {
        C2873 c2873 = AbstractC2342.f7529;
        String[] strArr = AbstractC1574.f5469;
        File[] fileArrListFiles = new File(AbstractC2342.m4330("Plugin")).listFiles(new C2369());
        if (fileArrListFiles == null) {
            return C1189.f4329;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            File file2 = new File(file, "main.java");
            C2355 c2355 = (file2.exists() && file2.isFile()) ? new C2355(file) : null;
            if (c2355 != null) {
                arrayList.add(c2355);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m4341(C2355 c2355) throws IOException {
        Object c2585;
        c2355.getClass();
        String[] strArr = AbstractC1574.f5469;
        try {
            c2355.m4333();
            c2355.m4332("onLoad", new Object[0]);
            c2585 = Boolean.TRUE;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            ArrayList arrayList = C3678.f11549;
            C3678.m5306("Plugin[" + c2355.f7554 + "]: load Failed: " + thM4594.getMessage(), null, 14);
            C1744 c1744 = c2355.f7561;
            StringBuilder sb = new StringBuilder();
            sb.append("load Failed: ");
            sb.append(thM4594.getMessage());
            c1744.m3489(sb.toString());
            c2585 = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) c2585).booleanValue();
        if (zBooleanValue) {
            f7619.add(c2355);
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m4342(C2355 c2355) {
        Object c2585;
        String str = c2355.f7554;
        String[] strArr = AbstractC1574.f5469;
        try {
            c2355.m4332("onUnLoad", new Object[0]);
            c2355.m4333().f5634.clear();
            c2585 = Boolean.TRUE;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            ArrayList arrayList = C3678.f11549;
            C3678.m5306("Plugin[" + str + "]: unLoad Failed: " + thM4594.getMessage(), null, 14);
            C1744 c1744 = c2355.f7561;
            StringBuilder sb = new StringBuilder();
            sb.append("unLoad Failed: ");
            sb.append(thM4594.getMessage());
            c1744.m3489(sb.toString());
            c2585 = Boolean.FALSE;
        }
        if (((Boolean) c2585).booleanValue()) {
            f7619.remove(c2355);
            f7620.remove(str);
            f7621.remove(str);
        }
    }
}
