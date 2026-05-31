package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲁᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1525 extends AbstractC2927 implements InterfaceC1594, InterfaceC1614 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1525 f5365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f5366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C1493 f5369;

    static {
        AbstractC1471.m3394(-577604381833859L);
        AbstractC1471.m3394(-577638741572227L);
        String[] strArr = AbstractC1471.f5234;
        f5365 = new C1525("HandleGroupMemberHook");
        f5366 = "群组";
        f5367 = "监听群成员";
        f5368 = "自动监听群成员退群时插入自定义提示";
        f5369 = new C1493(2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static String m3430(String str, String str2, String str3) {
        C0659.f2543.getClass();
        String strM2153 = C0659.m2153(str2, str);
        String[] strArr = AbstractC1471.f5234;
        String strM2154 = C0659.m2153(str2, "");
        if (!AbstractC1469.m3322(strM2153, strM2154)) {
            strM2153 = strM2153 + '[' + strM2154 + ']';
        }
        String strM2666 = C1523.f5363.m2666();
        String strM4879 = AbstractC2901.m4879(str, "@chatroom");
        StringBuilder sb = new StringBuilder();
        sb.append("weixin://weixinhongbao/wauxv/chatroom_userinfo/");
        sb.append(strM4879);
        String strM4786 = AbstractC2844.m4786(sb, "__", str2);
        StringBuilder sbM4787 = AbstractC2844.m4787(strM2153);
        sbM4787.append("(<_wc_custom_link_ color=\"");
        sbM4787.append(strM2666);
        sbM4787.append("\" href=\"");
        sbM4787.append(strM4786);
        sbM4787.append("\">");
        sbM4787.append(str2);
        return AbstractC2844.m4786(sbM4787, "</_wc_custom_link_>)", str3);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C1522.f5362, dexKitBridge, new C1493(3));
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo1379(C1574 c1574, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        String[] strArr2 = AbstractC1471.f5234;
        if (mo3445() && str.equals("chatroom")) {
            String asString = contentValues.getAsString("chatroomname");
            Integer asInteger = contentValues.getAsInteger("memberCount");
            String asString2 = contentValues.getAsString("memberlist");
            if (asString2 == null || AbstractC2901.m4869(asString2)) {
                return;
            }
            Set setM2308 = AbstractC0739.m2308(AbstractC2901.m4876(asString2, new String[]{";"}));
            int i2 = AbstractC1768.f5906;
            C2859.f9091.getClass();
            C2004 c2004M3560 = AbstractC2727.m4713(C2859.m4812()).m3560();
            c2004M3560.f6475 = "rawQuery";
            Cursor cursor = (Cursor) ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(Object[].class)}, 2, c2004M3560)).m4026("SELECT memberlist, memberCount FROM chatroom WHERE chatroomname = ?", new Object[]{asString});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i3 = cursor.getInt(cursor.getColumnIndex("memberCount"));
                        if (i3 == 0) {
                            cursor.close();
                            return;
                        }
                        String string = cursor.getString(cursor.getColumnIndex("memberlist"));
                        if (string != null && !AbstractC2901.m4869(string)) {
                            Set setM2309 = AbstractC0739.m2308(AbstractC2901.m4876(string, new String[]{";"}));
                            if (asInteger.intValue() < i3) {
                                for (String str3 : AbstractC2727.m4708(setM2309, setM2308)) {
                                    C1525 c1525 = f5365;
                                    String strM2666 = C1524.f5364.m2666();
                                    c1525.getClass();
                                    AbstractC0738.m2275(EnumC3733.f11627.f11641, asString, m3430(asString, str3, strM2666), System.currentTimeMillis());
                                }
                            }
                        }
                        cursor.close();
                        return;
                    }
                    cursor.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3528.m5090(cursor, th);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C1522.f5362));
        C1525 c1525 = f5365;
        C3752 c3752M4301 = C2342.m4301(c1525, listSingletonList);
        c1525.m3444(c3752M4301, new C1493(4));
        c3752M4301.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f5368;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f5367;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f5366;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f5369;
    }
}
