package p000;

import android.app.Activity;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ能不能要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1042feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0600Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1042feyxiexzfUjhhgtg f4059Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4060Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4061Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4062Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928832021381252490L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4059Ujhhgtgfeyxiexzf = new C1042feyxiexzfUjhhgtg("ShowChattingRecordHook");
        f4060Ujhhgtgfeyxiexzf = "界面";
        f4061Ujhhgtgfeyxiexzf = "历史发言记录";
        f4062Ujhhgtgfeyxiexzf = "在群聊的好友详情中显示历史发言记录";
    }

    @Override // p000.InterfaceC0600Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final List mo1871Ujhhgtgfeyxiexzf(Activity activity) throws IllegalAccessException, InvocationTargetException {
        if (mo1424feyxiexzfUjhhgtg()) {
            Intent intent = activity.getIntent();
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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
                Object objM4168Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(C0854feyxiexzfUjhhgtg.f3346Ujhhgtgfeyxiexzf.m2261feyxiexzfUjhhgtg(), new Object[]{activity});
                AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1449feyxiexzfUjhhgtg.f5060Ujhhgtgfeyxiexzf).invoke(objM4168Ujhhgtgfeyxiexzf, str2);
                AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C0852feyxiexzfUjhhgtg.f3345Ujhhgtgfeyxiexzf).invoke(objM4168Ujhhgtgfeyxiexzf, str3);
                return Collections.singletonList(new C3682feyxiexzfUjhhgtg(str, objM4168Ujhhgtgfeyxiexzf, 2, new C3472Ujhhgtgfeyxiexzf(activity, stringExtra, stringExtra2, 2)));
            }
        }
        return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4062Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4061Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4060Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
