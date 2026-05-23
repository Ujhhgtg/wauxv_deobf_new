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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᛸᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2041 extends AbstractC2867 implements InterfaceC1578 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2041 f6815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f6816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C2873 f6817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2873 f6818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2873 f6819;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f6820;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final String f6821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final String f6822;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final C1884 f6823;

    static {
        AbstractC1574.m3300(-492770187803316L);
        String[] strArr = AbstractC1574.f5469;
        f6815 = new C2041("MsgBgBubbleHook");
        C2873 c2873 = AbstractC2342.f7529;
        f6816 = AbstractC2342.m4330("Resource", "Bubble");
        f6817 = new C2873(new C1354(23));
        f6818 = new C2873(new C1354(24));
        f6819 = new C2873(new C1354(25));
        f6820 = "美化";
        f6821 = "消息背景气泡";
        f6822 = "仅支持配置部分消息, 与背景颜色冲突";
        f6823 = new C1884(23);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static void m3880(View view, boolean z) {
        int iHSVToColor;
        int color = AbstractC3681.m5331(view.getContext()) ? Color.parseColor((!z ? C2037.f6811 : C2039.f6813).m2542()) : Color.parseColor((!z ? C2038.f6812 : C2040.f6814).m2542());
        Resources resources = view.getResources();
        Bitmap bitmap = !z ? (Bitmap) f6819.getValue() : (Bitmap) f6818.getValue();
        Integer numValueOf = color != 0 ? Integer.valueOf(color) : null;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 1, 1, bitmap.getWidth() - 2, bitmap.getHeight() - 2);
        ArrayList<C2220> arrayListM4040 = AbstractC2203.m4040(bitmap, true);
        ArrayList<C2220> arrayListM4041 = AbstractC2203.m4040(bitmap, false);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((arrayListM4041.size() + arrayListM4040.size()) * 8) + 68);
        byteBufferAllocate.order(ByteOrder.nativeOrder());
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) (arrayListM4040.size() * 2));
        byteBufferAllocate.put((byte) (arrayListM4041.size() * 2));
        byteBufferAllocate.put((byte) 9);
        for (int i = 0; i < 2; i++) {
            byteBufferAllocate.putInt(0);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            byteBufferAllocate.putInt(0);
        }
        byteBufferAllocate.putInt(0);
        for (C2220 c2220 : arrayListM4040) {
            byteBufferAllocate.putInt(c2220.f7208);
            byteBufferAllocate.putInt(c2220.f7209);
        }
        for (C2220 c2221 : arrayListM4041) {
            byteBufferAllocate.putInt(c2221.f7208);
            byteBufferAllocate.putInt(c2221.f7209);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            byteBufferAllocate.putInt(1);
        }
        NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(resources, bitmapCreateBitmap, byteBufferAllocate.array(), new Rect(), null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (numValueOf != null) {
            ninePatchDrawable.setTint(numValueOf.intValue());
        }
        Drawable.ConstantState constantState = ninePatchDrawable.getConstantState();
        if (constantState != null) {
            Drawable drawableMutate = constantState.newDrawable().mutate();
            C2041 c2041 = f6815;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                c2041.getClass();
                float[] fArr = new float[3];
                Color.colorToHSV(iIntValue, fArr);
                fArr[2] = fArr[2] * 0.8f;
                iHSVToColor = Color.HSVToColor(fArr);
            } else {
                c2041.getClass();
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
    }

    @Override // p000.InterfaceC1578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1408(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3264()) {
            int type = msgInfoBean.getType();
            if (type == EnumC3673.f11469.f11492 || type == EnumC3673.f11479.f11492 || type == EnumC3673.f11487.f11492 || type == EnumC3673.f11488.f11492) {
                C2090.f6898.getClass();
                View viewFindViewById = view.findViewById(C2090.m3885());
                if (viewFindViewById != null) {
                    m3880(viewFindViewById, msgInfoBean.isSend());
                    return;
                }
                return;
            }
            if (type != EnumC3673.f11471.f11492) {
                if (type == EnumC3673.f11477.f11492) {
                    C2090.f6898.getClass();
                    C1565.f5440.getClass();
                    View viewFindViewById2 = view.findViewById(C1565.m3280() ? C2089.f6897.m2538() : AbstractC0968.m2475(C2090.m3890()));
                    if (viewFindViewById2 != null) {
                        m3880(viewFindViewById2, msgInfoBean.isSend());
                        return;
                    }
                    return;
                }
                return;
            }
            C2090.f6898.getClass();
            C1565 c1565 = C1565.f5440;
            c1565.getClass();
            View viewFindViewById3 = view.findViewById(C1565.m3280() ? C2086.f6894.m2538() : AbstractC0968.m2475(C2090.m3887()));
            if (viewFindViewById3 != null) {
                m3880(viewFindViewById3, msgInfoBean.isSend());
            }
            c1565.getClass();
            View viewFindViewById4 = view.findViewById(C1565.m3280() ? C2087.f6895.m2538() : AbstractC0968.m2475(C2090.m3888()));
            if (viewFindViewById4 != null) {
                m3880(viewFindViewById4, msgInfoBean.isSend());
            }
            c1565.getClass();
            View viewFindViewById5 = view.findViewById(C1565.m3280() ? C2088.f6896.m2538() : AbstractC0968.m2475(C2090.m3890()));
            if (viewFindViewById5 != null) {
                m3880(viewFindViewById5, msgInfoBean.isSend());
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f6822;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f6821;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f6820;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f6823;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
