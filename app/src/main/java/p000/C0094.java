package p000;

import android.content.ClipData;
import android.content.Context;
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
import com.kongzue.dialogx.interfaces.AbstractC0027;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0094 implements InterfaceC1954, InterfaceC1942, InterfaceC0233, InterfaceC1945, InterfaceC0834, InterfaceC0836, InterfaceC2274, InterfaceC1036, InterfaceC1997, InterfaceC0988, InterfaceC1261, InterfaceC0962 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1048;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1049;

    public /* synthetic */ C0094(int i, Object obj) {
        this.f1048 = i;
        this.f1049 = obj;
    }

    @Override // p000.InterfaceC0834
    public C0837 build() {
        return new C0837(new C0094(((ContentInfo.Builder) this.f1049).build()));
    }

    @Override // p000.InterfaceC0834
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f1049).setExtras(bundle);
    }

    @Override // p000.InterfaceC0988
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f1049;
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
        switch (this.f1048) {
            case 9:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1049) + "}";
            case Opcodes.DLOAD /* 24 */:
                return "[class] placeholder_hook_class [throwable] " + ((Throwable) this.f1049) + " [instance] null";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1954
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo1097(MenuC1944 menuC1944, boolean z) {
        if (menuC1944 instanceof SubMenuC2853) {
            ((SubMenuC2853) menuC1944).f9115.mo3763().m3756(false);
        }
        InterfaceC1954 interfaceC1954 = ((C0136) this.f1049).f1109;
        if (interfaceC1954 != null) {
            interfaceC1954.mo1097(menuC1944, z);
        }
    }

    @Override // p000.InterfaceC0962
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo610() {
        ((C2479) this.f1049).m4432();
    }

    @Override // p000.InterfaceC0836
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ClipData mo1098() {
        return ((ContentInfo) this.f1049).getClip();
    }

    @Override // p000.InterfaceC1945
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo1099(MenuC1944 menuC1944, MenuItem menuItem) {
        ((ViewOnKeyListenerC0572) this.f1049).f2317.removeCallbacksAndMessages(menuC1944);
    }

    @Override // p000.InterfaceC1261
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object mo1100() {
        switch (this.f1048) {
            case Opcodes.ILOAD /* 21 */:
                C0221 c0221 = (C0221) this.f1049;
                return new RunnableC0972((C1215) c0221.f1352, (C0243) c0221.f1353);
            default:
                C1214 c1214 = (C1214) this.f1049;
                return new C1220((ExecutorServiceC1465) c1214.f4377, (ExecutorServiceC1465) c1214.f4378, (ExecutorServiceC1465) c1214.f4379, (ExecutorServiceC1465) c1214.f4380, (C1216) c1214.f4381, (C1216) c1214.f4382, (C0243) c1214.f4383);
        }
    }

    @Override // p000.InterfaceC1942
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean mo1101(MenuItem menuItem) {
        InterfaceC0139 interfaceC0139 = ((ActionMenuView) this.f1049).f88;
        if (interfaceC0139 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C3411) interfaceC0139).f10754.f180.f5843).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((AbstractC1409) it.next()).getClass();
        throw null;
    }

    @Override // p000.InterfaceC0988
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int mo1102() {
        return (mo1106() << 8) | mo1106();
    }

    @Override // p000.InterfaceC0962
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Object mo611() {
        C2479 c2479 = (C2479) this.f1049;
        c2479.reset();
        return c2479;
    }

    @Override // p000.InterfaceC0834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo1103(Uri uri) {
        ((ContentInfo.Builder) this.f1049).setLinkUri(uri);
    }

    @Override // p000.InterfaceC0834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void mo1104(int i) {
        ((ContentInfo.Builder) this.f1049).setFlags(i);
    }

    @Override // p000.InterfaceC0988
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public short mo1106() throws IOException {
        int i = ((InputStream) this.f1049).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C0987();
    }

    @Override // p000.InterfaceC1945
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void mo1107(MenuC1944 menuC1944, MenuItemC1946 menuItemC1946) {
        ViewOnKeyListenerC0572 viewOnKeyListenerC0572 = (ViewOnKeyListenerC0572) this.f1049;
        Handler handler = viewOnKeyListenerC0572.f2317;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0572.f2319;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1944 == ((C0571) arrayList.get(i)).f2311) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC0570(this, i2 < arrayList.size() ? (C0571) arrayList.get(i2) : null, menuItemC1946, menuC1944), menuC1944, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC2274
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C3669 mo1108(View view, C3669 c3669) {
        C3665 c3665 = c3669.f11452;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1049;
        if (!Objects.equals(coordinatorLayout.f232, c3669)) {
            coordinatorLayout.f232 = c3669;
            boolean z = c3669.m5301() > 0;
            coordinatorLayout.f233 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c3665.mo5285()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    Field field = AbstractC3578.f11184;
                    if (childAt.getFitsSystemWindows() && ((C0864) childAt.getLayoutParams()).f3277 != null && c3665.mo5285()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c3669;
    }

    @Override // p000.InterfaceC0836
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int mo1109() {
        return ((ContentInfo) this.f1049).getFlags();
    }

    @Override // p000.InterfaceC1036
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void mo1110() {
        C0943 c0943 = (C0943) ((C0662) this.f1049).f2532;
        if (c0943.f915) {
            AbstractC0027.m745(new RunnableC0936(c0943, 1));
        }
    }

    @Override // p000.InterfaceC0988
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int mo1111(int i, byte[] bArr) throws C0987 {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f1049).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0987();
        }
        return i2;
    }

    @Override // p000.InterfaceC0836
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ContentInfo mo1112() {
        return (ContentInfo) this.f1049;
    }

    @Override // p000.InterfaceC1942
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public void mo1113(MenuC1944 menuC1944) {
        C3411 c3411 = ((ActionMenuView) this.f1049).f83;
        if (c3411 != null) {
            c3411.mo1113(menuC1944);
        }
    }

    @Override // p000.InterfaceC1997
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public InterfaceC1996 mo1115(C2103 c2103) {
        switch (this.f1048) {
            case Opcodes.FCONST_1 /* 12 */:
                return new C0522(1, (C0373) this.f1049);
            default:
                return new C1572((C1744) this.f1049);
        }
    }

    @Override // p000.InterfaceC0836
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int mo1116() {
        return ((ContentInfo) this.f1049).getSource();
    }

    @Override // p000.InterfaceC1954
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean mo1118(MenuC1944 menuC1944) {
        C0136 c0136 = (C0136) this.f1049;
        if (menuC1944 == c0136.f1107) {
            return false;
        }
        c0136.f1127 = ((SubMenuC2853) menuC1944).f9116.f6427;
        InterfaceC1954 interfaceC1954 = c0136.f1109;
        if (interfaceC1954 != null) {
            return interfaceC1954.mo1118(menuC1944);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C0092 mo1119(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C0092 mo1120(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int m1121(AbstractC0777 abstractC0777) {
        AbstractC1628 abstractC1628M3018;
        C1023 c1023 = (C1023) this.f1049;
        C1301 c1301 = c1023.f3744;
        if (abstractC0777 instanceof C0917) {
            C1977 c1977 = c1023.f3741;
            c1977.m4637();
            abstractC1628M3018 = (AbstractC1628) ((TreeMap) c1977.f6550).get((C0917) abstractC0777);
            if (abstractC1628M3018 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0777 instanceof C0918) {
            C1977 c1978 = c1023.f3742;
            c1978.m4637();
            AbstractC1628 abstractC1628 = (AbstractC1628) ((TreeMap) c1978.f6550).get(((C0918) abstractC0777).f3401);
            if (abstractC1628 == null) {
                throw new IllegalArgumentException("not found: " + abstractC0777);
            }
            abstractC1628M3018 = abstractC1628;
        } else if (abstractC0777 instanceof AbstractC0891) {
            C1979 c1979 = c1023.f3745;
            c1979.m4637();
            abstractC1628M3018 = (AbstractC1628) c1979.f6551.get((AbstractC0891) abstractC0777);
            if (abstractC1628M3018 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0777 instanceof C0899) {
            c1301.m4637();
            abstractC1628M3018 = (AbstractC1628) c1301.f4727.get((C0899) abstractC0777);
            if (abstractC1628M3018 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0777 instanceof C0898) {
            abstractC1628M3018 = c1301.m3018(((C0898) abstractC0777).m2412());
        } else if (abstractC0777 instanceof C0915) {
            C1977 c19710 = c1023.f3743;
            c19710.getClass();
            c19710.m4637();
            abstractC1628M3018 = (AbstractC1628) ((TreeMap) c19710.f6550).get(((C0915) abstractC0777).f3376);
            if (abstractC1628M3018 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0777 instanceof C0912) {
            C1977 c19711 = c1023.f3749;
            c19711.m4637();
            abstractC1628M3018 = (AbstractC1628) ((TreeMap) c19711.f6550).get((C0912) abstractC0777);
            if (abstractC1628M3018 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC0777 instanceof C0895) {
            C0548 c0548 = c1023.f3748;
            c0548.m4637();
            abstractC1628M3018 = (AbstractC1628) c0548.f2261.get((C0895) abstractC0777);
            if (abstractC1628M3018 == null) {
                throw new IllegalArgumentException("not found");
            }
        } else {
            abstractC1628M3018 = null;
        }
        if (abstractC1628M3018 == null) {
            return -1;
        }
        return abstractC1628M3018.m3345();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public int m1122(int i) {
        int[] iArr = ((DialogXBaseRelativeLayout) this.f1049).f949;
        int iM4759 = AbstractC2784.m4759(i);
        if (iM4759 == 0) {
            return iArr[0];
        }
        if (iM4759 == 1) {
            return iArr[1];
        }
        if (iM4759 == 2) {
            return iArr[2];
        }
        if (iM4759 != 3) {
            return 0;
        }
        return iArr[3];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean mo1123(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0094(InputStream inputStream, C1867 c1867) {
        this.f1048 = 28;
        C2479 c2479 = new C2479(inputStream, c1867);
        this.f1049 = c2479;
        c2479.mark(5242880);
    }

    public C0094(Context context) {
        this.f1048 = 29;
        this.f1049 = new C1044(context, 4);
    }

    public C0094(TextView textView) {
        this.f1048 = 20;
        this.f1049 = new C1179(textView);
    }

    public C0094(EditText editText) {
        this.f1048 = 19;
        this.f1049 = new C0542(editText, 9);
    }

    public C0094(int i) {
        this.f1048 = i;
        switch (i) {
            case 4:
                this.f1049 = new HashSet();
                break;
            case Opcodes.FCONST_1 /* 12 */:
                this.f1049 = new C0373(14);
                break;
            case Opcodes.DCONST_0 /* 14 */:
                this.f1049 = new ConcurrentHashMap(16);
                break;
            case Opcodes.LDC /* 18 */:
                PrintStream printStream = System.out;
                PrintStream printStream2 = System.err;
                this.f1049 = new C2299(0);
                new PrintStream(new C1123());
                new PrintStream(printStream);
                new PrintStream(printStream2);
                break;
            case Opcodes.DLOAD /* 24 */:
                break;
            case Opcodes.ALOAD /* 25 */:
                this.f1049 = new C1744(7);
                break;
            default:
                this.f1049 = new C0093(this);
                break;
        }
    }

    public C0094(ContentInfo contentInfo) {
        this.f1048 = 9;
        contentInfo.getClass();
        this.f1049 = AbstractC0451.m1661(contentInfo);
    }

    @Override // p000.InterfaceC0233
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void mo1105(int i) {
    }

    @Override // p000.InterfaceC0233
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public void mo1114(int i) {
    }

    public C0094(ClipData clipData, int i) {
        this.f1048 = 8;
        this.f1049 = AbstractC0451.m1659(clipData, i);
    }

    @Override // p000.InterfaceC0233
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public void mo1117(int i, float f) {
    }
}
