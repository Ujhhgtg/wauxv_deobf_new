package p000;

import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲈᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2381 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2933 f7642 = new C2933(new C2096(8));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2933 f7643 = new C2933(new C2096(9));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m4344(String... strArr) {
        String str = (String) f7643.getValue();
        String str2 = File.separator;
        File file = new File(str, AbstractC0280.m1533(strArr, str2, AbstractC2844.m4786(new StringBuilder(), "WAuxiliary", str2), null, null, 60));
        file.mkdirs();
        return file.getPath();
    }
}
