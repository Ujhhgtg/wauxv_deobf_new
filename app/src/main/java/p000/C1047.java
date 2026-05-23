package p000;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲇᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1047 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3816;

    public /* synthetic */ C1047(int i) {
        this.f3816 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        int i = this.f3816;
        int i2 = 3;
        Class<String> cls = String.class;
        int i3 = 4;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                C1563 c1563 = (C1563) obj;
                c1563.getClass();
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) (c2585 instanceof C2585 ? null : c2585);
                if (layoutParams.screenBrightness >= 0.5f) {
                    layoutParams.screenBrightness = -1.0f;
                }
                return c3497;
            case 1:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C1047(i2);
                c1020.f3733 = new C1047(i3);
                return c3497;
            case 2:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[2];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (AbstractC2841.m4828((c2586 instanceof C2585 ? null : c2586).toString(), " files/fastkv ", false)) {
                    c1564.m3270();
                }
                return c3497;
            case 3:
                C1332 c1332 = (C1332) obj;
                c1332.getClass();
                C0705 c0705 = new C0705(4);
                String[] strArr = AbstractC1574.f5469;
                if (AbstractC3471.m5079(EnumC3677.f11533) || AbstractC3471.m5080(EnumC3674.f11496)) {
                    c0705.m2127("entry", "relPath");
                } else {
                    c0705.m2127("entry", "fe.relPath");
                }
                c1332.f4791 = c0705;
                return c3497;
            case 4:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                Class<Boolean> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(Boolean.class));
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1981M4739, clsM2183 != null ? clsM2183 : Boolean.class, Integer.class);
                Class cls2 = clsM4740 != null ? clsM4740 : Integer.class;
                Class<String> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                c1981M4739.m3823(cls2, clsM2184 != null ? clsM2184 : String.class, null);
                c1333.f4794 = c1981M4739;
                return c3497;
            case 5:
                C1020 c1021 = (C1020) obj;
                c1021.f3732 = new C1047(6);
                c1021.f3733 = new C1047(7);
                return c3497;
            case 6:
                C1332 c1334 = (C1332) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1334.m3051("com.tencent.mm.ui.chatting.viewitems");
                C0705 c0706 = new C0705(4);
                c0706.m2127(".msgsource.sec_msg_node.clip-len");
                C2837 c2837 = new C2837("MicroMsg.ChattingItem", 1, false);
                List arrayList = c0706.f2688;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c0706.f2688 = arrayList;
                arrayList.add(c2837);
                c1334.f4791 = c0706;
                return c3497;
            case 7:
                ((C1333) obj).m3052(new C1047(9));
                return c3497;
            case 8:
                ((C1563) obj).m3272(null);
                return c3497;
            case 9:
                ((C1981) obj).m3827(".msgsource.sec_msg_node.clip-len");
                return c3497;
            case 10:
                ((C1020) obj).f3733 = new C1047(11);
                return c3497;
            case 11:
                ((C1333) obj).m3052(new C1047(13));
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1563) obj).m3270();
                return c3497;
            case 13:
                String[] strArr3 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.PluginPatMsg", "DisableSendPat");
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr4 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ");
                return c3497;
            case 15:
                String[] strArr5 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_disable_ringtone_play, null, false);
                int i4 = R.id.moduleDialogCbDisableRingtoneInCall;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbDisableRingtoneInCall);
                if (materialCheckBox != null) {
                    i4 = R.id.moduleDialogCbDisableRingtoneOutCall;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbDisableRingtoneOutCall);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4676;
                        C2016 c2016 = new C2016(linearLayout, materialCheckBox, materialCheckBox2);
                        materialCheckBox2.setChecked(C1057.f3835.m2536());
                        materialCheckBox.setChecked(C1056.f3834.m2536());
                        C2007 c2007 = new C2007();
                        C1058.f3836.getClass();
                        c2007.f6678 = C1058.f3838;
                        c2007.f6680 = linearLayout;
                        c2007.m3870("保存", new C0106(19, c2016));
                        AbstractC2784.m4755(c2007, null, 3);
                        return c3497;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i4)));
            case 16:
                ((C1020) obj).f3733 = new C1047(18);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                C1563 c1565 = (C1563) obj;
                c1565.getClass();
                try {
                    c2587 = c1565.m3267()[1];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                Bundle bundle = (Bundle) (c2587 instanceof C2585 ? null : c2587);
                String[] strArr6 = AbstractC1574.f5469;
                if (AbstractC2207.m4087(bundle.getString("scene"), "start")) {
                    boolean z = bundle.getBoolean("isOutCall");
                    boolean z2 = z && C1057.f3835.m2536();
                    boolean z3 = !z && C1056.f3834.m2536();
                    if (z2 || z3) {
                        c1565.m3270();
                    }
                }
                return c3497;
            case Opcodes.LDC /* 18 */:
                ((C1333) obj).m3052(new C1047(14));
                return c3497;
            case 19:
                ((C1020) obj).f3733 = new C1047(21);
                return c3497;
            case 20:
                ((C1563) obj).m3272(null);
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                C1333 c1335 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.ui.chatting.component");
                C1981 c1981 = new C1981(4);
                c1981.m3827("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!");
                c1335.f4794 = c1981;
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                ((C1020) obj).f3732 = new C1047(23);
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                ((C1332) obj).m3050(new C1047(24));
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr8 = AbstractC1574.f5469;
                ((C0705) obj).m2127("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)");
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                C1020 c1022 = (C1020) obj;
                c1022.f3732 = new C1047(26);
                c1022.f3733 = new C1047(27);
                return c3497;
            case 26:
                ((C1332) obj).m3050(new C1047(29));
                return c3497;
            case 27:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1336);
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                if (clsM2185 == null) {
                    clsM2185 = cls;
                }
                Class<String> clsM4741 = AbstractC2784.m4740(c1981M47310, clsM2185, cls);
                c1981M47310.m3823(clsM4741 != null ? clsM4741 : String.class);
                String[] strArr9 = AbstractC1574.f5469;
                c1981M47310.m3827("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
                c1336.f4794 = c1981M47310;
                return c3497;
            case 28:
                C1563 c1566 = (C1563) obj;
                c1566.getClass();
                try {
                    c2588 = c1566.m3267()[0];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                if (c2588 instanceof C2585) {
                    c2588 = null;
                }
                Iterator it = C1130.f4201.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                    } catch (Exception e) {
                        ArrayList arrayList2 = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr10 = AbstractC1574.f5469;
                        sb.append("onGetDynamicConfig ");
                        sb.append("LoadHook");
                        AbstractC1194.m2792(sb, " Failed", e, 12);
                    }
                }
                return c3497;
            default:
                String[] strArr11 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s");
                return c3497;
        }
    }
}
