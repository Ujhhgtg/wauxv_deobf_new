package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1275 extends AbstractC2550 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1277 f4651;

    public C1275(C1277 c1277) {
        this.f4651 = c1277;
    }

    @Override // p000.AbstractC2550
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo3106(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1277 c1277 = this.f4651;
        int i3 = c1277.f4656;
        int iComputeVerticalScrollRange = c1277.f4674.computeVerticalScrollRange();
        int i4 = c1277.f4673;
        c1277.f4675 = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c1277.f4674.computeHorizontalScrollRange();
        int i5 = c1277.f4672;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c1277.f4676 = z;
        boolean z2 = c1277.f4675;
        if (!z2 && !z) {
            if (c1277.f4677 != 0) {
                c1277.m3113(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c1277.f4667 = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c1277.f4666 = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c1277.f4676) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c1277.f4670 = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c1277.f4669 = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c1277.f4677;
        if (i6 == 0 || i6 == 1) {
            c1277.m3113(1);
        }
    }
}
