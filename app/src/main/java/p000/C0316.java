package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᤝᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0316 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1564;

    public /* synthetic */ C0316(int i) {
        this.f1564 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        int i;
        String strM2542;
        ImageView imageView;
        Bitmap bitmap;
        Object c2585;
        Object c2586;
        int i2 = this.f1564;
        int i3 = 2;
        int i4 = 6;
        int i5 = 17;
        Class<Boolean> cls = Boolean.class;
        boolean zBooleanValue = true;
        char c = 1;
        final int i6 = 0;
        C3497 c3497 = C3497.f10997;
        switch (i2) {
            case 0:
                ((C1020) obj).f3733 = new C0316(i3);
                return c3497;
            case 1:
                ((C1020) obj).f3733 = new C0316(4);
                return c3497;
            case 2:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                String[] strArr = AbstractC1574.f5469;
                c1981M4739.m3825("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                if (AbstractC3471.m5079(EnumC3677.f11536) || AbstractC3471.m5080(EnumC3674.f11499)) {
                    c1981M4739.m3827("setHdImageActionDownloadable");
                } else {
                    c1981M4739.m3827("setImageHdImgBtnVisibility");
                }
                c1333.f4794 = c1981M4739;
                return c3497;
            case 3:
                int i7 = AbstractC1745.f5844;
                C1299 c1299M4738 = AbstractC2784.m4738((C1563) obj);
                c1299M4738.f4725 = AbstractC2519.m4527(Button.class);
                Iterator it = c1299M4738.m3014().iterator();
                while (it.hasNext()) {
                    Button button = (Button) ((C1315) it.next()).m3024();
                    if (button != null && button.getVisibility() == 0) {
                        String[] strArr2 = AbstractC1574.f5469;
                        List listM2212 = AbstractC0745.m2212("查看原图", "Full Image", "查看原视频", "Original quality");
                        if (!listM2212.isEmpty()) {
                            Iterator it2 = listM2212.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC2841.m4828(button.getText(), (String) it2.next(), true)) {
                                    button.performClick();
                                }
                                break;
                            }
                        }
                    }
                }
                return c3497;
            case 4:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                String[] strArr3 = AbstractC1574.f5469;
                c1981M47310.m3825("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                c1981M47310.m3827("checkNeedShowOriginVideoBtn");
                c1334.f4794 = c1981M47310;
                return c3497;
            case 5:
                ((C1020) obj).f3733 = new C0316(i4);
                return c3497;
            case 6:
                ((C1333) obj).m3052(new C0316(7));
                return c3497;
            case 7:
                C1981 c1981 = (C1981) obj;
                Class<ImageView> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(ImageView.class));
                Class cls2 = clsM2183 != null ? clsM2183 : ImageView.class;
                Class<String> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(String.class));
                Class cls3 = clsM2184 != null ? clsM2184 : String.class;
                Class<Float> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(Float.class));
                Class cls4 = clsM2185 != null ? clsM2185 : Float.class;
                Class<Boolean> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                c1981.m3823(cls2, cls3, cls4, clsM2186 != null ? clsM2186 : Boolean.class);
                c1981.m3827("MicroMsg.AvatarDrawable");
                return c3497;
            case 8:
                ((C1020) obj).f3732 = new C0316(9);
                return c3497;
            case 9:
                C1332 c1332 = (C1332) obj;
                c1332.m3051("com.tencent.mm.modelavatar");
                c1332.m3050(new C0316(10));
                return c3497;
            case 10:
                C0705 c0705 = (C0705) obj;
                c0705.getClass();
                C1981 c1982 = new C1981(4);
                String[] strArr4 = AbstractC1574.f5469;
                c1982.m3826("onAccountInitialized");
                c1982.m3827("//avatar");
                C1984 c1984 = c0705.f2687;
                if (c1984 == null) {
                    i = 4;
                    c1984 = new C1984(4);
                } else {
                    i = 4;
                }
                c0705.f2687 = c1984;
                c1984.m3848(c1982);
                C1981 c1983 = new C1981(i);
                c1983.m3826("onAccountReleased");
                c1983.m3827("//avatar");
                C1984 c1985 = c0705.f2687;
                if (c1985 == null) {
                    c1985 = new C1984(i);
                }
                c0705.f2687 = c1985;
                c1985.m3848(c1983);
                return c3497;
            case 11:
                ((C1020) obj).f3732 = new C0316(12);
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                C1332 c1335 = (C1332) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1335.m3051("com.tencent.mm.modelavatar");
                C0705 c0706 = new C0705(4);
                c0706.m2127("MicroMsg.AvatarStorage", "Failed to save avatar: %s");
                c1335.f4791 = c0706;
                return c3497;
            case 13:
                String[] strArr6 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_bottom_tab_custom, null, false);
                int i8 = R.id.moduleDialogCbBottomTabViewHideTab;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbBottomTabViewHideTab);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogCbBottomTabViewHideTitle;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbBottomTabViewHideTitle);
                    if (materialCheckBox2 != null) {
                        i8 = R.id.moduleDialogCbBottomTabViewModIcon;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbBottomTabViewModIcon);
                        if (materialCheckBox3 != null) {
                            i8 = R.id.moduleDialogCbBottomTabViewModTitle;
                            MaterialCheckBox materialCheckBox4 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbBottomTabViewModTitle);
                            if (materialCheckBox4 != null) {
                                i8 = R.id.moduleDialogEdtBottomTabViewChats;
                                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtBottomTabViewChats);
                                if (textInputEditText != null) {
                                    i8 = R.id.moduleDialogEdtBottomTabViewContacts;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtBottomTabViewContacts);
                                    if (textInputEditText2 != null) {
                                        i8 = R.id.moduleDialogEdtBottomTabViewDiscover;
                                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtBottomTabViewDiscover);
                                        if (textInputEditText3 != null) {
                                            i8 = R.id.moduleDialogEdtBottomTabViewMe;
                                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtBottomTabViewMe);
                                            if (textInputEditText4 != null) {
                                                i8 = R.id.moduleDialogInputBottomTabViewChats;
                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputBottomTabViewChats)) != null) {
                                                    i8 = R.id.moduleDialogInputBottomTabViewContacts;
                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputBottomTabViewContacts)) != null) {
                                                        i8 = R.id.moduleDialogInputBottomTabViewDiscover;
                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputBottomTabViewDiscover)) != null) {
                                                            i8 = R.id.moduleDialogInputBottomTabViewMe;
                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputBottomTabViewMe)) != null) {
                                                                LinearLayout linearLayout = (LinearLayout) viewM4676;
                                                                C2014 c2014 = new C2014(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3, materialCheckBox4, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4);
                                                                textInputEditText.setText(C0455.f2030.m2542());
                                                                textInputEditText2.setText(C0456.f2031.m2542());
                                                                textInputEditText3.setText(C0457.f2032.m2542());
                                                                textInputEditText4.setText(C0460.f2035.m2542());
                                                                materialCheckBox3.setChecked(C0461.f2036.m2536());
                                                                materialCheckBox4.setChecked(C0462.f2037.m2536());
                                                                materialCheckBox2.setChecked(C0459.f2034.m2536());
                                                                materialCheckBox.setChecked(C0458.f2033.m2536());
                                                                C2007 c2007 = new C2007();
                                                                C0463.f2038.getClass();
                                                                c2007.f6678 = C0463.f2046;
                                                                c2007.f6680 = linearLayout;
                                                                c2007.m3870("保存", new C0106(5, c2014));
                                                                c2007.m3869("重置", new C0104(11));
                                                                C2007.m3866(c2007, null, 3);
                                                                c2007.m3868().m3791();
                                                                return c3497;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i8)));
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr7 = AbstractC1574.f5469;
                C0463 c0463 = C0463.f2038;
                Object objM3268 = ((C1563) obj).m3268();
                RelativeLayout relativeLayout = (RelativeLayout) (objM3268 instanceof RelativeLayout ? objM3268 : null);
                if (relativeLayout == null) {
                    Class<RelativeLayout> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(RelativeLayout.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2187 != null ? clsM2187 : RelativeLayout.class).getName()).toString());
                }
                if (C0458.f2033.m2536()) {
                    int childCount = relativeLayout.getChildCount();
                    while (i6 < childCount) {
                        relativeLayout.getChildAt(i6).setVisibility(8);
                        i6++;
                    }
                } else {
                    int i9 = 0;
                    for (int i10 = 4; i9 < i10; i10 = 4) {
                        if (C0461.f2036.m2536() && (imageView = (ImageView) AbstractC3580.m5198(relativeLayout, new int[]{0, i9, 0, 0, 0})) != null) {
                            imageView.setVisibility(i10);
                            ViewParent parent = imageView.getParent();
                            "null cannot be cast to non-null type android.widget.RelativeLayout";
                            RelativeLayout relativeLayout2 = (RelativeLayout) parent;
                            ImageView imageView2 = new ImageView(relativeLayout2.getContext());
                            imageView2.setLayoutParams(imageView.getLayoutParams());
                            if (i9 == 0) {
                                c0463.getClass();
                                bitmap = (Bitmap) C0463.f2041.getValue();
                            } else if (i9 == 1) {
                                c0463.getClass();
                                bitmap = (Bitmap) C0463.f2042.getValue();
                            } else if (i9 == 2) {
                                c0463.getClass();
                                bitmap = (Bitmap) C0463.f2043.getValue();
                            } else if (i9 != 3) {
                                c0463.getClass();
                                bitmap = (Bitmap) C0463.f2040.getValue();
                            } else {
                                c0463.getClass();
                                bitmap = (Bitmap) C0463.f2044.getValue();
                            }
                            imageView2.setImageBitmap(bitmap);
                            relativeLayout2.addView(imageView2, 0);
                        }
                        TextView textView = (TextView) AbstractC3580.m5198(relativeLayout, new int[]{0, i9, 0, 1});
                        if (textView != null) {
                            if (C0459.f2034.m2536()) {
                                textView.setVisibility(8);
                            } else if (C0462.f2037.m2536()) {
                                if (i9 == 0) {
                                    strM2542 = C0455.f2030.m2542();
                                } else if (i9 == 1) {
                                    strM2542 = C0456.f2031.m2542();
                                } else if (i9 != 2) {
                                    strM2542 = i9 != 3 ? "" : C0460.f2035.m2542();
                                } else {
                                    strM2542 = C0457.f2032.m2542();
                                }
                                textView.setText(strM2542);
                            }
                        }
                        i9++;
                        c3497 = c3497;
                    }
                }
                return c3497;
            case 15:
                String[] strArr8 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_bottom_tab_material, null, false);
                int i11 = R.id.moduleDialogEdtBottomTabViewBottomDarkColor;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtBottomTabViewBottomDarkColor);
                if (textInputEditText5 != null) {
                    i11 = R.id.moduleDialogEdtBottomTabViewBottomLightColor;
                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtBottomTabViewBottomLightColor);
                    if (textInputEditText6 != null) {
                        i11 = R.id.moduleDialogEdtBottomTabViewIconDarkColor;
                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtBottomTabViewIconDarkColor);
                        if (textInputEditText7 != null) {
                            i11 = R.id.moduleDialogEdtBottomTabViewIconLightColor;
                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtBottomTabViewIconLightColor);
                            if (textInputEditText8 != null) {
                                i11 = R.id.moduleDialogEdtBottomTabViewSelectDarkColor;
                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtBottomTabViewSelectDarkColor);
                                if (textInputEditText9 != null) {
                                    i11 = R.id.moduleDialogEdtBottomTabViewSelectLightColor;
                                    TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtBottomTabViewSelectLightColor);
                                    if (textInputEditText10 != null) {
                                        i11 = R.id.moduleDialogInputBottomTabViewBottomDarkColor;
                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputBottomTabViewBottomDarkColor)) != null) {
                                            i11 = R.id.moduleDialogInputBottomTabViewBottomLightColor;
                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputBottomTabViewBottomLightColor)) != null) {
                                                i11 = R.id.moduleDialogInputBottomTabViewIconDarkColor;
                                                if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputBottomTabViewIconDarkColor)) != null) {
                                                    i11 = R.id.moduleDialogInputBottomTabViewIconLightColor;
                                                    if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputBottomTabViewIconLightColor)) != null) {
                                                        i11 = R.id.moduleDialogInputBottomTabViewSelectDarkColor;
                                                        if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputBottomTabViewSelectDarkColor)) != null) {
                                                            i11 = R.id.moduleDialogInputBottomTabViewSelectLightColor;
                                                            if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputBottomTabViewSelectLightColor)) != null) {
                                                                C0215 c0215 = new C0215();
                                                                c0215.f1330 = textInputEditText5;
                                                                c0215.f1331 = textInputEditText6;
                                                                c0215.f1332 = textInputEditText7;
                                                                c0215.f1333 = textInputEditText8;
                                                                c0215.f1334 = textInputEditText9;
                                                                c0215.f1335 = textInputEditText10;
                                                                textInputEditText6.setText(C0468.f2059.m2542());
                                                                textInputEditText10.setText(C0472.f2063.m2542());
                                                                textInputEditText8.setText(C0470.f2061.m2542());
                                                                textInputEditText5.setText(C0467.f2058.m2542());
                                                                textInputEditText9.setText(C0471.f2062.m2542());
                                                                textInputEditText7.setText(C0469.f2060.m2542());
                                                                C2007 c2008 = new C2007();
                                                                C0473.f2064.getClass();
                                                                c2008.f6678 = C0473.f2072;
                                                                c2008.f6680 = (LinearLayout) viewM4677;
                                                                c2008.m3870("保存", new C0106(6, c0215));
                                                                c2008.m3869("重置", new C0104(17));
                                                                C2007.m3866(c2008, null, 3);
                                                                c2008.m3868().m3791();
                                                                return c3497;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i11)));
            case 16:
                ((C1020) obj).f3733 = new C0316(22);
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr9 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.FavSendFilter", "[FAV_ITEM_TYPE_VOICE] canFilterVoice = true, back");
                return c3497;
            case Opcodes.LDC /* 18 */:
                ((C1020) obj).f3733 = new C0316(23);
                return c3497;
            case 19:
                Object objM3269 = ((C1563) obj).m3268();
                Activity activity = (Activity) (objM3269 instanceof Activity ? objM3269 : null);
                if (activity == null) {
                    Class<Activity> clsM2188 = AbstractC0743.m2183(AbstractC2519.m4527(Activity.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2188 != null ? clsM2188 : Activity.class).getName()).toString());
                }
                Intent intent = activity.getIntent();
                String[] strArr10 = AbstractC1574.f5469;
                intent.putExtra("key_fav_item_id", "");
                return c3497;
            case 20:
                C0603 c0603 = C0603.f2421;
                C3689 c3689M4172 = C2309.m4172(c0603, Collections.singletonList((Method) obj));
                c0603.m3263(c3689M4172, new C0316(24));
                c3689M4172.m5352();
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                C0603 c0604 = C0603.f2421;
                C3689 c3689M4173 = C2309.m4172(c0604, Collections.singletonList((Method) obj));
                c0604.m3263(c3689M4173, new C0316(25));
                c3689M4173.m5352();
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                ((C1333) obj).m3052(new C0316(i5));
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                C1333 c1336 = (C1333) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.plugin.fav.ui");
                C1981 c1986 = new C1981(4);
                c1986.m3826("onItemClick");
                c1986.m3827("onItemClick", (AbstractC3471.m5079(EnumC3677.f11527) || AbstractC3471.m5080(EnumC3674.f11495)) ? "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC$initOnItemClickListener$1" : "com/tencent/mm/plugin/fav/ui/FavSearchUI$10");
                c1336.f4794 = c1986;
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                ((C1563) obj).m3270();
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                C1563 c1563 = (C1563) obj;
                c1563.getClass();
                try {
                    c2585 = c1563.m3267()[1];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                View view = (View) c2585;
                Object tag = view.getTag();
                int i12 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(tag).m3490();
                String[] strArr12 = AbstractC1574.f5469;
                c1299M3490.f6370 = "a";
                Object objM3023 = ((C1315) AbstractC2784.m4741(c1299M3490)).m3023();
                C1299 c1299M4739 = AbstractC2784.m4738(c1563);
                c1299M4739.f6370 = "d";
                Object objM3024 = ((C1315) AbstractC0744.m2191(c1299M4739.m3014())).m3023();
                if (AbstractC3471.m5079(EnumC3677.f11527) || AbstractC3471.m5080(EnumC3674.f11495)) {
                    C1299 c1299M3491 = AbstractC0968.m2484(objM3024).m3490();
                    c1299M3491.f6370 = "w";
                    zBooleanValue = ((Boolean) ((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3024()).booleanValue();
                } else {
                    C1299 c1299M3492 = AbstractC0968.m2484(objM3024).m3490();
                    c1299M3492.f6370 = "d";
                    if (((Number) ((C1315) AbstractC0744.m2191(c1299M3492.m3014())).m3024()).intValue() != 1) {
                        zBooleanValue = false;
                    }
                }
                if (zBooleanValue) {
                    C1299 c1299M3493 = AbstractC0968.m2484(objM3023).m3490();
                    c1299M3493.f6370 = "field_type";
                    if (((Number) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024()).intValue() == 3) {
                        C1299 c1299M3494 = AbstractC0968.m2484(objM3023).m3490();
                        c1299M3494.f6370 = "field_favProto";
                        C1973 c1973M3492 = AbstractC0968.m2484(((C1315) AbstractC2784.m4741(c1299M3494)).m3023()).m3492();
                        c1973M3492.f6370 = "getData";
                        byte[] bArr = (byte[]) ((C1982) AbstractC2784.m4742(c1973M3492)).m3832(new Object[0]);
                        C2427 c2427 = C2427.f7718;
                        c2427.getClass();
                        final C1283 c1283 = ((C1284) c2427.m4387(C1284.Companion.serializer(), bArr)).f4695;
                        final String string = c1283.f4693;
                        String str = c1283.f4692;
                        if (string == null) {
                            String strM4005 = AbstractC2202.m4005();
                            String strValueOf = String.valueOf(str.hashCode() & 255);
                            StringBuilder sbM4753 = AbstractC2784.m4753(strM4005);
                            sbM4753.append("/favorite/");
                            sbM4753.append(strValueOf);
                            sbM4753.append('/');
                            sbM4753.append(str);
                            sbM4753.append('.');
                            sbM4753.append(c1283.f4689);
                            string = sbM4753.toString();
                        }
                        if (new File(string).exists()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                            builder.setTitle("提示");
                            builder.setMessage("是否发送收藏语音");
                            builder.setPositiveButton("发送", new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤝᤞᲈᲀ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) throws IllegalAccessException, InvocationTargetException {
                                    switch (i6) {
                                        case 0:
                                            C2893.f9310.getClass();
                                            C1133.m2721(c1283.f4688, C2893.f9311, string);
                                            AbstractC2834.m4823(null, 3, "已发送");
                                            break;
                                        default:
                                            C2893.f9310.getClass();
                                            C1133.m2721(c1283.f4688, C2893.f9311, string);
                                            AbstractC2834.m4823(null, 3, "已发送");
                                            break;
                                    }
                                }
                            });
                            builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                            builder.show();
                        } else {
                            AbstractC2834.m4823(null, 3, "获取语音路径失败, 请尝试播放后重发");
                        }
                        c1563.m3272(null);
                    }
                }
                return c3497;
            case 26:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
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
                View view2 = (View) c2586;
                Object tag2 = view2.getTag();
                int i13 = AbstractC1745.f5844;
                C1299 c1299M3495 = AbstractC0968.m2484(tag2).m3490();
                String[] strArr13 = AbstractC1574.f5469;
                c1299M3495.f6370 = "a";
                Object objM3025 = ((C1315) AbstractC2784.m4741(c1299M3495)).m3023();
                C1299 c1299M3496 = AbstractC0968.m2484(objM3025).m3490();
                c1299M3496.f6370 = "field_type";
                if (((Number) ((C1315) AbstractC2784.m4741(c1299M3496)).m3024()).intValue() == 3) {
                    C1299 c1299M3497 = AbstractC0968.m2484(objM3025).m3490();
                    c1299M3497.f6370 = "field_favProto";
                    C1973 c1973M3493 = AbstractC0968.m2484(((C1315) AbstractC2784.m4741(c1299M3497)).m3023()).m3492();
                    c1973M3493.f6370 = "getData";
                    byte[] bArr2 = (byte[]) ((C1982) AbstractC2784.m4742(c1973M3493)).m3832(new Object[0]);
                    C2427 c2428 = C2427.f7718;
                    c2428.getClass();
                    final C1283 c1284 = ((C1284) c2428.m4387(C1284.Companion.serializer(), bArr2)).f4695;
                    final String string2 = c1284.f4693;
                    String str2 = c1284.f4692;
                    if (string2 == null) {
                        String strM4006 = AbstractC2202.m4005();
                        String strValueOf2 = String.valueOf(str2.hashCode() & 255);
                        StringBuilder sbM4754 = AbstractC2784.m4753(strM4006);
                        sbM4754.append("/favorite/");
                        sbM4754.append(strValueOf2);
                        sbM4754.append('/');
                        sbM4754.append(str2);
                        sbM4754.append('.');
                        sbM4754.append(c1284.f4689);
                        string2 = sbM4754.toString();
                    }
                    if (new File(string2).exists()) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(view2.getContext());
                        builder2.setTitle("提示");
                        builder2.setMessage("是否发送收藏语音");
                        String str3 = "发送";
                        final char c2 = c == true ? 1 : 0;
                        builder2.setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤝᤞᲈᲀ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i14) throws IllegalAccessException, InvocationTargetException {
                                switch (c2) {
                                    case 0:
                                        C2893.f9310.getClass();
                                        C1133.m2721(c1284.f4688, C2893.f9311, string2);
                                        AbstractC2834.m4823(null, 3, "已发送");
                                        break;
                                    default:
                                        C2893.f9310.getClass();
                                        C1133.m2721(c1284.f4688, C2893.f9311, string2);
                                        AbstractC2834.m4823(null, 3, "已发送");
                                        break;
                                }
                            }
                        });
                        builder2.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        builder2.show();
                    } else {
                        AbstractC2834.m4823(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                    c1564.m3272(null);
                }
                return c3497;
            case 27:
                ((C1020) obj).f3733 = new C0316(28);
                return c3497;
            case 28:
                ((C1333) obj).m3052(new C0316(29));
                return c3497;
            default:
                C1981 c1987 = (C1981) obj;
                c1987.m3820(C0607.f2431.m2028());
                Class<Boolean> clsM4740 = AbstractC2784.m4740(c1987, Void.TYPE, cls);
                if (clsM4740 == null) {
                    clsM4740 = cls;
                }
                Class<Boolean> clsM2189 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                c1987.m3823(clsM4740, clsM2189 != null ? clsM2189 : Boolean.class);
                C1984 c1988 = new C1984(4);
                C1981 c1989 = new C1981(4);
                String[] strArr14 = AbstractC1574.f5469;
                c1989.m3827("MicroMsg.ChatFooter", "this is a quote msg");
                c1988.m3848(c1989);
                c1987.f6565 = c1988;
                return c3497;
        }
    }
}
