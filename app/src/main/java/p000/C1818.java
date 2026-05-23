package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1818 extends DataSetObserver {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1821 f6055;

    public C1818(AbstractC1821 abstractC1821) {
        this.f6055 = abstractC1821;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC1821 abstractC1821 = this.f6055;
        if (abstractC1821.f6082.isShowing()) {
            abstractC1821.mo1968();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f6055.dismiss();
    }
}
