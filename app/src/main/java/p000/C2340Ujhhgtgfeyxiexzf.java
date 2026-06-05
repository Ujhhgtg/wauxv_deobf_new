package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛴᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2340Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0745Ujhhgtgfeyxiexzf, InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2340Ujhhgtgfeyxiexzf f7635Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f7636Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f7637Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f7638Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C2976feyxiexzfUjhhgtg f7639Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f7635Ujhhgtgfeyxiexzf = new C2340Ujhhgtgfeyxiexzf(MagicFactory.get(4928348506847970698L, strArr));
        f7636Ujhhgtgfeyxiexzf = MagicFactory.get(4928351672238867850L, strArr);
        f7637Ujhhgtgfeyxiexzf = MagicFactory.get(4928351659353965962L, strArr);
        f7638Ujhhgtgfeyxiexzf = MagicFactory.get(4928351624994227594L, strArr);
        f7639Ujhhgtgfeyxiexzf = new C2976feyxiexzfUjhhgtg(19);
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C2336Ujhhgtgfeyxiexzf.f7631Ujhhgtgfeyxiexzf, dexKitBridge, new C2976feyxiexzfUjhhgtg(20));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C2338Ujhhgtgfeyxiexzf.f7633Ujhhgtgfeyxiexzf, dexKitBridge, new C2976feyxiexzfUjhhgtg(21));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C2337Ujhhgtgfeyxiexzf.f7632Ujhhgtgfeyxiexzf, dexKitBridge, new C2976feyxiexzfUjhhgtg(22));
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1830Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) throws IOException {
        List listM1285Ujhhgtgfeyxiexzf;
        String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg() && str.equals(MagicFactory.get(4928348575567447434L, strArr2)) && AbstractC2391Ujhhgtgfeyxiexzf.m3654feyxiexzfUjhhgtg(new Integer[]{Integer.valueOf(EnumC2267feyxiexzfUjhhgtg.f7418Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf), Integer.valueOf(EnumC2267feyxiexzfUjhhgtg.f7419Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf)}).contains(contentValues.get(MagicFactory.get(4928348541207709066L, strArr2)))) {
            String asString = contentValues.getAsString(MagicFactory.get(4928348657171826058L, strArr2));
            if (asString.startsWith(MagicFactory.get(4928348622812087690L, strArr2)) || asString.startsWith(MagicFactory.get(4928348614222153098L, strArr2))) {
                Long asLong = contentValues.getAsLong(MagicFactory.get(4928348605632218506L, strArr2));
                int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C1136feyxiexzfUjhhgtg.f4301Ujhhgtgfeyxiexzf.getClass();
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(C1136feyxiexzfUjhhgtg.m2603feyxiexzfUjhhgtg()).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928205819444462986L, strArr2);
                Cursor cursor = (Cursor) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Object[].class)}, 2, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(MagicFactory.get(4928347617789740426L, strArr2), new Object[]{asLong});
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            long j = cursor.getLong(cursor.getColumnIndex(MagicFactory.get(4928347793883399562L, strArr2)));
                            String string = cursor.getString(cursor.getColumnIndex(MagicFactory.get(4928347884077712778L, strArr2)));
                            C0207Ujhhgtgfeyxiexzf c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(Pattern.compile(MagicFactory.get(4928347854012941706L, strArr2)).matcher(asString), 0, asString);
                            AbstractC1246feyxiexzfUjhhgtg.m2767Ujhhgtgfeyxiexzf(EnumC2267feyxiexzfUjhhgtg.f7416Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf, string, "\"" + ((c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf == null || (listM1285Ujhhgtgfeyxiexzf = c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.m1285Ujhhgtgfeyxiexzf()) == null) ? null : (String) ((C0208Ujhhgtgfeyxiexzf) listM1285Ujhhgtgfeyxiexzf).get(2)) + MagicFactory.get(4928347914142483850L, strArr2) + C2339Ujhhgtgfeyxiexzf.f7634Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), j + 1);
                            c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf(1);
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
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() throws NoSuchMethodException {
        Iterator it = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(C2336Ujhhgtgfeyxiexzf.f7631Ujhhgtgfeyxiexzf, C2338Ujhhgtgfeyxiexzf.f7633Ujhhgtgfeyxiexzf, C2337Ujhhgtgfeyxiexzf.f7632Ujhhgtgfeyxiexzf).iterator();
        while (it.hasNext()) {
            Class clsM3152feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg((AbstractC3266feyxiexzfUjhhgtg) it.next());
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(clsM3152feyxiexzfUjhhgtg).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = Void.TYPE;
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f10481Ujhhgtgfeyxiexzf = 1;
            C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
            C2340Ujhhgtgfeyxiexzf c2340Ujhhgtgfeyxiexzf = f7635Ujhhgtgfeyxiexzf;
            C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf = c2340Ujhhgtgfeyxiexzf.m2996Ujhhgtgfeyxiexzf(c0393Ujhhgtgfeyxiexzf, 1);
            c2340Ujhhgtgfeyxiexzf.m1845feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf, new C2976feyxiexzfUjhhgtg(24));
            c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f7638Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f7637Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f7636Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f7639Ujhhgtgfeyxiexzf;
    }
}
