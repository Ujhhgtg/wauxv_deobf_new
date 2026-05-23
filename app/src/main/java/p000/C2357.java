package p000;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2357 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2357 f7564;

    static {
        AbstractC1574.m3300(-405651071171252L);
        f7564 = new C2357();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static File m4336(C2355 c2355) {
        return new File(c2355.f7549, "config.prop");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Properties m4337(File file) throws IOException {
        Properties properties = new Properties();
        if (!file.exists()) {
            return properties;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file), 8192), StandardCharsets.UTF_8);
        try {
            properties.load(inputStreamReader);
            inputStreamReader.close();
            return properties;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1458.m3154(inputStreamReader, th);
                throw th2;
            }
        }
    }
}
