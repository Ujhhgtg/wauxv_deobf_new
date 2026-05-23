package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p000.AbstractC2916;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0021 extends AbstractC2916 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ChipTextInputComboView f895;

    public C0021(ChipTextInputComboView chipTextInputComboView) {
        this.f895 = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f895;
        if (zIsEmpty) {
            chipTextInputComboView.f863.setText(ChipTextInputComboView.m717(chipTextInputComboView, "00"));
            return;
        }
        String strM717 = ChipTextInputComboView.m717(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f863;
        if (TextUtils.isEmpty(strM717)) {
            strM717 = ChipTextInputComboView.m717(chipTextInputComboView, "00");
        }
        chip.setText(strM717);
    }
}
