package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲇᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1165 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final EditText f4292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0373 f4293;

    public C1165(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0373 c0373 = new C0373(24);
        super(inputConnection, false);
        this.f4292 = editText;
        this.f4293 = c0373;
        if (C1142.f4236 != null) {
            C1142 c1142M2753 = C1142.m2753();
            if (c1142M2753.m2754() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2107 c2107 = c1142M2753.f4241;
            c2107.getClass();
            Bundle bundle = editorInfo.extras;
            C1969 c1969 = (C1969) ((C2103) c2107.f6948).f6935;
            int iM3671 = c1969.m3671(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM3671 != 0 ? ((ByteBuffer) c1969.f6241).getInt(iM3671 + c1969.f6238) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f4292.getEditableText();
        this.f4293.getClass();
        return C0373.m1499(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f4292.getEditableText();
        this.f4293.getClass();
        return C0373.m1499(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
