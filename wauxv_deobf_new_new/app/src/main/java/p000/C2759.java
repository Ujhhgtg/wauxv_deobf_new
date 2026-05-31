package p000;

import android.app.Activity;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲁᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2759 extends AbstractC2927 implements InterfaceC1591 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2759 f8870;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8872;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8873;

    static {
        AbstractC1471.m3394(-671853144177283L);
        String[] strArr = AbstractC1471.f5234;
        f8870 = new C2759("ShowContactInfoHook");
        f8871 = "界面";
        f8872 = "显示联系详情";
        f8873 = "在对应的联系界面中显示 联系详情ID";
    }

    @Override // p000.InterfaceC1591
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final List mo3500(Activity activity) throws IllegalAccessException, InvocationTargetException {
        if (mo3445()) {
            Intent intent = activity.getIntent();
            String[] strArr = AbstractC1471.f5234;
            String stringExtra = intent.getStringExtra("Contact_User");
            if (stringExtra == null) {
                stringExtra = "异常";
            }
            if (!stringExtra.startsWith("gh_")) {
                String str = "WAuxiliary_contact_info_pref";
                String str2 = "WAuxiliary_contact_info_pref";
                String strM4786 = AbstractC2844.m4786(new StringBuilder(), "ID: ", stringExtra);
                Object objM2224 = AbstractC0705.m2224(C2444.f7796.m4390(), new Object[]{activity});
                AbstractC0972.m2610(C2440.f7793).invoke(objM2224, str2);
                AbstractC0972.m2610(C2442.f7795).invoke(objM2224, strM4786);
                return Collections.singletonList(new C0819(str, objM2224, 1, new C1526(stringExtra, 4, activity)));
            }
        }
        return C1191.f4326;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8873;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8872;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8871;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
