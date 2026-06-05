package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.EdgeEffect;
import com.alibaba.fastjson2.JSONB;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛴ要点脸ᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0615Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final byte[] f2646Ujhhgtgfeyxiexzf = {1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 2, 3, 5, 2, 2, 3, 2, 1, 1, 2, 2, 1, 2, 2, 3, 3, 3, 1, 1, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 3, 3, 2, 2};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0420Ujhhgtgfeyxiexzf f2647Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(7);

    /* JADX WARN: Code duplicated, block: B:183:0x0286  */
    /* JADX WARN: Code duplicated, block: B:200:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:204:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:227:0x036a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0386  */
    /* JADX WARN: Code duplicated, block: B:231:0x038b  */
    /* JADX WARN: Code duplicated, block: B:235:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:246:0x041f  */
    /* JADX WARN: Code duplicated, block: B:399:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:400:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:403:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:404:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:406:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:408:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:411:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:413:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:423:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m1876Ujhhgtgfeyxiexzf(C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf, C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, ArrayList arrayList, int i) {
        int i2;
        C2698Ujhhgtgfeyxiexzf[] c2698UjhhgtgfeyxiexzfArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf;
        C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf2;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg2;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2;
        int i6;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg3;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg4;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3;
        int i7;
        C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr;
        int i8;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf3;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf4;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg5;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf5;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg6;
        int size;
        ArrayList arrayList2;
        int i9;
        float f;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg7;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg8;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg9;
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg10;
        C2394Ujhhgtgfeyxiexzf c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf;
        float f2;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf6;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4;
        int i10;
        int i11;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf5;
        C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf2 = c3656Ujhhgtgfeyxiexzf;
        if (i == 0) {
            i2 = c3656Ujhhgtgfeyxiexzf2.f11640Ujhhgtgfeyxiexzf;
            c2698UjhhgtgfeyxiexzfArr = c3656Ujhhgtgfeyxiexzf2.f11643Ujhhgtgfeyxiexzf;
            i3 = 0;
        } else {
            i2 = c3656Ujhhgtgfeyxiexzf2.f11641feyxiexzfUjhhgtg;
            c2698UjhhgtgfeyxiexzfArr = c3656Ujhhgtgfeyxiexzf2.f11642Ujhhgtgfeyxiexzf;
            i3 = 2;
        }
        int i12 = i2;
        C2698Ujhhgtgfeyxiexzf[] c2698UjhhgtgfeyxiexzfArr2 = c2698UjhhgtgfeyxiexzfArr;
        int i13 = 0;
        while (i13 < i12) {
            C2698Ujhhgtgfeyxiexzf c2698Ujhhgtgfeyxiexzf = c2698UjhhgtgfeyxiexzfArr2[i13];
            boolean z4 = c2698Ujhhgtgfeyxiexzf.f8614Ujhhgtgfeyxiexzf;
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf6 = c2698Ujhhgtgfeyxiexzf.f8598Ujhhgtgfeyxiexzf;
            C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr2 = c3655Ujhhgtgfeyxiexzf6.f11606feyxiexzfUjhhgtg;
            int i14 = 3;
            int i15 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i13;
            } else {
                int i16 = c2698Ujhhgtgfeyxiexzf.f8609Ujhhgtgfeyxiexzf;
                int i17 = i16 * 2;
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf7 = c3655Ujhhgtgfeyxiexzf6;
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf8 = c3655Ujhhgtgfeyxiexzf7;
                boolean z5 = false;
                while (!z5) {
                    c2698Ujhhgtgfeyxiexzf.f8606Ujhhgtgfeyxiexzf++;
                    C3655Ujhhgtgfeyxiexzf[] c3655UjhhgtgfeyxiexzfArr = c3655Ujhhgtgfeyxiexzf7.f11628feyxiexzfUjhhgtg;
                    C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr3 = c3655Ujhhgtgfeyxiexzf7.f11606feyxiexzfUjhhgtg;
                    c3655UjhhgtgfeyxiexzfArr[i16] = null;
                    c3655Ujhhgtgfeyxiexzf7.f11627feyxiexzfUjhhgtg[i16] = null;
                    if (c3655Ujhhgtgfeyxiexzf7.f11622Ujhhgtgfeyxiexzf != i15) {
                        c3655Ujhhgtgfeyxiexzf7.m5325Ujhhgtgfeyxiexzf(i16);
                        c3641UjhhgtgfeyxiexzfArr3[i17].m5289Ujhhgtgfeyxiexzf();
                        int i18 = i17 + 1;
                        c3641UjhhgtgfeyxiexzfArr3[i18].m5289Ujhhgtgfeyxiexzf();
                        c3641UjhhgtgfeyxiexzfArr3[i17].m5289Ujhhgtgfeyxiexzf();
                        c3641UjhhgtgfeyxiexzfArr3[i18].m5289Ujhhgtgfeyxiexzf();
                        if (c2698Ujhhgtgfeyxiexzf.f8599Ujhhgtgfeyxiexzf == null) {
                            c2698Ujhhgtgfeyxiexzf.f8599Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf7;
                        }
                        c2698Ujhhgtgfeyxiexzf.f8601Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf7;
                        int i19 = c3655Ujhhgtgfeyxiexzf7.f11631Ujhhgtgfeyxiexzf[i16];
                        if (i19 == i14) {
                            int i20 = c3655Ujhhgtgfeyxiexzf7.f11583Ujhhgtgfeyxiexzf[i16];
                            if (i20 == 0 || i20 == i14 || i20 == 2) {
                                c2698Ujhhgtgfeyxiexzf.f8607Ujhhgtgfeyxiexzf++;
                                float f4 = c3655Ujhhgtgfeyxiexzf7.f11626feyxiexzfUjhhgtg[i16];
                                if (f4 > 0.0f) {
                                    c2698Ujhhgtgfeyxiexzf.f8608Ujhhgtgfeyxiexzf += f4;
                                }
                                i11 = i16;
                                if (c3655Ujhhgtgfeyxiexzf7.f11622Ujhhgtgfeyxiexzf != 8 && i19 == 3 && (i20 == 0 || i20 == 3)) {
                                    if (f4 < 0.0f) {
                                        c2698Ujhhgtgfeyxiexzf.f8611Ujhhgtgfeyxiexzf = true;
                                    } else {
                                        c2698Ujhhgtgfeyxiexzf.f8612Ujhhgtgfeyxiexzf = true;
                                    }
                                    if (c2698Ujhhgtgfeyxiexzf.f8605Ujhhgtgfeyxiexzf == null) {
                                        c2698Ujhhgtgfeyxiexzf.f8605Ujhhgtgfeyxiexzf = new ArrayList();
                                    }
                                    c2698Ujhhgtgfeyxiexzf.f8605Ujhhgtgfeyxiexzf.add(c3655Ujhhgtgfeyxiexzf7);
                                }
                                if (c2698Ujhhgtgfeyxiexzf.f8603Ujhhgtgfeyxiexzf == null) {
                                    c2698Ujhhgtgfeyxiexzf.f8603Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf7;
                                }
                                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf9 = c2698Ujhhgtgfeyxiexzf.f8604Ujhhgtgfeyxiexzf;
                                if (c3655Ujhhgtgfeyxiexzf9 != null) {
                                    c3655Ujhhgtgfeyxiexzf9.f11627feyxiexzfUjhhgtg[i11] = c3655Ujhhgtgfeyxiexzf7;
                                }
                                c2698Ujhhgtgfeyxiexzf.f8604Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf7;
                            } else {
                                i13 = i13;
                                i11 = i16;
                            }
                            if (i11 == 0) {
                                if (c3655Ujhhgtgfeyxiexzf7.f11581Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf7.f11584Ujhhgtgfeyxiexzf == 0) {
                                    int i21 = c3655Ujhhgtgfeyxiexzf7.f11585Ujhhgtgfeyxiexzf;
                                }
                            } else if (c3655Ujhhgtgfeyxiexzf7.f11582Ujhhgtgfeyxiexzf == 0 && c3655Ujhhgtgfeyxiexzf7.f11587Ujhhgtgfeyxiexzf == 0) {
                                int i22 = c3655Ujhhgtgfeyxiexzf7.f11588Ujhhgtgfeyxiexzf;
                            }
                        } else {
                            i13 = i13;
                            i11 = i16;
                        }
                    } else {
                        i13 = i13;
                        i11 = i16;
                    }
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf10 = c3655Ujhhgtgfeyxiexzf8;
                    if (c3655Ujhhgtgfeyxiexzf10 != c3655Ujhhgtgfeyxiexzf7) {
                        c3655Ujhhgtgfeyxiexzf10.f11628feyxiexzfUjhhgtg[i11] = c3655Ujhhgtgfeyxiexzf7;
                    }
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf7 = c3641UjhhgtgfeyxiexzfArr3[i17 + 1].f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf7 != null) {
                        c3655Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf7.f11376Ujhhgtgfeyxiexzf;
                        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf8 = c3655Ujhhgtgfeyxiexzf5.f11606feyxiexzfUjhhgtg[i17].f11378Ujhhgtgfeyxiexzf;
                        if (c3641Ujhhgtgfeyxiexzf8 == null || c3641Ujhhgtgfeyxiexzf8.f11376Ujhhgtgfeyxiexzf != c3655Ujhhgtgfeyxiexzf7) {
                            c3655Ujhhgtgfeyxiexzf5 = null;
                        }
                    } else {
                        c3655Ujhhgtgfeyxiexzf5 = null;
                    }
                    if (c3655Ujhhgtgfeyxiexzf5 == null) {
                        c3655Ujhhgtgfeyxiexzf5 = c3655Ujhhgtgfeyxiexzf7;
                        z5 = true;
                    }
                    c3655Ujhhgtgfeyxiexzf8 = c3655Ujhhgtgfeyxiexzf7;
                    i16 = i11;
                    i14 = 3;
                    i15 = 8;
                    c3655Ujhhgtgfeyxiexzf7 = c3655Ujhhgtgfeyxiexzf5;
                    i13 = i13;
                }
                i4 = i13;
                int i23 = i16;
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf11 = c2698Ujhhgtgfeyxiexzf.f8599Ujhhgtgfeyxiexzf;
                if (c3655Ujhhgtgfeyxiexzf11 != null) {
                    c3655Ujhhgtgfeyxiexzf11.f11606feyxiexzfUjhhgtg[i17].m5289Ujhhgtgfeyxiexzf();
                }
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf12 = c2698Ujhhgtgfeyxiexzf.f8601Ujhhgtgfeyxiexzf;
                if (c3655Ujhhgtgfeyxiexzf12 != null) {
                    c3655Ujhhgtgfeyxiexzf12.f11606feyxiexzfUjhhgtg[i17 + 1].m5289Ujhhgtgfeyxiexzf();
                }
                c2698Ujhhgtgfeyxiexzf.f8600Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf7;
                if (i23 == 0 && c2698Ujhhgtgfeyxiexzf.f8610Ujhhgtgfeyxiexzf) {
                    c2698Ujhhgtgfeyxiexzf.f8602Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf7;
                } else {
                    c2698Ujhhgtgfeyxiexzf.f8602Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf6;
                }
                c2698Ujhhgtgfeyxiexzf.f8613Ujhhgtgfeyxiexzf = c2698Ujhhgtgfeyxiexzf.f8612Ujhhgtgfeyxiexzf && c2698Ujhhgtgfeyxiexzf.f8611Ujhhgtgfeyxiexzf;
            }
            c2698Ujhhgtgfeyxiexzf.f8614Ujhhgtgfeyxiexzf = true;
            if (arrayList == 0 || arrayList.contains(c3655Ujhhgtgfeyxiexzf6)) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf13 = c2698Ujhhgtgfeyxiexzf.f8600Ujhhgtgfeyxiexzf;
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf14 = c2698Ujhhgtgfeyxiexzf.f8599Ujhhgtgfeyxiexzf;
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf15 = c2698Ujhhgtgfeyxiexzf.f8601Ujhhgtgfeyxiexzf;
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf16 = c2698Ujhhgtgfeyxiexzf.f8602Ujhhgtgfeyxiexzf;
                float f5 = c2698Ujhhgtgfeyxiexzf.f8608Ujhhgtgfeyxiexzf;
                int[] iArr = c3656Ujhhgtgfeyxiexzf2.f11631Ujhhgtgfeyxiexzf;
                C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr4 = c3656Ujhhgtgfeyxiexzf2.f11606feyxiexzfUjhhgtg;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i24 = c3655Ujhhgtgfeyxiexzf16.f11624feyxiexzfUjhhgtg;
                    boolean z7 = i24 == 0;
                    boolean z8 = i24 == 1;
                    z = i24 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i25 = c3655Ujhhgtgfeyxiexzf16.f11625feyxiexzfUjhhgtg;
                    boolean z9 = i25 == 0;
                    boolean z10 = i25 == 1;
                    z = i25 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr5 = c3655Ujhhgtgfeyxiexzf6.f11606feyxiexzfUjhhgtg;
                    int[] iArr2 = c3655Ujhhgtgfeyxiexzf6.f11631Ujhhgtgfeyxiexzf;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf9 = c3641UjhhgtgfeyxiexzfArr5[i3];
                    int i26 = z ? 1 : 4;
                    int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf9.m5289Ujhhgtgfeyxiexzf();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && c3655Ujhhgtgfeyxiexzf6.f11583Ujhhgtgfeyxiexzf[i] == 0;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf10 = c3641Ujhhgtgfeyxiexzf9.f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf10 != null && c3655Ujhhgtgfeyxiexzf6 != c3655Ujhhgtgfeyxiexzf6) {
                        iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf10.m5289Ujhhgtgfeyxiexzf() + iM5289Ujhhgtgfeyxiexzf;
                    }
                    int i27 = iM5289Ujhhgtgfeyxiexzf;
                    if (z13 && c3655Ujhhgtgfeyxiexzf6 != c3655Ujhhgtgfeyxiexzf6 && c3655Ujhhgtgfeyxiexzf6 != c3655Ujhhgtgfeyxiexzf14) {
                        i26 = 8;
                    }
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf17 = c3655Ujhhgtgfeyxiexzf6;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf11 = c3641Ujhhgtgfeyxiexzf9.f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf11 != null) {
                        if (c3655Ujhhgtgfeyxiexzf6 == c3655Ujhhgtgfeyxiexzf14) {
                            c0072Ujhhgtgfeyxiexzf.m1092Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf9.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf11.f11381Ujhhgtgfeyxiexzf, i27, 6);
                        } else {
                            c0072Ujhhgtgfeyxiexzf.m1092Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf9.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf11.f11381Ujhhgtgfeyxiexzf, i27, 8);
                        }
                        c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf9.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf9.f11378Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, i27, (!z14 || z13) ? i26 : 5);
                    }
                    if (z12) {
                        if (c3655Ujhhgtgfeyxiexzf6.f11622Ujhhgtgfeyxiexzf == 8 || iArr2[i] != 3) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            c0072Ujhhgtgfeyxiexzf.m1092Ujhhgtgfeyxiexzf(c3641UjhhgtgfeyxiexzfArr5[i3 + 1].f11381Ujhhgtgfeyxiexzf, c3641UjhhgtgfeyxiexzfArr5[i3].f11381Ujhhgtgfeyxiexzf, 0, 5);
                        }
                        c0072Ujhhgtgfeyxiexzf.m1092Ujhhgtgfeyxiexzf(c3641UjhhgtgfeyxiexzfArr5[i3].f11381Ujhhgtgfeyxiexzf, c3641UjhhgtgfeyxiexzfArr4[i3].f11381Ujhhgtgfeyxiexzf, i10, 8);
                    }
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf12 = c3641UjhhgtgfeyxiexzfArr5[i3 + 1].f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf12 != null) {
                        c3655Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf12.f11376Ujhhgtgfeyxiexzf;
                        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf13 = c3655Ujhhgtgfeyxiexzf4.f11606feyxiexzfUjhhgtg[i3].f11378Ujhhgtgfeyxiexzf;
                        if (c3641Ujhhgtgfeyxiexzf13 == null || c3641Ujhhgtgfeyxiexzf13.f11376Ujhhgtgfeyxiexzf != c3655Ujhhgtgfeyxiexzf6) {
                            c3655Ujhhgtgfeyxiexzf4 = null;
                        }
                    } else {
                        c3655Ujhhgtgfeyxiexzf4 = null;
                    }
                    if (c3655Ujhhgtgfeyxiexzf4 != null) {
                        c3655Ujhhgtgfeyxiexzf6 = c3655Ujhhgtgfeyxiexzf4;
                    } else {
                        z11 = true;
                    }
                    c3655Ujhhgtgfeyxiexzf6 = c3655Ujhhgtgfeyxiexzf17;
                    z6 = z12;
                    z = z13;
                }
                boolean z15 = z6;
                boolean z16 = z;
                if (c3655Ujhhgtgfeyxiexzf15 != null) {
                    int i28 = i3 + 1;
                    if (c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i28].f11378Ujhhgtgfeyxiexzf != null) {
                        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf14 = c3655Ujhhgtgfeyxiexzf15.f11606feyxiexzfUjhhgtg[i28];
                        if (c3655Ujhhgtgfeyxiexzf15.f11631Ujhhgtgfeyxiexzf[i] == 3 && c3655Ujhhgtgfeyxiexzf15.f11583Ujhhgtgfeyxiexzf[i] == 0 && !z16) {
                            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf15 = c3641Ujhhgtgfeyxiexzf14.f11378Ujhhgtgfeyxiexzf;
                            if (c3641Ujhhgtgfeyxiexzf15.f11376Ujhhgtgfeyxiexzf == c3656Ujhhgtgfeyxiexzf2) {
                                c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf14.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf15.f11381Ujhhgtgfeyxiexzf, -c3641Ujhhgtgfeyxiexzf14.m5289Ujhhgtgfeyxiexzf(), 5);
                            } else if (z16) {
                                c3641Ujhhgtgfeyxiexzf6 = c3641Ujhhgtgfeyxiexzf14.f11378Ujhhgtgfeyxiexzf;
                                if (c3641Ujhhgtgfeyxiexzf6.f11376Ujhhgtgfeyxiexzf == c3656Ujhhgtgfeyxiexzf2) {
                                    c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf14.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf6.f11381Ujhhgtgfeyxiexzf, -c3641Ujhhgtgfeyxiexzf14.m5289Ujhhgtgfeyxiexzf(), 4);
                                }
                            }
                        } else if (z16) {
                            c3641Ujhhgtgfeyxiexzf6 = c3641Ujhhgtgfeyxiexzf14.f11378Ujhhgtgfeyxiexzf;
                            if (c3641Ujhhgtgfeyxiexzf6.f11376Ujhhgtgfeyxiexzf == c3656Ujhhgtgfeyxiexzf2) {
                                c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf14.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf6.f11381Ujhhgtgfeyxiexzf, -c3641Ujhhgtgfeyxiexzf14.m5289Ujhhgtgfeyxiexzf(), 4);
                            }
                        }
                        c0072Ujhhgtgfeyxiexzf.m1093Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf14.f11381Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i28].f11378Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, -c3641Ujhhgtgfeyxiexzf14.m5289Ujhhgtgfeyxiexzf(), 6);
                    }
                }
                if (z15) {
                    int i29 = i3 + 1;
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg11 = c3641UjhhgtgfeyxiexzfArr4[i29].f11381Ujhhgtgfeyxiexzf;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf16 = c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i29];
                    c0072Ujhhgtgfeyxiexzf.m1092Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg11, c3641Ujhhgtgfeyxiexzf16.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf16.m5289Ujhhgtgfeyxiexzf(), 8);
                }
                ArrayList arrayList3 = c2698Ujhhgtgfeyxiexzf.f8605Ujhhgtgfeyxiexzf;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c2698Ujhhgtgfeyxiexzf.f8611Ujhhgtgfeyxiexzf && !c2698Ujhhgtgfeyxiexzf.f8613Ujhhgtgfeyxiexzf) {
                        f5 = c2698Ujhhgtgfeyxiexzf.f8607Ujhhgtgfeyxiexzf;
                    }
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf18 = null;
                    float f6 = 0.0f;
                    int i30 = 0;
                    while (i30 < size) {
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf19 = (C3655Ujhhgtgfeyxiexzf) arrayList3.get(i30);
                        float[] fArr = c3655Ujhhgtgfeyxiexzf19.f11626feyxiexzfUjhhgtg;
                        C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr6 = c3655Ujhhgtgfeyxiexzf19.f11606feyxiexzfUjhhgtg;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641UjhhgtgfeyxiexzfArr6[i3 + 1].f11381Ujhhgtgfeyxiexzf, c3641UjhhgtgfeyxiexzfArr6[i3].f11381Ujhhgtgfeyxiexzf, 0, 8);
                                i30 = i30;
                                f = f3;
                                f6 = f6;
                                i12 = i12;
                            } else {
                                float f8 = f6;
                                if (c3655Ujhhgtgfeyxiexzf18 != null) {
                                    C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr7 = c3655Ujhhgtgfeyxiexzf18.f11606feyxiexzfUjhhgtg;
                                    c1224feyxiexzfUjhhgtg7 = c3641UjhhgtgfeyxiexzfArr7[i3].f11381Ujhhgtgfeyxiexzf;
                                    int i31 = i3 + 1;
                                    c1224feyxiexzfUjhhgtg8 = c3641UjhhgtgfeyxiexzfArr7[i31].f11381Ujhhgtgfeyxiexzf;
                                    c1224feyxiexzfUjhhgtg9 = c3641UjhhgtgfeyxiexzfArr6[i3].f11381Ujhhgtgfeyxiexzf;
                                    c1224feyxiexzfUjhhgtg10 = c3641UjhhgtgfeyxiexzfArr6[i31].f11381Ujhhgtgfeyxiexzf;
                                    c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1098Ujhhgtgfeyxiexzf();
                                    f2 = f3;
                                    c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7781Ujhhgtgfeyxiexzf = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg7, 1.0f);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg8, -1.0f);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg10, 1.0f);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg9, -1.0f);
                                    } else if (f8 == f) {
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg7, 1.0f);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg8, -1.0f);
                                    } else if (f7 == f3) {
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg9, 1.0f);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg10, -1.0f);
                                    } else {
                                        float f9 = (f8 / f5) / (f7 / f5);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg7, 1.0f);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg8, -1.0f);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg10, f9);
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg9, -f9);
                                    }
                                    c0072Ujhhgtgfeyxiexzf.m1089Ujhhgtgfeyxiexzf(c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf);
                                } else {
                                    i30 = i30;
                                    f = f3;
                                    i12 = i12;
                                }
                                f6 = f7;
                                c3655Ujhhgtgfeyxiexzf18 = c3655Ujhhgtgfeyxiexzf19;
                            }
                        } else {
                            if (c2698Ujhhgtgfeyxiexzf.f8613Ujhhgtgfeyxiexzf) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641UjhhgtgfeyxiexzfArr6[i3 + 1].f11381Ujhhgtgfeyxiexzf, c3641UjhhgtgfeyxiexzfArr6[i3].f11381Ujhhgtgfeyxiexzf, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641UjhhgtgfeyxiexzfArr6[i3 + 1].f11381Ujhhgtgfeyxiexzf, c3641UjhhgtgfeyxiexzfArr6[i3].f11381Ujhhgtgfeyxiexzf, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (c3655Ujhhgtgfeyxiexzf18 != null) {
                                        C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr8 = c3655Ujhhgtgfeyxiexzf18.f11606feyxiexzfUjhhgtg;
                                        c1224feyxiexzfUjhhgtg7 = c3641UjhhgtgfeyxiexzfArr8[i3].f11381Ujhhgtgfeyxiexzf;
                                        int i32 = i3 + 1;
                                        c1224feyxiexzfUjhhgtg8 = c3641UjhhgtgfeyxiexzfArr8[i32].f11381Ujhhgtgfeyxiexzf;
                                        c1224feyxiexzfUjhhgtg9 = c3641UjhhgtgfeyxiexzfArr6[i3].f11381Ujhhgtgfeyxiexzf;
                                        c1224feyxiexzfUjhhgtg10 = c3641UjhhgtgfeyxiexzfArr6[i32].f11381Ujhhgtgfeyxiexzf;
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1098Ujhhgtgfeyxiexzf();
                                        f2 = f3;
                                        c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7781Ujhhgtgfeyxiexzf = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg7, 1.0f);
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg8, -1.0f);
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg10, 1.0f);
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg9, -1.0f);
                                        } else {
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg7, 1.0f);
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg8, -1.0f);
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg10, 1.0f);
                                            c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg9, -1.0f);
                                        }
                                        c0072Ujhhgtgfeyxiexzf.m1089Ujhhgtgfeyxiexzf(c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf);
                                    } else {
                                        i30 = i30;
                                        f = f3;
                                        i12 = i12;
                                    }
                                    f6 = f7;
                                    c3655Ujhhgtgfeyxiexzf18 = c3655Ujhhgtgfeyxiexzf19;
                                }
                            }
                            i30 = i30;
                            f = f3;
                            f6 = f6;
                            i12 = i12;
                        }
                        i30++;
                        i12 = i12;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i12;
                if (c3655Ujhhgtgfeyxiexzf14 == null || !(c3655Ujhhgtgfeyxiexzf14 == c3655Ujhhgtgfeyxiexzf15 || z16)) {
                    c3655Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf15;
                    if (!z2 || c3655Ujhhgtgfeyxiexzf14 == null) {
                        int i33 = 8;
                        if (z3 && c3655Ujhhgtgfeyxiexzf14 != null) {
                            int i34 = c2698Ujhhgtgfeyxiexzf.f8607Ujhhgtgfeyxiexzf;
                            boolean z17 = i34 > 0 && c2698Ujhhgtgfeyxiexzf.f8606Ujhhgtgfeyxiexzf == i34;
                            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf20 = c3655Ujhhgtgfeyxiexzf14;
                            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf21 = c3655Ujhhgtgfeyxiexzf20;
                            while (c3655Ujhhgtgfeyxiexzf21 != null) {
                                C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr9 = c3655Ujhhgtgfeyxiexzf21.f11606feyxiexzfUjhhgtg;
                                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf22 = c3655Ujhhgtgfeyxiexzf21.f11628feyxiexzfUjhhgtg[i];
                                while (c3655Ujhhgtgfeyxiexzf22 != null && c3655Ujhhgtgfeyxiexzf22.f11622Ujhhgtgfeyxiexzf == i33) {
                                    c3655Ujhhgtgfeyxiexzf22 = c3655Ujhhgtgfeyxiexzf22.f11628feyxiexzfUjhhgtg[i];
                                }
                                if (c3655Ujhhgtgfeyxiexzf21 == c3655Ujhhgtgfeyxiexzf14 || c3655Ujhhgtgfeyxiexzf21 == c3655Ujhhgtgfeyxiexzf || c3655Ujhhgtgfeyxiexzf22 == null) {
                                    c3655Ujhhgtgfeyxiexzf20 = c3655Ujhhgtgfeyxiexzf20;
                                } else {
                                    if (c3655Ujhhgtgfeyxiexzf22 == c3655Ujhhgtgfeyxiexzf) {
                                        c3655Ujhhgtgfeyxiexzf22 = null;
                                    }
                                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf17 = c3641UjhhgtgfeyxiexzfArr9[i3];
                                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg12 = c3641Ujhhgtgfeyxiexzf17.f11381Ujhhgtgfeyxiexzf;
                                    int i35 = i3 + 1;
                                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg13 = c3655Ujhhgtgfeyxiexzf20.f11606feyxiexzfUjhhgtg[i35].f11381Ujhhgtgfeyxiexzf;
                                    int iM5289Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf17.m5289Ujhhgtgfeyxiexzf();
                                    int iM5289Ujhhgtgfeyxiexzf3 = c3641UjhhgtgfeyxiexzfArr9[i35].m5289Ujhhgtgfeyxiexzf();
                                    if (c3655Ujhhgtgfeyxiexzf22 != null) {
                                        c3641Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf22.f11606feyxiexzfUjhhgtg[i3];
                                        c1224feyxiexzfUjhhgtg2 = c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf;
                                        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf18 = c3641Ujhhgtgfeyxiexzf.f11378Ujhhgtgfeyxiexzf;
                                        c1224feyxiexzfUjhhgtg = c3641Ujhhgtgfeyxiexzf18 != null ? c3641Ujhhgtgfeyxiexzf18.f11381Ujhhgtgfeyxiexzf : null;
                                    } else {
                                        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf19 = c3655Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[i3];
                                        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg14 = c3641Ujhhgtgfeyxiexzf19 != null ? c3641Ujhhgtgfeyxiexzf19.f11381Ujhhgtgfeyxiexzf : null;
                                        c1224feyxiexzfUjhhgtg = c3641UjhhgtgfeyxiexzfArr9[i35].f11381Ujhhgtgfeyxiexzf;
                                        c3641Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf19;
                                        c1224feyxiexzfUjhhgtg2 = c1224feyxiexzfUjhhgtg14;
                                    }
                                    if (c3641Ujhhgtgfeyxiexzf != null) {
                                        iM5289Ujhhgtgfeyxiexzf3 += c3641Ujhhgtgfeyxiexzf.m5289Ujhhgtgfeyxiexzf();
                                    }
                                    int iM5289Ujhhgtgfeyxiexzf4 = iM5289Ujhhgtgfeyxiexzf2 + c3655Ujhhgtgfeyxiexzf20.f11606feyxiexzfUjhhgtg[i35].m5289Ujhhgtgfeyxiexzf();
                                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf23 = c3655Ujhhgtgfeyxiexzf22;
                                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg15 = c1224feyxiexzfUjhhgtg2;
                                    int i36 = z17 ? 8 : 4;
                                    if (c1224feyxiexzfUjhhgtg12 == null || c1224feyxiexzfUjhhgtg13 == null || c1224feyxiexzfUjhhgtg15 == null || c1224feyxiexzfUjhhgtg == null) {
                                        c3655Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf23;
                                    } else {
                                        c3655Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf23;
                                        c0072Ujhhgtgfeyxiexzf.m1088Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg12, c1224feyxiexzfUjhhgtg13, iM5289Ujhhgtgfeyxiexzf4, 0.5f, c1224feyxiexzfUjhhgtg15, c1224feyxiexzfUjhhgtg, iM5289Ujhhgtgfeyxiexzf3, i36);
                                    }
                                    c3655Ujhhgtgfeyxiexzf22 = c3655Ujhhgtgfeyxiexzf2;
                                }
                                if (c3655Ujhhgtgfeyxiexzf21.f11622Ujhhgtgfeyxiexzf != 8) {
                                    c3655Ujhhgtgfeyxiexzf20 = c3655Ujhhgtgfeyxiexzf21;
                                }
                                c3655Ujhhgtgfeyxiexzf21 = c3655Ujhhgtgfeyxiexzf22;
                                c3655Ujhhgtgfeyxiexzf20 = c3655Ujhhgtgfeyxiexzf20;
                                i33 = 8;
                            }
                            c0072Ujhhgtgfeyxiexzf2 = c0072Ujhhgtgfeyxiexzf;
                            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf20 = c3655Ujhhgtgfeyxiexzf14.f11606feyxiexzfUjhhgtg[i3];
                            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf21 = c3641UjhhgtgfeyxiexzfArr2[i3].f11378Ujhhgtgfeyxiexzf;
                            int i37 = i3 + 1;
                            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf22 = c3655Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[i37];
                            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf23 = c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i37].f11378Ujhhgtgfeyxiexzf;
                            if (c3641Ujhhgtgfeyxiexzf21 != null) {
                                if (c3655Ujhhgtgfeyxiexzf14 != c3655Ujhhgtgfeyxiexzf) {
                                    c0072Ujhhgtgfeyxiexzf2.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf20.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf21.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf20.m5289Ujhhgtgfeyxiexzf(), 5);
                                } else if (c3641Ujhhgtgfeyxiexzf23 != null) {
                                    c0072Ujhhgtgfeyxiexzf2.m1088Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf20.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf21.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf20.m5289Ujhhgtgfeyxiexzf(), 0.5f, c3641Ujhhgtgfeyxiexzf22.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf23.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf22.m5289Ujhhgtgfeyxiexzf(), 5);
                                }
                            }
                            if (c3641Ujhhgtgfeyxiexzf23 != null && c3655Ujhhgtgfeyxiexzf14 != c3655Ujhhgtgfeyxiexzf) {
                                c0072Ujhhgtgfeyxiexzf2.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf22.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf23.f11381Ujhhgtgfeyxiexzf, -c3641Ujhhgtgfeyxiexzf22.m5289Ujhhgtgfeyxiexzf(), 5);
                            }
                        }
                        if ((z2 || z3) && c3655Ujhhgtgfeyxiexzf14 != null && c3655Ujhhgtgfeyxiexzf14 != c3655Ujhhgtgfeyxiexzf) {
                            c3641UjhhgtgfeyxiexzfArr = c3655Ujhhgtgfeyxiexzf14.f11606feyxiexzfUjhhgtg;
                            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf24 = c3641UjhhgtgfeyxiexzfArr[i3];
                            i8 = i3 + 1;
                            c3641Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[i8];
                            c3641Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf24.f11378Ujhhgtgfeyxiexzf;
                            if (c3641Ujhhgtgfeyxiexzf4 != null) {
                                c1224feyxiexzfUjhhgtg5 = c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf;
                            } else {
                                c1224feyxiexzfUjhhgtg5 = null;
                            }
                            c3641Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf3.f11378Ujhhgtgfeyxiexzf;
                            if (c3641Ujhhgtgfeyxiexzf5 != null) {
                                c1224feyxiexzfUjhhgtg6 = c3641Ujhhgtgfeyxiexzf5.f11381Ujhhgtgfeyxiexzf;
                            } else {
                                c1224feyxiexzfUjhhgtg6 = null;
                            }
                            if (c3655Ujhhgtgfeyxiexzf13 != c3655Ujhhgtgfeyxiexzf) {
                                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf25 = c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i8].f11378Ujhhgtgfeyxiexzf;
                                c1224feyxiexzfUjhhgtg6 = c3641Ujhhgtgfeyxiexzf25 != null ? c3641Ujhhgtgfeyxiexzf25.f11381Ujhhgtgfeyxiexzf : null;
                            }
                            if (c3655Ujhhgtgfeyxiexzf14 == c3655Ujhhgtgfeyxiexzf) {
                                c3641Ujhhgtgfeyxiexzf3 = c3641UjhhgtgfeyxiexzfArr[i8];
                            }
                            if (c1224feyxiexzfUjhhgtg5 == null && c1224feyxiexzfUjhhgtg6 != null) {
                                c0072Ujhhgtgfeyxiexzf2.m1088Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf24.f11381Ujhhgtgfeyxiexzf, c1224feyxiexzfUjhhgtg5, c3641Ujhhgtgfeyxiexzf24.m5289Ujhhgtgfeyxiexzf(), 0.5f, c1224feyxiexzfUjhhgtg6, c3641Ujhhgtgfeyxiexzf3.f11381Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[i8].m5289Ujhhgtgfeyxiexzf(), 5);
                            }
                        }
                    } else {
                        int i38 = c2698Ujhhgtgfeyxiexzf.f8607Ujhhgtgfeyxiexzf;
                        boolean z18 = i38 > 0 && c2698Ujhhgtgfeyxiexzf.f8606Ujhhgtgfeyxiexzf == i38;
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf24 = c3655Ujhhgtgfeyxiexzf14;
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf25 = c3655Ujhhgtgfeyxiexzf24;
                        while (c3655Ujhhgtgfeyxiexzf24 != null) {
                            C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr10 = c3655Ujhhgtgfeyxiexzf24.f11606feyxiexzfUjhhgtg;
                            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf26 = c3655Ujhhgtgfeyxiexzf24.f11628feyxiexzfUjhhgtg[i];
                            while (true) {
                                if (c3655Ujhhgtgfeyxiexzf26 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (c3655Ujhhgtgfeyxiexzf26.f11622Ujhhgtgfeyxiexzf != 8) {
                                    break;
                                } else {
                                    c3655Ujhhgtgfeyxiexzf26 = c3655Ujhhgtgfeyxiexzf26.f11628feyxiexzfUjhhgtg[i];
                                }
                            }
                            if (c3655Ujhhgtgfeyxiexzf26 != null || c3655Ujhhgtgfeyxiexzf24 == c3655Ujhhgtgfeyxiexzf) {
                                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf26 = c3641UjhhgtgfeyxiexzfArr10[i3];
                                C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg16 = c3641Ujhhgtgfeyxiexzf26.f11381Ujhhgtgfeyxiexzf;
                                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf27 = c3641Ujhhgtgfeyxiexzf26.f11378Ujhhgtgfeyxiexzf;
                                C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg17 = c3641Ujhhgtgfeyxiexzf27 != null ? c3641Ujhhgtgfeyxiexzf27.f11381Ujhhgtgfeyxiexzf : null;
                                if (c3655Ujhhgtgfeyxiexzf25 != c3655Ujhhgtgfeyxiexzf24) {
                                    c1224feyxiexzfUjhhgtg17 = c3655Ujhhgtgfeyxiexzf25.f11606feyxiexzfUjhhgtg[i3 + 1].f11381Ujhhgtgfeyxiexzf;
                                } else if (c3655Ujhhgtgfeyxiexzf24 == c3655Ujhhgtgfeyxiexzf14 && c3655Ujhhgtgfeyxiexzf25 == c3655Ujhhgtgfeyxiexzf24) {
                                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf28 = c3641UjhhgtgfeyxiexzfArr2[i3].f11378Ujhhgtgfeyxiexzf;
                                    c1224feyxiexzfUjhhgtg17 = c3641Ujhhgtgfeyxiexzf28 != null ? c3641Ujhhgtgfeyxiexzf28.f11381Ujhhgtgfeyxiexzf : null;
                                }
                                int iM5289Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf26.m5289Ujhhgtgfeyxiexzf();
                                int i39 = i3 + 1;
                                int iM5289Ujhhgtgfeyxiexzf6 = c3641UjhhgtgfeyxiexzfArr10[i39].m5289Ujhhgtgfeyxiexzf();
                                if (c3655Ujhhgtgfeyxiexzf26 != null) {
                                    c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf26.f11606feyxiexzfUjhhgtg[i3];
                                    c1224feyxiexzfUjhhgtg3 = c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf;
                                    c1224feyxiexzfUjhhgtg4 = c3641UjhhgtgfeyxiexzfArr10[i39].f11381Ujhhgtgfeyxiexzf;
                                } else {
                                    c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i39].f11378Ujhhgtgfeyxiexzf;
                                    c1224feyxiexzfUjhhgtg3 = c3641Ujhhgtgfeyxiexzf2 != null ? c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf : null;
                                    c1224feyxiexzfUjhhgtg4 = c3641UjhhgtgfeyxiexzfArr10[i39].f11381Ujhhgtgfeyxiexzf;
                                }
                                if (c3641Ujhhgtgfeyxiexzf2 != null) {
                                    iM5289Ujhhgtgfeyxiexzf6 += c3641Ujhhgtgfeyxiexzf2.m5289Ujhhgtgfeyxiexzf();
                                }
                                if (c3655Ujhhgtgfeyxiexzf25 != null) {
                                    iM5289Ujhhgtgfeyxiexzf5 += c3655Ujhhgtgfeyxiexzf25.f11606feyxiexzfUjhhgtg[i39].m5289Ujhhgtgfeyxiexzf();
                                }
                                if (c1224feyxiexzfUjhhgtg16 == null || c1224feyxiexzfUjhhgtg17 == null || c1224feyxiexzfUjhhgtg3 == null || c1224feyxiexzfUjhhgtg4 == null) {
                                    c3655Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf26;
                                    i7 = 8;
                                } else {
                                    if (c3655Ujhhgtgfeyxiexzf24 == c3655Ujhhgtgfeyxiexzf14) {
                                        iM5289Ujhhgtgfeyxiexzf5 = c3655Ujhhgtgfeyxiexzf14.f11606feyxiexzfUjhhgtg[i3].m5289Ujhhgtgfeyxiexzf();
                                    }
                                    if (c3655Ujhhgtgfeyxiexzf24 == c3655Ujhhgtgfeyxiexzf) {
                                        iM5289Ujhhgtgfeyxiexzf6 = c3655Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[i39].m5289Ujhhgtgfeyxiexzf();
                                    }
                                    c3655Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf26;
                                    i7 = 8;
                                    c0072Ujhhgtgfeyxiexzf.m1088Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg16, c1224feyxiexzfUjhhgtg17, iM5289Ujhhgtgfeyxiexzf5, 0.5f, c1224feyxiexzfUjhhgtg3, c1224feyxiexzfUjhhgtg4, iM5289Ujhhgtgfeyxiexzf6, z18 ? 8 : 5);
                                }
                            } else {
                                c3655Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf26;
                                i7 = i6;
                            }
                            if (c3655Ujhhgtgfeyxiexzf24.f11622Ujhhgtgfeyxiexzf != i7) {
                                c3655Ujhhgtgfeyxiexzf25 = c3655Ujhhgtgfeyxiexzf24;
                            }
                            c3655Ujhhgtgfeyxiexzf24 = c3655Ujhhgtgfeyxiexzf3;
                            c3655Ujhhgtgfeyxiexzf25 = c3655Ujhhgtgfeyxiexzf25;
                            c3641UjhhgtgfeyxiexzfArr2 = c3641UjhhgtgfeyxiexzfArr2;
                        }
                    }
                } else {
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf29 = c3641UjhhgtgfeyxiexzfArr2[i3];
                    int i40 = i3 + 1;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf30 = c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i40];
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf31 = c3641Ujhhgtgfeyxiexzf29.f11378Ujhhgtgfeyxiexzf;
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg18 = c3641Ujhhgtgfeyxiexzf31 != null ? c3641Ujhhgtgfeyxiexzf31.f11381Ujhhgtgfeyxiexzf : null;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf32 = c3641Ujhhgtgfeyxiexzf30.f11378Ujhhgtgfeyxiexzf;
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg19 = c3641Ujhhgtgfeyxiexzf32 != null ? c3641Ujhhgtgfeyxiexzf32.f11381Ujhhgtgfeyxiexzf : null;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf33 = c3655Ujhhgtgfeyxiexzf14.f11606feyxiexzfUjhhgtg[i3];
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf34 = c3655Ujhhgtgfeyxiexzf15.f11606feyxiexzfUjhhgtg[i40];
                    if (c1224feyxiexzfUjhhgtg18 == null || c1224feyxiexzfUjhhgtg19 == null) {
                        c3655Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf15;
                    } else {
                        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg20 = c1224feyxiexzfUjhhgtg18;
                        c3655Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf15;
                        c0072Ujhhgtgfeyxiexzf.m1088Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf33.f11381Ujhhgtgfeyxiexzf, c1224feyxiexzfUjhhgtg20, c3641Ujhhgtgfeyxiexzf33.m5289Ujhhgtgfeyxiexzf(), i == 0 ? c3655Ujhhgtgfeyxiexzf16.f11619Ujhhgtgfeyxiexzf : c3655Ujhhgtgfeyxiexzf16.f11620Ujhhgtgfeyxiexzf, c1224feyxiexzfUjhhgtg19, c3641Ujhhgtgfeyxiexzf34.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf34.m5289Ujhhgtgfeyxiexzf(), 7);
                    }
                }
                c0072Ujhhgtgfeyxiexzf2 = c0072Ujhhgtgfeyxiexzf;
                if (z2) {
                    c3641UjhhgtgfeyxiexzfArr = c3655Ujhhgtgfeyxiexzf14.f11606feyxiexzfUjhhgtg;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf210 = c3641UjhhgtgfeyxiexzfArr[i3];
                    i8 = i3 + 1;
                    c3641Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[i8];
                    c3641Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf210.f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf4 != null) {
                        c1224feyxiexzfUjhhgtg5 = c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf;
                    } else {
                        c1224feyxiexzfUjhhgtg5 = null;
                    }
                    c3641Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf3.f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf5 != null) {
                        c1224feyxiexzfUjhhgtg6 = c3641Ujhhgtgfeyxiexzf5.f11381Ujhhgtgfeyxiexzf;
                    } else {
                        c1224feyxiexzfUjhhgtg6 = null;
                    }
                    if (c3655Ujhhgtgfeyxiexzf13 != c3655Ujhhgtgfeyxiexzf) {
                        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf211 = c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i8].f11378Ujhhgtgfeyxiexzf;
                        c1224feyxiexzfUjhhgtg6 = c3641Ujhhgtgfeyxiexzf211 != null ? c3641Ujhhgtgfeyxiexzf211.f11381Ujhhgtgfeyxiexzf : null;
                    }
                    if (c3655Ujhhgtgfeyxiexzf14 == c3655Ujhhgtgfeyxiexzf) {
                        c3641Ujhhgtgfeyxiexzf3 = c3641UjhhgtgfeyxiexzfArr[i8];
                    }
                    if (c1224feyxiexzfUjhhgtg5 == null) {
                    }
                } else {
                    c3641UjhhgtgfeyxiexzfArr = c3655Ujhhgtgfeyxiexzf14.f11606feyxiexzfUjhhgtg;
                    C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf212 = c3641UjhhgtgfeyxiexzfArr[i3];
                    i8 = i3 + 1;
                    c3641Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[i8];
                    c3641Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf212.f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf4 != null) {
                        c1224feyxiexzfUjhhgtg5 = c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf;
                    } else {
                        c1224feyxiexzfUjhhgtg5 = null;
                    }
                    c3641Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf3.f11378Ujhhgtgfeyxiexzf;
                    if (c3641Ujhhgtgfeyxiexzf5 != null) {
                        c1224feyxiexzfUjhhgtg6 = c3641Ujhhgtgfeyxiexzf5.f11381Ujhhgtgfeyxiexzf;
                    } else {
                        c1224feyxiexzfUjhhgtg6 = null;
                    }
                    if (c3655Ujhhgtgfeyxiexzf13 != c3655Ujhhgtgfeyxiexzf) {
                        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf213 = c3655Ujhhgtgfeyxiexzf13.f11606feyxiexzfUjhhgtg[i8].f11378Ujhhgtgfeyxiexzf;
                        c1224feyxiexzfUjhhgtg6 = c3641Ujhhgtgfeyxiexzf213 != null ? c3641Ujhhgtgfeyxiexzf213.f11381Ujhhgtgfeyxiexzf : null;
                    }
                    if (c3655Ujhhgtgfeyxiexzf14 == c3655Ujhhgtgfeyxiexzf) {
                        c3641Ujhhgtgfeyxiexzf3 = c3641UjhhgtgfeyxiexzfArr[i8];
                    }
                    if (c1224feyxiexzfUjhhgtg5 == null) {
                    }
                }
            } else {
                i5 = i12;
            }
            i13 = i4 + 1;
            c3656Ujhhgtgfeyxiexzf2 = c3656Ujhhgtgfeyxiexzf;
            i12 = i5;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Object[] m1877Ujhhgtgfeyxiexzf(Object[]... objArr) {
        if (objArr.length == 0) {
            throw new NullPointerException("There is no arrays to concat!");
        }
        if (objArr.length == 1) {
            return objArr[0];
        }
        int length = 0;
        for (Object[] objArr2 : objArr) {
            length += objArr2.length;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr[0].getClass().getComponentType(), length);
        int length2 = 0;
        for (Object[] objArr4 : objArr) {
            System.arraycopy(objArr4, 0, objArr3, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return objArr3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C0385Ujhhgtgfeyxiexzf m1878Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge, C2919Ujhhgtgfeyxiexzf c2919Ujhhgtgfeyxiexzf) {
        int iM4289Ujhhgtgfeyxiexzf = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(10);
        int i = iM4289Ujhhgtgfeyxiexzf != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM4289Ujhhgtgfeyxiexzf2 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(4);
        int i3 = iM4289Ujhhgtgfeyxiexzf2 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf2 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        int iM4289Ujhhgtgfeyxiexzf3 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(6);
        int i4 = iM4289Ujhhgtgfeyxiexzf3 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf3 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        int iM4289Ujhhgtgfeyxiexzf4 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(8);
        int i5 = iM4289Ujhhgtgfeyxiexzf4 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf4 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        int iM4289Ujhhgtgfeyxiexzf5 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(12);
        String strM4291Ujhhgtgfeyxiexzf = iM4289Ujhhgtgfeyxiexzf5 != 0 ? c2919Ujhhgtgfeyxiexzf.m4291Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf5 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : null;
        if (strM4291Ujhhgtgfeyxiexzf == null) {
            strM4291Ujhhgtgfeyxiexzf = "";
        }
        String str = strM4291Ujhhgtgfeyxiexzf;
        int iM4289Ujhhgtgfeyxiexzf6 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(14);
        int i6 = iM4289Ujhhgtgfeyxiexzf6 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt(iM4289Ujhhgtgfeyxiexzf6 + c2919Ujhhgtgfeyxiexzf.f9203Ujhhgtgfeyxiexzf) : 0;
        ArrayList arrayList = new ArrayList();
        int iM4289Ujhhgtgfeyxiexzf7 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(16);
        int iM4293Ujhhgtgfeyxiexzf = iM4289Ujhhgtgfeyxiexzf7 != 0 ? c2919Ujhhgtgfeyxiexzf.m4293Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf7) : 0;
        for (int i7 = 0; i7 < iM4293Ujhhgtgfeyxiexzf; i7++) {
            int iM4289Ujhhgtgfeyxiexzf8 = c2919Ujhhgtgfeyxiexzf.m4289Ujhhgtgfeyxiexzf(16);
            arrayList.add(Integer.valueOf(iM4289Ujhhgtgfeyxiexzf8 != 0 ? c2919Ujhhgtgfeyxiexzf.f9204Ujhhgtgfeyxiexzf.getInt((i7 * 4) + c2919Ujhhgtgfeyxiexzf.m4292Ujhhgtgfeyxiexzf(iM4289Ujhhgtgfeyxiexzf8)) : 0));
        }
        return new C0385Ujhhgtgfeyxiexzf(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final AbstractC0571Ujhhgtgfeyxiexzf[] m1879Ujhhgtgfeyxiexzf() {
        return new AbstractC0571Ujhhgtgfeyxiexzf[]{C2705feyxiexzfUjhhgtg.f8634Ujhhgtgfeyxiexzf, C2770feyxiexzfUjhhgtg.f8766Ujhhgtgfeyxiexzf, C2754Ujhhgtgfeyxiexzf.f8726Ujhhgtgfeyxiexzf, C2749Ujhhgtgfeyxiexzf.f8720Ujhhgtgfeyxiexzf, C3683feyxiexzfUjhhgtg.f11709Ujhhgtgfeyxiexzf, C3702feyxiexzfUjhhgtg.f11737Ujhhgtgfeyxiexzf, C3715feyxiexzfUjhhgtg.f11764Ujhhgtgfeyxiexzf, C3379feyxiexzfUjhhgtg.f10553Ujhhgtgfeyxiexzf, C3506Ujhhgtgfeyxiexzf.f10919Ujhhgtgfeyxiexzf, C3413Ujhhgtgfeyxiexzf.f10635Ujhhgtgfeyxiexzf, C3412Ujhhgtgfeyxiexzf.f10633Ujhhgtgfeyxiexzf, C3461Ujhhgtgfeyxiexzf.f10752Ujhhgtgfeyxiexzf, C3460feyxiexzfUjhhgtg.f10750Ujhhgtgfeyxiexzf, C0575Ujhhgtgfeyxiexzf.f2593Ujhhgtgfeyxiexzf, C0163Ujhhgtgfeyxiexzf.f1347Ujhhgtgfeyxiexzf, C0348Ujhhgtgfeyxiexzf.f1989Ujhhgtgfeyxiexzf, C0480Ujhhgtgfeyxiexzf.f2393Ujhhgtgfeyxiexzf, C0475Ujhhgtgfeyxiexzf.f2387Ujhhgtgfeyxiexzf, C1276feyxiexzfUjhhgtg.f4660Ujhhgtgfeyxiexzf, C1462feyxiexzfUjhhgtg.f5080Ujhhgtgfeyxiexzf, C1397feyxiexzfUjhhgtg.f4912Ujhhgtgfeyxiexzf, C0980feyxiexzfUjhhgtg.f3878Ujhhgtgfeyxiexzf, C1213feyxiexzfUjhhgtg.f4518Ujhhgtgfeyxiexzf, C1144feyxiexzfUjhhgtg.f4330Ujhhgtgfeyxiexzf, C1126feyxiexzfUjhhgtg.f4275Ujhhgtgfeyxiexzf, C2064feyxiexzfUjhhgtg.f6791Ujhhgtgfeyxiexzf, C3165feyxiexzfUjhhgtg.f9797Ujhhgtgfeyxiexzf, C0338Ujhhgtgfeyxiexzf.f1968Ujhhgtgfeyxiexzf, C2230feyxiexzfUjhhgtg.f7264Ujhhgtgfeyxiexzf, C2227feyxiexzfUjhhgtg.f7247Ujhhgtgfeyxiexzf, C3059Ujhhgtgfeyxiexzf.f9476Ujhhgtgfeyxiexzf, C3709Ujhhgtgfeyxiexzf.f11751Ujhhgtgfeyxiexzf, C3280Ujhhgtgfeyxiexzf.f10300Ujhhgtgfeyxiexzf, C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf, C2724feyxiexzfUjhhgtg.f8678Ujhhgtgfeyxiexzf, C2905Ujhhgtgfeyxiexzf.f9184Ujhhgtgfeyxiexzf, C2759feyxiexzfUjhhgtg.f8740Ujhhgtgfeyxiexzf, C2897Ujhhgtgfeyxiexzf.f9174Ujhhgtgfeyxiexzf, C2900feyxiexzfUjhhgtg.f9179Ujhhgtgfeyxiexzf, C2323Ujhhgtgfeyxiexzf.f7591Ujhhgtgfeyxiexzf, C2907feyxiexzfUjhhgtg.f9186Ujhhgtgfeyxiexzf, C2909Ujhhgtgfeyxiexzf.f9188Ujhhgtgfeyxiexzf, C2911Ujhhgtgfeyxiexzf.f9190Ujhhgtgfeyxiexzf, C1769feyxiexzfUjhhgtg.f5943Ujhhgtgfeyxiexzf, C3666feyxiexzfUjhhgtg.f11663Ujhhgtgfeyxiexzf, C0185Ujhhgtgfeyxiexzf.f1390Ujhhgtgfeyxiexzf, C0181Ujhhgtgfeyxiexzf.f1386Ujhhgtgfeyxiexzf, C0183Ujhhgtgfeyxiexzf.f1388Ujhhgtgfeyxiexzf, C0854feyxiexzfUjhhgtg.f3346Ujhhgtgfeyxiexzf, C0948feyxiexzfUjhhgtg.f3809Ujhhgtgfeyxiexzf, C3735Ujhhgtgfeyxiexzf.f11800Ujhhgtgfeyxiexzf, C1136feyxiexzfUjhhgtg.f4301Ujhhgtgfeyxiexzf, C3298Ujhhgtgfeyxiexzf.f10334Ujhhgtgfeyxiexzf, C3287Ujhhgtgfeyxiexzf.f10316Ujhhgtgfeyxiexzf, C3293Ujhhgtgfeyxiexzf.f10330Ujhhgtgfeyxiexzf, C3320feyxiexzfUjhhgtg.f10355Ujhhgtgfeyxiexzf, C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf, C2370Ujhhgtgfeyxiexzf.f7720Ujhhgtgfeyxiexzf, C2443feyxiexzfUjhhgtg.f7908Ujhhgtgfeyxiexzf, C3222feyxiexzfUjhhgtg.f10124Ujhhgtgfeyxiexzf, C3717feyxiexzfUjhhgtg.f11767Ujhhgtgfeyxiexzf, C2375Ujhhgtgfeyxiexzf.f7730Ujhhgtgfeyxiexzf, C2884feyxiexzfUjhhgtg.f9151Ujhhgtgfeyxiexzf, C3707Ujhhgtgfeyxiexzf.f11749Ujhhgtgfeyxiexzf, C2218Ujhhgtgfeyxiexzf.f7203Ujhhgtgfeyxiexzf, C1842Ujhhgtgfeyxiexzf.f6181Ujhhgtgfeyxiexzf, C2368Ujhhgtgfeyxiexzf.f7718Ujhhgtgfeyxiexzf, C0469Ujhhgtgfeyxiexzf.f2377Ujhhgtgfeyxiexzf, C0471Ujhhgtgfeyxiexzf.f2379Ujhhgtgfeyxiexzf, C0453Ujhhgtgfeyxiexzf.f2356Ujhhgtgfeyxiexzf, C0455Ujhhgtgfeyxiexzf.f2358Ujhhgtgfeyxiexzf, C0462Ujhhgtgfeyxiexzf.f2365Ujhhgtgfeyxiexzf, C0457Ujhhgtgfeyxiexzf.f2360Ujhhgtgfeyxiexzf, C1338feyxiexzfUjhhgtg.f4816Ujhhgtgfeyxiexzf, C1340feyxiexzfUjhhgtg.f4818Ujhhgtgfeyxiexzf, C1342feyxiexzfUjhhgtg.f4820Ujhhgtgfeyxiexzf, C1345feyxiexzfUjhhgtg.f4823Ujhhgtgfeyxiexzf, C1347feyxiexzfUjhhgtg.f4825Ujhhgtgfeyxiexzf, C1349feyxiexzfUjhhgtg.f4827Ujhhgtgfeyxiexzf, C1352feyxiexzfUjhhgtg.f4830Ujhhgtgfeyxiexzf, C1354feyxiexzfUjhhgtg.f4832Ujhhgtgfeyxiexzf, C1356feyxiexzfUjhhgtg.f4834Ujhhgtgfeyxiexzf, C1358feyxiexzfUjhhgtg.f4836Ujhhgtgfeyxiexzf, C1360feyxiexzfUjhhgtg.f4838Ujhhgtgfeyxiexzf, C1260feyxiexzfUjhhgtg.f4625Ujhhgtgfeyxiexzf, C1263feyxiexzfUjhhgtg.f4628Ujhhgtgfeyxiexzf, C2445feyxiexzfUjhhgtg.f7910Ujhhgtgfeyxiexzf, C2794feyxiexzfUjhhgtg.f8843Ujhhgtgfeyxiexzf, C2796feyxiexzfUjhhgtg.f8845Ujhhgtgfeyxiexzf, C3669feyxiexzfUjhhgtg.f11666Ujhhgtgfeyxiexzf, C3296Ujhhgtgfeyxiexzf.f10332Ujhhgtgfeyxiexzf, C3517Ujhhgtgfeyxiexzf.f10969Ujhhgtgfeyxiexzf, C0755Ujhhgtgfeyxiexzf.f3024Ujhhgtgfeyxiexzf, C0762Ujhhgtgfeyxiexzf.f3031Ujhhgtgfeyxiexzf, C1387feyxiexzfUjhhgtg.f4884Ujhhgtgfeyxiexzf, C1074feyxiexzfUjhhgtg.f4146Ujhhgtgfeyxiexzf, C1104feyxiexzfUjhhgtg.f4199Ujhhgtgfeyxiexzf, C1063feyxiexzfUjhhgtg.f4121Ujhhgtgfeyxiexzf, C1168feyxiexzfUjhhgtg.f4410Ujhhgtgfeyxiexzf, C1877feyxiexzfUjhhgtg.f6260Ujhhgtgfeyxiexzf, C2217Ujhhgtgfeyxiexzf.f7202Ujhhgtgfeyxiexzf, C0064Ujhhgtgfeyxiexzf.f1079Ujhhgtgfeyxiexzf, C1065feyxiexzfUjhhgtg.f4126Ujhhgtgfeyxiexzf, C1196feyxiexzfUjhhgtg.f4492Ujhhgtgfeyxiexzf, C1202feyxiexzfUjhhgtg.f4499Ujhhgtgfeyxiexzf, C1240feyxiexzfUjhhgtg.f4577Ujhhgtgfeyxiexzf, C1218feyxiexzfUjhhgtg.f4528Ujhhgtgfeyxiexzf, C1220feyxiexzfUjhhgtg.f4530Ujhhgtgfeyxiexzf, C1952feyxiexzfUjhhgtg.f6428Ujhhgtgfeyxiexzf, C2454feyxiexzfUjhhgtg.f7977Ujhhgtgfeyxiexzf, C2903feyxiexzfUjhhgtg.f9182Ujhhgtgfeyxiexzf, C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, C3673feyxiexzfUjhhgtg.f11670Ujhhgtgfeyxiexzf, C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf, C3722Ujhhgtgfeyxiexzf.f11772Ujhhgtgfeyxiexzf, C0757Ujhhgtgfeyxiexzf.f3026Ujhhgtgfeyxiexzf, C0759Ujhhgtgfeyxiexzf.f3028Ujhhgtgfeyxiexzf, C0519Ujhhgtgfeyxiexzf.f2467Ujhhgtgfeyxiexzf, C1109feyxiexzfUjhhgtg.f4204Ujhhgtgfeyxiexzf, C1060feyxiexzfUjhhgtg.f4118Ujhhgtgfeyxiexzf, C1205feyxiexzfUjhhgtg.f4502Ujhhgtgfeyxiexzf, C1873feyxiexzfUjhhgtg.f6250Ujhhgtgfeyxiexzf, C0178Ujhhgtgfeyxiexzf.f1381Ujhhgtgfeyxiexzf, C0663Ujhhgtgfeyxiexzf.f2776Ujhhgtgfeyxiexzf, C1325feyxiexzfUjhhgtg.f4803Ujhhgtgfeyxiexzf, C1321feyxiexzfUjhhgtg.f4799Ujhhgtgfeyxiexzf, C1323feyxiexzfUjhhgtg.f4801Ujhhgtgfeyxiexzf, C1322feyxiexzfUjhhgtg.f4800Ujhhgtgfeyxiexzf, C1331feyxiexzfUjhhgtg.f4806Ujhhgtgfeyxiexzf, C2325Ujhhgtgfeyxiexzf.f7593Ujhhgtgfeyxiexzf, C2334Ujhhgtgfeyxiexzf.f7623Ujhhgtgfeyxiexzf, C2329Ujhhgtgfeyxiexzf.f7605Ujhhgtgfeyxiexzf, C2332Ujhhgtgfeyxiexzf.f7617Ujhhgtgfeyxiexzf, C2331Ujhhgtgfeyxiexzf.f7611Ujhhgtgfeyxiexzf, C2992Ujhhgtgfeyxiexzf.f9297Ujhhgtgfeyxiexzf, C2576Ujhhgtgfeyxiexzf.f8327Ujhhgtgfeyxiexzf, C2578Ujhhgtgfeyxiexzf.f8341Ujhhgtgfeyxiexzf, C2559Ujhhgtgfeyxiexzf.f8290Ujhhgtgfeyxiexzf, C2740feyxiexzfUjhhgtg.f8706Ujhhgtgfeyxiexzf, C3046Ujhhgtgfeyxiexzf.f9426Ujhhgtgfeyxiexzf, C3054Ujhhgtgfeyxiexzf.f9444Ujhhgtgfeyxiexzf, C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf, C0333Ujhhgtgfeyxiexzf.f1951Ujhhgtgfeyxiexzf, C0337Ujhhgtgfeyxiexzf.f1963Ujhhgtgfeyxiexzf, C0516Ujhhgtgfeyxiexzf.f2460Ujhhgtgfeyxiexzf, C0946feyxiexzfUjhhgtg.f3792Ujhhgtgfeyxiexzf, C2436Ujhhgtgfeyxiexzf.f7879Ujhhgtgfeyxiexzf, C2340Ujhhgtgfeyxiexzf.f7635Ujhhgtgfeyxiexzf, C2318Ujhhgtgfeyxiexzf.f7579Ujhhgtgfeyxiexzf, C2456feyxiexzfUjhhgtg.f7979Ujhhgtgfeyxiexzf, C2442feyxiexzfUjhhgtg.f7904Ujhhgtgfeyxiexzf, C2437feyxiexzfUjhhgtg.f7883Ujhhgtgfeyxiexzf, C2448feyxiexzfUjhhgtg.f7913Ujhhgtgfeyxiexzf, C2763feyxiexzfUjhhgtg.f8748Ujhhgtgfeyxiexzf, C3174feyxiexzfUjhhgtg.f9814Ujhhgtgfeyxiexzf, C3169feyxiexzfUjhhgtg.f9806Ujhhgtgfeyxiexzf, C3199feyxiexzfUjhhgtg.f9885Ujhhgtgfeyxiexzf, C3203feyxiexzfUjhhgtg.f9893Ujhhgtgfeyxiexzf, C3185feyxiexzfUjhhgtg.f9835Ujhhgtgfeyxiexzf, C0521Ujhhgtgfeyxiexzf.f2469Ujhhgtgfeyxiexzf, C0496Ujhhgtgfeyxiexzf.f2415Ujhhgtgfeyxiexzf, C0490Ujhhgtgfeyxiexzf.f2404Ujhhgtgfeyxiexzf, C0522Ujhhgtgfeyxiexzf.f2470Ujhhgtgfeyxiexzf, C1369feyxiexzfUjhhgtg.f4850Ujhhgtgfeyxiexzf, C0775feyxiexzfUjhhgtg.f3067Ujhhgtgfeyxiexzf, C0765feyxiexzfUjhhgtg.f3038Ujhhgtgfeyxiexzf, feyxiexzfUjhhgtg.f3032Ujhhgtgfeyxiexzf, C1041feyxiexzfUjhhgtg.f4054Ujhhgtgfeyxiexzf, C1032feyxiexzfUjhhgtg.f4034Ujhhgtgfeyxiexzf, C3525Ujhhgtgfeyxiexzf.f11012Ujhhgtgfeyxiexzf, C0558Ujhhgtgfeyxiexzf.f2559Ujhhgtgfeyxiexzf, C0556Ujhhgtgfeyxiexzf.f2553Ujhhgtgfeyxiexzf, C0555Ujhhgtgfeyxiexzf.f2549Ujhhgtgfeyxiexzf, C0560Ujhhgtgfeyxiexzf.f2566Ujhhgtgfeyxiexzf, C0562Ujhhgtgfeyxiexzf.f2572Ujhhgtgfeyxiexzf, C0590Ujhhgtgfeyxiexzf.f2627Ujhhgtgfeyxiexzf, C1420feyxiexzfUjhhgtg.f4989Ujhhgtgfeyxiexzf, C2434Ujhhgtgfeyxiexzf.f7873Ujhhgtgfeyxiexzf, C3066Ujhhgtgfeyxiexzf.f9491Ujhhgtgfeyxiexzf, C3064Ujhhgtgfeyxiexzf.f9485Ujhhgtgfeyxiexzf, C3467Ujhhgtgfeyxiexzf.f10765Ujhhgtgfeyxiexzf, C1782Ujhhgtgfeyxiexzf.f5973Ujhhgtgfeyxiexzf, C2721feyxiexzfUjhhgtg.f8669Ujhhgtgfeyxiexzf, C2722feyxiexzfUjhhgtg.f8673Ujhhgtgfeyxiexzf, C0423Ujhhgtgfeyxiexzf.f2264Ujhhgtgfeyxiexzf, C0406Ujhhgtgfeyxiexzf.f2187Ujhhgtgfeyxiexzf, C2431Ujhhgtgfeyxiexzf.f7867Ujhhgtgfeyxiexzf, C1251feyxiexzfUjhhgtg.f4597Ujhhgtgfeyxiexzf, C0541Ujhhgtgfeyxiexzf.f2517Ujhhgtgfeyxiexzf, C0534Ujhhgtgfeyxiexzf.f2502Ujhhgtgfeyxiexzf, C3282Ujhhgtgfeyxiexzf.f10305Ujhhgtgfeyxiexzf, C0277Ujhhgtgfeyxiexzf.f1689Ujhhgtgfeyxiexzf, C2209Ujhhgtgfeyxiexzf.f7186Ujhhgtgfeyxiexzf, C1134feyxiexzfUjhhgtg.f4295Ujhhgtgfeyxiexzf, C0967feyxiexzfUjhhgtg.f3840Ujhhgtgfeyxiexzf, C0969feyxiexzfUjhhgtg.f3845Ujhhgtgfeyxiexzf, C0996feyxiexzfUjhhgtg.f3905Ujhhgtgfeyxiexzf, C0997feyxiexzfUjhhgtg.f3909Ujhhgtgfeyxiexzf, C0979feyxiexzfUjhhgtg.f3874Ujhhgtgfeyxiexzf, C3291Ujhhgtgfeyxiexzf.f10323Ujhhgtgfeyxiexzf, C0497Ujhhgtgfeyxiexzf.f2421Ujhhgtgfeyxiexzf, C0506Ujhhgtgfeyxiexzf.f2436Ujhhgtgfeyxiexzf, C2205Ujhhgtgfeyxiexzf.f7174Ujhhgtgfeyxiexzf, C2215Ujhhgtgfeyxiexzf.f7196Ujhhgtgfeyxiexzf, C1428feyxiexzfUjhhgtg.f5022Ujhhgtgfeyxiexzf, C0785feyxiexzfUjhhgtg.f3088Ujhhgtgfeyxiexzf, C2830feyxiexzfUjhhgtg.f8992Ujhhgtgfeyxiexzf, C0503Ujhhgtgfeyxiexzf.f2430Ujhhgtgfeyxiexzf, C1466feyxiexzfUjhhgtg.f5096Ujhhgtgfeyxiexzf, C0777feyxiexzfUjhhgtg.f3073Ujhhgtgfeyxiexzf, C0344Ujhhgtgfeyxiexzf.f1977Ujhhgtgfeyxiexzf, C0343Ujhhgtgfeyxiexzf.f1973Ujhhgtgfeyxiexzf, C0345Ujhhgtgfeyxiexzf.f1981Ujhhgtgfeyxiexzf, RunnableC2555feyxiexzfUjhhgtg.f8282Ujhhgtgfeyxiexzf, C2460feyxiexzfUjhhgtg.f7986Ujhhgtgfeyxiexzf, C2833feyxiexzfUjhhgtg.f9002Ujhhgtgfeyxiexzf, C3163feyxiexzfUjhhgtg.f9791Ujhhgtgfeyxiexzf, C0305Ujhhgtgfeyxiexzf.f1826Ujhhgtgfeyxiexzf, C0418Ujhhgtgfeyxiexzf.f2248Ujhhgtgfeyxiexzf, C1402feyxiexzfUjhhgtg.f4918Ujhhgtgfeyxiexzf, C1079feyxiexzfUjhhgtg.f4151Ujhhgtgfeyxiexzf, C1010feyxiexzfUjhhgtg.f3940Ujhhgtgfeyxiexzf, C2074Ujhhgtgfeyxiexzf.f6812Ujhhgtgfeyxiexzf, C0972feyxiexzfUjhhgtg.f3860Ujhhgtgfeyxiexzf, C0973feyxiexzfUjhhgtg.f3864Ujhhgtgfeyxiexzf, C2317Ujhhgtgfeyxiexzf.f7574Ujhhgtgfeyxiexzf, C2319Ujhhgtgfeyxiexzf.f7584Ujhhgtgfeyxiexzf, C2328Ujhhgtgfeyxiexzf.f7600Ujhhgtgfeyxiexzf, C1200feyxiexzfUjhhgtg.f4497Ujhhgtgfeyxiexzf, C1066feyxiexzfUjhhgtg.f4127Ujhhgtgfeyxiexzf, C1064feyxiexzfUjhhgtg.f4122Ujhhgtgfeyxiexzf, C1071feyxiexzfUjhhgtg.f4140Ujhhgtgfeyxiexzf, C1070feyxiexzfUjhhgtg.f4136Ujhhgtgfeyxiexzf, C1059feyxiexzfUjhhgtg.f4112Ujhhgtgfeyxiexzf, C1194feyxiexzfUjhhgtg.f4487Ujhhgtgfeyxiexzf, C1206feyxiexzfUjhhgtg.f4503Ujhhgtgfeyxiexzf, C1237feyxiexzfUjhhgtg.f4570Ujhhgtgfeyxiexzf, C2764feyxiexzfUjhhgtg.f8752Ujhhgtgfeyxiexzf, C2894Ujhhgtgfeyxiexzf.f9170Ujhhgtgfeyxiexzf, C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf, C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf, C1009feyxiexzfUjhhgtg.f3936Ujhhgtgfeyxiexzf, C1042feyxiexzfUjhhgtg.f4059Ujhhgtgfeyxiexzf, C1043feyxiexzfUjhhgtg.f4063Ujhhgtgfeyxiexzf, C2225Ujhhgtgfeyxiexzf.f7235Ujhhgtgfeyxiexzf, C2207Ujhhgtgfeyxiexzf.f7179Ujhhgtgfeyxiexzf, C3597feyxiexzfUjhhgtg.f11194Ujhhgtgfeyxiexzf, C3606feyxiexzfUjhhgtg.f11217Ujhhgtgfeyxiexzf, C0422Ujhhgtgfeyxiexzf.f2261Ujhhgtgfeyxiexzf, C2204Ujhhgtgfeyxiexzf.f7171Ujhhgtgfeyxiexzf, C2898Ujhhgtgfeyxiexzf.f9175Ujhhgtgfeyxiexzf, C1475feyxiexzfUjhhgtg.f5118Ujhhgtgfeyxiexzf, C2429Ujhhgtgfeyxiexzf.f7861Ujhhgtgfeyxiexzf, C3261feyxiexzfUjhhgtg.f10238Ujhhgtgfeyxiexzf, C3186feyxiexzfUjhhgtg.f9839Ujhhgtgfeyxiexzf, C2889feyxiexzfUjhhgtg.f9156Ujhhgtgfeyxiexzf, C2288Ujhhgtgfeyxiexzf.f7499Ujhhgtgfeyxiexzf};
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static float m1880Ujhhgtgfeyxiexzf(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC3381feyxiexzfUjhhgtg.m4883Ujhhgtgfeyxiexzf(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final LayoutInflater m1881Ujhhgtgfeyxiexzf(Context context) {
        LayoutInflater layoutInflater;
        Activity activityM5059Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5059Ujhhgtgfeyxiexzf(context);
        if (activityM5059Ujhhgtgfeyxiexzf != null && (layoutInflater = activityM5059Ujhhgtgfeyxiexzf.getLayoutInflater()) != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (layoutInflaterFrom != null) {
            return layoutInflaterFrom;
        }
        throw new IllegalStateException("Cannot get LayoutInflater from context.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final int m1882Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static ArrayList m1883Ujhhgtgfeyxiexzf(byte[] bArr, C3271feyxiexzfUjhhgtg c3271feyxiexzfUjhhgtg, String str) throws NoSuchMethodException {
        int iM1895Ujhhgtgfeyxiexzf;
        Integer num;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        MagicFactory.get(4928808665349096842L, strArr);
        MagicFactory.get(4928808613809489290L, strArr);
        m1891Ujhhgtgfeyxiexzf(88, bArr);
        int iM1891Ujhhgtgfeyxiexzf = m1891Ujhhgtgfeyxiexzf(92, bArr);
        int iM1891Ujhhgtgfeyxiexzf2 = m1891Ujhhgtgfeyxiexzf(96, bArr);
        int iM1891Ujhhgtgfeyxiexzf3 = m1891Ujhhgtgfeyxiexzf(100, bArr);
        int i = 0;
        loop0: while (true) {
            if (i >= iM1891Ujhhgtgfeyxiexzf2) {
                iM1895Ujhhgtgfeyxiexzf = 0;
                break;
            }
            int i2 = (i * 32) + iM1891Ujhhgtgfeyxiexzf3;
            int iM1891Ujhhgtgfeyxiexzf4 = m1891Ujhhgtgfeyxiexzf(i2, bArr);
            int iM1891Ujhhgtgfeyxiexzf5 = m1891Ujhhgtgfeyxiexzf(i2 + 24, bArr);
            String str2 = c3271feyxiexzfUjhhgtg.f10282Ujhhgtgfeyxiexzf;
            String str3 = c3271feyxiexzfUjhhgtg.f10284Ujhhgtgfeyxiexzf;
            String str4 = c3271feyxiexzfUjhhgtg.f10283Ujhhgtgfeyxiexzf;
            if (str2.equals(m1894Ujhhgtgfeyxiexzf(iM1891Ujhhgtgfeyxiexzf4, bArr))) {
                int[] iArr = {iM1891Ujhhgtgfeyxiexzf5};
                if (iM1891Ujhhgtgfeyxiexzf5 == 0) {
                    continue;
                } else {
                    int iM1895Ujhhgtgfeyxiexzf2 = m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                    int iM1895Ujhhgtgfeyxiexzf3 = m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                    int iM1895Ujhhgtgfeyxiexzf4 = m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                    int iM1895Ujhhgtgfeyxiexzf5 = m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                    for (int i3 = 0; i3 < iM1895Ujhhgtgfeyxiexzf2 + iM1895Ujhhgtgfeyxiexzf3; i3++) {
                        m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                        m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                    }
                    int iM1895Ujhhgtgfeyxiexzf6 = 0;
                    for (int i4 = 0; i4 < iM1895Ujhhgtgfeyxiexzf4; i4++) {
                        iM1895Ujhhgtgfeyxiexzf6 += m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                        m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                        iM1895Ujhhgtgfeyxiexzf = m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                        if (iM1895Ujhhgtgfeyxiexzf != 0) {
                            int i5 = (iM1895Ujhhgtgfeyxiexzf6 * 8) + iM1891Ujhhgtgfeyxiexzf;
                            String strM1893Ujhhgtgfeyxiexzf = m1893Ujhhgtgfeyxiexzf(m1891Ujhhgtgfeyxiexzf(i5 + 4, bArr), bArr);
                            String strM1892Ujhhgtgfeyxiexzf = m1892Ujhhgtgfeyxiexzf(m1890Ujhhgtgfeyxiexzf(i5 + 2, bArr), bArr);
                            if (str4.equals(strM1893Ujhhgtgfeyxiexzf) && str3.equals(strM1892Ujhhgtgfeyxiexzf)) {
                                break loop0;
                            }
                        }
                    }
                    int iM1895Ujhhgtgfeyxiexzf7 = 0;
                    for (int i6 = 0; i6 < iM1895Ujhhgtgfeyxiexzf5; i6++) {
                        iM1895Ujhhgtgfeyxiexzf7 += m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                        m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                        iM1895Ujhhgtgfeyxiexzf = m1895Ujhhgtgfeyxiexzf(bArr, iArr);
                        if (iM1895Ujhhgtgfeyxiexzf != 0) {
                            int i7 = (iM1895Ujhhgtgfeyxiexzf7 * 8) + iM1891Ujhhgtgfeyxiexzf;
                            String strM1893Ujhhgtgfeyxiexzf2 = m1893Ujhhgtgfeyxiexzf(m1891Ujhhgtgfeyxiexzf(i7 + 4, bArr), bArr);
                            String strM1892Ujhhgtgfeyxiexzf2 = m1892Ujhhgtgfeyxiexzf(m1890Ujhhgtgfeyxiexzf(i7 + 2, bArr), bArr);
                            if (str4.equals(strM1893Ujhhgtgfeyxiexzf2) && str3.equals(strM1892Ujhhgtgfeyxiexzf2)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
            i++;
        }
        if (iM1895Ujhhgtgfeyxiexzf == 0) {
            throw new NoSuchMethodException(c3271feyxiexzfUjhhgtg.toString());
        }
        int iM1890Ujhhgtgfeyxiexzf = m1890Ujhhgtgfeyxiexzf(iM1895Ujhhgtgfeyxiexzf, bArr);
        m1890Ujhhgtgfeyxiexzf(iM1895Ujhhgtgfeyxiexzf + 2, bArr);
        m1890Ujhhgtgfeyxiexzf(iM1895Ujhhgtgfeyxiexzf + 4, bArr);
        m1890Ujhhgtgfeyxiexzf(iM1895Ujhhgtgfeyxiexzf + 6, bArr);
        int iM1890Ujhhgtgfeyxiexzf2 = m1890Ujhhgtgfeyxiexzf(iM1895Ujhhgtgfeyxiexzf + 12, bArr);
        int i8 = iM1895Ujhhgtgfeyxiexzf + 16;
        Integer[] numArr = new Integer[iM1890Ujhhgtgfeyxiexzf];
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < iM1890Ujhhgtgfeyxiexzf2) {
            int i10 = (i9 * 2) + i8;
            int i11 = bArr[i10] & 255;
            byte b = f2646Ujhhgtgfeyxiexzf[i11];
            if (b == 0) {
                throw new RuntimeException(String.format(Locale.ROOT, MagicFactory.get(4928808686823933322L, strArr), Integer.valueOf(i11)));
            }
            if (i11 == 20) {
                numArr[bArr[i10 + 1] & 255] = Integer.valueOf(((m1890Ujhhgtgfeyxiexzf(i10 + 4, bArr) << 16) & (-65536)) | m1890Ujhhgtgfeyxiexzf(i10 + 2, bArr));
            } else {
                if (i11 == 110) {
                    int iM1890Ujhhgtgfeyxiexzf3 = (m1890Ujhhgtgfeyxiexzf(i10 + 2, bArr) * 8) + m1891Ujhhgtgfeyxiexzf(92, bArr);
                    String strM1894Ujhhgtgfeyxiexzf = m1894Ujhhgtgfeyxiexzf(m1890Ujhhgtgfeyxiexzf(iM1890Ujhhgtgfeyxiexzf3, bArr), bArr);
                    String strM1892Ujhhgtgfeyxiexzf3 = m1892Ujhhgtgfeyxiexzf(m1890Ujhhgtgfeyxiexzf(iM1890Ujhhgtgfeyxiexzf3 + 2, bArr), bArr);
                    String strM1893Ujhhgtgfeyxiexzf3 = m1893Ujhhgtgfeyxiexzf(m1891Ujhhgtgfeyxiexzf(iM1890Ujhhgtgfeyxiexzf3 + 4, bArr), bArr);
                    strM1892Ujhhgtgfeyxiexzf3.getClass();
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM1894Ujhhgtgfeyxiexzf);
                    sbM2707Ujhhgtgfeyxiexzf.append(MagicFactory.get(4928807217945118090L, strArr));
                    sbM2707Ujhhgtgfeyxiexzf.append(strM1893Ujhhgtgfeyxiexzf3);
                    sbM2707Ujhhgtgfeyxiexzf.append(strM1892Ujhhgtgfeyxiexzf3);
                    if (sbM2707Ujhhgtgfeyxiexzf.toString().equals(str) && (num = numArr[(m1890Ujhhgtgfeyxiexzf(i10 + 4, bArr) >> 4) & 15]) != null) {
                        arrayList.add(num);
                    }
                }
                i9 += b;
            }
            i9 += b;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final void m1884Ujhhgtgfeyxiexzf(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Throwable th) {
        if (th instanceof C3198feyxiexzfUjhhgtg) {
            th = ((C3198feyxiexzfUjhhgtg) th).f9884Ujhhgtgfeyxiexzf;
        }
        try {
            InterfaceC3741feyxiexzfUjhhgtg interfaceC3741feyxiexzfUjhhgtg = (InterfaceC3741feyxiexzfUjhhgtg) interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf);
            if (interfaceC3741feyxiexzfUjhhgtg != null) {
                interfaceC3741feyxiexzfUjhhgtg.mo4503Ujhhgtgfeyxiexzf(th);
            } else {
                AbstractC3590Ujhhgtgfeyxiexzf.m5132Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1791feyxiexzfUjhhgtg.m3129Ujhhgtgfeyxiexzf(runtimeException, th);
                th = runtimeException;
            }
            AbstractC3590Ujhhgtgfeyxiexzf.m5132Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, th);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m1885Ujhhgtgfeyxiexzf(C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf, AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf) {
        Method method;
        if (c0393Ujhhgtgfeyxiexzf == null || (method = c0393Ujhhgtgfeyxiexzf.f2132Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        m1886Ujhhgtgfeyxiexzf(method, abstractC0699Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static C2276Ujhhgtgfeyxiexzf m1886Ujhhgtgfeyxiexzf(Member member, AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf) {
        Object c0919feyxiexzfUjhhgtg;
        boolean zBooleanValue;
        Object c0919feyxiexzfUjhhgtg2;
        int i;
        int[] iArr = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf;
        C2278Ujhhgtgfeyxiexzf c2278Ujhhgtgfeyxiexzf = null;
        if (member != null) {
            boolean zBooleanValue2 = false;
            int i2 = iArr[0];
            if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c0919feyxiexzfUjhhgtg = Boolean.TRUE;
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                boolean z = c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg;
                Object obj = c0919feyxiexzfUjhhgtg;
                if (z) {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                i2 = 2;
            }
            int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2);
            if (iM2713feyxiexzfUjhhgtg != 0) {
                if (iM2713feyxiexzfUjhhgtg != 1) {
                    throw new C2870Ujhhgtgfeyxiexzf();
                }
                throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
            }
            int i3 = iArr[0];
            if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i3)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c0919feyxiexzfUjhhgtg2 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                Boolean bool2 = (Boolean) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
            }
            if (!zBooleanValue2) {
                i3 = 2;
            }
            int iM2713feyxiexzfUjhhgtg2 = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i3);
            if (iM2713feyxiexzfUjhhgtg2 != 0) {
                if (iM2713feyxiexzfUjhhgtg2 != 1) {
                    throw new C2870Ujhhgtgfeyxiexzf();
                }
                throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
            }
            int iM2713feyxiexzfUjhhgtg3 = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(abstractC0699Ujhhgtgfeyxiexzf.mo1993Ujhhgtgfeyxiexzf());
            if (iM2713feyxiexzfUjhhgtg3 == 0) {
                i = 50;
            } else if (iM2713feyxiexzfUjhhgtg3 == 1) {
                i = -10000;
            } else {
                if (iM2713feyxiexzfUjhhgtg3 != 2) {
                    throw new C2870Ujhhgtgfeyxiexzf();
                }
                i = 10000;
            }
            XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(member, new C1417feyxiexzfUjhhgtg(abstractC0699Ujhhgtgfeyxiexzf, i));
            c2278Ujhhgtgfeyxiexzf = new C2278Ujhhgtgfeyxiexzf(new C0574Ujhhgtgfeyxiexzf(unhookHookMethod, 0), new C0574Ujhhgtgfeyxiexzf(unhookHookMethod, 1));
        }
        return new C2276Ujhhgtgfeyxiexzf(c2278Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m1887Ujhhgtgfeyxiexzf(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static float m1888Ujhhgtgfeyxiexzf(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC3381feyxiexzfUjhhgtg.m4884Ujhhgtgfeyxiexzf(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final void m1889Ujhhgtgfeyxiexzf(Object obj, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        ((Handler) AbstractC3602Ujhhgtgfeyxiexzf.f11213Ujhhgtgfeyxiexzf.getValue()).post(new RunnableC0523Ujhhgtgfeyxiexzf(interfaceC3549feyxiexzfUjhhgtg, obj, 1));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static int m1890Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        return ((bArr[i + 1] << 8) & 65280) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m1891Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        return ((bArr[i + 3] << 24) & (-16777216)) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static String m1892Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        int iM1891Ujhhgtgfeyxiexzf = (i * 12) + m1891Ujhhgtgfeyxiexzf(76, bArr);
        int iM1891Ujhhgtgfeyxiexzf2 = m1891Ujhhgtgfeyxiexzf(iM1891Ujhhgtgfeyxiexzf + 4, bArr);
        int iM1891Ujhhgtgfeyxiexzf3 = m1891Ujhhgtgfeyxiexzf(iM1891Ujhhgtgfeyxiexzf + 8, bArr);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder(MagicFactory.get(4928807711866357130L, strArr));
        if (iM1891Ujhhgtgfeyxiexzf3 != 0) {
            int iM1891Ujhhgtgfeyxiexzf4 = m1891Ujhhgtgfeyxiexzf(iM1891Ujhhgtgfeyxiexzf3, bArr);
            for (int i2 = 0; i2 < iM1891Ujhhgtgfeyxiexzf4; i2++) {
                sb.append(m1894Ujhhgtgfeyxiexzf(m1890Ujhhgtgfeyxiexzf((i2 * 2) + iM1891Ujhhgtgfeyxiexzf3 + 4, bArr), bArr));
            }
        }
        sb.append(MagicFactory.get(4928807840715376010L, strArr));
        sb.append(m1894Ujhhgtgfeyxiexzf(iM1891Ujhhgtgfeyxiexzf2, bArr));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m1893Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        int[] iArr = {m1891Ujhhgtgfeyxiexzf((i * 4) + m1891Ujhhgtgfeyxiexzf(60, bArr), bArr)};
        return new String(bArr, iArr[0], m1895Ujhhgtgfeyxiexzf(bArr, iArr));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static String m1894Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        return m1893Ujhhgtgfeyxiexzf(m1891Ujhhgtgfeyxiexzf((i * 4) + m1891Ujhhgtgfeyxiexzf(68, bArr), bArr), bArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static int m1895Ujhhgtgfeyxiexzf(byte[] bArr, int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[0];
            byte b = bArr[i3];
            i |= (b & JSONB.Constants.BC_SYMBOL) << (i2 * 7);
            i2++;
            iArr[0] = i3 + 1;
            if ((b & 128) != 128) {
                break;
            }
        } while (i2 < 5);
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final long m1896Ujhhgtgfeyxiexzf(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC2075feyxiexzfUjhhgtg.f6819Ujhhgtgfeyxiexzf;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM2674feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2674feyxiexzfUjhhgtg(property);
        if (lM2674feyxiexzfUjhhgtg == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM2674feyxiexzfUjhhgtg.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m1897Ujhhgtgfeyxiexzf(int i, int i2, String str) {
        return (int) m1896Ujhhgtgfeyxiexzf(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0182 A[Catch: all -> 0x017f, TRY_ENTER, TryCatch #18 {all -> 0x017f, blocks: (B:88:0x015e, B:90:0x016a, B:101:0x0182, B:102:0x0187), top: B:269:0x015e }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0193 A[Catch: IllegalStateException -> 0x0179, IOException -> 0x017b, FileNotFoundException -> 0x017d, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x017d, IOException -> 0x017b, IllegalStateException -> 0x0179, blocks: (B:86:0x0156, B:91:0x0174, B:109:0x0193, B:107:0x0190, B:106:0x018d), top: B:293:0x0156 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc A[Catch: all -> 0x01da, TRY_LEAVE, TryCatch #34 {all -> 0x01da, blocks: (B:124:0x01c0, B:126:0x01cc, B:135:0x01dd), top: B:283:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01dd A[Catch: all -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #34 {all -> 0x01da, blocks: (B:124:0x01c0, B:126:0x01cc, B:135:0x01dd), top: B:283:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:150:0x0204  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:160:0x0228 A[Catch: all -> 0x0266, TryCatch #6 {all -> 0x0266, blocks: (B:158:0x0222, B:160:0x0228, B:161:0x022c, B:163:0x0232), top: B:253:0x0222 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0232 A[Catch: all -> 0x0266, TRY_LEAVE, TryCatch #6 {all -> 0x0266, blocks: (B:158:0x0222, B:160:0x0228, B:161:0x022c, B:163:0x0232), top: B:253:0x0222 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:233:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:240:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:253:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0237 A[EDGE_INSN: B:294:0x0237->B:165:0x0237 BREAK  A[LOOP:0: B:161:0x022c->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_LEAVE, TryCatch #14 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:265:0x0105, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0129 A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_ENTER, TryCatch #14 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:265:0x0105, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x016a A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #18 {all -> 0x017f, blocks: (B:88:0x015e, B:90:0x016a, B:101:0x0182, B:102:0x0187), top: B:269:0x015e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m1898Ujhhgtgfeyxiexzf(Context context, Executor executor, InterfaceC0850feyxiexzfUjhhgtg interfaceC0850feyxiexzfUjhhgtg, boolean z) {
        boolean z2;
        ?? M4771Ujhhgtgfeyxiexzf;
        C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArrM1341feyxiexzfUjhhgtg;
        C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr;
        InterfaceC0850feyxiexzfUjhhgtg interfaceC0850feyxiexzfUjhhgtg2;
        C3272feyxiexzfUjhhgtg[] c3272feyxiexzfUjhhgtgArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i;
        ?? r9;
        boolean z4;
        boolean z5;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        C3263feyxiexzfUjhhgtg c3263feyxiexzfUjhhgtg;
        ?? r11;
        String str;
        FileInputStream fileInputStreamM4771Ujhhgtgfeyxiexzf;
        ?? r12;
        ?? r13;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j == packageInfo.lastUpdateTime;
                            if (z6) {
                                interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    AbstractC0846feyxiexzfUjhhgtg.m2255Ujhhgtgfeyxiexzf(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = AbstractC0217Ujhhgtgfeyxiexzf.f1491Ujhhgtgfeyxiexzf;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C3263feyxiexzfUjhhgtg c3263feyxiexzfUjhhgtg2 = new C3263feyxiexzfUjhhgtg(assets, executor, interfaceC0850feyxiexzfUjhhgtg, name, file2);
            byte[] bArr5 = c3263feyxiexzfUjhhgtg2.f10247Ujhhgtgfeyxiexzf;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            c3263feyxiexzfUjhhgtg2.f10250Ujhhgtgfeyxiexzf = true;
                            M4771Ujhhgtgfeyxiexzf = c3263feyxiexzfUjhhgtg2.m4771Ujhhgtgfeyxiexzf(assets, "dexopt/baseline.prof");
                            if (M4771Ujhhgtgfeyxiexzf != 0) {
                                if (Arrays.equals(bArr4, AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(M4771Ujhhgtgfeyxiexzf, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c3272feyxiexzfUjhhgtgArrM1341feyxiexzfUjhhgtg = AbstractC0217Ujhhgtgfeyxiexzf.m1341feyxiexzfUjhhgtg(M4771Ujhhgtgfeyxiexzf, AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(M4771Ujhhgtgfeyxiexzf, 4), c3263feyxiexzfUjhhgtg2.f10249Ujhhgtgfeyxiexzf);
                                M4771Ujhhgtgfeyxiexzf.close();
                                c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = c3272feyxiexzfUjhhgtgArrM1341feyxiexzfUjhhgtg;
                            }
                            c3272feyxiexzfUjhhgtgArr = c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf;
                            if (c3272feyxiexzfUjhhgtgArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM4771Ujhhgtgfeyxiexzf = c3263feyxiexzfUjhhgtg2.m4771Ujhhgtgfeyxiexzf(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamM4771Ujhhgtgfeyxiexzf == null) {
                                    if (fileInputStreamM4771Ujhhgtgfeyxiexzf != null) {
                                        fileInputStreamM4771Ujhhgtgfeyxiexzf.close();
                                        r11 = str;
                                    }
                                    c3263feyxiexzfUjhhgtg = null;
                                    M4771Ujhhgtgfeyxiexzf = r11;
                                } else {
                                    if (Arrays.equals(AbstractC0217Ujhhgtgfeyxiexzf.f1492Ujhhgtgfeyxiexzf, AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(fileInputStreamM4771Ujhhgtgfeyxiexzf, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM2754Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(fileInputStreamM4771Ujhhgtgfeyxiexzf, 4);
                                    c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1338feyxiexzfUjhhgtg(fileInputStreamM4771Ujhhgtgfeyxiexzf, bArrM2754Ujhhgtgfeyxiexzf, bArr5, c3272feyxiexzfUjhhgtgArr);
                                    fileInputStreamM4771Ujhhgtgfeyxiexzf.close();
                                    c3263feyxiexzfUjhhgtg = c3263feyxiexzfUjhhgtg2;
                                    M4771Ujhhgtgfeyxiexzf = bArrM2754Ujhhgtgfeyxiexzf;
                                }
                                if (c3263feyxiexzfUjhhgtg != null) {
                                    c3263feyxiexzfUjhhgtg2 = c3263feyxiexzfUjhhgtg;
                                }
                            }
                            interfaceC0850feyxiexzfUjhhgtg2 = c3263feyxiexzfUjhhgtg2.f10246Ujhhgtgfeyxiexzf;
                            c3272feyxiexzfUjhhgtgArr2 = c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf;
                            bArr = c3263feyxiexzfUjhhgtg2.f10247Ujhhgtgfeyxiexzf;
                            r7 = M4771Ujhhgtgfeyxiexzf;
                            r7 = M4771Ujhhgtgfeyxiexzf;
                            if (c3272feyxiexzfUjhhgtgArr2 != null) {
                                z5 = c3263feyxiexzfUjhhgtg2.f10250Ujhhgtgfeyxiexzf;
                                if (z5) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (AbstractC0217Ujhhgtgfeyxiexzf.m1348feyxiexzfUjhhgtg(byteArrayOutputStream, bArr, c3272feyxiexzfUjhhgtgArr2)) {
                                    c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                    r7 = r10;
                                } else {
                                    interfaceC0850feyxiexzfUjhhgtg2.mo1738Ujhhgtgfeyxiexzf(5, null);
                                    c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf;
                            if (bArr2 != null) {
                                if (c3263feyxiexzfUjhhgtg2.f10250Ujhhgtgfeyxiexzf) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream(c3263feyxiexzfUjhhgtg2.f10248Ujhhgtgfeyxiexzf);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr3);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i);
                                        }
                                        r9 = 1;
                                        c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = null;
                                        c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                m1887Ujhhgtgfeyxiexzf(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(4, null);
                    }
                } else if (file2.canWrite()) {
                    c3263feyxiexzfUjhhgtg2.f10250Ujhhgtgfeyxiexzf = true;
                    try {
                        M4771Ujhhgtgfeyxiexzf = c3263feyxiexzfUjhhgtg2.m4771Ujhhgtgfeyxiexzf(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(6, e);
                        M4771Ujhhgtgfeyxiexzf = 0;
                    } catch (IOException e2) {
                        interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(7, e2);
                        M4771Ujhhgtgfeyxiexzf = 0;
                    }
                    try {
                        if (M4771Ujhhgtgfeyxiexzf != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr4, AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(M4771Ujhhgtgfeyxiexzf, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c3272feyxiexzfUjhhgtgArrM1341feyxiexzfUjhhgtg = AbstractC0217Ujhhgtgfeyxiexzf.m1341feyxiexzfUjhhgtg(M4771Ujhhgtgfeyxiexzf, AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(M4771Ujhhgtgfeyxiexzf, 4), c3263feyxiexzfUjhhgtg2.f10249Ujhhgtgfeyxiexzf);
                                    try {
                                        M4771Ujhhgtgfeyxiexzf.close();
                                    } catch (IOException e3) {
                                        interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(7, e3);
                                    }
                                    c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = c3272feyxiexzfUjhhgtgArrM1341feyxiexzfUjhhgtg;
                                } catch (IllegalStateException e4) {
                                    interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(8, e4);
                                    try {
                                        M4771Ujhhgtgfeyxiexzf.close();
                                    } catch (IOException e5) {
                                        interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(7, e5);
                                    }
                                    c3272feyxiexzfUjhhgtgArrM1341feyxiexzfUjhhgtg = null;
                                }
                            } catch (IOException e6) {
                                interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(7, e6);
                                M4771Ujhhgtgfeyxiexzf.close();
                                c3272feyxiexzfUjhhgtgArrM1341feyxiexzfUjhhgtg = null;
                            }
                        }
                        c3272feyxiexzfUjhhgtgArr = c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf;
                        if (c3272feyxiexzfUjhhgtgArr != null && (M4771Ujhhgtgfeyxiexzf = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM4771Ujhhgtgfeyxiexzf = c3263feyxiexzfUjhhgtg2.m4771Ujhhgtgfeyxiexzf(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamM4771Ujhhgtgfeyxiexzf == null) {
                                    try {
                                        if (Arrays.equals(AbstractC0217Ujhhgtgfeyxiexzf.f1492Ujhhgtgfeyxiexzf, AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(fileInputStreamM4771Ujhhgtgfeyxiexzf, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrM2754Ujhhgtgfeyxiexzf2 = AbstractC1245feyxiexzfUjhhgtg.m2754Ujhhgtgfeyxiexzf(fileInputStreamM4771Ujhhgtgfeyxiexzf, 4);
                                        c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1338feyxiexzfUjhhgtg(fileInputStreamM4771Ujhhgtgfeyxiexzf, bArrM2754Ujhhgtgfeyxiexzf2, bArr5, c3272feyxiexzfUjhhgtgArr);
                                        fileInputStreamM4771Ujhhgtgfeyxiexzf.close();
                                        c3263feyxiexzfUjhhgtg = c3263feyxiexzfUjhhgtg2;
                                        M4771Ujhhgtgfeyxiexzf = bArrM2754Ujhhgtgfeyxiexzf2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamM4771Ujhhgtgfeyxiexzf.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM4771Ujhhgtgfeyxiexzf != null) {
                                        fileInputStreamM4771Ujhhgtgfeyxiexzf.close();
                                        r11 = str;
                                    }
                                    c3263feyxiexzfUjhhgtg = null;
                                    M4771Ujhhgtgfeyxiexzf = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(9, e7);
                                r11 = M4771Ujhhgtgfeyxiexzf;
                            } catch (IOException e8) {
                                interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(7, e8);
                                r11 = M4771Ujhhgtgfeyxiexzf;
                            } catch (IllegalStateException e9) {
                                c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(8, e9);
                                r11 = M4771Ujhhgtgfeyxiexzf;
                            }
                            if (c3263feyxiexzfUjhhgtg != null) {
                                c3263feyxiexzfUjhhgtg2 = c3263feyxiexzfUjhhgtg;
                            }
                        }
                        interfaceC0850feyxiexzfUjhhgtg2 = c3263feyxiexzfUjhhgtg2.f10246Ujhhgtgfeyxiexzf;
                        c3272feyxiexzfUjhhgtgArr2 = c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf;
                        bArr = c3263feyxiexzfUjhhgtg2.f10247Ujhhgtgfeyxiexzf;
                        r7 = M4771Ujhhgtgfeyxiexzf;
                        r7 = M4771Ujhhgtgfeyxiexzf;
                        if (c3272feyxiexzfUjhhgtgArr2 != null && bArr != null) {
                            z5 = c3263feyxiexzfUjhhgtg2.f10250Ujhhgtgfeyxiexzf;
                            if (z5) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (AbstractC0217Ujhhgtgfeyxiexzf.m1348feyxiexzfUjhhgtg(byteArrayOutputStream, bArr, c3272feyxiexzfUjhhgtgArr2)) {
                                        interfaceC0850feyxiexzfUjhhgtg2.mo1738Ujhhgtgfeyxiexzf(5, null);
                                        c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                interfaceC0850feyxiexzfUjhhgtg2.mo1738Ujhhgtgfeyxiexzf(7, e10);
                                r10 = z5;
                            } catch (IllegalStateException e11) {
                                interfaceC0850feyxiexzfUjhhgtg2.mo1738Ujhhgtgfeyxiexzf(8, e11);
                                r10 = z5;
                            }
                        }
                        bArr2 = c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf;
                        if (bArr2 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (c3263feyxiexzfUjhhgtg2.f10250Ujhhgtgfeyxiexzf) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(c3263feyxiexzfUjhhgtg2.f10248Ujhhgtgfeyxiexzf);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr3);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = null;
                                                                                c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                Throwable th14 = th;
                                                                if (channel == null) {
                                                                    throw th14;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th14;
                                                                } catch (Throwable th15) {
                                                                    th14.addSuppressed(th15);
                                                                    throw th14;
                                                                }
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        r7 = 1;
                                        c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(6, e);
                                        r8 = r7;
                                        c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = null;
                                        c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        r7 = 1;
                                        c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(7, e);
                                        r8 = r7;
                                        c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = null;
                                        c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(6, e);
                                    r8 = r7;
                                    c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = null;
                                    c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(7, e);
                                    r8 = r7;
                                    c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = null;
                                    c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                c3263feyxiexzfUjhhgtg2.f10252Ujhhgtgfeyxiexzf = null;
                                c3263feyxiexzfUjhhgtg2.f10251Ujhhgtgfeyxiexzf = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            m1887Ujhhgtgfeyxiexzf(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            M4771Ujhhgtgfeyxiexzf.close();
                            throw th24;
                        } catch (IOException e16) {
                            interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                AbstractC0846feyxiexzfUjhhgtg.m2255Ujhhgtgfeyxiexzf(context, r13);
            }
            c3263feyxiexzfUjhhgtg2.m4772Ujhhgtgfeyxiexzf(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            AbstractC0846feyxiexzfUjhhgtg.m2255Ujhhgtgfeyxiexzf(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC0850feyxiexzfUjhhgtg.mo1738Ujhhgtgfeyxiexzf(7, e17);
            AbstractC0846feyxiexzfUjhhgtg.m2255Ujhhgtgfeyxiexzf(context, false);
        }
    }
}
