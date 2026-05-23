package p000;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.hd.wauxv.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᲁᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0199 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1276;

    public /* synthetic */ C0199(int i) {
        this.f1276 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v164 */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, JSONException, InvocationTargetException {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        Object c25811;
        ?? r0;
        int i = this.f1276;
        int i2 = 6;
        int i3 = 3;
        int iIntValue = 0;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                C1563 c1563 = (C1563) obj;
                c1563.getClass();
                try {
                    c2585 = c1563.m3267()[2];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Integer num = (Integer) c2585;
                iIntValue = num != null ? num.intValue() : 0;
                if (iIntValue == 0 || iIntValue == 1) {
                    c1563.setReturn(null);
                }
                return unit;
            case 1:
                String[] strArr = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_anti_sns_delete, null, false);
                int i4 = R.id.moduleDialogEdtAntiSnsDeleteTip;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtAntiSnsDeleteTip);
                if (textInputEditText != null) {
                    i4 = R.id.moduleDialogInputAntiSnsDeleteTip;
                    if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputAntiSnsDeleteTip)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4676;
                        C2012 c2012 = new C2012(linearLayout, textInputEditText);
                        textInputEditText.setText(C0201.f1281.m2542());
                        C2007 c2007 = new C2007();
                        C0202.f1282.getClass();
                        c2007.f6678 = C0202.f1284;
                        c2007.f6680 = linearLayout;
                        c2007.m3870("保存", new C0106(2, c2012));
                        AbstractC2784.m4755(c2007, null, 3);
                        return unit;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i4)));
            case 2:
                ((C1020) obj).thisMethodMatcher = new C0199(3);
                return unit;
            case 3:
                C1333 c1333 = (C1333) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.ui.chatting.manager");
                C1981 c1981 = new C1981(4);
                c1981.m3827("[get] ", " is not a interface!");
                c1333.f4794 = c1981;
                return unit;
            case 4:
                ((C1020) obj).thisMethodMatcher = new C0199(6);
                return unit;
            case 5:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                try {
                    c2587 = c1564.m3267()[1];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                String str = (String) (c2587 instanceof C2585 ? null : c2587);
                JSONObject jSONObject = new JSONObject(str != null ? str : "");
                String[] strArr3 = AbstractC1574.f5469;
                if (AbstractC2207.m4087(jSONObject.get("api_name"), "webapi_getadvert")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    jSONObject2.put("ad_unit_id", "");
                    jSONObject.put("data", jSONObject2);
                    new C0408(1, 6, c1564).m1608(jSONObject.toString());
                }
                return unit;
            case 6:
                ((C1333) obj).m3052(new C0199(7));
                return unit;
            case 7:
                String[] strArr4 = AbstractC1574.f5469;
                ((C1981) obj).m3829("NetSceneJSOperateWxData", "appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]  sessionId [%s]  avatarOpt [%d]");
                return unit;
            case 8:
                ((C1020) obj).thisMethodMatcher = new C0199(10);
                return unit;
            case 9:
                ((C1563) obj).setReturn(null);
                return unit;
            case 10:
                C1333 c1334 = (C1333) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.plugin.appbrand.jsapi.auth");
                C1981 c1982 = new C1981(4);
                c1982.m3827("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi callback, callbackId:%s, service not running or preloaded");
                c1334.f4794 = c1982;
                return unit;
            case 11:
                C1563 c1565 = (C1563) obj;
                c1565.getClass();
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
                String str2 = (String) c2588;
                String str3 = str2 == null ? "" : str2;
                try {
                    c2589 = c1565.m3267()[1];
                    if (c2589 == null) {
                        c2589 = null;
                    }
                } catch (Throwable th5) {
                    c2589 = new C2585(th5);
                }
                String str4 = (String) (c2589 instanceof C2585 ? null : c2589);
                String str5 = str4 != null ? str4 : "";
                String[] strArr6 = AbstractC1574.f5469;
                if (str3.equals("onVideoTimeUpdate")) {
                    C0408 c0408 = new C0408(1, 6, c1565);
                    JSONObject jSONObject3 = new JSONObject(str5);
                    jSONObject3.put("position", 60);
                    jSONObject3.put("duration", 1);
                    c0408.m1608(jSONObject3.toString());
                }
                return unit;
            case 12 /* 12 */:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C0199(13);
                c1020.thisMethodMatcher = new C0199(14);
                return unit;
            case 13:
                ((C1332) obj).m3050(new C0199(15));
                return unit;
            case 14 /* 14 */:
                C1333 c1335 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1335);
                c1981M4739.paramTypes(String.class);
                c1981M4739.usingNumbers(0);
                c1335.f4794 = c1981M4739;
                return unit;
            case 15:
                String[] strArr7 = AbstractC1574.f5469;
                ((C0705) obj).m2127("appinfo", "appid", "version", "appname", "isforceupdate", "messageaction", "messageext", "mediatagname");
                return unit;
            case 16:
                ((C1020) obj).declaringClassMatcher = new C0199(17);
                return unit;
            case 17 /* 17 */:
                ((C1332) obj).m3050(new C0199(18));
                return unit;
            case 18 /* 18 */:
                String[] strArr8 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.AppMessage", "parse msg failed");
                return unit;
            case 19:
                ((C1020) obj).thisMethodMatcher = new C0199(20);
                return unit;
            case 20:
                C1333 c1336 = (C1333) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.pluginsdk.model.app");
                C1981 c1983 = new C1981(4);
                c1983.m3827("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attachFilePath[%s], content[%s]");
                c1336.f4794 = c1983;
                return unit;
            case 21 /* 21 */:
                View view = (View) obj;
                String[] strArr10 = AbstractC1574.f5469;
                View viewM4677 = AbstractC2668.m4676(view, R.layout.module_dialog_auto_clean, null, false);
                int i5 = R.id.moduleDialogEdtAutoCleanCycle;
                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4677, R.id.moduleDialogEdtAutoCleanCycle);
                if (textInputEditText2 != null) {
                    i5 = R.id.moduleDialogInputAutoCleanCycle;
                    if (((TextInputLayout) AbstractC3681.m5325(viewM4677, R.id.moduleDialogInputAutoCleanCycle)) != null) {
                        i5 = R.id.moduleDialogRvAutoCleanConfig;
                        RecyclerView recyclerView = (RecyclerView) AbstractC3681.m5325(viewM4677, R.id.moduleDialogRvAutoCleanConfig);
                        if (recyclerView != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewM4677;
                            C2012 c2013 = new C2012(linearLayout2, textInputEditText2, recyclerView);
                            textInputEditText2.setText(String.valueOf(C0301.f1519.m2539()));
                            view.getContext();
                            recyclerView.setLayoutManager(new GridLayoutManager());
                            C0718 c0718 = new C0718(AbstractC0720.m2143(), C0300.f1518.m2541());
                            recyclerView.setAdapter(c0718);
                            C2007 c2008 = new C2007();
                            RunnableC0304.f1522.getClass();
                            c2008.f6678 = RunnableC0304.f1524;
                            c2008.f6680 = linearLayout2;
                            c2008.m3870("保存", new C0299(c2013, 0, c0718));
                            AbstractC2784.m4755(c2008, null, 3);
                            return unit;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4677.getResources().getResourceName(i5)));
            case 22 /* 22 */:
                return Boolean.valueOf(C0300.f1518.m2541().contains(((C0719) obj).f2728));
            case 23 /* 23 */:
                ((C1020) obj).thisMethodMatcher = new C0199(25);
                return unit;
            case 24 /* 24 */:
                C1563 c1566 = (C1563) obj;
                c1566.getClass();
                try {
                    c25810 = c1566.m3267()[1];
                    if (c25810 == null) {
                        c25810 = null;
                    }
                } catch (Throwable th6) {
                    c25810 = new C2585(th6);
                }
                if (c25810 instanceof C2585) {
                    c25810 = null;
                }
                Boolean bool = (Boolean) c25810;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    try {
                        c25811 = c1566.m3267()[0];
                        if (c25811 == null) {
                            c25811 = null;
                        }
                    } catch (Throwable th7) {
                        c25811 = new C2585(th7);
                    }
                    Object obj2 = c25811 instanceof C2585 ? null : c25811;
                    int i6 = 0;
                    C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj2).m3490();
                    c1299M3490.name = "field_UserName";
                    String str6 = (String) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024();
                    C1394.f5015.getClass();
                    Method methodM3315 = AbstractC1574.dexToMethod(C1393.f5014);
                    C2663.f8577.getClass();
                    methodM3315.invoke(C2663.m4656(AbstractC1574.dexToMethod(C1392.f5013).getDeclaringClass()), str6);
                }
                return unit;
            case 25 /* 25 */:
                ((C1333) obj).m3052(new C0199(26));
                return unit;
            case 26:
                String[] strArr11 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.ForceNotifyStorage", "[onNewXmlReceived] ret:%s isAdd:%s info:%s");
                return unit;
            case 27:
                String[] strArr12 = AbstractC1574.f5469;
                View viewM4678 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_auto_login_win, null, false);
                int i7 = R.id.moduleDialogCbAutoLoginWinAutoLoginDevice;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4678, R.id.moduleDialogCbAutoLoginWinAutoLoginDevice);
                if (materialCheckBox != null) {
                    i7 = R.id.moduleDialogCbAutoLoginWinAutoSyncMsg;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4678, R.id.moduleDialogCbAutoLoginWinAutoSyncMsg);
                    if (materialCheckBox2 != null) {
                        i7 = R.id.moduleDialogCbAutoLoginWinShowLoginDevice;
                        MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) AbstractC3681.m5325(viewM4678, R.id.moduleDialogCbAutoLoginWinShowLoginDevice);
                        if (materialCheckBox3 != null) {
                            LinearLayout linearLayout3 = (LinearLayout) viewM4678;
                            C2013 c2014 = new C2013(linearLayout3, materialCheckBox, materialCheckBox2, materialCheckBox3);
                            materialCheckBox2.setChecked(C0308.f1533.m2536());
                            materialCheckBox3.setChecked(C0309.f1534.m2536());
                            materialCheckBox.setChecked(C0307.f1532.m2536());
                            C2007 c2009 = new C2007();
                            C0310.f1535.getClass();
                            c2009.f6678 = C0310.f1537;
                            c2009.f6680 = linearLayout3;
                            c2009.m3870("保存", new C0106(4, c2014));
                            AbstractC2784.m4755(c2009, null, 3);
                            return unit;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4678.getResources().getResourceName(i7)));
            case 28:
                Object objM3268 = ((C1563) obj).m3268();
                Activity activity = (Activity) (objM3268 instanceof Activity ? objM3268 : null);
                if (activity == null) {
                    Class<Activity> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(Activity.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2184 != null ? clsM2184 : Activity.class).getName()).toString());
                }
                boolean zM2536 = C0308.f1533.m2536();
                if (C0309.f1534.m2536()) {
                    r0 = zM2536;
                    r0 = (zM2536 ? 1 : 0) | 2;
                }
                r0 = zM2536;
                int i8 = r0;
                if (C0307.f1532.m2536()) {
                    i8 = (r0 == true ? 1 : 0) | 4;
                }
                activity.getIntent().putExtra("intent.key.function.control", i8);
                return unit;
            default:
                int i9 = 0;
                C1299 c1299M4738 = AbstractC2784.m4738((C1563) obj);
                c1299M4738.fieldType = AbstractC2519.classToKClass(Button.class);
                ((Button) ((C1315) AbstractC0744.firstInList(c1299M4738.resolve())).m3024()).callOnClick();
                return unit;
        }
    }
}
