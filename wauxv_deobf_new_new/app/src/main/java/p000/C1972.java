package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲇᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1972 extends BaseAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final MenuC1975 f6505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f6506 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f6507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f6508;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final LayoutInflater f6509;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f6510;

    public C1972(MenuC1975 menuC1975, LayoutInflater layoutInflater, boolean z, int i) {
        this.f6508 = z;
        this.f6509 = layoutInflater;
        this.f6505 = menuC1975;
        this.f6510 = i;
        m3946();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM3958;
        boolean z = this.f6508;
        MenuC1975 menuC1975 = this.f6505;
        if (z) {
            menuC1975.m3956();
            arrayListM3958 = menuC1975.f6521;
        } else {
            arrayListM3958 = menuC1975.m3958();
        }
        return this.f6506 < 0 ? arrayListM3958.size() : arrayListM3958.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f6509.inflate(this.f6510, viewGroup, false);
        }
        int i2 = getItem(i).f6533;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f6533 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f6505.mo3959() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC1987 interfaceC1987 = (InterfaceC1987) view;
        if (this.f6507) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1987.mo2(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m3946();
        super.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3946() {
        MenuC1975 menuC1975 = this.f6505;
        MenuItemC1977 menuItemC1977 = menuC1975.f6530;
        if (menuItemC1977 != null) {
            menuC1975.m3956();
            ArrayList arrayList = menuC1975.f6521;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemC1977) arrayList.get(i)) == menuItemC1977) {
                    this.f6506 = i;
                    return;
                }
            }
        }
        this.f6506 = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final MenuItemC1977 getItem(int i) {
        ArrayList arrayListM3958;
        boolean z = this.f6508;
        MenuC1975 menuC1975 = this.f6505;
        if (z) {
            menuC1975.m3956();
            arrayListM3958 = menuC1975.f6521;
        } else {
            arrayListM3958 = menuC1975.m3958();
        }
        int i2 = this.f6506;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (MenuItemC1977) arrayListM3958.get(i);
    }
}
