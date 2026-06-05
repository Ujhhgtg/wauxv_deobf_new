package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛴᛲᛳ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1323feyxiexzfUjhhgtg extends AbstractC0255Ujhhgtgfeyxiexzf implements InterfaceC0745Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C1323feyxiexzfUjhhgtg f4801Ujhhgtgfeyxiexzf = new C1323feyxiexzfUjhhgtg();

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1830Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (str.equals("chatroom")) {
            String asString = contentValues.getAsString("chatroomname");
            Integer asInteger = contentValues.getAsInteger("memberCount");
            String asString2 = contentValues.getAsString("memberlist");
            if (asString2 == null || AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(asString2)) {
                return;
            }
            Set setM4256Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(asString2, new String[]{";"}));
            int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C1136feyxiexzfUjhhgtg.f4301Ujhhgtgfeyxiexzf.getClass();
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(C1136feyxiexzfUjhhgtg.m2603feyxiexzfUjhhgtg()).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "rawQuery";
            Cursor cursor = (Cursor) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Object[].class)}, 2, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf("SELECT memberlist, memberCount FROM chatroom WHERE chatroomname = ?", new Object[]{asString});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i3 = cursor.getInt(cursor.getColumnIndex("memberCount"));
                        if (i3 == 0) {
                            cursor.close();
                            return;
                        }
                        String string = cursor.getString(cursor.getColumnIndex("memberlist"));
                        if (string != null && !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(string)) {
                            Set setM4256Ujhhgtgfeyxiexzf2 = AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(string, new String[]{";"}));
                            if (asInteger.intValue() > i3) {
                                for (String str3 : AbstractC1106feyxiexzfUjhhgtg.m2575Ujhhgtgfeyxiexzf(setM4256Ujhhgtgfeyxiexzf, setM4256Ujhhgtgfeyxiexzf2)) {
                                    String str4 = "join";
                                    C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf.getClass();
                                    String strM5373feyxiexzfUjhhgtg = C3681feyxiexzfUjhhgtg.m5373feyxiexzfUjhhgtg(str3);
                                    Iterator it = AbstractC1453feyxiexzfUjhhgtg.m2962Ujhhgtgfeyxiexzf().iterator();
                                    while (it.hasNext()) {
                                        C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf = AbstractC1453feyxiexzfUjhhgtg.m2963Ujhhgtgfeyxiexzf((C1414feyxiexzfUjhhgtg) it.next());
                                        if (c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf != null) {
                                            c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf.m2928Ujhhgtgfeyxiexzf("onMemberChange", str4, asString, str3, strM5373feyxiexzfUjhhgtg);
                                        }
                                    }
                                }
                            } else if (asInteger.intValue() < i3) {
                                for (String str5 : AbstractC1106feyxiexzfUjhhgtg.m2575Ujhhgtgfeyxiexzf(setM4256Ujhhgtgfeyxiexzf2, setM4256Ujhhgtgfeyxiexzf)) {
                                    String str6 = "left";
                                    C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf.getClass();
                                    String strM5373feyxiexzfUjhhgtg2 = C3681feyxiexzfUjhhgtg.m5373feyxiexzfUjhhgtg(str5);
                                    Iterator it2 = AbstractC1453feyxiexzfUjhhgtg.m2962Ujhhgtgfeyxiexzf().iterator();
                                    while (it2.hasNext()) {
                                        C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf2 = AbstractC1453feyxiexzfUjhhgtg.m2963Ujhhgtgfeyxiexzf((C1414feyxiexzfUjhhgtg) it2.next());
                                        if (c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf2 != null) {
                                            c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf2.m2928Ujhhgtgfeyxiexzf("onMemberChange", str6, asString, str5, strM5373feyxiexzfUjhhgtg2);
                                        }
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
                        AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursor, th);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
