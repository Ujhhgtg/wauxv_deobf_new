package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0104 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1052;

    public /* synthetic */ C0104(int i) {
        this.f1052 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᤞᲁᲈᲀ] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // p000.InterfaceC1414
    public final Object invoke() {
        String str;
        List list;
        int i = this.f1052;
        int i2 = 2;
        ?? r3 = 0;
        int i3 = 1;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                Object objM2263 = C0772.m2263(C0772.f2872, EnumC3517.f11023.f11027);
                "null cannot be cast to non-null type kotlin.String";
                return (String) objM2263;
            case 1:
                Object objM2264 = C0772.m2263(C0772.f2872, EnumC3517.f11024.f11027);
                if (objM2264 instanceof String) {
                    str = (String) objM2264;
                }
                if (r3 == 0) {
                    r3 = str;
                    return "未填写";
                }
                r3 = str;
                return r3;
            case 2:
                Object objM2265 = C0772.m2263(C0772.f2872, EnumC3517.f11025.f11027);
                String str2 = objM2265 instanceof String ? (String) objM2265 : null;
                return str2 == null ? "未填写" : str2;
            case 3:
                C0112.f1061.m2545(40);
                C0111.f1060.m2545(80);
                C0110.f1059.m2544(0.5f);
                C0116.f1065.m2543(true);
                C0117.f1066.m2545(4);
                C0115 c0115 = C0115.f1064;
                C0121.f1070.getClass();
                c0115.m2548((String) C0121.f1071.getValue());
                C0108.f1057.m2543(true);
                C0109.f1058.m2545(4);
                C0107.f1056.m2548((String) C0121.f1072.getValue());
                C0119.f1068.m2543(true);
                C0120.f1069.m2545(4);
                C0118.f1067.m2548((String) C0121.f1073.getValue());
                C0114 c0114 = C0114.f1063;
                String[] strArr = AbstractC1574.f5469;
                c0114.m2548("#FFFFFFFF");
                C0113.f1062.m2548("#FF191919");
                return c3497;
            case 4:
                return new C0152(29);
            case 5:
                return Integer.valueOf(Build.VERSION.SDK_INT);
            case 6:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            case 7:
                File file = new File(C0463.f2039, "icon_chats.png");
                if (file.exists()) {
                    return BitmapFactory.decodeFile(file.getAbsolutePath());
                }
                C0463.f2038.getClass();
                return (Bitmap) C0463.f2040.getValue();
            case 8:
                File file2 = new File(C0463.f2039, "icon_contacts.png");
                if (file2.exists()) {
                    return BitmapFactory.decodeFile(file2.getAbsolutePath());
                }
                C0463.f2038.getClass();
                return (Bitmap) C0463.f2040.getValue();
            case 9:
                File file3 = new File(C0463.f2039, "icon_discover.png");
                if (file3.exists()) {
                    return BitmapFactory.decodeFile(file3.getAbsolutePath());
                }
                C0463.f2038.getClass();
                return (Bitmap) C0463.f2040.getValue();
            case 10:
                File file4 = new File(C0463.f2039, "icon_me.png");
                if (file4.exists()) {
                    return BitmapFactory.decodeFile(file4.getAbsolutePath());
                }
                C0463.f2038.getClass();
                return (Bitmap) C0463.f2040.getValue();
            case 11:
                C0455 c0455 = C0455.f2030;
                String[] strArr2 = AbstractC1574.f5469;
                c0455.m2548(MagicFactory.get(-476243153648308L, strArr2));
                C0456.f2031.m2548(MagicFactory.get(-476256038550196L, strArr2));
                C0457.f2032.m2548(MagicFactory.get(-476268923452084L, strArr2));
                C0460.f2035.m2548(MagicFactory.get(-476281808353972L, strArr2));
                C0461.f2036.m2543(true);
                C0462.f2037.m2543(true);
                C0459.f2034.m2543(false);
                C0458.f2033.m2543(false);
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap2.eraseColor(0);
                return bitmapCreateBitmap2;
            case 13:
                File file5 = new File(C0473.f2065, "icon_chats.png");
                if (file5.exists()) {
                    return BitmapFactory.decodeFile(file5.getAbsolutePath());
                }
                C0473.f2064.getClass();
                return (Bitmap) C0473.f2066.getValue();
            case Opcodes.DCONST_0 /* 14 */:
                File file6 = new File(C0473.f2065, "icon_contacts.png");
                if (file6.exists()) {
                    return BitmapFactory.decodeFile(file6.getAbsolutePath());
                }
                C0473.f2064.getClass();
                return (Bitmap) C0473.f2066.getValue();
            case 15:
                File file7 = new File(C0473.f2065, "icon_discover.png");
                if (file7.exists()) {
                    return BitmapFactory.decodeFile(file7.getAbsolutePath());
                }
                C0473.f2064.getClass();
                return (Bitmap) C0473.f2066.getValue();
            case 16:
                File file8 = new File(C0473.f2065, "icon_me.png");
                if (file8.exists()) {
                    return BitmapFactory.decodeFile(file8.getAbsolutePath());
                }
                C0473.f2064.getClass();
                return (Bitmap) C0473.f2066.getValue();
            case Opcodes.SIPUSH /* 17 */:
                C0468 c0468 = C0468.f2059;
                String[] strArr3 = AbstractC1574.f5469;
                c0468.m2548(MagicFactory.get(-479911055719092L, strArr3));
                C0472.f2063.m2548(MagicFactory.get(-479954005392052L, strArr3));
                C0470.f2061.m2548(MagicFactory.get(-479996955065012L, strArr3));
                C0467.f2058.m2548(MagicFactory.get(-480039904737972L, strArr3));
                C0471.f2062.m2548(MagicFactory.get(-480082854410932L, strArr3));
                C0469.f2060.m2548(MagicFactory.get(-480125804083892L, strArr3));
                return c3497;
            case Opcodes.LDC /* 18 */:
                C0620 c0620 = C0620.f2449;
                String[] strArr4 = AbstractC1574.f5469;
                c0620.m2548(MagicFactory.get(-624793187515060L, strArr4));
                C0613.f2442.m2548(MagicFactory.get(-624836137188020L, strArr4));
                C0615.f2444.m2548(MagicFactory.get(-624879086860980L, strArr4));
                C0617.f2446.m2548(MagicFactory.get(-624922036533940L, strArr4));
                C0619.f2448.m2548(MagicFactory.get(-624964986206900L, strArr4));
                C0612.f2441.m2548(MagicFactory.get(-625007935879860L, strArr4));
                C0614.f2443.m2548(MagicFactory.get(-625050885552820L, strArr4));
                C0616.f2445.m2548(MagicFactory.get(-625093835225780L, strArr4));
                return c3497;
            case 19:
                C0628.f2463.m2548("今日已发${totalMsg}条");
                C0627.f2462.m2543(true);
                return c3497;
            case 20:
                C1002 c1002 = AbstractC1075.f3893;
                AbstractC0968.m2486(ExecutorC0990.f3609, new C0303(i2, r3, i3));
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                C1002 c1003 = AbstractC1075.f3893;
                AbstractC0968.m2486(ExecutorC0990.f3609, new C0303(i2, r3, i2));
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                C1962 c1962 = new C1962();
                C1565.f5440.getClass();
                c1962.f921 = (int) (C1565.m3276().getResources().getDisplayMetrics().heightPixels * 0.9f);
                c1962.m3790();
                return c1962;
            case Opcodes.FLOAD /* 23 */:
                C1565.f5440.getClass();
                View viewInflate = View.inflate(AbstractC1128.m2700(AbstractC2207.m4086(C1565.m3276())), R.layout.module_dialog_choose_contacts, null);
                "null cannot be cast to non-null type android.widget.LinearLayout";
                return (LinearLayout) viewInflate;
            case Opcodes.DLOAD /* 24 */:
                C1565.f5440.getClass();
                return (LinearLayout) View.inflate(AbstractC1128.m2700(AbstractC2207.m4086(C1565.m3276())), R.layout.item_rv_contact_tab, null).findViewById(R.id.itemContactLinearLayout);
            case Opcodes.ALOAD /* 25 */:
                try {
                    AbstractC1557[] abstractC1557ArrM4093 = AbstractC2207.m4093();
                    C0171 c0171 = new C0171(i2);
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC1557ArrM4093, 248);
                    if (objArrCopyOf.length > 1) {
                        Arrays.sort(objArrCopyOf, c0171);
                    }
                    return Arrays.asList(objArrCopyOf);
                } catch (Exception e) {
                    ArrayList arrayList = C3678.f11549;
                    C3678.m5306("getAnnoHookList Failed", e, 12);
                    return C1189.f4329;
                }
            case 26:
                C1174.f4306.m2548(C1175.f4308);
                return c3497;
            case 27:
                C1565.f5440.getClass();
                return C1565.m3275();
            case 28:
                C1322.f4771.m2548(C1323.f4773);
                return c3497;
            default:
                File file9 = new File(C1362.f4863, "menuItemsV2.json");
                if (file9.exists()) {
                    C1706 c1706 = C1706.f5798;
                    String strM3043 = AbstractC1328.m3043(file9);
                    c1706.getClass();
                    list = (List) c1706.m3468(new C0258(C1357.Companion.serializer()), strM3043);
                } else {
                    C1706 c1707 = C1706.f5798;
                    List list2 = C1362.f4864;
                    c1707.getClass();
                    AbstractC1328.m3044(file9, c1707.m3469(new C0258(C1357.Companion.serializer()), list2));
                    list = list2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((C1357) obj).f4857) {
                        arrayList2.add(obj);
                    }
                }
                return AbstractC0744.m2201(arrayList2, new C0171(7));
        }
    }
}
