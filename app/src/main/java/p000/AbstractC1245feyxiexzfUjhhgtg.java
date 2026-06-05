package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.widget.Toast;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1245feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final ExecutorC3361Ujhhgtgfeyxiexzf f4585Ujhhgtgfeyxiexzf = new ExecutorC3361Ujhhgtgfeyxiexzf(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final ExecutorC3361Ujhhgtgfeyxiexzf f4586Ujhhgtgfeyxiexzf = new ExecutorC3361Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f4587Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0221Ujhhgtgfeyxiexzf f4588Ujhhgtgfeyxiexzf = new C0221Ujhhgtgfeyxiexzf(21);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C0221Ujhhgtgfeyxiexzf f4589Ujhhgtgfeyxiexzf = new C0221Ujhhgtgfeyxiexzf(22);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final C0221Ujhhgtgfeyxiexzf f4590Ujhhgtgfeyxiexzf = new C0221Ujhhgtgfeyxiexzf(23);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0094Ujhhgtgfeyxiexzf m2746Ujhhgtgfeyxiexzf(C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf) {
        c0094Ujhhgtgfeyxiexzf.m1146Ujhhgtgfeyxiexzf();
        c0094Ujhhgtgfeyxiexzf.f1203Ujhhgtgfeyxiexzf = true;
        return c0094Ujhhgtgfeyxiexzf.f1202Ujhhgtgfeyxiexzf > 0 ? c0094Ujhhgtgfeyxiexzf : C0094Ujhhgtgfeyxiexzf.f1200Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static byte[] m2747Ujhhgtgfeyxiexzf(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final void m2748Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C0970feyxiexzfUjhhgtg m2749Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, ArrayList arrayList) {
        InterfaceC0902feyxiexzfUjhhgtg c2532feyxiexzfUjhhgtg;
        InterfaceC0902feyxiexzfUjhhgtg c2622feyxiexzfUjhhgtg;
        Class cls;
        InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg = ujhhgtgfeyxiexzf.f603Ujhhgtgfeyxiexzf;
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf.f606Ujhhgtgfeyxiexzf;
        C3589Ujhhgtgfeyxiexzf c3589Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf.f605Ujhhgtgfeyxiexzf;
        Context applicationContext = c3589Ujhhgtgfeyxiexzf.getApplicationContext();
        C3596feyxiexzfUjhhgtg c3596feyxiexzfUjhhgtg = c3589Ujhhgtgfeyxiexzf.f11167Ujhhgtgfeyxiexzf;
        C0970feyxiexzfUjhhgtg c0970feyxiexzfUjhhgtg = new C0970feyxiexzfUjhhgtg();
        C3113Ujhhgtgfeyxiexzf c3113Ujhhgtgfeyxiexzf = new C3113Ujhhgtgfeyxiexzf();
        C3325Ujhhgtgfeyxiexzf c3325Ujhhgtgfeyxiexzf = c0970feyxiexzfUjhhgtg.f3855Ujhhgtgfeyxiexzf;
        synchronized (c3325Ujhhgtgfeyxiexzf) {
            c3325Ujhhgtgfeyxiexzf.f10365Ujhhgtgfeyxiexzf.add(c3113Ujhhgtgfeyxiexzf);
        }
        int i = Build.VERSION.SDK_INT;
        C3498Ujhhgtgfeyxiexzf c3498Ujhhgtgfeyxiexzf = new C3498Ujhhgtgfeyxiexzf();
        C3325Ujhhgtgfeyxiexzf c3325Ujhhgtgfeyxiexzf2 = c0970feyxiexzfUjhhgtg.f3855Ujhhgtgfeyxiexzf;
        synchronized (c3325Ujhhgtgfeyxiexzf2) {
            c3325Ujhhgtgfeyxiexzf2.f10365Ujhhgtgfeyxiexzf.add(c3498Ujhhgtgfeyxiexzf);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM2470Ujhhgtgfeyxiexzf = c0970feyxiexzfUjhhgtg.m2470Ujhhgtgfeyxiexzf();
        C2620feyxiexzfUjhhgtg c2620feyxiexzfUjhhgtg = new C2620feyxiexzfUjhhgtg(applicationContext, arrayListM2470Ujhhgtgfeyxiexzf, interfaceC2512feyxiexzfUjhhgtg, c0271Ujhhgtgfeyxiexzf);
        C1875feyxiexzfUjhhgtg c1875feyxiexzfUjhhgtg = new C1875feyxiexzfUjhhgtg(interfaceC2512feyxiexzfUjhhgtg, new C1866feyxiexzfUjhhgtg());
        C3220feyxiexzfUjhhgtg c3220feyxiexzfUjhhgtg = new C3220feyxiexzfUjhhgtg(c0970feyxiexzfUjhhgtg.m2470Ujhhgtgfeyxiexzf(), resources.getDisplayMetrics(), interfaceC2512feyxiexzfUjhhgtg, c0271Ujhhgtgfeyxiexzf);
        if (i < 28 || !c3596feyxiexzfUjhhgtg.f11193Ujhhgtgfeyxiexzf.containsKey(AbstractC3611Ujhhgtgfeyxiexzf.class)) {
            C2621Ujhhgtgfeyxiexzf c2621Ujhhgtgfeyxiexzf = new C2621Ujhhgtgfeyxiexzf(c3220feyxiexzfUjhhgtg, 0);
            c2532feyxiexzfUjhhgtg = new C2532feyxiexzfUjhhgtg(c3220feyxiexzfUjhhgtg, 2, c0271Ujhhgtgfeyxiexzf);
            c2622feyxiexzfUjhhgtg = c2621Ujhhgtgfeyxiexzf;
        } else {
            C2622feyxiexzfUjhhgtg c2622feyxiexzfUjhhgtg2 = new C2622feyxiexzfUjhhgtg(1);
            c2622feyxiexzfUjhhgtg = new C2622feyxiexzfUjhhgtg(0);
            c2532feyxiexzfUjhhgtg = c2622feyxiexzfUjhhgtg2;
        }
        if (i >= 28) {
            int i2 = 1;
            c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Animation", InputStream.class, Drawable.class, new C3031Ujhhgtgfeyxiexzf(new C2629Ujhhgtgfeyxiexzf(arrayListM2470Ujhhgtgfeyxiexzf, i2, c0271Ujhhgtgfeyxiexzf), i2));
            c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Animation", ByteBuffer.class, Drawable.class, new C3031Ujhhgtgfeyxiexzf(new C2629Ujhhgtgfeyxiexzf(arrayListM2470Ujhhgtgfeyxiexzf, 1, c0271Ujhhgtgfeyxiexzf), 0));
        }
        C0884feyxiexzfUjhhgtg c0884feyxiexzfUjhhgtg = new C0884feyxiexzfUjhhgtg(applicationContext);
        C2514feyxiexzfUjhhgtg c2514feyxiexzfUjhhgtg = new C2514feyxiexzfUjhhgtg(c0271Ujhhgtgfeyxiexzf);
        C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = new C2501feyxiexzfUjhhgtg((byte) 0, 1);
        C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg = new C3339feyxiexzfUjhhgtg(13);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c0970feyxiexzfUjhhgtg.m2466Ujhhgtgfeyxiexzf(ByteBuffer.class, new C2466feyxiexzfUjhhgtg(10));
        c0970feyxiexzfUjhhgtg.m2466Ujhhgtgfeyxiexzf(InputStream.class, new C0709Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Bitmap", ByteBuffer.class, Bitmap.class, c2622feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Bitmap", InputStream.class, Bitmap.class, c2532feyxiexzfUjhhgtg);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            cls = ParcelFileDescriptor.class;
            c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Bitmap", cls, Bitmap.class, new C2621Ujhhgtgfeyxiexzf(c3220feyxiexzfUjhhgtg, 1));
        }
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C1875feyxiexzfUjhhgtg(interfaceC2512feyxiexzfUjhhgtg, new C0420Ujhhgtgfeyxiexzf(27)));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Bitmap", cls, Bitmap.class, c1875feyxiexzfUjhhgtg);
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10570Ujhhgtgfeyxiexzf;
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Bitmap.class, Bitmap.class, c3382feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Bitmap", Bitmap.class, Bitmap.class, new C3435feyxiexzfUjhhgtg(1));
        c0970feyxiexzfUjhhgtg.m2467Ujhhgtgfeyxiexzf(Bitmap.class, c2514feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2532feyxiexzfUjhhgtg(resources, c2622feyxiexzfUjhhgtg));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2532feyxiexzfUjhhgtg(resources, c2532feyxiexzfUjhhgtg));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("BitmapDrawable", cls, BitmapDrawable.class, new C2532feyxiexzfUjhhgtg(resources, c1875feyxiexzfUjhhgtg));
        c0970feyxiexzfUjhhgtg.m2467Ujhhgtgfeyxiexzf(BitmapDrawable.class, new C2629Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, 5, c2514feyxiexzfUjhhgtg));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Animation", InputStream.class, C3571feyxiexzfUjhhgtg.class, new C1169feyxiexzfUjhhgtg(arrayListM2470Ujhhgtgfeyxiexzf, c2620feyxiexzfUjhhgtg, c0271Ujhhgtgfeyxiexzf));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Animation", ByteBuffer.class, C3571feyxiexzfUjhhgtg.class, c2620feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2467Ujhhgtgfeyxiexzf(C3571feyxiexzfUjhhgtg.class, new C3339feyxiexzfUjhhgtg(14));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(C1125feyxiexzfUjhhgtg.class, C1125feyxiexzfUjhhgtg.class, c3382feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("Bitmap", C1125feyxiexzfUjhhgtg.class, Bitmap.class, new C2510feyxiexzfUjhhgtg(interfaceC2512feyxiexzfUjhhgtg));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("legacy_append", Uri.class, Drawable.class, c0884feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("legacy_append", Uri.class, Bitmap.class, new C2532feyxiexzfUjhhgtg(c0884feyxiexzfUjhhgtg, 1, interfaceC2512feyxiexzfUjhhgtg));
        c0970feyxiexzfUjhhgtg.m2473Ujhhgtgfeyxiexzf(new C2619feyxiexzfUjhhgtg(0));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(File.class, ByteBuffer.class, new C2466feyxiexzfUjhhgtg(11));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(File.class, InputStream.class, new C3449Ujhhgtgfeyxiexzf(new C3339feyxiexzfUjhhgtg(8)));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("legacy_append", File.class, File.class, new C3435feyxiexzfUjhhgtg(0));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(File.class, cls, new C3449Ujhhgtgfeyxiexzf(new C3339feyxiexzfUjhhgtg(7)));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(File.class, File.class, c3382feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2473Ujhhgtgfeyxiexzf(new C0686Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf));
        if (!"robolectric".equals(str)) {
            c0970feyxiexzfUjhhgtg.m2473Ujhhgtgfeyxiexzf(new C2619feyxiexzfUjhhgtg(2));
        }
        C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg = new C3167feyxiexzfUjhhgtg(applicationContext, 2);
        C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg2 = new C3167feyxiexzfUjhhgtg(applicationContext, 0);
        C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg3 = new C3167feyxiexzfUjhhgtg(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(cls2, InputStream.class, c3167feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Integer.class, InputStream.class, c3167feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(cls2, AssetFileDescriptor.class, c3167feyxiexzfUjhhgtg2);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Integer.class, AssetFileDescriptor.class, c3167feyxiexzfUjhhgtg2);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(cls2, Drawable.class, c3167feyxiexzfUjhhgtg3);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Integer.class, Drawable.class, c3167feyxiexzfUjhhgtg3);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C3167feyxiexzfUjhhgtg(applicationContext, 9));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, AssetFileDescriptor.class, new C3167feyxiexzfUjhhgtg(applicationContext, 8));
        C2513feyxiexzfUjhhgtg c2513feyxiexzfUjhhgtg = new C2513feyxiexzfUjhhgtg(resources, 3);
        C2513feyxiexzfUjhhgtg c2513feyxiexzfUjhhgtg2 = new C2513feyxiexzfUjhhgtg(resources, 1);
        C2513feyxiexzfUjhhgtg c2513feyxiexzfUjhhgtg3 = new C2513feyxiexzfUjhhgtg(resources, 2);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Integer.class, Uri.class, c2513feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(cls2, Uri.class, c2513feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Integer.class, AssetFileDescriptor.class, c2513feyxiexzfUjhhgtg2);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(cls2, AssetFileDescriptor.class, c2513feyxiexzfUjhhgtg2);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Integer.class, InputStream.class, c2513feyxiexzfUjhhgtg3);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(cls2, InputStream.class, c2513feyxiexzfUjhhgtg3);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(String.class, InputStream.class, new C2965Ujhhgtgfeyxiexzf(13));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C2965Ujhhgtgfeyxiexzf(13));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(String.class, InputStream.class, new C0420Ujhhgtgfeyxiexzf(18));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(String.class, cls, new C0420Ujhhgtgfeyxiexzf(17));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(String.class, AssetFileDescriptor.class, new C0420Ujhhgtgfeyxiexzf(16));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C2396Ujhhgtgfeyxiexzf(applicationContext.getAssets(), 1));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, AssetFileDescriptor.class, new C2396Ujhhgtgfeyxiexzf(applicationContext.getAssets(), 0));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C3167feyxiexzfUjhhgtg(applicationContext, 6));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C3167feyxiexzfUjhhgtg(applicationContext, 7));
        if (i >= 29) {
            c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C0873feyxiexzfUjhhgtg(applicationContext, InputStream.class));
            c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, cls, new C0873feyxiexzfUjhhgtg(applicationContext, cls));
        }
        boolean zContainsKey = c3596feyxiexzfUjhhgtg.f11193Ujhhgtgfeyxiexzf.containsKey(AbstractC3590Ujhhgtgfeyxiexzf.class);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C1858Ujhhgtgfeyxiexzf(contentResolver, zContainsKey, 2));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, cls, new C1858Ujhhgtgfeyxiexzf(contentResolver, zContainsKey, 1));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, AssetFileDescriptor.class, new C1858Ujhhgtgfeyxiexzf(contentResolver, zContainsKey, 0));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, InputStream.class, new C0420Ujhhgtgfeyxiexzf(24));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(URL.class, InputStream.class, new C0420Ujhhgtgfeyxiexzf(23));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, File.class, new C3167feyxiexzfUjhhgtg(applicationContext, 5));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(C3598feyxiexzfUjhhgtg.class, InputStream.class, new C2965Ujhhgtgfeyxiexzf(26));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(byte[].class, ByteBuffer.class, new C2466feyxiexzfUjhhgtg(7));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(byte[].class, InputStream.class, new C2466feyxiexzfUjhhgtg(9));
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Uri.class, Uri.class, c3382feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2468Ujhhgtgfeyxiexzf(Drawable.class, Drawable.class, c3382feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("legacy_append", Drawable.class, Drawable.class, new C3435feyxiexzfUjhhgtg(2));
        c0970feyxiexzfUjhhgtg.m2474Ujhhgtgfeyxiexzf(Bitmap.class, BitmapDrawable.class, new C2513feyxiexzfUjhhgtg(resources, 0));
        c0970feyxiexzfUjhhgtg.m2474Ujhhgtgfeyxiexzf(Bitmap.class, byte[].class, c2501feyxiexzfUjhhgtg);
        c0970feyxiexzfUjhhgtg.m2474Ujhhgtgfeyxiexzf(Drawable.class, byte[].class, new C2366Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, c2501feyxiexzfUjhhgtg, c3339feyxiexzfUjhhgtg, 7));
        c0970feyxiexzfUjhhgtg.m2474Ujhhgtgfeyxiexzf(C3571feyxiexzfUjhhgtg.class, byte[].class, c3339feyxiexzfUjhhgtg);
        C1875feyxiexzfUjhhgtg c1875feyxiexzfUjhhgtg2 = new C1875feyxiexzfUjhhgtg(interfaceC2512feyxiexzfUjhhgtg, new C0420Ujhhgtgfeyxiexzf(28));
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("legacy_append", ByteBuffer.class, Bitmap.class, c1875feyxiexzfUjhhgtg2);
        c0970feyxiexzfUjhhgtg.m2469Ujhhgtgfeyxiexzf("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C2532feyxiexzfUjhhgtg(resources, c1875feyxiexzfUjhhgtg2));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
        }
        return c0970feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final Object m2750Ujhhgtgfeyxiexzf(long j, AbstractC1181feyxiexzfUjhhgtg abstractC1181feyxiexzfUjhhgtg) {
        if (j > 0) {
            C2774Ujhhgtgfeyxiexzf c2774Ujhhgtgfeyxiexzf = new C2774Ujhhgtgfeyxiexzf(AbstractC2855feyxiexzfUjhhgtg.m4215feyxiexzfUjhhgtg(abstractC1181feyxiexzfUjhhgtg));
            InterfaceC3227feyxiexzfUjhhgtg interfaceC3227feyxiexzfUjhhgtgM4059Ujhhgtgfeyxiexzf = c2774Ujhhgtgfeyxiexzf.m4059Ujhhgtgfeyxiexzf();
            if (interfaceC3227feyxiexzfUjhhgtgM4059Ujhhgtgfeyxiexzf != null && !(C2774Ujhhgtgfeyxiexzf.f8771Ujhhgtgfeyxiexzf.get(c2774Ujhhgtgfeyxiexzf) instanceof InterfaceC1271feyxiexzfUjhhgtg)) {
                interfaceC3227feyxiexzfUjhhgtgM4059Ujhhgtgfeyxiexzf.mo2039Ujhhgtgfeyxiexzf();
                C2774Ujhhgtgfeyxiexzf.f8772Ujhhgtgfeyxiexzf.set(c2774Ujhhgtgfeyxiexzf, C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf);
            }
            if (j < Long.MAX_VALUE) {
                InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg = c2774Ujhhgtgfeyxiexzf.f8774Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10556Ujhhgtgfeyxiexzf);
                InterfaceC3123Ujhhgtgfeyxiexzf interfaceC3123Ujhhgtgfeyxiexzf = interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg instanceof InterfaceC3123Ujhhgtgfeyxiexzf ? (InterfaceC3123Ujhhgtgfeyxiexzf) interfaceC3737UjhhgtgfeyxiexzfMo1765feyxiexzfUjhhgtg : null;
                if (interfaceC3123Ujhhgtgfeyxiexzf == null) {
                    interfaceC3123Ujhhgtgfeyxiexzf = AbstractC3129Ujhhgtgfeyxiexzf.f9721Ujhhgtgfeyxiexzf;
                }
                interfaceC3123Ujhhgtgfeyxiexzf.mo1128Ujhhgtgfeyxiexzf(j, c2774Ujhhgtgfeyxiexzf);
            }
            Object objM4058Ujhhgtgfeyxiexzf = c2774Ujhhgtgfeyxiexzf.m4058Ujhhgtgfeyxiexzf();
            if (objM4058Ujhhgtgfeyxiexzf == EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf) {
                return objM4058Ujhhgtgfeyxiexzf;
            }
        }
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final Integer m2751Ujhhgtgfeyxiexzf(Object obj, String str) {
        String str2 = "id";
        if (obj instanceof View) {
            Resources resources = ((View) obj).getResources();
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            return Integer.valueOf(resources.getIdentifier(str, str2, C0580Ujhhgtgfeyxiexzf.m1856Ujhhgtgfeyxiexzf()));
        }
        if (!(obj instanceof Context)) {
            return null;
        }
        Resources resources2 = ((Context) obj).getResources();
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        return Integer.valueOf(resources2.getIdentifier(str, str2, C0580Ujhhgtgfeyxiexzf.m1856Ujhhgtgfeyxiexzf()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final int m2752Ujhhgtgfeyxiexzf(String str) {
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        return m2751Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf(), str).intValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static CharSequence m2753Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static byte[] m2754Ujhhgtgfeyxiexzf(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static byte[] m2755Ujhhgtgfeyxiexzf(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static long m2756Ujhhgtgfeyxiexzf(InputStream inputStream, int i) throws IOException {
        byte[] bArrM2754Ujhhgtgfeyxiexzf = m2754Ujhhgtgfeyxiexzf(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM2754Ujhhgtgfeyxiexzf[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final void m2757Ujhhgtgfeyxiexzf(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Object obj) {
        if (obj == f4587Ujhhgtgfeyxiexzf) {
            return;
        }
        if (!(obj instanceof C1987feyxiexzfUjhhgtg)) {
            AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg.mo1763feyxiexzfUjhhgtg(null, f4589Ujhhgtgfeyxiexzf));
            throw null;
        }
        C1987feyxiexzfUjhhgtg c1987feyxiexzfUjhhgtg = (C1987feyxiexzfUjhhgtg) obj;
        InterfaceC2009feyxiexzfUjhhgtg[] interfaceC2009feyxiexzfUjhhgtgArr = c1987feyxiexzfUjhhgtg.f6554Ujhhgtgfeyxiexzf;
        int length = interfaceC2009feyxiexzfUjhhgtgArr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC2009feyxiexzfUjhhgtg interfaceC2009feyxiexzfUjhhgtg = interfaceC2009feyxiexzfUjhhgtgArr[length];
        Object obj2 = c1987feyxiexzfUjhhgtg.f6553Ujhhgtgfeyxiexzf[length];
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m2758Ujhhgtgfeyxiexzf(Context context, int i, String str) {
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Not allowed to show a toast from non-main thread, if you must do this, please set allowBackground to true.");
        }
        Toast.makeText(context, str, 0).show();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Object m2759Ujhhgtgfeyxiexzf(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Object obj) {
        if (obj == null) {
            obj = interfaceC3739feyxiexzfUjhhgtg.mo1763feyxiexzfUjhhgtg(0, f4588Ujhhgtgfeyxiexzf);
        }
        if (obj == 0) {
            return f4587Ujhhgtgfeyxiexzf;
        }
        if (obj instanceof Integer) {
            return interfaceC3739feyxiexzfUjhhgtg.mo1763feyxiexzfUjhhgtg(new C1987feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, ((Number) obj).intValue()), f4590Ujhhgtgfeyxiexzf);
        }
        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(obj);
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static void m2760Ujhhgtgfeyxiexzf(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static void m2761Ujhhgtgfeyxiexzf(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m2760Ujhhgtgfeyxiexzf(byteArrayOutputStream, i, 2);
    }
}
