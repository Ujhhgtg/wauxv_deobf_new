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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᲁᛸᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2082 extends AbstractC2867 implements InterfaceC1577 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2082 f6884;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f6885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f6886;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f6887;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6884 = new C2082("MsgLeftSwipeHook");
        f6885 = "聊天";
        f6886 = "消息左滑引用";
        f6887 = "可左滑选中以修复无法多选消息的问题";
    }

    @Override // p000.InterfaceC1577
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3334(ViewGroup viewGroup) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            
            
            View viewFindViewById = viewGroup.findViewById(C1565.m3280() ? C2080.f6882.m2538() : AbstractC0968.m2475(C2081.m3884()));
            ViewParent parent = viewFindViewById.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewFindViewById);
            }
            C2865 c2865 = new C2865(viewFindViewById.getContext());
            c2865.setLayoutParams(viewFindViewById.getLayoutParams());
            c2865.setId(R.id.MsgLeftSwipe_SwipeMenu);
            c2865.addView(viewFindViewById);
            FrameLayout frameLayout = new FrameLayout(c2865.getContext());
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams((int) AbstractC3681.m5322(Integer.valueOf(180), frameLayout.getContext()), -1));
            ImageView imageView = new ImageView(frameLayout.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.setMargins((int) AbstractC3681.m5322(Double.valueOf(36.0d), imageView.getContext()), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.ic_menu_quote_24dp);
            imageView.setImageTintList(AbstractC1460.m3212(Color.parseColor(MagicFactory.get(AbstractC3681.m5331(imageView.getContext()) ? -517139832240820L : -517182781913780L, strArr))));
            frameLayout.addView(imageView);
            c2865.addView(frameLayout);
            viewGroup.addView(c2865);
        }
    }

    @Override // p000.InterfaceC1577
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo3335(Object obj, ViewGroup viewGroup, Object obj2, MsgInfoBean msgInfoBean) {
        C2865 c2865;
        if (mo3264() && (c2865 = (C2865) viewGroup.findViewById(R.id.MsgLeftSwipe_SwipeMenu)) != null) {
            c2865.setSmoothListener(new C2103(c2865, obj, msgInfoBean, obj2));
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f6887;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f6886;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f6885;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
