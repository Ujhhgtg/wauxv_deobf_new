package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f8928Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ChipGroup f8929Ujhhgtgfeyxiexzf;

    public ViewGroupOnHierarchyChangeListenerC2807Ujhhgtgfeyxiexzf(ChipGroup chipGroup) {
        this.f8929Ujhhgtgfeyxiexzf = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f8929Ujhhgtgfeyxiexzf;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view2.setId(View.generateViewId());
            }
            C2912Ujhhgtgfeyxiexzf c2912Ujhhgtgfeyxiexzf = chipGroup.f780Ujhhgtgfeyxiexzf;
            Chip chip = (Chip) view2;
            c2912Ujhhgtgfeyxiexzf.f9191Ujhhgtgfeyxiexzf.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                c2912Ujhhgtgfeyxiexzf.m4280Ujhhgtgfeyxiexzf(chip);
            }
            chip.setInternalOnCheckedChangeListener(new C2965Ujhhgtgfeyxiexzf(6, c2912Ujhhgtgfeyxiexzf));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f8928Ujhhgtgfeyxiexzf;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f8929Ujhhgtgfeyxiexzf;
        if (view == chipGroup && (view2 instanceof Chip)) {
            C2912Ujhhgtgfeyxiexzf c2912Ujhhgtgfeyxiexzf = chipGroup.f780Ujhhgtgfeyxiexzf;
            Chip chip = (Chip) view2;
            c2912Ujhhgtgfeyxiexzf.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            c2912Ujhhgtgfeyxiexzf.f9191Ujhhgtgfeyxiexzf.remove(Integer.valueOf(chip.getId()));
            c2912Ujhhgtgfeyxiexzf.f9192Ujhhgtgfeyxiexzf.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f8928Ujhhgtgfeyxiexzf;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
