package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import me.hd.wauxv.R;
import p000.AbstractC1458;
import p000.AbstractC2465;
import p000.C0373;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM3156 = AbstractC1458.m3156(context, R.attr.editTextPreferenceStyle, 16842898);
        super(context, attributeSet, iM3156);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2465.f7829, iM3156, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C0373.f1755 == null) {
                C0373.f1755 = new C0373(22);
            }
            this.f315 = C0373.f1755;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object mo105(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
