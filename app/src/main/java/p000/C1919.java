package p000;

import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᛸᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1919 extends AbstractC2205 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6355;

    public /* synthetic */ C1919(int i) {
        this.f6355 = i;
    }

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int[] mo3725() {
        switch (this.f6355) {
            case 0:
                break;
        }
        return new int[]{3, 4, 2, 1};
    }

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int mo3726(boolean z) {
        switch (this.f6355) {
            case 0:
                return z ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
            default:
                return R.layout.layout_dialogx_md3;
        }
    }

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC2203 mo3727() {
        switch (this.f6355) {
            case 0:
                return new C1918(0);
            default:
                return new C1918(1);
        }
    }
}
