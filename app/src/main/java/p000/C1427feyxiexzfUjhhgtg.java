package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.Request;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛴ能不能ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1427feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f5019Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ long f5020Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f5021Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1427feyxiexzfUjhhgtg(Object obj, long j, int i) {
        this.f5019Ujhhgtgfeyxiexzf = i;
        this.f5021Ujhhgtgfeyxiexzf = obj;
        this.f5020Ujhhgtgfeyxiexzf = j;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IOException {
        StringBuilder sb;
        switch (this.f5019Ujhhgtgfeyxiexzf) {
            case 0:
                Map map = (Map) this.f5021Ujhhgtgfeyxiexzf;
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf = (C1855Ujhhgtgfeyxiexzf) obj;
                OkHttpClient okHttpClient = c1855Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf;
                Request.Builder builder = c1855Ujhhgtgfeyxiexzf.f8005Ujhhgtgfeyxiexzf;
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j = this.f5020Ujhhgtgfeyxiexzf;
                builderNewBuilder.connectTimeout(j, timeUnit);
                builderNewBuilder.readTimeout(j, timeUnit);
                builderNewBuilder.writeTimeout(j, timeUnit);
                AbstractC1336feyxiexzfUjhhgtg.m2862Ujhhgtgfeyxiexzf(builderNewBuilder);
                OkHttpClient okHttpClientM2863Ujhhgtgfeyxiexzf = AbstractC1337feyxiexzfUjhhgtg.m2863Ujhhgtgfeyxiexzf(builderNewBuilder.build());
                c1855Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf = okHttpClientM2863Ujhhgtgfeyxiexzf;
                Cache cache = okHttpClientM2863Ujhhgtgfeyxiexzf.cache();
                builder.tag(C3521Ujhhgtgfeyxiexzf.class, cache != null ? new C3521Ujhhgtgfeyxiexzf(OkHttpUtils.diskLruCache(cache)) : null);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                break;
            default:
                C1071feyxiexzfUjhhgtg c1071feyxiexzfUjhhgtg = (C1071feyxiexzfUjhhgtg) this.f5021Ujhhgtgfeyxiexzf;
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf = MagicFactory.get(4928887525243618698L, strArr);
                String str = MagicFactory.get(4928887503768782218L, strArr);
                ArrayList arrayListM5175Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5175Ujhhgtgfeyxiexzf();
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayListM5175Ujhhgtgfeyxiexzf, 10));
                Iterator it = arrayListM5175Ujhhgtgfeyxiexzf.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    final long j2 = this.f5020Ujhhgtgfeyxiexzf;
                    if (!zHasNext) {
                        c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(str, arrayList);
                        c3678feyxiexzfUjhhgtg.f11696Ujhhgtgfeyxiexzf = R.drawable.ic_contact_confirm_24dp;
                        String str2 = MagicFactory.get(4928887748581918090L, strArr);
                        InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg = new InterfaceC3553feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴ要点脸能不能ᛱUjhhgtgᛱᛲ
                            @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
                            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
                            public final Object mo1179Ujhhgtgfeyxiexzf(Object obj2, Object obj3) {
                                long j3;
                                List list = (List) obj2;
                                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                                ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((C3663feyxiexzfUjhhgtg) it2.next()).f11657Ujhhgtgfeyxiexzf);
                                }
                                Set setM4256Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList2);
                                C1068feyxiexzfUjhhgtg c1068feyxiexzfUjhhgtg = C1068feyxiexzfUjhhgtg.f4134Ujhhgtgfeyxiexzf;
                                Set setM4622Ujhhgtgfeyxiexzf = c1068feyxiexzfUjhhgtg.m4622Ujhhgtgfeyxiexzf();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = setM4622Ujhhgtgfeyxiexzf.iterator();
                                while (true) {
                                    boolean zHasNext2 = it3.hasNext();
                                    j3 = j2;
                                    if (!zHasNext2) {
                                        break;
                                    }
                                    Object next = it3.next();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(j3);
                                    sb2.append('|');
                                    if (!((String) next).startsWith(sb2.toString())) {
                                        arrayList3.add(next);
                                    }
                                }
                                Set setM4255Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4255Ujhhgtgfeyxiexzf(arrayList3);
                                if (!setM4256Ujhhgtgfeyxiexzf.isEmpty()) {
                                    setM4255Ujhhgtgfeyxiexzf.add(j3 + '|' + AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(setM4256Ujhhgtgfeyxiexzf, MagicFactory.get(4928887551013422474L, strArr2), null, null, null, 62));
                                }
                                c1068feyxiexzfUjhhgtg.m4628Ujhhgtgfeyxiexzf(setM4255Ujhhgtgfeyxiexzf);
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928887542423487882L, strArr2));
                                return Boolean.FALSE;
                            }
                        };
                        c3678feyxiexzfUjhhgtg.f11699Ujhhgtgfeyxiexzf = str2;
                        c3678feyxiexzfUjhhgtg.f11701Ujhhgtgfeyxiexzf = interfaceC3553feyxiexzfUjhhgtg;
                    } else {
                        FriendInfo friendInfo = (FriendInfo) it.next();
                        String wxid = friendInfo.getWxid();
                        StringBuilder sb2 = new StringBuilder();
                        String nickname = friendInfo.getNickname();
                        if ((AbstractC1119feyxiexzfUjhhgtg.m2589feyxiexzfUjhhgtg(C0964feyxiexzfUjhhgtg.m2464Ujhhgtgfeyxiexzf(new C0964feyxiexzfUjhhgtg(MagicFactory.get(4928887628322833802L, strArr)), nickname)) > 3 ? nickname : null) != null) {
                            sb2.append(MagicFactory.get(4928887598258062730L, strArr));
                        } else {
                            String str3 = nickname.length() > 8 ? nickname : null;
                            if (str3 != null) {
                                String strSubstring = str3.substring(0, 8);
                                MagicFactory.get(4928887692747343242L, strArr);
                                sb2.append(strSubstring);
                                sb2.append(MagicFactory.get(4928887765761787274L, strArr));
                                sb = sb2;
                            } else {
                                sb = null;
                            }
                            if (sb == null) {
                                sb2.append(nickname);
                            }
                        }
                        String remark = friendInfo.getRemark();
                        String str4 = remark.length() > 0 ? remark : null;
                        if (str4 != null) {
                            sb2.append("(" + str4 + ')');
                        }
                        String string = sb2.toString();
                        String wxid2 = friendInfo.getWxid();
                        c1071feyxiexzfUjhhgtg.getClass();
                        arrayList.add(new C3663feyxiexzfUjhhgtg(wxid, string, wxid2, C1071feyxiexzfUjhhgtg.m2551feyxiexzfUjhhgtg(j2).contains(friendInfo.getWxid())));
                    }
                    break;
                }
                break;
        }
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}
