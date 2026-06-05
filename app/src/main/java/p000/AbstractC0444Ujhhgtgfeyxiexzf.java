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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲ能不能要点脸ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0444Ujhhgtgfeyxiexzf extends ViewGroup implements InterfaceC0370Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final int[] f2310feyxiexzfUjhhgtg = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static final int[] f2311feyxiexzfUjhhgtg = {-16842910};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2440feyxiexzfUjhhgtg f2312Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ViewOnClickListenerC3079Ujhhgtgfeyxiexzf f2313Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C1440feyxiexzfUjhhgtg f2314Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final SparseArray f2315Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f2316Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public AbstractC0410Ujhhgtgfeyxiexzf[] f2317Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f2318Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2319Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public ColorStateList f2320Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2321Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public ColorStateList f2322Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final ColorStateList f2323Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f2324Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2325Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f2326Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f2327Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public ColorStateList f2328Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f2329Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final SparseArray f2330Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2331Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f2332Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2333Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f2334feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f2335feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f2336feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f2337feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public C1017feyxiexzfUjhhgtg f2338feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f2339feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public ColorStateList f2340feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public C0439Ujhhgtgfeyxiexzf f2341feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public MenuC0355Ujhhgtgfeyxiexzf f2342feyxiexzfUjhhgtg;

    public AbstractC0444Ujhhgtgfeyxiexzf(Context context) {
        super(context);
        this.f2314Ujhhgtgfeyxiexzf = new C1440feyxiexzfUjhhgtg(5);
        this.f2315Ujhhgtgfeyxiexzf = new SparseArray(5);
        this.f2318Ujhhgtgfeyxiexzf = 0;
        this.f2319Ujhhgtgfeyxiexzf = 0;
        this.f2330Ujhhgtgfeyxiexzf = new SparseArray(5);
        this.f2331Ujhhgtgfeyxiexzf = -1;
        this.f2332Ujhhgtgfeyxiexzf = -1;
        this.f2333Ujhhgtgfeyxiexzf = -1;
        this.f2339feyxiexzfUjhhgtg = false;
        this.f2323Ujhhgtgfeyxiexzf = m1772Ujhhgtgfeyxiexzf();
        if (isInEditMode()) {
            this.f2312Ujhhgtgfeyxiexzf = null;
        } else {
            C2440feyxiexzfUjhhgtg c2440feyxiexzfUjhhgtg = new C2440feyxiexzfUjhhgtg();
            this.f2312Ujhhgtgfeyxiexzf = c2440feyxiexzfUjhhgtg;
            c2440feyxiexzfUjhhgtg.m3680feyxiexzfUjhhgtg(0);
            c2440feyxiexzfUjhhgtg.mo3039feyxiexzfUjhhgtg(AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionDurationMedium4, getResources().getInteger(me.hd.wauxv.R.integer.material_motion_duration_long_1)));
            c2440feyxiexzfUjhhgtg.mo3041feyxiexzfUjhhgtg(AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionEasingStandard, AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf));
            c2440feyxiexzfUjhhgtg.m3677feyxiexzfUjhhgtg(new C1977Ujhhgtgfeyxiexzf());
        }
        this.f2313Ujhhgtgfeyxiexzf = new ViewOnClickListenerC3079Ujhhgtgfeyxiexzf(1, (C2662feyxiexzfUjhhgtg) this);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setImportantForAccessibility(1);
    }

    private AbstractC0410Ujhhgtgfeyxiexzf getNewItem() {
        AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf = (AbstractC0410Ujhhgtgfeyxiexzf) this.f2314Ujhhgtgfeyxiexzf.mo2933Ujhhgtgfeyxiexzf();
        return abstractC0410Ujhhgtgfeyxiexzf == null ? new C2661feyxiexzfUjhhgtg(getContext()) : abstractC0410Ujhhgtgfeyxiexzf;
    }

    private void setBadgeIfNeeded(AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf) {
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg;
        int id = abstractC0410Ujhhgtgfeyxiexzf.getId();
        if (id == -1 || (c2449feyxiexzfUjhhgtg = (C2449feyxiexzfUjhhgtg) this.f2330Ujhhgtgfeyxiexzf.get(id)) == null) {
            return;
        }
        abstractC0410Ujhhgtgfeyxiexzf.setBadge(c2449feyxiexzfUjhhgtg);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f2333Ujhhgtgfeyxiexzf;
    }

    public SparseArray<C2449feyxiexzfUjhhgtg> getBadgeDrawables() {
        return this.f2330Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getIconTintList() {
        return this.f2320Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f2340feyxiexzfUjhhgtg;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f2334feyxiexzfUjhhgtg;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f2336feyxiexzfUjhhgtg;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f2337feyxiexzfUjhhgtg;
    }

    public C1017feyxiexzfUjhhgtg getItemActiveIndicatorShapeAppearance() {
        return this.f2338feyxiexzfUjhhgtg;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f2335feyxiexzfUjhhgtg;
    }

    public Drawable getItemBackground() {
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        return (abstractC0410UjhhgtgfeyxiexzfArr == null || abstractC0410UjhhgtgfeyxiexzfArr.length <= 0) ? this.f2327Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f2329Ujhhgtgfeyxiexzf;
    }

    public int getItemIconSize() {
        return this.f2321Ujhhgtgfeyxiexzf;
    }

    public int getItemPaddingBottom() {
        return this.f2332Ujhhgtgfeyxiexzf;
    }

    public int getItemPaddingTop() {
        return this.f2331Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getItemRippleColor() {
        return this.f2328Ujhhgtgfeyxiexzf;
    }

    public int getItemTextAppearanceActive() {
        return this.f2325Ujhhgtgfeyxiexzf;
    }

    public int getItemTextAppearanceInactive() {
        return this.f2324Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getItemTextColor() {
        return this.f2322Ujhhgtgfeyxiexzf;
    }

    public int getLabelVisibilityMode() {
        return this.f2316Ujhhgtgfeyxiexzf;
    }

    public MenuC0355Ujhhgtgfeyxiexzf getMenu() {
        return this.f2342feyxiexzfUjhhgtg;
    }

    public int getSelectedItemId() {
        return this.f2318Ujhhgtgfeyxiexzf;
    }

    public int getSelectedItemPosition() {
        return this.f2319Ujhhgtgfeyxiexzf;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2962feyxiexzfUjhhgtg.m4428Ujhhgtgfeyxiexzf(1, this.f2342feyxiexzfUjhhgtg.m1552Ujhhgtgfeyxiexzf().size(), 1).f9271Ujhhgtgfeyxiexzf);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f2333Ujhhgtgfeyxiexzf = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2320Ujhhgtgfeyxiexzf = colorStateList;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f2340feyxiexzfUjhhgtg = colorStateList;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorDrawable(m1773Ujhhgtgfeyxiexzf());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f2334feyxiexzfUjhhgtg = z;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f2336feyxiexzfUjhhgtg = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f2337feyxiexzfUjhhgtg = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f2339feyxiexzfUjhhgtg = z;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        this.f2338feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorDrawable(m1773Ujhhgtgfeyxiexzf());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f2335feyxiexzfUjhhgtg = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f2327Ujhhgtgfeyxiexzf = drawable;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f2329Ujhhgtgfeyxiexzf = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f2321Ujhhgtgfeyxiexzf = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f2332Ujhhgtgfeyxiexzf = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f2331Ujhhgtgfeyxiexzf = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2328Ujhhgtgfeyxiexzf = colorStateList;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f2325Ujhhgtgfeyxiexzf = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f2322Ujhhgtgfeyxiexzf;
                if (colorStateList != null) {
                    abstractC0410Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f2326Ujhhgtgfeyxiexzf = z;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f2324Ujhhgtgfeyxiexzf = i;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f2322Ujhhgtgfeyxiexzf;
                if (colorStateList != null) {
                    abstractC0410Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f2322Ujhhgtgfeyxiexzf = colorStateList;
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                abstractC0410Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f2316Ujhhgtgfeyxiexzf = i;
    }

    public void setPresenter(C0439Ujhhgtgfeyxiexzf c0439Ujhhgtgfeyxiexzf) {
        this.f2341feyxiexzfUjhhgtg = c0439Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1771Ujhhgtgfeyxiexzf() {
        removeAllViews();
        AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = this.f2317Ujhhgtgfeyxiexzf;
        if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
            for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                if (abstractC0410Ujhhgtgfeyxiexzf != null) {
                    this.f2314Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(abstractC0410Ujhhgtgfeyxiexzf);
                    ImageView imageView = abstractC0410Ujhhgtgfeyxiexzf.f2214Ujhhgtgfeyxiexzf;
                    if (abstractC0410Ujhhgtgfeyxiexzf.f2232feyxiexzfUjhhgtg != null) {
                        if (imageView != null) {
                            abstractC0410Ujhhgtgfeyxiexzf.setClipChildren(true);
                            abstractC0410Ujhhgtgfeyxiexzf.setClipToPadding(true);
                            C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = abstractC0410Ujhhgtgfeyxiexzf.f2232feyxiexzfUjhhgtg;
                            if (c2449feyxiexzfUjhhgtg != null) {
                                if (c2449feyxiexzfUjhhgtg.m3684Ujhhgtgfeyxiexzf() != null) {
                                    c2449feyxiexzfUjhhgtg.m3684Ujhhgtgfeyxiexzf().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c2449feyxiexzfUjhhgtg);
                                }
                            }
                        }
                        abstractC0410Ujhhgtgfeyxiexzf.f2232feyxiexzfUjhhgtg = null;
                    }
                    abstractC0410Ujhhgtgfeyxiexzf.f2220Ujhhgtgfeyxiexzf = null;
                    abstractC0410Ujhhgtgfeyxiexzf.f2226feyxiexzfUjhhgtg = 0.0f;
                    abstractC0410Ujhhgtgfeyxiexzf.f2201Ujhhgtgfeyxiexzf = false;
                }
            }
        }
        if (this.f2342feyxiexzfUjhhgtg.f2009Ujhhgtgfeyxiexzf.size() == 0) {
            this.f2318Ujhhgtgfeyxiexzf = 0;
            this.f2319Ujhhgtgfeyxiexzf = 0;
            this.f2317Ujhhgtgfeyxiexzf = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f2342feyxiexzfUjhhgtg.f2009Ujhhgtgfeyxiexzf.size(); i++) {
            hashSet.add(Integer.valueOf(this.f2342feyxiexzfUjhhgtg.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2330Ujhhgtgfeyxiexzf;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.f2317Ujhhgtgfeyxiexzf = new AbstractC0410Ujhhgtgfeyxiexzf[this.f2342feyxiexzfUjhhgtg.f2009Ujhhgtgfeyxiexzf.size()];
        int i3 = this.f2316Ujhhgtgfeyxiexzf;
        boolean z = i3 != -1 ? i3 == 0 : this.f2342feyxiexzfUjhhgtg.m1552Ujhhgtgfeyxiexzf().size() > 3;
        for (int i4 = 0; i4 < this.f2342feyxiexzfUjhhgtg.f2009Ujhhgtgfeyxiexzf.size(); i4++) {
            this.f2341feyxiexzfUjhhgtg.f2304Ujhhgtgfeyxiexzf = true;
            this.f2342feyxiexzfUjhhgtg.getItem(i4).setCheckable(true);
            this.f2341feyxiexzfUjhhgtg.f2304Ujhhgtgfeyxiexzf = false;
            AbstractC0410Ujhhgtgfeyxiexzf newItem = getNewItem();
            this.f2317Ujhhgtgfeyxiexzf[i4] = newItem;
            newItem.setIconTintList(this.f2320Ujhhgtgfeyxiexzf);
            newItem.setIconSize(this.f2321Ujhhgtgfeyxiexzf);
            newItem.setTextColor(this.f2323Ujhhgtgfeyxiexzf);
            newItem.setTextAppearanceInactive(this.f2324Ujhhgtgfeyxiexzf);
            newItem.setTextAppearanceActive(this.f2325Ujhhgtgfeyxiexzf);
            newItem.setTextAppearanceActiveBoldEnabled(this.f2326Ujhhgtgfeyxiexzf);
            newItem.setTextColor(this.f2322Ujhhgtgfeyxiexzf);
            int i5 = this.f2331Ujhhgtgfeyxiexzf;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.f2332Ujhhgtgfeyxiexzf;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.f2333Ujhhgtgfeyxiexzf;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.f2335feyxiexzfUjhhgtg);
            newItem.setActiveIndicatorHeight(this.f2336feyxiexzfUjhhgtg);
            newItem.setActiveIndicatorMarginHorizontal(this.f2337feyxiexzfUjhhgtg);
            newItem.setActiveIndicatorDrawable(m1773Ujhhgtgfeyxiexzf());
            newItem.setActiveIndicatorResizeable(this.f2339feyxiexzfUjhhgtg);
            newItem.setActiveIndicatorEnabled(this.f2334feyxiexzfUjhhgtg);
            Drawable drawable = this.f2327Ujhhgtgfeyxiexzf;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f2329Ujhhgtgfeyxiexzf);
            }
            newItem.setItemRippleColor(this.f2328Ujhhgtgfeyxiexzf);
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.f2316Ujhhgtgfeyxiexzf);
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) this.f2342feyxiexzfUjhhgtg.getItem(i4);
            newItem.mo2Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf);
            newItem.setItemPosition(i4);
            int i8 = menuItemC0357Ujhhgtgfeyxiexzf.f2024Ujhhgtgfeyxiexzf;
            newItem.setOnTouchListener((View.OnTouchListener) this.f2315Ujhhgtgfeyxiexzf.get(i8));
            newItem.setOnClickListener(this.f2313Ujhhgtgfeyxiexzf);
            int i9 = this.f2318Ujhhgtgfeyxiexzf;
            if (i9 != 0 && i8 == i9) {
                this.f2319Ujhhgtgfeyxiexzf = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f2342feyxiexzfUjhhgtg.f2009Ujhhgtgfeyxiexzf.size() - 1, this.f2319Ujhhgtgfeyxiexzf);
        this.f2319Ujhhgtgfeyxiexzf = iMin;
        this.f2342feyxiexzfUjhhgtg.getItem(iMin).setChecked(true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ColorStateList m1772Ujhhgtgfeyxiexzf() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM4559Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(me.hd.wauxv.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListM4559Ujhhgtgfeyxiexzf.getDefaultColor();
        int[] iArr = f2310feyxiexzfUjhhgtg;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f2311feyxiexzfUjhhgtg;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListM4559Ujhhgtgfeyxiexzf.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf m1773Ujhhgtgfeyxiexzf() {
        if (this.f2338feyxiexzfUjhhgtg == null || this.f2340feyxiexzfUjhhgtg == null) {
            return null;
        }
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(this.f2338feyxiexzfUjhhgtg);
        c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(this.f2340feyxiexzfUjhhgtg);
        return c0226Ujhhgtgfeyxiexzf;
    }
}
