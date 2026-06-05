package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2947feyxiexzfUjhhgtg extends ClickableSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f9246Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2963feyxiexzfUjhhgtg f9247Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f9248Ujhhgtgfeyxiexzf;

    public C2947feyxiexzfUjhhgtg(int i, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg, int i2) {
        this.f9246Ujhhgtgfeyxiexzf = i;
        this.f9247Ujhhgtgfeyxiexzf = c2963feyxiexzfUjhhgtg;
        this.f9248Ujhhgtgfeyxiexzf = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9246Ujhhgtgfeyxiexzf);
        this.f9247Ujhhgtgfeyxiexzf.f9272Ujhhgtgfeyxiexzf.performAction(this.f9248Ujhhgtgfeyxiexzf, bundle);
    }
}
