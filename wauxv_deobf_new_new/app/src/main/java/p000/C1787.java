package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.alibaba.fastjson2.JSONB;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᛸᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1787 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1174 f5941;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C1174 f5942;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Object f5943 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5944;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final SideSheetBehavior f5945;

    static {
        int i = 1;
        f5941 = new C1174("REMOVED_TASK", i);
        f5942 = new C1174("CLOSED_EMPTY", i);
    }

    public /* synthetic */ C1787(SideSheetBehavior sideSheetBehavior, int i) {
        this.f5944 = i;
        this.f5945 = sideSheetBehavior;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3662(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3663(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m3664(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m3665(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
            } else {
                if (cCharAt == '\'') {
                    return i;
                }
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C0694 m3666(DexKitBridge dexKitBridge, C0056 c0056) {
        int iM1054 = c0056.m1054(4);
        int i = iM1054 != 0 ? c0056.f1045.getInt(iM1054 + c0056.f1044) : 0;
        int iM1055 = c0056.m1054(6);
        int i2 = iM1055 != 0 ? c0056.f1045.getInt(iM1055 + c0056.f1044) : 0;
        int iM1056 = c0056.m1054(8);
        if (iM1056 != 0) {
            c0056.m1056(iM1056 + c0056.f1044);
        }
        int iM1057 = c0056.m1054(10);
        int i3 = iM1057 != 0 ? c0056.f1045.getInt(iM1057 + c0056.f1044) : 0;
        int iM1058 = c0056.m1054(12);
        String strM1056 = iM1058 != 0 ? c0056.m1056(iM1058 + c0056.f1044) : null;
        if (strM1056 == null) {
            strM1056 = "";
        }
        String str = strM1056;
        int iM1059 = c0056.m1054(14);
        int i4 = iM1059 != 0 ? c0056.f1045.getInt(iM1059 + c0056.f1044) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM10510 = c0056.m1054(16);
        int iM10511 = iM10510 != 0 ? c0056.m1058(iM10510) : 0;
        for (int i5 = 0; i5 < iM10511; i5++) {
            int iM10512 = c0056.m1054(16);
            arrayList.add(Integer.valueOf(iM10512 != 0 ? c0056.f1045.getInt((i5 * 4) + c0056.m1057(iM10512)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM10513 = c0056.m1054(18);
        int iM10514 = iM10513 != 0 ? c0056.m1058(iM10513) : 0;
        for (int i6 = 0; i6 < iM10514; i6++) {
            int iM10515 = c0056.m1054(18);
            arrayList2.add(Integer.valueOf(iM10515 != 0 ? c0056.f1045.getInt((i6 * 4) + c0056.m1057(iM10515)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM10516 = c0056.m1054(20);
        int iM10517 = iM10516 != 0 ? c0056.m1058(iM10516) : 0;
        for (int i7 = 0; i7 < iM10517; i7++) {
            int iM10518 = c0056.m1054(20);
            arrayList3.add(Integer.valueOf(iM10518 != 0 ? c0056.f1045.getInt((i7 * 4) + c0056.m1057(iM10518)) : 0));
        }
        return new C0694(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static Drawable m3667(Context context, int i) {
        return C2633.m4607().m4610(context, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static boolean m3668(int i, String str) {
        int i2 = i + 2;
        return i2 < str.length() && str.charAt(i) == '\"' && str.charAt(i + 1) == '\"' && str.charAt(i2) == '\"';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static boolean m3669(byte[] bArr) {
        int iNextInt;
        String[] strArr = AbstractC1471.f5234;
        byte[] bytes = "wxgf".getBytes(AbstractC0580.UTF_8);
        "getBytes(...)";
        if (bArr.length >= bytes.length) {
            Iterable c1679 = new C1679(0, bytes.length - 1, 1);
            if (!(c1679 instanceof Collection) || !((Collection) c1679).isEmpty()) {
                Iterator it = c1679.iterator();
                do {
                    C1678 c1678 = (C1678) it;
                    if (c1678.f5655) {
                        iNextInt = c1678.nextInt();
                    }
                } while (bArr[iNextInt] == bytes[iNextInt]);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m3670(SharedPreferencesC1271 sharedPreferencesC1271, C0231 c0231, C0378 c0378, byte b, String str, int i) {
        HashMap map = sharedPreferencesC1271.f4613;
        if (b == 1) {
            byte[] bArr = (byte[]) c0231.f1427;
            int i2 = c0231.f1425;
            c0231.f1425 = i2 + 1;
            map.put(str, new C0824(i, bArr[i2] == 1));
            return;
        }
        if (b == 2) {
            int iM1409 = c0231.m1409();
            if (c0378 != null) {
                iM1409 ^= c0378.f1873;
            }
            map.put(str, new C0827(i, iM1409));
            return;
        }
        if (b == 3) {
            int iM14010 = c0231.m1409();
            if (c0378 != null) {
                iM14010 ^= c0378.f1873;
            }
            map.put(str, new C0826(i, Float.intBitsToFloat(iM14010)));
            return;
        }
        if (b != 4) {
            long jM1411 = c0231.m1411(c0231.f1425);
            c0231.f1425 += 8;
            if (c0378 != null) {
                jM1411 ^= (long) c0378.f1873;
            }
            map.put(str, new C0825(i, Double.longBitsToDouble(jM1411)));
            return;
        }
        long jM1412 = c0231.m1411(c0231.f1425);
        c0231.f1425 += 8;
        if (c0378 != null) {
            jM1412 ^= (long) c0378.f1873;
        }
        map.put(str, new C0828(i, jM1412));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static void m3671(SharedPreferencesC1271 sharedPreferencesC1271, C0231 c0231, C0378 c0378, byte b, String str, int i, int i2, byte b2) throws Exception {
        Object objM1698;
        int length;
        C0231 c0232;
        byte b3 = b;
        HashMap map = sharedPreferencesC1271.f4613;
        boolean z = b3 == 9 || b3 == 10 || b3 == 11;
        int iM1409 = z ? c0231.m1409() : c0231.m1412() & 65535;
        int i3 = z ? 4 : 2;
        boolean z2 = (b2 & JSONB.Constants.BC_INT32_SHORT_MIN) != 0;
        if (z2 && iM1409 != 32) {
            throw new IllegalStateException("name size not match");
        }
        switch (b3) {
            case 9:
                b3 = 6;
                break;
            case 10:
                b3 = 7;
                break;
            case 11:
                b3 = 8;
                break;
        }
        if (b3 == 6) {
            map.put(str, new C0830(i2, i + i3, z2 ? c0231.m1413(iM1409) : c0231.m1414(c0378, iM1409), iM1409, z2));
            return;
        }
        if (b3 == 7) {
            if (z2) {
                objM1698 = c0231.m1413(iM1409);
            } else {
                c0231.getClass();
                byte[] bArr = new byte[iM1409];
                System.arraycopy((byte[]) c0231.f1427, c0231.f1425, bArr, 0, iM1409);
                c0231.f1425 += iM1409;
                objM1698 = c0378 != null ? c0378.m1698(bArr) : bArr;
            }
            map.put(str, new C0822(i2, i + i3, objM1698, iM1409, z2));
            return;
        }
        if (z2) {
            map.put(str, new C0829(i2, i + i3, c0231.m1413(iM1409), iM1409, true));
            return;
        }
        if (c0378 == null) {
            c0232 = sharedPreferencesC1271.f4615;
            length = iM1409;
        } else {
            byte[] bArr2 = new byte[iM1409];
            C0231 c0233 = sharedPreferencesC1271.f4615;
            System.arraycopy((byte[]) c0233.f1427, c0233.f1425, bArr2, 0, iM1409);
            byte[] bArrM1698 = c0378.m1698(bArr2);
            C0231 c0234 = new C0231(0, bArrM1698);
            length = bArrM1698.length;
            c0232 = c0234;
        }
        byte[] bArr3 = (byte[]) c0232.f1427;
        int i4 = c0232.f1425;
        c0232.f1425 = i4 + 1;
        int i5 = bArr3[i4] & 255;
        String strM1413 = c0232.m1413(i5);
        C2900 c2900 = (C2900) sharedPreferencesC1271.f4609.get(strM1413);
        int i6 = length - (i5 + 1);
        if (i6 < 0) {
            throw new Exception("parse dara failed");
        }
        if (c2900 != null) {
            try {
                C0829 c0829 = new C0829(i2, i + 2, c2900.m4859(c0232.f1425, i6, (byte[]) c0232.f1427), iM1409, false);
                c0829.f3232 = c2900;
                map.put(str, c0829);
            } catch (Exception e) {
                Log.e("FastKV", sharedPreferencesC1271.f4608, e);
            }
        } else {
            AbstractC1272.m3097(sharedPreferencesC1271, "object with tag: " + strM1413 + " without encoder");
        }
        c0231.f1425 = i + i3 + iM1409;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static boolean m3672(SharedPreferencesC1271 sharedPreferencesC1271, boolean z) {
        int iM1409;
        SharedPreferencesC1271 sharedPreferencesC1272 = sharedPreferencesC1271;
        C0378 c0378 = sharedPreferencesC1272.f4610;
        boolean z2 = false;
        if (z && c0378 == null) {
            AbstractC1272.m3097(sharedPreferencesC1272, "miss cipher");
            return false;
        }
        C0378 c0379 = z ? c0378 : null;
        C0231 c0231 = sharedPreferencesC1272.f4615;
        String str = sharedPreferencesC1272.f4608;
        c0231.f1425 = 12;
        while (true) {
            try {
                int i = c0231.f1425;
                int i2 = sharedPreferencesC1272.f4611;
                boolean z3 = true;
                if (i >= i2) {
                    if (i != i2) {
                        Log.e("FastKV", str, new Exception("parse dara failed"));
                        return false;
                    }
                    if (!z && c0378 != null && i2 != 12) {
                        z2 = true;
                    }
                    sharedPreferencesC1272.f4619 = z2;
                    return true;
                }
                byte[] bArr = (byte[]) c0231.f1427;
                int i3 = i + 1;
                c0231.f1425 = i3;
                byte b = bArr[i];
                byte b2 = (byte) (b & JSONB.Constants.BC_INT32_BYTE_MAX);
                if (b2 < 1 || b2 > 11) {
                    throw new Exception("parse dara failed");
                }
                int i4 = i + 2;
                c0231.f1425 = i4;
                int i5 = bArr[i3] & 255;
                if (i5 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b < 0) {
                    c0231.f1425 = i4 + i5;
                    if (b2 <= 5) {
                        iM1409 = SharedPreferencesC1271.f4605[b2];
                    } else {
                        if (b2 != 9 && b2 != 10 && b2 != 11) {
                            z3 = false;
                        }
                        iM1409 = z3 ? c0231.m1409() : c0231.m1412() & 65535;
                    }
                    int i6 = c0231.f1425 + iM1409;
                    c0231.f1425 = i6;
                    sharedPreferencesC1272.f4621 = (i6 - i) + sharedPreferencesC1272.f4621;
                    ArrayList arrayList = sharedPreferencesC1272.f4622;
                    C2708 c2708 = new C2708();
                    c2708.f8711 = i;
                    c2708.f8712 = i6;
                    arrayList.add(c2708);
                } else {
                    String strM1414 = c0231.m1414(c0379, i5);
                    int i7 = c0231.f1425;
                    if (b2 <= 5) {
                        m3670(sharedPreferencesC1272, c0231, c0379, b2, strM1414, i7);
                        sharedPreferencesC1272 = sharedPreferencesC1271;
                    } else {
                        m3671(sharedPreferencesC1272, c0231, c0379, b2, strM1414, i7, i, b);
                    }
                }
            } catch (Exception e) {
                Log.e("FastKV", str, e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final void m3673(Object obj, InterfaceC1433 interfaceC1433) {
        ((Handler) AbstractC1483.f5277.getValue()).post(new RunnableC1521(interfaceC1433, obj, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static String m3674(String str, boolean z) {
        if (!z) {
            return AbstractC1095.m2800("\"", str, "\"");
        }
        StringBuilder sb = new StringBuilder("\"");
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                sb2.append("\\f");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        sb2.append(cCharAt);
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        sb.append(sb2.toString());
        sb.append("\"");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static C2000 m3675(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C2000 c2000 = new C2000();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c2000.f6315 = byteBufferDuplicate;
                    c2000.f6312 = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c2000.f6313 = i6;
                    c2000.f6314 = ((ByteBuffer) c2000.f6315).getShort(i6);
                    return c2000;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static String m3676(String str, boolean z) {
        int i;
        char c = '$';
        if (str.indexOf(36) < 0) {
            return m3674(str, z);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < length) {
            if (str.charAt(i2) == c) {
                char c2 = '\\';
                if (!z) {
                    int i4 = 0;
                    for (int i5 = i2 - 1; i5 >= 0 && str.charAt(i5) == '\\'; i5--) {
                        i4++;
                    }
                    if ((i4 & 1) == 1) {
                    }
                }
                int i6 = i2 + 1;
                if (i6 < length) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt == '{') {
                        int i7 = i2 + 2;
                        int length2 = str.length();
                        int i8 = 1;
                        int i9 = i7;
                        while (true) {
                            if (i9 < length2) {
                                char cCharAt2 = str.charAt(i9);
                                if (cCharAt2 == '\"') {
                                    while (true) {
                                        i9++;
                                        if (i9 >= str.length()) {
                                            i9 = -1;
                                            break;
                                        }
                                        char cCharAt3 = str.charAt(i9);
                                        if (cCharAt3 != c2) {
                                            if (cCharAt3 == '\"') {
                                                break;
                                            }
                                        } else {
                                            i9++;
                                        }
                                    }
                                    if (i9 >= 0) {
                                        i9++;
                                    }
                                } else if (cCharAt2 == '\'') {
                                    int iM3665 = m3665(i9 + 1, str);
                                    if (iM3665 >= 0) {
                                        i9 = iM3665 + 1;
                                    }
                                } else {
                                    if (cCharAt2 == '/' && (i = i9 + 1) < length2) {
                                        char cCharAt4 = str.charAt(i);
                                        if (cCharAt4 == '/') {
                                            i9 += 2;
                                            while (i9 < length2) {
                                                char cCharAt5 = str.charAt(i9);
                                                if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                                                    break;
                                                }
                                                i9++;
                                            }
                                        } else {
                                            char c3 = '*';
                                            if (cCharAt4 == '*') {
                                                int i10 = i9 + 2;
                                                while (true) {
                                                    int i11 = i10 + 1;
                                                    if (i11 >= str.length()) {
                                                        i10 = -1;
                                                        break;
                                                    }
                                                    if (str.charAt(i10) == c3 && str.charAt(i11) == '/') {
                                                        break;
                                                    }
                                                    i10 = i11;
                                                    c3 = '*';
                                                }
                                                if (i10 >= 0) {
                                                    i9 = i10 + 2;
                                                }
                                            }
                                        }
                                        c2 = '\\';
                                    }
                                    if (cCharAt2 == '{') {
                                        i8++;
                                    } else if (cCharAt2 == '}' && (i8 = i8 - 1) == 0) {
                                        break;
                                    }
                                    i9++;
                                    c2 = '\\';
                                }
                            }
                            i9 = -1;
                            break;
                        }
                        if (i9 < 0) {
                            i2 = i6;
                        } else {
                            String strSubstring = str.substring(i3, i2);
                            if (!strSubstring.isEmpty()) {
                                arrayList.add(m3674(strSubstring, z));
                            }
                            arrayList.add("String.valueOf(" + str.substring(i7, i9).trim() + ")");
                            i3 = i9 + 1;
                            i2 = i3;
                            z2 = true;
                        }
                        c = '$';
                    } else if (cCharAt != c && Character.isJavaIdentifierStart(cCharAt)) {
                        int i12 = i2 + 2;
                        while (i12 < length) {
                            char cCharAt6 = str.charAt(i12);
                            if (cCharAt6 == c || !Character.isJavaIdentifierPart(cCharAt6)) {
                                break;
                            }
                            i12++;
                        }
                        String strSubstring2 = str.substring(i3, i2);
                        if (!strSubstring2.isEmpty()) {
                            arrayList.add(m3674(strSubstring2, z));
                        }
                        arrayList.add("String.valueOf(" + str.substring(i6, i12) + ")");
                        i2 = i12;
                        i3 = i2;
                        z2 = true;
                    }
                }
                i2 = i6;
            }
            i2++;
        }
        if (!z2) {
            return m3674(str, z);
        }
        String strSubstring3 = str.substring(i3);
        if (!strSubstring3.isEmpty()) {
            arrayList.add(m3674(strSubstring3, z));
        }
        if (arrayList.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder("(");
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (i13 > 0) {
                sb2.append(" + ");
            }
            sb2.append((String) arrayList.get(i13));
        }
        sb.append(sb2.toString());
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m3677(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final Object m3678(C2697 c2697, C2697 c2698, InterfaceC1437 interfaceC1437) throws Throwable {
        Object c0757;
        Object objM3634;
        Object objM3628;
        C1174 c1174 = AbstractC1272.f4640;
        try {
            AbstractC2902.m4886(2, interfaceC1437);
            c0757 = interfaceC1437.mo1342(c2698, c2697);
        } catch (C1076 e) {
            Throwable th = e.f3896;
            C0757 c0758 = new C0757(th, false);
            do {
                objM3634 = c2697.m3634(C1723.f5839.get(c2697), c0758);
                if (objM3634 == AbstractC1272.f4639 || objM3634 == c1174) {
                }
                throw th;
            } while (objM3634 == AbstractC1272.f4641);
            c2697.mo2761(objM3634);
            throw th;
        } catch (Throwable th2) {
            c0757 = new C0757(th2, false);
        }
        EnumC0883 enumC0883 = EnumC0883.f3332;
        if (c0757 == enumC0883 || (objM3628 = c2697.m3628(c0757)) == c1174) {
            return enumC0883;
        }
        c2697.mo4668();
        if (objM3628 instanceof C0757) {
            throw ((C0757) objM3628).f2861;
        }
        return AbstractC1272.m3102(objM3628);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m3679() {
        switch (this.f5944) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f5945;
                return Math.max(0, sideSheetBehavior.f836 + sideSheetBehavior.f837);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f5945;
                return Math.max(0, (sideSheetBehavior2.f835 - sideSheetBehavior2.f834) - sideSheetBehavior2.f837);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m3680() {
        switch (this.f5944) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f5945;
                return (-sideSheetBehavior.f834) - sideSheetBehavior.f837;
            default:
                return this.f5945.f835;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int m3681(View view) {
        switch (this.f5944) {
            case 0:
                return view.getRight() + this.f5945.f837;
            default:
                return view.getLeft() - this.f5945.f837;
        }
    }
}
