package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0361 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1762;

    public /* synthetic */ RunnableC0361(int i, int i2, Object obj) {
        this.f1760 = i2;
        this.f1762 = obj;
        this.f1761 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1760) {
            case 0:
                ((AbstractC0364) this.f1762).f1777.m3067(this.f1761, 4);
                break;
            case 1:
                C1681 c1681 = (C1681) this.f1762;
                int i = this.f1761;
                AbstractC1469 abstractC1469 = (AbstractC1469) c1681.f5660;
                if (abstractC1469 != null) {
                    abstractC1469.mo1426(i);
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f1762;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f1761 == 1) {
                    while (i2 < size) {
                        ((AbstractC1146) arrayList.get(i2)).mo2896();
                        i2++;
                    }
                } else {
                    while (i2 < size) {
                        ((AbstractC1146) arrayList.get(i2)).mo2895();
                        i2++;
                    }
                }
                break;
            default:
                ((AbstractC2157) this.f1762).m4122(this.f1761);
                break;
        }
    }

    public RunnableC0361(List list, int i, Throwable th) {
        this.f1760 = 2;
        C1787.m3664(list, "initCallbacks cannot be null");
        this.f1762 = new ArrayList(list);
        this.f1761 = i;
    }

    public RunnableC0361(AbstractC0364 abstractC0364) {
        this.f1760 = 0;
        this.f1762 = abstractC0364;
        this.f1761 = -1;
    }
}
