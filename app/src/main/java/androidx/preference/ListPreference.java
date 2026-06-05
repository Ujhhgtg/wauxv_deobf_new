package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import me.hd.wauxv.R;
import p000.AbstractC0802feyxiexzfUjhhgtg;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.C3339feyxiexzfUjhhgtg;
import p000.InterfaceC0853feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final CharSequence[] f308Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final String f309Ujhhgtgfeyxiexzf;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0802feyxiexzfUjhhgtg.f3183Ujhhgtgfeyxiexzf, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f308Ujhhgtgfeyxiexzf = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (C3339feyxiexzfUjhhgtg.f10439Ujhhgtgfeyxiexzf == null) {
                C3339feyxiexzfUjhhgtg.f10439Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(23);
            }
            this.f316Ujhhgtgfeyxiexzf = C3339feyxiexzfUjhhgtg.f10439Ujhhgtgfeyxiexzf;
            mo104Ujhhgtgfeyxiexzf();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0802feyxiexzfUjhhgtg.f3185Ujhhgtgfeyxiexzf, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f309Ujhhgtgfeyxiexzf = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final CharSequence mo106Ujhhgtgfeyxiexzf() {
        InterfaceC0853feyxiexzfUjhhgtg interfaceC0853feyxiexzfUjhhgtg = this.f316Ujhhgtgfeyxiexzf;
        if (interfaceC0853feyxiexzfUjhhgtg != null) {
            return interfaceC0853feyxiexzfUjhhgtg.mo2260Ujhhgtgfeyxiexzf(this);
        }
        CharSequence charSequenceMo106Ujhhgtgfeyxiexzf = super.mo106Ujhhgtgfeyxiexzf();
        String str = this.f309Ujhhgtgfeyxiexzf;
        if (str != null) {
            String str2 = String.format(str, "");
            if (!TextUtils.equals(str2, charSequenceMo106Ujhhgtgfeyxiexzf)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceMo106Ujhhgtgfeyxiexzf;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final Object mo105Ujhhgtgfeyxiexzf(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3052Ujhhgtgfeyxiexzf.m4516Ujhhgtgfeyxiexzf(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
