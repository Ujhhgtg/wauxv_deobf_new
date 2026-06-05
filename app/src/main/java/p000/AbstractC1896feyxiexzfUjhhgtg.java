package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1896feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final LinkedHashMap f6331Ujhhgtgfeyxiexzf = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ能不能ᛱUjhhgtgᛱ要点脸ᛴ] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final View m3231Ujhhgtgfeyxiexzf(View view, String str, int... iArr) {
        ?? c0919feyxiexzfUjhhgtg;
        Integer num;
        boolean zM2631feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str);
        LinkedHashMap linkedHashMap = f6331Ujhhgtgfeyxiexzf;
        if (!zM2631feyxiexzfUjhhgtg && (num = (Integer) linkedHashMap.get(str)) != null) {
            return view.findViewById(num.intValue());
        }
        try {
            int length = iArr.length;
            int i = 0;
            c0919feyxiexzfUjhhgtg = view;
            while (i < length) {
                int i2 = iArr[i];
                if (!(c0919feyxiexzfUjhhgtg instanceof ViewGroup) || i2 < 0 || i2 >= ((ViewGroup) c0919feyxiexzfUjhhgtg).getChildCount()) {
                    break;
                }
                i++;
                c0919feyxiexzfUjhhgtg = C3052Ujhhgtgfeyxiexzf.m4513Ujhhgtgfeyxiexzf((ViewGroup) c0919feyxiexzfUjhhgtg, i2);
            }
            if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str) && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg, view)) {
                linkedHashMap.put(str, Integer.valueOf(c0919feyxiexzfUjhhgtg.getId()));
            }
            if (c0919feyxiexzfUjhhgtg == 0) {
                c0919feyxiexzfUjhhgtg = 0;
            }
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        return (View) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? 0 : c0919feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static View m3232Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int[] iArr) {
        return m3231Ujhhgtgfeyxiexzf(viewGroup, "", iArr);
    }
}
