package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲇᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1055 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3834;

    public /* synthetic */ C1055(int i) {
        this.f3834 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        Object c2643;
        int i = this.f3834;
        int i2 = 12;
        int i3 = 21;
        int i4 = 5;
        int i5 = 17;
        int i6 = 1;
        int i7 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.PluginPatMsg", "DisableSendPat");
                return c3554;
            case 1:
                String[] strArr2 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ");
                return c3554;
            case 2:
                String[] strArr3 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_disable_ringtone_play, null, false);
                int i8 = R.id.moduleDialogCbDisableRingtoneInCall;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbDisableRingtoneInCall);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogCbDisableRingtoneOutCall;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbDisableRingtoneOutCall);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4622;
                        C2046 c2046 = new C2046(linearLayout, materialCheckBox, materialCheckBox2, 1);
                        materialCheckBox2.setChecked(C1060.f3842.m2660());
                        materialCheckBox.setChecked(C1059.f3841.m2660());
                        C2037 c2037 = new C2037();
                        C1061.f3843.getClass();
                        c2037.f6779 = C1061.f3845;
                        c2037.f6781 = linearLayout;
                        c2037.m4057("保存", new C0114(c2046, i3));
                        AbstractC2844.m4788(c2037, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i8)));
            case 3:
                ((C1023) obj).f3740 = new C1055(i4);
                return c3554;
            case 4:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[1];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Bundle bundle = (Bundle) (c2641 instanceof C2641 ? null : c2641);
                String[] strArr4 = AbstractC1471.f5234;
                if (AbstractC1469.m3322(bundle.getString("scene"), "start")) {
                    boolean z = bundle.getBoolean("isOutCall");
                    boolean z2 = z && C1060.f3842.m2660();
                    i6 = (z || !C1059.f3841.m2660()) ? 0 : 1;
                    if (z2 || i6 != 0) {
                        c1574.m3450();
                    }
                }
                return c3554;
            case 5:
                ((C1335) obj).m3155(new C1055(i6));
                return c3554;
            case 6:
                ((C1023) obj).f3740 = new C1055(8);
                return c3554;
            case 7:
                ((C1574) obj).m3452(null);
                return c3554;
            case 8:
                C1335 c1335 = (C1335) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.ui.chatting.component");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!");
                c1335.f4794 = c2012;
                return c3554;
            case 9:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                new C0383(0, 6, c1575).m1714(Boolean.FALSE);
                return c3554;
            case 10:
                ((C1023) obj).f3739 = new C1055(11);
                return c3554;
            case 11:
                ((C1334) obj).m3153(new C1055(i2));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                String[] strArr6 = AbstractC1471.f5234;
                ((C0700) obj).m2220("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)");
                return c3554;
            case 13:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C1055(14);
                c1023.f3740 = new C1055(15);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1334) obj).m3153(new C1055(i5));
                return c3554;
            case 15:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1336);
                Class<String> cls = String.class;
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4232 == null) {
                    clsM4232 = cls;
                }
                Class<String> clsM4774 = AbstractC2844.m4774(c2012M4773, clsM4232, cls);
                c2012M4773.m4017(clsM4774 != null ? clsM4774 : String.class);
                String[] strArr7 = AbstractC1471.f5234;
                c2012M4773.m4021("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
                c1336.f4794 = c2012M4773;
                return c3554;
            case 16:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2642 = c1576.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                Iterator it = C1136.f4212.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr8 = AbstractC1471.f5234;
                        sb.append("onGetDynamicConfig ");
                        sb.append("LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr9 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s");
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1023) obj).f3739 = new C1055(19);
                return c3554;
            case 19:
                C1334 c1334 = (C1334) obj;
                String[] strArr10 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.feature.emoji");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.EmojiFeatureService", "[onAccountInitialized]", "onAccountRelease: ");
                c1334.f4791 = c0700;
                return c3554;
            case 20:
                ((C1023) obj).f3739 = new C1055(i3);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1334) obj).m3153(new C1055(22));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr11 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path is no exist :%s ");
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C1055(25);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C1574 c1577 = (C1574) obj;
                C1161 c1161 = C1161.f4280;
                c1577.getClass();
                try {
                    c2643 = c1577.m3447()[3];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                if (c2643 instanceof C2641) {
                    c2643 = null;
                }
                Class<? super Object> superclass = c2643.getClass().getSuperclass();
                int i9 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4712(superclass).m3558();
                AbstractC0745.m2317(c1300M3558.f6477, (EnumC2030[]) Arrays.copyOf(new EnumC2030[]{EnumC2030.FINAL}, 1));
                c1300M3558.f4724 = AbstractC2574.m4549(Integer.TYPE);
                C1316 c1316 = (C1316) AbstractC0739.m2290(c1300M3558.m3117());
                c1316.m3542(c2643);
                if (((Number) c1316.m3127()).intValue() == 0) {
                    C1300 c1300M3559 = AbstractC2727.m4713(c2643).m3558();
                    String[] strArr12 = AbstractC1471.f5234;
                    c1300M3559.f4724 = "com.tencent.mm.api.IEmojiInfo";
                    C2004 c2004M3560 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3126()).m3560();
                    c2004M3560.f6475 = "getMd5";
                    String str = (String) ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4026(new Object[0]);
                    if (AbstractC1469.m3322(str, "9bd1281af3a31710a45b84d736363691")) {
                        c1161.getClass();
                        c1577.m3452(null);
                        AlertDialog.Builder builder = new AlertDialog.Builder(AbstractC1586.m3476());
                        builder.setTitle("选择猜拳");
                        RadioGroup radioGroup = new RadioGroup(builder.getContext());
                        radioGroup.setGravity(17);
                        radioGroup.setOrientation(0);
                        C1227 c1227 = EnumC1160.f4277;
                        c1227.getClass();
                        C0067 c0067 = new C0067(c1227, 0);
                        while (c0067.hasNext()) {
                            EnumC1160 enumC1160 = (EnumC1160) c0067.next();
                            RadioButton radioButton = new RadioButton(radioGroup.getContext());
                            radioButton.setId(enumC1160.f4278);
                            radioButton.setText(enumC1160.f4279);
                            radioButton.setOnClickListener(new ViewOnClickListenerC0111(enumC1160, 6));
                            radioGroup.addView(radioButton);
                        }
                        builder.setView(radioGroup);
                        builder.setNeutralButton("随机", new DialogInterfaceOnClickListenerC1137(2));
                        builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        builder.show();
                    } else if (AbstractC1469.m3322(str, "08f223fa83f1ca34e143d1e580252c7c")) {
                        c1161.getClass();
                        c1577.m3452(null);
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(AbstractC1586.m3476());
                        builder2.setTitle("选择骰子");
                        RadioGroup radioGroup2 = new RadioGroup(builder2.getContext());
                        radioGroup2.setGravity(17);
                        radioGroup2.setOrientation(0);
                        C1227 c1228 = EnumC1158.f4272;
                        c1228.getClass();
                        C0067 c0068 = new C0067(c1228, 0);
                        while (c0068.hasNext()) {
                            EnumC1158 enumC1158 = (EnumC1158) c0068.next();
                            RadioButton radioButton2 = new RadioButton(radioGroup2.getContext());
                            radioButton2.setId(enumC1158.f4273);
                            radioButton2.setText(enumC1158.f4274);
                            radioButton2.setOnClickListener(new ViewOnClickListenerC0111(enumC1158, 5));
                            radioGroup2.addView(radioButton2);
                        }
                        builder2.setView(radioGroup2);
                        builder2.setNeutralButton("随机", new DialogInterfaceOnClickListenerC1137(i6));
                        builder2.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        builder2.show();
                    }
                }
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                ((C1335) obj).m3155(new C1055(26));
                return c3554;
            case 26:
                String[] strArr13 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.EmojiPanelClickListener", "penn send capture emoji click emoji: %s status: %d.");
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C1055(28);
                return c3554;
            case 28:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1337);
                String[] strArr14 = AbstractC1471.f5234;
                C2012.m4012(c2012M4774, "com.tencent.mm.storage.emotion.EmojiInfo");
                c2012M4774.m4021("save emoji thumb error");
                c1337.f4794 = c2012M4774;
                return c3554;
            default:
                ((C1023) obj).f3739 = new C1164(i7);
                return c3554;
        }
    }
}
