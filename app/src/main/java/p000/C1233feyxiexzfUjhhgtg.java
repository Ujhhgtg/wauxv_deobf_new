package p000;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ要点脸ᛳᛲ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1233feyxiexzfUjhhgtg implements Appendable, CharSequence {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayDeque f4560Ujhhgtgfeyxiexzf = new ArrayDeque(8);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final StringBuilder f4559Ujhhgtgfeyxiexzf = new StringBuilder((CharSequence) "");

    public C1233feyxiexzfUjhhgtg() {
        m2726Ujhhgtgfeyxiexzf(0, "");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m2724Ujhhgtgfeyxiexzf(C1233feyxiexzfUjhhgtg c1233feyxiexzfUjhhgtg, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                c1233feyxiexzfUjhhgtg.f4560Ujhhgtgfeyxiexzf.push(new C1235feyxiexzfUjhhgtg(obj, i, i2, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                m2724Ujhhgtgfeyxiexzf(c1233feyxiexzfUjhhgtg, obj2, i, i2);
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f4559Ujhhgtgfeyxiexzf.append(c);
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4559Ujhhgtgfeyxiexzf.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4559Ujhhgtgfeyxiexzf.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<C1235feyxiexzfUjhhgtg> listUnmodifiableList;
        int i3;
        StringBuilder sb = this.f4559Ujhhgtgfeyxiexzf;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.f4560Ujhhgtgfeyxiexzf;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    C1235feyxiexzfUjhhgtg c1235feyxiexzfUjhhgtg = (C1235feyxiexzfUjhhgtg) itDescendingIterator.next();
                    int i4 = c1235feyxiexzfUjhhgtg.f4566Ujhhgtgfeyxiexzf;
                    if ((i4 >= i && i4 < i2) || (((i3 = c1235feyxiexzfUjhhgtg.f4567Ujhhgtgfeyxiexzf) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(c1235feyxiexzfUjhhgtg);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (C1235feyxiexzfUjhhgtg c1235feyxiexzfUjhhgtg2 : listUnmodifiableList) {
            int iMax = Math.max(0, c1235feyxiexzfUjhhgtg2.f4566Ujhhgtgfeyxiexzf - i);
            spannableStringBuilder.setSpan(c1235feyxiexzfUjhhgtg2.f4565Ujhhgtgfeyxiexzf, iMax, Math.min(length2, (c1235feyxiexzfUjhhgtg2.f4567Ujhhgtgfeyxiexzf - c1235feyxiexzfUjhhgtg2.f4566Ujhhgtgfeyxiexzf) + iMax), c1235feyxiexzfUjhhgtg2.f4568Ujhhgtgfeyxiexzf);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4559Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2725Ujhhgtgfeyxiexzf(char c) {
        this.f4559Ujhhgtgfeyxiexzf.append(c);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2726Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof C1231feyxiexzfUjhhgtg;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f4560Ujhhgtgfeyxiexzf;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new C1235feyxiexzfUjhhgtg(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    arrayDeque.push(new C1235feyxiexzfUjhhgtg(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.f4559Ujhhgtgfeyxiexzf;
        m2726Ujhhgtgfeyxiexzf(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.f4559Ujhhgtgfeyxiexzf;
        m2726Ujhhgtgfeyxiexzf(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }
}
