package p000;

import android.app.Activity;
import android.content.Intent;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᲈᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2297 implements InterfaceC0377 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4163(AbstractC0027 abstractC0027, String str) {
        Activity activityM4033 = AbstractC2203.m4033();
        String[] strArr = AbstractC1574.f5469;
        if (str.endsWith("@chatroom")) {
            Intent intent = new Intent();
            intent.setClassName(activityM4033, "com.tencent.mm.chatroom.ui.ChatroomInfoUI");
            intent.putExtra("RoomInfo_Id", str);
            activityM4033.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(activityM4033, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        intent2.putExtra("Contact_User", str);
        activityM4033.startActivity(intent2);
    }
}
