package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲇᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1871 implements TextWatcher {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6213;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f6213) {
            case 0:
                Float fM4912 = AbstractC2907.m4912(String.valueOf(editable));
                if (fM4912 != null) {
                    C1868.f6209.m2668(fM4912.floatValue());
                }
                break;
            default:
                Float fM4913 = AbstractC2907.m4912(String.valueOf(editable));
                if (fM4913 != null) {
                    C1869.f6210.m2668(fM4913.floatValue());
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f6213;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f6213;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m3780(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m3781(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    private final void m3782(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    private final void m3783(int i, int i2, int i3, CharSequence charSequence) {
    }
}
