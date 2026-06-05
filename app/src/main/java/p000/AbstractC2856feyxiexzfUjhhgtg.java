package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛱfeyxiexzfᛱ要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2856feyxiexzfUjhhgtg extends AbstractC2862feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final int m4235feyxiexzfUjhhgtg(C0929feyxiexzfUjhhgtg c0929feyxiexzfUjhhgtg, int i) {
        if (i >= 0 && i <= AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(c0929feyxiexzfUjhhgtg)) {
            return AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(c0929feyxiexzfUjhhgtg) - i;
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "Element index ", " must be in range [");
        sbM4804Ujhhgtgfeyxiexzf.append(new C0682Ujhhgtgfeyxiexzf(0, AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(c0929feyxiexzfUjhhgtg), 1));
        sbM4804Ujhhgtgfeyxiexzf.append("].");
        throw new IndexOutOfBoundsException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static final int m4236feyxiexzfUjhhgtg(C0929feyxiexzfUjhhgtg c0929feyxiexzfUjhhgtg, int i) {
        if (i >= 0 && i <= c0929feyxiexzfUjhhgtg.size()) {
            return c0929feyxiexzfUjhhgtg.size() - i;
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "Position index ", " must be in range [");
        sbM4804Ujhhgtgfeyxiexzf.append(new C0682Ujhhgtgfeyxiexzf(0, c0929feyxiexzfUjhhgtg.size(), 1));
        sbM4804Ujhhgtgfeyxiexzf.append("].");
        throw new IndexOutOfBoundsException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static boolean m4237feyxiexzfUjhhgtg(Collection collection, Object obj) {
        int iIndexOf;
        if (collection != null) {
            return collection.contains(obj);
        }
        if (collection instanceof List) {
            iIndexOf = ((List) collection).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : collection) {
                if (i < 0) {
                    AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                    throw null;
                }
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static Object m4238feyxiexzfUjhhgtg(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static Object m4239feyxiexzfUjhhgtg(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static Object m4240feyxiexzfUjhhgtg(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final void m4241feyxiexzfUjhhgtg(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC3590Ujhhgtgfeyxiexzf.m5118Ujhhgtgfeyxiexzf(sb, obj, interfaceC3549feyxiexzfUjhhgtg);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static String m4243feyxiexzfUjhhgtg(Iterable iterable, String str, String str2, String str3, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC3549feyxiexzfUjhhgtg = null;
        }
        StringBuilder sb = new StringBuilder();
        m4241feyxiexzfUjhhgtg(iterable, sb, str4, str5, str6, interfaceC3549feyxiexzfUjhhgtg);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static Object m4244feyxiexzfUjhhgtg(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(list));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static ArrayList m4245feyxiexzfUjhhgtg(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC2862feyxiexzfUjhhgtg.m4266feyxiexzfUjhhgtg(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static Object m4246feyxiexzfUjhhgtg(List list) {
        C0805feyxiexzfUjhhgtg c0805feyxiexzfUjhhgtg = AbstractC0804feyxiexzfUjhhgtg.f3192Ujhhgtgfeyxiexzf;
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return list.get(AbstractC0804feyxiexzfUjhhgtg.f3193Ujhhgtgfeyxiexzf.m4298Ujhhgtgfeyxiexzf(list.size()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static Object m4247feyxiexzfUjhhgtg(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public static List m4248feyxiexzfUjhhgtg(List list, Comparator comparator) {
        ArrayList arrayList;
        if (list != null) {
            if (list.size() <= 1) {
                return m4253feyxiexzfUjhhgtg(list);
            }
            Object[] array = list.toArray(new Object[0]);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return Arrays.asList(array);
        }
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
            m4251feyxiexzfUjhhgtg(list, arrayList);
        }
        AbstractC2861Ujhhgtgfeyxiexzf.m4265feyxiexzfUjhhgtg(arrayList, comparator);
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public static boolean[] m4249feyxiexzfUjhhgtg(ArrayList arrayList) {
        boolean[] zArr = new boolean[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static byte[] m4250feyxiexzfUjhhgtg(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static void m4251feyxiexzfUjhhgtg(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static int[] m4252feyxiexzfUjhhgtg(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static List m4253feyxiexzfUjhhgtg(Iterable iterable) {
        ArrayList arrayList;
        boolean z = iterable instanceof Collection;
        C3312feyxiexzfUjhhgtg c3312feyxiexzfUjhhgtg = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return c3312feyxiexzfUjhhgtg;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            m4251feyxiexzfUjhhgtg(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayList : Collections.singletonList(arrayList.get(0));
        }
        return c3312feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static long[] m4254Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static Set m4255Ujhhgtgfeyxiexzf(Collection collection) {
        if (collection != null) {
            return new LinkedHashSet(collection);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m4251feyxiexzfUjhhgtg(collection, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static Set m4256Ujhhgtgfeyxiexzf(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(collection.size()));
                m4251feyxiexzfUjhhgtg(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m4251feyxiexzfUjhhgtg(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return C3310feyxiexzfUjhhgtg.f10347Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ArrayList m4257Ujhhgtgfeyxiexzf(List list, List list2) {
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10), AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C1381feyxiexzfUjhhgtg(it.next(), it2.next()));
        }
        return arrayList;
    }
}
