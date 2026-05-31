package p000;

import android.app.Activity;
import android.content.Intent;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲇᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2330 implements InterfaceC0352 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4292(AbstractC0034 abstractC0034, String str) {
        Activity activityM3476 = AbstractC1586.m3476();
        String[] strArr = AbstractC1471.f5234;
        if (str.endsWith("@chatroom")) {
            Intent intent = new Intent();
            intent.setClassName(activityM3476, "com.tencent.mm.chatroom.ui.ChatroomInfoUI");
            intent.putExtra("RoomInfo_Id", str);
            activityM3476.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(activityM3476, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        intent2.putExtra("Contact_User", str);
        activityM3476.startActivity(intent2);
    }
}
