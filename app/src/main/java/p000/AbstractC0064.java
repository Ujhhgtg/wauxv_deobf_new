package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0064 extends AbstractList implements List, InterfaceC1738 {
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo945(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo944();
    }

    public abstract int mo944();

    public abstract Object mo945(int i);
}
