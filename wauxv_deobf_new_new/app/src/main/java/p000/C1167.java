package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲀᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1167 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final EditText f4289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0348 f4290;

    public C1167(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0348 c0348 = new C0348(25);
        super(inputConnection, false);
        this.f4289 = editText;
        this.f4290 = c0348;
        if (C1148.f4248 != null) {
            C1148 c1148M2897 = C1148.m2897();
            if (c1148M2897.m2898() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2140 c2140 = c1148M2897.f4253;
            c2140.getClass();
            Bundle bundle = editorInfo.extras;
            C2000 c2000 = (C2000) ((C2136) c2140.f7072).f7059;
            int iM3849 = c2000.m3849(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM3849 != 0 ? ((ByteBuffer) c2000.f6315).getInt(iM3849 + c2000.f6312) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f4289.getEditableText();
        this.f4290.getClass();
        return C0348.m1604(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f4289.getEditableText();
        this.f4290.getClass();
        return C0348.m1604(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
