package p000;

import android.text.Editable;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᲈᤞᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0627 extends ClickableSpan {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2475;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f2476;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3623 f2477;

    public /* synthetic */ C0627(InterfaceC3623 interfaceC3623, Serializable serializable, int i) {
        this.f2475 = i;
        this.f2477 = interfaceC3623;
        this.f2476 = serializable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f2475) {
            case 0:
                C1693 c1693 = (C1693) this.f2477;
                int selectionStart = ((TextInputEditText) c1693.f5698).getSelectionStart();
                int selectionEnd = ((TextInputEditText) c1693.f5698).getSelectionEnd();
                Editable text = ((TextInputEditText) c1693.f5698).getText();
                if (text != null) {
                    text.replace(selectionStart, selectionEnd, (String) this.f2476);
                }
                break;
            case 1:
                C2048 c2048 = (C2048) this.f2477;
                int selectionStart2 = c2048.f6858.getSelectionStart();
                int selectionEnd2 = c2048.f6858.getSelectionEnd();
                Editable text2 = c2048.f6858.getText();
                if (text2 != null) {
                    text2.replace(selectionStart2, selectionEnd2, (String) this.f2476);
                }
                break;
            case 2:
                C2052 c2052 = (C2052) this.f2477;
                int selectionStart3 = c2052.f6892.getSelectionStart();
                int selectionEnd3 = c2052.f6892.getSelectionEnd();
                Editable text3 = c2052.f6892.getText();
                if (text3 != null) {
                    text3.replace(selectionStart3, selectionEnd3, (String) this.f2476);
                }
                break;
            case 3:
                C2048 c2049 = (C2048) this.f2477;
                int selectionStart4 = c2049.f6858.getSelectionStart();
                int selectionEnd4 = c2049.f6858.getSelectionEnd();
                Editable text4 = c2049.f6858.getText();
                if (text4 != null) {
                    text4.replace(selectionStart4, selectionEnd4, (String) this.f2476);
                }
                break;
            case 4:
                C1693 c1694 = (C1693) this.f2477;
                int selectionStart5 = ((TextInputEditText) c1694.f5696).getSelectionStart();
                int selectionEnd5 = ((TextInputEditText) c1694.f5696).getSelectionEnd();
                Editable text5 = ((TextInputEditText) c1694.f5696).getText();
                if (text5 != null) {
                    text5.replace(selectionStart5, selectionEnd5, (String) this.f2476);
                }
                break;
            default:
                C2048 c20410 = (C2048) this.f2477;
                TextInputEditText textInputEditText = c20410.f6858;
                C2348 c2348 = (C2348) this.f2476;
                textInputEditText.setText((CharSequence) c2348.f7567);
                c20410.f6859.setText((CharSequence) c2348.f7568);
                break;
        }
    }
}
