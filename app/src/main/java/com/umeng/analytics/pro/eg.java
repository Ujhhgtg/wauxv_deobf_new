package com.umeng.analytics.pro;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.dx;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class eg {
    private static int a = 2147483647;

    public static void a(int i) {
        a = i;
    }

    public static void a(ed edVar, byte b) {
        a(edVar, b, a);
    }

    public static void a(ed edVar, byte b, int i) throws dk {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    edVar.t();
                    return;
                case 3:
                    edVar.u();
                    return;
                case 4:
                    edVar.y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    edVar.v();
                    return;
                case 8:
                    edVar.w();
                    return;
                case 10:
                    edVar.x();
                    return;
                case 11:
                    edVar.A();
                    return;
                case 12 /* 12 */:
                    edVar.j();
                    while (true) {
                        byte b2 = edVar.l().b;
                        if (b2 == 0) {
                            edVar.k();
                            return;
                        } else {
                            a(edVar, b2, i - 1);
                            edVar.m();
                        }
                    }
                    break;
                case 13:
                    ea eaVarN = edVar.n();
                    while (i2 < eaVarN.c) {
                        int i3 = i - 1;
                        a(edVar, eaVarN.a, i3);
                        a(edVar, eaVarN.b, i3);
                        i2++;
                    }
                    edVar.o();
                    return;
                case 14 /* 14 */:
                    eh ehVarR = edVar.r();
                    while (i2 < ehVarR.b) {
                        a(edVar, ehVarR.a, i - 1);
                        i2++;
                    }
                    edVar.s();
                    return;
                case 15:
                    dz dzVarP = edVar.p();
                    while (i2 < dzVarP.b) {
                        a(edVar, dzVarP.a, i - 1);
                        i2++;
                    }
                    edVar.q();
                    return;
            }
        } else {
            throw new dk("Maximum skip depth exceeded");
        }
    }

    public static ef a(byte[] bArr, ef efVar) {
        if (bArr[0] > 16) {
            return new dx.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? efVar : new dx.a();
    }
}
