package p000;

import android.text.Editable;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛲᛴᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2738Ujhhgtgfeyxiexzf extends ClickableSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8701Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f8702Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1904feyxiexzfUjhhgtg f8703Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2738Ujhhgtgfeyxiexzf(InterfaceC1904feyxiexzfUjhhgtg interfaceC1904feyxiexzfUjhhgtg, Serializable serializable, int i) {
        this.f8701Ujhhgtgfeyxiexzf = i;
        this.f8703Ujhhgtgfeyxiexzf = interfaceC1904feyxiexzfUjhhgtg;
        this.f8702Ujhhgtgfeyxiexzf = serializable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f8701Ujhhgtgfeyxiexzf) {
            case 0:
                C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = (C0701Ujhhgtgfeyxiexzf) this.f8703Ujhhgtgfeyxiexzf;
                int selectionStart = ((TextInputEditText) c0701Ujhhgtgfeyxiexzf.f2878Ujhhgtgfeyxiexzf).getSelectionStart();
                int selectionEnd = ((TextInputEditText) c0701Ujhhgtgfeyxiexzf.f2878Ujhhgtgfeyxiexzf).getSelectionEnd();
                Editable text = ((TextInputEditText) c0701Ujhhgtgfeyxiexzf.f2878Ujhhgtgfeyxiexzf).getText();
                if (text != null) {
                    text.replace(selectionStart, selectionEnd, (String) this.f8702Ujhhgtgfeyxiexzf);
                }
                break;
            case 1:
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = (C0328Ujhhgtgfeyxiexzf) this.f8703Ujhhgtgfeyxiexzf;
                int selectionStart2 = c0328Ujhhgtgfeyxiexzf.f1933Ujhhgtgfeyxiexzf.getSelectionStart();
                int selectionEnd2 = c0328Ujhhgtgfeyxiexzf.f1933Ujhhgtgfeyxiexzf.getSelectionEnd();
                Editable text2 = c0328Ujhhgtgfeyxiexzf.f1933Ujhhgtgfeyxiexzf.getText();
                if (text2 != null) {
                    text2.replace(selectionStart2, selectionEnd2, (String) this.f8702Ujhhgtgfeyxiexzf);
                }
                break;
            case 2:
                C0312Ujhhgtgfeyxiexzf c0312Ujhhgtgfeyxiexzf = (C0312Ujhhgtgfeyxiexzf) this.f8703Ujhhgtgfeyxiexzf;
                int selectionStart3 = c0312Ujhhgtgfeyxiexzf.f1864Ujhhgtgfeyxiexzf.getSelectionStart();
                int selectionEnd3 = c0312Ujhhgtgfeyxiexzf.f1864Ujhhgtgfeyxiexzf.getSelectionEnd();
                Editable text3 = c0312Ujhhgtgfeyxiexzf.f1864Ujhhgtgfeyxiexzf.getText();
                if (text3 != null) {
                    text3.replace(selectionStart3, selectionEnd3, (String) this.f8702Ujhhgtgfeyxiexzf);
                }
                break;
            case 3:
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf2 = (C0328Ujhhgtgfeyxiexzf) this.f8703Ujhhgtgfeyxiexzf;
                int selectionStart4 = c0328Ujhhgtgfeyxiexzf2.f1933Ujhhgtgfeyxiexzf.getSelectionStart();
                int selectionEnd4 = c0328Ujhhgtgfeyxiexzf2.f1933Ujhhgtgfeyxiexzf.getSelectionEnd();
                Editable text4 = c0328Ujhhgtgfeyxiexzf2.f1933Ujhhgtgfeyxiexzf.getText();
                if (text4 != null) {
                    text4.replace(selectionStart4, selectionEnd4, (String) this.f8702Ujhhgtgfeyxiexzf);
                }
                break;
            case 4:
                C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf2 = (C0701Ujhhgtgfeyxiexzf) this.f8703Ujhhgtgfeyxiexzf;
                int selectionStart5 = ((TextInputEditText) c0701Ujhhgtgfeyxiexzf2.f2876Ujhhgtgfeyxiexzf).getSelectionStart();
                int selectionEnd5 = ((TextInputEditText) c0701Ujhhgtgfeyxiexzf2.f2876Ujhhgtgfeyxiexzf).getSelectionEnd();
                Editable text5 = ((TextInputEditText) c0701Ujhhgtgfeyxiexzf2.f2876Ujhhgtgfeyxiexzf).getText();
                if (text5 != null) {
                    text5.replace(selectionStart5, selectionEnd5, (String) this.f8702Ujhhgtgfeyxiexzf);
                }
                break;
            default:
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf3 = (C0328Ujhhgtgfeyxiexzf) this.f8703Ujhhgtgfeyxiexzf;
                TextInputEditText textInputEditText = c0328Ujhhgtgfeyxiexzf3.f1933Ujhhgtgfeyxiexzf;
                C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = (C1381feyxiexzfUjhhgtg) this.f8702Ujhhgtgfeyxiexzf;
                textInputEditText.setText((CharSequence) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf);
                c0328Ujhhgtgfeyxiexzf3.f1934Ujhhgtgfeyxiexzf.setText((CharSequence) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf);
                break;
        }
    }
}
