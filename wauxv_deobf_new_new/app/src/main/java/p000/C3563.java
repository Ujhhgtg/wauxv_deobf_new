package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.slider.Slider;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᛸᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3563 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11160;

    public /* synthetic */ C3563(int i) {
        this.f11160 = i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException {
        Object c2641;
        int i = this.f11160;
        int i2 = 7;
        char c = 0;
        int i3 = 29;
        int i4 = 28;
        int i5 = 2;
        int i6 = 1;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                ((C1023) obj).f3740 = new C2868(i3);
                return c3554;
            case 1:
                ((C1023) obj).f3740 = new C3563(8);
                return c3554;
            case 2:
                ((C1023) obj).f3740 = new C2868(i4);
                return c3554;
            case 3:
                ((C1023) obj).f3740 = new C3563(i2);
                return c3554;
            case 4:
                ((C1023) obj).f3740 = new C3563(5);
                return c3554;
            case 5:
                C1335 c1335 = (C1335) obj;
                String[] strArr = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s");
                c1335.f4794 = c2012;
                return c3554;
            case 6:
                C1335 c1336 = (C1335) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2013 = new C2012();
                Class<Integer> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls = clsM4232 != null ? clsM4232 : Integer.class;
                Class<Context> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(Context.class));
                c2013.m4017(cls, clsM4233 != null ? clsM4233 : Context.class);
                c2013.m4021("initSnsObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1336.f4794 = c2013;
                return c3554;
            case 7:
                C1335 c1337 = (C1335) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2014 = new C2012();
                c2014.m4021("setSdkAppName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1337.f4794 = c2014;
                return c3554;
            case 8:
                C1335 c1338 = (C1335) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1338.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2015 = new C2012();
                c2015.m4021("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1338.f4794 = c2015;
                return c3554;
            case 9:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C3563(10);
                c1023.f3740 = new C3563(11);
                return c3554;
            case 10:
                C1334 c1334 = (C1334) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.vfs");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.VFSFileOp", "Cannot move dir: ");
                c1334.f4791 = c0700;
                return c3554;
            case 11:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1339);
                Class<String> cls2 = String.class;
                Class<String> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                if (clsM4234 == null) {
                    clsM4234 = cls2;
                }
                Class<String> clsM4774 = AbstractC2844.m4774(c2012M4773, clsM4234, cls2);
                cls2 = clsM4774 != null ? clsM4774 : String.class;
                Class<Boolean> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                c2012M4773.m4017(cls2, clsM4235 != null ? clsM4235 : Boolean.class);
                c1339.f4794 = c2012M4773;
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3739 = new C3563(13);
                return c3554;
            case 13:
                ((C1334) obj).m3153(new C3563(14));
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr6 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.VideoService", "MicroMsg.SubCoreVideo", "quitVideoSendThread");
                return c3554;
            case 15:
                ((C1023) obj).f3740 = new C3563(17);
                return c3554;
            case 16:
                ((C1023) obj).f3740 = new C3563(18);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1335 c13310 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c13310);
                String[] strArr7 = AbstractC1471.f5234;
                c2012M4774.m4021((AbstractC0972.m2596(EnumC3737.f11688) || AbstractC0972.m2597(EnumC3734.f11654)) ? "MicroMsg.C2CVideoPathFeatureService" : "MicroMsg.VideoInfoStorage", ".mp4", "success restore file, from ");
                c13310.f4794 = c2012M4774;
                return c3554;
            case Opcodes.LDC /* 18 */:
                C1335 c13311 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c13311);
                String[] strArr8 = AbstractC1471.f5234;
                c2012M4775.m4021((AbstractC0972.m2596(EnumC3737.f11688) || AbstractC0972.m2597(EnumC3734.f11654)) ? "MicroMsg.C2CVideoPathFeatureService" : "MicroMsg.VideoInfoStorage", ".jpg", "success restore file, from ");
                c13311.f4794 = c2012M4775;
                return c3554;
            case 19:
                C2041 c2041M4059 = C2041.m4059(LayoutInflater.from(((View) obj).getContext()));
                c2041M4059.f6811.setText(C3667.f11416.m2666());
                C2037 c2037 = new C2037();
                C3671.f11440.getClass();
                c2037.f6779 = C3671.f11443;
                c2037.f6781 = c2041M4059.f6810;
                String[] strArr9 = AbstractC1471.f5234;
                c2037.m4057("保存", new C1175(c2041M4059, 3));
                c2037.m4056("重置", new C3413(6));
                C2037.m4053(c2037, null, 3);
                c2037.m4055().m3985();
                return c3554;
            case 20:
                C2041 c2041M40510 = C2041.m4059(LayoutInflater.from(((View) obj).getContext()));
                c2041M40510.f6811.setText(C3672.f11446.m2666());
                C2037 c2038 = new C2037();
                C3673.f11447.getClass();
                c2038.f6779 = C3673.f11450;
                c2038.f6781 = c2041M40510.f6810;
                String[] strArr10 = AbstractC1471.f5234;
                c2038.m4057("保存", new C1175(c2041M40510, 4));
                c2038.m4056("重置", new C3413(i2));
                C2037.m4053(c2038, null, 3);
                c2038.m4055().m3985();
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr11 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.VoiceStorage", "update failed, no values set");
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr12 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_voice_length, null, false);
                Slider slider = (Slider) AbstractC1272.m3098(viewM4622, R.id.moduleDialogSliderVoiceLength);
                if (slider == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(R.id.moduleDialogSliderVoiceLength)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM4622;
                C2054 c2054 = new C2054(linearLayout, slider, 1);
                slider.setValue(C3679.f11466.m2662());
                C2037 c2039 = new C2037();
                C3680.f11467.getClass();
                c2039.f6779 = C3680.f11469;
                c2039.f6781 = linearLayout;
                c2039.m4057("保存", new C2070(c2054, 20));
                AbstractC2844.m4788(c2039, null, 3);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1023) obj).f3740 = new C3563(25);
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C1574 c1574 = (C1574) obj;
                int length = c1574.m3447().length;
                if (length == 1) {
                    c2641 = c1574.m3447()[c];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                    if (c2641 instanceof C2641) {
                    }
                    int i7 = AbstractC1768.f5906;
                    C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
                    c1300M3558.f6475 = "l";
                    c1300M3558.f4724 = AbstractC2574.m4549(Integer.TYPE);
                    ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3128(Integer.valueOf(C3679.f11466.m2662() * 1000));
                } else if (length == 2 && (c1574.m3447()[0] instanceof String)) {
                    c = 1;
                    try {
                        c2641 = c1574.m3447()[c];
                        if (c2641 == null) {
                            c2641 = null;
                        }
                    } catch (Throwable th) {
                        c2641 = new C2641(th);
                    }
                    Object obj2 = c2641 instanceof C2641 ? null : c2641;
                    int i8 = AbstractC1768.f5906;
                    C1300 c1300M3559 = AbstractC2727.m4713(obj2).m3558();
                    c1300M3559.f6475 = "l";
                    c1300M3559.f4724 = AbstractC2574.m4549(Integer.TYPE);
                    ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3128(Integer.valueOf(C3679.f11466.m2662() * 1000));
                }
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                ((C1335) obj).m3155(new C3563(21));
                return c3554;
            case 26:
                ((C1023) obj).f3739 = new C3563(i3);
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C3563(i4);
                return c3554;
            case 28:
                ((C1335) obj).m3155(new C3681(i5));
                return c3554;
            default:
                ((C1334) obj).m3153(new C3681(i6));
                return c3554;
        }
    }
}
