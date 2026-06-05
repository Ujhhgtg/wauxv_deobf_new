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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3172feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9812Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3172feyxiexzfUjhhgtg(int i) {
        this.f9812Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        int i = this.f9812Ujhhgtgfeyxiexzf;
        int i2 = 21;
        int i3 = 2;
        int i4 = 17;
        int i5 = 3;
        int i6 = 1;
        int i7 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1853Ujhhgtgfeyxiexzf(null);
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3172feyxiexzfUjhhgtg(i3));
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.TextStatus.StatusInfoAffStorage", "reportStatusReadToBackend: failed, ");
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ");
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_disable_ringtone_play, null, false);
                int i8 = R.id.moduleDialogCbDisableRingtoneInCall;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbDisableRingtoneInCall);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogCbDisableRingtoneOutCall;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbDisableRingtoneOutCall);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                        C0326Ujhhgtgfeyxiexzf c0326Ujhhgtgfeyxiexzf = new C0326Ujhhgtgfeyxiexzf(linearLayout, materialCheckBox, materialCheckBox2, 1);
                        materialCheckBox2.setChecked(C3202feyxiexzfUjhhgtg.f9892Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                        materialCheckBox.setChecked(C3201feyxiexzfUjhhgtg.f9891Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                        C3203feyxiexzfUjhhgtg.f9893Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C3203feyxiexzfUjhhgtg.f9895Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C2977Ujhhgtgfeyxiexzf(21, c0326Ujhhgtgfeyxiexzf));
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i8)));
            case 5:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                Bundle bundle = (Bundle) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(bundle.getString("scene"), "start")) {
                    boolean z = bundle.getBoolean("isOutCall");
                    boolean z2 = z && C3202feyxiexzfUjhhgtg.f9892Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf();
                    i6 = (z || !C3201feyxiexzfUjhhgtg.f9891Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) ? 0 : 1;
                    if (z2 || i6 != 0) {
                        c0578Ujhhgtgfeyxiexzf.m1851Ujhhgtgfeyxiexzf();
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3172feyxiexzfUjhhgtg(i5));
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(10);
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1853Ujhhgtgfeyxiexzf(null);
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.ui.chatting.component");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!");
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                new C2501feyxiexzfUjhhgtg(0, 6, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(Boolean.FALSE);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(13);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3172feyxiexzfUjhhgtg(14));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)");
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(16);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3172feyxiexzfUjhhgtg(19));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                Class<String> cls = String.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                if (clsM5159Ujhhgtgfeyxiexzf == null) {
                    clsM5159Ujhhgtgfeyxiexzf = cls;
                }
                Class<String> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf, cls);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : String.class);
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                Iterator it = C3379feyxiexzfUjhhgtg.f10554Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb.append("onGetDynamicConfig ");
                        sb.append("LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, " Failed", e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s");
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.feature.emoji");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf("MicroMsg.EmojiFeatureService", "[onAccountInitialized]", "onAccountRelease: ");
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(23);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3172feyxiexzfUjhhgtg(24));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path is no exist :%s ");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(27);
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                C3282Ujhhgtgfeyxiexzf c3282Ujhhgtgfeyxiexzf = C3282Ujhhgtgfeyxiexzf.f10305Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[3];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                if (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg3 = null;
                }
                Class<? super Object> superclass = c0919feyxiexzfUjhhgtg3.getClass().getSuperclass();
                int i9 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(superclass).m2021Ujhhgtgfeyxiexzf();
                AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1481Ujhhgtgfeyxiexzf, (EnumC0283Ujhhgtgfeyxiexzf[]) Arrays.copyOf(new EnumC0283Ujhhgtgfeyxiexzf[]{EnumC0283Ujhhgtgfeyxiexzf.FINAL}, 1));
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
                C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf());
                c3438feyxiexzfUjhhgtg.m1940Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg3);
                if (((Number) c3438feyxiexzfUjhhgtg.m4939Ujhhgtgfeyxiexzf()).intValue() == 0) {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg3).m2021Ujhhgtgfeyxiexzf();
                    String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = "com.tencent.mm.api.IEmojiInfo";
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "getMd5";
                    String str = (String) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "9bd1281af3a31710a45b84d736363691")) {
                        c3282Ujhhgtgfeyxiexzf.getClass();
                        c0578Ujhhgtgfeyxiexzf4.m1853Ujhhgtgfeyxiexzf(null);
                        AlertDialog.Builder builder = new AlertDialog.Builder(AbstractC3594Ujhhgtgfeyxiexzf.m5177Ujhhgtgfeyxiexzf());
                        builder.setTitle("选择猜拳");
                        RadioGroup radioGroup = new RadioGroup(builder.getContext());
                        radioGroup.setGravity(17);
                        radioGroup.setOrientation(0);
                        C3369feyxiexzfUjhhgtg c3369feyxiexzfUjhhgtg = EnumC3281Ujhhgtgfeyxiexzf.f10302Ujhhgtgfeyxiexzf;
                        c3369feyxiexzfUjhhgtg.getClass();
                        C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = new C2930Ujhhgtgfeyxiexzf(0, c3369feyxiexzfUjhhgtg);
                        while (c2930Ujhhgtgfeyxiexzf.hasNext()) {
                            EnumC3281Ujhhgtgfeyxiexzf enumC3281Ujhhgtgfeyxiexzf = (EnumC3281Ujhhgtgfeyxiexzf) c2930Ujhhgtgfeyxiexzf.next();
                            RadioButton radioButton = new RadioButton(radioGroup.getContext());
                            radioButton.setId(enumC3281Ujhhgtgfeyxiexzf.f10303Ujhhgtgfeyxiexzf);
                            radioButton.setText(enumC3281Ujhhgtgfeyxiexzf.f10304Ujhhgtgfeyxiexzf);
                            radioButton.setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(6, enumC3281Ujhhgtgfeyxiexzf));
                            radioGroup.addView(radioButton);
                        }
                        builder.setView(radioGroup);
                        builder.setNeutralButton("随机", new DialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg(i3));
                        builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        builder.show();
                    } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "08f223fa83f1ca34e143d1e580252c7c")) {
                        c3282Ujhhgtgfeyxiexzf.getClass();
                        c0578Ujhhgtgfeyxiexzf4.m1853Ujhhgtgfeyxiexzf(null);
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(AbstractC3594Ujhhgtgfeyxiexzf.m5177Ujhhgtgfeyxiexzf());
                        builder2.setTitle("选择骰子");
                        RadioGroup radioGroup2 = new RadioGroup(builder2.getContext());
                        radioGroup2.setGravity(17);
                        radioGroup2.setOrientation(0);
                        C3369feyxiexzfUjhhgtg c3369feyxiexzfUjhhgtg2 = EnumC3299Ujhhgtgfeyxiexzf.f10336Ujhhgtgfeyxiexzf;
                        c3369feyxiexzfUjhhgtg2.getClass();
                        C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf2 = new C2930Ujhhgtgfeyxiexzf(0, c3369feyxiexzfUjhhgtg2);
                        while (c2930Ujhhgtgfeyxiexzf2.hasNext()) {
                            EnumC3299Ujhhgtgfeyxiexzf enumC3299Ujhhgtgfeyxiexzf = (EnumC3299Ujhhgtgfeyxiexzf) c2930Ujhhgtgfeyxiexzf2.next();
                            RadioButton radioButton2 = new RadioButton(radioGroup2.getContext());
                            radioButton2.setId(enumC3299Ujhhgtgfeyxiexzf.f10337Ujhhgtgfeyxiexzf);
                            radioButton2.setText(enumC3299Ujhhgtgfeyxiexzf.f10338Ujhhgtgfeyxiexzf);
                            radioButton2.setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(5, enumC3299Ujhhgtgfeyxiexzf));
                            radioGroup2.addView(radioButton2);
                        }
                        builder2.setView(radioGroup2);
                        builder2.setNeutralButton("随机", new DialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg(i6));
                        builder2.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        builder2.show();
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3172feyxiexzfUjhhgtg(28));
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.EmojiPanelClickListener", "penn send capture emoji click emoji: %s status: %d.");
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(i7);
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
