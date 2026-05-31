package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲁᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1845 extends DataSetObserver {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1848 f6130;

    public C1845(AbstractC1848 abstractC1848) {
        this.f6130 = abstractC1848;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC1848 abstractC1848 = this.f6130;
        if (abstractC1848.f6157.isShowing()) {
            abstractC1848.mo2065();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f6130.dismiss();
    }
}
