package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0219 {

    public final TextView f1346;

    public final C0094 f1347;

    public C0219(TextView textView) {
        this.f1346 = textView;
        this.f1347 = new C0094(textView);
    }

    public final void m1254(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f1346.getContext().obtainStyledAttributes(attributeSet, AbstractC2470.f7883, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m1255(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void m1255(boolean z) {
        ((AbstractC1460) this.f1347.f1049).mo2768(z);
    }
}
