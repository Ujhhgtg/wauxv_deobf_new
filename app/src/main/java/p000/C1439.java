package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1439 {

    public int f5095;

    public int f5096;

    public int[] f5097;

    public int f5098;

    public final void m3134(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f5098;
        int i4 = i3 * 2;
        int[] iArr = this.f5097;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f5097 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f5097 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f5097;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f5098++;
    }

    public final void m3135(RecyclerView recyclerView, boolean z) {
        this.f5098 = 0;
        int[] iArr = this.f5097;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC2491 abstractC2491 = recyclerView.f369;
        if (recyclerView.f368 == null || abstractC2491 == null || !abstractC2491.f7949) {
            return;
        }
        if (z) {
            if (!recyclerView.f360.m1174()) {
                abstractC2491.mo155(recyclerView.f368.mo2040(), this);
            }
        } else if (!recyclerView.m234()) {
            abstractC2491.mo154(this.f5095, this.f5096, recyclerView.f411, this);
        }
        int i = this.f5098;
        if (i > abstractC2491.f7950) {
            abstractC2491.f7950 = i;
            abstractC2491.f7951 = z;
            recyclerView.f358.m4502();
        }
    }
}
