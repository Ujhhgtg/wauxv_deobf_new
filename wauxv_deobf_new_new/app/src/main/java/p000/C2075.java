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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᛸᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2075 extends AbstractC2927 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2075 f6941;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f6942;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C2933 f6943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C2933 f6944;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2933 f6945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f6946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f6947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final String f6948;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C2059 f6949;

    static {
        AbstractC1471.m3394(-514442592778883L);
        String[] strArr = AbstractC1471.f5234;
        f6941 = new C2075("MsgBgBubbleHook");
        C2933 c2933 = AbstractC2381.f7642;
        f6942 = AbstractC2381.m4344("Resource", "Bubble");
        f6943 = new C2933(new C1356(24));
        f6944 = new C2933(new C1356(25));
        f6945 = new C2933(new C1356(26));
        f6946 = "美化";
        f6947 = "消息背景气泡";
        f6948 = "仅支持配置部分消息, 与背景颜色冲突";
        f6949 = new C2059(9);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static void m4063(View view, boolean z) {
        int iHSVToColor;
        int color = AbstractC2234.m4176(view.getContext()) ? Color.parseColor((!z ? C2071.f6937 : C2073.f6939).m2666()) : Color.parseColor((!z ? C2072.f6938 : C2074.f6940).m2666());
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        Resources resources = view.getResources();
        Bitmap bitmap = !z ? (Bitmap) f6945.getValue() : (Bitmap) f6944.getValue();
        Integer numValueOf = color != 0 ? Integer.valueOf(color) : null;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 1, 1, bitmap.getWidth() - 2, bitmap.getHeight() - 2);
        ArrayList<C2251> arrayListM2866 = C1139.m2866(bitmap, true, false);
        ArrayList<C2251> arrayListM2867 = C1139.m2866(bitmap, false, false);
        C2251 c2251 = (C2251) AbstractC0739.m2291(C1139.m2866(bitmap, true, true));
        C2251 c2252 = (C2251) AbstractC0739.m2291(C1139.m2866(bitmap, false, true));
        Rect rect = new Rect(c2251 != null ? c2251.f7328 : 0, c2252 != null ? c2252.f7328 : 0, c2251 != null ? (bitmap.getWidth() - 2) - c2251.f7329 : 0, c2252 != null ? (bitmap.getHeight() - 2) - c2252.f7329 : 0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((arrayListM2867.size() + arrayListM2866.size()) * 8) + 68);
        byteBufferAllocate.order(ByteOrder.nativeOrder());
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) (arrayListM2866.size() * 2));
        byteBufferAllocate.put((byte) (arrayListM2867.size() * 2));
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
        for (C2251 c2253 : arrayListM2866) {
            byteBufferAllocate.putInt(c2253.f7328);
            byteBufferAllocate.putInt(c2253.f7329);
        }
        for (C2251 c2254 : arrayListM2867) {
            byteBufferAllocate.putInt(c2254.f7328);
            byteBufferAllocate.putInt(c2254.f7329);
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
            C2075 c2075 = f6941;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                c2075.getClass();
                float[] fArr = new float[3];
                Color.colorToHSV(iIntValue, fArr);
                fArr[2] = fArr[2] * 0.8f;
                iHSVToColor = Color.HSVToColor(fArr);
            } else {
                c2075.getClass();
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

    @Override // p000.InterfaceC1590
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1554(View view, Object obj, Object obj2, MsgInfoBean msgInfoBean) {
        if (mo3445()) {
            int type = msgInfoBean.getType();
            if (type == EnumC3733.f11618.f11641 || type == EnumC3733.f11628.f11641 || type == EnumC3733.f11636.f11641 || type == EnumC3733.f11637.f11641) {
                C2123.f7022.getClass();
                View viewFindViewById = view.findViewById(C2123.m4068());
                if (viewFindViewById != null) {
                    m4063(viewFindViewById, msgInfoBean.isSend());
                    return;
                }
                return;
            }
            if (type != EnumC3733.f11620.f11641) {
                if (type == EnumC3733.f11626.f11641) {
                    C2123.f7022.getClass();
                    C1576.f5470.getClass();
                    View viewFindViewById2 = view.findViewById(C1576.m3460() ? C2122.f7021.m2662() : AbstractC1468.m3308(C2123.m4073()));
                    if (viewFindViewById2 != null) {
                        m4063(viewFindViewById2, msgInfoBean.isSend());
                        return;
                    }
                    return;
                }
                return;
            }
            C2123.f7022.getClass();
            C1576 c1576 = C1576.f5470;
            c1576.getClass();
            View viewFindViewById3 = view.findViewById(C1576.m3460() ? C2119.f7018.m2662() : AbstractC1468.m3308(C2123.m4070()));
            if (viewFindViewById3 != null) {
                m4063(viewFindViewById3, msgInfoBean.isSend());
            }
            c1576.getClass();
            View viewFindViewById4 = view.findViewById(C1576.m3460() ? C2120.f7019.m2662() : AbstractC1468.m3308(C2123.m4071()));
            if (viewFindViewById4 != null) {
                m4063(viewFindViewById4, msgInfoBean.isSend());
            }
            c1576.getClass();
            View viewFindViewById5 = view.findViewById(C1576.m3460() ? C2121.f7020.m2662() : AbstractC1468.m3308(C2123.m4073()));
            if (viewFindViewById5 != null) {
                m4063(viewFindViewById5, msgInfoBean.isSend());
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f6948;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f6947;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f6946;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f6949;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
