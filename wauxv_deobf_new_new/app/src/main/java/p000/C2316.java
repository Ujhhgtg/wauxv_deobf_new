package p000;

import android.content.ContentValues;
import com.alibaba.fastjson2.JSONObject;
import java.util.Iterator;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤞᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2316 extends AbstractC1850 implements InterfaceC1614 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2316 f7499 = new C2316();

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo3505(String str, ContentValues contentValues) {
        String[] strArr = AbstractC1471.f5234;
        if (str.equals("fmessage_msginfo")) {
            Object obj = contentValues.get("isSend");
            "null cannot be cast to non-null type kotlin.Int";
            if (((Integer) obj).intValue() == 0) {
                Object obj2 = contentValues.get("msgContent");
                "null cannot be cast to non-null type kotlin.String";
                JSONObject jSONObjectM4854 = AbstractC2894.m4854((String) obj2);
                Object byPath = jSONObjectM4854.getByPath("msg.fromusername");
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) byPath;
                Object byPath2 = jSONObjectM4854.getByPath("msg.ticket");
                "null cannot be cast to non-null type kotlin.String";
                String str3 = (String) byPath2;
                Object byPath3 = jSONObjectM4854.getByPath("msg.scene");
                "null cannot be cast to non-null type kotlin.String";
                int i = Integer.parseInt((String) byPath3);
                Iterator it = AbstractC2419.m4354().iterator();
                while (it.hasNext()) {
                    C2426 c2426M4355 = AbstractC2419.m4355((C2400) it.next());
                    if (c2426M4355 != null) {
                        c2426M4355.m4360("onNewFriend", str2, str3, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
