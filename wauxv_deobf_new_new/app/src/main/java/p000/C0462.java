package p000;

import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤝᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0462 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2076;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0467 f2077;

    public /* synthetic */ C0462(C0467 c0467, int i) {
        this.f2076 = i;
        this.f2077 = c0467;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f2076) {
            case 0:
                ((C0468) obj).f2092.keySet().forEach(new C0462(this.f2077, 2));
                break;
            case 1:
                this.f2077.m1832((String) obj);
                break;
            default:
                this.f2077.m1832((String) obj);
                break;
        }
    }
}
