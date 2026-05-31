package p000;

import android.view.View;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᤞᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2731 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2735 f8756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8757;

    public ViewOnLayoutChangeListenerC2731(C2735 c2735, int i) {
        this.f8756 = c2735;
        this.f8757 = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        C2735 c2735 = this.f8756;
        ModuleRecyclerView moduleRecyclerView = c2735.f8773;
        if (moduleRecyclerView == null) {
            "recyclerView";
            moduleRecyclerView = null;
        }
        int i9 = this.f8757;
        if (moduleRecyclerView.m228(i9) != null) {
            moduleRecyclerView.postDelayed(new RunnableC1020(moduleRecyclerView, i9, c2735, 1), 150L);
            return;
        }
        C2733 c2733 = new C2733(c2735, i9);
        if (moduleRecyclerView.f413 == null) {
            moduleRecyclerView.f413 = new ArrayList();
        }
        moduleRecyclerView.f413.add(c2733);
        moduleRecyclerView.m256(i9);
    }
}
