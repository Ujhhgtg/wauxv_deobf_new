package p000;

import android.app.Activity;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤞᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2696 extends AbstractC2867 implements InterfaceC1579 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2696 f8695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8698;

    static {
        AbstractC1574.m3300(-643407575775924L);
        String[] strArr = AbstractC1574.f5469;
        f8695 = new C2696("ShowChattingRecordHook");
        f8696 = "界面";
        f8697 = "历史发言记录";
        f8698 = "在群聊的好友详情中显示历史发言记录";
    }

    @Override // p000.InterfaceC1579
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final List mo3336(Activity activity) throws IllegalAccessException, InvocationTargetException {
        if (mo3264()) {
            Intent intent = activity.getIntent();
            String[] strArr = AbstractC1574.f5469;
            String stringExtra = intent.getStringExtra("Contact_ChatRoomId");
            String stringExtra2 = activity.getIntent().getStringExtra("Contact_User");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            int intExtra = activity.getIntent().getIntExtra("Contact_Scene", -1);
            if (stringExtra != null && stringExtra.length() != 0 && stringExtra2.length() > 0 && intExtra == 14) {
                String str = "WAuxiliary_chatting_record_pref";
                String str2 = "WAuxiliary_chatting_record_pref";
                String str3 = "历史发言记录";
                Object objM2131 = AbstractC0710.m2131(C2391.f7652.m4369(), new Object[]{activity});
                AbstractC1574.m3315(C2387.f7649).invoke(objM2131, str2);
                AbstractC1574.m3315(C2389.f7651).invoke(objM2131, str3);
                return Collections.singletonList(new C0820(str, objM2131, 2, new C1501(activity, stringExtra, stringExtra2, 1)));
            }
        }
        return C1189.f4329;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8698;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8697;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8696;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
