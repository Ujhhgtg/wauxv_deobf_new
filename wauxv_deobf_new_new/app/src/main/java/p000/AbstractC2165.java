package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲇᲁᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2165 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2158 f7185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0422 f7186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2161 f7187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2920 f7188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC2163 f7189;

    public AbstractC2165(Context context) {
        super(AbstractC1469.m3354(context, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), null, R.attr.bottomNavigationStyle);
        C2161 c2161 = new C2161();
        c2161.f7182 = false;
        this.f7187 = c2161;
        Context context2 = getContext();
        C0253 c0253M4264 = AbstractC2240.m4264(context2, null, AbstractC2521.f8009, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        C2158 c2158 = new C2158(context2, getClass(), getMaxItemCount());
        this.f7185 = c2158;
        C0422 c0422 = new C0422(context2);
        this.f7186 = c0422;
        c2161.f7181 = c0422;
        c2161.f7183 = 1;
        c0422.setPresenter(c2161);
        c2158.m3949(c2161, c2158.f6512);
        getContext();
        c2161.f7181.f7178 = c2158;
        TypedArray typedArray = (TypedArray) c0253M4264.f1478;
        if (typedArray.hasValue(6)) {
            c0422.setIconTintList(c0253M4264.m1465(6));
        } else {
            c0422.setIconTintList(c0422.m4124());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(c0253M4264.m1465(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListM4170 = AbstractC2234.m4170(background);
        if (background == null || colorStateListM4170 != null) {
            C1948 c1948 = new C1948(C2738.m4725(context2, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).m4722());
            if (colorStateListM4170 != null) {
                c1948.m3914(colorStateListM4170);
            }
            c1948.m3912(context2);
            Field field = AbstractC3638.f11333;
            setBackground(c1948);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(AbstractC1471.m3387(context2, c0253M4264, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            c0422.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC1471.m3387(context2, c0253M4264, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC2521.f8008);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(C2738.m4724(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new C0060(0)).m4722());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            c2161.f7182 = true;
            getMenuInflater().inflate(resourceId3, c2158);
            c2161.f7182 = false;
            c2161.mo1283(true);
        }
        c0253M4264.m1475();
        addView(c0422);
        c2158.f6516 = new C1681(this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f7188 == null) {
            this.f7188 = new C2920(getContext());
        }
        return this.f7188;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f7186.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f7186.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f7186.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f7186.getItemActiveIndicatorMarginHorizontal();
    }

    public C2738 getItemActiveIndicatorShapeAppearance() {
        return this.f7186.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f7186.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f7186.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f7186.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f7186.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f7186.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f7186.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f7186.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f7186.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f7186.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f7186.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f7186.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f7186.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f7185;
    }

    public InterfaceC1988 getMenuView() {
        return this.f7186;
    }

    public C2161 getPresenter() {
        return this.f7187;
    }

    public int getSelectedItemId() {
        return this.f7186.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1948) {
            AbstractC1586.m3489(this, (C1948) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2164)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2164 c2164 = (C2164) parcelable;
        super.onRestoreInstanceState(c2164.f1051);
        Bundle bundle = c2164.f7184;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7185.f6529;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
            if (interfaceC1986 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = interfaceC1986.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC1986.mo1289(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1294;
        C2164 c2164 = new C2164(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c2164.f7184 = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7185.f6529;
        if (copyOnWriteArrayList.isEmpty()) {
            return c2164;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1986 interfaceC1986 = (InterfaceC1986) weakReference.get();
            if (interfaceC1986 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = interfaceC1986.getId();
                if (id > 0 && (parcelableMo1294 = interfaceC1986.mo1294()) != null) {
                    sparseArray.put(id, parcelableMo1294);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return c2164;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f7186.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C1948) {
            ((C1948) background).m3913(f);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f7186.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f7186.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f7186.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f7186.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C2738 c2738) {
        this.f7186.setItemActiveIndicatorShapeAppearance(c2738);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f7186.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f7186.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f7186.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f7186.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f7186.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f7186.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f7186.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7186.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f7186.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f7186.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f7186.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7186.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C0422 c0422 = this.f7186;
        if (c0422.getLabelVisibilityMode() != i) {
            c0422.setLabelVisibilityMode(i);
            this.f7187.mo1283(false);
        }
    }

    public void setOnItemSelectedListener(InterfaceC2163 interfaceC2163) {
        this.f7189 = interfaceC2163;
    }

    public void setSelectedItemId(int i) {
        C2158 c2158 = this.f7185;
        MenuItem menuItemFindItem = c2158.findItem(i);
        if (menuItemFindItem == null || c2158.m3963(menuItemFindItem, this.f7187, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(InterfaceC2162 interfaceC2162) {
    }
}
