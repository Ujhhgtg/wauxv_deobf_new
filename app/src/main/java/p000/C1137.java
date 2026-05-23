package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲀᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1137 extends AbstractC1458 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2107 f4231;

    public C1137(C2107 c2107) {
        this.f4231 = c2107;
    }

    @Override // p000.AbstractC1458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void mo2734(Throwable th) {
        ((C1142) this.f4231.f6946).m2756(th);
    }

    @Override // p000.AbstractC1458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void mo2735(C2103 c2103) {
        C2107 c2107 = this.f4231;
        c2107.f6948 = c2103;
        C2103 c2104 = (C2103) c2107.f6948;
        C1142 c1142 = (C1142) c2107.f6946;
        c2107.f6947 = new C0243(c2104, c1142.f4243, c1142.f4245, Build.VERSION.SDK_INT >= 34 ? AbstractC1147.m2759() : AbstractC1459.m3186());
        C1142 c1143 = (C1142) c2107.f6946;
        c1143.getClass();
        ArrayList arrayList = new ArrayList();
        c1143.f4237.writeLock().lock();
        try {
            c1143.f4239 = 1;
            arrayList.addAll(c1143.f4238);
            c1143.f4238.clear();
            c1143.f4237.writeLock().unlock();
            c1143.f4240.post(new RunnableC0386(arrayList, c1143.f4239, (Throwable) null));
        } catch (Throwable th) {
            c1143.f4237.writeLock().unlock();
            throw th;
        }
    }
}
