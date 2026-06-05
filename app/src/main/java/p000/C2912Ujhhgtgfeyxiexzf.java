package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴ要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2912Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final HashMap f9191Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final HashSet f9192Ujhhgtgfeyxiexzf = new HashSet();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2798Ujhhgtgfeyxiexzf f9193Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f9194Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f9195Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m4280Ujhhgtgfeyxiexzf(InterfaceC0228Ujhhgtgfeyxiexzf interfaceC0228Ujhhgtgfeyxiexzf) {
        int id = interfaceC0228Ujhhgtgfeyxiexzf.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f9192Ujhhgtgfeyxiexzf;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        InterfaceC0228Ujhhgtgfeyxiexzf interfaceC0228Ujhhgtgfeyxiexzf2 = (InterfaceC0228Ujhhgtgfeyxiexzf) this.f9191Ujhhgtgfeyxiexzf.get(Integer.valueOf(m4282Ujhhgtgfeyxiexzf()));
        if (interfaceC0228Ujhhgtgfeyxiexzf2 != null) {
            m4284Ujhhgtgfeyxiexzf(interfaceC0228Ujhhgtgfeyxiexzf2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!interfaceC0228Ujhhgtgfeyxiexzf.isChecked()) {
            interfaceC0228Ujhhgtgfeyxiexzf.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ArrayList m4281Ujhhgtgfeyxiexzf(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f9192Ujhhgtgfeyxiexzf);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0228Ujhhgtgfeyxiexzf) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m4282Ujhhgtgfeyxiexzf() {
        if (!this.f9194Ujhhgtgfeyxiexzf) {
            return -1;
        }
        HashSet hashSet = this.f9192Ujhhgtgfeyxiexzf;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m4283Ujhhgtgfeyxiexzf() {
        C2798Ujhhgtgfeyxiexzf c2798Ujhhgtgfeyxiexzf = this.f9193Ujhhgtgfeyxiexzf;
        if (c2798Ujhhgtgfeyxiexzf != null) {
            new HashSet(this.f9192Ujhhgtgfeyxiexzf);
            ChipGroup chipGroup = c2798Ujhhgtgfeyxiexzf.f8846Ujhhgtgfeyxiexzf;
            InterfaceC2799Ujhhgtgfeyxiexzf interfaceC2799Ujhhgtgfeyxiexzf = chipGroup.f779Ujhhgtgfeyxiexzf;
            if (interfaceC2799Ujhhgtgfeyxiexzf != null) {
                chipGroup.f780Ujhhgtgfeyxiexzf.m4281Ujhhgtgfeyxiexzf(chipGroup);
                ChipGroup chipGroup2 = ((C2798Ujhhgtgfeyxiexzf) interfaceC2799Ujhhgtgfeyxiexzf).f8846Ujhhgtgfeyxiexzf;
                if (chipGroup2.f780Ujhhgtgfeyxiexzf.f9194Ujhhgtgfeyxiexzf) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean m4284Ujhhgtgfeyxiexzf(InterfaceC0228Ujhhgtgfeyxiexzf interfaceC0228Ujhhgtgfeyxiexzf, boolean z) {
        int id = interfaceC0228Ujhhgtgfeyxiexzf.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.f9192Ujhhgtgfeyxiexzf;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC0228Ujhhgtgfeyxiexzf.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC0228Ujhhgtgfeyxiexzf.isChecked()) {
            interfaceC0228Ujhhgtgfeyxiexzf.setChecked(false);
        }
        return zRemove;
    }
}
