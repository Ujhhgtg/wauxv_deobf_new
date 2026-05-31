package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᤞᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1452 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object f5139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5140 = -2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f5141;

    public C1452(C1012 c1012) {
        this.f5141 = c1012;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5140 < 0) {
            m3246();
        }
        return this.f5140 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5140 < 0) {
            m3246();
        }
        if (this.f5140 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f5139;
        this.f5140 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᤞᲇᲁᛸ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3246() {
        int i = this.f5140;
        C1012 c1012 = this.f5141;
        Object objInvoke = i == -2 ? ((InterfaceC1422) c1012.f3690).invoke() : c1012.f3691.invoke(this.f5139);
        this.f5139 = objInvoke;
        this.f5140 = objInvoke == null ? 0 : 1;
    }
}
