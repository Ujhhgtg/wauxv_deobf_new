package p000;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2004feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C3699feyxiexzfUjhhgtg m3347Ujhhgtgfeyxiexzf(View view, C3699feyxiexzfUjhhgtg c3699feyxiexzfUjhhgtg) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c3699feyxiexzfUjhhgtg);
        }
        InterfaceC3698Ujhhgtgfeyxiexzf interfaceC3698Ujhhgtgfeyxiexzf = c3699feyxiexzfUjhhgtg.f11733Ujhhgtgfeyxiexzf;
        if (interfaceC3698Ujhhgtgfeyxiexzf.mo4446Ujhhgtgfeyxiexzf() == 2) {
            return c3699feyxiexzfUjhhgtg;
        }
        ClipData clipDataMo4441Ujhhgtgfeyxiexzf = interfaceC3698Ujhhgtgfeyxiexzf.mo4441Ujhhgtgfeyxiexzf();
        int iMo4444Ujhhgtgfeyxiexzf = interfaceC3698Ujhhgtgfeyxiexzf.mo4444Ujhhgtgfeyxiexzf();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataMo4441Ujhhgtgfeyxiexzf.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataMo4441Ujhhgtgfeyxiexzf.getItemAt(i);
            if ((iMo4444Ujhhgtgfeyxiexzf & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
