package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1844 implements TextWatcher {

    public final /* synthetic */ int f6137;

    public final /* synthetic */ EditText f6138;

    public /* synthetic */ C1844(EditText editText, int i) {
        this.f6137 = i;
        this.f6138 = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f6137) {
            case 0:
                this.f6138.addTextChangedListener(new C1845(0));
                break;
            default:
                this.f6138.addTextChangedListener(new C1845(1));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f6137;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f6137;
    }

    private final void m3598(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m3599(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m3600(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m3601(int i, int i2, int i3, CharSequence charSequence) {
    }
}
