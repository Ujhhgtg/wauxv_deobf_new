package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᤝᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1513 extends AbstractC2867 implements InterfaceC1582, InterfaceC1601 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1513 f5334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f5337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C1338 f5338;

    static {
        AbstractC1574.m3300(-552384333871796L);
        AbstractC1574.m3300(-552418693610164L);
        String[] strArr = AbstractC1574.f5469;
        f5334 = new C1513("HandleGroupMemberHook");
        f5335 = "群组";
        f5336 = "监听群成员";
        f5337 = "自动监听群成员退群时插入自定义提示";
        f5338 = new C1338(16);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static String m3249(String str, String str2, String str3) throws IllegalAccessException, InvocationTargetException {
        
        String strM2063 = C0669.m2063(str2, str);
        String[] strArr = AbstractC1574.f5469;
        String strM2064 = C0669.m2063(str2, "");
        if (!AbstractC2207.m4087(strM2063, strM2064)) {
            strM2063 = strM2063 + '[' + strM2064 + ']';
        }
        String strM2542 = C1511.f5332.m2542();
        String strM4845 = AbstractC2841.m4845(str, "@chatroom");
        StringBuilder sb = new StringBuilder();
        sb.append("weixin://weixinhongbao/wauxv/chatroom_userinfo/");
        sb.append(strM4845);
        String strM4752 = AbstractC2784.m4752(sb, "__", str2);
        StringBuilder sbM4753 = AbstractC2784.m4753(strM2063);
        sbM4753.append("(<_wc_custom_link_ color=\"");
        sbM4753.append(strM2542);
        sbM4753.append("\" href=\"");
        sbM4753.append(strM4752);
        sbM4753.append("\">");
        sbM4753.append(str2);
        return AbstractC2784.m4752(sbM4753, "</_wc_custom_link_>)", str3);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1510.f5331, dexKitBridge, new C1338(17));
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo1233(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        String[] strArr2 = AbstractC1574.f5469;
        if (mo3264() && str.equals("chatroom")) {
            String asString = contentValues.getAsString("chatroomname");
            Integer asInteger = contentValues.getAsInteger("memberCount");
            String asString2 = contentValues.getAsString("memberlist");
            if (asString2 == null || AbstractC2841.m4836(asString2)) {
                return;
            }
            Set setM2209 = AbstractC0744.m2209(AbstractC2841.m4843(asString2, new String[]{";"}));
            int i2 = 0;
            
            MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C2800.m4779()).m3492();
            c1973M3492.name = "rawQuery";
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
                            if (asInteger.intValue() < i3) {
                                for (String str3 : AbstractC2665.m4669(setM22010, setM2209)) {
                                    C1513 c1513 = f5334;
                                    String strM2542 = C1512.f5333.m2542();
                                    
                                    AbstractC2201.m3976(EnumC3673.f11478.f11492, asString, m3249(asString, str3, strM2542), System.currentTimeMillis());
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
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C1510.f5331));
        C1513 c1513 = f5334;
        C3689 c3689M4172 = C2309.createHook(c1513, listSingletonList);
        c1513.hookBefore(c3689M4172, new C1338(18));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f5337;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f5336;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f5335;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f5338;
    }
}
