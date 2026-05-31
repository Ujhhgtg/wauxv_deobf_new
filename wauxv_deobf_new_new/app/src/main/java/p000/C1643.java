package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᛸᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1643 implements Iterable, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5542;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f5543;

    public /* synthetic */ C1643(Object obj, int i) {
        this.f5542 = i;
        this.f5543 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5542) {
            case 0:
                return new C1118((Iterator) ((C0114) this.f5543).invoke());
            case 1:
                return new C1011((C1012) this.f5543);
            default:
                return new C0067((InterfaceC2715) this.f5543);
        }
    }
}
