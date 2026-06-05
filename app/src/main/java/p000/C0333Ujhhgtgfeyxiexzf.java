package p000;

import android.R;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ能不能ᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0333Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0599Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0333Ujhhgtgfeyxiexzf f1951Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f1952Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f1953Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f1954Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f1955Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final String f1956Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final String f1957Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f1958Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final C0317Ujhhgtgfeyxiexzf f1959Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928356456832435594L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f1951Ujhhgtgfeyxiexzf = new C0333Ujhhgtgfeyxiexzf("MsgBgBubbleHook");
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = AbstractC1389feyxiexzfUjhhgtg.f4886Ujhhgtgfeyxiexzf;
        f1952Ujhhgtgfeyxiexzf = AbstractC1389feyxiexzfUjhhgtg.m2877Ujhhgtgfeyxiexzf("Resource", "Bubble");
        f1953Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C3471Ujhhgtgfeyxiexzf(24));
        f1954Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C3471Ujhhgtgfeyxiexzf(25));
        f1955Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C3471Ujhhgtgfeyxiexzf(26));
        f1956Ujhhgtgfeyxiexzf = "美化";
        f1957Ujhhgtgfeyxiexzf = "消息背景气泡";
        f1958Ujhhgtgfeyxiexzf = "仅支持配置部分消息, 与背景颜色冲突";
        f1959Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(9);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static void m1534feyxiexzfUjhhgtg(View view, boolean z) {
        int iHSVToColor;
        int color = AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(view.getContext()) ? Color.parseColor((!z ? C0349Ujhhgtgfeyxiexzf.f1991Ujhhgtgfeyxiexzf : C0351Ujhhgtgfeyxiexzf.f1994Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf()) : Color.parseColor((!z ? C0352Ujhhgtgfeyxiexzf.f1995Ujhhgtgfeyxiexzf : C0334Ujhhgtgfeyxiexzf.f1960Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf());
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        Resources resources = view.getResources();
        Bitmap bitmap = !z ? (Bitmap) f1955Ujhhgtgfeyxiexzf.getValue() : (Bitmap) f1954Ujhhgtgfeyxiexzf.getValue();
        Integer numValueOf = color != 0 ? Integer.valueOf(color) : null;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 1, 1, bitmap.getWidth() - 2, bitmap.getHeight() - 2);
        ArrayList<C1256feyxiexzfUjhhgtg> arrayListM4897Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.m4897Ujhhgtgfeyxiexzf(bitmap, true, false);
        ArrayList<C1256feyxiexzfUjhhgtg> arrayListM4897Ujhhgtgfeyxiexzf2 = C3382feyxiexzfUjhhgtg.m4897Ujhhgtgfeyxiexzf(bitmap, false, false);
        C1256feyxiexzfUjhhgtg c1256feyxiexzfUjhhgtg = (C1256feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.m4897Ujhhgtgfeyxiexzf(bitmap, true, true));
        C1256feyxiexzfUjhhgtg c1256feyxiexzfUjhhgtg2 = (C1256feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.m4897Ujhhgtgfeyxiexzf(bitmap, false, true));
        Rect rect = new Rect(c1256feyxiexzfUjhhgtg != null ? c1256feyxiexzfUjhhgtg.f4617Ujhhgtgfeyxiexzf : 0, c1256feyxiexzfUjhhgtg2 != null ? c1256feyxiexzfUjhhgtg2.f4617Ujhhgtgfeyxiexzf : 0, c1256feyxiexzfUjhhgtg != null ? (bitmap.getWidth() - 2) - c1256feyxiexzfUjhhgtg.f4618Ujhhgtgfeyxiexzf : 0, c1256feyxiexzfUjhhgtg2 != null ? (bitmap.getHeight() - 2) - c1256feyxiexzfUjhhgtg2.f4618Ujhhgtgfeyxiexzf : 0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((arrayListM4897Ujhhgtgfeyxiexzf2.size() + arrayListM4897Ujhhgtgfeyxiexzf.size()) * 8) + 68);
        byteBufferAllocate.order(ByteOrder.nativeOrder());
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) (arrayListM4897Ujhhgtgfeyxiexzf.size() * 2));
        byteBufferAllocate.put((byte) (arrayListM4897Ujhhgtgfeyxiexzf2.size() * 2));
        byteBufferAllocate.put((byte) 9);
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            byteBufferAllocate.putInt(0);
            i++;
        }
        byteBufferAllocate.putInt(rect.left);
        byteBufferAllocate.putInt(rect.right);
        byteBufferAllocate.putInt(rect.top);
        byteBufferAllocate.putInt(rect.bottom);
        byteBufferAllocate.putInt(0);
        for (C1256feyxiexzfUjhhgtg c1256feyxiexzfUjhhgtg3 : arrayListM4897Ujhhgtgfeyxiexzf) {
            byteBufferAllocate.putInt(c1256feyxiexzfUjhhgtg3.f4617Ujhhgtgfeyxiexzf);
            byteBufferAllocate.putInt(c1256feyxiexzfUjhhgtg3.f4618Ujhhgtgfeyxiexzf);
        }
        for (C1256feyxiexzfUjhhgtg c1256feyxiexzfUjhhgtg4 : arrayListM4897Ujhhgtgfeyxiexzf2) {
            byteBufferAllocate.putInt(c1256feyxiexzfUjhhgtg4.f4617Ujhhgtgfeyxiexzf);
            byteBufferAllocate.putInt(c1256feyxiexzfUjhhgtg4.f4618Ujhhgtgfeyxiexzf);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            byteBufferAllocate.putInt(1);
        }
        NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(resources, bitmapCreateBitmap, byteBufferAllocate.array(), rect, null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (numValueOf != null) {
            ninePatchDrawable.setTint(numValueOf.intValue());
        }
        Drawable.ConstantState constantState = ninePatchDrawable.getConstantState();
        if (constantState != null) {
            Drawable drawableMutate = constantState.newDrawable().mutate();
            C0333Ujhhgtgfeyxiexzf c0333Ujhhgtgfeyxiexzf = f1951Ujhhgtgfeyxiexzf;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                c0333Ujhhgtgfeyxiexzf.getClass();
                float[] fArr = new float[3];
                Color.colorToHSV(iIntValue, fArr);
                fArr[2] = fArr[2] * 0.8f;
                iHSVToColor = Color.HSVToColor(fArr);
            } else {
                c0333Ujhhgtgfeyxiexzf.getClass();
                float[] fArr2 = new float[3];
                Color.colorToHSV(-1, fArr2);
                fArr2[2] = fArr2[2] * 0.8f;
                iHSVToColor = Color.HSVToColor(fArr2);
            }
            drawableMutate.setTint(iHSVToColor);
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableMutate);
            stateListDrawable.addState(new int[]{R.attr.state_focused}, drawableMutate);
            stateListDrawable.addState(new int[0], ninePatchDrawable);
        }
        view.setBackground(stateListDrawable);
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    @Override // p000.InterfaceC0599Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo1535Ujhhgtgfeyxiexzf(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo1424feyxiexzfUjhhgtg()) {
            int type = msgInfoBean.getType();
            if (type == EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7417Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7425Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || type == EnumC2267feyxiexzfUjhhgtg.f7426Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf.getClass();
                View viewFindViewById = view.findViewById(C0510Ujhhgtgfeyxiexzf.m1793feyxiexzfUjhhgtg());
                if (viewFindViewById != null) {
                    m1534feyxiexzfUjhhgtg(viewFindViewById, msgInfoBean.isSend());
                    return;
                }
                return;
            }
            if (type != EnumC2267feyxiexzfUjhhgtg.f7409Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                if (type == EnumC2267feyxiexzfUjhhgtg.f7415Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                    C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf.getClass();
                    C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                    View viewFindViewById2 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0509Ujhhgtgfeyxiexzf.f2442Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1798feyxiexzfUjhhgtg()));
                    if (viewFindViewById2 != null) {
                        m1534feyxiexzfUjhhgtg(viewFindViewById2, msgInfoBean.isSend());
                        return;
                    }
                    return;
                }
                return;
            }
            C0510Ujhhgtgfeyxiexzf.f2443Ujhhgtgfeyxiexzf.getClass();
            C0580Ujhhgtgfeyxiexzf c0580Ujhhgtgfeyxiexzf = C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf;
            c0580Ujhhgtgfeyxiexzf.getClass();
            View viewFindViewById3 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0499Ujhhgtgfeyxiexzf.f2426Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1795feyxiexzfUjhhgtg()));
            if (viewFindViewById3 != null) {
                m1534feyxiexzfUjhhgtg(viewFindViewById3, msgInfoBean.isSend());
            }
            c0580Ujhhgtgfeyxiexzf.getClass();
            View viewFindViewById4 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0502Ujhhgtgfeyxiexzf.f2429Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1796feyxiexzfUjhhgtg()));
            if (viewFindViewById4 != null) {
                m1534feyxiexzfUjhhgtg(viewFindViewById4, msgInfoBean.isSend());
            }
            c0580Ujhhgtgfeyxiexzf.getClass();
            View viewFindViewById5 = view.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0501Ujhhgtgfeyxiexzf.f2428Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0510Ujhhgtgfeyxiexzf.m1798feyxiexzfUjhhgtg()));
            if (viewFindViewById5 != null) {
                m1534feyxiexzfUjhhgtg(viewFindViewById5, msgInfoBean.isSend());
            }
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f1958Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f1957Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f1956Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f1959Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
