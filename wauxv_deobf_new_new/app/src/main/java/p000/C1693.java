package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲀᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1693 implements InterfaceC3623 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final LinearLayout f5695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextView f5696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final View f5697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final View f5698;

    public /* synthetic */ C1693(LinearLayout linearLayout, View view, TextView textView, View view2, int i) {
        this.f5694 = i;
        this.f5695 = linearLayout;
        this.f5697 = view;
        this.f5696 = textView;
        this.f5698 = view2;
    }

    @Override // p000.InterfaceC3623
    public final View getRoot() {
        switch (this.f5694) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f5695;
    }

    public C1693(LinearLayout linearLayout, MaterialCheckBox materialCheckBox, TextInputEditText textInputEditText, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f5694 = 1;
        this.f5695 = linearLayout;
        this.f5697 = materialCheckBox;
        this.f5698 = textInputEditText;
        this.f5696 = materialTextView;
    }

    public C1693(LinearLayout linearLayout, MaterialCheckBox materialCheckBox, TextInputEditText textInputEditText, MaterialTextView materialTextView, TextInputEditText textInputEditText2) {
        this.f5694 = 2;
        this.f5695 = linearLayout;
        this.f5697 = materialCheckBox;
        this.f5696 = textInputEditText;
        this.f5698 = textInputEditText2;
    }

    public C1693(LinearLayout linearLayout, MaterialButton materialButton, TextInputEditText textInputEditText, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, RadioGroup radioGroup, RecyclerView recyclerView) {
        this.f5694 = 4;
        this.f5695 = linearLayout;
        this.f5697 = textInputEditText;
        this.f5696 = materialRadioButton;
        this.f5698 = materialRadioButton2;
    }
}
