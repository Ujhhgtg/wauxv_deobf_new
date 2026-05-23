package p000;

import com.chad.library.adapter4.layoutmanager.QuickGridLayoutManager;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲇᲁᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2447 extends AbstractC1481 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public AbstractC1481 f7779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ QuickGridLayoutManager f7780;

    public C2447(QuickGridLayoutManager quickGridLayoutManager) {
        this.f7780 = quickGridLayoutManager;
    }

    @Override // p000.AbstractC1481
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo3239(int i) {
        QuickGridLayoutManager quickGridLayoutManager = this.f7780;
        AbstractC2482 abstractC2482 = quickGridLayoutManager.f544;
        if (abstractC2482 == null) {
            return 1;
        }
        if (abstractC2482 instanceof InterfaceC1413) {
            return quickGridLayoutManager.f322;
        }
        if (!(abstractC2482 instanceof C0800)) {
            AbstractC1481 abstractC1481 = this.f7779;
            if (abstractC1481 != null) {
                return abstractC1481.mo3239(i);
            }
            return 1;
        }
        if (i == R.id.BaseQuickAdapter_empty_view) {
            return quickGridLayoutManager.f322;
        }
        AbstractC1481 abstractC1482 = this.f7779;
        if (abstractC1482 != null) {
            return abstractC1482.mo3239(i);
        }
        return 1;
    }
}
