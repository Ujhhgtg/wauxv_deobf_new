package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱUjhhgtgᛱᛳᛴ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3286Ujhhgtgfeyxiexzf implements KeyListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final KeyListener f10314Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2466feyxiexzfUjhhgtg f10315Ujhhgtgfeyxiexzf;

    public C3286Ujhhgtgfeyxiexzf(KeyListener keyListener) {
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = new C2466feyxiexzfUjhhgtg(26);
        this.f10314Ujhhgtgfeyxiexzf = keyListener;
        this.f10315Ujhhgtgfeyxiexzf = c2466feyxiexzfUjhhgtg;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f10314Ujhhgtgfeyxiexzf.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f10314Ujhhgtgfeyxiexzf.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zM3590Ujhhgtgfeyxiexzf;
        boolean z;
        this.f10315Ujhhgtgfeyxiexzf.getClass();
        if (i != 67) {
            zM3590Ujhhgtgfeyxiexzf = i != 112 ? false : C2366Ujhhgtgfeyxiexzf.m3590Ujhhgtgfeyxiexzf(editable, keyEvent, true);
        } else {
            zM3590Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3590Ujhhgtgfeyxiexzf(editable, keyEvent, false);
        }
        if (zM3590Ujhhgtgfeyxiexzf) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f10314Ujhhgtgfeyxiexzf.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f10314Ujhhgtgfeyxiexzf.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f10314Ujhhgtgfeyxiexzf.onKeyUp(view, editable, i, keyEvent);
    }
}
