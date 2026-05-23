package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0194 extends AbstractC2867 implements InterfaceC1601, InterfaceC1582 {

    public static final C0194 f1259;

    public static final String f1260;

    public static final String f1261;

    public static final String f1262;

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
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0190.f1255, dexKitBridge, new C0105(20));
        AbstractC1574.findMethod(C0192.f1257, dexKitBridge, new C0105(21));
        AbstractC1574.findMethod(C0191.f1256, dexKitBridge, new C0105(22));
    }

    @Override // p000.InterfaceC1601
    public final void mo1233(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        List listM3699;
        String[] strArr2 = AbstractC1574.f5469;
        if (mo3264() && str.equals("message") && AbstractC0270.m1390(new Integer[]{Integer.valueOf(EnumC3673.f11480.f11492), Integer.valueOf(EnumC3673.f11481.f11492)}).contains(contentValues.get("type"))) {
            String asString = contentValues.getAsString("content");
            if (asString.startsWith("\"") || asString.startsWith("「")) {
                Long asLong = contentValues.getAsLong("msgId");
                int i2 = 0;
                
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C2800.m4779()).m3492();
                c1973M3492.name = "rawQuery";
                Cursor cursor = (Cursor) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(Object[].class)}, 2, c1973M3492)).invoke("SELECT createTime, talker FROM message WHERE msgId = ?", new Object[]{asLong});
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            long j = cursor.getLong(cursor.getColumnIndex("createTime"));
                            String string = cursor.getString(cursor.getColumnIndex("talker"));
                            C1904 c1904M4123 = AbstractC2209.m4123(Pattern.compile("([\"「])(.*?)([」\"])").matcher(asString), 0, asString);
                            AbstractC2201.m3976(EnumC3673.f11478.f11492, string, "\"" + ((c1904M4123 == null || (listM3699 = c1904M4123.m3699()) == null) ? null : (String) ((C1903) listM3699).get(2)) + "\" " + C0193.f1258.m2542(), j + 1);
                            c1563.setReturn(1);
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
    public final void mo1126() throws NoSuchMethodException {
        Iterator it = AbstractC0745.listOf(C0190.f1255, C0192.f1257, C0191.f1256).iterator();
        while (it.hasNext()) {
            Class clsM3313 = AbstractC1574.dexToClass((AbstractC1021) it.next());
            int i = 0;
            MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(clsM3313).m3492();
            c1973M3492.returnType = Void.TYPE;
            c1973M3492.f4485 = 1;
            C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
            C0194 c0194 = f1259;
            C3689 c3689M4174 = c0194.m4174(c1982, 1);
            c0194.hookBefore(c3689M4174, new C0105(24));
            c3689M4174.applyHook();
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1262;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1261;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1260;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f1263;
    }
}
