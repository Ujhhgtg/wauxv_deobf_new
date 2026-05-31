package p000;

import com.chad.library.adapter4.layoutmanager.QuickGridLayoutManager;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲈᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2498 extends AbstractC1492 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public AbstractC1492 f7922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ QuickGridLayoutManager f7923;

    public C2498(QuickGridLayoutManager quickGridLayoutManager) {
        this.f7923 = quickGridLayoutManager;
    }

    @Override // p000.AbstractC1492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo3416(int i) {
        QuickGridLayoutManager quickGridLayoutManager = this.f7923;
        AbstractC2537 abstractC2537 = quickGridLayoutManager.f596;
        if (abstractC2537 == null) {
            return 1;
        }
        if (abstractC2537 instanceof InterfaceC1421) {
            return quickGridLayoutManager.f322;
        }
        if (!(abstractC2537 instanceof C0799)) {
            AbstractC1492 abstractC1492 = this.f7922;
            if (abstractC1492 != null) {
                return abstractC1492.mo3416(i);
            }
            return 1;
        }
        if (i == R.id.BaseQuickAdapter_empty_view) {
            return quickGridLayoutManager.f322;
        }
        AbstractC1492 abstractC1493 = this.f7922;
        if (abstractC1493 != null) {
            return abstractC1493.mo3416(i);
        }
        return 1;
    }
}
