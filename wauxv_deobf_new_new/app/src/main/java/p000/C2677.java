package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᛸᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2677 extends AbstractC2680 implements Iterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2678 f8658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2678 f8659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8660;

    public C2677(C2678 c2678, C2678 c2679, int i) {
        this.f8660 = i;
        this.f8658 = c2679;
        this.f8659 = c2678;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8659 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2678 c2678 = this.f8659;
        C2678 c2679 = this.f8658;
        this.f8659 = (c2678 == c2679 || c2679 == null) ? null : m4666(c2678);
        return c2678;
    }

    @Override // p000.AbstractC2680
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo4665(C2678 c2678) {
        C2678 c2679;
        C2678 c2678M4666 = null;
        if (this.f8658 == c2678 && c2678 == this.f8659) {
            this.f8659 = null;
            this.f8658 = null;
        }
        C2678 c26710 = this.f8658;
        if (c26710 == c2678) {
            switch (this.f8660) {
                case 0:
                    c2679 = c26710.f8664;
                    break;
                default:
                    c2679 = c26710.f8663;
                    break;
            }
            this.f8658 = c2679;
        }
        C2678 c26711 = this.f8659;
        if (c26711 == c2678) {
            C2678 c26712 = this.f8658;
            if (c26711 != c26712 && c26712 != null) {
                c2678M4666 = m4666(c26711);
            }
            this.f8659 = c2678M4666;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2678 m4666(C2678 c2678) {
        switch (this.f8660) {
            case 0:
                return c2678.f8663;
            default:
                return c2678.f8664;
        }
    }
}
