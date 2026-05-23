package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2338 extends AbstractC1213 {

    public final int f7522;

    public EditText f7523;

    public final ViewOnClickListenerC0103 f7524;

    public C2338(C1212 c1212, int i) {
        super(c1212);
        this.f7522 = R.drawable.design_password_eye;
        this.f7524 = new ViewOnClickListenerC0103(9, this);
        if (i != 0) {
            this.f7522 = i;
        }
    }

    @Override // p000.AbstractC1213
    public final void mo2828() {
        m2830();
    }

    @Override // p000.AbstractC1213
    public final int mo2146() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC1213
    public final int mo2147() {
        return this.f7522;
    }

    @Override // p000.AbstractC1213
    public final View.OnClickListener mo2149() {
        return this.f7524;
    }

    @Override // p000.AbstractC1213
    public final boolean mo2829() {
        return true;
    }

    @Override // p000.AbstractC1213
    public final boolean mo2689() {
        EditText editText = this.f7523;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.AbstractC1213
    public final void mo2151(EditText editText) {
        this.f7523 = editText;
        m2830();
    }

    @Override // p000.AbstractC1213
    public final void mo2153() {
        EditText editText = this.f7523;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f7523.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.AbstractC1213
    public final void mo2154() {
        EditText editText = this.f7523;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
