package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᛸᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1447 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f5124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f5125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int[] f5126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5127;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3241(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f5127;
        int i4 = i3 * 2;
        int[] iArr = this.f5126;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f5126 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f5126 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f5126;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f5127++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3242(RecyclerView recyclerView, boolean z) {
        this.f5127 = 0;
        int[] iArr = this.f5126;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC2546 abstractC2546 = recyclerView.f369;
        if (recyclerView.f368 == null || abstractC2546 == null || !abstractC2546.f8100) {
            return;
        }
        if (z) {
            if (!recyclerView.f360.m1320()) {
                abstractC2546.mo155(recyclerView.f368.mo2124(), this);
            }
        } else if (!recyclerView.m234()) {
            abstractC2546.mo154(this.f5124, this.f5125, recyclerView.f411, this);
        }
        int i = this.f5127;
        if (i > abstractC2546.f8101) {
            abstractC2546.f8101 = i;
            abstractC2546.f8102 = z;
            recyclerView.f358.m4523();
        }
    }
}
