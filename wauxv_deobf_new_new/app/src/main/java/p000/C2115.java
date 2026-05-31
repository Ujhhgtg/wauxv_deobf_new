package p000;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲇᲀᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2115 extends AbstractC2927 implements InterfaceC1589 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2115 f7008;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f7009;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7010;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7011;

    static {
        String[] strArr = AbstractC1471.f5234;
        f7008 = new C2115("MsgLeftSwipeHook");
        f7009 = "聊天";
        f7010 = "消息左滑引用";
        f7011 = "多选消息时可点击空白处以便正常选中";
    }

    @Override // p000.InterfaceC1589
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3498(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        long j;
        ViewGroup viewGroup3;
        String[] strArr = AbstractC1471.f5234;
        if (mo3445()) {
            C2114.f7007.getClass();
            C1576.f5470.getClass();
            View viewFindViewById = viewGroup.findViewById(C1576.m3460() ? C2113.f7006.m2662() : AbstractC1468.m3308(C2114.m4067()));
            if (viewFindViewById.getParent() instanceof C2925) {
                return;
            }
            ViewParent parent = viewFindViewById.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup3 = (ViewGroup) parent;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 == null) {
                viewGroup2 = viewGroup3;
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            int iIndexOfChild = viewGroup2.indexOfChild(viewFindViewById);
            C2925 c2925 = new C2925(viewFindViewById.getContext());
            c2925.setId(R.id.MsgLeftSwipe_SwipeMenu);
            c2925.setLayoutParams(layoutParams);
            c2925.setClickable(false);
            c2925.setFocusable(false);
            viewGroup2.removeView(viewFindViewById);
            c2925.addView(viewFindViewById);
            FrameLayout frameLayout = new FrameLayout(c2925.getContext());
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams((int) AbstractC2234.m4163(Integer.valueOf(Opcodes.GETFIELD), frameLayout.getContext()), -1));
            ImageView imageView = new ImageView(frameLayout.getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams2.setMargins((int) AbstractC2234.m4163(Double.valueOf(36.0d), imageView.getContext()), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            imageView.setLayoutParams(layoutParams2);
            imageView.setImageResource(R.drawable.ic_menu_quote_24dp);
            if (AbstractC2234.m4176(imageView.getContext())) {
                viewGroup2 = viewGroup3;
                j = -539718475315843L;
            } else {
                viewGroup2 = viewGroup3;
                j = -539761424988803L;
            }
            imageView.setImageTintList(AbstractC0738.m2266(Color.parseColor(MagicFactory.get(j, strArr))));
            frameLayout.addView(imageView);
            c2925.addView(frameLayout);
            viewGroup2.addView(c2925, iIndexOfChild);
        }
    }

    @Override // p000.InterfaceC1589
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo3499(Object obj, ViewGroup viewGroup, Object obj2, MsgInfoBean msgInfoBean) {
        C2925 c2925;
        if (mo3445() && (c2925 = (C2925) viewGroup.findViewById(R.id.MsgLeftSwipe_SwipeMenu)) != null) {
            c2925.setSmoothListener(new C2136(c2925, obj, msgInfoBean, obj2));
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7011;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f7010;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f7009;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
