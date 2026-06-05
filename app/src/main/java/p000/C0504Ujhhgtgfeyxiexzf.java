package p000;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱ能不能ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0504Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2434Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0504Ujhhgtgfeyxiexzf(int i) {
        this.f2434Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        int i = this.f2434Ujhhgtgfeyxiexzf;
        int i2 = 2;
        Class<List> cls = List.class;
        Class<Integer> cls2 = Integer.class;
        Class<String> cls3 = String.class;
        int i3 = 3;
        int i4 = 1;
        int i5 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.ui.chatting.viewitems");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf("wx91d27dbf599dff74");
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg2 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg2.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.ui.chatting.viewitems");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf2 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf2.m4143Ujhhgtgfeyxiexzf("MicroMsg.ChattingItemVoice", "[voice interrupt] set continue play visible ");
                c3456feyxiexzfUjhhgtg2.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg3 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg3.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.ui.chatting.viewitems");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf3 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf3.m4143Ujhhgtgfeyxiexzf("voip_content_voice", "voip_content_video");
                c3456feyxiexzfUjhhgtg3.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_msg_tv_color, null, false);
                int i6 = R.id.moduleDialogEdtMsgTvColorLeftDarkTextColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgTvColorLeftDarkTextColor);
                if (textInputEditText != null) {
                    i6 = R.id.moduleDialogEdtMsgTvColorLeftLightTextColor;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgTvColorLeftLightTextColor);
                    if (textInputEditText2 != null) {
                        i6 = R.id.moduleDialogEdtMsgTvColorRightDarkTextColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgTvColorRightDarkTextColor);
                        if (textInputEditText3 != null) {
                            i6 = R.id.moduleDialogEdtMsgTvColorRightLightTextColor;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgTvColorRightLightTextColor);
                            if (textInputEditText4 != null) {
                                i6 = R.id.moduleDialogInputMsgTvColorLeftDarkTextColor;
                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgTvColorLeftDarkTextColor)) != null) {
                                    i6 = R.id.moduleDialogInputMsgTvColorLeftLightTextColor;
                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgTvColorLeftLightTextColor)) != null) {
                                        i6 = R.id.moduleDialogInputMsgTvColorRightDarkTextColor;
                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgTvColorRightDarkTextColor)) != null) {
                                            i6 = R.id.moduleDialogInputMsgTvColorRightLightTextColor;
                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgTvColorRightLightTextColor)) != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                                C0327Ujhhgtgfeyxiexzf c0327Ujhhgtgfeyxiexzf = new C0327Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, 2);
                                                textInputEditText2.setText(C0508Ujhhgtgfeyxiexzf.f2441Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                textInputEditText4.setText(C0515Ujhhgtgfeyxiexzf.f2459Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                textInputEditText.setText(C0505Ujhhgtgfeyxiexzf.f2435Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                textInputEditText3.setText(C0507Ujhhgtgfeyxiexzf.f2440Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                                C0516Ujhhgtgfeyxiexzf.f2460Ujhhgtgfeyxiexzf.getClass();
                                                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C0516Ujhhgtgfeyxiexzf.f2462Ujhhgtgfeyxiexzf;
                                                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C0350Ujhhgtgfeyxiexzf(4, c0327Ujhhgtgfeyxiexzf));
                                                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf("重置", new C0478Ujhhgtgfeyxiexzf(i3));
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i6)));
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(5);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0504Ujhhgtgfeyxiexzf(7));
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                String str = (String) c0919feyxiexzfUjhhgtg;
                if (str == null) {
                    str = "";
                }
                if (str.equals(".ui.timeline.preload.ui.TmplWebViewMMUI")) {
                    try {
                        c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[3];
                        if (c0919feyxiexzfUjhhgtg2 == null) {
                            c0919feyxiexzfUjhhgtg2 = null;
                        }
                    } catch (Throwable th2) {
                        c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                    }
                    Intent intent = (Intent) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
                    intent.addFlags(524288);
                    intent.addFlags(134217728);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.PluginHelper", "start multi webview!!!!!!!!!");
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_type";
                if (((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).intValue() == 3) {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "field_favProto";
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4938Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "getData";
                    byte[] bArr = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                    C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg = C0858feyxiexzfUjhhgtg.f3350Ujhhgtgfeyxiexzf;
                    c0858feyxiexzfUjhhgtg.getClass();
                    C3407Ujhhgtgfeyxiexzf c3407Ujhhgtgfeyxiexzf = ((C3408Ujhhgtgfeyxiexzf) c0858feyxiexzfUjhhgtg.m2263Ujhhgtgfeyxiexzf(C3408Ujhhgtgfeyxiexzf.Companion.serializer(), bArr)).f10625Ujhhgtgfeyxiexzf;
                    String string = c3407Ujhhgtgfeyxiexzf.f10623Ujhhgtgfeyxiexzf;
                    String str2 = c3407Ujhhgtgfeyxiexzf.f10622Ujhhgtgfeyxiexzf;
                    if (string == null) {
                        String strM5237Ujhhgtgfeyxiexzf = AbstractC3612feyxiexzfUjhhgtg.m5237Ujhhgtgfeyxiexzf();
                        String strValueOf = String.valueOf(str2.hashCode() & 255);
                        StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM5237Ujhhgtgfeyxiexzf);
                        sbM2707Ujhhgtgfeyxiexzf.append("/favorite/");
                        sbM2707Ujhhgtgfeyxiexzf.append(strValueOf);
                        sbM2707Ujhhgtgfeyxiexzf.append('/');
                        sbM2707Ujhhgtgfeyxiexzf.append(str2);
                        sbM2707Ujhhgtgfeyxiexzf.append('.');
                        sbM2707Ujhhgtgfeyxiexzf.append(c3407Ujhhgtgfeyxiexzf.f10619Ujhhgtgfeyxiexzf);
                        string = sbM2707Ujhhgtgfeyxiexzf.toString();
                    }
                    if (new File(string).exists()) {
                        AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C0423Ujhhgtgfeyxiexzf.f2264Ujhhgtgfeyxiexzf, new C0421Ujhhgtgfeyxiexzf(string, c3407Ujhhgtgfeyxiexzf, i5));
                    } else {
                        AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                } else {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "暂不支持的转发类型");
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "field_type";
                Integer num = (Integer) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf();
                if (num != null && num.intValue() == 3) {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "field_favProto";
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4938Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "getData";
                    byte[] bArr2 = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                    C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg2 = C0858feyxiexzfUjhhgtg.f3350Ujhhgtgfeyxiexzf;
                    c0858feyxiexzfUjhhgtg2.getClass();
                    C3407Ujhhgtgfeyxiexzf c3407Ujhhgtgfeyxiexzf2 = ((C3408Ujhhgtgfeyxiexzf) c0858feyxiexzfUjhhgtg2.m2263Ujhhgtgfeyxiexzf(C3408Ujhhgtgfeyxiexzf.Companion.serializer(), bArr2)).f10625Ujhhgtgfeyxiexzf;
                    String string2 = c3407Ujhhgtgfeyxiexzf2.f10623Ujhhgtgfeyxiexzf;
                    String str3 = c3407Ujhhgtgfeyxiexzf2.f10622Ujhhgtgfeyxiexzf;
                    if (string2 == null) {
                        String strM5237Ujhhgtgfeyxiexzf2 = AbstractC3612feyxiexzfUjhhgtg.m5237Ujhhgtgfeyxiexzf();
                        String strValueOf2 = String.valueOf(str3.hashCode() & 255);
                        StringBuilder sbM2707Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM5237Ujhhgtgfeyxiexzf2);
                        sbM2707Ujhhgtgfeyxiexzf2.append("/favorite/");
                        sbM2707Ujhhgtgfeyxiexzf2.append(strValueOf2);
                        sbM2707Ujhhgtgfeyxiexzf2.append('/');
                        sbM2707Ujhhgtgfeyxiexzf2.append(str3);
                        sbM2707Ujhhgtgfeyxiexzf2.append('.');
                        sbM2707Ujhhgtgfeyxiexzf2.append(c3407Ujhhgtgfeyxiexzf2.f10619Ujhhgtgfeyxiexzf);
                        string2 = sbM2707Ujhhgtgfeyxiexzf2.toString();
                    }
                    if (new File(string2).exists()) {
                        AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C0406Ujhhgtgfeyxiexzf.f2187Ujhhgtgfeyxiexzf, new C0421Ujhhgtgfeyxiexzf(string2, c3407Ujhhgtgfeyxiexzf2, i2));
                    } else {
                        AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                } else {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "暂不支持的转发类型");
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(11);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(12);
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0504Ujhhgtgfeyxiexzf(13));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                Class<String> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                if (clsM5159Ujhhgtgfeyxiexzf == null) {
                    clsM5159Ujhhgtgfeyxiexzf = cls3;
                }
                Class<List> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                cls = clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : List.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                cls3 = clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : String.class;
                Class<Object> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Object.class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf, cls, cls3, clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : Object.class);
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.NetSceneAddChatRoomMember", "/cgi-bin/micromsg-bin/addchatroommember");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg2 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg2.f10255Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(15);
                c3265feyxiexzfUjhhgtg2.f10256Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(16);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg4 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg4.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.remittance.model");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf4 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf4.m4143Ujhhgtgfeyxiexzf("MicroMsg.NetSceneBeforeTransfer", "/cgi-bin/mmpay-bin/beforetransfer");
                c3456feyxiexzfUjhhgtg4.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                Class<String> clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                if (clsM5159Ujhhgtgfeyxiexzf5 == null) {
                    clsM5159Ujhhgtgfeyxiexzf5 = cls3;
                }
                Class<String> clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf5, clsM5159Ujhhgtgfeyxiexzf6 != null ? clsM5159Ujhhgtgfeyxiexzf6 : String.class);
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg3 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg3.f10255Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(18);
                c3265feyxiexzfUjhhgtg3.f10256Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(19);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C0504Ujhhgtgfeyxiexzf(20));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                Class<String> clsM5159Ujhhgtgfeyxiexzf7 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                cls3 = clsM5159Ujhhgtgfeyxiexzf7 != null ? clsM5159Ujhhgtgfeyxiexzf7 : String.class;
                Class<List> clsM5159Ujhhgtgfeyxiexzf8 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                cls = clsM5159Ujhhgtgfeyxiexzf8 != null ? clsM5159Ujhhgtgfeyxiexzf8 : List.class;
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf9 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1657Ujhhgtgfeyxiexzf(cls3, cls, clsM5159Ujhhgtgfeyxiexzf9 != null ? clsM5159Ujhhgtgfeyxiexzf9 : Integer.class);
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.ChatroomMembersLogic", "/cgi-bin/micromsg-bin/delchatroommember");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg4 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg4.f10255Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(22);
                c3265feyxiexzfUjhhgtg4.f10256Ujhhgtgfeyxiexzf = new C0504Ujhhgtgfeyxiexzf(23);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg5 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg5.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.luckymoney.model");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf5 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf5.m4143Ujhhgtgfeyxiexzf("MicroMsg.NetSceneLuckyMoneyDetail", "/cgi-bin/mmpay-bin/qrydetailwxhb");
                c3456feyxiexzfUjhhgtg5.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0504Ujhhgtgfeyxiexzf(24));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<String> clsM5159Ujhhgtgfeyxiexzf10 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                if (clsM5159Ujhhgtgfeyxiexzf10 == null) {
                    clsM5159Ujhhgtgfeyxiexzf10 = cls3;
                }
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf11 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                if (clsM5159Ujhhgtgfeyxiexzf11 == null) {
                    clsM5159Ujhhgtgfeyxiexzf11 = cls2;
                }
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf12 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                cls2 = clsM5159Ujhhgtgfeyxiexzf12 != null ? clsM5159Ujhhgtgfeyxiexzf12 : Integer.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf13 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                if (clsM5159Ujhhgtgfeyxiexzf13 == null) {
                    clsM5159Ujhhgtgfeyxiexzf13 = cls3;
                }
                Class<String> clsM5159Ujhhgtgfeyxiexzf14 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                c0394Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf10, clsM5159Ujhhgtgfeyxiexzf11, cls2, clsM5159Ujhhgtgfeyxiexzf13, clsM5159Ujhhgtgfeyxiexzf14 != null ? clsM5159Ujhhgtgfeyxiexzf14 : String.class);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                return (String) ((C0208Ujhhgtgfeyxiexzf) ((C0207Ujhhgtgfeyxiexzf) obj).m1285Ujhhgtgfeyxiexzf()).get(1);
            case 26:
                String str4 = (String) ((C0208Ujhhgtgfeyxiexzf) ((C0207Ujhhgtgfeyxiexzf) obj).m1285Ujhhgtgfeyxiexzf()).get(1);
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str4, "notify@all")) {
                    return "@所有人";
                }
                C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf.getClass();
                return AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("@", C3681feyxiexzfUjhhgtg.m5373feyxiexzfUjhhgtg(str4));
            case 27:
                return (String) ((C0208Ujhhgtgfeyxiexzf) ((C0207Ujhhgtgfeyxiexzf) obj).m1285Ujhhgtgfeyxiexzf()).get(1);
            case 28:
                String str5 = (String) ((C0208Ujhhgtgfeyxiexzf) ((C0207Ujhhgtgfeyxiexzf) obj).m1285Ujhhgtgfeyxiexzf()).get(1);
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str5, "notify@all")) {
                    return "@所有人";
                }
                C3681feyxiexzfUjhhgtg.f11704Ujhhgtgfeyxiexzf.getClass();
                return AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("@", C3681feyxiexzfUjhhgtg.m5373feyxiexzfUjhhgtg(str5));
            default:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg5 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg5.f10255Ujhhgtgfeyxiexzf = new C0460Ujhhgtgfeyxiexzf(i5);
                c3265feyxiexzfUjhhgtg5.f10256Ujhhgtgfeyxiexzf = new C0460Ujhhgtgfeyxiexzf(i4);
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
