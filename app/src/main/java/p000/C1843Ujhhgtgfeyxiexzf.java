package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1843Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C1843Ujhhgtgfeyxiexzf f6182Ujhhgtgfeyxiexzf = new C1843Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m3174Ujhhgtgfeyxiexzf(Object obj) {
        if (obj instanceof C1843Ujhhgtgfeyxiexzf) {
            return "VagueType";
        }
        Class<C1843Ujhhgtgfeyxiexzf> cls = C1843Ujhhgtgfeyxiexzf.class;
        if (obj instanceof Class) {
            Class<C1843Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
            return !obj.equals(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : C1843Ujhhgtgfeyxiexzf.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof InterfaceC0144Ujhhgtgfeyxiexzf) {
            return !obj.equals(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m3174Ujhhgtgfeyxiexzf(next) : null);
        }
        return arrayList.toString();
    }
}
