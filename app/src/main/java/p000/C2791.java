package p000;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2791 implements TextWatcher, SpanWatcher {

    public final Object f8912;

    public final AtomicInteger f8913 = new AtomicInteger(0);

    public C2791(Object obj) {
        this.f8912 = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f8912).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f8912).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f8913.get() <= 0 || !(obj instanceof C3466)) {
            ((SpanWatcher) this.f8912).onSpanAdded(spannable, obj, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f8913.get() <= 0 || !(obj instanceof C3466)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i5 = i;
                i6 = i3;
            } else {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                } else {
                    i5 = i;
                    i6 = i3;
                }
            }
            ((SpanWatcher) this.f8912).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f8913.get() <= 0 || !(obj instanceof C3466)) {
            ((SpanWatcher) this.f8912).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f8912).onTextChanged(charSequence, i, i2, i3);
    }
}
