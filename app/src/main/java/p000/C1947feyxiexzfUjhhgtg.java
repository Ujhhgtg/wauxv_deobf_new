package p000;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.slider.Slider;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ要点脸ᛱfeyxiexzfᛱᛳ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1947feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f6424Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1947feyxiexzfUjhhgtg(int i) {
        this.f6424Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException {
        Object c0919feyxiexzfUjhhgtg;
        int i = this.f6424Ujhhgtgfeyxiexzf;
        int i2 = 7;
        int i3 = 8;
        char c = 0;
        int i4 = 29;
        int i5 = 28;
        int i6 = 2;
        int i7 = 1;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(i5);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(5);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.sns.model");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s");
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.sns.model");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.class));
                Class cls = clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Integer.class;
                Class<Context> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class));
                c0394Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(cls, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Context.class);
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg("initSnsObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg3.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.sns.model");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg("setSdkAppName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg4.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.sns.model");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(10);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(11);
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.vfs");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf("MicroMsg.VFSFileOp", "Cannot move dir: ");
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg5);
                Class<String> cls2 = String.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                if (clsM5159Ujhhgtgfeyxiexzf3 == null) {
                    clsM5159Ujhhgtgfeyxiexzf3 = cls2;
                }
                Class<String> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf3, cls2);
                cls2 = clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : String.class;
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(cls2, clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : Boolean.class);
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(13);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C1947feyxiexzfUjhhgtg(14));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.VideoService", "MicroMsg.SubCoreVideo", "quitVideoSendThread");
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(17);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(18);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg6 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg6);
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg((AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7382Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7360Ujhhgtgfeyxiexzf)) ? "MicroMsg.C2CVideoPathFeatureService" : "MicroMsg.VideoInfoStorage", ".mp4", "success restore file, from ");
                c3452feyxiexzfUjhhgtg6.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg7 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg7);
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg((AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7382Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7360Ujhhgtgfeyxiexzf)) ? "MicroMsg.C2CVideoPathFeatureService" : "MicroMsg.VideoInfoStorage", ".jpg", "success restore file, from ");
                c3452feyxiexzfUjhhgtg7.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C0319Ujhhgtgfeyxiexzf c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf = C0319Ujhhgtgfeyxiexzf.m1533Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(((View) obj).getContext()));
                c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf.setText(C2221Ujhhgtgfeyxiexzf.f7211Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                C2225Ujhhgtgfeyxiexzf.f7235Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2225Ujhhgtgfeyxiexzf.f7238Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1876Ujhhgtgfeyxiexzf;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C3289Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf, 3));
                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf("重置", new C1795Ujhhgtgfeyxiexzf(i2));
                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C0319Ujhhgtgfeyxiexzf c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf2 = C0319Ujhhgtgfeyxiexzf.m1533Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(((View) obj).getContext()));
                c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf2.f1877Ujhhgtgfeyxiexzf.setText(C2206Ujhhgtgfeyxiexzf.f7178Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                C2207Ujhhgtgfeyxiexzf.f7179Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C2207Ujhhgtgfeyxiexzf.f7182Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf2.f1876Ujhhgtgfeyxiexzf;
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf("保存", new C3289Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf2, 4));
                c0290Ujhhgtgfeyxiexzf2.m1501Ujhhgtgfeyxiexzf("重置", new C1795Ujhhgtgfeyxiexzf(i3));
                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                c0290Ujhhgtgfeyxiexzf2.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.VoiceStorage", "update failed, no values set");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_voice_length, null, false);
                Slider slider = (Slider) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogSliderVoiceLength);
                if (slider == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(R.id.moduleDialogSliderVoiceLength)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                C0307Ujhhgtgfeyxiexzf c0307Ujhhgtgfeyxiexzf = new C0307Ujhhgtgfeyxiexzf(linearLayout, slider, 1);
                slider.setValue(C2213Ujhhgtgfeyxiexzf.f7194Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf3 = new C0290Ujhhgtgfeyxiexzf();
                C2209Ujhhgtgfeyxiexzf.f7186Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf3.f1721Ujhhgtgfeyxiexzf = C2209Ujhhgtgfeyxiexzf.f7188Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf3.f1723Ujhhgtgfeyxiexzf = linearLayout;
                c0290Ujhhgtgfeyxiexzf3.m1502Ujhhgtgfeyxiexzf("保存", new C0350Ujhhgtgfeyxiexzf(20, c0307Ujhhgtgfeyxiexzf));
                AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf3, null, 3);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(25);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                int length = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf().length;
                if (length == 1) {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[c];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                    if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    }
                    int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "l";
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
                    ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(C2213Ujhhgtgfeyxiexzf.f7194Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() * 1000));
                } else if (length == 2 && (c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0] instanceof String)) {
                    c = 1;
                    try {
                        c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[c];
                        if (c0919feyxiexzfUjhhgtg == null) {
                            c0919feyxiexzfUjhhgtg = null;
                        }
                    } catch (Throwable th) {
                        c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                    }
                    Object obj2 = c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg;
                    int i9 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "l";
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
                    ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Integer.valueOf(C2213Ujhhgtgfeyxiexzf.f7194Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() * 1000));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1947feyxiexzfUjhhgtg(21));
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(i5);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2208Ujhhgtgfeyxiexzf(i6));
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2208Ujhhgtgfeyxiexzf(i7));
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
