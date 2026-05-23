package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᤞᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2840 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2840 f9110 = new C2840();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet m4826(int i, int i2, byte[] bArr) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C0221 c0221 = new C0221(i, bArr);
            int i4 = i + i2;
            while (true) {
                i3 = c0221.f1351;
                if (i3 >= i4) {
                    break;
                }
                byte[] bArr2 = (byte[]) c0221.f1353;
                int i5 = i3 + 1;
                c0221.f1351 = i5;
                int i6 = bArr2[i3];
                if ((i6 >> 7) != 0) {
                    int i7 = i3 + 2;
                    c0221.f1351 = i7;
                    i6 = (i6 & 127) | (bArr2[i5] << 7);
                    if ((i6 >> 14) != 0) {
                        int i8 = i6 & 16383;
                        int i9 = i3 + 3;
                        c0221.f1351 = i9;
                        int i10 = i8 | (bArr2[i7] << 14);
                        if ((i10 >> 21) == 0) {
                            i6 = i10;
                        } else {
                            int i11 = i3 + 4;
                            c0221.f1351 = i11;
                            i6 = (bArr2[i9] << 21) | (i10 & 2097151);
                            if ((i6 >> 28) != 0) {
                                c0221.f1351 = i3 + 5;
                                i6 = (268435455 & i6) | (bArr2[i11] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c0221.m1267(i6));
            }
            if (i3 != i4) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final byte[] m4827(Object obj) {
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
                int iM1257 = C0221.m1257(str);
                strArr[i3] = str;
                iArr[i3] = iM1257;
                if ((iM1257 >> 7) == 0) {
                    i = 1;
                } else if ((iM1257 >> 14) == 0) {
                    i = 2;
                } else if ((iM1257 >> 21) == 0) {
                    i = 3;
                } else {
                    i = (iM1257 >> 28) == 0 ? 4 : 5;
                }
                i2 = i + iM1257 + i2;
            }
            i3++;
        }
        C0221 c0221 = new C0221(i2);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            int i6 = c0221.f1351;
            int i7 = i5;
            while ((i7 & (-128)) != 0) {
                ((byte[]) c0221.f1353)[i6] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
                i6++;
            }
            ((byte[]) c0221.f1353)[i6] = (byte) i7;
            c0221.f1351 = i6 + 1;
            if (i5 >= 0) {
                c0221.m1276(strArr[i4]);
            }
        }
        return (byte[]) c0221.f1353;
    }
}
