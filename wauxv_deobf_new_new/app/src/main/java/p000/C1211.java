package p000;

import android.text.Editable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᛸᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1211 extends AbstractC2975 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f4346;

    public C1211(C1213 c1213) {
        this.f4346 = c1213;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f4346.m2937().mo2237();
    }

    @Override // p000.AbstractC2975, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4346.m2937().mo2950();
    }
}
