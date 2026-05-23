package p000;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import me.hd.wauxv.data.bean.MsgInfoBean;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1545 extends AbstractC2867 implements InterfaceC1578 {

    public static final C1545 f5398;

    public static final String f5399;

    public static final String f5400;

    public static final String f5401;

    public static final C1538 f5402;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5398 = new C1545("HideMsgAvatarIVHook");
        f5399 = "净化";
        f5400 = "隐藏消息头像";
        f5401 = "自定义隐藏微信聊天列表中的头像布局";
        f5402 = new C1538(8);
    }

    @Override // p000.InterfaceC1578
    public final void mo1408(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3264()) {
            int i = 0;
            C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj).m3490();
            c1299M3490.name = "avatarIV";
            ImageView imageView = (ImageView) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024();
            if (imageView != null) {
                boolean zIsSend = msgInfoBean.isSend();
                boolean z = C1543.f5396.m2536() && !zIsSend;
                boolean z2 = C1544.f5397.m2536() && zIsSend;
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

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f5401;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f5400;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f5399;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f5402;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
