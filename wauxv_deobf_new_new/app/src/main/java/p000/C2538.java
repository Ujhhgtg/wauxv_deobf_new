package p000;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᤝᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2538 extends Observable {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m4463() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4464() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C2555) ((Observable) this).mObservers.get(size)).f8126;
            recyclerView.m207(null);
            recyclerView.f411.f8140 = true;
            recyclerView.m244(true);
            if (!recyclerView.f360.m1320()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4465(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C2555 c2555 = (C2555) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c2555.f8126;
            recyclerView.m207(null);
            C0154 c0154 = recyclerView.f360;
            ArrayList arrayList = (ArrayList) c0154.f1219;
            if (i != i2) {
                arrayList.add(c0154.m1322(null, 8, i, i2));
                c0154.f1217 |= 8;
                if (arrayList.size() == 1) {
                    c2555.m4524();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4466(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C2555 c2555 = (C2555) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c2555.f8126;
            recyclerView.m207(null);
            C0154 c0154 = recyclerView.f360;
            ArrayList arrayList = (ArrayList) c0154.f1219;
            if (i2 >= 1) {
                arrayList.add(c0154.m1322(null, 4, i, i2));
                c0154.f1217 |= 4;
                if (arrayList.size() == 1) {
                    c2555.m4524();
                }
            }
        }
    }
}
