package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᛸᲈᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1630 implements Iterable, InterfaceC1737 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5508;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f5509;

    public /* synthetic */ C1630(int i, Object obj) {
        this.f5508 = i;
        this.f5509 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5508) {
            case 0:
                return new C1112((Iterator) ((C0106) this.f5509).invoke());
            case 1:
                return new C1008((C1009) this.f5509);
            default:
                return new C0060((InterfaceC2654) this.f5509);
        }
    }
}
