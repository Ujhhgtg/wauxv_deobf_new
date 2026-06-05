package com.umeng.analytics.pro;

import java.util.BitSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ej extends dx {

    /* JADX INFO: compiled from: obf */
    public static class a implements ef {
        @Override // com.umeng.analytics.pro.ef
        public ed a(er erVar) {
            return new ej(erVar);
        }
    }

    public ej(er erVar) {
        super(erVar);
    }

    @Override // com.umeng.analytics.pro.ed
    public Class<? extends el> D() {
        return eo.class;
    }

    public void a(BitSet bitSet, int i) {
        for (byte b : b(bitSet, i)) {
            a(b);
        }
    }

    public BitSet b(int i) {
        int iCeil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i2 = 0; i2 < iCeil; i2++) {
            bArr[i2] = u();
        }
        return a(bArr);
    }

    public static BitSet a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < bArr.length * 8; i++) {
            if ((bArr[(bArr.length - (i / 8)) - 1] & (1 << (i % 8))) > 0) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    public static byte[] b(BitSet bitSet, int i) {
        int iCeil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i2 = 0; i2 < bitSet.length(); i2++) {
            if (bitSet.get(i2)) {
                int i3 = (iCeil - (i2 / 8)) - 1;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        return bArr;
    }
}
