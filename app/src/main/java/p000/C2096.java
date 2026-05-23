package p000;

import android.graphics.Color;
import android.view.View;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲀᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2096 extends AbstractC2867 implements InterfaceC1578 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2096 f6907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f6908;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f6909;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f6910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2058 f6911;

    static {
        AbstractC1574.m3300(-496790277192372L);
        AbstractC1574.m3300(-496833226865332L);
        String[] strArr = AbstractC1574.f5469;
        f6907 = new C2096("MsgTvColorHook");
        f6908 = "美化";
        f6909 = "消息文本颜色";
        f6910 = "当前仅支持配置微信部分消息文本颜色";
        f6911 = new C2058(17);
    }

    @Override // p000.InterfaceC1578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1408(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        int color;
        if (mo3264()) {
            int type = msgInfoBean.getType();
            if (type == EnumC3673.f11469.f11492 || type == EnumC3673.f11479.f11492 || type == EnumC3673.f11487.f11492 || type == EnumC3673.f11488.f11492) {
                
                View viewFindViewById = view.findViewById(C2090.m3885());
                if (viewFindViewById != null) {
                    int i = 0;
                    MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(viewFindViewById).m3492();
                    c1973M3492.f6370 = "setTextColor";
                    C1982 c1982 = (C1982) AbstractC2784.m4742(c1973M3492);
                    if (AbstractC3681.m5331(viewFindViewById.getContext())) {
                        color = Color.parseColor((!msgInfoBean.isSend() ? C2092.f6903 : C2094.f6905).m2542());
                    } else {
                        color = Color.parseColor((!msgInfoBean.isSend() ? C2093.f6904 : C2095.f6906).m2542());
                    }
                    c1982.m3831(Integer.valueOf(color));
                }
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f6910;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f6909;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f6908;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f6911;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
