package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤞᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2900 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2900 f9272 = new C2900();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet m4859(int i, int i2, byte[] bArr) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C0231 c0231 = new C0231(i, bArr);
            int i4 = i + i2;
            while (true) {
                i3 = c0231.f1425;
                if (i3 >= i4) {
                    break;
                }
                byte[] bArr2 = (byte[]) c0231.f1427;
                int i5 = i3 + 1;
                c0231.f1425 = i5;
                int i6 = bArr2[i3];
                if ((i6 >> 7) != 0) {
                    int i7 = i3 + 2;
                    c0231.f1425 = i7;
                    i6 = (i6 & 127) | (bArr2[i5] << 7);
                    if ((i6 >> 14) != 0) {
                        int i8 = i6 & 16383;
                        int i9 = i3 + 3;
                        c0231.f1425 = i9;
                        int i10 = i8 | (bArr2[i7] << 14);
                        if ((i10 >> 21) == 0) {
                            i6 = i10;
                        } else {
                            int i11 = i3 + 4;
                            c0231.f1425 = i11;
                            i6 = (bArr2[i9] << 21) | (i10 & 2097151);
                            if ((i6 >> 28) != 0) {
                                c0231.f1425 = i3 + 5;
                                i6 = (268435455 & i6) | (bArr2[i11] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c0231.m1413(i6));
            }
            if (i3 != i4) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final byte[] m4860(Object obj) {
        int i;
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i2 = 0;
        int i3 = 0;
        for (String str : set) {
            if (str == null) {
                i2 += 5;
                iArr[i3] = -1;
            } else {
                int iM1403 = C0231.m1403(str);
                strArr[i3] = str;
                iArr[i3] = iM1403;
                if ((iM1403 >> 7) == 0) {
                    i = 1;
                } else if ((iM1403 >> 14) == 0) {
                    i = 2;
                } else if ((iM1403 >> 21) == 0) {
                    i = 3;
                } else {
                    i = (iM1403 >> 28) == 0 ? 4 : 5;
                }
                i2 = i + iM1403 + i2;
            }
            i3++;
        }
        C0231 c0231 = new C0231(i2);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            int i6 = c0231.f1425;
            int i7 = i5;
            while ((i7 & (-128)) != 0) {
                ((byte[]) c0231.f1427)[i6] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
                i6++;
            }
            ((byte[]) c0231.f1427)[i6] = (byte) i7;
            c0231.f1425 = i6 + 1;
            if (i5 >= 0) {
                c0231.m1422(strArr[i4]);
            }
        }
        return (byte[]) c0231.f1427;
    }
}
