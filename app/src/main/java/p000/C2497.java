package p000;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2497 {

    public SparseArray f7964;

    public int f7965;

    public Set f7966;

    public final C2496 m4489(int i) {
        SparseArray sparseArray = this.f7964;
        C2496 c2496 = (C2496) sparseArray.get(i);
        if (c2496 != null) {
            return c2496;
        }
        C2496 c2497 = new C2496();
        sparseArray.put(i, c2497);
        return c2497;
    }
}
