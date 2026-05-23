package p000;

import android.view.View;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤝᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2671 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2675 f8598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8599;

    public ViewOnLayoutChangeListenerC2671(C2675 c2675, int i) {
        this.f8598 = c2675;
        this.f8599 = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        C2675 c2675 = this.f8598;
        ModuleRecyclerView moduleRecyclerView = c2675.f8615;
        if (moduleRecyclerView == null) {
            "recyclerView";
            moduleRecyclerView = null;
        }
        int i9 = this.f8599;
        if (moduleRecyclerView.m228(i9) != null) {
            moduleRecyclerView.postDelayed(new RunnableC1017(moduleRecyclerView, i9, c2675, 1), 150L);
            return;
        }
        C2673 c2673 = new C2673(c2675, i9);
        if (moduleRecyclerView.f413 == null) {
            moduleRecyclerView.f413 = new ArrayList();
        }
        moduleRecyclerView.f413.add(c2673);
        moduleRecyclerView.m256(i9);
    }
}
