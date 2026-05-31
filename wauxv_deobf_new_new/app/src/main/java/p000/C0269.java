package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲈᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0269 extends AbstractSet {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0274 f1520;

    public C0269(C0274 c0274) {
        this.f1520 = c0274;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0272(this.f1520);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1520.f8887;
    }
}
