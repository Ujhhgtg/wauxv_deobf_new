package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲁᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2733 extends AbstractC2550 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2735 f8760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8761;

    public C2733(C2735 c2735, int i) {
        this.f8760 = c2735;
        this.f8761 = i;
    }

    @Override // p000.AbstractC2550
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo4509(RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        int i2 = this.f8761;
        if (recyclerView.m228(i2) == null) {
            return;
        }
        recyclerView.postDelayed(new RunnableC1020(recyclerView, i2, this.f8760, 1), 150L);
        ArrayList arrayList = recyclerView.f413;
        if (arrayList != null) {
            arrayList.remove(this);
        }
    }
}
