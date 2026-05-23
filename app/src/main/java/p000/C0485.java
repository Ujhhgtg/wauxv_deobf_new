package p000;

import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᤞᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0485 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0491 f2101;

    public /* synthetic */ C0485(C0491 c0491, int i) {
        this.f2100 = i;
        this.f2101 = c0491;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f2100) {
            case 0:
                ((C0492) obj).f2119.keySet().forEach(new C0485(this.f2101, 2));
                break;
            case 1:
                this.f2101.m1724((String) obj);
                break;
            default:
                this.f2101.m1724((String) obj);
                break;
        }
    }
}
