package p000;

import android.text.Editable;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᤞᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0634 extends ClickableSpan {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2469;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f2470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2471;

    public /* synthetic */ C0634(int i, Serializable serializable, Object obj) {
        this.f2469 = i;
        this.f2471 = obj;
        this.f2470 = serializable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f2469) {
            case 0:
                C2103 c2103 = (C2103) this.f2471;
                int selectionStart = ((TextInputEditText) c2103.f6937).getSelectionStart();
                int selectionEnd = ((TextInputEditText) c2103.f6937).getSelectionEnd();
                Editable text = ((TextInputEditText) c2103.f6937).getText();
                if (text != null) {
                    text.replace(selectionStart, selectionEnd, (String) this.f2470);
                }
                break;
            case 1:
                C2022 c2022 = (C2022) this.f2471;
                int selectionStart2 = c2022.f6775.getSelectionStart();
                int selectionEnd2 = c2022.f6775.getSelectionEnd();
                Editable text2 = c2022.f6775.getText();
                if (text2 != null) {
                    text2.replace(selectionStart2, selectionEnd2, (String) this.f2470);
                }
                break;
            case 2:
                C2021 c2021 = (C2021) this.f2471;
                int selectionStart3 = ((TextInputEditText) c2021.f6769).getSelectionStart();
                int selectionEnd3 = ((TextInputEditText) c2021.f6769).getSelectionEnd();
                Editable text3 = ((TextInputEditText) c2021.f6769).getText();
                if (text3 != null) {
                    text3.replace(selectionStart3, selectionEnd3, (String) this.f2470);
                }
                break;
            case 3:
                C2022 c2023 = (C2022) this.f2471;
                int selectionStart4 = c2023.f6775.getSelectionStart();
                int selectionEnd4 = c2023.f6775.getSelectionEnd();
                Editable text4 = c2023.f6775.getText();
                if (text4 != null) {
                    text4.replace(selectionStart4, selectionEnd4, (String) this.f2470);
                }
                break;
            case 4:
                C2103 c2104 = (C2103) this.f2471;
                int selectionStart5 = ((TextInputEditText) c2104.f6937).getSelectionStart();
                int selectionEnd5 = ((TextInputEditText) c2104.f6937).getSelectionEnd();
                Editable text5 = ((TextInputEditText) c2104.f6937).getText();
                if (text5 != null) {
                    text5.replace(selectionStart5, selectionEnd5, (String) this.f2470);
                }
                break;
            default:
                C2022 c2024 = (C2022) this.f2471;
                TextInputEditText textInputEditText = c2024.f6775;
                C2315 c2315 = (C2315) this.f2470;
                textInputEditText.setText((CharSequence) c2315.f7445);
                c2024.f6776.setText((CharSequence) c2315.f7446);
                break;
        }
    }
}
