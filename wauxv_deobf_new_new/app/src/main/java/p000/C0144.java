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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲈᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0144 implements InterfaceC1986 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Context f1173;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Context f1174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public MenuC1975 f1175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final LayoutInflater f1176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC1985 f1177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ActionMenuView f1179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0141 f1180;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Drawable f1181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f1182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1184;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f1185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f1186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f1187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f1188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public C0138 f1190;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C0138 f1191;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public RunnableC0140 f1192;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public C0139 f1193;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public int f1195;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f1178 = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final SparseBooleanArray f1189 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final C0102 f1194 = new C0102(this, 1);

    public C0144(Context context) {
        this.f1173 = context;
        this.f1176 = LayoutInflater.from(context);
    }

    @Override // p000.InterfaceC1986
    public final int getId() {
        return 0;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1282(MenuC1975 menuC1975, boolean z) {
        m1287();
        C0138 c0138 = this.f1191;
        if (c0138 != null && c0138.m3975()) {
            c0138.f6570.dismiss();
        }
        InterfaceC1985 interfaceC1985 = this.f1177;
        if (interfaceC1985 != null) {
            interfaceC1985.mo1243(menuC1975, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1283(boolean z) {
        int i;
        ActionMenuView actionMenuView = this.f1179;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            MenuC1975 menuC1975 = this.f1175;
            if (menuC1975 != null) {
                menuC1975.m3956();
                ArrayList arrayListM3958 = this.f1175.m3958();
                int size = arrayListM3958.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayListM3958.get(i2);
                    if ((menuItemC1977.f6555 & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        MenuItemC1977 itemData = childAt instanceof InterfaceC1987 ? ((InterfaceC1987) childAt).getItemData() : null;
                        View viewM1286 = m1286(menuItemC1977, childAt, actionMenuView);
                        if (menuItemC1977 != itemData) {
                            viewM1286.setPressed(false);
                            viewM1286.jumpDrawablesToCurrentState();
                        }
                        if (viewM1286 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewM1286.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewM1286);
                            }
                            this.f1179.addView(viewM1286, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.f1180) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.f1179.requestLayout();
        MenuC1975 menuC1976 = this.f1175;
        if (menuC1976 != null) {
            menuC1976.m3956();
            ArrayList arrayList2 = menuC1976.f6520;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((MenuItemC1977) arrayList2.get(i3)).getClass();
            }
        }
        MenuC1975 menuC1977 = this.f1175;
        if (menuC1977 != null) {
            menuC1977.m3956();
            arrayList = menuC1977.f6521;
        }
        if (this.f1183 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((MenuItemC1977) arrayList.get(0)).f6559;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1180 == null) {
                this.f1180 = new C0141(this, this.f1173);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f1180.getParent();
            if (viewGroup2 != this.f1179) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f1180);
                }
                ActionMenuView actionMenuView2 = this.f1179;
                C0141 c0141 = this.f1180;
                actionMenuView2.getClass();
                C0146 c0146M20 = ActionMenuView.m20();
                c0146M20.f1196 = true;
                actionMenuView2.addView(c0141, c0146M20);
            }
        } else {
            C0141 c0142 = this.f1180;
            if (c0142 != null) {
                ViewParent parent = c0142.getParent();
                ActionMenuView actionMenuView3 = this.f1179;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f1180);
                }
            }
        }
        this.f1179.setOverflowReserved(this.f1183);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo1284(SubMenuC2913 subMenuC2913) {
        boolean z;
        if (subMenuC2913.hasVisibleItems()) {
            SubMenuC2913 subMenuC2914 = subMenuC2913;
            while (true) {
                MenuC1975 menuC1975 = subMenuC2914.f9284;
                if (menuC1975 == this.f1175) {
                    break;
                }
                subMenuC2914 = (SubMenuC2913) menuC1975;
            }
            MenuItemC1977 menuItemC1977 = subMenuC2914.f9285;
            ActionMenuView actionMenuView = this.f1179;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof InterfaceC1987) && ((InterfaceC1987) childAt).getItemData() == menuItemC1977) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f1195 = subMenuC2913.f9285.f6532;
                int size = subMenuC2913.f6517.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC2913.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C0138 c0138 = new C0138(this, this.f1174, subMenuC2913, view);
                this.f1191 = c0138;
                c0138.f6568 = z;
                AbstractC1978 abstractC1978 = c0138.f6570;
                if (abstractC1978 != null) {
                    abstractC1978.mo2069(z);
                }
                C0138 c0139 = this.f1191;
                if (!c0139.m3975()) {
                    if (c0139.f6566 == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0139.m3976(0, 0, false, false);
                }
                InterfaceC1985 interfaceC1985 = this.f1177;
                if (interfaceC1985 != null) {
                    interfaceC1985.mo1264(subMenuC2913);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean mo1285() {
        int size;
        ArrayList arrayListM3958;
        int i;
        boolean z;
        C0144 c0144 = this;
        MenuC1975 menuC1975 = c0144.f1175;
        if (menuC1975 != null) {
            arrayListM3958 = menuC1975.m3958();
            size = arrayListM3958.size();
        } else {
            size = 0;
            arrayListM3958 = null;
        }
        int i2 = c0144.f1187;
        int i3 = c0144.f1186;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c0144.f1179;
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
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayListM3958.get(i4);
            int i7 = menuItemC1977.f6556;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c0144.f1188 && menuItemC1977.f6559) {
                i2 = 0;
            }
            i4++;
        }
        if (c0144.f1183 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c0144.f1189;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            MenuItemC1977 menuItemC1978 = (MenuItemC1977) arrayListM3958.get(i9);
            int i11 = menuItemC1978.f6556;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = menuItemC1978.f6533;
            if (z3) {
                View viewM1286 = c0144.m1286(menuItemC1978, null, actionMenuView);
                viewM1286.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM1286.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                menuItemC1978.m3971(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewM1287 = c0144.m1286(menuItemC1978, null, actionMenuView);
                        viewM1287.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM1287.getMeasuredWidth();
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
                            MenuItemC1977 menuItemC1979 = (MenuItemC1977) arrayListM3958.get(i13);
                            if (menuItemC1979.f6533 == i12) {
                                if ((menuItemC1979.f6555 & 32) == 32) {
                                    i8++;
                                }
                                menuItemC1979.m3971(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    menuItemC1978.m3971(z5);
                } else {
                    menuItemC1978.m3971(false);
                }
                i9++;
                i = 2;
                c0144 = this;
                z = true;
            }
            i9++;
            i = 2;
            c0144 = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final View m1286(MenuItemC1977 menuItemC1977, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC1977.f6557;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((menuItemC1977.f6556 & 8) != 0 && view2 != null)) {
            InterfaceC1987 interfaceC1987 = view instanceof InterfaceC1987 ? (InterfaceC1987) view : (InterfaceC1987) this.f1176.inflate(this.f1178, (ViewGroup) actionMenuView, false);
            interfaceC1987.mo2(menuItemC1977);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC1987;
            actionMenuItemView.setItemInvoker(this.f1179);
            if (this.f1193 == null) {
                this.f1193 = new C0139(this);
            }
            actionMenuItemView.setPopupCallback(this.f1193);
            view3 = (View) interfaceC1987;
        }
        view3.setVisibility(menuItemC1977.f6559 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0146)) {
            view3.setLayoutParams(ActionMenuView.m21(layoutParams));
        }
        return view3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m1287() {
        ActionMenuView actionMenuView;
        RunnableC0140 runnableC0140 = this.f1192;
        if (runnableC0140 != null && (actionMenuView = this.f1179) != null) {
            actionMenuView.removeCallbacks(runnableC0140);
            this.f1192 = null;
            return true;
        }
        C0138 c0138 = this.f1190;
        if (c0138 == null) {
            return false;
        }
        if (c0138.m3975()) {
            c0138.f6570.dismiss();
        }
        return true;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean mo1288(MenuItemC1977 menuItemC1977) {
        return false;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo1289(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C0143) && (i = ((C0143) parcelable).f1172) > 0 && (menuItemFindItem = this.f1175.findItem(i)) != null) {
            mo1284((SubMenuC2913) menuItemFindItem.getSubMenu());
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo1290(InterfaceC1985 interfaceC1985) {
        throw null;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean mo1291(MenuItemC1977 menuItemC1977) {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m1292() {
        MenuC1975 menuC1975;
        if (!this.f1183) {
            return false;
        }
        C0138 c0138 = this.f1190;
        if ((c0138 != null && c0138.m3975()) || (menuC1975 = this.f1175) == null || this.f1179 == null || this.f1192 != null) {
            return false;
        }
        menuC1975.m3956();
        if (menuC1975.f6521.isEmpty()) {
            return false;
        }
        RunnableC0140 runnableC0140 = new RunnableC0140(this, 0, new C0138(this, this.f1174, this.f1175, this.f1180));
        this.f1192 = runnableC0140;
        this.f1179.post(runnableC0140);
        return true;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void mo1293(Context context, MenuC1975 menuC1975) {
        this.f1174 = context;
        LayoutInflater.from(context);
        this.f1175 = menuC1975;
        Resources resources = context.getResources();
        if (!this.f1184) {
            this.f1183 = true;
        }
        int i = 2;
        this.f1185 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f1187 = i;
        int measuredWidth = this.f1185;
        if (this.f1183) {
            if (this.f1180 == null) {
                C0141 c0141 = new C0141(this, this.f1173);
                this.f1180 = c0141;
                if (this.f1182) {
                    c0141.setImageDrawable(this.f1181);
                    this.f1181 = null;
                    this.f1182 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1180.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1180.getMeasuredWidth();
        } else {
            this.f1180 = null;
        }
        this.f1186 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Parcelable mo1294() {
        C0143 c0143 = new C0143();
        c0143.f1172 = this.f1195;
        return c0143;
    }
}
