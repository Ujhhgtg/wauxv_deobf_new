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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲁᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2159 extends ViewGroup implements InterfaceC1988 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static final int[] f7146 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final int[] f7147 = {-16842910};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0327 f7148;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ViewOnClickListenerC0939 f7149;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2433 f7150;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final SparseArray f7151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f7152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public AbstractC2157[] f7153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f7154;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f7155;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f7156;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f7157;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ColorStateList f7158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final ColorStateList f7159;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f7160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f7161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f7162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public Drawable f7163;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public ColorStateList f7164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f7165;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final SparseArray f7166;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f7167;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f7168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f7169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f7170;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public int f7171;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int f7172;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public int f7173;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public C2738 f7174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public boolean f7175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public ColorStateList f7176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public C2161 f7177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public MenuC1975 f7178;

    public AbstractC2159(Context context) {
        super(context);
        this.f7150 = new C2433(5);
        this.f7151 = new SparseArray(5);
        this.f7154 = 0;
        this.f7155 = 0;
        this.f7166 = new SparseArray(5);
        this.f7167 = -1;
        this.f7168 = -1;
        this.f7169 = -1;
        this.f7175 = false;
        this.f7159 = m4124();
        if (isInEditMode()) {
            this.f7148 = null;
        } else {
            C0327 c0327 = new C0327();
            this.f7148 = c0327;
            c0327.m1577(0);
            c0327.mo1567(AbstractC3744.m5341(getContext(), me.hd.wauxv.R.attr.motionDurationMedium4, getResources().getInteger(me.hd.wauxv.R.integer.material_motion_duration_long_1)));
            c0327.mo1569(AbstractC3744.m5342(getContext(), me.hd.wauxv.R.attr.motionEasingStandard, AbstractC0172.f1254));
            c0327.m1574(new C2971());
        }
        this.f7149 = new ViewOnClickListenerC0939((C0422) this, 1);
        Field field = AbstractC3638.f11333;
        setImportantForAccessibility(1);
    }

    private AbstractC2157 getNewItem() {
        AbstractC2157 abstractC2157 = (AbstractC2157) this.f7150.mo1458();
        return abstractC2157 == null ? new C0421(getContext()) : abstractC2157;
    }

    private void setBadgeIfNeeded(AbstractC2157 abstractC2157) {
        C0338 c0338;
        int id = abstractC2157.getId();
        if (id == -1 || (c0338 = (C0338) this.f7166.get(id)) == null) {
            return;
        }
        abstractC2157.setBadge(c0338);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f7169;
    }

    public SparseArray<C0338> getBadgeDrawables() {
        return this.f7166;
    }

    public ColorStateList getIconTintList() {
        return this.f7156;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f7176;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f7170;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f7172;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f7173;
    }

    public C2738 getItemActiveIndicatorShapeAppearance() {
        return this.f7174;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f7171;
    }

    public Drawable getItemBackground() {
        AbstractC2157[] abstractC2157Arr = this.f7153;
        return (abstractC2157Arr == null || abstractC2157Arr.length <= 0) ? this.f7163 : abstractC2157Arr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f7165;
    }

    public int getItemIconSize() {
        return this.f7157;
    }

    public int getItemPaddingBottom() {
        return this.f7168;
    }

    public int getItemPaddingTop() {
        return this.f7167;
    }

    public ColorStateList getItemRippleColor() {
        return this.f7164;
    }

    public int getItemTextAppearanceActive() {
        return this.f7161;
    }

    public int getItemTextAppearanceInactive() {
        return this.f7160;
    }

    public ColorStateList getItemTextColor() {
        return this.f7158;
    }

    public int getLabelVisibilityMode() {
        return this.f7152;
    }

    public MenuC1975 getMenu() {
        return this.f7178;
    }

    public int getSelectedItemId() {
        return this.f7154;
    }

    public int getSelectedItemPosition() {
        return this.f7155;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0099.m1230(1, this.f7178.m3958().size(), 1).f1112);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f7169 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f7156 = colorStateList;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f7176 = colorStateList;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorDrawable(m4125());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f7170 = z;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f7172 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f7173 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f7175 = z;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C2738 c2738) {
        this.f7174 = c2738;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorDrawable(m4125());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f7171 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f7163 = drawable;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f7165 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f7157 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f7168 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f7167 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7164 = colorStateList;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f7161 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f7158;
                if (colorStateList != null) {
                    abstractC2157.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f7162 = z;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f7160 = i;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f7158;
                if (colorStateList != null) {
                    abstractC2157.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7158 = colorStateList;
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                abstractC2157.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f7152 = i;
    }

    public void setPresenter(C2161 c2161) {
        this.f7177 = c2161;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4123() {
        removeAllViews();
        AbstractC2157[] abstractC2157Arr = this.f7153;
        if (abstractC2157Arr != null) {
            for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                if (abstractC2157 != null) {
                    this.f7150.mo1457(abstractC2157);
                    ImageView imageView = abstractC2157.f7125;
                    if (abstractC2157.f7143 != null) {
                        if (imageView != null) {
                            abstractC2157.setClipChildren(true);
                            abstractC2157.setClipToPadding(true);
                            C0338 c0338 = abstractC2157.f7143;
                            if (c0338 != null) {
                                if (c0338.m1583() != null) {
                                    c0338.m1583().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c0338);
                                }
                            }
                        }
                        abstractC2157.f7143 = null;
                    }
                    abstractC2157.f7131 = null;
                    abstractC2157.f7137 = 0.0f;
                    abstractC2157.f7112 = false;
                }
            }
        }
        if (this.f7178.f6517.size() == 0) {
            this.f7154 = 0;
            this.f7155 = 0;
            this.f7153 = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f7178.f6517.size(); i++) {
            hashSet.add(Integer.valueOf(this.f7178.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f7166;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.f7153 = new AbstractC2157[this.f7178.f6517.size()];
        int i3 = this.f7152;
        boolean z = i3 != -1 ? i3 == 0 : this.f7178.m3958().size() > 3;
        for (int i4 = 0; i4 < this.f7178.f6517.size(); i4++) {
            this.f7177.f7182 = true;
            this.f7178.getItem(i4).setCheckable(true);
            this.f7177.f7182 = false;
            AbstractC2157 newItem = getNewItem();
            this.f7153[i4] = newItem;
            newItem.setIconTintList(this.f7156);
            newItem.setIconSize(this.f7157);
            newItem.setTextColor(this.f7159);
            newItem.setTextAppearanceInactive(this.f7160);
            newItem.setTextAppearanceActive(this.f7161);
            newItem.setTextAppearanceActiveBoldEnabled(this.f7162);
            newItem.setTextColor(this.f7158);
            int i5 = this.f7167;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.f7168;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.f7169;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.f7171);
            newItem.setActiveIndicatorHeight(this.f7172);
            newItem.setActiveIndicatorMarginHorizontal(this.f7173);
            newItem.setActiveIndicatorDrawable(m4125());
            newItem.setActiveIndicatorResizeable(this.f7175);
            newItem.setActiveIndicatorEnabled(this.f7170);
            Drawable drawable = this.f7163;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f7165);
            }
            newItem.setItemRippleColor(this.f7164);
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.f7152);
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) this.f7178.getItem(i4);
            newItem.mo2(menuItemC1977);
            newItem.setItemPosition(i4);
            int i8 = menuItemC1977.f6532;
            newItem.setOnTouchListener((View.OnTouchListener) this.f7151.get(i8));
            newItem.setOnClickListener(this.f7149);
            int i9 = this.f7154;
            if (i9 != 0 && i8 == i9) {
                this.f7155 = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f7178.f6517.size() - 1, this.f7155);
        this.f7155 = iMin;
        this.f7178.getItem(iMin).setChecked(true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ColorStateList m4124() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM3333 = AbstractC1469.m3333(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(me.hd.wauxv.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListM3333.getDefaultColor();
        int[] iArr = f7146;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f7147;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListM3333.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1948 m4125() {
        if (this.f7174 == null || this.f7176 == null) {
            return null;
        }
        C1948 c1948 = new C1948(this.f7174);
        c1948.m3914(this.f7176);
        return c1948;
    }
}
