package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲀᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1143 extends AbstractC2240 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2140 f4243;

    public C1143(C2140 c2140) {
        this.f4243 = c2140;
    }

    @Override // p000.AbstractC2240
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void mo2878(Throwable th) {
        ((C1148) this.f4243.f7070).m2900(th);
    }

    @Override // p000.AbstractC2240
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void mo2879(C2136 c2136) {
        C2140 c2140 = this.f4243;
        c2140.f7072 = c2136;
        C2136 c2137 = (C2136) c2140.f7072;
        C1148 c1148 = (C1148) c2140.f7070;
        c2140.f7071 = new C0253(c2137, c1148.f4255, c1148.f4257, Build.VERSION.SDK_INT >= 34 ? AbstractC1153.m2903() : AbstractC2902.m4889());
        C1148 c1149 = (C1148) c2140.f7070;
        c1149.getClass();
        ArrayList arrayList = new ArrayList();
        c1149.f4249.writeLock().lock();
        try {
            c1149.f4251 = 1;
            arrayList.addAll(c1149.f4250);
            c1149.f4250.clear();
            c1149.f4249.writeLock().unlock();
            c1149.f4252.post(new RunnableC0361(arrayList, c1149.f4251, (Throwable) null));
        } catch (Throwable th) {
            c1149.f4249.writeLock().unlock();
            throw th;
        }
    }
}
