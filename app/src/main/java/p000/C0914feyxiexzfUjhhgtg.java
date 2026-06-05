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
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳᛴ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0914feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3530Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0914feyxiexzfUjhhgtg(int i) {
        this.f3530Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        switch (this.f3530Ujhhgtgfeyxiexzf) {
            case 0:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0914feyxiexzfUjhhgtg(6));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 1:
                String str = ((C0385Ujhhgtgfeyxiexzf) obj).m1633Ujhhgtgfeyxiexzf().f10278Ujhhgtgfeyxiexzf;
                return Boolean.valueOf((C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "<clinit>") || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "<init>")) ? false : true);
            case 2:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0914feyxiexzfUjhhgtg(5));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 3:
                return Boolean.valueOf(C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((C0385Ujhhgtgfeyxiexzf) obj).m1633Ujhhgtgfeyxiexzf().f10278Ujhhgtgfeyxiexzf, "<init>"));
            case 4:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0780feyxiexzfUjhhgtg(28));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 5:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("workerScope", "username");
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 6:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("workerScope", "username");
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 7:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_round_avatar, null, false);
                Slider slider = (Slider) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogSliderRoundAvatar);
                if (slider == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(R.id.moduleDialogSliderRoundAvatar)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                C0307Ujhhgtgfeyxiexzf c0307Ujhhgtgfeyxiexzf = new C0307Ujhhgtgfeyxiexzf(linearLayout, slider, 0);
                slider.setValue(C0913feyxiexzfUjhhgtg.f3529Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                C0946feyxiexzfUjhhgtg.f3792Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C0946feyxiexzfUjhhgtg.f3794Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C0350Ujhhgtgfeyxiexzf(11, c0307Ujhhgtgfeyxiexzf));
                AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 8:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(4);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 9:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(2);
                c3265feyxiexzfUjhhgtg.f10257Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(3);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 10:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg2 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg2.f10256Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(0);
                c3265feyxiexzfUjhhgtg2.f10257Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(1);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 11:
                C0946feyxiexzfUjhhgtg c0946feyxiexzfUjhhgtg = C0946feyxiexzfUjhhgtg.f3792Ujhhgtgfeyxiexzf;
                C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c0946feyxiexzfUjhhgtg, Collections.singletonList((Method) obj));
                c0946feyxiexzfUjhhgtg.m1845feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C0780feyxiexzfUjhhgtg(29));
                c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                new C2501feyxiexzfUjhhgtg(2, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf(Float.valueOf(C0913feyxiexzfUjhhgtg.f3529Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 13:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                new C2501feyxiexzfUjhhgtg(3, 6, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(Float.valueOf(C0913feyxiexzfUjhhgtg.f3529Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(15);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 15:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0914feyxiexzfUjhhgtg(16));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 16:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                c0394Ujhhgtgfeyxiexzf.getClass();
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf = new C0300Ujhhgtgfeyxiexzf();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg("MicroMsg.ChattingUI.VideoComponent", "send video path: %s, toUser:%s, origin:%b", "ChattingUI_importMultiVideo");
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf2);
                c0394Ujhhgtgfeyxiexzf.f2141Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf;
                Class<Runnable> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Runnable.class));
                Class cls = clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Runnable.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class));
                c0394Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(cls, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : String.class);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_say_hi_remark_name, null, false);
                int i = R.id.moduleDialogEdtSayHiRemarkNameTextFormat;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtSayHiRemarkNameTextFormat);
                if (textInputEditText != null) {
                    i = R.id.moduleDialogEdtSayHiRemarkNameTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtSayHiRemarkNameTextPlaceholders);
                    if (materialTextView != null) {
                        i = R.id.moduleDialogEdtSayHiRemarkNameTimeFormat;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtSayHiRemarkNameTimeFormat);
                        if (textInputEditText2 != null) {
                            i = R.id.moduleDialogInputSayHiRemarkNameTextFormat;
                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputSayHiRemarkNameTextFormat)) != null) {
                                i = R.id.moduleDialogInputSayHiRemarkNameTimeFormat;
                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputSayHiRemarkNameTimeFormat)) != null) {
                                    C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = new C0328Ujhhgtgfeyxiexzf((LinearLayout) viewM2416Ujhhgtgfeyxiexzf2, textInputEditText, materialTextView, textInputEditText2, 5);
                                    textInputEditText.setText(C1097feyxiexzfUjhhgtg.f4179Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                    textInputEditText2.setText(C1078feyxiexzfUjhhgtg.f4150Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                    for (String str2 : C1079feyxiexzfUjhhgtg.f4152Ujhhgtgfeyxiexzf) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str2 + ' '));
                                        spannableStringBuilder.setSpan(new C2738Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf, str2, 3), length, spannableStringBuilder.length() + (-1), 33);
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                                    C1079feyxiexzfUjhhgtg.f4151Ujhhgtgfeyxiexzf.getClass();
                                    c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C1079feyxiexzfUjhhgtg.f4154Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = c0328Ujhhgtgfeyxiexzf.f1932Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf("保存", new C0350Ujhhgtgfeyxiexzf(12, c0328Ujhhgtgfeyxiexzf));
                                    c0290Ujhhgtgfeyxiexzf2.m1501Ujhhgtgfeyxiexzf("重置", new C0478Ujhhgtgfeyxiexzf(13));
                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                                    c0290Ujhhgtgfeyxiexzf2.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                    return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i)));
            case Opcodes.LDC /* 18 */:
                Object objM1849Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                if (!(objM1849Ujhhgtgfeyxiexzf instanceof Activity)) {
                    objM1849Ujhhgtgfeyxiexzf = null;
                }
                Activity activity = (Activity) objM1849Ujhhgtgfeyxiexzf;
                if (activity == null) {
                    Class<Activity> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Activity.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : Activity.class).getName()).toString());
                }
                Intent intent = activity.getIntent();
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String stringExtra = intent.getStringExtra("Contact_Nick");
                Intent intent2 = activity.getIntent();
                String str3 = "Contact_RemarkName";
                C1079feyxiexzfUjhhgtg.f4151Ujhhgtgfeyxiexzf.getClass();
                intent2.putExtra(str3, AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(C1097feyxiexzfUjhhgtg.f4179Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), "${nick}", stringExtra), "${time}", AbstractC3612feyxiexzfUjhhgtg.m5246Ujhhgtgfeyxiexzf(System.currentTimeMillis(), C1078feyxiexzfUjhhgtg.f4150Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), null, 2)));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 19:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(20);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 20:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0914feyxiexzfUjhhgtg(21));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.SceneVoiceService", "//voicetrymore", "getVoiceService %s");
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg3 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg3.f10255Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(23);
                c3265feyxiexzfUjhhgtg3.f10256Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(24);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.storage");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf("MicroMsg.ServerConfigInfoStorage", "writeConfigToLocalFile, path: %s, info:%s");
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0914feyxiexzfUjhhgtg(25));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = (C0394Ujhhgtgfeyxiexzf) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0394Ujhhgtgfeyxiexzf.m1651Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3, "deviceinfo");
                C0394Ujhhgtgfeyxiexzf.m1651Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3, "MANUFACTURER");
                C0394Ujhhgtgfeyxiexzf.m1651Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3, "MODEL");
                C0394Ujhhgtgfeyxiexzf.m1651Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3, "VERSION_RELEASE");
                C0394Ujhhgtgfeyxiexzf.m1651Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3, "VERSION_INCREMENTAL");
                C0394Ujhhgtgfeyxiexzf.m1651Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3, "DISPLAY");
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 26:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0914feyxiexzfUjhhgtg(27);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 27:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0914feyxiexzfUjhhgtg(28));
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            case 28:
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("calling getService(...)");
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            default:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(0);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    }
}
