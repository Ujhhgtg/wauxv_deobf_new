package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤝᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2315 extends AbstractC1850 implements InterfaceC1614 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2315 f7498 = new C2315();

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo1379(C1574 c1574, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        String[] strArr2 = AbstractC1471.f5234;
        if (str.equals("chatroom")) {
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
                            if (asInteger.intValue() > i3) {
                                for (String str3 : AbstractC2727.m4708(setM2308, setM2309)) {
                                    String str4 = "join";
                                    C0818.f3214.getClass();
                                    String strM2488 = C0818.m2488(str3);
                                    Iterator it = AbstractC2419.m4354().iterator();
                                    while (it.hasNext()) {
                                        C2426 c2426M4355 = AbstractC2419.m4355((C2400) it.next());
                                        if (c2426M4355 != null) {
                                            c2426M4355.m4360("onMemberChange", str4, asString, str3, strM2488);
                                        }
                                    }
                                }
                            } else if (asInteger.intValue() < i3) {
                                for (String str5 : AbstractC2727.m4708(setM2309, setM2308)) {
                                    String str6 = "left";
                                    C0818.f3214.getClass();
                                    String strM2489 = C0818.m2488(str5);
                                    Iterator it2 = AbstractC2419.m4354().iterator();
                                    while (it2.hasNext()) {
                                        C2426 c2426M4356 = AbstractC2419.m4355((C2400) it2.next());
                                        if (c2426M4356 != null) {
                                            c2426M4356.m4360("onMemberChange", str6, asString, str5, strM2489);
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
    }
}
