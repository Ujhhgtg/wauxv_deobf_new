package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1360 extends AbstractC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1359 f4871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f4872;

    public C1360(C1359 c1359, ArrayList arrayList) {
        this.f4871 = c1359;
        this.f4872 = arrayList;
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2128(RecyclerView recyclerView, AbstractC2563 abstractC2563) {
        super.mo2128(recyclerView, abstractC2563);
        C1369.f4885.getClass();
        C1369.m3185(this.f4872, this.f4871);
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2129() {
        return AbstractC1698.m3573(3);
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final boolean mo2130(AbstractC2563 abstractC2563, AbstractC2563 abstractC2564) {
        int iM4533 = abstractC2563.m4533();
        int iM4534 = abstractC2564.m4533();
        if (iM4533 == -1 || iM4534 == -1 || iM4533 == iM4534) {
            return false;
        }
        ArrayList arrayList = this.f4872;
        arrayList.add(iM4534, arrayList.remove(iM4533));
        this.f4871.f8077.m4465(iM4533, iM4534);
        return true;
    }
}
