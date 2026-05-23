package p000;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2452 extends AbstractC2508 {

    public final SparseArray f7793;

    public C2452(View view) {
        super(view);
        this.f7793 = new SparseArray();
    }

    public final View m4425(int i) {
        SparseArray sparseArray = this.f7793;
        View viewFindViewById = (View) sparseArray.get(i);
        if (viewFindViewById == null) {
            viewFindViewById = this.f8006.findViewById(i);
            if (viewFindViewById != null) {
                sparseArray.put(i, viewFindViewById);
            } else {
                viewFindViewById = null;
            }
        }
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(AbstractC1194.m2779(i, "No view found with id ").toString());
    }
}
