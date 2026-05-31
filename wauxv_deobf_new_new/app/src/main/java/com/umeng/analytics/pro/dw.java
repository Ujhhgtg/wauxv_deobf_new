package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p000.AbstractC1095;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dw extends ed {
    protected static final int a = -65536;
    protected static final int b = -2147418112;
    private static final ei h = new ei();
    protected boolean c;
    protected boolean d;
    protected int e;
    protected boolean f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;

    /* JADX INFO: compiled from: obf */
    public static class a implements ef {
        protected boolean a;
        protected boolean b;
        protected int c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.ef
        public ed a(er erVar) {
            dw dwVar = new dw(erVar, this.a, this.b);
            int i = this.c;
            if (i != 0) {
                dwVar.c(i);
            }
            return dwVar;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.a = z;
            this.b = z2;
            this.c = i;
        }
    }

    public dw(er erVar) {
        this(erVar, false, true);
    }

    @Override // com.umeng.analytics.pro.ed
    public ByteBuffer A() throws ee, es {
        int iW = w();
        d(iW);
        if (this.g.h() >= iW) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.g.f(), this.g.g(), iW);
            this.g.a(iW);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iW];
        this.g.d(bArr, 0, iW);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void b() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void c() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void d() {
        a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.ed
    public eb h() throws ee {
        int iW = w();
        if (iW < 0) {
            if ((a & iW) == b) {
                return new eb(z(), (byte) (iW & 255), w());
            }
            throw new ee(4, "Bad version in readMessageBegin");
        }
        if (this.c) {
            throw new ee(4, "Missing version in readMessageBegin, old client?");
        }
        return new eb(b(iW), u(), w());
    }

    @Override // com.umeng.analytics.pro.ed
    public ei j() {
        return h;
    }

    @Override // com.umeng.analytics.pro.ed
    public dy l() throws ee {
        byte bU = u();
        return new dy("", bU, bU == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.analytics.pro.ed
    public ea n() {
        return new ea(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.ed
    public dz p() {
        return new dz(u(), w());
    }

    @Override // com.umeng.analytics.pro.ed
    public eh r() {
        return new eh(u(), w());
    }

    @Override // com.umeng.analytics.pro.ed
    public boolean t() {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.ed
    public byte u() throws ee {
        if (this.g.h() < 1) {
            a(this.m, 0, 1);
            return this.m[0];
        }
        byte b2 = this.g.f()[this.g.g()];
        this.g.a(1);
        return b2;
    }

    @Override // com.umeng.analytics.pro.ed
    public short v() throws ee {
        int iG;
        byte[] bArrF = this.n;
        if (this.g.h() >= 2) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(2);
        } else {
            a(this.n, 0, 2);
            iG = 0;
        }
        return (short) ((bArrF[iG + 1] & 255) | ((bArrF[iG] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.ed
    public int w() throws ee {
        int iG;
        byte[] bArrF = this.o;
        if (this.g.h() >= 4) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(4);
        } else {
            a(this.o, 0, 4);
            iG = 0;
        }
        return (bArrF[iG + 3] & 255) | ((bArrF[iG] & 255) << 24) | ((bArrF[iG + 1] & 255) << 16) | ((bArrF[iG + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.ed
    public long x() throws ee {
        int iG;
        byte[] bArrF = this.p;
        if (this.g.h() >= 8) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(8);
        } else {
            a(this.p, 0, 8);
            iG = 0;
        }
        return ((long) (bArrF[iG + 7] & 255)) | (((long) (bArrF[iG] & 255)) << 56) | (((long) (bArrF[iG + 1] & 255)) << 48) | (((long) (bArrF[iG + 2] & 255)) << 40) | (((long) (bArrF[iG + 3] & 255)) << 32) | (((long) (bArrF[iG + 4] & 255)) << 24) | (((long) (bArrF[iG + 5] & 255)) << 16) | (((long) (bArrF[iG + 6] & 255)) << 8);
    }

    @Override // com.umeng.analytics.pro.ed
    public double y() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.ed
    public String z() throws dk {
        int iW = w();
        if (this.g.h() < iW) {
            return b(iW);
        }
        try {
            String str = new String(this.g.f(), this.g.g(), iW, "UTF-8");
            this.g.a(iW);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new dk("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public dw(er erVar, boolean z, boolean z2) {
        super(erVar);
        this.f = false;
        this.i = new byte[1];
        this.j = new byte[2];
        this.k = new byte[4];
        this.l = new byte[8];
        this.m = new byte[1];
        this.n = new byte[2];
        this.o = new byte[4];
        this.p = new byte[8];
        this.c = z;
        this.d = z2;
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(ei eiVar) {
    }

    public String b(int i) throws dk {
        try {
            d(i);
            byte[] bArr = new byte[i];
            this.g.d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new dk("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void c(int i) {
        this.e = i;
        this.f = true;
    }

    public void d(int i) throws ee {
        if (i < 0) {
            throw new ee(AbstractC1095.m2794(i, "Negative length: "));
        }
        if (this.f) {
            int i2 = this.e - i;
            this.e = i2;
            if (i2 < 0) {
                throw new ee(AbstractC1095.m2794(i, "Message length exceeded: "));
            }
        }
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(eb ebVar) throws dk {
        if (this.d) {
            a(b | ebVar.b);
            a(ebVar.a);
            a(ebVar.c);
        } else {
            a(ebVar.a);
            a(ebVar.b);
            a(ebVar.c);
        }
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(dy dyVar) {
        a(dyVar.b);
        a(dyVar.c);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(ea eaVar) {
        a(eaVar.a);
        a(eaVar.b);
        a(eaVar.c);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(dz dzVar) {
        a(dzVar.a);
        a(dzVar.b);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(eh ehVar) {
        a(ehVar.a);
        a(ehVar.b);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(byte b2) {
        byte[] bArr = this.i;
        bArr[0] = b2;
        this.g.b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(short s) {
        byte[] bArr = this.j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.g.b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(int i) {
        byte[] bArr = this.k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.g.b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.ed
    public void e() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void f() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void g() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void i() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void k() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void m() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void o() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void q() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void s() {
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(long j) {
        byte[] bArr = this.l;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.g.b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(double d) {
        a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(String str) throws dk {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new dk("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.ed
    public void a(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        a(iLimit);
        this.g.b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    private int a(byte[] bArr, int i, int i2) throws ee {
        d(i2);
        return this.g.d(bArr, i, i2);
    }
}
