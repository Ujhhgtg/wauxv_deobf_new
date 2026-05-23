package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᛸᲇᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1444 implements Iterator, InterfaceC1737 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f5110;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5111 = -2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1009 f5112;

    public C1444(C1009 c1009) {
        this.f5112 = c1009;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5111 < 0) {
            m3139();
        }
        return this.f5111 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5111 < 0) {
            m3139();
        }
        if (this.f5111 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f5110;
        this.f5111 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᤞᲇᛸᲁ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3139() {
        int i = this.f5111;
        C1009 c1009 = this.f5112;
        Object objInvoke = i == -2 ? ((InterfaceC1414) c1009.f3683).invoke() : c1009.f3684.invoke(this.f5110);
        this.f5110 = objInvoke;
        this.f5111 = objInvoke == null ? 0 : 1;
    }
}
