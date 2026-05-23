package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2793 extends SpannableStringBuilder {

    public final Class f8916;

    public final ArrayList f8917;

    public C2793(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f8917 = new ArrayList();
        AbstractC2665.m4661(cls, "watcherClass cannot be null");
        this.f8916 = cls;
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
        C2791 c2791M4773;
        if (m4774(obj) && (c2791M4773 = m4773(obj)) != null) {
            obj = c2791M4773;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C2791 c2791M4773;
        if (m4774(obj) && (c2791M4773 = m4773(obj)) != null) {
            obj = c2791M4773;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C2791 c2791M4773;
        if (m4774(obj) && (c2791M4773 = m4773(obj)) != null) {
            obj = c2791M4773;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f8916 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C2791[] c2791Arr = (C2791[]) super.getSpans(i, i2, C2791.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c2791Arr.length);
        for (int i3 = 0; i3 < c2791Arr.length; i3++) {
            objArr[i3] = c2791Arr[i3].f8912;
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
        if (cls == null || this.f8916 == cls) {
            cls = C2791.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C2791 c2791M4773;
        if (m4774(obj)) {
            c2791M4773 = m4773(obj);
            if (c2791M4773 != null) {
                obj = c2791M4773;
            }
        } else {
            c2791M4773 = null;
        }
        super.removeSpan(obj);
        if (c2791M4773 != null) {
            this.f8917.remove(c2791M4773);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m4774(obj)) {
            C2791 c2791 = new C2791(obj);
            this.f8917.add(c2791);
            obj = c2791;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C2793(this.f8916, this, i, i2);
    }

    public final void m4771() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8917;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2791) arrayList.get(i)).f8913.incrementAndGet();
            i++;
        }
    }

    public final void m4772() {
        m4775();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8917;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2791) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final C2791 m4773(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8917;
            if (i >= arrayList.size()) {
                return null;
            }
            C2791 c2791 = (C2791) arrayList.get(i);
            if (c2791.f8912 == obj) {
                return c2791;
            }
            i++;
        }
    }

    public final boolean m4774(Object obj) {
        if (obj != null) {
            return this.f8916 == obj.getClass();
        }
        return false;
    }

    public final void m4775() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8917;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2791) arrayList.get(i)).f8913.decrementAndGet();
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
        m4771();
        super.replace(i, i2, charSequence);
        m4775();
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

    public C2793(Class cls, C2793 c2793, int i, int i2) {
        super(c2793, i, i2);
        this.f8917 = new ArrayList();
        AbstractC2665.m4661(cls, "watcherClass cannot be null");
        this.f8916 = cls;
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
        m4771();
        super.replace(i, i2, charSequence, i3, i4);
        m4775();
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
