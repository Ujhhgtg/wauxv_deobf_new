package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ要点脸ᛳᛲᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1232feyxiexzfUjhhgtg extends SpannableStringBuilder {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Class f4557Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f4558Ujhhgtgfeyxiexzf;

    public C1232feyxiexzfUjhhgtg(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f4558Ujhhgtgfeyxiexzf = new ArrayList();
        AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(cls, "watcherClass cannot be null");
        this.f4557Ujhhgtgfeyxiexzf = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C1230feyxiexzfUjhhgtg c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
        if (m2722Ujhhgtgfeyxiexzf(obj) && (c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf = m2721Ujhhgtgfeyxiexzf(obj)) != null) {
            obj = c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C1230feyxiexzfUjhhgtg c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
        if (m2722Ujhhgtgfeyxiexzf(obj) && (c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf = m2721Ujhhgtgfeyxiexzf(obj)) != null) {
            obj = c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C1230feyxiexzfUjhhgtg c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
        if (m2722Ujhhgtgfeyxiexzf(obj) && (c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf = m2721Ujhhgtgfeyxiexzf(obj)) != null) {
            obj = c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f4557Ujhhgtgfeyxiexzf != cls) {
            return super.getSpans(i, i2, cls);
        }
        C1230feyxiexzfUjhhgtg[] c1230feyxiexzfUjhhgtgArr = (C1230feyxiexzfUjhhgtg[]) super.getSpans(i, i2, C1230feyxiexzfUjhhgtg.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c1230feyxiexzfUjhhgtgArr.length);
        for (int i3 = 0; i3 < c1230feyxiexzfUjhhgtgArr.length; i3++) {
            objArr[i3] = c1230feyxiexzfUjhhgtgArr[i3].f4555Ujhhgtgfeyxiexzf;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f4557Ujhhgtgfeyxiexzf == cls) {
            cls = C1230feyxiexzfUjhhgtg.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C1230feyxiexzfUjhhgtg c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
        if (m2722Ujhhgtgfeyxiexzf(obj)) {
            c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf = m2721Ujhhgtgfeyxiexzf(obj);
            if (c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf != null) {
                obj = c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf;
            }
        } else {
            c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf = null;
        }
        super.removeSpan(obj);
        if (c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf != null) {
            this.f4558Ujhhgtgfeyxiexzf.remove(c1230feyxiexzfUjhhgtgM2721Ujhhgtgfeyxiexzf);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m2722Ujhhgtgfeyxiexzf(obj)) {
            C1230feyxiexzfUjhhgtg c1230feyxiexzfUjhhgtg = new C1230feyxiexzfUjhhgtg(obj);
            this.f4558Ujhhgtgfeyxiexzf.add(c1230feyxiexzfUjhhgtg);
            obj = c1230feyxiexzfUjhhgtg;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C1232feyxiexzfUjhhgtg(this.f4557Ujhhgtgfeyxiexzf, this, i, i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2719Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4558Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return;
            }
            ((C1230feyxiexzfUjhhgtg) arrayList.get(i)).f4556Ujhhgtgfeyxiexzf.incrementAndGet();
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2720Ujhhgtgfeyxiexzf() {
        m2723Ujhhgtgfeyxiexzf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4558Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return;
            }
            ((C1230feyxiexzfUjhhgtg) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1230feyxiexzfUjhhgtg m2721Ujhhgtgfeyxiexzf(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4558Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return null;
            }
            C1230feyxiexzfUjhhgtg c1230feyxiexzfUjhhgtg = (C1230feyxiexzfUjhhgtg) arrayList.get(i);
            if (c1230feyxiexzfUjhhgtg.f4555Ujhhgtgfeyxiexzf == obj) {
                return c1230feyxiexzfUjhhgtg;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m2722Ujhhgtgfeyxiexzf(Object obj) {
        if (obj != null) {
            return this.f4557Ujhhgtgfeyxiexzf == obj.getClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m2723Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4558Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return;
            }
            ((C1230feyxiexzfUjhhgtg) arrayList.get(i)).f4556Ujhhgtgfeyxiexzf.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m2719Ujhhgtgfeyxiexzf();
        super.replace(i, i2, charSequence);
        m2723Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C1232feyxiexzfUjhhgtg(Class cls, C1232feyxiexzfUjhhgtg c1232feyxiexzfUjhhgtg, int i, int i2) {
        super(c1232feyxiexzfUjhhgtg, i, i2);
        this.f4558Ujhhgtgfeyxiexzf = new ArrayList();
        AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(cls, "watcherClass cannot be null");
        this.f4557Ujhhgtgfeyxiexzf = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m2719Ujhhgtgfeyxiexzf();
        super.replace(i, i2, charSequence, i3, i4);
        m2723Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
