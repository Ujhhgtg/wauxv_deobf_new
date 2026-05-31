package p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲇᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2161 implements InterfaceC1986 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0422 f7181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f7182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7183;

    @Override // p000.InterfaceC1986
    public final int getId() {
        return this.f7183;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1283(boolean z) {
        C0327 c0327;
        if (this.f7182) {
            return;
        }
        if (z) {
            this.f7181.m4123();
            return;
        }
        C0422 c0422 = this.f7181;
        MenuC1975 menuC1975 = c0422.f7178;
        if (menuC1975 == null || c0422.f7153 == null) {
            return;
        }
        int size = menuC1975.f6517.size();
        if (size != c0422.f7153.length) {
            c0422.m4123();
            return;
        }
        int i = c0422.f7154;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c0422.f7178.getItem(i2);
            if (item.isChecked()) {
                c0422.f7154 = item.getItemId();
                c0422.f7155 = i2;
            }
        }
        if (i != c0422.f7154 && (c0327 = c0422.f7148) != null) {
            AbstractC3497.m5020(c0422, c0327);
        }
        int i3 = c0422.f7152;
        boolean z2 = i3 != -1 ? i3 == 0 : c0422.f7178.m3958().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            c0422.f7177.f7182 = true;
            c0422.f7153[i4].setLabelVisibilityMode(c0422.f7152);
            c0422.f7153[i4].setShifting(z2);
            c0422.f7153[i4].mo2((MenuItemC1977) c0422.f7178.getItem(i4));
            c0422.f7177.f7182 = false;
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
        return false;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo1289(Parcelable parcelable) {
        if (parcelable instanceof C2160) {
            C0422 c0422 = this.f7181;
            C2160 c2160 = (C2160) parcelable;
            int i = c2160.f7179;
            int size = c0422.f7178.f6517.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = c0422.f7178.getItem(i2);
                if (i == item.getItemId()) {
                    c0422.f7154 = i;
                    c0422.f7155 = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f7181.getContext();
            C2369 c2369 = c2160.f7180;
            SparseArray sparseArray = new SparseArray(c2369.size());
            for (int i3 = 0; i3 < c2369.size(); i3++) {
                int iKeyAt = c2369.keyAt(i3);
                C0339 c0339 = (C0339) c2369.valueAt(i3);
                sparseArray.put(iKeyAt, c0339 != null ? new C0338(context, c0339) : null);
            }
            C0422 c0423 = this.f7181;
            SparseArray sparseArray2 = c0423.f7166;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (C0338) sparseArray.get(iKeyAt2));
                }
            }
            AbstractC2157[] abstractC2157Arr = c0423.f7153;
            if (abstractC2157Arr != null) {
                for (AbstractC2157 abstractC2157 : abstractC2157Arr) {
                    C0338 c0338 = (C0338) sparseArray2.get(abstractC2157.getId());
                    if (c0338 != null) {
                        abstractC2157.setBadge(c0338);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo1291(MenuItemC1977 menuItemC1977) {
        return false;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo1293(Context context, MenuC1975 menuC1975) {
        this.f7181.f7178 = menuC1975;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final Parcelable mo1294() {
        C2160 c2160 = new C2160();
        c2160.f7179 = this.f7181.getSelectedItemId();
        SparseArray<C0338> badgeDrawables = this.f7181.getBadgeDrawables();
        C2369 c2369 = new C2369();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            C0338 c0338ValueAt = badgeDrawables.valueAt(i);
            c2369.put(iKeyAt, c0338ValueAt != null ? c0338ValueAt.f1661.f1700 : null);
        }
        c2160.f7180 = c2369;
        return c2160;
    }

    @Override // p000.InterfaceC1986
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1282(MenuC1975 menuC1975, boolean z) {
    }
}
