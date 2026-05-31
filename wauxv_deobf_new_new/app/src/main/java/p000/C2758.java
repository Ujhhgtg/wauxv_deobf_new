package p000;

import android.app.Activity;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲁᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2758 extends AbstractC2927 implements InterfaceC1591 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2758 f8866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8869;

    static {
        AbstractC1471.m3394(-671131589671555L);
        String[] strArr = AbstractC1471.f5234;
        f8866 = new C2758("ShowChattingRecordHook");
        f8867 = "界面";
        f8868 = "历史发言记录";
        f8869 = "在群聊的好友详情中显示历史发言记录";
    }

    @Override // p000.InterfaceC1591
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final List mo3500(Activity activity) throws IllegalAccessException, InvocationTargetException {
        if (mo3445()) {
            Intent intent = activity.getIntent();
            String[] strArr = AbstractC1471.f5234;
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
                Object objM2224 = AbstractC0705.m2224(C2444.f7796.m4390(), new Object[]{activity});
                AbstractC0972.m2610(C2440.f7793).invoke(objM2224, str2);
                AbstractC0972.m2610(C2442.f7795).invoke(objM2224, str3);
                return Collections.singletonList(new C0819(str, objM2224, 2, new C1355(activity, stringExtra, stringExtra2, 2)));
            }
        }
        return C1191.f4326;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8869;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8868;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8867;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
