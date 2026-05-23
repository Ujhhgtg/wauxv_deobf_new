package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.lang.reflect.Field;
import java.util.HashSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2125 extends ViewGroup implements InterfaceC1957 {

    public static final int[] f7022 = {16842912};

    public static final int[] f7023 = {-16842910};

    public final C0315 f7024;

    public final ViewOnClickListenerC0940 f7025;

    public final C2380 f7026;

    public final SparseArray f7027;

    public int f7028;

    public AbstractC2123[] f7029;

    public int f7030;

    public int f7031;

    public ColorStateList f7032;

    public int f7033;

    public ColorStateList f7034;

    public final ColorStateList f7035;

    public int f7036;

    public int f7037;

    public boolean f7038;

    public Drawable f7039;

    public ColorStateList f7040;

    public int f7041;

    public final SparseArray f7042;

    public int f7043;

    public int f7044;

    public int f7045;

    public boolean f7046;

    public int f7047;

    public int f7048;

    public int f7049;

    public C2677 f7050;

    public boolean f7051;

    public ColorStateList f7052;

    public C2127 f7053;

    public MenuC1944 f7054;

    public AbstractC2125(Context context) {
        super(context);
        this.f7026 = new C2380(5);
        this.f7027 = new SparseArray(5);
        this.f7030 = 0;
        this.f7031 = 0;
        this.f7042 = new SparseArray(5);
        this.f7043 = -1;
        this.f7044 = -1;
        this.f7045 = -1;
        this.f7051 = false;
        this.f7035 = m3940();
        if (isInEditMode()) {
            this.f7024 = null;
        } else {
            C0315 c0315 = new C0315();
            this.f7024 = c0315;
            c0315.m1431(0);
            c0315.mo1421(AbstractC1574.m3308(getContext(), me.hd.wauxv.R.attr.motionDurationMedium4, getResources().getInteger(me.hd.wauxv.R.integer.material_motion_duration_long_1)));
            c0315.mo1423(AbstractC1574.m3309(getContext(), me.hd.wauxv.R.attr.motionEasingStandard, AbstractC0164.f1186));
            c0315.m1428(new C2912());
        }
        this.f7025 = new ViewOnClickListenerC0940(1, (C0447) this);
        Field field = AbstractC3578.f11184;
        setImportantForAccessibility(1);
    }

    private AbstractC2123 getNewItem() {
        AbstractC2123 abstractC2123 = (AbstractC2123) this.f7026.mo1312();
        return abstractC2123 == null ? new C0446(getContext()) : abstractC2123;
    }

    private void setBadgeIfNeeded(AbstractC2123 abstractC2123) {
        C0363 c0363;
        int id = abstractC2123.getId();
        if (id == -1 || (c0363 = (C0363) this.f7042.get(id)) == null) {
            return;
        }
        abstractC2123.setBadge(c0363);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f7045;
    }

    public SparseArray<C0363> getBadgeDrawables() {
        return this.f7042;
    }

    public ColorStateList getIconTintList() {
        return this.f7032;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f7052;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f7046;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f7048;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f7049;
    }

    public C2677 getItemActiveIndicatorShapeAppearance() {
        return this.f7050;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f7047;
    }

    public Drawable getItemBackground() {
        AbstractC2123[] abstractC2123Arr = this.f7029;
        return (abstractC2123Arr == null || abstractC2123Arr.length <= 0) ? this.f7039 : abstractC2123Arr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f7041;
    }

    public int getItemIconSize() {
        return this.f7033;
    }

    public int getItemPaddingBottom() {
        return this.f7044;
    }

    public int getItemPaddingTop() {
        return this.f7043;
    }

    public ColorStateList getItemRippleColor() {
        return this.f7040;
    }

    public int getItemTextAppearanceActive() {
        return this.f7037;
    }

    public int getItemTextAppearanceInactive() {
        return this.f7036;
    }

    public ColorStateList getItemTextColor() {
        return this.f7034;
    }

    public int getLabelVisibilityMode() {
        return this.f7028;
    }

    public MenuC1944 getMenu() {
        return this.f7054;
    }

    public int getSelectedItemId() {
        return this.f7030;
    }

    public int getSelectedItemPosition() {
        return this.f7031;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f7054.m3764().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f7045 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f7032 = colorStateList;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f7052 = colorStateList;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorDrawable(m3941());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f7046 = z;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f7048 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f7049 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f7051 = z;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C2677 c2677) {
        this.f7050 = c2677;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorDrawable(m3941());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f7047 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f7039 = drawable;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f7041 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f7033 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f7044 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f7043 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7040 = colorStateList;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f7037 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f7034;
                if (colorStateList != null) {
                    abstractC2123.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f7038 = z;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f7036 = i;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f7034;
                if (colorStateList != null) {
                    abstractC2123.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7034 = colorStateList;
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                abstractC2123.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f7028 = i;
    }

    public void setPresenter(C2127 c2127) {
        this.f7053 = c2127;
    }

    public final void m3939() {
        removeAllViews();
        AbstractC2123[] abstractC2123Arr = this.f7029;
        if (abstractC2123Arr != null) {
            for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                if (abstractC2123 != null) {
                    this.f7026.mo1311(abstractC2123);
                    ImageView imageView = abstractC2123.f7001;
                    if (abstractC2123.f7019 != null) {
                        if (imageView != null) {
                            abstractC2123.setClipChildren(true);
                            abstractC2123.setClipToPadding(true);
                            C0363 c0363 = abstractC2123.f7019;
                            if (c0363 != null) {
                                if (c0363.m1478() != null) {
                                    c0363.m1478().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c0363);
                                }
                            }
                        }
                        abstractC2123.f7019 = null;
                    }
                    abstractC2123.f7007 = null;
                    abstractC2123.f7013 = 0.0f;
                    abstractC2123.f6988 = false;
                }
            }
        }
        if (this.f7054.f6412.size() == 0) {
            this.f7030 = 0;
            this.f7031 = 0;
            this.f7029 = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f7054.f6412.size(); i++) {
            hashSet.add(Integer.valueOf(this.f7054.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f7042;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.f7029 = new AbstractC2123[this.f7054.f6412.size()];
        int i3 = this.f7028;
        boolean z = i3 != -1 ? i3 == 0 : this.f7054.m3764().size() > 3;
        for (int i4 = 0; i4 < this.f7054.f6412.size(); i4++) {
            this.f7053.f7058 = true;
            this.f7054.getItem(i4).setCheckable(true);
            this.f7053.f7058 = false;
            AbstractC2123 newItem = getNewItem();
            this.f7029[i4] = newItem;
            newItem.setIconTintList(this.f7032);
            newItem.setIconSize(this.f7033);
            newItem.setTextColor(this.f7035);
            newItem.setTextAppearanceInactive(this.f7036);
            newItem.setTextAppearanceActive(this.f7037);
            newItem.setTextAppearanceActiveBoldEnabled(this.f7038);
            newItem.setTextColor(this.f7034);
            int i5 = this.f7043;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.f7044;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.f7045;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.f7047);
            newItem.setActiveIndicatorHeight(this.f7048);
            newItem.setActiveIndicatorMarginHorizontal(this.f7049);
            newItem.setActiveIndicatorDrawable(m3941());
            newItem.setActiveIndicatorResizeable(this.f7051);
            newItem.setActiveIndicatorEnabled(this.f7046);
            Drawable drawable = this.f7039;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f7041);
            }
            newItem.setItemRippleColor(this.f7040);
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.f7028);
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) this.f7054.getItem(i4);
            newItem.mo2(menuItemC1946);
            newItem.setItemPosition(i4);
            int i8 = menuItemC1946.f6427;
            newItem.setOnTouchListener((View.OnTouchListener) this.f7027.get(i8));
            newItem.setOnClickListener(this.f7025);
            int i9 = this.f7030;
            if (i9 != 0 && i8 == i9) {
                this.f7031 = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f7054.f6412.size() - 1, this.f7031);
        this.f7031 = iMin;
        this.f7054.getItem(iMin).setChecked(true);
    }

    public final ColorStateList m3940() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM4030 = AbstractC2203.m4030(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(me.hd.wauxv.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListM4030.getDefaultColor();
        int[] iArr = f7022;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f7023;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListM4030.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public final C1917 m3941() {
        if (this.f7050 == null || this.f7052 == null) {
            return null;
        }
        C1917 c1917 = new C1917(this.f7050);
        c1917.m3716(this.f7052);
        return c1917;
    }
}
