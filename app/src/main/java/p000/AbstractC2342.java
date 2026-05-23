package p000;

import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2342 {

    public static final C2873 f7529 = new C2873(new C2083(6));

    public static final C2873 f7530 = new C2873(new C2083(7));

    public static String m4330(String... strArr) {
        String str = (String) f7530.getValue();
        String str2 = File.separator;
        File file = new File(str, AbstractC0270.m1387(strArr, str2, AbstractC2784.m4752(new StringBuilder(), "WAuxiliary", str2), null, null, 60));
        file.mkdirs();
        return file.getPath();
    }
}
