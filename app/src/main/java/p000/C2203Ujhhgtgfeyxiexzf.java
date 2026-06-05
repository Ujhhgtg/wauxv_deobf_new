package p000;

import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2203Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7168Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f7169Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7170Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2203Ujhhgtgfeyxiexzf(String str, int i, int i2) {
        this.f7168Ujhhgtgfeyxiexzf = i2;
        this.f7169Ujhhgtgfeyxiexzf = str;
        this.f7170Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IOException {
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf;
        String str;
        String str2;
        StringBuilder sb;
        int i = this.f7168Ujhhgtgfeyxiexzf;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf2 = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        final int i2 = this.f7170Ujhhgtgfeyxiexzf;
        final String str3 = this.f7169Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C2203Ujhhgtgfeyxiexzf c2203Ujhhgtgfeyxiexzf = new C2203Ujhhgtgfeyxiexzf(str3, i2, 1);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c2203Ujhhgtgfeyxiexzf, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                return c1943Ujhhgtgfeyxiexzf2;
            default:
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf = MagicFactory.get(4928841487489172874L, strArr);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Cursor cursorM5194feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5194feyxiexzfUjhhgtg(new EnumC3684feyxiexzfUjhhgtg[]{EnumC3684feyxiexzfUjhhgtg.f11711Ujhhgtgfeyxiexzf, EnumC3684feyxiexzfUjhhgtg.f11712Ujhhgtgfeyxiexzf});
                if (cursorM5194feyxiexzfUjhhgtg != null) {
                    while (cursorM5194feyxiexzfUjhhgtg.moveToNext()) {
                        try {
                            if (cursorM5194feyxiexzfUjhhgtg.getString(cursorM5194feyxiexzfUjhhgtg.getColumnIndex(MagicFactory.get(4928841453129434506L, strArr))).endsWith(MagicFactory.get(4928841551913682314L, strArr))) {
                                GroupInfo groupInfoM1316Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1316Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                String roomId = groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(groupInfoM1316Ujhhgtgfeyxiexzf.getName());
                                String remark = groupInfoM1316Ujhhgtgfeyxiexzf.getRemark();
                                if (remark.length() <= 0) {
                                    remark = null;
                                }
                                if (remark != null) {
                                    sb2.append('(' + remark + ')');
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append('(');
                                sb3.append(groupInfoM1316Ujhhgtgfeyxiexzf.getGroupData().getMemberCount());
                                sb3.append(')');
                                sb2.append(sb3.toString());
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg = new C3663feyxiexzfUjhhgtg(roomId, sb2.toString(), groupInfoM1316Ujhhgtgfeyxiexzf.getRoomId(), false);
                                arrayList3.add(c3663feyxiexzfUjhhgtg);
                                arrayList2.add(c3663feyxiexzfUjhhgtg);
                                c1943Ujhhgtgfeyxiexzf2 = c1943Ujhhgtgfeyxiexzf2;
                            } else {
                                FriendInfo friendInfoM1315Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1315Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg);
                                String wxid = friendInfoM1315Ujhhgtgfeyxiexzf.getWxid();
                                StringBuilder sb4 = new StringBuilder();
                                String nickname = friendInfoM1315Ujhhgtgfeyxiexzf.getNickname();
                                if (AbstractC1119feyxiexzfUjhhgtg.m2589feyxiexzfUjhhgtg(C0964feyxiexzfUjhhgtg.m2464Ujhhgtgfeyxiexzf(new C0964feyxiexzfUjhhgtg(MagicFactory.get(4928841646402962826L, strArr)), nickname)) <= 3) {
                                    str = null;
                                }
                                if (str != null) {
                                    str = nickname;
                                    sb4.append(MagicFactory.get(4928841616338191754L, strArr));
                                    c1943Ujhhgtgfeyxiexzf2 = c1943Ujhhgtgfeyxiexzf2;
                                } else {
                                    if (nickname.length() <= 8) {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        str = nickname;
                                        String strSubstring = str2.substring(0, 8);
                                        MagicFactory.get(4928841710827472266L, strArr);
                                        sb4.append(strSubstring);
                                        sb4.append(MagicFactory.get(4928841783841916298L, strArr));
                                        sb = sb4;
                                    } else {
                                        str = nickname;
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        str = nickname;
                                        str2 = nickname;
                                        str = nickname;
                                        str2 = nickname;
                                        sb4.append(nickname);
                                    }
                                }
                                str = nickname;
                                str2 = nickname;
                                str = nickname;
                                str2 = nickname;
                                String remark2 = friendInfoM1315Ujhhgtgfeyxiexzf.getRemark();
                                if (remark2.length() <= 0) {
                                    remark2 = null;
                                }
                                if (remark2 != null) {
                                    sb4.append('(' + remark2 + ')');
                                }
                                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg2 = new C3663feyxiexzfUjhhgtg(wxid, sb4.toString(), friendInfoM1315Ujhhgtgfeyxiexzf.getWxid(), false);
                                arrayList3.add(c3663feyxiexzfUjhhgtg2);
                                arrayList.add(c3663feyxiexzfUjhhgtg2);
                            }
                            c1943Ujhhgtgfeyxiexzf2 = c1943Ujhhgtgfeyxiexzf2;
                            break;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM5194feyxiexzfUjhhgtg, th);
                                throw th2;
                            }
                        }
                    }
                    c1943Ujhhgtgfeyxiexzf = c1943Ujhhgtgfeyxiexzf2;
                    cursorM5194feyxiexzfUjhhgtg.close();
                } else {
                    c1943Ujhhgtgfeyxiexzf = c1943Ujhhgtgfeyxiexzf2;
                }
                c3678feyxiexzfUjhhgtg.m5371Ujhhgtgfeyxiexzf(arrayList3);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928841766662047114L, strArr), arrayList);
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(MagicFactory.get(4928841753777145226L, strArr), arrayList2);
                c3678feyxiexzfUjhhgtg.f11696Ujhhgtgfeyxiexzf = R.drawable.ic_contact_send_24dp;
                String str4 = MagicFactory.get(4928841740892243338L, strArr);
                InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg = new InterfaceC3553feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ要点脸
                    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
                    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
                    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj2, Object obj3) throws IllegalAccessException, IOException, InvocationTargetException {
                        List list = (List) obj2;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(i2, ((C3663feyxiexzfUjhhgtg) it.next()).f11657Ujhhgtgfeyxiexzf, str3);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb5.append(MagicFactory.get(4928841388704925066L, strArr2));
                        sb5.append(list.size());
                        sb5.append(MagicFactory.get(4928841504669042058L, strArr2));
                        AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb5.toString());
                        return Boolean.FALSE;
                    }
                };
                c3678feyxiexzfUjhhgtg.f11699Ujhhgtgfeyxiexzf = str4;
                c3678feyxiexzfUjhhgtg.f11701Ujhhgtgfeyxiexzf = interfaceC3553feyxiexzfUjhhgtg;
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
