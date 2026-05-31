package p000;

import android.content.ContentValues;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᲇᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0210 extends AbstractC2927 implements InterfaceC1614 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0210 f1350;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f1351;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0207 f1354;

    static {
        String[] strArr = AbstractC1471.f5234;
        f1350 = new C0210("AntiSnsDeleteHook");
        f1351 = "朋友圈";
        f1352 = "拦截朋友圈删除";
        f1353 = "拦截朋友晚上偷偷删除的美图及其热评";
        f1354 = new C0207(1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static C2348 m1380(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = 1;
        if (i2 < 0) {
            i2 = (i2 & 127) + (bArr[i + 1] << 7);
            i3 = 2;
        }
        return new C2348(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static byte[] m1381(int i) {
        int i2 = i >> 7;
        return i2 > 0 ? new byte[]{(byte) ((i & 127) | 128), (byte) i2} : new byte[]{(byte) i};
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo1382(C1574 c1574, String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        m1383(str, contentValues);
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo1379(C1574 c1574, String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        m1383(str, contentValues);
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f1353;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f1352;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f1351;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f1354;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void m1383(String str, ContentValues contentValues) {
        if (mo3445()) {
            String[] strArr = AbstractC1471.f5234;
            int i = -1;
            byte[] bArrM1534 = null;
            if (str.equals("SnsInfo")) {
                if (AbstractC0740.m2311(Integer.valueOf(EnumC3736.f11668.f11675), Integer.valueOf(EnumC3736.f11669.f11675), Integer.valueOf(EnumC3736.f11670.f11675), Integer.valueOf(EnumC3736.f11671.f11675), Integer.valueOf(EnumC3736.f11673.f11675)).contains(contentValues.get("type")) && AbstractC1469.m3322(contentValues.get("sourceType"), 0)) {
                    byte[] bArr = (byte[]) contentValues.get("content");
                    contentValues.remove("sourceType");
                    String str2 = "content";
                    String strM2666 = C0209.f1349.m2666();
                    if (strM2666 != null && bArr != null) {
                        int length = bArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (42 == bArr[i2]) {
                                i = i2;
                                break;
                            }
                        }
                        int i3 = i + 1;
                        C2348 c2348M1380 = m1380(i3, bArr);
                        int iIntValue = ((Number) c2348M1380.f7567).intValue();
                        int iIntValue2 = ((Number) c2348M1380.f7568).intValue();
                        int i4 = iIntValue + i3;
                        C1679 c1679M5348 = AbstractC3744.m5348(i4, bArr.length);
                        byte[] bArrM1530 = c1679M5348.isEmpty() ? new byte[0] : AbstractC0280.m1530(c1679M5348.f5650, c1679M5348.f5651 + 1, bArr);
                        Charset charset = AbstractC0580.UTF_8;
                        if (new String(bArrM1530, charset).startsWith(strM2666)) {
                            bArrM1534 = bArr;
                        } else {
                            byte[] bytes = strM2666.concat(" ").getBytes(charset);
                            "getBytes(...)";
                            byte[] bArrM1535 = AbstractC0280.m1534(AbstractC0280.m1530(0, i3, bArr), m1381(bytes.length + iIntValue2));
                            byte[] bytes2 = strM2666.concat(" ").getBytes(charset);
                            "getBytes(...)";
                            bArrM1534 = AbstractC0280.m1534(AbstractC0280.m1534(bArrM1535, bytes2), AbstractC0280.m1530(i4, bArr.length, bArr));
                        }
                    }
                    contentValues.put(str2, bArrM1534);
                    return;
                }
                return;
            }
            if (str.equals("SnsComment") && !AbstractC1469.m3322(contentValues.get("type"), 1) && AbstractC1469.m3322(contentValues.get("commentflag"), 1)) {
                byte[] bArr2 = (byte[]) contentValues.get("curActionBuf");
                contentValues.remove("commentflag");
                String str3 = "curActionBuf";
                String strM2667 = C0209.f1349.m2666();
                if (strM2667 != null && bArr2 != null) {
                    int length2 = bArr2.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (34 == bArr2[i5]) {
                            i = i5;
                            break;
                        }
                    }
                    int i6 = i + bArr2[i + 1] + 13;
                    C2348 c2348M1381 = m1380(i6, bArr2);
                    int iIntValue3 = ((Number) c2348M1381.f7567).intValue();
                    int iIntValue4 = ((Number) c2348M1381.f7568).intValue();
                    int i7 = iIntValue3 + i6;
                    C1679 c1679M5349 = AbstractC3744.m5348(i7, bArr2.length);
                    byte[] bArrM1531 = c1679M5349.isEmpty() ? new byte[0] : AbstractC0280.m1530(c1679M5349.f5650, c1679M5349.f5651 + 1, bArr2);
                    Charset charset2 = AbstractC0580.UTF_8;
                    if (new String(bArrM1531, charset2).startsWith(strM2667)) {
                        bArrM1534 = bArr2;
                    } else {
                        byte[] bytes3 = strM2667.concat(" ").getBytes(charset2);
                        "getBytes(...)";
                        byte[] bArrM1536 = AbstractC0280.m1534(AbstractC0280.m1530(0, i6, bArr2), m1381(bytes3.length + iIntValue4));
                        byte[] bytes4 = strM2667.concat(" ").getBytes(charset2);
                        "getBytes(...)";
                        bArrM1534 = AbstractC0280.m1534(AbstractC0280.m1534(bArrM1536, bytes4), AbstractC0280.m1530(i7, bArr2.length, bArr2));
                    }
                }
                contentValues.put(str3, bArrM1534);
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
