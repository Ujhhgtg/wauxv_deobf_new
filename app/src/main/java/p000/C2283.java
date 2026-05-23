package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Set;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

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
        if (str.equals(MagicFactory.get(-395265840249524L, strArr2))) {
            String asString = contentValues.getAsString(MagicFactory.get(-395304494955188L, strArr2));
            Integer asInteger = contentValues.getAsInteger(MagicFactory.get(-395360329530036L, strArr2));
            String asString2 = contentValues.getAsString(MagicFactory.get(-395411869137588L, strArr2));
            if (asString2 == null || AbstractC2841.m4836(asString2)) {
                return;
            }
            Set setM2209 = AbstractC0744.m2209(AbstractC2841.m4843(asString2, new String[]{MagicFactory.get(-395459113777844L, strArr2)}));
            int i2 = AbstractC1745.f5844;
            C2800.f8930.getClass();
            C1973 c1973M3492 = AbstractC0968.m2484(C2800.m4779()).m3492();
            c1973M3492.f6370 = MagicFactory.get(-96112778148532L, strArr2);
            Cursor cursor = (Cursor) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class), AbstractC2519.m4527(Object[].class)}, 2, c1973M3492)).m3832(MagicFactory.get(-395467703712436L, strArr2), new Object[]{asString});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i3 = cursor.getInt(cursor.getColumnIndex(MagicFactory.get(-395759761488564L, strArr2)));
                        if (i3 == 0) {
                            cursor.close();
                            return;
                        }
                        String string = cursor.getString(cursor.getColumnIndex(MagicFactory.get(-395811301096116L, strArr2)));
                        if (string != null && !AbstractC2841.m4836(string)) {
                            Set setM22010 = AbstractC0744.m2209(AbstractC2841.m4843(string, new String[]{MagicFactory.get(-395858545736372L, strArr2)}));
                            if (asInteger.intValue() > i3) {
                                for (String str3 : AbstractC2665.m4669(setM2209, setM22010)) {
                                    String str4 = MagicFactory.get(-395867135670964L, strArr2);
                                    Cursor cursorM2715 = C1133.m2715(MagicFactory.get(-79615808764596L, strArr2) + str3 + '\'');
                                    if (cursorM2715 != null) {
                                        cursorM2715.moveToFirst();
                                    } else {
                                        cursorM2715 = null;
                                    }
                                    FriendInfo friendInfoM2176 = cursorM2715 != null ? AbstractC0743.m2176(cursorM2715) : null;
                                    if (friendInfoM2176 == null || (nickname2 = friendInfoM2176.getNickname()) == null) {
                                        nickname2 = MagicFactory.get(-395888610507444L, strArr2);
                                    }
                                    for (C2355 c2355 : AbstractC2371.f7619) {
                                        c2355.getClass();
                                        c2355.m4332(MagicFactory.get(-455176339061428L, strArr2), str4, asString, str3, nickname2);
                                    }
                                }
                            } else if (asInteger.intValue() < i3) {
                                for (String str5 : AbstractC2665.m4669(setM22010, setM2209)) {
                                    String str6 = MagicFactory.get(-395892905474740L, strArr2);
                                    Cursor cursorM2716 = C1133.m2715(MagicFactory.get(-79615808764596L, strArr2) + str5 + '\'');
                                    if (cursorM2716 != null) {
                                        cursorM2716.moveToFirst();
                                    } else {
                                        cursorM2716 = null;
                                    }
                                    FriendInfo friendInfoM2177 = cursorM2716 != null ? AbstractC0743.m2176(cursorM2716) : null;
                                    if (friendInfoM2177 == null || (nickname = friendInfoM2177.getNickname()) == null) {
                                        nickname = MagicFactory.get(-395914380311220L, strArr2);
                                    }
                                    for (C2355 c2356 : AbstractC2371.f7619) {
                                        c2356.getClass();
                                        c2356.m4332(MagicFactory.get(-455176339061428L, strArr2), str6, asString, str5, nickname);
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
