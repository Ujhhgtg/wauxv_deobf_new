package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.EdgeEffect;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0968 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0502 f3511 = new C0502();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2416 f3512 = new C2416("image-destination");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2416 f3513 = new C2416("image-replacement-text-is-link");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2416 f3514 = new C2416("image-size");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Object f3515 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C0542 f3516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m2469(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m2470(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Bitmap m2471(InputStream inputStream, BitmapFactory.Options options, C0243 c0243) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34) {
            if (((true && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC3681.f11561.get()).booleanValue() : false) && m2476(c0243)) {
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                AbstractC1460.m3208("", config == Bitmap.Config.HARDWARE);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    if (bitmapDecodeStream == null) {
                        if (false) {
                            bitmapDecodeStream.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        return null;
                    }
                    try {
                        Bitmap bitmapM2485 = m2485(bitmapDecodeStream);
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        return bitmapM2485;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapDecodeStream;
                        if (true) {
                            bitmap.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static float m2472(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1132.m2702(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final String m2473(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Integer m2474(Object obj, String str) {
        String str2 = "id";
        if (obj instanceof View) {
            Resources resources = ((View) obj).getResources();
            
            return Integer.valueOf(resources.getIdentifier(str, "id", C1565.m3277()));
        }
        if (!(obj instanceof Context)) {
            return null;
        }
        Resources resources2 = ((Context) obj).getResources();
        
        return Integer.valueOf(resources2.getIdentifier(str, "id", C1565.m3277()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final int m2475(String str) {
        
        return m2474(C1565.m3276(), str).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static boolean m2476(C0243 c0243) throws Throwable {
        try {
            boolean zM1325 = c0243.m1325();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM1325;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM1325);
            return zM1325;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static boolean m2477(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static float m2478(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1132.m2703(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static void m2479(SharedPreferencesC1269 sharedPreferencesC1269, C0221 c0221, C0403 c0403, byte b, String str, int i) {
        HashMap map = sharedPreferencesC1269.f4614;
        if (b == 1) {
            byte[] bArr = (byte[]) c0221.f1353;
            int i2 = c0221.f1351;
            c0221.f1351 = i2 + 1;
            map.put(str, new C0825(i, bArr[i2] == 1));
            return;
        }
        if (b == 2) {
            int iM1263 = c0221.m1263();
            if (c0403 != null) {
                iM1263 ^= c0403.f1901;
            }
            map.put(str, new C0828(i, iM1263));
            return;
        }
        if (b == 3) {
            int iM1264 = c0221.m1263();
            if (c0403 != null) {
                iM1264 ^= c0403.f1901;
            }
            map.put(str, new C0827(i, Float.intBitsToFloat(iM1264)));
            return;
        }
        if (b != 4) {
            long jM1265 = c0221.m1265(c0221.f1351);
            c0221.f1351 += 8;
            if (c0403 != null) {
                jM1265 ^= (long) c0403.f1901;
            }
            map.put(str, new C0826(i, Double.longBitsToDouble(jM1265)));
            return;
        }
        long jM1266 = c0221.m1265(c0221.f1351);
        c0221.f1351 += 8;
        if (c0403 != null) {
            jM1266 ^= (long) c0403.f1901;
        }
        map.put(str, new C0829(i, jM1266));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m2480(SharedPreferencesC1269 sharedPreferencesC1269, C0221 c0221, C0403 c0403, byte b, String str, int i, int i2, byte b2) throws Exception {
        Object objM1592;
        int length;
        C0221 c0222;
        byte b3 = b;
        HashMap map = sharedPreferencesC1269.f4614;
        boolean z = b3 == 9 || b3 == 10 || b3 == 11;
        int iM1263 = z ? c0221.m1263() : c0221.m1266() & 65535;
        int i3 = z ? 4 : 2;
        boolean z2 = (b2 & 64) != 0;
        if (z2 && iM1263 != 32) {
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
            map.put(str, new C0831(i2, i + i3, z2 ? c0221.m1267(32) : c0221.m1268(c0403, iM1263), iM1263, z2));
            return;
        }
        if (b3 == 7) {
            if (z2) {
                objM1592 = c0221.m1267(32);
            } else {
                
                byte[] bArr = new byte[iM1263];
                System.arraycopy((byte[]) c0221.f1353, c0221.f1351, bArr, 0, iM1263);
                c0221.f1351 += iM1263;
                objM1592 = c0403 != null ? c0403.m1592(bArr) : bArr;
            }
            map.put(str, new C0823(i2, i + i3, objM1592, iM1263, z2));
            return;
        }
        if (z2) {
            map.put(str, new C0830(i2, i + i3, c0221.m1267(32), 32, true));
            return;
        }
        if (c0403 == null) {
            c0222 = sharedPreferencesC1269.f4616;
            length = iM1263;
        } else {
            byte[] bArr2 = new byte[iM1263];
            C0221 c0223 = sharedPreferencesC1269.f4616;
            System.arraycopy((byte[]) c0223.f1353, c0223.f1351, bArr2, 0, iM1263);
            byte[] bArrM1592 = c0403.m1592(bArr2);
            C0221 c0224 = new C0221(0, bArrM1592);
            length = bArrM1592.length;
            c0222 = c0224;
        }
        byte[] bArr3 = (byte[]) c0222.f1353;
        int i4 = c0222.f1351;
        c0222.f1351 = i4 + 1;
        int i5 = bArr3[i4] & 255;
        String strM1267 = c0222.m1267(i5);
        C2840 c2840 = (C2840) sharedPreferencesC1269.f4610.get(strM1267);
        int i6 = length - (i5 + 1);
        if (i6 < 0) {
            throw new Exception("parse dara failed");
        }
        if (c2840 != null) {
            try {
                C0830 c0830 = new C0830(i2, i + 2, c2840.m4826(c0222.f1351, i6, (byte[]) c0222.f1353), iM1263, false);
                c0830.f3225 = c2840;
                map.put(str, c0830);
            } catch (Exception e) {
                Log.e("FastKV", sharedPreferencesC1269.f4609, e);
            }
        } else {
            AbstractC2202.m4003(sharedPreferencesC1269, "object with tag: " + strM1267 + " without encoder");
        }
        c0221.f1351 = i + i3 + iM1263;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static boolean m2481(SharedPreferencesC1269 sharedPreferencesC1269, boolean z) {
        int iM1263;
        SharedPreferencesC1269 sharedPreferencesC12610 = sharedPreferencesC1269;
        C0403 c0403 = sharedPreferencesC12610.f4611;
        boolean z2 = false;
        if (z && c0403 == null) {
            AbstractC2202.m4003(sharedPreferencesC12610, "miss cipher");
            return false;
        }
        C0403 c0404 = z ? c0403 : null;
        C0221 c0221 = sharedPreferencesC12610.f4616;
        String str = sharedPreferencesC12610.f4609;
        c0221.f1351 = 12;
        while (true) {
            try {
                int i = c0221.f1351;
                int i2 = sharedPreferencesC12610.f4612;
                boolean z3 = true;
                if (i >= i2) {
                    if (i != i2) {
                        Log.e("FastKV", str, new Exception("parse dara failed"));
                        return false;
                    }
                    if (!z && c0403 != null && i2 != 12) {
                        z2 = true;
                    }
                    sharedPreferencesC12610.f4620 = z2;
                    return true;
                }
                byte[] bArr = (byte[]) c0221.f1353;
                int i3 = i + 1;
                c0221.f1351 = i3;
                byte b = bArr[i];
                byte b2 = (byte) (b & 63);
                if (b2 < 1 || b2 > 11) {
                    throw new Exception("parse dara failed");
                }
                int i4 = i + 2;
                c0221.f1351 = i4;
                int i5 = bArr[i3] & 255;
                if (i5 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b < 0) {
                    c0221.f1351 = i4 + i5;
                    if (b2 <= 5) {
                        iM1263 = SharedPreferencesC1269.f4606[b2];
                    } else {
                        if (b2 != 9 && b2 != 10 && b2 != 11) {
                            z3 = false;
                        }
                        iM1263 = z3 ? c0221.m1263() : c0221.m1266() & 65535;
                    }
                    int i6 = c0221.f1351 + iM1263;
                    c0221.f1351 = i6;
                    sharedPreferencesC12610.f4622 = (i6 - i) + sharedPreferencesC12610.f4622;
                    ArrayList arrayList = sharedPreferencesC12610.f4623;
                    C2647 c2647 = new C2647();
                    c2647.f8546 = i;
                    c2647.f8547 = i6;
                    arrayList.add(c2647);
                } else {
                    String strM1268 = c0221.m1268(c0404, i5);
                    int i7 = c0221.f1351;
                    if (b2 <= 5) {
                        m2479(sharedPreferencesC12610, c0221, c0404, b2, strM1268, i7);
                        sharedPreferencesC12610 = sharedPreferencesC1269;
                    } else {
                        m2480(sharedPreferencesC12610, c0221, c0404, b2, strM1268, i7, i, b);
                    }
                }
            } catch (Exception e) {
                Log.e("FastKV", str, e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C1744 m2482(InterfaceC1736 interfaceC1736) {
        return new C1744(C1227.m2859(15, ((InterfaceC0696) interfaceC1736).mo2114(), null));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C1744 startMethodResolution(Class cls) {
        return new C1744(C1227.m2859(15, cls, null));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static C1744 startMethodResolution_(Object obj) {
        if (obj instanceof InterfaceC1736) {
            return new C1744(C1227.m2859(14, ((InterfaceC0696) ((InterfaceC1736) obj)).mo2114(), obj));
        }
        return obj instanceof Class ? new C1744(C1227.m2859(14, (Class) obj, obj)) : new C1744(C1227.m2859(14, obj.getClass(), obj));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static Bitmap m2485(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == Bitmap.Config.ALPHA_8) {
                ColorMatrixColorFilter colorMatrixColorFilter = AbstractC1457.f5180;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                    AbstractC1460.m3208("", gainmapContents.getConfig() == Bitmap.Config.ALPHA_8);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(AbstractC1457.f5180);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM1704 = AbstractC0475.m1704(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM1704.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM1704.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM1704.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM1704.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM1704.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM1704.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM1704.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM1704;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final C0155 m2486(AbstractC0878 abstractC0878, InterfaceC1429 interfaceC1429) {
        C0155 c0155 = new C0155(EnumC1769.ON_DESTROY, abstractC0878);
        AbstractC2203.m4035(c0155, C1187.f4327, new C0153(interfaceC1429, null)).m3457(new C3592(c0155));
        return c0155;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m2487(InterfaceC1429 interfaceC1429) {
        C1002 c1002 = AbstractC1075.f3893;
        C2144 c2144 = new C2144(EnumC1769.ON_DESTROY, AbstractC1881.f6228);
        AbstractC2203.m4035(c2144, C1187.f4327, new C2142(c2144, interfaceC1429, (InterfaceC0842) null)).m3457(new C2143(c2144));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static String m2488(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final String m2489(InterfaceC0842 interfaceC0842) {
        Object c2585;
        if (interfaceC0842 instanceof C1072) {
            return ((C1072) interfaceC0842).toString();
        }
        try {
            c2585 = interfaceC0842 + '@' + m2473(interfaceC0842);
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (C2586.m4594(c2585) != null) {
            c2585 = interfaceC0842.getClass().getName() + '@' + m2473(interfaceC0842);
        }
        return (String) c2585;
    }
}
