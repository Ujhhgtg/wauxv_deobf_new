package p000;

import android.app.Activity;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤞᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2697 extends AbstractC2867 implements InterfaceC1579 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2697 f8699;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8702;

    static {
        AbstractC1574.m3300(-644129130281652L);
        String[] strArr = AbstractC1574.f5469;
        f8699 = new C2697("ShowContactInfoHook");
        f8700 = "界面";
        f8701 = "显示联系详情";
        f8702 = "在对应的联系界面中显示 联系详情ID";
    }

    @Override // p000.InterfaceC1579
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final List mo3336(Activity activity) throws IllegalAccessException, InvocationTargetException {
        if (mo3264()) {
            Intent intent = activity.getIntent();
            String[] strArr = AbstractC1574.f5469;
            String stringExtra = intent.getStringExtra("Contact_User");
            if (stringExtra == null) {
                stringExtra = "异常";
            }
            if (!stringExtra.startsWith("gh_")) {
                String str = "WAuxiliary_contact_info_pref";
                String str2 = "WAuxiliary_contact_info_pref";
                String strM4752 = AbstractC2784.m4752(new StringBuilder(), "ID: ", stringExtra);
                Object objM2131 = AbstractC0710.m2131(C2391.f7652.m4369(), new Object[]{activity});
                AbstractC1574.m3315(C2387.f7649).invoke(objM2131, str2);
                AbstractC1574.m3315(C2389.f7651).invoke(objM2131, strM4752);
                return Collections.singletonList(new C0820(str, objM2131, 1, new C1514(stringExtra, 3, activity)));
            }
        }
        return C1189.f4329;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8702;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8701;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8700;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
