package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2677 {

    public AbstractC2207 f8628 = new C2605();

    public AbstractC2207 f8629 = new C2605();

    public AbstractC2207 f8630 = new C2605();

    public AbstractC2207 f8631 = new C2605();

    public InterfaceC0874 f8632 = new C0053(0.0f);

    public InterfaceC0874 f8633 = new C0053(0.0f);

    public InterfaceC0874 f8634 = new C0053(0.0f);

    public InterfaceC0874 f8635 = new C0053(0.0f);

    public C1133 f8636 = new C1133();

    public C1133 f8637 = new C1133();

    public C1133 f8638 = new C1133();

    public C1133 f8639 = new C1133();

    public static C2021 m4687(Context context, int i, int i2, C0053 c0053) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC2467.f7862);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0874 interfaceC0874M4689 = m4689(typedArrayObtainStyledAttributes, 5, c0053);
            InterfaceC0874 interfaceC0874M46810 = m4689(typedArrayObtainStyledAttributes, 8, interfaceC0874M4689);
            InterfaceC0874 interfaceC0874M46811 = m4689(typedArrayObtainStyledAttributes, 9, interfaceC0874M4689);
            InterfaceC0874 interfaceC0874M46812 = m4689(typedArrayObtainStyledAttributes, 7, interfaceC0874M4689);
            InterfaceC0874 interfaceC0874M46813 = m4689(typedArrayObtainStyledAttributes, 6, interfaceC0874M4689);
            C2021 c2021 = new C2021();
            c2021.f6762 = AbstractC3471.m5071(i4);
            c2021.f6766 = interfaceC0874M46810;
            c2021.f6763 = AbstractC3471.m5071(i5);
            c2021.f6767 = interfaceC0874M46811;
            c2021.f6764 = AbstractC3471.m5071(i6);
            c2021.f6768 = interfaceC0874M46812;
            c2021.f6765 = AbstractC3471.m5071(i7);
            c2021.f6769 = interfaceC0874M46813;
            return c2021;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static C2021 m4688(Context context, AttributeSet attributeSet, int i, int i2) {
        C0053 c0053 = new C0053(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7853, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m4687(context, resourceId, resourceId2, c0053);
    }

    public static InterfaceC0874 m4689(TypedArray typedArray, int i, InterfaceC0874 interfaceC0874) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C0053(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C2530(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0874;
    }

    public final boolean m4690(RectF rectF) {
        boolean z = this.f8639.getClass().equals(C1133.class) && this.f8637.getClass().equals(C1133.class) && this.f8636.getClass().equals(C1133.class) && this.f8638.getClass().equals(C1133.class);
        float fMo916 = this.f8632.mo916(rectF);
        return z && ((this.f8633.mo916(rectF) > fMo916 ? 1 : (this.f8633.mo916(rectF) == fMo916 ? 0 : -1)) == 0 && (this.f8635.mo916(rectF) > fMo916 ? 1 : (this.f8635.mo916(rectF) == fMo916 ? 0 : -1)) == 0 && (this.f8634.mo916(rectF) > fMo916 ? 1 : (this.f8634.mo916(rectF) == fMo916 ? 0 : -1)) == 0) && ((this.f8629 instanceof C2605) && (this.f8628 instanceof C2605) && (this.f8630 instanceof C2605) && (this.f8631 instanceof C2605));
    }

    public final C2021 m4691() {
        C2021 c2021 = new C2021();
        c2021.f6762 = this.f8628;
        c2021.f6763 = this.f8629;
        c2021.f6764 = this.f8630;
        c2021.f6765 = this.f8631;
        c2021.f6766 = this.f8632;
        c2021.f6767 = this.f8633;
        c2021.f6768 = this.f8634;
        c2021.f6769 = this.f8635;
        c2021.f6770 = this.f8636;
        c2021.f6771 = this.f8637;
        c2021.f6772 = this.f8638;
        c2021.f6773 = this.f8639;
        return c2021;
    }
}
