package p000;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1797 extends URLSpan {

    public final C1901 f6004;

    public final String f6005;

    public final InterfaceC1796 f6006;

    public C1797(C1901 c1901, String str, InterfaceC1796 interfaceC1796) {
        super(str);
        this.f6004 = c1901;
        this.f6005 = str;
        this.f6006 = interfaceC1796;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f6006.mo1693(view, this.f6005);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
