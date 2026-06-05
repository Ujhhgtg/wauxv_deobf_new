package p000;

import android.content.ContentValues;
import java.nio.charset.Charset;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ要点脸ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2328Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0745Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2328Ujhhgtgfeyxiexzf f7600Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f7601Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f7602Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f7603Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C2320Ujhhgtgfeyxiexzf f7604Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f7600Ujhhgtgfeyxiexzf = new C2328Ujhhgtgfeyxiexzf("AntiSnsDeleteHook");
        f7601Ujhhgtgfeyxiexzf = "朋友圈";
        f7602Ujhhgtgfeyxiexzf = "拦截朋友圈删除";
        f7603Ujhhgtgfeyxiexzf = "拦截朋友晚上偷偷删除的美图及其热评";
        f7604Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static C1381feyxiexzfUjhhgtg m3528feyxiexzfUjhhgtg(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = 1;
        if (i2 < 0) {
            i2 = (i2 & 127) + (bArr[i + 1] << 7);
            i3 = 2;
        }
        return new C1381feyxiexzfUjhhgtg(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static byte[] m3529feyxiexzfUjhhgtg(int i) {
        int i2 = i >> 7;
        return i2 > 0 ? new byte[]{(byte) ((i & 127) | 128), (byte) i2} : new byte[]{(byte) i};
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo2082Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        m3530feyxiexzfUjhhgtg(str, contentValues);
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1830Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        m3530feyxiexzfUjhhgtg(str, contentValues);
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f7603Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f7602Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f7601Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f7604Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final void m3530feyxiexzfUjhhgtg(String str, ContentValues contentValues) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            int i = -1;
            byte[] bArrM3652feyxiexzfUjhhgtg = null;
            if (str.equals("SnsInfo")) {
                if (AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(Integer.valueOf(EnumC2265feyxiexzfUjhhgtg.f7391Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf), Integer.valueOf(EnumC2265feyxiexzfUjhhgtg.f7392Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf), Integer.valueOf(EnumC2265feyxiexzfUjhhgtg.f7393Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf), Integer.valueOf(EnumC2265feyxiexzfUjhhgtg.f7394Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf), Integer.valueOf(EnumC2265feyxiexzfUjhhgtg.f7396Ujhhgtgfeyxiexzf.f7398Ujhhgtgfeyxiexzf)).contains(contentValues.get("type")) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(contentValues.get("sourceType"), 0)) {
                    byte[] bArr = (byte[]) contentValues.get("content");
                    contentValues.remove("sourceType");
                    String str2 = "content";
                    String strM4623Ujhhgtgfeyxiexzf = C2327Ujhhgtgfeyxiexzf.f7599Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                    if (strM4623Ujhhgtgfeyxiexzf != null && bArr != null) {
                        int length = bArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (42 == bArr[i2]) {
                                i = i2;
                                break;
                            }
                        }
                        int i3 = i + 1;
                        C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtgM3528feyxiexzfUjhhgtg = m3528feyxiexzfUjhhgtg(i3, bArr);
                        int iIntValue = ((Number) c1381feyxiexzfUjhhgtgM3528feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf).intValue();
                        int iIntValue2 = ((Number) c1381feyxiexzfUjhhgtgM3528feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).intValue();
                        int i4 = iIntValue + i3;
                        C0682Ujhhgtgfeyxiexzf c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg = AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(i4, bArr.length);
                        byte[] bArrM3648feyxiexzfUjhhgtg = c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg.isEmpty() ? new byte[0] : AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg.f2805Ujhhgtgfeyxiexzf, c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg.f2806Ujhhgtgfeyxiexzf + 1, bArr);
                        Charset charset = AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf;
                        if (new String(bArrM3648feyxiexzfUjhhgtg, charset).startsWith(strM4623Ujhhgtgfeyxiexzf)) {
                            bArrM3652feyxiexzfUjhhgtg = bArr;
                        } else {
                            byte[] bytes = strM4623Ujhhgtgfeyxiexzf.concat(" ").getBytes(charset);
                            "getBytes(...)";
                            byte[] bArrM3652feyxiexzfUjhhgtg2 = AbstractC2391Ujhhgtgfeyxiexzf.m3652feyxiexzfUjhhgtg(AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(0, i3, bArr), m3529feyxiexzfUjhhgtg(bytes.length + iIntValue2));
                            byte[] bytes2 = strM4623Ujhhgtgfeyxiexzf.concat(" ").getBytes(charset);
                            "getBytes(...)";
                            bArrM3652feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3652feyxiexzfUjhhgtg(AbstractC2391Ujhhgtgfeyxiexzf.m3652feyxiexzfUjhhgtg(bArrM3652feyxiexzfUjhhgtg2, bytes2), AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(i4, bArr.length, bArr));
                        }
                    }
                    contentValues.put(str2, bArrM3652feyxiexzfUjhhgtg);
                    return;
                }
                return;
            }
            if (str.equals("SnsComment") && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(contentValues.get("type"), 1) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(contentValues.get("commentflag"), 1)) {
                byte[] bArr2 = (byte[]) contentValues.get("curActionBuf");
                contentValues.remove("commentflag");
                String str3 = "curActionBuf";
                String strM4623Ujhhgtgfeyxiexzf2 = C2327Ujhhgtgfeyxiexzf.f7599Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                if (strM4623Ujhhgtgfeyxiexzf2 != null && bArr2 != null) {
                    int length2 = bArr2.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (34 == bArr2[i5]) {
                            i = i5;
                            break;
                        }
                    }
                    int i6 = i + bArr2[i + 1] + 13;
                    C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtgM3528feyxiexzfUjhhgtg2 = m3528feyxiexzfUjhhgtg(i6, bArr2);
                    int iIntValue3 = ((Number) c1381feyxiexzfUjhhgtgM3528feyxiexzfUjhhgtg2.f4874Ujhhgtgfeyxiexzf).intValue();
                    int iIntValue4 = ((Number) c1381feyxiexzfUjhhgtgM3528feyxiexzfUjhhgtg2.f4875Ujhhgtgfeyxiexzf).intValue();
                    int i7 = iIntValue3 + i6;
                    C0682Ujhhgtgfeyxiexzf c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg2 = AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(i7, bArr2.length);
                    byte[] bArrM3648feyxiexzfUjhhgtg2 = c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg2.isEmpty() ? new byte[0] : AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg2.f2805Ujhhgtgfeyxiexzf, c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg2.f2806Ujhhgtgfeyxiexzf + 1, bArr2);
                    Charset charset2 = AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf;
                    if (new String(bArrM3648feyxiexzfUjhhgtg2, charset2).startsWith(strM4623Ujhhgtgfeyxiexzf2)) {
                        bArrM3652feyxiexzfUjhhgtg = bArr2;
                    } else {
                        byte[] bytes3 = strM4623Ujhhgtgfeyxiexzf2.concat(" ").getBytes(charset2);
                        "getBytes(...)";
                        byte[] bArrM3652feyxiexzfUjhhgtg3 = AbstractC2391Ujhhgtgfeyxiexzf.m3652feyxiexzfUjhhgtg(AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(0, i6, bArr2), m3529feyxiexzfUjhhgtg(bytes3.length + iIntValue4));
                        byte[] bytes4 = strM4623Ujhhgtgfeyxiexzf2.concat(" ").getBytes(charset2);
                        "getBytes(...)";
                        bArrM3652feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3652feyxiexzfUjhhgtg(AbstractC2391Ujhhgtgfeyxiexzf.m3652feyxiexzfUjhhgtg(bArrM3652feyxiexzfUjhhgtg3, bytes4), AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(i7, bArr2.length, bArr2));
                    }
                }
                contentValues.put(str3, bArrM3652feyxiexzfUjhhgtg);
            }
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
