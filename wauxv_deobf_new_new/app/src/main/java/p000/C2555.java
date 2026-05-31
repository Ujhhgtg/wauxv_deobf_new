package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᛸᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2555 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f8126;

    public C2555(RecyclerView recyclerView) {
        this.f8126 = recyclerView;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4524() {
        RecyclerView recyclerView = this.f8126;
        if (!recyclerView.f375 || !recyclerView.f374) {
            recyclerView.f382 = true;
            recyclerView.requestLayout();
        } else {
            RunnableC2535 runnableC2535 = recyclerView.f364;
            Field field = AbstractC3638.f11333;
            recyclerView.postOnAnimation(runnableC2535);
        }
    }
}
