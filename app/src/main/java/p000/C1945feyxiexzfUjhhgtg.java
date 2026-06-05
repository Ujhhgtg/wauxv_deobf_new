package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1945feyxiexzfUjhhgtg implements Spannable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f6421Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Spannable f6422Ujhhgtgfeyxiexzf;

    public C1945feyxiexzfUjhhgtg(Spannable spannable) {
        this.f6422Ujhhgtgfeyxiexzf = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f6422Ujhhgtgfeyxiexzf.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f6422Ujhhgtgfeyxiexzf.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f6422Ujhhgtgfeyxiexzf.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f6422Ujhhgtgfeyxiexzf.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f6422Ujhhgtgfeyxiexzf.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f6422Ujhhgtgfeyxiexzf.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f6422Ujhhgtgfeyxiexzf.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6422Ujhhgtgfeyxiexzf.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f6422Ujhhgtgfeyxiexzf.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m3288Ujhhgtgfeyxiexzf();
        this.f6422Ujhhgtgfeyxiexzf.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m3288Ujhhgtgfeyxiexzf();
        this.f6422Ujhhgtgfeyxiexzf.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f6422Ujhhgtgfeyxiexzf.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6422Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3288Ujhhgtgfeyxiexzf() {
        Spannable spannable = this.f6422Ujhhgtgfeyxiexzf;
        if (!this.f6421Ujhhgtgfeyxiexzf) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0420Ujhhgtgfeyxiexzf(22) : new C1949feyxiexzfUjhhgtg(22)).mo1743Ujhhgtgfeyxiexzf(spannable)) {
                this.f6422Ujhhgtgfeyxiexzf = new SpannableString(spannable);
            }
        }
        this.f6421Ujhhgtgfeyxiexzf = true;
    }
}
