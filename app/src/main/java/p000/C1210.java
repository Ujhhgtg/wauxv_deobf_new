package p000;

import android.text.Editable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1210 extends AbstractC2916 {

    public final /* synthetic */ C1212 f4349;

    public C1210(C1212 c1212) {
        this.f4349 = c1212;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f4349.m2815().mo2145();
    }

    @Override // p000.AbstractC2916, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4349.m2815().mo2828();
    }
}
