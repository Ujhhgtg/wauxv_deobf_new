package p000;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0709Ujhhgtgfeyxiexzf implements InterfaceC0190Ujhhgtgfeyxiexzf, InterfaceC3179feyxiexzfUjhhgtg, InterfaceC0360Ujhhgtgfeyxiexzf, InterfaceC3157feyxiexzfUjhhgtg, InterfaceC0850feyxiexzfUjhhgtg, InterfaceC2487feyxiexzfUjhhgtg, InterfaceC3330Ujhhgtgfeyxiexzf, InterfaceC2973feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object f2944Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0709Ujhhgtgfeyxiexzf(Object obj) {
        this.f2944Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC2973feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean mo2012Ujhhgtgfeyxiexzf(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2944Ujhhgtgfeyxiexzf;
        if (!swipeDismissBehavior.mo777Ujhhgtgfeyxiexzf(view)) {
            return false;
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f634Ujhhgtgfeyxiexzf;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p000.InterfaceC0850feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo1737Ujhhgtgfeyxiexzf() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.InterfaceC0850feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo1738Ujhhgtgfeyxiexzf(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f2944Ujhhgtgfeyxiexzf).setResultCode(i);
    }

    @Override // p000.InterfaceC3157feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean mo2013Ujhhgtgfeyxiexzf(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo2016Ujhhgtgfeyxiexzf();
        ((NestedScrollView) this.f2944Ujhhgtgfeyxiexzf).m79Ujhhgtgfeyxiexzf((int) f);
        return true;
    }

    @Override // p000.InterfaceC3157feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float mo2014Ujhhgtgfeyxiexzf() {
        return -((NestedScrollView) this.f2944Ujhhgtgfeyxiexzf).getVerticalScrollFactorCompat();
    }

    @Override // p000.InterfaceC0360Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public boolean mo1571Ujhhgtgfeyxiexzf(MenuItem menuItem) {
        InterfaceC0441Ujhhgtgfeyxiexzf interfaceC0441Ujhhgtgfeyxiexzf = ((C2665Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf).f2353Ujhhgtgfeyxiexzf;
        if (interfaceC0441Ujhhgtgfeyxiexzf != null) {
            Object obj = ((C2579Ujhhgtgfeyxiexzf) interfaceC0441Ujhhgtgfeyxiexzf).f8346Ujhhgtgfeyxiexzf;
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928364681694807434L, strArr);
                ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(0);
            } else {
                if (itemId == 1) {
                    int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928364771889120650L, strArr);
                    ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(1);
                    return false;
                }
                if (itemId == 2) {
                    int i3 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928364862083433866L, strArr);
                    ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(2);
                    return false;
                }
                if (itemId == 3) {
                    int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928364814838793610L, strArr);
                    ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(3);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2487feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void mo2015Ujhhgtgfeyxiexzf(C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg) {
        ((C0684Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf).m1942Ujhhgtgfeyxiexzf(c2495feyxiexzfUjhhgtg.f8152Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3157feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void mo2016Ujhhgtgfeyxiexzf() {
        ((NestedScrollView) this.f2944Ujhhgtgfeyxiexzf).f262Ujhhgtgfeyxiexzf.abortAnimation();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C3658Ujhhgtgfeyxiexzf m2017Ujhhgtgfeyxiexzf() {
        C3658Ujhhgtgfeyxiexzf c3658Ujhhgtgfeyxiexzf = new C3658Ujhhgtgfeyxiexzf();
        c3658Ujhhgtgfeyxiexzf.f1478Ujhhgtgfeyxiexzf = (C0216Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf;
        return c3658Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3330Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo2018Ujhhgtgfeyxiexzf(Object obj, File file, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = (C0271Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf;
        byte[] bArr = (byte[]) c0271Ujhhgtgfeyxiexzf.m1462Ujhhgtgfeyxiexzf(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m2019Ujhhgtgfeyxiexzf(C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg, int i, EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg) {
        int iOrdinal = enumC0860feyxiexzfUjhhgtg.ordinal();
        if (iOrdinal == 0) {
            long j = i;
            c2612feyxiexzfUjhhgtg.getClass();
            int i2 = C2612feyxiexzfUjhhgtg.f8424Ujhhgtgfeyxiexzf[Long.numberOfLeadingZeros(j)];
            c2612feyxiexzfUjhhgtg.m3916Ujhhgtgfeyxiexzf(i2 + 1);
            c2612feyxiexzfUjhhgtg.m3915Ujhhgtgfeyxiexzf(i2, j);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C2870Ujhhgtgfeyxiexzf();
            }
            ((C2612feyxiexzfUjhhgtg) this.f2944Ujhhgtgfeyxiexzf).m3917Ujhhgtgfeyxiexzf(Integer.reverseBytes(i));
            return;
        }
        int i3 = (i >> 31) ^ (i << 1);
        c2612feyxiexzfUjhhgtg.m3916Ujhhgtgfeyxiexzf(5);
        if ((i3 & (-128)) != 0) {
            long j2 = i3;
            c2612feyxiexzfUjhhgtg.m3915Ujhhgtgfeyxiexzf(C2612feyxiexzfUjhhgtg.f8424Ujhhgtgfeyxiexzf[Long.numberOfLeadingZeros(j2)], j2);
        } else {
            byte[] bArr = c2612feyxiexzfUjhhgtg.f8425Ujhhgtgfeyxiexzf;
            int i4 = c2612feyxiexzfUjhhgtg.f8426Ujhhgtgfeyxiexzf;
            c2612feyxiexzfUjhhgtg.f8426Ujhhgtgfeyxiexzf = i4 + 1;
            bArr[i4] = (byte) i3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public void m2020Ujhhgtgfeyxiexzf(C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg, long j, EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg) {
        int iOrdinal = enumC0860feyxiexzfUjhhgtg.ordinal();
        if (iOrdinal == 0) {
            int i = C2612feyxiexzfUjhhgtg.f8424Ujhhgtgfeyxiexzf[Long.numberOfLeadingZeros(j)];
            c2612feyxiexzfUjhhgtg.m3916Ujhhgtgfeyxiexzf(i + 1);
            c2612feyxiexzfUjhhgtg.m3915Ujhhgtgfeyxiexzf(i, j);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C2870Ujhhgtgfeyxiexzf();
            }
            ((C2612feyxiexzfUjhhgtg) this.f2944Ujhhgtgfeyxiexzf).m3918Ujhhgtgfeyxiexzf(Long.reverseBytes(j));
        } else {
            long j2 = (j >> 63) ^ (j << 1);
            int i2 = C2612feyxiexzfUjhhgtg.f8424Ujhhgtgfeyxiexzf[Long.numberOfLeadingZeros(j2)];
            c2612feyxiexzfUjhhgtg.m3916Ujhhgtgfeyxiexzf(i2 + 1);
            c2612feyxiexzfUjhhgtg.m3915Ujhhgtgfeyxiexzf(i2, j2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public C3442feyxiexzfUjhhgtg m2021Ujhhgtgfeyxiexzf() {
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtg = new C3442feyxiexzfUjhhgtg();
        c3442feyxiexzfUjhhgtg.f1478Ujhhgtgfeyxiexzf = (C0216Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf;
        return c3442feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m2022Ujhhgtgfeyxiexzf(C1425feyxiexzfUjhhgtg c1425feyxiexzfUjhhgtg) throws IOException {
        File file = new File(((C1414feyxiexzfUjhhgtg) this.f2944Ujhhgtgfeyxiexzf).f4963Ujhhgtgfeyxiexzf, MagicFactory.get(4928461842444977546L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
        StringBuilder sb = new StringBuilder();
        sb.append(c1425feyxiexzfUjhhgtg);
        sb.append('\n');
        String string = sb.toString();
        Charset charset = AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf;
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            AbstractC3445Ujhhgtgfeyxiexzf.m4948feyxiexzfUjhhgtg(fileOutputStream, string, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC3179feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo2023Ujhhgtgfeyxiexzf() {
        C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf = ((C0399Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf).f2163Ujhhgtgfeyxiexzf;
        C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf = c0400Ujhhgtgfeyxiexzf.f2168feyxiexzfUjhhgtg;
        if (c2579Ujhhgtgfeyxiexzf == null) {
            if (c0400Ujhhgtgfeyxiexzf.mo1678feyxiexzfUjhhgtg()) {
                c0400Ujhhgtgfeyxiexzf.m1677feyxiexzfUjhhgtg();
            }
        } else {
            C1903Ujhhgtgfeyxiexzf c1903Ujhhgtgfeyxiexzf = ((C0290Ujhhgtgfeyxiexzf) c2579Ujhhgtgfeyxiexzf.f8346Ujhhgtgfeyxiexzf).f1733Ujhhgtgfeyxiexzf;
            if (c1903Ujhhgtgfeyxiexzf != null) {
                c1903Ujhhgtgfeyxiexzf.invoke();
            }
            c0400Ujhhgtgfeyxiexzf.m1677feyxiexzfUjhhgtg();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C0386Ujhhgtgfeyxiexzf m2024Ujhhgtgfeyxiexzf() {
        C0386Ujhhgtgfeyxiexzf c0386Ujhhgtgfeyxiexzf = new C0386Ujhhgtgfeyxiexzf();
        c0386Ujhhgtgfeyxiexzf.f1478Ujhhgtgfeyxiexzf = (C0216Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf;
        return c0386Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m2025Ujhhgtgfeyxiexzf(boolean z) {
        ((C0216Ujhhgtgfeyxiexzf) this.f2944Ujhhgtgfeyxiexzf).f1489Ujhhgtgfeyxiexzf = z ? 3 : 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public void m2026Ujhhgtgfeyxiexzf(byte[] bArr) {
        C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg = (C2612feyxiexzfUjhhgtg) this.f2944Ujhhgtgfeyxiexzf;
        m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, bArr.length, EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        c2612feyxiexzfUjhhgtg.m3916Ujhhgtgfeyxiexzf(length);
        AbstractC2391Ujhhgtgfeyxiexzf.m3642Ujhhgtgfeyxiexzf(bArr, c2612feyxiexzfUjhhgtg.f8426Ujhhgtgfeyxiexzf, 0, c2612feyxiexzfUjhhgtg.f8425Ujhhgtgfeyxiexzf, length);
        c2612feyxiexzfUjhhgtg.f8426Ujhhgtgfeyxiexzf += length;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m2027Ujhhgtgfeyxiexzf(C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg) {
        C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg2 = (C2612feyxiexzfUjhhgtg) this.f2944Ujhhgtgfeyxiexzf;
        m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg2, c2612feyxiexzfUjhhgtg.f8426Ujhhgtgfeyxiexzf, EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        int i = c2612feyxiexzfUjhhgtg.f8426Ujhhgtgfeyxiexzf;
        c2612feyxiexzfUjhhgtg2.m3916Ujhhgtgfeyxiexzf(i);
        AbstractC2391Ujhhgtgfeyxiexzf.m3642Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg.f8425Ujhhgtgfeyxiexzf, c2612feyxiexzfUjhhgtg2.f8426Ujhhgtgfeyxiexzf, 0, c2612feyxiexzfUjhhgtg2.f8425Ujhhgtgfeyxiexzf, i);
        c2612feyxiexzfUjhhgtg2.f8426Ujhhgtgfeyxiexzf += i;
    }

    public C0709Ujhhgtgfeyxiexzf(int i) {
        switch (i) {
            case 8:
                this.f2944Ujhhgtgfeyxiexzf = new C0304Ujhhgtgfeyxiexzf(500L);
                break;
            default:
                this.f2944Ujhhgtgfeyxiexzf = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public C0709Ujhhgtgfeyxiexzf(ViewGroup viewGroup) {
        this.f2944Ujhhgtgfeyxiexzf = viewGroup.getOverlay();
    }

    @Override // p000.InterfaceC0360Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public void mo1572Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
    }
}
