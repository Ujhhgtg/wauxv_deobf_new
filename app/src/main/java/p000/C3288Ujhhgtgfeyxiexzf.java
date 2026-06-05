package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱUjhhgtgᛱᛳ能不能ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3288Ujhhgtgfeyxiexzf extends InputConnectionWrapper {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final EditText f10317Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2466feyxiexzfUjhhgtg f10318Ujhhgtgfeyxiexzf;

    public C3288Ujhhgtgfeyxiexzf(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = new C2466feyxiexzfUjhhgtg(25);
        super(inputConnection, false);
        this.f10317Ujhhgtgfeyxiexzf = editText;
        this.f10318Ujhhgtgfeyxiexzf = c2466feyxiexzfUjhhgtg;
        if (C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf != null) {
            C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
            if (c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4908Ujhhgtgfeyxiexzf() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0425Ujhhgtgfeyxiexzf c0425Ujhhgtgfeyxiexzf = c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.f10595Ujhhgtgfeyxiexzf;
            c0425Ujhhgtgfeyxiexzf.getClass();
            Bundle bundle = editorInfo.extras;
            C0382Ujhhgtgfeyxiexzf c0382Ujhhgtgfeyxiexzf = (C0382Ujhhgtgfeyxiexzf) ((C0416Ujhhgtgfeyxiexzf) c0425Ujhhgtgfeyxiexzf.f2274Ujhhgtgfeyxiexzf).f2243Ujhhgtgfeyxiexzf;
            int iM1223Ujhhgtgfeyxiexzf = c0382Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM1223Ujhhgtgfeyxiexzf != 0 ? ((ByteBuffer) c0382Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getInt(iM1223Ujhhgtgfeyxiexzf + c0382Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f10317Ujhhgtgfeyxiexzf.getEditableText();
        this.f10318Ujhhgtgfeyxiexzf.getClass();
        return C2466feyxiexzfUjhhgtg.m3701Ujhhgtgfeyxiexzf(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f10317Ujhhgtgfeyxiexzf.getEditableText();
        this.f10318Ujhhgtgfeyxiexzf.getClass();
        return C2466feyxiexzfUjhhgtg.m3701Ujhhgtgfeyxiexzf(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
