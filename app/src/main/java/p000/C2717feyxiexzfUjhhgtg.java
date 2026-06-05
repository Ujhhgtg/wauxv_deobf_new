package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2717feyxiexzfUjhhgtg extends AbstractC0795feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2702feyxiexzfUjhhgtg f8660Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2702feyxiexzfUjhhgtg f8661Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f8662Ujhhgtgfeyxiexzf = new ArrayList();

    public C2717feyxiexzfUjhhgtg(C2702feyxiexzfUjhhgtg c2702feyxiexzfUjhhgtg, C2702feyxiexzfUjhhgtg c2702feyxiexzfUjhhgtg2) {
        this.f8660Ujhhgtgfeyxiexzf = c2702feyxiexzfUjhhgtg;
        this.f8661Ujhhgtgfeyxiexzf = c2702feyxiexzfUjhhgtg2;
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2134Ujhhgtgfeyxiexzf() {
        return this.f8662Ujhhgtgfeyxiexzf.size();
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2139Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i) {
        String str;
        C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) this.f8662Ujhhgtgfeyxiexzf.get(i);
        C0694Ujhhgtgfeyxiexzf c0694Ujhhgtgfeyxiexzf = ((C2709feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg).f8644Ujhhgtgfeyxiexzf;
        ((MaterialTextView) c0694Ujhhgtgfeyxiexzf.f2839Ujhhgtgfeyxiexzf).setText(c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf);
        MaterialTextView materialTextView = (MaterialTextView) c0694Ujhhgtgfeyxiexzf.f2838Ujhhgtgfeyxiexzf;
        ShapeableImageView shapeableImageView = (ShapeableImageView) c0694Ujhhgtgfeyxiexzf.f2841Ujhhgtgfeyxiexzf;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        int iOrdinal = c0627Ujhhgtgfeyxiexzf.m1905Ujhhgtgfeyxiexzf().ordinal();
        if (iOrdinal == 0) {
            str = "系统分组：全部会话";
        } else if (iOrdinal == 1) {
            str = "系统分组：仅显示群聊";
        } else if (iOrdinal == 2) {
            str = "系统分组：仅显示好友私聊";
        } else if (iOrdinal == 3) {
            str = "系统分组：仅显示公众号";
        } else if (iOrdinal == 4) {
            str = "系统分组：仅显示未读会话";
        } else {
            if (iOrdinal != 5) {
                throw new C2870Ujhhgtgfeyxiexzf();
            }
            str = "自定义分组：" + c0627Ujhhgtgfeyxiexzf.f2661Ujhhgtgfeyxiexzf.length + " 个会话";
        }
        materialTextView.setText(str);
        shapeableImageView.setVisibility(c0627Ujhhgtgfeyxiexzf.m1905Ujhhgtgfeyxiexzf() == EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf ? 0 : 4);
        shapeableImageView.setOnClickListener(new ViewOnClickListenerC2710feyxiexzfUjhhgtg(c0627Ujhhgtgfeyxiexzf, this));
        ((ShapeableImageView) c0694Ujhhgtgfeyxiexzf.f2837Ujhhgtgfeyxiexzf).setOnClickListener(new ViewOnClickListenerC2710feyxiexzfUjhhgtg(this, c0627Ujhhgtgfeyxiexzf));
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final AbstractC0821feyxiexzfUjhhgtg mo2141Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(viewGroup.getContext()).inflate(R.layout.item_chat_group_tab_conf, viewGroup, false);
        int i2 = R.id.itemChatGroupTabIvDelete;
        ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.itemChatGroupTabIvDelete);
        if (shapeableImageView != null) {
            i2 = R.id.itemChatGroupTabIvDrag;
            if (((ShapeableImageView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.itemChatGroupTabIvDrag)) != null) {
                i2 = R.id.itemChatGroupTabIvEdit;
                ShapeableImageView shapeableImageView2 = (ShapeableImageView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.itemChatGroupTabIvEdit);
                if (shapeableImageView2 != null) {
                    i2 = R.id.itemChatGroupTabTvDesc;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.itemChatGroupTabTvDesc);
                    if (materialTextView != null) {
                        i2 = R.id.itemChatGroupTabTvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewInflate, R.id.itemChatGroupTabTvTitle);
                        if (materialTextView2 != null) {
                            return new C2709feyxiexzfUjhhgtg(new C0694Ujhhgtgfeyxiexzf((MaterialCardView) viewInflate, shapeableImageView, shapeableImageView2, materialTextView, materialTextView2, 0));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4032Ujhhgtgfeyxiexzf(List list) {
        ArrayList arrayList = this.f8662Ujhhgtgfeyxiexzf;
        arrayList.clear();
        arrayList.addAll(AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(list, new C2419Ujhhgtgfeyxiexzf(1)));
        m2137Ujhhgtgfeyxiexzf();
    }
}
