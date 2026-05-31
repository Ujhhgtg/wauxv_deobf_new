package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲈᛸᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2738 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC1471 f8798 = new C2666();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public AbstractC1471 f8799 = new C2666();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public AbstractC1471 f8800 = new C2666();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public AbstractC1471 f8801 = new C2666();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC0873 f8802 = new C0060(0.0f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public InterfaceC0873 f8803 = new C0060(0.0f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC0873 f8804 = new C0060(0.0f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC0873 f8805 = new C0060(0.0f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1139 f8806 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1139 f8807 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1139 f8808 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C1139 f8809 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2737 m4724(Context context, int i, int i2, C0060 c0060) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC2521.f8012);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0873 interfaceC0873M4726 = m4726(typedArrayObtainStyledAttributes, 5, c0060);
            InterfaceC0873 interfaceC0873M4727 = m4726(typedArrayObtainStyledAttributes, 8, interfaceC0873M4726);
            InterfaceC0873 interfaceC0873M4728 = m4726(typedArrayObtainStyledAttributes, 9, interfaceC0873M4726);
            InterfaceC0873 interfaceC0873M4729 = m4726(typedArrayObtainStyledAttributes, 7, interfaceC0873M4726);
            InterfaceC0873 interfaceC0873M47210 = m4726(typedArrayObtainStyledAttributes, 6, interfaceC0873M4726);
            C2737 c2737 = new C2737();
            c2737.f8786 = AbstractC1586.m3474(i4);
            c2737.f8790 = interfaceC0873M4727;
            c2737.f8787 = AbstractC1586.m3474(i5);
            c2737.f8791 = interfaceC0873M4728;
            c2737.f8788 = AbstractC1586.m3474(i6);
            c2737.f8792 = interfaceC0873M4729;
            c2737.f8789 = AbstractC1586.m3474(i7);
            c2737.f8793 = interfaceC0873M47210;
            return c2737;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2737 m4725(Context context, AttributeSet attributeSet, int i, int i2) {
        C0060 c0060 = new C0060(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f8003, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m4724(context, resourceId, resourceId2, c0060);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static InterfaceC0873 m4726(TypedArray typedArray, int i, InterfaceC0873 interfaceC0873) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C0060(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C2586(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0873;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m4727(RectF rectF) {
        boolean z = this.f8809.getClass().equals(C1139.class) && this.f8807.getClass().equals(C1139.class) && this.f8806.getClass().equals(C1139.class) && this.f8808.getClass().equals(C1139.class);
        float fMo1060 = this.f8802.mo1060(rectF);
        return z && ((this.f8803.mo1060(rectF) > fMo1060 ? 1 : (this.f8803.mo1060(rectF) == fMo1060 ? 0 : -1)) == 0 && (this.f8805.mo1060(rectF) > fMo1060 ? 1 : (this.f8805.mo1060(rectF) == fMo1060 ? 0 : -1)) == 0 && (this.f8804.mo1060(rectF) > fMo1060 ? 1 : (this.f8804.mo1060(rectF) == fMo1060 ? 0 : -1)) == 0) && ((this.f8799 instanceof C2666) && (this.f8798 instanceof C2666) && (this.f8800 instanceof C2666) && (this.f8801 instanceof C2666));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2737 m4728() {
        C2737 c2737 = new C2737();
        c2737.f8786 = this.f8798;
        c2737.f8787 = this.f8799;
        c2737.f8788 = this.f8800;
        c2737.f8789 = this.f8801;
        c2737.f8790 = this.f8802;
        c2737.f8791 = this.f8803;
        c2737.f8792 = this.f8804;
        c2737.f8793 = this.f8805;
        c2737.f8794 = this.f8806;
        c2737.f8795 = this.f8807;
        c2737.f8796 = this.f8808;
        c2737.f8797 = this.f8809;
        return c2737;
    }
}
