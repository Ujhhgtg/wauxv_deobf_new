package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0102 implements InterfaceC1985, InterfaceC1973, InterfaceC0243, InterfaceC1976, InterfaceC1944, InterfaceC0833, InterfaceC0835, InterfaceC2306, InterfaceC1039, InterfaceC2028, InterfaceC0992, InterfaceC1263, InterfaceC0966 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f1117;

    public /* synthetic */ C0102(Object obj, int i) {
        this.f1116 = i;
        this.f1117 = obj;
    }

    @Override // p000.InterfaceC0833
    public C0836 build() {
        return new C0836(new C0102(((ContentInfo.Builder) this.f1117).build()));
    }

    @Override // p000.InterfaceC0833
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f1117).setExtras(bundle);
    }

    @Override // p000.InterfaceC0992
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f1117;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    public String toString() {
        switch (this.f1116) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1117) + "}";
            case Opcodes.ALOAD /* 25 */:
                return "[class] placeholder_hook_class [throwable] " + ((Throwable) this.f1117) + " [instance] null";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1985
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo1243(MenuC1975 menuC1975, boolean z) {
        if (menuC1975 instanceof SubMenuC2913) {
            ((SubMenuC2913) menuC1975).f9284.mo3957().m3950(false);
        }
        InterfaceC1985 interfaceC1985 = ((C0144) this.f1117).f1177;
        if (interfaceC1985 != null) {
            interfaceC1985.mo1243(menuC1975, z);
        }
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo753() {
        ((C2534) this.f1117).m4453();
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ClipData mo1244() {
        return ((ContentInfo) this.f1117).getClip();
    }

    @Override // p000.InterfaceC1976
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo1245(MenuC1975 menuC1975, MenuItem menuItem) {
        ((ViewOnKeyListenerC0549) this.f1117).f2279.removeCallbacksAndMessages(menuC1975);
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object mo1246() {
        switch (this.f1116) {
            case Opcodes.LLOAD /* 22 */:
                C0231 c0231 = (C0231) this.f1117;
                return new RunnableC0976((C1216) c0231.f1426, (C0253) c0231.f1427);
            default:
                C1215 c1215 = (C1215) this.f1117;
                return new C1221((ExecutorServiceC1476) c1215.f4374, (ExecutorServiceC1476) c1215.f4375, (ExecutorServiceC1476) c1215.f4376, (ExecutorServiceC1476) c1215.f4377, (C1217) c1215.f4378, (C1217) c1215.f4379, (C0253) c1215.f4380);
        }
    }

    @Override // p000.InterfaceC1973
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean mo1247(MenuItem menuItem) {
        InterfaceC0147 interfaceC0147 = ((ActionMenuView) this.f1117).f88;
        if (interfaceC0147 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C3469) interfaceC0147).f10915.f180.f5660).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((AbstractC1417) it.next()).getClass();
        throw null;
    }

    @Override // p000.InterfaceC0992
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int mo1248() {
        return (mo1252() << 8) | mo1252();
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Object mo754() {
        C2534 c2534 = (C2534) this.f1117;
        c2534.reset();
        return c2534;
    }

    @Override // p000.InterfaceC0833
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo1249(Uri uri) {
        ((ContentInfo.Builder) this.f1117).setLinkUri(uri);
    }

    @Override // p000.InterfaceC0833
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void mo1250(int i) {
        ((ContentInfo.Builder) this.f1117).setFlags(i);
    }

    @Override // p000.InterfaceC0992
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public short mo1252() throws IOException {
        int i = ((InputStream) this.f1117).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C0991();
    }

    @Override // p000.InterfaceC1976
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void mo1253(MenuC1975 menuC1975, MenuItemC1977 menuItemC1977) {
        ViewOnKeyListenerC0549 viewOnKeyListenerC0549 = (ViewOnKeyListenerC0549) this.f1117;
        Handler handler = viewOnKeyListenerC0549.f2279;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0549.f2281;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1975 == ((C0548) arrayList.get(i)).f2273) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC0547(this, i2 < arrayList.size() ? (C0548) arrayList.get(i2) : null, menuItemC1977, menuC1975), menuC1975, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC2306
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C3729 mo1254(View view, C3729 c3729) {
        C3725 c3725 = c3729.f11601;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1117;
        if (!Objects.equals(coordinatorLayout.f232, c3729)) {
            coordinatorLayout.f232 = c3729;
            boolean z = c3729.m5307() > 0;
            coordinatorLayout.f233 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c3725.mo5291()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    Field field = AbstractC3638.f11333;
                    if (childAt.getFitsSystemWindows() && ((C0863) childAt.getLayoutParams()).f3284 != null && c3725.mo5291()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c3729;
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int mo1255() {
        return ((ContentInfo) this.f1117).getFlags();
    }

    @Override // p000.InterfaceC1039
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void mo1256() {
        C0942 c0942 = (C0942) ((C0776) this.f1117).f2881;
        if (c0942.f981) {
            AbstractC0034.m889(new RunnableC0935(c0942, 1));
        }
    }

    @Override // p000.InterfaceC0992
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int mo1257(int i, byte[] bArr) throws C0991 {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f1117).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0991();
        }
        return i2;
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ContentInfo mo1258() {
        return (ContentInfo) this.f1117;
    }

    @Override // p000.InterfaceC1973
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public void mo1259(MenuC1975 menuC1975) {
        C3469 c3469 = ((ActionMenuView) this.f1117).f83;
        if (c3469 != null) {
            c3469.mo1259(menuC1975);
        }
    }

    @Override // p000.InterfaceC2028
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public InterfaceC2027 mo1261(C2136 c2136) {
        switch (this.f1116) {
            case 13:
                return new C0499((C0348) this.f1117, 1);
            default:
                return new C1584((C1681) this.f1117);
        }
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int mo1262() {
        return ((ContentInfo) this.f1117).getSource();
    }

    @Override // p000.InterfaceC1985
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean mo1264(MenuC1975 menuC1975) {
        C0144 c0144 = (C0144) this.f1117;
        if (menuC1975 == c0144.f1175) {
            return false;
        }
        c0144.f1195 = ((SubMenuC2913) menuC1975).f9285.f6532;
        InterfaceC1985 interfaceC1985 = c0144.f1177;
        if (interfaceC1985 != null) {
            return interfaceC1985.mo1264(menuC1975);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C0100 mo1265(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C0100 mo1266(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int m1267(AbstractC0775 abstractC0775) {
        AbstractC1641 abstractC1641M3121;
        C1026 c1026 = (C1026) this.f1117;
        C1302 c1302 = c1026.f3751;
        if (abstractC0775 instanceof C0916) {
            C2008 c2008 = c1026.f3748;
            c2008.m4671();
            abstractC1641M3121 = (AbstractC1641) ((TreeMap) c2008.f6655).get((C0916) abstractC0775);
            if (abstractC1641M3121 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0775 instanceof C0917) {
            C2008 c2009 = c1026.f3749;
            c2009.m4671();
            AbstractC1641 abstractC1641 = (AbstractC1641) ((TreeMap) c2009.f6655).get(((C0917) abstractC0775).f3408);
            if (abstractC1641 == null) {
                throw new IllegalArgumentException("not found: " + abstractC0775);
            }
            abstractC1641M3121 = abstractC1641;
        } else if (abstractC0775 instanceof AbstractC0890) {
            C2010 c2010 = c1026.f3752;
            c2010.m4671();
            abstractC1641M3121 = (AbstractC1641) c2010.f6656.get((AbstractC0890) abstractC0775);
            if (abstractC1641M3121 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0775 instanceof C0898) {
            c1302.m4671();
            abstractC1641M3121 = (AbstractC1641) c1302.f4726.get((C0898) abstractC0775);
            if (abstractC1641M3121 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0775 instanceof C0897) {
            abstractC1641M3121 = c1302.m3121(((C0897) abstractC0775).m2529());
        } else if (abstractC0775 instanceof C0914) {
            C2008 c20010 = c1026.f3750;
            c20010.getClass();
            c20010.m4671();
            abstractC1641M3121 = (AbstractC1641) ((TreeMap) c20010.f6655).get(((C0914) abstractC0775).f3383);
            if (abstractC1641M3121 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0775 instanceof C0911) {
            C2008 c20011 = c1026.f3756;
            c20011.m4671();
            abstractC1641M3121 = (AbstractC1641) ((TreeMap) c20011.f6655).get((C0911) abstractC0775);
            if (abstractC1641M3121 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0775 instanceof C0894) {
            C0525 c0525 = c1026.f3755;
            c0525.m4671();
            abstractC1641M3121 = (AbstractC1641) c0525.f2217.get((C0894) abstractC0775);
            if (abstractC1641M3121 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else {
            abstractC1641M3121 = null;
        }
        if (abstractC1641M3121 == null) {
            return -1;
        }
        return abstractC1641M3121.m3509();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public int m1268(int i) {
        int[] iArr = ((DialogXBaseRelativeLayout) this.f1117).f1015;
        int iM4792 = AbstractC2844.m4792(i);
        if (iM4792 == 0) {
            return iArr[0];
        }
        if (iM4792 == 1) {
            return iArr[1];
        }
        if (iM4792 == 2) {
            return iArr[2];
        }
        if (iM4792 != 3) {
            return 0;
        }
        return iArr[3];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean mo1269(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0102(InputStream inputStream, C1893 c1893) {
        this.f1116 = 29;
        C2534 c2534 = new C2534(inputStream, c1893);
        this.f1117 = c2534;
        c2534.mark(5242880);
    }

    public C0102(TextView textView) {
        this.f1116 = 21;
        this.f1117 = new C1181(textView);
    }

    public C0102(EditText editText) {
        this.f1116 = 20;
        this.f1117 = new C0519(editText, 10);
    }

    public C0102(int i) {
        this.f1116 = i;
        switch (i) {
            case 4:
                this.f1117 = new HashSet();
                break;
            case 13:
                this.f1117 = new C0348(15);
                break;
            case 15:
                this.f1117 = new ConcurrentHashMap(16);
                break;
            case 19:
                PrintStream printStream = System.out;
                PrintStream printStream2 = System.err;
                this.f1117 = new C2332(0);
                new PrintStream(new C1129());
                new PrintStream(printStream);
                new PrintStream(printStream2);
                break;
            case Opcodes.ALOAD /* 25 */:
                break;
            case 26:
                this.f1117 = new C1681(8);
                break;
            default:
                this.f1117 = new C0101(this);
                break;
        }
    }

    public C0102(ContentInfo contentInfo) {
        this.f1116 = 10;
        contentInfo.getClass();
        this.f1117 = AbstractC0426.m1767(contentInfo);
    }

    public C0102(ClipData clipData, int i) {
        this.f1116 = 9;
        this.f1117 = AbstractC0426.m1765(clipData, i);
    }

    @Override // p000.InterfaceC0243
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void mo1251(int i) {
    }

    @Override // p000.InterfaceC0243
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public void mo1260(int i) {
    }

    @Override // p000.InterfaceC0243
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public void mo1263(int i, float f) {
    }
}
