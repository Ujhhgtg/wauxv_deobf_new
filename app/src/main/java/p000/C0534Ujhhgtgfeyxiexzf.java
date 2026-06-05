package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ要点脸ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0534Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf, InterfaceC0745Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0534Ujhhgtgfeyxiexzf f2502Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2503Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f2504Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2505Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C3528Ujhhgtgfeyxiexzf f2506Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928860479834555786L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928860445474817418L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f2502Ujhhgtgfeyxiexzf = new C0534Ujhhgtgfeyxiexzf("HandleGroupMemberHook");
        f2503Ujhhgtgfeyxiexzf = "群组";
        f2504Ujhhgtgfeyxiexzf = "监听群成员";
        f2505Ujhhgtgfeyxiexzf = "自动监听群成员退群时插入自定义提示";
        f2506Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(4);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static String m1829feyxiexzfUjhhgtg(String str, String str2, String str3) {
        C2897Ujhhgtgfeyxiexzf.f9174Ujhhgtgfeyxiexzf.getClass();
        String strM4277feyxiexzfUjhhgtg = C2897Ujhhgtgfeyxiexzf.m4277feyxiexzfUjhhgtg(str2, str);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        String strM4277feyxiexzfUjhhgtg2 = C2897Ujhhgtgfeyxiexzf.m4277feyxiexzfUjhhgtg(str2, "");
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(strM4277feyxiexzfUjhhgtg, strM4277feyxiexzfUjhhgtg2)) {
            strM4277feyxiexzfUjhhgtg = strM4277feyxiexzfUjhhgtg + '[' + strM4277feyxiexzfUjhhgtg2 + ']';
        }
        String strM4623Ujhhgtgfeyxiexzf = C0525Ujhhgtgfeyxiexzf.f2482Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
        String strM2641Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(str, "@chatroom");
        StringBuilder sb = new StringBuilder();
        sb.append("weixin://weixinhongbao/wauxv/chatroom_userinfo/");
        sb.append(strM2641Ujhhgtgfeyxiexzf);
        String strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, "__", str2);
        StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM4277feyxiexzfUjhhgtg);
        sbM2707Ujhhgtgfeyxiexzf.append("(<_wc_custom_link_ color=\"");
        sbM2707Ujhhgtgfeyxiexzf.append(strM4623Ujhhgtgfeyxiexzf);
        sbM2707Ujhhgtgfeyxiexzf.append("\" href=\"");
        sbM2707Ujhhgtgfeyxiexzf.append(strM2706Ujhhgtgfeyxiexzf);
        sbM2707Ujhhgtgfeyxiexzf.append("\">");
        sbM2707Ujhhgtgfeyxiexzf.append(str2);
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sbM2707Ujhhgtgfeyxiexzf, "</_wc_custom_link_>)", str3);
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C0526Ujhhgtgfeyxiexzf.f2483Ujhhgtgfeyxiexzf, dexKitBridge, new C3528Ujhhgtgfeyxiexzf(5));
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void mo1830Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg() && str.equals("chatroom")) {
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
                            if (asInteger.intValue() < i3) {
                                for (String str3 : AbstractC1106feyxiexzfUjhhgtg.m2575Ujhhgtgfeyxiexzf(setM4256Ujhhgtgfeyxiexzf2, setM4256Ujhhgtgfeyxiexzf)) {
                                    C0534Ujhhgtgfeyxiexzf c0534Ujhhgtgfeyxiexzf = f2502Ujhhgtgfeyxiexzf;
                                    String strM4623Ujhhgtgfeyxiexzf = C0533Ujhhgtgfeyxiexzf.f2501Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                                    c0534Ujhhgtgfeyxiexzf.getClass();
                                    AbstractC1246feyxiexzfUjhhgtg.m2767Ujhhgtgfeyxiexzf(EnumC2267feyxiexzfUjhhgtg.f7416Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf, asString, m1829feyxiexzfUjhhgtg(asString, str3, strM4623Ujhhgtgfeyxiexzf), System.currentTimeMillis());
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
        List listSingletonList = Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C0526Ujhhgtgfeyxiexzf.f2483Ujhhgtgfeyxiexzf));
        C0534Ujhhgtgfeyxiexzf c0534Ujhhgtgfeyxiexzf = f2502Ujhhgtgfeyxiexzf;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c0534Ujhhgtgfeyxiexzf, listSingletonList);
        c0534Ujhhgtgfeyxiexzf.m1845feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C3528Ujhhgtgfeyxiexzf(6));
        c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f2505Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f2504Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f2503Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f2506Ujhhgtgfeyxiexzf;
    }
}
