package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᲀᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3424 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10798;

    public /* synthetic */ C3424(int i) {
        this.f10798 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        switch (this.f10798) {
            case 0:
                C1332 c1332 = (C1332) obj;
                String[] strArr = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.ui.chatting.component");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.TransformComponent", "[onChattingPause]");
                c1332.f4791 = c0705;
                break;
            case 1:
                ((C1020) obj).thisMethodMatcher = new C3424(2);
                break;
            case 2:
                C1333 c1333 = (C1333) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.sdk.platformtools");
                C1981 c1981 = new C1981(4);
                if (AbstractC3471.m5079(WeChatVersions.f11531) || AbstractC3471.m5080(WeChatVersionsPlay.f11496)) {
                    c1981.m3827("MicroMsg.BitmapUtil", "saveBitmapToImage failed: %s");
                } else {
                    c1981.m3825("com.tencent.mm.sdk.platformtools.BitmapUtil");
                    c1981.m3826("saveBitmapToImage");
                }
                c1333.f4794 = c1981;
                break;
            case 3:
                C1563 c1563 = (C1563) obj;
                
                int i = 2;
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
                if (c2585 == Bitmap.CompressFormat.JPEG) {
                    try {
                        c2586 = c1563.m3267()[3];
                        if (c2586 == null) {
                            c2586 = null;
                        }
                    } catch (Throwable th2) {
                        c2586 = new C2585(th2);
                    }
                    String str = (String) (c2586 instanceof C2585 ? null : c2586);
                    if (str == null) {
                        str = "";
                    }
                    String[] strArr3 = AbstractC1574.f5469;
                    if (AbstractC2841.m4828(str, "avatar", false) || AbstractC2841.m4828(str, "user_hd_", false)) {
                        new C0408(2, 6, c1563).m1608(Bitmap.CompressFormat.PNG);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                
                throw new ClassCastException();
            case 5:
                ((C1020) obj).thisMethodMatcher = new C3424(14);
                break;
            case 6:
                C1333 c1334 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1982 = new C1981(4);
                c1982.m3827("setSdkId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1334.f4794 = c1982;
                break;
            case 7:
                C1333 c1335 = (C1333) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1983 = new C1981(4);
                c1983.m3827("setContentDes", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1335.f4794 = c1983;
                break;
            case 8:
                ((C1020) obj).thisMethodMatcher = new C3424(7);
                break;
            case 9:
                ((C1020) obj).thisMethodMatcher = new C3424(16);
                break;
            case 10:
                ((C1020) obj).thisMethodMatcher = new C3424(6);
                break;
            case 11:
                ((C1020) obj).thisMethodMatcher = new C3424(15);
                break;
            case 12 /* 12 */:
                ((C1020) obj).thisMethodMatcher = new C3424(13);
                break;
            case 13:
                C1333 c1336 = (C1333) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1984 = new C1981(4);
                c1984.m3827("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s");
                c1336.f4794 = c1984;
                break;
            case 14 /* 14 */:
                C1333 c1337 = (C1333) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1337.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1985 = new C1981(4);
                Class<Integer> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class cls = clsM2183 != null ? clsM2183 : Integer.class;
                Class<Context> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(Context.class));
                c1985.paramTypes(cls, clsM2184 != null ? clsM2184 : Context.class);
                c1985.m3827("initSnsObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1337.f4794 = c1985;
                break;
            case 15:
                C1333 c1338 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1338.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1986 = new C1981(4);
                c1986.m3827("setSdkAppName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1338.f4794 = c1986;
                break;
            case 16:
                C1333 c1339 = (C1333) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1339.m3053("com.tencent.mm.plugin.sns.model");
                C1981 c1987 = new C1981(4);
                c1987.m3827("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                c1339.f4794 = c1987;
                break;
            case 17 /* 17 */:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C3424(18);
                c1020.thisMethodMatcher = new C3424(19);
                break;
            case 18 /* 18 */:
                C1332 c13310 = (C1332) obj;
                String[] strArr10 = AbstractC1574.f5469;
                c13310.m3051("com.tencent.mm.vfs");
                C0705 c0706 = new C0705(4);
                c0706.m2127("MicroMsg.VFSFileOp", "Cannot move dir: ");
                c13310.f4791 = c0706;
                break;
            case 19:
                C1333 c13311 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c13311);
                Class<String> cls2 = String.class;
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM2185 == null) {
                    clsM2185 = String.class;
                }
                Class<String> clsM4740 = AbstractC2784.m4740(c1981M4739, clsM2185, String.class);
                cls2 = clsM4740 != null ? clsM4740 : String.class;
                Class<Boolean> clsM2186 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                c1981M4739.paramTypes(cls2, clsM2186 != null ? clsM2186 : Boolean.class);
                c13311.f4794 = c1981M4739;
                break;
            case 20:
                ((C1020) obj).declaringClassMatcher = new C3424(21);
                break;
            case 21 /* 21 */:
                ((C1332) obj).m3050(new C3424(22));
                break;
            case 22 /* 22 */:
                String[] strArr11 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.VideoService", "MicroMsg.SubCoreVideo", "quitVideoSendThread");
                break;
            case 23 /* 23 */:
                ((C1020) obj).thisMethodMatcher = new C3424(25);
                break;
            case 24 /* 24 */:
                ((C1020) obj).thisMethodMatcher = new C3424(26);
                break;
            case 25 /* 25 */:
                C1333 c13312 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c13312);
                String[] strArr12 = AbstractC1574.f5469;
                c1981M47310.m3827((AbstractC3471.m5079(WeChatVersions.f11541) || AbstractC3471.m5080(WeChatVersionsPlay.f11505)) ? "MicroMsg.C2CVideoPathFeatureService" : "MicroMsg.VideoInfoStorage", ".mp4", "success restore file, from ");
                c13312.f4794 = c1981M47310;
                break;
            case 26:
                C1333 c13313 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c13313);
                String[] strArr13 = AbstractC1574.f5469;
                c1981M47311.m3827((AbstractC3471.m5079(WeChatVersions.f11541) || AbstractC3471.m5080(WeChatVersionsPlay.f11505)) ? "MicroMsg.C2CVideoPathFeatureService" : "MicroMsg.VideoInfoStorage", ".jpg", "success restore file, from ");
                c13313.f4794 = c1981M47311;
                break;
            case 27:
                C2011 c2011M3872 = C2011.m3872(LayoutInflater.from(((View) obj).getContext()));
                c2011M3872.f6708.setText(C3607.f11267.m2542());
                C2007 c2007 = new C2007();
                
                c2007.f6678 = C3611.f11294;
                c2007.f6680 = c2011M3872.f6707;
                String[] strArr14 = AbstractC1574.f5469;
                c2007.m3870("保存", new C1173(c2011M3872, 3));
                c2007.m3869("重置", new C3369(4));
                C2007.m3866(c2007, null, 3);
                c2007.m3868().m3791();
                break;
            case 28:
                C2011 c2011M3873 = C2011.m3872(LayoutInflater.from(((View) obj).getContext()));
                c2011M3873.f6708.setText(C3612.f11297.m2542());
                C2007 c2008 = new C2007();
                
                c2008.f6678 = C3613.f11301;
                c2008.f6680 = c2011M3873.f6707;
                String[] strArr15 = AbstractC1574.f5469;
                c2008.m3870("保存", new C1173(c2011M3873, 4));
                c2008.m3869("重置", new C3369(5));
                C2007.m3866(c2008, null, 3);
                c2008.m3868().m3791();
                break;
            default:
                String[] strArr16 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.VoiceStorage", "update failed, no values set");
                break;
        }
        return Unit.INSTANCE;
    }
}
