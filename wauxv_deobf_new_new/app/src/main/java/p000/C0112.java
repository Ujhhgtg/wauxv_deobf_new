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
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0112 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1120;

    public /* synthetic */ C0112(int i) {
        this.f1120 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᲈᤞᲇᲀ] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // p000.InterfaceC1422
    public final Object invoke() {
        String str;
        int i = this.f1120;
        int i2 = 2;
        ?? r3 = 0;
        int i3 = 1;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                Object objM2364 = C0770.m2364(C0770.f2874, EnumC3575.f11176.f11180);
                "null cannot be cast to non-null type kotlin.String";
                return (String) objM2364;
            case 1:
                Object objM2365 = C0770.m2364(C0770.f2874, EnumC3575.f11177.f11180);
                if (objM2365 instanceof String) {
                    str = (String) objM2365;
                }
                if (r3 == 0) {
                    r3 = str;
                    return "未填写";
                }
                r3 = str;
                return r3;
            case 2:
                Object objM2366 = C0770.m2364(C0770.f2874, EnumC3575.f11178.f11180);
                String str2 = objM2366 instanceof String ? (String) objM2366 : null;
                return str2 == null ? "未填写" : str2;
            case 3:
                C0120.f1129.m2669(40);
                C0119.f1128.m2669(80);
                C0118.f1127.m2668(0.5f);
                C0124.f1133.m2667(true);
                C0125.f1134.m2669(4);
                C0123 c0123 = C0123.f1132;
                C0129.f1138.getClass();
                c0123.m2672((String) C0129.f1139.getValue());
                C0116.f1125.m2667(true);
                C0117.f1126.m2669(4);
                C0115.f1124.m2672((String) C0129.f1140.getValue());
                C0127.f1136.m2667(true);
                C0128.f1137.m2669(4);
                C0126.f1135.m2672((String) C0129.f1141.getValue());
                C0122 c0122 = C0122.f1131;
                String[] strArr = AbstractC1471.f5234;
                c0122.m2672("#FFFFFFFF");
                C0121.f1130.m2672("#FF191919");
                return c3554;
            case 4:
                return new C0160(29);
            case 5:
                return Integer.valueOf(Build.VERSION.SDK_INT);
            case 6:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            case 7:
                File file = new File(C0438.f2011, "icon_chats.png");
                if (file.exists()) {
                    return BitmapFactory.decodeFile(file.getAbsolutePath());
                }
                C0438.f2010.getClass();
                return (Bitmap) C0438.f2012.getValue();
            case 8:
                File file2 = new File(C0438.f2011, "icon_contacts.png");
                if (file2.exists()) {
                    return BitmapFactory.decodeFile(file2.getAbsolutePath());
                }
                C0438.f2010.getClass();
                return (Bitmap) C0438.f2012.getValue();
            case 9:
                File file3 = new File(C0438.f2011, "icon_discover.png");
                if (file3.exists()) {
                    return BitmapFactory.decodeFile(file3.getAbsolutePath());
                }
                C0438.f2010.getClass();
                return (Bitmap) C0438.f2012.getValue();
            case 10:
                File file4 = new File(C0438.f2011, "icon_me.png");
                if (file4.exists()) {
                    return BitmapFactory.decodeFile(file4.getAbsolutePath());
                }
                C0438.f2010.getClass();
                return (Bitmap) C0438.f2012.getValue();
            case 11:
                C0430 c0430 = C0430.f2002;
                String[] strArr2 = AbstractC1471.f5234;
                c0430.m2672("微信");
                C0431.f2003.m2672("通讯");
                C0432.f2004.m2672("发现");
                C0435.f2007.m2672("我的");
                C0436.f2008.m2667(true);
                C0437.f2009.m2667(true);
                C0434.f2006.m2667(false);
                C0433.f2005.m2667(false);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap2.eraseColor(0);
                return bitmapCreateBitmap2;
            case 13:
                File file5 = new File(C0448.f2037, "icon_chats.png");
                if (file5.exists()) {
                    return BitmapFactory.decodeFile(file5.getAbsolutePath());
                }
                C0448.f2036.getClass();
                return (Bitmap) C0448.f2038.getValue();
            case Opcodes.DCONST_0 /* 14 */:
                File file6 = new File(C0448.f2037, "icon_contacts.png");
                if (file6.exists()) {
                    return BitmapFactory.decodeFile(file6.getAbsolutePath());
                }
                C0448.f2036.getClass();
                return (Bitmap) C0448.f2038.getValue();
            case 15:
                File file7 = new File(C0448.f2037, "icon_discover.png");
                if (file7.exists()) {
                    return BitmapFactory.decodeFile(file7.getAbsolutePath());
                }
                C0448.f2036.getClass();
                return (Bitmap) C0448.f2038.getValue();
            case 16:
                File file8 = new File(C0448.f2037, "icon_me.png");
                if (file8.exists()) {
                    return BitmapFactory.decodeFile(file8.getAbsolutePath());
                }
                C0448.f2036.getClass();
                return (Bitmap) C0448.f2038.getValue();
            case Opcodes.SIPUSH /* 17 */:
                C0443 c0443 = C0443.f2031;
                String[] strArr3 = AbstractC1471.f5234;
                c0443.m2672("#FFF7F7F7");
                C0447.f2035.m2672("#FFCCE8E3");
                C0445.f2033.m2672("#FF1E1E1E");
                C0442.f2030.m2672("#FF1E1E1E");
                C0446.f2034.m2672("#FF324B48");
                C0444.f2032.m2672("#FFF7F7F7");
                return c3554;
            case Opcodes.LDC /* 18 */:
                C0612 c0612 = C0612.f2452;
                String[] strArr4 = AbstractC1471.f5234;
                c0612.m2672("#FFEDEDED");
                C0605.f2445.m2672("#FF006A62");
                C0607.f2447.m2672("#FF161D1C");
                C0609.f2449.m2672("#FF006A62");
                C0611.f2451.m2672("#FF242424");
                C0604.f2444.m2672("#FF81D5CB");
                C0606.f2446.m2672("#FFDDE4E2");
                C0608.f2448.m2672("#FF81D5CB");
                C0615.f2456.getClass();
                C0615.m2139();
                return c3554;
            case 19:
                C0621.f2469.m2672("今日已发${totalMsg}条");
                C0620.f2468.m2667(true);
                return c3554;
            case 20:
                C1006 c1006 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0314(i2, r3, i3));
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1006 c1007 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0314(i2, r3, i2));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1993 c1993 = new C1993();
                C1576.f5470.getClass();
                c1993.f987 = (int) (C1576.m3456().getResources().getDisplayMetrics().heightPixels * 0.9f);
                c1993.m3984();
                return c1993;
            case Opcodes.FLOAD /* 23 */:
                C1576.f5470.getClass();
                View viewInflate = View.inflate(AbstractC1134.m2849(AbstractC2902.m4884(C1576.m3456())), R.layout.module_dialog_choose_contacts, null);
                "null cannot be cast to non-null type android.widget.LinearLayout";
                return (LinearLayout) viewInflate;
            case Opcodes.DLOAD /* 24 */:
                C1576.f5470.getClass();
                return (LinearLayout) View.inflate(AbstractC1134.m2849(AbstractC2902.m4884(C1576.m3456())), R.layout.item_rv_contact_tab, null).findViewById(R.id.itemContactLinearLayout);
            case Opcodes.ALOAD /* 25 */:
                try {
                    AbstractC1569[] abstractC1569ArrM4201 = AbstractC2235.m4201();
                    C0179 c0179 = new C0179(5);
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC1569ArrM4201, 255);
                    if (objArrCopyOf.length > 1) {
                        Arrays.sort(objArrCopyOf, c0179);
                    }
                    return Arrays.asList(objArrCopyOf);
                } catch (Exception e) {
                    ArrayList arrayList = C3741.f11709;
                    C3741.m5315("getAnnoHookList Failed", e, 12);
                    return C1191.f4326;
                }
            case 26:
                C1176.f4303.m2672(C1177.f4305);
                return c3554;
            case 27:
                C1576.f5470.getClass();
                return C1576.m3455();
            case 28:
                C1324.f4771.m2672(C1325.f4773);
                return c3554;
            default:
                C2933 c2933 = AbstractC2381.f7642;
                String[] strArr5 = AbstractC1471.f5234;
                return AbstractC2381.m4344("Resource", "Fab");
        }
    }
}
