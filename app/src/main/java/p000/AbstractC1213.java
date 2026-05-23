package p000;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1213 {

    public final TextInputLayout f4373;

    public final C1212 f4374;

    public final Context f4375;

    public final CheckableImageButton f4376;

    public AbstractC1213(C1212 c1212) {
        this.f4373 = c1212.f4351;
        this.f4374 = c1212;
        this.f4375 = c1212.getContext();
        this.f4376 = c1212.f4357;
    }

    public int mo2146() {
        return 0;
    }

    public int mo2147() {
        return 0;
    }

    public View.OnFocusChangeListener mo2148() {
        return null;
    }

    public View.OnClickListener mo2149() {
        return null;
    }

    public View.OnFocusChangeListener mo2150() {
        return null;
    }

    public C0466 mo2687() {
        return null;
    }

    public boolean mo2688(int i) {
        return true;
    }

    public boolean mo2829() {
        return this instanceof C1118;
    }

    public boolean mo2689() {
        return false;
    }

    public final void m2830() {
        this.f4374.m2819(false);
    }

    public void mo2145() {
    }

    public void mo2828() {
    }

    public void mo2153() {
    }

    public void mo2154() {
    }

    public void mo2151(EditText editText) {
    }

    public void mo2690(C0092 c0092) {
    }

    public void mo2691(AccessibilityEvent accessibilityEvent) {
    }

    public void mo2152(boolean z) {
    }
}
