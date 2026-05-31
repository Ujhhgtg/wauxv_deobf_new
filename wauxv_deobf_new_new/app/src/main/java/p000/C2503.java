package p000;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᛸᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2503 extends AbstractC2563 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final SparseArray f7936;

    public C2503(View view) {
        super(view);
        this.f7936 = new SparseArray();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final View m4446(int i) {
        SparseArray sparseArray = this.f7936;
        View viewFindViewById = (View) sparseArray.get(i);
        if (viewFindViewById == null) {
            viewFindViewById = this.f8157.findViewById(i);
            if (viewFindViewById != null) {
                sparseArray.put(i, viewFindViewById);
            } else {
                viewFindViewById = null;
            }
        }
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException(AbstractC1095.m2794(i, "No view found with id ").toString());
    }
}
