package p000;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲀᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1694 implements InterfaceC3623 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5699;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final LinearLayout f5700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final MaterialSwitch f5701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final MaterialTextView f5702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final MaterialTextView f5703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final MaterialTextView f5704;

    public /* synthetic */ C1694(LinearLayout linearLayout, MaterialSwitch materialSwitch, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, int i) {
        this.f5699 = i;
        this.f5700 = linearLayout;
        this.f5701 = materialSwitch;
        this.f5702 = materialTextView;
        this.f5703 = materialTextView2;
        this.f5704 = materialTextView3;
    }

    @Override // p000.InterfaceC3623
    public final View getRoot() {
        switch (this.f5699) {
            case 0:
                break;
        }
        return this.f5700;
    }
}
