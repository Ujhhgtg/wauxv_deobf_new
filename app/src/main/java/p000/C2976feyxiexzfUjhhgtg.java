package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2976feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9280Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2976feyxiexzfUjhhgtg(int i) {
        this.f9280Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws JSONException, IllegalAccessException, IOException, InvocationTargetException {
        Object c0919feyxiexzfUjhhgtg;
        AbstractC2472feyxiexzfUjhhgtg abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf;
        C2509feyxiexzfUjhhgtg c2509feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        List listM1285Ujhhgtgfeyxiexzf;
        int i = this.f9280Ujhhgtgfeyxiexzf;
        int i2 = 4;
        int i3 = 8;
        int i4 = 14;
        int i5 = 6;
        final int i6 = 1;
        str = null;
        String str = null;
        C1378feyxiexzfUjhhgtg c1378feyxiexzfUjhhgtg = null;
        final int i7 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_account_info_center, null, false);
                int i8 = R.id.moduleDialogCbAccountInfoCenterAliasShow;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbAccountInfoCenterAliasShow);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogCbAccountInfoCenterNameShow;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbAccountInfoCenterNameShow);
                    if (materialCheckBox2 != null) {
                        i8 = R.id.moduleDialogCbAccountInfoCenterSignShow;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbAccountInfoCenterSignShow);
                        if (materialCheckBox3 != null) {
                            i8 = R.id.moduleDialogEdtAccountInfoCenterAlias;
                            TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterAlias);
                            if (textInputEditText != null) {
                                i8 = R.id.moduleDialogEdtAccountInfoCenterAliasTopMargin;
                                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterAliasTopMargin);
                                if (textInputEditText2 != null) {
                                    i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarRadian;
                                    TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterAvatarRadian);
                                    if (textInputEditText3 != null) {
                                        i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarSize;
                                        TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterAvatarSize);
                                        if (textInputEditText4 != null) {
                                            i8 = R.id.moduleDialogEdtAccountInfoCenterAvatarTopMargin;
                                            TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterAvatarTopMargin);
                                            if (textInputEditText5 != null) {
                                                i8 = R.id.moduleDialogEdtAccountInfoCenterBgDarkColor;
                                                TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterBgDarkColor);
                                                if (textInputEditText6 != null) {
                                                    i8 = R.id.moduleDialogEdtAccountInfoCenterBgLightColor;
                                                    TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterBgLightColor);
                                                    if (textInputEditText7 != null) {
                                                        i8 = R.id.moduleDialogEdtAccountInfoCenterName;
                                                        TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterName);
                                                        if (textInputEditText8 != null) {
                                                            i8 = R.id.moduleDialogEdtAccountInfoCenterNameTopMargin;
                                                            TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterNameTopMargin);
                                                            if (textInputEditText9 != null) {
                                                                i8 = R.id.moduleDialogEdtAccountInfoCenterSign;
                                                                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterSign);
                                                                if (textInputEditText10 != null) {
                                                                    i8 = R.id.moduleDialogEdtAccountInfoCenterSignTopMargin;
                                                                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAccountInfoCenterSignTopMargin);
                                                                    if (textInputEditText11 != null) {
                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterAlias;
                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterAlias)) != null) {
                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterAliasTopMargin;
                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterAliasTopMargin)) != null) {
                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterAvatarRadian;
                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterAvatarRadian)) != null) {
                                                                                    i8 = R.id.moduleDialogInputAccountInfoCenterAvatarSize;
                                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterAvatarSize)) != null) {
                                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterAvatarTopMargin;
                                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterAvatarTopMargin)) != null) {
                                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterBgDarkColor;
                                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterBgDarkColor)) != null) {
                                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterBgLightColor;
                                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterBgLightColor)) != null) {
                                                                                                    i8 = R.id.moduleDialogInputAccountInfoCenterName;
                                                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterName)) != null) {
                                                                                                        i8 = R.id.moduleDialogInputAccountInfoCenterNameTopMargin;
                                                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterNameTopMargin)) != null) {
                                                                                                            i8 = R.id.moduleDialogInputAccountInfoCenterSign;
                                                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterSign)) != null) {
                                                                                                                i8 = R.id.moduleDialogInputAccountInfoCenterSignTopMargin;
                                                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAccountInfoCenterSignTopMargin)) != null) {
                                                                                                                    LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                                                                                                    C0320Ujhhgtgfeyxiexzf c0320Ujhhgtgfeyxiexzf = new C0320Ujhhgtgfeyxiexzf(linearLayout, materialCheckBox, materialCheckBox2, materialCheckBox3, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11);
                                                                                                                    textInputEditText5.setText(String.valueOf(C2983Ujhhgtgfeyxiexzf.f9288Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                                    textInputEditText4.setText(String.valueOf(C2982feyxiexzfUjhhgtg.f9287Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                                    textInputEditText3.setText(String.valueOf(C2981Ujhhgtgfeyxiexzf.f9286Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                                                                                                                    materialCheckBox2.setChecked(C2987Ujhhgtgfeyxiexzf.f9292Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                                                                    textInputEditText9.setText(String.valueOf(C2988feyxiexzfUjhhgtg.f9293Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                                    textInputEditText8.setText(C2986feyxiexzfUjhhgtg.f9291Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                    materialCheckBox.setChecked(C2979feyxiexzfUjhhgtg.f9284Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                                                                    textInputEditText2.setText(String.valueOf(C2980feyxiexzfUjhhgtg.f9285Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                                    textInputEditText.setText(C2978Ujhhgtgfeyxiexzf.f9283Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                    materialCheckBox3.setChecked(C2990Ujhhgtgfeyxiexzf.f9295Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                                                                    textInputEditText11.setText(String.valueOf(C2991Ujhhgtgfeyxiexzf.f9296Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                                    textInputEditText10.setText(C2989Ujhhgtgfeyxiexzf.f9294Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                    textInputEditText7.setText(C2985feyxiexzfUjhhgtg.f9290Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                    textInputEditText6.setText(C2984Ujhhgtgfeyxiexzf.f9289Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                                                                                                    C2992Ujhhgtgfeyxiexzf.f9297Ujhhgtgfeyxiexzf.getClass();
                                                                                                                    c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2992Ujhhgtgfeyxiexzf.f9303Ujhhgtgfeyxiexzf;
                                                                                                                    c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                                                                                                    c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928377845769569674L, strArr), new C2977Ujhhgtgfeyxiexzf(0, c0320Ujhhgtgfeyxiexzf));
                                                                                                                    c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928377832884667786L, strArr), new C2975feyxiexzfUjhhgtg(3));
                                                                                                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                                                                                                                    c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
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
                }
                throw new NullPointerException(MagicFactory.get(4928816349045589386L, strArr).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i8)));
            case 1:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
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
                RelativeLayout relativeLayout = (RelativeLayout) c0919feyxiexzfUjhhgtg;
                C2305Ujhhgtgfeyxiexzf c2305Ujhhgtgfeyxiexzf = new C2305Ujhhgtgfeyxiexzf(relativeLayout, null);
                C1118feyxiexzfUjhhgtg c1118feyxiexzfUjhhgtg = new C1118feyxiexzfUjhhgtg();
                c1118feyxiexzfUjhhgtg.f4223Ujhhgtgfeyxiexzf = c2305Ujhhgtgfeyxiexzf.mo1767Ujhhgtgfeyxiexzf(c1118feyxiexzfUjhhgtg, c1118feyxiexzfUjhhgtg);
                while (c1118feyxiexzfUjhhgtg.hasNext()) {
                    ((View) c1118feyxiexzfUjhhgtg.next()).setVisibility(8);
                }
                C2992Ujhhgtgfeyxiexzf c2992Ujhhgtgfeyxiexzf = C2992Ujhhgtgfeyxiexzf.f9297Ujhhgtgfeyxiexzf;
                Context context = relativeLayout.getContext();
                C2977Ujhhgtgfeyxiexzf c2977Ujhhgtgfeyxiexzf = new C2977Ujhhgtgfeyxiexzf(1, relativeLayout);
                c2992Ujhhgtgfeyxiexzf.getClass();
                RelativeLayout relativeLayout2 = new RelativeLayout(context);
                relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                relativeLayout2.setPadding((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(20, context), (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(12, context), (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(20, context), (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(12, context));
                relativeLayout2.setBackgroundColor(Color.parseColor((AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(context) ? C2984Ujhhgtgfeyxiexzf.f9289Ujhhgtgfeyxiexzf : C2985feyxiexzfUjhhgtg.f9290Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf()));
                relativeLayout2.setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(0, c2977Ujhhgtgfeyxiexzf));
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.AccountInfoCenter_flAvatar);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(14);
                layoutParams.topMargin = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Integer.valueOf(C2983Ujhhgtgfeyxiexzf.f9288Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()), context);
                frameLayout.setLayoutParams(layoutParams);
                ImageView imageView = new ImageView(context);
                int iM5234Ujhhgtgfeyxiexzf = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Integer.valueOf(C2982feyxiexzfUjhhgtg.f9287Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()), context);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(iM5234Ujhhgtgfeyxiexzf, iM5234Ujhhgtgfeyxiexzf));
                C0178Ujhhgtgfeyxiexzf c0178Ujhhgtgfeyxiexzf = C0178Ujhhgtgfeyxiexzf.f1381Ujhhgtgfeyxiexzf;
                C2884feyxiexzfUjhhgtg.f9151Ujhhgtgfeyxiexzf.getClass();
                String strM4273feyxiexzfUjhhgtg = C2884feyxiexzfUjhhgtg.m4273feyxiexzfUjhhgtg();
                c0178Ujhhgtgfeyxiexzf.getClass();
                String strM1244feyxiexzfUjhhgtg = C0178Ujhhgtgfeyxiexzf.m1244feyxiexzfUjhhgtg(strM4273feyxiexzfUjhhgtg, true);
                C0944feyxiexzfUjhhgtg c0944feyxiexzfUjhhgtg = new C0944feyxiexzfUjhhgtg(Math.max(1, (int) (C2981Ujhhgtgfeyxiexzf.f9286Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf() * iM5234Ujhhgtgfeyxiexzf)));
                ComponentCallbacks2C0894feyxiexzfUjhhgtg componentCallbacks2C0894feyxiexzfUjhhgtgM2376Ujhhgtgfeyxiexzf = Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(context).f607Ujhhgtgfeyxiexzf.m2376Ujhhgtgfeyxiexzf(context);
                componentCallbacks2C0894feyxiexzfUjhhgtgM2376Ujhhgtgfeyxiexzf.getClass();
                C0991feyxiexzfUjhhgtg c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf = new C0991feyxiexzfUjhhgtg(componentCallbacks2C0894feyxiexzfUjhhgtgM2376Ujhhgtgfeyxiexzf.f3442Ujhhgtgfeyxiexzf, componentCallbacks2C0894feyxiexzfUjhhgtgM2376Ujhhgtgfeyxiexzf, Drawable.class, componentCallbacks2C0894feyxiexzfUjhhgtgM2376Ujhhgtgfeyxiexzf.f3443Ujhhgtgfeyxiexzf).m2489Ujhhgtgfeyxiexzf(strM1244feyxiexzfUjhhgtg).mo2482Ujhhgtgfeyxiexzf((C0896feyxiexzfUjhhgtg) new C0896feyxiexzfUjhhgtg().m3725Ujhhgtgfeyxiexzf(c0944feyxiexzfUjhhgtg, true));
                c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.getClass();
                AbstractC1860Ujhhgtgfeyxiexzf.m3192Ujhhgtgfeyxiexzf();
                if (!AbstractC2472feyxiexzfUjhhgtg.m3714Ujhhgtgfeyxiexzf(c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.f8007Ujhhgtgfeyxiexzf, 2048) && imageView.getScaleType() != null) {
                    switch (AbstractC0995feyxiexzfUjhhgtg.f3903Ujhhgtgfeyxiexzf[imageView.getScaleType().ordinal()]) {
                        case 1:
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.clone().m3718Ujhhgtgfeyxiexzf(C3218feyxiexzfUjhhgtg.f10106Ujhhgtgfeyxiexzf, new C2695Ujhhgtgfeyxiexzf());
                            break;
                        case 2:
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.clone().m3718Ujhhgtgfeyxiexzf(C3218feyxiexzfUjhhgtg.f10105Ujhhgtgfeyxiexzf, new C2696Ujhhgtgfeyxiexzf());
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf.f8020Ujhhgtgfeyxiexzf = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.clone().m3718Ujhhgtgfeyxiexzf(C3218feyxiexzfUjhhgtg.f10104Ujhhgtgfeyxiexzf, new C3459feyxiexzfUjhhgtg());
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf.f8020Ujhhgtgfeyxiexzf = true;
                            break;
                        case 6:
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.clone().m3718Ujhhgtgfeyxiexzf(C3218feyxiexzfUjhhgtg.f10105Ujhhgtgfeyxiexzf, new C2696Ujhhgtgfeyxiexzf());
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf.f8020Ujhhgtgfeyxiexzf = true;
                            break;
                        default:
                            abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf;
                            break;
                    }
                } else {
                    abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf;
                }
                C3589Ujhhgtgfeyxiexzf c3589Ujhhgtgfeyxiexzf = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.f3893Ujhhgtgfeyxiexzf;
                Class cls = c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.f3892Ujhhgtgfeyxiexzf;
                c3589Ujhhgtgfeyxiexzf.f11162Ujhhgtgfeyxiexzf.getClass();
                if (Bitmap.class.equals(cls)) {
                    c2509feyxiexzfUjhhgtg = new C2509feyxiexzfUjhhgtg(imageView, 0);
                } else {
                    if (!Drawable.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                    }
                    c2509feyxiexzfUjhhgtg = new C2509feyxiexzfUjhhgtg(imageView, 1);
                }
                c0991feyxiexzfUjhhgtgMo2482Ujhhgtgfeyxiexzf.m2488Ujhhgtgfeyxiexzf(c2509feyxiexzfUjhhgtg, abstractC2472feyxiexzfUjhhgtgM3718Ujhhgtgfeyxiexzf);
                if (c2509feyxiexzfUjhhgtg.f8192Ujhhgtgfeyxiexzf == null) {
                    ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg = new ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg(4, c2509feyxiexzfUjhhgtg);
                    c2509feyxiexzfUjhhgtg.f8192Ujhhgtgfeyxiexzf = viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg;
                    if (!c2509feyxiexzfUjhhgtg.f8194Ujhhgtgfeyxiexzf) {
                        c2509feyxiexzfUjhhgtg.f8190Ujhhgtgfeyxiexzf.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg);
                        c2509feyxiexzfUjhhgtg.f8194Ujhhgtgfeyxiexzf = true;
                    }
                }
                frameLayout.addView(imageView);
                relativeLayout2.addView(frameLayout);
                relativeLayout2.addView(C2992Ujhhgtgfeyxiexzf.m4452feyxiexzfUjhhgtg(c2992Ujhhgtgfeyxiexzf, context, R.id.AccountInfoCenter_tvName, R.id.AccountInfoCenter_flAvatar, C2988feyxiexzfUjhhgtg.f9293Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf(), 18.0f, C2986feyxiexzfUjhhgtg.f9291Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), C2987Ujhhgtgfeyxiexzf.f9292Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf(), new File(C2992Ujhhgtgfeyxiexzf.f9301Ujhhgtgfeyxiexzf, MagicFactory.get(4928374362551092618L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf)), 128));
                relativeLayout2.addView(C2992Ujhhgtgfeyxiexzf.m4452feyxiexzfUjhhgtg(c2992Ujhhgtgfeyxiexzf, context, R.id.AccountInfoCenter_tvAlias, R.id.AccountInfoCenter_tvName, C2980feyxiexzfUjhhgtg.f9285Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf(), 16.0f, C2978Ujhhgtgfeyxiexzf.f9283Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), C2979feyxiexzfUjhhgtg.f9284Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf(), null, 1920));
                relativeLayout2.addView(C2992Ujhhgtgfeyxiexzf.m4452feyxiexzfUjhhgtg(c2992Ujhhgtgfeyxiexzf, context, R.id.AccountInfoCenter_tvSign, R.id.AccountInfoCenter_tvAlias, C2991Ujhhgtgfeyxiexzf.f9296Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf(), 14.0f, C2989Ujhhgtgfeyxiexzf.f9294Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), C2990Ujhhgtgfeyxiexzf.f9295Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf(), null, 1792));
                relativeLayout.addView(relativeLayout2);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                int i9 = EnumC2267feyxiexzfUjhhgtg.f7420Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String str2 = MagicFactory.get(4928207726409942410L, strArr2);
                Object obj2 = MagicFactory.get(4928207833784124810L, strArr2);
                String str3 = MagicFactory.get(4928207803719353738L, strArr2);
                String str4 = MagicFactory.get(4928207189539030410L, strArr2);
                JSONObject jSONObject = new JSONObject();
                String str5 = MagicFactory.get(4928269067132863882L, strArr2);
                JSONObject jSONObject2 = new JSONObject();
                String str6 = MagicFactory.get(4928269049952994698L, strArr2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(MagicFactory.get(4928269019888223626L, strArr2), 5);
                jSONObject3.put(MagicFactory.get(4928269135852340618L, strArr2), obj2);
                String str7 = MagicFactory.get(4928269110082536842L, strArr2);
                JSONObject jSONObject4 = new JSONObject();
                String str8 = MagicFactory.get(4928269208866784650L, strArr2);
                JSONObject jSONObject5 = new JSONObject();
                String str9 = MagicFactory.get(4928269170212078986L, strArr2);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(MagicFactory.get(4928269286176195978L, strArr2), obj2);
                jSONObject6.put(MagicFactory.get(4928269260406392202L, strArr2), str3);
                jSONObject6.put(MagicFactory.get(4928269230341621130L, strArr2), str4);
                jSONObject5.put(str9, jSONObject6);
                jSONObject4.put(str8, jSONObject5);
                jSONObject3.put(str7, jSONObject4);
                jSONObject2.put(str6, jSONObject3);
                jSONObject.put(str5, jSONObject2);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                C0160Ujhhgtgfeyxiexzf c0160Ujhhgtgfeyxiexzf = new C0160Ujhhgtgfeyxiexzf();
                c0160Ujhhgtgfeyxiexzf.f1333Ujhhgtgfeyxiexzf = jSONObject;
                c0160Ujhhgtgfeyxiexzf.f1334Ujhhgtgfeyxiexzf = hashSet;
                c0160Ujhhgtgfeyxiexzf.f1335Ujhhgtgfeyxiexzf = hashSet2;
                AbstractC1246feyxiexzfUjhhgtg.m2767Ujhhgtgfeyxiexzf(i9, str2, c0160Ujhhgtgfeyxiexzf.toString(), System.currentTimeMillis());
                Activity activityM5177Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5177Ujhhgtgfeyxiexzf();
                C0185Ujhhgtgfeyxiexzf c0185Ujhhgtgfeyxiexzf = C0185Ujhhgtgfeyxiexzf.f1390Ujhhgtgfeyxiexzf;
                String str10 = MagicFactory.get(4928210707117245834L, strArr2);
                List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(MagicFactory.get(4928210702822278538L, strArr2), MagicFactory.get(4928211033534760330L, strArr2), MagicFactory.get(4928210165951366538L, strArr2), MagicFactory.get(4928210445124240778L, strArr2));
                C0805feyxiexzfUjhhgtg c0805feyxiexzfUjhhgtg = AbstractC0804feyxiexzfUjhhgtg.f3192Ujhhgtgfeyxiexzf;
                String str11 = (String) AbstractC2856feyxiexzfUjhhgtg.m4246feyxiexzfUjhhgtg(listM4192Ujhhgtgfeyxiexzf);
                String str12 = MagicFactory.get(4928210573973259658L, strArr2);
                String str13 = MagicFactory.get(4928210561088357770L, strArr2);
                int i10 = 0;
                DialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg dialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg = new DialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg(i10);
                DialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg dialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg2 = new DialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg(i10);
                c0185Ujhhgtgfeyxiexzf.getClass();
                int i11 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(DialogInterface.OnClickListener.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(DialogInterface.OnClickListener.class)}, 7, AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0177Ujhhgtgfeyxiexzf.f1380Ujhhgtgfeyxiexzf)).m2024Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(activityM5177Ujhhgtgfeyxiexzf, str11, str10, str12, str13, dialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg, dialogInterfaceOnClickListenerC3380feyxiexzfUjhhgtg2);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2976feyxiexzfUjhhgtg(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2976feyxiexzfUjhhgtg(i5));
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                Object obj3 = c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2;
                int i12 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj3).m2021Ujhhgtgfeyxiexzf();
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928869426251433354L, strArr3);
                Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928869555100452234L, strArr3);
                try {
                    if (new JSONObject((String) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).optJSONArray(MagicFactory.get(4928869546510517642L, strArr3)) != null) {
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928869490675942794L, strArr3);
                        ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(MagicFactory.get(4928869619524961674L, strArr3));
                    }
                    break;
                } catch (Throwable unused) {
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String[] strArr5 = {MagicFactory.get(4928869606640059786L, strArr4)};
                c0394Ujhhgtgfeyxiexzf.getClass();
                C1374feyxiexzfUjhhgtg c1374feyxiexzfUjhhgtg = new C1374feyxiexzfUjhhgtg();
                ArrayList arrayList = new ArrayList(C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf);
                c1374feyxiexzfUjhhgtg.f4867Ujhhgtgfeyxiexzf = arrayList;
                String str14 = strArr5[0];
                if (str14 != null) {
                    c1378feyxiexzfUjhhgtg = new C1378feyxiexzfUjhhgtg();
                    C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                    c2812Ujhhgtgfeyxiexzf.f8946Ujhhgtgfeyxiexzf = new C1155feyxiexzfUjhhgtg(str14, 5, false);
                    c1378feyxiexzfUjhhgtg.f4872Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                }
                c1374feyxiexzfUjhhgtg.f4867Ujhhgtgfeyxiexzf = arrayList;
                arrayList.add(c1378feyxiexzfUjhhgtg);
                c0394Ujhhgtgfeyxiexzf.f2137Ujhhgtgfeyxiexzf = c1374feyxiexzfUjhhgtg;
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928869769848817034L, strArr4));
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C2434Ujhhgtgfeyxiexzf.f7873Ujhhgtgfeyxiexzf, new C2976feyxiexzfUjhhgtg(i3));
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C2976feyxiexzfUjhhgtg c2976feyxiexzfUjhhgtg = new C2976feyxiexzfUjhhgtg(9);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c2976feyxiexzfUjhhgtg, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf = MagicFactory.get(4928385735624492426L, strArr6);
                String str15 = MagicFactory.get(4928385714149655946L, strArr6);
                ArrayList<GroupInfo> arrayListM5176Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5176Ujhhgtgfeyxiexzf();
                ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayListM5176Ujhhgtgfeyxiexzf, 10));
                for (GroupInfo groupInfo : arrayListM5176Ujhhgtgfeyxiexzf) {
                    String roomId = groupInfo.getRoomId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(groupInfo.getName());
                    String remark = groupInfo.getRemark();
                    if (remark.length() <= 0) {
                        remark = null;
                    }
                    if (remark != null) {
                        sb.append("(" + remark + ')');
                    }
                    sb.append("(" + groupInfo.getGroupData().getMemberCount() + ')');
                    arrayList2.add(new C3663feyxiexzfUjhhgtg(roomId, sb.toString(), groupInfo.getRoomId(), C2433Ujhhgtgfeyxiexzf.f7872Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf().contains(groupInfo.getRoomId())));
                }
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(str15, arrayList2);
                c3678feyxiexzfUjhhgtg.f11696Ujhhgtgfeyxiexzf = R.drawable.ic_contact_confirm_24dp;
                String str16 = MagicFactory.get(4928385838703707530L, strArr6);
                C2432Ujhhgtgfeyxiexzf c2432Ujhhgtgfeyxiexzf = new C2432Ujhhgtgfeyxiexzf(0);
                c3678feyxiexzfUjhhgtg.f11699Ujhhgtgfeyxiexzf = str16;
                c3678feyxiexzfUjhhgtg.f11701Ujhhgtgfeyxiexzf = c2432Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2976feyxiexzfUjhhgtg(11);
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2976feyxiexzfUjhhgtg(13));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1853Ujhhgtgfeyxiexzf(null);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928349760978421130L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928348055876404618L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2976feyxiexzfUjhhgtg(18));
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2976feyxiexzfUjhhgtg(17));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928348025811633546L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928351513325077898L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                final C0319Ujhhgtgfeyxiexzf c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf = C0319Ujhhgtgfeyxiexzf.m1532Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(((View) obj).getContext()));
                c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf.setText(C2339Ujhhgtgfeyxiexzf.f7634Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                C2340Ujhhgtgfeyxiexzf.f7635Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C2340Ujhhgtgfeyxiexzf.f7637Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf.f1876Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928348038696535434L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), new InterfaceC3545feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛲᛳᛴ
                    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                C2339Ujhhgtgfeyxiexzf.f7634Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf));
                                break;
                            default:
                                C2322Ujhhgtgfeyxiexzf.f7590Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf));
                                break;
                        }
                        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                    }
                });
                AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2976feyxiexzfUjhhgtg(16);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2976feyxiexzfUjhhgtg(23);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2976feyxiexzfUjhhgtg(15);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2976feyxiexzfUjhhgtg(i4));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1853Ujhhgtgfeyxiexzf(null);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                final C0319Ujhhgtgfeyxiexzf c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf2 = C0319Ujhhgtgfeyxiexzf.m1532Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(((View) obj).getContext()));
                c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf2.f1877Ujhhgtgfeyxiexzf.setText(C2322Ujhhgtgfeyxiexzf.f7590Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf3 = new C0290Ujhhgtgfeyxiexzf();
                C2318Ujhhgtgfeyxiexzf.f7579Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf3.f1721Ujhhgtgfeyxiexzf = C2318Ujhhgtgfeyxiexzf.f7581Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf3.f1723Ujhhgtgfeyxiexzf = c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf2.f1876Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf3.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928351040878675338L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), new InterfaceC3545feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛲᛳᛴ
                    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                C2339Ujhhgtgfeyxiexzf.f7634Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf2.f1877Ujhhgtgfeyxiexzf));
                                break;
                            default:
                                C2322Ujhhgtgfeyxiexzf.f7590Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1532Ujhhgtgfeyxiexzf2.f1877Ujhhgtgfeyxiexzf));
                                break;
                        }
                        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                    }
                });
                AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf3, null, 3);
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2976feyxiexzfUjhhgtg(27);
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928349864057636234L, strArr7));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928350817540375946L, strArr7), MagicFactory.get(4928349894122407306L, strArr7));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                if (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg3 = null;
                }
                String str17 = (String) c0919feyxiexzfUjhhgtg3;
                String str18 = str17 == null ? "" : str17;
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg4 = null;
                }
                String str19 = (String) c0919feyxiexzfUjhhgtg4;
                if ((str19 != null ? str19 : "").equals(MagicFactory.get(4928351027993773450L, strArr8)) && AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str18, MagicFactory.get(4928351135367955850L, strArr8), false)) {
                    Object objM1850Ujhhgtgfeyxiexzf = c0578Ujhhgtgfeyxiexzf3.m1850Ujhhgtgfeyxiexzf();
                    if (!(objM1850Ujhhgtgfeyxiexzf instanceof Map) || ((objM1850Ujhhgtgfeyxiexzf instanceof InterfaceC0140Ujhhgtgfeyxiexzf) && !(objM1850Ujhhgtgfeyxiexzf instanceof InterfaceC0142Ujhhgtgfeyxiexzf))) {
                        objM1850Ujhhgtgfeyxiexzf = null;
                    }
                    Map map = (Map) objM1850Ujhhgtgfeyxiexzf;
                    if (map != null) {
                        String str20 = MagicFactory.get(4928351092418282890L, strArr8);
                        if (map.containsKey(str20) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(map.get(str20), MagicFactory.get(4928351169727694218L, strArr8))) {
                            String str21 = (String) map.get(MagicFactory.get(4928351264216974730L, strArr8));
                            String str22 = (String) map.get(MagicFactory.get(4928351289986778506L, strArr8));
                            String str23 = (String) map.get(MagicFactory.get(4928350340799006090L, strArr8));
                            if (str22.startsWith(MagicFactory.get(4928350499712796042L, strArr8)) || str22.startsWith(MagicFactory.get(4928350491122861450L, strArr8))) {
                                map.put(str20, null);
                                c0578Ujhhgtgfeyxiexzf3.m1853Ujhhgtgfeyxiexzf(map);
                                int i13 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                                C1136feyxiexzfUjhhgtg.f4301Ujhhgtgfeyxiexzf.getClass();
                                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(C1136feyxiexzfUjhhgtg.m2603feyxiexzfUjhhgtg()).m2024Ujhhgtgfeyxiexzf();
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928205819444462986L, strArr8);
                                Cursor cursor = (Cursor) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Object[].class)}, 2, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(MagicFactory.get(4928350482532926858L, strArr8), new Object[]{str23});
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            long j = cursor.getLong(cursor.getColumnIndex(MagicFactory.get(4928350680101422474L, strArr8)));
                                            C0207Ujhhgtgfeyxiexzf c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(Pattern.compile(MagicFactory.get(4928350770295735690L, strArr8)).matcher(str22), 0, str22);
                                            if (c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf != null && (listM1285Ujhhgtgfeyxiexzf = c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.m1285Ujhhgtgfeyxiexzf()) != null) {
                                                str = (String) ((C0208Ujhhgtgfeyxiexzf) listM1285Ujhhgtgfeyxiexzf).get(2);
                                            }
                                            AbstractC1246feyxiexzfUjhhgtg.m2767Ujhhgtgfeyxiexzf(EnumC2267feyxiexzfUjhhgtg.f7416Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf, str21, "\"" + str + MagicFactory.get(4928350830425277834L, strArr8) + C2322Ujhhgtgfeyxiexzf.f7590Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf(), j + 1);
                                        }
                                        cursor.close();
                                        break;
                                    } catch (Throwable th5) {
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursor, th5);
                                            throw th6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                new C2501feyxiexzfUjhhgtg(0, 6, c0578Ujhhgtgfeyxiexzf4).m3786Ujhhgtgfeyxiexzf(MagicFactory.get(4928893868910314890L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
