package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2680 extends AbstractC2686 {

    public final /* synthetic */ ArrayList f8653;

    public final /* synthetic */ Matrix f8654;

    public C2680(ArrayList arrayList, Matrix matrix) {
        this.f8653 = arrayList;
        this.f8654 = matrix;
    }

    @Override // p000.AbstractC2686
    public final void mo4694(Matrix matrix, C2676 c2676, int i, Canvas canvas) {
        Iterator it = this.f8653.iterator();
        while (it.hasNext()) {
            ((AbstractC2686) it.next()).mo4694(this.f8654, c2676, i, canvas);
        }
    }
}
