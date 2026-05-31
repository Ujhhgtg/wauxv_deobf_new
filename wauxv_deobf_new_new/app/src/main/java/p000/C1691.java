package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᛸᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1691 implements InterfaceC3623 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final View f5686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextView f5687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final View f5688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ViewGroup f5689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final View f5690;

    public /* synthetic */ C1691(ViewGroup viewGroup, View view, View view2, TextView textView, View view3, int i) {
        this.f5685 = i;
        this.f5689 = viewGroup;
        this.f5686 = view;
        this.f5690 = view2;
        this.f5687 = textView;
        this.f5688 = view3;
    }

    @Override // p000.InterfaceC3623
    public final View getRoot() {
        switch (this.f5685) {
            case 0:
                return (MaterialCardView) this.f5689;
            case 1:
                return (LinearLayout) this.f5689;
            case 2:
                return (LinearLayout) this.f5689;
            default:
                return (LinearLayout) this.f5689;
        }
    }
}
