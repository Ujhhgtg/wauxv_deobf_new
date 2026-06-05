package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛳ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2862feyxiexzfUjhhgtg extends AbstractC2861Ujhhgtgfeyxiexzf {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m4266feyxiexzfUjhhgtg(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m4267feyxiexzfUjhhgtg(Collection collection, Object[] objArr) {
        collection.addAll(Arrays.asList(objArr));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static boolean m4268feyxiexzfUjhhgtg(ArrayList arrayList, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        int i;
        int iM4191Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(arrayList);
        if (iM4191Ujhhgtgfeyxiexzf >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = arrayList.get(i2);
                if (!((Boolean) interfaceC3549feyxiexzfUjhhgtg.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        arrayList.set(i, obj);
                    }
                    i++;
                }
                if (i2 == iM4191Ujhhgtgfeyxiexzf) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= arrayList.size()) {
            return false;
        }
        int iM4191Ujhhgtgfeyxiexzf2 = AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(arrayList);
        if (i <= iM4191Ujhhgtgfeyxiexzf2) {
            while (true) {
                arrayList.remove(iM4191Ujhhgtgfeyxiexzf2);
                if (iM4191Ujhhgtgfeyxiexzf2 == i) {
                    break;
                }
                iM4191Ujhhgtgfeyxiexzf2--;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m4269feyxiexzfUjhhgtg(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(arrayList));
    }
}
