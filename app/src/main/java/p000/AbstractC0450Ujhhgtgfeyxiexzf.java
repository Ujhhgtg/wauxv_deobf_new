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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲ要点脸能不能ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450Ujhhgtgfeyxiexzf extends FrameLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0443Ujhhgtgfeyxiexzf f2349Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2662feyxiexzfUjhhgtg f2350Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0439Ujhhgtgfeyxiexzf f2351Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C1171feyxiexzfUjhhgtg f2352Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public InterfaceC0441Ujhhgtgfeyxiexzf f2353Ujhhgtgfeyxiexzf;

    public AbstractC0450Ujhhgtgfeyxiexzf(Context context) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), null, R.attr.bottomNavigationStyle);
        C0439Ujhhgtgfeyxiexzf c0439Ujhhgtgfeyxiexzf = new C0439Ujhhgtgfeyxiexzf();
        c0439Ujhhgtgfeyxiexzf.f2304Ujhhgtgfeyxiexzf = false;
        this.f2351Ujhhgtgfeyxiexzf = c0439Ujhhgtgfeyxiexzf;
        Context context2 = getContext();
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2741Ujhhgtgfeyxiexzf(context2, null, AbstractC0799feyxiexzfUjhhgtg.f3140feyxiexzfUjhhgtg, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        C0443Ujhhgtgfeyxiexzf c0443Ujhhgtgfeyxiexzf = new C0443Ujhhgtgfeyxiexzf(context2, getClass(), getMaxItemCount());
        this.f2349Ujhhgtgfeyxiexzf = c0443Ujhhgtgfeyxiexzf;
        C2662feyxiexzfUjhhgtg c2662feyxiexzfUjhhgtg = new C2662feyxiexzfUjhhgtg(context2);
        this.f2350Ujhhgtgfeyxiexzf = c2662feyxiexzfUjhhgtg;
        c0439Ujhhgtgfeyxiexzf.f2303Ujhhgtgfeyxiexzf = c2662feyxiexzfUjhhgtg;
        c0439Ujhhgtgfeyxiexzf.f2305Ujhhgtgfeyxiexzf = 1;
        c2662feyxiexzfUjhhgtg.setPresenter(c0439Ujhhgtgfeyxiexzf);
        c0443Ujhhgtgfeyxiexzf.m1543Ujhhgtgfeyxiexzf(c0439Ujhhgtgfeyxiexzf, c0443Ujhhgtgfeyxiexzf.f2004Ujhhgtgfeyxiexzf);
        getContext();
        c0439Ujhhgtgfeyxiexzf.f2303Ujhhgtgfeyxiexzf.f2342feyxiexzfUjhhgtg = c0443Ujhhgtgfeyxiexzf;
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        if (typedArray.hasValue(6)) {
            c2662feyxiexzfUjhhgtg.setIconTintList(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(6));
        } else {
            c2662feyxiexzfUjhhgtg.setIconTintList(c2662feyxiexzfUjhhgtg.m1772Ujhhgtgfeyxiexzf());
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
            setItemTextColor(c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListM5157Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5157Ujhhgtgfeyxiexzf(background);
        if (background == null || colorStateListM5157Ujhhgtgfeyxiexzf != null) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context2, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).m2507Ujhhgtgfeyxiexzf());
            if (colorStateListM5157Ujhhgtgfeyxiexzf != null) {
                c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateListM5157Ujhhgtgfeyxiexzf);
            }
            c0226Ujhhgtgfeyxiexzf.m1367Ujhhgtgfeyxiexzf(context2);
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            setBackground(c0226Ujhhgtgfeyxiexzf);
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
        getBackground().mutate().setTintList(AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(context2, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            c2662feyxiexzfUjhhgtg.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(context2, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC0799feyxiexzfUjhhgtg.f3139Ujhhgtgfeyxiexzf);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(C1017feyxiexzfUjhhgtg.m2510Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new C2923Ujhhgtgfeyxiexzf(0)).m2507Ujhhgtgfeyxiexzf());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            c0439Ujhhgtgfeyxiexzf.f2304Ujhhgtgfeyxiexzf = true;
            getMenuInflater().inflate(resourceId3, c0443Ujhhgtgfeyxiexzf);
            c0439Ujhhgtgfeyxiexzf.f2304Ujhhgtgfeyxiexzf = false;
            c0439Ujhhgtgfeyxiexzf.mo1593Ujhhgtgfeyxiexzf(true);
        }
        c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        addView(c2662feyxiexzfUjhhgtg);
        c0443Ujhhgtgfeyxiexzf.f2008Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f2352Ujhhgtgfeyxiexzf == null) {
            this.f2352Ujhhgtgfeyxiexzf = new C1171feyxiexzfUjhhgtg(getContext());
        }
        return this.f2352Ujhhgtgfeyxiexzf;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f2350Ujhhgtgfeyxiexzf.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemActiveIndicatorMarginHorizontal();
    }

    public C1017feyxiexzfUjhhgtg getItemActiveIndicatorShapeAppearance() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f2350Ujhhgtgfeyxiexzf.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f2350Ujhhgtgfeyxiexzf.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f2350Ujhhgtgfeyxiexzf.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f2349Ujhhgtgfeyxiexzf;
    }

    public InterfaceC0370Ujhhgtgfeyxiexzf getMenuView() {
        return this.f2350Ujhhgtgfeyxiexzf;
    }

    public C0439Ujhhgtgfeyxiexzf getPresenter() {
        return this.f2351Ujhhgtgfeyxiexzf;
    }

    public int getSelectedItemId() {
        return this.f2350Ujhhgtgfeyxiexzf.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0226Ujhhgtgfeyxiexzf) {
            AbstractC3516feyxiexzfUjhhgtg.m5072feyxiexzfUjhhgtg(this, (C0226Ujhhgtgfeyxiexzf) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0449Ujhhgtgfeyxiexzf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0449Ujhhgtgfeyxiexzf c0449Ujhhgtgfeyxiexzf = (C0449Ujhhgtgfeyxiexzf) parcelable;
        super.onRestoreInstanceState(c0449Ujhhgtgfeyxiexzf.f9210Ujhhgtgfeyxiexzf);
        Bundle bundle = c0449Ujhhgtgfeyxiexzf.f2348Ujhhgtgfeyxiexzf;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2349Ujhhgtgfeyxiexzf.f2021Ujhhgtgfeyxiexzf;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
            if (interfaceC0368Ujhhgtgfeyxiexzf == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = interfaceC0368Ujhhgtgfeyxiexzf.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC0368Ujhhgtgfeyxiexzf.mo1596Ujhhgtgfeyxiexzf(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1598Ujhhgtgfeyxiexzf;
        C0449Ujhhgtgfeyxiexzf c0449Ujhhgtgfeyxiexzf = new C0449Ujhhgtgfeyxiexzf(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c0449Ujhhgtgfeyxiexzf.f2348Ujhhgtgfeyxiexzf = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2349Ujhhgtgfeyxiexzf.f2021Ujhhgtgfeyxiexzf;
        if (copyOnWriteArrayList.isEmpty()) {
            return c0449Ujhhgtgfeyxiexzf;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0368Ujhhgtgfeyxiexzf interfaceC0368Ujhhgtgfeyxiexzf = (InterfaceC0368Ujhhgtgfeyxiexzf) weakReference.get();
            if (interfaceC0368Ujhhgtgfeyxiexzf == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = interfaceC0368Ujhhgtgfeyxiexzf.getId();
                if (id > 0 && (parcelableMo1598Ujhhgtgfeyxiexzf = interfaceC0368Ujhhgtgfeyxiexzf.mo1598Ujhhgtgfeyxiexzf()) != null) {
                    sparseArray.put(id, parcelableMo1598Ujhhgtgfeyxiexzf);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return c0449Ujhhgtgfeyxiexzf;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0226Ujhhgtgfeyxiexzf) {
            ((C0226Ujhhgtgfeyxiexzf) background).m1368Ujhhgtgfeyxiexzf(f);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f2350Ujhhgtgfeyxiexzf.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f2350Ujhhgtgfeyxiexzf.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        this.f2350Ujhhgtgfeyxiexzf.setItemActiveIndicatorShapeAppearance(c1017feyxiexzfUjhhgtg);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f2350Ujhhgtgfeyxiexzf.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f2350Ujhhgtgfeyxiexzf.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2350Ujhhgtgfeyxiexzf.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f2350Ujhhgtgfeyxiexzf.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f2350Ujhhgtgfeyxiexzf.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f2350Ujhhgtgfeyxiexzf.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C2662feyxiexzfUjhhgtg c2662feyxiexzfUjhhgtg = this.f2350Ujhhgtgfeyxiexzf;
        if (c2662feyxiexzfUjhhgtg.getLabelVisibilityMode() != i) {
            c2662feyxiexzfUjhhgtg.setLabelVisibilityMode(i);
            this.f2351Ujhhgtgfeyxiexzf.mo1593Ujhhgtgfeyxiexzf(false);
        }
    }

    public void setOnItemSelectedListener(InterfaceC0441Ujhhgtgfeyxiexzf interfaceC0441Ujhhgtgfeyxiexzf) {
        this.f2353Ujhhgtgfeyxiexzf = interfaceC0441Ujhhgtgfeyxiexzf;
    }

    public void setSelectedItemId(int i) {
        C0443Ujhhgtgfeyxiexzf c0443Ujhhgtgfeyxiexzf = this.f2349Ujhhgtgfeyxiexzf;
        MenuItem menuItemFindItem = c0443Ujhhgtgfeyxiexzf.findItem(i);
        if (menuItemFindItem == null || c0443Ujhhgtgfeyxiexzf.m1557Ujhhgtgfeyxiexzf(menuItemFindItem, this.f2351Ujhhgtgfeyxiexzf, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(InterfaceC0442Ujhhgtgfeyxiexzf interfaceC0442Ujhhgtgfeyxiexzf) {
    }
}
