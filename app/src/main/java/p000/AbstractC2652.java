package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2652 extends AbstractC2653 {
    public static int m4653(InterfaceC2650 interfaceC2650) {
        Iterator it = interfaceC2650.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public static C1331 m4654(InterfaceC2650 interfaceC2650, InterfaceC1425 interfaceC1425) {
        return new C1331(interfaceC2650, true, interfaceC1425);
    }

    public static List m4655(InterfaceC2650 interfaceC2650) {
        Iterator it = interfaceC2650.iterator();
        if (!it.hasNext()) {
            return C1189.f4329;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
