package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0259 extends AbstractSet {

    public final /* synthetic */ C0264 f1446;

    public C0259(C0264 c0264) {
        this.f1446 = c0264;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0262(this.f1446);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1446.f8716;
    }
}
