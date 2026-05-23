package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤝᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2673 extends AbstractC2495 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2675 f8602;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8603;

    public C2673(C2675 c2675, int i) {
        this.f8602 = c2675;
        this.f8603 = i;
    }

    @Override // p000.AbstractC2495
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo4488(RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        int i2 = this.f8603;
        if (recyclerView.m228(i2) == null) {
            return;
        }
        recyclerView.postDelayed(new RunnableC1017(recyclerView, i2, this.f8602, 1), 150L);
        ArrayList arrayList = recyclerView.f413;
        if (arrayList != null) {
            arrayList.remove(this);
        }
    }
}
