package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᲈᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0316 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1602;

    public /* synthetic */ C0316(int i) {
        this.f1602 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v132 */
    /* JADX WARN: Type inference failed for: r1v133 */
    /* JADX WARN: Type inference failed for: r1v22 */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        ?? r1;
        String strM2666;
        ImageView imageView;
        Bitmap bitmap;
        int i = this.f1602;
        int i2 = 11;
        int i3 = 17;
        int i4 = 1;
        int i5 = 4;
        int i6 = 3;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                ((C1335) obj).m3155(new C0316(i4));
                return c3554;
            case 1:
                String[] strArr = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.ForceNotifyStorage", "[onNewXmlReceived] ret:%s isAdd:%s info:%s");
                return c3554;
            case 2:
                String[] strArr2 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_auto_login_win, null, false);
                int i7 = R.id.moduleDialogCbAutoLoginWinAutoLoginDevice;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbAutoLoginWinAutoLoginDevice);
                if (materialCheckBox != null) {
                    i7 = R.id.moduleDialogCbAutoLoginWinAutoSyncMsg;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbAutoLoginWinAutoSyncMsg);
                    if (materialCheckBox2 != null) {
                        i7 = R.id.moduleDialogCbAutoLoginWinShowLoginDevice;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbAutoLoginWinShowLoginDevice);
                        if (materialCheckBox3 != null) {
                            LinearLayout linearLayout = (LinearLayout) viewM4622;
                            C2042 c2042 = new C2042(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3, 0);
                            materialCheckBox2.setChecked(C0320.f1609.m2660());
                            materialCheckBox3.setChecked(C0321.f1610.m2660());
                            materialCheckBox.setChecked(C0319.f1608.m2660());
                            C2037 c2037 = new C2037();
                            C0322.f1611.getClass();
                            c2037.f6779 = C0322.f1613;
                            c2037.f6781 = linearLayout;
                            c2037.m4057("保存", new C0114(c2042, i5));
                            AbstractC2844.m4788(c2037, null, 3);
                            return c3554;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i7)));
            case 3:
                Object objM3448 = ((C1574) obj).m3448();
                Activity activity = (Activity) (!(objM3448 instanceof Activity) ? null : objM3448);
                if (activity == null) {
                    Class<Activity> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Activity.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4232 != null ? clsM4232 : Activity.class).getName()).toString());
                }
                boolean zM2660 = C0320.f1609.m2660();
                if (C0321.f1610.m2660()) {
                    r1 = zM2660;
                    r1 = (zM2660 ? 1 : 0) | 2;
                }
                r1 = zM2660;
                int i8 = r1;
                if (C0319.f1608.m2660()) {
                    i8 = (r1 == true ? 1 : 0) | 4;
                }
                activity.getIntent().putExtra("intent.key.function.control", i8);
                return c3554;
            case 4:
                int i9 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772((C1574) obj);
                c1300M4772.f4724 = AbstractC2574.m4549(Button.class);
                ((Button) ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3127()).callOnClick();
                return c3554;
            case 5:
                ((C1023) obj).f3740 = new C0316(7);
                return c3554;
            case 6:
                ((C1023) obj).f3740 = new C0316(9);
                return c3554;
            case 7:
                C1335 c1335 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1335);
                String[] strArr3 = AbstractC1471.f5234;
                c2012M4773.m4019("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                if (AbstractC0972.m2596(EnumC3737.f11684) || AbstractC0972.m2597(EnumC3734.f11648)) {
                    c2012M4773.m4021("setHdImageActionDownloadable");
                } else {
                    c2012M4773.m4021("setImageHdImgBtnVisibility");
                }
                c1335.f4794 = c2012M4773;
                return c3554;
            case 8:
                int i10 = AbstractC1768.f5906;
                C1300 c1300M4773 = AbstractC2844.m4772((C1574) obj);
                c1300M4773.f4724 = AbstractC2574.m4549(Button.class);
                Iterator it = c1300M4773.m3117().iterator();
                while (it.hasNext()) {
                    Button button = (Button) ((C1316) it.next()).m3127();
                    if (button != null && button.getVisibility() == 0) {
                        String[] strArr4 = AbstractC1471.f5234;
                        List listM2311 = AbstractC0740.m2311("查看原图", "Full Image", "查看原视频", "Original quality");
                        if (!listM2311.isEmpty()) {
                            Iterator it2 = listM2311.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC2901.m4861(button.getText(), (String) it2.next(), true)) {
                                    button.performClick();
                                }
                                break;
                            }
                        }
                    }
                }
                return c3554;
            case 9:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1336);
                String[] strArr5 = AbstractC1471.f5234;
                c2012M4774.m4019("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                c2012M4774.m4021("checkNeedShowOriginVideoBtn");
                c1336.f4794 = c2012M4774;
                return c3554;
            case 10:
                ((C1023) obj).f3740 = new C0316(i2);
                return c3554;
            case 11:
                ((C1335) obj).m3155(new C0316(12));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                C2012 c2012 = (C2012) obj;
                Class<ImageView> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(ImageView.class));
                Class cls = clsM4233 != null ? clsM4233 : ImageView.class;
                Class<String> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls2 = clsM4234 != null ? clsM4234 : String.class;
                Class<Float> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(Float.class));
                Class cls3 = clsM4235 != null ? clsM4235 : Float.class;
                Class<Boolean> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                c2012.m4017(cls, cls2, cls3, clsM4236 != null ? clsM4236 : Boolean.class);
                c2012.m4021("MicroMsg.AvatarDrawable");
                return c3554;
            case 13:
                ((C1023) obj).f3739 = new C0316(14);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1334 c1334 = (C1334) obj;
                c1334.m3154("com.tencent.mm.modelavatar");
                c1334.m3153(new C0316(15));
                return c3554;
            case 15:
                C0700 c0700 = (C0700) obj;
                c0700.getClass();
                C2012 c2013 = new C2012();
                String[] strArr6 = AbstractC1471.f5234;
                c2013.m4020("onAccountInitialized");
                c2013.m4021("//avatar");
                C2015 c2015 = c0700.f2681;
                if (c2015 == null) {
                    c2015 = new C2015();
                }
                c0700.f2681 = c2015;
                c2015.m4042(c2013);
                C2012 c2014 = new C2012();
                c2014.m4020("onAccountReleased");
                c2014.m4021("//avatar");
                C2015 c2016 = c0700.f2681;
                if (c2016 == null) {
                    c2016 = new C2015();
                }
                c0700.f2681 = c2016;
                c2016.m4042(c2014);
                return c3554;
            case 16:
                ((C1023) obj).f3739 = new C0316(i3);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1334 c1337 = (C1334) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1337.m3154("com.tencent.mm.modelavatar");
                C0700 c0701 = new C0700();
                c0701.m2220("MicroMsg.AvatarStorage", "Failed to save avatar: %s");
                c1337.f4791 = c0701;
                return c3554;
            case Opcodes.LDC /* 18 */:
                String[] strArr8 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_bottom_tab_custom, null, false);
                int i11 = R.id.moduleDialogCbBottomTabViewHideTab;
                MaterialCheckBox materialCheckBox4 = (MaterialCheckBox) AbstractC1272.m3098(viewM4623, R.id.moduleDialogCbBottomTabViewHideTab);
                if (materialCheckBox4 != null) {
                    i11 = R.id.moduleDialogCbBottomTabViewHideTitle;
                    MaterialCheckBox materialCheckBox5 = (MaterialCheckBox) AbstractC1272.m3098(viewM4623, R.id.moduleDialogCbBottomTabViewHideTitle);
                    if (materialCheckBox5 != null) {
                        i11 = R.id.moduleDialogCbBottomTabViewModIcon;
                        MaterialCheckBox materialCheckBox6 = (MaterialCheckBox) AbstractC1272.m3098(viewM4623, R.id.moduleDialogCbBottomTabViewModIcon);
                        if (materialCheckBox6 != null) {
                            i11 = R.id.moduleDialogCbBottomTabViewModTitle;
                            MaterialCheckBox materialCheckBox7 = (MaterialCheckBox) AbstractC1272.m3098(viewM4623, R.id.moduleDialogCbBottomTabViewModTitle);
                            if (materialCheckBox7 != null) {
                                i11 = R.id.moduleDialogEdtBottomTabViewChats;
                                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtBottomTabViewChats);
                                if (textInputEditText != null) {
                                    i11 = R.id.moduleDialogEdtBottomTabViewContacts;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtBottomTabViewContacts);
                                    if (textInputEditText2 != null) {
                                        i11 = R.id.moduleDialogEdtBottomTabViewDiscover;
                                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtBottomTabViewDiscover);
                                        if (textInputEditText3 != null) {
                                            i11 = R.id.moduleDialogEdtBottomTabViewMe;
                                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtBottomTabViewMe);
                                            if (textInputEditText4 != null) {
                                                i11 = R.id.moduleDialogInputBottomTabViewChats;
                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputBottomTabViewChats)) != null) {
                                                    i11 = R.id.moduleDialogInputBottomTabViewContacts;
                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputBottomTabViewContacts)) != null) {
                                                        i11 = R.id.moduleDialogInputBottomTabViewDiscover;
                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputBottomTabViewDiscover)) != null) {
                                                            i11 = R.id.moduleDialogInputBottomTabViewMe;
                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputBottomTabViewMe)) != null) {
                                                                LinearLayout linearLayout2 = (LinearLayout) viewM4623;
                                                                C2044 c2044 = new C2044(linearLayout2, materialCheckBox4, materialCheckBox5, materialCheckBox6, materialCheckBox7, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4);
                                                                textInputEditText.setText(C0430.f2002.m2666());
                                                                textInputEditText2.setText(C0431.f2003.m2666());
                                                                textInputEditText3.setText(C0432.f2004.m2666());
                                                                textInputEditText4.setText(C0435.f2007.m2666());
                                                                materialCheckBox6.setChecked(C0436.f2008.m2660());
                                                                materialCheckBox7.setChecked(C0437.f2009.m2660());
                                                                materialCheckBox5.setChecked(C0434.f2006.m2660());
                                                                materialCheckBox4.setChecked(C0433.f2005.m2660());
                                                                C2037 c2038 = new C2037();
                                                                C0438.f2010.getClass();
                                                                c2038.f6779 = C0438.f2018;
                                                                c2038.f6781 = linearLayout2;
                                                                c2038.m4057("保存", new C0114(c2044, 5));
                                                                c2038.m4056("重置", new C0112(11));
                                                                C2037.m4053(c2038, null, 3);
                                                                c2038.m4055().m3985();
                                                                return c3554;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i11)));
            case 19:
                String[] strArr9 = AbstractC1471.f5234;
                C0438 c0438 = C0438.f2010;
                Object objM3449 = ((C1574) obj).m3448();
                RelativeLayout relativeLayout = (RelativeLayout) (objM3449 instanceof RelativeLayout ? objM3449 : null);
                if (relativeLayout == null) {
                    Class<RelativeLayout> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(RelativeLayout.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4237 != null ? clsM4237 : RelativeLayout.class).getName()).toString());
                }
                if (C0433.f2005.m2660()) {
                    int childCount = relativeLayout.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        relativeLayout.getChildAt(i12).setVisibility(8);
                    }
                } else {
                    int i13 = 0;
                    while (i13 < 4) {
                        if (C0436.f2008.m2660() && (imageView = (ImageView) AbstractC3640.m5204(relativeLayout, new int[]{0, i13, 0, 0, 0})) != null) {
                            imageView.setVisibility(4);
                            ViewParent parent = imageView.getParent();
                            "null cannot be cast to non-null type android.widget.RelativeLayout";
                            RelativeLayout relativeLayout2 = (RelativeLayout) parent;
                            ImageView imageView2 = new ImageView(relativeLayout2.getContext());
                            imageView2.setLayoutParams(imageView.getLayoutParams());
                            if (i13 == 0) {
                                c0438.getClass();
                                bitmap = (Bitmap) C0438.f2013.getValue();
                            } else if (i13 == 1) {
                                c0438.getClass();
                                bitmap = (Bitmap) C0438.f2014.getValue();
                            } else if (i13 == 2) {
                                c0438.getClass();
                                bitmap = (Bitmap) C0438.f2015.getValue();
                            } else if (i13 != 3) {
                                c0438.getClass();
                                bitmap = (Bitmap) C0438.f2012.getValue();
                            } else {
                                c0438.getClass();
                                bitmap = (Bitmap) C0438.f2016.getValue();
                            }
                            imageView2.setImageBitmap(bitmap);
                            relativeLayout2.addView(imageView2, 0);
                        }
                        TextView textView = (TextView) AbstractC3640.m5204(relativeLayout, new int[]{0, i13, 0, 1});
                        if (textView != null) {
                            if (C0434.f2006.m2660()) {
                                textView.setVisibility(8);
                            } else if (C0437.f2009.m2660()) {
                                if (i13 == 0) {
                                    strM2666 = C0430.f2002.m2666();
                                } else if (i13 == 1) {
                                    strM2666 = C0431.f2003.m2666();
                                } else if (i13 != 2) {
                                    strM2666 = i13 != 3 ? "" : C0435.f2007.m2666();
                                } else {
                                    strM2666 = C0432.f2004.m2666();
                                }
                                textView.setText(strM2666);
                            }
                        }
                        i13++;
                    }
                }
                return c3554;
            case 20:
                String[] strArr10 = AbstractC1471.f5234;
                View viewM4624 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_bottom_tab_material, null, false);
                int i14 = R.id.moduleDialogEdtBottomTabViewBottomDarkColor;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtBottomTabViewBottomDarkColor);
                if (textInputEditText5 != null) {
                    i14 = R.id.moduleDialogEdtBottomTabViewBottomLightColor;
                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtBottomTabViewBottomLightColor);
                    if (textInputEditText6 != null) {
                        i14 = R.id.moduleDialogEdtBottomTabViewIconDarkColor;
                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtBottomTabViewIconDarkColor);
                        if (textInputEditText7 != null) {
                            i14 = R.id.moduleDialogEdtBottomTabViewIconLightColor;
                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtBottomTabViewIconLightColor);
                            if (textInputEditText8 != null) {
                                i14 = R.id.moduleDialogEdtBottomTabViewSelectDarkColor;
                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtBottomTabViewSelectDarkColor);
                                if (textInputEditText9 != null) {
                                    i14 = R.id.moduleDialogEdtBottomTabViewSelectLightColor;
                                    TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1272.m3098(viewM4624, R.id.moduleDialogEdtBottomTabViewSelectLightColor);
                                    if (textInputEditText10 != null) {
                                        i14 = R.id.moduleDialogInputBottomTabViewBottomDarkColor;
                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputBottomTabViewBottomDarkColor)) != null) {
                                            i14 = R.id.moduleDialogInputBottomTabViewBottomLightColor;
                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputBottomTabViewBottomLightColor)) != null) {
                                                i14 = R.id.moduleDialogInputBottomTabViewIconDarkColor;
                                                if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputBottomTabViewIconDarkColor)) != null) {
                                                    i14 = R.id.moduleDialogInputBottomTabViewIconLightColor;
                                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputBottomTabViewIconLightColor)) != null) {
                                                        i14 = R.id.moduleDialogInputBottomTabViewSelectDarkColor;
                                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputBottomTabViewSelectDarkColor)) != null) {
                                                            i14 = R.id.moduleDialogInputBottomTabViewSelectLightColor;
                                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4624, R.id.moduleDialogInputBottomTabViewSelectLightColor)) != null) {
                                                                LinearLayout linearLayout3 = (LinearLayout) viewM4624;
                                                                C2043 c2043 = new C2043(linearLayout3, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10);
                                                                textInputEditText6.setText(C0443.f2031.m2666());
                                                                textInputEditText10.setText(C0447.f2035.m2666());
                                                                textInputEditText8.setText(C0445.f2033.m2666());
                                                                textInputEditText5.setText(C0442.f2030.m2666());
                                                                textInputEditText9.setText(C0446.f2034.m2666());
                                                                textInputEditText7.setText(C0444.f2032.m2666());
                                                                C2037 c2039 = new C2037();
                                                                C0448.f2036.getClass();
                                                                c2039.f6779 = C0448.f2044;
                                                                c2039.f6781 = linearLayout3;
                                                                c2039.m4057("保存", new C0114(c2043, 6));
                                                                c2039.m4056("重置", new C0112(17));
                                                                C2037.m4053(c2039, null, 3);
                                                                c2039.m4055().m3985();
                                                                return c3554;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4624.getResources().getResourceName(i14)));
            case Opcodes.ILOAD /* 21 */:
                ((C1023) obj).f3740 = new C0316(22);
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                ((C1335) obj).m3155(new C0316(23));
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                C2012 c2017 = (C2012) obj;
                c2017.m4015(1);
                String[] strArr11 = AbstractC1471.f5234;
                c2017.m4021("MicroMsg.Cdn.CdnFSC", "startDownloadTask ");
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1023) obj).f3739 = new C0316(25);
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                ((C1334) obj).m3153(new C0316(26));
                return c3554;
            case 26:
                String[] strArr12 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.CdnTransportService", "release", "MicroMsg.SubCoreCdnTransport");
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C0581(i6);
                return c3554;
            case 28:
                String[] strArr13 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.FavSendFilter", "[FAV_ITEM_TYPE_VOICE] canFilterVoice = true, back");
                return c3554;
            default:
                ((C1023) obj).f3740 = new C0581(i5);
                return c3554;
        }
    }
}
