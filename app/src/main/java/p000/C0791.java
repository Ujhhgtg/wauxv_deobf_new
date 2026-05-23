package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0791 {

    public static final SparseIntArray f3055;

    public float f3056;

    public float f3057;

    public float f3058;

    public float f3059;

    public float f3060;

    public float f3061;

    public float f3062;

    public float f3063;

    public float f3064;

    public float f3065;

    public boolean f3066;

    public float f3067;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3055 = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void m2298(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2461.f7816);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f3055.get(index)) {
                case 1:
                    this.f3056 = typedArrayObtainStyledAttributes.getFloat(index, this.f3056);
                    break;
                case 2:
                    this.f3057 = typedArrayObtainStyledAttributes.getFloat(index, this.f3057);
                    break;
                case 3:
                    this.f3058 = typedArrayObtainStyledAttributes.getFloat(index, this.f3058);
                    break;
                case 4:
                    this.f3059 = typedArrayObtainStyledAttributes.getFloat(index, this.f3059);
                    break;
                case 5:
                    this.f3060 = typedArrayObtainStyledAttributes.getFloat(index, this.f3060);
                    break;
                case 6:
                    this.f3061 = typedArrayObtainStyledAttributes.getDimension(index, this.f3061);
                    break;
                case 7:
                    this.f3062 = typedArrayObtainStyledAttributes.getDimension(index, this.f3062);
                    break;
                case 8:
                    this.f3063 = typedArrayObtainStyledAttributes.getDimension(index, this.f3063);
                    break;
                case 9:
                    this.f3064 = typedArrayObtainStyledAttributes.getDimension(index, this.f3064);
                    break;
                case 10:
                    this.f3065 = typedArrayObtainStyledAttributes.getDimension(index, this.f3065);
                    break;
                case 11:
                    this.f3066 = true;
                    this.f3067 = typedArrayObtainStyledAttributes.getDimension(index, this.f3067);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
