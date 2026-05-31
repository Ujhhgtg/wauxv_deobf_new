package p000;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᲇᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1556 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1556 f5428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f5429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5431;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C1493 f5432;

    static {
        String[] strArr = AbstractC1471.f5234;
        f5428 = new C1556("HideMsgAvatarIVHook");
        f5429 = "净化";
        f5430 = "隐藏消息头像";
        f5431 = "自定义隐藏微信聊天列表中的头像布局";
        f5432 = new C1493(24);
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3445()) {
            int i = AbstractC1768.f5906;
            C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
            c1300M3558.f6475 = "avatarIV";
            ImageView imageView = (ImageView) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127();
            if (imageView != null) {
                boolean zIsSend = msgInfoBean.isSend();
                boolean z = C1554.f5426.m2660() && !zIsSend;
                boolean z2 = C1555.f5427.m2660() && zIsSend;
                if (z || z2) {
                    imageView.setVisibility(8);
                    ViewParent parent = imageView.getParent();
                    RelativeLayout relativeLayout = parent instanceof RelativeLayout ? (RelativeLayout) parent : null;
                    if (relativeLayout == null) {
                        return;
                    }
                    relativeLayout.getLayoutParams().width = 0;
                }
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f5431;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f5430;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f5429;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f5432;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
