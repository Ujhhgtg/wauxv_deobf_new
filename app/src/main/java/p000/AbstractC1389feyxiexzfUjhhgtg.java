package p000;

import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛲᛱUjhhgtgᛱᛴ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1389feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f4886Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0478Ujhhgtgfeyxiexzf(9));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f4887Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0478Ujhhgtgfeyxiexzf(10));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m2877Ujhhgtgfeyxiexzf(String... strArr) {
        String str = (String) f4887Ujhhgtgfeyxiexzf.getValue();
        String str2 = File.separator;
        File file = new File(str, AbstractC2391Ujhhgtgfeyxiexzf.m3651feyxiexzfUjhhgtg(strArr, str2, AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), MagicFactory.get(4928339951273117066L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), str2), null, null, 60));
        file.mkdirs();
        return file.getPath();
    }
}
