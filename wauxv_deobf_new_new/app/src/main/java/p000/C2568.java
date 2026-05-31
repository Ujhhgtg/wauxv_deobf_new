package p000;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson2.JSONObject;
import java.util.Arrays;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲁᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2568 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2568 f8185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8188;

    static {
        String[] strArr = AbstractC1471.f5234;
        f8185 = new C2568("RedPacketTotalNumHook");
        f8186 = "红包";
        f8187 = "红包个数显示";
        f8188 = "在普通群聊的红包消息上显示具体个数";
    }

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3445() && msgInfoBean.isGroupChat() && msgInfoBean.isRedBag()) {
            JSONObject jSONObjectM4854 = AbstractC2894.m4854(msgInfoBean.getContent());
            String[] strArr = AbstractC1471.f5234;
            Object byPath = jSONObjectM4854.getByPath("msg.appmsg.wcpayinfo");
            "null cannot be cast to non-null type com.alibaba.fastjson2.JSONObject";
            String queryParameter = Uri.parse(((JSONObject) byPath).getString("nativeurl")).getQueryParameter("total_num");
            if (queryParameter == null) {
                return;
            }
            int[] iArr = msgInfoBean.isSend() ? new int[]{4, 0, 0, 1, 2, 0} : new int[]{4, 1, 0, 1, 1, 2, 0};
            TextView textView = (TextView) AbstractC3640.m5203(view, "RedPacket.Subtitle", Arrays.copyOf(iArr, iArr.length));
            if (textView == null) {
                return;
            }
            textView.setText(((Object) textView.getText()) + '[' + queryParameter + ']');
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8188;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8187;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8186;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
