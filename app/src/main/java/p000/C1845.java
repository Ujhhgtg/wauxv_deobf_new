package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1845 implements TextWatcher {

    public final /* synthetic */ int f6139;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f6139) {
            case 0:
                Float fM4851 = AbstractC2847.m4851(String.valueOf(editable));
                if (fM4851 != null) {
                    C1842.f6135.m2544(fM4851.floatValue());
                }
                break;
            default:
                Float fM4852 = AbstractC2847.m4851(String.valueOf(editable));
                if (fM4852 != null) {
                    C1843.f6136.m2544(fM4852.floatValue());
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f6139;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f6139;
    }

    private final void m3602(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m3603(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m3604(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m3605(int i, int i2, int i3, CharSequence charSequence) {
    }
}
