package p000;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᲀᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2051 extends AbstractC2867 implements InterfaceC1578 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2051 f6834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f6835;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f6836;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f6837;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C1884 f6838;

    static {
        AbstractC1574.m3300(-495325693344436L);
        AbstractC1574.m3300(-495368643017396L);
        AbstractC1574.m3300(-495411592690356L);
        AbstractC1574.m3300(-495454542363316L);
        AbstractC1574.m3300(-495497492036276L);
        String[] strArr = AbstractC1574.f5469;
        f6834 = new C2051("MsgBgColorHook");
        f6835 = "美化";
        f6836 = "消息背景颜色";
        f6837 = "仅支持配置部分消息, 与背景气泡冲突";
        f6838 = new C1884(24);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static void m3881(View view, boolean z) {
        int color;
        int color2;
        view.setPadding(32, 20, 32, 20);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = 16;
        marginLayoutParams.rightMargin = 16;
        view.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int iM5322 = (int) AbstractC3681.m5322(Float.valueOf(1.0f), view.getContext());
        if (AbstractC3681.m5331(view.getContext())) {
            color = Color.parseColor((!z ? C2044.f6827 : C2048.f6831).m2542());
        } else {
            color = Color.parseColor((!z ? C2046.f6829 : C2050.f6833).m2542());
        }
        gradientDrawable.setStroke(iM5322, color);
        gradientDrawable.setCornerRadius(AbstractC3681.m5322(Float.valueOf(8.0f), view.getContext()));
        if (AbstractC3681.m5331(view.getContext())) {
            color2 = Color.parseColor((!z ? C2043.f6826 : C2047.f6830).m2542());
        } else {
            color2 = Color.parseColor((!z ? C2045.f6828 : C2049.f6832).m2542());
        }
        gradientDrawable.setColor(color2);
        view.setBackground(gradientDrawable);
    }

    @Override // p000.InterfaceC1578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1408(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3264()) {
            int type = msgInfoBean.getType();
            if (type == EnumC3673.f11469.f11492 || type == EnumC3673.f11479.f11492 || type == EnumC3673.f11487.f11492 || type == EnumC3673.f11488.f11492) {
                
                View viewFindViewById = view.findViewById(C2090.m3885());
                if (viewFindViewById != null) {
                    m3881(viewFindViewById, msgInfoBean.isSend());
                    return;
                }
                return;
            }
            if (type != EnumC3673.f11471.f11492) {
                if (type == EnumC3673.f11477.f11492) {
                    
                    
                    View viewFindViewById2 = view.findViewById(C1565.m3280() ? C2089.f6897.m2538() : AbstractC0968.m2475(C2090.m3890()));
                    if (viewFindViewById2 != null) {
                        m3881(viewFindViewById2, msgInfoBean.isSend());
                        return;
                    }
                    return;
                }
                return;
            }
            
            C1565 c1565 = C1565.f5440;
            
            View viewFindViewById3 = view.findViewById(C1565.m3280() ? C2086.f6894.m2538() : AbstractC0968.m2475(C2090.m3887()));
            if (viewFindViewById3 != null) {
                m3881(viewFindViewById3, msgInfoBean.isSend());
            }
            
            View viewFindViewById4 = view.findViewById(C1565.m3280() ? C2087.f6895.m2538() : AbstractC0968.m2475(C2090.m3888()));
            if (viewFindViewById4 != null) {
                m3881(viewFindViewById4, msgInfoBean.isSend());
            }
            
            View viewFindViewById5 = view.findViewById(C1565.m3280() ? C2088.f6896.m2538() : AbstractC0968.m2475(C2090.m3890()));
            if (viewFindViewById5 != null) {
                m3881(viewFindViewById5, msgInfoBean.isSend());
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f6837;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f6836;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f6835;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f6838;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
