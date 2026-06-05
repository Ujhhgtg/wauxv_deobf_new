package p000;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛱUjhhgtgᛱᛲ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1411feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C1411feyxiexzfUjhhgtg f4949Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928534710860121482L);
        f4949Ujhhgtgfeyxiexzf = new C1411feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static File m2920Ujhhgtgfeyxiexzf(C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg) {
        return new File(c1414feyxiexzfUjhhgtg.f4963Ujhhgtgfeyxiexzf, MagicFactory.get(4928532022210594186L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Properties m2921Ujhhgtgfeyxiexzf(File file) throws IOException {
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
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(inputStreamReader, th);
                throw th2;
            }
        }
    }
}
