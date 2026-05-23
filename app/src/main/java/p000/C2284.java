package p000;

import android.content.ContentValues;
import com.alibaba.fastjson2.JSONObject;
import java.io.IOException;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤝᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2284 extends AbstractC1823 implements InterfaceC1601 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2284 f7378 = new C2284();

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo3341(String str, ContentValues contentValues) throws IOException {
        String[] strArr = AbstractC1574.f5469;
        if (str.equals("fmessage_msginfo")) {
            Object obj = contentValues.get("isSend");
            "null cannot be cast to non-null type kotlin.Int";
            if (((Integer) obj).intValue() == 0) {
                Object obj2 = contentValues.get("msgContent");
                "null cannot be cast to non-null type kotlin.String";
                JSONObject jSONObjectM4821 = AbstractC2834.m4821((String) obj2);
                Object byPath = jSONObjectM4821.getByPath("msg.fromusername");
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) byPath;
                Object byPath2 = jSONObjectM4821.getByPath("msg.ticket");
                "null cannot be cast to non-null type kotlin.String";
                String str3 = (String) byPath2;
                Object byPath3 = jSONObjectM4821.getByPath("msg.scene");
                "null cannot be cast to non-null type kotlin.String";
                int i = Integer.parseInt((String) byPath3);
                for (C2355 c2355 : AbstractC2371.f7619) {
                    c2355.getClass();
                    c2355.m4332("onNewFriend", str2, str3, Integer.valueOf(i));
                }
            }
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
