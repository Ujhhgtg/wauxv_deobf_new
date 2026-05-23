package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0790 {

    public int f3051;

    public int f3052;

    public float f3053;

    public float f3054;

    public final void m2297(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2461.f7814);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f3053 = typedArrayObtainStyledAttributes.getFloat(1, this.f3053);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(0, this.f3051);
                this.f3051 = i2;
                this.f3051 = C0792.f3068[i2];
            } else if (index == 4) {
                this.f3052 = typedArrayObtainStyledAttributes.getInt(4, this.f3052);
            } else if (index == 3) {
                this.f3054 = typedArrayObtainStyledAttributes.getFloat(3, this.f3054);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
