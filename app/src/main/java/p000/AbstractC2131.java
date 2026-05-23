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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲇᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2131 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2124 f7061;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0447 f7062;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2127 f7063;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2860 f7064;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC2129 f7065;

    public AbstractC2131(Context context) {
        super(AbstractC2665.m4673(context, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), null, R.attr.bottomNavigationStyle);
        C2127 c2127 = new C2127();
        c2127.f7058 = false;
        this.f7063 = c2127;
        Context context2 = getContext();
        C0243 c0243M5083 = AbstractC3471.m5083(context2, null, AbstractC2467.f7859, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        C2124 c2124 = new C2124(context2, getClass(), getMaxItemCount());
        this.f7061 = c2124;
        C0447 c0447 = new C0447(context2);
        this.f7062 = c0447;
        c2127.f7057 = c0447;
        c2127.f7059 = 1;
        c0447.setPresenter(c2127);
        c2124.m3755(c2127, c2124.f6407);
        getContext();
        c2127.f7057.f7054 = c2124;
        TypedArray typedArray = (TypedArray) c0243M5083.f1404;
        if (typedArray.hasValue(6)) {
            c0447.setIconTintList(c0243M5083.m1319(6));
        } else {
            c0447.setIconTintList(c0447.m3940());
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
            setItemTextColor(c0243M5083.m1319(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListM5075 = AbstractC3471.m5075(background);
        if (background == null || colorStateListM5075 != null) {
            C1917 c1917 = new C1917(C2677.m4688(context2, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).m3876());
            if (colorStateListM5075 != null) {
                c1917.m3716(colorStateListM5075);
            }
            c1917.m3714(context2);
            Field field = AbstractC3578.f11184;
            setBackground(c1917);
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
        getBackground().mutate().setTintList(AbstractC3453.m4994(context2, c0243M5083, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            c0447.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC3453.m4994(context2, c0243M5083, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC2467.f7858);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(C2677.m4687(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new C0053(0)).m3876());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            c2127.f7058 = true;
            getMenuInflater().inflate(resourceId3, c2124);
            c2127.f7058 = false;
            c2127.mo1137(true);
        }
        c0243M5083.m1329();
        addView(c0447);
        c2124.f6411 = new C1744(this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f7064 == null) {
            this.f7064 = new C2860(getContext());
        }
        return this.f7064;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f7062.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f7062.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f7062.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f7062.getItemActiveIndicatorMarginHorizontal();
    }

    public C2677 getItemActiveIndicatorShapeAppearance() {
        return this.f7062.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f7062.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f7062.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f7062.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f7062.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f7062.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f7062.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f7062.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f7062.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f7062.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f7062.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f7062.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f7062.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f7061;
    }

    public InterfaceC1957 getMenuView() {
        return this.f7062;
    }

    public C2127 getPresenter() {
        return this.f7063;
    }

    public int getSelectedItemId() {
        return this.f7062.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1917) {
            AbstractC3471.m5086(this, (C1917) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2130)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2130 c2130 = (C2130) parcelable;
        super.onRestoreInstanceState(c2130.f986);
        Bundle bundle = c2130.f7060;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7061.f6424;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
            if (interfaceC1955 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = interfaceC1955.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC1955.mo1143(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1148;
        C2130 c2130 = new C2130(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c2130.f7060 = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7061.f6424;
        if (copyOnWriteArrayList.isEmpty()) {
            return c2130;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1955 interfaceC1955 = (InterfaceC1955) weakReference.get();
            if (interfaceC1955 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = interfaceC1955.getId();
                if (id > 0 && (parcelableMo1148 = interfaceC1955.mo1148()) != null) {
                    sparseArray.put(id, parcelableMo1148);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return c2130;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f7062.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C1917) {
            ((C1917) background).m3715(f);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f7062.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f7062.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f7062.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f7062.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C2677 c2677) {
        this.f7062.setItemActiveIndicatorShapeAppearance(c2677);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f7062.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f7062.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f7062.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f7062.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f7062.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f7062.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f7062.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7062.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f7062.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f7062.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f7062.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7062.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C0447 c0447 = this.f7062;
        if (c0447.getLabelVisibilityMode() != i) {
            c0447.setLabelVisibilityMode(i);
            this.f7063.mo1137(false);
        }
    }

    public void setOnItemSelectedListener(InterfaceC2129 interfaceC2129) {
        this.f7065 = interfaceC2129;
    }

    public void setSelectedItemId(int i) {
        C2124 c2124 = this.f7061;
        MenuItem menuItemFindItem = c2124.findItem(i);
        if (menuItemFindItem == null || c2124.m3769(menuItemFindItem, this.f7063, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(InterfaceC2128 interfaceC2128) {
    }
}
