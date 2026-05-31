package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import p000.AbstractC1375;
import p000.AbstractC1469;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.AbstractC3638;
import p000.C0099;
import p000.C0674;
import p000.C0687;
import p000.C0688;
import p000.InterfaceC0689;
import p000.InterfaceC0690;
import p000.InterfaceC1945;
import p000.ViewGroupOnHierarchyChangeListenerC0691;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends AbstractC1375 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f763;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f764;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public InterfaceC0690 f765;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0674 f766;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int f767;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ViewGroupOnHierarchyChangeListenerC0691 f768;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextM3354 = AbstractC1469.m3354(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextM3354, attributeSet, R.attr.chipGroupStyle);
        this.f4956 = false;
        TypedArray typedArrayObtainStyledAttributes = contextM3354.getTheme().obtainStyledAttributes(attributeSet, AbstractC2521.f7996, 0, 0);
        this.f4954 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f4955 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0674 c0674 = new C0674();
        this.f766 = c0674;
        ViewGroupOnHierarchyChangeListenerC0691 viewGroupOnHierarchyChangeListenerC0691 = new ViewGroupOnHierarchyChangeListenerC0691(this);
        this.f768 = viewGroupOnHierarchyChangeListenerC0691;
        TypedArray typedArrayM4263 = AbstractC2240.m4263(getContext(), attributeSet, AbstractC2521.f7991, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM4263.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM4263.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM4263.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM4263.getBoolean(5, false));
        setSingleSelection(typedArrayM4263.getBoolean(6, false));
        setSelectionRequired(typedArrayM4263.getBoolean(4, false));
        this.f767 = typedArrayM4263.getResourceId(0, -1);
        typedArrayM4263.recycle();
        c0674.f2562 = new C0687(this);
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC0691);
        Field field = AbstractC3638.f11333;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0688);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0688(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0688(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f766.m2159();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f766.m2158(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f763;
    }

    public int getChipSpacingVertical() {
        return this.f764;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f767;
        if (i != -1) {
            C0674 c0674 = this.f766;
            InterfaceC1945 interfaceC1945 = (InterfaceC1945) c0674.f2560.get(Integer.valueOf(i));
            if (interfaceC1945 != null && c0674.m2157(interfaceC1945)) {
                c0674.m2160();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0099.m1230(getRowCount(), this.f4956 ? getVisibleChipCount() : -1, this.f766.f2563 ? 1 : 2).f1112);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f763 != i) {
            this.f763 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f764 != i) {
            this.f764 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC0689 interfaceC0689) {
        if (interfaceC0689 == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C0687(this));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC0690 interfaceC0690) {
        this.f765 = interfaceC0690;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f768.f2643 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f766.f2564 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // p000.AbstractC1375
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        C0674 c0674 = this.f766;
        if (c0674.f2563 != z) {
            c0674.f2563 = z;
            boolean zIsEmpty = c0674.f2561.isEmpty();
            Iterator it = c0674.f2560.values().iterator();
            while (it.hasNext()) {
                c0674.m2161((InterfaceC1945) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            c0674.m2160();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0688(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
