package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1788 {

    public boolean f5937;

    public int f5938;

    public int f5939;

    public int f5940;

    public int f5941;

    public int f5942;

    public int f5943;

    public int f5944;

    public int f5945;

    public int f5946;

    public List f5947;

    public boolean f5948;

    public final void m3523(View view) {
        int iM4512;
        int size = this.f5947.size();
        View view2 = null;
        int i = 2147483647;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC2508) this.f5947.get(i2)).f8006;
            C2492 c2492 = (C2492) view3.getLayoutParams();
            if (view3 != view && !c2492.f7956.m4518() && (iM4512 = (c2492.f7956.m4512() - this.f5940) * this.f5941) >= 0 && iM4512 < i) {
                view2 = view3;
                if (iM4512 == 0) {
                    break;
                } else {
                    i = iM4512;
                }
            }
        }
        if (view2 == null) {
            this.f5940 = -1;
        } else {
            this.f5940 = ((C2492) view2.getLayoutParams()).f7956.m4512();
        }
    }

    public final View m3524(C2498 c2498) {
        List list = this.f5947;
        if (list == null) {
            View view = c2498.m4500(this.f5940, 9223372036854775807L).f8006;
            this.f5940 += this.f5941;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC2508) this.f5947.get(i)).f8006;
            C2492 c2492 = (C2492) view2.getLayoutParams();
            if (!c2492.f7956.m4518() && this.f5940 == c2492.f7956.m4512()) {
                m3523(view2);
                return view2;
            }
        }
        return null;
    }
}
