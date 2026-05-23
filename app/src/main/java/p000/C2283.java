package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Set;
import me.hd.wauxv.data.bean.info.FriendInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤝᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2283 extends AbstractC1823 implements InterfaceC1601 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2283 f7377 = new C2283();

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo1233(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        String nickname;
        String nickname2;
        String[] strArr2 = AbstractC1574.f5469;
        if (str.equals("chatroom")) {
            String asString = contentValues.getAsString("chatroomname");
            Integer asInteger = contentValues.getAsInteger("memberCount");
            String asString2 = contentValues.getAsString("memberlist");
            if (asString2 == null || AbstractC2841.m4836(asString2)) {
                return;
            }
            Set setM2209 = AbstractC0744.m2209(AbstractC2841.m4843(asString2, new String[]{";"}));
            int i2 = 0;
            
            MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(C2800.m4779()).m3492();
            c1973M3492.f6370 = "rawQuery";
            Cursor cursor = (Cursor) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(Object[].class)}, 2, c1973M3492)).invoke("SELECT memberlist, memberCount FROM chatroom WHERE chatroomname = ?", new Object[]{asString});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i3 = cursor.getInt(cursor.getColumnIndex("memberCount"));
                        if (i3 == 0) {
                            cursor.close();
                            return;
                        }
                        String string = cursor.getString(cursor.getColumnIndex("memberlist"));
                        if (string != null && !AbstractC2841.m4836(string)) {
                            Set setM22010 = AbstractC0744.m2209(AbstractC2841.m4843(string, new String[]{";"}));
                            if (asInteger.intValue() > i3) {
                                for (String str3 : AbstractC2665.m4669(setM2209, setM22010)) {
                                    String str4 = "join";
                                    Cursor cursorM2715 = C1133.m2715("select * from rcontact where username = '" + str3 + '\'');
                                    if (cursorM2715 != null) {
                                        cursorM2715.moveToFirst();
                                    } else {
                                        cursorM2715 = null;
                                    }
                                    FriendInfo friendInfoM2176 = cursorM2715 != null ? AbstractC0743.m2176(cursorM2715) : null;
                                    if (friendInfoM2176 == null || (nickname2 = friendInfoM2176.getNickname()) == null) {
                                        nickname2 = "";
                                    }
                                    for (C2355 c2355 : AbstractC2371.f7619) {
                                        
                                        c2355.m4332("onMemberChange", "join", asString, str3, nickname2);
                                    }
                                }
                            } else if (asInteger.intValue() < i3) {
                                for (String str5 : AbstractC2665.m4669(setM22010, setM2209)) {
                                    String str6 = "left";
                                    Cursor cursorM2716 = C1133.m2715("select * from rcontact where username = '" + str5 + '\'');
                                    if (cursorM2716 != null) {
                                        cursorM2716.moveToFirst();
                                    } else {
                                        cursorM2716 = null;
                                    }
                                    FriendInfo friendInfoM2177 = cursorM2716 != null ? AbstractC0743.m2176(cursorM2716) : null;
                                    if (friendInfoM2177 == null || (nickname = friendInfoM2177.getNickname()) == null) {
                                        nickname = "";
                                    }
                                    for (C2355 c2356 : AbstractC2371.f7619) {
                                        
                                        c2356.m4332("onMemberChange", "left", asString, str5, nickname);
                                    }
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
                        AbstractC1458.m3154(cursor, th);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
