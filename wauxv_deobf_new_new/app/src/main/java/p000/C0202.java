package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0202 extends AbstractC2927 implements InterfaceC1614, InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0202 f1327;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f1328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0113 f1331;

    static {
        String[] strArr = AbstractC1471.f5234;
        f1327 = new C0202("AntiRevoke2Hook");
        f1328 = "聊天";
        f1329 = "阻止消息撤回2";
        f1330 = "消息有撤回提示，通用款，三款选一款";
        f1331 = new C0113(19);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0198.f1323, dexKitBridge, new C0113(20));
        AbstractC0972.m2592(C0200.f1325, dexKitBridge, new C0113(21));
        AbstractC0972.m2592(C0199.f1324, dexKitBridge, new C0113(22));
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void mo1379(C1574 c1574, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        List listM3883;
        String[] strArr2 = AbstractC1471.f5234;
        if (mo3445() && str.equals("message") && AbstractC0280.m1536(new Integer[]{Integer.valueOf(EnumC3733.f11629.f11641), Integer.valueOf(EnumC3733.f11630.f11641)}).contains(contentValues.get("type"))) {
            String asString = contentValues.getAsString("content");
            if (asString.startsWith("\"") || asString.startsWith("「")) {
                Long asLong = contentValues.getAsLong("msgId");
                int i2 = AbstractC1768.f5906;
                C2859.f9091.getClass();
                C2004 c2004M3560 = AbstractC2727.m4713(C2859.m4812()).m3560();
                c2004M3560.f6475 = "rawQuery";
                Cursor cursor = (Cursor) ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(Object[].class)}, 2, c2004M3560)).m4026("SELECT createTime, talker FROM message WHERE msgId = ?", new Object[]{asLong});
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            long j = cursor.getLong(cursor.getColumnIndex("createTime"));
                            String string = cursor.getString(cursor.getColumnIndex("talker"));
                            C1931 c1931M3093 = AbstractC1272.m3093(Pattern.compile("([\"「])(.*?)([」\"])").matcher(asString), 0, asString);
                            AbstractC0738.m2275(EnumC3733.f11627.f11641, string, "\"" + ((c1931M3093 == null || (listM3883 = c1931M3093.m3883()) == null) ? null : (String) ((C1930) listM3883).get(2)) + "\" " + C0201.f1326.m2666(), j + 1);
                            c1574.m3452(1);
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
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() throws NoSuchMethodException {
        Iterator it = AbstractC0740.m2311(C0198.f1323, C0200.f1325, C0199.f1324).iterator();
        while (it.hasNext()) {
            Class clsM2608 = AbstractC0972.m2608((AbstractC1024) it.next());
            int i = AbstractC1768.f5906;
            C2004 c2004M3560 = AbstractC2727.m4713(clsM2608).m3560();
            c2004M3560.f6648 = Void.TYPE;
            c2004M3560.f4484 = 1;
            C2013 c2013 = (C2013) AbstractC0739.m2290(c2004M3560.m3993());
            C0202 c0202 = f1327;
            C3752 c3752M4303 = c0202.m4303(c2013, 1);
            c0202.m3444(c3752M4303, new C0113(24));
            c3752M4303.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f1330;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f1329;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f1328;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f1331;
    }
}
