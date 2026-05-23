package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1219 implements Iterable {

    public final ArrayList f4399;

    public C1219(ArrayList arrayList) {
        this.f4399 = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4399.iterator();
    }
}
