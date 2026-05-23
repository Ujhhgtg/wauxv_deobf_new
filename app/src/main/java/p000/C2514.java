package p000;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson2.JSONObject;
import java.util.Arrays;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᲈᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2514 extends AbstractC2867 implements InterfaceC1578 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2514 f8038;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8039;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8040;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8041;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8038 = new C2514("RedPacketTotalNumHook");
        f8039 = "红包";
        f8040 = "红包个数显示";
        f8041 = "在普通群聊的红包消息上显示具体个数";
    }

    @Override // p000.InterfaceC1578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1408(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3264() && msgInfoBean.isGroupChat() && msgInfoBean.isRedBag()) {
            JSONObject jSONObjectM4821 = AbstractC2834.m4821(msgInfoBean.getContent());
            String[] strArr = AbstractC1574.f5469;
            Object byPath = jSONObjectM4821.getByPath("msg.appmsg.wcpayinfo");
            "null cannot be cast to non-null type com.alibaba.fastjson2.JSONObject";
            String queryParameter = Uri.parse(((JSONObject) byPath).getString("nativeurl")).getQueryParameter("total_num");
            if (queryParameter == null) {
                return;
            }
            int[] iArr = msgInfoBean.isSend() ? new int[]{4, 0, 0, 1, 2, 0} : new int[]{4, 1, 0, 1, 1, 2, 0};
            TextView textView = (TextView) AbstractC3580.m5197(view, "RedPacket.Subtitle", Arrays.copyOf(iArr, iArr.length));
            if (textView == null) {
                return;
            }
            textView.setText(((Object) textView.getText()) + '[' + queryParameter + ']');
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8041;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8040;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8039;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
