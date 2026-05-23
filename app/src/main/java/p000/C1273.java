package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᛸᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1273 extends AbstractC2495 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1275 f4651;

    public C1273(C1275 c1275) {
        this.f4651 = c1275;
    }

    @Override // p000.AbstractC2495
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo3003(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1275 c1275 = this.f4651;
        int i3 = c1275.f4656;
        int iComputeVerticalScrollRange = c1275.f4674.computeVerticalScrollRange();
        int i4 = c1275.f4673;
        c1275.f4675 = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c1275.f4674.computeHorizontalScrollRange();
        int i5 = c1275.f4672;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c1275.f4676 = z;
        boolean z2 = c1275.f4675;
        if (!z2 && !z) {
            if (c1275.f4677 != 0) {
                c1275.m3010(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c1275.f4667 = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c1275.f4666 = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c1275.f4676) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c1275.f4670 = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c1275.f4669 = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c1275.f4677;
        if (i6 == 0 || i6 == 1) {
            c1275.m3010(1);
        }
    }
}
