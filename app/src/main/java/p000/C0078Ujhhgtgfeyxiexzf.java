package p000;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ要点脸能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0078Ujhhgtgfeyxiexzf extends URLSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0206Ujhhgtgfeyxiexzf f1143Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f1144Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC0075Ujhhgtgfeyxiexzf f1145Ujhhgtgfeyxiexzf;

    public C0078Ujhhgtgfeyxiexzf(C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf, String str, InterfaceC0075Ujhhgtgfeyxiexzf interfaceC0075Ujhhgtgfeyxiexzf) {
        super(str);
        this.f1143Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf;
        this.f1144Ujhhgtgfeyxiexzf = str;
        this.f1145Ujhhgtgfeyxiexzf = interfaceC0075Ujhhgtgfeyxiexzf;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f1145Ujhhgtgfeyxiexzf.mo1115Ujhhgtgfeyxiexzf(view, this.f1144Ujhhgtgfeyxiexzf);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f1143Ujhhgtgfeyxiexzf.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
