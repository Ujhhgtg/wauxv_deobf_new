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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1744 implements InterfaceC1905, InterfaceC1036, InterfaceC1942, InterfaceC1041, InterfaceC2409, InterfaceC0401, InterfaceC1207, InterfaceC0102 {

    public Object f5843;

    public /* synthetic */ C1744(Object obj) {
        this.f5843 = obj;
    }

    @Override // p000.InterfaceC0102
    public boolean mo1124(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f5843;
        if (!swipeDismissBehavior.mo635(view)) {
            return false;
        }
        Field field = AbstractC3578.f11184;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f568;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p000.InterfaceC1041
    public boolean mo2607(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo2609();
        ((NestedScrollView) this.f5843).m79((int) f);
        return true;
    }

    @Override // p000.InterfaceC2409
    public void mo3484() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.InterfaceC2409
    public void mo3485(int i, Object obj) {
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
        ((ProfileInstallReceiver) this.f5843).setResultCode(i);
    }

    @Override // p000.InterfaceC1041
    public float mo2608() {
        return -((NestedScrollView) this.f5843).getVerticalScrollFactorCompat();
    }

    @Override // p000.InterfaceC1942
    public boolean mo1101(MenuItem menuItem) {
        InterfaceC2129 interfaceC2129 = ((C0450) this.f5843).f7065;
        if (interfaceC2129 != null) {
            Object obj = ((C0466) interfaceC2129).f2057;
            String[] strArr = AbstractC1574.f5469;
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                int i = 0;
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(obj).m3492();
                c1973M3492.name = "onTabClick";
                ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).m3831(0);
            } else {
                if (itemId == 1) {
                    int i2 = 0;
                    MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(obj).m3492();
                    c1973M3493.name = "onTabClick";
                    ((C1982) AbstractC0744.firstInList(c1973M3493.resolve())).m3831(1);
                    return false;
                }
                if (itemId == 2) {
                    int i3 = 0;
                    MethodResolver c1973M3494 = AbstractC0968.startMethodResolution_(obj).m3492();
                    c1973M3494.name = "onTabClick";
                    ((C1982) AbstractC0744.firstInList(c1973M3494.resolve())).m3831(2);
                    return false;
                }
                if (itemId == 3) {
                    int i4 = 0;
                    MethodResolver c1973M3495 = AbstractC0968.startMethodResolution_(obj).m3492();
                    c1973M3495.name = "onTabClick";
                    ((C1982) AbstractC0744.firstInList(c1973M3495.resolve())).m3831(3);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0401
    public void mo1575(C0402 c0402) {
        ((C1660) this.f5843).m3382(c0402.f1897);
    }

    @Override // p000.InterfaceC1041
    public void mo2609() {
        ((NestedScrollView) this.f5843).f261.abortAnimation();
    }

    public C0796 m3486() {
        C0796 c0796 = new C0796();
        c0796.f6369 = (C1927) this.f5843;
        return c0796;
    }

    @Override // p000.InterfaceC1207
    public boolean mo1510(Object obj, File file, C2303 c2303) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C1867 c1867 = (C1867) this.f5843;
        byte[] bArr = (byte[]) c1867.m3640(65536, byte[].class);
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
                        if (true) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c1867.m3645(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (true) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c1867.m3645(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c1867.m3645(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void m3487(C0523 c0523, int i, EnumC2429 enumC2429) {
        int iOrdinal = enumC2429.ordinal();
        if (iOrdinal == 0) {
            long j = i;
            
            int i2 = C0523.f2208[Long.numberOfLeadingZeros(j)];
            c0523.m1848(i2 + 1);
            c0523.m1847(i2, j);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C0761();
            }
            ((C0523) this.f5843).m1849(Integer.reverseBytes(i));
            return;
        }
        int i3 = (i >> 31) ^ (i << 1);
        c0523.m1848(5);
        if ((i3 & (-128)) != 0) {
            long j2 = i3;
            c0523.m1847(C0523.f2208[Long.numberOfLeadingZeros(j2)], j2);
        } else {
            byte[] bArr = c0523.f2209;
            int i4 = c0523.f2210;
            c0523.f2210 = i4 + 1;
            bArr[i4] = (byte) i3;
        }
    }

    public void m3488(C0523 c0523, long j, EnumC2429 enumC2429) {
        int iOrdinal = enumC2429.ordinal();
        if (iOrdinal == 0) {
            int i = C0523.f2208[Long.numberOfLeadingZeros(j)];
            c0523.m1848(i + 1);
            c0523.m1847(i, j);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C0761();
            }
            ((C0523) this.f5843).m1850(Long.reverseBytes(j));
        } else {
            long j2 = (j >> 63) ^ (j << 1);
            int i2 = C0523.f2208[Long.numberOfLeadingZeros(j2)];
            c0523.m1848(i2 + 1);
            c0523.m1847(i2, j2);
        }
    }

    public void m3489(String str) throws IOException {
        m3491(new C2368(((C2355) this.f5843).f7554, "E", String.valueOf(str)));
    }

    public C1299 m3490() {
        C1299 c1299 = new C1299();
        c1299.f6369 = (C1927) this.f5843;
        return c1299;
    }

    @Override // p000.InterfaceC1036
    public void mo1110() {
        C1962 c1962 = ((C1961) this.f5843).f6495;
        C0466 c0466 = c1962.f6500;
        if (c0466 == null) {
            if (c1962.mo3368()) {
                c1962.m3789();
            }
        } else {
            C3561 c3561 = ((C2007) c0466.f2057).f6690;
            if (c3561 != null) {
                c3561.invoke();
            }
            c1962.m3789();
        }
    }

    public void m3491(C2368 c2368) throws IOException {
        File file = new File(((C2355) this.f5843).f7549, "plugin.log");
        StringBuilder sb = new StringBuilder();
        sb.append(c2368);
        sb.append('\n');
        String string = sb.toString();
        Charset charset = AbstractC0599.f2413;
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            AbstractC1328.m3045(fileOutputStream, string, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1458.m3154(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public MethodResolver m3492() {
        MethodResolver c1973 = new MethodResolver();
        c1973.f6369 = (C1927) this.f5843;
        return c1973;
    }

    public void m3493(boolean z) {
        ((C1927) this.f5843).f6368 = z ? 3 : 2;
    }

    public void m3494(byte[] bArr) {
        C0523 c0523 = (C0523) this.f5843;
        m3487(c0523, bArr.length, EnumC2429.DEFAULT);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        c0523.m1848(length);
        AbstractC0270.m1378(bArr, c0523.f2210, 0, c0523.f2209, length);
        c0523.f2210 += length;
    }

    public void m3495(C0523 c0523) {
        C0523 c0524 = (C0523) this.f5843;
        m3487(c0524, c0523.f2210, EnumC2429.DEFAULT);
        int i = c0523.f2210;
        c0524.m1848(i);
        AbstractC0270.m1378(c0523.f2209, c0524.f2210, 0, c0524.f2209, i);
        c0524.f2210 += i;
    }

    public C1744(int i) {
        switch (i) {
            case 7:
                this.f5843 = new C1993(500L);
                break;
            default:
                this.f5843 = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public C1744(ViewGroup viewGroup) {
        this.f5843 = viewGroup.getOverlay();
    }

    @Override // p000.InterfaceC1942
    public void mo1113(MenuC1944 menuC1944) {
    }
}
