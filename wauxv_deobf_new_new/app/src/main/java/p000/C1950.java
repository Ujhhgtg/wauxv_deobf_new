package p000;

import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᛸᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1950 extends AbstractC1469 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6460;

    public /* synthetic */ C1950(int i) {
        this.f6460 = i;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final int[] mo3358() {
        switch (this.f6460) {
            case 0:
                break;
        }
        return new int[]{3, 4, 2, 1};
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final int mo3359(boolean z) {
        switch (this.f6460) {
            case 0:
                return z ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
            default:
                return R.layout.layout_dialogx_md3;
        }
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final AbstractC1468 mo3360() {
        switch (this.f6460) {
            case 0:
                return new C1949(0);
            default:
                return new C1949(1);
        }
    }
}
