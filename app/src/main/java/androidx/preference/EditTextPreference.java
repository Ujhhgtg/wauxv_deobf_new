package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import me.hd.wauxv.R;
import p000.AbstractC0802feyxiexzfUjhhgtg;
import p000.C2466feyxiexzfUjhhgtg;
import p000.C3052Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM4516Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4516Ujhhgtgfeyxiexzf(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM4516Ujhhgtgfeyxiexzf);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0802feyxiexzfUjhhgtg.f3182Ujhhgtgfeyxiexzf, iM4516Ujhhgtgfeyxiexzf, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C2466feyxiexzfUjhhgtg.f7995Ujhhgtgfeyxiexzf == null) {
                C2466feyxiexzfUjhhgtg.f7995Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(23);
            }
            this.f316Ujhhgtgfeyxiexzf = C2466feyxiexzfUjhhgtg.f7995Ujhhgtgfeyxiexzf;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object mo105Ujhhgtgfeyxiexzf(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
