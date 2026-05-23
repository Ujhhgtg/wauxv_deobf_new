package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᛸᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2764 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8853;

    public /* synthetic */ C2764(int i) {
        this.f8853 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        C3561 c3561;
        C2007 c2007;
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        Object c25811;
        switch (this.f8853) {
            case 0:
                ((C1333) obj).m3052(new C2734(27));
                return Unit.INSTANCE;
            case 1:
                C1563 c1563 = (C1563) obj;
                C3512 c3512 = C3512.f11014;
                Object objM3268 = c1563.m3268();
                String strM2542 = C2766.f8855.m2542();
                
                C3512.m5101(objM3268, strM2542);
                C3512.m5100(c1563.m3268(), C2767.f8856.m2542());
                return Unit.INSTANCE;
            case 2:
                String[] strArr = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.snsMediaStorage", "SnsCompressResolutionFor2G", "SnsCompressResolutionFor3G", "SnsCompressResolutionFor4G", "SnsCompressResolutionForWifi");
                return Unit.INSTANCE;
            case 3:
                String[] strArr2 = AbstractC1574.f5469;
                c3561 = null;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_sns_upload_original_photo, null, false);
                int i = R.id.moduleDialogRbSnsUploadOriginalPhotoConvert;
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbSnsUploadOriginalPhotoConvert);
                if (materialRadioButton != null) {
                    i = R.id.moduleDialogRbSnsUploadOriginalPhotoCopy;
                    MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRbSnsUploadOriginalPhotoCopy);
                    if (materialRadioButton2 != null) {
                        i = R.id.moduleDialogRgSnsUploadOriginalPhotoMode;
                        RadioGroup radioGroup = (RadioGroup) AbstractC3681.m5325(viewM4676, R.id.moduleDialogRgSnsUploadOriginalPhotoMode);
                        if (radioGroup != null) {
                            LinearLayout linearLayout = (LinearLayout) viewM4676;
                            C0243 c0243 = new C0243(linearLayout, materialRadioButton, materialRadioButton2, radioGroup);
                            int iM2538 = C2771.f8868.m2538();
                            if (iM2538 == EnumC2770.f8864.f8867) {
                                materialRadioButton.setChecked(true);
                            } else if (iM2538 == EnumC2770.f8865.f8867) {
                                materialRadioButton2.setChecked(true);
                            }
                            c2007 = new C2007();
                            
                            c2007.f6678 = C2772.f8871;
                            c2007.f6680 = linearLayout;
                            c2007.m3870("保存", new C2042(16, c0243));
                        }
                    }
                    break;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i)));
            case 4:
                ((C1020) obj).thisMethodMatcher = new C2764(7);
                return Unit.INSTANCE;
            case 5:
                C1563 c1564 = (C1563) obj;
                if (C2771.f8868.m2538() == EnumC2770.f8864.f8867) {
                    
                    try {
                        c2585 = c1564.m3267()[0];
                        if (c2585 == null) {
                            c2585 = null;
                        }
                    } catch (Throwable th) {
                        c2585 = new C2585(th);
                    }
                    if (c2585 instanceof C2585) {
                        c2585 = null;
                    }
                    String str = (String) c2585;
                    if (str == null) {
                        str = "";
                    }
                    try {
                        c2586 = c1564.m3267()[1];
                        if (c2586 == null) {
                            c2586 = null;
                        }
                    } catch (Throwable th2) {
                        c2586 = new C2585(th2);
                    }
                    if (c2586 instanceof C2585) {
                        c2586 = null;
                    }
                    String str2 = (String) c2586;
                    if (str2 == null) {
                        str2 = "";
                    }
                    try {
                        c2587 = c1564.m3267()[2];
                        if (c2587 == null) {
                            c2587 = null;
                        }
                    } catch (Throwable th3) {
                        c2587 = new C2585(th3);
                    }
                    if (c2587 instanceof C2585) {
                        c2587 = null;
                    }
                    String str3 = (String) c2587;
                    String str4 = str3 != null ? str3 : "";
                    C2759 c2759 = C2759.f8848;
                    String strConcat = str.concat(str4);
                    
                    Object objInvoke = AbstractC1574.dexToMethod(C2758.f8847).invoke(null, str2, strConcat);
                    Boolean bool = (Boolean) objInvoke;
                    
                    c1564.m3272(bool);
                }
                return Unit.INSTANCE;
            case 6:
                C1563 c1565 = (C1563) obj;
                if (C2771.f8868.m2538() == EnumC2770.f8865.f8867) {
                    
                    try {
                        c2588 = c1565.m3267()[0];
                        if (c2588 == null) {
                            c2588 = null;
                        }
                    } catch (Throwable th4) {
                        c2588 = new C2585(th4);
                    }
                    if (c2588 instanceof C2585) {
                        c2588 = null;
                    }
                    String str5 = (String) c2588;
                    if (str5 == null) {
                        str5 = "";
                    }
                    try {
                        c2589 = c1565.m3267()[1];
                        if (c2589 == null) {
                            c2589 = null;
                        }
                    } catch (Throwable th5) {
                        c2589 = new C2585(th5);
                    }
                    if (c2589 instanceof C2585) {
                        c2589 = null;
                    }
                    String str6 = (String) c2589;
                    if (str6 == null) {
                        str6 = "";
                    }
                    try {
                        c25810 = c1565.m3267()[2];
                        if (c25810 == null) {
                            c25810 = null;
                        }
                    } catch (Throwable th6) {
                        c25810 = new C2585(th6);
                    }
                    if (c25810 instanceof C2585) {
                        c25810 = null;
                    }
                    String str7 = (String) c25810;
                    String str8 = str7 != null ? str7 : "";
                    try {
                        c25811 = c1565.m3267()[3];
                        if (c25811 == null) {
                            c25811 = null;
                        }
                    } catch (Throwable th7) {
                        c25811 = new C2585(th7);
                    }
                    if (c25811 instanceof C2585) {
                        c25811 = null;
                    }
                    Boolean bool2 = (Boolean) c25811;
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        File file = new File(str6);
                        C3528 c3528 = C3528.f11041;
                        String strConcat2 = str5.concat(str8);
                        
                        Object objInvoke2 = AbstractC1574.dexToMethod(C3527.f11040).invoke(null, strConcat2, Boolean.TRUE);
                        AbstractC1328.m3042(file, new File((String) objInvoke2));
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ((C1333) obj).m3052(new C2764(2));
                return Unit.INSTANCE;
            case 8:
                C1984 c1984 = (C1984) obj;
                
                C1981 c1981 = new C1981(4);
                String[] strArr3 = AbstractC1574.f5469;
                c1981.m3826("compareContent");
                c1984.m3848(c1981);
                C1981 c1982 = new C1981(4);
                c1982.m3826("op");
                c1984.m3848(c1982);
                c1984.m3849(new C2764(9));
                return Unit.INSTANCE;
            case 9:
                C1981 c1983 = (C1981) obj;
                C2764 c2764 = new C2764(10);
                
                C1984 c1985 = new C1984(4);
                c2764.invoke(c1985);
                c1983.f6565 = c1985;
                return Unit.INSTANCE;
            case 10:
                C1984 c1986 = (C1984) obj;
                c1986.m3849(new C2764(11));
                c1986.m3849(new C2764(12));
                return Unit.INSTANCE;
            case 11:
                String[] strArr4 = AbstractC1574.f5469;
                ((C1981) obj).m3827("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return Unit.INSTANCE;
            case 12 /* 12 */:
                String[] strArr5 = AbstractC1574.f5469;
                ((C1981) obj).m3827("initCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                return Unit.INSTANCE;
            case 13:
                ((C1020) obj).declaringClassMatcher = new C2764(14);
                return Unit.INSTANCE;
            case 14 /* 14 */:
                ((C1332) obj).m3050(new C2764(15));
                return Unit.INSTANCE;
            case 15:
                ((C0705) obj).m2126(new C2764(8));
                return Unit.INSTANCE;
            case 16:
                ((C1020) obj).thisMethodMatcher = new C2764(22);
                return Unit.INSTANCE;
            case 17 /* 17 */:
                ((C1020) obj).thisMethodMatcher = new C2764(20);
                return Unit.INSTANCE;
            case 18 /* 18 */:
                ((C1020) obj).thisMethodMatcher = new C2764(21);
                return Unit.INSTANCE;
            case 19:
                ((C1020) obj).thisMethodMatcher = new C2764(23);
                return Unit.INSTANCE;
            case 20:
                C1333 c1333 = (C1333) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1987 = new C1981(4);
                c1987.m3827("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1333.f4794 = c1987;
                return Unit.INSTANCE;
            case 21 /* 21 */:
                C1333 c1334 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1988 = new C1981(4);
                c1988.m3827("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1334.f4794 = c1988;
                return Unit.INSTANCE;
            case 22 /* 22 */:
                C1333 c1335 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1989 = new C1981(4);
                c1989.m3827("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1335.f4794 = c1989;
                return Unit.INSTANCE;
            case 23 /* 23 */:
                C1333 c1336 = (C1333) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c19810 = new C1981(4);
                c19810.m3827("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                c1336.f4794 = c19810;
                return Unit.INSTANCE;
            case 24 /* 24 */:
                ((C1020) obj).thisMethodMatcher = new C2764(25);
                return Unit.INSTANCE;
            case 25 /* 25 */:
                C1333 c1337 = (C1333) obj;
                String[] strArr10 = AbstractC1574.f5469;
                c1337.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c19811 = new C1981(4);
                c19811.m3827("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
                c1337.f4794 = c19811;
                return Unit.INSTANCE;
            case 26:
                String[] strArr11 = AbstractC1574.f5469;
                c3561 = null;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_sport_step, null, false);
                int i2 = R.id.moduleDialogEdtSportModifyStep;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtSportModifyStep);
                if (textInputEditText != null) {
                    i2 = R.id.moduleDialogInputSportModifyStep;
                    if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputSportModifyStep)) != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewM4677;
                        C2012 c2012 = new C2012(linearLayout2, textInputEditText);
                        textInputEditText.setText(String.valueOf(C2796.f8922.m2539()));
                        c2007 = new C2007();
                        
                        c2007.f6678 = C2797.f8925;
                        c2007.f6680 = linearLayout2;
                        c2007.m3870("保存", new C2042(17, c2012));
                    }
                    break;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i2)));
            case 27:
                ((C1020) obj).thisMethodMatcher = new C2764(28);
                return Unit.INSTANCE;
            case 28:
                C1333 c1338 = (C1333) obj;
                String[] strArr12 = AbstractC1574.f5469;
                c1338.m3053("com.tencent.mm.plugin.sport.model");
                C1981 c19812 = new C1981(4);
                c19812.m3827("MicroMsg.Sport.DeviceStepManager", "get today step from %s todayStep %d");
                c1338.f4794 = c19812;
                return Unit.INSTANCE;
            default:
                ((C1563) obj).m3272(Long.valueOf(Math.min(C2796.f8922.m2539(), 98800L)));
                return Unit.INSTANCE;
        }
        AbstractC2784.m4755(c2007, c3561, 3);
        return Unit.INSTANCE;
    }
}
