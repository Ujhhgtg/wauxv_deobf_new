package p000;

import android.app.Activity;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.reflect.Method;
import java.util.Collections;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤝᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2657 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8615;

    public /* synthetic */ C2657(int i) {
        this.f8615 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f8615) {
            case 0:
                String str = ((C2005) obj).m3995().f3762;
                return Boolean.valueOf((AbstractC1469.m3322(str, "<clinit>") || AbstractC1469.m3322(str, "<init>")) ? false : true);
            case 1:
                ((C1335) obj).m3155(new C2657(4));
                return C3554.UNIT;
            case 2:
                return Boolean.valueOf(AbstractC1469.m3322(((C2005) obj).m3995().f3762, "<init>"));
            case 3:
                ((C1335) obj).m3155(new C2504(27));
                return C3554.UNIT;
            case 4:
                String[] strArr = AbstractC1471.f5234;
                ((C2012) obj).m4021("workerScope", "username");
                return C3554.UNIT;
            case 5:
                String[] strArr2 = AbstractC1471.f5234;
                ((C2012) obj).m4021("workerScope", "username");
                return C3554.UNIT;
            case 6:
                String[] strArr3 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_round_avatar, null, false);
                Slider slider = (Slider) AbstractC1272.m3098(viewM4622, R.id.moduleDialogSliderRoundAvatar);
                if (slider == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(R.id.moduleDialogSliderRoundAvatar)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM4622;
                C2054 c2054 = new C2054(linearLayout, slider, 0);
                slider.setValue(C2661.f8619.m2661());
                C2037 c2037 = new C2037();
                C2662.f8620.getClass();
                c2037.f6779 = C2662.f8622;
                c2037.f6781 = linearLayout;
                c2037.m4057("保存", new C2070(c2054, 11));
                AbstractC2844.m4788(c2037, null, 3);
                return C3554.UNIT;
            case 7:
                ((C1023) obj).f3740 = new C2657(3);
                return C3554.UNIT;
            case 8:
                C1023 c1023 = (C1023) obj;
                c1023.f3740 = new C2657(1);
                c1023.f3741 = new C2657(2);
                return C3554.UNIT;
            case 9:
                C1023 c1024 = (C1023) obj;
                c1024.f3740 = new C2504(29);
                c1024.f3741 = new C2657(0);
                return C3554.UNIT;
            case 10:
                C2662 c2662 = C2662.f8620;
                C3752 c3752M4301 = C2342.m4301(c2662, Collections.singletonList((Method) obj));
                c2662.m3444(c3752M4301, new C2504(28));
                c3752M4301.m5360();
                return C3554.UNIT;
            case 11:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                new C0383(2, 6, c1574).m1714(Float.valueOf(C2661.f8619.m2661()));
                return C3554.UNIT;
            case Opcodes.FCONST_1 /* 12 */:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                new C0383(3, 6, c1575).m1714(Float.valueOf(C2661.f8619.m2661()));
                return C3554.UNIT;
            case 13:
                ((C1023) obj).f3740 = new C2657(14);
                return C3554.UNIT;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1335) obj).m3155(new C2657(15));
                return C3554.UNIT;
            case 15:
                C2012 c2012 = (C2012) obj;
                c2012.getClass();
                C2015 c2015 = new C2015();
                C2012 c2013 = new C2012();
                String[] strArr4 = AbstractC1471.f5234;
                c2013.m4021("MicroMsg.ChattingUI.VideoComponent", "send video path: %s, toUser:%s, origin:%b", "ChattingUI_importMultiVideo");
                c2015.m4042(c2013);
                c2012.f6670 = c2015;
                Class<Runnable> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Runnable.class));
                Class cls = clsM4232 != null ? clsM4232 : Runnable.class;
                Class<String> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                c2012.m4017(cls, clsM4233 != null ? clsM4233 : String.class);
                return C3554.UNIT;
            case 16:
                String[] strArr5 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_say_hi_remark_name, null, false);
                int i = R.id.moduleDialogEdtSayHiRemarkNameTextFormat;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtSayHiRemarkNameTextFormat);
                if (textInputEditText != null) {
                    i = R.id.moduleDialogEdtSayHiRemarkNameTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtSayHiRemarkNameTextPlaceholders);
                    if (materialTextView != null) {
                        i = R.id.moduleDialogEdtSayHiRemarkNameTimeFormat;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtSayHiRemarkNameTimeFormat);
                        if (textInputEditText2 != null) {
                            i = R.id.moduleDialogInputSayHiRemarkNameTextFormat;
                            if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputSayHiRemarkNameTextFormat)) != null) {
                                i = R.id.moduleDialogInputSayHiRemarkNameTimeFormat;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputSayHiRemarkNameTimeFormat)) != null) {
                                    C2048 c2048 = new C2048((LinearLayout) viewM4623, textInputEditText, materialTextView, textInputEditText2, 5);
                                    textInputEditText.setText(C2691.f8684.m2666());
                                    textInputEditText2.setText(C2692.f8685.m2666());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                    for (String str2 : C2693.f8687) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str2 + ' '));
                                        spannableStringBuilder.setSpan(new C0627(c2048, str2, 3), length, spannableStringBuilder.length() + (-1), 33);
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C2037 c2038 = new C2037();
                                    C2693.f8686.getClass();
                                    c2038.f6779 = C2693.f8689;
                                    c2038.f6781 = c2048.f6857;
                                    c2038.m4057("保存", new C2070(c2048, 12));
                                    c2038.m4056("重置", new C2096(12));
                                    C2037.m4053(c2038, null, 3);
                                    c2038.m4055().m3985();
                                    return C3554.UNIT;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i)));
            case Opcodes.SIPUSH /* 17 */:
                Object objM3448 = ((C1574) obj).m3448();
                if (!(objM3448 instanceof Activity)) {
                    objM3448 = null;
                }
                Activity activity = (Activity) objM3448;
                if (activity == null) {
                    Class<Activity> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(Activity.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4234 != null ? clsM4234 : Activity.class).getName()).toString());
                }
                Intent intent = activity.getIntent();
                String[] strArr6 = AbstractC1471.f5234;
                String stringExtra = intent.getStringExtra("Contact_Nick");
                Intent intent2 = activity.getIntent();
                String str3 = "Contact_RemarkName";
                C2693.f8686.getClass();
                intent2.putExtra(str3, AbstractC2909.m4918(AbstractC2909.m4918(C2691.f8684.m2666(), "${nick}", stringExtra), "${time}", AbstractC2234.m4188(System.currentTimeMillis(), C2692.f8685.m2666(), null, 2)));
                return C3554.UNIT;
            case Opcodes.LDC /* 18 */:
                ((C1023) obj).f3739 = new C2657(19);
                return C3554.UNIT;
            case 19:
                ((C1334) obj).m3153(new C2657(20));
                return C3554.UNIT;
            case 20:
                String[] strArr7 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.SceneVoiceService", "//voicetrymore", "getVoiceService %s");
                return C3554.UNIT;
            case Opcodes.ILOAD /* 21 */:
                return Boolean.valueOf(obj == null);
            case Opcodes.LLOAD /* 22 */:
                C1023 c1025 = (C1023) obj;
                c1025.f3739 = new C2657(23);
                c1025.f3740 = new C2657(24);
                return C3554.UNIT;
            case Opcodes.FLOAD /* 23 */:
                C1334 c1334 = (C1334) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.storage");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.ServerConfigInfoStorage", "writeConfigToLocalFile, path: %s, info:%s");
                c1334.f4791 = c0700;
                return C3554.UNIT;
            case Opcodes.DLOAD /* 24 */:
                ((C1335) obj).m3155(new C2657(25));
                return C3554.UNIT;
            case Opcodes.ALOAD /* 25 */:
                C2012 c2014 = (C2012) obj;
                String[] strArr9 = AbstractC1471.f5234;
                C2012.m4011(c2014, "deviceinfo");
                C2012.m4011(c2014, "MANUFACTURER");
                C2012.m4011(c2014, "MODEL");
                C2012.m4011(c2014, "VERSION_RELEASE");
                C2012.m4011(c2014, "VERSION_INCREMENTAL");
                C2012.m4011(c2014, "DISPLAY");
                return C3554.UNIT;
            case 26:
                ((C1023) obj).f3740 = new C2657(27);
                return C3554.UNIT;
            case 27:
                ((C1335) obj).m3155(new C2657(28));
                return C3554.UNIT;
            case 28:
                ((C2012) obj).m4021("calling getService(...)");
                return C3554.UNIT;
            default:
                ((C1023) obj).f3740 = new C2751(0);
                return C3554.UNIT;
        }
    }
}
