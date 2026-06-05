package p000;

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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2823feyxiexzfUjhhgtg extends AbstractC0795feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f8978Ujhhgtgfeyxiexzf = 2;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public List f8979Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f8980Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2823feyxiexzfUjhhgtg() {
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2134Ujhhgtgfeyxiexzf() {
        switch (this.f8978Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f8979Ujhhgtgfeyxiexzf.size();
            case 1:
                return ((ArrayList) this.f8979Ujhhgtgfeyxiexzf).size();
            default:
                return ((ArrayList) this.f8979Ujhhgtgfeyxiexzf).size();
        }
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2139Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, final int i) {
        switch (this.f8978Ujhhgtgfeyxiexzf) {
            case 0:
                C0693Ujhhgtgfeyxiexzf c0693Ujhhgtgfeyxiexzf = ((C2821feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg).f8974Ujhhgtgfeyxiexzf;
                C2831feyxiexzfUjhhgtg c2831feyxiexzfUjhhgtg = (C2831feyxiexzfUjhhgtg) this.f8979Ujhhgtgfeyxiexzf.get(i);
                ((MaterialCheckBox) c0693Ujhhgtgfeyxiexzf.f2835Ujhhgtgfeyxiexzf).setText(c2831feyxiexzfUjhhgtg.f8998Ujhhgtgfeyxiexzf + MagicFactory.get(4928303499885675914L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) c0693Ujhhgtgfeyxiexzf.f2835Ujhhgtgfeyxiexzf;
                materialCheckBox.setOnCheckedChangeListener(null);
                materialCheckBox.setChecked(((Set) this.f8980Ujhhgtgfeyxiexzf).contains(c2831feyxiexzfUjhhgtg.f8998Ujhhgtgfeyxiexzf));
                materialCheckBox.setOnCheckedChangeListener(new C2822feyxiexzfUjhhgtg(this, 0, c2831feyxiexzfUjhhgtg));
                C3024feyxiexzfUjhhgtg c3024feyxiexzfUjhhgtg = new C3024feyxiexzfUjhhgtg(c0693Ujhhgtgfeyxiexzf, c2831feyxiexzfUjhhgtg, null);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(AbstractC0166Ujhhgtgfeyxiexzf.f1350Ujhhgtgfeyxiexzf, c3024feyxiexzfUjhhgtg);
                break;
            case 1:
                C1363feyxiexzfUjhhgtg c1363feyxiexzfUjhhgtg = (C1363feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg;
                C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg = (C1364feyxiexzfUjhhgtg) ((ArrayList) this.f8979Ujhhgtgfeyxiexzf).get(i);
                c1363feyxiexzfUjhhgtg.f4841Ujhhgtgfeyxiexzf.setText(c1364feyxiexzfUjhhgtg.f4845Ujhhgtgfeyxiexzf);
                c1363feyxiexzfUjhhgtg.f4842Ujhhgtgfeyxiexzf.setText(c1364feyxiexzfUjhhgtg.f4844Ujhhgtgfeyxiexzf);
                MaterialCheckBox materialCheckBox2 = c1363feyxiexzfUjhhgtg.f4843Ujhhgtgfeyxiexzf;
                materialCheckBox2.setOnCheckedChangeListener(null);
                materialCheckBox2.setChecked(c1364feyxiexzfUjhhgtg.f4847Ujhhgtgfeyxiexzf);
                materialCheckBox2.setOnCheckedChangeListener(new C2822feyxiexzfUjhhgtg(c1363feyxiexzfUjhhgtg, 3, this));
                break;
            default:
                C2069feyxiexzfUjhhgtg c2069feyxiexzfUjhhgtg = (C2069feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg;
                ((MaterialTextView) c2069feyxiexzfUjhhgtg.f6805Ujhhgtgfeyxiexzf.f2835Ujhhgtgfeyxiexzf).setText((CharSequence) ((ArrayList) this.f8979Ujhhgtgfeyxiexzf).get(i));
                c2069feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.setOnLongClickListener(new View.OnLongClickListener() { // from class: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg = (C2073feyxiexzfUjhhgtg) this.f6803Ujhhgtgfeyxiexzf.f8980Ujhhgtgfeyxiexzf;
                        if (c2073feyxiexzfUjhhgtg == null) {
                            return true;
                        }
                        ((ArrayList) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf).remove(i);
                        ((C2823feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6811Ujhhgtgfeyxiexzf).m2137Ujhhgtgfeyxiexzf();
                        return true;
                    }
                });
                break;
        }
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final AbstractC0821feyxiexzfUjhhgtg mo2141Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int i) {
        switch (this.f8978Ujhhgtgfeyxiexzf) {
            case 0:
                View viewInflate = AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(viewGroup.getContext()).inflate(R.layout.item_rv_auto_clean, viewGroup, false);
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.itemAutoCleanCheckBox);
                if (materialCheckBox != null) {
                    return new C2821feyxiexzfUjhhgtg(new C0693Ujhhgtgfeyxiexzf((LinearLayout) viewInflate, materialCheckBox, 2));
                }
                throw new NullPointerException(MagicFactory.get(4928814287461287306L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf).concat(viewInflate.getResources().getResourceName(R.id.itemAutoCleanCheckBox)));
            case 1:
                return new C1363feyxiexzfUjhhgtg(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(viewGroup.getContext()).inflate(R.layout.item_panel_emoji_group, viewGroup, false));
            default:
                View viewInflate2 = AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(viewGroup.getContext()).inflate(R.layout.item_rv_system_browser, viewGroup, false);
                MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate2, R.id.itemSystemBrowserTvHost);
                if (materialTextView != null) {
                    return new C2069feyxiexzfUjhhgtg(new C0693Ujhhgtgfeyxiexzf((LinearLayout) viewInflate2, materialTextView, 0));
                }
                throw new NullPointerException(MagicFactory.get(4928818135751984522L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf).concat(viewInflate2.getResources().getResourceName(R.id.itemSystemBrowserTvHost)));
        }
    }

    public C2823feyxiexzfUjhhgtg(List list, Set set) {
        this.f8979Ujhhgtgfeyxiexzf = list;
        this.f8980Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4255Ujhhgtgfeyxiexzf(set);
    }

    public C2823feyxiexzfUjhhgtg(ArrayList arrayList, C1382feyxiexzfUjhhgtg c1382feyxiexzfUjhhgtg) {
        this.f8979Ujhhgtgfeyxiexzf = arrayList;
        this.f8980Ujhhgtgfeyxiexzf = c1382feyxiexzfUjhhgtg;
    }
}
