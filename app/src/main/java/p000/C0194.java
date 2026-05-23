package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᤝᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0194 extends AbstractC2867 implements InterfaceC1601, InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0194 f1259;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1260;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f1262;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C0105 f1263;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1259 = new C0194("AntiRevoke2Hook");
        f1260 = "聊天";
        f1261 = "阻止消息撤回2";
        f1262 = "消息有撤回提示，通用款，三款选一款";
        f1263 = new C0105(19);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C0190.f1255, dexKitBridge, new C0105(20));
        AbstractC1574.m3295(C0192.f1257, dexKitBridge, new C0105(21));
        AbstractC1574.m3295(C0191.f1256, dexKitBridge, new C0105(22));
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void mo1233(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        List listM3699;
        String[] strArr2 = AbstractC1574.f5469;
        if (mo3264() && str.equals("message") && AbstractC0270.m1390(new Integer[]{Integer.valueOf(EnumC3673.f11480.f11492), Integer.valueOf(EnumC3673.f11481.f11492)}).contains(contentValues.get("type"))) {
            String asString = contentValues.getAsString("content");
            if (asString.startsWith("\"") || asString.startsWith("「")) {
                Long asLong = contentValues.getAsLong("msgId");
                int i2 = AbstractC1745.f5844;
                C2800.f8930.getClass();
                C1973 c1973M3492 = AbstractC0968.m2484(C2800.m4779()).m3492();
                c1973M3492.f6370 = "rawQuery";
                Cursor cursor = (Cursor) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class), AbstractC2519.m4527(Object[].class)}, 2, c1973M3492)).m3832("SELECT createTime, talker FROM message WHERE msgId = ?", new Object[]{asLong});
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            long j = cursor.getLong(cursor.getColumnIndex("createTime"));
                            String string = cursor.getString(cursor.getColumnIndex("talker"));
                            C1904 c1904M4123 = AbstractC2209.m4123(Pattern.compile("([\"「])(.*?)([」\"])").matcher(asString), 0, asString);
                            AbstractC2201.m3976(EnumC3673.f11478.f11492, string, "\"" + ((c1904M4123 == null || (listM3699 = c1904M4123.m3699()) == null) ? null : (String) ((C1903) listM3699).get(2)) + "\" " + C0193.f1258.m2542(), j + 1);
                            c1563.m3272(1);
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
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() throws NoSuchMethodException {
        Iterator it = AbstractC0745.m2212(C0190.f1255, C0192.f1257, C0191.f1256).iterator();
        while (it.hasNext()) {
            Class clsM3313 = AbstractC1574.m3313((AbstractC1021) it.next());
            int i = AbstractC1745.f5844;
            C1973 c1973M3492 = AbstractC0968.m2484(clsM3313).m3492();
            c1973M3492.f6543 = Void.TYPE;
            c1973M3492.f4485 = 1;
            C1982 c1982 = (C1982) AbstractC0744.m2191(c1973M3492.m3799());
            C0194 c0194 = f1259;
            C3689 c3689M4174 = c0194.m4174(c1982, 1);
            c0194.m3263(c3689M4174, new C0105(24));
            c3689M4174.m5352();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f1262;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f1261;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f1260;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f1263;
    }
}
