package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1532 extends C0793 {

    public C0793[] f5367 = new C0793[4];

    public int f5368 = 0;

    public final void m3258(int i, C3639 c3639, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f5368; i2++) {
            C0793 c0793 = this.f5367[i2];
            ArrayList arrayList2 = c3639.f11381;
            if (!arrayList2.contains(c0793)) {
                arrayList2.add(c0793);
            }
        }
        for (int i3 = 0; i3 < this.f5368; i3++) {
            AbstractC1270.m2979(this.f5367[i3], i, arrayList, c3639);
        }
    }

    public void mo3086() {
    }
}
