package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲈᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0601 extends AbstractC2537 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0591 f2436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0591 f2437;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f2438 = new ArrayList();

    public C0601(C0591 c0591, C0591 c0592) {
        this.f2436 = c0591;
        this.f2437 = c0592;
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int mo2124() {
        return this.f2438.size();
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2125(AbstractC2563 abstractC2563, int i) {
        String str;
        C1496 c1496 = (C1496) this.f2438.get(i);
        C1691 c1691 = ((C0600) abstractC2563).f2435;
        ((MaterialTextView) c1691.f5688).setText(c1496.f5294);
        MaterialTextView materialTextView = (MaterialTextView) c1691.f5687;
        ShapeableImageView shapeableImageView = (ShapeableImageView) c1691.f5690;
        String[] strArr = AbstractC1471.f5234;
        int iOrdinal = c1496.m3421().ordinal();
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
                throw new C0758();
            }
            str = "自定义分组：" + c1496.f5296.length + " 个会话";
        }
        materialTextView.setText(str);
        shapeableImageView.setVisibility(c1496.m3421() == EnumC1497.f5303 ? 0 : 4);
        shapeableImageView.setOnClickListener(new ViewOnClickListenerC0599(c1496, this));
        ((ShapeableImageView) c1691.f5686).setOnClickListener(new ViewOnClickListenerC0599(this, c1496));
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC2563 mo2126(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_group_tab_conf, viewGroup, false);
        int i2 = R.id.itemChatGroupTabIvDelete;
        ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC1272.m3098(viewInflate, R.id.itemChatGroupTabIvDelete);
        if (shapeableImageView != null) {
            i2 = R.id.itemChatGroupTabIvDrag;
            if (((ShapeableImageView) AbstractC1272.m3098(viewInflate, R.id.itemChatGroupTabIvDrag)) != null) {
                i2 = R.id.itemChatGroupTabIvEdit;
                ShapeableImageView shapeableImageView2 = (ShapeableImageView) AbstractC1272.m3098(viewInflate, R.id.itemChatGroupTabIvEdit);
                if (shapeableImageView2 != null) {
                    i2 = R.id.itemChatGroupTabTvDesc;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewInflate, R.id.itemChatGroupTabTvDesc);
                    if (materialTextView != null) {
                        i2 = R.id.itemChatGroupTabTvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1272.m3098(viewInflate, R.id.itemChatGroupTabTvTitle);
                        if (materialTextView2 != null) {
                            return new C0600(new C1691((MaterialCardView) viewInflate, shapeableImageView, shapeableImageView2, materialTextView, materialTextView2, 0));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2127(List list) {
        ArrayList arrayList = this.f2438;
        arrayList.clear();
        arrayList.addAll(AbstractC0739.m2300(list, new C0179(1)));
        m4462();
    }
}
