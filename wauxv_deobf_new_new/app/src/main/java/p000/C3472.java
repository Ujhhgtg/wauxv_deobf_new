package p000;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᤝᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3472 implements InterfaceC1986 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public MenuC1975 f10917;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public MenuItemC1977 f10918;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f10919;

    public C3472(Toolbar toolbar) {
        this.f10919 = toolbar;
    }

    @Override // p000.InterfaceC1986
    public final int getId() {
        return 0;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1283(boolean z) {
        if (this.f10918 != null) {
            MenuC1975 menuC1975 = this.f10917;
            if (menuC1975 != null) {
                int size = menuC1975.f6517.size();
                for (int i = 0; i < size; i++) {
                    if (this.f10917.getItem(i) == this.f10918) {
                        return;
                    }
                }
            }
            mo1288(this.f10918);
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo1284(SubMenuC2913 subMenuC2913) {
        return false;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo1285() {
        return false;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo1288(MenuItemC1977 menuItemC1977) {
        Toolbar toolbar = this.f10919;
        toolbar.removeView(toolbar.f156);
        toolbar.removeView(toolbar.f155);
        toolbar.f156 = null;
        ArrayList arrayList = toolbar.f178;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f10918 = null;
        toolbar.requestLayout();
        menuItemC1977.f6559 = false;
        menuItemC1977.f6545.m3962(false);
        toolbar.m50();
        return true;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo1291(MenuItemC1977 menuItemC1977) {
        Toolbar toolbar = this.f10919;
        toolbar.m37();
        ViewParent parent = toolbar.f155.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f155);
            }
            toolbar.addView(toolbar.f155);
        }
        View view = menuItemC1977.f6557;
        if (view == null) {
            view = null;
        }
        toolbar.f156 = view;
        this.f10918 = menuItemC1977;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f156);
            }
            C3473 c3473M31 = Toolbar.m31();
            c3473M31.f10920 = (toolbar.f161 & 112) | 8388611;
            c3473M31.f10921 = 2;
            toolbar.f156.setLayoutParams(c3473M31);
            toolbar.addView(toolbar.f156);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C3473) childAt.getLayoutParams()).f10921 != 2 && childAt != toolbar.f148) {
                toolbar.removeViewAt(childCount);
                toolbar.f178.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC1977.f6559 = true;
        menuItemC1977.f6545.m3962(false);
        toolbar.m50();
        return true;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo1293(Context context, MenuC1975 menuC1975) {
        MenuItemC1977 menuItemC1977;
        MenuC1975 menuC1976 = this.f10917;
        if (menuC1976 != null && (menuItemC1977 = this.f10918) != null) {
            menuC1976.mo3951(menuItemC1977);
        }
        this.f10917 = menuC1975;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final Parcelable mo1294() {
        return null;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1289(Parcelable parcelable) {
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1282(MenuC1975 menuC1975, boolean z) {
    }
}
