package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲈᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2741 extends AbstractC2747 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Matrix f8824;

    public C2741(ArrayList arrayList, Matrix matrix) {
        this.f8823 = arrayList;
        this.f8824 = matrix;
    }

    @Override // p000.AbstractC2747
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo4731(Matrix matrix, C2736 c2736, int i, Canvas canvas) {
        Iterator it = this.f8823.iterator();
        while (it.hasNext()) {
            ((AbstractC2747) it.next()).mo4731(this.f8824, c2736, i, canvas);
        }
    }
}
