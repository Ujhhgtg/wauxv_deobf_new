package p000;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᛸᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2048 implements InterfaceC3623 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6856;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final LinearLayout f6857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextInputEditText f6858;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final TextInputEditText f6859;

    public /* synthetic */ C2048(LinearLayout linearLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, int i) {
        this.f6856 = i;
        this.f6857 = linearLayout;
        this.f6858 = textInputEditText;
        this.f6859 = textInputEditText2;
    }

    @Override // p000.InterfaceC3623
    public final View getRoot() {
        switch (this.f6856) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return this.f6857;
    }

    public /* synthetic */ C2048(LinearLayout linearLayout, TextInputEditText textInputEditText, MaterialTextView materialTextView, TextInputEditText textInputEditText2, int i) {
        this.f6856 = i;
        this.f6857 = linearLayout;
        this.f6858 = textInputEditText;
        this.f6859 = textInputEditText2;
    }

    public C2048(LinearLayout linearLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2) {
        this.f6856 = 2;
        this.f6857 = linearLayout;
        this.f6858 = textInputEditText;
        this.f6859 = textInputEditText2;
    }
}
