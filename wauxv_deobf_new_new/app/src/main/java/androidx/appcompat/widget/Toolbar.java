package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;
import p000.AbstractC1417;
import p000.AbstractC2523;
import p000.AbstractC3471;
import p000.AbstractC3477;
import p000.AbstractC3638;
import p000.C0138;
import p000.C0144;
import p000.C0230;
import p000.C0232;
import p000.C0246;
import p000.C0253;
import p000.C1681;
import p000.C1787;
import p000.C2668;
import p000.C2920;
import p000.C3469;
import p000.C3472;
import p000.C3473;
import p000.C3475;
import p000.C3476;
import p000.InterfaceC0979;
import p000.InterfaceC3474;
import p000.MenuC1975;
import p000.MenuItemC1977;
import p000.RunnableC0149;
import p000.RunnableC3468;
import p000.ViewOnClickListenerC0939;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ActionMenuView f148;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0246 f149;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0246 f150;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0230 f151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0232 f152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Drawable f153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final CharSequence f154;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0230 f155;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public View f156;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Context f157;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f159;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int f162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f163;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f165;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f166;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public C2668 f167;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int f170;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public CharSequence f171;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public CharSequence f172;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public ColorStateList f173;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList f174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public boolean f175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public boolean f176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final ArrayList f177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final ArrayList f178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final int[] f179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final C1681 f180;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public ArrayList f181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final C3469 f182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public C3476 f183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public C3472 f184;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public boolean f185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public OnBackInvokedCallback f186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public boolean f188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public final RunnableC0149 f189;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C2920(getContext());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C3473 m31() {
        C3473 c3473 = new C3473(-2, -2);
        c3473.f10921 = 0;
        c3473.f10920 = 8388627;
        return c3473;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C3473 m32(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C3473;
        if (z) {
            C3473 c3473 = (C3473) layoutParams;
            C3473 c3474 = new C3473(c3473);
            c3474.f10921 = 0;
            c3474.f10921 = c3473.f10921;
            return c3474;
        }
        if (z) {
            C3473 c3475 = new C3473((C3473) layoutParams);
            c3475.f10921 = 0;
            return c3475;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C3473 c3476 = new C3473(layoutParams);
            c3476.f10921 = 0;
            return c3476;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C3473 c3477 = new C3473(marginLayoutParams);
        c3477.f10921 = 0;
        ((ViewGroup.MarginLayoutParams) c3477).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c3477).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c3477).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c3477).bottomMargin = marginLayoutParams.bottomMargin;
        return c3477;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static int m33(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static int m34(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C3473);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m31();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m32(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0230 c0230 = this.f155;
        if (c0230 != null) {
            return c0230.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0230 c0230 = this.f155;
        if (c0230 != null) {
            return c0230.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C2668 c2668 = this.f167;
        if (c2668 != null) {
            return c2668.f8649 ? c2668.f8643 : c2668.f8644;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f169;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C2668 c2668 = this.f167;
        if (c2668 != null) {
            return c2668.f8643;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C2668 c2668 = this.f167;
        if (c2668 != null) {
            return c2668.f8644;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C2668 c2668 = this.f167;
        if (c2668 != null) {
            return c2668.f8649 ? c2668.f8644 : c2668.f8643;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f168;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1975 menuC1975;
        ActionMenuView actionMenuView = this.f148;
        return (actionMenuView == null || (menuC1975 = actionMenuView.f79) == null || !menuC1975.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f169, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f168, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0232 c0232 = this.f152;
        if (c0232 != null) {
            return c0232.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0232 c0232 = this.f152;
        if (c0232 != null) {
            return c0232.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m39();
        return this.f148.getMenu();
    }

    public View getNavButtonView() {
        return this.f151;
    }

    public CharSequence getNavigationContentDescription() {
        C0230 c0230 = this.f151;
        if (c0230 != null) {
            return c0230.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0230 c0230 = this.f151;
        if (c0230 != null) {
            return c0230.getDrawable();
        }
        return null;
    }

    public C0144 getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        m39();
        return this.f148.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f157;
    }

    public int getPopupTheme() {
        return this.f158;
    }

    public CharSequence getSubtitle() {
        return this.f172;
    }

    public final TextView getSubtitleTextView() {
        return this.f150;
    }

    public CharSequence getTitle() {
        return this.f171;
    }

    public int getTitleMarginBottom() {
        return this.f166;
    }

    public int getTitleMarginEnd() {
        return this.f164;
    }

    public int getTitleMarginStart() {
        return this.f163;
    }

    public int getTitleMarginTop() {
        return this.f165;
    }

    public final TextView getTitleTextView() {
        return this.f149;
    }

    public InterfaceC0979 getWrapper() {
        Drawable drawable;
        if (this.f183 == null) {
            C3476 c3476 = new C3476();
            c3476.f10935 = 0;
            c3476.f10924 = this;
            c3476.f10931 = getTitle();
            c3476.f10932 = getSubtitle();
            c3476.f10930 = c3476.f10931 != null;
            c3476.f10929 = getNavigationIcon();
            C0253 c0253M1453 = C0253.m1453(getContext(), null, AbstractC2523.f8026, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c0253M1453.f1478;
            c3476.f10936 = c0253M1453.m1466(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c3476.f10930 = true;
                c3476.f10931 = text;
                if ((c3476.f10925 & 8) != 0) {
                    setTitle(text);
                    if (c3476.f10930) {
                        AbstractC3638.m5184(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c3476.f10932 = text2;
                if ((c3476.f10925 & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM1466 = c0253M1453.m1466(20);
            if (drawableM1466 != null) {
                c3476.f10928 = drawableM1466;
                c3476.m4996();
            }
            Drawable drawableM1467 = c0253M1453.m1466(17);
            if (drawableM1467 != null) {
                c3476.f10927 = drawableM1467;
                c3476.m4996();
            }
            if (c3476.f10929 == null && (drawable = c3476.f10936) != null) {
                c3476.f10929 = drawable;
                if ((c3476.f10925 & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c3476.m4994(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c3476.f10926;
                if (view != null && (c3476.f10925 & 16) != 0) {
                    removeView(view);
                }
                c3476.f10926 = viewInflate;
                if (viewInflate != null && (c3476.f10925 & 16) != 0) {
                    addView(viewInflate);
                }
                c3476.m4994(c3476.f10925 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m38();
                this.f167.m4662(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f159 = resourceId2;
                C0246 c0246 = this.f149;
                if (c0246 != null) {
                    c0246.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f160 = resourceId3;
                C0246 c0247 = this.f150;
                if (c0247 != null) {
                    c0247.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0253M1453.m1475();
            if (R.string.abc_action_bar_up_description != c3476.f10935) {
                c3476.f10935 = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c3476.f10935;
                    c3476.f10933 = i != 0 ? getContext().getString(i) : null;
                    c3476.m4995();
                }
            }
            c3476.f10933 = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0939(c3476));
            this.f183 = c3476;
        }
        return this.f183;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m50();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f189);
        m50();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f176 = false;
        }
        if (!this.f176) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f176 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f176 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM45;
        int iM46;
        int iMax;
        int iMin;
        boolean zM49;
        boolean zM410;
        int measuredHeight;
        C0246 c0246;
        C0246 c0247;
        C3473 c3473;
        C3473 c3474;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iM47;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f179;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = AbstractC3638.f11333;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m49(this.f151)) {
            if (z3) {
                iM46 = m46(this.f151, i26, iMin2, iArr);
                iM45 = paddingLeft;
            } else {
                iM45 = m45(this.f151, paddingLeft, iMin2, iArr);
            }
            if (m49(this.f155)) {
                if (z3) {
                    iM46 = m46(this.f155, iM46, iMin2, iArr);
                } else {
                    iM45 = m45(this.f155, iM45, iMin2, iArr);
                }
            }
            if (m49(this.f148)) {
                if (z3) {
                    iM45 = m45(this.f148, iM45, iMin2, iArr);
                } else {
                    iM46 = m46(this.f148, iM46, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM45);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iM46));
            iMax = Math.max(iM45, currentContentInsetLeft);
            iMin = Math.min(iM46, i26 - currentContentInsetRight);
            if (m49(this.f156)) {
                if (z3) {
                    iMin = m46(this.f156, iMin, iMin2, iArr);
                } else {
                    iMax = m45(this.f156, iMax, iMin2, iArr);
                }
            }
            if (m49(this.f152)) {
                if (z3) {
                    iMin = m46(this.f152, iMin, iMin2, iArr);
                } else {
                    iMax = m45(this.f152, iMax, iMin2, iArr);
                }
            }
            zM49 = m49(this.f149);
            zM410 = m49(this.f150);
            if (zM49) {
                C3473 c3475 = (C3473) this.f149.getLayoutParams();
                measuredHeight = this.f149.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3475).topMargin + ((ViewGroup.MarginLayoutParams) c3475).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM410) {
                C3473 c3476 = (C3473) this.f150.getLayoutParams();
                measuredHeight = this.f150.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3476).topMargin + ((ViewGroup.MarginLayoutParams) c3476).bottomMargin + measuredHeight;
            }
            if (zM49 || zM410) {
                if (zM49) {
                    c0246 = this.f149;
                } else {
                    c0246 = this.f150;
                }
                if (zM410) {
                    c0247 = this.f150;
                } else {
                    c0247 = this.f149;
                }
                c3473 = (C3473) c0246.getLayoutParams();
                c3474 = (C3473) c0247.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zM49 && this.f149.getMeasuredWidth() > 0) || (zM410 && this.f150.getMeasuredWidth() > 0);
                i6 = this.f170 & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3473).topMargin + this.f165;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) c3473).topMargin + this.f165;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) c3473).bottomMargin;
                        i17 = this.f166;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c3474).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c3474).bottomMargin) - this.f166) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.f163;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM49) {
                        C3473 c3477 = (C3473) this.f149.getLayoutParams();
                        int measuredWidth2 = iMin - this.f149.getMeasuredWidth();
                        int measuredHeight2 = this.f149.getMeasuredHeight() + paddingTop;
                        this.f149.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f164;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c3477).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM410) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3473) this.f150.getLayoutParams())).topMargin;
                        this.f150.layout(iMin - this.f150.getMeasuredWidth(), i28, iMin, this.f150.getMeasuredHeight() + i28);
                        i13 = iMin - this.f164;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.f163;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zM49) {
                        C3473 c3478 = (C3473) this.f149.getLayoutParams();
                        int measuredWidth3 = this.f149.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f149.getMeasuredHeight() + paddingTop;
                        this.f149.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f164;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c3478).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM410) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3473) this.f150.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f150.getMeasuredWidth() + iMax;
                        this.f150.layout(iMax, i30, measuredWidth4, this.f150.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.f164;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.f177;
            m35(arrayList, 3);
            size = arrayList.size();
            iM47 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM47 = m45((View) arrayList.get(i18), iM47, iMin2, iArr);
            }
            m35(arrayList, 5);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = m46((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            m35(arrayList, 1);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = (View) arrayList.get(i22);
                C3473 c3479 = (C3473) view.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) c3479).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) c3479).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iM47) {
                if (i25 > iMin) {
                    iM47 = i24 - (i25 - iMin);
                } else {
                    iM47 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iM47 = m45((View) arrayList.get(i23), iM47, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM45 = paddingLeft;
        iM46 = i26;
        if (m49(this.f155)) {
            if (z3) {
                iM46 = m46(this.f155, iM46, iMin2, iArr);
            } else {
                iM45 = m45(this.f155, iM45, iMin2, iArr);
            }
        }
        if (m49(this.f148)) {
            if (z3) {
                iM45 = m45(this.f148, iM45, iMin2, iArr);
            } else {
                iM46 = m46(this.f148, iM46, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM45);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iM46));
        iMax = Math.max(iM45, currentContentInsetLeft2);
        iMin = Math.min(iM46, i26 - currentContentInsetRight2);
        if (m49(this.f156)) {
            if (z3) {
                iMin = m46(this.f156, iMin, iMin2, iArr);
            } else {
                iMax = m45(this.f156, iMax, iMin2, iArr);
            }
        }
        if (m49(this.f152)) {
            if (z3) {
                iMin = m46(this.f152, iMin, iMin2, iArr);
            } else {
                iMax = m45(this.f152, iMax, iMin2, iArr);
            }
        }
        zM49 = m49(this.f149);
        zM410 = m49(this.f150);
        if (zM49) {
            C3473 c34710 = (C3473) this.f149.getLayoutParams();
            measuredHeight = this.f149.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c34710).topMargin + ((ViewGroup.MarginLayoutParams) c34710).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM410) {
            C3473 c34711 = (C3473) this.f150.getLayoutParams();
            measuredHeight = this.f150.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c34711).topMargin + ((ViewGroup.MarginLayoutParams) c34711).bottomMargin + measuredHeight;
        }
        if (zM49) {
            if (zM49) {
                c0246 = this.f149;
            } else {
                c0246 = this.f150;
            }
            if (zM410) {
                c0247 = this.f150;
            } else {
                c0247 = this.f149;
            }
            c3473 = (C3473) c0246.getLayoutParams();
            c3474 = (C3473) c0247.getLayoutParams();
            i5 = measuredHeight;
            if (zM49) {
            }
            i6 = this.f170 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3473).topMargin + this.f165;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c3473).topMargin + this.f165;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c3473).bottomMargin;
                    i17 = this.f166;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c3474).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c3474).bottomMargin) - this.f166) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f163;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM49) {
                    C3473 c34712 = (C3473) this.f149.getLayoutParams();
                    int measuredWidth5 = iMin - this.f149.getMeasuredWidth();
                    int measuredHeight4 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f164;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c34712).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM410) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3473) this.f150.getLayoutParams())).topMargin;
                    this.f150.layout(iMin - this.f150.getMeasuredWidth(), i211, iMin, this.f150.getMeasuredHeight() + i211);
                    i13 = iMin - this.f164;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f163;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zM49) {
                    C3473 c34713 = (C3473) this.f149.getLayoutParams();
                    int measuredWidth6 = this.f149.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f164;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c34713).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM410) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3473) this.f150.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f150.getMeasuredWidth() + iMax;
                    this.f150.layout(iMax, i35, measuredWidth7, this.f150.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.f164;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zM49) {
                c0246 = this.f149;
            } else {
                c0246 = this.f150;
            }
            if (zM410) {
                c0247 = this.f150;
            } else {
                c0247 = this.f149;
            }
            c3473 = (C3473) c0246.getLayoutParams();
            c3474 = (C3473) c0247.getLayoutParams();
            i5 = measuredHeight;
            if (zM49) {
            }
            i6 = this.f170 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3473).topMargin + this.f165;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c3473).topMargin + this.f165;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c3473).bottomMargin;
                    i17 = this.f166;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c3474).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c3474).bottomMargin) - this.f166) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f163;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM49) {
                    C3473 c34714 = (C3473) this.f149.getLayoutParams();
                    int measuredWidth8 = iMin - this.f149.getMeasuredWidth();
                    int measuredHeight6 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f164;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c34714).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM410) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3473) this.f150.getLayoutParams())).topMargin;
                    this.f150.layout(iMin - this.f150.getMeasuredWidth(), i214, iMin, this.f150.getMeasuredHeight() + i214);
                    i13 = iMin - this.f164;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f163;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zM49) {
                    C3473 c34715 = (C3473) this.f149.getLayoutParams();
                    int measuredWidth9 = this.f149.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f164;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c34715).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM410) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3473) this.f150.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f150.getMeasuredWidth() + iMax;
                    this.f150.layout(iMax, i36, measuredWidth10, this.f150.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.f164;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.f177;
        m35(arrayList, 3);
        size = arrayList.size();
        iM47 = iMax;
        while (i18 < size) {
            iM47 = m45((View) arrayList.get(i18), iM47, iMin2, iArr);
        }
        m35(arrayList, 5);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = m46((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        m35(arrayList, 1);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = (View) arrayList.get(i22);
            C3473 c34716 = (C3473) view2.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) c34716).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) c34716).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iM47) {
            if (i25 > iMin) {
                iM47 = i24 - (i25 - iMin);
            } else {
                iM47 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iM47 = m45((View) arrayList.get(i23), iM47, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM33;
        int iMax;
        int iCombineMeasuredStates;
        int iM34;
        int iM35;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (m49(this.f151)) {
            m48(this.f151, i, 0, i2, this.f162);
            iM33 = m33(this.f151) + this.f151.getMeasuredWidth();
            iMax = Math.max(0, m34(this.f151) + this.f151.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f151.getMeasuredState());
        } else {
            iM33 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m49(this.f155)) {
            m48(this.f155, i, 0, i2, this.f162);
            iM33 = m33(this.f155) + this.f155.getMeasuredWidth();
            iMax = Math.max(iMax, m34(this.f155) + this.f155.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f155.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM33);
        int iMax4 = Math.max(0, currentContentInsetStart - iM33);
        Object[] objArr2 = objArr;
        int[] iArr = this.f179;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m49(this.f148)) {
            m48(this.f148, i, iMax3, i2, this.f162);
            iM34 = m33(this.f148) + this.f148.getMeasuredWidth();
            iMax = Math.max(iMax, m34(this.f148) + this.f148.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f148.getMeasuredState());
        } else {
            iM34 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM34);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM34);
        if (m49(this.f156)) {
            iMax5 += m47(this.f156, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m34(this.f156) + this.f156.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f156.getMeasuredState());
        }
        if (m49(this.f152)) {
            iMax5 += m47(this.f152, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m34(this.f152) + this.f152.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f152.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C3473) childAt.getLayoutParams()).f10921 == 0 && m49(childAt)) {
                iMax5 += m47(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m34(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f165 + this.f166;
        int i7 = this.f163 + this.f164;
        if (m49(this.f149)) {
            m47(this.f149, i, i5 + i7, i2, i6, iArr);
            int iM36 = m33(this.f149) + this.f149.getMeasuredWidth();
            iM35 = m34(this.f149) + this.f149.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f149.getMeasuredState());
            iMax2 = iM36;
        } else {
            iM35 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m49(this.f150)) {
            iMax2 = Math.max(iMax2, m47(this.f150, i, i5 + i7, i2, i6 + iM35, iArr));
            iM35 += m34(this.f150) + this.f150.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f150.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM35);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f185) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m49(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C3475)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3475 c3475 = (C3475) parcelable;
        super.onRestoreInstanceState(c3475.f1051);
        ActionMenuView actionMenuView = this.f148;
        MenuC1975 menuC1975 = actionMenuView != null ? actionMenuView.f79 : null;
        int i = c3475.f10922;
        if (i != 0 && this.f184 != null && menuC1975 != null && (menuItemFindItem = menuC1975.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c3475.f10923) {
            RunnableC0149 runnableC0149 = this.f189;
            removeCallbacks(runnableC0149);
            post(runnableC0149);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m38();
        C2668 c2668 = this.f167;
        boolean z = i == 1;
        if (z == c2668.f8649) {
            return;
        }
        c2668.f8649 = z;
        if (!c2668.f8650) {
            c2668.f8643 = c2668.f8647;
            c2668.f8644 = c2668.f8648;
            return;
        }
        if (z) {
            int i2 = c2668.f8646;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c2668.f8647;
            }
            c2668.f8643 = i2;
            int i3 = c2668.f8645;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c2668.f8648;
            }
            c2668.f8644 = i3;
            return;
        }
        int i4 = c2668.f8645;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c2668.f8647;
        }
        c2668.f8643 = i4;
        int i5 = c2668.f8646;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c2668.f8648;
        }
        c2668.f8644 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0144 c0144;
        C0138 c0138;
        MenuItemC1977 menuItemC1977;
        C3475 c3475 = new C3475(super.onSaveInstanceState());
        C3472 c3472 = this.f184;
        if (c3472 != null && (menuItemC1977 = c3472.f10918) != null) {
            c3475.f10922 = menuItemC1977.f6532;
        }
        ActionMenuView actionMenuView = this.f148;
        c3475.f10923 = (actionMenuView == null || (c0144 = actionMenuView.f82) == null || (c0138 = c0144.f1190) == null || !c0138.m3975()) ? false : true;
        return c3475;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f175 = false;
        }
        if (!this.f175) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f175 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f175 = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f188 != z) {
            this.f188 = z;
            m50();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C1787.m3667(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f185 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f169) {
            this.f169 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f168) {
            this.f168 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C1787.m3667(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1787.m3667(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m40();
        this.f151.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m39();
        this.f148.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f158 != i) {
            this.f158 = i;
            if (i == 0) {
                this.f157 = getContext();
            } else {
                this.f157 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f166 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f164 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f163 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f165 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m35(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C3473 c3473 = (C3473) childAt.getLayoutParams();
                if (c3473.f10921 == 0 && m49(childAt)) {
                    int i3 = c3473.f10920;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C3473 c3474 = (C3473) childAt2.getLayoutParams();
            if (c3474.f10921 == 0 && m49(childAt2)) {
                int i5 = c3474.f10920;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m36(View view, boolean z) {
        C3473 c3473M32;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c3473M32 = m31();
        } else {
            c3473M32 = !checkLayoutParams(layoutParams) ? m32(layoutParams) : (C3473) layoutParams;
        }
        c3473M32.f10921 = 1;
        if (!z || this.f156 == null) {
            addView(view, c3473M32);
        } else {
            view.setLayoutParams(c3473M32);
            this.f178.add(view);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m37() {
        if (this.f155 == null) {
            C0230 c0230 = new C0230(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f155 = c0230;
            c0230.setImageDrawable(this.f153);
            this.f155.setContentDescription(this.f154);
            C3473 c3473M31 = m31();
            c3473M31.f10920 = (this.f161 & 112) | 8388611;
            c3473M31.f10921 = 2;
            this.f155.setLayoutParams(c3473M31);
            this.f155.setOnClickListener(new ViewOnClickListenerC0939(this, 2));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m38() {
        if (this.f167 == null) {
            C2668 c2668 = new C2668();
            c2668.f8643 = 0;
            c2668.f8644 = 0;
            c2668.f8645 = Integer.MIN_VALUE;
            c2668.f8646 = Integer.MIN_VALUE;
            c2668.f8647 = 0;
            c2668.f8648 = 0;
            c2668.f8649 = false;
            c2668.f8650 = false;
            this.f167 = c2668;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m39() {
        if (this.f148 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f148 = actionMenuView;
            actionMenuView.setPopupTheme(this.f158);
            this.f148.setOnMenuItemClickListener(this.f182);
            ActionMenuView actionMenuView2 = this.f148;
            C3469 c3469 = new C3469(this);
            actionMenuView2.getClass();
            actionMenuView2.f83 = c3469;
            C3473 c3473M31 = m31();
            c3473M31.f10920 = (this.f161 & 112) | 8388613;
            this.f148.setLayoutParams(c3473M31);
            m36(this.f148, false);
        }
        ActionMenuView actionMenuView3 = this.f148;
        if (actionMenuView3.f79 == null) {
            MenuC1975 menuC1975 = (MenuC1975) actionMenuView3.getMenu();
            if (this.f184 == null) {
                this.f184 = new C3472(this);
            }
            this.f148.setExpandedActionViewsExclusive(true);
            menuC1975.m3949(this.f184, this.f157);
            m50();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m40() {
        if (this.f151 == null) {
            this.f151 = new C0230(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C3473 c3473M31 = m31();
            c3473M31.f10920 = (this.f161 & 112) | 8388611;
            this.f151.setLayoutParams(c3473M31);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int m41(View view, int i) {
        C3473 c3473 = (C3473) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c3473.f10920 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f170 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c3473).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c3473).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c3473).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void mo42(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m43() {
        Iterator it = this.f181.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f180.f5660).iterator();
        if (it2.hasNext()) {
            ((AbstractC1417) it2.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f181 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean m44(View view) {
        return view.getParent() == this || this.f178.contains(view);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int m45(View view, int i, int i2, int[] iArr) {
        C3473 c3473 = (C3473) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c3473).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM41 = m41(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM41, iMax + measuredWidth, view.getMeasuredHeight() + iM41);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c3473).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int m46(View view, int i, int i2, int[] iArr) {
        C3473 c3473 = (C3473) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c3473).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM41 = m41(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM41, iMax, view.getMeasuredHeight() + iM41);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c3473).leftMargin);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int m47(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m48(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean m49(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m50() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM4990 = AbstractC3471.m4990(this);
            C3472 c3472 = this.f184;
            boolean z = (c3472 == null || c3472.f10918 == null || onBackInvokedDispatcherM4990 == null || !isAttachedToWindow() || !this.f188) ? false : true;
            if (z && this.f187 == null) {
                if (this.f186 == null) {
                    this.f186 = AbstractC3471.m4991(new RunnableC3468(this, 0));
                }
                AbstractC3471.m4992(onBackInvokedDispatcherM4990, this.f186);
                this.f187 = onBackInvokedDispatcherM4990;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f187) == null) {
                return;
            }
            AbstractC3471.m4993(onBackInvokedDispatcher, this.f186);
            this.f187 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f170 = 8388627;
        this.f177 = new ArrayList();
        this.f178 = new ArrayList();
        this.f179 = new int[2];
        new RunnableC3468(this, 1);
        C1681 c1681 = new C1681();
        c1681.f5660 = new CopyOnWriteArrayList();
        new HashMap();
        this.f180 = c1681;
        this.f181 = new ArrayList();
        this.f182 = new C3469(this);
        this.f189 = new RunnableC0149(this, 17);
        Context context2 = getContext();
        int[] iArr = AbstractC2523.f8045;
        C0253 c0253M1453 = C0253.m1453(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC3638.m5182(this, context, iArr, attributeSet, (TypedArray) c0253M1453.f1478, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0253M1453.f1478;
        this.f159 = typedArray.getResourceId(28, 0);
        this.f160 = typedArray.getResourceId(19, 0);
        this.f170 = typedArray.getInteger(0, 8388627);
        this.f161 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f166 = dimensionPixelOffset;
        this.f165 = dimensionPixelOffset;
        this.f164 = dimensionPixelOffset;
        this.f163 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f163 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f164 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f165 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f166 = dimensionPixelOffset5;
        }
        this.f162 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m38();
        C2668 c2668 = this.f167;
        c2668.f8650 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c2668.f8647 = dimensionPixelSize;
            c2668.f8643 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c2668.f8648 = dimensionPixelSize2;
            c2668.f8644 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c2668.m4662(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f168 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f169 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f153 = c0253M1453.m1466(4);
        this.f154 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f157 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM1466 = c0253M1453.m1466(16);
        if (drawableM1466 != null) {
            setNavigationIcon(drawableM1466);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM1467 = c0253M1453.m1466(11);
        if (drawableM1467 != null) {
            setLogo(drawableM1467);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0253M1453.m1465(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0253M1453.m1465(20));
        }
        if (typedArray.hasValue(14)) {
            mo42(typedArray.getResourceId(14, 0));
        }
        c0253M1453.m1475();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3473 c3473 = new C3473(context, attributeSet);
        c3473.f10920 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2523.f8027);
        c3473.f10920 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c3473.f10921 = 0;
        return c3473;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m37();
        }
        C0230 c0230 = this.f155;
        if (c0230 != null) {
            c0230.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m37();
            this.f155.setImageDrawable(drawable);
        } else {
            C0230 c0230 = this.f155;
            if (c0230 != null) {
                c0230.setImageDrawable(this.f153);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f152 == null) {
                this.f152 = new C0232(getContext());
            }
            if (!m44(this.f152)) {
                m36(this.f152, true);
            }
        } else {
            C0232 c0232 = this.f152;
            if (c0232 != null && m44(c0232)) {
                removeView(this.f152);
                this.f178.remove(this.f152);
            }
        }
        C0232 c0233 = this.f152;
        if (c0233 != null) {
            c0233.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f152 == null) {
            this.f152 = new C0232(getContext());
        }
        C0232 c0232 = this.f152;
        if (c0232 != null) {
            c0232.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40();
        }
        C0230 c0230 = this.f151;
        if (c0230 != null) {
            c0230.setContentDescription(charSequence);
            AbstractC3477.m4997(this.f151, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m40();
            if (!m44(this.f151)) {
                m36(this.f151, true);
            }
        } else {
            C0230 c0230 = this.f151;
            if (c0230 != null && m44(c0230)) {
                removeView(this.f151);
                this.f178.remove(this.f151);
            }
        }
        C0230 c0231 = this.f151;
        if (c0231 != null) {
            c0231.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0246 c0246 = this.f150;
            if (c0246 != null && m44(c0246)) {
                removeView(this.f150);
                this.f178.remove(this.f150);
            }
        } else {
            if (this.f150 == null) {
                Context context = getContext();
                C0246 c0247 = new C0246(context, null);
                this.f150 = c0247;
                c0247.setSingleLine();
                this.f150.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f160;
                if (i != 0) {
                    this.f150.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f174;
                if (colorStateList != null) {
                    this.f150.setTextColor(colorStateList);
                }
            }
            if (!m44(this.f150)) {
                m36(this.f150, true);
            }
        }
        C0246 c0248 = this.f150;
        if (c0248 != null) {
            c0248.setText(charSequence);
        }
        this.f172 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f174 = colorStateList;
        C0246 c0246 = this.f150;
        if (c0246 != null) {
            c0246.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0246 c0246 = this.f149;
            if (c0246 != null && m44(c0246)) {
                removeView(this.f149);
                this.f178.remove(this.f149);
            }
        } else {
            if (this.f149 == null) {
                Context context = getContext();
                C0246 c0247 = new C0246(context, null);
                this.f149 = c0247;
                c0247.setSingleLine();
                this.f149.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f159;
                if (i != 0) {
                    this.f149.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f173;
                if (colorStateList != null) {
                    this.f149.setTextColor(colorStateList);
                }
            }
            if (!m44(this.f149)) {
                m36(this.f149, true);
            }
        }
        C0246 c0248 = this.f149;
        if (c0248 != null) {
            c0248.setText(charSequence);
        }
        this.f171 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f173 = colorStateList;
        C0246 c0246 = this.f149;
        if (c0246 != null) {
            c0246.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC3474 interfaceC3474) {
    }
}
