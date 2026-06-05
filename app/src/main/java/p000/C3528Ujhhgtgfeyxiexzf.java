package p000;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛲ能不能ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3528Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11019Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3528Ujhhgtgfeyxiexzf(int i) {
        this.f11019Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        C0207Ujhhgtgfeyxiexzf c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf;
        Object c0919feyxiexzfUjhhgtg3;
        int i = this.f11019Ujhhgtgfeyxiexzf;
        int i2 = 12;
        int i3 = 9;
        int i4 = 23;
        int i5 = 24;
        Class<View> cls = View.class;
        Class<Integer> cls2 = Integer.class;
        Class<ViewGroup> cls3 = ViewGroup.class;
        int i6 = 8;
        Object obj2 = null;
        int i7 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_format_msg_time, null, false);
                int i8 = R.id.moduleDialogEdtFormatMsgTimeTimeFormat;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtFormatMsgTimeTimeFormat);
                if (textInputEditText != null) {
                    i8 = R.id.moduleDialogInputFormatMsgTimeTimeFormat;
                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputFormatMsgTimeTimeFormat)) != null) {
                        i8 = R.id.moduleDialogRbFormatMsgTimeModeDefault;
                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbFormatMsgTimeModeDefault);
                        if (materialRadioButton != null) {
                            i8 = R.id.moduleDialogRbFormatMsgTimeModeGone;
                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbFormatMsgTimeModeGone);
                            if (materialRadioButton2 != null) {
                                i8 = R.id.moduleDialogRbFormatMsgTimeModeVisible;
                                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbFormatMsgTimeModeVisible);
                                if (materialRadioButton3 != null) {
                                    i8 = R.id.moduleDialogRgFormatMsgTimeMode;
                                    if (((RadioGroup) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRgFormatMsgTimeMode)) != null) {
                                        LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                        C0694Ujhhgtgfeyxiexzf c0694Ujhhgtgfeyxiexzf = new C0694Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, materialRadioButton, materialRadioButton2, materialRadioButton3, 3);
                                        int iM4619Ujhhgtgfeyxiexzf = C3523Ujhhgtgfeyxiexzf.f11006Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf();
                                        if (iM4619Ujhhgtgfeyxiexzf == EnumC3524Ujhhgtgfeyxiexzf.f11007Ujhhgtgfeyxiexzf.f11011Ujhhgtgfeyxiexzf) {
                                            materialRadioButton2.setChecked(true);
                                        } else if (iM4619Ujhhgtgfeyxiexzf == EnumC3524Ujhhgtgfeyxiexzf.f11008Ujhhgtgfeyxiexzf.f11011Ujhhgtgfeyxiexzf) {
                                            materialRadioButton.setChecked(true);
                                        } else if (iM4619Ujhhgtgfeyxiexzf == EnumC3524Ujhhgtgfeyxiexzf.f11009Ujhhgtgfeyxiexzf.f11011Ujhhgtgfeyxiexzf) {
                                            materialRadioButton3.setChecked(true);
                                        }
                                        textInputEditText.setText(C3526Ujhhgtgfeyxiexzf.f11017Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                        C3525Ujhhgtgfeyxiexzf.f11012Ujhhgtgfeyxiexzf.getClass();
                                        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C3525Ujhhgtgfeyxiexzf.f11014Ujhhgtgfeyxiexzf;
                                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928396795165279626L, strArr), new C2977Ujhhgtgfeyxiexzf(i4, c0694Ujhhgtgfeyxiexzf));
                                        c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928396782280377738L, strArr), new C3471Ujhhgtgfeyxiexzf(1));
                                        C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                                        c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                        return c1943Ujhhgtgfeyxiexzf;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928803979539776906L, strArr).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i8)));
            case 1:
                C0134Ujhhgtgfeyxiexzf c0134Ujhhgtgfeyxiexzf = (C0134Ujhhgtgfeyxiexzf) obj;
                c0134Ujhhgtgfeyxiexzf.f1286Ujhhgtgfeyxiexzf = true;
                c0134Ujhhgtgfeyxiexzf.f1285Ujhhgtgfeyxiexzf = true;
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                return AbstractC1225feyxiexzfUjhhgtg.m2704Ujhhgtgfeyxiexzf("'", (String) obj, '\'');
            case 3:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_group_owner_title, null, false);
                int i9 = R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor1;
                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor1);
                if (textInputEditText2 != null) {
                    i9 = R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor2;
                    TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleAdminBgColor2);
                    if (textInputEditText3 != null) {
                        i9 = R.id.moduleDialogEdtGroupOwnerTitleAdminTextColor;
                        TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleAdminTextColor);
                        if (textInputEditText4 != null) {
                            i9 = R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor1;
                            TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor1);
                            if (textInputEditText5 != null) {
                                i9 = R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor2;
                                TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleCustomBgColor2);
                                if (textInputEditText6 != null) {
                                    i9 = R.id.moduleDialogEdtGroupOwnerTitleCustomTextColor;
                                    TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleCustomTextColor);
                                    if (textInputEditText7 != null) {
                                        i9 = R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor1;
                                        TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor1);
                                        if (textInputEditText8 != null) {
                                            i9 = R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor2;
                                            TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleNormalBgColor2);
                                            if (textInputEditText9 != null) {
                                                i9 = R.id.moduleDialogEdtGroupOwnerTitleNormalTextColor;
                                                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleNormalTextColor);
                                                if (textInputEditText10 != null) {
                                                    i9 = R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor1;
                                                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor1);
                                                    if (textInputEditText11 != null) {
                                                        i9 = R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor2;
                                                        TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleOwnerBgColor2);
                                                        if (textInputEditText12 != null) {
                                                            i9 = R.id.moduleDialogEdtGroupOwnerTitleOwnerTextColor;
                                                            TextInputEditText textInputEditText13 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtGroupOwnerTitleOwnerTextColor);
                                                            if (textInputEditText13 != null) {
                                                                i9 = R.id.moduleDialogInputGroupOwnerTitleAdminBgColor1;
                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleAdminBgColor1)) != null) {
                                                                    i9 = R.id.moduleDialogInputGroupOwnerTitleAdminBgColor2;
                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleAdminBgColor2)) != null) {
                                                                        i9 = R.id.moduleDialogInputGroupOwnerTitleCustomBgColor1;
                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleCustomBgColor1)) != null) {
                                                                            i9 = R.id.moduleDialogInputGroupOwnerTitleCustomBgColor2;
                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleCustomBgColor2)) != null) {
                                                                                i9 = R.id.moduleDialogInputGroupOwnerTitleCustomTextColor;
                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleCustomTextColor)) != null) {
                                                                                    i9 = R.id.moduleDialogInputGroupOwnerTitleNormalBgColor1;
                                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleNormalBgColor1)) != null) {
                                                                                        i9 = R.id.moduleDialogInputGroupOwnerTitleNormalBgColor2;
                                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleNormalBgColor2)) != null) {
                                                                                            i9 = R.id.moduleDialogInputGroupOwnerTitleNormalTextColor;
                                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleNormalTextColor)) != null) {
                                                                                                i9 = R.id.moduleDialogInputGroupOwnerTitleOwnerAdminTextColor;
                                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleOwnerAdminTextColor)) != null) {
                                                                                                    i9 = R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor1;
                                                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor1)) != null) {
                                                                                                        i9 = R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor2;
                                                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleOwnerBgColor2)) != null) {
                                                                                                            i9 = R.id.moduleDialogInputGroupOwnerTitleOwnerTextColor;
                                                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputGroupOwnerTitleOwnerTextColor)) != null) {
                                                                                                                LinearLayout linearLayout2 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                                                                                                                C0309Ujhhgtgfeyxiexzf c0309Ujhhgtgfeyxiexzf = new C0309Ujhhgtgfeyxiexzf(linearLayout2, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12, textInputEditText13);
                                                                                                                textInputEditText11.setText(C0640Ujhhgtgfeyxiexzf.f2690Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText12.setText(C0641Ujhhgtgfeyxiexzf.f2691Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText13.setText(C0642Ujhhgtgfeyxiexzf.f2692Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText2.setText(C0631Ujhhgtgfeyxiexzf.f2681Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText3.setText(C0632Ujhhgtgfeyxiexzf.f2682Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText4.setText(C0633Ujhhgtgfeyxiexzf.f2683Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText5.setText(C0634Ujhhgtgfeyxiexzf.f2684Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText6.setText(C0635Ujhhgtgfeyxiexzf.f2685Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText7.setText(C0636Ujhhgtgfeyxiexzf.f2686Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText8.setText(C0637Ujhhgtgfeyxiexzf.f2687Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText9.setText(C0638Ujhhgtgfeyxiexzf.f2688Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                textInputEditText10.setText(C0639Ujhhgtgfeyxiexzf.f2689Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                                                                                                                C0541Ujhhgtgfeyxiexzf.f2517Ujhhgtgfeyxiexzf.getClass();
                                                                                                                c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C0541Ujhhgtgfeyxiexzf.f2519Ujhhgtgfeyxiexzf;
                                                                                                                c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = linearLayout2;
                                                                                                                c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928856064608175498L, strArr2), new C2977Ujhhgtgfeyxiexzf(24, c0309Ujhhgtgfeyxiexzf));
                                                                                                                c0290Ujhhgtgfeyxiexzf2.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928856051723273610L, strArr2), new C3471Ujhhgtgfeyxiexzf(8));
                                                                                                                String str = MagicFactory.get(4928856030248437130L, strArr2);
                                                                                                                C3471Ujhhgtgfeyxiexzf c3471Ujhhgtgfeyxiexzf = new C3471Ujhhgtgfeyxiexzf(9);
                                                                                                                c0290Ujhhgtgfeyxiexzf2.f1727Ujhhgtgfeyxiexzf = str;
                                                                                                                c0290Ujhhgtgfeyxiexzf2.f1728Ujhhgtgfeyxiexzf = c3471Ujhhgtgfeyxiexzf;
                                                                                                                c0290Ujhhgtgfeyxiexzf2.f1729Ujhhgtgfeyxiexzf = true;
                                                                                                                c0290Ujhhgtgfeyxiexzf2.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                                                                                                return c1943Ujhhgtgfeyxiexzf;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928804254417683850L, strArr2).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i9)));
            case 4:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf3 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_handle_group_member, null, false);
                int i10 = R.id.moduleDialogEdtHandleGroupMemberTipColor;
                TextInputEditText textInputEditText14 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtHandleGroupMemberTipColor);
                if (textInputEditText14 != null) {
                    i10 = R.id.moduleDialogEdtHandleGroupMemberTipLeft;
                    TextInputEditText textInputEditText15 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtHandleGroupMemberTipLeft);
                    if (textInputEditText15 != null) {
                        i10 = R.id.moduleDialogInputHandleGroupMemberTipColor;
                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputHandleGroupMemberTipColor)) != null) {
                            i10 = R.id.moduleDialogInputHandleGroupMemberTipLeft;
                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputHandleGroupMemberTipLeft)) != null) {
                                LinearLayout linearLayout3 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf3;
                                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = new C0328Ujhhgtgfeyxiexzf(linearLayout3, textInputEditText14, textInputEditText15, 1);
                                textInputEditText14.setText(C0525Ujhhgtgfeyxiexzf.f2482Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                textInputEditText15.setText(C0533Ujhhgtgfeyxiexzf.f2501Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf3 = new C0290Ujhhgtgfeyxiexzf();
                                C0534Ujhhgtgfeyxiexzf.f2502Ujhhgtgfeyxiexzf.getClass();
                                c0290Ujhhgtgfeyxiexzf3.f1721Ujhhgtgfeyxiexzf = C0534Ujhhgtgfeyxiexzf.f2504Ujhhgtgfeyxiexzf;
                                c0290Ujhhgtgfeyxiexzf3.f1723Ujhhgtgfeyxiexzf = linearLayout3;
                                c0290Ujhhgtgfeyxiexzf3.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928861149849453962L, strArr3), new C2977Ujhhgtgfeyxiexzf(25, c0328Ujhhgtgfeyxiexzf));
                                c0290Ujhhgtgfeyxiexzf3.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928861136964552074L, strArr3), new C3471Ujhhgtgfeyxiexzf(10));
                                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf3, null, 3);
                                c0290Ujhhgtgfeyxiexzf3.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                return c1943Ujhhgtgfeyxiexzf;
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928804391856637322L, strArr3).concat(viewM2416Ujhhgtgfeyxiexzf3.getResources().getResourceName(i10)));
            case 5:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                View view = (View) c0919feyxiexzfUjhhgtg;
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                int i11 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg2).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class);
                boolean z = false;
                for (Object obj3 : c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf()) {
                    String str2 = (String) ((C3438feyxiexzfUjhhgtg) obj3).m4939Ujhhgtgfeyxiexzf();
                    if (str2 != null && str2.startsWith(MagicFactory.get(4928861124079650186L, strArr4))) {
                        if (z) {
                            throw new IllegalArgumentException(MagicFactory.get(4928861218568930698L, strArr4));
                        }
                        obj2 = obj3;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException(MagicFactory.get(4928861407547491722L, strArr4));
                }
                String str3 = (String) ((C3438feyxiexzfUjhhgtg) obj2).m4939Ujhhgtgfeyxiexzf();
                if (str3.startsWith(MagicFactory.get(4928860621568476554L, strArr4)) && (c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(Pattern.compile(MagicFactory.get(4928860827726906762L, strArr4)).matcher(str3), 0, str3)) != null) {
                    String str4 = (String) ((C0208Ujhhgtgfeyxiexzf) c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.m1285Ujhhgtgfeyxiexzf()).get(2);
                    Context context = view.getContext();
                    Intent intent = new Intent();
                    intent.setClassName(context, MagicFactory.get(4928210548203455882L, strArr4));
                    intent.putExtra(MagicFactory.get(4928209659145225610L, strArr4), str4);
                    context.startActivity(intent);
                    c0578Ujhhgtgfeyxiexzf.m1852Ujhhgtgfeyxiexzf();
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1659feyxiexzfUjhhgtg(MagicFactory.get(4928860896446383498L, strArr5));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928860050337826186L, strArr5), MagicFactory.get(4928860209251616138L, strArr5));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ContextMenu.class);
                ConcurrentHashMap concurrentHashMap = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
                return Boolean.valueOf(c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.mo2998Ujhhgtgfeyxiexzf().isAssignableFrom((Class) obj));
            case 9:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928396288359138698L, strArr6), MagicFactory.get(4928396473042732426L, strArr6));
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf4 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_hide_chat_item_menu, null, false);
                int i12 = R.id.moduleDialogEdtHideChatItemMenuSet;
                TextInputEditText textInputEditText16 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtHideChatItemMenuSet);
                if (textInputEditText16 != null) {
                    i12 = R.id.moduleDialogInputHideChatItemMenuSet;
                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputHideChatItemMenuSet)) != null) {
                        LinearLayout linearLayout4 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf4;
                        C0319Ujhhgtgfeyxiexzf c0319Ujhhgtgfeyxiexzf = new C0319Ujhhgtgfeyxiexzf(linearLayout4, textInputEditText16, 5);
                        textInputEditText16.setText(AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(C0557Ujhhgtgfeyxiexzf.f2558Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf(), MagicFactory.get(4928396322718877066L, strArr7), null, null, null, 62));
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf4 = new C0290Ujhhgtgfeyxiexzf();
                        C0558Ujhhgtgfeyxiexzf.f2559Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf4.f1721Ujhhgtgfeyxiexzf = C0558Ujhhgtgfeyxiexzf.f2562Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf4.f1723Ujhhgtgfeyxiexzf = linearLayout4;
                        c0290Ujhhgtgfeyxiexzf4.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928396314128942474L, strArr7), new C2977Ujhhgtgfeyxiexzf(26, c0319Ujhhgtgfeyxiexzf));
                        c0290Ujhhgtgfeyxiexzf4.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928396301244040586L, strArr7), new C3471Ujhhgtgfeyxiexzf(i2));
                        c0290Ujhhgtgfeyxiexzf4.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928803429783963018L, strArr7).concat(viewM2416Ujhhgtgfeyxiexzf4.getResources().getResourceName(i12)));
            case 11:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3528Ujhhgtgfeyxiexzf(i3));
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                int i13 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf((C0578Ujhhgtgfeyxiexzf) obj);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10725Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(i6);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((ContextMenu) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(List.class);
                ArrayList arrayList = (ArrayList) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (AbstractC2856feyxiexzfUjhhgtg.m4237feyxiexzfUjhhgtg(C0557Ujhhgtgfeyxiexzf.f2558Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf(), ((MenuItem) obj4).getTitle())) {
                        arrayList2.add(obj4);
                    }
                }
                arrayList.removeAll(AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList2));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(17);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(18);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<View> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                if (clsM5159Ujhhgtgfeyxiexzf == null) {
                    clsM5159Ujhhgtgfeyxiexzf = cls;
                }
                Class<Integer> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf, cls2);
                cls2 = clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : Integer.class;
                Class<View> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                cls = clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : View.class;
                Class<ViewGroup> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                c0394Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(cls2, cls, clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : ViewGroup.class);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg2 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg2.f10255Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(20);
                c3265feyxiexzfUjhhgtg2.f10256Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(21);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928381101354780042L, strArr8));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928381719830070666L, strArr8), MagicFactory.get(4928381968938173834L, strArr8));
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3528Ujhhgtgfeyxiexzf(15));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                Object objM1850Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1850Ujhhgtgfeyxiexzf();
                AbstractC1896feyxiexzfUjhhgtg.m3232Ujhhgtgfeyxiexzf((ViewGroup) (objM1850Ujhhgtgfeyxiexzf instanceof ViewGroup ? objM1850Ujhhgtgfeyxiexzf : null), new int[]{0, 1, 1}).setVisibility(8);
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3528Ujhhgtgfeyxiexzf(i4));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3528Ujhhgtgfeyxiexzf(i5));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                Object objM1850Ujhhgtgfeyxiexzf2 = ((C0578Ujhhgtgfeyxiexzf) obj).m1850Ujhhgtgfeyxiexzf();
                AbstractC1896feyxiexzfUjhhgtg.m3232Ujhhgtgfeyxiexzf((ViewGroup) (objM1850Ujhhgtgfeyxiexzf2 instanceof ViewGroup ? objM1850Ujhhgtgfeyxiexzf2 : null), new int[]{0, 1, 1}).setVisibility(8);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928381243088700810L, strArr9), MagicFactory.get(4928381565211248010L, strArr9));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<View> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                if (clsM5159Ujhhgtgfeyxiexzf4 == null) {
                    clsM5159Ujhhgtgfeyxiexzf4 = cls;
                }
                Class<Integer> clsM2695Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf2, clsM5159Ujhhgtgfeyxiexzf4, cls2);
                cls2 = clsM2695Ujhhgtgfeyxiexzf2 != null ? clsM2695Ujhhgtgfeyxiexzf2 : Integer.class;
                Class<View> clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                cls = clsM5159Ujhhgtgfeyxiexzf5 != null ? clsM5159Ujhhgtgfeyxiexzf5 : View.class;
                Class<ViewGroup> clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                c0394Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(cls2, cls, clsM5159Ujhhgtgfeyxiexzf6 != null ? clsM5159Ujhhgtgfeyxiexzf6 : ViewGroup.class);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                if (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg3 = null;
                }
                C2305Ujhhgtgfeyxiexzf c2305Ujhhgtgfeyxiexzf = new C2305Ujhhgtgfeyxiexzf((ViewGroup) c0919feyxiexzfUjhhgtg3, null);
                C1118feyxiexzfUjhhgtg c1118feyxiexzfUjhhgtg = new C1118feyxiexzfUjhhgtg();
                c1118feyxiexzfUjhhgtg.f4223Ujhhgtgfeyxiexzf = c2305Ujhhgtgfeyxiexzf.mo1767Ujhhgtgfeyxiexzf(c1118feyxiexzfUjhhgtg, c1118feyxiexzfUjhhgtg);
                while (c1118feyxiexzfUjhhgtg.hasNext()) {
                    View view2 = (View) c1118feyxiexzfUjhhgtg.next();
                    if (view2 instanceof TextView) {
                        String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(MagicFactory.get(4928384485789009290L, strArr10), MagicFactory.get(4928384468609140106L, strArr10), MagicFactory.get(4928384580278289802L, strArr10), MagicFactory.get(4928384537328616842L, strArr10));
                        if (!listM4192Ujhhgtgfeyxiexzf.isEmpty()) {
                            Iterator it = listM4192Ujhhgtgfeyxiexzf.iterator();
                            while (it.hasNext()) {
                                TextView textView = (TextView) view2;
                                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(textView.getText(), (String) it.next(), true)) {
                                    textView.setVisibility(4);
                                }
                                break;
                            }
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf5 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_hide_msg_avatar_iv, null, false);
                int i14 = R.id.moduleDialogCbHideMsgAvatarIvHideLeft;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf5, R.id.moduleDialogCbHideMsgAvatarIvHideLeft);
                if (materialCheckBox != null) {
                    i14 = R.id.moduleDialogCbHideMsgAvatarIvHideRight;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf5, R.id.moduleDialogCbHideMsgAvatarIvHideRight);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout5 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf5;
                        C0326Ujhhgtgfeyxiexzf c0326Ujhhgtgfeyxiexzf = new C0326Ujhhgtgfeyxiexzf(linearLayout5, materialCheckBox, materialCheckBox2, 2);
                        materialCheckBox.setChecked(C0563Ujhhgtgfeyxiexzf.f2576Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                        materialCheckBox2.setChecked(C0564Ujhhgtgfeyxiexzf.f2577Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf5 = new C0290Ujhhgtgfeyxiexzf();
                        C0560Ujhhgtgfeyxiexzf.f2566Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf5.f1721Ujhhgtgfeyxiexzf = C0560Ujhhgtgfeyxiexzf.f2568Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf5.f1723Ujhhgtgfeyxiexzf = linearLayout5;
                        c0290Ujhhgtgfeyxiexzf5.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928384112126854538L, strArr11), new C2977Ujhhgtgfeyxiexzf(27, c0326Ujhhgtgfeyxiexzf));
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf5, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928803567222916490L, strArr11).concat(viewM2416Ujhhgtgfeyxiexzf5.getResources().getResourceName(i14)));
            case 27:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3528Ujhhgtgfeyxiexzf(29);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                new C2501feyxiexzfUjhhgtg(i7, 6, c0578Ujhhgtgfeyxiexzf3).m3786Ujhhgtgfeyxiexzf(8);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928383686925092234L, strArr12));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928383300378035594L, strArr12), MagicFactory.get(4928383609615680906L, strArr12));
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
