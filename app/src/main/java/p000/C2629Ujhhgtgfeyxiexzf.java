package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.hd.wauxv.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2629Ujhhgtgfeyxiexzf implements InterfaceC0887feyxiexzfUjhhgtg, InterfaceC3294Ujhhgtgfeyxiexzf, InterfaceC0401Ujhhgtgfeyxiexzf, InterfaceC2487feyxiexzfUjhhgtg, InterfaceC3077Ujhhgtgfeyxiexzf, InterfaceC3217feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8460Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f8461Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f8462Ujhhgtgfeyxiexzf;

    static {
        new C2496feyxiexzfUjhhgtg();
    }

    public /* synthetic */ C2629Ujhhgtgfeyxiexzf(int i, boolean z) {
        this.f8460Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C3030feyxiexzfUjhhgtg m3931Ujhhgtgfeyxiexzf(ImageDecoder.Source source, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C3125Ujhhgtgfeyxiexzf(i, i2, c1471feyxiexzfUjhhgtg));
        if (AbstractC2951feyxiexzfUjhhgtg.m4332Ujhhgtgfeyxiexzf(drawableDecodeDrawable)) {
            return new C3030feyxiexzfUjhhgtg(0, AbstractC2951feyxiexzfUjhhgtg.m4315Ujhhgtgfeyxiexzf(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    @Override // p000.InterfaceC3294Ujhhgtgfeyxiexzf
    public Object getResult() {
        return (C1945feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf;
    }

    public String toString() {
        switch (this.f8460Ujhhgtgfeyxiexzf) {
            case 15:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf = (C0545Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
                C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf2 = c0545Ujhhgtgfeyxiexzf.f2535Ujhhgtgfeyxiexzf;
                boolean z = false;
                while (!c0545Ujhhgtgfeyxiexzf2.equals(c0545Ujhhgtgfeyxiexzf)) {
                    sb.append('{');
                    sb.append(c0545Ujhhgtgfeyxiexzf2.f2533Ujhhgtgfeyxiexzf);
                    sb.append(':');
                    ArrayList arrayList = c0545Ujhhgtgfeyxiexzf2.f2534Ujhhgtgfeyxiexzf;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c0545Ujhhgtgfeyxiexzf2 = c0545Ujhhgtgfeyxiexzf2.f2535Ujhhgtgfeyxiexzf;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC3294Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean mo3932Ujhhgtgfeyxiexzf(CharSequence charSequence, int i, int i2, C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg) {
        if ((c1776feyxiexzfUjhhgtg.f5955Ujhhgtgfeyxiexzf & 4) > 0) {
            return true;
        }
        if (((C1945feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf) == null) {
            this.f8461Ujhhgtgfeyxiexzf = new C1945feyxiexzfUjhhgtg(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C2466feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf).getClass();
        ((C1945feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf).setSpan(new C1777feyxiexzfUjhhgtg(c1776feyxiexzfUjhhgtg), i, i2, 33);
        return true;
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public Drawable mo1682Ujhhgtgfeyxiexzf(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f8462Ujhhgtgfeyxiexzf;
        C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf.getClass();
        String str = (String) C3613Ujhhgtgfeyxiexzf.f11239Ujhhgtgfeyxiexzf.getValue();
        List list = (List) this.f8461Ujhhgtgfeyxiexzf;
        File file = new File(str, ((C3485Ujhhgtgfeyxiexzf) list.get(i)).f10822Ujhhgtgfeyxiexzf);
        Bitmap bitmapM4203feyxiexzfUjhhgtg = (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(((C3485Ujhhgtgfeyxiexzf) list.get(i)).f10822Ujhhgtgfeyxiexzf) || !file.isFile()) ? null : AbstractC2855feyxiexzfUjhhgtg.m4203feyxiexzfUjhhgtg(file);
        return bitmapM4203feyxiexzfUjhhgtg != null ? new BitmapDrawable(viewGroup.getContext().getResources(), bitmapM4203feyxiexzfUjhhgtg) : AbstractC0889feyxiexzfUjhhgtg.m2368Ujhhgtgfeyxiexzf(viewGroup.getContext(), R.drawable.ic_float_button_menu_24dp);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m3933Ujhhgtgfeyxiexzf(C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg) {
        if (((ArrayList) this.f8462Ujhhgtgfeyxiexzf) == null) {
            this.f8462Ujhhgtgfeyxiexzf = new ArrayList();
        }
        int size = ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).size();
        for (int i = 0; i < size; i++) {
            C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg2 = (C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(i);
            if (c1143feyxiexzfUjhhgtg2.f4326Ujhhgtgfeyxiexzf == c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf) {
                ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).remove(i);
            }
            if (c1143feyxiexzfUjhhgtg2.f4326Ujhhgtgfeyxiexzf >= c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf) {
                ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).add(i, c1143feyxiexzfUjhhgtg);
                return;
            }
        }
        ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).add(c1143feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo1799Ujhhgtgfeyxiexzf(Exception exc) {
        C1226feyxiexzfUjhhgtg c1226feyxiexzfUjhhgtg = (C1226feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf = (C0286Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf2 = c1226feyxiexzfUjhhgtg.f4552Ujhhgtgfeyxiexzf;
        if (c0286Ujhhgtgfeyxiexzf2 == null || c0286Ujhhgtgfeyxiexzf2 != c0286Ujhhgtgfeyxiexzf) {
            return;
        }
        C1226feyxiexzfUjhhgtg c1226feyxiexzfUjhhgtg2 = (C1226feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf3 = (C0286Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        RunnableC3096Ujhhgtgfeyxiexzf runnableC3096Ujhhgtgfeyxiexzf = c1226feyxiexzfUjhhgtg2.f4548Ujhhgtgfeyxiexzf;
        C3069Ujhhgtgfeyxiexzf c3069Ujhhgtgfeyxiexzf = c1226feyxiexzfUjhhgtg2.f4553Ujhhgtgfeyxiexzf;
        InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf = c0286Ujhhgtgfeyxiexzf3.f1719Ujhhgtgfeyxiexzf;
        runnableC3096Ujhhgtgfeyxiexzf.mo2717Ujhhgtgfeyxiexzf(c3069Ujhhgtgfeyxiexzf, exc, interfaceC3078Ujhhgtgfeyxiexzf, interfaceC3078Ujhhgtgfeyxiexzf.mo1384Ujhhgtgfeyxiexzf());
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public int mo1683Ujhhgtgfeyxiexzf() {
        return Color.parseColor((AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(((ViewGroup) this.f8462Ujhhgtgfeyxiexzf).getContext()) ? C3486feyxiexzfUjhhgtg.f10826Ujhhgtgfeyxiexzf : C3482Ujhhgtgfeyxiexzf.f10817Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public int mo1684Ujhhgtgfeyxiexzf() {
        return ((List) this.f8461Ujhhgtgfeyxiexzf).size();
    }

    @Override // p000.InterfaceC2487feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public void mo2015Ujhhgtgfeyxiexzf(C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg) {
        if (((C0906feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf).m2388Ujhhgtgfeyxiexzf(c2495feyxiexzfUjhhgtg)) {
            ((C0684Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf).m1942Ujhhgtgfeyxiexzf(c2495feyxiexzfUjhhgtg.f8152Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC3217feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public void mo3703Ujhhgtgfeyxiexzf() {
        C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = (C0790feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf;
        synchronized (c0790feyxiexzfUjhhgtg) {
            c0790feyxiexzfUjhhgtg.f3101Ujhhgtgfeyxiexzf = c0790feyxiexzfUjhhgtg.f3099Ujhhgtgfeyxiexzf.length;
        }
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public int mo1685Ujhhgtgfeyxiexzf() {
        return Color.parseColor((AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(((ViewGroup) this.f8462Ujhhgtgfeyxiexzf).getContext()) ? C3481Ujhhgtgfeyxiexzf.f10816Ujhhgtgfeyxiexzf : C3484feyxiexzfUjhhgtg.f10819Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
    }

    @Override // p000.InterfaceC3330Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public boolean mo2018Ujhhgtgfeyxiexzf(Object obj, File file, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return ((C2514feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf).mo2018Ujhhgtgfeyxiexzf(new C2511feyxiexzfUjhhgtg((InterfaceC2512feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf, ((BitmapDrawable) ((InterfaceC0901feyxiexzfUjhhgtg) obj).get()).getBitmap()), file, c1471feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public void mo1801Ujhhgtgfeyxiexzf(Object obj) {
        C1226feyxiexzfUjhhgtg c1226feyxiexzfUjhhgtg = (C1226feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf = (C0286Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf2 = c1226feyxiexzfUjhhgtg.f4552Ujhhgtgfeyxiexzf;
        if (c0286Ujhhgtgfeyxiexzf2 == null || c0286Ujhhgtgfeyxiexzf2 != c0286Ujhhgtgfeyxiexzf) {
            return;
        }
        C1226feyxiexzfUjhhgtg c1226feyxiexzfUjhhgtg2 = (C1226feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf3 = (C0286Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        C3183feyxiexzfUjhhgtg c3183feyxiexzfUjhhgtg = c1226feyxiexzfUjhhgtg2.f4547Ujhhgtgfeyxiexzf.f9562Ujhhgtgfeyxiexzf;
        if (obj != null && c3183feyxiexzfUjhhgtg.m4679Ujhhgtgfeyxiexzf(c0286Ujhhgtgfeyxiexzf3.f1719Ujhhgtgfeyxiexzf.mo1384Ujhhgtgfeyxiexzf())) {
            c1226feyxiexzfUjhhgtg2.f4551Ujhhgtgfeyxiexzf = obj;
            c1226feyxiexzfUjhhgtg2.f4548Ujhhgtgfeyxiexzf.m4601Ujhhgtgfeyxiexzf(2);
        } else {
            RunnableC3096Ujhhgtgfeyxiexzf runnableC3096Ujhhgtgfeyxiexzf = c1226feyxiexzfUjhhgtg2.f4548Ujhhgtgfeyxiexzf;
            InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf = c0286Ujhhgtgfeyxiexzf3.f1717Ujhhgtgfeyxiexzf;
            InterfaceC3078Ujhhgtgfeyxiexzf interfaceC3078Ujhhgtgfeyxiexzf = c0286Ujhhgtgfeyxiexzf3.f1719Ujhhgtgfeyxiexzf;
            runnableC3096Ujhhgtgfeyxiexzf.mo2716Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, obj, interfaceC3078Ujhhgtgfeyxiexzf, interfaceC3078Ujhhgtgfeyxiexzf.mo1384Ujhhgtgfeyxiexzf(), c1226feyxiexzfUjhhgtg2.f4553Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC0887feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public int mo2365Ujhhgtgfeyxiexzf(C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return 2;
    }

    @Override // p000.InterfaceC3217feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public void mo3705Ujhhgtgfeyxiexzf(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Bitmap bitmap) throws IOException {
        IOException iOException = ((C3356feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf).f10475Ujhhgtgfeyxiexzf;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC2512feyxiexzfUjhhgtg.mo1472Ujhhgtgfeyxiexzf(bitmap);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public void m3934Ujhhgtgfeyxiexzf() {
        int[] iArr = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f8462Ujhhgtgfeyxiexzf = null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3935Ujhhgtgfeyxiexzf(int i) {
        int[] iArr = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f8461Ujhhgtgfeyxiexzf = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f8461Ujhhgtgfeyxiexzf = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f8461Ujhhgtgfeyxiexzf;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public void m3936Ujhhgtgfeyxiexzf(int i) {
        ArrayList arrayList = (ArrayList) this.f8462Ujhhgtgfeyxiexzf;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(size)).f4326Ujhhgtgfeyxiexzf >= i) {
                    ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).remove(size);
                }
            }
        }
        m3945feyxiexzfUjhhgtg(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Object m3937Ujhhgtgfeyxiexzf(InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtg) {
        HashMap map = (HashMap) this.f8462Ujhhgtgfeyxiexzf;
        C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf = (C0545Ujhhgtgfeyxiexzf) map.get(interfaceC1436feyxiexzfUjhhgtg);
        if (c0545Ujhhgtgfeyxiexzf == null) {
            c0545Ujhhgtgfeyxiexzf = new C0545Ujhhgtgfeyxiexzf(interfaceC1436feyxiexzfUjhhgtg);
            map.put(interfaceC1436feyxiexzfUjhhgtg, c0545Ujhhgtgfeyxiexzf);
        } else {
            interfaceC1436feyxiexzfUjhhgtg.mo1477Ujhhgtgfeyxiexzf();
        }
        C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf2 = c0545Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf;
        c0545Ujhhgtgfeyxiexzf2.f2535Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf.f2535Ujhhgtgfeyxiexzf;
        c0545Ujhhgtgfeyxiexzf.f2535Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf2;
        C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf3 = (C0545Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        c0545Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf3;
        C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf4 = c0545Ujhhgtgfeyxiexzf3.f2535Ujhhgtgfeyxiexzf;
        c0545Ujhhgtgfeyxiexzf.f2535Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf4;
        c0545Ujhhgtgfeyxiexzf4.f2536Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf;
        c0545Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf.f2535Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c0545Ujhhgtgfeyxiexzf.f2534Ujhhgtgfeyxiexzf;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c0545Ujhhgtgfeyxiexzf.f2534Ujhhgtgfeyxiexzf.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public C1143feyxiexzfUjhhgtg m3938Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f8462Ujhhgtgfeyxiexzf;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg = (C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(i4);
            int i5 = c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || c1143feyxiexzfUjhhgtg.f4327Ujhhgtgfeyxiexzf == i3 || c1143feyxiexzfUjhhgtg.f4329Ujhhgtgfeyxiexzf)) {
                return c1143feyxiexzfUjhhgtg;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public C1143feyxiexzfUjhhgtg m3939Ujhhgtgfeyxiexzf(int i) {
        ArrayList arrayList = (ArrayList) this.f8462Ujhhgtgfeyxiexzf;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg = (C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(size);
            if (c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf == i) {
                return c1143feyxiexzfUjhhgtg;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public KeyListener m3940Ujhhgtgfeyxiexzf(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C2629Ujhhgtgfeyxiexzf) ((C2965Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf).getClass();
        if (keyListener instanceof C3286Ujhhgtgfeyxiexzf) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C3286Ujhhgtgfeyxiexzf(keyListener);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public SharedPreferencesC3515Ujhhgtgfeyxiexzf m3941Ujhhgtgfeyxiexzf() {
        return (SharedPreferencesC3515Ujhhgtgfeyxiexzf) ((C2065feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf).getValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public synchronized List m3942Ujhhgtgfeyxiexzf(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f8461Ujhhgtgfeyxiexzf).contains(str)) {
                ((ArrayList) this.f8461Ujhhgtgfeyxiexzf).add(str);
            }
            arrayList = (List) ((HashMap) this.f8462Ujhhgtgfeyxiexzf).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f8462Ujhhgtgfeyxiexzf).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public synchronized ArrayList m3943Ujhhgtgfeyxiexzf(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f8461Ujhhgtgfeyxiexzf).iterator();
        while (it.hasNext()) {
            List<C0885feyxiexzfUjhhgtg> list = (List) ((HashMap) this.f8462Ujhhgtgfeyxiexzf).get((String) it.next());
            if (list != null) {
                for (C0885feyxiexzfUjhhgtg c0885feyxiexzfUjhhgtg : list) {
                    if ((c0885feyxiexzfUjhhgtg.f3425Ujhhgtgfeyxiexzf.isAssignableFrom(cls) && cls2.isAssignableFrom(c0885feyxiexzfUjhhgtg.f3426Ujhhgtgfeyxiexzf)) && !arrayList.contains(c0885feyxiexzfUjhhgtg.f3426Ujhhgtgfeyxiexzf)) {
                        arrayList.add(c0885feyxiexzfUjhhgtg.f3426Ujhhgtgfeyxiexzf);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public String m3944feyxiexzfUjhhgtg(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf) {
        String str;
        synchronized (((C0179Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf)) {
            str = (String) ((C0179Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf).m1245Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf);
        }
        if (str == null) {
            C0941feyxiexzfUjhhgtg c0941feyxiexzfUjhhgtg = (C0941feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf).mo2933Ujhhgtgfeyxiexzf();
            try {
                interfaceC0156Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(c0941feyxiexzfUjhhgtg.f3784Ujhhgtgfeyxiexzf);
                byte[] bArrDigest = c0941feyxiexzfUjhhgtg.f3784Ujhhgtgfeyxiexzf.digest();
                char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6240Ujhhgtgfeyxiexzf;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & ek.m];
                    }
                    str = new String(cArr);
                }
                ((C2366Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf).mo2932Ujhhgtgfeyxiexzf(c0941feyxiexzfUjhhgtg);
            } catch (Throwable th) {
                ((C2366Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf).mo2932Ujhhgtgfeyxiexzf(c0941feyxiexzfUjhhgtg);
                throw th;
            }
        }
        synchronized (((C0179Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf)) {
            ((C0179Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf).m1248Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, str);
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public int m3945feyxiexzfUjhhgtg(int i) {
        int i2;
        int[] iArr = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        if (((ArrayList) this.f8462Ujhhgtgfeyxiexzf) != null) {
            C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf = m3939Ujhhgtgfeyxiexzf(i);
            if (c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf != null) {
                ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).remove(c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf);
            }
            int size = ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(i3)).f4326Ujhhgtgfeyxiexzf >= i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg = (C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(i3);
                ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).remove(i3);
                i2 = c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf;
            } else {
                i2 = -1;
            }
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            int[] iArr2 = (int[]) this.f8461Ujhhgtgfeyxiexzf;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return ((int[]) this.f8461Ujhhgtgfeyxiexzf).length;
        }
        int iMin = Math.min(i2 + 1, ((int[]) this.f8461Ujhhgtgfeyxiexzf).length);
        Arrays.fill((int[]) this.f8461Ujhhgtgfeyxiexzf, i, iMin, -1);
        return iMin;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m3946feyxiexzfUjhhgtg(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f8461Ujhhgtgfeyxiexzf).getContext().obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3164Ujhhgtgfeyxiexzf, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m3966feyxiexzfUjhhgtg(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public void m3947feyxiexzfUjhhgtg(int i, int i2) {
        int[] iArr = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m3935Ujhhgtgfeyxiexzf(i3);
        int[] iArr2 = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f8461Ujhhgtgfeyxiexzf, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f8462Ujhhgtgfeyxiexzf;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg = (C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(size);
            int i4 = c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf;
            if (i4 >= i) {
                c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public void m3948feyxiexzfUjhhgtg(int i, int i2) {
        int[] iArr = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m3935Ujhhgtgfeyxiexzf(i3);
        int[] iArr2 = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f8461Ujhhgtgfeyxiexzf;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f8462Ujhhgtgfeyxiexzf;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg = (C1143feyxiexzfUjhhgtg) ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).get(size);
            int i4 = c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f8462Ujhhgtgfeyxiexzf).remove(size);
                } else {
                    c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public C3288Ujhhgtgfeyxiexzf m3949feyxiexzfUjhhgtg(InputConnection inputConnection, EditorInfo editorInfo) {
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = (C2965Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf;
        if (inputConnection == null) {
            c2965Ujhhgtgfeyxiexzf.getClass();
            inputConnection = null;
        } else {
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = (C2629Ujhhgtgfeyxiexzf) c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf;
            c2629Ujhhgtgfeyxiexzf.getClass();
            if (!(inputConnection instanceof C3288Ujhhgtgfeyxiexzf)) {
                inputConnection = new C3288Ujhhgtgfeyxiexzf((EditText) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf, inputConnection, editorInfo);
            }
        }
        return (C3288Ujhhgtgfeyxiexzf) inputConnection;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public void m3950feyxiexzfUjhhgtg(C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf) {
        ExecutorC0898feyxiexzfUjhhgtg executorC0898feyxiexzfUjhhgtg = (ExecutorC0898feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = (C0709Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        int i = c3629Ujhhgtgfeyxiexzf.f11344Ujhhgtgfeyxiexzf;
        if (i == 0) {
            executorC0898feyxiexzfUjhhgtg.execute(new RunnableC3003feyxiexzfUjhhgtg(c0709Ujhhgtgfeyxiexzf, c3629Ujhhgtgfeyxiexzf.f11343Ujhhgtgfeyxiexzf, 1, false));
        } else {
            executorC0898feyxiexzfUjhhgtg.execute(new RunnableC2474feyxiexzfUjhhgtg(i, 1, c0709Ujhhgtgfeyxiexzf));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public C2413Ujhhgtgfeyxiexzf m3951feyxiexzfUjhhgtg(int i) throws IOException {
        m3965feyxiexzfUjhhgtg(4);
        C2628feyxiexzfUjhhgtg c2628feyxiexzfUjhhgtg = (C2628feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf;
        int unsignedShort = c2628feyxiexzfUjhhgtg.readUnsignedShort();
        int unsignedShort2 = c2628feyxiexzfUjhhgtg.readUnsignedShort();
        C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg = (C1132feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf = new C2413Ujhhgtgfeyxiexzf(new C3057Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg.m3114Ujhhgtgfeyxiexzf(((C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(unsignedShort)).f9450Ujhhgtgfeyxiexzf)), i);
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            m3965feyxiexzfUjhhgtg(5);
            c2413Ujhhgtgfeyxiexzf.m3665Ujhhgtgfeyxiexzf(new C0412Ujhhgtgfeyxiexzf((C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2628feyxiexzfUjhhgtg.readUnsignedShort()), m3960feyxiexzfUjhhgtg()));
        }
        c2413Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        return c2413Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public C2425Ujhhgtgfeyxiexzf m3952feyxiexzfUjhhgtg(int i) {
        C2628feyxiexzfUjhhgtg c2628feyxiexzfUjhhgtg = (C2628feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf;
        try {
            int unsignedShort = c2628feyxiexzfUjhhgtg.readUnsignedShort();
            C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf = new C2425Ujhhgtgfeyxiexzf();
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                c2425Ujhhgtgfeyxiexzf.m3673Ujhhgtgfeyxiexzf(m3951feyxiexzfUjhhgtg(i));
            }
            c2425Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
            if (c2628feyxiexzfUjhhgtg.available() == 0) {
                return c2425Ujhhgtgfeyxiexzf;
            }
            throw new C1404feyxiexzfUjhhgtg("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public AbstractC3638Ujhhgtgfeyxiexzf m3953feyxiexzfUjhhgtg() throws IOException {
        return ((C1132feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf).m2601Ujhhgtgfeyxiexzf(((C2628feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf).readUnsignedShort());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public void m3954feyxiexzfUjhhgtg(Context context, XmlResourceParser xmlResourceParser) {
        C3654Ujhhgtgfeyxiexzf c3654Ujhhgtgfeyxiexzf = new C3654Ujhhgtgfeyxiexzf();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C3649Ujhhgtgfeyxiexzf c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf.m5309Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11477Ujhhgtgfeyxiexzf.m5310Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11476Ujhhgtgfeyxiexzf.m5311Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11479Ujhhgtgfeyxiexzf.m5312Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf = C3654Ujhhgtgfeyxiexzf.m5314Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xmlResourceParser));
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf.f11482Ujhhgtgfeyxiexzf = true;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf = C3654Ujhhgtgfeyxiexzf.m5314Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xmlResourceParser));
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf.f11536feyxiexzfUjhhgtg = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C3642Ujhhgtgfeyxiexzf.m5297Ujhhgtgfeyxiexzf(context, xmlResourceParser, c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11480Ujhhgtgfeyxiexzf);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf = C3654Ujhhgtgfeyxiexzf.m5314Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xmlResourceParser));
                                    }
                                    break;
                            }
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name2 = xmlResourceParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                ((SparseArray) this.f8462Ujhhgtgfeyxiexzf).put(identifier, c3654Ujhhgtgfeyxiexzf);
                                return;
                            } else if (name2.equalsIgnoreCase("Constraint")) {
                                c3654Ujhhgtgfeyxiexzf.f11569Ujhhgtgfeyxiexzf.put(Integer.valueOf(c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11475Ujhhgtgfeyxiexzf), c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf);
                                c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.f8462Ujhhgtgfeyxiexzf).put(identifier, c3654Ujhhgtgfeyxiexzf);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int m3955feyxiexzfUjhhgtg(int i, InterfaceC2630Ujhhgtgfeyxiexzf interfaceC2630Ujhhgtgfeyxiexzf) {
        int i2 = i;
        C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg = (C1132feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        byte[] bArr = c2610Ujhhgtgfeyxiexzf.f8421Ujhhgtgfeyxiexzf;
        try {
            int iM3904Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i2);
            int i3 = AbstractC2651Ujhhgtgfeyxiexzf.f8508Ujhhgtgfeyxiexzf[iM3904Ujhhgtgfeyxiexzf];
            try {
                switch (iM3904Ujhhgtgfeyxiexzf) {
                    case 0:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf);
                        return 1;
                    case 1:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3147Ujhhgtgfeyxiexzf.f9755Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 2:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3144Ujhhgtgfeyxiexzf.f9741Ujhhgtgfeyxiexzf, -1);
                        return 1;
                    case 3:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3144Ujhhgtgfeyxiexzf.f9742Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 4:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3144Ujhhgtgfeyxiexzf.f9743Ujhhgtgfeyxiexzf, 1);
                        return 1;
                    case 5:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3144Ujhhgtgfeyxiexzf.f9744Ujhhgtgfeyxiexzf, 2);
                        return 1;
                    case 6:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3144Ujhhgtgfeyxiexzf.f9745Ujhhgtgfeyxiexzf, 3);
                        return 1;
                    case 7:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3144Ujhhgtgfeyxiexzf.f9746Ujhhgtgfeyxiexzf, 4);
                        return 1;
                    case 8:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3144Ujhhgtgfeyxiexzf.f9747Ujhhgtgfeyxiexzf, 5);
                        return 1;
                    case 9:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3151Ujhhgtgfeyxiexzf.f9758Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 10:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3151Ujhhgtgfeyxiexzf.f9759Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 11:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3141Ujhhgtgfeyxiexzf.f9733Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case Opcodes.FCONST_1 /* 12 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3141Ujhhgtgfeyxiexzf.f9734Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 13:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3141Ujhhgtgfeyxiexzf.f9735Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case Opcodes.DCONST_0 /* 14 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3138Ujhhgtgfeyxiexzf.f9730Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 15:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 1, C3138Ujhhgtgfeyxiexzf.f9731Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 16:
                        int i4 = i + 1;
                        c2610Ujhhgtgfeyxiexzf.m3899Ujhhgtgfeyxiexzf(i4, i + 2);
                        byte b = bArr[i4];
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 2, C3144Ujhhgtgfeyxiexzf.m4660Ujhhgtgfeyxiexzf(b), b);
                        return 2;
                    case Opcodes.SIPUSH /* 17 */:
                        int iM3903Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3903Ujhhgtgfeyxiexzf(i + 1);
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 3, C3144Ujhhgtgfeyxiexzf.m4660Ujhhgtgfeyxiexzf(iM3903Ujhhgtgfeyxiexzf), iM3903Ujhhgtgfeyxiexzf);
                        return 3;
                    case Opcodes.LDC /* 18 */:
                        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf = c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1));
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 2, abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf, abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf instanceof C3144Ujhhgtgfeyxiexzf ? ((C3144Ujhhgtgfeyxiexzf) abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf).m4661Ujhhgtgfeyxiexzf() : 0);
                        return 2;
                    case 19:
                        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf2 = c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i + 1));
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(18, i, 3, abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf2, abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf2 instanceof C3144Ujhhgtgfeyxiexzf ? ((C3144Ujhhgtgfeyxiexzf) abstractC3638UjhhgtgfeyxiexzfM2601Ujhhgtgfeyxiexzf2).m4661Ujhhgtgfeyxiexzf() : 0);
                        return 3;
                    case 20:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(20, i, 3, c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i + 1)), 0);
                        return 3;
                    case Opcodes.ILOAD /* 21 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.LLOAD /* 22 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.FLOAD /* 23 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.DLOAD /* 24 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.ALOAD /* 25 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg, 0);
                        return 2;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 1, iM3904Ujhhgtgfeyxiexzf - 26, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 1, iM3904Ujhhgtgfeyxiexzf - 30, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 1, iM3904Ujhhgtgfeyxiexzf - 34, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 1, iM3904Ujhhgtgfeyxiexzf - 38, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i2, 1, iM3904Ujhhgtgfeyxiexzf - 42, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg, 0);
                        return 1;
                    case Opcodes.IALOAD /* 46 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                        return 1;
                    case 47:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf);
                        return 1;
                    case 48:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf);
                        return 1;
                    case 49:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.AALOAD /* 50 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
                        return 1;
                    case Opcodes.BALOAD /* 51 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5980Ujhhgtgfeyxiexzf);
                        return 1;
                    case 52:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5981Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.SALOAD /* 53 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(46, i2, C1784feyxiexzfUjhhgtg.f5986Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.ISTORE /* 54 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.LSTORE /* 55 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.FSTORE /* 56 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.DSTORE /* 57 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.ASTORE /* 58 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1), C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg, 0);
                        return 2;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 1, iM3904Ujhhgtgfeyxiexzf - 59, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 1, iM3904Ujhhgtgfeyxiexzf - 63, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 1, iM3904Ujhhgtgfeyxiexzf - 67, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 1, iM3904Ujhhgtgfeyxiexzf - 71, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf, 0);
                        return 1;
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i2, 1, iM3904Ujhhgtgfeyxiexzf - 75, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg, 0);
                        return 1;
                    case Opcodes.IASTORE /* 79 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                        return 1;
                    case 80:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf);
                        return 1;
                    case 81:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf);
                        return 1;
                    case 82:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.AASTORE /* 83 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
                        return 1;
                    case Opcodes.BASTORE /* 84 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5980Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.CASTORE /* 85 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5981Ujhhgtgfeyxiexzf);
                        return 1;
                    case 86:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(79, i2, C1784feyxiexzfUjhhgtg.f5986Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.POP /* 87 */:
                    case Opcodes.POP2 /* 88 */:
                    case Opcodes.DUP /* 89 */:
                    case 90:
                    case 91:
                    case Opcodes.DUP2 /* 92 */:
                    case 93:
                    case 94:
                    case Opcodes.SWAP /* 95 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.IADD /* 96 */:
                    case 100:
                    case 104:
                    case Opcodes.IDIV /* 108 */:
                    case 112:
                    case Opcodes.INEG /* 116 */:
                    case 120:
                    case 122:
                    case Opcodes.IUSHR /* 124 */:
                    case 126:
                    case 128:
                    case Opcodes.IXOR /* 130 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.LADD /* 97 */:
                    case 101:
                    case 105:
                    case Opcodes.LDIV /* 109 */:
                    case 113:
                    case Opcodes.LNEG /* 117 */:
                    case 121:
                    case Opcodes.LSHR /* 123 */:
                    case Opcodes.LUSHR /* 125 */:
                    case 127:
                    case Opcodes.LOR /* 129 */:
                    case Opcodes.LXOR /* 131 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf - 1, i2, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf);
                        return 1;
                    case 98:
                    case 102:
                    case 106:
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    case Opcodes.FNEG /* 118 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf - 2, i2, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf);
                        return 1;
                    case 99:
                    case 103:
                    case 107:
                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    case 115:
                    case Opcodes.DNEG /* 119 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf - 3, i2, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.IINC /* 132 */:
                        int iM3904Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i2 + 1);
                        int i5 = i2 + 2;
                        c2610Ujhhgtgfeyxiexzf.m3899Ujhhgtgfeyxiexzf(i5, i2 + 3);
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, 3, iM3904Ujhhgtgfeyxiexzf2, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, bArr[i5]);
                        return 3;
                    case Opcodes.I2L /* 133 */:
                    case Opcodes.F2L /* 140 */:
                    case Opcodes.D2L /* 143 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.I2F /* 134 */:
                    case 137:
                    case 144:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.I2D /* 135 */:
                    case 138:
                    case 141:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.L2I /* 136 */:
                    case Opcodes.F2I /* 139 */:
                    case Opcodes.D2I /* 142 */:
                    case Opcodes.I2B /* 145 */:
                    case Opcodes.I2C /* 146 */:
                    case Opcodes.I2S /* 147 */:
                    case Opcodes.LCMP /* 148 */:
                    case Opcodes.FCMPL /* 149 */:
                    case Opcodes.FCMPG /* 150 */:
                    case Opcodes.DCMPL /* 151 */:
                    case Opcodes.DCMPG /* 152 */:
                    case Opcodes.ARRAYLENGTH /* 190 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.IFEQ /* 153 */:
                    case Opcodes.IFNE /* 154 */:
                    case Opcodes.IFLT /* 155 */:
                    case Opcodes.IFGE /* 156 */:
                    case Opcodes.IFGT /* 157 */:
                    case Opcodes.IFLE /* 158 */:
                    case Opcodes.IF_ICMPEQ /* 159 */:
                    case Opcodes.IF_ICMPNE /* 160 */:
                    case Opcodes.IF_ICMPLT /* 161 */:
                    case Opcodes.IF_ICMPGE /* 162 */:
                    case Opcodes.IF_ICMPGT /* 163 */:
                    case Opcodes.IF_ICMPLE /* 164 */:
                    case Opcodes.IF_ACMPEQ /* 165 */:
                    case Opcodes.IF_ACMPNE /* 166 */:
                    case Opcodes.GOTO /* 167 */:
                    case Opcodes.JSR /* 168 */:
                    case Opcodes.IFNULL /* 198 */:
                    case Opcodes.IFNONNULL /* 199 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3772Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, 3, c2610Ujhhgtgfeyxiexzf.m3903Ujhhgtgfeyxiexzf(i2 + 1) + i2);
                        return 3;
                    case Opcodes.RET /* 169 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, 2, c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i2 + 1), C1784feyxiexzfUjhhgtg.f5989Ujhhgtgfeyxiexzf, 0);
                        return 2;
                    case Opcodes.TABLESWITCH /* 170 */:
                        return m3959feyxiexzfUjhhgtg(i, interfaceC2630Ujhhgtgfeyxiexzf);
                    case Opcodes.LOOKUPSWITCH /* 171 */:
                        return m3956feyxiexzfUjhhgtg(i, interfaceC2630Ujhhgtgfeyxiexzf);
                    case Opcodes.IRETURN /* 172 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(Opcodes.IRETURN, i2, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.LRETURN /* 173 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(Opcodes.IRETURN, i2, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.FRETURN /* 174 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(Opcodes.IRETURN, i2, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.DRETURN /* 175 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(Opcodes.IRETURN, i2, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.ARETURN /* 176 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(Opcodes.IRETURN, i2, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
                        return 1;
                    case Opcodes.RETURN /* 177 */:
                    case Opcodes.ATHROW /* 191 */:
                    case Opcodes.MONITORENTER /* 194 */:
                    case Opcodes.MONITOREXIT /* 195 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3773Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf);
                        return 1;
                    case Opcodes.GETSTATIC /* 178 */:
                    case Opcodes.PUTSTATIC /* 179 */:
                    case Opcodes.GETFIELD /* 180 */:
                    case Opcodes.PUTFIELD /* 181 */:
                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                    case Opcodes.INVOKESPECIAL /* 183 */:
                    case Opcodes.INVOKESTATIC /* 184 */:
                    case Opcodes.NEW /* 187 */:
                    case Opcodes.ANEWARRAY /* 189 */:
                    case Opcodes.CHECKCAST /* 192 */:
                    case Opcodes.INSTANCEOF /* 193 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i, 3, c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i + 1)), 0);
                        return 3;
                    case Opcodes.INVOKEINTERFACE /* 185 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i, 5, c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i + 1)), c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 3) | (c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 4) << 8));
                        return 5;
                    case 186:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i, 5, (C3146Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i + 1)), 0);
                        return 5;
                    case Opcodes.NEWARRAY /* 188 */:
                        return m3957feyxiexzfUjhhgtg(i, interfaceC2630Ujhhgtgfeyxiexzf);
                    case 196:
                        return m3961feyxiexzfUjhhgtg(i, interfaceC2630Ujhhgtgfeyxiexzf);
                    case 197:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3766Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2, 4, c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i2 + 1)), c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i2 + 3));
                        return 4;
                    case 200:
                    case 201:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3772Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf == 200 ? Opcodes.GOTO : Opcodes.JSR, i2, 5, c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i2 + 1) + i2);
                        return 5;
                    default:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3769Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i2);
                        return 1;
                }
            } catch (C1045feyxiexzfUjhhgtg e) {
                e = e;
                i2 = i;
                e.m4861Ujhhgtgfeyxiexzf("...at bytecode offset ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i2)));
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                i2 = i;
                C1045feyxiexzfUjhhgtg c1045feyxiexzfUjhhgtg = new C1045feyxiexzfUjhhgtg(null, e);
                c1045feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf("...at bytecode offset ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i2)));
                throw c1045feyxiexzfUjhhgtg;
            }
        } catch (C1045feyxiexzfUjhhgtg e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public int m3956feyxiexzfUjhhgtg(int i, InterfaceC2630Ujhhgtgfeyxiexzf interfaceC2630Ujhhgtgfeyxiexzf) {
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        int i2 = (i + 4) & (-4);
        int iM3904Ujhhgtgfeyxiexzf = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM3904Ujhhgtgfeyxiexzf = (iM3904Ujhhgtgfeyxiexzf << 8) | c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i3);
        }
        int iM3901Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i2) + i;
        int iM3901Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i2 + 4);
        int i4 = i2 + 8;
        C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg = new C3366feyxiexzfUjhhgtg(iM3901Ujhhgtgfeyxiexzf2, 1);
        for (int i5 = 0; i5 < iM3901Ujhhgtgfeyxiexzf2; i5++) {
            int iM3901Ujhhgtgfeyxiexzf3 = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i4);
            int iM3901Ujhhgtgfeyxiexzf4 = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i4 + 4) + i;
            i4 += 8;
            c3366feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
            if (iM3901Ujhhgtgfeyxiexzf4 < 0) {
                throw new IllegalArgumentException("target < 0");
            }
            ((C0684Ujhhgtgfeyxiexzf) c3366feyxiexzfUjhhgtg.f10527Ujhhgtgfeyxiexzf).m1942Ujhhgtgfeyxiexzf(iM3901Ujhhgtgfeyxiexzf3);
            ((C0684Ujhhgtgfeyxiexzf) c3366feyxiexzfUjhhgtg.f10528Ujhhgtgfeyxiexzf).m1942Ujhhgtgfeyxiexzf(iM3901Ujhhgtgfeyxiexzf4);
        }
        c3366feyxiexzfUjhhgtg.m4876Ujhhgtgfeyxiexzf(iM3901Ujhhgtgfeyxiexzf);
        c3366feyxiexzfUjhhgtg.m4875Ujhhgtgfeyxiexzf();
        c3366feyxiexzfUjhhgtg.mo1393Ujhhgtgfeyxiexzf();
        int i6 = i4 - i;
        interfaceC2630Ujhhgtgfeyxiexzf.mo3770Ujhhgtgfeyxiexzf(i, i6, c3366feyxiexzfUjhhgtg, iM3904Ujhhgtgfeyxiexzf);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public int m3957feyxiexzfUjhhgtg(int i, InterfaceC2630Ujhhgtgfeyxiexzf interfaceC2630Ujhhgtgfeyxiexzf) {
        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf;
        int i2;
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        int iM3904Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1);
        switch (iM3904Ujhhgtgfeyxiexzf) {
            case 4:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9463Ujhhgtgfeyxiexzf;
                break;
            case 5:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9465Ujhhgtgfeyxiexzf;
                break;
            case 6:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9467Ujhhgtgfeyxiexzf;
                break;
            case 7:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9466Ujhhgtgfeyxiexzf;
                break;
            case 8:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9464Ujhhgtgfeyxiexzf;
                break;
            case 9:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9470Ujhhgtgfeyxiexzf;
                break;
            case 10:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9469Ujhhgtgfeyxiexzf;
                break;
            case 11:
                c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9468Ujhhgtgfeyxiexzf;
                break;
            default:
                throw new C1045feyxiexzfUjhhgtg("bad newarray code ".concat(AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf)), null);
        }
        int iMo3771Ujhhgtgfeyxiexzf = interfaceC2630Ujhhgtgfeyxiexzf.mo3771Ujhhgtgfeyxiexzf();
        C2634Ujhhgtgfeyxiexzf c2634Ujhhgtgfeyxiexzf = new C2634Ujhhgtgfeyxiexzf();
        int i3 = 0;
        if (iMo3771Ujhhgtgfeyxiexzf >= 0) {
            m3955feyxiexzfUjhhgtg(iMo3771Ujhhgtgfeyxiexzf, c2634Ujhhgtgfeyxiexzf);
            if ((c2634Ujhhgtgfeyxiexzf.f8470Ujhhgtgfeyxiexzf instanceof C3144Ujhhgtgfeyxiexzf) && c2634Ujhhgtgfeyxiexzf.f8471Ujhhgtgfeyxiexzf + iMo3771Ujhhgtgfeyxiexzf == i) {
                i2 = c2634Ujhhgtgfeyxiexzf.f8472Ujhhgtgfeyxiexzf;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i4 = i + 2;
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            while (true) {
                int i5 = i4 + 1;
                if (c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i4) == 89) {
                    m3955feyxiexzfUjhhgtg(i5, c2634Ujhhgtgfeyxiexzf);
                    int i6 = c2634Ujhhgtgfeyxiexzf.f8471Ujhhgtgfeyxiexzf;
                    if (i6 != 0 && (c2634Ujhhgtgfeyxiexzf.f8470Ujhhgtgfeyxiexzf instanceof C3144Ujhhgtgfeyxiexzf) && c2634Ujhhgtgfeyxiexzf.f8472Ujhhgtgfeyxiexzf == i3) {
                        int i7 = i5 + i6;
                        m3955feyxiexzfUjhhgtg(i7, c2634Ujhhgtgfeyxiexzf);
                        int i8 = c2634Ujhhgtgfeyxiexzf.f8471Ujhhgtgfeyxiexzf;
                        if (i8 != 0) {
                            AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c2634Ujhhgtgfeyxiexzf.f8470Ujhhgtgfeyxiexzf;
                            if (abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3150Ujhhgtgfeyxiexzf) {
                                int i9 = i7 + i8;
                                arrayList.add(abstractC3638Ujhhgtgfeyxiexzf);
                                int i10 = i9 + 1;
                                int iM3904Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i9);
                                switch (iM3904Ujhhgtgfeyxiexzf) {
                                    case 4:
                                    case 8:
                                        if (iM3904Ujhhgtgfeyxiexzf2 == 84) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 5:
                                        if (iM3904Ujhhgtgfeyxiexzf2 == 85) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 6:
                                        if (iM3904Ujhhgtgfeyxiexzf2 == 81) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 7:
                                        if (iM3904Ujhhgtgfeyxiexzf2 == 82) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 9:
                                        if (iM3904Ujhhgtgfeyxiexzf2 == 86) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 10:
                                        if (iM3904Ujhhgtgfeyxiexzf2 == 79) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 11:
                                        if (iM3904Ujhhgtgfeyxiexzf2 == 80) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 < 2 || i3 != i2) {
            interfaceC2630Ujhhgtgfeyxiexzf.mo3763Ujhhgtgfeyxiexzf(i, 2, c3057Ujhhgtgfeyxiexzf, null);
            return 2;
        }
        int i11 = i4 - i;
        interfaceC2630Ujhhgtgfeyxiexzf.mo3763Ujhhgtgfeyxiexzf(i, i11, c3057Ujhhgtgfeyxiexzf, arrayList);
        return i11;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public C2427Ujhhgtgfeyxiexzf m3958feyxiexzfUjhhgtg(int i) {
        C2628feyxiexzfUjhhgtg c2628feyxiexzfUjhhgtg = (C2628feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf;
        try {
            int unsignedByte = c2628feyxiexzfUjhhgtg.readUnsignedByte();
            C2427Ujhhgtgfeyxiexzf c2427Ujhhgtgfeyxiexzf = new C2427Ujhhgtgfeyxiexzf(unsignedByte);
            for (int i2 = 0; i2 < unsignedByte; i2++) {
                int unsignedShort = c2628feyxiexzfUjhhgtg.readUnsignedShort();
                C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf = new C2425Ujhhgtgfeyxiexzf();
                for (int i3 = 0; i3 < unsignedShort; i3++) {
                    c2425Ujhhgtgfeyxiexzf.m3673Ujhhgtgfeyxiexzf(m3951feyxiexzfUjhhgtg(i));
                }
                c2425Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
                c2425Ujhhgtgfeyxiexzf.m1730Ujhhgtgfeyxiexzf();
                c2427Ujhhgtgfeyxiexzf.m4970Ujhhgtgfeyxiexzf(i2, c2425Ujhhgtgfeyxiexzf);
            }
            c2427Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
            if (c2628feyxiexzfUjhhgtg.available() == 0) {
                return c2427Ujhhgtgfeyxiexzf;
            }
            throw new C1404feyxiexzfUjhhgtg("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int m3959feyxiexzfUjhhgtg(int i, InterfaceC2630Ujhhgtgfeyxiexzf interfaceC2630Ujhhgtgfeyxiexzf) {
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        int i2 = (i + 4) & (-4);
        int iM3904Ujhhgtgfeyxiexzf = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM3904Ujhhgtgfeyxiexzf = (iM3904Ujhhgtgfeyxiexzf << 8) | c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i3);
        }
        int iM3901Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i2) + i;
        int iM3901Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i2 + 4);
        int iM3901Ujhhgtgfeyxiexzf3 = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i2 + 8);
        int i4 = (iM3901Ujhhgtgfeyxiexzf3 - iM3901Ujhhgtgfeyxiexzf2) + 1;
        int i5 = i2 + 12;
        if (iM3901Ujhhgtgfeyxiexzf2 > iM3901Ujhhgtgfeyxiexzf3) {
            throw new C1045feyxiexzfUjhhgtg("low / high inversion", null);
        }
        C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg = new C3366feyxiexzfUjhhgtg(i4, 1);
        for (int i6 = 0; i6 < i4; i6++) {
            int iM3901Ujhhgtgfeyxiexzf4 = c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i5) + i;
            i5 += 4;
            int i7 = iM3901Ujhhgtgfeyxiexzf2 + i6;
            c3366feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
            if (iM3901Ujhhgtgfeyxiexzf4 < 0) {
                throw new IllegalArgumentException("target < 0");
            }
            ((C0684Ujhhgtgfeyxiexzf) c3366feyxiexzfUjhhgtg.f10527Ujhhgtgfeyxiexzf).m1942Ujhhgtgfeyxiexzf(i7);
            ((C0684Ujhhgtgfeyxiexzf) c3366feyxiexzfUjhhgtg.f10528Ujhhgtgfeyxiexzf).m1942Ujhhgtgfeyxiexzf(iM3901Ujhhgtgfeyxiexzf4);
        }
        c3366feyxiexzfUjhhgtg.m4876Ujhhgtgfeyxiexzf(iM3901Ujhhgtgfeyxiexzf);
        c3366feyxiexzfUjhhgtg.m4875Ujhhgtgfeyxiexzf();
        c3366feyxiexzfUjhhgtg.mo1393Ujhhgtgfeyxiexzf();
        int i8 = i5 - i;
        interfaceC2630Ujhhgtgfeyxiexzf.mo3770Ujhhgtgfeyxiexzf(i, i8, c3366feyxiexzfUjhhgtg, iM3904Ujhhgtgfeyxiexzf);
        return i8;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public AbstractC3638Ujhhgtgfeyxiexzf m3960feyxiexzfUjhhgtg() {
        C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg = (C1132feyxiexzfUjhhgtg) this.f8462Ujhhgtgfeyxiexzf;
        C2628feyxiexzfUjhhgtg c2628feyxiexzfUjhhgtg = (C2628feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf;
        int unsignedByte = c2628feyxiexzfUjhhgtg.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C3753feyxiexzfUjhhgtg(m3951feyxiexzfUjhhgtg(4));
        }
        if (unsignedByte == 70) {
            return (C3141Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg();
        }
        if (unsignedByte == 83) {
            int i = ((C3144Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg()).f9756Ujhhgtgfeyxiexzf;
            short s = (short) i;
            if (s == i) {
                return new C3055Ujhhgtgfeyxiexzf(s);
            }
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "bogus short value: "));
        }
        if (unsignedByte == 99) {
            String str = ((C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2628feyxiexzfUjhhgtg.readUnsignedShort())).f9450Ujhhgtgfeyxiexzf;
            ConcurrentHashMap concurrentHashMap = C1784feyxiexzfUjhhgtg.f5978Ujhhgtgfeyxiexzf;
            try {
                return new C3057Ujhhgtgfeyxiexzf(str.equals("V") ? C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf : C1784feyxiexzfUjhhgtg.m3114Ujhhgtgfeyxiexzf(str));
            } catch (NullPointerException unused) {
                throw new NullPointerException("descriptor == null");
            }
        }
        if (unsignedByte == 101) {
            m3965feyxiexzfUjhhgtg(4);
            C3155Ujhhgtgfeyxiexzf c3155Ujhhgtgfeyxiexzf = new C3155Ujhhgtgfeyxiexzf((C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2628feyxiexzfUjhhgtg.readUnsignedShort()), (C3056Ujhhgtgfeyxiexzf) c1132feyxiexzfUjhhgtg.m2601Ujhhgtgfeyxiexzf(c2628feyxiexzfUjhhgtg.readUnsignedShort()));
            C3139Ujhhgtgfeyxiexzf c3139Ujhhgtgfeyxiexzf = new C3139Ujhhgtgfeyxiexzf(new C3057Ujhhgtgfeyxiexzf(c3155Ujhhgtgfeyxiexzf.m4668Ujhhgtgfeyxiexzf()), c3155Ujhhgtgfeyxiexzf);
            c3139Ujhhgtgfeyxiexzf.f9732Ujhhgtgfeyxiexzf = null;
            return c3139Ujhhgtgfeyxiexzf;
        }
        if (unsignedByte == 115) {
            return m3953feyxiexzfUjhhgtg();
        }
        if (unsignedByte == 73) {
            return (C3144Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg();
        }
        if (unsignedByte == 74) {
            return (C3151Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg();
        }
        if (unsignedByte == 90) {
            return C3133Ujhhgtgfeyxiexzf.m4655Ujhhgtgfeyxiexzf(((C3144Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg()).f9756Ujhhgtgfeyxiexzf);
        }
        if (unsignedByte == 91) {
            m3965feyxiexzfUjhhgtg(2);
            int unsignedShort = c2628feyxiexzfUjhhgtg.readUnsignedShort();
            C3754feyxiexzfUjhhgtg c3754feyxiexzfUjhhgtg = new C3754feyxiexzfUjhhgtg(unsignedShort);
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                c3754feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i2, m3960feyxiexzfUjhhgtg());
            }
            c3754feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
            return new C3755Ujhhgtgfeyxiexzf(c3754feyxiexzfUjhhgtg);
        }
        switch (unsignedByte) {
            case 66:
                int i3 = ((C3144Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg()).f9756Ujhhgtgfeyxiexzf;
                byte b = (byte) i3;
                if (b == i3) {
                    return new C3134Ujhhgtgfeyxiexzf(b);
                }
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i3, "bogus byte value: "));
            case 67:
                int i4 = ((C3144Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg()).f9756Ujhhgtgfeyxiexzf;
                char c = (char) i4;
                if (c == i4) {
                    return new C3137Ujhhgtgfeyxiexzf(c);
                }
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i4, "bogus char value: "));
            case 68:
                return (C3138Ujhhgtgfeyxiexzf) m3953feyxiexzfUjhhgtg();
            default:
                throw new C1404feyxiexzfUjhhgtg("unknown annotation tag: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(unsignedByte)), null);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int m3961feyxiexzfUjhhgtg(int i, InterfaceC2630Ujhhgtgfeyxiexzf interfaceC2630Ujhhgtgfeyxiexzf) {
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        int iM3904Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i + 1);
        int iM3906Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i + 2);
        if (iM3904Ujhhgtgfeyxiexzf == 132) {
            interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i, 6, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, c2610Ujhhgtgfeyxiexzf.m3903Ujhhgtgfeyxiexzf(i + 4));
            return 6;
        }
        if (iM3904Ujhhgtgfeyxiexzf == 169) {
            interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5989Ujhhgtgfeyxiexzf, 0);
            return 4;
        }
        switch (iM3904Ujhhgtgfeyxiexzf) {
            case Opcodes.ILOAD /* 21 */:
                interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, 0);
                return 4;
            case Opcodes.LLOAD /* 22 */:
                interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf, 0);
                return 4;
            case Opcodes.FLOAD /* 23 */:
                interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf, 0);
                return 4;
            case Opcodes.DLOAD /* 24 */:
                interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf, 0);
                return 4;
            case Opcodes.ALOAD /* 25 */:
                interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(21, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg, 0);
                return 4;
            default:
                switch (iM3904Ujhhgtgfeyxiexzf) {
                    case Opcodes.ISTORE /* 54 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf, 0);
                        return 4;
                    case Opcodes.LSTORE /* 55 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf, 0);
                        return 4;
                    case Opcodes.FSTORE /* 56 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf, 0);
                        return 4;
                    case Opcodes.DSTORE /* 57 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf, 0);
                        return 4;
                    case Opcodes.ASTORE /* 58 */:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3764Ujhhgtgfeyxiexzf(54, i, 4, iM3906Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg, 0);
                        return 4;
                    default:
                        interfaceC2630Ujhhgtgfeyxiexzf.mo3769Ujhhgtgfeyxiexzf(196, i);
                        return 1;
                }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public void m3962feyxiexzfUjhhgtg(InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtg, Object obj) {
        HashMap map = (HashMap) this.f8462Ujhhgtgfeyxiexzf;
        C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf = (C0545Ujhhgtgfeyxiexzf) map.get(interfaceC1436feyxiexzfUjhhgtg);
        if (c0545Ujhhgtgfeyxiexzf == null) {
            c0545Ujhhgtgfeyxiexzf = new C0545Ujhhgtgfeyxiexzf(interfaceC1436feyxiexzfUjhhgtg);
            c0545Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf;
            C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf2 = (C0545Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
            c0545Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf2.f2536Ujhhgtgfeyxiexzf;
            c0545Ujhhgtgfeyxiexzf.f2535Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf2;
            c0545Ujhhgtgfeyxiexzf2.f2536Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf;
            c0545Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf.f2535Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf;
            map.put(interfaceC1436feyxiexzfUjhhgtg, c0545Ujhhgtgfeyxiexzf);
        } else {
            interfaceC1436feyxiexzfUjhhgtg.mo1477Ujhhgtgfeyxiexzf();
        }
        if (c0545Ujhhgtgfeyxiexzf.f2534Ujhhgtgfeyxiexzf == null) {
            c0545Ujhhgtgfeyxiexzf.f2534Ujhhgtgfeyxiexzf = new ArrayList();
        }
        c0545Ujhhgtgfeyxiexzf.f2534Ujhhgtgfeyxiexzf.add(obj);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public void m3963feyxiexzfUjhhgtg(String str) {
        C3191feyxiexzfUjhhgtg c3191feyxiexzfUjhhgtg;
        synchronized (this) {
            try {
                c3191feyxiexzfUjhhgtg = (C3191feyxiexzfUjhhgtg) ((HashMap) this.f8461Ujhhgtgfeyxiexzf).get(str);
                AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c3191feyxiexzfUjhhgtg, "Argument must not be null");
                int i = c3191feyxiexzfUjhhgtg.f9869Ujhhgtgfeyxiexzf;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c3191feyxiexzfUjhhgtg.f9869Ujhhgtgfeyxiexzf);
                }
                int i2 = i - 1;
                c3191feyxiexzfUjhhgtg.f9869Ujhhgtgfeyxiexzf = i2;
                if (i2 == 0) {
                    C3191feyxiexzfUjhhgtg c3191feyxiexzfUjhhgtg2 = (C3191feyxiexzfUjhhgtg) ((HashMap) this.f8461Ujhhgtgfeyxiexzf).remove(str);
                    if (!c3191feyxiexzfUjhhgtg2.equals(c3191feyxiexzfUjhhgtg)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c3191feyxiexzfUjhhgtg + ", but actually removed: " + c3191feyxiexzfUjhhgtg2 + ", safeKey: " + str);
                    }
                    C2617Ujhhgtgfeyxiexzf c2617Ujhhgtgfeyxiexzf = (C2617Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf;
                    synchronized (c2617Ujhhgtgfeyxiexzf.f8437Ujhhgtgfeyxiexzf) {
                        try {
                            if (c2617Ujhhgtgfeyxiexzf.f8437Ujhhgtgfeyxiexzf.size() < 10) {
                                c2617Ujhhgtgfeyxiexzf.f8437Ujhhgtgfeyxiexzf.offer(c3191feyxiexzfUjhhgtg2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c3191feyxiexzfUjhhgtg.f9868Ujhhgtgfeyxiexzf.unlock();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public Object m3964feyxiexzfUjhhgtg() {
        C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf = (C0545Ujhhgtgfeyxiexzf) this.f8461Ujhhgtgfeyxiexzf;
        C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf2 = c0545Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf;
        while (true) {
            boolean zEquals = c0545Ujhhgtgfeyxiexzf2.equals(c0545Ujhhgtgfeyxiexzf);
            Object obj = c0545Ujhhgtgfeyxiexzf2.f2533Ujhhgtgfeyxiexzf;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c0545Ujhhgtgfeyxiexzf2.f2534Ujhhgtgfeyxiexzf;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c0545Ujhhgtgfeyxiexzf2.f2534Ujhhgtgfeyxiexzf.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C0545Ujhhgtgfeyxiexzf c0545Ujhhgtgfeyxiexzf3 = c0545Ujhhgtgfeyxiexzf2.f2536Ujhhgtgfeyxiexzf;
            c0545Ujhhgtgfeyxiexzf3.f2535Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf2.f2535Ujhhgtgfeyxiexzf;
            c0545Ujhhgtgfeyxiexzf2.f2535Ujhhgtgfeyxiexzf.f2536Ujhhgtgfeyxiexzf = c0545Ujhhgtgfeyxiexzf3;
            ((HashMap) this.f8462Ujhhgtgfeyxiexzf).remove(obj);
            ((InterfaceC1436feyxiexzfUjhhgtg) obj).mo1477Ujhhgtgfeyxiexzf();
            c0545Ujhhgtgfeyxiexzf2 = c0545Ujhhgtgfeyxiexzf2.f2536Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void m3965feyxiexzfUjhhgtg(int i) {
        if (((C2628feyxiexzfUjhhgtg) this.f8461Ujhhgtgfeyxiexzf).available() < i) {
            throw new C1404feyxiexzfUjhhgtg("truncated annotation attribute", null);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public void m3966feyxiexzfUjhhgtg(boolean z) {
        C3324feyxiexzfUjhhgtg c3324feyxiexzfUjhhgtg = (C3324feyxiexzfUjhhgtg) ((C2629Ujhhgtgfeyxiexzf) ((C2965Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf).f8462Ujhhgtgfeyxiexzf;
        if (c3324feyxiexzfUjhhgtg.f10364Ujhhgtgfeyxiexzf != z) {
            if (c3324feyxiexzfUjhhgtg.f10363Ujhhgtgfeyxiexzf != null) {
                C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
                C3323feyxiexzfUjhhgtg c3323feyxiexzfUjhhgtg = c3324feyxiexzfUjhhgtg.f10363Ujhhgtgfeyxiexzf;
                c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.getClass();
                AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(c3323feyxiexzfUjhhgtg, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.f10591Ujhhgtgfeyxiexzf;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.f10592Ujhhgtgfeyxiexzf.remove(c3323feyxiexzfUjhhgtg);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            c3324feyxiexzfUjhhgtg.f10364Ujhhgtgfeyxiexzf = z;
            if (z) {
                C3324feyxiexzfUjhhgtg.m4813Ujhhgtgfeyxiexzf(c3324feyxiexzfUjhhgtg.f10362Ujhhgtgfeyxiexzf, C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf().m4908Ujhhgtgfeyxiexzf());
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void m3967feyxiexzfUjhhgtg(int i, int i2, int i3, int i4) {
        AbstractC2777Ujhhgtgfeyxiexzf abstractC2777Ujhhgtgfeyxiexzf = (AbstractC2777Ujhhgtgfeyxiexzf) this.f8462Ujhhgtgfeyxiexzf;
        abstractC2777Ujhhgtgfeyxiexzf.f8783Ujhhgtgfeyxiexzf.set(i, i2, i3, i4);
        Rect rect = abstractC2777Ujhhgtgfeyxiexzf.f8782Ujhhgtgfeyxiexzf;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public /* synthetic */ C2629Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        this.f8460Ujhhgtgfeyxiexzf = i;
        this.f8461Ujhhgtgfeyxiexzf = obj;
        this.f8462Ujhhgtgfeyxiexzf = obj2;
    }

    public /* synthetic */ C2629Ujhhgtgfeyxiexzf(Object obj, Object obj2, int i, boolean z) {
        this.f8460Ujhhgtgfeyxiexzf = i;
        this.f8462Ujhhgtgfeyxiexzf = obj;
        this.f8461Ujhhgtgfeyxiexzf = obj2;
    }

    public C2629Ujhhgtgfeyxiexzf(int i) {
        this.f8460Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 15:
                this.f8461Ujhhgtgfeyxiexzf = new C0545Ujhhgtgfeyxiexzf(null);
                this.f8462Ujhhgtgfeyxiexzf = new HashMap();
                break;
            case 19:
                this.f8461Ujhhgtgfeyxiexzf = new AtomicReference();
                this.f8462Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf(0);
                break;
            case Opcodes.FLOAD /* 23 */:
                this.f8461Ujhhgtgfeyxiexzf = new ArrayList();
                this.f8462Ujhhgtgfeyxiexzf = new HashMap();
                break;
            case 26:
                this.f8461Ujhhgtgfeyxiexzf = new C0179Ujhhgtgfeyxiexzf(1000L);
                this.f8462Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2791Ujhhgtgfeyxiexzf(10, new C0420Ujhhgtgfeyxiexzf(12));
                break;
            default:
                this.f8461Ujhhgtgfeyxiexzf = new HashMap();
                this.f8462Ujhhgtgfeyxiexzf = new C2617Ujhhgtgfeyxiexzf(1);
                break;
        }
    }

    public C2629Ujhhgtgfeyxiexzf(Context context, String str) {
        this.f8460Ujhhgtgfeyxiexzf = 17;
        this.f8461Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2977Ujhhgtgfeyxiexzf(28, context));
        this.f8462Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2550feyxiexzfUjhhgtg(this, 4, str));
    }

    public C2629Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        this.f8460Ujhhgtgfeyxiexzf = 18;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf);
        this.f8462Ujhhgtgfeyxiexzf = new C3107Ujhhgtgfeyxiexzf(5);
        this.f8461Ujhhgtgfeyxiexzf = c0416Ujhhgtgfeyxiexzf;
    }

    public C2629Ujhhgtgfeyxiexzf(C0677Ujhhgtgfeyxiexzf c0677Ujhhgtgfeyxiexzf) {
        this.f8460Ujhhgtgfeyxiexzf = 20;
        this.f8461Ujhhgtgfeyxiexzf = c0677Ujhhgtgfeyxiexzf;
        this.f8462Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0350Ujhhgtgfeyxiexzf(5, this));
    }

    public C2629Ujhhgtgfeyxiexzf(C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf) {
        this.f8460Ujhhgtgfeyxiexzf = 21;
        this.f8461Ujhhgtgfeyxiexzf = c0210Ujhhgtgfeyxiexzf;
        this.f8462Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0350Ujhhgtgfeyxiexzf(7, this));
    }

    public C2629Ujhhgtgfeyxiexzf(EditText editText, int i) {
        this.f8460Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 10:
                this.f8461Ujhhgtgfeyxiexzf = editText;
                C3324feyxiexzfUjhhgtg c3324feyxiexzfUjhhgtg = new C3324feyxiexzfUjhhgtg(editText);
                this.f8462Ujhhgtgfeyxiexzf = c3324feyxiexzfUjhhgtg;
                editText.addTextChangedListener(c3324feyxiexzfUjhhgtg);
                if (C3395Ujhhgtgfeyxiexzf.f10607Ujhhgtgfeyxiexzf == null) {
                    synchronized (C3395Ujhhgtgfeyxiexzf.f10606Ujhhgtgfeyxiexzf) {
                        try {
                            if (C3395Ujhhgtgfeyxiexzf.f10607Ujhhgtgfeyxiexzf == null) {
                                C3395Ujhhgtgfeyxiexzf c3395Ujhhgtgfeyxiexzf = new C3395Ujhhgtgfeyxiexzf();
                                try {
                                    C3395Ujhhgtgfeyxiexzf.f10608Ujhhgtgfeyxiexzf = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C3395Ujhhgtgfeyxiexzf.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C3395Ujhhgtgfeyxiexzf.f10607Ujhhgtgfeyxiexzf = c3395Ujhhgtgfeyxiexzf;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C3395Ujhhgtgfeyxiexzf.f10607Ujhhgtgfeyxiexzf);
                return;
            default:
                this.f8461Ujhhgtgfeyxiexzf = editText;
                this.f8462Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(editText);
                return;
        }
    }

    public C2629Ujhhgtgfeyxiexzf(C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf, int i, int i2, int i3, int i4) {
        this.f8460Ujhhgtgfeyxiexzf = 22;
        this.f8461Ujhhgtgfeyxiexzf = new C1476feyxiexzfUjhhgtg(c2697Ujhhgtgfeyxiexzf, i, i3, i4);
        this.f8462Ujhhgtgfeyxiexzf = new ArrayList(i2);
    }

    public C2629Ujhhgtgfeyxiexzf(C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf, C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg) {
        this.f8460Ujhhgtgfeyxiexzf = 0;
        if (c1132feyxiexzfUjhhgtg != null) {
            this.f8461Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf;
            this.f8462Ujhhgtgfeyxiexzf = c1132feyxiexzfUjhhgtg;
            return;
        }
        throw new NullPointerException("pool == null");
    }

    public C2629Ujhhgtgfeyxiexzf(C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg, int i, int i2) {
        this.f8460Ujhhgtgfeyxiexzf = 2;
        if (c3159feyxiexzfUjhhgtg != null) {
            c3159feyxiexzfUjhhgtg.m4673Ujhhgtgfeyxiexzf();
            this.f8462Ujhhgtgfeyxiexzf = c3159feyxiexzfUjhhgtg.f9780Ujhhgtgfeyxiexzf;
            this.f8461Ujhhgtgfeyxiexzf = new C2628feyxiexzfUjhhgtg(new C2609Ujhhgtgfeyxiexzf(c3159feyxiexzfUjhhgtg.f9778Ujhhgtgfeyxiexzf.m3914Ujhhgtgfeyxiexzf(i, i2 + i)));
            return;
        }
        throw new NullPointerException("cf == null");
    }

    public C2629Ujhhgtgfeyxiexzf(C0906feyxiexzfUjhhgtg c0906feyxiexzfUjhhgtg) {
        this.f8460Ujhhgtgfeyxiexzf = 25;
        this.f8462Ujhhgtgfeyxiexzf = c0906feyxiexzfUjhhgtg;
        this.f8461Ujhhgtgfeyxiexzf = new HashMap();
    }

    public C2629Ujhhgtgfeyxiexzf(ArrayList arrayList, ArrayList arrayList2) {
        this.f8460Ujhhgtgfeyxiexzf = 14;
        int size = arrayList.size();
        this.f8461Ujhhgtgfeyxiexzf = new int[size];
        this.f8462Ujhhgtgfeyxiexzf = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f8461Ujhhgtgfeyxiexzf)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f8462Ujhhgtgfeyxiexzf)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C2629Ujhhgtgfeyxiexzf(int i, int i2) {
        this.f8460Ujhhgtgfeyxiexzf = 14;
        this.f8461Ujhhgtgfeyxiexzf = new int[]{i, i2};
        this.f8462Ujhhgtgfeyxiexzf = new float[]{0.0f, 1.0f};
    }

    public C2629Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        this.f8460Ujhhgtgfeyxiexzf = 14;
        this.f8461Ujhhgtgfeyxiexzf = new int[]{i, i2, i3};
        this.f8462Ujhhgtgfeyxiexzf = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C2629Ujhhgtgfeyxiexzf(AbstractC2777Ujhhgtgfeyxiexzf abstractC2777Ujhhgtgfeyxiexzf) {
        this.f8460Ujhhgtgfeyxiexzf = 7;
        this.f8462Ujhhgtgfeyxiexzf = abstractC2777Ujhhgtgfeyxiexzf;
    }
}
