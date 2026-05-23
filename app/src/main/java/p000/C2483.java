package p000;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲁᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2483 extends Observable {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m4442() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4443() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C2500) ((Observable) this).mObservers.get(size)).f7975;
            recyclerView.m207(null);
            recyclerView.f411.f7989 = true;
            recyclerView.m244(true);
            if (!recyclerView.f360.m1174()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4444(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C2500 c2500 = (C2500) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c2500.f7975;
            recyclerView.m207(null);
            C0146 c0146 = recyclerView.f360;
            ArrayList arrayList = (ArrayList) c0146.f1151;
            if (i != i2) {
                arrayList.add(c0146.m1176(null, 8, i, i2));
                c0146.f1149 |= 8;
                if (arrayList.size() == 1) {
                    RecyclerView recyclerView2 = c2500.f7975;
                    if (recyclerView2.f375 && recyclerView2.f374) {
                        RunnableC2480 runnableC2480 = recyclerView2.f364;
                        Field field = AbstractC3578.f11184;
                        recyclerView2.postOnAnimation(runnableC2480);
                    } else {
                        recyclerView2.f382 = true;
                        recyclerView2.requestLayout();
                    }
                }
            }
        }
    }
}
