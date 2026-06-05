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
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.AbstractC3619feyxiexzfUjhhgtg;
import p000.C2797Ujhhgtgfeyxiexzf;
import p000.C2798Ujhhgtgfeyxiexzf;
import p000.C2912Ujhhgtgfeyxiexzf;
import p000.C2962feyxiexzfUjhhgtg;
import p000.InterfaceC0228Ujhhgtgfeyxiexzf;
import p000.InterfaceC2799Ujhhgtgfeyxiexzf;
import p000.InterfaceC2800Ujhhgtgfeyxiexzf;
import p000.ViewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends AbstractC3619feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f777Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f778Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public InterfaceC2799Ujhhgtgfeyxiexzf f779Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2912Ujhhgtgfeyxiexzf f780Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f781Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ViewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf f782Ujhhgtgfeyxiexzf;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextM5250Ujhhgtgfeyxiexzf = AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextM5250Ujhhgtgfeyxiexzf, attributeSet, R.attr.chipGroupStyle);
        this.f11309Ujhhgtgfeyxiexzf = false;
        TypedArray typedArrayObtainStyledAttributes = contextM5250Ujhhgtgfeyxiexzf.getTheme().obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3127Ujhhgtgfeyxiexzf, 0, 0);
        this.f11307Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f11308Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        C2912Ujhhgtgfeyxiexzf c2912Ujhhgtgfeyxiexzf = new C2912Ujhhgtgfeyxiexzf();
        this.f780Ujhhgtgfeyxiexzf = c2912Ujhhgtgfeyxiexzf;
        ViewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf viewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf = new ViewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf(this);
        this.f782Ujhhgtgfeyxiexzf = viewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf;
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(getContext(), attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3122Ujhhgtgfeyxiexzf, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(5, false));
        setSingleSelection(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(6, false));
        setSelectionRequired(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(4, false));
        this.f781Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(0, -1);
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
        c2912Ujhhgtgfeyxiexzf.f9193Ujhhgtgfeyxiexzf = new C2798Ujhhgtgfeyxiexzf(this);
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
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
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2797Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2797Ujhhgtgfeyxiexzf(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2797Ujhhgtgfeyxiexzf(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f780Ujhhgtgfeyxiexzf.m4282Ujhhgtgfeyxiexzf();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f780Ujhhgtgfeyxiexzf.m4281Ujhhgtgfeyxiexzf(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f777Ujhhgtgfeyxiexzf;
    }

    public int getChipSpacingVertical() {
        return this.f778Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f781Ujhhgtgfeyxiexzf;
        if (i != -1) {
            C2912Ujhhgtgfeyxiexzf c2912Ujhhgtgfeyxiexzf = this.f780Ujhhgtgfeyxiexzf;
            InterfaceC0228Ujhhgtgfeyxiexzf interfaceC0228Ujhhgtgfeyxiexzf = (InterfaceC0228Ujhhgtgfeyxiexzf) c2912Ujhhgtgfeyxiexzf.f9191Ujhhgtgfeyxiexzf.get(Integer.valueOf(i));
            if (interfaceC0228Ujhhgtgfeyxiexzf != null && c2912Ujhhgtgfeyxiexzf.m4280Ujhhgtgfeyxiexzf(interfaceC0228Ujhhgtgfeyxiexzf)) {
                c2912Ujhhgtgfeyxiexzf.m4283Ujhhgtgfeyxiexzf();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2962feyxiexzfUjhhgtg.m4428Ujhhgtgfeyxiexzf(getRowCount(), this.f11309Ujhhgtgfeyxiexzf ? getVisibleChipCount() : -1, this.f780Ujhhgtgfeyxiexzf.f9194Ujhhgtgfeyxiexzf ? 1 : 2).f9271Ujhhgtgfeyxiexzf);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f777Ujhhgtgfeyxiexzf != i) {
            this.f777Ujhhgtgfeyxiexzf = i;
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
        if (this.f778Ujhhgtgfeyxiexzf != i) {
            this.f778Ujhhgtgfeyxiexzf = i;
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
    public void setOnCheckedChangeListener(InterfaceC2800Ujhhgtgfeyxiexzf interfaceC2800Ujhhgtgfeyxiexzf) {
        if (interfaceC2800Ujhhgtgfeyxiexzf == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C2798Ujhhgtgfeyxiexzf(this));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC2799Ujhhgtgfeyxiexzf interfaceC2799Ujhhgtgfeyxiexzf) {
        this.f779Ujhhgtgfeyxiexzf = interfaceC2799Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f782Ujhhgtgfeyxiexzf.f8928Ujhhgtgfeyxiexzf = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f780Ujhhgtgfeyxiexzf.f9195Ujhhgtgfeyxiexzf = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // p000.AbstractC3619feyxiexzfUjhhgtg
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        C2912Ujhhgtgfeyxiexzf c2912Ujhhgtgfeyxiexzf = this.f780Ujhhgtgfeyxiexzf;
        if (c2912Ujhhgtgfeyxiexzf.f9194Ujhhgtgfeyxiexzf != z) {
            c2912Ujhhgtgfeyxiexzf.f9194Ujhhgtgfeyxiexzf = z;
            boolean zIsEmpty = c2912Ujhhgtgfeyxiexzf.f9192Ujhhgtgfeyxiexzf.isEmpty();
            Iterator it = c2912Ujhhgtgfeyxiexzf.f9191Ujhhgtgfeyxiexzf.values().iterator();
            while (it.hasNext()) {
                c2912Ujhhgtgfeyxiexzf.m4284Ujhhgtgfeyxiexzf((InterfaceC0228Ujhhgtgfeyxiexzf) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            c2912Ujhhgtgfeyxiexzf.m4283Ujhhgtgfeyxiexzf();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2797Ujhhgtgfeyxiexzf(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
