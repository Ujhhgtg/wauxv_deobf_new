package p000;

import java.util.HashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1567 {

    public static final HashMap f5453 = new HashMap(32);

    public static byte[] m3282(Class cls) {
        String[] strArr = AbstractC1574.f5469;
        "klass == null";
        String name = cls.getName();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name == null || name.isEmpty()");
        }
        C1566 c1566 = new C1566();
        c1566.f5452 = 1;
        while (c1566.hasNext()) {
            byte[] bArr = (byte[]) c1566.next();
            String str = name.endsWith(";") ? name : "L" + name.replace('.', '/') + ";";
            int iM3978 = AbstractC2201.m3978(96, bArr);
            int iM3979 = AbstractC2201.m3978(100, bArr);
            for (int i = 0; i < iM3978; i++) {
                if (str.equals(AbstractC2201.m3981(AbstractC2201.m3978((i * 32) + iM3979, bArr), bArr))) {
                    return bArr;
                }
            }
        }
        return null;
    }

    public static String m3283(int i) {
        String[] strArr = AbstractC1574.f5469;
        if (i <= 1) {
            return "classes.dex";
        }
        return "classes" + i + ".dex";
    }
}
