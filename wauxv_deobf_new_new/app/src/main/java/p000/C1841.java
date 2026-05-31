package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᤝᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1841 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1848 f6127;

    public C1841(AbstractC1848 abstractC1848) {
        this.f6127 = abstractC1848;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1983 c1983;
        if (i == -1 || (c1983 = this.f6127.f6138) == null) {
            return;
        }
        c1983.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
