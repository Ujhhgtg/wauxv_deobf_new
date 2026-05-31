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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤞᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0713 extends AbstractC2537 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2719 = 2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public List f2720;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f2721;

    public /* synthetic */ C0713() {
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2124() {
        switch (this.f2719) {
            case 0:
                return this.f2720.size();
            case 1:
                return ((ArrayList) this.f2720).size();
            default:
                return ((ArrayList) this.f2720).size();
        }
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2125(AbstractC2563 abstractC2563, final int i) {
        switch (this.f2719) {
            case 0:
                C1692 c1692 = ((C0711) abstractC2563).f2716;
                C0714 c0714 = (C0714) this.f2720.get(i);
                ((MaterialCheckBox) c1692.f5693).setText(c0714.f2722 + " (计算中...)");
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) c1692.f5693;
                materialCheckBox.setOnCheckedChangeListener(null);
                materialCheckBox.setChecked(((Set) this.f2721).contains(c0714.f2722));
                materialCheckBox.setOnCheckedChangeListener(new C0710(this, 0, c0714));
                C0161 c0161 = new C0161(c1692, c0714, null);
                C1006 c1006 = AbstractC1080.f3904;
                AbstractC1471.m3404(AbstractC1908.f6303, c0161);
                break;
            case 1:
                C2355 c2355 = (C2355) abstractC2563;
                C2358 c2358 = (C2358) ((ArrayList) this.f2720).get(i);
                c2355.f7577.setText(c2358.f7582);
                c2355.f7578.setText(c2358.f7581);
                MaterialCheckBox materialCheckBox2 = c2355.f7579;
                materialCheckBox2.setOnCheckedChangeListener(null);
                materialCheckBox2.setChecked(c2358.f7584);
                materialCheckBox2.setOnCheckedChangeListener(new C0710(c2355, 3, this));
                break;
            default:
                C2937 c2937 = (C2937) abstractC2563;
                ((MaterialTextView) c2937.f9393.f5693).setText((CharSequence) ((ArrayList) this.f2720).get(i));
                c2937.f8157.setOnLongClickListener(new View.OnLongClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᤞᲀᲇᲈ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        C2885 c2885 = (C2885) this.f9391.f2721;
                        if (c2885 == null) {
                            return true;
                        }
                        ((ArrayList) c2885.f9234).remove(i);
                        ((C0713) c2885.f9235).m4462();
                        return true;
                    }
                });
                break;
        }
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2563 mo2126(ViewGroup viewGroup, int i) {
        switch (this.f2719) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_auto_clean, viewGroup, false);
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewInflate, R.id.itemAutoCleanCheckBox);
                if (materialCheckBox != null) {
                    return new C0711(new C1692((LinearLayout) viewInflate, materialCheckBox, 2));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.itemAutoCleanCheckBox)));
            case 1:
                return new C2355(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_panel_emoji_group, viewGroup, false));
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_system_browser, viewGroup, false);
                MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewInflate2, R.id.itemSystemBrowserTvHost);
                if (materialTextView != null) {
                    return new C2937(new C1692((LinearLayout) viewInflate2, materialTextView, 0));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.itemSystemBrowserTvHost)));
        }
    }

    public C0713(List list, Set set) {
        this.f2720 = list;
        this.f2721 = AbstractC0739.m2307(set);
    }

    public C0713(ArrayList arrayList, C2349 c2349) {
        this.f2720 = arrayList;
        this.f2721 = c2349;
    }
}
