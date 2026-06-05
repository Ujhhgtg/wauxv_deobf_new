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
import p000.AbstractC0801feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1730Ujhhgtgfeyxiexzf;
import p000.AbstractC1763feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3560feyxiexzfUjhhgtg;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C0952feyxiexzfUjhhgtg;
import p000.C1171feyxiexzfUjhhgtg;
import p000.C1723Ujhhgtgfeyxiexzf;
import p000.C1729Ujhhgtgfeyxiexzf;
import p000.C1732Ujhhgtgfeyxiexzf;
import p000.C1733Ujhhgtgfeyxiexzf;
import p000.C1762feyxiexzfUjhhgtg;
import p000.C2341Ujhhgtgfeyxiexzf;
import p000.C2343Ujhhgtgfeyxiexzf;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C2384Ujhhgtgfeyxiexzf;
import p000.C3001Ujhhgtgfeyxiexzf;
import p000.C3007Ujhhgtgfeyxiexzf;
import p000.InterfaceC1728Ujhhgtgfeyxiexzf;
import p000.InterfaceC3094Ujhhgtgfeyxiexzf;
import p000.MenuC0355Ujhhgtgfeyxiexzf;
import p000.MenuItemC0357Ujhhgtgfeyxiexzf;
import p000.RunnableC1722Ujhhgtgfeyxiexzf;
import p000.RunnableC3012feyxiexzfUjhhgtg;
import p000.ViewOnClickListenerC3079Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public ActionMenuView f149Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C2384Ujhhgtgfeyxiexzf f150Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2384Ujhhgtgfeyxiexzf f151Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C2341Ujhhgtgfeyxiexzf f152Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C2343Ujhhgtgfeyxiexzf f153Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Drawable f154Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final CharSequence f155Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2341Ujhhgtgfeyxiexzf f156Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public View f157Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Context f158Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f159Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f160Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f161Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f162Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int f163Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f164Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int f165Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f166Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f167Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C0952feyxiexzfUjhhgtg f168Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f169Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f170Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f171feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public CharSequence f172feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public CharSequence f173feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public ColorStateList f174feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public ColorStateList f175feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f176feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public boolean f177feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final ArrayList f178feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final ArrayList f179feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int[] f180feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final C0709Ujhhgtgfeyxiexzf f181feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ArrayList f182feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final C1723Ujhhgtgfeyxiexzf f183feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public C1762feyxiexzfUjhhgtg f184feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public C1733Ujhhgtgfeyxiexzf f185feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f186feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public OnBackInvokedCallback f187feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f188feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public boolean f189feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public final RunnableC3012feyxiexzfUjhhgtg f190feyxiexzfUjhhgtg;

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
        return new C1171feyxiexzfUjhhgtg(getContext());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static C1732Ujhhgtgfeyxiexzf m31Ujhhgtgfeyxiexzf() {
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf = new C1732Ujhhgtgfeyxiexzf(-2, -2);
        c1732Ujhhgtgfeyxiexzf.f5806Ujhhgtgfeyxiexzf = 0;
        c1732Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf = 8388627;
        return c1732Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static C1732Ujhhgtgfeyxiexzf m32Ujhhgtgfeyxiexzf(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C1732Ujhhgtgfeyxiexzf;
        if (z) {
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) layoutParams;
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf2 = new C1732Ujhhgtgfeyxiexzf(c1732Ujhhgtgfeyxiexzf);
            c1732Ujhhgtgfeyxiexzf2.f5806Ujhhgtgfeyxiexzf = 0;
            c1732Ujhhgtgfeyxiexzf2.f5806Ujhhgtgfeyxiexzf = c1732Ujhhgtgfeyxiexzf.f5806Ujhhgtgfeyxiexzf;
            return c1732Ujhhgtgfeyxiexzf2;
        }
        if (z) {
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf3 = new C1732Ujhhgtgfeyxiexzf((C1732Ujhhgtgfeyxiexzf) layoutParams);
            c1732Ujhhgtgfeyxiexzf3.f5806Ujhhgtgfeyxiexzf = 0;
            return c1732Ujhhgtgfeyxiexzf3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf4 = new C1732Ujhhgtgfeyxiexzf(layoutParams);
            c1732Ujhhgtgfeyxiexzf4.f5806Ujhhgtgfeyxiexzf = 0;
            return c1732Ujhhgtgfeyxiexzf4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf5 = new C1732Ujhhgtgfeyxiexzf(marginLayoutParams);
        c1732Ujhhgtgfeyxiexzf5.f5806Ujhhgtgfeyxiexzf = 0;
        ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf5).bottomMargin = marginLayoutParams.bottomMargin;
        return c1732Ujhhgtgfeyxiexzf5;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m33Ujhhgtgfeyxiexzf(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static int m34Ujhhgtgfeyxiexzf(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1732Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m31Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m32Ujhhgtgfeyxiexzf(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f156Ujhhgtgfeyxiexzf;
        if (c2341Ujhhgtgfeyxiexzf != null) {
            return c2341Ujhhgtgfeyxiexzf.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f156Ujhhgtgfeyxiexzf;
        if (c2341Ujhhgtgfeyxiexzf != null) {
            return c2341Ujhhgtgfeyxiexzf.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0952feyxiexzfUjhhgtg c0952feyxiexzfUjhhgtg = this.f168Ujhhgtgfeyxiexzf;
        if (c0952feyxiexzfUjhhgtg != null) {
            return c0952feyxiexzfUjhhgtg.f3818Ujhhgtgfeyxiexzf ? c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf : c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f170Ujhhgtgfeyxiexzf;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0952feyxiexzfUjhhgtg c0952feyxiexzfUjhhgtg = this.f168Ujhhgtgfeyxiexzf;
        if (c0952feyxiexzfUjhhgtg != null) {
            return c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0952feyxiexzfUjhhgtg c0952feyxiexzfUjhhgtg = this.f168Ujhhgtgfeyxiexzf;
        if (c0952feyxiexzfUjhhgtg != null) {
            return c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0952feyxiexzfUjhhgtg c0952feyxiexzfUjhhgtg = this.f168Ujhhgtgfeyxiexzf;
        if (c0952feyxiexzfUjhhgtg != null) {
            return c0952feyxiexzfUjhhgtg.f3818Ujhhgtgfeyxiexzf ? c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf : c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f169Ujhhgtgfeyxiexzf;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf;
        ActionMenuView actionMenuView = this.f149Ujhhgtgfeyxiexzf;
        return (actionMenuView == null || (menuC0355Ujhhgtgfeyxiexzf = actionMenuView.f80Ujhhgtgfeyxiexzf) == null || !menuC0355Ujhhgtgfeyxiexzf.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f170Ujhhgtgfeyxiexzf, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f169Ujhhgtgfeyxiexzf, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C2343Ujhhgtgfeyxiexzf c2343Ujhhgtgfeyxiexzf = this.f153Ujhhgtgfeyxiexzf;
        if (c2343Ujhhgtgfeyxiexzf != null) {
            return c2343Ujhhgtgfeyxiexzf.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C2343Ujhhgtgfeyxiexzf c2343Ujhhgtgfeyxiexzf = this.f153Ujhhgtgfeyxiexzf;
        if (c2343Ujhhgtgfeyxiexzf != null) {
            return c2343Ujhhgtgfeyxiexzf.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m39Ujhhgtgfeyxiexzf();
        return this.f149Ujhhgtgfeyxiexzf.getMenu();
    }

    public View getNavButtonView() {
        return this.f152Ujhhgtgfeyxiexzf;
    }

    public CharSequence getNavigationContentDescription() {
        C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f152Ujhhgtgfeyxiexzf;
        if (c2341Ujhhgtgfeyxiexzf != null) {
            return c2341Ujhhgtgfeyxiexzf.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f152Ujhhgtgfeyxiexzf;
        if (c2341Ujhhgtgfeyxiexzf != null) {
            return c2341Ujhhgtgfeyxiexzf.getDrawable();
        }
        return null;
    }

    public C3007Ujhhgtgfeyxiexzf getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        m39Ujhhgtgfeyxiexzf();
        return this.f149Ujhhgtgfeyxiexzf.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f158Ujhhgtgfeyxiexzf;
    }

    public int getPopupTheme() {
        return this.f159Ujhhgtgfeyxiexzf;
    }

    public CharSequence getSubtitle() {
        return this.f173feyxiexzfUjhhgtg;
    }

    public final TextView getSubtitleTextView() {
        return this.f151Ujhhgtgfeyxiexzf;
    }

    public CharSequence getTitle() {
        return this.f172feyxiexzfUjhhgtg;
    }

    public int getTitleMarginBottom() {
        return this.f167Ujhhgtgfeyxiexzf;
    }

    public int getTitleMarginEnd() {
        return this.f165Ujhhgtgfeyxiexzf;
    }

    public int getTitleMarginStart() {
        return this.f164Ujhhgtgfeyxiexzf;
    }

    public int getTitleMarginTop() {
        return this.f166Ujhhgtgfeyxiexzf;
    }

    public final TextView getTitleTextView() {
        return this.f150Ujhhgtgfeyxiexzf;
    }

    public InterfaceC3094Ujhhgtgfeyxiexzf getWrapper() {
        Drawable drawable;
        if (this.f184feyxiexzfUjhhgtg == null) {
            C1762feyxiexzfUjhhgtg c1762feyxiexzfUjhhgtg = new C1762feyxiexzfUjhhgtg();
            c1762feyxiexzfUjhhgtg.f5935Ujhhgtgfeyxiexzf = 0;
            c1762feyxiexzfUjhhgtg.f5924Ujhhgtgfeyxiexzf = this;
            c1762feyxiexzfUjhhgtg.f5931Ujhhgtgfeyxiexzf = getTitle();
            c1762feyxiexzfUjhhgtg.f5932Ujhhgtgfeyxiexzf = getSubtitle();
            c1762feyxiexzfUjhhgtg.f5930Ujhhgtgfeyxiexzf = c1762feyxiexzfUjhhgtg.f5931Ujhhgtgfeyxiexzf != null;
            c1762feyxiexzfUjhhgtg.f5929Ujhhgtgfeyxiexzf = getNavigationIcon();
            C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(getContext(), null, AbstractC0801feyxiexzfUjhhgtg.f3158Ujhhgtgfeyxiexzf, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
            c1762feyxiexzfUjhhgtg.f5936Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1762feyxiexzfUjhhgtg.f5930Ujhhgtgfeyxiexzf = true;
                c1762feyxiexzfUjhhgtg.f5931Ujhhgtgfeyxiexzf = text;
                if ((c1762feyxiexzfUjhhgtg.f5925Ujhhgtgfeyxiexzf & 8) != 0) {
                    setTitle(text);
                    if (c1762feyxiexzfUjhhgtg.f5930Ujhhgtgfeyxiexzf) {
                        AbstractC1901feyxiexzfUjhhgtg.m3266Ujhhgtgfeyxiexzf(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1762feyxiexzfUjhhgtg.f5932Ujhhgtgfeyxiexzf = text2;
                if ((c1762feyxiexzfUjhhgtg.f5925Ujhhgtgfeyxiexzf & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM3602Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(20);
            if (drawableM3602Ujhhgtgfeyxiexzf != null) {
                c1762feyxiexzfUjhhgtg.f5928Ujhhgtgfeyxiexzf = drawableM3602Ujhhgtgfeyxiexzf;
                c1762feyxiexzfUjhhgtg.m3058Ujhhgtgfeyxiexzf();
            }
            Drawable drawableM3602Ujhhgtgfeyxiexzf2 = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(17);
            if (drawableM3602Ujhhgtgfeyxiexzf2 != null) {
                c1762feyxiexzfUjhhgtg.f5927Ujhhgtgfeyxiexzf = drawableM3602Ujhhgtgfeyxiexzf2;
                c1762feyxiexzfUjhhgtg.m3058Ujhhgtgfeyxiexzf();
            }
            if (c1762feyxiexzfUjhhgtg.f5929Ujhhgtgfeyxiexzf == null && (drawable = c1762feyxiexzfUjhhgtg.f5936Ujhhgtgfeyxiexzf) != null) {
                c1762feyxiexzfUjhhgtg.f5929Ujhhgtgfeyxiexzf = drawable;
                if ((c1762feyxiexzfUjhhgtg.f5925Ujhhgtgfeyxiexzf & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c1762feyxiexzfUjhhgtg.m3056Ujhhgtgfeyxiexzf(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1762feyxiexzfUjhhgtg.f5926Ujhhgtgfeyxiexzf;
                if (view != null && (c1762feyxiexzfUjhhgtg.f5925Ujhhgtgfeyxiexzf & 16) != 0) {
                    removeView(view);
                }
                c1762feyxiexzfUjhhgtg.f5926Ujhhgtgfeyxiexzf = viewInflate;
                if (viewInflate != null && (c1762feyxiexzfUjhhgtg.f5925Ujhhgtgfeyxiexzf & 16) != 0) {
                    addView(viewInflate);
                }
                c1762feyxiexzfUjhhgtg.m3056Ujhhgtgfeyxiexzf(c1762feyxiexzfUjhhgtg.f5925Ujhhgtgfeyxiexzf | 16);
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
                m38Ujhhgtgfeyxiexzf();
                this.f168Ujhhgtgfeyxiexzf.m2439Ujhhgtgfeyxiexzf(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f160Ujhhgtgfeyxiexzf = resourceId2;
                C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f150Ujhhgtgfeyxiexzf;
                if (c2384Ujhhgtgfeyxiexzf != null) {
                    c2384Ujhhgtgfeyxiexzf.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f161Ujhhgtgfeyxiexzf = resourceId3;
                C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = this.f151Ujhhgtgfeyxiexzf;
                if (c2384Ujhhgtgfeyxiexzf2 != null) {
                    c2384Ujhhgtgfeyxiexzf2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
            if (R.string.abc_action_bar_up_description != c1762feyxiexzfUjhhgtg.f5935Ujhhgtgfeyxiexzf) {
                c1762feyxiexzfUjhhgtg.f5935Ujhhgtgfeyxiexzf = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c1762feyxiexzfUjhhgtg.f5935Ujhhgtgfeyxiexzf;
                    c1762feyxiexzfUjhhgtg.f5933Ujhhgtgfeyxiexzf = i != 0 ? getContext().getString(i) : null;
                    c1762feyxiexzfUjhhgtg.m3057Ujhhgtgfeyxiexzf();
                }
            }
            c1762feyxiexzfUjhhgtg.f5933Ujhhgtgfeyxiexzf = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC3079Ujhhgtgfeyxiexzf(c1762feyxiexzfUjhhgtg));
            this.f184feyxiexzfUjhhgtg = c1762feyxiexzfUjhhgtg;
        }
        return this.f184feyxiexzfUjhhgtg;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m50Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f190feyxiexzfUjhhgtg);
        m50Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f177feyxiexzfUjhhgtg = false;
        }
        if (!this.f177feyxiexzfUjhhgtg) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f177feyxiexzfUjhhgtg = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f177feyxiexzfUjhhgtg = false;
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
        int iM45Ujhhgtgfeyxiexzf;
        int iM46Ujhhgtgfeyxiexzf;
        int iMax;
        int iMin;
        boolean zM49Ujhhgtgfeyxiexzf;
        boolean zM49Ujhhgtgfeyxiexzf2;
        int measuredHeight;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2;
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf;
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf2;
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
        int iM45Ujhhgtgfeyxiexzf2;
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
        int[] iArr = this.f180feyxiexzfUjhhgtg;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m49Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf)) {
            if (z3) {
                iM46Ujhhgtgfeyxiexzf = m46Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf, i26, iMin2, iArr);
                iM45Ujhhgtgfeyxiexzf = paddingLeft;
            } else {
                iM45Ujhhgtgfeyxiexzf = m45Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf, paddingLeft, iMin2, iArr);
            }
            if (m49Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf)) {
                if (z3) {
                    iM46Ujhhgtgfeyxiexzf = m46Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf, iM46Ujhhgtgfeyxiexzf, iMin2, iArr);
                } else {
                    iM45Ujhhgtgfeyxiexzf = m45Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf, iM45Ujhhgtgfeyxiexzf, iMin2, iArr);
                }
            }
            if (m49Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf)) {
                if (z3) {
                    iM45Ujhhgtgfeyxiexzf = m45Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf, iM45Ujhhgtgfeyxiexzf, iMin2, iArr);
                } else {
                    iM46Ujhhgtgfeyxiexzf = m46Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf, iM46Ujhhgtgfeyxiexzf, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM45Ujhhgtgfeyxiexzf);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iM46Ujhhgtgfeyxiexzf));
            iMax = Math.max(iM45Ujhhgtgfeyxiexzf, currentContentInsetLeft);
            iMin = Math.min(iM46Ujhhgtgfeyxiexzf, i26 - currentContentInsetRight);
            if (m49Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf)) {
                if (z3) {
                    iMin = m46Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf, iMin, iMin2, iArr);
                } else {
                    iMax = m45Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf, iMax, iMin2, iArr);
                }
            }
            if (m49Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf)) {
                if (z3) {
                    iMin = m46Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf, iMin, iMin2, iArr);
                } else {
                    iMax = m45Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf, iMax, iMin2, iArr);
                }
            }
            zM49Ujhhgtgfeyxiexzf = m49Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf);
            zM49Ujhhgtgfeyxiexzf2 = m49Ujhhgtgfeyxiexzf(this.f151Ujhhgtgfeyxiexzf);
            if (zM49Ujhhgtgfeyxiexzf) {
                C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf3 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
                measuredHeight = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf3).topMargin + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM49Ujhhgtgfeyxiexzf2) {
                C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf4 = (C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams();
                measuredHeight = this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf4).topMargin + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf4).bottomMargin + measuredHeight;
            }
            if (zM49Ujhhgtgfeyxiexzf || zM49Ujhhgtgfeyxiexzf2) {
                if (zM49Ujhhgtgfeyxiexzf) {
                    c2384Ujhhgtgfeyxiexzf = this.f150Ujhhgtgfeyxiexzf;
                } else {
                    c2384Ujhhgtgfeyxiexzf = this.f151Ujhhgtgfeyxiexzf;
                }
                if (zM49Ujhhgtgfeyxiexzf2) {
                    c2384Ujhhgtgfeyxiexzf2 = this.f151Ujhhgtgfeyxiexzf;
                } else {
                    c2384Ujhhgtgfeyxiexzf2 = this.f150Ujhhgtgfeyxiexzf;
                }
                c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) c2384Ujhhgtgfeyxiexzf.getLayoutParams();
                c1732Ujhhgtgfeyxiexzf2 = (C1732Ujhhgtgfeyxiexzf) c2384Ujhhgtgfeyxiexzf2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zM49Ujhhgtgfeyxiexzf && this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth() > 0) || (zM49Ujhhgtgfeyxiexzf2 && this.f151Ujhhgtgfeyxiexzf.getMeasuredWidth() > 0);
                i6 = this.f171feyxiexzfUjhhgtg & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).topMargin + this.f166Ujhhgtgfeyxiexzf;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).topMargin + this.f166Ujhhgtgfeyxiexzf;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).bottomMargin;
                        i17 = this.f167Ujhhgtgfeyxiexzf;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf2).bottomMargin) - this.f167Ujhhgtgfeyxiexzf) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.f164Ujhhgtgfeyxiexzf;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM49Ujhhgtgfeyxiexzf) {
                        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf5 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
                        int measuredWidth2 = iMin - this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth();
                        int measuredHeight2 = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + paddingTop;
                        this.f150Ujhhgtgfeyxiexzf.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f165Ujhhgtgfeyxiexzf;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM49Ujhhgtgfeyxiexzf2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams())).topMargin;
                        this.f151Ujhhgtgfeyxiexzf.layout(iMin - this.f151Ujhhgtgfeyxiexzf.getMeasuredWidth(), i28, iMin, this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + i28);
                        i13 = iMin - this.f165Ujhhgtgfeyxiexzf;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.f164Ujhhgtgfeyxiexzf;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zM49Ujhhgtgfeyxiexzf) {
                        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf6 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
                        int measuredWidth3 = this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + paddingTop;
                        this.f150Ujhhgtgfeyxiexzf.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f165Ujhhgtgfeyxiexzf;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM49Ujhhgtgfeyxiexzf2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f151Ujhhgtgfeyxiexzf.getMeasuredWidth() + iMax;
                        this.f151Ujhhgtgfeyxiexzf.layout(iMax, i30, measuredWidth4, this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.f165Ujhhgtgfeyxiexzf;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.f178feyxiexzfUjhhgtg;
            m35Ujhhgtgfeyxiexzf(arrayList, 3);
            size = arrayList.size();
            iM45Ujhhgtgfeyxiexzf2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM45Ujhhgtgfeyxiexzf2 = m45Ujhhgtgfeyxiexzf((View) arrayList.get(i18), iM45Ujhhgtgfeyxiexzf2, iMin2, iArr);
            }
            m35Ujhhgtgfeyxiexzf(arrayList, 5);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = m46Ujhhgtgfeyxiexzf((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            m35Ujhhgtgfeyxiexzf(arrayList, 1);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = (View) arrayList.get(i22);
                C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf7 = (C1732Ujhhgtgfeyxiexzf) view.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf7).rightMargin - i32;
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
            if (i24 >= iM45Ujhhgtgfeyxiexzf2) {
                if (i25 > iMin) {
                    iM45Ujhhgtgfeyxiexzf2 = i24 - (i25 - iMin);
                } else {
                    iM45Ujhhgtgfeyxiexzf2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iM45Ujhhgtgfeyxiexzf2 = m45Ujhhgtgfeyxiexzf((View) arrayList.get(i23), iM45Ujhhgtgfeyxiexzf2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM45Ujhhgtgfeyxiexzf = paddingLeft;
        iM46Ujhhgtgfeyxiexzf = i26;
        if (m49Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf)) {
            if (z3) {
                iM46Ujhhgtgfeyxiexzf = m46Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf, iM46Ujhhgtgfeyxiexzf, iMin2, iArr);
            } else {
                iM45Ujhhgtgfeyxiexzf = m45Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf, iM45Ujhhgtgfeyxiexzf, iMin2, iArr);
            }
        }
        if (m49Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf)) {
            if (z3) {
                iM45Ujhhgtgfeyxiexzf = m45Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf, iM45Ujhhgtgfeyxiexzf, iMin2, iArr);
            } else {
                iM46Ujhhgtgfeyxiexzf = m46Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf, iM46Ujhhgtgfeyxiexzf, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM45Ujhhgtgfeyxiexzf);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iM46Ujhhgtgfeyxiexzf));
        iMax = Math.max(iM45Ujhhgtgfeyxiexzf, currentContentInsetLeft2);
        iMin = Math.min(iM46Ujhhgtgfeyxiexzf, i26 - currentContentInsetRight2);
        if (m49Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf)) {
            if (z3) {
                iMin = m46Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf, iMin, iMin2, iArr);
            } else {
                iMax = m45Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf, iMax, iMin2, iArr);
            }
        }
        if (m49Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf)) {
            if (z3) {
                iMin = m46Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf, iMin, iMin2, iArr);
            } else {
                iMax = m45Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf, iMax, iMin2, iArr);
            }
        }
        zM49Ujhhgtgfeyxiexzf = m49Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf);
        zM49Ujhhgtgfeyxiexzf2 = m49Ujhhgtgfeyxiexzf(this.f151Ujhhgtgfeyxiexzf);
        if (zM49Ujhhgtgfeyxiexzf) {
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf8 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
            measuredHeight = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf8).topMargin + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM49Ujhhgtgfeyxiexzf2) {
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf9 = (C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams();
            measuredHeight = this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf9).topMargin + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf9).bottomMargin + measuredHeight;
        }
        if (zM49Ujhhgtgfeyxiexzf) {
            if (zM49Ujhhgtgfeyxiexzf) {
                c2384Ujhhgtgfeyxiexzf = this.f150Ujhhgtgfeyxiexzf;
            } else {
                c2384Ujhhgtgfeyxiexzf = this.f151Ujhhgtgfeyxiexzf;
            }
            if (zM49Ujhhgtgfeyxiexzf2) {
                c2384Ujhhgtgfeyxiexzf2 = this.f151Ujhhgtgfeyxiexzf;
            } else {
                c2384Ujhhgtgfeyxiexzf2 = this.f150Ujhhgtgfeyxiexzf;
            }
            c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) c2384Ujhhgtgfeyxiexzf.getLayoutParams();
            c1732Ujhhgtgfeyxiexzf2 = (C1732Ujhhgtgfeyxiexzf) c2384Ujhhgtgfeyxiexzf2.getLayoutParams();
            i5 = measuredHeight;
            if (zM49Ujhhgtgfeyxiexzf) {
            }
            i6 = this.f171feyxiexzfUjhhgtg & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).topMargin + this.f166Ujhhgtgfeyxiexzf;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).topMargin + this.f166Ujhhgtgfeyxiexzf;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).bottomMargin;
                    i17 = this.f167Ujhhgtgfeyxiexzf;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf2).bottomMargin) - this.f167Ujhhgtgfeyxiexzf) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f164Ujhhgtgfeyxiexzf;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM49Ujhhgtgfeyxiexzf) {
                    C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf10 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
                    int measuredWidth5 = iMin - this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth();
                    int measuredHeight4 = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + paddingTop;
                    this.f150Ujhhgtgfeyxiexzf.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f165Ujhhgtgfeyxiexzf;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM49Ujhhgtgfeyxiexzf2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams())).topMargin;
                    this.f151Ujhhgtgfeyxiexzf.layout(iMin - this.f151Ujhhgtgfeyxiexzf.getMeasuredWidth(), i211, iMin, this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + i211);
                    i13 = iMin - this.f165Ujhhgtgfeyxiexzf;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f164Ujhhgtgfeyxiexzf;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zM49Ujhhgtgfeyxiexzf) {
                    C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf11 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
                    int measuredWidth6 = this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + paddingTop;
                    this.f150Ujhhgtgfeyxiexzf.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f165Ujhhgtgfeyxiexzf;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM49Ujhhgtgfeyxiexzf2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f151Ujhhgtgfeyxiexzf.getMeasuredWidth() + iMax;
                    this.f151Ujhhgtgfeyxiexzf.layout(iMax, i35, measuredWidth7, this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.f165Ujhhgtgfeyxiexzf;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zM49Ujhhgtgfeyxiexzf) {
                c2384Ujhhgtgfeyxiexzf = this.f150Ujhhgtgfeyxiexzf;
            } else {
                c2384Ujhhgtgfeyxiexzf = this.f151Ujhhgtgfeyxiexzf;
            }
            if (zM49Ujhhgtgfeyxiexzf2) {
                c2384Ujhhgtgfeyxiexzf2 = this.f151Ujhhgtgfeyxiexzf;
            } else {
                c2384Ujhhgtgfeyxiexzf2 = this.f150Ujhhgtgfeyxiexzf;
            }
            c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) c2384Ujhhgtgfeyxiexzf.getLayoutParams();
            c1732Ujhhgtgfeyxiexzf2 = (C1732Ujhhgtgfeyxiexzf) c2384Ujhhgtgfeyxiexzf2.getLayoutParams();
            i5 = measuredHeight;
            if (zM49Ujhhgtgfeyxiexzf) {
            }
            i6 = this.f171feyxiexzfUjhhgtg & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).topMargin + this.f166Ujhhgtgfeyxiexzf;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).topMargin + this.f166Ujhhgtgfeyxiexzf;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).bottomMargin;
                    i17 = this.f167Ujhhgtgfeyxiexzf;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf2).bottomMargin) - this.f167Ujhhgtgfeyxiexzf) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f164Ujhhgtgfeyxiexzf;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM49Ujhhgtgfeyxiexzf) {
                    C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf12 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
                    int measuredWidth8 = iMin - this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth();
                    int measuredHeight6 = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + paddingTop;
                    this.f150Ujhhgtgfeyxiexzf.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f165Ujhhgtgfeyxiexzf;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM49Ujhhgtgfeyxiexzf2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams())).topMargin;
                    this.f151Ujhhgtgfeyxiexzf.layout(iMin - this.f151Ujhhgtgfeyxiexzf.getMeasuredWidth(), i214, iMin, this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + i214);
                    i13 = iMin - this.f165Ujhhgtgfeyxiexzf;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f164Ujhhgtgfeyxiexzf;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zM49Ujhhgtgfeyxiexzf) {
                    C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf13 = (C1732Ujhhgtgfeyxiexzf) this.f150Ujhhgtgfeyxiexzf.getLayoutParams();
                    int measuredWidth9 = this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight() + paddingTop;
                    this.f150Ujhhgtgfeyxiexzf.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f165Ujhhgtgfeyxiexzf;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM49Ujhhgtgfeyxiexzf2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1732Ujhhgtgfeyxiexzf) this.f151Ujhhgtgfeyxiexzf.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f151Ujhhgtgfeyxiexzf.getMeasuredWidth() + iMax;
                    this.f151Ujhhgtgfeyxiexzf.layout(iMax, i36, measuredWidth10, this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.f165Ujhhgtgfeyxiexzf;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.f178feyxiexzfUjhhgtg;
        m35Ujhhgtgfeyxiexzf(arrayList, 3);
        size = arrayList.size();
        iM45Ujhhgtgfeyxiexzf2 = iMax;
        while (i18 < size) {
            iM45Ujhhgtgfeyxiexzf2 = m45Ujhhgtgfeyxiexzf((View) arrayList.get(i18), iM45Ujhhgtgfeyxiexzf2, iMin2, iArr);
        }
        m35Ujhhgtgfeyxiexzf(arrayList, 5);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = m46Ujhhgtgfeyxiexzf((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        m35Ujhhgtgfeyxiexzf(arrayList, 1);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = (View) arrayList.get(i22);
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf14 = (C1732Ujhhgtgfeyxiexzf) view2.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf14).rightMargin - i38;
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
        if (i24 >= iM45Ujhhgtgfeyxiexzf2) {
            if (i25 > iMin) {
                iM45Ujhhgtgfeyxiexzf2 = i24 - (i25 - iMin);
            } else {
                iM45Ujhhgtgfeyxiexzf2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iM45Ujhhgtgfeyxiexzf2 = m45Ujhhgtgfeyxiexzf((View) arrayList.get(i23), iM45Ujhhgtgfeyxiexzf2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM33Ujhhgtgfeyxiexzf;
        int iMax;
        int iCombineMeasuredStates;
        int iM33Ujhhgtgfeyxiexzf2;
        int iM34Ujhhgtgfeyxiexzf;
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
        if (m49Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf)) {
            m48Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf, i, 0, i2, this.f163Ujhhgtgfeyxiexzf);
            iM33Ujhhgtgfeyxiexzf = m33Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf) + this.f152Ujhhgtgfeyxiexzf.getMeasuredWidth();
            iMax = Math.max(0, m34Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf) + this.f152Ujhhgtgfeyxiexzf.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f152Ujhhgtgfeyxiexzf.getMeasuredState());
        } else {
            iM33Ujhhgtgfeyxiexzf = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m49Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf)) {
            m48Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf, i, 0, i2, this.f163Ujhhgtgfeyxiexzf);
            iM33Ujhhgtgfeyxiexzf = m33Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf) + this.f156Ujhhgtgfeyxiexzf.getMeasuredWidth();
            iMax = Math.max(iMax, m34Ujhhgtgfeyxiexzf(this.f156Ujhhgtgfeyxiexzf) + this.f156Ujhhgtgfeyxiexzf.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f156Ujhhgtgfeyxiexzf.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM33Ujhhgtgfeyxiexzf);
        int iMax4 = Math.max(0, currentContentInsetStart - iM33Ujhhgtgfeyxiexzf);
        Object[] objArr2 = objArr;
        int[] iArr = this.f180feyxiexzfUjhhgtg;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m49Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf)) {
            m48Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf, i, iMax3, i2, this.f163Ujhhgtgfeyxiexzf);
            iM33Ujhhgtgfeyxiexzf2 = m33Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf) + this.f149Ujhhgtgfeyxiexzf.getMeasuredWidth();
            iMax = Math.max(iMax, m34Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf) + this.f149Ujhhgtgfeyxiexzf.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f149Ujhhgtgfeyxiexzf.getMeasuredState());
        } else {
            iM33Ujhhgtgfeyxiexzf2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM33Ujhhgtgfeyxiexzf2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM33Ujhhgtgfeyxiexzf2);
        if (m49Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf)) {
            iMax5 += m47Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m34Ujhhgtgfeyxiexzf(this.f157Ujhhgtgfeyxiexzf) + this.f157Ujhhgtgfeyxiexzf.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f157Ujhhgtgfeyxiexzf.getMeasuredState());
        }
        if (m49Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf)) {
            iMax5 += m47Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m34Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf) + this.f153Ujhhgtgfeyxiexzf.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f153Ujhhgtgfeyxiexzf.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C1732Ujhhgtgfeyxiexzf) childAt.getLayoutParams()).f5806Ujhhgtgfeyxiexzf == 0 && m49Ujhhgtgfeyxiexzf(childAt)) {
                iMax5 += m47Ujhhgtgfeyxiexzf(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m34Ujhhgtgfeyxiexzf(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f166Ujhhgtgfeyxiexzf + this.f167Ujhhgtgfeyxiexzf;
        int i7 = this.f164Ujhhgtgfeyxiexzf + this.f165Ujhhgtgfeyxiexzf;
        if (m49Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf)) {
            m47Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf, i, i5 + i7, i2, i6, iArr);
            int iM33Ujhhgtgfeyxiexzf3 = m33Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf) + this.f150Ujhhgtgfeyxiexzf.getMeasuredWidth();
            iM34Ujhhgtgfeyxiexzf = m34Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf) + this.f150Ujhhgtgfeyxiexzf.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f150Ujhhgtgfeyxiexzf.getMeasuredState());
            iMax2 = iM33Ujhhgtgfeyxiexzf3;
        } else {
            iM34Ujhhgtgfeyxiexzf = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m49Ujhhgtgfeyxiexzf(this.f151Ujhhgtgfeyxiexzf)) {
            iMax2 = Math.max(iMax2, m47Ujhhgtgfeyxiexzf(this.f151Ujhhgtgfeyxiexzf, i, i5 + i7, i2, i6 + iM34Ujhhgtgfeyxiexzf, iArr));
            iM34Ujhhgtgfeyxiexzf += m34Ujhhgtgfeyxiexzf(this.f151Ujhhgtgfeyxiexzf) + this.f151Ujhhgtgfeyxiexzf.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f151Ujhhgtgfeyxiexzf.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM34Ujhhgtgfeyxiexzf);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f186feyxiexzfUjhhgtg) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m49Ujhhgtgfeyxiexzf(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1729Ujhhgtgfeyxiexzf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1729Ujhhgtgfeyxiexzf c1729Ujhhgtgfeyxiexzf = (C1729Ujhhgtgfeyxiexzf) parcelable;
        super.onRestoreInstanceState(c1729Ujhhgtgfeyxiexzf.f9210Ujhhgtgfeyxiexzf);
        ActionMenuView actionMenuView = this.f149Ujhhgtgfeyxiexzf;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = actionMenuView != null ? actionMenuView.f80Ujhhgtgfeyxiexzf : null;
        int i = c1729Ujhhgtgfeyxiexzf.f5802Ujhhgtgfeyxiexzf;
        if (i != 0 && this.f185feyxiexzfUjhhgtg != null && menuC0355Ujhhgtgfeyxiexzf != null && (menuItemFindItem = menuC0355Ujhhgtgfeyxiexzf.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1729Ujhhgtgfeyxiexzf.f5803Ujhhgtgfeyxiexzf) {
            RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = this.f190feyxiexzfUjhhgtg;
            removeCallbacks(runnableC3012feyxiexzfUjhhgtg);
            post(runnableC3012feyxiexzfUjhhgtg);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m38Ujhhgtgfeyxiexzf();
        C0952feyxiexzfUjhhgtg c0952feyxiexzfUjhhgtg = this.f168Ujhhgtgfeyxiexzf;
        boolean z = i == 1;
        if (z == c0952feyxiexzfUjhhgtg.f3818Ujhhgtgfeyxiexzf) {
            return;
        }
        c0952feyxiexzfUjhhgtg.f3818Ujhhgtgfeyxiexzf = z;
        if (!c0952feyxiexzfUjhhgtg.f3819Ujhhgtgfeyxiexzf) {
            c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf = c0952feyxiexzfUjhhgtg.f3816Ujhhgtgfeyxiexzf;
            c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf = c0952feyxiexzfUjhhgtg.f3817Ujhhgtgfeyxiexzf;
            return;
        }
        if (z) {
            int i2 = c0952feyxiexzfUjhhgtg.f3815Ujhhgtgfeyxiexzf;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0952feyxiexzfUjhhgtg.f3816Ujhhgtgfeyxiexzf;
            }
            c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf = i2;
            int i3 = c0952feyxiexzfUjhhgtg.f3814Ujhhgtgfeyxiexzf;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0952feyxiexzfUjhhgtg.f3817Ujhhgtgfeyxiexzf;
            }
            c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf = i3;
            return;
        }
        int i4 = c0952feyxiexzfUjhhgtg.f3814Ujhhgtgfeyxiexzf;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0952feyxiexzfUjhhgtg.f3816Ujhhgtgfeyxiexzf;
        }
        c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf = i4;
        int i5 = c0952feyxiexzfUjhhgtg.f3815Ujhhgtgfeyxiexzf;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0952feyxiexzfUjhhgtg.f3817Ujhhgtgfeyxiexzf;
        }
        c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf;
        C3001Ujhhgtgfeyxiexzf c3001Ujhhgtgfeyxiexzf;
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf;
        C1729Ujhhgtgfeyxiexzf c1729Ujhhgtgfeyxiexzf = new C1729Ujhhgtgfeyxiexzf(super.onSaveInstanceState());
        C1733Ujhhgtgfeyxiexzf c1733Ujhhgtgfeyxiexzf = this.f185feyxiexzfUjhhgtg;
        if (c1733Ujhhgtgfeyxiexzf != null && (menuItemC0357Ujhhgtgfeyxiexzf = c1733Ujhhgtgfeyxiexzf.f5808Ujhhgtgfeyxiexzf) != null) {
            c1729Ujhhgtgfeyxiexzf.f5802Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf.f2024Ujhhgtgfeyxiexzf;
        }
        ActionMenuView actionMenuView = this.f149Ujhhgtgfeyxiexzf;
        c1729Ujhhgtgfeyxiexzf.f5803Ujhhgtgfeyxiexzf = (actionMenuView == null || (c3007Ujhhgtgfeyxiexzf = actionMenuView.f83Ujhhgtgfeyxiexzf) == null || (c3001Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf.f9349Ujhhgtgfeyxiexzf) == null || !c3001Ujhhgtgfeyxiexzf.m1576Ujhhgtgfeyxiexzf()) ? false : true;
        return c1729Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f176feyxiexzfUjhhgtg = false;
        }
        if (!this.f176feyxiexzfUjhhgtg) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f176feyxiexzfUjhhgtg = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f176feyxiexzfUjhhgtg = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f189feyxiexzfUjhhgtg != z) {
            this.f189feyxiexzfUjhhgtg = z;
            m50Ujhhgtgfeyxiexzf();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f186feyxiexzfUjhhgtg = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f170Ujhhgtgfeyxiexzf) {
            this.f170Ujhhgtgfeyxiexzf = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f169Ujhhgtgfeyxiexzf) {
            this.f169Ujhhgtgfeyxiexzf = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m40Ujhhgtgfeyxiexzf();
        this.f152Ujhhgtgfeyxiexzf.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m39Ujhhgtgfeyxiexzf();
        this.f149Ujhhgtgfeyxiexzf.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f159Ujhhgtgfeyxiexzf != i) {
            this.f159Ujhhgtgfeyxiexzf = i;
            if (i == 0) {
                this.f158Ujhhgtgfeyxiexzf = getContext();
            } else {
                this.f158Ujhhgtgfeyxiexzf = new ContextThemeWrapper(getContext(), i);
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
        this.f167Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f165Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f164Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f166Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m35Ujhhgtgfeyxiexzf(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) childAt.getLayoutParams();
                if (c1732Ujhhgtgfeyxiexzf.f5806Ujhhgtgfeyxiexzf == 0 && m49Ujhhgtgfeyxiexzf(childAt)) {
                    int i3 = c1732Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf;
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
            C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf2 = (C1732Ujhhgtgfeyxiexzf) childAt2.getLayoutParams();
            if (c1732Ujhhgtgfeyxiexzf2.f5806Ujhhgtgfeyxiexzf == 0 && m49Ujhhgtgfeyxiexzf(childAt2)) {
                int i5 = c1732Ujhhgtgfeyxiexzf2.f5805Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m36Ujhhgtgfeyxiexzf(View view, boolean z) {
        C1732Ujhhgtgfeyxiexzf c1732UjhhgtgfeyxiexzfM32Ujhhgtgfeyxiexzf;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c1732UjhhgtgfeyxiexzfM32Ujhhgtgfeyxiexzf = m31Ujhhgtgfeyxiexzf();
        } else {
            c1732UjhhgtgfeyxiexzfM32Ujhhgtgfeyxiexzf = !checkLayoutParams(layoutParams) ? m32Ujhhgtgfeyxiexzf(layoutParams) : (C1732Ujhhgtgfeyxiexzf) layoutParams;
        }
        c1732UjhhgtgfeyxiexzfM32Ujhhgtgfeyxiexzf.f5806Ujhhgtgfeyxiexzf = 1;
        if (!z || this.f157Ujhhgtgfeyxiexzf == null) {
            addView(view, c1732UjhhgtgfeyxiexzfM32Ujhhgtgfeyxiexzf);
        } else {
            view.setLayoutParams(c1732UjhhgtgfeyxiexzfM32Ujhhgtgfeyxiexzf);
            this.f179feyxiexzfUjhhgtg.add(view);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m37Ujhhgtgfeyxiexzf() {
        if (this.f156Ujhhgtgfeyxiexzf == null) {
            C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = new C2341Ujhhgtgfeyxiexzf(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f156Ujhhgtgfeyxiexzf = c2341Ujhhgtgfeyxiexzf;
            c2341Ujhhgtgfeyxiexzf.setImageDrawable(this.f154Ujhhgtgfeyxiexzf);
            this.f156Ujhhgtgfeyxiexzf.setContentDescription(this.f155Ujhhgtgfeyxiexzf);
            C1732Ujhhgtgfeyxiexzf c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf = m31Ujhhgtgfeyxiexzf();
            c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf = (this.f162Ujhhgtgfeyxiexzf & 112) | 8388611;
            c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf.f5806Ujhhgtgfeyxiexzf = 2;
            this.f156Ujhhgtgfeyxiexzf.setLayoutParams(c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf);
            this.f156Ujhhgtgfeyxiexzf.setOnClickListener(new ViewOnClickListenerC3079Ujhhgtgfeyxiexzf(2, this));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m38Ujhhgtgfeyxiexzf() {
        if (this.f168Ujhhgtgfeyxiexzf == null) {
            C0952feyxiexzfUjhhgtg c0952feyxiexzfUjhhgtg = new C0952feyxiexzfUjhhgtg();
            c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf = 0;
            c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf = 0;
            c0952feyxiexzfUjhhgtg.f3814Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
            c0952feyxiexzfUjhhgtg.f3815Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
            c0952feyxiexzfUjhhgtg.f3816Ujhhgtgfeyxiexzf = 0;
            c0952feyxiexzfUjhhgtg.f3817Ujhhgtgfeyxiexzf = 0;
            c0952feyxiexzfUjhhgtg.f3818Ujhhgtgfeyxiexzf = false;
            c0952feyxiexzfUjhhgtg.f3819Ujhhgtgfeyxiexzf = false;
            this.f168Ujhhgtgfeyxiexzf = c0952feyxiexzfUjhhgtg;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m39Ujhhgtgfeyxiexzf() {
        if (this.f149Ujhhgtgfeyxiexzf == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f149Ujhhgtgfeyxiexzf = actionMenuView;
            actionMenuView.setPopupTheme(this.f159Ujhhgtgfeyxiexzf);
            this.f149Ujhhgtgfeyxiexzf.setOnMenuItemClickListener(this.f183feyxiexzfUjhhgtg);
            ActionMenuView actionMenuView2 = this.f149Ujhhgtgfeyxiexzf;
            C1723Ujhhgtgfeyxiexzf c1723Ujhhgtgfeyxiexzf = new C1723Ujhhgtgfeyxiexzf(this);
            actionMenuView2.getClass();
            actionMenuView2.f84Ujhhgtgfeyxiexzf = c1723Ujhhgtgfeyxiexzf;
            C1732Ujhhgtgfeyxiexzf c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf = m31Ujhhgtgfeyxiexzf();
            c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf = (this.f162Ujhhgtgfeyxiexzf & 112) | 8388613;
            this.f149Ujhhgtgfeyxiexzf.setLayoutParams(c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf);
            m36Ujhhgtgfeyxiexzf(this.f149Ujhhgtgfeyxiexzf, false);
        }
        ActionMenuView actionMenuView3 = this.f149Ujhhgtgfeyxiexzf;
        if (actionMenuView3.f80Ujhhgtgfeyxiexzf == null) {
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = (MenuC0355Ujhhgtgfeyxiexzf) actionMenuView3.getMenu();
            if (this.f185feyxiexzfUjhhgtg == null) {
                this.f185feyxiexzfUjhhgtg = new C1733Ujhhgtgfeyxiexzf(this);
            }
            this.f149Ujhhgtgfeyxiexzf.setExpandedActionViewsExclusive(true);
            menuC0355Ujhhgtgfeyxiexzf.m1543Ujhhgtgfeyxiexzf(this.f185feyxiexzfUjhhgtg, this.f158Ujhhgtgfeyxiexzf);
            m50Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m40Ujhhgtgfeyxiexzf() {
        if (this.f152Ujhhgtgfeyxiexzf == null) {
            this.f152Ujhhgtgfeyxiexzf = new C2341Ujhhgtgfeyxiexzf(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1732Ujhhgtgfeyxiexzf c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf = m31Ujhhgtgfeyxiexzf();
            c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf = (this.f162Ujhhgtgfeyxiexzf & 112) | 8388611;
            this.f152Ujhhgtgfeyxiexzf.setLayoutParams(c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int m41Ujhhgtgfeyxiexzf(View view, int i) {
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c1732Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f171feyxiexzfUjhhgtg & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo42Ujhhgtgfeyxiexzf(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m43Ujhhgtgfeyxiexzf() {
        Iterator it = this.f182feyxiexzfUjhhgtg.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f181feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).iterator();
        if (it2.hasNext()) {
            ((AbstractC3560feyxiexzfUjhhgtg) it2.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f182feyxiexzfUjhhgtg = currentMenuItems2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final boolean m44Ujhhgtgfeyxiexzf(View view) {
        return view.getParent() == this || this.f179feyxiexzfUjhhgtg.contains(view);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int m45Ujhhgtgfeyxiexzf(View view, int i, int i2, int[] iArr) {
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM41Ujhhgtgfeyxiexzf = m41Ujhhgtgfeyxiexzf(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM41Ujhhgtgfeyxiexzf, iMax + measuredWidth, view.getMeasuredHeight() + iM41Ujhhgtgfeyxiexzf);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m46Ujhhgtgfeyxiexzf(View view, int i, int i2, int[] iArr) {
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf = (C1732Ujhhgtgfeyxiexzf) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM41Ujhhgtgfeyxiexzf = m41Ujhhgtgfeyxiexzf(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM41Ujhhgtgfeyxiexzf, iMax, view.getMeasuredHeight() + iM41Ujhhgtgfeyxiexzf);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1732Ujhhgtgfeyxiexzf).leftMargin);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int m47Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m48Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final boolean m49Ujhhgtgfeyxiexzf(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m50Ujhhgtgfeyxiexzf() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM3000Ujhhgtgfeyxiexzf = AbstractC1730Ujhhgtgfeyxiexzf.m3000Ujhhgtgfeyxiexzf(this);
            C1733Ujhhgtgfeyxiexzf c1733Ujhhgtgfeyxiexzf = this.f185feyxiexzfUjhhgtg;
            boolean z = (c1733Ujhhgtgfeyxiexzf == null || c1733Ujhhgtgfeyxiexzf.f5808Ujhhgtgfeyxiexzf == null || onBackInvokedDispatcherM3000Ujhhgtgfeyxiexzf == null || !isAttachedToWindow() || !this.f189feyxiexzfUjhhgtg) ? false : true;
            if (z && this.f188feyxiexzfUjhhgtg == null) {
                if (this.f187feyxiexzfUjhhgtg == null) {
                    this.f187feyxiexzfUjhhgtg = AbstractC1730Ujhhgtgfeyxiexzf.m3001Ujhhgtgfeyxiexzf(new RunnableC1722Ujhhgtgfeyxiexzf(this, 0));
                }
                AbstractC1730Ujhhgtgfeyxiexzf.m3002Ujhhgtgfeyxiexzf(onBackInvokedDispatcherM3000Ujhhgtgfeyxiexzf, this.f187feyxiexzfUjhhgtg);
                this.f188feyxiexzfUjhhgtg = onBackInvokedDispatcherM3000Ujhhgtgfeyxiexzf;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f188feyxiexzfUjhhgtg) == null) {
                return;
            }
            AbstractC1730Ujhhgtgfeyxiexzf.m3003Ujhhgtgfeyxiexzf(onBackInvokedDispatcher, this.f187feyxiexzfUjhhgtg);
            this.f188feyxiexzfUjhhgtg = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f171feyxiexzfUjhhgtg = 8388627;
        this.f178feyxiexzfUjhhgtg = new ArrayList();
        this.f179feyxiexzfUjhhgtg = new ArrayList();
        this.f180feyxiexzfUjhhgtg = new int[2];
        new RunnableC1722Ujhhgtgfeyxiexzf(this, 1);
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf();
        c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf = new CopyOnWriteArrayList();
        new HashMap();
        this.f181feyxiexzfUjhhgtg = c0709Ujhhgtgfeyxiexzf;
        this.f182feyxiexzfUjhhgtg = new ArrayList();
        this.f183feyxiexzfUjhhgtg = new C1723Ujhhgtgfeyxiexzf(this);
        this.f190feyxiexzfUjhhgtg = new RunnableC3012feyxiexzfUjhhgtg(17, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3177Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(this, context, iArr, attributeSet, (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        this.f160Ujhhgtgfeyxiexzf = typedArray.getResourceId(28, 0);
        this.f161Ujhhgtgfeyxiexzf = typedArray.getResourceId(19, 0);
        this.f171feyxiexzfUjhhgtg = typedArray.getInteger(0, 8388627);
        this.f162Ujhhgtgfeyxiexzf = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f167Ujhhgtgfeyxiexzf = dimensionPixelOffset;
        this.f166Ujhhgtgfeyxiexzf = dimensionPixelOffset;
        this.f165Ujhhgtgfeyxiexzf = dimensionPixelOffset;
        this.f164Ujhhgtgfeyxiexzf = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f164Ujhhgtgfeyxiexzf = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f165Ujhhgtgfeyxiexzf = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f166Ujhhgtgfeyxiexzf = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f167Ujhhgtgfeyxiexzf = dimensionPixelOffset5;
        }
        this.f163Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m38Ujhhgtgfeyxiexzf();
        C0952feyxiexzfUjhhgtg c0952feyxiexzfUjhhgtg = this.f168Ujhhgtgfeyxiexzf;
        c0952feyxiexzfUjhhgtg.f3819Ujhhgtgfeyxiexzf = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0952feyxiexzfUjhhgtg.f3816Ujhhgtgfeyxiexzf = dimensionPixelSize;
            c0952feyxiexzfUjhhgtg.f3812Ujhhgtgfeyxiexzf = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0952feyxiexzfUjhhgtg.f3817Ujhhgtgfeyxiexzf = dimensionPixelSize2;
            c0952feyxiexzfUjhhgtg.f3813Ujhhgtgfeyxiexzf = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0952feyxiexzfUjhhgtg.m2439Ujhhgtgfeyxiexzf(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f169Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f170Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f154Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(4);
        this.f155Ujhhgtgfeyxiexzf = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f158Ujhhgtgfeyxiexzf = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM3602Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(16);
        if (drawableM3602Ujhhgtgfeyxiexzf != null) {
            setNavigationIcon(drawableM3602Ujhhgtgfeyxiexzf);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM3602Ujhhgtgfeyxiexzf2 = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(11);
        if (drawableM3602Ujhhgtgfeyxiexzf2 != null) {
            setLogo(drawableM3602Ujhhgtgfeyxiexzf2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(20));
        }
        if (typedArray.hasValue(14)) {
            mo42Ujhhgtgfeyxiexzf(typedArray.getResourceId(14, 0));
        }
        c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1732Ujhhgtgfeyxiexzf c1732Ujhhgtgfeyxiexzf = new C1732Ujhhgtgfeyxiexzf(context, attributeSet);
        c1732Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3159Ujhhgtgfeyxiexzf);
        c1732Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1732Ujhhgtgfeyxiexzf.f5806Ujhhgtgfeyxiexzf = 0;
        return c1732Ujhhgtgfeyxiexzf;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m37Ujhhgtgfeyxiexzf();
        }
        C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f156Ujhhgtgfeyxiexzf;
        if (c2341Ujhhgtgfeyxiexzf != null) {
            c2341Ujhhgtgfeyxiexzf.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m37Ujhhgtgfeyxiexzf();
            this.f156Ujhhgtgfeyxiexzf.setImageDrawable(drawable);
        } else {
            C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f156Ujhhgtgfeyxiexzf;
            if (c2341Ujhhgtgfeyxiexzf != null) {
                c2341Ujhhgtgfeyxiexzf.setImageDrawable(this.f154Ujhhgtgfeyxiexzf);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f153Ujhhgtgfeyxiexzf == null) {
                this.f153Ujhhgtgfeyxiexzf = new C2343Ujhhgtgfeyxiexzf(getContext());
            }
            if (!m44Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf)) {
                m36Ujhhgtgfeyxiexzf(this.f153Ujhhgtgfeyxiexzf, true);
            }
        } else {
            C2343Ujhhgtgfeyxiexzf c2343Ujhhgtgfeyxiexzf = this.f153Ujhhgtgfeyxiexzf;
            if (c2343Ujhhgtgfeyxiexzf != null && m44Ujhhgtgfeyxiexzf(c2343Ujhhgtgfeyxiexzf)) {
                removeView(this.f153Ujhhgtgfeyxiexzf);
                this.f179feyxiexzfUjhhgtg.remove(this.f153Ujhhgtgfeyxiexzf);
            }
        }
        C2343Ujhhgtgfeyxiexzf c2343Ujhhgtgfeyxiexzf2 = this.f153Ujhhgtgfeyxiexzf;
        if (c2343Ujhhgtgfeyxiexzf2 != null) {
            c2343Ujhhgtgfeyxiexzf2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f153Ujhhgtgfeyxiexzf == null) {
            this.f153Ujhhgtgfeyxiexzf = new C2343Ujhhgtgfeyxiexzf(getContext());
        }
        C2343Ujhhgtgfeyxiexzf c2343Ujhhgtgfeyxiexzf = this.f153Ujhhgtgfeyxiexzf;
        if (c2343Ujhhgtgfeyxiexzf != null) {
            c2343Ujhhgtgfeyxiexzf.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40Ujhhgtgfeyxiexzf();
        }
        C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f152Ujhhgtgfeyxiexzf;
        if (c2341Ujhhgtgfeyxiexzf != null) {
            c2341Ujhhgtgfeyxiexzf.setContentDescription(charSequence);
            AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m40Ujhhgtgfeyxiexzf();
            if (!m44Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf)) {
                m36Ujhhgtgfeyxiexzf(this.f152Ujhhgtgfeyxiexzf, true);
            }
        } else {
            C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf = this.f152Ujhhgtgfeyxiexzf;
            if (c2341Ujhhgtgfeyxiexzf != null && m44Ujhhgtgfeyxiexzf(c2341Ujhhgtgfeyxiexzf)) {
                removeView(this.f152Ujhhgtgfeyxiexzf);
                this.f179feyxiexzfUjhhgtg.remove(this.f152Ujhhgtgfeyxiexzf);
            }
        }
        C2341Ujhhgtgfeyxiexzf c2341Ujhhgtgfeyxiexzf2 = this.f152Ujhhgtgfeyxiexzf;
        if (c2341Ujhhgtgfeyxiexzf2 != null) {
            c2341Ujhhgtgfeyxiexzf2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f151Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf != null && m44Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf)) {
                removeView(this.f151Ujhhgtgfeyxiexzf);
                this.f179feyxiexzfUjhhgtg.remove(this.f151Ujhhgtgfeyxiexzf);
            }
        } else {
            if (this.f151Ujhhgtgfeyxiexzf == null) {
                Context context = getContext();
                C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = new C2384Ujhhgtgfeyxiexzf(context, null);
                this.f151Ujhhgtgfeyxiexzf = c2384Ujhhgtgfeyxiexzf2;
                c2384Ujhhgtgfeyxiexzf2.setSingleLine();
                this.f151Ujhhgtgfeyxiexzf.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f161Ujhhgtgfeyxiexzf;
                if (i != 0) {
                    this.f151Ujhhgtgfeyxiexzf.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f175feyxiexzfUjhhgtg;
                if (colorStateList != null) {
                    this.f151Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
                }
            }
            if (!m44Ujhhgtgfeyxiexzf(this.f151Ujhhgtgfeyxiexzf)) {
                m36Ujhhgtgfeyxiexzf(this.f151Ujhhgtgfeyxiexzf, true);
            }
        }
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf3 = this.f151Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf3 != null) {
            c2384Ujhhgtgfeyxiexzf3.setText(charSequence);
        }
        this.f173feyxiexzfUjhhgtg = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f175feyxiexzfUjhhgtg = colorStateList;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f151Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            c2384Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f150Ujhhgtgfeyxiexzf;
            if (c2384Ujhhgtgfeyxiexzf != null && m44Ujhhgtgfeyxiexzf(c2384Ujhhgtgfeyxiexzf)) {
                removeView(this.f150Ujhhgtgfeyxiexzf);
                this.f179feyxiexzfUjhhgtg.remove(this.f150Ujhhgtgfeyxiexzf);
            }
        } else {
            if (this.f150Ujhhgtgfeyxiexzf == null) {
                Context context = getContext();
                C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = new C2384Ujhhgtgfeyxiexzf(context, null);
                this.f150Ujhhgtgfeyxiexzf = c2384Ujhhgtgfeyxiexzf2;
                c2384Ujhhgtgfeyxiexzf2.setSingleLine();
                this.f150Ujhhgtgfeyxiexzf.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f160Ujhhgtgfeyxiexzf;
                if (i != 0) {
                    this.f150Ujhhgtgfeyxiexzf.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f174feyxiexzfUjhhgtg;
                if (colorStateList != null) {
                    this.f150Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
                }
            }
            if (!m44Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf)) {
                m36Ujhhgtgfeyxiexzf(this.f150Ujhhgtgfeyxiexzf, true);
            }
        }
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf3 = this.f150Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf3 != null) {
            c2384Ujhhgtgfeyxiexzf3.setText(charSequence);
        }
        this.f172feyxiexzfUjhhgtg = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f174feyxiexzfUjhhgtg = colorStateList;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f150Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf != null) {
            c2384Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC1728Ujhhgtgfeyxiexzf interfaceC1728Ujhhgtgfeyxiexzf) {
    }
}
