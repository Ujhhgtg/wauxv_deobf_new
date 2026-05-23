package p000;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3414 implements InterfaceC1955 {

    public MenuC1944 f10756;

    public MenuItemC1946 f10757;

    public final /* synthetic */ Toolbar f10758;

    public C3414(Toolbar toolbar) {
        this.f10758 = toolbar;
    }

    @Override // p000.InterfaceC1955
    public final int getId() {
        return 0;
    }

    @Override // p000.InterfaceC1955
    public final void mo1137(boolean z) {
        if (this.f10757 != null) {
            MenuC1944 menuC1944 = this.f10756;
            if (menuC1944 != null) {
                int size = menuC1944.f6412.size();
                for (int i = 0; i < size; i++) {
                    if (this.f10756.getItem(i) == this.f10757) {
                        return;
                    }
                }
            }
            mo1142(this.f10757);
        }
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1138(SubMenuC2853 subMenuC2853) {
        return false;
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1139() {
        return false;
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1142(MenuItemC1946 menuItemC1946) {
        Toolbar toolbar = this.f10758;
        toolbar.removeView(toolbar.f156);
        toolbar.removeView(toolbar.f155);
        toolbar.f156 = null;
        ArrayList arrayList = toolbar.f178;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f10757 = null;
        toolbar.requestLayout();
        menuItemC1946.f6454 = false;
        menuItemC1946.f6440.m3768(false);
        toolbar.m50();
        return true;
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1145(MenuItemC1946 menuItemC1946) {
        Toolbar toolbar = this.f10758;
        toolbar.m37();
        ViewParent parent = toolbar.f155.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f155);
            }
            toolbar.addView(toolbar.f155);
        }
        View view = menuItemC1946.f6452;
        if (view == null) {
            view = null;
        }
        toolbar.f156 = view;
        this.f10757 = menuItemC1946;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f156);
            }
            C3415 c3415M31 = Toolbar.m31();
            c3415M31.f10759 = (toolbar.f161 & 112) | 8388611;
            c3415M31.f10760 = 2;
            toolbar.f156.setLayoutParams(c3415M31);
            toolbar.addView(toolbar.f156);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C3415) childAt.getLayoutParams()).f10760 != 2 && childAt != toolbar.f148) {
                toolbar.removeViewAt(childCount);
                toolbar.f178.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC1946.f6454 = true;
        menuItemC1946.f6440.m3768(false);
        toolbar.m50();
        return true;
    }

    @Override // p000.InterfaceC1955
    public final void mo1147(Context context, MenuC1944 menuC1944) {
        MenuItemC1946 menuItemC1946;
        MenuC1944 menuC1945 = this.f10756;
        if (menuC1945 != null && (menuItemC1946 = this.f10757) != null) {
            menuC1945.mo3757(menuItemC1946);
        }
        this.f10756 = menuC1944;
    }

    @Override // p000.InterfaceC1955
    public final Parcelable mo1148() {
        return null;
    }

    @Override // p000.InterfaceC1955
    public final void mo1143(Parcelable parcelable) {
    }

    @Override // p000.InterfaceC1955
    public final void mo1136(MenuC1944 menuC1944, boolean z) {
    }
}
