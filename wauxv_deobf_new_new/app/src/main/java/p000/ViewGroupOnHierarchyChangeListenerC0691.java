package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲁᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC0691 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f2643;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ChipGroup f2644;

    public ViewGroupOnHierarchyChangeListenerC0691(ChipGroup chipGroup) {
        this.f2644 = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f2644;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                Field field = AbstractC3638.f11333;
                view2.setId(View.generateViewId());
            }
            C0674 c0674 = chipGroup.f766;
            Chip chip = (Chip) view2;
            c0674.f2560.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                c0674.m2157(chip);
            }
            chip.setInternalOnCheckedChangeListener(new C0102(c0674, 6));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2643;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f2644;
        if (view == chipGroup && (view2 instanceof Chip)) {
            C0674 c0674 = chipGroup.f766;
            Chip chip = (Chip) view2;
            c0674.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            c0674.f2560.remove(Integer.valueOf(chip.getId()));
            c0674.f2561.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2643;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
