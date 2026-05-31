package p000;

import java.util.HashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲁᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1578 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final HashMap f5483 = new HashMap(32);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static byte[] m3462(Class cls) {
        String[] strArr = AbstractC1471.f5234;
        "klass == null";
        String name = cls.getName();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name == null || name.isEmpty()");
        }
        C1577 c1577 = new C1577();
        c1577.f5482 = 1;
        while (c1577.hasNext()) {
            byte[] bArr = (byte[]) c1577.next();
            String str = name.endsWith(";") ? name : "L" + name.replace('.', '/') + ";";
            int iM3484 = AbstractC1586.m3484(96, bArr);
            int iM3485 = AbstractC1586.m3484(100, bArr);
            for (int i = 0; i < iM3484; i++) {
                if (str.equals(AbstractC1586.m3487(AbstractC1586.m3484((i * 32) + iM3485, bArr), bArr))) {
                    return bArr;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static String m3463(int i) {
        String[] strArr = AbstractC1471.f5234;
        if (i <= 1) {
            return "classes.dex";
        }
        return "classes" + i + ".dex";
    }
}
