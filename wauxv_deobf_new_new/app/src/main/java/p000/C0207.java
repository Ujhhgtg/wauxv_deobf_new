package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.hd.wauxv.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᲁᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0207 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1344;

    public /* synthetic */ C0207(int i) {
        this.f1344 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, JSONException, NoSuchMethodException, InvocationTargetException {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        Object c2646;
        Object c2647;
        int i = this.f1344;
        int i2 = 2;
        int i3 = 3;
        int i4 = 6;
        int iIntValue = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[2];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Integer num = (Integer) c2641;
                iIntValue = num != null ? num.intValue() : 0;
                if (iIntValue == 0 || iIntValue == 1) {
                    c1574.m3452(null);
                }
                return c3554;
            case 1:
                String[] strArr = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_anti_sns_delete, null, false);
                int i5 = R.id.moduleDialogEdtAntiSnsDeleteTip;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtAntiSnsDeleteTip);
                if (textInputEditText != null) {
                    i5 = R.id.moduleDialogInputAntiSnsDeleteTip;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputAntiSnsDeleteTip)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4622;
                        C2041 c2041 = new C2041(linearLayout, textInputEditText, 1);
                        textInputEditText.setText(C0209.f1349.m2666());
                        C2037 c2037 = new C2037();
                        C0210.f1350.getClass();
                        c2037.f6779 = C0210.f1352;
                        c2037.f6781 = linearLayout;
                        c2037.m4057("保存", new C0114(c2041, i2));
                        AbstractC2844.m4788(c2037, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i5)));
            case 2:
                ((C1023) obj).f3740 = new C0207(i3);
                return c3554;
            case 3:
                C1335 c1335 = (C1335) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.ui.chatting.manager");
                C2012 c2012 = new C2012();
                c2012.m4021("[get] ", " is not a interface!");
                c1335.f4794 = c2012;
                return c3554;
            case 4:
                ((C1023) obj).f3740 = new C0207(i4);
                return c3554;
            case 5:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                try {
                    c2643 = c1575.m3447()[1];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                String str = (String) (c2643 instanceof C2641 ? null : c2643);
                JSONObject jSONObject = new JSONObject(str != null ? str : "");
                String[] strArr3 = AbstractC1471.f5234;
                if (AbstractC1469.m3322(jSONObject.get("api_name"), "webapi_getadvert")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    jSONObject2.put("ad_unit_id", "");
                    jSONObject.put("data", jSONObject2);
                    new C0383(1, 6, c1575).m1714(jSONObject.toString());
                }
                return c3554;
            case 6:
                ((C1335) obj).m3155(new C0207(7));
                return c3554;
            case 7:
                String[] strArr4 = AbstractC1471.f5234;
                ((C2012) obj).m4023("NetSceneJSOperateWxData", "appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]  sessionId [%s]  avatarOpt [%d]");
                return c3554;
            case 8:
                ((C1023) obj).f3740 = new C0207(10);
                return c3554;
            case 9:
                ((C1574) obj).m3450();
                return c3554;
            case 10:
                ((C1335) obj).m3155(new C0207(11));
                return c3554;
            case 11:
                String[] strArr5 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, appId:%s, canShowAd:%s");
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3740 = new C0207(13);
                return c3554;
            case 13:
                ((C1335) obj).m3155(new C0207(15));
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                new C0383(6, 6, c1576).m1714(9999);
                return c3554;
            case 15:
                String[] strArr6 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "<init> cgiHash[%d], username[%s] appId[%s] sync[%b] sessionId[%s] instanceId[%s] libVersion[%d], source:%s, launchMode:%d, migrate:%b, fallback:%b");
                return c3554;
            case 16:
                C1574 c1577 = (C1574) obj;
                c1577.getClass();
                try {
                    c2644 = c1577.m3447()[0];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                if (c2644 instanceof C2641) {
                    c2644 = null;
                }
                String str2 = (String) c2644;
                String str3 = str2 == null ? "" : str2;
                try {
                    c2645 = c1577.m3447()[1];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                String str4 = (String) (c2645 instanceof C2641 ? null : c2645);
                String str5 = str4 != null ? str4 : "";
                String[] strArr7 = AbstractC1471.f5234;
                if (str3.equals("onVideoTimeUpdate")) {
                    C0383 c0383 = new C0383(1, 6, c1577);
                    JSONObject jSONObject3 = new JSONObject(str5);
                    jSONObject3.put("position", 60);
                    jSONObject3.put("duration", 1);
                    c0383.m1714(jSONObject3.toString());
                }
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C0207(18);
                c1023.f3740 = new C0207(19);
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1334) obj).m3153(new C0207(20));
                return c3554;
            case 19:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1336);
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                c2012M4773.m4017(clsM4232 != null ? clsM4232 : String.class);
                c2012M4773.m4022(0);
                c1336.f4794 = c2012M4773;
                return c3554;
            case 20:
                String[] strArr8 = AbstractC1471.f5234;
                ((C0700) obj).m2220("appinfo", "appid", "version", "appname", "isforceupdate", "messageaction", "messageext", "mediatagname");
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1023) obj).f3739 = new C0207(22);
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                ((C1334) obj).m3153(new C0207(23));
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                String[] strArr9 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.AppMessage", "parse msg failed");
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1023) obj).f3740 = new C0207(25);
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1335 c1337 = (C1335) obj;
                String[] strArr10 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.pluginsdk.model.app");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attachFilePath[%s], content[%s]");
                c1337.f4794 = c2013;
                return c3554;
            case 26:
                View view = (View) obj;
                String[] strArr11 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622(view, R.layout.module_dialog_auto_clean, null, false);
                int i6 = R.id.moduleDialogEdtAutoCleanCycle;
                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtAutoCleanCycle);
                if (textInputEditText2 != null) {
                    i6 = R.id.moduleDialogInputAutoCleanCycle;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputAutoCleanCycle)) != null) {
                        i6 = R.id.moduleDialogRvAutoCleanConfig;
                        RecyclerView recyclerView = (RecyclerView) AbstractC1272.m3098(viewM4623, R.id.moduleDialogRvAutoCleanConfig);
                        if (recyclerView != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewM4623;
                            C2041 c2042 = new C2041(linearLayout2, textInputEditText2, recyclerView);
                            textInputEditText2.setText(String.valueOf(C0312.f1594.m2663()));
                            view.getContext();
                            recyclerView.setLayoutManager(new GridLayoutManager());
                            C0713 c0713 = new C0713(AbstractC0715.m2235(), C0311.f1593.m2665());
                            recyclerView.setAdapter(c0713);
                            C2037 c2038 = new C2037();
                            RunnableC0315.f1597.getClass();
                            c2038.f6779 = RunnableC0315.f1599;
                            c2038.f6781 = linearLayout2;
                            c2038.m4057("保存", new C0310(c2042, iIntValue, c0713));
                            AbstractC2844.m4788(c2038, null, 3);
                            return c3554;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i6)));
            case 27:
                return Boolean.valueOf(C0311.f1593.m2665().contains(((C0714) obj).f2722));
            case 28:
                ((C1023) obj).f3740 = new C0316(iIntValue);
                return c3554;
            default:
                C1574 c1578 = (C1574) obj;
                c1578.getClass();
                try {
                    c2646 = c1578.m3447()[1];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                if (c2646 instanceof C2641) {
                    c2646 = null;
                }
                Boolean bool = (Boolean) c2646;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    try {
                        c2647 = c1578.m3447()[0];
                        if (c2647 == null) {
                            c2647 = null;
                        }
                    } catch (Throwable th7) {
                        c2647 = new C2641(th7);
                    }
                    Object obj2 = c2647 instanceof C2641 ? null : c2647;
                    int i7 = AbstractC1768.f5906;
                    C1300 c1300M3558 = AbstractC2727.m4713(obj2).m3558();
                    c1300M3558.f6475 = "field_UserName";
                    String str6 = (String) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127();
                    C1402.f5044.getClass();
                    Method methodM2610 = AbstractC0972.m2610(C1401.f5043);
                    C2725.f8744.getClass();
                    methodM2610.invoke(C2725.m4690(AbstractC0972.m2610(C1400.f5042).getDeclaringClass()), str6);
                }
                return c3554;
        }
    }
}
