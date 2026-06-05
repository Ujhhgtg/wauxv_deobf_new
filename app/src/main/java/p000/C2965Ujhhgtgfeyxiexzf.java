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
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2965Ujhhgtgfeyxiexzf implements InterfaceC0372Ujhhgtgfeyxiexzf, InterfaceC0360Ujhhgtgfeyxiexzf, InterfaceC2356Ujhhgtgfeyxiexzf, InterfaceC0358Ujhhgtgfeyxiexzf, InterfaceC0227Ujhhgtgfeyxiexzf, InterfaceC3696feyxiexzfUjhhgtg, InterfaceC3698Ujhhgtgfeyxiexzf, InterfaceC1319feyxiexzfUjhhgtg, InterfaceC3179feyxiexzfUjhhgtg, InterfaceC0288Ujhhgtgfeyxiexzf, InterfaceC3132Ujhhgtgfeyxiexzf, InterfaceC3507feyxiexzfUjhhgtg, InterfaceC3106Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9275Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f9276Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2965Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f9275Ujhhgtgfeyxiexzf = i;
        this.f9276Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    public C3699feyxiexzfUjhhgtg build() {
        return new C3699feyxiexzfUjhhgtg(new C2965Ujhhgtgfeyxiexzf(((ContentInfo.Builder) this.f9276Ujhhgtgfeyxiexzf).build()));
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f9276Ujhhgtgfeyxiexzf).setExtras(bundle);
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f9276Ujhhgtgfeyxiexzf;
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
        switch (this.f9275Ujhhgtgfeyxiexzf) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.f9276Ujhhgtgfeyxiexzf) + "}";
            case Opcodes.ALOAD /* 25 */:
                return "[class] placeholder_hook_class [throwable] " + ((Throwable) this.f9276Ujhhgtgfeyxiexzf) + " [instance] null";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0372Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public void mo1599Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, boolean z) {
        if (menuC0355Ujhhgtgfeyxiexzf instanceof SubMenuC1191feyxiexzfUjhhgtg) {
            ((SubMenuC1191feyxiexzfUjhhgtg) menuC0355Ujhhgtgfeyxiexzf).f4485Ujhhgtgfeyxiexzf.mo1551Ujhhgtgfeyxiexzf().m1544Ujhhgtgfeyxiexzf(false);
        }
        InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf = ((C3007Ujhhgtgfeyxiexzf) this.f9276Ujhhgtgfeyxiexzf).f9336Ujhhgtgfeyxiexzf;
        if (interfaceC0372Ujhhgtgfeyxiexzf != null) {
            interfaceC0372Ujhhgtgfeyxiexzf.mo1599Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, z);
        }
    }

    @Override // p000.InterfaceC3106Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo752Ujhhgtgfeyxiexzf() {
        ((C0790feyxiexzfUjhhgtg) this.f9276Ujhhgtgfeyxiexzf).m2123Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public ClipData mo4441Ujhhgtgfeyxiexzf() {
        return ((ContentInfo) this.f9276Ujhhgtgfeyxiexzf).getClip();
    }

    @Override // p000.InterfaceC0358Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo1567Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, MenuItem menuItem) {
        ((ViewOnKeyListenerC2787feyxiexzfUjhhgtg) this.f9276Ujhhgtgfeyxiexzf).f8808Ujhhgtgfeyxiexzf.removeCallbacksAndMessages(menuC0355Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC3507feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public Object mo1740Ujhhgtgfeyxiexzf() {
        switch (this.f9275Ujhhgtgfeyxiexzf) {
            case Opcodes.LLOAD /* 22 */:
                C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = (C2344Ujhhgtgfeyxiexzf) this.f9276Ujhhgtgfeyxiexzf;
                return new RunnableC3096Ujhhgtgfeyxiexzf((C3331feyxiexzfUjhhgtg) c2344Ujhhgtgfeyxiexzf.f7649Ujhhgtgfeyxiexzf, (C2366Ujhhgtgfeyxiexzf) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf);
            default:
                C3332feyxiexzfUjhhgtg c3332feyxiexzfUjhhgtg = (C3332feyxiexzfUjhhgtg) this.f9276Ujhhgtgfeyxiexzf;
                return new C3338Ujhhgtgfeyxiexzf((ExecutorServiceC3600feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10372Ujhhgtgfeyxiexzf, (ExecutorServiceC3600feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10373Ujhhgtgfeyxiexzf, (ExecutorServiceC3600feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10374Ujhhgtgfeyxiexzf, (ExecutorServiceC3600feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10375Ujhhgtgfeyxiexzf, (C3334feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10376Ujhhgtgfeyxiexzf, (C3334feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10377Ujhhgtgfeyxiexzf, (C2366Ujhhgtgfeyxiexzf) c3332feyxiexzfUjhhgtg.f10378Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC0360Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public boolean mo1571Ujhhgtgfeyxiexzf(MenuItem menuItem) {
        InterfaceC3010feyxiexzfUjhhgtg interfaceC3010feyxiexzfUjhhgtg = ((ActionMenuView) this.f9276Ujhhgtgfeyxiexzf).f89feyxiexzfUjhhgtg;
        if (interfaceC3010feyxiexzfUjhhgtg == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C1723Ujhhgtgfeyxiexzf) interfaceC3010feyxiexzfUjhhgtg).f5781Ujhhgtgfeyxiexzf.f181feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((AbstractC3560feyxiexzfUjhhgtg) it.next()).getClass();
        throw null;
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public int mo3852Ujhhgtgfeyxiexzf() {
        return (mo3853Ujhhgtgfeyxiexzf() << 8) | mo3853Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3106Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public Object mo753Ujhhgtgfeyxiexzf() {
        C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = (C0790feyxiexzfUjhhgtg) this.f9276Ujhhgtgfeyxiexzf;
        c0790feyxiexzfUjhhgtg.reset();
        return c0790feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo4442Ujhhgtgfeyxiexzf(Uri uri) {
        ((ContentInfo.Builder) this.f9276Ujhhgtgfeyxiexzf).setLinkUri(uri);
    }

    @Override // p000.InterfaceC3696feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo4443Ujhhgtgfeyxiexzf(int i) {
        ((ContentInfo.Builder) this.f9276Ujhhgtgfeyxiexzf).setFlags(i);
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public short mo3853Ujhhgtgfeyxiexzf() throws IOException {
        int i = ((InputStream) this.f9276Ujhhgtgfeyxiexzf).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C3131Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0358Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public void mo1568Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        ViewOnKeyListenerC2787feyxiexzfUjhhgtg viewOnKeyListenerC2787feyxiexzfUjhhgtg = (ViewOnKeyListenerC2787feyxiexzfUjhhgtg) this.f9276Ujhhgtgfeyxiexzf;
        Handler handler = viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8808Ujhhgtgfeyxiexzf;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8810Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0355Ujhhgtgfeyxiexzf == ((C2786Ujhhgtgfeyxiexzf) arrayList.get(i)).f8802Ujhhgtgfeyxiexzf) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC2785Ujhhgtgfeyxiexzf(this, i2 < arrayList.size() ? (C2786Ujhhgtgfeyxiexzf) arrayList.get(i2) : null, menuItemC0357Ujhhgtgfeyxiexzf, menuC0355Ujhhgtgfeyxiexzf), menuC0355Ujhhgtgfeyxiexzf, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC1319feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public C2256feyxiexzfUjhhgtg mo2853Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9276Ujhhgtgfeyxiexzf;
        if (!Objects.equals(coordinatorLayout.f233Ujhhgtgfeyxiexzf, c2256feyxiexzfUjhhgtg)) {
            coordinatorLayout.f233Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
            boolean z = c2256feyxiexzfUjhhgtg.m3452Ujhhgtgfeyxiexzf() > 0;
            coordinatorLayout.f234Ujhhgtgfeyxiexzf = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c2252Ujhhgtgfeyxiexzf.mo3440Ujhhgtgfeyxiexzf()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    if (childAt.getFitsSystemWindows() && ((C3726feyxiexzfUjhhgtg) childAt.getLayoutParams()).f11774Ujhhgtgfeyxiexzf != null && c2252Ujhhgtgfeyxiexzf.mo3440Ujhhgtgfeyxiexzf()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c2256feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int mo4444Ujhhgtgfeyxiexzf() {
        return ((ContentInfo) this.f9276Ujhhgtgfeyxiexzf).getFlags();
    }

    @Override // p000.InterfaceC3179feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public void mo2023Ujhhgtgfeyxiexzf() {
        C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) ((C3639Ujhhgtgfeyxiexzf) this.f9276Ujhhgtgfeyxiexzf).f11371Ujhhgtgfeyxiexzf;
        if (c3082Ujhhgtgfeyxiexzf.f995Ujhhgtgfeyxiexzf) {
            Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082Ujhhgtgfeyxiexzf, 1));
        }
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public int mo3854Ujhhgtgfeyxiexzf(int i, byte[] bArr) throws C3131Ujhhgtgfeyxiexzf {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f9276Ujhhgtgfeyxiexzf).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C3131Ujhhgtgfeyxiexzf();
        }
        return i2;
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ContentInfo mo4445Ujhhgtgfeyxiexzf() {
        return (ContentInfo) this.f9276Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0360Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public void mo1572Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        C1723Ujhhgtgfeyxiexzf c1723Ujhhgtgfeyxiexzf = ((ActionMenuView) this.f9276Ujhhgtgfeyxiexzf).f84Ujhhgtgfeyxiexzf;
        if (c1723Ujhhgtgfeyxiexzf != null) {
            c1723Ujhhgtgfeyxiexzf.mo1572Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        switch (this.f9275Ujhhgtgfeyxiexzf) {
            case 13:
                return new C2616feyxiexzfUjhhgtg(1, (C2466feyxiexzfUjhhgtg) this.f9276Ujhhgtgfeyxiexzf);
            default:
                return new C0613Ujhhgtgfeyxiexzf((C0709Ujhhgtgfeyxiexzf) this.f9276Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC3698Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int mo4446Ujhhgtgfeyxiexzf() {
        return ((ContentInfo) this.f9276Ujhhgtgfeyxiexzf).getSource();
    }

    @Override // p000.InterfaceC0372Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public boolean mo1600Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = (C3007Ujhhgtgfeyxiexzf) this.f9276Ujhhgtgfeyxiexzf;
        if (menuC0355Ujhhgtgfeyxiexzf == c3007Ujhhgtgfeyxiexzf.f9334Ujhhgtgfeyxiexzf) {
            return false;
        }
        c3007Ujhhgtgfeyxiexzf.f9354feyxiexzfUjhhgtg = ((SubMenuC1191feyxiexzfUjhhgtg) menuC0355Ujhhgtgfeyxiexzf).f4486Ujhhgtgfeyxiexzf.f2024Ujhhgtgfeyxiexzf;
        InterfaceC0372Ujhhgtgfeyxiexzf interfaceC0372Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf.f9336Ujhhgtgfeyxiexzf;
        if (interfaceC0372Ujhhgtgfeyxiexzf != null) {
            return interfaceC0372Ujhhgtgfeyxiexzf.mo1600Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public C2963feyxiexzfUjhhgtg mo4447feyxiexzfUjhhgtg(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public C2963feyxiexzfUjhhgtg mo4448feyxiexzfUjhhgtg(int i) {
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public int m4449feyxiexzfUjhhgtg(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        AbstractC0644Ujhhgtgfeyxiexzf abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf;
        C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg = (C3268feyxiexzfUjhhgtg) this.f9276Ujhhgtgfeyxiexzf;
        C3444feyxiexzfUjhhgtg c3444feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg.f10267Ujhhgtgfeyxiexzf;
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3056Ujhhgtgfeyxiexzf) {
            C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10264Ujhhgtgfeyxiexzf;
            c0395Ujhhgtgfeyxiexzf.m2563Ujhhgtgfeyxiexzf();
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) ((TreeMap) c0395Ujhhgtgfeyxiexzf.f2143Ujhhgtgfeyxiexzf).get((C3056Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
            if (abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3057Ujhhgtgfeyxiexzf) {
            C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
            c0395Ujhhgtgfeyxiexzf2.m2563Ujhhgtgfeyxiexzf();
            AbstractC0644Ujhhgtgfeyxiexzf abstractC0644Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) ((TreeMap) c0395Ujhhgtgfeyxiexzf2.f2143Ujhhgtgfeyxiexzf).get(((C3057Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9473Ujhhgtgfeyxiexzf);
            if (abstractC0644Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("not found: " + abstractC3638Ujhhgtgfeyxiexzf);
            }
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = abstractC0644Ujhhgtgfeyxiexzf;
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3756feyxiexzfUjhhgtg) {
            C0392Ujhhgtgfeyxiexzf c0392Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10268Ujhhgtgfeyxiexzf;
            c0392Ujhhgtgfeyxiexzf.m2563Ujhhgtgfeyxiexzf();
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) c0392Ujhhgtgfeyxiexzf.f2131Ujhhgtgfeyxiexzf.get((AbstractC3756feyxiexzfUjhhgtg) abstractC3638Ujhhgtgfeyxiexzf);
            if (abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3140Ujhhgtgfeyxiexzf) {
            c3444feyxiexzfUjhhgtg.m2563Ujhhgtgfeyxiexzf();
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) c3444feyxiexzfUjhhgtg.f10726Ujhhgtgfeyxiexzf.get((C3140Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
            if (abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3139Ujhhgtgfeyxiexzf) {
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = c3444feyxiexzfUjhhgtg.m4944Ujhhgtgfeyxiexzf(((C3139Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).m4656Ujhhgtgfeyxiexzf());
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3156Ujhhgtgfeyxiexzf) {
            C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf3 = c3268feyxiexzfUjhhgtg.f10266Ujhhgtgfeyxiexzf;
            c0395Ujhhgtgfeyxiexzf3.getClass();
            c0395Ujhhgtgfeyxiexzf3.m2563Ujhhgtgfeyxiexzf();
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) ((TreeMap) c0395Ujhhgtgfeyxiexzf3.f2143Ujhhgtgfeyxiexzf).get(((C3156Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9768Ujhhgtgfeyxiexzf);
            if (abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3153Ujhhgtgfeyxiexzf) {
            C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf4 = c3268feyxiexzfUjhhgtg.f10272Ujhhgtgfeyxiexzf;
            c0395Ujhhgtgfeyxiexzf4.m2563Ujhhgtgfeyxiexzf();
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) ((TreeMap) c0395Ujhhgtgfeyxiexzf4.f2143Ujhhgtgfeyxiexzf).get((C3153Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
            if (abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("not found");
            }
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3136Ujhhgtgfeyxiexzf) {
            C2635feyxiexzfUjhhgtg c2635feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg.f10271Ujhhgtgfeyxiexzf;
            c2635feyxiexzfUjhhgtg.m2563Ujhhgtgfeyxiexzf();
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) c2635feyxiexzfUjhhgtg.f8474Ujhhgtgfeyxiexzf.get((C3136Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
            if (abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("not found");
            }
        } else {
            abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf = null;
        }
        if (abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf == null) {
            return -1;
        }
        return abstractC0644UjhhgtgfeyxiexzfM4944Ujhhgtgfeyxiexzf.m1909Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public int m4450feyxiexzfUjhhgtg(int i) {
        int[] iArr = ((DialogXBaseRelativeLayout) this.f9276Ujhhgtgfeyxiexzf).f1029Ujhhgtgfeyxiexzf;
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
        if (iM2713feyxiexzfUjhhgtg == 0) {
            return iArr[0];
        }
        if (iM2713feyxiexzfUjhhgtg == 1) {
            return iArr[1];
        }
        if (iM2713feyxiexzfUjhhgtg == 2) {
            return iArr[2];
        }
        if (iM2713feyxiexzfUjhhgtg != 3) {
            return 0;
        }
        return iArr[3];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean mo4451feyxiexzfUjhhgtg(int i, int i2, Bundle bundle) {
        return false;
    }

    public C2965Ujhhgtgfeyxiexzf(InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f9275Ujhhgtgfeyxiexzf = 29;
        C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = new C0790feyxiexzfUjhhgtg(inputStream, c0271Ujhhgtgfeyxiexzf);
        this.f9276Ujhhgtgfeyxiexzf = c0790feyxiexzfUjhhgtg;
        c0790feyxiexzfUjhhgtg.mark(5242880);
    }

    public C2965Ujhhgtgfeyxiexzf(TextView textView) {
        this.f9275Ujhhgtgfeyxiexzf = 21;
        this.f9276Ujhhgtgfeyxiexzf = new C3322feyxiexzfUjhhgtg(textView);
    }

    public C2965Ujhhgtgfeyxiexzf(EditText editText) {
        this.f9275Ujhhgtgfeyxiexzf = 20;
        this.f9276Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(editText, 10);
    }

    public C2965Ujhhgtgfeyxiexzf(int i) {
        this.f9275Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 4:
                this.f9276Ujhhgtgfeyxiexzf = new HashSet();
                break;
            case 13:
                this.f9276Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(15);
                break;
            case 15:
                this.f9276Ujhhgtgfeyxiexzf = new ConcurrentHashMap(16);
                break;
            case 19:
                PrintStream printStream = System.out;
                PrintStream printStream2 = System.err;
                this.f9276Ujhhgtgfeyxiexzf = new C1467feyxiexzfUjhhgtg(0);
                new PrintStream(new C3243feyxiexzfUjhhgtg());
                new PrintStream(printStream);
                new PrintStream(printStream2);
                break;
            case Opcodes.ALOAD /* 25 */:
                break;
            case 26:
                this.f9276Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(8);
                break;
            default:
                this.f9276Ujhhgtgfeyxiexzf = new C2964feyxiexzfUjhhgtg(this);
                break;
        }
    }

    public C2965Ujhhgtgfeyxiexzf(ContentInfo contentInfo) {
        this.f9275Ujhhgtgfeyxiexzf = 10;
        contentInfo.getClass();
        this.f9276Ujhhgtgfeyxiexzf = AbstractC2666Ujhhgtgfeyxiexzf.m4000Ujhhgtgfeyxiexzf(contentInfo);
    }

    public C2965Ujhhgtgfeyxiexzf(ClipData clipData, int i) {
        this.f9275Ujhhgtgfeyxiexzf = 9;
        this.f9276Ujhhgtgfeyxiexzf = AbstractC2666Ujhhgtgfeyxiexzf.m3998Ujhhgtgfeyxiexzf(clipData, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public void mo3568Ujhhgtgfeyxiexzf(int i) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public void mo3569Ujhhgtgfeyxiexzf(int i) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public void mo3570Ujhhgtgfeyxiexzf(int i, float f) {
    }
}
