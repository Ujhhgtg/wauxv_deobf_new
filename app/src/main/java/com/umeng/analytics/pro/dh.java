package com.umeng.analytics.pro;

import com.umeng.analytics.pro.dx;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dh {
    private final ed a;
    private final eq b;

    public dh() {
        this(new dx.a());
    }

    private dy j(byte[] bArr, dl dlVar, dl... dlVarArr) {
        this.b.a(bArr);
        int length = dlVarArr.length + 1;
        dl[] dlVarArr2 = new dl[length];
        int i = 0;
        dlVarArr2[0] = dlVar;
        int i2 = 0;
        while (i2 < dlVarArr.length) {
            int i3 = i2 + 1;
            dlVarArr2[i3] = dlVarArr[i2];
            i2 = i3;
        }
        this.a.j();
        dy dyVarL = null;
        while (i < length) {
            dyVarL = this.a.l();
            if (dyVarL.b == 0 || dyVarL.c > dlVarArr2[i].a()) {
                return null;
            }
            if (dyVarL.c != dlVarArr2[i].a()) {
                eg.a(this.a, dyVarL.b);
                this.a.m();
            } else {
                i++;
                if (i < length) {
                    this.a.j();
                }
            }
        }
        return dyVarL;
    }

    public void a(de deVar, byte[] bArr) {
        try {
            this.b.a(bArr);
            deVar.read(this.a);
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    public Byte b(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (Byte) a((byte) 3, bArr, dlVar, dlVarArr);
    }

    public Double c(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (Double) a((byte) 4, bArr, dlVar, dlVarArr);
    }

    public Short d(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (Short) a((byte) 6, bArr, dlVar, dlVarArr);
    }

    public Integer e(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (Integer) a((byte) 8, bArr, dlVar, dlVarArr);
    }

    public Long f(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (Long) a((byte) 10, bArr, dlVar, dlVarArr);
    }

    public String g(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (String) a((byte) 11, bArr, dlVar, dlVarArr);
    }

    public ByteBuffer h(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (ByteBuffer) a((byte) 100, bArr, dlVar, dlVarArr);
    }

    public Short i(byte[] bArr, dl dlVar, dl... dlVarArr) {
        try {
            try {
                if (j(bArr, dlVar, dlVarArr) == null) {
                    this.b.e();
                    this.a.B();
                    return null;
                }
                this.a.j();
                Short shValueOf = Short.valueOf(this.a.l().c);
                this.b.e();
                this.a.B();
                return shValueOf;
            } catch (Exception e) {
                throw new dk(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.a.B();
            throw th;
        }
    }

    public dh(ef efVar) {
        eq eqVar = new eq();
        this.b = eqVar;
        this.a = efVar.a(eqVar);
    }

    public void a(de deVar, String str, String str2) {
        try {
            try {
                a(deVar, str.getBytes(str2));
                this.a.B();
            } catch (UnsupportedEncodingException unused) {
                throw new dk("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } catch (Throwable th) {
            this.a.B();
            throw th;
        }
    }

    public void a(de deVar, byte[] bArr, dl dlVar, dl... dlVarArr) {
        try {
            try {
                if (j(bArr, dlVar, dlVarArr) != null) {
                    deVar.read(this.a);
                }
                this.b.e();
                this.a.B();
            } catch (Exception e) {
                throw new dk(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.a.B();
            throw th;
        }
    }

    public Boolean a(byte[] bArr, dl dlVar, dl... dlVarArr) {
        return (Boolean) a((byte) 2, bArr, dlVar, dlVarArr);
    }

    private Object a(byte b, byte[] bArr, dl dlVar, dl... dlVarArr) {
        try {
            try {
                dy dyVarJ = j(bArr, dlVar, dlVarArr);
                if (dyVarJ != null) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 6) {
                                    if (b != 8) {
                                        if (b != 100) {
                                            if (b != 10) {
                                                if (b == 11 && dyVarJ.b == 11) {
                                                    String strZ = this.a.z();
                                                    this.b.e();
                                                    this.a.B();
                                                    return strZ;
                                                }
                                            } else if (dyVarJ.b == 10) {
                                                Long lValueOf = Long.valueOf(this.a.x());
                                                this.b.e();
                                                this.a.B();
                                                return lValueOf;
                                            }
                                        } else if (dyVarJ.b == 11) {
                                            ByteBuffer byteBufferA = this.a.A();
                                            this.b.e();
                                            this.a.B();
                                            return byteBufferA;
                                        }
                                    } else if (dyVarJ.b == 8) {
                                        Integer numValueOf = Integer.valueOf(this.a.w());
                                        this.b.e();
                                        this.a.B();
                                        return numValueOf;
                                    }
                                } else if (dyVarJ.b == 6) {
                                    Short shValueOf = Short.valueOf(this.a.v());
                                    this.b.e();
                                    this.a.B();
                                    return shValueOf;
                                }
                            } else if (dyVarJ.b == 4) {
                                Double dValueOf = Double.valueOf(this.a.y());
                                this.b.e();
                                this.a.B();
                                return dValueOf;
                            }
                        } else if (dyVarJ.b == 3) {
                            Byte bValueOf = Byte.valueOf(this.a.u());
                            this.b.e();
                            this.a.B();
                            return bValueOf;
                        }
                    } else if (dyVarJ.b == 2) {
                        Boolean boolValueOf = Boolean.valueOf(this.a.t());
                        this.b.e();
                        this.a.B();
                        return boolValueOf;
                    }
                }
                this.b.e();
                this.a.B();
                return null;
            } catch (Exception e) {
                throw new dk(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.a.B();
            throw th;
        }
    }

    public void a(de deVar, String str) {
        a(deVar, str.getBytes());
    }
}
