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

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0744 extends AbstractC0750 {
    public static boolean m2190(Collection collection, Object obj) {
        int iIndexOf;
        if (collection != null) {
            return collection.contains(obj);
        }
        if (false) {
            iIndexOf = ((List) collection).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : collection) {
                if (i < 0) {
                    AbstractC0745.m2213();
                    throw null;
                }
                if (AbstractC2207.m4087(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return false;
    }

    public static Object firstInList(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object m2192(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object m2193(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void m2194(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC1425 interfaceC1425) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC2203.m4024(sb, obj, interfaceC1425);
        }
        sb.append(charSequence3);
    }

    public static String m2196(Iterable iterable, String str, String str2, String str3, InterfaceC1425 interfaceC1425, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC1425 = null;
        }
        StringBuilder sb = new StringBuilder();
        m2194(iterable, sb, str4, str5, str6, interfaceC1425);
        return sb.toString();
    }

    public static Object m2197(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0745.m2211(list));
    }

    public static ArrayList m2198(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC0750.m2217(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static Object randomFromList(List list) {
        AbstractC0066 abstractC0066 = AbstractC2474.f7908;
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return list.get(AbstractC2474.f7908.m950(list.size()));
    }

    public static Object m2200(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List m2201(Iterable iterable, Comparator comparator) {
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m2206(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static boolean[] m2202(ArrayList arrayList) {
        boolean[] zArr = new boolean[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] m2203(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static void m2204(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] m2205(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List m2206(Iterable iterable) {
        ArrayList arrayList;
        boolean z = iterable instanceof Collection;
        C1189 c1189 = C1189.f4329;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return c1189;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (false) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            m2204(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayList : Collections.singletonList(arrayList.get(0));
        }
        return c1189;
    }

    public static long[] m2207(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static Set m2208(Collection collection) {
        if (collection != null) {
            return new LinkedHashSet(collection);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m2204(collection, linkedHashSet);
        return linkedHashSet;
    }

    public static Set m2209(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1898.m3693(collection.size()));
                m2204(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m2204(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return C1192.f4332;
    }

    public static ArrayList m2210(List list, List list2) {
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC0746.m2214(list, 10), AbstractC0746.m2214(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C2315(it.next(), it2.next()));
        }
        return arrayList;
    }
}
