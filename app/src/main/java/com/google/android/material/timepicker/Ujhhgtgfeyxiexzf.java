package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p000.AbstractC2006feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: com.google.android.material.timepicker.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Ujhhgtgfeyxiexzf extends AbstractC2006feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ ChipTextInputComboView f975Ujhhgtgfeyxiexzf;

    public Ujhhgtgfeyxiexzf(ChipTextInputComboView chipTextInputComboView) {
        this.f975Ujhhgtgfeyxiexzf = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f975Ujhhgtgfeyxiexzf;
        if (zIsEmpty) {
            chipTextInputComboView.f943Ujhhgtgfeyxiexzf.setText(ChipTextInputComboView.m860Ujhhgtgfeyxiexzf(chipTextInputComboView, "00"));
            return;
        }
        String strM860Ujhhgtgfeyxiexzf = ChipTextInputComboView.m860Ujhhgtgfeyxiexzf(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f943Ujhhgtgfeyxiexzf;
        if (TextUtils.isEmpty(strM860Ujhhgtgfeyxiexzf)) {
            strM860Ujhhgtgfeyxiexzf = ChipTextInputComboView.m860Ujhhgtgfeyxiexzf(chipTextInputComboView, "00");
        }
        chip.setText(strM860Ujhhgtgfeyxiexzf);
    }
}
