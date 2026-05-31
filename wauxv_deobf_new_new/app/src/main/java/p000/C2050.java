package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᛸᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2050 implements InterfaceC3623 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinearLayout f6866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final MaterialButton f6867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final RecyclerView f6868;

    public C2050(LinearLayout linearLayout, MaterialButton materialButton, RecyclerView recyclerView) {
        this.f6866 = linearLayout;
        this.f6867 = materialButton;
        this.f6868 = recyclerView;
    }

    @Override // p000.InterfaceC3623
    public final View getRoot() {
        return this.f6866;
    }
}
