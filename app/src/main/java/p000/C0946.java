package p000;

import android.content.ContentValues;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0946 extends AbstractC2867 implements InterfaceC1601 {

    public static final C0946 f3459;

    public static final String f3460;

    public static final String f3461;

    public static final String f3462;

    public static final C0853 f3463;

    static {
        String[] strArr = AbstractC1574.f5469;
        f3459 = new C0946("CustomUnReadCountHook");
        f3460 = "实验";
        f3461 = "自定义未读数";
        f3462 = "可自定义消息菜单 '标记未读' 的未读数";
        f3463 = new C0853(21);
    }

    @Override // p000.InterfaceC1601
    public final void mo1233(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        if (mo3264()) {
            String[] strArr2 = AbstractC1574.f5469;
            if (str.equals("rconversation") && AbstractC2207.m4087(contentValues.get("unReadCount"), 1) && AbstractC2207.m4087(contentValues.get("atCount"), 0)) {
                contentValues.put("unReadCount", Integer.valueOf(C0945.f3458.m2538()));
            }
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f3462;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f3461;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f3460;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f3463;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
