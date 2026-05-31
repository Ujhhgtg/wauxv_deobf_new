package p000;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲈᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2402 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2402 f7694;

    static {
        AbstractC1471.m3394(-410740607416963L);
        f7694 = new C2402();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static File m4348(C2400 c2400) {
        return new File(c2400.f7679, "config.prop");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Properties m4349(File file) throws IOException {
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
                AbstractC3528.m5090(inputStreamReader, th);
                throw th2;
            }
        }
    }
}
