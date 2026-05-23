package p000;

import android.content.ContentValues;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0202 extends AbstractC2867 implements InterfaceC1601 {

    public static final C0202 f1282;

    public static final String f1283;

    public static final String f1284;

    public static final String f1285;

    public static final C0199 f1286;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1282 = new C0202("AntiSnsDeleteHook");
        f1283 = "朋友圈";
        f1284 = "拦截朋友圈删除";
        f1285 = "拦截朋友晚上偷偷删除的美图及其热评";
        f1286 = new C0199(1);
    }

    public static C2315 m1234(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = 1;
        if (i2 < 0) {
            i2 = (i2 & 127) + (bArr[i + 1] << 7);
            i3 = 2;
        }
        return new C2315(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static byte[] m1235(int i) {
        int i2 = i >> 7;
        return i2 > 0 ? new byte[]{(byte) ((i & 127) | 128), (byte) i2} : new byte[]{(byte) i};
    }

    @Override // p000.InterfaceC1601
    public final void mo1236(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        m1237(str, contentValues);
    }

    @Override // p000.InterfaceC1601
    public final void mo1233(C1563 c1563, String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        m1237(str, contentValues);
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1285;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1284;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1283;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f1286;
    }

    public final void m1237(String str, ContentValues contentValues) {
        if (mo3264()) {
            String[] strArr = AbstractC1574.f5469;
            int i = -1;
            byte[] bArrM1388 = null;
            if (str.equals("SnsInfo")) {
                if (AbstractC0745.listOf(Integer.valueOf(EnumC3676.f11519.f11526), Integer.valueOf(EnumC3676.f11520.f11526), Integer.valueOf(EnumC3676.f11521.f11526), Integer.valueOf(EnumC3676.f11522.f11526), Integer.valueOf(EnumC3676.f11524.f11526)).contains(contentValues.get("type")) && AbstractC2207.m4087(contentValues.get("sourceType"), 0)) {
                    byte[] bArr = (byte[]) contentValues.get("content");
                    contentValues.remove("sourceType");
                    String str2 = "content";
                    String strM2542 = C0201.f1281.m2542();
                    if (strM2542 != null && bArr != null) {
                        int length = bArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (42 == bArr[i2]) {
                                i = i2;
                                break;
                            }
                        }
                        int i3 = i + 1;
                        C2315 c2315M1234 = m1234(i3, bArr);
                        int iIntValue = ((Number) c2315M1234.f7445).intValue();
                        int iIntValue2 = ((Number) c2315M1234.f7446).intValue();
                        int i4 = iIntValue + i3;
                        C1664 c1664M4044 = AbstractC2203.m4044(i4, bArr.length);
                        byte[] bArrM1384 = c1664M4044.isEmpty() ? new byte[0] : AbstractC0270.m1384(c1664M4044.f5612, c1664M4044.f5613 + 1, bArr);
                        Charset charset = AbstractC0599.f2413;
                        if (new String(bArrM1384, charset).startsWith(strM2542)) {
                            bArrM1388 = bArr;
                        } else {
                            byte[] bytes = strM2542.concat(" ").getBytes(charset);
                            "getBytes(...)";
                            byte[] bArrM1389 = AbstractC0270.m1388(AbstractC0270.m1384(0, i3, bArr), m1235(bytes.length + iIntValue2));
                            byte[] bytes2 = strM2542.concat(" ").getBytes(charset);
                            "getBytes(...)";
                            bArrM1388 = AbstractC0270.m1388(AbstractC0270.m1388(bArrM1389, bytes2), AbstractC0270.m1384(i4, bArr.length, bArr));
                        }
                    }
                    contentValues.put("content", bArrM1388);
                    return;
                }
                return;
            }
            if (str.equals("SnsComment") && !AbstractC2207.m4087(contentValues.get("type"), 1) && AbstractC2207.m4087(contentValues.get("commentflag"), 1)) {
                byte[] bArr2 = (byte[]) contentValues.get("curActionBuf");
                contentValues.remove("commentflag");
                String str3 = "curActionBuf";
                String strM2543 = C0201.f1281.m2542();
                if (strM2543 != null && bArr2 != null) {
                    int length2 = bArr2.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (34 == bArr2[i5]) {
                            i = i5;
                            break;
                        }
                    }
                    int i6 = i + bArr2[i + 1] + 13;
                    C2315 c2315M1235 = m1234(i6, bArr2);
                    int iIntValue3 = ((Number) c2315M1235.f7445).intValue();
                    int iIntValue4 = ((Number) c2315M1235.f7446).intValue();
                    int i7 = iIntValue3 + i6;
                    C1664 c1664M4045 = AbstractC2203.m4044(i7, bArr2.length);
                    byte[] bArrM1385 = c1664M4045.isEmpty() ? new byte[0] : AbstractC0270.m1384(c1664M4045.f5612, c1664M4045.f5613 + 1, bArr2);
                    Charset charset2 = AbstractC0599.f2413;
                    if (new String(bArrM1385, charset2).startsWith(strM2543)) {
                        bArrM1388 = bArr2;
                    } else {
                        byte[] bytes3 = strM2543.concat(" ").getBytes(charset2);
                        "getBytes(...)";
                        byte[] bArrM13810 = AbstractC0270.m1388(AbstractC0270.m1384(0, i6, bArr2), m1235(bytes3.length + iIntValue4));
                        byte[] bytes4 = strM2543.concat(" ").getBytes(charset2);
                        "getBytes(...)";
                        bArrM1388 = AbstractC0270.m1388(AbstractC0270.m1388(bArrM13810, bytes4), AbstractC0270.m1384(i7, bArr2.length, bArr2));
                    }
                }
                contentValues.put("curActionBuf", bArrM1388);
            }
        }
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
