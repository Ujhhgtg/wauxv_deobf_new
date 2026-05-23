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
import p000.AbstractC1409;
import p000.AbstractC2470;
import p000.AbstractC3413;
import p000.AbstractC3419;
import p000.AbstractC3471;
import p000.AbstractC3578;
import p000.C0130;
import p000.C0136;
import p000.C0220;
import p000.C0222;
import p000.C0236;
import p000.C0243;
import p000.C1744;
import p000.C2607;
import p000.C2860;
import p000.C3411;
import p000.C3414;
import p000.C3415;
import p000.C3417;
import p000.C3418;
import p000.InterfaceC0975;
import p000.InterfaceC3416;
import p000.MenuC1944;
import p000.MenuItemC1946;
import p000.RunnableC0141;
import p000.RunnableC3410;
import p000.ViewOnClickListenerC0940;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    public ActionMenuView f148;

    public C0236 f149;

    public C0236 f150;

    public C0220 f151;

    public C0222 f152;

    public final Drawable f153;

    public final CharSequence f154;

    public C0220 f155;

    public View f156;

    public Context f157;

    public int f158;

    public int f159;

    public int f160;

    public final int f161;

    public final int f162;

    public int f163;

    public int f164;

    public int f165;

    public int f166;

    public C2607 f167;

    public int f168;

    public int f169;

    public final int f170;

    public CharSequence f171;

    public CharSequence f172;

    public ColorStateList f173;

    public ColorStateList f174;

    public boolean f175;

    public boolean f176;

    public final ArrayList f177;

    public final ArrayList f178;

    public final int[] f179;

    public final C1744 f180;

    public ArrayList f181;

    public final C3411 f182;

    public C3418 f183;

    public C3414 f184;

    public boolean f185;

    public OnBackInvokedCallback f186;

    public OnBackInvokedDispatcher f187;

    public boolean f188;

    public final RunnableC0141 f189;

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
        return new C2860(getContext());
    }

    public static C3415 m31() {
        C3415 c3415 = new C3415(-2, -2);
        c3415.f10760 = 0;
        c3415.f10759 = 8388627;
        return c3415;
    }

    public static C3415 m32(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C3415;
        if (z) {
            C3415 c3415 = (C3415) layoutParams;
            C3415 c3416 = new C3415(c3415);
            c3416.f10760 = 0;
            c3416.f10760 = c3415.f10760;
            return c3416;
        }
        if (false) {
            C3415 c3417 = new C3415((C3415) layoutParams);
            c3417.f10760 = 0;
            return c3417;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C3415 c3418 = new C3415(layoutParams);
            c3418.f10760 = 0;
            return c3418;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C3415 c3419 = new C3415(marginLayoutParams);
        c3419.f10760 = 0;
        ((ViewGroup.MarginLayoutParams) c3419).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c3419).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c3419).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c3419).bottomMargin = marginLayoutParams.bottomMargin;
        return c3419;
    }

    public static int m33(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int m34(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C3415);
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
        C0220 c0220 = this.f155;
        if (c0220 != null) {
            return c0220.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0220 c0220 = this.f155;
        if (c0220 != null) {
            return c0220.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C2607 c2607 = this.f167;
        if (c2607 != null) {
            return c2607.f8484 ? c2607.f8478 : c2607.f8479;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f169;
        return i != -2147483648 ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C2607 c2607 = this.f167;
        if (c2607 != null) {
            return c2607.f8478;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C2607 c2607 = this.f167;
        if (c2607 != null) {
            return c2607.f8479;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C2607 c2607 = this.f167;
        if (c2607 != null) {
            return c2607.f8484 ? c2607.f8479 : c2607.f8478;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f168;
        return i != -2147483648 ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1944 menuC1944;
        ActionMenuView actionMenuView = this.f148;
        return (actionMenuView == null || (menuC1944 = actionMenuView.f79) == null || !menuC1944.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f169, 0));
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
        C0222 c0222 = this.f152;
        if (c0222 != null) {
            return c0222.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0222 c0222 = this.f152;
        if (c0222 != null) {
            return c0222.getContentDescription();
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
        C0220 c0220 = this.f151;
        if (c0220 != null) {
            return c0220.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0220 c0220 = this.f151;
        if (c0220 != null) {
            return c0220.getDrawable();
        }
        return null;
    }

    public C0136 getOuterActionMenuPresenter() {
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

    public InterfaceC0975 getWrapper() {
        Drawable drawable;
        if (this.f183 == null) {
            C3418 c3418 = new C3418();
            c3418.f10774 = 0;
            c3418.f10763 = this;
            c3418.f10770 = getTitle();
            c3418.f10771 = getSubtitle();
            c3418.f10769 = c3418.f10770 != null;
            c3418.f10768 = getNavigationIcon();
            C0243 c0243M1307 = C0243.m1307(getContext(), null, AbstractC2470.f7877, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c0243M1307.f1404;
            c3418.f10775 = c0243M1307.m1320(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c3418.f10769 = true;
                c3418.f10770 = text;
                if ((c3418.f10764 & 8) != 0) {
                    setTitle(text);
                    if (c3418.f10769) {
                        AbstractC3578.m5178(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c3418.f10771 = text2;
                if ((c3418.f10764 & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM1320 = c0243M1307.m1320(20);
            if (drawableM1320 != null) {
                c3418.f10767 = drawableM1320;
                c3418.m4934();
            }
            Drawable drawableM1321 = c0243M1307.m1320(17);
            if (drawableM1321 != null) {
                c3418.f10766 = drawableM1321;
                c3418.m4934();
            }
            if (c3418.f10768 == null && (drawable = c3418.f10775) != null) {
                c3418.f10768 = drawable;
                if ((c3418.f10764 & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c3418.m4932(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c3418.f10765;
                if (view != null && (c3418.f10764 & 16) != 0) {
                    removeView(view);
                }
                c3418.f10765 = viewInflate;
                if (viewInflate != null && (c3418.f10764 & 16) != 0) {
                    addView(viewInflate);
                }
                c3418.m4932(c3418.f10764 | 16);
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
                this.f167.m4628(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f159 = resourceId2;
                C0236 c0236 = this.f149;
                if (c0236 != null) {
                    c0236.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f160 = resourceId3;
                C0236 c0237 = this.f150;
                if (c0237 != null) {
                    c0237.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0243M1307.m1329();
            if (R.string.abc_action_bar_up_description != c3418.f10774) {
                c3418.f10774 = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c3418.f10774;
                    c3418.f10772 = i != 0 ? getContext().getString(i) : null;
                    c3418.m4933();
                }
            }
            c3418.f10772 = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0940(c3418));
            this.f183 = c3418;
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
        C0236 c0236;
        C0236 c0237;
        C3415 c3415;
        C3415 c3416;
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
        Field field = AbstractC3578.f11184;
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
                C3415 c3417 = (C3415) this.f149.getLayoutParams();
                measuredHeight = this.f149.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3417).topMargin + ((ViewGroup.MarginLayoutParams) c3417).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM410) {
                C3415 c3418 = (C3415) this.f150.getLayoutParams();
                measuredHeight = this.f150.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3418).topMargin + ((ViewGroup.MarginLayoutParams) c3418).bottomMargin + measuredHeight;
            }
            if (zM49 || zM410) {
                if (zM49) {
                    c0236 = this.f149;
                } else {
                    c0236 = this.f150;
                }
                if (zM410) {
                    c0237 = this.f150;
                } else {
                    c0237 = this.f149;
                }
                c3415 = (C3415) c0236.getLayoutParams();
                c3416 = (C3415) c0237.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zM49 && this.f149.getMeasuredWidth() > 0) || (zM410 && this.f150.getMeasuredWidth() > 0);
                i6 = this.f170 & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3415).topMargin + this.f165;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) c3415).topMargin + this.f165;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) c3415).bottomMargin;
                        i17 = this.f166;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c3416).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c3416).bottomMargin) - this.f166) - i5;
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
                        C3415 c3419 = (C3415) this.f149.getLayoutParams();
                        int measuredWidth2 = iMin - this.f149.getMeasuredWidth();
                        int measuredHeight2 = this.f149.getMeasuredHeight() + paddingTop;
                        this.f149.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f164;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c3419).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM410) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3415) this.f150.getLayoutParams())).topMargin;
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
                        C3415 c34110 = (C3415) this.f149.getLayoutParams();
                        int measuredWidth3 = this.f149.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f149.getMeasuredHeight() + paddingTop;
                        this.f149.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f164;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c34110).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM410) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3415) this.f150.getLayoutParams())).topMargin;
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
                C3415 c34111 = (C3415) view.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) c34111).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) c34111).rightMargin - i32;
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
            C3415 c34112 = (C3415) this.f149.getLayoutParams();
            measuredHeight = this.f149.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c34112).topMargin + ((ViewGroup.MarginLayoutParams) c34112).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM410) {
            C3415 c34113 = (C3415) this.f150.getLayoutParams();
            measuredHeight = this.f150.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c34113).topMargin + ((ViewGroup.MarginLayoutParams) c34113).bottomMargin + measuredHeight;
        }
        if (zM49) {
            if (true) {
                c0236 = this.f149;
            } else {
                c0236 = this.f150;
            }
            if (zM410) {
                c0237 = this.f150;
            } else {
                c0237 = this.f149;
            }
            c3415 = (C3415) c0236.getLayoutParams();
            c3416 = (C3415) c0237.getLayoutParams();
            i5 = measuredHeight;
            if (true) {
            }
            i6 = this.f170 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3415).topMargin + this.f165;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c3415).topMargin + this.f165;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c3415).bottomMargin;
                    i17 = this.f166;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c3416).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c3416).bottomMargin) - this.f166) - i5;
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
                if (true) {
                    C3415 c34114 = (C3415) this.f149.getLayoutParams();
                    int measuredWidth5 = iMin - this.f149.getMeasuredWidth();
                    int measuredHeight4 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f164;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c34114).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM410) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3415) this.f150.getLayoutParams())).topMargin;
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
                if (true) {
                    C3415 c34115 = (C3415) this.f149.getLayoutParams();
                    int measuredWidth6 = this.f149.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f164;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c34115).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM410) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3415) this.f150.getLayoutParams())).topMargin;
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
            if (false) {
                c0236 = this.f149;
            } else {
                c0236 = this.f150;
            }
            if (zM410) {
                c0237 = this.f150;
            } else {
                c0237 = this.f149;
            }
            c3415 = (C3415) c0236.getLayoutParams();
            c3416 = (C3415) c0237.getLayoutParams();
            i5 = measuredHeight;
            if (false) {
            }
            i6 = this.f170 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3415).topMargin + this.f165;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c3415).topMargin + this.f165;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c3415).bottomMargin;
                    i17 = this.f166;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c3416).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c3416).bottomMargin) - this.f166) - i5;
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
                if (false) {
                    C3415 c34116 = (C3415) this.f149.getLayoutParams();
                    int measuredWidth8 = iMin - this.f149.getMeasuredWidth();
                    int measuredHeight6 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f164;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c34116).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM410) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3415) this.f150.getLayoutParams())).topMargin;
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
                if (false) {
                    C3415 c34117 = (C3415) this.f149.getLayoutParams();
                    int measuredWidth9 = this.f149.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f149.getMeasuredHeight() + paddingTop;
                    this.f149.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f164;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c34117).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM410) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C3415) this.f150.getLayoutParams())).topMargin;
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
            C3415 c34118 = (C3415) view2.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) c34118).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) c34118).rightMargin - i38;
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
        iArr[0] = iMax4;
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
            if (((C3415) childAt.getLayoutParams()).f10760 == 0 && m49(childAt)) {
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
        if (!(parcelable instanceof C3417)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3417 c3417 = (C3417) parcelable;
        super.onRestoreInstanceState(c3417.f986);
        ActionMenuView actionMenuView = this.f148;
        MenuC1944 menuC1944 = actionMenuView != null ? actionMenuView.f79 : null;
        int i = c3417.f10761;
        if (i != 0 && this.f184 != null && menuC1944 != null && (menuItemFindItem = menuC1944.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c3417.f10762) {
            RunnableC0141 runnableC0141 = this.f189;
            removeCallbacks(runnableC0141);
            post(runnableC0141);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m38();
        C2607 c2607 = this.f167;
        boolean z = i == 1;
        if (z == c2607.f8484) {
            return;
        }
        c2607.f8484 = z;
        if (!c2607.f8485) {
            c2607.f8478 = c2607.f8482;
            c2607.f8479 = c2607.f8483;
            return;
        }
        if (z) {
            int i2 = c2607.f8481;
            if (i2 == -2147483648) {
                i2 = c2607.f8482;
            }
            c2607.f8478 = i2;
            int i3 = c2607.f8480;
            if (i3 == -2147483648) {
                i3 = c2607.f8483;
            }
            c2607.f8479 = i3;
            return;
        }
        int i4 = c2607.f8480;
        if (i4 == -2147483648) {
            i4 = c2607.f8482;
        }
        c2607.f8478 = i4;
        int i5 = c2607.f8481;
        if (i5 == -2147483648) {
            i5 = c2607.f8483;
        }
        c2607.f8479 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0136 c0136;
        C0130 c0130;
        MenuItemC1946 menuItemC1946;
        C3417 c3417 = new C3417(super.onSaveInstanceState());
        C3414 c3414 = this.f184;
        if (c3414 != null && (menuItemC1946 = c3414.f10757) != null) {
            c3417.f10761 = menuItemC1946.f6427;
        }
        ActionMenuView actionMenuView = this.f148;
        c3417.f10762 = (actionMenuView == null || (c0136 = actionMenuView.f82) == null || (c0130 = c0136.f1122) == null || !c0130.m3781()) ? false : true;
        return c3417;
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
        setCollapseIcon(AbstractC3471.m5076(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f185 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = -2147483648;
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
            i = -2147483648;
        }
        if (i != this.f168) {
            this.f168 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC3471.m5076(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC3471.m5076(getContext(), i));
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

    public final void m35(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C3415 c3415 = (C3415) childAt.getLayoutParams();
                if (c3415.f10760 == 0 && m49(childAt)) {
                    int i3 = c3415.f10759;
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
            C3415 c3416 = (C3415) childAt2.getLayoutParams();
            if (c3416.f10760 == 0 && m49(childAt2)) {
                int i5 = c3416.f10759;
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

    public final void m36(View view, boolean z) {
        C3415 c3415M32;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c3415M32 = m31();
        } else {
            c3415M32 = !checkLayoutParams(layoutParams) ? m32(layoutParams) : (C3415) layoutParams;
        }
        c3415M32.f10760 = 1;
        if (!z || this.f156 == null) {
            addView(view, c3415M32);
        } else {
            view.setLayoutParams(c3415M32);
            this.f178.add(view);
        }
    }

    public final void m37() {
        if (this.f155 == null) {
            C0220 c0220 = new C0220(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f155 = c0220;
            c0220.setImageDrawable(this.f153);
            this.f155.setContentDescription(this.f154);
            C3415 c3415M31 = m31();
            c3415M31.f10759 = (this.f161 & 112) | 8388611;
            c3415M31.f10760 = 2;
            this.f155.setLayoutParams(c3415M31);
            this.f155.setOnClickListener(new ViewOnClickListenerC0940(2, this));
        }
    }

    public final void m38() {
        if (this.f167 == null) {
            C2607 c2607 = new C2607();
            c2607.f8478 = 0;
            c2607.f8479 = 0;
            c2607.f8480 = -2147483648;
            c2607.f8481 = -2147483648;
            c2607.f8482 = 0;
            c2607.f8483 = 0;
            c2607.f8484 = false;
            c2607.f8485 = false;
            this.f167 = c2607;
        }
    }

    public final void m39() {
        if (this.f148 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f148 = actionMenuView;
            actionMenuView.setPopupTheme(this.f158);
            this.f148.setOnMenuItemClickListener(this.f182);
            ActionMenuView actionMenuView2 = this.f148;
            C3411 c3411 = new C3411(this);
            
            actionMenuView2.f83 = c3411;
            C3415 c3415M31 = m31();
            c3415M31.f10759 = (this.f161 & 112) | 8388613;
            this.f148.setLayoutParams(c3415M31);
            m36(this.f148, false);
        }
        ActionMenuView actionMenuView3 = this.f148;
        if (actionMenuView3.f79 == null) {
            MenuC1944 menuC1944 = (MenuC1944) actionMenuView3.getMenu();
            if (this.f184 == null) {
                this.f184 = new C3414(this);
            }
            this.f148.setExpandedActionViewsExclusive(true);
            menuC1944.m3755(this.f184, this.f157);
            m50();
        }
    }

    public final void m40() {
        if (this.f151 == null) {
            this.f151 = new C0220(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C3415 c3415M31 = m31();
            c3415M31.f10759 = (this.f161 & 112) | 8388611;
            this.f151.setLayoutParams(c3415M31);
        }
    }

    public final int m41(View view, int i) {
        C3415 c3415 = (C3415) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c3415.f10759 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f170 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c3415).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c3415).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c3415).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public void mo42(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void m43() {
        Iterator it = this.f181.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f180.f5843).iterator();
        if (it2.hasNext()) {
            
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f181 = currentMenuItems2;
    }

    public final boolean m44(View view) {
        return view.getParent() == this || this.f178.contains(view);
    }

    public final int m45(View view, int i, int i2, int[] iArr) {
        C3415 c3415 = (C3415) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c3415).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM41 = m41(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM41, iMax + measuredWidth, view.getMeasuredHeight() + iM41);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c3415).rightMargin + iMax;
    }

    public final int m46(View view, int i, int i2, int[] iArr) {
        C3415 c3415 = (C3415) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c3415).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM41 = m41(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM41, iMax, view.getMeasuredHeight() + iM41);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c3415).leftMargin);
    }

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

    public final boolean m49(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void m50() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM4928 = AbstractC3413.m4928(this);
            C3414 c3414 = this.f184;
            boolean z = (c3414 == null || c3414.f10757 == null || onBackInvokedDispatcherM4928 == null || !isAttachedToWindow() || !this.f188) ? false : true;
            if (z && this.f187 == null) {
                if (this.f186 == null) {
                    this.f186 = AbstractC3413.m4929(new RunnableC3410(this, 0));
                }
                AbstractC3413.m4930(onBackInvokedDispatcherM4928, this.f186);
                this.f187 = onBackInvokedDispatcherM4928;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f187) == null) {
                return;
            }
            AbstractC3413.m4931(onBackInvokedDispatcher, this.f186);
            this.f187 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f170 = 8388627;
        this.f177 = new ArrayList();
        this.f178 = new ArrayList();
        this.f179 = new int[2];
        new RunnableC3410(this, 1);
        C1744 c1744 = new C1744();
        c1744.f5843 = new CopyOnWriteArrayList();
        new HashMap();
        this.f180 = c1744;
        this.f181 = new ArrayList();
        this.f182 = new C3411(this);
        this.f189 = new RunnableC0141(17, this);
        Context context2 = getContext();
        int[] iArr = AbstractC2470.f7896;
        C0243 c0243M1307 = C0243.m1307(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC3578.m5176(this, context, iArr, attributeSet, (TypedArray) c0243M1307.f1404, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0243M1307.f1404;
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
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, -2147483648);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, -2147483648);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m38();
        C2607 c2607 = this.f167;
        c2607.f8485 = false;
        if (dimensionPixelSize != -2147483648) {
            c2607.f8482 = dimensionPixelSize;
            c2607.f8478 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != -2147483648) {
            c2607.f8483 = dimensionPixelSize2;
            c2607.f8479 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != -2147483648 || dimensionPixelOffset7 != -2147483648) {
            c2607.m4628(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f168 = typedArray.getDimensionPixelOffset(10, -2147483648);
        this.f169 = typedArray.getDimensionPixelOffset(6, -2147483648);
        this.f153 = c0243M1307.m1320(4);
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
        Drawable drawableM1320 = c0243M1307.m1320(16);
        if (drawableM1320 != null) {
            setNavigationIcon(drawableM1320);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM1321 = c0243M1307.m1320(11);
        if (drawableM1321 != null) {
            setLogo(drawableM1321);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0243M1307.m1319(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0243M1307.m1319(20));
        }
        if (typedArray.hasValue(14)) {
            mo42(typedArray.getResourceId(14, 0));
        }
        c0243M1307.m1329();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3415 c3415 = new C3415(context, attributeSet);
        c3415.f10759 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2470.f7878);
        c3415.f10759 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c3415.f10760 = 0;
        return c3415;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m37();
        }
        C0220 c0220 = this.f155;
        if (c0220 != null) {
            c0220.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m37();
            this.f155.setImageDrawable(drawable);
        } else {
            C0220 c0220 = this.f155;
            if (c0220 != null) {
                c0220.setImageDrawable(this.f153);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f152 == null) {
                this.f152 = new C0222(getContext());
            }
            if (!m44(this.f152)) {
                m36(this.f152, true);
            }
        } else {
            C0222 c0222 = this.f152;
            if (c0222 != null && m44(c0222)) {
                removeView(this.f152);
                this.f178.remove(this.f152);
            }
        }
        C0222 c0223 = this.f152;
        if (c0223 != null) {
            c0223.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f152 == null) {
            this.f152 = new C0222(getContext());
        }
        C0222 c0222 = this.f152;
        if (c0222 != null) {
            c0222.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40();
        }
        C0220 c0220 = this.f151;
        if (c0220 != null) {
            c0220.setContentDescription(charSequence);
            AbstractC3419.m4935(this.f151, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m40();
            if (!m44(this.f151)) {
                m36(this.f151, true);
            }
        } else {
            C0220 c0220 = this.f151;
            if (c0220 != null && m44(c0220)) {
                removeView(this.f151);
                this.f178.remove(this.f151);
            }
        }
        C0220 c0221 = this.f151;
        if (c0221 != null) {
            c0221.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0236 c0236 = this.f150;
            if (c0236 != null && m44(c0236)) {
                removeView(this.f150);
                this.f178.remove(this.f150);
            }
        } else {
            if (this.f150 == null) {
                Context context = getContext();
                C0236 c0237 = new C0236(context, null);
                this.f150 = c0237;
                c0237.setSingleLine();
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
        C0236 c0238 = this.f150;
        if (c0238 != null) {
            c0238.setText(charSequence);
        }
        this.f172 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f174 = colorStateList;
        C0236 c0236 = this.f150;
        if (c0236 != null) {
            c0236.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0236 c0236 = this.f149;
            if (c0236 != null && m44(c0236)) {
                removeView(this.f149);
                this.f178.remove(this.f149);
            }
        } else {
            if (this.f149 == null) {
                Context context = getContext();
                C0236 c0237 = new C0236(context, null);
                this.f149 = c0237;
                c0237.setSingleLine();
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
        C0236 c0238 = this.f149;
        if (c0238 != null) {
            c0238.setText(charSequence);
        }
        this.f171 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f173 = colorStateList;
        C0236 c0236 = this.f149;
        if (c0236 != null) {
            c0236.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC3416 interfaceC3416) {
    }
}
