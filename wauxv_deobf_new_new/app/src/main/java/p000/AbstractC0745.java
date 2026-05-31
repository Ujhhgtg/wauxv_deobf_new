package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᲇᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0745 extends AbstractC0744 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static void m2316(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m2317(Collection collection, Object[] objArr) {
        collection.addAll(Arrays.asList(objArr));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static boolean m2318(ArrayList arrayList, InterfaceC1433 interfaceC1433) {
        int i;
        int iM2310 = AbstractC0740.m2310(arrayList);
        if (iM2310 >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = arrayList.get(i2);
                if (!((Boolean) interfaceC1433.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        arrayList.set(i, obj);
                    }
                    i++;
                }
                if (i2 == iM2310) {
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
        int iM2311 = AbstractC0740.m2310(arrayList);
        if (i <= iM2311) {
            while (true) {
                arrayList.remove(iM2311);
                if (iM2311 == i) {
                    break;
                }
                iM2311--;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static void m2319(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(AbstractC0740.m2310(arrayList));
    }
}
