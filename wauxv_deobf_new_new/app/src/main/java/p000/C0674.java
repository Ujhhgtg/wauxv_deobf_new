package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲇᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0674 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f2560 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashSet f2561 = new HashSet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0687 f2562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f2563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f2564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m2157(InterfaceC1945 interfaceC1945) {
        int id = interfaceC1945.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f2561;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        InterfaceC1945 interfaceC1946 = (InterfaceC1945) this.f2560.get(Integer.valueOf(m2159()));
        if (interfaceC1946 != null) {
            m2161(interfaceC1946, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!interfaceC1945.isChecked()) {
            interfaceC1945.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList m2158(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f2561);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC1945) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m2159() {
        if (!this.f2563) {
            return -1;
        }
        HashSet hashSet = this.f2561;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2160() {
        C0687 c0687 = this.f2562;
        if (c0687 != null) {
            new HashSet(this.f2561);
            ChipGroup chipGroup = c0687.f2642;
            InterfaceC0690 interfaceC0690 = chipGroup.f765;
            if (interfaceC0690 != null) {
                chipGroup.f766.m2158(chipGroup);
                ChipGroup chipGroup2 = ((C0687) interfaceC0690).f2642;
                if (chipGroup2.f766.f2563) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m2161(InterfaceC1945 interfaceC1945, boolean z) {
        int id = interfaceC1945.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f2561;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC1945.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC1945.isChecked()) {
            interfaceC1945.setChecked(false);
        }
        return zRemove;
    }
}
