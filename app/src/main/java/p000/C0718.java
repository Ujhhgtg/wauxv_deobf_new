package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᲁᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0718 extends AbstractC2482 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2725 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public List f2726;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f2727;

    public /* synthetic */ C0718() {
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2040() {
        switch (this.f2725) {
            case 0:
                return this.f2726.size();
            default:
                return ((ArrayList) this.f2726).size();
        }
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2041(AbstractC2508 abstractC2508, final int i) {
        switch (this.f2725) {
            case 0:
                C0542 c0542 = ((C0716) abstractC2508).f2722;
                C0719 c0719 = (C0719) this.f2726.get(i);
                ((MaterialCheckBox) c0542.f2253).setText(c0719.f2728 + " (计算中...)");
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) c0542.f2253;
                materialCheckBox.setOnCheckedChangeListener(null);
                materialCheckBox.setChecked(((Set) this.f2727).contains(c0719.f2728));
                materialCheckBox.setOnCheckedChangeListener(new C0715(this, 0, c0719));
                C0153 c0153 = new C0153(c0542, c0719, null);
                C1002 c1002 = AbstractC1075.f3893;
                AbstractC0968.m2486(AbstractC1881.f6228, c0153);
                break;
            default:
                C2878 c2878 = (C2878) abstractC2508;
                c2878.f9226.f5664.setText((CharSequence) ((ArrayList) this.f2726).get(i));
                c2878.f8006.setOnLongClickListener(new View.OnLongClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲇᤝᛸᲁ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        C2825 c2825 = (C2825) this.f9224.f2727;
                        if (c2825 == null) {
                            return true;
                        }
                        ((ArrayList) c2825.f9072).remove(i);
                        ((C0718) c2825.f9073).m4441();
                        return true;
                    }
                });
                break;
        }
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2508 mo2042(ViewGroup viewGroup, int i) {
        switch (this.f2725) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_auto_clean, viewGroup, false);
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewInflate, R.id.itemAutoCleanCheckBox);
                if (materialCheckBox != null) {
                    return new C0716(new C0542((LinearLayout) viewInflate, 16, materialCheckBox));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.itemAutoCleanCheckBox)));
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_system_browser, viewGroup, false);
                MaterialTextView materialTextView = (MaterialTextView) AbstractC3681.m5325(viewInflate2, R.id.itemSystemBrowserTvHost);
                if (materialTextView != null) {
                    return new C2878(new C1677((LinearLayout) viewInflate2, materialTextView));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.itemSystemBrowserTvHost)));
        }
    }

    public C0718(List list, Set set) {
        this.f2726 = list;
        this.f2727 = AbstractC0744.m2208(set);
    }
}
