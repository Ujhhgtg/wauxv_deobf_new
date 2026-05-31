package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p000.AbstractC2975;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0028 extends AbstractC2975 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ ChipTextInputComboView f961;

    public C0028(ChipTextInputComboView chipTextInputComboView) {
        this.f961 = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f961;
        if (zIsEmpty) {
            chipTextInputComboView.f929.setText(ChipTextInputComboView.m861(chipTextInputComboView, "00"));
            return;
        }
        String strM861 = ChipTextInputComboView.m861(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f929;
        if (TextUtils.isEmpty(strM861)) {
            strM861 = ChipTextInputComboView.m861(chipTextInputComboView, "00");
        }
        chip.setText(strM861);
    }
}
