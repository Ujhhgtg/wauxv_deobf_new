package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᤞᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1118 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4167 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Iterator f4168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4169;

    public C1118(Iterator it) {
        this.f4168 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f4167) {
            case 0:
                break;
            default:
                return this.f4168.hasNext();
        }
        while (true) {
            int i = this.f4169;
            it = this.f4168;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f4169--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f4167) {
            case 0:
                break;
            default:
                int i = this.f4169;
                this.f4169 = i + 1;
                if (i >= 0) {
                    return new C1642(i, this.f4168.next());
                }
                AbstractC0740.m2312();
                throw null;
        }
        while (true) {
            int i2 = this.f4169;
            it = this.f4168;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f4169--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4167) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1118(C1119 c1119) {
        this.f4168 = c1119.f4170.iterator();
        this.f4169 = c1119.f4171;
    }
}
