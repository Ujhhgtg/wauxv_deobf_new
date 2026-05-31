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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲈᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1681 implements InterfaceC1932, InterfaceC1039, InterfaceC1973, InterfaceC1044, InterfaceC2462, InterfaceC0376, InterfaceC1208, InterfaceC0110 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object f5660;

    public /* synthetic */ C1681(Object obj) {
        this.f5660 = obj;
    }

    @Override // p000.InterfaceC0110
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public boolean mo1270(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f5660;
        if (!swipeDismissBehavior.mo778(view)) {
            return false;
        }
        Field field = AbstractC3638.f11333;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f620;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p000.InterfaceC2462
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void mo3553() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.InterfaceC2462
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo3554(int i, Object obj) {
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
        ((ProfileInstallReceiver) this.f5660).setResultCode(i);
    }

    @Override // p000.InterfaceC1044
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public boolean mo2731(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo2733();
        ((NestedScrollView) this.f5660).m79((int) f);
        return true;
    }

    @Override // p000.InterfaceC1044
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public float mo2732() {
        return -((NestedScrollView) this.f5660).getVerticalScrollFactorCompat();
    }

    @Override // p000.InterfaceC1973
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public boolean mo1247(MenuItem menuItem) {
        InterfaceC2163 interfaceC2163 = ((C0425) this.f5660).f7189;
        if (interfaceC2163 != null) {
            Object obj = ((C0441) interfaceC2163).f2029;
            String[] strArr = AbstractC1471.f5234;
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                int i = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(obj).m3560();
                c2004M3560.f6475 = "onTabClick";
                ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(0);
            } else {
                if (itemId == 1) {
                    int i2 = AbstractC1768.f5906;
                    C2004 c2004M3561 = AbstractC2727.m4713(obj).m3560();
                    c2004M3561.f6475 = "onTabClick";
                    ((C2013) AbstractC0739.m2290(c2004M3561.m3993())).m4025(1);
                    return false;
                }
                if (itemId == 2) {
                    int i3 = AbstractC1768.f5906;
                    C2004 c2004M3562 = AbstractC2727.m4713(obj).m3560();
                    c2004M3562.f6475 = "onTabClick";
                    ((C2013) AbstractC0739.m2290(c2004M3562.m3993())).m4025(2);
                    return false;
                }
                if (itemId == 3) {
                    int i4 = AbstractC1768.f5906;
                    C2004 c2004M3563 = AbstractC2727.m4713(obj).m3560();
                    c2004M3563.f6475 = "onTabClick";
                    ((C2013) AbstractC0739.m2290(c2004M3563.m3993())).m4025(3);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0376
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo1681(C0377 c0377) {
        ((C1676) this.f5660).m3546(c0377.f1869);
    }

    @Override // p000.InterfaceC1044
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public void mo2733() {
        ((NestedScrollView) this.f5660).f261.abortAnimation();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0795 m3555() {
        C0795 c0795 = new C0795();
        c0795.f6474 = (C1958) this.f5660;
        return c0795;
    }

    @Override // p000.InterfaceC1208
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public boolean mo1615(Object obj, File file, C2336 c2336) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C1893 c1893 = (C1893) this.f5660;
        byte[] bArr = (byte[]) c1893.m3818(65536, byte[].class);
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
                        c1893.m3823(bArr);
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
                        c1893.m3823(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c1893.m3823(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m3556(C0500 c0500, int i, EnumC2482 enumC2482) {
        int iOrdinal = enumC2482.ordinal();
        if (iOrdinal == 0) {
            long j = i;
            c0500.getClass();
            int i2 = C0500.f2164[Long.numberOfLeadingZeros(j)];
            c0500.m1942(i2 + 1);
            c0500.m1941(i2, j);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C0758();
            }
            ((C0500) this.f5660).m1943(Integer.reverseBytes(i));
            return;
        }
        int i3 = (i >> 31) ^ (i << 1);
        c0500.m1942(5);
        if ((i3 & (-128)) != 0) {
            long j2 = i3;
            c0500.m1941(C0500.f2164[Long.numberOfLeadingZeros(j2)], j2);
        } else {
            byte[] bArr = c0500.f2165;
            int i4 = c0500.f2166;
            c0500.f2166 = i4 + 1;
            bArr[i4] = (byte) i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void m3557(C0500 c0500, long j, EnumC2482 enumC2482) {
        int iOrdinal = enumC2482.ordinal();
        if (iOrdinal == 0) {
            int i = C0500.f2164[Long.numberOfLeadingZeros(j)];
            c0500.m1942(i + 1);
            c0500.m1941(i, j);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C0758();
            }
            ((C0500) this.f5660).m1944(Long.reverseBytes(j));
        } else {
            long j2 = (j >> 63) ^ (j << 1);
            int i2 = C0500.f2164[Long.numberOfLeadingZeros(j2)];
            c0500.m1942(i2 + 1);
            c0500.m1941(i2, j2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C1300 m3558() {
        C1300 c1300 = new C1300();
        c1300.f6474 = (C1958) this.f5660;
        return c1300;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m3559(C2416 c2416) throws IOException {
        File file = new File(((C2400) this.f5660).f7679, "plugin.log");
        StringBuilder sb = new StringBuilder();
        sb.append(c2416);
        sb.append('\n');
        String string = sb.toString();
        Charset charset = AbstractC0580.UTF_8;
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            AbstractC1330.m3148(fileOutputStream, string, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC1039
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public void mo1256() {
        C1993 c1993 = ((C1992) this.f5660).f6600;
        C0441 c0441 = c1993.f6605;
        if (c0441 == null) {
            if (c1993.mo3532()) {
                c1993.m3983();
            }
        } else {
            C3620 c3620 = ((C2037) c0441.f2029).f6791;
            if (c3620 != null) {
                c3620.invoke();
            }
            c1993.m3983();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C2004 m3560() {
        C2004 c2004 = new C2004();
        c2004.f6474 = (C1958) this.f5660;
        return c2004;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m3561(boolean z) {
        ((C1958) this.f5660).f6473 = z ? 3 : 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public void m3562(byte[] bArr) {
        C0500 c0500 = (C0500) this.f5660;
        m3556(c0500, bArr.length, EnumC2482.DEFAULT);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        c0500.m1942(length);
        AbstractC0280.m1524(bArr, c0500.f2166, 0, c0500.f2165, length);
        c0500.f2166 += length;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public void m3563(C0500 c0500) {
        C0500 c0501 = (C0500) this.f5660;
        m3556(c0501, c0500.f2166, EnumC2482.DEFAULT);
        int i = c0500.f2166;
        c0501.m1942(i);
        AbstractC0280.m1524(c0500.f2165, c0501.f2166, 0, c0501.f2165, i);
        c0501.f2166 += i;
    }

    public C1681(int i) {
        switch (i) {
            case 8:
                this.f5660 = new C2024(500L);
                break;
            default:
                this.f5660 = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public C1681(ViewGroup viewGroup) {
        this.f5660 = viewGroup.getOverlay();
    }

    @Override // p000.InterfaceC1973
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public void mo1259(MenuC1975 menuC1975) {
    }
}
