package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᤝᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2053 implements InterfaceC3623 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinearLayout f6894;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final RecyclerView f6895;

    public C2053(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f6894 = linearLayout;
        this.f6895 = recyclerView;
    }

    @Override // p000.InterfaceC3623
    public final View getRoot() {
        return this.f6894;
    }
}
