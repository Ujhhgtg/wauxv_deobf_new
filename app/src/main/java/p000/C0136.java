package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0136 implements InterfaceC1955 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Context f1105;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Context f1106;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public MenuC1944 f1107;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final LayoutInflater f1108;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC1954 f1109;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ActionMenuView f1111;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0133 f1112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Drawable f1113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f1116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f1117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f1118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f1119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f1120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C0130 f1122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public C0130 f1123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public RunnableC0132 f1124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public C0131 f1125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public int f1127;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f1110 = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final SparseBooleanArray f1121 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final C0094 f1126 = new C0094(1, this);

    public C0136(Context context) {
        this.f1105 = context;
        this.f1108 = LayoutInflater.from(context);
    }

    @Override // p000.InterfaceC1955
    public final int getId() {
        return 0;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1136(MenuC1944 menuC1944, boolean z) {
        m1141();
        C0130 c0130 = this.f1123;
        if (c0130 != null && c0130.m3781()) {
            c0130.f6465.dismiss();
        }
        InterfaceC1954 interfaceC1954 = this.f1109;
        if (interfaceC1954 != null) {
            interfaceC1954.mo1097(menuC1944, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1137(boolean z) {
        int i;
        ActionMenuView actionMenuView = this.f1111;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            MenuC1944 menuC1944 = this.f1107;
            if (menuC1944 != null) {
                menuC1944.m3762();
                ArrayList arrayListM3764 = this.f1107.m3764();
                int size = arrayListM3764.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayListM3764.get(i2);
                    if ((menuItemC1946.f6450 & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        MenuItemC1946 itemData = childAt instanceof InterfaceC1956 ? ((InterfaceC1956) childAt).getItemData() : null;
                        View viewM1140 = m1140(menuItemC1946, childAt, actionMenuView);
                        if (menuItemC1946 != itemData) {
                            viewM1140.setPressed(false);
                            viewM1140.jumpDrawablesToCurrentState();
                        }
                        if (viewM1140 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewM1140.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewM1140);
                            }
                            this.f1111.addView(viewM1140, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.f1112) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.f1111.requestLayout();
        MenuC1944 menuC1945 = this.f1107;
        if (menuC1945 != null) {
            menuC1945.m3762();
            ArrayList arrayList2 = menuC1945.f6415;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                
            }
        }
        MenuC1944 menuC1946 = this.f1107;
        if (menuC1946 != null) {
            menuC1946.m3762();
            arrayList = menuC1946.f6416;
        }
        if (this.f1115 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((MenuItemC1946) arrayList.get(0)).f6454;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1112 == null) {
                this.f1112 = new C0133(this, this.f1105);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f1112.getParent();
            if (viewGroup2 != this.f1111) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f1112);
                }
                ActionMenuView actionMenuView2 = this.f1111;
                C0133 c0133 = this.f1112;
                
                C0138 c0138M20 = ActionMenuView.m20();
                c0138M20.f1128 = true;
                actionMenuView2.addView(c0133, c0138M20);
            }
        } else {
            C0133 c0134 = this.f1112;
            if (c0134 != null) {
                ViewParent parent = c0134.getParent();
                ActionMenuView actionMenuView3 = this.f1111;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f1112);
                }
            }
        }
        this.f1111.setOverflowReserved(this.f1115);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo1138(SubMenuC2853 subMenuC2853) {
        boolean z;
        if (subMenuC2853.hasVisibleItems()) {
            SubMenuC2853 subMenuC2854 = subMenuC2853;
            while (true) {
                MenuC1944 menuC1944 = subMenuC2854.f9115;
                if (menuC1944 == this.f1107) {
                    break;
                }
                subMenuC2854 = (SubMenuC2853) menuC1944;
            }
            MenuItemC1946 menuItemC1946 = subMenuC2854.f9116;
            ActionMenuView actionMenuView = this.f1111;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof InterfaceC1956) && ((InterfaceC1956) childAt).getItemData() == menuItemC1946) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f1127 = subMenuC2853.f9116.f6427;
                int size = subMenuC2853.f6412.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC2853.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0130 c0130 = new C0130(this, this.f1106, subMenuC2853, view);
                this.f1123 = c0130;
                c0130.f6463 = z;
                AbstractC1947 abstractC1947 = c0130.f6465;
                if (abstractC1947 != null) {
                    abstractC1947.mo1972(z);
                }
                C0130 c0131 = this.f1123;
                if (!c0131.m3781()) {
                    if (c0131.f6461 == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0131.m3782(0, 0, false, false);
                }
                InterfaceC1954 interfaceC1954 = this.f1109;
                if (interfaceC1954 != null) {
                    interfaceC1954.mo1118(subMenuC2853);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean mo1139() {
        int size;
        ArrayList arrayListM3764;
        int i;
        boolean z;
        C0136 c0136 = this;
        MenuC1944 menuC1944 = c0136.f1107;
        if (menuC1944 != null) {
            arrayListM3764 = menuC1944.m3764();
            size = arrayListM3764.size();
        } else {
            size = 0;
            arrayListM3764 = null;
        }
        int i2 = c0136.f1119;
        int i3 = c0136.f1118;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c0136.f1111;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayListM3764.get(i4);
            int i7 = menuItemC1946.f6451;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0136.f1120 && menuItemC1946.f6454) {
                i2 = 0;
            }
            i4++;
        }
        if (c0136.f1115 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0136.f1121;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            MenuItemC1946 menuItemC1947 = (MenuItemC1946) arrayListM3764.get(i9);
            int i11 = menuItemC1947.f6451;
            boolean z3 = (i11 & 2) == 2 ? true : false;
            int i12 = menuItemC1947.f6428;
            if (z3) {
                View viewM1140 = c0136.m1140(menuItemC1947, null, actionMenuView);
                viewM1140.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM1140.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                }
                menuItemC1947.m3777(true);
            } else {
                if (false) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewM1141 = c0136.m1140(menuItemC1947, null, actionMenuView);
                        viewM1141.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM1141.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            MenuItemC1946 menuItemC1948 = (MenuItemC1946) arrayListM3764.get(i13);
                            if (menuItemC1948.f6428 == i12) {
                                if ((menuItemC1948.f6450 & 32) == 32) {
                                    i8++;
                                }
                                menuItemC1948.m3777(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    menuItemC1947.m3777(z5);
                } else {
                    menuItemC1947.m3777(false);
                }
                i9++;
                i = 2;
                c0136 = this;
                z = true;
            }
            i9++;
            i = 2;
            c0136 = this;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final View m1140(MenuItemC1946 menuItemC1946, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC1946.f6452;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((menuItemC1946.f6451 & 8) != 0 && true)) {
            InterfaceC1956 interfaceC1956 = view instanceof InterfaceC1956 ? (InterfaceC1956) view : (InterfaceC1956) this.f1108.inflate(this.f1110, (ViewGroup) actionMenuView, false);
            interfaceC1956.mo2(menuItemC1946);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC1956;
            actionMenuItemView.setItemInvoker(this.f1111);
            if (this.f1125 == null) {
                this.f1125 = new C0131(this);
            }
            actionMenuItemView.setPopupCallback(this.f1125);
            view3 = (View) interfaceC1956;
        }
        view3.setVisibility(menuItemC1946.f6454 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        
        if (!(layoutParams instanceof C0138)) {
            view3.setLayoutParams(ActionMenuView.m21(layoutParams));
        }
        return view3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m1141() {
        ActionMenuView actionMenuView;
        RunnableC0132 runnableC0132 = this.f1124;
        if (runnableC0132 != null && (actionMenuView = this.f1111) != null) {
            actionMenuView.removeCallbacks(runnableC0132);
            this.f1124 = null;
            return true;
        }
        C0130 c0130 = this.f1122;
        if (c0130 == null) {
            return false;
        }
        if (c0130.m3781()) {
            c0130.f6465.dismiss();
        }
        return true;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean mo1142(MenuItemC1946 menuItemC1946) {
        return false;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo1143(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C0135) && (i = ((C0135) parcelable).f1104) > 0 && (menuItemFindItem = this.f1107.findItem(i)) != null) {
            mo1138((SubMenuC2853) menuItemFindItem.getSubMenu());
        }
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo1144(InterfaceC1954 interfaceC1954) {
        throw null;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean mo1145(MenuItemC1946 menuItemC1946) {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m1146() {
        MenuC1944 menuC1944;
        if (!this.f1115) {
            return false;
        }
        C0130 c0130 = this.f1122;
        if ((c0130 != null && c0130.m3781()) || (menuC1944 = this.f1107) == null || this.f1111 == null || this.f1124 != null) {
            return false;
        }
        menuC1944.m3762();
        if (menuC1944.f6416.isEmpty()) {
            return false;
        }
        RunnableC0132 runnableC0132 = new RunnableC0132(this, 0, new C0130(this, this.f1106, this.f1107, this.f1112));
        this.f1124 = runnableC0132;
        this.f1111.post(runnableC0132);
        return true;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void mo1147(Context context, MenuC1944 menuC1944) {
        this.f1106 = context;
        LayoutInflater.from(context);
        this.f1107 = menuC1944;
        Resources resources = context.getResources();
        if (!this.f1116) {
            this.f1115 = true;
        }
        int i = 2;
        this.f1117 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || (false)) {
            i = 5;
        } else if (i2 >= 500 || ((false) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f1119 = i;
        int measuredWidth = this.f1117;
        if (this.f1115) {
            if (this.f1112 == null) {
                C0133 c0133 = new C0133(this, this.f1105);
                this.f1112 = c0133;
                if (this.f1114) {
                    c0133.setImageDrawable(this.f1113);
                    this.f1113 = null;
                    this.f1114 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1112.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1112.getMeasuredWidth();
        } else {
            this.f1112 = null;
        }
        this.f1118 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p000.InterfaceC1955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Parcelable mo1148() {
        C0135 c0135 = new C0135();
        c0135.f1104 = this.f1127;
        return c0135;
    }
}
